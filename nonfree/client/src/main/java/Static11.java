import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "[I")
	public static int[] anIntArray14;

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
	public static int anInt194;

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "Lclient!lf;")
	public static Class49 aClass49_102 = Static32.method683("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
	public static int anInt189 = 0;

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "Lclient!lf;")
	public static Class49 aClass49_103 = Static32.method683("<col=40ff00>");

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
	public static void method161() {
		try {
			if (Static78.anInt1631 == 1) {
				@Pc(12) int local12 = Static61.aClass2_Sub14_Sub3_1.method2545();
				if (local12 > 0 && Static61.aClass2_Sub14_Sub3_1.method2558()) {
					local12 -= Static66.anInt1395;
					if (local12 < 0) {
						local12 = 0;
					}
					Static61.aClass2_Sub14_Sub3_1.method2574(local12);
					return;
				}
				Static61.aClass2_Sub14_Sub3_1.method2577();
				Static61.aClass2_Sub14_Sub3_1.method2552();
				if (Static15.aClass11_16 == null) {
					Static78.anInt1631 = 0;
				} else {
					Static78.anInt1631 = 2;
				}
				Static79.aClass13_41 = null;
				Static37.aClass2_Sub23_1 = null;
			}
		} catch (@Pc(51) Exception local51) {
			local51.printStackTrace();
			Static61.aClass2_Sub14_Sub3_1.method2577();
			Static78.anInt1631 = 0;
			Static37.aClass2_Sub23_1 = null;
			Static79.aClass13_41 = null;
			Static15.aClass11_16 = null;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILclient!lf;SJILclient!lf;)V")
	public static void method162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class49 arg2, @OriginalArg(3) short arg3, @OriginalArg(4) long arg4, @OriginalArg(6) Class49 arg5) {
		if (Static47.aBoolean40 || Static133.anInt3713 >= 500) {
			return;
		}
		Static102.aClass49Array15[Static133.anInt3713] = arg2;
		Static161.aClass49Array19[Static133.anInt3713] = arg5;
		Static30.aShortArray1[Static133.anInt3713] = arg3;
		Static66.aLongArray10[Static133.anInt3713] = arg4;
		Static130.anIntArray347[Static133.anInt3713] = arg1;
		Static177.anIntArray362[Static133.anInt3713] = arg0;
		Static133.anInt3713++;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
	public static void method163() {
		anIntArray14 = null;
		aClass49_102 = null;
		aClass49_103 = null;
	}
}
