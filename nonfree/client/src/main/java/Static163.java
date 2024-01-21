import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
	public static int anInt3620;

	@OriginalMember(owner = "client!uc", name = "T", descriptor = "I")
	public static int anInt3624;

	@OriginalMember(owner = "client!uc", name = "Y", descriptor = "Lclient!se;")
	public static Class3_Sub5_Sub3 aClass3_Sub5_Sub3_2;

	@OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
	public static int anInt3621 = 0;

	@OriginalMember(owner = "client!uc", name = "Q", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1308 = Static65.method1172("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!uc", name = "R", descriptor = "I")
	public static int anInt3623 = 0;

	@OriginalMember(owner = "client!uc", name = "S", descriptor = "[I")
	public static int[] anIntArray409 = new int[25];

	@OriginalMember(owner = "client!uc", name = "U", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1309 = Static65.method1172("Fallen lassen");

	@OriginalMember(owner = "client!uc", name = "Z", descriptor = "I")
	public static int anInt3627 = 0;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIILclient!dd;)V")
	public static void method2611(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub2_Sub1_Sub1_Sub1 arg2) {
		if (arg1 == arg2.anInt1738 && arg1 != -1) {
			@Pc(27) int local27 = Static35.method628(arg1).anInt941;
			if (local27 == 1) {
				arg2.anInt1726 = arg0;
				arg2.anInt1731 = 0;
				arg2.anInt1706 = 0;
				arg2.anInt1681 = 0;
			}
			if (local27 == 2) {
				arg2.anInt1731 = 0;
				return;
			}
		} else if (arg1 == -1 || arg2.anInt1738 == -1 || Static35.method628(arg1).anInt943 >= Static35.method628(arg2.anInt1738).anInt943) {
			arg2.anInt1715 = arg2.anInt1724;
			arg2.anInt1706 = 0;
			arg2.anInt1738 = arg1;
			arg2.anInt1726 = arg0;
			arg2.anInt1681 = 0;
			arg2.anInt1731 = 0;
		}
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V")
	public static void method2612() {
		aClass46_1309 = null;
		aClass46_1308 = null;
		anIntArray409 = null;
		aClass3_Sub5_Sub3_2 = null;
	}
}
