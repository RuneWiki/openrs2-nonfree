import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!cl", name = "W", descriptor = "F")
	public static float aFloat10;

	@OriginalMember(owner = "client!cl", name = "P", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_64 = new Class123(109, 14);

	@OriginalMember(owner = "client!cl", name = "Z", descriptor = "I")
	public static int anInt1319 = 0;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1090(@OriginalArg(1) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZIZI)I")
	public static int method1092(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class6_Sub37 local10 = Static375.method5604(false, arg2);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(23) int local23 = 0; local23 < local10.anIntArray408.length; local23++) {
			if (local10.anIntArray408[local23] >= 0 && Static380.aClass231_2.anInt6780 > local10.anIntArray408[local23]) {
				@Pc(48) Class4 local48 = Static380.aClass231_2.method5648(local10.anIntArray408[local23]);
				@Pc(58) int local58 = local48.method63(arg1, Static80.aClass181_1.method4294(arg1).anInt4865);
				if (arg0) {
					local16 += local58 * local10.anIntArray409[local23];
				} else {
					local16 += local58;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(II)Z")
	public static boolean method1093(@OriginalArg(1) int arg0) {
		if (arg0 == 6 || arg0 == 15 || arg0 == 11 || arg0 == 16 || arg0 == 25) {
			return true;
		} else {
			return arg0 == 45 || arg0 == 1004;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBIII)V")
	public static void method1094(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class6_Sub2_Sub7 local16 = Static212.method3218(arg0, 10);
		local16.method3088();
		local16.anInt3744 = arg1;
		local16.anInt3746 = arg3;
		local16.anInt3749 = arg2;
	}
}
