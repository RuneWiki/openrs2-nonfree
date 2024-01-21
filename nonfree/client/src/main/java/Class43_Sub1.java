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

@OriginalClass("client!sd")
public final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!sd", name = "A", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
	@Override
	public void method2199(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent1);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
	@Override
	public void method2198(@OriginalArg(0) int arg0, @OriginalArg(2) Graphics arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Shape local10 = arg1.getClip();
		arg1.clipRect(arg0, arg3, arg4, arg2);
		arg1.drawImage(this.anImage4, 0, 0, this.aComponent1);
		arg1.setClip(local10);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
	@Override
	public void method2192(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anInt3162 = arg2;
		this.anIntArray452 = new int[arg2 * arg1 + 1];
		this.anInt3160 = arg1;
		@Pc(22) DataBufferInt local22 = new DataBufferInt(this.anIntArray452, this.anIntArray452.length);
		@Pc(30) DirectColorModel local30 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(40) WritableRaster local40 = Raster.createWritableRaster(local30.createCompatibleSampleModel(this.anInt3160, this.anInt3162), local22, null);
		this.anImage4 = new BufferedImage(local30, local40, false, new Hashtable());
		this.aComponent1 = arg0;
		this.method2194();
	}
}
