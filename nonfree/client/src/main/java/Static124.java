import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!fu", name = "t", descriptor = "I")
	public static int anInt2688;

	@OriginalMember(owner = "client!fu", name = "h", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_89 = new Class92(57, 2);

	@OriginalMember(owner = "client!fu", name = "n", descriptor = "I")
	public static int anInt2682 = 0;

	@OriginalMember(owner = "client!fu", name = "u", descriptor = "I")
	public static int anInt2689 = 765;

	@OriginalMember(owner = "client!fu", name = "v", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IBII)I")
	public static int method2209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static120.aClass64Array1 == null) {
			return 0;
		}
		@Pc(19) int local19 = arg1 >> 7;
		@Pc(23) int local23 = arg2 >> 7;
		if (local19 < 0 || local23 < 0 || Static399.anInt6923 - 1 < local19 || Static127.anInt2696 - 1 < local23) {
			return 0;
		}
		@Pc(48) int local48 = arg0;
		if (arg0 < 3 && (Static325.aByteArrayArrayArray15[1][local19][local23] & 0x2) != 0) {
			local48 = arg0 + 1;
		}
		return Static120.aClass64Array1[local48].va(arg1, arg2);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ZLclient!eo;)V")
	public static void method2210(@OriginalArg(1) Class68 arg0) {
		if (arg0.anInt2182 == 5 && arg0.anInt2192 != -1) {
			Static273.method4057(arg0, Static266.aClass75_7);
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)V")
	public static void method2211(@OriginalArg(0) int arg0) {
		Static302.anInt5510 = arg0;
		Static231.aClass5_37.method116();
	}
}
