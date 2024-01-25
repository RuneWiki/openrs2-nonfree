import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class42_Sub1 extends Class42 {

	@OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
	private final int anInt2952;

	@OriginalMember(owner = "client!jh", name = "t", descriptor = "I")
	private final int anInt2958;

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
	private final int anInt2951;

	@OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
	private final int anInt2954;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(IIIIII)V")
	public Class42_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt2952 = arg2;
		this.anInt2958 = arg0;
		this.anInt2951 = arg1;
		this.anInt2954 = arg3;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZII)V")
	@Override
	public void method4691(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2958 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt2952 >> 12;
		@Pc(24) int local24 = this.anInt2951 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt2954 * arg1 >> 12;
		Static214.method3325(local17, super.anInt5253, local24, local31, local10);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IBI)V")
	@Override
	public void method4694(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)V")
	@Override
	public void method4693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
