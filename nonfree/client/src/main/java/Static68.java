import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!lf", name = "U", descriptor = "I")
	public static int anInt1859;

	@OriginalMember(owner = "client!lf", name = "bb", descriptor = "[Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4[] aClass3_Sub1_Sub1_Sub4Array37;

	@OriginalMember(owner = "client!lf", name = "eb", descriptor = "I")
	public static int anInt1865;

	@OriginalMember(owner = "client!lf", name = "qb", descriptor = "Lclient!we;")
	public static Class3_Sub3_Sub4 aClass3_Sub3_Sub4_2;

	@OriginalMember(owner = "client!lf", name = "Vb", descriptor = "Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4 aClass3_Sub1_Sub1_Sub4_41;

	@OriginalMember(owner = "client!lf", name = "ab", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1001 = Static33.method650("Ihre Nachricht an: ");

	@OriginalMember(owner = "client!lf", name = "ib", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1002 = Static33.method650("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!lf", name = "mb", descriptor = "I")
	public static int anInt1869 = 0;

	@OriginalMember(owner = "client!lf", name = "nb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1003 = Static33.method650("An:");

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
	public static void method1234() {
		try {
			@Pc(10) Graphics local10 = Static59.aCanvas1.getGraphics();
			Static2.aClass30_1.method811(4, 4, local10);
		} catch (@Pc(18) Exception local18) {
			Static59.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZZLjava/lang/Object;)[B")
	public static byte[] method1237(@OriginalArg(1) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(21) byte[] local21 = (byte[]) arg1;
			return arg0 ? Static123.method1972(local21) : local21;
		} else if (arg1 instanceof Class35) {
			@Pc(35) Class35 local35 = (Class35) arg1;
			return local35.method973();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZI)I")
	public static int method1238(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(29) int local29 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local29;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "(I)V")
	public static void method1247() {
		if (!Static119.aBoolean162) {
			return;
		}
		Static59.aClass3_Sub1_Sub1_Sub4_37 = null;
		Static127.aClass30_18 = null;
		Static69.aClass3_Sub1_Sub1_Sub4_43 = null;
		Static66.anIntArray32 = null;
		Static113.aClass3_Sub1_Sub1_Sub4_68 = null;
		Static93.aClass3_Sub1_Sub1_Sub4_57 = null;
		Static12.aClass3_Sub1_Sub1_Sub4_9 = null;
		Static69.aClass3_Sub1_Sub1_Sub4_44 = null;
		Static69.anIntArray160 = null;
		Static40.aClass3_Sub1_Sub1_Sub4_26 = null;
		aClass3_Sub1_Sub1_Sub4_41 = null;
		Static57.aClass30_10 = null;
		Static80.aClass30_13 = null;
		Static105.aClass30_16 = null;
		Static50.anIntArray99 = null;
		Static76.aClass30_12 = null;
		Static80.aClass3_Sub1_Sub1_Sub4Array44 = null;
		Static33.aClass30_6 = null;
		Static111.aClass30_17 = null;
		Static41.aClass3_Sub1_Sub1_Sub4_27 = null;
		Static64.aClass3_Sub1_Sub1_Sub4_39 = null;
		Static44.aClass30_7 = null;
		Static92.aClass30_14 = null;
		Static65.anIntArray142 = null;
		Static84.aClass3_Sub1_Sub1_Sub4_52 = null;
		Static2.aClass30_1 = null;
		Static31.aClass30_5 = null;
		Static16.aClass30_4 = null;
		Static65.aClass30_11 = null;
		Static86.aClass3_Sub1_Sub1_Sub4_54 = null;
		Static115.aClass3_Sub1_Sub1_Sub4_70 = null;
		Static23.aClass3_Sub1_Sub1_Sub4_16 = null;
		Static102.aClass3_Sub1_Sub1_Sub4_75 = null;
		Static95.aClass30_15 = null;
		Static106.aClass3_Sub1_Sub1_Sub4_63 = null;
		Static5.aClass30_3 = null;
		Static4.aClass30_2 = null;
		Static119.aBoolean162 = false;
	}

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "(I)V")
	public static void method1254() {
		aClass56_1002 = null;
		aClass3_Sub1_Sub1_Sub4_41 = null;
		aClass3_Sub3_Sub4_2 = null;
		aClass3_Sub1_Sub1_Sub4Array37 = null;
		aClass56_1003 = null;
		aClass56_1001 = null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(JB)V")
	public static void method1266(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static49.method974(arg0 - 1L);
			Static49.method974(1L);
		} else {
			Static49.method974(arg0);
		}
	}
}
