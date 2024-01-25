import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
	private final int anInt27;

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
	private final int anInt30;

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
	private final int anInt25;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
	private final int anInt23;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(IIIIIII)V")
	public Class3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt27 = arg3;
		this.anInt30 = arg1;
		this.anInt25 = arg0;
		this.anInt23 = arg2;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(III)V")
	@Override
	public void method8487(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt25 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt23 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt30 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt27 * arg1 >> 12;
		Static330.method5146(super.anInt9988, local17, local24, local39, super.anInt9991, local10, super.anInt9989);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8489(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt25 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt23 * arg0 >> 12;
		@Pc(28) int local28 = this.anInt30 * arg1 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt27 >> 12;
		Static450.method6700(local28, local10, local17, super.anInt9989, local35);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V")
	@Override
	public void method8485(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
