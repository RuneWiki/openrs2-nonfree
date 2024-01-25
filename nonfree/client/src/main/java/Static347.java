import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!vo", name = "s", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_220 = new Class221(66, 0);

	@OriginalMember(owner = "client!vo", name = "z", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_221 = new Class221(34, -1);

	@OriginalMember(owner = "client!vo", name = "E", descriptor = "Z")
	public static boolean aBoolean602 = false;

	@OriginalMember(owner = "client!vo", name = "F", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_158 = new Class140("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!vo", name = "G", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_216 = new Class157(67, 8);

	@OriginalMember(owner = "client!vo", name = "H", descriptor = "I")
	public static int anInt6748 = 0;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZI)V")
	public static void method5636(@OriginalArg(0) boolean arg0) {
		Static66.anInt1170 = 0;
		Static159.anInt2743 = 0;
		Static268.method4687();
		Static317.method5263(arg0);
		Static118.method2305();
		@Pc(28) int local28;
		for (@Pc(22) int local22 = 0; local22 < Static66.anInt1170; local22++) {
			local28 = Static142.anIntArray246[local22];
			if (Static6.anInt91 != Static95.aClass1_Sub2_Sub3_Sub2Array1[local28].anInt6932) {
				if (Static95.aClass1_Sub2_Sub3_Sub2Array1[local28].aClass139_1.method4126()) {
					Static282.method4799(Static95.aClass1_Sub2_Sub3_Sub2Array1[local28]);
				}
				Static95.aClass1_Sub2_Sub3_Sub2Array1[local28].method5790(null);
				Static95.aClass1_Sub2_Sub3_Sub2Array1[local28] = null;
			}
		}
		if (Static273.aClass2_Sub12_Sub2_3.anInt3606 != Static275.anInt5636) {
			throw new RuntimeException("gnp1 pos:" + Static273.aClass2_Sub12_Sub2_3.anInt3606 + " psize:" + Static275.anInt5636);
		}
		for (local28 = 0; local28 < Static186.anInt4092; local28++) {
			if (Static95.aClass1_Sub2_Sub3_Sub2Array1[Static171.anIntArray292[local28]] == null) {
				throw new RuntimeException("gnp2 pos:" + local28 + " size:" + Static186.anInt4092);
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZLjava/lang/String;II)Z")
	public static boolean method5639(@OriginalArg(1) String arg0) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg0.length();
		for (@Pc(38) int local38 = 0; local38 < local31; local38++) {
			@Pc(44) char local44 = arg0.charAt(local38);
			if (local38 == 0) {
				if (local44 == '-') {
					local24 = true;
					continue;
				}
				if (local44 == '+') {
					continue;
				}
			}
			@Pc(67) int local67;
			if (local44 >= '0' && local44 <= '9') {
				local67 = local44 - '0';
			} else if (local44 >= 'A' && local44 <= 'Z') {
				local67 = local44 - '7';
			} else if (local44 >= 'a' && local44 <= 'z') {
				local67 = local44 - 'W';
			} else {
				return false;
			}
			if (local67 >= 10) {
				return false;
			}
			if (local24) {
				local67 = -local67;
			}
			@Pc(113) int local113 = local67 + local28 * 10;
			if (local113 / 10 != local28) {
				return false;
			}
			local26 = true;
			local28 = local113;
		}
		return local26;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!fh;III)V")
	public static void method5640(@OriginalArg(0) Class68 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class124 local8 = arg0.method1871(Static51.aClass37_1);
		if (local8 == null) {
			return;
		}
		Static51.aClass37_1.method3677(arg1, arg2, arg1 + arg0.anInt1874, arg2 - -arg0.anInt1845);
		if (Static222.anInt6838 >= 3) {
			Static51.aClass37_1.method3731(local8, arg1, arg2);
		} else {
			Static26.aClass46_11.method5032((float) arg1 + (float) arg0.anInt1874 / 2.0F, (float) arg0.anInt1845 / 2.0F + (float) arg2, ((int) -Static366.aFloat48 & 0x3FFF) << 2, local8, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!dr;II)V")
	public static void method5643(@OriginalArg(0) int arg0, @OriginalArg(1) Class37 arg1, @OriginalArg(3) int arg2) {
		Static68.aClass191ArrayArray1 = new Class191[arg2][arg0];
		Static79.aClass37_2 = arg1;
		if (Static86.anIntArray129 != null) {
			Static128.aClass3_2 = method5646(Static86.anIntArray129[5], Static86.anIntArray129[2], Static86.anIntArray129[1], Static86.anIntArray129[0], Static86.anIntArray129[4], Static86.anIntArray129[3]);
		}
		Static84.aClass191_2 = new Class191();
		Static53.method1174();
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIBIIII)Lclient!tc;")
	public static Class3 method5646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg0 * 76724863L ^ (long) arg4 * 32147369L ^ (long) arg5 * 986053L ^ (long) arg2 * 97549L ^ (long) arg3 * 67481L ^ (long) arg1 * 475427L;
		@Pc(39) Class3 local39 = (Class3) Static248.aClass107_30.method3021(local33);
		if (local39 == null) {
			local39 = Static79.aClass37_2.method3671(arg3, arg2, arg1, arg5, arg4, arg0);
			Static248.aClass107_30.method3018(local33, local39);
			return local39;
		} else {
			return local39;
		}
	}
}
