import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class42_Sub3 extends Class42 {

	@OriginalMember(owner = "client!qs", name = "s", descriptor = "I")
	private final int anInt5054;

	@OriginalMember(owner = "client!qs", name = "i", descriptor = "I")
	private final int anInt5046;

	@OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
	private final int anInt5052;

	@OriginalMember(owner = "client!qs", name = "l", descriptor = "I")
	private final int anInt5048;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(IIIIIII)V")
	public Class42_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5054 = arg1;
		this.anInt5046 = arg2;
		this.anInt5052 = arg0;
		this.anInt5048 = arg3;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IBI)V")
	@Override
	public void method4694(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt5052 * arg1 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt5046 >> 12;
		@Pc(32) int local32 = this.anInt5054 * arg0 >> 12;
		@Pc(39) int local39 = this.anInt5048 * arg0 >> 12;
		Static380.method5626(local39, local18, local25, local32, super.anInt5254);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)V")
	@Override
	public void method4693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt5052 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt5046 * arg1 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt5054 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt5048 >> 12;
		Static136.method2195(local39, local10, super.anInt5252, local32, super.anInt5253, super.anInt5254, local17);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZII)V")
	@Override
	public void method4691(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
