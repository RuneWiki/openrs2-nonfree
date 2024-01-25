import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class38_Sub1 extends Class38 {

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
	private final int anInt843;

	@OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
	private final int anInt848;

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
	private final int anInt850;

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
	private final int anInt840;

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
	private final int anInt842;

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
	private final int anInt847;

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
	private final int anInt841;

	@OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
	private final int anInt851;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class38_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt843 = arg6;
		this.anInt848 = arg2;
		this.anInt850 = arg0;
		this.anInt840 = arg4;
		this.anInt842 = arg1;
		this.anInt847 = arg7;
		this.anInt841 = arg5;
		this.anInt851 = arg3;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5174(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(III)V")
	@Override
	public void method5175(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)V")
	@Override
	public void method5171(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt850 >> 12;
		@Pc(25) int local25 = this.anInt842 * arg0 >> 12;
		@Pc(32) int local32 = this.anInt848 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt851 * arg0 >> 12;
		@Pc(46) int local46 = arg1 * this.anInt840 >> 12;
		@Pc(53) int local53 = arg0 * this.anInt841 >> 12;
		@Pc(60) int local60 = this.anInt843 * arg1 >> 12;
		@Pc(67) int local67 = arg0 * this.anInt847 >> 12;
		Static358.method5322(local10, local25, local53, super.anInt6088, local32, local46, local60, local39, local67);
	}
}
