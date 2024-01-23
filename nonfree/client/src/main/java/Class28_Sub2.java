import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class28_Sub2 extends Class28 {

	@OriginalMember(owner = "client!je", name = "q", descriptor = "I")
	private final int anInt2217;

	@OriginalMember(owner = "client!je", name = "k", descriptor = "I")
	private final int anInt2211;

	@OriginalMember(owner = "client!je", name = "u", descriptor = "I")
	private final int anInt2220;

	@OriginalMember(owner = "client!je", name = "p", descriptor = "I")
	private final int anInt2216;

	@OriginalMember(owner = "client!je", name = "o", descriptor = "I")
	private final int anInt2215;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "I")
	private final int anInt2212;

	@OriginalMember(owner = "client!je", name = "j", descriptor = "I")
	private final int anInt2210;

	@OriginalMember(owner = "client!je", name = "w", descriptor = "I")
	private final int anInt2221;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class28_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt2217 = arg1;
		this.anInt2211 = arg7;
		this.anInt2220 = arg4;
		this.anInt2216 = arg2;
		this.anInt2215 = arg5;
		this.anInt2212 = arg3;
		this.anInt2210 = arg0;
		this.anInt2221 = arg6;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIB)V")
	@Override
	public void method2857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg0 * this.anInt2216 >> 12;
		@Pc(13) int local13 = this.anInt2212 * arg1 >> 12;
		@Pc(20) int local20 = this.anInt2215 * arg1 >> 12;
		@Pc(27) int local27 = this.anInt2210 * arg0 >> 12;
		@Pc(34) int local34 = arg1 * this.anInt2217 >> 12;
		@Pc(41) int local41 = this.anInt2221 * arg0 >> 12;
		@Pc(48) int local48 = this.anInt2220 * arg0 >> 12;
		@Pc(59) int local59 = arg1 * this.anInt2211 >> 12;
		Static94.method1640(local13, local34, local27, local6, local20, local41, local59, super.anInt4140, local48);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method2853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
	@Override
	public void method2851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
