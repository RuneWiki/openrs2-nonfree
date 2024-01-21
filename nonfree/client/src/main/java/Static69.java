import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!hf", name = "o", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1082 = null;

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1083 = Static107.method1838("compass");

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1084 = Static107.method1838("Too many connections from your address)3");

	@OriginalMember(owner = "client!hf", name = "n", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1088 = Static107.method1838(" more options");

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1085 = aClass28_1088;

	@OriginalMember(owner = "client!hf", name = "x", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1091 = Static107.method1838("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1086 = aClass28_1091;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1087 = Static107.method1838("<img=0>");

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1089 = aClass28_1084;

	@OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
	public static int anInt1837 = 0;

	@OriginalMember(owner = "client!hf", name = "u", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1090 = Static107.method1838("nav");

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
	public static void method1280() {
		aShortArrayArray5 = null;
		aClass28_1088 = null;
		aClass28_1087 = null;
		aClass28_1082 = null;
		aClass28_1083 = null;
		aClass28_1084 = null;
		aClass28_1086 = null;
		aByteArrayArrayArray5 = null;
		aClass28_1089 = null;
		aClass28_1090 = null;
		aClass28_1091 = null;
		aClass28_1085 = null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!gg;Lclient!ab;B)I")
	public static int method1281(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class2_Sub2 arg1) {
		@Pc(2) int local2 = arg1.anInt2385;
		arg1.method1683(arg0.anInt1718);
		arg1.anInt2385 += Static73.aClass60_1.method2016(arg0.aByteArray14, arg1.aByteArray35, 0, arg1.anInt2385, arg0.anInt1718);
		return arg1.anInt2385 - local2;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILclient!eh;)V")
	public static void method1282(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub4_Sub1_Sub1 arg1) {
		Static10.method319(arg1.anInt1633, arg0, arg1.anInt1635);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIILclient!d;Lclient!d;IIIIJ)V")
	public static void method1286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub4_Sub1 arg4, @OriginalArg(5) Class2_Sub4_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class49 local6 = new Class49();
		local6.aLong89 = arg10;
		local6.anInt2503 = arg1 * 128 + 64;
		local6.anInt2506 = arg2 * 128 + 64;
		local6.anInt2502 = arg3;
		local6.aClass2_Sub4_Sub1_4 = arg4;
		local6.aClass2_Sub4_Sub1_3 = arg5;
		local6.anInt2504 = arg6;
		local6.anInt2500 = arg7;
		local6.anInt2505 = arg8;
		local6.anInt2508 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static133.aClass2_Sub14ArrayArrayArray1[local46][arg1][arg2] == null) {
				Static133.aClass2_Sub14ArrayArrayArray1[local46][arg1][arg2] = new Class2_Sub14(local46, arg1, arg2);
			}
		}
		Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass49_1 = local6;
	}
}
