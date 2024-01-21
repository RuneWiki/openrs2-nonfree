import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "[I")
	public static int[] anIntArray280;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "Lclient!m;")
	public static Class52 aClass52_3;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
	public static int anInt2636;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "Lclient!oe;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_6;

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1133 = Static51.method932("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1134 = aClass10_1133;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "[I")
	public static int[] anIntArray281 = new int[1000];

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1135 = Static51.method932("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
	public static void method1877() {
		Static10.aClass12_1 = new Class12();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BILclient!ug;Lclient!gd;)V")
	public static void method1880(@OriginalArg(1) int arg0, @OriginalArg(2) Class83 arg1, @OriginalArg(3) Class29_Sub1 arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class12 local9 = Static34.aClass12_4;
		synchronized (Static34.aClass12_4) {
			for (@Pc(24) Class2_Sub4 local24 = (Class2_Sub4) Static34.aClass12_4.method384(); local24 != null; local24 = (Class2_Sub4) Static34.aClass12_4.method381()) {
				if (local24.aLong139 == (long) arg0 && arg1 == local24.aClass83_1 && local24.anInt496 == 0) {
					local7 = local24.aByteArray6;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(71) byte[] local71 = arg1.method2526(arg0);
			arg2.method1046(true, arg0, arg1, local71);
		} else {
			arg2.method1046(true, arg0, arg1, local7);
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
	public static void method1881() {
		anIntArray280 = null;
		anIntArray281 = null;
		aClass10_1133 = null;
		aByteArrayArrayArray9 = null;
		aClass2_Sub1_Sub4_Sub3_6 = null;
		aClass10_1135 = null;
		aClass52_3 = null;
		aClass10_1134 = null;
	}
}
