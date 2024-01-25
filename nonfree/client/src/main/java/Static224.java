import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
	public static int anInt3821;

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "S")
	public static short aShort55 = 256;

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
	public static int anInt3830 = -1;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIB)Z")
	public static boolean method3408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static376.method4535(arg1, arg0) || Static97.method1665(arg1, arg0);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
	public static void method3409() {
		@Pc(7) Class142 local7 = null;
		try {
			@Pc(16) Class249 local16 = Static165.aClass103_3.method2363("2");
			while (local16.anInt6929 == 0) {
				Static170.method1617(1L);
			}
			if (local16.anInt6929 == 1) {
				local7 = (Class142) local16.anObject10;
				@Pc(44) Class6_Sub15 local44 = new Class6_Sub15(Static105.anInt1912 * 6 + 3);
				local44.method3075(1);
				local44.method3100(Static105.anInt1912);
				for (@Pc(54) int local54 = 0; local54 < Static235.anIntArray358.length; local54++) {
					if (Static434.aBooleanArray27[local54]) {
						local44.method3100(local54);
						local44.method3107(Static235.anIntArray358[local54]);
					}
				}
				local7.method3268(local44.anInt3487, local44.aByteArray51, 0);
			}
		} catch (@Pc(89) Exception local89) {
		}
		try {
			if (local7 != null) {
				local7.method3267();
			}
		} catch (@Pc(96) Exception local96) {
		}
		Static424.aLong9 = Static154.method2527();
		Static243.aBoolean270 = false;
	}
}
