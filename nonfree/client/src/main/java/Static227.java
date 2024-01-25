import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "Lclient!nq;")
	public static Class144 aClass144_75;

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "Z")
	public static volatile boolean aBoolean307 = true;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)Z")
	public static boolean method4031(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static38.aBoolean40) {
			return false;
		}
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static188.aClass137ArrayArray1[local13] == null || Static188.aClass137ArrayArray1[local13][local17] == null) {
			return false;
		}
		@Pc(35) Class137 local35 = Static188.aClass137ArrayArray1[local13][local17];
		@Pc(46) Class11_Sub14 local46;
		if (arg1 == -1 && local35.anInt4067 == 0) {
			for (local46 = (Class11_Sub14) Static119.aClass16_21.method193(); local46 != null; local46 = (Class11_Sub14) Static119.aClass16_21.method188()) {
				if (local46.anInt1765 == 6 || local46.anInt1765 == 1002 || local46.anInt1765 == 9 || local46.anInt1765 == 47 || local46.anInt1765 == 2) {
					for (@Pc(83) Class137 local83 = Static166.method2688(local46.anInt1763); local83 != null; local83 = Static34.method509(local83)) {
						if (local35.anInt4044 == local83.anInt4044) {
							return true;
						}
					}
				}
			}
		} else {
			for (local46 = (Class11_Sub14) Static119.aClass16_21.method193(); local46 != null; local46 = (Class11_Sub14) Static119.aClass16_21.method188()) {
				if (arg1 == local46.anInt1764 && local46.anInt1763 == local35.anInt4044 && (local46.anInt1765 == 6 || local46.anInt1765 == 1002 || local46.anInt1765 == 9 || local46.anInt1765 == 47 || local46.anInt1765 == 2)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!uo;B)V")
	public static void method4032(@OriginalArg(0) Class129 arg0) {
		if (Static13.anInt245 < 2 && !Static103.aBoolean118 || Static45.aClass137_4 != null) {
			return;
		}
		@Pc(48) String local48;
		if (Static103.aBoolean118 && Static13.anInt245 < 2) {
			local48 = Static110.aString39 + Static220.aClass117_78.method2684(Static230.anInt4634) + Static63.aString10 + " ->";
		} else if (Static204.aBoolean280 && Static278.aClass143_20.method4857(81) && Static13.anInt245 > 2) {
			local48 = Static278.method5396((Class11_Sub14) Static119.aClass16_21.aClass11_9.aClass11_252.aClass11_252);
		} else {
			@Pc(55) Class11_Sub14 local55 = (Class11_Sub14) Static119.aClass16_21.aClass11_9.aClass11_252;
			local48 = Static278.method5396(local55);
			@Pc(61) int[] local61 = null;
			if (Static264.method4577(local55.anInt1765)) {
				local61 = Static283.method4717((int) local55.aLong67).anIntArray403;
			} else if (Static59.method900(local55.anInt1765)) {
				@Pc(85) Class67_Sub3_Sub3_Sub1 local85 = Static356.aClass67_Sub3_Sub3_Sub1Array1[(int) local55.aLong67];
				if (local85 != null) {
					local61 = local85.aClass82_1.anIntArray135;
				}
			} else if (Static53.method798(local55.anInt1765)) {
				if (local55.anInt1765 == 1003) {
					local61 = Static108.method1650((int) local55.aLong67).anIntArray145;
				} else {
					local61 = Static108.method1650((int) (local55.aLong67 >>> 32 & 0x7FFFFFFFL)).anIntArray145;
				}
			}
			if (local61 != null) {
				local48 = local48 + Static174.method2823(local61);
			}
		}
		if (Static13.anInt245 > 2) {
			local48 = local48 + "<col=ffffff> / " + (Static13.anInt245 - 2) + Static327.aClass117_109.method2684(Static230.anInt4634);
		}
		if (Static237.aClass137_13 != null) {
			@Pc(219) Class9 local219 = Static237.aClass137_13.method3606(arg0);
			if (local219 == null) {
				local219 = Static106.aClass9_2;
			}
			local219.method3577(Static237.aClass137_13.anInt4046, Static118.aRandom1, Static237.aClass137_13.anInt4048, local48, Static193.anInt3961, Static263.anInt5386, Static237.aClass137_13.anInt4092, Static237.aClass137_13.anInt4110, Static237.aClass137_13.anInt4060, Static209.aClass97Array16, Static229.anIntArray350, Static48.anIntArray66, Static237.aClass137_13.anInt4052, Static74.anInt1412);
			Static168.method2724(Static48.anIntArray66[3], Static48.anIntArray66[1], Static48.anIntArray66[0], Static48.anIntArray66[2]);
		} else if (Static99.aClass137_2 != null && Static68.anInt1264 == 0) {
			@Pc(199) int local199 = Static106.aClass9_2.method3578(Static74.anInt1412, Static209.aClass97Array16, Static229.anIntArray350, Static162.anInt3053 + 4, Static97.anInt1767 + 16, Static118.aRandom1, local48);
			Static168.method2724(16, Static97.anInt1767, Static162.anInt3053 + 4, Static102.aClass114_3.method2472(local48) - -local199);
			return;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
	public static void method4035() {
		if (Static278.anInt6305 != 2) {
			try {
				Static360.method555("tbrefresh", Static210.aClient1);
			} catch (@Pc(14) Throwable local14) {
			}
		}
	}
}
