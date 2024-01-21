import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!pd", name = "jb", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1234 = Static169.method2903("slide:");

	@OriginalMember(owner = "client!pd", name = "fb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1232 = aClass23_1234;

	@OriginalMember(owner = "client!pd", name = "ob", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1236 = Static169.method2903("Enter your username (V password)3");

	@OriginalMember(owner = "client!pd", name = "ib", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1233 = aClass23_1236;

	@OriginalMember(owner = "client!pd", name = "nb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1235 = aClass23_1234;

	@OriginalMember(owner = "client!pd", name = "vb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1237 = Static169.method2903("title_mute");

	@OriginalMember(owner = "client!pd", name = "xb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1238 = Static169.method2903("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!te;II[Lclient!qh;[B)V")
	public static void method2250(@OriginalArg(0) int arg0, @OriginalArg(1) Class80 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class69[] arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(14) Class1_Sub8 local14 = new Class1_Sub8(arg4);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local14.method856();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local14.method856();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(47) int local47 = local28 & 0x3F;
				@Pc(53) int local53 = local28 >> 6 & 0x3F;
				@Pc(57) int local57 = local28 >> 12;
				@Pc(61) int local61 = local14.method861();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local53 + arg0;
				@Pc(74) int local74 = local47 + arg2;
				@Pc(78) int local78 = local61 & 0x3;
				if (local69 > 0 && local74 > 0 && local69 < 103 && local74 < 103) {
					@Pc(93) int local93 = local57;
					if ((Static12.aByteArrayArrayArray11[1][local69][local74] & 0x2) == 2) {
						local93 = local57 - 1;
					}
					@Pc(109) Class69 local109 = null;
					if (local93 >= 0) {
						local109 = arg3[local93];
					}
					Static180.method3105(local69, local109, local78, local74, local65, arg1, local57, local16);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V")
	public static void method2251() {
		aClass23_1235 = null;
		aClass23_1238 = null;
		aClass23_1233 = null;
		aClass23_1237 = null;
		aClass23_1234 = null;
		aClass23_1236 = null;
		aClass23_1232 = null;
	}
}
