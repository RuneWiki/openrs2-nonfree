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

@OriginalClass("client!me")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!me", name = "x", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method1355(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent2);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
	@Override
	public void method1352(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Shape local12 = arg1.getClip();
		arg1.clipRect(arg3, arg4, arg0, arg2);
		arg1.drawImage(this.anImage4, 0, 0, this.aComponent2);
		arg1.setClip(local12);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILjava/awt/Component;IB)V")
	@Override
	public void method1356(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) {
		this.anInt2071 = arg2;
		this.anInt2068 = arg0;
		this.anIntArray241 = new int[arg2 * arg0 + 1];
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray241, this.anIntArray241.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt2071, this.anInt2068), local22, null);
		this.anImage4 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent2 = arg1;
		this.method1350();
	}
}
