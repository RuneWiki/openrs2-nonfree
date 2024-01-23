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

@OriginalClass("client!m")
public final class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!m", name = "o", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
	@Override
	public void method1981(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		this.anInt2632 = arg1;
		this.anIntArray332 = new int[arg0 * arg1 + 1];
		this.anInt2633 = arg0;
		@Pc(26) DataBufferInt local26 = new DataBufferInt(this.anIntArray332, this.anIntArray332.length);
		@Pc(34) DirectColorModel local34 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(44) WritableRaster local44 = Raster.createWritableRaster(local34.createCompatibleSampleModel(this.anInt2632, this.anInt2633), local26, null);
		this.anImage25 = new BufferedImage(local34, local44, false, new Hashtable());
		this.aComponent2 = arg2;
		this.method1979();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	@Override
	public void method1980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Graphics arg4) {
		@Pc(9) Shape local9 = arg4.getClip();
		arg4.clipRect(arg2, arg0, arg1, arg3);
		arg4.drawImage(this.anImage25, 0, 0, this.aComponent2);
		arg4.setClip(local9);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
	@Override
	public void method1976(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage25, 0, 0, this.aComponent2);
	}
}
