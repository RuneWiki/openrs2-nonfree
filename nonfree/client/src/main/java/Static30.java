import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!at", name = "t", descriptor = "Lclient!vo;")
	public static Class389 aClass389_1;

	@OriginalMember(owner = "client!at", name = "x", descriptor = "Lclient!iu;")
	public static Class181 aClass181_1;

	@OriginalMember(owner = "client!at", name = "s", descriptor = "Lclient!si;")
	public static final Class338 aClass338_1 = new Class338(5);

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIII)V")
	public static void method402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static293.anInt5243 != 1) {
			return;
		}
		@Pc(14) int local14 = arg2 / Static299.anInt6879;
		@Pc(18) int local18 = arg1 / Static299.anInt6879;
		@Pc(22) int local22 = arg0 / Static523.anInt8898;
		@Pc(26) int local26 = arg3 / Static523.anInt8898;
		if (local14 >= Static310.anInt5521 || local18 < 0 || local22 >= Static643.anInt10383 || local26 < 0) {
			return;
		}
		if (local14 < 0) {
			local14 = 0;
		}
		if (local22 < 0) {
			local22 = 0;
		}
		if (local26 >= Static643.anInt10383) {
			local26 = Static643.anInt10383 - 1;
		}
		if (Static310.anInt5521 <= local18) {
			local18 = Static310.anInt5521 - 1;
		}
		for (@Pc(86) int local86 = local22; local86 <= local26; local86++) {
			@Pc(97) int local97 = Static119.method2060(Static481.anInt8379 + local86, Static643.anInt10383) * Static310.anInt5521;
			for (@Pc(99) int local99 = local14; local99 <= local18; local99++) {
				@Pc(112) int local112 = local97 + Static119.method2060(local99 + Static179.anInt3232, Static310.anInt5521);
				Static277.anIntArray289[local112] = Static686.anInt7557;
			}
		}
	}
}
