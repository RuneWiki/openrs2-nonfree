import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dja")
public final class Class18_Sub2 extends Class18 {

	@OriginalMember(owner = "client!dja", name = "t", descriptor = "I")
	private final int anInt2058;

	@OriginalMember(owner = "client!dja", name = "w", descriptor = "I")
	private final int anInt2061;

	@OriginalMember(owner = "client!dja", name = "q", descriptor = "I")
	private final int anInt2055;

	@OriginalMember(owner = "client!dja", name = "m", descriptor = "I")
	private final int anInt2051;

	@OriginalMember(owner = "client!dja", name = "p", descriptor = "I")
	private final int anInt2054;

	@OriginalMember(owner = "client!dja", name = "r", descriptor = "I")
	private final int anInt2056;

	@OriginalMember(owner = "client!dja", name = "z", descriptor = "I")
	private final int anInt2064;

	@OriginalMember(owner = "client!dja", name = "n", descriptor = "I")
	private final int anInt2052;

	@OriginalMember(owner = "client!dja", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class18_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt2058 = arg1;
		this.anInt2061 = arg4;
		this.anInt2055 = arg5;
		this.anInt2051 = arg3;
		this.anInt2054 = arg7;
		this.anInt2056 = arg0;
		this.anInt2064 = arg2;
		this.anInt2052 = arg6;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(IIB)V")
	@Override
	public void method3073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(III)V")
	@Override
	public void method3075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!dja", name = "b", descriptor = "(III)V")
	@Override
	public void method3076(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt2056 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt2058 >> 12;
		@Pc(24) int local24 = this.anInt2064 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt2051 * arg0 >> 12;
		@Pc(38) int local38 = this.anInt2061 * arg1 >> 12;
		@Pc(45) int local45 = arg0 * this.anInt2055 >> 12;
		@Pc(52) int local52 = this.anInt2052 * arg1 >> 12;
		@Pc(67) int local67 = this.anInt2054 * arg0 >> 12;
		Static431.method6566(local31, local45, local67, local10, local38, local17, local24, super.anInt3585, local52);
	}
}
