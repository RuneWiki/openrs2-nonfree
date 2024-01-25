import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method4357(@OriginalArg(1) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static623.anInt9775;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(24) Class200 local24 = Static431.aClass39_1.method1311(arg0[local13]);
			if (local24.anInt5043 != -1) {
				@Pc(39) Class17 local39 = (Class17) Static602.aClass352_68.method7653((long) local24.anInt5043);
				if (local39 == null) {
					@Pc(47) Class51 local47 = Static682.method1662(Static368.aClass34_80, local24.anInt5043, 0);
					if (local47 != null) {
						local39 = Static582.aClass33_13.method8147(local47, true);
						Static602.aClass352_68.method7655((long) local24.anInt5043, local39);
					}
				}
				if (local39 != null) {
					Static128.aClass17Array3[local11] = local39;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(B)V")
	public static void method4358() {
		Static444.anInt6928 = 0;
		Static619.anInt9720 = 0;
		Static631.anInt9865 = 0;
		Static132.anInt2477 = 0;
	}
}
