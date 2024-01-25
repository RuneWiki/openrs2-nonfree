import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class53_Sub3 extends Class53 {

	@OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
	private final int anInt5431;

	@OriginalMember(owner = "client!kn", name = "v", descriptor = "I")
	private final int anInt5437;

	@OriginalMember(owner = "client!kn", name = "q", descriptor = "I")
	private final int anInt5433;

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
	private final int anInt5430;

	@OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
	private final int anInt5428;

	@OriginalMember(owner = "client!kn", name = "p", descriptor = "I")
	private final int anInt5432;

	@OriginalMember(owner = "client!kn", name = "r", descriptor = "I")
	private final int anInt5434;

	@OriginalMember(owner = "client!kn", name = "w", descriptor = "I")
	private final int anInt5438;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class53_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt5431 = arg4;
		this.anInt5437 = arg3;
		this.anInt5433 = arg6;
		this.anInt5430 = arg1;
		this.anInt5428 = arg7;
		this.anInt5432 = arg5;
		this.anInt5434 = arg2;
		this.anInt5438 = arg0;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8322(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(III)V")
	@Override
	public void method8329(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt5438 * arg0 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt5430 >> 12;
		@Pc(24) int local24 = this.anInt5434 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt5437 * arg1 >> 12;
		@Pc(42) int local42 = arg0 * this.anInt5431 >> 12;
		@Pc(49) int local49 = this.anInt5432 * arg1 >> 12;
		@Pc(56) int local56 = arg0 * this.anInt5433 >> 12;
		@Pc(63) int local63 = this.anInt5428 * arg1 >> 12;
		Static478.method6780(local10, local42, local17, local49, local56, super.anInt9772, local63, local24, local31);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)V")
	@Override
	public void method8328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
