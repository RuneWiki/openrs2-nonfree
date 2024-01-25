import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray29;

	@OriginalMember(owner = "client!ne", name = "w", descriptor = "[S")
	public static short[] aShortArray56;

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString165 = "Discard";

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BILclient!eb;)Ljava/lang/String;")
	public static String method3802(@OriginalArg(2) Class1_Sub7 arg0) {
		try {
			@Pc(15) int local15 = arg0.method3145();
			if (local15 > 32767) {
				local15 = 32767;
			}
			@Pc(23) byte[] local23 = new byte[local15];
			arg0.anInt3368 += Static191.aClass147_3.method3998(arg0.anInt3368, 0, local23, local15, arg0.aByteArray58);
			return Static40.method4023(0, local15, local23);
		} catch (@Pc(47) Exception local47) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!aa;)V")
	public static void method3804(@OriginalArg(0) Class2 arg0) {
		for (@Pc(1) int local1 = Static33.anInt805; local1 < Static56.anInt1240; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static222.anInt4391; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static74.anInt3404; local7++) {
					@Pc(16) Class204 local16 = Static138.aClass204ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class5_Sub1 local21 = local16.aClass5_Sub1_1;
						@Pc(24) Class5_Sub1 local24 = local16.aClass5_Sub1_2;
						if (local21 != null && local21.method5681()) {
							Static271.method4457(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5681()) {
								Static271.method4457(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5677(false, 0, 0, arg0, 0, local21);
								local24.method5678();
							}
							local21.method5678();
						}
						for (@Pc(70) Class17 local70 = local16.aClass17_3; local70 != null; local70 = local70.aClass17_1) {
							@Pc(74) Class5_Sub3 local74 = local70.aClass5_Sub3_1;
							if (local74 != null && local74.method5681()) {
								Static271.method4457(arg0, local74, local1, local4, local7, local74.aShort78 + 1 - local74.aShort75, local74.aShort76 - local74.aShort77 + 1);
								local74.method5678();
							}
						}
						@Pc(111) Class5_Sub5 local111 = local16.aClass5_Sub5_1;
						if (local111 != null && local111.method5681()) {
							Static305.method5155(arg0, local111, local1, local4, local7);
							local111.method5678();
						}
					}
				}
			}
		}
	}
}
