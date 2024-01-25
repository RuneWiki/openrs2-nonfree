import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class43_Sub3 extends Class43 {

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
	private final int anInt3533;

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
	private final int anInt3536;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
	private final int anInt3530;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
	private final int anInt3534;

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
	private final int anInt3538;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
	private final int anInt3541;

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
	private final int anInt3539;

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
	private final int anInt3540;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class43_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt3533 = arg2;
		this.anInt3536 = arg1;
		this.anInt3530 = arg5;
		this.anInt3534 = arg6;
		this.anInt3538 = arg0;
		this.anInt3541 = arg3;
		this.anInt3539 = arg4;
		this.anInt3540 = arg7;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)V")
	@Override
	public void method4935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt3538 >> 12;
		@Pc(17) int local17 = this.anInt3536 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt3533 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt3541 >> 12;
		@Pc(46) int local46 = this.anInt3539 * arg0 >> 12;
		@Pc(53) int local53 = this.anInt3530 * arg1 >> 12;
		@Pc(60) int local60 = this.anInt3534 * arg0 >> 12;
		@Pc(67) int local67 = arg1 * this.anInt3540 >> 12;
		Static285.method4334(local46, local53, local10, local67, local60, local17, local39, local24, super.anInt5750);
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(III)V")
	@Override
	public void method4940(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BII)V")
	@Override
	public void method4938(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
