import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!hia", name = "m", descriptor = "I")
	public static int anInt3582;

	@OriginalMember(owner = "client!hia", name = "w", descriptor = "I")
	public static int anInt3589;

	@OriginalMember(owner = "client!hia", name = "y", descriptor = "[I")
	public static int[] anIntArray200;

	@OriginalMember(owner = "client!hia", name = "u", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_47 = new Class187(10, -1);

	@OriginalMember(owner = "client!hia", name = "x", descriptor = "[Z")
	public static final boolean[] aBooleanArray6 = new boolean[100];

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(Lclient!li;B)V")
	public static void method3189(@OriginalArg(0) Class41_Sub1_Sub1_Sub3 arg0) {
		if (arg0.anIntArray524 == null && arg0.anIntArray520 == null) {
			return;
		}
		@Pc(16) boolean local16 = true;
		for (@Pc(18) int local18 = 0; local18 < arg0.anIntArray524.length; local18++) {
			@Pc(21) int local21 = -1;
			if (arg0.anIntArray524 != null) {
				local21 = arg0.anIntArray524[local18];
			}
			if (local21 != -1) {
				local16 = false;
				@Pc(91) int local91;
				@Pc(84) int local84;
				@Pc(65) int local65;
				if ((local21 & 0xC0000000) == -1073741824) {
					local65 = local21 & 0xFFFFFFF;
					@Pc(134) int local134 = local65 >> 14;
					@Pc(138) int local138 = local65 & 0x3FFF;
					local91 = arg0.anInt10366 - (local134 - Static454.anInt7910) * 512 - 256;
					local84 = arg0.anInt10367 - (local138 + -Static48.anInt750) * 512 - 256;
				} else if ((local21 & 0x8000) == 0) {
					@Pc(99) Class5_Sub34 local99 = (Class5_Sub34) Static223.aClass335_19.method7766((long) local21);
					if (local99 == null) {
						arg0.method7922(local18, -1);
						continue;
					}
					@Pc(104) Class41_Sub1_Sub1_Sub3_Sub1 local104 = local99.aClass41_Sub1_Sub1_Sub3_Sub1_1;
					local91 = arg0.anInt10366 - local104.anInt10366;
					local84 = arg0.anInt10367 - local104.anInt10367;
				} else {
					local65 = local21 & 0x7FFF;
					@Pc(69) Class41_Sub1_Sub1_Sub3_Sub2 local69 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local65];
					if (local69 == null) {
						arg0.method7922(local18, -1);
						continue;
					}
					local84 = arg0.anInt10367 - local69.anInt10367;
					local91 = arg0.anInt10366 - local69.anInt10366;
				}
				if (local91 != 0 || local84 != 0) {
					arg0.method7922(local18, (int) (Math.atan2((double) local91, (double) local84) * 2607.5945876176133D) & 0x3FFF);
				}
			} else if (!arg0.method7922(local18, -1)) {
				local16 = false;
			}
		}
		if (local16) {
			arg0.anIntArray520 = null;
			arg0.anIntArray524 = null;
		}
	}

	@OriginalMember(owner = "client!hia", name = "b", descriptor = "(III)Z")
	public static boolean method3190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static156.method2375(arg0, arg1) & Static547.method7539(arg1, arg0);
	}

	@OriginalMember(owner = "client!hia", name = "g", descriptor = "(I)[Lclient!gq;")
	public static Class139[] method3191() {
		return new Class139[] { Static211.aClass139_1, Static216.aClass139_2, Static371.aClass139_3 };
	}
}
