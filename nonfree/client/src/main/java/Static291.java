import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!sm", name = "N", descriptor = "Lclient!pf;")
	public static Class156 aClass156_103;

	@OriginalMember(owner = "client!sm", name = "F", descriptor = "[I")
	public static final int[] anIntArray446 = new int[50];

	@OriginalMember(owner = "client!sm", name = "M", descriptor = "I")
	public static int anInt5765 = 0;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIII)I")
	public static int method4841(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class140.anIntArray329[arg0 * 8192 / arg1] >> 1;
		return ((65536 - local16) * arg3 >> 16) + (local16 * arg2 >> 16);
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)V")
	public static void method4842(@OriginalArg(0) int arg0) {
		Static103.anInt1865 = arg0;
		@Pc(17) Class26 local17 = Static262.aClass26_48;
		synchronized (Static262.aClass26_48) {
			Static262.aClass26_48.method333();
		}
	}

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "(I)V")
	public static void method4844() {
		if (Static167.aString29.toLowerCase().indexOf("microsoft") != -1) {
			Static20.anIntArray23[188] = 71;
			Static20.anIntArray23[220] = 74;
			Static20.anIntArray23[187] = 27;
			Static20.anIntArray23[190] = 72;
			Static20.anIntArray23[189] = 26;
			Static20.anIntArray23[192] = 58;
			Static20.anIntArray23[221] = 43;
			Static20.anIntArray23[191] = 73;
			Static20.anIntArray23[186] = 57;
			Static20.anIntArray23[219] = 42;
			Static20.anIntArray23[222] = 59;
			Static20.anIntArray23[223] = 28;
			return;
		}
		Static20.anIntArray23[47] = 73;
		Static20.anIntArray23[61] = 27;
		Static20.anIntArray23[59] = 57;
		Static20.anIntArray23[46] = 72;
		Static20.anIntArray23[44] = 71;
		Static20.anIntArray23[91] = 42;
		Static20.anIntArray23[93] = 43;
		Static20.anIntArray23[45] = 26;
		if (Static167.aMethod1 == null) {
			Static20.anIntArray23[222] = 59;
			Static20.anIntArray23[192] = 58;
		} else {
			Static20.anIntArray23[520] = 59;
			Static20.anIntArray23[192] = 28;
			Static20.anIntArray23[222] = 58;
		}
		Static20.anIntArray23[92] = 74;
	}

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "(I)Z")
	public static boolean method4846() {
		try {
			if (Static329.anInt6323 == 2) {
				if (Static241.aClass11_Sub3_2 == null) {
					Static241.aClass11_Sub3_2 = Static358.method200(Static177.aClass144_46, Static281.anInt5587, Static190.anInt3890);
					if (Static241.aClass11_Sub3_2 == null) {
						return false;
					}
				}
				if (Static279.aClass139_1 == null) {
					Static279.aClass139_1 = new Class139(Static219.aClass144_68, Static326.aClass144_95);
				}
				if (Static309.aClass11_Sub10_Sub4_3.method4082(Static76.aClass144_90, Static279.aClass139_1, Static241.aClass11_Sub3_2)) {
					Static309.aClass11_Sub10_Sub4_3.method4080();
					Static309.aClass11_Sub10_Sub4_3.method4096(Static178.anInt3536);
					Static309.aClass11_Sub10_Sub4_3.method4081(Static241.aClass11_Sub3_2, Static226.aBoolean305);
					Static279.aClass139_1 = null;
					Static177.aClass144_46 = null;
					Static241.aClass11_Sub3_2 = null;
					Static329.anInt6323 = 0;
					return true;
				}
			}
		} catch (@Pc(64) Exception local64) {
			local64.printStackTrace();
			Static309.aClass11_Sub10_Sub4_3.method4092();
			Static279.aClass139_1 = null;
			Static329.anInt6323 = 0;
			Static241.aClass11_Sub3_2 = null;
			Static177.aClass144_46 = null;
		}
		return false;
	}
}
