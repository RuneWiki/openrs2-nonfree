import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static602 {

	@OriginalMember(owner = "client!ufa", name = "c", descriptor = "I")
	public static int anInt9668;

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "I")
	public static int anInt9666 = 503;

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)I")
	public static int method8444() {
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		if (Static247.aClass291_1.aBoolean619 && !Static247.aClass291_1.aBoolean618) {
			local13 = true;
			if (Static241.aClass3_Sub10_1.anInt1059 < 512 && Static241.aClass3_Sub10_1.anInt1059 != 0) {
				local13 = false;
			}
			if (Static497.aString91.startsWith("win")) {
				local15 = true;
				local17 = true;
			} else {
				local15 = true;
			}
		}
		if (Static654.aBoolean797) {
			local17 = false;
		}
		if (Static284.aBoolean361) {
			local13 = false;
		}
		if (Static498.aBoolean768) {
			local15 = false;
		}
		if (!local13 && !local15 && !local17) {
			return Static87.method1656();
		}
		@Pc(69) int local69 = -1;
		@Pc(71) int local71 = -1;
		@Pc(73) int local73 = -1;
		if (local13) {
			try {
				local69 = Static77.method1435(1000, 2);
			} catch (@Pc(82) Exception local82) {
			}
		}
		if (local17) {
			try {
				local73 = Static77.method1435(1000, 3);
				if (Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970() == 3) {
					@Pc(101) Class61 local101 = Static674.aClass13_22.method8522();
					@Pc(106) long local106 = local101.aLong44 & 0xFFFFFFFFFFFFL;
					@Pc(109) int local109 = local101.anInt1399;
					if (local109 == 4318) {
						local15 &= local106 >= 64425238954L;
					} else if (local109 == 4098) {
						local15 &= local106 >= 60129613779L;
					}
				}
			} catch (@Pc(149) Exception local149) {
			}
		}
		if (local15) {
			try {
				local71 = Static77.method1435(1000, 1);
			} catch (@Pc(159) Exception local159) {
			}
		}
		if (local69 == -1 && local71 == -1 && local73 == -1) {
			return Static87.method1656();
		}
		local71 = (int) ((float) local71 * 1.1F);
		local73 = (int) ((float) local73 * 1.1F);
		if (local69 > local73 && local69 > local71) {
			return Static356.method5250(local69);
		} else if (local71 >= local73) {
			return Static130.method2439(1, local71);
		} else {
			return Static130.method2439(3, local73);
		}
	}
}
