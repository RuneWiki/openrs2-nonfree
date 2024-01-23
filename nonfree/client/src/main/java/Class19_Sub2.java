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

@OriginalClass("client!eh")
public final class Class19_Sub2 extends Class19 {

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZIIILjava/awt/Graphics;)V")
	@Override
	public void method882(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4) {
		@Pc(5) Shape local5 = arg4.getClip();
		arg4.clipRect(arg2, arg1, arg0, arg3);
		arg4.drawImage(this.anImage4, 0, 0, this.aComponent1);
		arg4.setClip(local5);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method888(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent1);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
	@Override
	public void method883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		this.anInt1218 = arg0;
		this.anInt1216 = arg1;
		this.anIntArray71 = new int[arg1 * arg0 + 1];
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray71, this.anIntArray71.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt1218, this.anInt1216), local22, null);
		this.anImage4 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent1 = arg2;
		this.method885();
	}
}
