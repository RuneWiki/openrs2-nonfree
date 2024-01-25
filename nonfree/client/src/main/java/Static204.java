import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
	public static int anInt3742;

	@OriginalMember(owner = "client!kc", name = "q", descriptor = "Lclient!vh;")
	public static Class250 aClass250_47;

	@OriginalMember(owner = "client!kc", name = "t", descriptor = "[I")
	public static int[] anIntArray311;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_64 = new Class237(77, -2);

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_65 = new Class237(12, 6);

	@OriginalMember(owner = "client!kc", name = "s", descriptor = "F")
	public static float aFloat67 = 1.0F;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!uo;)I")
	public static int method3120(@OriginalArg(1) Class26_Sub2_Sub2_Sub2 arg0) {
		@Pc(8) Class66 local8 = arg0.aClass66_1;
		if (local8.anIntArray152 != null) {
			local8 = local8.method1454(Static51.aClass79_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(28) int local28 = local8.lb;
		@Pc(32) Class164 local32 = arg0.method5533();
		if (arg0.aBoolean458) {
			local28 = local8.anInt1687;
		} else if (local32.anInt4695 == arg0.anInt7122 || local32.anInt4680 == arg0.anInt7122 || local32.anInt4676 == arg0.anInt7122 || arg0.anInt7122 == local32.anInt4698) {
			local28 = local8.anInt1693;
		} else if (local32.anInt4697 == arg0.anInt7122 || arg0.anInt7122 == local32.anInt4701 || local32.anInt4669 == arg0.anInt7122 || arg0.anInt7122 == local32.anInt4666) {
			local28 = local8.anInt1681;
		}
		return local28;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIILclient!ir;ILclient!ir;III)V")
	public static void method3121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class26_Sub2_Sub2 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class26_Sub2_Sub2 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(7) int local7 = arg2.method5530();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class80 local20 = (Class80) Static358.aClass83_51.method1658((long) local7);
		if (local20 == null) {
			@Pc(27) Class159[] local27 = Static459.method3750(Static384.aClass250_76, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static276.aClass109_10.method4684(local27[0]);
			Static358.aClass83_51.method1675((long) local7, local20);
		}
		Static294.method4792(arg1 >> 1, arg4.method5535() * 64, 0, arg4.aByte95, arg3 >> 1, arg4.anInt7065, arg4.anInt7068);
		@Pc(73) int local73 = Static343.anIntArray470[0] + arg6 - 18;
		@Pc(81) int local81 = local73 + arg5 / 4 * 18;
		@Pc(92) int local92 = arg0 + Static343.anIntArray470[1] - 16 - 54;
		@Pc(100) int local100 = local92 + arg5 % 4 * 18;
		local20.method6099(local81, local100);
		if (arg2 == arg4) {
			Static276.aClass109_10.method4723(-256, 18, local81 - 1, local100 + -1, 18);
		}
		@Pc(124) Class39_Sub5 local124 = Static156.method2349();
		local124.aClass26_Sub2_Sub2_1 = arg2;
		local124.anInt3257 = local100;
		local124.anInt3263 = local81;
		local124.anInt3258 = local100 + 16;
		local124.anInt3262 = local81 + 16;
		Static47.aClass188_1.method4538(local124);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLclient!tf;II)V")
	public static void method3122(@OriginalArg(1) Class26_Sub2_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt7073 == arg2 && arg2 != -1) {
			@Pc(85) Class191 local85 = Static191.aClass28_1.method567(arg2);
			@Pc(88) int local88 = local85.anInt5751;
			if (local88 == 1) {
				arg0.anInt7075 = 0;
				arg0.anInt7127 = 0;
				arg0.anInt7120 = arg1;
				arg0.anInt7133 = 1;
				arg0.anInt7136 = 0;
				Static228.method3411(arg0.anInt7065, Static196.aClass26_Sub2_Sub2_Sub1_1 == arg0, arg0.anInt7068, local85, arg0.anInt7075, arg0.aByte95);
			}
			if (local88 == 2) {
				arg0.anInt7136 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt7073 == -1 || Static191.aClass28_1.method567(arg2).anInt5740 >= Static191.aClass28_1.method567(arg0.anInt7073).anInt5740) {
			arg0.anInt7147 = arg0.anInt7148;
			arg0.anInt7136 = 0;
			arg0.anInt7127 = 0;
			arg0.anInt7073 = arg2;
			arg0.anInt7133 = 1;
			arg0.anInt7075 = 0;
			arg0.anInt7120 = arg1;
			if (arg0.anInt7073 != -1) {
				Static228.method3411(arg0.anInt7065, arg0 == Static196.aClass26_Sub2_Sub2_Sub1_1, arg0.anInt7068, Static191.aClass28_1.method567(arg0.anInt7073), arg0.anInt7075, arg0.aByte95);
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!a;I)V")
	public static void method3123(@OriginalArg(1) Class1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static9.aBoolean2 = false;
		Static119.anInt7597 = 0;
		Static179.method2768(arg0);
		Static434.method5791(arg0);
		if (Static9.aBoolean2) {
			System.out.println("---endgpp---");
		}
		if (arg1 != arg0.anInt5056) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt5056 + " psize:" + arg1);
		}
	}
}
