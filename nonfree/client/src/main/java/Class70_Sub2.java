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

@OriginalClass("client!t")
public final class Class70_Sub2 extends Class70 {

	@OriginalMember(owner = "client!t", name = "s", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	@Override
	public void method2800(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		this.anIntArray619 = new int[arg0 * arg1 + 1];
		this.anInt3671 = arg0;
		this.anInt3670 = arg1;
		@Pc(34) DataBufferInt local34 = new DataBufferInt(this.anIntArray619, this.anIntArray619.length);
		@Pc(42) DirectColorModel local42 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(52) WritableRaster local52 = Raster.createWritableRaster(local42.createCompatibleSampleModel(this.anInt3671, this.anInt3670), local34, null);
		this.anImage4 = new BufferedImage(local42, local52, false, new Hashtable());
		this.aComponent2 = arg2;
		this.method2798();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/awt/Graphics;IBIII)V")
	@Override
	public void method2802(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Shape local10 = arg0.getClip();
		arg0.clipRect(arg1, arg3, arg4, arg2);
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent2);
		arg0.setClip(local10);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	@Override
	public void method2797(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent2);
	}
}
