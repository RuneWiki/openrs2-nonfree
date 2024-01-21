import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "Lclient!h;")
	public static Class33 aClass33_6;

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "Z")
	public static volatile boolean aBoolean67 = true;

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "Lclient!hg;")
	public static Class3_Sub11 aClass3_Sub11_1 = new Class3_Sub11(0, 0);

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
	public static int anInt1777 = 0;

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
	public static int anInt1778 = 0;

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "Lclient!kb;")
	public static Class46 aClass46_609 = Static65.method1172("<col=80ff00>");

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "Lclient!kb;")
	public static Class46 aClass46_610 = Static65.method1172("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "Lclient!kb;")
	public static Class46 aClass46_611 = Static65.method1172("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!ig", name = "q", descriptor = "Lclient!kb;")
	private static Class46 aClass46_612 = Static65.method1172("Invalid username or password)3");

	@OriginalMember(owner = "client!ig", name = "r", descriptor = "Lclient!kb;")
	public static Class46 aClass46_613 = aClass46_612;

	@OriginalMember(owner = "client!ig", name = "s", descriptor = "Lclient!kb;")
	private static Class46 aClass46_614 = Static65.method1172("red:");

	@OriginalMember(owner = "client!ig", name = "t", descriptor = "Lclient!kb;")
	public static Class46 aClass46_615 = aClass46_614;

	@OriginalMember(owner = "client!ig", name = "u", descriptor = "Lclient!kb;")
	public static Class46 aClass46_616 = aClass46_614;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
	public static void method1188() {
		aClass46_610 = null;
		aClass46_615 = null;
		aClass3_Sub11_1 = null;
		aClass33_6 = null;
		aClass46_614 = null;
		aClass46_609 = null;
		aClass46_616 = null;
		aClass46_612 = null;
		aClass46_613 = null;
		aClass46_611 = null;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!rd;IIIIIII)V")
	public static void method1189(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(26) int local26;
		if (arg2 < 0 || arg2 >= 104 || arg1 < 0 || arg1 >= 104) {
			while (true) {
				local26 = arg0.method191();
				if (local26 == 0) {
					break;
				}
				if (local26 == 1) {
					arg0.method191();
					break;
				}
				if (local26 <= 49) {
					arg0.method191();
				}
			}
			return;
		}
		Static119.aByteArrayArrayArray5[arg3][arg2][arg1] = 0;
		while (true) {
			local26 = arg0.method191();
			if (local26 == 0) {
				if (arg3 == 0) {
					Static133.anIntArrayArrayArray8[0][arg2][arg1] = -Static20.method400(arg5 + arg1 + 556238, arg6 + 932731 - -arg2) * 8;
				} else {
					Static133.anIntArrayArrayArray8[arg3][arg2][arg1] = Static133.anIntArrayArrayArray8[arg3 - 1][arg2][arg1] - 240;
				}
				break;
			}
			if (local26 == 1) {
				@Pc(123) int local123 = arg0.method191();
				if (local123 == 1) {
					local123 = 0;
				}
				if (arg3 == 0) {
					Static133.anIntArrayArrayArray8[0][arg2][arg1] = -local123 * 8;
				} else {
					Static133.anIntArrayArrayArray8[arg3][arg2][arg1] = Static133.anIntArrayArrayArray8[arg3 - 1][arg2][arg1] - local123 * 8;
				}
				break;
			}
			if (local26 <= 49) {
				Static174.aByteArrayArrayArray6[arg3][arg2][arg1] = arg0.method203();
				Static58.aByteArrayArrayArray3[arg3][arg2][arg1] = (byte) ((local26 - 2) / 4);
				Static60.aByteArrayArrayArray4[arg3][arg2][arg1] = (byte) (local26 + arg4 - 2 & 0x3);
			} else if (local26 <= 81) {
				Static119.aByteArrayArrayArray5[arg3][arg2][arg1] = (byte) (local26 - 49);
			} else {
				Static32.aByteArrayArrayArray2[arg3][arg2][arg1] = (byte) (local26 - 81);
			}
		}
	}
}
