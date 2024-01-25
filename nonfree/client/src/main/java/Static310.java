import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!tk", name = "p", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!tk", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString55;

	@OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
	public static int anInt5976;

	@OriginalMember(owner = "client!tk", name = "v", descriptor = "Lclient!ct;")
	public static Class30 aClass30_88;

	@OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
	public static int anInt5974 = 0;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!ct;ILclient!ct;)V")
	public static void method5371(@OriginalArg(0) Class30 arg0, @OriginalArg(2) Class30 arg1) {
		Static311.aClass30_84 = arg1;
		Static331.aClass30_94 = arg0;
		Static311.aClass30_84.method1180(36);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II[BB)Z")
	public static boolean method5372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(17) Class1_Sub7 local17 = new Class1_Sub7(arg2);
		@Pc(19) int local19 = -1;
		label54: while (true) {
			@Pc(23) int local23 = local17.method2152();
			if (local23 == 0) {
				return local12;
			}
			local19 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(42) int local42;
				while (!local36) {
					local42 = local17.method2134();
					if (local42 == 0) {
						continue label54;
					}
					local34 += local42 - 1;
					@Pc(69) int local69 = local34 & 0x3F;
					@Pc(75) int local75 = local34 >> 6 & 0x3F;
					@Pc(81) int local81 = local17.method2132() >> 2;
					@Pc(85) int local85 = arg1 + local75;
					@Pc(89) int local89 = arg0 + local69;
					if (local85 > 0 && local89 > 0 && local85 < Static311.anInt5653 - 1 && Static189.anInt3820 - 1 > local89) {
						@Pc(114) Class71 local114 = Static219.method4081(local19);
						if (local81 != 22 || Static30.aBoolean49 || local114.anInt2377 != 0 || local114.anInt2397 == 1 || local114.aBoolean172) {
							local36 = true;
							if (!local114.method2276()) {
								local12 = false;
								Static314.anInt6028++;
							}
						}
					}
				}
				local42 = local17.method2134();
				if (local42 == 0) {
					break;
				}
				local17.method2132();
			}
		}
	}
}
