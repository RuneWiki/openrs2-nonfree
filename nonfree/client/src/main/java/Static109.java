import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ua", name = "L", descriptor = "Lclient!a;")
	public static Class1 aClass1_9 = new Class1();

	@OriginalMember(owner = "client!ua", name = "V", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1639 = Static80.method1463("Fertigkeit)2");

	@OriginalMember(owner = "client!ua", name = "X", descriptor = "Lclient!a;")
	public static Class1 aClass1_10 = new Class1();

	@OriginalMember(owner = "client!ua", name = "Z", descriptor = "[I")
	public static int[] anIntArray350 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ua", name = "ab", descriptor = "[J")
	public static long[] aLongArray6 = new long[32];

	@OriginalMember(owner = "client!ua", name = "bb", descriptor = "I")
	public static int anInt3032 = 0;

	@OriginalMember(owner = "client!ua", name = "cb", descriptor = "I")
	public static int anInt3033 = 0;

	@OriginalMember(owner = "client!ua", name = "db", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1640 = Static80.method1463("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)V")
	public static void method2030() {
		Static60.aByteArrayArrayArray51 = null;
		Static92.anIntArray286 = null;
		Static79.aByteArrayArrayArray59 = null;
		Static89.anIntArrayArrayArray9 = null;
		Static32.anIntArray136 = null;
		Static105.anIntArray321 = null;
		Static31.aByteArrayArrayArray28 = null;
		Static54.anIntArray178 = null;
		Static18.anIntArray62 = null;
		Static44.aByteArrayArrayArray38 = null;
		Static53.anIntArrayArray36 = null;
		Static66.aByteArrayArrayArray91 = null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZILclient!ge;)Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3 method2031(@OriginalArg(1) int arg0, @OriginalArg(2) Class7 arg1) {
		return Static124.method2177(arg0, arg1) ? Static36.method868() : null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIB)I")
	public static int method2032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg0 > 0) {
			local12 = local12 << 1 | arg1 & 0x1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
	public static void method2033() {
		aLongArray6 = null;
		aClass1_10 = null;
		aClass63_1640 = null;
		aClass1_9 = null;
		aClass63_1639 = null;
		anIntArray350 = null;
	}
}
