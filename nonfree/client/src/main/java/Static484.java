import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static484 {

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
	public static int anInt8246;

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "Z")
	public static boolean aBoolean623 = false;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIBI)Z")
	public static boolean method7210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (!Static519.aBoolean664 || !Static26.aBoolean26) {
			return false;
		} else if (Static14.anInt211 < 100) {
			return false;
		} else if (Static240.method4227(arg0, arg2, arg3)) {
			@Pc(39) int local39 = arg3 << Static594.anInt9440;
			@Pc(43) int local43 = arg2 << Static594.anInt9440;
			if (Static525.method7546(Static234.anInt4537, arg1, Static555.aClass96Array3[arg0].method8080(arg3, arg2), Static234.anInt4537, local39, local43)) {
				Static512.anInt8472++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)Z")
	public static boolean method7211() {
		try {
			if (Static432.anInt7414 == 2) {
				if (Static63.aClass6_Sub27_1 == null) {
					Static63.aClass6_Sub27_1 = Static694.method4713(Static672.aClass223_121, Static319.anInt5508, Static655.anInt10164);
					if (Static63.aClass6_Sub27_1 == null) {
						return false;
					}
				}
				if (Static513.aClass181_1 == null) {
					Static513.aClass181_1 = new Class181(Static346.aClass223_75, Static644.aClass223_118);
				}
				@Pc(42) Class6_Sub17_Sub4 local42 = Static449.aClass6_Sub17_Sub4_3;
				if (Static145.aClass6_Sub17_Sub4_2 != null) {
					local42 = Static145.aClass6_Sub17_Sub4_2;
				}
				if (local42.method6079(Static63.aClass6_Sub27_1, Static427.aClass223_89, Static513.aClass181_1)) {
					Static449.aClass6_Sub17_Sub4_3 = local42;
					Static449.aClass6_Sub17_Sub4_3.method6059();
					@Pc(74) int local74;
					if (Static98.anInt1458 <= 0) {
						Static432.anInt7414 = 0;
						Static449.aClass6_Sub17_Sub4_3.method6064(Static417.anInt7212);
						for (local74 = 0; local74 < Static331.anIntArray523.length; local74++) {
							Static449.aClass6_Sub17_Sub4_3.method6063(Static331.anIntArray523[local74], local74);
							Static331.anIntArray523[local74] = 255;
						}
					} else {
						Static432.anInt7414 = 3;
						Static449.aClass6_Sub17_Sub4_3.method6064(Static417.anInt7212 >= Static98.anInt1458 ? Static98.anInt1458 : Static417.anInt7212);
						for (local74 = 0; local74 < Static331.anIntArray523.length; local74++) {
							Static449.aClass6_Sub17_Sub4_3.method6063(Static331.anIntArray523[local74], local74);
							Static331.anIntArray523[local74] = 255;
						}
					}
					if (Static145.aClass6_Sub17_Sub4_2 == null) {
						if (Static332.aLong193 > 0L) {
							Static449.aClass6_Sub17_Sub4_3.method6067(Static557.aBoolean682, Static332.aLong193, Static63.aClass6_Sub27_1);
						} else {
							Static449.aClass6_Sub17_Sub4_3.method6083(Static557.aBoolean682, Static63.aClass6_Sub27_1);
						}
					}
					if (Static578.aClass150_3 != null) {
						Static578.aClass150_3.method5493(Static449.aClass6_Sub17_Sub4_3);
					}
					Static672.aClass223_121 = null;
					Static332.aLong193 = 0L;
					Static513.aClass181_1 = null;
					Static63.aClass6_Sub27_1 = null;
					Static145.aClass6_Sub17_Sub4_2 = null;
					return true;
				}
			}
		} catch (@Pc(195) Exception local195) {
			local195.printStackTrace();
			Static449.aClass6_Sub17_Sub4_3.method6095();
			Static672.aClass223_121 = null;
			Static63.aClass6_Sub27_1 = null;
			Static513.aClass181_1 = null;
			Static432.anInt7414 = 0;
			Static145.aClass6_Sub17_Sub4_2 = null;
		}
		return false;
	}
}
