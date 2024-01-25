import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class42_Sub2 extends Class42 {

	@OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
	private final int anInt3958;

	@OriginalMember(owner = "client!mo", name = "v", descriptor = "I")
	private final int anInt3968;

	@OriginalMember(owner = "client!mo", name = "x", descriptor = "I")
	private final int anInt3970;

	@OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
	private final int anInt3964;

	@OriginalMember(owner = "client!mo", name = "k", descriptor = "I")
	private final int anInt3959;

	@OriginalMember(owner = "client!mo", name = "y", descriptor = "I")
	private final int anInt3971;

	@OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
	private final int anInt3962;

	@OriginalMember(owner = "client!mo", name = "p", descriptor = "I")
	private final int anInt3963;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class42_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt3958 = arg7;
		this.anInt3968 = arg0;
		this.anInt3970 = arg5;
		this.anInt3964 = arg3;
		this.anInt3959 = arg6;
		this.anInt3971 = arg1;
		this.anInt3962 = arg2;
		this.anInt3963 = arg4;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IBI)V")
	@Override
	public void method4694(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)V")
	@Override
	public void method4693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZII)V")
	@Override
	public void method4691(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt3968 >> 12;
		@Pc(17) int local17 = this.anInt3971 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt3962 * arg0 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt3964 >> 12;
		@Pc(38) int local38 = arg0 * this.anInt3963 >> 12;
		@Pc(51) int local51 = this.anInt3970 * arg1 >> 12;
		@Pc(58) int local58 = arg0 * this.anInt3959 >> 12;
		@Pc(65) int local65 = arg1 * this.anInt3958 >> 12;
		Static349.method5267(local24, local38, local65, local58, super.anInt5253, local31, local10, local51, local17);
	}
}
