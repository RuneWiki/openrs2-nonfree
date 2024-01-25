import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!lt", name = "n", descriptor = "Lclient!oi;")
	public static Class185 aClass185_68;

	@OriginalMember(owner = "client!lt", name = "u", descriptor = "Lclient!dn;")
	public static Class58 aClass58_1;

	@OriginalMember(owner = "client!lt", name = "v", descriptor = "I")
	public static int anInt4399;

	@OriginalMember(owner = "client!lt", name = "w", descriptor = "Lclient!oi;")
	public static Class185 aClass185_69;

	@OriginalMember(owner = "client!lt", name = "p", descriptor = "Lclient!du;")
	public static final Class62 aClass62_29 = new Class62(14, 7);

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3498(@OriginalArg(0) String arg0) {
		Static439.method5510(arg0, "", "", 0, 0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(I[Lclient!hm;B)V")
	public static void method3500(@OriginalArg(0) int arg0, @OriginalArg(1) Class107[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(15) Class107 local15 = arg1[local7];
			if (local15 != null) {
				if (local15.anInt2598 == 0) {
					if (local15.aClass107Array2 != null) {
						method3500(arg0, local15.aClass107Array2);
					}
					@Pc(39) Class1_Sub37 local39 = (Class1_Sub37) Static462.aClass208_42.method4405((long) local15.anInt2660);
					if (local39 != null) {
						Static302.method4042(local39.anInt5481, arg0);
					}
				}
				@Pc(55) Class1_Sub11 local55;
				if (arg0 == 0 && local15.anObjectArray18 != null) {
					local55 = new Class1_Sub11();
					local55.aClass107_2 = local15;
					local55.anObjectArray2 = local15.anObjectArray18;
					Static198.method2834(local55);
				}
				if (arg0 == 1 && local15.anObjectArray15 != null) {
					if (local15.anInt2643 >= 0) {
						@Pc(78) Class107 local78 = Static55.method754(local15.anInt2660);
						if (local78 == null || local78.aClass107Array2 == null || local78.aClass107Array2.length <= local15.anInt2643 || local78.aClass107Array2[local15.anInt2643] != local15) {
							continue;
						}
					}
					local55 = new Class1_Sub11();
					local55.aClass107_2 = local15;
					local55.anObjectArray2 = local15.anObjectArray15;
					Static198.method2834(local55);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3501(@OriginalArg(1) String arg0) {
		if (Static253.aStringArray34 == null) {
			Static26.method383();
		}
		@Pc(14) String[] local14 = Static354.method4612('\n', arg0);
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			for (@Pc(20) int local20 = Static180.anInt3219; local20 > 0; local20--) {
				Static253.aStringArray34[local20] = Static253.aStringArray34[local20 - 1];
			}
			Static253.aStringArray34[0] = local14[local16];
			if (Static180.anInt3219 < Static253.aStringArray34.length - 1) {
				if (Static156.anInt2547 > 0) {
					Static156.anInt2547++;
				}
				Static180.anInt3219++;
			}
		}
	}
}
