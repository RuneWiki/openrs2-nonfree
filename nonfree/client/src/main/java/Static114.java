import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Lclient!jd;")
	public static Class84 aClass84_27;

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
	public static int anInt1359;

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "[I")
	public static int[] anIntArray103 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public static void method1189() {
		if (Static162.anInt3417 == 0) {
			return;
		}
		try {
			if (++Static243.anInt3781 > 1500) {
				if (Static42.aClass45_1 != null) {
					Static42.aClass45_1.method1045();
					Static42.aClass45_1 = null;
				}
				if (Static263.anInt5392 >= 1) {
					Static231.anInt4770 = -5;
					Static162.anInt3417 = 0;
					return;
				}
				Static263.anInt5392++;
				Static243.anInt3781 = 0;
				Static162.anInt3417 = 1;
				if (Static251.anInt5003 == Static26.anInt553) {
					Static26.anInt553 = Static106.anInt2314;
				} else {
					Static26.anInt553 = Static251.anInt5003;
				}
			}
			if (Static162.anInt3417 == 1) {
				Static23.aClass28_1 = Static299.aClass177_5.method4686(Static26.anInt553, Static141.aString142);
				Static162.anInt3417 = 2;
			}
			@Pc(133) int local133;
			if (Static162.anInt3417 == 2) {
				if (Static23.aClass28_1.anInt726 == 2) {
					throw new IOException();
				}
				if (Static23.aClass28_1.anInt726 != 1) {
					return;
				}
				Static42.aClass45_1 = new Class45((Socket) Static23.aClass28_1.anObject2, Static299.aClass177_5);
				Static23.aClass28_1 = null;
				Static42.aClass45_1.method1043(Static95.aClass2_Sub26_Sub1_1.anInt5328, Static95.aClass2_Sub26_Sub1_1.aByteArray72);
				if (Static107.aClass3_2 != null) {
					Static107.aClass3_2.method2229();
				}
				if (Static68.aClass3_1 != null) {
					Static68.aClass3_1.method2229();
				}
				local133 = Static42.aClass45_1.method1047();
				if (Static107.aClass3_2 != null) {
					Static107.aClass3_2.method2229();
				}
				if (Static68.aClass3_1 != null) {
					Static68.aClass3_1.method2229();
				}
				if (local133 != 101) {
					Static162.anInt3417 = 0;
					Static231.anInt4770 = local133;
					Static42.aClass45_1.method1045();
					Static42.aClass45_1 = null;
					return;
				}
				Static162.anInt3417 = 3;
			}
			if (Static162.anInt3417 == 3) {
				if (Static42.aClass45_1.method1040() >= 2) {
					local133 = Static42.aClass45_1.method1047() << 8 | Static42.aClass45_1.method1047();
					Static47.method973(local133);
					if (Static186.anInt3934 != -1) {
						Static162.anInt3417 = 0;
						Static42.aClass45_1.method1045();
						Static42.aClass45_1 = null;
						Static287.method4763();
						return;
					}
					Static231.anInt4770 = 6;
					Static162.anInt3417 = 0;
					Static42.aClass45_1.method1045();
					Static42.aClass45_1 = null;
					return;
				}
				return;
			}
		} catch (@Pc(218) IOException local218) {
			if (Static42.aClass45_1 != null) {
				Static42.aClass45_1.method1045();
				Static42.aClass45_1 = null;
			}
			if (Static263.anInt5392 >= 1) {
				Static231.anInt4770 = -4;
				Static162.anInt3417 = 0;
			} else {
				Static162.anInt3417 = 1;
				Static263.anInt5392++;
				Static243.anInt3781 = 0;
				if (Static26.anInt553 == Static251.anInt5003) {
					Static26.anInt553 = Static106.anInt2314;
				} else {
					Static26.anInt553 = Static251.anInt5003;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 >= Static68.anInt1509 && Static43.anInt1054 >= arg1 && arg6 >= Static68.anInt1509 && arg6 <= Static43.anInt1054 && Static68.anInt1509 <= arg2 && arg2 <= Static43.anInt1054 && arg7 >= Static68.anInt1509 && Static43.anInt1054 >= arg7 && arg5 >= Static127.anInt2664 && Static290.anInt6021 >= arg5 && Static127.anInt2664 <= arg4 && Static290.anInt6021 >= arg4 && arg8 >= Static127.anInt2664 && arg8 <= Static290.anInt6021 && Static127.anInt2664 <= arg3 && arg3 <= Static290.anInt6021) {
			Static32.method640(arg1, arg7, arg0, arg2, arg8, arg3, arg6, arg5, arg4);
		} else {
			Static120.method2208(arg8, arg5, arg6, arg4, arg7, arg2, arg1, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([BI)Lclient!nk;")
	public static Class2_Sub3_Sub5 method1193(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(26) Class2_Sub3_Sub5 local26;
		if (Static60.aBoolean106) {
			local26 = new Class2_Sub3_Sub5_Sub2(arg0, Static262.anIntArray528, Static40.anIntArray59, Static30.anIntArray46, Static19.anIntArray30, Static273.aByteArrayArray115);
		} else {
			local26 = new Class2_Sub3_Sub5_Sub1(arg0, Static262.anIntArray528, Static40.anIntArray59, Static30.anIntArray46, Static19.anIntArray30, Static273.aByteArrayArray115);
		}
		Static171.method2953();
		return local26;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!wm;B)Lclient!vh;")
	public static Class74_Sub3 method1197(@OriginalArg(0) Class2_Sub26 arg0) {
		return new Class74_Sub3(arg0.method4255(), arg0.method4255(), arg0.method4255(), arg0.method4255(), arg0.method4255(), arg0.method4255(), arg0.method4255(), arg0.method4255(), arg0.method4245(), arg0.method4261());
	}
}
