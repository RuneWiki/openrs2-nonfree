import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "Lclient!rd;")
	public static Class72_Sub1 aClass72_Sub1_6;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	public static int anInt905 = 0;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Lclient!qe;")
	public static Class78 aClass78_167 = Static199.method3560("::qa_op_test");

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
	public static int anInt906 = 0;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
	public static int anInt908 = 0;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "Lclient!qe;")
	private static Class78 aClass78_169 = Static199.method3560("Loaded input handler");

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "Lclient!qe;")
	public static Class78 aClass78_168 = aClass78_169;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)I")
	public static int method648(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!aa;B)V")
	public static void method649(@OriginalArg(0) Class2_Sub1 arg0) {
		Static91.method1595(200000, arg0);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)Lclient!uc;")
	public static Class100 method650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub12 local7 = Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt775; local13++) {
			@Pc(19) Class100 local19 = local7.aClass100Array3[local13];
			if ((local19.aLong169 >> 29 & 0x3L) == 2L && local19.anInt4529 == arg1 && local19.anInt4517 == arg2) {
				return local19;
			}
		}
		return null;
	}
}
