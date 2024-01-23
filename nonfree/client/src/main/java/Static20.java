import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
	public static int anInt2216 = -1;

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "Lclient!sc;")
	private static Class107 aClass107_606 = Static231.method3737(" ");

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "Lclient!sc;")
	public static Class107 aClass107_607 = aClass107_606;

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "Z")
	public static boolean aBoolean199 = false;

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "[Z")
	public static boolean[] aBooleanArray18 = new boolean[100];

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
	public static int anInt2218 = 0;

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "Lclient!sc;")
	public static Class107 aClass107_608 = Static231.method3737("overlay");

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
	public static void method1727() {
		Static98.aClass61_36.method1697();
		Static192.aClass61_74.method1697();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIILclient!af;JLclient!af;Lclient!af;)V")
	public static void method1728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) Class5 arg7) {
		@Pc(3) Class47 local3 = new Class47();
		local3.aClass5_6 = arg4;
		local3.anInt1708 = arg1 * 128 + 64;
		local3.anInt1700 = arg2 * 128 + 64;
		local3.anInt1712 = arg3;
		local3.aLong58 = arg5;
		local3.aClass5_4 = arg6;
		local3.aClass5_5 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class1_Sub9 local42 = Static174.aClass1_Sub9ArrayArrayArray2[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt1416; local46++) {
				@Pc(52) Class99 local52 = local42.aClass99Array2[local46];
				if ((local52.aLong140 & 0x400000L) == 4194304L) {
					@Pc(63) int local63 = local52.aClass5_10.method2297();
					if (local63 != -32768 && local63 < local34) {
						local34 = local63;
					}
				}
			}
		}
		local3.anInt1705 = -local34;
		if (Static174.aClass1_Sub9ArrayArrayArray2[arg0][arg1][arg2] == null) {
			Static174.aClass1_Sub9ArrayArrayArray2[arg0][arg1][arg2] = new Class1_Sub9(arg0, arg1, arg2);
		}
		Static174.aClass1_Sub9ArrayArrayArray2[arg0][arg1][arg2].aClass47_1 = local3;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)I")
	public static int method1730() {
		return 2;
	}
}
