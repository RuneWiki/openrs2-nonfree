import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "I")
	public static int anInt9382 = 0;

	@OriginalMember(owner = "client!sda", name = "c", descriptor = "[S")
	public static final short[] aShortArray120 = new short[] { 51, 19, 10, 50, 11, 49, 22, 5 };

	@OriginalMember(owner = "client!sda", name = "d", descriptor = "I")
	public static int anInt9383 = 0;

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method8270(@OriginalArg(1) long arg0) {
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
			@Pc(50) StringBuffer local50 = new StringBuffer(local32);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				local50.append(Static40.aCharArray3[(int) (local54 - arg0 * 37L)]);
			}
			return local50.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(II[B)I")
	public static int method8271(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static312.method5102(arg0, 0, arg1);
	}
}
