import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1022 = Static177.method3050(" x ");

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1023 = Static177.method3050("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
	public static int anInt2767 = 0;

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "[I")
	public static final int[] anIntArray257 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1024 = Static177.method3050("<col=00ffff>");

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1025 = aClass46_1023;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public static void method2091() {
		if (Static150.aString4.toLowerCase().indexOf("microsoft") != -1) {
			Static144.anIntArray319[192] = 58;
			Static144.anIntArray319[223] = 28;
			Static144.anIntArray319[190] = 72;
			Static144.anIntArray319[188] = 71;
			Static144.anIntArray319[222] = 59;
			Static144.anIntArray319[191] = 73;
			Static144.anIntArray319[186] = 57;
			Static144.anIntArray319[220] = 74;
			Static144.anIntArray319[189] = 26;
			Static144.anIntArray319[219] = 42;
			Static144.anIntArray319[221] = 43;
			Static144.anIntArray319[187] = 27;
			return;
		}
		Static144.anIntArray319[45] = 26;
		Static144.anIntArray319[93] = 43;
		Static144.anIntArray319[59] = 57;
		Static144.anIntArray319[46] = 72;
		if (Static150.aMethod1 == null) {
			Static144.anIntArray319[192] = 58;
			Static144.anIntArray319[222] = 59;
		} else {
			Static144.anIntArray319[192] = 28;
			Static144.anIntArray319[222] = 58;
			Static144.anIntArray319[520] = 59;
		}
		Static144.anIntArray319[47] = 73;
		Static144.anIntArray319[92] = 74;
		Static144.anIntArray319[44] = 71;
		Static144.anIntArray319[91] = 42;
		Static144.anIntArray319[61] = 27;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!ac;)V")
	public static void method2093(@OriginalArg(1) Class4_Sub1_Sub1_Sub1 arg0) {
		if (Static142.anInt3325 == arg0.anInt2821 || arg0.anInt2808 == -1 || arg0.anInt2840 != 0 || arg0.anInt2837 + 1 > Static137.method2394(arg0.anInt2808).anIntArray50[arg0.anInt2844]) {
			@Pc(36) int local36 = arg0.anInt2821 - arg0.anInt2835;
			@Pc(41) int local41 = Static142.anInt3325 - arg0.anInt2835;
			@Pc(51) int local51 = arg0.anInt2805 * 64 + arg0.anInt2806 * 128;
			@Pc(62) int local62 = arg0.anInt2842 * 128 + arg0.anInt2805 * 64;
			@Pc(73) int local73 = arg0.anInt2802 * 128 + arg0.anInt2805 * 64;
			arg0.anInt2832 = (local73 * (local36 - local41) + local62 * local41) / local36;
			@Pc(98) int local98 = arg0.anInt2804 * 128 + arg0.anInt2805 * 64;
			arg0.anInt2803 = ((local36 - local41) * local51 + local41 * local98) / local36;
		}
		if (arg0.anInt2815 == 0) {
			arg0.anInt2829 = 1024;
		}
		if (arg0.anInt2815 == 1) {
			arg0.anInt2829 = 1536;
		}
		arg0.anInt2838 = 0;
		if (arg0.anInt2815 == 2) {
			arg0.anInt2829 = 0;
		}
		if (arg0.anInt2815 == 3) {
			arg0.anInt2829 = 512;
		}
		arg0.anInt2822 = arg0.anInt2829;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZIIII)I")
	public static int method2094(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class4_Sub1_Sub7_Sub4.anIntArray416[arg0 * 1024 / arg1] >> 1;
		return (arg2 * local16 >> 16) + (arg3 * (65536 - local16) >> 16);
	}
}
