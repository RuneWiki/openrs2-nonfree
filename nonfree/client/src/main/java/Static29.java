import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!baa", name = "y", descriptor = "[Lclient!i;")
	public static Class139[] aClass139Array6;

	@OriginalMember(owner = "client!baa", name = "x", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_22 = new Class272(90, -2);

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "()V")
	public static void method540() {
		for (@Pc(1) int local1 = Static137.anInt2940; local1 < Static499.anInt7950; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static411.anInt6927; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static157.anInt3168; local7++) {
					@Pc(16) Class63 local16 = Static554.aClass63ArrayArrayArray4[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class9_Sub1_Sub4 local21 = local16.aClass9_Sub1_Sub4_1;
						@Pc(24) Class9_Sub1_Sub4 local24 = local16.aClass9_Sub1_Sub4_2;
						if (local21 != null && local21.method7483()) {
							Static520.method6926(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method7483()) {
								Static520.method6926(local24, local1, local4, local7, 1, 1);
								local24.method7479(0, local21, 0, 0, Static482.aClass43_12, false);
								local24.method7477();
							}
							local21.method7477();
						}
						for (@Pc(68) Class16 local68 = local16.aClass16_3; local68 != null; local68 = local68.aClass16_1) {
							@Pc(72) Class9_Sub1_Sub1 local72 = local68.aClass9_Sub1_Sub1_1;
							if (local72 != null && local72.method7483()) {
								Static520.method6926(local72, local1, local4, local7, local72.aShort114 + 1 - local72.aShort112, local72.aShort113 - local72.aShort115 + 1);
								local72.method7477();
							}
						}
						@Pc(108) Class9_Sub1_Sub3 local108 = local16.aClass9_Sub1_Sub3_1;
						if (local108 != null && local108.method7483()) {
							Static68.method3623(local108, local1, local4, local7);
							local108.method7477();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(BI)Z")
	public static boolean method541(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IIC)C")
	public static char method542(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		if (arg1 >= 'À' && arg1 <= 'ÿ') {
			if (arg1 >= 'À' && arg1 <= 'Æ') {
				return 'A';
			}
			if (arg1 == 'Ç') {
				return 'C';
			}
			if (arg1 >= 'È' && arg1 <= 'Ë') {
				return 'E';
			}
			if (arg1 >= 'Ì' && arg1 <= 'Ï') {
				return 'I';
			}
			if (arg1 >= 'Ò' && arg1 <= 'Ö') {
				return 'O';
			}
			if (arg1 >= 'Ù' && arg1 <= 'Ü') {
				return 'U';
			}
			if (arg1 == 'Ý') {
				return 'Y';
			}
			if (arg1 == 'ß') {
				return 's';
			}
			if (arg1 >= 'à' && arg1 <= 'æ') {
				return 'a';
			}
			if (arg1 == 'ç') {
				return 'c';
			}
			if (arg1 >= 'è' && arg1 <= 'ë') {
				return 'e';
			}
			if (arg1 >= 'ì' && arg1 <= 'ï') {
				return 'i';
			}
			if (arg1 >= 'ò' && arg1 <= 'ö') {
				return 'o';
			}
			if (arg1 >= 'ù' && arg1 <= 'ü') {
				return 'u';
			}
			if (arg1 == 'ý' || arg1 == 'ÿ') {
				return 'y';
			}
		}
		if (arg1 == 'Œ') {
			return 'O';
		} else if (arg1 == 'œ') {
			return 'o';
		} else if (arg1 == 'Ÿ') {
			return 'Y';
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Ljava/awt/Canvas;ILclient!fa;I)Lclient!r;")
	public static Class43 method543(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Interface8 arg1, @OriginalArg(3) int arg2) {
		return new Class43_Sub3(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(B[SI)[S")
	public static short[] method544(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) short[] local11 = new short[arg1];
		Static604.method5913(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IIB)V")
	public static void method546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub3_Sub7 local8 = Static363.method5457(arg1, 16);
		local8.method839();
		local8.anInt1088 = arg0;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IIIZB)V")
	public static void method547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Static385.aLong188 = 0L;
		@Pc(12) int local12 = Static294.method4660();
		if (arg1 == 3 || local12 == 3) {
			arg3 = true;
		}
		if (!Static4.aClass43_1.method7173()) {
			arg3 = true;
		}
		Static184.method3180(arg2, arg0, arg1, arg3, local12);
	}
}
