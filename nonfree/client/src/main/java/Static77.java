import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!he", name = "H", descriptor = "Lclient!pi;")
	public static Class88 aClass88_1;

	@OriginalMember(owner = "client!he", name = "K", descriptor = "Lclient!vb;")
	public static Class70_Sub1 aClass70_Sub1_20;

	@OriginalMember(owner = "client!he", name = "G", descriptor = "[I")
	public static int[] anIntArray107 = new int[2];

	@OriginalMember(owner = "client!he", name = "J", descriptor = "I")
	public static int anInt1720 = -1;

	@OriginalMember(owner = "client!he", name = "M", descriptor = "I")
	public static int anInt1721 = 1;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III)Z")
	public static boolean method1327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static148.anIntArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == -Static134.anInt3026) {
			return false;
		} else if (local7 == Static134.anInt3026) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static181.method3050(local22 + 1, Static20.anIntArrayArrayArray2[arg0][arg1][arg2], local26 + 1) && Static181.method3050(local22 + 128 - 1, Static20.anIntArrayArrayArray2[arg0][arg1 + 1][arg2], local26 + 1) && Static181.method3050(local22 + 128 - 1, Static20.anIntArrayArrayArray2[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static181.method3050(local22 + 1, Static20.anIntArrayArrayArray2[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static148.anIntArrayArrayArray7[arg0][arg1][arg2] = Static134.anInt3026;
				return true;
			} else {
				Static148.anIntArrayArrayArray7[arg0][arg1][arg2] = -Static134.anInt3026;
				return false;
			}
		}
	}
}
