import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!uq", name = "i", descriptor = "[I")
	public static final int[] anIntArray628 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!uq", name = "o", descriptor = "Lclient!wo;")
	public static final Class361 aClass361_101 = new Class361();

	@OriginalMember(owner = "client!uq", name = "r", descriptor = "[I")
	public static final int[] anIntArray629 = new int[8];

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method7808(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(31) int local31 = 0;
			for (@Pc(33) long local33 = arg0; local33 != 0L; local33 /= 37L) {
				local31++;
			}
			@Pc(49) StringBuffer local49 = new StringBuffer(local31);
			while (arg0 != 0L) {
				@Pc(53) long local53 = arg0;
				arg0 /= 37L;
				local49.append(Static579.aCharArray8[(int) (local53 - arg0 * 37L)]);
			}
			return local49.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[B)[B")
	public static byte[] method7810(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static600.method3768(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZII)Z")
	public static boolean method7812(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}
}
