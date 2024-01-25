import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "[Lclient!ofa;")
	public static final Class2_Sub2_Sub15[] aClass2_Sub2_Sub15Array2 = new Class2_Sub2_Sub15[14];

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "[I")
	public static final int[] anIntArray319 = new int[14];

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method3974(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(19) int local19 = arg0.length();
		while (local11 < local19 && Static353.method5069(arg0.charAt(local11))) {
			local11++;
		}
		while (local11 < local19 && Static353.method5069(arg0.charAt(local19 - 1))) {
			local19--;
		}
		@Pc(53) int local53 = local19 - local11;
		if (local53 < 1 || local53 > 12) {
			return null;
		}
		@Pc(68) StringBuffer local68 = new StringBuffer(local53);
		for (@Pc(70) int local70 = local11; local70 < local19; local70++) {
			@Pc(76) char local76 = arg0.charAt(local70);
			if (Static154.method2104(local76)) {
				@Pc(84) char local84 = Static435.method5714(local76);
				if (local84 != '\u0000') {
					local68.append(local84);
				}
			}
		}
		if (local68.length() == 0) {
			return null;
		} else {
			return local68.toString();
		}
	}
}
