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

@OriginalClass("client!oe")
public final class Class128_Sub1 extends Class128 {

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
	@Override
	public void method4295(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Graphics arg4) {
		@Pc(12) Shape local12 = arg4.getClip();
		arg4.clipRect(arg2, arg0, arg3, arg1);
		arg4.drawImage(this.anImage4, 0, 0, this.aComponent1);
		arg4.setClip(local12);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/awt/Component;III)V")
	@Override
	public void method4294(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anInt5230 = arg1;
		this.anIntArray549 = new int[arg1 * arg2 + 1];
		this.anInt5227 = arg2;
		@Pc(26) DataBufferInt local26 = new DataBufferInt(this.anIntArray549, this.anIntArray549.length);
		@Pc(34) DirectColorModel local34 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(44) WritableRaster local44 = Raster.createWritableRaster(local34.createCompatibleSampleModel(this.anInt5227, this.anInt5230), local26, null);
		this.anImage4 = new BufferedImage(local34, local44, false, new Hashtable());
		this.aComponent1 = arg0;
		this.method4293();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
	@Override
	public void method4291(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent1);
	}
}
