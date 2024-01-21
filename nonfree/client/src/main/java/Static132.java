import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
	public static int anInt3270;

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
	public static int anInt3271;

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "[I")
	public static int[] anIntArray411 = new int[500];

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "Lclient!he;")
	private static Class26 aClass26_1818 = Static6.method100("Cancel");

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "Lclient!he;")
	public static Class26 aClass26_1814 = aClass26_1818;

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "Lclient!he;")
	public static Class26 aClass26_1815 = null;

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "Lclient!he;")
	public static Class26 aClass26_1816 = Static6.method100("Fps:");

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "Lclient!he;")
	public static Class26 aClass26_1817 = Static6.method100("Nehmen");

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "Lclient!he;")
	public static Class26 aClass26_1819 = Static6.method100("<col=ffff00>");

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	public static void method2265() {
		Static12.aClass65_11 = new Class65();
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
	public static void method2266() {
		anIntArray411 = null;
		aClass26_1816 = null;
		aClass26_1819 = null;
		aClass26_1815 = null;
		aClass26_1817 = null;
		aClass26_1818 = null;
		aClass26_1814 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZI)Z")
	public static boolean method2267(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)I")
	public static int method2268(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (local12 + arg0) / arg1 - local12;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIILclient!m;IIII)V")
	public static void method2269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub11 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(40) int local40;
		if (arg1 < 0 || arg1 >= 104 || arg2 < 0 || arg2 >= 104) {
			while (true) {
				local40 = arg3.method981();
				if (local40 == 0) {
					break;
				}
				if (local40 == 1) {
					arg3.method981();
					break;
				}
				if (local40 <= 49) {
					arg3.method981();
				}
			}
			return;
		}
		Static74.aByteArrayArrayArray5[arg0][arg1][arg2] = 0;
		while (true) {
			local40 = arg3.method981();
			if (local40 == 0) {
				if (arg0 == 0) {
					Static117.anIntArrayArrayArray6[0][arg1][arg2] = -Static114.method2076(arg4 + arg2 + 556238, arg5 + 932731 + arg1) * 8;
				} else {
					Static117.anIntArrayArrayArray6[arg0][arg1][arg2] = Static117.anIntArrayArrayArray6[arg0 - 1][arg1][arg2] - 240;
				}
				break;
			}
			if (local40 == 1) {
				@Pc(101) int local101 = arg3.method981();
				if (local101 == 1) {
					local101 = 0;
				}
				if (arg0 == 0) {
					Static117.anIntArrayArrayArray6[0][arg1][arg2] = -local101 * 8;
				} else {
					Static117.anIntArrayArrayArray6[arg0][arg1][arg2] = Static117.anIntArrayArrayArray6[arg0 - 1][arg1][arg2] - local101 * 8;
				}
				break;
			}
			if (local40 <= 49) {
				Static98.aByteArrayArrayArray7[arg0][arg1][arg2] = arg3.method994();
				Static71.aByteArrayArrayArray3[arg0][arg1][arg2] = (byte) ((local40 - 2) / 4);
				Static71.aByteArrayArrayArray4[arg0][arg1][arg2] = (byte) (arg6 + local40 - 2 & 0x3);
			} else if (local40 <= 81) {
				Static74.aByteArrayArrayArray5[arg0][arg1][arg2] = (byte) (local40 - 49);
			} else {
				Static24.aByteArrayArrayArray1[arg0][arg1][arg2] = (byte) (local40 - 81);
			}
		}
	}
}
