import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!d", name = "B", descriptor = "[I")
	public static int[] anIntArray89;

	@OriginalMember(owner = "client!d", name = "G", descriptor = "I")
	public static int anInt1341;

	@OriginalMember(owner = "client!d", name = "E", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_45 = new Class131(31, 3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IILclient!vh;)Lclient!ib;")
	public static Class1_Sub17 method1124(@OriginalArg(1) int arg0, @OriginalArg(2) Class250 arg1) {
		@Pc(8) byte[] local8 = arg1.method5644(arg0);
		return local8 == null ? null : new Class1_Sub17(local8);
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(Z)V")
	public static void method1126() {
		if (Static66.anInt1365 == -1 || Static310.anInt5542 == -1) {
			return;
		}
		@Pc(23) int local23 = ((Static406.anInt7018 - Static322.anInt5633) * Static398.anInt6923 >> 16) + Static322.anInt5633;
		Static398.anInt6923 += local23;
		if (Static398.anInt6923 < 65535) {
			Static248.aBoolean305 = false;
			Static92.aBoolean94 = false;
		} else {
			if (Static248.aBoolean305) {
				Static92.aBoolean94 = false;
			} else {
				Static92.aBoolean94 = true;
			}
			Static398.anInt6923 = 65535;
			Static248.aBoolean305 = true;
		}
		@Pc(55) float local55 = (float) Static398.anInt6923 / 65535.0F;
		@Pc(58) float[] local58 = new float[3];
		@Pc(62) int local62 = Static300.anInt5341 * 2;
		@Pc(88) int local88;
		@Pc(121) int local121;
		@Pc(129) int local129;
		@Pc(134) int local134;
		@Pc(144) int local144;
		@Pc(160) int local160;
		for (@Pc(64) int local64 = 0; local64 < 3; local64++) {
			@Pc(76) int local76 = Static276.anIntArrayArrayArray14[Static66.anInt1365][local62][local64] * 3;
			local88 = Static276.anIntArrayArrayArray14[Static66.anInt1365][local62 + 1][local64] * 3;
			local121 = (Static276.anIntArrayArrayArray14[Static66.anInt1365][local62 + 2][local64] + Static276.anIntArrayArrayArray14[Static66.anInt1365][local62 + 2][local64] - Static276.anIntArrayArrayArray14[Static66.anInt1365][local62 + 3][local64]) * 3;
			local129 = Static276.anIntArrayArrayArray14[Static66.anInt1365][local62][local64];
			local134 = local88 - local76;
			local144 = local76 + local121 - local88 * 2;
			local160 = Static276.anIntArrayArrayArray14[Static66.anInt1365][local62 + 2][local64] + local88 - local129 - local121;
			local58[local64] = ((float) local134 + ((float) local144 + (float) local160 * local55) * local55) * local55 + (float) local129;
		}
		Static254.anInt4567 = (int) local58[1] * -1;
		Static306.anInt5497 = (int) local58[0] - Static437.anInt7555 * 128;
		Static402.anInt6941 = (int) local58[2] - Static134.anInt5502 * 128;
		@Pc(214) float[] local214 = new float[3];
		local88 = Static200.anInt3623 * 2;
		for (local121 = 0; local121 < 3; local121++) {
			local129 = Static276.anIntArrayArrayArray14[Static310.anInt5542][local88][local121] * 3;
			local134 = Static276.anIntArrayArrayArray14[Static310.anInt5542][local88 + 1][local121] * 3;
			local144 = (Static276.anIntArrayArrayArray14[Static310.anInt5542][local88 + 2][local121] + Static276.anIntArrayArrayArray14[Static310.anInt5542][local88 + 2][local121] - Static276.anIntArrayArrayArray14[Static310.anInt5542][local88 + 3][local121]) * 3;
			local160 = Static276.anIntArrayArrayArray14[Static310.anInt5542][local88][local121];
			@Pc(296) int local296 = local134 - local129;
			@Pc(305) int local305 = local129 + local144 - local134 * 2;
			@Pc(322) int local322 = Static276.anIntArrayArrayArray14[Static310.anInt5542][local88 + 2][local121] + local134 - local160 - local144;
			local214[local121] = (float) local160 + ((local55 * (float) local322 + (float) local305) * local55 + (float) local296) * local55;
		}
		@Pc(357) float local357 = local214[0] - local58[0];
		@Pc(368) float local368 = -1.0F * (local214[1] - local58[1]);
		@Pc(377) float local377 = local214[2] - local58[2];
		@Pc(387) double local387 = Math.sqrt((double) (local377 * local377 + local357 * local357));
		Static239.anInt4284 = (int) (Math.atan2((double) local368, local387) * 2607.5945876176133D) & 0x3FFF;
		Static94.anInt1775 = (int) (-Math.atan2((double) local357, (double) local377) * 2607.5945876176133D) & 0x3FFF;
		Static454.anInt7852 = Static276.anIntArrayArrayArray14[Static66.anInt1365][local62][3] + ((Static276.anIntArrayArrayArray14[Static66.anInt1365][local62 + 2][3] - Static276.anIntArrayArrayArray14[Static66.anInt1365][local62][3]) * Static398.anInt6923 >> 16);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III)Z")
	public static boolean method1127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static172.anInt3166; local1++) {
			@Pc(6) Class226 local6 = Static446.aClass226Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt6785 == 1) {
				local15 = local6.anInt6784 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt6774 + (local6.anInt6782 * local15 >> 8);
					local37 = local6.anInt6789 + (local6.anInt6766 * local15 >> 8);
					local47 = local6.anInt6773 + (local6.anInt6771 * local15 >> 8);
					local57 = local6.anInt6788 + (local6.anInt6780 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6785 == 2) {
				local15 = arg0 - local6.anInt6784;
				if (local15 > 0) {
					local27 = local6.anInt6774 + (local6.anInt6782 * local15 >> 8);
					local37 = local6.anInt6789 + (local6.anInt6766 * local15 >> 8);
					local47 = local6.anInt6773 + (local6.anInt6771 * local15 >> 8);
					local57 = local6.anInt6788 + (local6.anInt6780 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6785 == 3) {
				local15 = local6.anInt6774 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt6784 + (local6.anInt6769 * local15 >> 8);
					local37 = local6.anInt6768 + (local6.anInt6770 * local15 >> 8);
					local47 = local6.anInt6773 + (local6.anInt6771 * local15 >> 8);
					local57 = local6.anInt6788 + (local6.anInt6780 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6785 == 4) {
				local15 = arg2 - local6.anInt6774;
				if (local15 > 0) {
					local27 = local6.anInt6784 + (local6.anInt6769 * local15 >> 8);
					local37 = local6.anInt6768 + (local6.anInt6770 * local15 >> 8);
					local47 = local6.anInt6773 + (local6.anInt6771 * local15 >> 8);
					local57 = local6.anInt6788 + (local6.anInt6780 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6785 == 5) {
				local15 = arg1 - local6.anInt6773;
				if (local15 > 0) {
					local27 = local6.anInt6784 + (local6.anInt6769 * local15 >> 8);
					local37 = local6.anInt6768 + (local6.anInt6770 * local15 >> 8);
					local47 = local6.anInt6774 + (local6.anInt6782 * local15 >> 8);
					local57 = local6.anInt6789 + (local6.anInt6766 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
