import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class43_Sub4 extends Class43 {

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
	private final int anInt5555;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
	private final int anInt5559;

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
	private final int anInt5563;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
	private final int anInt5556;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IIIIIII)V")
	public Class43_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5555 = arg0;
		this.anInt5559 = arg1;
		this.anInt5563 = arg3;
		this.anInt5556 = arg2;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(III)V")
	@Override
	public void method4692(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.anInt5555 * arg0 >> 12;
		@Pc(22) int local22 = arg0 * this.anInt5556 >> 12;
		@Pc(29) int local29 = this.anInt5559 * arg1 >> 12;
		@Pc(36) int local36 = this.anInt5563 * arg1 >> 12;
		Static73.method1456(local22, local36, super.anInt5546, local29, super.anInt5551, local15);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIB)V")
	@Override
	public void method4688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt5555 >> 12;
		@Pc(17) int local17 = this.anInt5556 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt5559 * arg1 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt5563 >> 12;
		Static109.method49(local10, local31, super.anInt5550, local24, local17);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V")
	@Override
	public void method4686(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * this.anInt5555 >> 12;
		@Pc(21) int local21 = this.anInt5556 * arg0 >> 12;
		@Pc(28) int local28 = this.anInt5559 * arg1 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt5563 >> 12;
		Static98.method932(local14, local28, local35, super.anInt5550, super.anInt5546, local21, super.anInt5551);
	}
}
