import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static466 {

	@OriginalMember(owner = "client!rw", name = "g", descriptor = "[Lclient!mfa;")
	public static Class218[] aClass218Array10;

	@OriginalMember(owner = "client!rw", name = "f", descriptor = "Lclient!fca;")
	public static final Class97 aClass97_52 = new Class97(1);

	@OriginalMember(owner = "client!rw", name = "h", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_214 = new Class362(58, -2);

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IBI)V")
	public static void method7859(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static455.aFloat121 < Static455.aFloat120) {
			Static455.aFloat121 = (float) ((double) Static455.aFloat121 + (double) Static455.aFloat121 / 30.0D);
			if (Static455.aFloat121 > Static455.aFloat120) {
				Static455.aFloat121 = Static455.aFloat120;
			}
			Static484.method7227();
			Static455.anInt3438 = (int) Static455.aFloat121 >> 1;
			Static455.aByteArrayArrayArray2 = Static417.method6534(Static455.anInt3438);
		} else if (Static455.aFloat121 > Static455.aFloat120) {
			Static455.aFloat121 = (float) ((double) Static455.aFloat121 - (double) Static455.aFloat121 / 30.0D);
			if (Static455.aFloat120 > Static455.aFloat121) {
				Static455.aFloat121 = Static455.aFloat120;
			}
			Static484.method7227();
			Static455.anInt3438 = (int) Static455.aFloat121 >> 1;
			Static455.aByteArrayArrayArray2 = Static417.method6534(Static455.anInt3438);
		}
		if (Static189.anInt3714 != -1 && Class1_Sub4_Sub4_Sub2.lb != -1) {
			@Pc(85) int local85 = Static189.anInt3714 - Static529.anInt9422;
			if (local85 < 2 || local85 > 2) {
				local85 /= 8;
			}
			@Pc(104) int local104 = Class1_Sub4_Sub4_Sub2.lb - Static480.anInt10076;
			if (local104 < 2 || local104 > 2) {
				local104 /= 8;
			}
			Static529.anInt9422 -= -local85;
			Static480.anInt10076 += local104;
			if (local85 == 0 && local104 == 0) {
				Class1_Sub4_Sub4_Sub2.lb = -1;
				Static189.anInt3714 = -1;
			}
			Static484.method7227();
		}
		if (Static77.anInt1283 <= 0) {
			Static387.anInt7402 = -1;
			Static257.anInt4733 = -1;
		} else {
			Static425.anInt7984--;
			if (Static425.anInt7984 == 0) {
				Static425.anInt7984 = 100;
				Static77.anInt1283--;
			}
		}
		if (!Static517.aBoolean648 || Static264.aClass244_39 == null) {
			return;
		}
		for (@Pc(169) Class4_Sub32 local169 = (Class4_Sub32) Static264.aClass244_39.method5963(); local169 != null; local169 = (Class4_Sub32) Static264.aClass244_39.method5965()) {
			@Pc(178) Class338 local178 = Static455.aClass142_2.method3366(local169.aClass4_Sub17_1.anInt2866);
			if (local169.method6073(arg1, arg0)) {
				if (local178.aStringArray68 != null) {
					if (local178.aStringArray68[4] != null) {
						Static369.method5938((long) local169.aClass4_Sub17_1.anInt2866, 1004, false, -1, -1, 0, local178.aStringArray68[4], local178.anInt9770, true, local178.aString93);
					}
					if (local178.aStringArray68[3] != null) {
						Static369.method5938((long) local169.aClass4_Sub17_1.anInt2866, 1010, false, -1, -1, 0, local178.aStringArray68[3], local178.anInt9770, true, local178.aString93);
					}
					if (local178.aStringArray68[2] != null) {
						Static369.method5938((long) local169.aClass4_Sub17_1.anInt2866, 1012, false, -1, -1, 0, local178.aStringArray68[2], local178.anInt9770, true, local178.aString93);
					}
					if (local178.aStringArray68[1] != null) {
						Static369.method5938((long) local169.aClass4_Sub17_1.anInt2866, 1008, false, -1, -1, 0, local178.aStringArray68[1], local178.anInt9770, true, local178.aString93);
					}
					if (local178.aStringArray68[0] != null) {
						Static369.method5938((long) local169.aClass4_Sub17_1.anInt2866, 1002, false, -1, -1, 0, local178.aStringArray68[0], local178.anInt9770, true, local178.aString93);
					}
				}
				if (!local169.aClass4_Sub17_1.aBoolean214) {
					local169.aClass4_Sub17_1.aBoolean214 = true;
					Static388.method6111(Static192.aClass147_6, local169.aClass4_Sub17_1.anInt2866, local178.anInt9770);
				}
				if (local169.aClass4_Sub17_1.aBoolean214) {
					Static388.method6111(Static24.aClass147_1, local169.aClass4_Sub17_1.anInt2866, local178.anInt9770);
				}
			} else if (local169.aClass4_Sub17_1.aBoolean214) {
				local169.aClass4_Sub17_1.aBoolean214 = false;
				Static388.method6111(Static90.aClass147_3, local169.aClass4_Sub17_1.anInt2866, local178.anInt9770);
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)V")
	public static void method7860(@OriginalArg(0) int arg0) {
		Static480.anInt10076 = arg0;
		Class1_Sub4_Sub4_Sub2.lb = -1;
		Class1_Sub4_Sub4_Sub2.lb = -1;
		Static484.method7227();
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "([[[BIIIIIIIIIIILclient!r;)V")
	public static void method7861(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) Class44 arg11) {
		if (arg10 == 0 || arg8 == 0) {
			return;
		}
		if (arg10 == 9) {
			arg10 = 1;
			arg7 = arg7 + 1 & 0x3;
		}
		if (arg10 == 10) {
			arg7 = arg7 + 3 & 0x3;
			arg10 = 1;
		}
		if (arg10 == 11) {
			arg10 = 8;
			arg7 = arg7 + 3 & 0x3;
		}
		arg11.IA(arg6, arg2, arg5, arg4, arg3, arg9, arg0[arg10 - 1][arg7], arg8, arg1);
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lclient!na;Z)V")
	public static void method7865(@OriginalArg(0) Class1_Sub4_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort121; local2 <= arg0.aShort122; local2++) {
			for (@Pc(6) int local6 = arg0.aShort120; local6 <= arg0.aShort119; local6++) {
				@Pc(16) Class53 local16 = Static60.aClass53ArrayArrayArray1[arg0.aByte126][local2][local6];
				if (local16 != null) {
					@Pc(21) Class289 local21 = local16.aClass289_1;
					@Pc(23) Class289 local23 = null;
					while (local21 != null) {
						if (local21.aClass1_Sub4_Sub2_1 == arg0) {
							if (local23 == null) {
								local16.aClass289_1 = local21.aClass289_3;
							} else {
								local23.aClass289_3 = local21.aClass289_3;
							}
							local21.method6964();
							break;
						}
						local23 = local21;
						local21 = local21.aClass289_3;
					}
				}
			}
		}
		if (!arg1) {
			Static591.method8355(arg0);
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)V")
	public static void method7866() {
		Static9.anImage1 = null;
		Static179.aFont1 = null;
	}
}
