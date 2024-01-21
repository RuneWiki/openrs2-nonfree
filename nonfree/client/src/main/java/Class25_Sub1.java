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

@OriginalClass("client!f")
public final class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!f", name = "B", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILjava/awt/Graphics;ZI)V")
	@Override
	public void method1161(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(3) int arg2) {
		arg1.drawImage(this.anImage3, arg2, arg0, this.aComponent1);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZILjava/awt/Component;)V")
	@Override
	public void method1160(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		this.anInt1730 = arg1;
		this.anInt1728 = arg0;
		this.anIntArray233 = new int[arg0 * arg1 + 1];
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray233, this.anIntArray233.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt1730, this.anInt1728), local22, null);
		this.anImage3 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent1 = arg2;
		this.method1157();
	}
}
