import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
	private final int anInt8931;

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
	private final int anInt8928;

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
	private final int anInt8929;

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
	private final int anInt8922;

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
	private final int anInt8930;

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
	private final int anInt8923;

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
	private final int anInt8925;

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
	private final int anInt8927;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt8931 = arg2;
		this.anInt8928 = arg1;
		this.anInt8929 = arg3;
		this.anInt8922 = arg6;
		this.anInt8930 = arg5;
		this.anInt8923 = arg4;
		this.anInt8925 = arg7;
		this.anInt8927 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(III)V")
	@Override
	public void method8487(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8489(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V")
	@Override
	public void method8485(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt8927 * arg1 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt8928 >> 12;
		@Pc(32) int local32 = this.anInt8931 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt8929 * arg0 >> 12;
		@Pc(46) int local46 = this.anInt8923 * arg1 >> 12;
		@Pc(53) int local53 = this.anInt8930 * arg0 >> 12;
		@Pc(60) int local60 = this.anInt8922 * arg1 >> 12;
		@Pc(67) int local67 = this.anInt8925 * arg0 >> 12;
		Static650.method8918(local53, local67, local39, local32, local10, local60, local46, local17, super.anInt9988);
	}
}
