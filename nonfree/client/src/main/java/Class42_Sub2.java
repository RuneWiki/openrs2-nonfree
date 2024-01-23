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

@OriginalClass("client!sl")
public final class Class42_Sub2 extends Class42 {

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILjava/awt/Graphics;IZII)V")
	@Override
	public void method3930(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(2) Shape local2 = arg1.getClip();
		arg1.clipRect(arg4, arg2, arg3, arg0);
		arg1.drawImage(this.anImage4, 0, 0, this.aComponent2);
		arg1.setClip(local2);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BIILjava/awt/Component;)V")
	@Override
	public void method3933(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		this.anInt4983 = arg1;
		this.anInt4984 = arg0;
		this.anIntArray391 = new int[arg1 * arg0 + 1];
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray391, this.anIntArray391.length);
		@Pc(37) DirectColorModel local37 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(47) WritableRaster local47 = Raster.createWritableRaster(local37.createCompatibleSampleModel(this.anInt4984, this.anInt4983), local22, null);
		this.anImage4 = new BufferedImage(local37, local47, false, new Hashtable());
		this.aComponent2 = arg2;
		this.method3934();
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
	@Override
	public void method3931(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent2);
	}
}
