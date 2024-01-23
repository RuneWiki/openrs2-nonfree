import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "Z")
	public static boolean aBoolean87 = true;

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString26 = "Loading...";

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "Lclient!cd;")
	public static Class22 aClass22_3 = new Class22(16);

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "Lclient!db;")
	public static Class31 aClass31_8 = new Class31(64);

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIII)I")
	public static int method818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg1 <= arg2 ? (arg0 < arg2 ? arg0 : arg2) : arg1;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method819(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % (long) 37 == 0L) {
			return null;
		} else {
			@Pc(30) int local30 = 0;
			@Pc(32) long local32 = arg0;
			while (local32 != 0L) {
				local32 /= 37L;
				local30++;
			}
			@Pc(50) StringBuffer local50 = new StringBuffer(local30);
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				local50.append(Static38.aCharArray5[(int) (local58 - arg0 * 37L)]);
			}
			return local50.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)I")
	public static int method820(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub10 local12 = (Class1_Sub10) Static39.aClass22_2.method633((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < local12.anIntArray234.length; local28++) {
				if (local12.anIntArray235[local28] == arg0) {
					local26 += local12.anIntArray234[local28];
				}
			}
			return local26;
		}
	}
}
