import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
	public static int anInt7377;

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "Lclient!so;")
	public static final Class225 aClass225_10 = new Class225();

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIII)Z")
	public static boolean method5830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static147.aByteArrayArrayArray22[0][arg0][arg1] & 0x2) != 0) {
			return true;
		} else if ((Static147.aByteArrayArrayArray22[arg2][arg0][arg1] & 0x10) == 0) {
			return Static361.method4840(arg0, arg1, arg2) == arg3;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method5831(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(25) int local25 = 0;
			@Pc(27) long local27 = arg0;
			while (local27 != 0L) {
				local27 /= 37L;
				local25++;
			}
			@Pc(43) StringBuffer local43 = new StringBuffer(local25);
			while (arg0 != 0L) {
				@Pc(47) long local47 = arg0;
				arg0 /= 37L;
				local43.append(Static274.aCharArray5[(int) (local47 - arg0 * 37L)]);
			}
			return local43.reverse().toString();
		}
	}
}
