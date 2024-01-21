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

@OriginalClass("client!be")
public final class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!be", name = "p", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	@Override
	public void method866(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		this.anInt1285 = arg0;
		this.anInt1292 = arg1;
		this.anIntArray169 = new int[arg1 * arg0 + 1];
		@Pc(32) DataBufferInt local32 = new DataBufferInt(this.anIntArray169, this.anIntArray169.length);
		@Pc(40) DirectColorModel local40 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(50) WritableRaster local50 = Raster.createWritableRaster(local40.createCompatibleSampleModel(this.anInt1285, this.anInt1292), local32, null);
		this.anImage3 = new BufferedImage(local40, local50, false, new Hashtable());
		this.aComponent1 = arg2;
		this.method861();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/awt/Graphics;IZI)V")
	@Override
	public void method863(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		arg0.drawImage(this.anImage3, arg2, arg1, this.aComponent1);
	}
}
