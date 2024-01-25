import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
	public static int anInt6971;

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
	public static int anInt6975;

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "Lclient!co;")
	public static final Class41 aClass41_74 = new Class41(20);

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_244 = new Class62("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IB)V")
	public static void method6008(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static328.method5290(9, arg0);
		local8.method1197();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "([IZ[III)V")
	public static void method6009(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(10) int local10 = (arg3 + arg2) / 2;
		@Pc(12) int local12 = arg2;
		@Pc(16) int local16 = arg0[local10];
		arg0[local10] = arg0[arg3];
		arg0[arg3] = local16;
		@Pc(30) int local30 = arg1[local10];
		arg1[local10] = arg1[arg3];
		arg1[arg3] = local30;
		for (@Pc(42) int local42 = arg2; local42 < arg3; local42++) {
			if (arg0[local42] < local16 + (local42 & 0x1)) {
				@Pc(61) int local61 = arg0[local42];
				arg0[local42] = arg0[local12];
				arg0[local12] = local61;
				@Pc(75) int local75 = arg1[local42];
				arg1[local42] = arg1[local12];
				arg1[local12++] = local75;
			}
		}
		arg0[arg3] = arg0[local12];
		arg0[local12] = local16;
		arg1[arg3] = arg1[local12];
		arg1[local12] = local30;
		method6009(arg0, arg1, arg2, local12 - 1);
		method6009(arg0, arg1, local12 + 1, arg3);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIII)V")
	public static void method6010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static199.anIntArrayArray19 != null) {
			Static199.anIntArrayArray19[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static102.aByteArrayArray8 != null) {
			Static102.aByteArrayArray8[arg0][arg1] = (byte) (arg3 >> 3);
		}
		if (Static139.aByteArrayArray11 != null) {
			Static139.aByteArrayArray11[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BI)I")
	public static int method6011(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
