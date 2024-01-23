import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "[[[Lclient!dk;")
	public static Class4_Sub11[][][] aClass4_Sub11ArrayArrayArray2;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
	public static int anInt2889 = 100;

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
	public static int anInt2892 = 1;

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "Z")
	public static boolean aBoolean190 = false;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method2286(@OriginalArg(0) long arg0) {
		if ((long) 0 >= arg0 || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(28) int local28 = 0;
			@Pc(30) long local30 = arg0;
			while (local30 != 0L) {
				local30 /= 37L;
				local28++;
			}
			@Pc(46) StringBuffer local46 = new StringBuffer(local28);
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				local46.append(Static275.aCharArray41[(int) (local52 - arg0 * 37L)]);
			}
			return local46.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public static boolean method2287(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		@Pc(4) int local4 = arg1.length();
		@Pc(16) int local16 = arg0.length();
		if (local16 > local4) {
			return false;
		}
		for (@Pc(27) int local27 = 0; local27 < local16; local27++) {
			@Pc(34) char local34 = arg1.charAt(local27);
			@Pc(38) char local38 = arg0.charAt(local27);
			if (local38 != local34 && Character.toLowerCase(local34) != Character.toLowerCase(local38) && Character.toUpperCase(local34) != Character.toUpperCase(local38)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
	public static void method2288() {
		aClass4_Sub11ArrayArrayArray2 = null;
	}
}
