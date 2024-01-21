import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "k", descriptor = "Lclient!wc;")
	public static Class4 aClass4_1;

	@OriginalMember(owner = "client!a", name = "D", descriptor = "Lclient!cb;")
	private static Class11 aClass11_1;

	@OriginalMember(owner = "client!a", name = "Y", descriptor = "Lclient!bd;")
	public static Class8 aClass8_1;

	@OriginalMember(owner = "client!a", name = "ib", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!a", name = "n", descriptor = "I")
	public static int anInt13 = 0;

	@OriginalMember(owner = "client!a", name = "w", descriptor = "Lclient!a;")
	public static Class1 aClass1_1 = Static94.method1596("scrollbar");

	@OriginalMember(owner = "client!a", name = "J", descriptor = "I")
	public static int anInt32 = 0;

	@OriginalMember(owner = "client!a", name = "K", descriptor = "Lclient!a;")
	private static Class1 aClass1_2 = Static94.method1596("Private chat");

	@OriginalMember(owner = "client!a", name = "S", descriptor = "Lclient!a;")
	private static Class1 aClass1_3 = Static94.method1596("purple:");

	@OriginalMember(owner = "client!a", name = "V", descriptor = "Lclient!a;")
	public static Class1 aClass1_4 = Static94.method1596("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!a", name = "W", descriptor = "Lclient!a;")
	public static Class1 aClass1_5 = aClass1_2;

	@OriginalMember(owner = "client!a", name = "Z", descriptor = "[I")
	public static int[] anIntArray1 = new int[128];

	@OriginalMember(owner = "client!a", name = "eb", descriptor = "I")
	public static final int anInt46 = 50;

	@OriginalMember(owner = "client!a", name = "gb", descriptor = "Lclient!a;")
	public static Class1 aClass1_6 = Static94.method1596("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!a", name = "jb", descriptor = "Lclient!a;")
	public static Class1 aClass1_7 = Static94.method1596("chatback");

	@OriginalMember(owner = "client!a", name = "kb", descriptor = "Lclient!a;")
	public static Class1 aClass1_8 = aClass1_3;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZ[BI)V")
	public static void method7(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		if (Static8.aClass14_1 == null) {
			return;
		}
		if (Static103.anInt2605 >= 0) {
			Static8.aClass14_1.method1079();
			Static68.anInt1945 = 0;
			Static2.aByteArray2 = null;
			Static53.anInt1751 = 20;
			Static103.anInt2605 = -1;
		}
		if (arg1 == null) {
			return;
		}
		if (Static53.anInt1751 > 0) {
			Static8.aClass14_1.method1077(arg2);
			Static53.anInt1751 = 0;
		}
		Static103.anInt2605 = arg2;
		Static8.aClass14_1.method1076(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V")
	public static void method22() {
		Static6.anInt407 = 0;
		@Pc(9) int local9 = (Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2724 >> 7) + Static25.anInt1022;
		@Pc(16) int local16 = Static47.anInt1563 + (Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2717 >> 7);
		if (local9 >= 3053 && local9 <= 3156 && local16 >= 3056 && local16 <= 3136) {
			Static6.anInt407 = 1;
		}
		if (local9 >= 3072 && local9 <= 3118 && local16 >= 9492 && local16 <= 9535) {
			Static6.anInt407 = 1;
		}
		if (Static6.anInt407 == 1 && local9 >= 3139 && local9 <= 3199 && local16 >= 3008 && local16 <= 3062) {
			Static6.anInt407 = 0;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ILclient!bd;III)[B")
	public static byte[] method25(@OriginalArg(0) int arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(28) long local28 = (long) (arg0 + arg2 * 37 & 0xFFFF) + ((long) arg3 << 32) + (long) (arg2 << 16);
		if (aClass11_1 != null) {
			@Pc(36) Class2_Sub1_Sub8 local36 = (Class2_Sub1_Sub8) aClass11_1.method431(local28);
			if (local36 != null) {
				return local36.aByteArray10;
			}
		}
		@Pc(47) byte[] local47 = arg1.method1684(arg0, arg2);
		if (local47 == null) {
			return null;
		} else {
			if (aClass11_1 != null) {
				aClass11_1.method430(local28, new Class2_Sub1_Sub8(local47));
			}
			return local47;
		}
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(B)V")
	public static void method34() {
		aClass11_1 = null;
		aClass1_6 = null;
		aByteArrayArray1 = null;
		aClass1_1 = null;
		aClass8_1 = null;
		aClass1_4 = null;
		aClass1_8 = null;
		aClass4_1 = null;
		aClass1_3 = null;
		aClass1_7 = null;
		aClass1_2 = null;
		aClass1_5 = null;
		anIntArray1 = null;
	}
}
