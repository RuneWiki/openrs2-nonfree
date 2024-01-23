import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!dj", name = "eb", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!dj", name = "gb", descriptor = "Lclient!vb;")
	public static Class70_Sub1 aClass70_Sub1_12;

	@OriginalMember(owner = "client!dj", name = "qb", descriptor = "I")
	public static int anInt1027;

	@OriginalMember(owner = "client!dj", name = "ab", descriptor = "Lclient!ia;")
	public static Class51 aClass51_304 = Static64.method1101("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!dj", name = "ib", descriptor = "Lclient!ia;")
	public static Class51 aClass51_305 = Static64.method1101("(U0a )2 via: ");

	@OriginalMember(owner = "client!dj", name = "mb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_306 = Static64.method1101(")1 ");

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(II)Lclient!bk;")
	public static Class1_Sub2_Sub3 method755(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub2_Sub3 local8 = (Class1_Sub2_Sub3) Static134.aClass123_8.method3640((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(22) byte[] local22 = Static188.aClass70_Sub1_57.method3509(0, arg0);
		if (local22 == null) {
			return null;
		}
		local8 = new Class1_Sub2_Sub3();
		@Pc(35) Class1_Sub16 local35 = new Class1_Sub16(local22);
		local35.anInt4860 = local35.aByteArray62.length - 2;
		@Pc(46) int local46 = local35.method3805();
		@Pc(54) int local54 = local35.aByteArray62.length - local46 - 14;
		local35.anInt4860 = local54;
		@Pc(68) int local68 = local35.method3784();
		local8.anInt575 = local35.method3805();
		local8.anInt581 = local35.method3805();
		local8.anInt580 = local35.method3805();
		local8.anInt579 = local35.method3805();
		@Pc(96) int local96 = local35.method3793();
		@Pc(104) int local104;
		@Pc(110) int local110;
		if (local96 > 0) {
			local8.aClass102Array1 = new Class102[local96];
			for (local104 = 0; local104 < local96; local104++) {
				local110 = local35.method3805();
				@Pc(117) Class102 local117 = new Class102(Static148.method2539(local110));
				local8.aClass102Array1[local104] = local117;
				while (local110-- > 0) {
					@Pc(130) int local130 = local35.method3784();
					@Pc(134) int local134 = local35.method3784();
					local117.method3083(new Class1_Sub15(local134), (long) local130);
				}
			}
		}
		local104 = 0;
		local35.anInt4860 = 0;
		local8.aClass51_189 = local35.method3799();
		local8.anIntArray41 = new int[local68];
		local8.anIntArray40 = new int[local68];
		local8.aClass51Array4 = new Class51[local68];
		while (local54 > local35.anInt4860) {
			local110 = local35.method3805();
			if (local110 == 3) {
				local8.aClass51Array4[local104] = local35.method3781();
			} else if (local110 >= 100 || local110 == 21 || local110 == 38 || local110 == 39) {
				local8.anIntArray40[local104] = local35.method3793();
			} else {
				local8.anIntArray40[local104] = local35.method3784();
			}
			local8.anIntArray41[local104++] = local110;
		}
		Static134.aClass123_8.method3644(local8, (long) arg0);
		return local8;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!mb;Lclient!mb;Z)V")
	public static void method758(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class70 arg1) {
		Static165.aClass1_Sub2_Sub11_3 = Static7.method109(Static38.anInt916, arg0, arg1);
		Static168.aClass1_Sub2_Sub11_Sub1_Sub1_2 = (Class1_Sub2_Sub11_Sub1_Sub1) Static165.aClass1_Sub2_Sub11_3;
		Static52.aClass1_Sub2_Sub11_1 = Static7.method109(Static146.anInt773, arg0, arg1);
		Static80.aClass1_Sub2_Sub11_2 = Static7.method109(Static207.anInt4438, arg0, arg1);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)V")
	public static void method760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static74.aBoolean75 = true;
		Static224.anInt4695 = arg0;
		Static166.anInt3727 = arg1;
		Static88.anInt2019 = arg2;
		Static36.anInt872 = -1;
		Static66.anInt1486 = -1;
	}
}
