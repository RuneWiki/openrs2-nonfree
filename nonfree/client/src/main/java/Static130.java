import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!dv", name = "o", descriptor = "Lclient!gla;")
	public static Class141 aClass141_1;

	@OriginalMember(owner = "client!dv", name = "q", descriptor = "Lclient!paa;")
	public static Class2_Sub23_Sub3 aClass2_Sub23_Sub3_1;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lclient!bi;IZ)V")
	public static void method1892(@OriginalArg(0) Class4_Sub2_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		if (Static535.anInt8486 >= 400) {
			return;
		}
		if (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2 != arg0) {
			@Pc(192) String local192;
			if (arg0.anInt826 == 0) {
				@Pc(78) boolean local78 = true;
				if (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt846 != -1 && arg0.anInt846 != -1) {
					@Pc(104) int local104 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt846 < arg0.anInt846 ? Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt846 : arg0.anInt846;
					@Pc(111) int local111 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt851 - arg0.anInt851;
					if (local111 < 0) {
						local111 = -local111;
					}
					if (local111 > local104) {
						local78 = false;
					}
				}
				@Pc(142) String local142 = Static174.aClass150_3 == Static249.aClass150_6 ? Class191.lb.method4067(Static414.anInt9485) : Static289.aClass191_28.method4067(Static414.anInt9485);
				if (arg0.anInt851 < arg0.anInt824) {
					local192 = arg0.method738() + (local78 ? Static575.method7991(Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt851, arg0.anInt851) : "<col=ffffff>") + " (" + local142 + arg0.anInt851 + "+" + (arg0.anInt824 - arg0.anInt851) + ")";
				} else {
					local192 = arg0.method738() + (local78 ? Static575.method7991(Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt851, arg0.anInt851) : "<col=ffffff>") + " (" + local142 + arg0.anInt851 + ")";
				}
			} else if (arg0.anInt826 == -1) {
				local192 = arg0.method738();
			} else {
				local192 = arg0.method738() + " (" + Static289.aClass191_29.method4067(Static414.anInt9485) + arg0.anInt826 + ")";
			}
			if (Static581.aBoolean787 && !arg1 && (Static523.anInt6605 & 0x8) != 0) {
				Static27.method371(Static96.anInt1729, (long) arg0.anInt2320, true, -1, Static175.aString127, false, 22, false, Static701.aString94 + " -> <col=ffffff>" + local192, (long) arg0.anInt2320, 0, 0);
			}
			if (arg1) {
				Static27.method371(-1, (long) arg0.anInt2320, false, 0, "<col=cccccc>" + local192, false, -1, true, "", 0L, 0, 0);
			} else {
				for (@Pc(321) int local321 = 7; local321 >= 0; local321--) {
					if (Static530.aStringArray38[local321] != null) {
						@Pc(331) short local331 = 0;
						if (Static249.aClass150_6 == Static395.aClass150_8 && Static530.aStringArray38[local321].equalsIgnoreCase(Static289.aClass191_23.method4067(Static414.anInt9485))) {
							if (Static709.aBoolean930 && Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt851 < arg0.anInt851) {
								local331 = 2000;
							}
							if (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt840 == 0 || arg0.anInt840 == 0) {
								if (arg0.aBoolean99) {
									local331 = 2000;
								}
							} else if (arg0.anInt840 == Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt840) {
								local331 = 2000;
							} else {
								local331 = 0;
							}
						} else if (Static327.aBooleanArray38[local321]) {
							local331 = 2000;
						}
						@Pc(408) short local408 = (short) (local331 + Static126.aShortArray36[local321]);
						@Pc(421) int local421 = Static512.anIntArray586[local321] == -1 ? Static576.anInt9090 : Static512.anIntArray586[local321];
						Static27.method371(local421, (long) arg0.anInt2320, true, -1, Static530.aStringArray38[local321], false, local408, false, "<col=ffffff>" + local192, (long) arg0.anInt2320, 0, 0);
					}
				}
			}
			if (!arg1) {
				for (@Pc(495) Class2_Sub6_Sub20 local495 = (Class2_Sub6_Sub20) Static273.aClass60_88.method1226(7); local495 != null; local495 = (Class2_Sub6_Sub20) Static273.aClass60_88.method1228()) {
					if (local495.anInt9603 == 6) {
						local495.aString108 = "<col=ffffff>" + local192;
						return;
					}
				}
			}
		} else if (Static581.aBoolean787 && (Static523.anInt6605 & 0x10) != 0) {
			Static27.method371(Static96.anInt1729, (long) arg0.anInt2320, true, -1, Static175.aString127, false, 60, false, Static701.aString94 + " -> <col=ffffff>" + Static289.aClass191_36.method4067(Static414.anInt9485), 0L, 0, 0);
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIII)V")
	public static void method1893(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class2_Sub6_Sub12 local14 = Static636.method8647(18, (long) arg3 << 32 | (long) arg2);
		local14.method6239();
		local14.anInt6938 = arg1;
		local14.anInt6936 = arg0;
	}
}
