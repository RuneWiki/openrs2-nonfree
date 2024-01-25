import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!rb", name = "s", descriptor = "Lclient!lja;")
	public static Class5_Sub32 aClass5_Sub32_2;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!ha;Lclient!nh;I)V")
	public static void method6314(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15;
		if (Static151.anIntArray140 != null && arg3 <= arg2.aByte90) {
			for (local15 = 0; local15 < Static151.anIntArray140.length; local15++) {
				if (Static151.anIntArray140[local15] != -1000000 && (Static151.anIntArray140[local15] >= arg2.anIntArray377[0] || Static151.anIntArray140[local15] >= arg2.anIntArray377[1] || arg2.anIntArray377[2] <= Static151.anIntArray140[local15] || Static151.anIntArray140[local15] >= arg2.anIntArray377[3]) && (Static91.anIntArray385[local15] >= arg2.anIntArray376[0] || Static91.anIntArray385[local15] >= arg2.anIntArray376[1] || Static91.anIntArray385[local15] >= arg2.anIntArray376[2] || arg2.anIntArray376[3] <= Static91.anIntArray385[local15]) && (arg2.anIntArray376[0] >= Static651.anIntArray607[local15] || arg2.anIntArray376[1] >= Static651.anIntArray607[local15] || Static651.anIntArray607[local15] <= arg2.anIntArray376[2] || arg2.anIntArray376[3] >= Static651.anIntArray607[local15]) && (arg2.anIntArray375[0] <= Static265.anIntArray255[local15] || arg2.anIntArray375[1] <= Static265.anIntArray255[local15] || arg2.anIntArray375[2] <= Static265.anIntArray255[local15] || Static265.anIntArray255[local15] >= arg2.anIntArray375[3]) && (Static329.anIntArray323[local15] <= arg2.anIntArray375[0] || Static329.anIntArray323[local15] <= arg2.anIntArray375[1] || arg2.anIntArray375[2] >= Static329.anIntArray323[local15] || Static329.anIntArray323[local15] <= arg2.anIntArray375[3])) {
					return;
				}
			}
		}
		@Pc(335) int local335;
		@Pc(358) int local358;
		@Pc(380) boolean local380;
		@Pc(415) float local415;
		if (arg2.aByte91 == 1) {
			local15 = Static553.anInt8738 + arg2.aShort65 - Static220.anInt3838;
			if (local15 >= 0 && Static553.anInt8738 + Static553.anInt8738 >= local15) {
				local335 = Static553.anInt8738 + arg2.aShort63 - Static377.anInt6335;
				if (local335 < 0) {
					local335 = 0;
				} else if (Static553.anInt8738 + Static553.anInt8738 < local335) {
					return;
				}
				local358 = Static553.anInt8738 + arg2.aShort66 - Static377.anInt6335;
				if (Static553.anInt8738 + Static553.anInt8738 < local358) {
					local358 = Static553.anInt8738 + Static553.anInt8738;
				} else if (local358 < 0) {
					return;
				}
				local380 = false;
				while (local335 <= local358) {
					if (Static407.aBooleanArrayArray8[local15][local335++]) {
						local380 = true;
						break;
					}
				}
				if (local380) {
					local415 = (float) (Static57.anInt1010 - arg2.anIntArray376[0]);
					if (local415 < 0.0F) {
						local415 *= -1.0F;
					}
					if (!(float) Static276.anInt5573 > local415 && (Static553.method7507(0, arg2) && (Static553.method7507(1, arg2) && (Static553.method7507(2, arg2) && Static553.method7507(3, arg2))))) {
						Static5.aClass250Array181[Static43.anInt712++] = arg2;
					}
				}
			}
		} else if (arg2.aByte91 == 2) {
			local15 = Static553.anInt8738 + arg2.aShort63 - Static377.anInt6335;
			if (local15 >= 0 && Static553.anInt8738 + Static553.anInt8738 >= local15) {
				local335 = Static553.anInt8738 + arg2.aShort65 - Static220.anInt3838;
				if (local335 < 0) {
					local335 = 0;
				} else if (local335 > Static553.anInt8738 + Static553.anInt8738) {
					return;
				}
				local358 = arg2.aShort64 + Static553.anInt8738 - Static220.anInt3838;
				if (local358 > Static553.anInt8738 + Static553.anInt8738) {
					local358 = Static553.anInt8738 + Static553.anInt8738;
				} else if (local358 < 0) {
					return;
				}
				local380 = false;
				while (local358 >= local335) {
					if (Static407.aBooleanArrayArray8[local335++][local15]) {
						local380 = true;
						break;
					}
				}
				if (local380) {
					local415 = (float) (Static17.anInt229 - arg2.anIntArray375[0]);
					if (local415 < 0.0F) {
						local415 *= -1.0F;
					}
					if (!((float) Static276.anInt5573 > local415) && (Static553.method7507(0, arg2) && (Static553.method7507(1, arg2) && (Static553.method7507(2, arg2) && Static553.method7507(3, arg2))))) {
						Static5.aClass250Array181[Static43.anInt712++] = arg2;
					}
				}
			}
		} else if (arg2.aByte91 == 16 || arg2.aByte91 == 8) {
			local15 = Static553.anInt8738 + arg2.aShort65 - Static220.anInt3838;
			if (local15 >= 0 && local15 <= Static553.anInt8738 + Static553.anInt8738) {
				local335 = arg2.aShort63 + Static553.anInt8738 - Static377.anInt6335;
				if (local335 >= 0 && Static553.anInt8738 + Static553.anInt8738 >= local335 && Static407.aBooleanArrayArray8[local15][local335]) {
					@Pc(721) float local721 = (float) (Static57.anInt1010 - arg2.anIntArray376[0]);
					if (local721 < 0.0F) {
						local721 *= -1.0F;
					}
					@Pc(737) float local737 = (float) (Static17.anInt229 - arg2.anIntArray375[0]);
					if (local737 < 0.0F) {
						local737 *= -1.0F;
					}
					if ((!((float) Static276.anInt5573 > local721) || !((float) Static276.anInt5573 > local737)) && (Static553.method7507(0, arg2) && (Static553.method7507(1, arg2) && (Static553.method7507(2, arg2) && Static553.method7507(3, arg2))))) {
						Static5.aClass250Array181[Static43.anInt712++] = arg2;
					}
				}
			}
		} else if (arg2.aByte91 == 4) {
			@Pc(811) float local811 = (float) (arg2.anIntArray377[0] - Static432.anInt7142);
			if (!((float) Static194.anInt10633 >= local811)) {
				local335 = arg2.aShort63 + Static553.anInt8738 - Static377.anInt6335;
				if (local335 < 0) {
					local335 = 0;
				} else if (local335 > Static553.anInt8738 + Static553.anInt8738) {
					return;
				}
				local358 = arg2.aShort66 + Static553.anInt8738 - Static377.anInt6335;
				if (local358 > Static553.anInt8738 + Static553.anInt8738) {
					local358 = Static553.anInt8738 + Static553.anInt8738;
				} else if (local358 < 0) {
					return;
				}
				@Pc(877) int local877 = Static553.anInt8738 + arg2.aShort65 - Static220.anInt3838;
				if (local877 < 0) {
					local877 = 0;
				} else if (local877 > Static553.anInt8738 + Static553.anInt8738) {
					return;
				}
				@Pc(906) int local906 = Static553.anInt8738 + arg2.aShort64 - Static220.anInt3838;
				if (local906 > Static553.anInt8738 + Static553.anInt8738) {
					local906 = Static553.anInt8738 + Static553.anInt8738;
				} else if (local906 < 0) {
					return;
				}
				@Pc(928) boolean local928 = false;
				label283: for (@Pc(930) int local930 = local877; local930 <= local906; local930++) {
					for (@Pc(936) int local936 = local335; local936 <= local358; local936++) {
						if (Static407.aBooleanArrayArray8[local930][local936]) {
							local928 = true;
							break label283;
						}
					}
				}
				if (local928 && (Static553.method7507(0, arg2) && (Static553.method7507(1, arg2) && (Static553.method7507(2, arg2) && Static553.method7507(3, arg2))))) {
					Static5.aClass250Array181[Static43.anInt712++] = arg2;
				}
			}
		}
	}
}
