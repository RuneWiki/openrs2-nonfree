import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
	public static int anInt3431;

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
	public static int anInt3433;

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
	public static int anInt3436;

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
	public static int anInt3437;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1213 = null;

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "Lclient!nativeadvert/browsercontrol;")
	public static browsercontrol aBrowsercontrol1 = null;

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
	public static int anInt3434 = 0;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZILclient!la;III)V")
	public static void method2680(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub18 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1.anInt2495 == -1 && arg1.anIntArray143 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		if (arg0 > arg1.anInt2494) {
			local15 = arg0 - arg1.anInt2494;
		} else if (arg0 < arg1.anInt2487) {
			local15 = arg1.anInt2487 - arg0;
		}
		if (arg1.anInt2492 < arg2) {
			local15 += arg2 - arg1.anInt2492;
		} else if (arg2 < arg1.anInt2499) {
			local15 += arg1.anInt2499 - arg2;
		}
		if (local15 - 64 > arg1.anInt2496 || Static123.anInt2717 == 0 || arg3 != arg1.anInt2498) {
			if (arg1.aClass1_Sub4_Sub4_2 != null) {
				Static111.aClass1_Sub4_Sub3_2.method2304(arg1.aClass1_Sub4_Sub4_2);
				arg1.aClass1_Sub4_Sub4_2 = null;
			}
			if (arg1.aClass1_Sub4_Sub4_3 != null) {
				Static111.aClass1_Sub4_Sub3_2.method2304(arg1.aClass1_Sub4_Sub4_3);
				arg1.aClass1_Sub4_Sub4_3 = null;
			}
			return;
		}
		local15 -= 64;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(141) int local141 = (arg1.anInt2496 - local15) * Static123.anInt2717 / arg1.anInt2496;
		if (arg1.aClass1_Sub4_Sub4_2 != null) {
			arg1.aClass1_Sub4_Sub4_2.method2370(local141);
		} else if (arg1.anInt2495 >= 0) {
			@Pc(162) Class91 local162 = Static238.method2725(Static128.aClass70_Sub1_69, arg1.anInt2495, 0);
			if (local162 != null) {
				@Pc(169) Class1_Sub6_Sub1 local169 = local162.method2724().method2536(Static65.aClass23_1);
				@Pc(174) Class1_Sub4_Sub4 local174 = Static237.method2392(local169, local141);
				local174.method2389(-1);
				Static111.aClass1_Sub4_Sub3_2.method2306(local174);
				arg1.aClass1_Sub4_Sub4_2 = local174;
			}
		}
		if (arg1.aClass1_Sub4_Sub4_3 != null) {
			arg1.aClass1_Sub4_Sub4_3.method2370(local141);
			if (!arg1.aClass1_Sub4_Sub4_3.method3751()) {
				arg1.aClass1_Sub4_Sub4_3 = null;
			}
		} else if (arg1.anIntArray143 != null && (arg1.anInt2489 -= arg4) <= 0) {
			@Pc(218) int local218 = (int) (Math.random() * (double) arg1.anIntArray143.length);
			@Pc(226) Class91 local226 = Static238.method2725(Static128.aClass70_Sub1_69, arg1.anIntArray143[local218], 0);
			if (local226 != null) {
				@Pc(233) Class1_Sub6_Sub1 local233 = local226.method2724().method2536(Static65.aClass23_1);
				@Pc(238) Class1_Sub4_Sub4 local238 = Static237.method2392(local233, local141);
				local238.method2389(0);
				Static111.aClass1_Sub4_Sub3_2.method2306(local238);
				arg1.aClass1_Sub4_Sub4_3 = local238;
				arg1.anInt2489 = arg1.anInt2497 + (int) (Math.random() * (double) (arg1.anInt2485 - arg1.anInt2497));
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)Lclient!k;")
	public static Class1_Sub16 method2681() {
		@Pc(8) Class1_Sub16 local8 = new Class1_Sub16(24);
		local8.method3765(2);
		local8.method3765(Static42.anInt4800);
		local8.method3765(Static45.aBoolean52 ? 1 : 0);
		local8.method3765(Static51.aBoolean60 ? 1 : 0);
		local8.method3765(Static107.aBoolean98 ? 1 : 0);
		local8.method3765(Static18.aBoolean17 ? 1 : 0);
		local8.method3765(Static6.aBoolean6 ? 1 : 0);
		local8.method3765(Static184.aBoolean185 ? 1 : 0);
		local8.method3765(Static103.aBoolean214 ? 1 : 0);
		local8.method3765(Static21.aBoolean22 ? 1 : 0);
		local8.method3765(Static16.anInt387);
		local8.method3765(Static142.aBoolean140 ? 1 : 0);
		local8.method3765(Static19.aBoolean195 ? 1 : 0);
		local8.method3765(Static68.aBoolean73 ? 1 : 0);
		local8.method3765(Static161.anInt3478);
		local8.method3765(Static18.aBoolean16 ? 1 : 0);
		local8.method3765(Static84.anInt1961);
		local8.method3765(Static155.anInt3424);
		local8.method3765(Static123.anInt2717);
		local8.method3807(Static216.anInt4593);
		local8.method3807(Static216.anInt4587);
		return local8;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!va;")
	public static RuntimeException_Sub1 method2683(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString7 = local9.aString7 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
