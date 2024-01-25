import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
	public static int anInt5752;

	@OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
	public static int anInt5756;

	@OriginalMember(owner = "client!ji", name = "u", descriptor = "Lclient!us;")
	public static final Class344 aClass344_66 = new Class344(27, 15);

	@OriginalMember(owner = "client!ji", name = "v", descriptor = "Lclient!us;")
	public static final Class344 aClass344_67 = new Class344(77, 2);

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(II)Z")
	public static boolean method4883(@OriginalArg(1) int arg0) {
		if (Static171.aBooleanArray11[arg0]) {
			return true;
		} else if (Static399.aClass181_76.method5031(arg0)) {
			@Pc(23) int local23 = Static399.aClass181_76.method5025(arg0);
			if (local23 == 0) {
				Static171.aBooleanArray11[arg0] = true;
				return true;
			}
			if (Static85.aClass108ArrayArray2[arg0] == null) {
				Static85.aClass108ArrayArray2[arg0] = new Class108[local23];
			}
			for (@Pc(53) int local53 = 0; local53 < local23; local53++) {
				if (Static85.aClass108ArrayArray2[arg0][local53] == null) {
					@Pc(67) byte[] local67 = Static399.aClass181_76.method5023(arg0, local53);
					if (local67 != null) {
						@Pc(79) Class108 local79 = Static85.aClass108ArrayArray2[arg0][local53] = new Class108();
						local79.anInt4043 = (arg0 << 16) + local53;
						if (local67[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local79.method3519(new Class3_Sub15(local67));
					}
				}
			}
			Static171.aBooleanArray11[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
