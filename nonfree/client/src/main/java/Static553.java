import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!vl", name = "m", descriptor = "Lclient!qaa;")
	public static final Class257 aClass257_11 = new Class257();

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)I")
	public static int method7712() {
		if (Static165.aClass97_8 == null) {
			if (!Static266.aBoolean351 && Static384.anInt7048 > 0) {
				if (Static9.aBoolean9 && Static184.aClass262_1.method6381(81) && Static384.anInt7048 > 2) {
					return ((Class6_Sub26) Static408.aClass298_154.aClass6_246.aClass6_283.aClass6_283).anInt5471;
				}
				return ((Class6_Sub26) Static408.aClass298_154.aClass6_246.aClass6_283).anInt5471;
			}
			@Pc(15) int local15 = Static9.aClass29_1.method2946();
			@Pc(19) int local19 = Static9.aClass29_1.method2942();
			@Pc(21) int local21 = Static420.anInt8173;
			@Pc(23) int local23 = Static308.anInt5670;
			@Pc(25) int local25 = Static237.anInt4304;
			if (local21 < local15 && local25 + local21 > local15) {
				@Pc(43) int local43 = -1;
				@Pc(62) int local62;
				for (@Pc(45) int local45 = 0; local45 < Static384.anInt7048; local45++) {
					if (Static544.aBoolean506) {
						local62 = local23 + (Static384.anInt7048 + -1 - local45) * 16 + 33;
						if (local62 - 13 < local19 && local62 + 3 >= local19) {
							local43 = local45;
						}
					} else {
						local62 = (Static384.anInt7048 - local45 - 1) * 16 + local23 + 31;
						if (local19 > local62 - 13 && local62 + 3 >= local19) {
							local43 = local45;
						}
					}
				}
				if (local43 != -1) {
					local62 = 0;
					@Pc(127) Class95 local127 = new Class95(Static408.aClass298_154);
					for (@Pc(134) Class6_Sub26 local134 = (Class6_Sub26) local127.method2270(); local134 != null; local134 = (Class6_Sub26) local127.method2272()) {
						if (local43 == local62++) {
							return local134.anInt5471;
						}
					}
				}
			}
		}
		return -1;
	}
}
