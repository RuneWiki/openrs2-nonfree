import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "I")
	public static int anInt9548;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "Lclient!tq;")
	public static final Class343 aClass343_13 = new Class343("", 18);

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "I")
	public static int anInt9547 = 0;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method7785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg2; local7 <= arg0; local7++) {
			for (@Pc(11) int local11 = arg4; local11 <= arg3; local11++) {
				if (Static514.anIntArrayArray48[local7][local11] == arg1 && Static187.anIntArrayArray23[local7][local11] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/String;IIIIBLclient!ha;I)V")
	public static void method7787(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class95 arg5) {
		if (Static197.aClass6_12 == null || Static669.aClass6_38 == null) {
			if (Static142.aClass362_32.method8365(Static54.anInt1152) && Static142.aClass362_32.method8365(Static622.anInt10291)) {
				Static197.aClass6_12 = arg5.method8008(Static688.method8590(Static142.aClass362_32, Static54.anInt1152, 0), true);
				@Pc(49) Class370 local49 = Static688.method8590(Static142.aClass362_32, Static622.anInt10291, 0);
				Static669.aClass6_38 = arg5.method8008(local49, true);
				local49.method8603();
				Static333.aClass6_17 = arg5.method8008(local49, true);
			} else {
				arg5.aa(arg1, arg4, arg3, 20, Static666.anInt10802 | 255 - Static176.anInt3210 << 24, 1);
			}
		}
		if (Static197.aClass6_12 != null && Static669.aClass6_38 != null) {
			@Pc(76) int local76 = (arg3 - Static669.aClass6_38.method5119() * 2) / Static197.aClass6_12.method5119();
			for (@Pc(78) int local78 = 0; local78 < local76; local78++) {
				Static197.aClass6_12.method5115(arg1 + Static669.aClass6_38.method5119() + Static197.aClass6_12.method5119() * local78, arg4);
			}
			Static669.aClass6_38.method5115(arg1, arg4);
			Static333.aClass6_17.method5115(arg3 + arg1 - Static333.aClass6_17.method5119(), arg4);
		}
		Static293.aClass67_14.method7684(Static468.anInt7423 | 0xFF000000, arg1 + 3, arg4 + 14, arg0, -1);
		arg5.aa(arg1, arg4 + 20, arg3, arg2 - 20, Static666.anInt10802 | -Static176.anInt3210 + 255 << 24, 1);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
	public static void method7788() {
		Static454.aBoolean523 = false;
		Static638.anIntArrayArrayArray18 = new int[Static247.anInt4367][Static133.anInt2551 + 1][Static155.anInt2874 + 1];
		Static461.aClass272Array44 = new Class272[500];
		Static667.anInt10815 = 0;
		Static621.aClass272Array40 = new Class272[1000];
		Static232.anInt4115 = 0;
		Static393.anInt6534 = 0;
		Static592.anInt9569 = 0;
		Static589.aClass272Array37 = new Class272[500];
		Static13.anInt308 = Static599.anInt7773;
		Static165.aClass272Array7 = new Class272[2000];
		Static450.anInt7240 = Static599.anInt7773;
		if (Static50.aClass95_1 instanceof oa) {
			Static355.aBoolean420 = false;
		} else {
			Static355.aBoolean420 = true;
		}
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)V")
	public static void method7789() {
		Static62.method1135();
		@Pc(12) int local12 = Static336.aClass3_Sub41_18.aClass14_Sub2_1.method1015();
		if (local12 == 2) {
			Static540.method6918(Static13.anInt306, Static531.anInt8327, Static119.aClass95_4);
		} else if (local12 == 3) {
			Static267.method3941(Static13.anInt306, Static119.aClass95_4, Static22.anInt553, Static531.anInt8327, Static533.anInt7255);
		}
		if (Static336.aClass3_Sub41_18.aClass14_Sub2_1.method1014()) {
			Static22.method527(Static330.aCanvas5);
		}
		if (Static119.aClass95_4 != null) {
			Static397.method7855();
		}
		Static375.aBoolean532 = Static336.aClass3_Sub41_18.aClass14_Sub2_1.method1015() != 0;
		Static498.aBoolean757 = Static336.aClass3_Sub41_18.aClass14_Sub2_1.method1014();
	}
}
