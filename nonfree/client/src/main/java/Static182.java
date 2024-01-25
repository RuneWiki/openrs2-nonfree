import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!lm", name = "C", descriptor = "[Lclient!da;")
	public static Class22[] aClass22Array2;

	@OriginalMember(owner = "client!lm", name = "H", descriptor = "I")
	public static int anInt3888;

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_31 = new Class198(5);

	@OriginalMember(owner = "client!lm", name = "x", descriptor = "Ljava/lang/String;")
	public static final String aString149 = "red:";

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
	public static int anInt3880 = -1;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIIZ)V")
	public static void method3247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(14) int local14 = arg4 + 1;
		Static162.method1731(arg2, Static196.anIntArrayArray37[arg4], arg0, arg1);
		@Pc(27) int local27 = arg3 - 1;
		Static162.method1731(arg2, Static196.anIntArrayArray37[arg3], arg0, arg1);
		for (@Pc(37) int local37 = local14; local37 <= local27; local37++) {
			@Pc(43) int[] local43 = Static196.anIntArrayArray37[local37];
			local43[arg0] = local43[arg2] = arg1;
		}
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(Z)Z")
	public static boolean method3248() {
		try {
			if (Static221.anInt4557 == 2) {
				if (Static336.aClass3_Sub23_2 == null) {
					Static336.aClass3_Sub23_2 = Static360.method2045(Static123.aClass100_57, Static58.anInt1258, Static10.anInt248);
					if (Static336.aClass3_Sub23_2 == null) {
						return false;
					}
				}
				if (Static333.aClass52_1 == null) {
					Static333.aClass52_1 = new Class52(Static299.aClass100_117, Static220.aClass100_93);
				}
				if (Static348.aClass3_Sub2_Sub4_3.method5153(Static333.aClass52_1, Static336.aClass3_Sub23_2, Static42.aClass100_15)) {
					Static348.aClass3_Sub2_Sub4_3.method5127();
					Static348.aClass3_Sub2_Sub4_3.method5117(Static196.anInt4046);
					Static348.aClass3_Sub2_Sub4_3.method5141(Static336.aClass3_Sub23_2, Static37.aBoolean434);
					Static123.aClass100_57 = null;
					Static333.aClass52_1 = null;
					Static336.aClass3_Sub23_2 = null;
					Static221.anInt4557 = 0;
					return true;
				}
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static348.aClass3_Sub2_Sub4_3.method5144();
			Static221.anInt4557 = 0;
			Static333.aClass52_1 = null;
			Static123.aClass100_57 = null;
			Static336.aClass3_Sub23_2 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILclient!ps;)V")
	public static void method3250(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub4_Sub4 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (Static51.anInt1101 < arg1.anInt4936) {
			Static135.method2257(arg1);
		} else if (Static51.anInt1101 <= arg1.anInt4889) {
			Static233.method4012(arg1);
		} else {
			Static295.method5008(arg1, false);
			local7 = Static57.anInt1246;
			local9 = Static138.anInt2797;
		}
		if (arg1.anInt5901 < 128 || arg1.anInt5905 < 128 || arg1.anInt5901 >= (Static162.anInt2152 - 1) * 128 || Static122.anInt2632 * 128 - 128 <= arg1.anInt5905) {
			arg1.anInt4889 = 0;
			arg1.anInt4915 = -1;
			arg1.anInt4910 = -1;
			arg1.anInt4936 = 0;
			arg1.anInt5901 = arg1.anIntArray405[0] * 128 + arg1.method4208() * 64;
			arg1.anInt5905 = arg1.anIntArray404[0] * 128 + arg1.method4208() * 64;
			arg1.method4211();
		}
		if (arg1 == Static349.aClass5_Sub4_Sub4_Sub1_2 && (arg1.anInt5901 < 1536 || arg1.anInt5905 < 1536 || (Static162.anInt2152 - 12) * 128 <= arg1.anInt5901 || arg1.anInt5905 >= (Static122.anInt2632 - 12) * 128)) {
			arg1.anInt4889 = 0;
			arg1.anInt4936 = 0;
			arg1.anInt4915 = -1;
			arg1.anInt4910 = -1;
			arg1.anInt5901 = arg1.anIntArray405[0] * 128 + arg1.method4208() * 64;
			arg1.anInt5905 = arg1.anIntArray404[0] * 128 + arg1.method4208() * 64;
			arg1.method4211();
		}
		@Pc(198) int local198 = Static46.method772(arg1);
		Static298.method5062(local9, local7, local198, arg1);
		Static291.method4968(arg1);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method3251(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local8[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local8[local15] = local8[local15] + arg0[local15];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZI)I")
	public static int method3252(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static53.method898();
		for (@Pc(20) Class3_Sub6 local20 = arg0 ? (Class3_Sub6) Static98.aClass24_9.method595() : (Class3_Sub6) Static98.aClass24_9.method602(); local20 != null; local20 = (Class3_Sub6) Static98.aClass24_9.method602()) {
			if ((local20.aLong12 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local20.aLong12 & 0x4000000000000000L) != 0L) {
					@Pc(45) int local45 = (int) local20.aLong211;
					Static38.anIntArray55[local45] = Static288.anIntArray471[local45];
					local20.method5717();
					return local45;
				}
				local20.method5717();
			}
		}
		return -1;
	}
}
