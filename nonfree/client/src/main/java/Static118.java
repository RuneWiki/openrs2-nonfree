import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!gk", name = "v", descriptor = "Lclient!ja;")
	public static Class8 aClass8_3;

	@OriginalMember(owner = "client!gk", name = "z", descriptor = "I")
	public static int anInt2254;

	@OriginalMember(owner = "client!gk", name = "u", descriptor = "Lclient!us;")
	public static final Class234 aClass234_48 = new Class234(53, 7);

	@OriginalMember(owner = "client!gk", name = "w", descriptor = "Lclient!us;")
	public static final Class234 aClass234_49 = new Class234(94, 10);

	@OriginalMember(owner = "client!gk", name = "x", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_36 = new Class244(47, 6);

	@OriginalMember(owner = "client!gk", name = "y", descriptor = "Lclient!sn;")
	public static final Class215 aClass215_1 = new Class215();

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILjava/lang/String;IIIIII)V")
	public static void method1897(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class12_Sub8 local7 = new Class12_Sub8();
		local7.anInt5916 = arg3;
		local7.anInt5910 = arg0;
		local7.anInt5914 = arg2;
		local7.anInt5911 = arg5;
		local7.anInt5917 = arg4;
		local7.anInt5918 = arg6 + Static76.anInt1617;
		local7.aString56 = arg1;
		Static11.aClass22_8.method286(local7);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!np;)V")
	public static void method1899(@OriginalArg(0) Class155 arg0) {
		for (@Pc(1) int local1 = Static294.anInt5083; local1 < Static164.anInt2901; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static44.anInt791; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static103.anInt2050; local7++) {
					@Pc(16) Class48 local16 = Static69.aClass48ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class28_Sub3 local21 = local16.aClass28_Sub3_1;
						@Pc(24) Class28_Sub3 local24 = local16.aClass28_Sub3_2;
						if (local21 != null && local21.method5413()) {
							Static162.method2511(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5413()) {
								Static162.method2511(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5410(0, local21, 0, arg0, false, 0);
								local24.method5411();
							}
							local21.method5411();
						}
						for (@Pc(70) Class50 local70 = local16.aClass50_1; local70 != null; local70 = local70.aClass50_2) {
							@Pc(74) Class28_Sub1 local74 = local70.aClass28_Sub1_1;
							if (local74 != null && local74.method5413()) {
								Static162.method2511(arg0, local74, local1, local4, local7, local74.aShort88 + 1 - local74.aShort89, local74.aShort90 - local74.aShort87 + 1);
								local74.method5411();
							}
						}
						@Pc(111) Class28_Sub2 local111 = local16.aClass28_Sub2_2;
						if (local111 != null && local111.method5413()) {
							Static346.method5253(arg0, local111, local1, local4, local7);
							local111.method5411();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)Lclient!r;")
	public static Class200 method1900() {
		try {
			return (Class200) Class.forName("Class200_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
