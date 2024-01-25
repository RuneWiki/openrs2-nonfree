import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
	public static int anInt10574;

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "Lclient!cb;")
	public static Class50 aClass50_189;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray93 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "Lclient!rq;")
	public static final Class184 aClass184_30 = Static13.method197();

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
	public static int anInt10577 = 503;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Z")
	public static boolean method8766(@OriginalArg(0) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "([BB)[B")
	public static byte[] method8767(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class5_Sub15 local8 = new Class5_Sub15(arg0);
		@Pc(12) int local12 = local8.method3642();
		@Pc(16) int local16 = local8.method3671();
		if (local16 < 0 || Static509.anInt5960 != 0 && local16 > Static509.anInt5960) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(40) byte[] local40 = new byte[local16];
			local8.method3650(0, local16, local40);
			return local40;
		} else {
			@Pc(52) int local52 = local8.method3671();
			if (local52 < 0 || Static509.anInt5960 != 0 && local52 > Static509.anInt5960) {
				throw new RuntimeException();
			}
			@Pc(73) byte[] local73 = new byte[local52];
			if (local12 == 1) {
				Static315.method4806(local73, local52, arg0, local16);
			} else {
				@Pc(86) Class33 local86 = Static80.aClass33_1;
				synchronized (Static80.aClass33_1) {
					Static80.aClass33_1.method506(local73, local8);
				}
			}
			return local73;
		}
	}
}
