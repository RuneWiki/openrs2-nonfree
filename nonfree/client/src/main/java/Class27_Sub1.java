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

@OriginalClass("client!me")
public final class Class27_Sub1 extends Class27 {

	@OriginalMember(owner = "client!me", name = "r", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BILjava/awt/Graphics;I)V")
	@Override
	public void method1536(@OriginalArg(1) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2) {
		arg1.drawImage(this.anImage3, arg2, arg0, this.aComponent2);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILjava/awt/Component;ZI)V")
	@Override
	public void method1538(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) {
		this.anInt2210 = arg2;
		this.anInt2212 = arg0;
		this.anIntArray299 = new int[arg0 * arg2 + 1];
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray299, this.anIntArray299.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt2210, this.anInt2212), local22, null);
		this.anImage3 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent2 = arg1;
		this.method1540();
	}
}
