import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!gj", name = "q", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
	@Override
	public void method1214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2) {
		this.anInt1734 = arg0;
		this.anIntArray166 = new int[arg0 * arg1 + 1];
		this.anInt1736 = arg1;
		@Pc(26) DataBufferInt local26 = new DataBufferInt(this.anIntArray166, this.anIntArray166.length);
		@Pc(34) DirectColorModel local34 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(44) WritableRaster local44 = Raster.createWritableRaster(local34.createCompatibleSampleModel(this.anInt1736, this.anInt1734), local26, null);
		this.anImage3 = new BufferedImage(local34, local44, false, new Hashtable());
		this.aComponent2 = arg2;
		this.method1213();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BIIIILjava/awt/Graphics;)V")
	@Override
	public void method1216(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4) {
		@Pc(2) Shape local2 = arg4.getClip();
		arg4.clipRect(arg3, arg2, arg1, arg0);
		arg4.drawImage(this.anImage3, 0, 0, this.aComponent2);
		arg4.setClip(local2);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method1219(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aComponent2);
	}
}
