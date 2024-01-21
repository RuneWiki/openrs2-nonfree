import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "Lclient!oc;")
	public static Class55 aClass55_2;

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "Lclient!va;")
	public static Class78 aClass78_3;

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "[Z")
	public static boolean[] aBooleanArray19 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "Lclient!af;")
	public static Class5 aClass5_790 = Static45.method1937("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "Lclient!gd;")
	public static Class28 aClass28_45 = new Class28(260);

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "Lclient!af;")
	private static Class5 aClass5_791 = Static45.method1937(" more options");

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "Lclient!af;")
	public static Class5 aClass5_792 = aClass5_791;

	@OriginalMember(owner = "client!ke", name = "s", descriptor = "[[B")
	public static byte[][] aByteArrayArray6 = new byte[250][];

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
	public static void method1179() {
		Static121.aClass28_81.method792();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BII)I")
	public static int method1180(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg0 > 0) {
			arg0--;
			local12 = local12 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
	public static void method1181() {
		aClass78_3 = null;
		aClass5_791 = null;
		aBooleanArray19 = null;
		aByteArrayArray6 = null;
		aClass28_45 = null;
		aClass55_2 = null;
		aClass5_790 = null;
		aClass5_792 = null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!kb;)V")
	public static void method1182(@OriginalArg(1) Class41 arg0) {
		Static52.aClass41_5 = arg0;
		Static106.anInt2622 = Static52.aClass41_5.method1700(16);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!kb;Lclient!kb;)V")
	public static void method1184(@OriginalArg(1) Class41 arg0, @OriginalArg(2) Class41 arg1) {
		Static59.aClass41_8 = arg1;
		Static131.aClass41_33 = arg0;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILclient!rd;BIIII)V")
	public static void method1185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub20 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(24) int local24;
		if (arg3 < 0 || arg3 >= 104 || arg5 < 0 || arg5 >= 104) {
			while (true) {
				local24 = arg2.method2053();
				if (local24 == 0) {
					break;
				}
				if (local24 == 1) {
					arg2.method2053();
					break;
				}
				if (local24 <= 49) {
					arg2.method2053();
				}
			}
			return;
		}
		Static25.aByteArrayArrayArray1[arg6][arg3][arg5] = 0;
		while (true) {
			local24 = arg2.method2053();
			if (local24 == 0) {
				if (arg6 == 0) {
					Static95.anIntArrayArrayArray2[0][arg3][arg5] = -Static19.method484(arg0 + arg3 + 932731, arg4 + arg5 + 556238) * 8;
				} else {
					Static95.anIntArrayArrayArray2[arg6][arg3][arg5] = Static95.anIntArrayArrayArray2[arg6 - 1][arg3][arg5] - 240;
				}
				break;
			}
			if (local24 == 1) {
				@Pc(123) int local123 = arg2.method2053();
				if (local123 == 1) {
					local123 = 0;
				}
				if (arg6 == 0) {
					Static95.anIntArrayArrayArray2[0][arg3][arg5] = -local123 * 8;
				} else {
					Static95.anIntArrayArrayArray2[arg6][arg3][arg5] = Static95.anIntArrayArrayArray2[arg6 - 1][arg3][arg5] - local123 * 8;
				}
				break;
			}
			if (local24 <= 49) {
				Static50.aByteArrayArrayArray2[arg6][arg3][arg5] = arg2.method2099();
				Static79.aByteArrayArrayArray4[arg6][arg3][arg5] = (byte) ((local24 - 2) / 4);
				Static123.aByteArrayArrayArray7[arg6][arg3][arg5] = (byte) (arg1 + local24 - 2 & 0x3);
			} else if (local24 <= 81) {
				Static25.aByteArrayArrayArray1[arg6][arg3][arg5] = (byte) (local24 - 49);
			} else {
				Static95.aByteArrayArrayArray5[arg6][arg3][arg5] = (byte) (local24 - 81);
			}
		}
	}
}
