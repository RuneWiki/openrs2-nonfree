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

@OriginalClass("client!ca")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!ca", name = "t", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	@Override
	public void method578(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aComponent1);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	@Override
	public void method580(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		this.anInt884 = arg0;
		this.anInt883 = arg1;
		this.anIntArray104 = new int[arg1 * arg0 + 1];
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray104, this.anIntArray104.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(47) WritableRaster local47 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt883, this.anInt884), local22, null);
		this.anImage3 = new BufferedImage(local30, local47, false, new Hashtable());
		this.aComponent1 = arg2;
		this.method577();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
	@Override
	public void method582(@OriginalArg(1) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(2) Shape local2 = arg0.getClip();
		arg0.clipRect(arg3, arg4, arg1, arg2);
		arg0.drawImage(this.anImage3, 0, 0, this.aComponent1);
		arg0.setClip(local2);
	}
}
