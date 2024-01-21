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

@OriginalClass("client!qd")
public final class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!qd", name = "t", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method2338(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aComponent2);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	@Override
	public void method2337(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		this.anInt3234 = arg1;
		this.anIntArray236 = new int[arg0 * arg1 + 1];
		this.anInt3227 = arg0;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray236, this.anIntArray236.length);
		@Pc(37) DirectColorModel local37 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(47) WritableRaster local47 = Raster.createWritableRaster(local37.createCompatibleSampleModel(this.anInt3227, this.anInt3234), local22, null);
		this.anImage3 = new BufferedImage(local37, local47, false, new Hashtable());
		this.aComponent2 = arg2;
		this.method2341();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	@Override
	public void method2342(@OriginalArg(1) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(2) Shape local2 = arg1.getClip();
		arg1.clipRect(arg2, arg0, arg3, arg4);
		arg1.drawImage(this.anImage3, 0, 0, this.aComponent2);
		arg1.setClip(local2);
	}
}
