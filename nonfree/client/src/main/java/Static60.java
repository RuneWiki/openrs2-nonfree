import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
	public static int anInt1316;

	@OriginalMember(owner = "client!dn", name = "D", descriptor = "Lclient!jj;")
	public static Class98 aClass98_3;

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "I")
	public static int anInt1312 = -1;

	@OriginalMember(owner = "client!dn", name = "y", descriptor = "[I")
	public static final int[] anIntArray102 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!dn", name = "z", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method1379(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + arg0.charAt(local12) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)V")
	public static void method1380() {
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			Static171.aBooleanArray16[local15] = false;
		}
		Static202.anInt3957 = -1;
		Static277.anInt5649 = 0;
		Static44.anInt988 = -1;
		Static265.anInt6826 = 0;
		Static182.anInt3602 = 1;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IBI)I")
	public static int method1381(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static112.anIntArray227[arg1 & 0x3] : Static357.anIntArray509[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIB)Z")
	public static boolean method1383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static29.aBoolean66) {
			return false;
		}
		@Pc(21) int local21 = arg0 >> 16;
		@Pc(25) int local25 = arg0 & 0xFFFF;
		if (Static265.aClass146ArrayArray41[local21] == null || Static265.aClass146ArrayArray41[local21][local25] == null) {
			return false;
		}
		@Pc(43) Class146 local43 = Static265.aClass146ArrayArray41[local21][local25];
		@Pc(58) Class2_Sub13 local58;
		if (arg1 == -1 && local43.anInt4419 == 0) {
			for (local58 = (Class2_Sub13) Static91.aClass216_22.method5992(); local58 != null; local58 = (Class2_Sub13) Static91.aClass216_22.method6000()) {
				if (local58.anInt1317 == 17 || local58.anInt1317 == 1006 || local58.anInt1317 == 23 || local58.anInt1317 == 5 || local58.anInt1317 == 48) {
					for (@Pc(89) Class146 local89 = Static1.method16(local58.anInt1319); local89 != null; local89 = Static186.method4859(local89)) {
						if (local89.anInt4450 == local43.anInt4450) {
							return true;
						}
					}
				}
			}
		} else {
			for (local58 = (Class2_Sub13) Static91.aClass216_22.method5992(); local58 != null; local58 = (Class2_Sub13) Static91.aClass216_22.method6000()) {
				if (local58.anInt1318 == arg1 && local58.anInt1319 == local43.anInt4450 && (local58.anInt1317 == 17 || local58.anInt1317 == 1006 || local58.anInt1317 == 23 || local58.anInt1317 == 5 || local58.anInt1317 == 48)) {
					return true;
				}
			}
		}
		return false;
	}
}
