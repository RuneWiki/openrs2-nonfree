import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!hd", name = "Q", descriptor = "I")
	public static int anInt3856;

	@OriginalMember(owner = "client!hd", name = "M", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_66 = new Class90(89, -2);

	@OriginalMember(owner = "client!hd", name = "S", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_67 = new Class90(42, 2);

	@OriginalMember(owner = "client!hd", name = "T", descriptor = "[I")
	public static final int[] anIntArray181 = new int[8];

	@OriginalMember(owner = "client!hd", name = "U", descriptor = "[I")
	public static final int[] anIntArray182 = new int[200];

	@OriginalMember(owner = "client!hd", name = "V", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_26 = new Class344(34, 7);

	@OriginalMember(owner = "client!hd", name = "W", descriptor = "I")
	public static final int anInt3858 = 1407;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method3033(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(25) int local25 = 0;
			for (@Pc(27) long local27 = arg0; local27 != 0L; local27 /= 37L) {
				local25++;
			}
			@Pc(50) StringBuffer local50 = new StringBuffer(local25);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				@Pc(68) char local68 = Static334.aCharArray5[(int) (local54 - arg0 * 37L)];
				if (local68 == '_') {
					@Pc(78) int local78 = local50.length() - 1;
					local50.setCharAt(local78, Character.toUpperCase(local50.charAt(local78)));
					local68 = ' ';
				}
				local50.append(local68);
			}
			local50.reverse();
			local50.setCharAt(0, Character.toUpperCase(local50.charAt(0)));
			return local50.toString();
		}
	}

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)V")
	public static void method3035(@OriginalArg(0) int arg0) {
		Static118.anInt2705 = arg0;
	}
}
