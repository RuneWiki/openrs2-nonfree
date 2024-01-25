import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!fr", name = "v", descriptor = "Lclient!vw;")
	public static Class382 aClass382_1;

	@OriginalMember(owner = "client!fr", name = "C", descriptor = "Lclient!in;")
	public static final Class169 aClass169_88 = new Class169(92, 2);

	@OriginalMember(owner = "client!fr", name = "K", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

	@OriginalMember(owner = "client!fr", name = "R", descriptor = "Lclient!rha;")
	public static final Class315 aClass315_8 = new Class315();

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IILclient!th;Lclient!ha;)V")
	public static void method3383(@OriginalArg(0) int arg0, @OriginalArg(2) Class348 arg1, @OriginalArg(3) Class101 arg2) {
		@Pc(17) int local17;
		if (Static542.anIntArray487 != null && arg1.aByte133 >= arg0) {
			for (local17 = 0; local17 < Static542.anIntArray487.length; local17++) {
				if (Static542.anIntArray487[local17] != -1000000 && (arg1.anIntArray506[0] <= Static542.anIntArray487[local17] || Static542.anIntArray487[local17] >= arg1.anIntArray506[1] || Static542.anIntArray487[local17] >= arg1.anIntArray506[2] || Static542.anIntArray487[local17] >= arg1.anIntArray506[3]) && (arg1.anIntArray508[0] <= Static464.anIntArray419[local17] || Static464.anIntArray419[local17] >= arg1.anIntArray508[1] || Static464.anIntArray419[local17] >= arg1.anIntArray508[2] || Static464.anIntArray419[local17] >= arg1.anIntArray508[3]) && (Static558.anIntArray491[local17] <= arg1.anIntArray508[0] || arg1.anIntArray508[1] >= Static558.anIntArray491[local17] || arg1.anIntArray508[2] >= Static558.anIntArray491[local17] || arg1.anIntArray508[3] >= Static558.anIntArray491[local17]) && (arg1.anIntArray507[0] <= Static577.anIntArray510[local17] || Static577.anIntArray510[local17] >= arg1.anIntArray507[1] || arg1.anIntArray507[2] <= Static577.anIntArray510[local17] || arg1.anIntArray507[3] <= Static577.anIntArray510[local17]) && (Static34.anIntArray43[local17] <= arg1.anIntArray507[0] || arg1.anIntArray507[1] >= Static34.anIntArray43[local17] || arg1.anIntArray507[2] >= Static34.anIntArray43[local17] || arg1.anIntArray507[3] >= Static34.anIntArray43[local17])) {
					return;
				}
			}
		}
		@Pc(264) int local264;
		@Pc(288) int local288;
		@Pc(305) boolean local305;
		@Pc(333) float local333;
		if (arg1.aByte132 == 1) {
			local17 = arg1.aShort114 + Static602.anInt10539 - Static440.anInt8000;
			if (local17 >= 0 && local17 <= Static602.anInt10539 + Static602.anInt10539) {
				local264 = Static602.anInt10539 + arg1.aShort116 - Static139.anInt2631;
				if (local264 < 0) {
					local264 = 0;
				} else if (local264 > Static602.anInt10539 + Static602.anInt10539) {
					return;
				}
				local288 = Static602.anInt10539 + arg1.aShort113 - Static139.anInt2631;
				if (Static602.anInt10539 + Static602.anInt10539 < local288) {
					local288 = Static602.anInt10539 + Static602.anInt10539;
				} else if (local288 < 0) {
					return;
				}
				local305 = false;
				while (local288 >= local264) {
					if (Static423.aBooleanArrayArray8[local17][local264++]) {
						local305 = true;
						break;
					}
				}
				if (local305) {
					local333 = (float) (Static604.anInt10572 - arg1.anIntArray508[0]);
					if (local333 < 0.0F) {
						local333 *= -1.0F;
					}
					if (!local333 < (float) Static339.anInt6007 && (Static359.method6150(arg1, 0) && (Static359.method6150(arg1, 1) && (Static359.method6150(arg1, 2) && Static359.method6150(arg1, 3))))) {
						Static45.aClass348Array1[Static90.anInt1654++] = arg1;
					}
				}
			}
		} else if (arg1.aByte132 == 2) {
			local17 = arg1.aShort116 + Static602.anInt10539 - Static139.anInt2631;
			if (local17 >= 0 && local17 <= Static602.anInt10539 + Static602.anInt10539) {
				local264 = arg1.aShort114 + Static602.anInt10539 - Static440.anInt8000;
				if (local264 < 0) {
					local264 = 0;
				} else if (local264 > Static602.anInt10539 + Static602.anInt10539) {
					return;
				}
				local288 = arg1.aShort115 + Static602.anInt10539 - Static440.anInt8000;
				if (local288 > Static602.anInt10539 + Static602.anInt10539) {
					local288 = Static602.anInt10539 + Static602.anInt10539;
				} else if (local288 < 0) {
					return;
				}
				local305 = false;
				while (local288 >= local264) {
					if (Static423.aBooleanArrayArray8[local264++][local17]) {
						local305 = true;
						break;
					}
				}
				if (local305) {
					local333 = (float) (Static483.anInt8675 - arg1.anIntArray507[0]);
					if (local333 < 0.0F) {
						local333 *= -1.0F;
					}
					if (!(local333 < (float) Static339.anInt6007) && (Static359.method6150(arg1, 0) && (Static359.method6150(arg1, 1) && (Static359.method6150(arg1, 2) && Static359.method6150(arg1, 3))))) {
						Static45.aClass348Array1[Static90.anInt1654++] = arg1;
					}
				}
			}
		} else if (arg1.aByte132 == 16 || arg1.aByte132 == 8) {
			local17 = arg1.aShort114 + Static602.anInt10539 - Static440.anInt8000;
			if (local17 >= 0 && local17 <= Static602.anInt10539 + Static602.anInt10539) {
				local264 = arg1.aShort116 + Static602.anInt10539 - Static139.anInt2631;
				if (local264 >= 0 && Static602.anInt10539 + Static602.anInt10539 >= local264 && Static423.aBooleanArrayArray8[local17][local264]) {
					@Pc(614) float local614 = (float) (Static604.anInt10572 - arg1.anIntArray508[0]);
					if (local614 < 0.0F) {
						local614 *= -1.0F;
					}
					@Pc(631) float local631 = (float) (Static483.anInt8675 - arg1.anIntArray507[0]);
					if (local631 < 0.0F) {
						local631 *= -1.0F;
					}
					if ((!((float) Static339.anInt6007 > local614) || !((float) Static339.anInt6007 > local631)) && (Static359.method6150(arg1, 0) && (Static359.method6150(arg1, 1) && (Static359.method6150(arg1, 2) && Static359.method6150(arg1, 3))))) {
						Static45.aClass348Array1[Static90.anInt1654++] = arg1;
					}
				}
			}
		} else if (arg1.aByte132 == 4) {
			@Pc(701) float local701 = (float) (arg1.anIntArray506[0] - Static567.anInt9850);
			if (!(local701 <= (float) Static278.anInt5147)) {
				local264 = Static602.anInt10539 + arg1.aShort116 - Static139.anInt2631;
				if (local264 < 0) {
					local264 = 0;
				} else if (Static602.anInt10539 + Static602.anInt10539 < local264) {
					return;
				}
				local288 = arg1.aShort113 + Static602.anInt10539 - Static139.anInt2631;
				if (local288 > Static602.anInt10539 + Static602.anInt10539) {
					local288 = Static602.anInt10539 + Static602.anInt10539;
				} else if (local288 < 0) {
					return;
				}
				@Pc(764) int local764 = Static602.anInt10539 + arg1.aShort114 - Static440.anInt8000;
				if (local764 < 0) {
					local764 = 0;
				} else if (Static602.anInt10539 + Static602.anInt10539 < local764) {
					return;
				}
				@Pc(784) int local784 = Static602.anInt10539 + arg1.aShort115 - Static440.anInt8000;
				if (Static602.anInt10539 + Static602.anInt10539 < local784) {
					local784 = Static602.anInt10539 + Static602.anInt10539;
				} else if (local784 < 0) {
					return;
				}
				@Pc(806) boolean local806 = false;
				label283: for (@Pc(808) int local808 = local764; local808 <= local784; local808++) {
					for (@Pc(812) int local812 = local264; local812 <= local288; local812++) {
						if (Static423.aBooleanArrayArray8[local808][local812]) {
							local806 = true;
							break label283;
						}
					}
				}
				if (local806 && (Static359.method6150(arg1, 0) && (Static359.method6150(arg1, 1) && (Static359.method6150(arg1, 2) && Static359.method6150(arg1, 3))))) {
					Static45.aClass348Array1[Static90.anInt1654++] = arg1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(II)V")
	public static void method3384(@OriginalArg(1) int arg0) {
		if (Static605.anInt10580 == 1) {
			Static507.anInt9028 = arg0;
		} else if (Static605.anInt10580 == 2) {
			Static434.anInt5752 = arg0;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIII)V")
	public static void method3388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(12) int local12 = -arg2;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg2 + arg1);
		@Pc(31) int local31 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg1 - arg2);
		Static567.method8614(local31, local22, Static186.anIntArrayArray12[arg3], arg0);
		while (local9 > local7) {
			local14 += 2;
			local12 += local14;
			@Pc(60) int local60;
			@Pc(64) int local64;
			@Pc(80) int local80;
			@Pc(89) int local89;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local60 = arg3 - local9;
				local64 = local9 + arg3;
				if (local64 >= Static427.anInt7845 && local60 <= Static631.anInt10922) {
					local80 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg1 + local7);
					local89 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg1 - local7);
					if (Static631.anInt10922 >= local64) {
						Static567.method8614(local89, local80, Static186.anIntArrayArray12[local64], arg0);
					}
					if (local60 >= Static427.anInt7845) {
						Static567.method8614(local89, local80, Static186.anIntArrayArray12[local60], arg0);
					}
				}
			}
			local7++;
			local60 = arg3 - local7;
			local64 = arg3 + local7;
			if (Static427.anInt7845 <= local64 && local60 <= Static631.anInt10922) {
				local80 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, local9 + arg1);
				local89 = Static198.method3808(Static407.anInt7583, Static457.anInt8209, arg1 - local9);
				if (local64 <= Static631.anInt10922) {
					Static567.method8614(local89, local80, Static186.anIntArrayArray12[local64], arg0);
				}
				if (local60 >= Static427.anInt7845) {
					Static567.method8614(local89, local80, Static186.anIntArrayArray12[local60], arg0);
				}
			}
		}
	}
}
