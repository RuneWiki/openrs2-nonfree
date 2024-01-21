import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
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

@OriginalClass("client!ld")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method1104(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(3) int arg2) {
		arg1.drawImage(this.anImage4, arg2, arg0, this.aComponent1);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILjava/awt/Component;II)V")
	@Override
	public void method1105(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) {
		this.anIntArray257 = new int[arg2 * arg0 + 1];
		this.anInt1881 = arg2;
		this.anInt1887 = arg0;
		@Pc(29) DataBufferInt local29 = new DataBufferInt(this.anIntArray257, this.anIntArray257.length);
		@Pc(37) DirectColorModel local37 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(47) WritableRaster local47 = Raster.createWritableRaster(local37.createCompatibleSampleModel(this.anInt1887, this.anInt1881), local29, null);
		this.anImage4 = new BufferedImage(local37, local47, false, new Hashtable());
		this.aComponent1 = arg1;
		this.method1098();
	}
}
