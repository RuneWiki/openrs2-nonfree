import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!sn", name = "m", descriptor = "Lclient!kn;")
	public static Class1_Sub2_Sub11_Sub2 aClass1_Sub2_Sub11_Sub2_4;

	@OriginalMember(owner = "client!sn", name = "n", descriptor = "Lclient!km;")
	public static Class91 aClass91_176;

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "Lclient!qc;")
	public static Class135 aClass135_31 = new Class135(64);

	@OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
	public static int anInt4896 = 0;

	@OriginalMember(owner = "client!sn", name = "o", descriptor = "[I")
	public static int[] anIntArray427 = new int[5];

	@OriginalMember(owner = "client!sn", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString286 = "skill: ";

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)I")
	public static int method3813(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!in;B)Z")
	public static boolean method3815(@OriginalArg(0) Class71 arg0) {
		if (arg0.anIntArray246 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray246.length; local12++) {
			@Pc(27) int local27 = Static15.method301(local12, arg0);
			@Pc(32) int local32 = arg0.anIntArray234[local12];
			if (arg0.anIntArray246[local12] == 2) {
				if (local32 <= local27) {
					return false;
				}
			} else if (arg0.anIntArray246[local12] == 3) {
				if (local27 <= local32) {
					return false;
				}
			} else if (arg0.anIntArray246[local12] == 4) {
				if (local27 == local32) {
					return false;
				}
			} else if (local27 != local32) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIII)V")
	public static void method3816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3;
		@Pc(14) int local14;
		for (local3 = arg4; local3 <= arg2 + arg4; local3++) {
			for (local14 = arg3; local14 <= arg3 + arg1; local14++) {
				if (local14 >= 0 && local14 < 104 && local3 >= 0 && local3 < 104) {
					Static5.aByteArrayArrayArray4[arg0][local14][local3] = 127;
				}
			}
		}
		for (local3 = arg4; local3 < arg4 + arg2; local3++) {
			for (local14 = arg3; local14 < arg3 + arg1; local14++) {
				if (local14 >= 0 && local14 < 104 && local3 >= 0 && local3 < 104) {
					Static55.anIntArrayArrayArray3[arg0][local14][local3] = arg0 <= 0 ? 0 : Static55.anIntArrayArrayArray3[arg0 - 1][local14][local3];
				}
			}
		}
		if (arg3 > 0 && arg3 < 104) {
			for (local3 = arg4 + 1; local3 < arg4 + arg2; local3++) {
				if (local3 >= 0 && local3 < 104) {
					Static55.anIntArrayArrayArray3[arg0][arg3][local3] = Static55.anIntArrayArrayArray3[arg0][arg3 - 1][local3];
				}
			}
		}
		if (arg4 > 0 && arg4 < 104) {
			for (local3 = arg3 + 1; local3 < arg1 + arg3; local3++) {
				if (local3 >= 0 && local3 < 104) {
					Static55.anIntArrayArrayArray3[arg0][local3][arg4] = Static55.anIntArrayArrayArray3[arg0][local3][arg4 - 1];
				}
			}
		}
		if (arg3 < 0 || arg4 < 0 || arg3 >= 104 || arg4 >= 104) {
			return;
		}
		if (arg0 == 0) {
			if (arg3 > 0 && Static55.anIntArrayArrayArray3[arg0][arg3 - 1][arg4] != 0) {
				Static55.anIntArrayArrayArray3[arg0][arg3][arg4] = Static55.anIntArrayArrayArray3[arg0][arg3 - 1][arg4];
			} else if (arg4 > 0 && Static55.anIntArrayArrayArray3[arg0][arg3][arg4 - 1] != 0) {
				Static55.anIntArrayArrayArray3[arg0][arg3][arg4] = Static55.anIntArrayArrayArray3[arg0][arg3][arg4 - 1];
			} else if (arg3 > 0 && arg4 > 0 && Static55.anIntArrayArrayArray3[arg0][arg3 - 1][arg4 - 1] != 0) {
				Static55.anIntArrayArrayArray3[arg0][arg3][arg4] = Static55.anIntArrayArrayArray3[arg0][arg3 - 1][arg4 - 1];
			}
		} else if (arg3 > 0 && Static55.anIntArrayArrayArray3[arg0 - 1][arg3 - 1][arg4] != Static55.anIntArrayArrayArray3[arg0][arg3 - 1][arg4]) {
			Static55.anIntArrayArrayArray3[arg0][arg3][arg4] = Static55.anIntArrayArrayArray3[arg0][arg3 - 1][arg4];
		} else if (arg4 > 0 && Static55.anIntArrayArrayArray3[arg0][arg3][arg4 - 1] != Static55.anIntArrayArrayArray3[arg0 - 1][arg3][arg4 - 1]) {
			Static55.anIntArrayArrayArray3[arg0][arg3][arg4] = Static55.anIntArrayArrayArray3[arg0][arg3][arg4 - 1];
		} else if (arg3 > 0 && arg4 > 0 && Static55.anIntArrayArrayArray3[arg0 - 1][arg3 - 1][arg4 - 1] != Static55.anIntArrayArrayArray3[arg0][arg3 - 1][arg4 - 1]) {
			Static55.anIntArrayArrayArray3[arg0][arg3][arg4] = Static55.anIntArrayArrayArray3[arg0][arg3 - 1][arg4 - 1];
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
	public static void method3818() {
		Static68.anInt1450 = 0;
		Static1.anInt4241 = 0;
		Static256.method3914();
		Static161.method2787();
		Static199.method3242();
		Static297.method4458();
		@Pc(19) int local19;
		for (local19 = 0; local19 < Static68.anInt1450; local19++) {
			@Pc(26) int local26 = Static59.anIntArray358[local19];
			if (Static237.anInt4710 != Static98.aClass14_Sub2_Sub1Array1[local26].anInt4645) {
				if (Static98.aClass14_Sub2_Sub1Array1[local26].anInt1718 > 0) {
					Static187.method3139(Static98.aClass14_Sub2_Sub1Array1[local26]);
				}
				Static98.aClass14_Sub2_Sub1Array1[local26] = null;
			}
		}
		if (Static33.anInt762 != Static187.aClass1_Sub11_Sub1_2.anInt3264) {
			throw new RuntimeException("gpp1 pos:" + Static187.aClass1_Sub11_Sub1_2.anInt3264 + " psize:" + Static33.anInt762);
		}
		for (local19 = 0; local19 < Static278.anInt5374; local19++) {
			if (Static98.aClass14_Sub2_Sub1Array1[Static17.anIntArray444[local19]] == null) {
				throw new RuntimeException("gpp2 pos:" + local19 + " size:" + Static278.anInt5374);
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BLclient!wa;Ljava/awt/Frame;)V")
	public static void method3819(@OriginalArg(1) Class175 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(6) Class116 local6 = arg0.method4324(arg1);
			while (local6.anInt3812 == 0) {
				Static48.method934(10L);
			}
			if (local6.anInt3812 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static48.method934(100L);
		}
	}
}
