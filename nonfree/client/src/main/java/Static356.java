import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "[I")
	public static int[] anIntArray525;

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "Lclient!of;")
	public static Class6 aClass6_1;

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_59 = new Class107(50);

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
	public static int anInt6794 = -1;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!iq;B)V")
	public static void method5685(@OriginalArg(0) Class104 arg0) {
		Static338.aClass104_185 = arg0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BILclient!jk;)Z")
	public static boolean method5686(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub12_Sub2 arg1) {
		@Pc(8) int local8 = arg1.method3172(2);
		@Pc(25) int local25;
		@Pc(30) int local30;
		@Pc(97) int local97;
		@Pc(101) int local101;
		@Pc(107) int local107;
		@Pc(118) int local118;
		if (local8 == 0) {
			if (arg1.method3172(1) != 0) {
				method5686(arg0, arg1);
			}
			local25 = arg1.method3172(6);
			local30 = arg1.method3172(6);
			@Pc(40) boolean local40 = arg1.method3172(1) == 1;
			if (local40) {
				Static24.anIntArray71[Static248.anInt5203++] = arg0;
			}
			if (Static164.aClass1_Sub2_Sub3_Sub1Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(67) Class1_Sub2_Sub3_Sub1 local67 = Static164.aClass1_Sub2_Sub3_Sub1Array1[arg0] = new Class1_Sub2_Sub3_Sub1();
			local67.anInt6896 = arg0;
			if (Static165.aClass2_Sub12Array1[arg0] != null) {
				local67.method2969(Static165.aClass2_Sub12Array1[arg0]);
			}
			local67.method5785(Static251.anIntArray407[arg0]);
			local67.anInt6916 = Static151.anIntArray270[arg0];
			local97 = Static120.anIntArray4[arg0];
			local101 = local97 >> 28;
			local107 = local97 >> 14 & 0xFF;
			local67.aByteArray93[0] = Static28.aByteArray5[arg0];
			local118 = local97 & 0xFF;
			local67.aByte77 = (byte) local101;
			local67.method2970((local118 << 6) + local30 - Static287.anInt5776, local25 + (local107 << 6) + -Static150.anInt3453);
			local67.anInt3394 = -1;
			return true;
		} else if (local8 == 1) {
			local25 = arg1.method3172(2);
			local30 = Static120.anIntArray4[arg0];
			Static120.anIntArray4[arg0] = (((local30 >> 28) + local25 & 0x3) << 28) + (local30 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(196) int local196;
			@Pc(200) int local200;
			if (local8 != 2) {
				local25 = arg1.method3172(18);
				local30 = local25 >> 16;
				local196 = local25 >> 8 & 0xFF;
				local200 = local25 & 0xFF;
				local97 = Static120.anIntArray4[arg0];
				local101 = local30 + (local97 >> 28) & 0x3;
				local107 = (local97 >> 14) + local196 & 0xFF;
				local118 = local200 + local97 & 0xFF;
				Static120.anIntArray4[arg0] = (local101 << 28) + (local107 << 14) + local118;
				return false;
			}
			local25 = arg1.method3172(5);
			local30 = local25 >> 3;
			local196 = local25 & 0x7;
			local200 = Static120.anIntArray4[arg0];
			local97 = (local200 >> 28) + local30 & 0x3;
			local101 = local200 >> 14 & 0xFF;
			local107 = local200 & 0xFF;
			if (local196 == 0) {
				local107--;
				local101--;
			}
			if (local196 == 1) {
				local107--;
			}
			if (local196 == 2) {
				local101++;
				local107--;
			}
			if (local196 == 3) {
				local101--;
			}
			if (local196 == 4) {
				local101++;
			}
			if (local196 == 5) {
				local107++;
				local101--;
			}
			if (local196 == 6) {
				local107++;
			}
			if (local196 == 7) {
				local107++;
				local101++;
			}
			Static120.anIntArray4[arg0] = local107 + (local97 << 28) + (local101 << 14);
			return false;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)Lclient!a;")
	public static Class1_Sub1 method5687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class51 local7 = Static196.aClass51ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass1_Sub1_2;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(III)V")
	public static void method5689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static263.aClass107_39 = new Class107(arg1);
		Static362.aClass107_60 = new Class107(arg0);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)V")
	public static void method5690() {
		@Pc(1) Class107 local1 = Static135.aClass107_12;
		synchronized (Static135.aClass107_12) {
			Static135.aClass107_12.method3011(5);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZZ)V")
	public static void method5692(@OriginalArg(1) boolean arg0) {
		if (arg0 != Static288.aBoolean514) {
			Static288.aBoolean514 = arg0;
			Static313.method5190();
		}
	}
}
