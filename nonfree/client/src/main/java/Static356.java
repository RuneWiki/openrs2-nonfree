import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "Lclient!fs;")
	public static Class76 aClass76_81;

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
	public static int anInt6220;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "Lclient!fa;")
	public static final Class68 aClass68_43 = new Class68(64);

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!iv;I)Ljava/lang/String;")
	public static String method4831(@OriginalArg(1) Class4_Sub12 arg0) {
		try {
			@Pc(7) int local7 = arg0.method2506();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(19) byte[] local19 = new byte[local7];
			arg0.anInt2997 += Static339.aClass119_1.method2933(arg0.aByteArray36, 0, local19, local7, arg0.anInt2997);
			return Static412.method5293(local19, local7, 0);
		} catch (@Pc(45) Exception local45) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z)Z")
	public static boolean method4833(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static358.anInt6251; local1 < Static235.anInt4487; local1++) {
			@Pc(6) Class164[][] local6 = Static202.aClass164ArrayArrayArray5[local1];
			for (@Pc(9) int local9 = -Static230.anInt4431; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static431.anInt7073 + local9;
				@Pc(18) int local18 = Static431.anInt7073 - local9;
				if (local14 >= Static105.anInt2325 || local18 < Static343.anInt775) {
					for (@Pc(27) int local27 = -Static230.anInt4431; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static93.anInt1887 + local27;
						@Pc(36) int local36 = Static93.anInt1887 - local27;
						@Pc(48) Class164 local48;
						if (local14 >= Static105.anInt2325) {
							if (local32 >= Static243.anInt4530) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean464) {
									Static152.aBoolean269 = arg0;
									Static433.aClass70_1.method5080(local48);
									Static433.aClass70_1.method5074();
								}
							}
							if (local36 < Static153.anInt3087) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean464) {
									Static152.aBoolean269 = arg0;
									Static433.aClass70_1.method5080(local48);
									Static433.aClass70_1.method5074();
								}
							}
						}
						if (local18 < Static343.anInt775) {
							if (local32 >= Static243.anInt4530) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean464) {
									Static152.aBoolean269 = arg0;
									Static433.aClass70_1.method5080(local48);
									Static433.aClass70_1.method5074();
								}
							}
							if (local36 < Static153.anInt3087) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean464) {
									Static152.aBoolean269 = arg0;
									Static433.aClass70_1.method5080(local48);
									Static433.aClass70_1.method5074();
								}
							}
						}
						if (Static314.anInt5476 == 0) {
							if (Static280.aBoolean470) {
								Static433.aClass70_1.method5077(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
	public static void method4834() {
		if (Static326.aBoolean509) {
			Static400.aClass57_23 = null;
			Static83.aClass57_10 = null;
			Static326.aBoolean509 = false;
		}
	}
}
