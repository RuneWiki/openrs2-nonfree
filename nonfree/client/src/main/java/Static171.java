import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "Lclient!gca;")
	public static Class105 aClass105_2;

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "[I")
	public static int[] anIntArray212;

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_79 = new Class73(27, 4);

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "[I")
	public static final int[] anIntArray211 = new int[64];

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "I")
	public static int anInt3648 = 0;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILclient!go;[[B)V")
	public static void method3189(@OriginalArg(1) Class115_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg0.anInt3545; local8++) {
			Static482.method6632();
			for (@Pc(14) int local14 = 0; local14 < Static473.anInt8075 >> 3; local14++) {
				for (@Pc(18) int local18 = 0; local18 < Static165.anInt6749 >> 3; local18++) {
					@Pc(28) int local28 = Static553.anIntArrayArrayArray20[local8][local14][local18];
					if (local28 != -1) {
						@Pc(37) int local37 = local28 >> 24 & 0x3;
						if (!arg0.aBoolean249 || local37 == 0) {
							@Pc(51) int local51 = local28 >> 1 & 0x3;
							@Pc(57) int local57 = local28 >> 14 & 0x3FF;
							@Pc(63) int local63 = local28 >> 3 & 0x7FF;
							@Pc(73) int local73 = (local57 / 8 << 8) + local63 / 8;
							for (@Pc(75) int local75 = 0; local75 < Static365.anIntArray477.length; local75++) {
								if (Static365.anIntArray477[local75] == local73 && arg1[local75] != null) {
									arg0.method3154(arg1[local75], (local63 & 0x7) * 8, Static579.aClass189Array4, Static240.aClass14_7, local14 * 8, local18 * 8, local37, (local57 & 0x7) * 8, local8, local51);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
