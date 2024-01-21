import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "Z")
	public static boolean aBoolean57;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "Lclient!vc;")
	public static Class71 aClass71_730 = Static38.method736("Ihre Nachricht an: ");

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "Z")
	public static volatile boolean aBoolean55 = false;

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "Z")
	public static boolean aBoolean56 = false;

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "J")
	public static long aLong51 = 0L;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[BI)Lclient!vc;")
	public static Class71 method976(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class71 local9 = new Class71();
		local9.aByteArray28 = new byte[arg2];
		local9.anInt2736 = 0;
		for (@Pc(23) int local23 = arg0; local23 < arg0 + arg2; local23++) {
			if (arg1[local23] != 0) {
				local9.aByteArray28[local9.anInt2736++] = arg1[local23];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
	public static void method977() {
		for (@Pc(15) Class5_Sub1_Sub1_Sub4 local15 = (Class5_Sub1_Sub1_Sub4) Static62.aClass52_6.method1358(); local15 != null; local15 = (Class5_Sub1_Sub1_Sub4) Static62.aClass52_6.method1363()) {
			if (Static23.anInt728 != local15.anInt1490 || local15.anInt1499 < Static95.anInt2285) {
				local15.method2002();
			} else if (local15.anInt1489 <= Static95.anInt2285) {
				if (local15.anInt1496 > 0) {
					@Pc(55) Class5_Sub1_Sub1_Sub3_Sub1 local55 = Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[local15.anInt1496 - 1];
					if (local55 != null && local55.anInt2474 >= 0 && local55.anInt2474 < 13312 && local55.anInt2452 >= 0 && local55.anInt2452 < 13312) {
						local15.method1019(Static95.anInt2285, local55.anInt2474, local55.anInt2452, Static26.method989(local55.anInt2474, local15.anInt1490, local55.anInt2452) - local15.anInt1498);
					}
				}
				if (local15.anInt1496 < 0) {
					@Pc(104) int local104 = -local15.anInt1496 - 1;
					@Pc(111) Class5_Sub1_Sub1_Sub3_Sub2 local111;
					if (local104 == Static6.anInt222) {
						local111 = Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1;
					} else {
						local111 = Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local104];
					}
					if (local111 != null && local111.anInt2474 >= 0 && local111.anInt2474 < 13312 && local111.anInt2452 >= 0 && local111.anInt2452 < 13312) {
						local15.method1019(Static95.anInt2285, local111.anInt2474, local111.anInt2452, Static26.method989(local111.anInt2474, local15.anInt1490, local111.anInt2452) - local15.anInt1498);
					}
				}
				local15.method1018(Static58.anInt1515);
				Static7.aClass43_1.method1094(Static23.anInt728, (int) local15.aDouble5, (int) local15.aDouble8, (int) local15.aDouble3, 60, local15, local15.anInt1497, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public static void method978() {
		aClass71_730 = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)I")
	public static int method979() {
		return Static20.anInt675++;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
	public static void method980() {
		Static9.anIntArrayArray2 = null;
		Static97.anIntArray256 = null;
		Static30.anIntArray99 = null;
		Static64.anIntArrayArrayArray9 = null;
		Static108.anIntArray272 = null;
		Static81.aByteArrayArrayArray6 = null;
		Static114.aByteArrayArrayArray7 = null;
		Static71.aByteArrayArrayArray4 = null;
		Static8.anIntArray17 = null;
		Static31.anIntArray103 = null;
		Static66.aByteArrayArrayArray3 = null;
		Static23.aByteArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!nb;IIBI)[B")
	public static byte[] method981(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) long local19 = (long) (arg2 * 37 + arg3 & 0xFFFF) + (long) (arg2 << 16) + ((long) arg1 << 32);
		if (Static10.aClass54_5 != null) {
			@Pc(39) Class5_Sub1_Sub14 local39 = (Class5_Sub1_Sub14) Static10.aClass54_5.method1397(local19);
			if (local39 != null) {
				return local39.aByteArray26;
			}
		}
		@Pc(50) byte[] local50 = arg0.method679(arg2, arg3);
		if (local50 == null) {
			return null;
		} else {
			if (Static10.aClass54_5 != null) {
				Static10.aClass54_5.method1399(new Class5_Sub1_Sub14(local50), local19);
			}
			return local50;
		}
	}
}
