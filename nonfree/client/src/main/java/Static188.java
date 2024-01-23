import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!oj", name = "u", descriptor = "[[[Lclient!sg;")
	public static Class8_Sub27[][][] aClass8_Sub27ArrayArrayArray2;

	@OriginalMember(owner = "client!oj", name = "H", descriptor = "Lclient!lg;")
	public static Class102 aClass102_6;

	@OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
	public static int anInt3774 = 0;

	@OriginalMember(owner = "client!oj", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString133 = "Loading...";

	@OriginalMember(owner = "client!oj", name = "F", descriptor = "Lclient!pd;")
	public static Class129 aClass129_20 = new Class129(32);

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V")
	public static void method2942() {
		Static231.aClass8_Sub8_Sub2_3.method2134();
		Static240.aClass132_82 = null;
		Static283.anInt5551 = 1;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIILclient!eh;JLclient!eh;Lclient!eh;)V")
	public static void method2944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class36 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class36 arg6, @OriginalArg(7) Class36 arg7) {
		@Pc(3) Class95 local3 = new Class95();
		local3.aClass36_3 = arg4;
		local3.anInt2781 = arg1 * 128 + 64;
		local3.anInt2783 = arg2 * 128 + 64;
		local3.anInt2785 = arg3;
		local3.aLong105 = arg5;
		local3.aClass36_2 = arg6;
		local3.aClass36_4 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class8_Sub27 local42 = Static178.aClass8_Sub27ArrayArrayArray1[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt4857; local46++) {
				@Pc(55) Class170 local55 = local42.aClass170Array3[local46];
				if ((local55.aLong196 & 0x400000L) == 4194304L) {
					@Pc(66) int local66 = local55.aClass36_10.method4175();
					if (local66 != -32768 && local66 < local34) {
						local34 = local66;
					}
				}
			}
		}
		local3.anInt2779 = -local34;
		if (Static178.aClass8_Sub27ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static178.aClass8_Sub27ArrayArrayArray1[arg0][arg1][arg2] = new Class8_Sub27(arg0, arg1, arg2);
		}
		Static178.aClass8_Sub27ArrayArrayArray1[arg0][arg1][arg2].aClass95_1 = local3;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)I")
	public static int method2947(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
