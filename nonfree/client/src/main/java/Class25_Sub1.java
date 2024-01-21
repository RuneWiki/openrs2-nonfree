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

@OriginalClass("client!ef")
public final class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!ef", name = "q", descriptor = "Ljava/awt/Component;")
	private Component aComponent1;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	@Override
	public void method2791(@OriginalArg(0) Graphics arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(2) Shape local2 = arg0.getClip();
		arg0.clipRect(arg2, arg4, arg3, arg1);
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent1);
		arg0.setClip(local2);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
	@Override
	public void method2795(@OriginalArg(0) Graphics arg0) {
		arg0.drawImage(this.anImage4, 0, 0, this.aComponent1);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILjava/awt/Component;I)V")
	@Override
	public void method2790(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		this.anInt3969 = arg2;
		this.anInt3967 = arg0;
		this.anIntArray543 = new int[arg2 * arg0 + 1];
		@Pc(25) DataBufferInt local25 = new DataBufferInt(this.anIntArray543, this.anIntArray543.length);
		@Pc(33) DirectColorModel local33 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(43) WritableRaster local43 = Raster.createWritableRaster(local33.createCompatibleSampleModel(this.anInt3969, this.anInt3967), local25, null);
		this.anImage4 = new BufferedImage(local33, local43, false, new Hashtable());
		this.aComponent1 = arg1;
		this.method2789();
	}
}
