import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public final class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!bn", name = "w", descriptor = "I")
	public final int anInt638;

	@OriginalMember(owner = "client!bn", name = "r", descriptor = "I")
	private final int anInt633;

	@OriginalMember(owner = "client!bn", name = "q", descriptor = "I")
	private final int anInt632;

	@OriginalMember(owner = "client!bn", name = "D", descriptor = "I")
	private final int anInt643;

	@OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
	public final int anInt636;

	@OriginalMember(owner = "client!bn", name = "B", descriptor = "I")
	private final int anInt641;

	@OriginalMember(owner = "client!bn", name = "v", descriptor = "I")
	private final int anInt637;

	@OriginalMember(owner = "client!bn", name = "s", descriptor = "I")
	public final int anInt634;

	@OriginalMember(owner = "client!bn", name = "x", descriptor = "I")
	public final int anInt639;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt638 = arg6;
		this.anInt633 = arg4;
		this.anInt632 = arg1;
		this.anInt643 = arg2;
		this.anInt636 = arg8;
		this.anInt641 = arg3;
		this.anInt637 = arg0;
		this.anInt634 = arg5;
		this.anInt639 = arg7;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(BII)Z")
	public boolean method551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt634 <= arg1 && this.anInt639 >= arg1 && arg0 >= this.anInt638 && this.anInt636 >= arg0;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(BI[II)V")
	public void method552(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[2] = arg0 + this.anInt638 - this.anInt643;
		arg1[0] = 0;
		arg1[1] = arg2 + this.anInt634 - this.anInt632;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)Z")
	public boolean method553(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt632 && this.anInt641 >= arg1 && arg0 >= this.anInt643 && arg0 <= this.anInt633;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(II[II)V")
	public void method556(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[1] = this.anInt632 + arg0 - this.anInt634;
		arg1[2] = arg2 + this.anInt643 - this.anInt638;
		arg1[0] = this.anInt637;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII)Z")
	public boolean method557(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg1 == this.anInt637 && this.anInt632 <= arg2 && this.anInt641 >= arg2 && arg0 >= this.anInt643 && this.anInt633 >= arg0;
	}
}
