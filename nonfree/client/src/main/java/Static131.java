import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!jk", name = "G", descriptor = "Lclient!n;")
	public static Class1_Sub2_Sub14_Sub1 aClass1_Sub2_Sub14_Sub1_2;

	@OriginalMember(owner = "client!jk", name = "H", descriptor = "I")
	public static int anInt2971;

	@OriginalMember(owner = "client!jk", name = "A", descriptor = "Lclient!tl;")
	public static Class155 aClass155_27 = new Class155(2);

	@OriginalMember(owner = "client!jk", name = "F", descriptor = "Lclient!qg;")
	public static Class131 aClass131_7 = new Class131();

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZIB[Lclient!de;[BI)V")
	public static void method2255(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class36[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13 = -1;
		@Pc(18) Class1_Sub16 local18 = new Class1_Sub16(arg3);
		while (true) {
			@Pc(22) int local22 = local18.method2647();
			if (local22 == 0) {
				return;
			}
			local13 += local22;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local18.method2618();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(47) int local47 = local31 & 0x3F;
				@Pc(53) int local53 = local31 >> 6 & 0x3F;
				@Pc(57) int local57 = local31 >> 12;
				@Pc(61) int local61 = local18.method2655();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(70) int local70 = local47 + arg1;
				@Pc(74) int local74 = arg4 + local53;
				@Pc(78) int local78 = local61 & 0x3;
				if (local74 > 0 && local70 > 0 && local74 < 103 && local70 < 103) {
					@Pc(93) Class36 local93 = null;
					if (!arg0) {
						@Pc(97) int local97 = local57;
						if ((Static126.aByteArrayArrayArray24[1][local74][local70] & 0x2) == 2) {
							local97 = local57 - 1;
						}
						if (local97 >= 0) {
							local93 = arg2[local97];
						}
					}
					Static272.method4541(local57, local57, local93, local78, local74, !arg0, arg0, local65, local13, local70);
				}
			}
		}
	}
}
