import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "Lclient!tl;")
	public static Class302 aClass302_1;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "([BZ)Z")
	public static boolean method1367(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class6_Sub26 local8 = new Class6_Sub26(arg0);
		@Pc(17) int local17 = local8.method4966();
		if (local17 != 2) {
			return false;
		}
		@Pc(31) boolean local31 = local8.method4966() == 1;
		if (local31) {
			Static253.method4454(local8);
		}
		method1370(local8);
		return true;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V")
	public static void method1368(@OriginalArg(1) int arg0) {
		@Pc(13) Class6_Sub4_Sub6 local13 = Static68.method1408(4, arg0);
		local13.method3828();
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLclient!iaa;)V")
	private static void method1370(@OriginalArg(1) Class6_Sub26 arg0) {
		for (@Pc(11) int local11 = 0; local11 < Static511.anInt9007; local11++) {
			@Pc(17) int local17 = arg0.method4973();
			@Pc(21) int local21 = arg0.method4999();
			if (local21 == 65535) {
				local21 = -1;
			}
			if (Static548.aClass116_Sub1Array2[local17] != null) {
				Static548.aClass116_Sub1Array2[local17].anInt3893 = local21;
			}
		}
	}
}
