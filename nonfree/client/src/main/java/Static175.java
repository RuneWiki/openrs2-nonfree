import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "[I")
	public static int[] anIntArray269;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
	public static int anInt2812 = 0;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([BB)[B")
	public static byte[] method2600(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class5_Sub12 local8 = new Class5_Sub12(arg0);
		@Pc(17) int local17 = local8.method5115();
		@Pc(21) int local21 = local8.method5067();
		if (local21 < 0 || Static19.anInt382 != 0 && Static19.anInt382 < local21) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(85) byte[] local85 = new byte[local21];
			local8.method5058(local21, local85);
			return local85;
		} else {
			@Pc(44) int local44 = local8.method5067();
			if (local44 < 0 || Static19.anInt382 != 0 && Static19.anInt382 < local44) {
				throw new RuntimeException();
			}
			@Pc(64) byte[] local64 = new byte[local44];
			if (local17 == 1) {
				Static61.method960(local64, local44, arg0, local21);
			} else {
				Static181.aClass144_1.method4010(local64, local8);
			}
			return local64;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(CI)Z")
	public static boolean method2601(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(25) char[] local25 = Static198.aCharArray2;
			for (@Pc(27) int local27 = 0; local27 < local25.length; local27++) {
				@Pc(33) char local33 = local25[local27];
				if (local33 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V")
	public static void method2602(@OriginalArg(1) int arg0) {
		Static211.anInt4169 = -1;
		if (arg0 == 37) {
			Static290.aFloat21 = 3.0F;
		} else if (arg0 == 50) {
			Static290.aFloat21 = 4.0F;
		} else if (arg0 == 75) {
			Static290.aFloat21 = 6.0F;
		} else if (arg0 == 100) {
			Static290.aFloat21 = 8.0F;
		} else if (arg0 == 200) {
			Static290.aFloat21 = 16.0F;
		}
		Static211.anInt4169 = -1;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BIIZI)V")
	public static void method2604(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static92.method1683(arg1)) {
			Static62.method967(-1, arg2, arg0, arg3, Static304.aClass201ArrayArray1[arg1]);
		}
	}
}
