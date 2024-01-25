import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!ri", name = "F", descriptor = "I")
	public static int anInt7729 = 0;

	@OriginalMember(owner = "client!ri", name = "Q", descriptor = "[Lclient!fv;")
	public static final Class6_Sub1_Sub7[] aClass6_Sub1_Sub7Array3 = new Class6_Sub1_Sub7[14];

	@OriginalMember(owner = "client!ri", name = "T", descriptor = "Lclient!fca;")
	public static Class97 aClass97_12 = null;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(B[B)[B")
	public static byte[] method6389(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class6_Sub14 local8 = new Class6_Sub14(arg0);
		@Pc(20) int local20 = local8.method6041();
		@Pc(24) int local24 = local8.method6027();
		if (local24 < 0 || Static288.anInt4710 != 0 && Static288.anInt4710 < local24) {
			throw new RuntimeException();
		} else if (local20 == 0) {
			@Pc(49) byte[] local49 = new byte[local24];
			local8.method6018(local24, local49);
			return local49;
		} else {
			@Pc(61) int local61 = local8.method6027();
			if (local61 < 0 || Static288.anInt4710 != 0 && Static288.anInt4710 < local61) {
				throw new RuntimeException();
			}
			@Pc(82) byte[] local82 = new byte[local61];
			if (local20 == 1) {
				Static347.method5227(local82, local61, arg0, local24);
			} else {
				@Pc(87) Class114 local87 = Static140.aClass114_1;
				synchronized (Static140.aClass114_1) {
					Static140.aClass114_1.method2278(local8, local82);
				}
			}
			return local82;
		}
	}
}
