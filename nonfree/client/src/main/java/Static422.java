import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!mt", name = "C", descriptor = "[[[Lclient!tr;")
	public static Class364[][][] aClass364ArrayArrayArray1;

	@OriginalMember(owner = "client!mt", name = "M", descriptor = "Lclient!qh;")
	public static final Class309 aClass309_8 = new Class309("stellardawn", "Stellar Dawn", 1);

	@OriginalMember(owner = "client!mt", name = "F", descriptor = "Lclient!qfa;")
	public static final Class307 aClass307_66 = new Class307(8);

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "(III)Z")
	public static boolean method5604(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static66.method1493(arg0, arg1) || Static507.method6897(arg1, arg0);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I[B)[B")
	public static byte[] method5605(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class3_Sub2 local8 = new Class3_Sub2(arg0);
		@Pc(12) int local12 = local8.method2048(255);
		@Pc(26) int local26 = local8.method2036();
		if (local26 < 0 || Static393.anInt6121 != 0 && Static393.anInt6121 < local26) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(112) byte[] local112 = new byte[local26];
			local8.method2064(local26, 0, local112);
			return local112;
		} else {
			@Pc(54) int local54 = local8.method2036();
			if (local54 < 0 || Static393.anInt6121 != 0 && Static393.anInt6121 < local54) {
				throw new RuntimeException();
			}
			@Pc(80) byte[] local80 = new byte[local54];
			if (local12 == 1) {
				Static237.method3419(local80, local54, arg0, local26);
			} else {
				@Pc(87) Class233 local87 = Static308.aClass233_1;
				synchronized (Static308.aClass233_1) {
					Static308.aClass233_1.method5133(local8, local80);
				}
			}
			return local80;
		}
	}
}
