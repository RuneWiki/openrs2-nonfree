import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "Lclient!vb;")
	public static Class70_Sub1 aClass70_Sub1_53;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1372 = Static64.method1101("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1369 = aClass51_1372;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "[S")
	public static short[] aShortArray44 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1370 = Static64.method1101("yellow:");

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1371 = aClass51_1370;

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1373 = aClass51_1370;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([BI)V")
	public static void method3084(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class1_Sub16 local10 = new Class1_Sub16(arg0);
		local10.anInt4860 = arg0.length - 2;
		Static43.anInt1027 = local10.method3805();
		Static51.anIntArray72 = new int[Static43.anInt1027];
		Static73.aByteArrayArray4 = new byte[Static43.anInt1027][];
		Static89.anIntArray85 = new int[Static43.anInt1027];
		Static191.aByteArrayArray12 = new byte[Static43.anInt1027][];
		Static152.anIntArray225 = new int[Static43.anInt1027];
		Static65.anIntArray98 = new int[Static43.anInt1027];
		Static112.aBooleanArray15 = new boolean[Static43.anInt1027];
		local10.anInt4860 = arg0.length - Static43.anInt1027 * 8 - 7;
		Static30.anInt2197 = local10.method3805();
		Static141.anInt3050 = local10.method3805();
		@Pc(72) int local72 = (local10.method3793() & 0xFF) + 1;
		for (@Pc(74) int local74 = 0; local74 < Static43.anInt1027; local74++) {
			Static65.anIntArray98[local74] = local10.method3805();
		}
		for (@Pc(92) int local92 = 0; local92 < Static43.anInt1027; local92++) {
			Static152.anIntArray225[local92] = local10.method3805();
		}
		for (@Pc(110) int local110 = 0; local110 < Static43.anInt1027; local110++) {
			Static51.anIntArray72[local110] = local10.method3805();
		}
		for (@Pc(124) int local124 = 0; local124 < Static43.anInt1027; local124++) {
			Static89.anIntArray85[local124] = local10.method3805();
		}
		local10.anInt4860 = arg0.length - Static43.anInt1027 * 8 - (local72 - 1) * 3 - 7;
		Static52.anIntArray74 = new int[local72];
		for (@Pc(161) int local161 = 1; local161 < local72; local161++) {
			Static52.anIntArray74[local161] = local10.method3806();
			if (Static52.anIntArray74[local161] == 0) {
				Static52.anIntArray74[local161] = 1;
			}
		}
		local10.anInt4860 = 0;
		for (@Pc(189) int local189 = 0; local189 < Static43.anInt1027; local189++) {
			@Pc(195) int local195 = Static51.anIntArray72[local189];
			@Pc(199) int local199 = Static89.anIntArray85[local189];
			@Pc(203) int local203 = local199 * local195;
			@Pc(206) byte[] local206 = new byte[local203];
			@Pc(209) byte[] local209 = new byte[local203];
			@Pc(211) boolean local211 = false;
			Static73.aByteArrayArray4[local189] = local209;
			Static191.aByteArrayArray12[local189] = local206;
			@Pc(223) int local223 = local10.method3793();
			@Pc(229) int local229;
			@Pc(247) int local247;
			if ((local223 & 0x1) == 0) {
				for (local229 = 0; local229 < local203; local229++) {
					local209[local229] = local10.method3802();
				}
				if ((local223 & 0x2) != 0) {
					for (local247 = 0; local247 < local203; local247++) {
						@Pc(257) byte local257 = local206[local247] = local10.method3802();
						local211 |= local257 != -1;
					}
				}
			} else {
				local229 = 0;
				label96: while (true) {
					if (local229 >= local195) {
						if ((local223 & 0x2) == 0) {
							break;
						}
						local247 = 0;
						while (true) {
							if (local195 <= local247) {
								break label96;
							}
							for (@Pc(316) int local316 = 0; local316 < local199; local316++) {
								@Pc(330) byte local330 = local206[local247 + local195 * local316] = local10.method3802();
								local211 |= local330 != -1;
							}
							local247++;
						}
					}
					for (local247 = 0; local247 < local199; local247++) {
						local209[local247 * local195 + local229] = local10.method3802();
					}
					local229++;
				}
			}
			Static112.aBooleanArray15[local189] = local211;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)V")
	public static void method3085(@OriginalArg(0) int arg0) {
		@Pc(5) Class50 local5 = Static103.aClass50_2;
		synchronized (Static103.aClass50_2) {
			Static158.anInt3440 = arg0;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	public static void method3088() {
		Static80.aClass53_16.method1498();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
	public static void method3091(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static178.aBoolean183) {
			Static54.method941();
		} else if (arg0 != -1 && (Static69.anInt1577 != arg0 || !Static218.method1759()) && Static155.anInt3424 != 0 && !Static178.aBoolean183) {
			Static185.method3104(Static8.aClass70_Sub1_3, arg0, Static155.anInt3424);
		}
		Static69.anInt1577 = arg0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII)V")
	public static void method3094(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg0) {
			Static71.method1261(Static113.anIntArrayArray10[arg1], arg0, arg2, arg3);
		} else {
			Static71.method1261(Static113.anIntArrayArray10[arg1], arg3, arg2, arg0);
		}
	}
}
