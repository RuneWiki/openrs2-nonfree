import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "Lclient!ea;")
	public static Class20_Sub1 aClass20_Sub1_9;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
	public static int anInt1496;

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "Lclient!ja;")
	public static Class39 aClass39_803 = Static28.method504("::clientdrop");

	@OriginalMember(owner = "client!jb", name = "T", descriptor = "Lclient!ja;")
	private static Class39 aClass39_808 = Static28.method504("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "Lclient!ja;")
	public static Class39 aClass39_804 = aClass39_808;

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "Lclient!ja;")
	public static Class39 aClass39_805 = Static28.method504("Wordpack geladen)3");

	@OriginalMember(owner = "client!jb", name = "K", descriptor = "[I")
	public static int[] anIntArray148 = new int[32];

	@OriginalMember(owner = "client!jb", name = "cb", descriptor = "Lclient!ja;")
	private static Class39 aClass39_811 = Static28.method504("Type");

	@OriginalMember(owner = "client!jb", name = "N", descriptor = "Lclient!ja;")
	public static Class39 aClass39_806 = aClass39_811;

	@OriginalMember(owner = "client!jb", name = "R", descriptor = "Lclient!ja;")
	private static Class39 aClass39_807 = Static28.method504("Loading title screen )2 ");

	@OriginalMember(owner = "client!jb", name = "S", descriptor = "[B")
	public static byte[] aByteArray11 = new byte[520];

	@OriginalMember(owner = "client!jb", name = "Y", descriptor = "Lclient!ja;")
	private static Class39 aClass39_809 = Static28.method504("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!jb", name = "ab", descriptor = "Lclient!ja;")
	public static Class39 aClass39_810 = Static28.method504(":tradereq:");

	@OriginalMember(owner = "client!jb", name = "db", descriptor = "I")
	public static int anInt1508 = 0;

	@OriginalMember(owner = "client!jb", name = "eb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_812 = aClass39_809;

	@OriginalMember(owner = "client!jb", name = "fb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_813 = aClass39_807;

	@OriginalMember(owner = "client!jb", name = "ib", descriptor = "Lclient!ja;")
	public static Class39 aClass39_814 = Static28.method504("compass");

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILclient!pd;B)Z")
	public static boolean method977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2) {
		@Pc(14) byte[] local14 = arg2.method474(arg0, arg1);
		if (local14 == null) {
			return false;
		} else {
			Static91.method1640(local14);
			return true;
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(II)Z")
	public static boolean method978(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
	public static void method979() {
		for (@Pc(6) Class4_Sub19 local6 = (Class4_Sub19) Static117.aClass61_15.method1628(); local6 != null; local6 = (Class4_Sub19) Static117.aClass61_15.method1629()) {
			if (local6.anInt2721 == -1) {
				local6.anInt2718 = 0;
				Static5.method1914(local6);
			} else {
				local6.method2189();
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(IB)I")
	public static int method981(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
		@Pc(19) int local19 = (local9 & 0x33333333) + ((local9 & 0xCCCCCCCE) >>> 2);
		@Pc(28) int local28 = local19 + (local19 >>> 4) & 0xF0F0F0F;
		@Pc(34) int local34 = local28 + (local28 >>> 8);
		@Pc(45) int local45 = local34 + (local34 >>> 16);
		return local45 & 0xFF;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)Z")
	public static boolean method982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 >> 14 & 0x7FFF;
		@Pc(23) int local23 = Static101.aClass43_1.method1075(Static131.anInt3202, arg2, arg1, arg0);
		if (local23 == -1) {
			return false;
		}
		@Pc(33) int local33 = local23 & 0x1F;
		@Pc(39) int local39 = local23 >> 6 & 0x3;
		if (local33 == 10 || local33 == 11 || local33 == 22) {
			@Pc(78) Class4_Sub2_Sub10 local78 = Static73.method1207(local12);
			@Pc(88) int local88;
			@Pc(91) int local91;
			if (local39 == 0 || local39 == 2) {
				local91 = local78.anInt1413;
				local88 = local78.anInt1410;
			} else {
				local88 = local78.anInt1413;
				local91 = local78.anInt1410;
			}
			@Pc(102) int local102 = local78.anInt1424;
			if (local39 != 0) {
				local102 = (local102 << local39 & 0xF) + (local102 >> 4 - local39);
			}
			Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], arg1, arg2, local102, 2, true, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], local91, local88);
		} else {
			Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], arg1, arg2, 0, 2, true, local39, local33 + 1, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 0, 0);
		}
		Static67.anInt1693 = 2;
		Static84.anInt2111 = Static1.anInt9;
		Static59.anInt1568 = Static27.anInt741;
		Static85.anInt2127 = 0;
		return true;
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
	public static void method983() {
		if (Static62.aClass66_1 != null) {
			@Pc(3) Class66 local3 = Static62.aClass66_1;
			synchronized (Static62.aClass66_1) {
				Static62.aClass66_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V")
	public static void method984() {
		aClass39_807 = null;
		aClass39_804 = null;
		aClass39_812 = null;
		aClass39_813 = null;
		aByteArray11 = null;
		aClass39_811 = null;
		aClass39_806 = null;
		aClass39_805 = null;
		aClass39_814 = null;
		aClass39_808 = null;
		aClass39_810 = null;
		anIntArray148 = null;
		aClass39_809 = null;
		aClass39_803 = null;
		aClass20_Sub1_9 = null;
	}
}
