import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!qi", name = "Q", descriptor = "I")
	public static int anInt7550;

	@OriginalMember(owner = "client!qi", name = "R", descriptor = "Lclient!ha;")
	public static Class84 aClass84_19;

	@OriginalMember(owner = "client!qi", name = "I", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_115 = new Class45(9, 6);

	@OriginalMember(owner = "client!qi", name = "L", descriptor = "Lclient!tl;")
	public static final Class285 aClass285_5 = new Class285("WTI", 5);

	@OriginalMember(owner = "client!qi", name = "N", descriptor = "[I")
	public static final int[] anIntArray503 = new int[1];

	@OriginalMember(owner = "client!qi", name = "O", descriptor = "[S")
	public static short[] aShortArray103 = new short[256];

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZZ)Z")
	public static boolean method6303(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)J")
	public static long method6304() {
		return Static30.aClass89_2.method6694();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIII)V")
	public static void method6305(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static208.aClass12_Sub10_Sub1_1.anInt2232 != 0 && arg0 != 0 && Static39.anInt790 < 50 && arg2 != -1) {
			Static308.aClass195Array1[Static39.anInt790++] = new Class195((byte) 1, arg2, arg0, arg1, arg3, 0);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBII)I")
	public static int method6306(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 1023 - arg0;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!an;Lclient!an;)I")
	public static int method6307(@OriginalArg(1) Class16 arg0, @OriginalArg(2) Class16 arg1) {
		@Pc(10) int local10 = 0;
		if (arg1.method389(Static208.anInt4588)) {
			local10++;
		}
		if (arg1.method389(Static206.anInt9617)) {
			local10++;
		}
		if (arg1.method389(Static461.anInt8356)) {
			local10++;
		}
		if (arg0.method389(Static208.anInt4588)) {
			local10++;
		}
		if (arg0.method389(Static206.anInt9617)) {
			local10++;
		}
		if (arg0.method389(Static461.anInt8356)) {
			local10++;
		}
		return local10;
	}
}
