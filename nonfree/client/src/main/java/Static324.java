import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!laa", name = "Z", descriptor = "Z")
	public static boolean aBoolean434;

	@OriginalMember(owner = "client!laa", name = "cb", descriptor = "Lclient!ke;")
	public static Class196 aClass196_178 = new Class196(123, 0);

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method5062(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(22) int local22 = local6 + 3 & 0xFFFFFFFC;
		@Pc(28) int local28 = local22 / 4 * 3;
		if (local22 - 2 >= local6 || Static540.method7468(arg0.charAt(local22 - 2)) == -1) {
			local28 -= 2;
		} else if (local22 - 1 >= local6 || Static540.method7468(arg0.charAt(local22 - 1)) == -1) {
			local28--;
		}
		@Pc(67) byte[] local67 = new byte[local28];
		Static201.method2822(local67, arg0, 0);
		return local67;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IC)Z")
	public static boolean method5065(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method5066(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(16) Class5_Sub2_Sub4 local16 = Static257.method3597(2, (long) arg0);
		local16.method2438();
		local16.aString26 = arg1;
	}

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "(Z)V")
	public static void method5067() {
		for (@Pc(1) int local1 = 0; local1 < Static331.anInt6013; local1++) {
			@Pc(13) Class178 local13 = Static515.aClass178Array2[local1];
			if (local13.aByte47 == 3) {
				if (local13.aClass5_Sub14_Sub1_1 == null) {
					local13.anInt4274 = Integer.MIN_VALUE;
				} else {
					Static229.aClass5_Sub14_Sub3_1.method2294(local13.aClass5_Sub14_Sub1_1);
				}
			}
		}
	}
}
