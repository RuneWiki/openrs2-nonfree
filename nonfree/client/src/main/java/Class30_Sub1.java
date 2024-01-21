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

@OriginalClass("client!kd")
public final class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method2026(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent1);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V")
	@Override
	public void method2024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Shape local2 = arg3.getClip();
		arg3.clipRect(arg0, arg1, arg4, arg2);
		arg3.drawImage(this.anImage4, 0, 0, this.aComponent1);
		arg3.setClip(local2);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	@Override
	public void method2027(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		this.anIntArray301 = new int[arg1 * arg0 + 1];
		this.anInt2721 = arg1;
		this.anInt2716 = arg0;
		@Pc(29) DataBufferInt local29 = new DataBufferInt(this.anIntArray301, this.anIntArray301.length);
		@Pc(37) DirectColorModel local37 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(47) WritableRaster local47 = Raster.createWritableRaster(local37.createCompatibleSampleModel(this.anInt2716, this.anInt2721), local29, null);
		this.anImage4 = new BufferedImage(local37, local47, false, new Hashtable());
		this.aComponent1 = arg2;
		this.method2023();
	}
}
