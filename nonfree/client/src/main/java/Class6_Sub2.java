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

@OriginalClass("client!vb")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!vb", name = "ib", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/awt/Component;BI)V")
	@Override
	public void method2065(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) {
		this.anInt2986 = arg2;
		this.anInt2987 = arg0;
		this.anIntArray467 = new int[arg2 * arg0 + 1];
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray467, this.anIntArray467.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt2987, this.anInt2986), local22, null);
		this.anImage4 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent2 = arg1;
		this.method2069();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method2067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2) {
		arg2.drawImage(this.anImage4, arg0, arg1, this.aComponent2);
	}
}
