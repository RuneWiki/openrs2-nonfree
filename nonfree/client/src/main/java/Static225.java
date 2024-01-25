import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "[Z")
	public static boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "Lclient!ra;")
	public static Class170 aClass170_78;

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "[Lclient!sf;")
	public static Class183[] aClass183Array1;

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "[Lclient!kh;")
	public static Class54[] aClass54Array17;

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "Lclient!gp;")
	public static Class75 aClass75_7;

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
	public static int anInt4428 = 0;

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "Z")
	public static final boolean aBoolean327 = false;

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "Z")
	public static boolean aBoolean328 = false;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
	public static void method3900() {
		Static6.aClass5_Sub1_Sub1_1.method178();
		@Pc(13) int local13 = Static6.aClass5_Sub1_Sub1_1.method182(8);
		if (Static63.anInt1486 > local13) {
			for (@Pc(18) int local18 = local13; local18 < Static63.anInt1486; local18++) {
				Static269.anIntArray394[Static205.anInt3959++] = Static331.anIntArray535[local18];
			}
		}
		if (Static63.anInt1486 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static63.anInt1486 = 0;
		for (@Pc(54) int local54 = 0; local54 < local13; local54++) {
			@Pc(60) int local60 = Static331.anIntArray535[local54];
			@Pc(64) Class25_Sub1_Sub1_Sub2 local64 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local60];
			@Pc(69) int local69 = Static6.aClass5_Sub1_Sub1_1.method182(1);
			if (local69 == 0) {
				Static331.anIntArray535[Static63.anInt1486++] = local60;
				local64.anInt5320 = Static180.anInt3606;
			} else {
				@Pc(89) int local89 = Static6.aClass5_Sub1_Sub1_1.method182(2);
				if (local89 == 0) {
					Static331.anIntArray535[Static63.anInt1486++] = local60;
					local64.anInt5320 = Static180.anInt3606;
					Static178.anIntArray266[Static47.anInt1211++] = local60;
				} else {
					@Pc(134) int local134;
					@Pc(144) int local144;
					if (local89 == 1) {
						Static331.anIntArray535[Static63.anInt1486++] = local60;
						local64.anInt5320 = Static180.anInt3606;
						local134 = Static6.aClass5_Sub1_Sub1_1.method182(3);
						local64.method4656(1, local134);
						local144 = Static6.aClass5_Sub1_Sub1_1.method182(1);
						if (local144 == 1) {
							Static178.anIntArray266[Static47.anInt1211++] = local60;
						}
					} else if (local89 == 2) {
						Static331.anIntArray535[Static63.anInt1486++] = local60;
						local64.anInt5320 = Static180.anInt3606;
						if (Static6.aClass5_Sub1_Sub1_1.method182(1) == 1) {
							local134 = Static6.aClass5_Sub1_Sub1_1.method182(3);
							local64.method4656(2, local134);
							local144 = Static6.aClass5_Sub1_Sub1_1.method182(3);
							local64.method4656(2, local144);
						} else {
							local134 = Static6.aClass5_Sub1_Sub1_1.method182(3);
							local64.method4656(0, local134);
						}
						local134 = Static6.aClass5_Sub1_Sub1_1.method182(1);
						if (local134 == 1) {
							Static178.anIntArray266[Static47.anInt1211++] = local60;
						}
					} else if (local89 == 3) {
						Static269.anIntArray394[Static205.anInt3959++] = local60;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIZI)V")
	public static void method3901(@OriginalArg(2) boolean arg0) {
		Static98.anInt2184 = 2;
		Static250.aBoolean374 = arg0;
		Static344.anInt1063 = 22050;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
	public static void method3902() {
		@Pc(1) Class66 local1 = Static287.aClass66_96;
		synchronized (Static287.aClass66_96) {
			Static287.aClass66_96.method1933();
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V")
	public static void method3903() {
		@Pc(13) Class66 local13 = Static237.aClass66_81;
		synchronized (Static237.aClass66_81) {
			Static237.aClass66_81.method1933();
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)V")
	public static void method3904() {
		Static19.anInt546 = Static337.aClass138_10.anInt4180 + Static337.aClass138_10.anInt4175 + 2;
		Static83.anInt2057 = Static282.aClass138_7.anInt4175 + Static282.aClass138_7.anInt4180 + 2;
		Static206.aStringArray28 = new String[350 / Static83.anInt2057];
		for (@Pc(32) int local32 = 0; local32 < Static206.aStringArray28.length; local32++) {
			Static206.aStringArray28[local32] = "";
		}
	}
}
