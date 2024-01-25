import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "Lclient!dt;")
	public static Class62 aClass62_20;

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
	public static int anInt6478 = 1;

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_104 = new Class57("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
	public static int anInt6481 = 0;

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray62 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)V")
	public static void method5717() {
		if (Static218.aString47.toLowerCase().indexOf("microsoft") != -1) {
			Static158.anIntArray302[219] = 42;
			Static158.anIntArray302[186] = 57;
			Static158.anIntArray302[188] = 71;
			Static158.anIntArray302[192] = 58;
			Static158.anIntArray302[223] = 28;
			Static158.anIntArray302[189] = 26;
			Static158.anIntArray302[221] = 43;
			Static158.anIntArray302[220] = 74;
			Static158.anIntArray302[191] = 73;
			Static158.anIntArray302[187] = 27;
			Static158.anIntArray302[190] = 72;
			Static158.anIntArray302[222] = 59;
			return;
		}
		Static158.anIntArray302[47] = 73;
		Static158.anIntArray302[93] = 43;
		Static158.anIntArray302[59] = 57;
		Static158.anIntArray302[45] = 26;
		Static158.anIntArray302[46] = 72;
		Static158.anIntArray302[92] = 74;
		Static158.anIntArray302[91] = 42;
		Static158.anIntArray302[61] = 27;
		if (Static218.aMethod1 == null) {
			Static158.anIntArray302[222] = 59;
			Static158.anIntArray302[192] = 58;
		} else {
			Static158.anIntArray302[222] = 58;
			Static158.anIntArray302[520] = 59;
			Static158.anIntArray302[192] = 28;
		}
		Static158.anIntArray302[44] = 71;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)I")
	public static int method5718() {
		if (Static313.aClass62_18 == null) {
			if (!Static287.aBoolean397 && Static105.anInt2076 > 0) {
				if (Static282.aBoolean391 && Static322.aClass89_25.method1847(81) && Static105.anInt2076 > 2) {
					return ((Class3_Sub4) Static47.aClass138_7.aClass3_137.aClass3_244.aClass3_244).anInt805;
				}
				return ((Class3_Sub4) Static47.aClass138_7.aClass3_137.aClass3_244).anInt805;
			}
			@Pc(43) int local43 = Static200.aClass10_1.method5242();
			@Pc(47) int local47 = Static200.aClass10_1.method5240();
			@Pc(49) int local49 = Static96.anInt1932;
			@Pc(51) int local51 = Static321.anInt3403;
			@Pc(53) int local53 = Static392.anInt6472;
			if (local49 < local43 && local43 < local53 + local49) {
				@Pc(67) int local67 = -1;
				@Pc(86) int local86;
				for (@Pc(69) int local69 = 0; local69 < Static105.anInt2076; local69++) {
					if (Static349.aBoolean449) {
						local86 = (Static105.anInt2076 - local69 - 1) * 16 + local51 + 33;
						if (local86 - 13 < local47 && local86 + 3 >= local47) {
							local67 = local69;
						}
					} else {
						local86 = (Static105.anInt2076 - local69 - 1) * 16 + local51 + 31;
						if (local86 - 13 < local47 && local86 + 3 >= local47) {
							local67 = local69;
						}
					}
				}
				if (local67 != -1) {
					local86 = 0;
					@Pc(140) Class130 local140 = new Class130(Static47.aClass138_7);
					for (@Pc(145) Class3_Sub4 local145 = (Class3_Sub4) local140.method2819(); local145 != null; local145 = (Class3_Sub4) local140.method2817()) {
						if (local86++ == local67) {
							return local145.anInt805;
						}
					}
				}
			}
		}
		return -1;
	}
}
