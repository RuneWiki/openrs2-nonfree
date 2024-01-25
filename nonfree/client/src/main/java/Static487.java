import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!qg", name = "F", descriptor = "Lclient!tja;")
	public static final Class352 aClass352_11 = new Class352(30);

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!lc;ZLclient!bt;)V")
	public static void method1697(@OriginalArg(0) Class207 arg0, @OriginalArg(2) Class34 arg1) {
		Static518.aClass34_132 = arg1;
		Static343.aString68 = "";
		Static567.aClass207_5 = arg0;
		if (Class4_Sub5_Sub13.aString48.startsWith("win")) {
			Static343.aString68 = Static343.aString68 + "windows/";
		} else if (Class4_Sub5_Sub13.aString48.startsWith("linux")) {
			Static343.aString68 = Static343.aString68 + "linux/";
		} else if (Class4_Sub5_Sub13.aString48.startsWith("mac")) {
			Static343.aString68 = Static343.aString68 + "macos/";
		}
		if (Static567.aClass207_5.aBoolean398) {
			Static343.aString68 = Static343.aString68 + "msjava/";
		} else if (Class4_Sub5_Sub13.aString47.startsWith("amd64") || Class4_Sub5_Sub13.aString47.startsWith("x86_64")) {
			Static343.aString68 = Static343.aString68 + "x86_64/";
		} else if (Class4_Sub5_Sub13.aString47.startsWith("i386") || Class4_Sub5_Sub13.aString47.startsWith("i486") || Class4_Sub5_Sub13.aString47.startsWith("i586") || Class4_Sub5_Sub13.aString47.startsWith("x86")) {
			Static343.aString68 = Static343.aString68 + "x86/";
		} else if (Class4_Sub5_Sub13.aString47.startsWith("ppc")) {
			Static343.aString68 = Static343.aString68 + "ppc/";
		} else {
			Static343.aString68 = Static343.aString68 + "universal/";
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!kg;I)V")
	public static void method1698(@OriginalArg(0) Class3_Sub1_Sub2_Sub2 arg0) {
		if (arg0.anIntArray692 == null && arg0.anIntArray684 == null) {
			return;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < arg0.anIntArray692.length; local16++) {
			@Pc(20) int local20 = -1;
			if (arg0.anIntArray692 != null) {
				local20 = arg0.anIntArray692[local16];
			}
			if (local20 != -1) {
				local14 = false;
				@Pc(75) int local75;
				@Pc(82) int local82;
				@Pc(62) int local62;
				if ((local20 & 0xC0000000) == -1073741824) {
					local62 = local20 & 0xFFFFFFF;
					@Pc(136) int local136 = local62 >> 14;
					local75 = arg0.anInt9925 - (local136 - Static445.anInt6949) * 512 - 256;
					@Pc(152) int local152 = local62 & 0x3FFF;
					local82 = arg0.anInt9917 - (local152 - Static321.anInt5000) * 512 - 256;
				} else if ((local20 & 0x8000) == 0) {
					@Pc(99) Class4_Sub45 local99 = (Class4_Sub45) Static597.aClass66_41.method1994((long) local20);
					if (local99 == null) {
						arg0.method8521(-1, local16);
						continue;
					}
					@Pc(112) Class3_Sub1_Sub2_Sub2_Sub2 local112 = local99.aClass3_Sub1_Sub2_Sub2_Sub2_2;
					local82 = arg0.anInt9917 - local112.anInt9917;
					local75 = arg0.anInt9925 - local112.anInt9925;
				} else {
					local62 = local20 & 0x7FFF;
					@Pc(66) Class3_Sub1_Sub2_Sub2_Sub1 local66 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local62];
					if (local66 == null) {
						arg0.method8521(-1, local16);
						continue;
					}
					local75 = arg0.anInt9925 - local66.anInt9925;
					local82 = arg0.anInt9917 - local66.anInt9917;
				}
				if (local75 != 0 || local82 != 0) {
					arg0.method8521((int) (Math.atan2((double) local75, (double) local82) * 2607.5945876176133D) & 0x3FFF, local16);
				}
			} else if (!arg0.method8521(-1, local16)) {
				local14 = false;
			}
		}
		if (local14) {
			arg0.anIntArray692 = null;
			arg0.anIntArray684 = null;
		}
	}
}
