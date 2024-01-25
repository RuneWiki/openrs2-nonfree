import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cda", name = "t", descriptor = "I")
	public static int anInt1227;

	@OriginalMember(owner = "client!cda", name = "u", descriptor = "I")
	public static int anInt1228;

	@OriginalMember(owner = "client!cda", name = "v", descriptor = "F")
	public static float aFloat16;

	@OriginalMember(owner = "client!cda", name = "s", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_24 = new Class73(42, 7);

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILclient!ji;)Lclient!re;")
	public static Class285 method1217(@OriginalArg(1) Class6_Sub21 arg0) {
		@Pc(15) int local15 = arg0.method6003();
		return new Class285(local15);
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(III)V")
	public static void method1218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static270.aClass276ArrayArrayArray2[0][arg1][arg2] != null && Static270.aClass276ArrayArrayArray2[0][arg1][arg2].aClass276_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static270.aClass276ArrayArrayArray2[local22][arg1][arg2] == null) {
				@Pc(46) Class276 local46 = Static270.aClass276ArrayArrayArray2[local22][arg1][arg2] = new Class276(local22, arg1, arg2);
				if (local20) {
					local46.aByte85++;
				}
			}
		}
	}
}
