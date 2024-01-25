import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!ls", name = "A", descriptor = "I")
	public static int anInt4356;

	@OriginalMember(owner = "client!ls", name = "D", descriptor = "Lclient!tf;")
	public static Class134_Sub1 aClass134_Sub1_1;

	@OriginalMember(owner = "client!ls", name = "F", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_139 = new Class186(32, -1);

	@OriginalMember(owner = "client!ls", name = "H", descriptor = "[B")
	public static final byte[] aByteArray43 = new byte[520];

	@OriginalMember(owner = "client!ls", name = "I", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_60 = new Class242("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IZ)I")
	public static int method3292(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(Z)I")
	public static int method3293() {
		if (Static15.aClass126_1 == null) {
			if (!Static346.aBoolean427 && Static83.anInt1893 > 0) {
				if (Static416.aBoolean477 && Static23.aClass14_1.method1510(81) && Static83.anInt1893 > 2) {
					return ((Class4_Sub21) Static126.aClass258_19.aClass4_240.aClass4_262.aClass4_262).anInt3045;
				}
				return ((Class4_Sub21) Static126.aClass258_19.aClass4_240.aClass4_262).anInt3045;
			}
			@Pc(41) int local41 = Static284.aClass12_1.method4220();
			@Pc(45) int local45 = Static284.aClass12_1.method4219();
			@Pc(47) int local47 = Static104.anInt2229;
			@Pc(49) int local49 = Static171.anInt3173;
			@Pc(51) int local51 = Static346.anInt6292;
			if (local47 < local41 && local51 + local47 > local41) {
				@Pc(65) int local65 = -1;
				@Pc(84) int local84;
				for (@Pc(67) int local67 = 0; local67 < Static83.anInt1893; local67++) {
					if (Static60.aBoolean103) {
						local84 = local49 + (-local67 + -1 + Static83.anInt1893) * 16 + 33;
						if (local45 > local84 - 13 && local45 <= local84 + 3) {
							local65 = local67;
						}
					} else {
						local84 = (Static83.anInt1893 - local67 - 1) * 16 + local49 + 31;
						if (local84 - 13 < local45 && local84 + 3 >= local45) {
							local65 = local67;
						}
					}
				}
				if (local65 != -1) {
					local84 = 0;
					@Pc(142) Class18 local142 = new Class18(Static126.aClass258_19);
					for (@Pc(147) Class4_Sub21 local147 = (Class4_Sub21) local142.method524(); local147 != null; local147 = (Class4_Sub21) local142.method526()) {
						if (local65 == local84++) {
							return local147.anInt3045;
						}
					}
				}
			}
		}
		return -1;
	}
}
