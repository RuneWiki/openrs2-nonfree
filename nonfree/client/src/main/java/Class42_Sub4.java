import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class42_Sub4 extends Class42 {

	@OriginalMember(owner = "client!ro", name = "w", descriptor = "I")
	private final int anInt5269;

	@OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
	private final int anInt5260;

	@OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
	private final int anInt5259;

	@OriginalMember(owner = "client!ro", name = "i", descriptor = "I")
	private final int anInt5257;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(IIIIIII)V")
	public Class42_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5269 = arg1;
		this.anInt5260 = arg2;
		this.anInt5259 = arg3;
		this.anInt5257 = arg0;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(III)V")
	@Override
	public void method4693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5257 >> 12;
		@Pc(23) int local23 = arg1 * this.anInt5260 >> 12;
		@Pc(30) int local30 = this.anInt5269 * arg0 >> 12;
		@Pc(37) int local37 = this.anInt5259 * arg0 >> 12;
		Static378.method5601(super.anInt5253, local37, super.anInt5254, local30, super.anInt5252, local23, local10);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IBI)V")
	@Override
	public void method4694(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5257 >> 12;
		@Pc(28) int local28 = this.anInt5260 * arg1 >> 12;
		@Pc(35) int local35 = this.anInt5269 * arg0 >> 12;
		@Pc(42) int local42 = arg0 * this.anInt5259 >> 12;
		Static187.method2966(super.anInt5254, local10, local35, local42, local28);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZII)V")
	@Override
	public void method4691(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt5257 >> 12;
		@Pc(17) int local17 = this.anInt5260 * arg0 >> 12;
		@Pc(28) int local28 = this.anInt5269 * arg1 >> 12;
		@Pc(35) int local35 = this.anInt5259 * arg1 >> 12;
		Static267.method5159(local28, local17, local35, super.anInt5252, super.anInt5253, local10);
	}
}
