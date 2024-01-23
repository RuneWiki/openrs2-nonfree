import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
	public static int anInt1732;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray15 = new int[104][104];

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
	public static int anInt1733 = 0;

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "Lclient!i;")
	public static Class41 aClass41_548 = Static184.method2923(":duelfriend:");

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
	public static int anInt1737 = 0;

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "Lclient!i;")
	public static Class41 aClass41_549 = Static184.method2923("sl_back");

	@OriginalMember(owner = "client!uj", name = "n", descriptor = "[Lclient!i;")
	public static Class41[] aClass41Array25 = new Class41[100];

	@OriginalMember(owner = "client!uj", name = "o", descriptor = "Lclient!i;")
	public static Class41 aClass41_550 = Static184.method2923("");

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)I")
	public static int method1217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) long local6 = (long) (arg1 + (arg0 << 16));
		return Static48.aClass2_Sub2_Sub7_1 != null && Static48.aClass2_Sub2_Sub7_1.aLong150 == local6 ? Static134.aClass2_Sub3_5.anInt239 * 99 / (Static134.aClass2_Sub3_5.aByteArray4.length - Static48.aClass2_Sub2_Sub7_1.aByte4) + 1 : 0;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBI)I")
	public static int method1218(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = 0;
		while (arg1 > 0) {
			local15 = arg0 & 0x1 | local15 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local15;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIBI)I")
	public static int method1220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = 256 - arg1;
		return ((arg2 & 0xFF00FF) * local13 + arg1 * (arg0 & 0xFF00FF) & 0xFF00FF00) + ((arg0 & 0xFF00) * arg1 + local13 * (arg2 & 0xFF00) & 0xFF0000) >> 8;
	}
}
