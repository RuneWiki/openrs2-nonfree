import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!se", name = "q", descriptor = "[I")
	public static final int[] anIntArray553 = new int[8];

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIBII)V")
	public static void method7613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static348.aClass6_Sub22_19.aClass15_Sub18_3.method5678() != 0 && arg3 != 0 && Static277.anInt5443 < 50 && arg2 != -1) {
			Static280.aClass224Array1[Static277.anInt5443++] = new Class224((byte) 1, arg2, arg3, arg4, arg1, 0, arg0, (Class20_Sub2) null);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;")
	public static String[] method7614(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(10) int local10 = Static303.method5151(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local10; local26++) {
			@Pc(30) int local30;
			for (local30 = local24; arg0.charAt(local30) != arg1; local30++) {
			}
			local15[local22++] = arg0.substring(local24, local30);
			local24 = local30 + 1;
		}
		local15[local10] = arg0.substring(local24);
		return local15;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	public static void method7615() {
		for (@Pc(13) int local13 = 0; local13 < Static316.anInt6064; local13++) {
			@Pc(24) int local24 = Static507.method7514(Static316.anInt6064, local13 + Static14.anInt268) * Static406.anInt7520;
			for (@Pc(26) int local26 = 0; local26 < Static406.anInt7520; local26++) {
				@Pc(38) int local38 = Static507.method7514(Static406.anInt7520, local26 + Static426.anInt7764) + local24;
				if (Static302.anInt5876 == Static446.anIntArray511[local38]) {
					Static363.anInterface20Array1[local38].method8646(0, 0, Static345.anInt6515, Static11.anInt221, Static345.anInt6515 * local26, Static11.anInt221 * local13);
				}
			}
		}
	}
}
