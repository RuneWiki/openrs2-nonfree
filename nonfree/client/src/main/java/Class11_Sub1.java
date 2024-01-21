import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
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

@OriginalClass("client!cc")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	@Override
	public void method2148(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.drawImage(this.anImage4, arg1, arg2, this.aComponent1);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIILjava/awt/Component;)V")
	@Override
	public void method2150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2) {
		this.anIntArray487 = new int[arg1 * arg0 + 1];
		this.anInt3140 = arg1;
		this.anInt3134 = arg0;
		@Pc(30) DataBufferInt local30 = new DataBufferInt(this.anIntArray487, this.anIntArray487.length);
		@Pc(38) DirectColorModel local38 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(48) WritableRaster local48 = Raster.createWritableRaster(local38.createCompatibleSampleModel(this.anInt3140, this.anInt3134), local30, null);
		this.anImage4 = new BufferedImage(local38, local48, false, new Hashtable());
		this.aComponent1 = arg2;
		this.method2152();
	}
}
