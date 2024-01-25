import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class114_Sub1 extends Class114 {

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
	private final int anInt2872;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
	private final int anInt2871;

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
	private final int anInt2877;

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
	private final int anInt2878;

	@OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
	private final int anInt2883;

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
	private final int anInt2873;

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
	private final int anInt2876;

	@OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
	private final int anInt2880;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class114_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt2872 = arg7;
		this.anInt2871 = arg1;
		this.anInt2877 = arg4;
		this.anInt2878 = arg0;
		this.anInt2883 = arg6;
		this.anInt2873 = arg3;
		this.anInt2876 = arg5;
		this.anInt2880 = arg2;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIB)V")
	@Override
	public void method4462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(III)V")
	@Override
	public void method4466(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V")
	@Override
	public void method4461(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2878 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt2871 >> 12;
		@Pc(28) int local28 = this.anInt2880 * arg0 >> 12;
		@Pc(35) int local35 = this.anInt2873 * arg1 >> 12;
		@Pc(42) int local42 = this.anInt2877 * arg0 >> 12;
		@Pc(49) int local49 = this.anInt2876 * arg1 >> 12;
		@Pc(56) int local56 = arg0 * this.anInt2883 >> 12;
		@Pc(63) int local63 = this.anInt2872 * arg1 >> 12;
		Static83.method1499(local17, local35, local42, local49, local10, super.anInt5078, local28, local63, local56);
	}
}
