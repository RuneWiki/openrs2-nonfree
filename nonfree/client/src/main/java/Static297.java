import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!t", name = "e", descriptor = "I")
	public static int anInt5578;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "Lclient!jj;")
	public static final Class108 aClass108_31 = new Class108(32);

	@OriginalMember(owner = "client!t", name = "i", descriptor = "Lclient!ce;")
	public static final Class31 aClass31_9 = new Class31(16);

	@OriginalMember(owner = "client!t", name = "j", descriptor = "I")
	public static int anInt5582 = 0;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
	public static void method5063() {
		Static350.aClass30_6 = null;
		Static40.aClass40Array8 = null;
		Static85.aClass40Array15 = null;
		Static177.aClass40Array23 = null;
		Static352.aClass40Array44 = null;
		Static94.aClass40Array16 = null;
		Static310.aClass40Array39 = null;
		Static168.aClass40Array10 = null;
		Static312.aClass40Array40 = null;
		Static77.aClass40Array14 = null;
		Static309.aClass30_5 = null;
		Static185.aClass40Array43 = null;
		Static98.aClass40Array17 = null;
		Static204.aClass40Array27 = null;
		Static33.aClass40Array5 = null;
		Static39.aClass40_2 = null;
		Static298.aClass30_4 = null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method5064(@OriginalArg(0) String arg0) {
		if (Static223.aStringArray29 == null) {
			Static314.method2480();
		}
		@Pc(14) String[] local14 = Static194.method3611(arg0, '\n');
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			for (@Pc(23) int local23 = Static223.aStringArray29.length - 1; local23 > 0; local23--) {
				Static223.aStringArray29[local23] = Static223.aStringArray29[local23 - 1];
			}
			Static223.aStringArray29[0] = local14[local16];
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!hs;)V")
	public static void method5065(@OriginalArg(0) Class6_Sub17_Sub1 arg0) {
		if (Static105.anInt1943 >= 255) {
			return;
		}
		Static240.aClass6_Sub17_Sub1Array4[Static105.anInt1943] = arg0;
		Static29.aBooleanArray9[Static105.anInt1943] = false;
		Static105.anInt1943++;
		@Pc(18) int local18 = arg0.anInt2324;
		if (arg0.aBoolean197) {
			local18 = 0;
		}
		@Pc(26) int local26 = arg0.anInt2324;
		if (arg0.aBoolean196) {
			local26 = Static131.anInt2392 - 1;
		}
		for (@Pc(35) int local35 = local18; local35 <= local26; local35++) {
			@Pc(38) int local38 = 0;
			@Pc(48) int local48 = arg0.anInt2317 + 64 - arg0.anInt2315 >> 7;
			if (local48 < 0) {
				local38 = -local48;
				local48 = 0;
			}
			@Pc(66) int local66 = arg0.anInt2317 + arg0.anInt2315 - 64 >> 7;
			if (local66 >= Static163.anInt3084) {
				local66 = Static163.anInt3084 - 1;
			}
			for (@Pc(75) int local75 = local48; local75 <= local66; local75++) {
				@Pc(82) short local82 = arg0.aShortArray54[local38++];
				@Pc(96) int local96 = (arg0.anInt2314 + 64 - arg0.anInt2315 >> 7) + (local82 >>> 8);
				@Pc(104) int local104 = local96 + (local82 & 0xFF) - 1;
				if (local96 < 0) {
					local96 = 0;
				}
				if (local104 >= Static310.anInt5828) {
					local104 = Static310.anInt5828 - 1;
				}
				for (@Pc(117) int local117 = local96; local117 <= local104; local117++) {
					@Pc(126) int local126 = Static174.anIntArrayArrayArray4[local35][local117][local75];
					if ((local126 & 0xFF) == 0) {
						Static174.anIntArrayArrayArray4[local35][local117][local75] = local126 | Static105.anInt1943;
					} else if ((local126 & 0xFF00) == 0) {
						Static174.anIntArrayArrayArray4[local35][local117][local75] = local126 | Static105.anInt1943 << 8;
					} else if ((local126 & 0xFF0000) == 0) {
						Static174.anIntArrayArrayArray4[local35][local117][local75] = local126 | Static105.anInt1943 << 16;
					} else if ((local126 & 0xFF000000) == 0) {
						Static174.anIntArrayArrayArray4[local35][local117][local75] = local126 | Static105.anInt1943 << 24;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	public static void method5066() {
		Static21.aClass70_10.method1399();
	}
}
