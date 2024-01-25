import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static629 {

	@OriginalMember(owner = "client!wha", name = "h", descriptor = "[Lclient!mo;")
	public static Class221[] aClass221Array1;

	@OriginalMember(owner = "client!wha", name = "l", descriptor = "[S")
	public static short[] aShortArray146;

	@OriginalMember(owner = "client!wha", name = "i", descriptor = "I")
	public static int anInt10094 = 0;

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(IIII)V")
	public static void method8651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class16 local9 = Static401.aClass16ArrayArray1[arg2][arg0];
		Static388.method6232(local9 == null ? Static314.aClass16_2 : local9, arg1);
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method8652(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			@Pc(34) long local34 = arg0;
			while (local34 != 0L) {
				local34 /= 37L;
				local32++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local32);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				@Pc(70) char local70 = Static152.aCharArray2[(int) (local56 - arg0 * 37L)];
				if (local70 == '_') {
					@Pc(80) int local80 = local52.length() - 1;
					local70 = ' ';
					local52.setCharAt(local80, Character.toUpperCase(local52.charAt(local80)));
				}
				local52.append(local70);
			}
			local52.reverse();
			local52.setCharAt(0, Character.toUpperCase(local52.charAt(0)));
			return local52.toString();
		}
	}
}
