import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!es", name = "i", descriptor = "Z")
	public static boolean aBoolean200;

	@OriginalMember(owner = "client!es", name = "q", descriptor = "[Lclient!cw;")
	public static Class61[] aClass61Array4;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "J")
	public static volatile long aLong72 = 0L;

	@OriginalMember(owner = "client!es", name = "d", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_34 = new Class179(35, 11);

	@OriginalMember(owner = "client!es", name = "g", descriptor = "[I")
	public static final int[] anIntArray169 = new int[3];

	@OriginalMember(owner = "client!es", name = "r", descriptor = "I")
	public static int anInt2578 = 0;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIIIIZIIF)[[I")
	public static int[][] method2128(@OriginalArg(8) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class2_Sub6_Sub27 local13 = new Class2_Sub6_Sub27();
		local13.anInt8034 = 4;
		local13.anInt8025 = (int) (arg0 * 4096.0F);
		local13.aBoolean601 = false;
		local13.anInt8023 = 4;
		local13.anInt8031 = 3;
		local13.method8462();
		Static110.method1644(64, 256);
		for (@Pc(42) int local42 = 0; local42 < 256; local42++) {
			local13.method6811(local42, local9[local42]);
		}
		return local9;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V")
	public static void method2129() {
		if (Static365.aClass323Array1 == null) {
			Static365.aClass323Array1 = Static528.method7293();
			Static111.aClass323_1 = Static365.aClass323Array1[0];
			Static117.aLong64 = Static476.method6413();
		}
		if (Static77.aClass252_2 == null) {
			Static250.method3435();
		}
		@Pc(27) Class323 local27 = Static111.aClass323_1;
		@Pc(30) int local30 = Static125.method1794();
		if (Static111.aClass323_1 == local27) {
			Static509.aString99 = Static111.aClass323_1.aClass271_63.method5972(Static483.anInt7694);
			if (Static111.aClass323_1.aBoolean653) {
				Static389.anInt6121 = local30 * (Static111.aClass323_1.anInt8660 - Static111.aClass323_1.anInt8662) / 100 + Static111.aClass323_1.anInt8662;
			}
			if (Static111.aClass323_1.aBoolean652) {
				Static509.aString99 = Static509.aString99 + Static389.anInt6121 + "%";
			}
		} else if (Static528.aClass323_23 == Static111.aClass323_1) {
			Static77.aClass252_2 = null;
			Static158.method2370(3);
		} else {
			Static509.aString99 = local27.aClass271_64.method5972(Static483.anInt7694);
			if (Static111.aClass323_1.aBoolean652) {
				Static509.aString99 = Static509.aString99 + local27.anInt8660 + "%";
			}
			Static389.anInt6121 = local27.anInt8660;
			if (Static111.aClass323_1.aBoolean653 || local27.aBoolean653) {
				Static117.aLong64 = Static476.method6413();
			}
		}
		if (Static77.aClass252_2 == null) {
			return;
		}
		Static77.aClass252_2.method5486(Static389.anInt6121, Static111.aClass323_1, Static509.aString99, Static117.aLong64);
		if (Static122.anInterface8Array1 == null) {
			return;
		}
		for (@Pc(130) int local130 = Static415.anInt6470 + 1; local130 < Static122.anInterface8Array1.length; local130++) {
			if (Static122.anInterface8Array1[local130].method8057() >= 100 && local130 - 1 == Static415.anInt6470 && Static324.anInt5145 >= 1 && Static77.aClass252_2.method5477()) {
				try {
					Static122.anInterface8Array1[local130].method8060();
				} catch (@Pc(164) Exception local164) {
					Static122.anInterface8Array1 = null;
					return;
				}
				Static77.aClass252_2.method5487(Static122.anInterface8Array1[local130]);
				Static415.anInt6470++;
				if (Static122.anInterface8Array1.length - 1 <= Static415.anInt6470 && Static122.anInterface8Array1.length > 1) {
					Static415.anInt6470 = Class2_Sub5.lb.method2517() ? 0 : -1;
				}
			}
		}
		return;
	}
}
