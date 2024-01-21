import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class35_Sub1 extends Class35 {

	@OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
	private final int anInt1550;

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
	private final int anInt1540;

	@OriginalMember(owner = "client!gi", name = "y", descriptor = "I")
	private final int anInt1547;

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
	private final int anInt1544;

	@OriginalMember(owner = "client!gi", name = "B", descriptor = "I")
	private final int anInt1549;

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
	private final int anInt1541;

	@OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
	private final int anInt1546;

	@OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
	private final int anInt1545;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class35_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt1550 = arg4;
		this.anInt1540 = arg6;
		this.anInt1547 = arg3;
		this.anInt1544 = arg5;
		this.anInt1549 = arg1;
		this.anInt1541 = arg7;
		this.anInt1546 = arg2;
		this.anInt1545 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIB)V")
	@Override
	public void method3111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt1545 * arg1 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt1549 >> 12;
		@Pc(24) int local24 = this.anInt1547 * arg0 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt1546 >> 12;
		@Pc(38) int local38 = this.anInt1550 * arg1 >> 12;
		@Pc(45) int local45 = arg0 * this.anInt1544 >> 12;
		@Pc(52) int local52 = this.anInt1540 * arg1 >> 12;
		@Pc(59) int local59 = arg0 * this.anInt1541 >> 12;
		Static25.method3024(local24, local10, local52, super.anInt4071, local45, local17, local59, local31, local38);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZII)V")
	@Override
	public void method3114(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)V")
	@Override
	public void method3115(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
