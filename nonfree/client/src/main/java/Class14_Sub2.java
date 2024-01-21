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

@OriginalClass("client!wf")
public final class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!wf", name = "s", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
	@Override
	public void method3033(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4130 = arg1;
		this.anInt4129 = arg2;
		this.anIntArray455 = new int[arg1 * arg2 + 1];
		@Pc(32) DataBufferInt local32 = new DataBufferInt(this.anIntArray455, this.anIntArray455.length);
		@Pc(40) DirectColorModel local40 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(50) WritableRaster local50 = Raster.createWritableRaster(local40.createCompatibleSampleModel(this.anInt4129, this.anInt4130), local32, null);
		this.anImage4 = new BufferedImage(local40, local50, false, new Hashtable());
		this.aComponent2 = arg0;
		this.method3036();
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IBIILjava/awt/Graphics;I)V")
	@Override
	public void method3031(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4) {
		@Pc(2) Shape local2 = arg3.getClip();
		arg3.clipRect(arg4, arg2, arg0, arg1);
		arg3.drawImage(this.anImage4, 0, 0, this.aComponent2);
		arg3.setClip(local2);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZILjava/awt/Graphics;I)V")
	@Override
	public void method3032(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent2);
	}
}
