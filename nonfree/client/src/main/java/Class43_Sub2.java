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

@OriginalClass("client!vc")
public final class Class43_Sub2 extends Class43 {

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method1908(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent1);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	@Override
	public void method1904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		this.anInt2724 = arg0;
		this.anIntArray395 = new int[arg0 * arg1 + 1];
		this.anInt2728 = arg1;
		@Pc(34) DataBufferInt local34 = new DataBufferInt(this.anIntArray395, this.anIntArray395.length);
		@Pc(42) DirectColorModel local42 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(52) WritableRaster local52 = Raster.createWritableRaster(local42.createCompatibleSampleModel(this.anInt2728, this.anInt2724), local34, null);
		this.anImage4 = new BufferedImage(local42, local52, false, new Hashtable());
		this.aComponent1 = arg2;
		this.method1906();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IBIIILjava/awt/Graphics;)V")
	@Override
	public void method1907(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4) {
		@Pc(2) Shape local2 = arg4.getClip();
		arg4.clipRect(arg0, arg1, arg3, arg2);
		arg4.drawImage(this.anImage4, 0, 0, this.aComponent1);
		arg4.setClip(local2);
	}
}
