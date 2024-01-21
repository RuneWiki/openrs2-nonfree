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

@OriginalClass("client!k")
public final class Class44_Sub1 extends Class44 {

	@OriginalMember(owner = "client!k", name = "t", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method2450(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aComponent1);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	@Override
	public void method2451(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		this.anIntArray356 = new int[arg0 * arg2 + 1];
		this.anInt3105 = arg0;
		this.anInt3102 = arg2;
		@Pc(26) DataBufferInt local26 = new DataBufferInt(this.anIntArray356, this.anIntArray356.length);
		@Pc(34) DirectColorModel local34 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(44) WritableRaster local44 = Raster.createWritableRaster(local34.createCompatibleSampleModel(this.anInt3102, this.anInt3105), local26, null);
		this.anImage3 = new BufferedImage(local34, local44, false, new Hashtable());
		this.aComponent1 = arg1;
		this.method2448();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
	@Override
	public void method2453(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(2) Shape local2 = arg2.getClip();
		arg2.clipRect(arg1, arg3, arg0, arg4);
		arg2.drawImage(this.anImage3, 0, 0, this.aComponent1);
		arg2.setClip(local2);
	}
}
