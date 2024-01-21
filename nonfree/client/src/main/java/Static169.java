import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!uh", name = "r", descriptor = "[Lclient!jc;")
	public static Class2_Sub15[] aClass2_Sub15Array1;

	@OriginalMember(owner = "client!uh", name = "y", descriptor = "I")
	public static int anInt3680 = 0;

	@OriginalMember(owner = "client!uh", name = "z", descriptor = "I")
	public static int anInt3681 = 0;

	@OriginalMember(owner = "client!uh", name = "C", descriptor = "[[I")
	public static int[][] anIntArrayArray34 = new int[][] { { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIII)V")
	public static void method2801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class2_Sub1 local7 = Static72.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			Static72.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2].anInt22 = arg3;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BI)Lclient!sd;")
	public static Class2_Sub2_Sub15 method2802(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub2_Sub15 local6 = (Class2_Sub2_Sub15) Static72.aClass74_51.method2345((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(27) byte[] local27 = Static29.aClass11_33.method2049(arg0, 9);
		local6 = new Class2_Sub2_Sub15();
		local6.anInt3219 = arg0;
		if (local27 != null) {
			local6.method2480(new Class2_Sub13(local27));
		}
		local6.method2478();
		Static72.aClass74_51.method2341((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
	public static void method2803() {
		aClass2_Sub15Array1 = null;
		anIntArrayArray34 = null;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IJ)V")
	public static void method2804(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < Static18.anInt381; local18++) {
			if (Static76.aLongArray11[local18] == arg0) {
				Static18.anInt381--;
				for (@Pc(40) int local40 = local18; local40 < Static18.anInt381; local40++) {
					Static76.aLongArray11[local40] = Static76.aLongArray11[local40 + 1];
					Static30.aClass49Array4[local40] = Static30.aClass49Array4[local40 + 1];
				}
				Static95.anInt2012 = Static69.anInt1431;
				Static176.aClass2_Sub13_Sub1_14.method2976(7);
				Static176.aClass2_Sub13_Sub1_14.method2956(arg0);
				return;
			}
		}
	}
}
