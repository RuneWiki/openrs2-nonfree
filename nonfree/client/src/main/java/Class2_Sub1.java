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

@OriginalClass("client!aa")
public final class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method1322(@OriginalArg(1) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0.drawImage(this.anImage3, arg1, arg2, this.aComponent1);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	@Override
	public void method1317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2) {
		this.anInt2031 = arg0;
		this.anInt2034 = arg1;
		this.anIntArray228 = new int[arg1 * arg0 + 1];
		@Pc(29) DataBufferInt local29 = new DataBufferInt(this.anIntArray228, this.anIntArray228.length);
		@Pc(37) DirectColorModel local37 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(47) WritableRaster local47 = Raster.createWritableRaster(local37.createCompatibleSampleModel(this.anInt2031, this.anInt2034), local29, null);
		this.anImage3 = new BufferedImage(local37, local47, false, new Hashtable());
		this.aComponent1 = arg2;
		this.method1318();
	}
}
