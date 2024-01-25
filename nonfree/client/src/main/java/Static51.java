import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "Lclient!ul;")
	public static Class246 aClass246_225;

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "Lclient!lm;")
	public static Class151 aClass151_137;

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "[I")
	public static final int[] anIntArray664 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)Z")
	public static boolean method6019() {
		return Static217.anInt4004 > 0;
	}

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)I")
	public static int method6021() {
		if (Static455.aClass251_14 == null) {
			if (!Static385.aBoolean436 && Static217.anInt4004 > 0) {
				if (Static137.aBoolean164 && Static306.aClass155_1.method3516(81) && Static217.anInt4004 > 2) {
					return ((Class1_Sub3) Static55.aClass181_63.aClass1_179.aClass1_262.aClass1_262).anInt118;
				}
				return ((Class1_Sub3) Static55.aClass181_63.aClass1_179.aClass1_262).anInt118;
			}
			@Pc(23) int local23 = Static125.aClass114_1.method2701();
			@Pc(27) int local27 = Static125.aClass114_1.method2698();
			@Pc(29) int local29 = Static280.anInt4913;
			@Pc(31) int local31 = Static315.anInt5432;
			@Pc(33) int local33 = Static270.anInt4802;
			if (local29 < local23 && local23 < local29 + local33) {
				@Pc(51) int local51 = -1;
				@Pc(70) int local70;
				for (@Pc(53) int local53 = 0; local53 < Static217.anInt4004; local53++) {
					if (Static297.aBoolean374) {
						local70 = (Static217.anInt4004 - local53 - 1) * 16 + local31 + 33;
						if (local27 > local70 - 13 && local27 <= local70 + 3) {
							local51 = local53;
						}
					} else {
						local70 = (Static217.anInt4004 - local53 - 1) * 16 + local31 + 31;
						if (local27 > local70 - 13 && local27 <= local70 + 3) {
							local51 = local53;
						}
					}
				}
				if (local51 != -1) {
					local70 = 0;
					@Pc(139) Class162 local139 = new Class162(Static55.aClass181_63);
					for (@Pc(144) Class1_Sub3 local144 = (Class1_Sub3) local139.method3754(); local144 != null; local144 = (Class1_Sub3) local139.method3757()) {
						if (local70++ == local51) {
							return local144.anInt118;
						}
					}
				}
			}
		}
		return -1;
	}
}
