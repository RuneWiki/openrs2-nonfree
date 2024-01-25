import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray3 = new Rectangle[100];

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
	private final int anInt566;

	@OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
	public final int anInt570;

	@OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
	public final int anInt580;

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
	private final int anInt571;

	@OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
	private final int anInt569;

	@OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
	private final int anInt578;

	@OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
	public final int anInt572;

	@OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
	public final int anInt575;

	@OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
	private final int anInt568;

	static {
		for (@Pc(11) int local11 = 0; local11 < 100; local11++) {
			aRectangleArray3[local11] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class5_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt566 = arg2;
		this.anInt570 = arg6;
		this.anInt580 = arg8;
		this.anInt571 = arg4;
		this.anInt569 = arg0;
		this.anInt578 = arg1;
		this.anInt572 = arg7;
		this.anInt575 = arg5;
		this.anInt568 = arg3;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)Z")
	public boolean method568(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt575 <= arg0 && arg0 <= this.anInt572 && arg1 >= this.anInt570 && this.anInt580 >= arg1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBI)Z")
	public boolean method570(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt578 <= arg0 && this.anInt568 >= arg0 && arg1 >= this.anInt566 && this.anInt571 >= arg1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIB)Z")
	public boolean method571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.anInt569 == arg2 && this.anInt578 <= arg0 && this.anInt568 >= arg0 && this.anInt566 <= arg1 && this.anInt571 >= arg1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[IBI)V")
	public void method572(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[2] = arg2 + this.anInt566 - this.anInt570;
		arg1[0] = this.anInt569;
		arg1[1] = arg0 + this.anInt578 - this.anInt575;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "([IIII)V")
	public void method574(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		arg0[1] = this.anInt575 + arg1 - this.anInt578;
		arg0[2] = this.anInt570 + arg2 - this.anInt566;
		arg0[0] = 0;
	}
}
