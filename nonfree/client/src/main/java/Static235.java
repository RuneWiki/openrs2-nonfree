import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!lv", name = "e", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_106 = new Class81(1, 0);

	@OriginalMember(owner = "client!lv", name = "f", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_84 = new Class256("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!lv", name = "g", descriptor = "[I")
	public static final int[] anIntArray308 = new int[8];

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIZ)V")
	public static void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(10) Class2_Sub44 local10 = Static432.method5828(arg1, arg0);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray499.length; local15++) {
				local10.anIntArray499[local15] = -1;
				local10.anIntArray498[local15] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method3566(@OriginalArg(1) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static79.anInt1927 > 0) {
			local16 = Static43.aByteArrayArray2[--Static79.anInt1927];
			Static43.aByteArrayArray2[Static79.anInt1927] = null;
			return local16;
		} else if (arg0 == 5000 && Static394.anInt6884 > 0) {
			local16 = Static128.aByteArrayArray8[--Static394.anInt6884];
			Static128.aByteArrayArray8[Static394.anInt6884] = null;
			return local16;
		} else if (arg0 == 30000 && Static252.anInt4786 > 0) {
			@Pc(67) byte[] local67 = Static171.aByteArrayArray11[--Static252.anInt4786];
			Static171.aByteArrayArray11[Static252.anInt4786] = null;
			return local67;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!cr;Lclient!ea;IIIIBJI)V")
	public static void method3568(@OriginalArg(0) Class41 arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) long arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg3 * arg3 + arg5 * arg5;
		if ((long) local11 > arg6) {
			return;
		}
		@Pc(39) int local39 = Math.min(arg0.anInt1622 / 2, arg0.anInt1599 / 2);
		if (local11 <= local39 * local39) {
			Static40.method742(arg7, arg0, arg5, Static411.aClass76Array18[arg2], arg4, arg1, arg3);
			return;
		}
		local39 -= 10;
		@Pc(69) int local69;
		if (Static65.anInt7824 == 4) {
			local69 = (int) Static203.aFloat130 & 0x3FFF;
		} else {
			local69 = (int) Static203.aFloat130 + Static357.anInt3686 & 0x3FFF;
		}
		@Pc(82) int local82 = Class184.anIntArray349[local69];
		@Pc(86) int local86 = Class184.anIntArray350[local69];
		if (Static65.anInt7824 != 4) {
			local86 = local86 * 256 / (Static119.anInt2384 + 256);
			local82 = local82 * 256 / (Static119.anInt2384 + 256);
		}
		@Pc(117) int local117 = local86 * arg3 + local82 * arg5 >> 15;
		@Pc(128) int local128 = arg5 * local86 - local82 * arg3 >> 15;
		@Pc(134) double local134 = Math.atan2((double) local117, (double) local128);
		@Pc(141) int local141 = (int) (Math.sin(local134) * (double) local39);
		@Pc(148) int local148 = (int) (Math.cos(local134) * (double) local39);
		Static120.aClass76Array12[arg2].method6092((float) arg7 + (float) arg0.anInt1622 / 2.0F + (float) local141, (float) -local148 + (float) arg4 + (float) arg0.anInt1599 / 2.0F, 4096, (int) (-local134 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIBII)V")
	public static void method3569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class2_Sub23 local6 = (Class2_Sub23) Static48.aClass265_11.method6005(); local6 != null; local6 = (Class2_Sub23) Static48.aClass265_11.method6001()) {
			Static33.method444(arg0, arg1, local6, arg3, arg2);
		}
		for (@Pc(36) Class2_Sub23 local36 = (Class2_Sub23) Static60.aClass265_15.method6005(); local36 != null; local36 = (Class2_Sub23) Static60.aClass265_15.method6001()) {
			@Pc(40) byte local40 = 1;
			@Pc(45) Class12 local45 = local36.aClass4_Sub2_Sub2_Sub2_1.method5131();
			if (local36.aClass4_Sub2_Sub2_Sub2_1.aBoolean561) {
				local40 = 0;
			} else if (local36.aClass4_Sub2_Sub2_Sub2_1.anInt6458 == local45.anInt334 || local45.anInt330 == local36.aClass4_Sub2_Sub2_Sub2_1.anInt6458 || local36.aClass4_Sub2_Sub2_Sub2_1.anInt6458 == local45.anInt336 || local45.anInt361 == local36.aClass4_Sub2_Sub2_Sub2_1.anInt6458) {
				local40 = 2;
			} else if (local36.aClass4_Sub2_Sub2_Sub2_1.anInt6458 == local45.anInt335 || local36.aClass4_Sub2_Sub2_Sub2_1.anInt6458 == local45.anInt364 || local45.anInt351 == local36.aClass4_Sub2_Sub2_Sub2_1.anInt6458 || local36.aClass4_Sub2_Sub2_Sub2_1.anInt6458 == local45.anInt322) {
				local40 = 3;
			}
			if (local36.anInt3776 != local40) {
				@Pc(136) int local136 = Static184.method2922(local36.aClass4_Sub2_Sub2_Sub2_1);
				if (local36.anInt3790 != local136) {
					if (local36.aClass2_Sub18_Sub1_3 != null) {
						Static360.aClass2_Sub18_Sub4_2.method4456(local36.aClass2_Sub18_Sub1_3);
						local36.aClass2_Sub18_Sub1_3 = null;
					}
					local36.anInt3790 = local136;
				}
				local36.anInt3776 = local40;
			}
			local36.anInt3784 = local36.aClass4_Sub2_Sub2_Sub2_1.anInt7117;
			local36.anInt3780 = local36.aClass4_Sub2_Sub2_Sub2_1.anInt7117 + (local36.aClass4_Sub2_Sub2_Sub2_1.method5118() << 6);
			local36.anInt3779 = local36.aClass4_Sub2_Sub2_Sub2_1.anInt7111;
			local36.anInt3785 = local36.aClass4_Sub2_Sub2_Sub2_1.anInt7111 + (local36.aClass4_Sub2_Sub2_Sub2_1.method5118() << 6);
			Static33.method444(arg0, arg1, local36, arg3, arg2);
		}
		for (@Pc(215) Class2_Sub23 local215 = (Class2_Sub23) Static69.aClass240_7.method5438(); local215 != null; local215 = (Class2_Sub23) Static69.aClass240_7.method5436()) {
			@Pc(219) byte local219 = 1;
			@Pc(224) Class12 local224 = local215.aClass4_Sub2_Sub2_Sub1_1.method5131();
			if (local215.aClass4_Sub2_Sub2_Sub1_1.aBoolean561) {
				local219 = 0;
			} else if (local224.anInt334 == local215.aClass4_Sub2_Sub2_Sub1_1.anInt6458 || local215.aClass4_Sub2_Sub2_Sub1_1.anInt6458 == local224.anInt330 || local215.aClass4_Sub2_Sub2_Sub1_1.anInt6458 == local224.anInt336 || local224.anInt361 == local215.aClass4_Sub2_Sub2_Sub1_1.anInt6458) {
				local219 = 2;
			} else if (local224.anInt335 == local215.aClass4_Sub2_Sub2_Sub1_1.anInt6458 || local215.aClass4_Sub2_Sub2_Sub1_1.anInt6458 == local224.anInt364 || local224.anInt351 == local215.aClass4_Sub2_Sub2_Sub1_1.anInt6458 || local224.anInt322 == local215.aClass4_Sub2_Sub2_Sub1_1.anInt6458) {
				local219 = 3;
			}
			if (local219 != local215.anInt3776) {
				@Pc(311) int local311 = Static218.method769(local215.aClass4_Sub2_Sub2_Sub1_1);
				if (local311 != local215.anInt3790) {
					if (local215.aClass2_Sub18_Sub1_3 != null) {
						Static360.aClass2_Sub18_Sub4_2.method4456(local215.aClass2_Sub18_Sub1_3);
						local215.aClass2_Sub18_Sub1_3 = null;
					}
					local215.anInt3790 = local311;
				}
				local215.anInt3776 = local219;
			}
			local215.anInt3784 = local215.aClass4_Sub2_Sub2_Sub1_1.anInt7117;
			local215.anInt3780 = local215.aClass4_Sub2_Sub2_Sub1_1.anInt7117 + (local215.aClass4_Sub2_Sub2_Sub1_1.method5118() << 6);
			local215.anInt3779 = local215.aClass4_Sub2_Sub2_Sub1_1.anInt7111;
			local215.anInt3785 = local215.aClass4_Sub2_Sub2_Sub1_1.anInt7111 + (local215.aClass4_Sub2_Sub2_Sub1_1.method5118() << 6);
			Static33.method444(arg0, arg1, local215, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!cr;B)Z")
	public static boolean method3570(@OriginalArg(0) Class41 arg0) {
		if (arg0.anInt1632 == Static56.anInt1540) {
			Static125.anInt2472 = 250;
			return true;
		} else {
			return false;
		}
	}
}
