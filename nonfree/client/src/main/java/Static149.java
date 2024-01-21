import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!tb", name = "hb", descriptor = "I")
	public static int anInt3708;

	@OriginalMember(owner = "client!tb", name = "ib", descriptor = "[[[Lclient!qh;")
	public static Class3_Sub20[][][] aClass3_Sub20ArrayArrayArray1;

	@OriginalMember(owner = "client!tb", name = "mb", descriptor = "[I")
	public static int[] anIntArray625;

	@OriginalMember(owner = "client!tb", name = "Y", descriptor = "[J")
	public static long[] aLongArray6 = new long[500];

	@OriginalMember(owner = "client!tb", name = "eb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1246 = Static170.method3101("shake:");

	@OriginalMember(owner = "client!tb", name = "cb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1245 = aClass28_1246;

	@OriginalMember(owner = "client!tb", name = "jb", descriptor = "I")
	public static final int anInt3709 = 3353893;

	@OriginalMember(owner = "client!tb", name = "kb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1247 = aClass28_1246;

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)V")
	public static void method2827() {
		aClass28_1245 = null;
		anIntArray625 = null;
		aClass28_1247 = null;
		aClass3_Sub20ArrayArrayArray1 = null;
		aLongArray6 = null;
		aClass28_1246 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(JI)Lclient!eh;")
	public static Class28 method2829(@OriginalArg(0) long arg0) {
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
			@Pc(45) byte[] local45 = new byte[local25];
			while (arg0 != 0L) {
				@Pc(48) long local48 = arg0;
				arg0 /= 37L;
				local25--;
				local45[local25] = Static129.aByteArray34[(int) (local48 - arg0 * 37L)];
			}
			@Pc(75) Class28 local75 = new Class28();
			local75.aByteArray15 = local45;
			local75.anInt1118 = local45.length;
			return local75;
		}
	}
}
