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

@OriginalClass("client!tj")
public final class Class119_Sub2 extends Class119 {

	@OriginalMember(owner = "client!tj", name = "m", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIZLjava/awt/Graphics;II)V")
	@Override
	public void method3928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Graphics arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(2) Shape local2 = arg2.getClip();
		arg2.clipRect(arg0, arg4, arg3, arg1);
		arg2.drawImage(this.anImage4, 0, 0, this.aComponent2);
		arg2.setClip(local2);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILjava/awt/Component;II)V")
	@Override
	public void method3927(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) {
		this.anInt4949 = arg2;
		this.anIntArray437 = new int[arg0 * arg2 + 1];
		this.anInt4946 = arg0;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray437, this.anIntArray437.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt4949, this.anInt4946), local22, null);
		this.anImage4 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent2 = arg1;
		this.method3926();
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
	@Override
	public void method3931(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent2);
	}
}
