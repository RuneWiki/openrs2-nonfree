import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public final class Class2_Sub26 extends Class2 {

	@OriginalMember(owner = "client!jc", name = "B", descriptor = "I")
	private final int anInt4058;

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
	private final int anInt4051;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
	private final int anInt4041;

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
	private final int anInt4045;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
	private final int anInt4042;

	@OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
	public final int anInt4053;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
	public final int anInt4044;

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
	public final int anInt4047;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
	public final int anInt4043;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class2_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt4058 = arg1;
		this.anInt4051 = arg4;
		this.anInt4041 = arg0;
		this.anInt4045 = arg2;
		this.anInt4042 = arg3;
		this.anInt4053 = arg7;
		this.anInt4044 = arg5;
		this.anInt4047 = arg8;
		this.anInt4043 = arg6;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)Z")
	public boolean method3474(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt4044 <= arg0 && this.anInt4053 >= arg0 && this.anInt4043 <= arg1 && this.anInt4047 >= arg1;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)Z")
	public boolean method3475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg2 == this.anInt4041 && this.anInt4058 <= arg0 && arg0 <= this.anInt4042 && this.anInt4045 <= arg1 && this.anInt4051 >= arg1;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([IIIZ)V")
	public void method3476(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0[0] = this.anInt4041;
		arg0[1] = this.anInt4058 + arg1 - this.anInt4044;
		arg0[2] = arg2 + this.anInt4045 - this.anInt4043;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI[II)V")
	public void method3477(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[0] = 0;
		arg1[2] = this.anInt4043 + arg0 - this.anInt4045;
		arg1[1] = arg2 + this.anInt4044 - this.anInt4058;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZII)Z")
	public boolean method3478(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt4058 <= arg0 && this.anInt4042 >= arg0 && arg1 >= this.anInt4045 && this.anInt4051 >= arg1;
	}
}
