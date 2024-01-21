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

@OriginalClass("client!kf")
public final class Class46_Sub1 extends Class46 {

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIBLjava/awt/Graphics;II)V")
	@Override
	public void method2381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) Shape local6 = arg2.getClip();
		arg2.clipRect(arg4, arg0, arg3, arg1);
		arg2.drawImage(this.anImage4, 0, 0, this.aComponent2);
		arg2.setClip(local6);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method2380(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent2);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILjava/awt/Component;B)V")
	@Override
	public void method2382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		this.anInt3426 = arg1;
		this.anIntArray297 = new int[arg1 * arg0 + 1];
		this.anInt3423 = arg0;
		@Pc(34) DataBufferInt local34 = new DataBufferInt(this.anIntArray297, this.anIntArray297.length);
		@Pc(42) DirectColorModel local42 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(52) WritableRaster local52 = Raster.createWritableRaster(local42.createCompatibleSampleModel(this.anInt3426, this.anInt3423), local34, null);
		this.anImage4 = new BufferedImage(local42, local52, false, new Hashtable());
		this.aComponent2 = arg2;
		this.method2377();
	}
}
