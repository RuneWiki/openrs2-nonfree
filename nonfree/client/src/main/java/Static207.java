import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!hfa", name = "i", descriptor = "I")
	public static int anInt4101 = 0;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "([[BBLclient!jda;)V")
	public static void method3582(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class96_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = 0; local21 < local15; local21++) {
			@Pc(27) byte[] local27 = arg0[local21];
			if (local27 != null) {
				@Pc(34) Class6_Sub40 local34 = new Class6_Sub40(local27);
				local40 = Static480.anIntArray523[local21] >> 8;
				@Pc(46) int local46 = Static480.anIntArray523[local21] & 0xFF;
				@Pc(53) int local53 = local40 * 64 - Static606.anInt8651;
				@Pc(60) int local60 = local46 * 64 - Static195.anInt3961;
				Static54.method911();
				arg1.method4564(local60, local34, Static606.anInt8651, local53, Static619.aClass319Array1, Static195.anInt3961);
				arg1.method4582(Static162.aClass100_7, local60, local53, local34, local12);
				if (!arg1.aBoolean353 && Static500.anInt8419 / 8 == local40 && local46 == Static436.anInt7900 / 8 && local12[0] != -1) {
					Static382.aClass264_1 = Static25.aClass355_1.method8459(Static22.aClass354_1, local12[1], local12[3], local12[0], local12[2]);
					Static507.anInt8745 = local12[4];
				}
			}
		}
		for (@Pc(129) int local129 = 0; local129 < local15; local129++) {
			@Pc(142) int local142 = (Static480.anIntArray523[local129] >> 8) * 64 - Static606.anInt8651;
			local40 = (Static480.anIntArray523[local129] & 0xFF) * 64 - Static195.anInt3961;
			@Pc(157) byte[] local157 = arg0[local129];
			if (local157 == null && Static436.anInt7900 < 800) {
				Static54.method911();
				arg1.method4565(local142, local40);
			}
		}
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(JLclient!vd;IIIZI)V")
	public static void method3583(@OriginalArg(0) long arg0, @OriginalArg(1) Class353 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static394.method6362(arg2, arg3, arg0, arg1);
	}
}
