import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
	public static int anInt3000;

	@OriginalMember(owner = "client!vc", name = "F", descriptor = "Lclient!je;")
	public static Class40 aClass40_4;

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "[I")
	public static int[] anIntArray395 = new int[100];

	@OriginalMember(owner = "client!vc", name = "u", descriptor = "Lclient!uf;")
	public static Class78 aClass78_1 = new Class78();

	@OriginalMember(owner = "client!vc", name = "w", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1372 = Static56.method816("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
	public static int anInt2997 = -1;

	@OriginalMember(owner = "client!vc", name = "B", descriptor = "Lclient!ja;")
	public static Class36 aClass36_1 = new Class36();

	@OriginalMember(owner = "client!vc", name = "C", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1373 = Static56.method816(" from your ignore list first)3");

	@OriginalMember(owner = "client!vc", name = "D", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1374 = aClass34_1373;

	@OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
	public static int anInt3001 = -1;

	@OriginalMember(owner = "client!vc", name = "H", descriptor = "I")
	public static final int anInt3002 = 5063219;

	@OriginalMember(owner = "client!vc", name = "I", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1375 = Static56.method816("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!vc", name = "J", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1376 = Static56.method816("Too many connections from your address)3");

	@OriginalMember(owner = "client!vc", name = "K", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1377 = aClass34_1376;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!wd;IIIIIBI)V")
	public static void method1973(@OriginalArg(0) Class8_Sub20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(26) int local26;
		if (arg5 < 0 || arg5 >= 104 || arg2 < 0 || arg2 >= 104) {
			while (true) {
				local26 = arg0.method1872();
				if (local26 == 0) {
					break;
				}
				if (local26 == 1) {
					arg0.method1872();
					break;
				}
				if (local26 <= 49) {
					arg0.method1872();
				}
			}
			return;
		}
		Static105.aByteArrayArrayArray5[arg1][arg5][arg2] = 0;
		while (true) {
			local26 = arg0.method1872();
			if (local26 == 0) {
				if (arg1 == 0) {
					Static24.anIntArrayArrayArray4[0][arg5][arg2] = -Static116.method1638(arg3 + arg5 + 932731, arg4 + 556238 + arg2) * 8;
				} else {
					Static24.anIntArrayArrayArray4[arg1][arg5][arg2] = Static24.anIntArrayArrayArray4[arg1 - 1][arg5][arg2] - 240;
				}
				break;
			}
			if (local26 == 1) {
				@Pc(87) int local87 = arg0.method1872();
				if (local87 == 1) {
					local87 = 0;
				}
				if (arg1 == 0) {
					Static24.anIntArrayArrayArray4[0][arg5][arg2] = -local87 * 8;
				} else {
					Static24.anIntArrayArrayArray4[arg1][arg5][arg2] = Static24.anIntArrayArrayArray4[arg1 - 1][arg5][arg2] - local87 * 8;
				}
				break;
			}
			if (local26 <= 49) {
				Static60.aByteArrayArrayArray4[arg1][arg5][arg2] = arg0.method1847();
				Static53.aByteArrayArrayArray3[arg1][arg5][arg2] = (byte) ((local26 - 2) / 4);
				Static113.aByteArrayArrayArray7[arg1][arg5][arg2] = (byte) (arg6 + local26 - 2 & 0x3);
			} else if (local26 <= 81) {
				Static105.aByteArrayArrayArray5[arg1][arg5][arg2] = (byte) (local26 - 49);
			} else {
				Static6.aByteArrayArrayArray1[arg1][arg5][arg2] = (byte) (local26 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V")
	public static void method1974(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(12) int local12 = 0; local12 < Static133.anInt3069; local12++) {
			if (Static2.anIntArray3[local12] + anIntArray395[local12] > arg3 && anIntArray395[local12] < arg3 + arg1 && Static38.anIntArray131[local12] + Static6.anIntArray12[local12] > arg2 && arg0 + arg2 > Static38.anIntArray131[local12]) {
				Static23.aBooleanArray2[local12] = true;
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
	public static void method1975() {
		aClass34_1377 = null;
		aClass40_4 = null;
		aClass34_1376 = null;
		aClass34_1372 = null;
		aClass34_1374 = null;
		aClass78_1 = null;
		aClass34_1375 = null;
		aClass34_1373 = null;
		anIntArray395 = null;
		aClass36_1 = null;
	}
}
