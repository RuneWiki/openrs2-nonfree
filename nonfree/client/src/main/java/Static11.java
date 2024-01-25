import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!al", name = "o", descriptor = "Lclient!mn;")
	public static Class171 aClass171_2;

	@OriginalMember(owner = "client!al", name = "z", descriptor = "Lclient!la;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!al", name = "n", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_3 = new Class231("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!al", name = "q", descriptor = "Z")
	public static boolean aBoolean7 = false;

	@OriginalMember(owner = "client!al", name = "w", descriptor = "Lclient!su;")
	public static Class233 aClass233_1 = new Class233();

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III)I")
	public static int method173(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static74.anIntArray91[arg1 & 0x3] : Static264.anIntArray398[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!ch;)V")
	public static void method174(@OriginalArg(0) Class38 arg0) {
		if (Static439.anInt7384 >= 65535) {
			return;
		}
		@Pc(6) Class2_Sub4 local6 = arg0.aClass2_Sub4_1;
		Static330.aClass38Array1[Static439.anInt7384] = arg0;
		Static457.aBooleanArray26[Static439.anInt7384] = false;
		Static439.anInt7384++;
		@Pc(21) int local21 = arg0.anInt779;
		if (arg0.aBoolean37) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt779;
		if (arg0.aBoolean38) {
			local29 = Static180.anInt3181 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method4092() + Static417.anInt7156 - local6.method4089() >> Static146.anInt2674;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method4092() + local6.method4089() - Static417.anInt7156 >> Static146.anInt2674;
			if (local73 >= Static104.anInt1675) {
				local73 = Static104.anInt1675 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray4[local41++];
				@Pc(105) int local105 = (local6.method4087() + Static417.anInt7156 - local6.method4089() >> Static146.anInt2674) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static212.anInt3636) {
					local113 = Static212.anInt3636 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static254.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static254.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static439.anInt7384;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static254.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static439.anInt7384 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static254.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static439.anInt7384 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static254.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static439.anInt7384 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIIII)V")
	public static void method175(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 - arg1 >= Static347.anInt6160 && Static385.anInt6686 >= arg4 + arg1 && Static118.anInt2005 <= arg0 - arg1 && arg0 + arg1 <= Static123.anInt2069) {
			Static28.method472(arg2, arg4, arg3, arg5, arg0, arg1);
		} else {
			Static459.method6241(arg4, arg3, arg0, arg5, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < 1 || arg6 < 1 || arg2 > Static234.anInt3949 - 2 || Static371.anInt6492 - 2 < arg6) {
			return;
		}
		@Pc(27) int local27 = arg1;
		if (arg1 < 3 && Static369.method5157(arg6, arg2)) {
			local27 = arg1 + 1;
		}
		if (!Static434.aClass165_Sub1_1.method3397(Static404.anInt2752) && !Static246.method3418(local27, Static184.anInt3250, arg6, arg2)) {
			return;
		}
		if (Static175.aClass36ArrayArrayArray1 == null) {
			return;
		}
		Static357.aClass107_Sub1_4.method2285(arg6, arg1, arg2, Static257.aClass75_8, arg3, Static89.aClass225Array2[arg1]);
		if (arg0 < 0) {
			return;
		}
		@Pc(68) boolean local68 = Static434.aClass165_Sub1_1.aBoolean303;
		Static434.aClass165_Sub1_1.aBoolean303 = true;
		Static357.aClass107_Sub1_4.method2280(Static89.aClass225Array2[arg1], arg4, arg2, arg1, arg6, arg5, local27, arg0, arg7, Static257.aClass75_8);
		Static434.aClass165_Sub1_1.aBoolean303 = local68;
		return;
	}
}
