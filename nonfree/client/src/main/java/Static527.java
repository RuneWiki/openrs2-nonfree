import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
	public static int anInt8915;

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray6;

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "Z")
	public static boolean aBoolean646 = false;

	@OriginalMember(owner = "client!wa", name = "r", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_225 = new Class150(50, 2);

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIB)Z")
	public static boolean method7220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIII)V")
	public static void method7222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg4 - arg0;
		@Pc(14) int local14 = arg1 - arg2;
		if (local9 == 0) {
			if (local14 != 0) {
				Static434.method6199(arg3, arg1, arg0, arg2);
			}
		} else if (local14 == 0) {
			Static538.method7316(arg4, arg0, arg3, arg2);
		} else {
			@Pc(50) int local50 = (local14 << 12) / local9;
			@Pc(59) int local59 = arg2 - (local50 * arg0 >> 12);
			@Pc(79) int local79;
			@Pc(77) int local77;
			if (arg4 < Static398.anInt7144) {
				local79 = Static398.anInt7144;
				local77 = local59 + (Static398.anInt7144 * local50 >> 12);
			} else if (arg4 > Static71.anInt4958) {
				local77 = (Static71.anInt4958 * local50 >> 12) + local59;
				local79 = Static71.anInt4958;
			} else {
				local79 = arg4;
				local77 = arg1;
			}
			@Pc(109) int local109;
			@Pc(117) int local117;
			if (Static398.anInt7144 > arg0) {
				local109 = Static398.anInt7144;
				local117 = local59 + (local50 * Static398.anInt7144 >> 12);
			} else if (arg0 > Static71.anInt4958) {
				local109 = Static71.anInt4958;
				local117 = (Static71.anInt4958 * local50 >> 12) + local59;
			} else {
				local117 = arg2;
				local109 = arg0;
			}
			if (Static4.anInt6709 > local77) {
				local79 = (Static4.anInt6709 - local59 << 12) / local50;
				local77 = Static4.anInt6709;
			} else if (Static492.anInt8451 < local77) {
				local77 = Static492.anInt8451;
				local79 = (Static492.anInt8451 - local59 << 12) / local50;
			}
			if (Static4.anInt6709 > local117) {
				local109 = (Static4.anInt6709 - local59 << 12) / local50;
				local117 = Static4.anInt6709;
			} else if (Static492.anInt8451 < local117) {
				local117 = Static492.anInt8451;
				local109 = (Static492.anInt8451 - local59 << 12) / local50;
			}
			Static422.method6054(local109, local77, local79, arg3, local117);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method7226() {
		return Static218.aBoolean250 || Static148.aClass5_Sub47_1 == null ? "" : Static148.aClass5_Sub47_1.aString77;
	}
}
