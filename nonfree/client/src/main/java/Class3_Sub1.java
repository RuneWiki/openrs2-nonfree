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

@OriginalClass("client!g")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!g", name = "p", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIB)V")
	@Override
	public void method2414(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Shape local12 = arg0.getClip();
		arg0.clipRect(arg2, arg1, arg3, arg4);
		arg0.drawImage(this.anImage3, 0, 0, this.aComponent1);
		arg0.setClip(local12);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
	@Override
	public void method2410(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aComponent1);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/awt/Component;III)V")
	@Override
	public void method2412(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anInt3337 = arg1;
		this.anIntArray307 = new int[arg2 * arg1 + 1];
		this.anInt3335 = arg2;
		@Pc(30) DataBufferInt local30 = new DataBufferInt(this.anIntArray307, this.anIntArray307.length);
		@Pc(38) DirectColorModel local38 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(48) WritableRaster local48 = Raster.createWritableRaster(local38.createCompatibleSampleModel(this.anInt3335, this.anInt3337), local30, null);
		this.anImage3 = new BufferedImage(local38, local48, false, new Hashtable());
		this.aComponent1 = arg0;
		this.method2413();
	}
}
