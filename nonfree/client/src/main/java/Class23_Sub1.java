import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;
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

@OriginalClass("client!cj")
public final class Class23_Sub1 extends Class23 {

	@OriginalMember(owner = "client!cj", name = "o", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLjava/awt/Component;II)V")
	@Override
	public void method2198(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray249 = new int[arg1 * arg2 + 1];
		this.anInt2868 = arg2;
		this.anInt2866 = arg1;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray249, this.anIntArray249.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(44) WritableRaster local44 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt2868, this.anInt2866), local22, null);
		this.anImage4 = new BufferedImage(local30, local44, false, new Hashtable());
		this.aComponent1 = arg0;
		this.method2204();
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	@Override
	public void method2205(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent1);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIZLjava/awt/Graphics;II)V")
	@Override
	public void method2200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(2) Shape local2 = arg2.getClip();
		arg2.clipRect(arg4, arg3, arg1, arg0);
		arg2.drawImage(this.anImage4, 0, 0, this.aComponent1);
		arg2.setClip(local2);
	}
}
