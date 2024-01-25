import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_68 = new Class276(95, 10);

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_69 = new Class276(81, 8);

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method4719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static535.anInt9696 <= arg2 && Static35.anInt993 >= arg6 && arg5 >= Static55.anInt1303 && Static208.anInt4309 >= arg1) {
			Static579.method8273(arg6, arg4, arg1, arg0, arg5, arg2, arg3);
		} else {
			Static153.method2974(arg6, arg5, arg1, arg3, arg4, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(II[S)[S")
	public static short[] method4720(@OriginalArg(1) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static602.method4668(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method4722(@OriginalArg(1) long arg0) {
		if ((long) 0 >= arg0 || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(26) int local26 = 0;
			for (@Pc(28) long local28 = arg0; local28 != 0L; local28 /= 37L) {
				local26++;
			}
			@Pc(45) StringBuffer local45 = new StringBuffer(local26);
			while (arg0 != 0L) {
				@Pc(48) long local48 = arg0;
				arg0 /= 37L;
				@Pc(62) char local62 = Static508.aCharArray10[(int) (local48 - arg0 * 37L)];
				if (local62 == '_') {
					@Pc(70) int local70 = local45.length() - 1;
					local62 = ' ';
					local45.setCharAt(local70, Character.toUpperCase(local45.charAt(local70)));
				}
				local45.append(local62);
			}
			local45.reverse();
			local45.setCharAt(0, Character.toUpperCase(local45.charAt(0)));
			return local45.toString();
		}
	}
}
