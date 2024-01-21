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

@OriginalClass("client!bc")
public final class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!bc", name = "w", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IBLjava/awt/Component;I)V")
	@Override
	public void method990(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		this.anIntArray145 = new int[arg2 * arg0 + 1];
		this.anInt1357 = arg0;
		this.anInt1355 = arg2;
		@Pc(29) DataBufferInt local29 = new DataBufferInt(this.anIntArray145, this.anIntArray145.length);
		@Pc(37) DirectColorModel local37 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(47) WritableRaster local47 = Raster.createWritableRaster(local37.createCompatibleSampleModel(this.anInt1355, this.anInt1357), local29, null);
		this.anImage3 = new BufferedImage(local37, local47, false, new Hashtable());
		this.aComponent1 = arg1;
		this.method993();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V")
	@Override
	public void method994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Graphics arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Shape local2 = arg3.getClip();
		arg3.clipRect(arg2, arg4, arg0, arg1);
		arg3.drawImage(this.anImage3, 0, 0, this.aComponent1);
		arg3.setClip(local2);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
	@Override
	public void method989(@OriginalArg(3) Graphics arg0) {
		arg0.drawImage(this.anImage3, 0, 0, this.aComponent1);
	}
}
