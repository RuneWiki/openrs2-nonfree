import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
	public static int anInt5715;

	@OriginalMember(owner = "client!wn", name = "h", descriptor = "Lclient!pk;")
	public static Class132 aClass132_93;

	@OriginalMember(owner = "client!wn", name = "q", descriptor = "I")
	public static int anInt5729;

	@OriginalMember(owner = "client!wn", name = "r", descriptor = "Lclient!bn;")
	public static Class8_Sub1_Sub3 aClass8_Sub1_Sub3_8;

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "Lclient!gd;")
	public static Class61 aClass61_54 = new Class61(64);

	@OriginalMember(owner = "client!wn", name = "p", descriptor = "I")
	public static int anInt5728 = 128;

	@OriginalMember(owner = "client!wn", name = "t", descriptor = "Z")
	public static boolean aBoolean481 = false;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIII)I")
	public static int method4318(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg0;
		@Pc(13) int local13 = arg1 & arg0 - 1;
		@Pc(17) int local17 = arg2 / arg0;
		@Pc(22) int local22 = Static20.method362(local17, local7);
		@Pc(28) int local28 = arg0 - 1 & arg2;
		@Pc(41) int local41 = Static20.method362(local17, local7 + 1);
		@Pc(48) int local48 = Static20.method362(local17 + 1, local7);
		@Pc(57) int local57 = Static20.method362(local17 + 1, local7 - -1);
		@Pc(64) int local64 = Static161.method2568(local41, local13, arg0, local22);
		@Pc(71) int local71 = Static161.method2568(local57, local13, arg0, local48);
		return Static161.method2568(local71, local28, arg0, local64);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IILclient!aj;)Ljava/lang/String;")
	public static String method4322(@OriginalArg(2) Class8_Sub2 arg0) {
		try {
			@Pc(7) int local7 = arg0.method2382();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(27) byte[] local27 = new byte[local7];
			arg0.anInt2955 += Static59.aClass145_1.method3532(arg0.anInt2955, local27, arg0.aByteArray24, local7, 0);
			return Static144.method2277(local27, 0, local7);
		} catch (@Pc(51) Exception local51) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIBI)V")
	public static void method4323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = local13 << 1;
		@Pc(21) int local21 = arg4 * arg4;
		@Pc(25) int local25 = local21 << 1;
		@Pc(37) int local37 = arg0 << 1;
		@Pc(41) int local41 = local21 << 2;
		@Pc(50) int local50 = local13 - local25 * (local37 - 1);
		@Pc(54) int local54 = local13 << 2;
		@Pc(62) int local62 = ((arg0 << 1) - 3) * local25;
		@Pc(70) int local70 = local17 * 3;
		@Pc(76) int local76 = local54;
		@Pc(85) int local85 = local17 + (1 - local37) * local21;
		@Pc(104) int local104;
		@Pc(112) int local112;
		if (Static228.anInt4643 <= arg1 && Static244.anInt4872 >= arg1) {
			local104 = Static2.method4(Static52.anInt1146, arg4 + arg3, Static253.anInt4996);
			local112 = Static2.method4(Static52.anInt1146, arg3 - arg4, Static253.anInt4996);
			Static19.method343(local112, arg2, Static181.anIntArrayArray19[arg1], local104);
		}
		@Pc(126) int local126 = local41 * (arg0 - 1);
		while (local9 > 0) {
			if (local85 < 0) {
				while (local85 < 0) {
					local7++;
					local85 += local70;
					local50 += local76;
					local76 += local54;
					local70 += local54;
				}
			}
			local9--;
			local104 = arg1 - local9;
			if (local50 < 0) {
				local50 += local76;
				local7++;
				local85 += local70;
				local70 += local54;
				local76 += local54;
			}
			local85 += -local126;
			local112 = arg1 + local9;
			local50 += -local62;
			local126 -= local41;
			if (local112 >= Static228.anInt4643 && Static244.anInt4872 >= local104) {
				@Pc(221) int local221 = Static2.method4(Static52.anInt1146, local7 + arg3, Static253.anInt4996);
				@Pc(230) int local230 = Static2.method4(Static52.anInt1146, arg3 - local7, Static253.anInt4996);
				if (local104 >= Static228.anInt4643) {
					Static19.method343(local230, arg2, Static181.anIntArrayArray19[local104], local221);
				}
				if (local112 <= Static244.anInt4872) {
					Static19.method343(local230, arg2, Static181.anIntArrayArray19[local112], local221);
				}
			}
			local62 -= local41;
		}
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(B)V")
	public static void method4327() {
		Static270.aClass61_51.method1378();
		Static222.aClass61_42.method1378();
		Static156.aClass61_26.method1378();
	}
}
