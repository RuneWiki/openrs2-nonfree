import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "Lclient!ma;")
	public static Class2_Sub8_Sub3 aClass2_Sub8_Sub3_4;

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "I")
	public static int anInt6870 = 0;

	@OriginalMember(owner = "client!mda", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray33 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIB)Z")
	public static boolean method5873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static632.method9169(arg0, arg1) || Static482.method7525(arg1, arg0);
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method5874(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(20) int local20 = local6 + 3 & 0xFFFFFFFC;
		@Pc(26) int local26 = local20 / 4 * 3;
		if (local20 - 2 >= local6 || Static310.method5470(arg0.charAt(local20 - 2)) == -1) {
			local26 -= 2;
		} else if (local6 <= local20 - 1 || Static310.method5470(arg0.charAt(local20 - 1)) == -1) {
			local26--;
		}
		@Pc(70) byte[] local70 = new byte[local26];
		Static608.method8915(local70, arg0, 0);
		return local70;
	}
}
