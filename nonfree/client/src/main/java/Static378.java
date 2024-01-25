import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "Lclient!ld;")
	public static Class2_Sub26 aClass2_Sub26_2;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "Z")
	public static boolean aBoolean451 = false;

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_99 = new Class32("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "[B")
	public static final byte[] aByteArray113 = new byte[520];

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)[Lclient!vt;")
	public static Class241[] method5517() {
		if (Static279.aClass241Array1 == null) {
			@Pc(11) Class241[] local11 = Static311.method4586(Static359.aClass111_5);
			@Pc(15) Class241[] local15 = new Class241[local11.length];
			@Pc(17) int local17 = 0;
			@Pc(69) int local69;
			@Pc(75) Class241 local75;
			label63: for (@Pc(19) int local19 = 0; local19 < local11.length; local19++) {
				@Pc(25) Class241 local25 = local11[local19];
				if ((local25.anInt6293 <= 0 || local25.anInt6293 >= 24) && local25.anInt6298 >= 800 && local25.anInt6295 >= 600 && (Static253.anInt4468 >= 96 || Static62.anInt1261 != 0 || local25.anInt6298 <= 1024 && local25.anInt6295 <= 768)) {
					for (local69 = 0; local69 < local17; local69++) {
						local75 = local15[local69];
						if (local25.anInt6298 == local75.anInt6298 && local25.anInt6295 == local75.anInt6295) {
							if (local25.anInt6293 > local75.anInt6293) {
								local15[local69] = local25;
							}
							continue label63;
						}
					}
					local15[local17] = local25;
					local17++;
				}
			}
			Static279.aClass241Array1 = new Class241[local17];
			Static399.method2486(local15, 0, Static279.aClass241Array1, 0, local17);
			@Pc(131) int[] local131 = new int[Static279.aClass241Array1.length];
			for (local69 = 0; local69 < Static279.aClass241Array1.length; local69++) {
				local75 = Static279.aClass241Array1[local69];
				local131[local69] = local75.anInt6298 * local75.anInt6295;
			}
			Static219.method3624(Static279.aClass241Array1, local131);
		}
		return Static279.aClass241Array1;
	}
}
