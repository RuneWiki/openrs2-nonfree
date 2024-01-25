import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!qb", name = "z", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_118 = new Class83("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!qb", name = "A", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_263 = new Class22(41, 7);

	@OriginalMember(owner = "client!qb", name = "B", descriptor = "I")
	public static int anInt5660 = -1;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)I")
	public static int method4409() {
		if (Static281.aClass247_12 == null) {
			if (!Static234.aBoolean411 && Static407.anInt6710 > 0) {
				if (Static434.aBoolean692 && Static384.aClass244_1.method5489(81) && Static407.anInt6710 > 2) {
					return ((Class4_Sub39) Static206.aClass183_28.aClass4_207.aClass4_261.aClass4_261).anInt5698;
				}
				return ((Class4_Sub39) Static206.aClass183_28.aClass4_207.aClass4_261).anInt5698;
			}
			@Pc(20) int local20 = Static420.aClass80_1.method2234();
			@Pc(24) int local24 = Static420.aClass80_1.method2230();
			@Pc(26) int local26 = Static310.anInt5424;
			@Pc(28) int local28 = Static172.anInt3367;
			@Pc(30) int local30 = Static173.anInt3370;
			if (local20 > local26 && local30 + local26 > local20) {
				@Pc(44) int local44 = -1;
				@Pc(64) int local64;
				for (@Pc(46) int local46 = 0; local46 < Static407.anInt6710; local46++) {
					if (Static299.aBoolean481) {
						local64 = local28 + (-local46 + (Static407.anInt6710 - 1)) * 16 + 33;
						if (local64 - 13 < local24 && local64 + 3 >= local24) {
							local44 = local46;
						}
					} else {
						local64 = (Static407.anInt6710 - local46 - 1) * 16 + local28 + 31;
						if (local24 > local64 - 13 && local24 <= local64 + 3) {
							local44 = local46;
						}
					}
				}
				if (local44 != -1) {
					local64 = 0;
					@Pc(133) Class63 local133 = new Class63(Static206.aClass183_28);
					for (@Pc(138) Class4_Sub39 local138 = (Class4_Sub39) local133.method1611(); local138 != null; local138 = (Class4_Sub39) local133.method1612()) {
						if (local64++ == local44) {
							return local138.anInt5698;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[FI)[F")
	public static float[] method4410(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1) {
		@Pc(6) float[] local6 = new float[arg0];
		Static459.method3329(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
