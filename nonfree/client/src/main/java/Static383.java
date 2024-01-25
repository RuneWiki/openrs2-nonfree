import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "I")
	public static int anInt7014;

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "I")
	public static int anInt7012 = 0;

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "[I")
	public static final int[] anIntArray496 = new int[8];

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "I")
	public static int anInt7015 = 0;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method5604(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			for (@Pc(34) long local34 = arg0; local34 != 0L; local34 /= 37L) {
				local32++;
			}
			@Pc(50) StringBuffer local50 = new StringBuffer(local32);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				local50.append(Static273.aCharArray4[(int) (local54 - arg0 * 37L)]);
			}
			return local50.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIB)Z")
	public static boolean method5606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static314.method4912(arg1, arg0) || Static317.method4952(arg1, arg0);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(II)I")
	public static int method5607(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
