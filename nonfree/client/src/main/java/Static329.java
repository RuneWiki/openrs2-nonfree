import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!lr", name = "z", descriptor = "I")
	public static int anInt6159;

	@OriginalMember(owner = "client!lr", name = "q", descriptor = "Lclient!dj;")
	public static final Class74 aClass74_12 = new Class74(7, 0, 1, 1);

	@OriginalMember(owner = "client!lr", name = "u", descriptor = "[[I")
	public static final int[][] anIntArrayArray42 = new int[6][];

	@OriginalMember(owner = "client!lr", name = "w", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_85 = new Class200(6, 10);

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(ZI)V")
	public static void method5383(@OriginalArg(1) int arg0) {
		if (Static435.anInt7845 == 1) {
			Static470.anInt8244 = arg0;
		} else if (Static435.anInt7845 == 2) {
			Static77.anInt1909 = arg0;
		}
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(B)V")
	public static void method5384() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static424.aBooleanArray19[local3] = false;
		}
		Static147.anInt2910 = -1;
		Static305.anInt5422 = 1;
		Static176.anInt3420 = 0;
		Static435.anInt7846 = -1;
		Static490.anInt8498 = 0;
		Static331.anInt6175 = -1;
		Static530.anInt9071 = -1;
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(B)V")
	public static void method5385() {
		Static335.aClass3_Sub4_Sub13_2 = new Class3_Sub4_Sub13(Static59.aClass43_4.method1598(Static325.anInt6083), "", Static32.anInt7819, 1003, -1, 0L, 0, 0, true, false, 0L, true);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)I")
	public static int method5387(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!qk;B)Lclient!qk;")
	public static Class279 method5388(@OriginalArg(0) Class279 arg0) {
		if (arg0.anInt8203 != -1) {
			return Static433.method6771(arg0.anInt8203);
		}
		@Pc(24) int local24 = arg0.anInt8185 >>> 16;
		@Pc(29) Class180 local29 = new Class180(Static356.aClass280_29);
		for (@Pc(34) Class3_Sub29 local34 = (Class3_Sub29) local29.method4571(); local34 != null; local34 = (Class3_Sub29) local29.method4568()) {
			if (local34.anInt4601 == local24) {
				return Static433.method6771((int) local34.aLong276);
			}
		}
		return null;
	}
}
