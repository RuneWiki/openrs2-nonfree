import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public abstract class Class34 {

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "[I")
	public static int[] anIntArray239 = new int[99];

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
	protected int anInt2138;

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "Ljava/awt/Image;")
	protected Image anImage21;

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "[I")
	protected int[] anIntArray240;

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
	protected int anInt2142;

	static {
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < 99; local21++) {
			@Pc(26) int local26 = local21 + 1;
			@Pc(39) int local39 = (int) ((double) local26 + Math.pow(2.0D, (double) local26 / 7.0D) * 300.0D);
			local19 += local39;
			anIntArray239[local21] = local19 / 4;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILjava/awt/Component;II)V")
	public abstract void method1632(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public abstract void method1633(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
	public final void method1636() {
		Static4.method2565(this.anIntArray240, this.anInt2138, this.anInt2142);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
	public abstract void method1637(@OriginalArg(0) Graphics arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4);
}
