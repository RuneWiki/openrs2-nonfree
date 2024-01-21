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

@OriginalClass("client!hc")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILjava/awt/Component;II)V")
	@Override
	public void method2584(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) {
		this.anIntArray324 = new int[arg2 * arg0 + 1];
		this.anInt3437 = arg2;
		this.anInt3433 = arg0;
		@Pc(34) DataBufferInt local34 = new DataBufferInt(this.anIntArray324, this.anIntArray324.length);
		@Pc(42) DirectColorModel local42 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(52) WritableRaster local52 = Raster.createWritableRaster(local42.createCompatibleSampleModel(this.anInt3437, this.anInt3433), local34, null);
		this.anImage4 = new BufferedImage(local42, local52, false, new Hashtable());
		this.aComponent1 = arg1;
		this.method2581();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V")
	@Override
	public void method2582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Shape local2 = arg3.getClip();
		arg3.clipRect(arg0, arg1, arg4, arg2);
		arg3.drawImage(this.anImage4, 0, 0, this.aComponent1);
		arg3.setClip(local2);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
	@Override
	public void method2585(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent1);
	}
}
