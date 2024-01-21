import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!rf", name = "jb", descriptor = "Lclient!f;")
	public static Class13 aClass13_27;

	@OriginalMember(owner = "client!rf", name = "nb", descriptor = "[Lclient!re;")
	public static Class3_Sub1_Sub3_Sub4[] aClass3_Sub1_Sub3_Sub4Array10;

	@OriginalMember(owner = "client!rf", name = "ob", descriptor = "I")
	public static int anInt3252;

	@OriginalMember(owner = "client!rf", name = "bb", descriptor = "I")
	public static final int anInt3245 = 50;

	@OriginalMember(owner = "client!rf", name = "L", descriptor = "[I")
	public static int[] anIntArray339 = new int[anInt3245];

	@OriginalMember(owner = "client!rf", name = "Q", descriptor = "[I")
	public static int[] anIntArray340 = new int[anInt3245];

	@OriginalMember(owner = "client!rf", name = "T", descriptor = "[I")
	public static int[] anIntArray341 = new int[anInt3245];

	@OriginalMember(owner = "client!rf", name = "V", descriptor = "[I")
	public static int[] anIntArray342 = new int[anInt3245];

	@OriginalMember(owner = "client!rf", name = "X", descriptor = "Lclient!p;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!rf", name = "Y", descriptor = "[Lclient!sd;")
	public static Class73[] aClass73Array22 = new Class73[anInt3245];

	@OriginalMember(owner = "client!rf", name = "Z", descriptor = "[I")
	public static int[] anIntArray343 = new int[anInt3245];

	@OriginalMember(owner = "client!rf", name = "db", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1787 = Static122.method531(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!rf", name = "gb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1788 = Static122.method531("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!rf", name = "ib", descriptor = "[I")
	public static int[] anIntArray344 = new int[anInt3245];

	@OriginalMember(owner = "client!rf", name = "kb", descriptor = "[I")
	public static int[] anIntArray345 = new int[anInt3245];

	@OriginalMember(owner = "client!rf", name = "sb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1789 = aClass73_1788;

	@OriginalMember(owner = "client!rf", name = "ub", descriptor = "I")
	public static int anInt3256 = 0;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)V")
	public static void method2351(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub16 local12 = (Class3_Sub16) Static69.aClass16_6.method554((long) arg0);
		if (local12 != null) {
			for (@Pc(17) int local17 = 0; local17 < local12.anIntArray307.length; local17++) {
				local12.anIntArray307[local17] = -1;
				local12.anIntArray306[local17] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "(I)V")
	public static void method2356() {
		anIntArray344 = null;
		anIntArray340 = null;
		anIntArray341 = null;
		anIntArray345 = null;
		aClass73_1787 = null;
		anIntArray343 = null;
		aClass73_1788 = null;
		aClass73Array22 = null;
		aClass73_1789 = null;
		anIntArray342 = null;
		aClass3_Sub1_Sub3_Sub4Array10 = null;
		aClass13_27 = null;
		anIntArray339 = null;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIB)V")
	public static void method2357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static139.aClass3_Sub12_Sub1_3.method1400(25);
		Static139.aClass3_Sub12_Sub1_3.method1344(arg1);
		Static139.aClass3_Sub12_Sub1_3.method1391(arg0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!vd;I)V")
	public static void method2358(@OriginalArg(0) Class83 arg0) {
		@Pc(6) int local6 = arg0.anInt3735;
		if (local6 == 324) {
			if (Static113.anInt2747 == -1) {
				Static181.anInt3974 = arg0.anInt3697;
				Static113.anInt2747 = arg0.anInt3698;
			}
			if (Static30.aClass52_1.aBoolean147) {
				arg0.anInt3698 = Static113.anInt2747;
			} else {
				arg0.anInt3698 = Static181.anInt3974;
			}
		} else if (local6 == 325) {
			if (Static113.anInt2747 == -1) {
				Static181.anInt3974 = arg0.anInt3697;
				Static113.anInt2747 = arg0.anInt3698;
			}
			if (Static30.aClass52_1.aBoolean147) {
				arg0.anInt3698 = Static181.anInt3974;
			} else {
				arg0.anInt3698 = Static113.anInt2747;
			}
		} else if (local6 == 327) {
			arg0.anInt3672 = 150;
			arg0.anInt3704 = (int) (Math.sin((double) Static44.anInt1024 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt3678 = -1;
			arg0.anInt3734 = 5;
		} else if (local6 == 328) {
			arg0.anInt3672 = 150;
			arg0.anInt3704 = (int) (Math.sin((double) Static44.anInt1024 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt3734 = 5;
			arg0.anInt3678 = ((int) Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.aClass73_1521.method2425() << 11) + 2047;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)Lclient!sd;")
	public static Class73 method2359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return Static58.aClass73_752;
		} else if (local8 < -6) {
			return Static53.aClass73_2104;
		} else if (local8 < -3) {
			return Static118.aClass73_2100;
		} else if (local8 < 0) {
			return Static133.aClass73_1694;
		} else if (local8 > 9) {
			return Static86.aClass73_1045;
		} else if (local8 > 6) {
			return Static13.aClass73_192;
		} else if (local8 > 3) {
			return Static132.aClass73_1681;
		} else if (local8 > 0) {
			return Static91.aClass73_1155;
		} else {
			return Static57.aClass73_733;
		}
	}
}
