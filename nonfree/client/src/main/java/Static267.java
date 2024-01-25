import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!r", name = "o", descriptor = "I")
	public static int anInt4963;

	@OriginalMember(owner = "client!r", name = "d", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_84 = new Class70(64);

	@OriginalMember(owner = "client!r", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString211 = "Drop";

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ja;)V")
	public static void method4531(@OriginalArg(0) Class81 arg0) {
		for (@Pc(1) int local1 = Static157.anInt2943; local1 < Static131.anInt2392; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static310.anInt5828; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static163.anInt3084; local7++) {
					@Pc(16) Class187 local16 = Static39.aClass187ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class44_Sub5 local21 = local16.aClass44_Sub5_1;
						@Pc(24) Class44_Sub5 local24 = local16.aClass44_Sub5_2;
						if (local21 != null && local21.method5783()) {
							Static151.method3072(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5783()) {
								Static151.method3072(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5780(0, false, 0, 0, local21, arg0);
								local24.method5777();
							}
							local21.method5777();
						}
						for (@Pc(70) Class214 local70 = local16.aClass214_19; local70 != null; local70 = local70.aClass214_21) {
							@Pc(74) Class44_Sub4 local74 = local70.aClass44_Sub4_1;
							if (local74 != null && local74.method5783()) {
								Static151.method3072(arg0, local74, local1, local4, local7, local74.aShort87 + 1 - local74.aShort90, local74.aShort88 - local74.aShort89 + 1);
								local74.method5777();
							}
						}
						@Pc(111) Class44_Sub3 local111 = local16.aClass44_Sub3_1;
						if (local111 != null && local111.method5783()) {
							Static131.method2544(arg0, local111, local1, local4, local7);
							local111.method5777();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIB)I")
	public static int method4534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static344.anIntArray710[arg1 & 0x3] : Static116.anIntArray290[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)Lclient!ln;")
	public static Class127 method4536() {
		try {
			return (Class127) Class.forName("Class127_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
