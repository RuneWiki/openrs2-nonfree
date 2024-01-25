import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "J")
	public static long aLong169;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "Lclient!du;")
	public static Class57 aClass57_14;

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "[I")
	public static int[] anIntArray487;

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
	public static int anInt5375;

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString54 = "";

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "[I")
	public static final int[] anIntArray488 = new int[2];

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "[C")
	public static final char[] aCharArray8 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)Lclient!fp;")
	public static Class83 method4307(@OriginalArg(0) int arg0) {
		@Pc(8) Class83[] local8 = Static350.method4526();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			if (local8[local15].anInt2400 == arg0) {
				return local8[local15];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)Z")
	public static boolean method4308(@OriginalArg(1) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
	public static void method4309() {
		Static1.aClass85_1 = new Class85();
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method4310(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
