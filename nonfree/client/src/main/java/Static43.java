import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
	public static int anInt1206;

	@OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
	public static int anInt1208;

	@OriginalMember(owner = "client!ie", name = "B", descriptor = "Lclient!he;")
	public static Class11 aClass11_31;

	@OriginalMember(owner = "client!ie", name = "H", descriptor = "Lclient!w;")
	public static Class15 aClass15_20;

	@OriginalMember(owner = "client!ie", name = "P", descriptor = "[I")
	public static int[] anIntArray134;

	@OriginalMember(owner = "client!ie", name = "E", descriptor = "Lclient!va;")
	public static Class61 aClass61_498 = Static88.method1421("(U(Y");

	@OriginalMember(owner = "client!ie", name = "I", descriptor = "Lclient!va;")
	private static Class61 aClass61_500 = Static88.method1421("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!ie", name = "F", descriptor = "Lclient!va;")
	public static Class61 aClass61_499 = aClass61_500;

	@OriginalMember(owner = "client!ie", name = "M", descriptor = "Lclient!va;")
	public static Class61 aClass61_501 = Static88.method1421("(X100(U(Y");

	@OriginalMember(owner = "client!ie", name = "O", descriptor = "Lclient!va;")
	public static Class61 aClass61_502 = Static88.method1421("(U");

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILclient!he;)Z")
	public static boolean method690(@OriginalArg(1) int arg0, @OriginalArg(2) Class11 arg1) {
		@Pc(13) byte[] local13 = arg1.method210(arg0);
		if (local13 == null) {
			return false;
		} else {
			Static57.method831(local13);
			return true;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V")
	public static void method691() {
		aClass61_500 = null;
		aClass61_498 = null;
		aClass15_20 = null;
		aClass61_502 = null;
		aClass11_31 = null;
		aClass61_501 = null;
		aClass61_499 = null;
		anIntArray134 = null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIII)V")
	public static void method692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15;
		for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
			for (local15 = 0; local15 < 8; local15++) {
				Static37.anIntArrayArrayArray1[arg0][arg2 + local11][arg1 + local15] = 0;
			}
		}
		if (arg2 > 0) {
			for (local15 = 1; local15 < 8; local15++) {
				Static37.anIntArrayArrayArray1[arg0][arg2][local15 + arg1] = Static37.anIntArrayArrayArray1[arg0][arg2 - 1][local15 + arg1];
			}
		}
		if (arg1 > 0) {
			for (local15 = 1; local15 < 8; local15++) {
				Static37.anIntArrayArrayArray1[arg0][arg2 + local15][arg1] = Static37.anIntArrayArrayArray1[arg0][local15 + arg2][arg1 - 1];
			}
		}
		if (arg2 > 0 && Static37.anIntArrayArrayArray1[arg0][arg2 - 1][arg1] != 0) {
			Static37.anIntArrayArrayArray1[arg0][arg2][arg1] = Static37.anIntArrayArrayArray1[arg0][arg2 - 1][arg1];
		} else if (arg1 > 0 && Static37.anIntArrayArrayArray1[arg0][arg2][arg1 - 1] != 0) {
			Static37.anIntArrayArrayArray1[arg0][arg2][arg1] = Static37.anIntArrayArrayArray1[arg0][arg2][arg1 - 1];
		} else if (arg2 > 0 && arg1 > 0 && Static37.anIntArrayArrayArray1[arg0][arg2 - 1][arg1 - 1] != 0) {
			Static37.anIntArrayArrayArray1[arg0][arg2][arg1] = Static37.anIntArrayArrayArray1[arg0][arg2 - 1][arg1 - 1];
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)V")
	public static void method693(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static51.aBooleanArray5[arg0]) {
			return;
		}
		Static88.aClass11_55.method220(arg0);
		if (Static104.aClass10_Sub1_Sub4ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(25) boolean local25 = true;
		for (@Pc(27) int local27 = 0; local27 < Static104.aClass10_Sub1_Sub4ArrayArray1[arg0].length; local27++) {
			if (Static104.aClass10_Sub1_Sub4ArrayArray1[arg0][local27] != null) {
				if (Static104.aClass10_Sub1_Sub4ArrayArray1[arg0][local27].anInt577 == 2) {
					local25 = false;
				} else {
					Static104.aClass10_Sub1_Sub4ArrayArray1[arg0][local27] = null;
				}
			}
		}
		if (local25) {
			Static104.aClass10_Sub1_Sub4ArrayArray1[arg0] = null;
		}
		Static51.aBooleanArray5[arg0] = false;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	public static void method694() {
		Static106.aClass15_39.method597();
		Static60.anIntArray183 = Static68.method998(Static60.anIntArray183);
	}
}
