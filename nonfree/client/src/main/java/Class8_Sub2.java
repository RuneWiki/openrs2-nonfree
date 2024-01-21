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

@OriginalClass("client!dc")
public final class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "Ljava/awt/Component;")
	private Component aComponent2;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/awt/Component;IIB)V")
	@Override
	public void method519(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt735 = arg2;
		this.anIntArray51 = new int[arg1 * arg2 + 1];
		this.anInt738 = arg1;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray51, this.anIntArray51.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt738, this.anInt735), local22, null);
		this.anImage3 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent2 = arg0;
		this.method523();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILjava/awt/Graphics;IZII)V")
	@Override
	public void method520(@OriginalArg(0) int arg0, @OriginalArg(1) Graphics arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(2) Shape local2 = arg1.getClip();
		arg1.clipRect(arg2, arg4, arg0, arg3);
		arg1.drawImage(this.anImage3, 0, 0, this.aComponent2);
		arg1.setClip(local2);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
	@Override
	public void method524(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aComponent2);
	}
}
