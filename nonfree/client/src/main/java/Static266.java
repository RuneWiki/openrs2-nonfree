import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!kea", name = "A", descriptor = "I")
	public static int anInt5352;

	@OriginalMember(owner = "client!kea", name = "O", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!kea", name = "F", descriptor = "I")
	public static int anInt5356 = 0;

	@OriginalMember(owner = "client!kea", name = "H", descriptor = "I")
	public static int anInt5358 = 0;

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!qda;B)I")
	public static int method4173(@OriginalArg(0) Class273 arg0) {
		if (Static424.aClass273_9 == arg0) {
			return 5120;
		} else if (arg0 == Static424.aClass273_10) {
			return 5122;
		} else if (arg0 == Static424.aClass273_11) {
			return 5124;
		} else if (Static424.aClass273_12 == arg0) {
			return 5121;
		} else if (arg0 == Static424.aClass273_13) {
			return 5123;
		} else if (Static424.aClass273_14 == arg0) {
			return 5125;
		} else if (arg0 == Static424.aClass273_15) {
			return 5131;
		} else if (arg0 == Static424.aClass273_16) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(III)Lclient!bda;")
	public static Class21_Sub1_Sub2 method4175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class182 local7 = Static571.aClass182ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass21_Sub1_Sub2_2;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(II)V")
	public static void method4176(@OriginalArg(1) int arg0) {
		@Pc(13) Class4_Sub6_Sub5 local13 = Static396.method6079(arg0, 8);
		local13.method2302();
	}

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "(III)Z")
	public static boolean method4178(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static155.method2652(arg0, arg1) || Static432.method6461(arg0, arg1);
	}
}
