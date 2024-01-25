import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!ik", name = "r", descriptor = "Lclient!ri;")
	public static Class284 aClass284_69;

	@OriginalMember(owner = "client!ik", name = "y", descriptor = "J")
	public static long aLong108;

	@OriginalMember(owner = "client!ik", name = "s", descriptor = "Z")
	public static boolean aBoolean296 = false;

	@OriginalMember(owner = "client!ik", name = "t", descriptor = "Lclient!pw;")
	public static final Class265 aClass265_7 = new Class265();

	@OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
	public static int anInt4632 = 0;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
	public static void method3713() {
		if (!Static273.aBoolean345) {
			return;
		}
		while (true) {
			while (Static83.anInt2243 < Static497.aClass48_Sub1Array2.length) {
				@Pc(25) Class48_Sub1 local25 = Static497.aClass48_Sub1Array2[Static83.anInt2243];
				if (local25 != null && local25.anInt1536 == -1) {
					if (Static592.aClass3_Sub28_4 == null) {
						Static592.aClass3_Sub28_4 = Static306.aClass325_1.method7259(local25.aString30);
					}
					@Pc(48) int local48 = Static592.aClass3_Sub28_4.anInt4967;
					if (local48 == -1) {
						return;
					}
					Static592.aClass3_Sub28_4 = null;
					Static83.anInt2243++;
					local25.anInt1536 = local48;
				} else {
					Static83.anInt2243++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB)I")
	public static int method3717(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
