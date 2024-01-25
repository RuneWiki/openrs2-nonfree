import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static672 {

	@OriginalMember(owner = "client!wv", name = "z", descriptor = "I")
	public static int anInt11434;

	@OriginalMember(owner = "client!wv", name = "B", descriptor = "Z")
	public static boolean aBoolean808 = false;

	@OriginalMember(owner = "client!wv", name = "P", descriptor = "I")
	public static int anInt11445 = 0;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(BC)Z")
	public static boolean method9813(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static483.method7665(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static225.aCharArray5;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (local26 == arg0) {
					return true;
				}
			}
			@Pc(48) char[] local48 = Static602.aCharArray8;
			for (@Pc(50) int local50 = 0; local50 < local48.length; local50++) {
				@Pc(56) char local56 = local48[local50];
				if (local56 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method9817(@OriginalArg(0) Class101 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static450.aBoolean606) {
			local7 = Static106.method1934();
			local9 = Static207.method3926();
		}
		Static251.method4428(Static22.anInt384, Static304.anInt10368, arg0, Static537.anInt9380 + local7, local9 + Static297.anInt5412);
		Static253.aClass59_5.method9577(-10660793, Static205.aClass134_24.method3906(Static204.anInt8130), local7 + Static537.anInt9380 + 3, Static297.anInt5412 - -local9 - -14, -1);
		@Pc(63) int local63 = Static7.aClass6_1.method7048() + local7;
		@Pc(74) int local74 = local9 + Static7.aClass6_1.method7049();
		@Pc(78) int local78;
		@Pc(100) int local100;
		if (aBoolean808) {
			local78 = 0;
			for (@Pc(138) Class2_Sub1_Sub19 local138 = (Class2_Sub1_Sub19) Static112.aClass279_6.method7293(); local138 != null; local138 = (Class2_Sub1_Sub19) Static112.aClass279_6.method7298()) {
				local100 = local9 + Static297.anInt5412 + local78 * 16 + 31;
				if (local138.anInt9806 == 1) {
					Static429.method7035(-256, (Class2_Sub1_Sub13) local138.aClass279_13.aClass2_Sub1_54.aClass2_Sub1_67, local74, local63, local100, -1, Static22.anInt384, local7 + Static537.anInt9380, Static297.anInt5412 + local9, arg0, Static304.anInt10368);
				} else {
					Static89.method1568(arg0, local74, local100, local63, -256, local138, local7 + Static537.anInt9380, Static297.anInt5412 - -local9, Static22.anInt384, Static304.anInt10368, -1);
				}
				local78++;
			}
			if (Static214.aClass2_Sub1_Sub19_1 != null) {
				Static251.method4428(Static100.anInt1550, Static31.anInt534, arg0, Static429.anInt7876, Static659.anInt11274);
				local78 = 0;
				Static253.aClass59_5.method9577(-10660793, Static214.aClass2_Sub1_Sub19_1.aString113, Static429.anInt7876 + 3, Static659.anInt11274 + 14, -1);
				for (@Pc(236) Class2_Sub1_Sub13 local236 = (Class2_Sub1_Sub13) Static214.aClass2_Sub1_Sub19_1.aClass279_13.method7293(); local236 != null; local236 = (Class2_Sub1_Sub13) Static214.aClass2_Sub1_Sub19_1.aClass279_13.method7298()) {
					@Pc(247) int local247 = Static659.anInt11274 + local78 * 16 + 31;
					Static429.method7035(-256, local236, local74, local63, local247, -1, Static100.anInt1550, Static429.anInt7876, Static659.anInt11274, arg0, Static31.anInt534);
					local78++;
				}
				Static421.method6914(Static429.anInt7876, Static31.anInt534, Static659.anInt11274, Static100.anInt1550);
			}
		} else {
			local78 = 0;
			for (@Pc(83) Class2_Sub1_Sub13 local83 = (Class2_Sub1_Sub13) Static61.aClass271_6.method7177(); local83 != null; local83 = (Class2_Sub1_Sub13) Static61.aClass271_6.method7175()) {
				local100 = (Static276.anInt5124 - local78 - 1) * 16 + local9 + Static297.anInt5412 + 31;
				local78++;
				Static429.method7035(-256, local83, local74, local63, local100, -1, Static22.anInt384, Static537.anInt9380 + local7, Static297.anInt5412 - -local9, arg0, Static304.anInt10368);
			}
		}
		Static421.method6914(Static537.anInt9380 + local7, Static304.anInt10368, Static297.anInt5412 + local9, Static22.anInt384);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(BIII)V")
	public static void method9818(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class2_Sub1_Sub5 local17 = Static653.method9595(9, (long) arg0);
		local17.method2486();
		local17.anInt2674 = arg1;
		local17.anInt2680 = arg2;
	}
}
