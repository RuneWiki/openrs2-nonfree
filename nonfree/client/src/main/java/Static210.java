import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
	public static int anInt4127;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "[I")
	public static int[] anIntArray457 = new int[25];

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString145 = "flash1:";

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIILclient!qf;Lclient!qf;IIIIJ)V")
	public static void method3471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class10 arg4, @OriginalArg(5) Class10 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class95 local6 = new Class95();
		local6.aLong124 = arg10;
		local6.anInt2807 = arg1 * 128 + 64;
		local6.anInt2814 = arg2 * 128 + 64;
		local6.anInt2812 = arg3;
		local6.aClass10_9 = arg4;
		local6.aClass10_8 = arg5;
		local6.anInt2809 = arg6;
		local6.anInt2811 = arg7;
		local6.anInt2813 = arg8;
		local6.anInt2806 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static146.aClass3_Sub25ArrayArrayArray7[local46][arg1][arg2] == null) {
				Static146.aClass3_Sub25ArrayArrayArray7[local46][arg1][arg2] = new Class3_Sub25(local46, arg1, arg2);
			}
		}
		Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2].aClass95_1 = local6;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	public static void method3472() {
		Static8.method138();
		Static59.anInterface1Array1 = new Interface1[8];
		Static59.anInterface1Array1[1] = new Class140();
		Static59.anInterface1Array1[2] = new Class1();
		Static59.anInterface1Array1[3] = new Class50();
		Static59.anInterface1Array1[4] = new Class44();
		Static59.anInterface1Array1[5] = new Class149();
		Static59.anInterface1Array1[6] = new Class112();
		Static59.anInterface1Array1[7] = new Class16();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIII)V")
	public static void method3473(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(12) int local12 = 0; local12 < Static123.anInt2326; local12++) {
			if (arg1 < Static150.anIntArray329[local12] + Static125.anIntArray288[local12] && arg0 + arg1 > Static150.anIntArray329[local12] && arg2 < Static278.anIntArray540[local12] + Static73.anIntArray134[local12] && Static73.anIntArray134[local12] < arg3 + arg2) {
				Static223.aBooleanArray102[local12] = true;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
	public static void method3474(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub4_Sub7 local8 = Static34.method528(arg0, 14);
		local8.method970();
	}
}
