import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!jba", name = "n", descriptor = "[[B")
	public static byte[][] aByteArrayArray84;

	@OriginalMember(owner = "client!jba", name = "M", descriptor = "[I")
	public static int[] anIntArray276;

	@OriginalMember(owner = "client!jba", name = "l", descriptor = "Lclient!hj;")
	public static final Class158 aClass158_6 = new Class158(4, 1, 1, 1);

	@OriginalMember(owner = "client!jba", name = "z", descriptor = "[I")
	public static final int[] anIntArray277 = new int[4096];

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "([I[Ljava/lang/String;I)V")
	public static void method4619(@OriginalArg(0) int[] arg0, @OriginalArg(1) String[] arg1) {
		Static213.method3869(arg1.length - 1, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "(I)V")
	public static void method4624() {
		for (@Pc(8) int local8 = 0; local8 < 100; local8++) {
			Static358.aClass321Array1[local8] = null;
		}
		Static139.anInt2876 = 0;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method4625(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg0.length();
		while (local15 > local12 && Static528.method7566(arg0.charAt(local12))) {
			local12++;
		}
		while (local12 < local15 && Static528.method7566(arg0.charAt(local15 - 1))) {
			local15--;
		}
		@Pc(65) int local65 = local15 - local12;
		if (local65 < 1 || local65 > 12) {
			return null;
		}
		@Pc(83) StringBuffer local83 = new StringBuffer(local65);
		for (@Pc(85) int local85 = local12; local85 < local15; local85++) {
			@Pc(93) char local93 = arg0.charAt(local85);
			if (Static637.method8605(local93)) {
				@Pc(101) char local101 = Static488.method7231(local93);
				if (local101 != '\u0000') {
					local83.append(local101);
				}
			}
		}
		if (local83.length() == 0) {
			return null;
		} else {
			return local83.toString();
		}
	}
}
