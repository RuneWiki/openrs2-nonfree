import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
	public static int anInt2921;

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
	public static int anInt2922;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)V")
	public static void method2492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static242.aClass255ArrayArrayArray2[0][arg1][arg2] != null && Static242.aClass255ArrayArrayArray2[0][arg1][arg2].aClass255_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static242.aClass255ArrayArrayArray2[local22][arg1][arg2] == null) {
				@Pc(46) Class255 local46 = Static242.aClass255ArrayArrayArray2[local22][arg1][arg2] = new Class255(local22, arg1, arg2);
				if (local20) {
					local46.aByte101++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIB)V")
	public static void method2496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static544.aClass1_Sub22_Sub1_1.anInt5444 != 0 && arg0 != 0 && Static482.anInt7992 < 50 && arg3 != -1) {
			Static527.aClass35Array1[Static482.anInt7992++] = new Class35((byte) 1, arg3, arg0, arg2, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)V")
	public static void method2498(@OriginalArg(1) int arg0) {
		@Pc(16) Class1_Sub1_Sub11 local16 = Static541.method7520(8, arg0);
		local16.method4945();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(CB)Z")
	public static boolean method2499(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(37) char[] local37 = Static252.aCharArray27;
			for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
				@Pc(45) char local45 = local37[local39];
				if (local45 == arg0) {
					return true;
				}
			}
		}
		return false;
	}
}
