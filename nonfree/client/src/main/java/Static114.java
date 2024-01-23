import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ig", name = "V", descriptor = "Lclient!vh;")
	public static Class177 aClass177_4;

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "S")
	public static short aShort17 = 256;

	@OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
	public static int anInt2289 = 0;

	@OriginalMember(owner = "client!ig", name = "r", descriptor = "Z")
	public static boolean aBoolean143 = true;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
	public static void method1913() {
		Static296.aClass172_49.method4346();
		Static162.aClass172_30.method4346();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method1915(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(37) long local37 = arg0;
			@Pc(39) int local39 = 0;
			while (local37 != 0L) {
				local37 /= 37L;
				local39++;
			}
			@Pc(57) StringBuffer local57 = new StringBuffer(local39);
			while (arg0 != 0L) {
				@Pc(65) long local65 = arg0;
				arg0 /= 37L;
				local57.append(Static63.aCharArray1[(int) (local65 - arg0 * 37L)]);
			}
			return local57.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
	public static void method1916() {
		Static98.aClass172_19.method4350();
	}
}
