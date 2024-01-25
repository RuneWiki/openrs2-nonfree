import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!ut", name = "Q", descriptor = "I")
	public static int anInt2164;

	@OriginalMember(owner = "client!ut", name = "y", descriptor = "I")
	public static int anInt2154 = 0;

	@OriginalMember(owner = "client!ut", name = "K", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_8 = new Class70(9, 0, 4, 1);

	@OriginalMember(owner = "client!ut", name = "P", descriptor = "Lclient!wi;")
	public static final Class268 aClass268_21 = new Class268(50);

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!nj;II)Ljava/lang/String;")
	public static String method1940(@OriginalArg(0) Class3_Sub25 arg0) {
		try {
			@Pc(7) int local7 = arg0.method4086();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(19) byte[] local19 = new byte[local7];
			arg0.anInt4974 += Static371.aClass88_1.method2074(arg0.aByteArray88, 0, local19, local7, arg0.anInt4974);
			return Static300.method4282(local19, 0, local7);
		} catch (@Pc(45) Exception local45) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)[Lclient!sd;")
	public static Class219[] method1941() {
		if (Static403.aClass219Array1 == null) {
			@Pc(15) Class219[] local15 = Static423.method5774(Static32.aClass51_1);
			@Pc(19) Class219[] local19 = new Class219[local15.length];
			@Pc(21) int local21 = 0;
			@Pc(69) int local69;
			@Pc(75) Class219 local75;
			label63: for (@Pc(23) int local23 = 0; local23 < local15.length; local23++) {
				@Pc(29) Class219 local29 = local15[local23];
				if ((local29.anInt6274 <= 0 || local29.anInt6274 >= 24) && local29.anInt6272 >= 800 && local29.anInt6273 >= 600 && (Static61.anInt1155 >= 96 || Static402.anInt6656 != 0 || local29.anInt6272 <= 1024 && local29.anInt6273 <= 768)) {
					for (local69 = 0; local69 < local21; local69++) {
						local75 = local19[local69];
						if (local29.anInt6272 == local75.anInt6272 && local75.anInt6273 == local29.anInt6273) {
							if (local75.anInt6274 < local29.anInt6274) {
								local19[local69] = local29;
							}
							continue label63;
						}
					}
					local19[local21] = local29;
					local21++;
				}
			}
			Static403.aClass219Array1 = new Class219[local21];
			Static466.method203(local19, 0, Static403.aClass219Array1, 0, local21);
			@Pc(139) int[] local139 = new int[Static403.aClass219Array1.length];
			for (local69 = 0; local69 < Static403.aClass219Array1.length; local69++) {
				local75 = Static403.aClass219Array1[local69];
				local139[local69] = local75.anInt6272 * local75.anInt6273;
			}
			Static279.method3853(local139, Static403.aClass219Array1);
		}
		return Static403.aClass219Array1;
	}
}
