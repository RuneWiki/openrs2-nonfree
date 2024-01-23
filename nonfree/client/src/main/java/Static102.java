import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "Lclient!sf;")
	public static Class105 aClass105_12 = new Class105();

	@OriginalMember(owner = "client!jk", name = "h", descriptor = "Lclient!ia;")
	public static Class51 aClass51_742 = Static64.method1101("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZBIZIIZI)Lclient!te;")
	public static Class1_Sub2_Sub1 method1684(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		@Pc(5) Class92 local5 = Static36.method637(arg1);
		if (arg5 > 1 && local5.anIntArray241 != null) {
			@Pc(17) int local17 = -1;
			for (@Pc(19) int local19 = 0; local19 < 10; local19++) {
				if (arg5 >= local5.anIntArray242[local19] && local5.anIntArray242[local19] != 0) {
					local17 = local5.anIntArray241[local19];
				}
			}
			if (local17 != -1) {
				local5 = Static36.method637(local17);
			}
		}
		@Pc(52) Class5_Sub2_Sub1 local52 = local5.method2814();
		if (local52 == null) {
			return null;
		}
		@Pc(58) Class1_Sub2_Sub1_Sub1 local58 = null;
		if (local5.anInt3670 != -1) {
			local58 = (Class1_Sub2_Sub1_Sub1) method1684(true, local5.anInt3650, false, 0, 1, 10);
			if (local58 == null) {
				return null;
			}
		} else if (local5.anInt3658 != -1) {
			local58 = (Class1_Sub2_Sub1_Sub1) method1684(false, local5.anInt3649, false, arg3, arg4, arg5);
			if (local58 == null) {
				return null;
			}
		}
		@Pc(102) int[] local102 = Static96.anIntArray137;
		@Pc(104) int local104 = Static96.anInt2126;
		@Pc(115) int[] local115 = new int[4];
		@Pc(117) int local117 = Static96.anInt2122;
		Static96.method1620(local115);
		@Pc(125) Class1_Sub2_Sub1_Sub1 local125 = new Class1_Sub2_Sub1_Sub1(36, 32);
		Static96.method1625(local125.anIntArray157, 36, 32);
		Static171.method2965();
		Static171.method2958(16, 16);
		Static171.aBoolean175 = false;
		@Pc(139) int local139 = local5.anInt3668;
		if (arg0) {
			local139 = (int) ((double) local139 * 1.5D);
		} else if (arg4 == 2) {
			local139 = (int) ((double) local139 * 1.04D);
		}
		@Pc(169) int local169 = local139 * Class94.anIntArray278[local5.anInt3686] >> 16;
		@Pc(178) int local178 = local139 * Class94.anIntArray277[local5.anInt3686] >> 16;
		local52.method2917(local5.anInt3675, local5.anInt3657, local5.anInt3686, local5.anInt3680, local169 + local5.anInt3697 - local52.method3680() / 2, local178 + local5.anInt3697);
		if (arg4 >= 1) {
			local125.method2090(1);
			if (arg4 >= 2) {
				local125.method2090(16777215);
			}
			Static96.method1625(local125.anIntArray157, 36, 32);
		}
		if (arg3 != 0) {
			local125.method2081(arg3);
		}
		if (local5.anInt3670 != -1) {
			local58.method2064(0, 0);
		} else if (local5.anInt3658 != -1) {
			Static96.method1625(local58.anIntArray157, 36, 32);
			local125.method2064(0, 0);
			local125 = local58;
		}
		if (arg2 && (local5.anInt3644 == 1 || arg5 != 1) && arg5 != -1) {
			Static46.aClass1_Sub2_Sub11_Sub1_Sub1_1.method2038(Static226.method3699(arg5), 0, 9, 16776960, 1);
		}
		Static96.method1625(local102, local104, local117);
		Static96.method1619(local115);
		Static171.method2965();
		Static171.aBoolean175 = true;
		return local125;
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)[Lclient!ak;")
	public static Class1_Sub2_Sub1_Sub1[] method1686() {
		@Pc(4) Class1_Sub2_Sub1_Sub1[] local4 = new Class1_Sub2_Sub1_Sub1[Static43.anInt1027];
		for (@Pc(15) int local15 = 0; local15 < Static43.anInt1027; local15++) {
			@Pc(25) int local25 = Static89.anIntArray85[local15] * Static51.anIntArray72[local15];
			@Pc(28) int[] local28 = new int[local25];
			@Pc(32) byte[] local32 = Static73.aByteArrayArray4[local15];
			for (@Pc(34) int local34 = 0; local34 < local25; local34++) {
				local28[local34] = Static52.anIntArray74[local32[local34] & 0xFF];
			}
			local4[local15] = new Class1_Sub2_Sub1_Sub1(Static30.anInt2197, Static141.anInt3050, Static65.anIntArray98[local15], Static152.anIntArray225[local15], Static51.anIntArray72[local15], Static89.anIntArray85[local15], local28);
		}
		Static134.method2401();
		return local4;
	}
}
