import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public final class Class2_Sub28 extends Class2 {

	@OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
	public final int anInt5559;

	@OriginalMember(owner = "client!jg", name = "D", descriptor = "I")
	public final int anInt5568;

	@OriginalMember(owner = "client!jg", name = "E", descriptor = "I")
	private final int anInt5569;

	@OriginalMember(owner = "client!jg", name = "v", descriptor = "I")
	private final int anInt5561;

	@OriginalMember(owner = "client!jg", name = "z", descriptor = "I")
	private final int anInt5564;

	@OriginalMember(owner = "client!jg", name = "w", descriptor = "I")
	public final int anInt5562;

	@OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
	private final int anInt5556;

	@OriginalMember(owner = "client!jg", name = "u", descriptor = "I")
	private final int anInt5560;

	@OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
	public final int anInt5563;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class2_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt5559 = arg5;
		this.anInt5568 = arg7;
		this.anInt5569 = arg1;
		this.anInt5561 = arg2;
		this.anInt5564 = arg0;
		this.anInt5562 = arg6;
		this.anInt5556 = arg3;
		this.anInt5560 = arg4;
		this.anInt5563 = arg8;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(III)Z")
	public boolean method4780(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt5569 <= arg0 && this.anInt5556 >= arg0 && arg1 >= this.anInt5561 && this.anInt5560 >= arg1;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIZ)Z")
	public boolean method4781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg2 == this.anInt5564 && this.anInt5569 <= arg1 && this.anInt5556 >= arg1 && this.anInt5561 <= arg0 && this.anInt5560 >= arg0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(III[I)V")
	public void method4783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[0] = this.anInt5564;
		arg2[1] = this.anInt5569 + arg0 - this.anInt5559;
		arg2[2] = arg1 + this.anInt5561 - this.anInt5562;
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(III)Z")
	public boolean method4785(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt5559 <= arg0 && arg0 <= this.anInt5568 && this.anInt5562 <= arg1 && arg1 <= this.anInt5563;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZ[II)V")
	public void method4786(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[0] = 0;
		arg1[2] = arg0 + this.anInt5562 - this.anInt5561;
		arg1[1] = arg2 + this.anInt5559 - this.anInt5569;
	}
}
