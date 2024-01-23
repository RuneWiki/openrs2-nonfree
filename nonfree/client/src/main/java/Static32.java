import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!d", name = "h", descriptor = "I")
	public static int anInt814;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "Lclient!j;")
	public static Class1_Sub15 aClass1_Sub15_1 = new Class1_Sub15(0, 0);

	@OriginalMember(owner = "client!d", name = "f", descriptor = "I")
	public static int anInt813 = 0;

	@OriginalMember(owner = "client!d", name = "g", descriptor = "Lclient!kh;")
	public static Class60 aClass60_267 = Static200.method3116("titlebox");

	@OriginalMember(owner = "client!d", name = "j", descriptor = "[I")
	public static int[] anIntArray112 = new int[50];

	@OriginalMember(owner = "client!d", name = "k", descriptor = "[I")
	public static int[] anIntArray113 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!d", name = "n", descriptor = "I")
	public static int anInt816 = -1;

	@OriginalMember(owner = "client!d", name = "o", descriptor = "Lclient!kh;")
	public static Class60 aClass60_268 = Static200.method3116("hitmarks");

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIILclient!dd;Lclient!dd;IIIIJ)V")
	public static void method596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class9 arg4, @OriginalArg(5) Class9 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class106 local6 = new Class106();
		local6.aLong141 = arg10;
		local6.anInt4532 = arg1 * 128 + 64;
		local6.anInt4525 = arg2 * 128 + 64;
		local6.anInt4530 = arg3;
		local6.aClass9_10 = arg4;
		local6.aClass9_11 = arg5;
		local6.anInt4529 = arg6;
		local6.anInt4531 = arg7;
		local6.anInt4528 = arg8;
		local6.anInt4526 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static100.aClass1_Sub22ArrayArrayArray3[local46][arg1][arg2] == null) {
				Static100.aClass1_Sub22ArrayArrayArray3[local46][arg1][arg2] = new Class1_Sub22(local46, arg1, arg2);
			}
		}
		Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2].aClass106_1 = local6;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III)Lclient!ib;")
	public static Class47 method597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub22 local7 = Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass47_1;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Lclient!kh;")
	public static Class60 method599(@OriginalArg(1) int arg0) {
		@Pc(3) Class60 local3 = new Class60();
		local3.aByteArray34 = new byte[arg0];
		local3.anInt2439 = 0;
		return local3;
	}
}
