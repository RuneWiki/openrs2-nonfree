import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "Lclient!tba;")
	public static final Class6_Sub45 aClass6_Sub45_1 = new Class6_Sub45(0, 0);

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZLjava/lang/String;BI)Z")
	public static boolean method5180(@OriginalArg(1) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(41) char local41 = arg0.charAt(local35);
			if (local35 == 0) {
				if (local41 == '-') {
					local26 = true;
					continue;
				}
				if (local41 == '+') {
					continue;
				}
			}
			@Pc(85) int local85;
			if (local41 >= '0' && local41 <= '9') {
				local85 = local41 - '0';
			} else if (local41 >= 'A' && local41 <= 'Z') {
				local85 = local41 - '7';
			} else if (local41 >= 'a' && local41 <= 'z') {
				local85 = local41 - 'W';
			} else {
				return false;
			}
			if (local85 >= 10) {
				return false;
			}
			if (local26) {
				local85 = -local85;
			}
			@Pc(110) int local110 = local30 * 10 + local85;
			if (local110 / 10 != local30) {
				return false;
			}
			local30 = local110;
			local28 = true;
		}
		return local28;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)[Lclient!hv;")
	public static Class137[] method5181() {
		return new Class137[] { Static53.aClass137_3, Static560.aClass137_11, Static270.aClass137_6 };
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZI)V")
	public static void method5182(@OriginalArg(1) int arg0) {
		if (Static354.method5292(arg0)) {
			Static575.method7838(-1, Static375.aClass97ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lclient!qe;I)V")
	public static void method5184(@OriginalArg(0) Class6_Sub14_Sub2 arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static480.anInt8070; local9++) {
			@Pc(15) int local15 = Static451.anIntArray617[local9];
			@Pc(19) Class29_Sub2_Sub1_Sub2 local19 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local15];
			@Pc(23) int local23 = arg0.method6041();
			if ((local23 & 0x1) != 0) {
				local23 += arg0.method6041() << 8;
			}
			if ((local23 & 0x800) != 0) {
				local23 += arg0.method6041() << 16;
			}
			Static474.method6611(local19, local15, local23, arg0);
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public static void method5185(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class97 local8 = Static50.method681(arg3, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray20 != null) {
			@Pc(18) Class6_Sub36 local18 = new Class6_Sub36();
			local18.anObjectArray34 = local8.anObjectArray20;
			local18.anInt5760 = arg0;
			local18.aClass97_7 = local8;
			local18.aString74 = arg2;
			Static100.method1639(local18);
		}
		if (Static146.anInt2581 != 10 || !Static65.method862(local8).method6473(arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static136.method2051(Static479.aClass160_126);
			Static102.method1656(arg3, arg1, local8.anInt2277);
		}
		if (arg0 == 2) {
			Static136.method2051(Static357.aClass160_81);
			Static102.method1656(arg3, arg1, local8.anInt2277);
		}
		if (arg0 == 3) {
			Static136.method2051(Static351.aClass160_80);
			Static102.method1656(arg3, arg1, local8.anInt2277);
		}
		if (arg0 == 4) {
			Static136.method2051(Static365.aClass160_84);
			Static102.method1656(arg3, arg1, local8.anInt2277);
		}
		if (arg0 == 5) {
			Static136.method2051(Static371.aClass160_87);
			Static102.method1656(arg3, arg1, local8.anInt2277);
		}
		if (arg0 == 6) {
			Static136.method2051(Static4.aClass160_3);
			Static102.method1656(arg3, arg1, local8.anInt2277);
		}
		if (arg0 == 7) {
			Static136.method2051(Static101.aClass160_31);
			Static102.method1656(arg3, arg1, local8.anInt2277);
		}
		if (arg0 == 8) {
			Static136.method2051(Static294.aClass160_66);
			Static102.method1656(arg3, arg1, local8.anInt2277);
		}
		if (arg0 == 9) {
			Static136.method2051(Static513.aClass160_113);
			Static102.method1656(arg3, arg1, local8.anInt2277);
		}
		if (arg0 == 10) {
			Static136.method2051(Static538.aClass160_117);
			Static102.method1656(arg3, arg1, local8.anInt2277);
		}
	}
}
