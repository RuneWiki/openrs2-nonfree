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

@OriginalClass("client!rc")
public final class Class37_Sub2 extends Class37 {

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method1457(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2) {
		arg2.drawImage(this.anImage5, arg0, arg1, this.aComponent2);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	@Override
	public void method1464(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		this.anIntArray304 = new int[arg0 * arg1 + 1];
		this.anInt2052 = arg1;
		this.anInt2053 = arg0;
		@Pc(25) DataBufferInt local25 = new DataBufferInt(this.anIntArray304, this.anIntArray304.length);
		@Pc(33) DirectColorModel local33 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(43) WritableRaster local43 = Raster.createWritableRaster(local33.createCompatibleSampleModel(this.anInt2053, this.anInt2052), local25, null);
		this.anImage5 = new BufferedImage(local33, local43, false, new Hashtable());
		this.aComponent2 = arg2;
		this.method1459();
	}
}
