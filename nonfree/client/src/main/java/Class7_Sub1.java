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

@OriginalClass("client!gf")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!gf", name = "u", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZILjava/awt/Graphics;I)V")
	@Override
	public void method2132(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent2);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/awt/Graphics;ZIIII)V")
	@Override
	public void method2127(@OriginalArg(0) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(2) Shape local2 = arg0.getClip();
		arg0.clipRect(arg1, arg2, arg3, arg4);
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent2);
		arg0.setClip(local2);
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	@Override
	public void method2130(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		this.anInt2976 = arg1;
		this.anIntArray353 = new int[arg1 * arg0 + 1];
		this.anInt2978 = arg0;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray353, this.anIntArray353.length);
		@Pc(37) DirectColorModel local37 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(47) WritableRaster local47 = Raster.createWritableRaster(local37.createCompatibleSampleModel(this.anInt2978, this.anInt2976), local22, null);
		this.anImage4 = new BufferedImage(local37, local47, false, new Hashtable());
		this.aComponent2 = arg2;
		this.method2133();
	}
}
