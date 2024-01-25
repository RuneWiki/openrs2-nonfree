import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "[I")
	public static int[] anIntArray463;

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "Lclient!ng;")
	public static Class172 aClass172_1;

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "[S")
	public static final short[] aShortArray73 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)Ljava/lang/String;")
	public static String method3809() {
		@Pc(7) String local7 = "www";
		if (Static8.aClass151_1 == Static284.aClass151_8) {
			local7 = "www-wtrc";
		} else if (Static307.aClass151_9 == Static284.aClass151_8) {
			local7 = "www-wtqa";
		} else if (Static284.aClass151_8 == Static57.aClass151_2) {
			local7 = "www-wtwip";
		}
		@Pc(37) String local37 = "";
		if (Static407.aString68 != null) {
			local37 = "/p=" + Static407.aString68;
		}
		return "http://" + local7 + "." + Static102.aClass147_3.aString34 + ".com/l=" + Static191.anInt3842 + "/a=" + Static298.anInt5158 + local37 + "/";
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIILclient!ne;Lclient!ne;)V")
	public static void method3810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class24_Sub1 arg3, @OriginalArg(4) Class24_Sub1 arg4) {
		@Pc(4) Class11 local4 = Static21.method286(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass24_Sub1_2 = arg3;
			local4.aClass24_Sub1_1 = arg4;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZIB)Ljava/lang/String;")
	public static String method3813(@OriginalArg(2) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(36) int local36 = 2;
		for (@Pc(40) int local40 = arg0 / 10; local40 != 0; local40 /= 10) {
			local36++;
		}
		@Pc(60) char[] local60 = new char[local36];
		local60[0] = '+';
		for (@Pc(68) int local68 = local36 - 1; local68 > 0; local68--) {
			@Pc(72) int local72 = arg0;
			arg0 /= 10;
			@Pc(83) int local83 = local72 - arg0 * 10;
			if (local83 >= 10) {
				local60[local68] = (char) (local83 + 87);
			} else {
				local60[local68] = (char) (local83 + 48);
			}
		}
		return new String(local60);
	}
}
