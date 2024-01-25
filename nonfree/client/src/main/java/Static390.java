import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!tm", name = "j", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray50;

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "Lclient!ng;")
	public static final Class167 aClass167_88 = new Class167(8);

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "Z")
	public static boolean aBoolean526 = true;

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)Lclient!uq;")
	public static Class1_Sub3_Sub16 method4941() {
		return Static114.aClass1_Sub3_Sub16_3;
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)V")
	public static void method4942() {
		Static313.anInt5202 = -1;
		Static96.aClass49_7 = null;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)[Lclient!pp;")
	public static Class195[] method4943() {
		if (Static269.aClass195Array1 == null) {
			@Pc(16) Class195[] local16 = Static370.method4800(Static41.aClass124_2);
			@Pc(20) Class195[] local20 = new Class195[local16.length];
			@Pc(22) int local22 = 0;
			@Pc(75) int local75;
			@Pc(81) Class195 local81;
			label63: for (@Pc(24) int local24 = 0; local24 < local16.length; local24++) {
				@Pc(30) Class195 local30 = local16[local24];
				if ((local30.anInt5216 <= 0 || local30.anInt5216 >= 24) && local30.anInt5213 >= 800 && local30.anInt5212 >= 600 && (Static144.anInt2437 >= 96 || Static410.anInt6680 != 0 || local30.anInt5213 <= 1024 && local30.anInt5212 <= 768)) {
					for (local75 = 0; local75 < local22; local75++) {
						local81 = local20[local75];
						if (local30.anInt5213 == local81.anInt5213 && local30.anInt5212 == local81.anInt5212) {
							if (local81.anInt5216 < local30.anInt5216) {
								local20[local75] = local30;
							}
							continue label63;
						}
					}
					local20[local22] = local30;
					local22++;
				}
			}
			Static269.aClass195Array1 = new Class195[local22];
			Static459.method2114(local20, 0, Static269.aClass195Array1, 0, local22);
			@Pc(137) int[] local137 = new int[Static269.aClass195Array1.length];
			for (local75 = 0; local75 < Static269.aClass195Array1.length; local75++) {
				local81 = Static269.aClass195Array1[local75];
				local137[local75] = local81.anInt5212 * local81.anInt5213;
			}
			Static10.method178(Static269.aClass195Array1, local137);
		}
		return Static269.aClass195Array1;
	}
}
