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

@OriginalClass("client!re")
public final class Class36_Sub2 extends Class36 {

	@OriginalMember(owner = "client!re", name = "y", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IBILjava/awt/Component;)V")
	@Override
	public void method1761(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		this.anInt2723 = arg1;
		this.anInt2729 = arg0;
		this.anIntArray332 = new int[arg1 * arg0 + 1];
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray332, this.anIntArray332.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(47) WritableRaster local47 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt2729, this.anInt2723), local22, null);
		this.anImage4 = new BufferedImage(local30, local47, false, new Hashtable());
		this.aComponent2 = arg2;
		this.method1758();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIBLjava/awt/Graphics;)V")
	@Override
	public void method1763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Graphics arg4) {
		@Pc(2) Shape local2 = arg4.getClip();
		arg4.clipRect(arg3, arg1, arg0, arg2);
		arg4.drawImage(this.anImage4, 0, 0, this.aComponent2);
		arg4.setClip(local2);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method1765(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent2);
	}
}
