import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "I")
	public static int anInt5938;

	@OriginalMember(owner = "client!nq", name = "r", descriptor = "I")
	public static int anInt5950;

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "[I")
	public static final int[] anIntArray449 = new int[2048];

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "Z")
	public static boolean aBoolean448 = false;

	@OriginalMember(owner = "client!nq", name = "j", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_103 = new Class216(43, 7);

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method5205() {
		if (Static333.aBoolean400 || Static111.aClass4_Sub5_Sub17_2 == null) {
			return "";
		} else if ((Static111.aClass4_Sub5_Sub17_2.aString97 == null || Static111.aClass4_Sub5_Sub17_2.aString97.length() == 0) && Static111.aClass4_Sub5_Sub17_2.aString98 != null && Static111.aClass4_Sub5_Sub17_2.aString98.length() > 0) {
			return Static111.aClass4_Sub5_Sub17_2.aString98;
		} else {
			return Static111.aClass4_Sub5_Sub17_2.aString97;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method5217(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			@Pc(29) long local29 = arg0;
			while (local29 != 0L) {
				local29 /= 37L;
				local27++;
			}
			@Pc(47) StringBuffer local47 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(51) long local51 = arg0;
				arg0 /= 37L;
				local47.append(Static174.aCharArray2[(int) (local51 - arg0 * 37L)]);
			}
			return local47.reverse().toString();
		}
	}
}
