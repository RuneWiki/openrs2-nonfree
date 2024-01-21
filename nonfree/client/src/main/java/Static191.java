import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!wa", name = "A", descriptor = "Lclient!fa;")
	public static Class2_Sub1_Sub7_Sub2 aClass2_Sub1_Sub7_Sub2_4;

	@OriginalMember(owner = "client!wa", name = "p", descriptor = "Z")
	public static boolean aBoolean181 = false;

	@OriginalMember(owner = "client!wa", name = "s", descriptor = "[[I")
	public static final int[][] anIntArrayArray33 = new int[104][104];

	@OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
	public static int anInt4558 = -1;

	@OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
	public static int anInt4559 = 0;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIILclient!aa;JLclient!aa;Lclient!aa;)V")
	public static void method3498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub1 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class2_Sub1_Sub1 arg6, @OriginalArg(7) Class2_Sub1_Sub1 arg7) {
		@Pc(3) Class17 local3 = new Class17();
		local3.aClass2_Sub1_Sub1_3 = arg4;
		local3.anInt1084 = arg1 * 128 + 64;
		local3.anInt1085 = arg2 * 128 + 64;
		local3.anInt1082 = arg3;
		local3.aLong31 = arg5;
		local3.aClass2_Sub1_Sub1_4 = arg6;
		local3.aClass2_Sub1_Sub1_2 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class2_Sub17 local42 = Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt3604; local46++) {
				@Pc(52) Class6 local52 = local42.aClass6Array2[local46];
				if ((local52.aLong8 & 0x400000L) == 4194304L) {
					@Pc(63) int local63 = local52.aClass2_Sub1_Sub1_1.method3179();
					if (local63 != -32768 && local63 < local34) {
						local34 = local63;
					}
				}
			}
		}
		local3.anInt1086 = -local34;
		if (Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub17(arg0, arg1, arg2);
		}
		Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass17_1 = local3;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)V")
	public static void method3499(@OriginalArg(0) int arg0) {
		@Pc(1) Class85 local1 = Static186.aClass85_1;
		synchronized (Static186.aClass85_1) {
			Static125.anInt3413 = arg0;
		}
	}
}
