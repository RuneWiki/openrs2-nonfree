import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
	private final int anInt3143;

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
	private final int anInt3139;

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
	private final int anInt3144;

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
	private final int anInt3136;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(IIIIIII)V")
	public Class3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3143 = arg0;
		this.anInt3139 = arg3;
		this.anInt3144 = arg2;
		this.anInt3136 = arg1;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)V")
	@Override
	public void method3660(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt3143 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt3139 * arg1 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt3136 >> 12;
		@Pc(36) int local36 = this.anInt3144 * arg0 >> 12;
		Static26.method475(super.anInt4875, local36, local17, super.anInt4874, super.anInt4879, local6, local29);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBI)V")
	@Override
	public void method3661(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt3143 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt3144 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt3139 >> 12;
		@Pc(39) int local39 = this.anInt3136 * arg0 >> 12;
		Static189.method3063(local25, local32, local10, local39, super.anInt4874);
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(III)V")
	@Override
	public void method3663(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
