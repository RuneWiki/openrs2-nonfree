import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
	public static int anInt2239;

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "Z")
	public static boolean aBoolean152 = false;

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
	public static int anInt2234 = 0;

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
	public static int anInt2237 = 2;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)V")
	public static void method1840() {
		@Pc(1) Class44 local1 = Static320.aClass44_43;
		synchronized (Static320.aClass44_43) {
			Static320.aClass44_43.method1352(5);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)I")
	public static int method1841(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!eq;)V")
	public static void method1842(@OriginalArg(0) Class66 arg0) {
		for (@Pc(1) int local1 = Static435.anInt7711; local1 < Static295.anInt5507; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static229.anInt4189; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static61.anInt1698; local7++) {
					@Pc(16) Class101 local16 = Static409.aClass101ArrayArrayArray3[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class3_Sub3 local21 = local16.aClass3_Sub3_2;
						@Pc(24) Class3_Sub3 local24 = local16.aClass3_Sub3_1;
						if (local21 != null && local21.method5942()) {
							Static419.method6150(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5942()) {
								Static419.method6150(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5941(0, 0, local21, 0, false, arg0);
								local24.method5938();
							}
							local21.method5938();
						}
						for (@Pc(70) Class145 local70 = local16.aClass145_1; local70 != null; local70 = local70.aClass145_2) {
							@Pc(74) Class3_Sub2 local74 = local70.aClass3_Sub2_2;
							if (local74 != null && local74.method5942()) {
								Static419.method6150(arg0, local74, local1, local4, local7, local74.aShort100 + 1 - local74.aShort101, local74.aShort99 - local74.aShort102 + 1);
								local74.method5938();
							}
						}
						@Pc(111) Class3_Sub5 local111 = local16.aClass3_Sub5_1;
						if (local111 != null && local111.method5942()) {
							Static368.method4867(arg0, local111, local1, local4, local7);
							local111.method5938();
						}
					}
				}
			}
		}
	}
}
