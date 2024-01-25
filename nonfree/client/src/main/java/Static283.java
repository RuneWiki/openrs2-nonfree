import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!kn", name = "y", descriptor = "I")
	public static int anInt4877;

	@OriginalMember(owner = "client!kn", name = "t", descriptor = "[Lclient!me;")
	public static final Class205[] aClass205Array1 = new Class205[8];

	@OriginalMember(owner = "client!kn", name = "x", descriptor = "Lclient!wp;")
	public static Class361 aClass361_8 = null;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIB)I")
	public static int method4223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static454.anInt7639 < 100) {
			return -2;
		}
		@Pc(14) int local14 = -2;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(21) int local21 = arg2 - Static44.anInt9258;
		@Pc(25) int local25 = arg0 - Static44.anInt9263;
		for (@Pc(30) Class3_Sub51 local30 = (Class3_Sub51) Static44.aClass112_72.method3088(); local30 != null; local30 = (Class3_Sub51) Static44.aClass112_72.method3084()) {
			if (local30.anInt9426 == arg1) {
				@Pc(51) int local51 = local30.anInt9434;
				@Pc(54) int local54 = local30.anInt9427;
				@Pc(64) int local64 = Static44.anInt9263 + local54 | local51 + Static44.anInt9258 << 14;
				@Pc(84) int local84 = (local21 - local51) * (local21 + -local51) + (local25 - local54) * (-local54 + local25);
				if (local14 < 0 || local16 > local84) {
					local16 = local84;
					local14 = local64;
				}
			}
		}
		return local14;
	}
}
