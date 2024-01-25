import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "[I")
	public static final int[] anIntArray428 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
	public static int anInt6036 = 0;

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "J")
	public static long aLong158 = 0L;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
	public static int anInt6040 = 64;

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
	public static int anInt6041 = 0;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(IIB)B")
	public static byte method5207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)[Lclient!uq;")
	public static Class294[] method5208() {
		if (Static306.aClass294Array1 == null) {
			@Pc(9) Class294[] local9 = Static163.method3253(Static91.aClass182_2);
			@Pc(13) Class294[] local13 = new Class294[local9.length];
			@Pc(15) int local15 = 0;
			@Pc(60) int local60;
			@Pc(65) Class294 local65;
			label63: for (@Pc(17) int local17 = 0; local17 < local9.length; local17++) {
				@Pc(22) Class294 local22 = local9[local17];
				if ((local22.anInt8412 <= 0 || local22.anInt8412 >= 24) && local22.anInt8420 >= 800 && local22.anInt8416 >= 600 && (anInt6040 >= 96 || Static526.anInt8926 != 0 || local22.anInt8420 <= 1024 && local22.anInt8416 <= 768)) {
					for (local60 = 0; local60 < local15; local60++) {
						local65 = local13[local60];
						if (local22.anInt8420 == local65.anInt8420 && local22.anInt8416 == local65.anInt8416) {
							if (local65.anInt8412 < local22.anInt8412) {
								local13[local60] = local22;
							}
							continue label63;
						}
					}
					local13[local15] = local22;
					local15++;
				}
			}
			Static306.aClass294Array1 = new Class294[local15];
			Static555.method5096(local13, 0, Static306.aClass294Array1, 0, local15);
			@Pc(124) int[] local124 = new int[Static306.aClass294Array1.length];
			for (local60 = 0; local60 < Static306.aClass294Array1.length; local60++) {
				local65 = Static306.aClass294Array1[local60];
				local124[local60] = local65.anInt8416 * local65.anInt8420;
			}
			Static232.method3989(Static306.aClass294Array1, local124);
		}
		return Static306.aClass294Array1;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IC)Z")
	public static boolean method5209(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(32) char[] local32 = Static493.aCharArray7;
			for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
				@Pc(40) char local40 = local32[local34];
				if (local40 == arg0) {
					return true;
				}
			}
		}
		return false;
	}
}
