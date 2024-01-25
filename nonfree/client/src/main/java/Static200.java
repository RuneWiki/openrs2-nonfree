import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!id", name = "P", descriptor = "Lclient!vc;")
	public static Class200_Sub1 aClass200_Sub1_1;

	@OriginalMember(owner = "client!id", name = "V", descriptor = "[[I")
	public static int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!id", name = "T", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_120 = new Class202("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IZII)I")
	public static int method3233(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static532.aClass75Array3 == null) {
			return 0;
		}
		@Pc(16) int local16 = arg1 >> 7;
		@Pc(20) int local20 = arg2 >> 7;
		if (local16 < 0 || local20 < 0 || Static363.anInt1158 - 1 < local16 || local20 > Static511.anInt8889 - 1) {
			return 0;
		}
		@Pc(42) int local42 = arg0;
		if (arg0 < 3 && (Static267.aByteArrayArrayArray19[1][local16][local20] & 0x2) != 0) {
			local42 = arg0 + 1;
		}
		return Static532.aClass75Array3[local42].aa(arg1, arg2);
	}
}
