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

@OriginalClass("client!ng")
public final class Class57_Sub1 extends Class57 {

	@OriginalMember(owner = "client!ng", name = "r", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	@Override
	public void method2169(@OriginalArg(2) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent1);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BILjava/awt/Component;I)V")
	@Override
	public void method2173(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		this.anIntArray454 = new int[arg2 * arg0 + 1];
		this.anInt3063 = arg0;
		this.anInt3060 = arg2;
		@Pc(32) DataBufferInt local32 = new DataBufferInt(this.anIntArray454, this.anIntArray454.length);
		@Pc(40) DirectColorModel local40 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(50) WritableRaster local50 = Raster.createWritableRaster(local40.createCompatibleSampleModel(this.anInt3063, this.anInt3060), local32, null);
		this.anImage4 = new BufferedImage(local40, local50, false, new Hashtable());
		this.aComponent1 = arg1;
		this.method2170();
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	@Override
	public void method2171(@OriginalArg(1) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(2) Shape local2 = arg1.getClip();
		arg1.clipRect(arg4, arg0, arg3, arg2);
		arg1.drawImage(this.anImage4, 0, 0, this.aComponent1);
		arg1.setClip(local2);
	}
}
