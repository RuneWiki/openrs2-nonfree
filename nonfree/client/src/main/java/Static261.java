import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "Lclient!li;")
	public static Class158 aClass158_9;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_76 = new Class15("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "Lclient!ud;")
	public static final Class245 aClass245_11 = new Class245(2, 4, 4, 0);

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "Z")
	public static boolean aBoolean315 = false;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "Z")
	public static boolean aBoolean316 = false;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method3388(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!bf;III)V")
	public static void method3392(@OriginalArg(1) Class8_Sub3_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class42 local9 = arg0.method5892();
		@Pc(19) int local19 = arg0.anInt7378 - arg0.aClass120_7.anInt3014 & 0x3FFF;
		if (arg3 == -1) {
			if (local19 != 0 || arg0.anInt7412 > 25) {
				arg0.aBoolean519 = false;
				if (arg1 < 0 && local9.anInt1046 != -1) {
					arg0.anInt7389 = local9.anInt1046;
				} else if (arg1 <= 0 || local9.anInt1023 == -1) {
					arg0.anInt7389 = local9.anInt1014;
				} else {
					arg0.anInt7389 = local9.anInt1023;
				}
			} else if (!arg0.aBoolean519 || !local9.method817(arg0.anInt7389)) {
				arg0.anInt7389 = local9.method816();
				arg0.aBoolean519 = arg0.anInt7389 != -1;
			}
		} else if (arg0.anInt7394 != -1 && (local19 >= 10240 || local19 <= 2048)) {
			@Pc(115) int local115 = Static21.anIntArray21[arg2] - arg0.aClass120_7.anInt3014 & 0x3FFF;
			if (arg3 == 2 && local9.anInt1010 != -1) {
				if (local115 > 2048 && local115 <= 6144 && local9.anInt1029 != -1) {
					arg0.anInt7389 = local9.anInt1029;
				} else if (local115 >= 10240 && local115 < 14336 && local9.anInt1015 != -1) {
					arg0.anInt7389 = local9.anInt1015;
				} else if (local115 <= 6144 || local115 >= 10240 || local9.anInt1027 == -1) {
					arg0.anInt7389 = local9.anInt1010;
				} else {
					arg0.anInt7389 = local9.anInt1027;
				}
			} else if (arg3 == 0 && local9.anInt1009 != -1) {
				if (local115 > 2048 && local115 <= 6144 && local9.anInt1025 != -1) {
					arg0.anInt7389 = local9.anInt1025;
				} else if (local115 >= 10240 && local115 < 14336 && local9.anInt1048 != -1) {
					arg0.anInt7389 = local9.anInt1048;
				} else if (local115 <= 6144 || local115 >= 10240 || local9.anInt1037 == -1) {
					arg0.anInt7389 = local9.anInt1009;
				} else {
					arg0.anInt7389 = local9.anInt1037;
				}
			} else if (local115 > 2048 && local115 <= 6144 && local9.anInt1038 != -1) {
				arg0.anInt7389 = local9.anInt1038;
			} else if (local115 >= 10240 && local115 < 14336 && local9.anInt1033 != -1) {
				arg0.anInt7389 = local9.anInt1033;
			} else if (local115 <= 6144 || local115 >= 10240 || local9.anInt1043 == -1) {
				arg0.anInt7389 = local9.anInt1014;
			} else {
				arg0.anInt7389 = local9.anInt1043;
			}
			arg0.aBoolean519 = false;
		} else if (local19 == 0 && arg0.anInt7412 <= 25) {
			arg0.aBoolean519 = false;
			if (arg3 == 2 && local9.anInt1010 != -1) {
				arg0.anInt7389 = local9.anInt1010;
			} else if (arg3 == 0 && local9.anInt1009 != -1) {
				arg0.anInt7389 = local9.anInt1009;
			} else {
				arg0.anInt7389 = local9.anInt1014;
			}
		} else {
			if (arg3 == 2 && local9.anInt1010 != -1) {
				if (arg1 < 0 && local9.anInt1017 != -1) {
					arg0.anInt7389 = local9.anInt1017;
				} else if (arg1 <= 0 || local9.anInt1011 == -1) {
					arg0.anInt7389 = local9.anInt1010;
				} else {
					arg0.anInt7389 = local9.anInt1011;
				}
			} else if (arg3 == 0 && local9.anInt1009 != -1) {
				if (arg1 < 0 && local9.anInt1028 != -1) {
					arg0.anInt7389 = local9.anInt1028;
				} else if (arg1 <= 0 || local9.anInt1042 == -1) {
					arg0.anInt7389 = local9.anInt1009;
				} else {
					arg0.anInt7389 = local9.anInt1042;
				}
			} else if (arg1 < 0 && local9.anInt1007 != -1) {
				arg0.anInt7389 = local9.anInt1007;
			} else if (arg1 <= 0 || local9.anInt1041 == -1) {
				arg0.anInt7389 = local9.anInt1014;
			} else {
				arg0.anInt7389 = local9.anInt1041;
			}
			arg0.aBoolean519 = false;
		}
	}
}
