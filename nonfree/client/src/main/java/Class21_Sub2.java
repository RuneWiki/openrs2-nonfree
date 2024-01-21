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

@OriginalClass("client!pd")
public final class Class21_Sub2 extends Class21 {

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	@Override
	public void method1443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2) {
		this.anInt2141 = arg0;
		this.anIntArray212 = new int[arg0 * arg1 + 1];
		this.anInt2143 = arg1;
		@Pc(32) DataBufferInt local32 = new DataBufferInt(this.anIntArray212, this.anIntArray212.length);
		@Pc(40) DirectColorModel local40 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(50) WritableRaster local50 = Raster.createWritableRaster(local40.createCompatibleSampleModel(this.anInt2143, this.anInt2141), local32, null);
		this.anImage3 = new BufferedImage(local40, local50, false, new Hashtable());
		this.aComponent2 = arg2;
		this.method1445();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
	@Override
	public void method1442(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(3) int arg2) {
		arg1.drawImage(this.anImage3, arg0, arg2, this.aComponent2);
	}
}
