import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "Lclient!kd;")
	public static Class13 aClass13_2;

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
	public static int anInt4198 = 0;

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "Z")
	public static boolean aBoolean264 = false;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IILclient!sg;I)V")
	public static void method3630(@OriginalArg(0) int arg0, @OriginalArg(2) Class11_Sub5_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt6505 == arg0 && arg0 != -1) {
			@Pc(22) Class130 local22 = Static143.aClass85_1.method2406(arg0);
			@Pc(25) int local25 = local22.anInt3937;
			if (local25 == 1) {
				arg1.anInt6479 = 0;
				arg1.anInt6487 = 1;
				arg1.anInt6496 = arg2;
				arg1.anInt6502 = 0;
				arg1.anInt6543 = 0;
				Static125.method2339(arg1.anInt7514, arg1.anInt6543, arg1.anInt7515, false, local22, arg1.aByte100);
			}
			if (local25 == 2) {
				arg1.anInt6502 = 0;
				return;
			}
		} else if (arg0 == -1 || arg1.anInt6505 == -1 || Static143.aClass85_1.method2406(arg0).anInt3938 >= Static143.aClass85_1.method2406(arg1.anInt6505).anInt3938) {
			arg1.anInt6505 = arg0;
			arg1.anInt6487 = 1;
			arg1.anInt6543 = 0;
			arg1.anInt6496 = arg2;
			arg1.anInt6550 = arg1.anInt6549;
			arg1.anInt6502 = 0;
			arg1.anInt6479 = 0;
			if (arg1.anInt6505 == -1) {
				return;
			}
			Static125.method2339(arg1.anInt7514, arg1.anInt6543, arg1.anInt7515, false, Static143.aClass85_1.method2406(arg1.anInt6505), arg1.aByte100);
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!ba;IIIIZLclient!qa;)V")
	public static void method3631(@OriginalArg(0) Class18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class30 arg5) {
		if (arg4) {
			Static218.aClass2_23.method5921((Static374.anInt6595 - Static218.aClass2_23.d()) / 2, (Static30.anInt518 - Static218.aClass2_23.ga()) / 2);
			Static15.aClass2_3.method5921((Static374.anInt6595 - Static15.aClass2_3.d()) / 2, 18);
		}
		@Pc(36) String local36 = "";
		if (Static50.aClass235_4 == Static332.aClass235_6) {
			local36 = Static278.aClass21_79.method362(Static168.anInt3290);
		} else if (Static332.aClass235_6 == Static323.aClass235_5) {
			local36 = Static433.aClass21_11.method362(Static168.anInt3290);
		}
		arg0.method5772(arg2, Static374.anInt6595 / 2, Static30.anInt518 / 2 - 26, local36, -1);
		@Pc(74) int local74 = Static30.anInt518 / 2 - 18;
		arg5.method2074(Static374.anInt6595 / 2 - 152, local74, 304, 34, arg3, 0);
		arg5.method2074(Static374.anInt6595 / 2 - 151, local74 + 1, 302, 32, 0, 0);
		arg5.M(Static374.anInt6595 / 2 - 150, local74 - -2, Static15.anInt305 * 3, 30, arg1, 0);
		arg5.M(Static374.anInt6595 / 2 + Static15.anInt305 * 3 - 150, local74 - -2, 300 - Static15.anInt305 * 3, 30, 0, 0);
		arg0.method5772(arg2, Static374.anInt6595 / 2, Static30.anInt518 / 2 + 4, Static240.aString42, -1);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
	public static void method3632() {
		Static266.anInt5060 = 0;
		Static157.anInt3219 = 0;
		Static117.anInt4907 = 0;
		Static9.anInt192 = 0;
	}
}
