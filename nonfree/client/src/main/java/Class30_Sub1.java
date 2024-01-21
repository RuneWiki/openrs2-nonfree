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

@OriginalClass("client!ge")
public final class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method811(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2) {
		arg2.drawImage(this.anImage3, arg1, arg0, this.aComponent1);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/awt/Component;III)V")
	@Override
	public void method814(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anInt1168 = arg1;
		this.anIntArray80 = new int[arg2 * arg1 + 1];
		this.anInt1164 = arg2;
		@Pc(26) DataBufferInt local26 = new DataBufferInt(this.anIntArray80, this.anIntArray80.length);
		@Pc(34) DirectColorModel local34 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(44) WritableRaster local44 = Raster.createWritableRaster(local34.createCompatibleSampleModel(this.anInt1168, this.anInt1164), local26, null);
		this.anImage3 = new BufferedImage(local34, local44, false, new Hashtable());
		this.aComponent1 = arg0;
		this.method813();
	}
}
