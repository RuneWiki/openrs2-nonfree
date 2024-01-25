import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
	public static int anInt5538;

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
	public static int anInt5542;

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "[[I")
	public static int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "[I")
	public static int[] anIntArray605;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)Lclient!bd;")
	public static Class23_Sub1 method4997() {
		return Static147.anInt2723 < Static97.aClass23_Sub1Array1.length ? Static97.aClass23_Sub1Array1[Static147.anInt2723++] : null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZ)Z")
	public static boolean method5003(@OriginalArg(0) int arg0) {
		if (arg0 == 9 || arg0 == 58 || arg0 == 46 || arg0 == 10 || arg0 == 4) {
			return true;
		} else {
			return arg0 == 3 || arg0 == 1012;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
	public static String method5005(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(17) char[] local17 = new char[arg0];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < arg0; local21++) {
			@Pc(31) int local31 = arg1[arg2 + local21] & 0xFF;
			if (local31 != 0) {
				if (local31 >= 128 && local31 < 160) {
					@Pc(49) char local49 = Static239.aCharArray15[local31 - 128];
					if (local49 == '\u0000') {
						local49 = '?';
					}
					local31 = local49;
				}
				local17[local19++] = (char) local31;
			}
		}
		return new String(local17, 0, local19);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII)V")
	public static void method5009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static185.anIntArrayArray35 != null) {
			Static185.anIntArrayArray35[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static278.aByteArrayArray17 != null) {
			Static278.aByteArrayArray17[arg0][arg1] = (byte) (arg3 >> 3);
		}
		if (Static231.aByteArrayArray14 != null) {
			Static231.aByteArrayArray14[arg0][arg1] = (byte) arg4;
		}
	}
}
