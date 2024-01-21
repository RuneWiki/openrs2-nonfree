import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class31_Sub2 extends Class31 {

	@OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
	private final int anInt1436;

	@OriginalMember(owner = "client!hc", name = "H", descriptor = "I")
	private final int anInt1442;

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
	private final int anInt1430;

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
	private final int anInt1429;

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
	private final int anInt1433;

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
	private final int anInt1434;

	@OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
	private final int anInt1438;

	@OriginalMember(owner = "client!hc", name = "A", descriptor = "I")
	private final int anInt1440;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class31_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt1436 = arg6;
		this.anInt1442 = arg0;
		this.anInt1430 = arg5;
		this.anInt1429 = arg2;
		this.anInt1433 = arg1;
		this.anInt1434 = arg4;
		this.anInt1438 = arg7;
		this.anInt1440 = arg3;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIB)V")
	@Override
	public void method2821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)V")
	@Override
	public void method2819(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
	@Override
	public void method2817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = this.anInt1442 * arg1 >> 12;
		@Pc(18) int local18 = this.anInt1433 * arg0 >> 12;
		@Pc(29) int local29 = this.anInt1440 * arg0 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt1429 >> 12;
		@Pc(43) int local43 = arg1 * this.anInt1434 >> 12;
		@Pc(50) int local50 = this.anInt1438 * arg0 >> 12;
		@Pc(57) int local57 = this.anInt1430 * arg0 >> 12;
		@Pc(64) int local64 = arg1 * this.anInt1436 >> 12;
		Static140.method2165(local36, local57, local64, local18, local50, super.anInt3936, local11, local43, local29);
	}
}
