import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!in", name = "D", descriptor = "I")
	public static int anInt2332;

	@OriginalMember(owner = "client!in", name = "E", descriptor = "I")
	public static int anInt2333;

	@OriginalMember(owner = "client!in", name = "F", descriptor = "[B")
	public static byte[] aByteArray33;

	@OriginalMember(owner = "client!in", name = "o", descriptor = "I")
	public static int anInt2319 = 0;

	@OriginalMember(owner = "client!in", name = "v", descriptor = "I")
	public static int anInt2326 = 0;

	@OriginalMember(owner = "client!in", name = "x", descriptor = "Lclient!l;")
	public static Class98 aClass98_15 = new Class98(32);

	@OriginalMember(owner = "client!in", name = "G", descriptor = "[I")
	public static int[] anIntArray281 = new int[128];

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZIZIZ)V")
	public static void method2047(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static87.method3727(arg2, arg3, arg0, Static100.aClass87_Sub1Array1.length - 1, arg1, 0);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BI)V")
	public static void method2048() {
		Static28.aClass98_6.method2565(5);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIILclient!qf;JLclient!qf;Lclient!qf;)V")
	public static void method2049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class10 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class10 arg6, @OriginalArg(7) Class10 arg7) {
		@Pc(3) Class23 local3 = new Class23();
		local3.aClass10_4 = arg4;
		local3.anInt564 = arg1 * 128 + 64;
		local3.anInt569 = arg2 * 128 + 64;
		local3.anInt566 = arg3;
		local3.aLong21 = arg5;
		local3.aClass10_6 = arg6;
		local3.aClass10_5 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class3_Sub25 local42 = Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt4483; local46++) {
				@Pc(55) Class85 local55 = local42.aClass85Array3[local46];
				if ((local55.aLong107 & 0x400000L) == 4194304L) {
					@Pc(66) int local66 = local55.aClass10_7.method4973();
					if (local66 != -32768 && local66 < local34) {
						local34 = local66;
					}
				}
			}
		}
		local3.anInt570 = -local34;
		if (Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2] == null) {
			Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2] = new Class3_Sub25(arg0, arg1, arg2);
		}
		Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2].aClass23_1 = local3;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method2050(@OriginalArg(1) String arg0) {
		@Pc(9) String local9 = Static249.method4208(Static42.method615(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZIIZIII)V")
	public static void method2052(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static135.anInt2608 = arg0;
		Static210.anInt4127 = arg3;
		Static125.anInt2417 = arg4;
		Static20.anInt370 = arg1;
		Static179.anInt3343 = arg5;
		if (arg2 && Static125.anInt2417 >= 100) {
			Static173.anInt3251 = Static135.anInt2608 * 128 + 64;
			Static230.anInt4492 = Static20.anInt370 * 128 + 64;
			Static224.anInt6075 = Static122.method2036(Static173.anInt3251, Static230.anInt4492, Static99.anInt1826) - Static210.anInt4127;
		}
		Static25.anInt467 = 2;
	}
}
