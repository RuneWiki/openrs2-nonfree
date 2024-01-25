import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!ei", name = "H", descriptor = "Lclient!kha;")
	public static Class181 aClass181_28;

	@OriginalMember(owner = "client!ei", name = "Q", descriptor = "Lclient!df;")
	public static Class61 aClass61_1;

	@OriginalMember(owner = "client!ei", name = "G", descriptor = "Z")
	public static boolean aBoolean245 = false;

	@OriginalMember(owner = "client!ei", name = "O", descriptor = "I")
	public static int anInt3131 = 0;

	@OriginalMember(owner = "client!ei", name = "W", descriptor = "Lclient!us;")
	public static final Class344 aClass344_30 = new Class344(53, -1);

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIZIILclient!ufa;)Z")
	public static boolean method2857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class332 arg5) {
		if (!Static20.aBoolean21 || !Static110.aBoolean234) {
			return false;
		} else if (Static314.anInt6404 < 100) {
			return false;
		} else if (arg3 != arg2 || arg0 != arg1) {
			for (@Pc(66) int local66 = arg2; local66 <= arg3; local66++) {
				for (@Pc(70) int local70 = arg1; local70 <= arg0; local70++) {
					if (Static467.anIntArrayArrayArray11[arg4][local66][local70] == -Static398.anInt7623) {
						return false;
					}
				}
			}
			if (Static116.method2774(arg5)) {
				Static104.anInt2625++;
				return true;
			} else {
				return false;
			}
		} else if (!Static562.method7912(arg4, arg2, arg1)) {
			return false;
		} else if (Static116.method2774(arg5)) {
			Static104.anInt2625++;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method2859(@OriginalArg(1) long arg0) {
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
				local47.append(Static335.aCharArray5[(int) (local51 - arg0 * 37L)]);
			}
			return local47.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)V")
	public static void method2861() {
		Static614.aClass116_1.method7962();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static148.aLongArray3[local10] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static229.aLongArray6[local24] = 0L;
		}
		Static145.anInt10356 = 0;
	}
}
