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

@OriginalClass("client!qf")
public final class Class40_Sub2 extends Class40 {

	@OriginalMember(owner = "client!qf", name = "r", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILjava/awt/Component;B)V")
	@Override
	public void method2107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		this.anIntArray321 = new int[arg0 * arg1 + 1];
		this.anInt2923 = arg1;
		this.anInt2920 = arg0;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray321, this.anIntArray321.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt2920, this.anInt2923), local22, null);
		this.anImage81 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent1 = arg2;
		this.method2103();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/awt/Graphics;IIBII)V")
	@Override
	public void method2105(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) Shape local6 = arg0.getClip();
		arg0.clipRect(arg3, arg4, arg1, arg2);
		arg0.drawImage(this.anImage81, 0, 0, this.aComponent1);
		arg0.setClip(local6);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V")
	@Override
	public void method2106(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage81, 0, 0, this.aComponent1);
	}
}
