import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
	public static int anInt5732;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "Lclient!hi;")
	public static final Class106 aClass106_13 = new Class106(15, 0, 1, 0);

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray39 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "[I")
	public static final int[] anIntArray504 = new int[13];

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	public static void method4811() {
		if (Static241.aBoolean268) {
			return;
		}
		Static165.aBoolean204 = true;
		if (Static8.aClass173_Sub1_1.aBoolean311) {
			Static367.aFloat104 = (int) Static367.aFloat104 + 47 & 0xFFFFFFF0;
		} else {
			Static74.aFloat6 += (12.0F - Static74.aFloat6) / 2.0F;
		}
		Static241.aBoolean268 = true;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIII)V")
	public static void method4812(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14;
		if (arg2 >= arg1) {
			for (local14 = arg1; local14 < arg2; local14++) {
				Static347.anIntArrayArray54[local14][arg3] = arg0;
			}
		} else {
			for (local14 = arg2; local14 < arg1; local14++) {
				Static347.anIntArrayArray54[local14][arg3] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)I")
	public static int method4814(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(20) char local20 = 0;
		while (local13 - local17 < local8 || local15 - local20 < local11) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local15 - local20 >= local11) {
				return 1;
			}
			@Pc(58) char local58;
			if (local17 == '\u0000') {
				local58 = arg2.charAt(local13++);
			} else {
				local58 = local17;
			}
			@Pc(74) char local74;
			if (local20 == '\u0000') {
				local74 = arg0.charAt(local15++);
			} else {
				local74 = local20;
			}
			local17 = Static248.method3824(local58);
			local20 = Static248.method3824(local74);
			local58 = Static297.method4367(local58, arg1);
			local74 = Static297.method4367(local74, arg1);
			if (local58 != local74 && Character.toUpperCase(local58) != Character.toUpperCase(local74)) {
				local58 = Character.toLowerCase(local58);
				local74 = Character.toLowerCase(local74);
				if (local58 != local74) {
					return Static257.method3950(local58, arg1) - Static257.method3950(local74, arg1);
				}
			}
		}
		@Pc(143) int local143 = Math.min(local8, local11);
		for (@Pc(145) int local145 = 0; local145 < local143; local145++) {
			if (arg1 == 2) {
				local15 = local11 - local145 - 1;
				local13 = local8 - local145 - 1;
			} else {
				local15 = local145;
				local13 = local145;
			}
			@Pc(176) char local176 = arg2.charAt(local13);
			@Pc(180) char local180 = arg0.charAt(local15);
			if (local176 != local180 && Character.toUpperCase(local176) != Character.toUpperCase(local180)) {
				local176 = Character.toLowerCase(local176);
				local180 = Character.toLowerCase(local180);
				if (local176 != local180) {
					return Static257.method3950(local176, arg1) - Static257.method3950(local180, arg1);
				}
			}
		}
		@Pc(232) int local232 = local8 - local11;
		if (local232 != 0) {
			return local232;
		}
		for (@Pc(238) int local238 = 0; local238 < local143; local238++) {
			@Pc(244) char local244 = arg2.charAt(local238);
			@Pc(248) char local248 = arg0.charAt(local238);
			if (local248 != local244) {
				return Static257.method3950(local244, arg1) - Static257.method3950(local248, arg1);
			}
		}
		return 0;
	}
}
