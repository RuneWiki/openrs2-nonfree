import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!th", name = "d", descriptor = "Lclient!wg;")
	public static Class41 aClass41_2;

	@OriginalMember(owner = "client!th", name = "r", descriptor = "Lclient!c;")
	public static Class10 aClass10_25;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "Z")
	public static boolean aBoolean24 = false;

	@OriginalMember(owner = "client!th", name = "c", descriptor = "Lclient!ai;")
	private static Class6 aClass6_164 = Static38.method685("Attack");

	@OriginalMember(owner = "client!th", name = "n", descriptor = "I")
	public static volatile int anInt600 = -1;

	@OriginalMember(owner = "client!th", name = "q", descriptor = "Lclient!ai;")
	public static Class6 aClass6_165 = Static38.method685("Titelbild geladen)3");

	@OriginalMember(owner = "client!th", name = "F", descriptor = "Lclient!ai;")
	public static Class6 aClass6_166 = aClass6_164;

	@OriginalMember(owner = "client!th", name = "O", descriptor = "Lclient!ai;")
	private static Class6 aClass6_169 = Static38.method685("Loaded update list");

	@OriginalMember(owner = "client!th", name = "L", descriptor = "Lclient!ai;")
	public static Class6 aClass6_167 = aClass6_169;

	@OriginalMember(owner = "client!th", name = "N", descriptor = "Lclient!ai;")
	public static Class6 aClass6_168 = Static38.method685("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I[B)[B")
	public static byte[] method420(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class2_Sub13 local13 = new Class2_Sub13(arg0);
		@Pc(17) int local17 = local13.method1402();
		@Pc(21) int local21 = local13.method1396();
		if (local21 < 0 || Static58.anInt1478 != 0 && Static58.anInt1478 < local21) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(89) byte[] local89 = new byte[local21];
			local13.method1411(local21, local89);
			return local89;
		} else {
			@Pc(46) int local46 = local13.method1396();
			if (local46 < 0 || Static58.anInt1478 != 0 && Static58.anInt1478 < local46) {
				throw new RuntimeException();
			}
			@Pc(67) byte[] local67 = new byte[local46];
			if (local17 == 1) {
				Static178.method2782(local67, local46, arg0, local21);
			} else {
				Static31.aClass76_1.method2326(local13, local67);
			}
			return local67;
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
	public static void method422() {
		aClass41_2 = null;
		aClass6_165 = null;
		aClass6_164 = null;
		aClass6_167 = null;
		aClass10_25 = null;
		aClass6_166 = null;
		aClass6_169 = null;
		aClass6_168 = null;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!bf;IIIIB)V")
	public static void method426(@OriginalArg(0) Class2_Sub3_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null) {
			return;
		}
		@Pc(17) int local17 = Static154.anInt3559 + Static46.anInt1324 & 0x7FF;
		@Pc(25) int local25 = arg3 * arg3 + arg2 * arg2;
		if (local25 > 6400) {
			return;
		}
		@Pc(35) int local35 = Class2_Sub3_Sub2_Sub2.anIntArray208[local17];
		@Pc(43) int local43 = local35 * 256 / (Static36.anInt1028 + 256);
		@Pc(47) int local47 = Class2_Sub3_Sub2_Sub2.anIntArray207[local17];
		@Pc(55) int local55 = local47 * 256 / (Static36.anInt1028 + 256);
		@Pc(65) int local65 = local55 * arg3 - arg2 * local43 >> 16;
		@Pc(76) int local76 = arg3 * local43 + arg2 * local55 >> 16;
		if (local25 <= 2500) {
			arg0.method280(local76 + arg1 + 4 + 94 - arg0.anInt383 / 2, -(arg0.anInt386 / 2) + -4 + 83 + arg4 + -local65);
		} else {
			arg0.method298(Static89.aClass2_Sub3_Sub2_Sub3_2, local76 + arg1 + 4 + 94 - arg0.anInt383 / 2, -local65 + 83 + (arg4 - arg0.anInt386 / 2) + -4);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IB)I")
	public static int method427(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 * 6 - 61440;
		@Pc(23) int local23 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(35) int local35 = (arg0 * local13 >> 12) + 40960;
		return local35 * local23 >> 12;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)Z")
	public static boolean method429(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(19) int local19 = Static65.anIntArray104[arg0];
		if (local19 >= 2000) {
			local19 -= 2000;
		}
		return local19 == 1002;
	}
}
