import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
	public static int anInt2194;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString123 = "wave:";

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString124 = "Please wait...";

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "[I")
	public static int[] anIntArray181 = new int[14];

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method1750(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class4_Sub10 local8 = new Class4_Sub10(arg0);
		@Pc(12) int local12 = local8.method4666();
		@Pc(16) int local16 = local8.method4632();
		if (local16 < 0 || Static308.anInt5960 != 0 && Static308.anInt5960 < local16) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(47) byte[] local47 = new byte[local16];
			local8.method4649(local16, local47);
			return local47;
		} else {
			@Pc(59) int local59 = local8.method4632();
			if (local59 < 0 || Static308.anInt5960 != 0 && Static308.anInt5960 < local59) {
				throw new RuntimeException();
			}
			@Pc(84) byte[] local84 = new byte[local59];
			if (local12 == 1) {
				Static26.method351(local84, local59, arg0, local16);
			} else {
				Static93.aClass94_2.method1980(local8, local84);
			}
			return local84;
		}
	}
}
