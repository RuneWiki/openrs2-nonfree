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

@OriginalClass("client!hj")
public final class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLjava/awt/Component;II)V")
	@Override
	public void method1712(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray230 = new int[arg1 * arg2 + 1];
		this.anInt2266 = arg1;
		this.anInt2263 = arg2;
		@Pc(26) DataBufferInt local26 = new DataBufferInt(this.anIntArray230, this.anIntArray230.length);
		@Pc(34) DirectColorModel local34 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(44) WritableRaster local44 = Raster.createWritableRaster(local34.createCompatibleSampleModel(this.anInt2266, this.anInt2263), local26, null);
		this.anImage3 = new BufferedImage(local34, local44, false, new Hashtable());
		this.aComponent1 = arg0;
		this.method1716();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V")
	@Override
	public void method1710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Shape local2 = arg3.getClip();
		arg3.clipRect(arg4, arg0, arg2, arg1);
		arg3.drawImage(this.anImage3, 0, 0, this.aComponent1);
		arg3.setClip(local2);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	@Override
	public void method1713(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aComponent1);
	}
}
