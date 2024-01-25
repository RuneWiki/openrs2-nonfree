import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
	public static int anInt10753;

	@OriginalMember(owner = "client!jr", name = "k", descriptor = "Lclient!la;")
	public static Class208 aClass208_148;

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "Lclient!ika;")
	public static Class176 aClass176_11;

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString139 = "";

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIII)I")
	public static int method9259(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "([J[Ljava/lang/Object;B)V")
	public static void method9261(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1) {
		Static407.method6013(arg1, 0, arg0.length - 1, arg0);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BI)V")
	public static void method9262(@OriginalArg(1) int arg0) {
		@Pc(18) Class5_Sub5_Sub6 local18 = Static478.method6972((long) arg0, 6);
		local18.method2686();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
	public static void method9265() {
		@Pc(20) Class5_Sub50 local20 = Static457.method6722(Static224.aClass387_42, Static80.aClass313_1);
		local20.aClass5_Sub23_Sub2_2.method8502(Static341.method5176());
		local20.aClass5_Sub23_Sub2_2.method8480(Static70.anInt1125);
		local20.aClass5_Sub23_Sub2_2.method8480(Static631.anInt10283);
		local20.aClass5_Sub23_Sub2_2.method8502(Static637.aClass5_Sub20_31.aClass24_Sub11_1.method3217());
		Static494.method7120(local20);
	}
}
