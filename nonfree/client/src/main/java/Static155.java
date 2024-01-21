import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "[I")
	public static int[] anIntArray258;

	@OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
	public static int anInt2984;

	@OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
	public static int anInt2985;

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
	public static int anInt2981 = 0;

	@OriginalMember(owner = "client!qg", name = "r", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1434 = Static187.method3089("Choose Option");

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1432 = aClass92_1434;

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1433 = Static187.method3089("::autoshadow on");

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "[Lclient!o;")
	public static final Class8_Sub7[] aClass8_Sub7Array2 = new Class8_Sub7[4];

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "([BBII)I")
	public static int method2189(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = -1;
		for (@Pc(14) int local14 = arg2; local14 < arg1; local14++) {
			local3 = local3 >>> 8 ^ Class1_Sub1_Sub6.anIntArray60[(local3 ^ arg0[local14]) & 0xFF];
		}
		return ~local3;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)I")
	public static int method2190(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(18) int local18 = local4 | local4 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return local42 + 1;
	}
}
