import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!v", name = "w", descriptor = "J")
	public static long aLong204;

	@OriginalMember(owner = "client!v", name = "D", descriptor = "[I")
	public static final int[] anIntArray502 = new int[32];

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(I)V")
	public static void method5505() {
		try {
			if (Static230.anInt5823 == 1) {
				@Pc(16) int local16 = Static349.aClass2_Sub11_Sub1_5.method1407();
				if (local16 > 0 && Static349.aClass2_Sub11_Sub1_5.method1425()) {
					local16 -= Static92.anInt1809;
					if (local16 < 0) {
						local16 = 0;
					}
					Static349.aClass2_Sub11_Sub1_5.method1429(local16);
				} else {
					Static349.aClass2_Sub11_Sub1_5.method1411();
					Static349.aClass2_Sub11_Sub1_5.method1403();
					Static214.aClass76_1 = null;
					if (Static341.aClass104_24 == null) {
						Static230.anInt5823 = 0;
					} else {
						Static230.anInt5823 = 2;
					}
					Static133.aClass2_Sub42_2 = null;
				}
			}
		} catch (@Pc(55) Exception local55) {
			local55.printStackTrace();
			Static349.aClass2_Sub11_Sub1_5.method1411();
			Static214.aClass76_1 = null;
			Static341.aClass104_24 = null;
			Static230.anInt5823 = 0;
			Static133.aClass2_Sub42_2 = null;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!iq;)V")
	public static void method5506(@OriginalArg(1) Class104 arg0) {
		Static195.aClass104_108 = arg0;
	}
}
