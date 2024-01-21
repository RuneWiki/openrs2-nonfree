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

@OriginalClass("client!vb")
public final class Class42_Sub2 extends Class42 {

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
	@Override
	public void method3018(@OriginalArg(1) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent2);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V")
	@Override
	public void method3021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Graphics arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) Shape local6 = arg2.getClip();
		arg2.clipRect(arg0, arg4, arg1, arg3);
		arg2.drawImage(this.anImage4, 0, 0, this.aComponent2);
		arg2.setClip(local6);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	@Override
	public void method3017(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		this.anInt3931 = arg1;
		this.anIntArray423 = new int[arg0 * arg1 + 1];
		this.anInt3932 = arg0;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray423, this.anIntArray423.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt3931, this.anInt3932), local22, null);
		this.anImage4 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent2 = arg2;
		this.method3015();
	}
}
