import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "[Lclient!jd;")
	public static Class20[] aClass20Array3;

	@OriginalMember(owner = "client!ej", name = "o", descriptor = "Lclient!hu;")
	public static Class150 aClass150_3;

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray8 = new String[5];

	@OriginalMember(owner = "client!ej", name = "k", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_57 = new Class44(70, 0);

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "()V")
	public static void method2156() {
		for (@Pc(1) int local1 = Static591.anInt10109; local1 < Static613.anInt10338; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static28.anInt704; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static55.anInt1384; local7++) {
					@Pc(16) Class58 local16 = Static486.aClass58ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class12_Sub2_Sub1 local21 = local16.aClass12_Sub2_Sub1_1;
						@Pc(24) Class12_Sub2_Sub1 local24 = local16.aClass12_Sub2_Sub1_2;
						if (local21 != null && local21.method9160()) {
							Static381.method5641(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method9160()) {
								Static381.method5641(local24, local1, local4, local7, 1, 1);
								local24.method9166(false, local21, 0, 0, Static533.aClass137_41, 0);
								local24.method9158();
							}
							local21.method9158();
						}
						for (@Pc(68) Class43 local68 = local16.aClass43_4; local68 != null; local68 = local68.aClass43_3) {
							@Pc(72) Class12_Sub2_Sub2 local72 = local68.aClass12_Sub2_Sub2_1;
							if (local72 != null && local72.method9160()) {
								Static381.method5641(local72, local1, local4, local7, local72.aShort112 + 1 - local72.aShort111, local72.aShort109 - local72.aShort110 + 1);
								local72.method9158();
							}
						}
						@Pc(108) Class12_Sub2_Sub4 local108 = local16.aClass12_Sub2_Sub4_1;
						if (local108 != null && local108.method9160()) {
							Static598.method8451(local108, local1, local4, local7);
							local108.method9158();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)Z")
	public static boolean method2158(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
	public static void method2159() {
		for (@Pc(18) Class14_Sub15 local18 = (Class14_Sub15) Static205.aClass187_31.method4079(); local18 != null; local18 = (Class14_Sub15) Static205.aClass187_31.method4084()) {
			Static107.method1894(local18.anInt2174);
		}
	}
}
