import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!kca", name = "m", descriptor = "[Lclient!pu;")
	public static Class50[] aClass50Array5;

	@OriginalMember(owner = "client!kca", name = "n", descriptor = "Lclient!wm;")
	public static Class390 aClass390_77;

	@OriginalMember(owner = "client!kca", name = "x", descriptor = "I")
	public static int anInt5823;

	@OriginalMember(owner = "client!kca", name = "l", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray24 = new int[2][][];

	@OriginalMember(owner = "client!kca", name = "t", descriptor = "Lclient!wu;")
	public static final Class394 aClass394_88 = new Class394("", 11);

	@OriginalMember(owner = "client!kca", name = "B", descriptor = "Lclient!vha;")
	public static final Class368 aClass368_3 = new Class368("LIVE", 0);

	@OriginalMember(owner = "client!kca", name = "D", descriptor = "D")
	public static double aDouble10 = -1.0D;

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "()V")
	public static void method4815() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static606.aClass226ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static606.aClass226ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static216.anInt4042; local6++) {
					for (local9 = 0; local9 < Static233.anInt4238; local9++) {
						if (Static606.aClass226ArrayArrayArray2[local3][local6][local9] != null) {
							Static606.aClass226ArrayArrayArray2[local3][local6][local9].method5561();
						}
						Static606.aClass226ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static606.aClass226ArrayArrayArray2 = null;
		Static605.aClass109Array5 = null;
		if (Static413.aClass226ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static413.aClass226ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static216.anInt4042; local6++) {
					for (local9 = 0; local9 < Static233.anInt4238; local9++) {
						if (Static413.aClass226ArrayArrayArray1[local3][local6][local9] != null) {
							Static413.aClass226ArrayArrayArray1[local3][local6][local9].method5561();
						}
						Static413.aClass226ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static413.aClass226ArrayArrayArray1 = null;
		Static111.aClass109Array3 = null;
		Static635.aClass226ArrayArrayArray3 = null;
		Static495.aClass109Array4 = null;
		Static453.aBooleanArrayArray4 = null;
		Static422.aBooleanArrayArray3 = null;
		Static112.anIntArray83 = null;
		Static376.aBooleanArrayArrayArray11 = null;
		Static194.aBooleanArrayArrayArray1 = null;
		Static281.method4524();
		if (Static213.aClass28_Sub1_Sub4Array4 != null) {
			for (local3 = 0; local3 < Static518.anInt8629; local3++) {
				Static213.aClass28_Sub1_Sub4Array4[local3] = null;
			}
			Static518.anInt8629 = 0;
		}
		Static654.aClass28_Sub1Array5 = null;
		Static135.aClass28_Sub1Array2 = null;
		Static110.aClass28_Sub1Array1 = null;
		if (Static248.aClass28_Sub1Array3 != null) {
			for (local3 = 0; local3 < Static248.aClass28_Sub1Array3.length; local3++) {
				Static248.aClass28_Sub1Array3[local3] = null;
			}
			Static679.anInt10885 = 0;
		}
		if (Static393.aClass28_Sub1Array4 != null) {
			for (local3 = 0; local3 < Static393.aClass28_Sub1Array4.length; local3++) {
				Static393.aClass28_Sub1Array4[local3] = null;
			}
			Static195.anInt3757 = 0;
		}
		if (Static50.aClass199Array1 != null) {
			for (local3 = 0; local3 < Static667.anInt10686; local3++) {
				Static50.aClass199Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static219.anInt4088; local6++) {
				for (local9 = 0; local9 < Static216.anInt4042; local9++) {
					for (@Pc(195) int local195 = 0; local195 < Static233.anInt4238; local195++) {
						Static101.aLongArrayArrayArray1[local6][local9][local195] = 0L;
					}
				}
			}
			Static667.anInt10686 = 0;
		}
		Static284.method4547();
		Static296.aClass270_3 = Static296.aClass270_2;
		Static296.aClass270_3.method6362();
		Static25.aByteArrayArray1 = null;
		Static390.anIntArrayArray33 = null;
		Static293.aShortArrayArray7 = null;
		if (Static393.aClass204Array1 != null) {
			Static404.method5946();
			Static10.aClass65_1.method6931(1);
			Static10.aClass65_1.method6956(0);
		}
		if (Static198.aClass289Array2 != null) {
			Static198.aClass289Array2 = null;
		}
		Static10.aClass65_1 = null;
	}

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "(II)Z")
	public static boolean method4817(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "(II)I")
	public static int method4820(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
