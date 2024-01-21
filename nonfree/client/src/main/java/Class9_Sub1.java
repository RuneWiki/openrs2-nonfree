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

@OriginalClass("client!c")
public final class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!c", name = "q", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method686(@OriginalArg(1) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0.drawImage(this.anImage4, arg1, arg2, this.aComponent1);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/awt/Component;IBI)V")
	@Override
	public void method685(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray81 = new int[arg2 * arg1 + 1];
		this.anInt1140 = arg1;
		this.anInt1147 = arg2;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray81, this.anIntArray81.length);
		@Pc(36) DirectColorModel local36 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(46) WritableRaster local46 = Raster.createWritableRaster(local36.createCompatibleSampleModel(this.anInt1140, this.anInt1147), local22, null);
		this.anImage4 = new BufferedImage(local36, local46, false, new Hashtable());
		this.aComponent1 = arg0;
		this.method682();
	}
}
