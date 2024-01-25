import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_88 = new Class225(44, 6);

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_89 = new Class225(128, 2);

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_72 = new Class349(19, 11);

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_73 = new Class349(76, 2);

	@OriginalMember(owner = "client!jg", name = "v", descriptor = "Lclient!ra;")
	public static final Class317 aClass317_5 = new Class317();

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V")
	public static void method4163(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5) {
		Static660.method9034(-1, (String) null, arg2, arg4, arg3, arg1, arg5, arg0);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BILclient!sj;)V")
	public static void method4165(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub2_Sub1_Sub2 arg1) {
		if (arg1.anIntArray179 == null) {
			return;
		}
		@Pc(9) int local9 = arg1.anIntArray179[arg0 + 1];
		if (local9 != arg1.aClass53_7.method4088()) {
			arg1.aClass53_7.method4093(local9, arg1.aClass53_7.method4080());
			arg1.anInt2370 = arg1.anInt2371;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIILclient!jr;IB)V")
	public static void method4166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class202 arg3, @OriginalArg(4) int arg4) {
		if (arg0 < 1 || arg4 < 1 || Static426.anInt6942 - 2 < arg0 || arg4 > Static280.anInt6752 - 2) {
			return;
		}
		if (Static632.aClass311ArrayArrayArray3 == null) {
			return;
		}
		@Pc(49) Interface25 local49 = Static717.aClass199_Sub1_2.method4275(arg1, arg0, arg4, arg2);
		if (local49 == null) {
			return;
		}
		if (local49 instanceof Class4_Sub2_Sub1_Sub5) {
			((Class4_Sub2_Sub1_Sub5) local49).method8997(arg3);
		} else if (local49 instanceof Class4_Sub2_Sub2_Sub2) {
			((Class4_Sub2_Sub2_Sub2) local49).method5943(arg3);
		} else if (local49 instanceof Class4_Sub2_Sub3_Sub2) {
			((Class4_Sub2_Sub3_Sub2) local49).method7941(arg3);
		} else if (local49 instanceof Class4_Sub2_Sub4_Sub1) {
			((Class4_Sub2_Sub4_Sub1) local49).method2599(arg3);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BILjava/lang/String;)Z")
	public static boolean method4170(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (Static135.aClass389_2.aBoolean913) {
			Static548.aClass176_3 = new Class176();
			Static548.aClass176_3.aString48 = arg1;
			Static548.aClass176_3.anInt4157 = arg0;
			if (Static661.aClass386_10 != Static229.aClass386_6) {
				Static548.aClass176_3.anInt4161 = Static548.aClass176_3.anInt4157 + 50000;
				Static548.aClass176_3.anInt4154 = Static548.aClass176_3.anInt4157 + 40000;
			}
			for (@Pc(39) int local39 = 0; local39 < Static313.aClass88_Sub1Array2.length; local39++) {
				if (arg0 == Static313.aClass88_Sub1Array2[local39].anInt2151) {
					Static29.anInt417 = Static313.aClass88_Sub1Array2[local39].anInt2140;
				}
			}
			return true;
		}
		@Pc(77) String local77 = "";
		if (Static661.aClass386_10 != Static229.aClass386_6) {
			local77 = ":" + (arg0 + 7000);
		}
		@Pc(92) String local92 = "";
		if (Static601.aString103 != null) {
			local92 = "/p=" + Static601.aString103;
		}
		@Pc(156) String local156 = "http://" + arg1 + local77 + "/l=" + Static414.anInt9485 + "/a=" + Static175.anInt10800 + local92 + "/j" + (Static396.aBoolean553 ? "1" : "0") + ",o" + (Static251.aBoolean349 ? "1" : "0") + ",a2";
		try {
			Static255.aClient1.getAppletContext().showDocument(new URL(local156), "_self");
			return true;
		} catch (@Pc(168) Exception local168) {
			return false;
		}
	}
}
