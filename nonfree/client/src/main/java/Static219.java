import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "[I")
	public static final int[] anIntArray265 = new int[3];

	@OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
	public static int anInt3189 = 0;

	@OriginalMember(owner = "client!ib", name = "N", descriptor = "[I")
	public static final int[] anIntArray266 = new int[14];

	@OriginalMember(owner = "client!ib", name = "V", descriptor = "J")
	public static long aLong96 = 20000000L;

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)Z")
	public static boolean method2676() {
		return Static540.anInt8912 >= 1;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!eh;Lclient!r;I)V")
	public static void method2679(@OriginalArg(1) Class91 arg0, @OriginalArg(2) Class162 arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17;
		if (Static442.anIntArray480 != null && arg0.aByte24 >= arg2) {
			for (local17 = 0; local17 < Static442.anIntArray480.length; local17++) {
				if (Static442.anIntArray480[local17] != -1000000 && (Static442.anIntArray480[local17] >= arg0.anIntArray175[0] || arg0.anIntArray175[1] <= Static442.anIntArray480[local17] || arg0.anIntArray175[2] <= Static442.anIntArray480[local17] || Static442.anIntArray480[local17] >= arg0.anIntArray175[3]) && (Static184.anIntArray228[local17] >= arg0.anIntArray173[0] || Static184.anIntArray228[local17] >= arg0.anIntArray173[1] || Static184.anIntArray228[local17] >= arg0.anIntArray173[2] || arg0.anIntArray173[3] <= Static184.anIntArray228[local17]) && (arg0.anIntArray173[0] >= Static253.anIntArray305[local17] || Static253.anIntArray305[local17] <= arg0.anIntArray173[1] || arg0.anIntArray173[2] >= Static253.anIntArray305[local17] || arg0.anIntArray173[3] >= Static253.anIntArray305[local17]) && (Static497.anIntArray530[local17] >= arg0.anIntArray174[0] || arg0.anIntArray174[1] <= Static497.anIntArray530[local17] || Static497.anIntArray530[local17] >= arg0.anIntArray174[2] || Static497.anIntArray530[local17] >= arg0.anIntArray174[3]) && (arg0.anIntArray174[0] >= Static340.anIntArray398[local17] || Static340.anIntArray398[local17] <= arg0.anIntArray174[1] || Static340.anIntArray398[local17] <= arg0.anIntArray174[2] || Static340.anIntArray398[local17] <= arg0.anIntArray174[3])) {
					return;
				}
			}
		}
		@Pc(278) int local278;
		@Pc(303) int local303;
		@Pc(323) boolean local323;
		@Pc(350) float local350;
		if (arg0.aByte25 == 1) {
			local17 = arg0.aShort24 + Static351.anInt6012 - Static258.anInt4281;
			if (local17 >= 0 && Static351.anInt6012 + Static351.anInt6012 >= local17) {
				local278 = Static351.anInt6012 + arg0.aShort23 - Static505.anInt8016;
				if (local278 < 0) {
					local278 = 0;
				} else if (Static351.anInt6012 + Static351.anInt6012 < local278) {
					return;
				}
				local303 = Static351.anInt6012 + arg0.aShort25 - Static505.anInt8016;
				if (Static351.anInt6012 + Static351.anInt6012 < local303) {
					local303 = Static351.anInt6012 + Static351.anInt6012;
				} else if (local303 < 0) {
					return;
				}
				local323 = false;
				while (local303 >= local278) {
					if (Static590.aBooleanArrayArray10[local17][local278++]) {
						local323 = true;
						break;
					}
				}
				if (local323) {
					local350 = Static297.anInt4992 - arg0.anIntArray173[0];
					if (local350 < 0.0F) {
						local350 *= -1.0F;
					}
					if (!local350 < (float) Static595.anInt9643 && (Static30.method401(arg0, 0) && (Static30.method401(arg0, 1) && (Static30.method401(arg0, 2) && Static30.method401(arg0, 3))))) {
						Static370.aClass91Array4[Static475.anInt5125++] = arg0;
					}
				}
			}
		} else if (arg0.aByte25 == 2) {
			local17 = arg0.aShort23 + Static351.anInt6012 - Static505.anInt8016;
			if (local17 >= 0 && local17 <= Static351.anInt6012 + Static351.anInt6012) {
				local278 = arg0.aShort24 + Static351.anInt6012 - Static258.anInt4281;
				if (local278 < 0) {
					local278 = 0;
				} else if (Static351.anInt6012 + Static351.anInt6012 < local278) {
					return;
				}
				local303 = arg0.aShort26 + Static351.anInt6012 - Static258.anInt4281;
				if (Static351.anInt6012 + Static351.anInt6012 < local303) {
					local303 = Static351.anInt6012 + Static351.anInt6012;
				} else if (local303 < 0) {
					return;
				}
				local323 = false;
				while (local278 <= local303) {
					if (Static590.aBooleanArrayArray10[local278++][local17]) {
						local323 = true;
						break;
					}
				}
				if (local323) {
					local350 = Static316.anInt5329 - arg0.anIntArray174[0];
					if (local350 < 0.0F) {
						local350 *= -1.0F;
					}
					if (!((float) Static595.anInt9643 > local350) && (Static30.method401(arg0, 0) && (Static30.method401(arg0, 1) && (Static30.method401(arg0, 2) && Static30.method401(arg0, 3))))) {
						Static370.aClass91Array4[Static475.anInt5125++] = arg0;
					}
				}
			}
		} else if (arg0.aByte25 == 16 || arg0.aByte25 == 8) {
			local17 = arg0.aShort24 + Static351.anInt6012 - Static258.anInt4281;
			if (local17 >= 0 && local17 <= Static351.anInt6012 + Static351.anInt6012) {
				local278 = Static351.anInt6012 + arg0.aShort23 - Static505.anInt8016;
				if (local278 >= 0 && Static351.anInt6012 + Static351.anInt6012 >= local278 && Static590.aBooleanArrayArray10[local17][local278]) {
					@Pc(604) float local604 = (float) (Static297.anInt4992 - arg0.anIntArray173[0]);
					if (local604 < 0.0F) {
						local604 *= -1.0F;
					}
					@Pc(620) float local620 = (float) (Static316.anInt5329 - arg0.anIntArray174[0]);
					if (local620 < 0.0F) {
						local620 *= -1.0F;
					}
					if ((!((float) Static595.anInt9643 > local604) || !(local620 < (float) Static595.anInt9643)) && (Static30.method401(arg0, 0) && (Static30.method401(arg0, 1) && (Static30.method401(arg0, 2) && Static30.method401(arg0, 3))))) {
						Static370.aClass91Array4[Static475.anInt5125++] = arg0;
					}
				}
			}
		} else if (arg0.aByte25 == 4) {
			@Pc(689) float local689 = (float) (arg0.anIntArray175[0] - Static581.anInt9417);
			if (!(local689 <= (float) Static148.anInt2360)) {
				local278 = Static351.anInt6012 + arg0.aShort23 - Static505.anInt8016;
				if (local278 < 0) {
					local278 = 0;
				} else if (Static351.anInt6012 + Static351.anInt6012 < local278) {
					return;
				}
				local303 = arg0.aShort25 + Static351.anInt6012 - Static505.anInt8016;
				if (Static351.anInt6012 + Static351.anInt6012 < local303) {
					local303 = Static351.anInt6012 + Static351.anInt6012;
				} else if (local303 < 0) {
					return;
				}
				@Pc(747) int local747 = arg0.aShort24 + Static351.anInt6012 - Static258.anInt4281;
				if (local747 < 0) {
					local747 = 0;
				} else if (local747 > Static351.anInt6012 + Static351.anInt6012) {
					return;
				}
				@Pc(774) int local774 = Static351.anInt6012 + arg0.aShort26 - Static258.anInt4281;
				if (Static351.anInt6012 + Static351.anInt6012 < local774) {
					local774 = Static351.anInt6012 + Static351.anInt6012;
				} else if (local774 < 0) {
					return;
				}
				@Pc(794) boolean local794 = false;
				label283: for (@Pc(796) int local796 = local747; local796 <= local774; local796++) {
					for (@Pc(800) int local800 = local278; local800 <= local303; local800++) {
						if (Static590.aBooleanArrayArray10[local796][local800]) {
							local794 = true;
							break label283;
						}
					}
				}
				if (local794 && (Static30.method401(arg0, 0) && (Static30.method401(arg0, 1) && (Static30.method401(arg0, 2) && Static30.method401(arg0, 3))))) {
					Static370.aClass91Array4[Static475.anInt5125++] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZ)Z")
	public static boolean method2681(@OriginalArg(0) int arg0) {
		if (arg0 == 21 || arg0 == 18 || arg0 == 11 || arg0 == 4 || arg0 == 1003) {
			return true;
		} else {
			return arg0 == 9 || arg0 == 1007;
		}
	}
}
