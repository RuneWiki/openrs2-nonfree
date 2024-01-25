import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!tj", name = "j", descriptor = "[S")
	public static short[] aShortArray99;

	@OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
	public static int anInt5899 = 0;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
	public static void method5233() {
		Static126.aClass66_44.method1933();
		Static261.aClass66_87.method1933();
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
	public static void method5237() {
		for (@Pc(8) int local8 = 0; local8 < Static47.anInt1211; local8++) {
			@Pc(14) int local14 = Static178.anIntArray266[local8];
			@Pc(18) Class25_Sub1_Sub1_Sub2 local18 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local14];
			@Pc(22) int local22 = Static6.aClass5_Sub1_Sub1_1.method1832();
			if ((local22 & 0x8) != 0) {
				local22 += Static6.aClass5_Sub1_Sub1_1.method1832() << 8;
			}
			if ((local22 & 0x2) != 0) {
				local18.aString304 = Static6.aClass5_Sub1_Sub1_1.method1840();
				local18.anInt5303 = 100;
			}
			if ((local22 & 0x100) != 0) {
				local18.anInt5295 = Static6.aClass5_Sub1_Sub1_1.method1839();
				local18.anInt5309 = Static6.aClass5_Sub1_Sub1_1.method1839();
			}
			@Pc(74) int local74;
			@Pc(83) int local83;
			if ((local22 & 0x4) != 0) {
				local74 = Static6.aClass5_Sub1_Sub1_1.method1839();
				if (local74 == 65535) {
					local74 = -1;
				}
				local83 = Static6.aClass5_Sub1_Sub1_1.method1872();
				Static162.method3002(local74, local18, local83);
			}
			if ((local22 & 0x400) != 0) {
				local74 = Static6.aClass5_Sub1_Sub1_1.method1875();
				local18.anInt5305 = Static6.aClass5_Sub1_Sub1_1.method1885();
				local18.anInt5290 = Static6.aClass5_Sub1_Sub1_1.method1846();
				local18.aBoolean402 = (local74 & 0x8000) != 0;
				local18.anInt5273 = local74 & 0x7FFF;
				local18.anInt5317 = Static180.anInt3606 + local18.anInt5273 + local18.anInt5305;
			}
			@Pc(228) int local228;
			if ((local22 & 0x10) != 0) {
				local74 = Static6.aClass5_Sub1_Sub1_1.method1839();
				if (local74 == 65535) {
					local74 = -1;
				}
				local83 = Static6.aClass5_Sub1_Sub1_1.method1853();
				@Pc(151) boolean local151 = true;
				@Pc(225) Class17 local225;
				if (local74 != -1 && local18.anInt5269 != -1) {
					@Pc(171) Class128 local171;
					if (local74 == local18.anInt5269) {
						local171 = Static136.method2578(local74);
						if (local171.aBoolean266 && local171.anInt3759 != -1) {
							local225 = Static261.method4492(local171.anInt3759);
							local228 = local225.anInt505;
							if (local228 == 0) {
								local151 = false;
							} else if (local228 == 1) {
								local151 = true;
							} else if (local228 == 2) {
								local18.anInt5314 = 0;
								local151 = false;
							}
						}
					} else {
						local171 = Static136.method2578(local74);
						@Pc(176) Class128 local176 = Static136.method2578(local18.anInt5269);
						if (local171.anInt3759 != -1 && local176.anInt3759 != -1) {
							@Pc(190) Class17 local190 = Static261.method4492(local171.anInt3759);
							@Pc(195) Class17 local195 = Static261.method4492(local176.anInt3759);
							if (local190.anInt506 < local195.anInt506) {
								local151 = false;
							}
						}
					}
				}
				if (local151) {
					local18.anInt5330 = 0;
					local18.anInt5306 = (local83 & 0xFFFF) + Static180.anInt3606;
					local18.anInt5269 = local74;
					local18.anInt5319 = local83 >> 16;
					local18.anInt5315 = 0;
					local18.anInt5279 = 1;
					if (local18.anInt5306 > Static180.anInt3606) {
						local18.anInt5315 = -1;
					}
					if (local18.anInt5269 != -1 && Static180.anInt3606 == local18.anInt5306) {
						@Pc(306) int local306 = Static136.method2578(local18.anInt5269).anInt3759;
						if (local306 != -1) {
							local225 = Static261.method4492(local306);
							if (local225 != null && local225.anIntArray24 != null) {
								Static207.method3696(0, local18.anInt5769, local225, local18.anInt5773, false);
							}
						}
					}
				}
			}
			if ((local22 & 0x20) != 0) {
				local74 = Static6.aClass5_Sub1_Sub1_1.method1866();
				local83 = Static6.aClass5_Sub1_Sub1_1.method1885();
				local18.method4642(Static180.anInt3606, local83, local74);
			}
			if ((local22 & 0x40) != 0) {
				if (local18.aClass216_1.method5780()) {
					Static69.method1524(local18);
				}
				local18.method4664(Static2.method5(Static6.aClass5_Sub1_Sub1_1.method1875()));
				local18.method4644(local18.aClass216_1.anInt6566);
				local18.anInt5308 = local18.aClass216_1.anInt6544 << 3;
				if (local18.aClass216_1.method5780()) {
					Static129.method2471(local18.anIntArray402[0], local18.anIntArray401[0], null, null, 0, Static156.anInt3123, local18);
				}
			}
			if ((local22 & 0x1) != 0) {
				local18.anInt5332 = Static6.aClass5_Sub1_Sub1_1.method1845();
				if (local18.anInt5332 == 65535) {
					local18.anInt5332 = -1;
				}
			}
			if ((local22 & 0x200) != 0) {
				local74 = Static6.aClass5_Sub1_Sub1_1.method1885();
				@Pc(427) int[] local427 = new int[local74];
				@Pc(430) int[] local430 = new int[local74];
				@Pc(433) int[] local433 = new int[local74];
				for (@Pc(435) int local435 = 0; local435 < local74; local435++) {
					local228 = Static6.aClass5_Sub1_Sub1_1.method1845();
					if (local228 == 65535) {
						local228 = -1;
					}
					local427[local435] = local228;
					local430[local435] = Static6.aClass5_Sub1_Sub1_1.method1872();
					local433[local435] = Static6.aClass5_Sub1_Sub1_1.method1867();
				}
				Static162.method2999(local433, local430, local18, local427);
			}
			if ((local22 & 0x80) != 0) {
				local74 = Static6.aClass5_Sub1_Sub1_1.method1866();
				local83 = Static6.aClass5_Sub1_Sub1_1.method1846();
				local18.method4642(Static180.anInt3606, local83, local74);
				local18.anInt5323 = Static180.anInt3606 + 300;
				local18.anInt5271 = Static6.aClass5_Sub1_Sub1_1.method1885();
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method5239(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static46.aClass98_1);
		arg0.addMouseMotionListener(Static46.aClass98_1);
		arg0.addFocusListener(Static46.aClass98_1);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)Lclient!qg;")
	public static Class5_Sub9_Sub19 method5240(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub9_Sub19 local10 = (Class5_Sub9_Sub19) Static353.aClass215_11.method5683((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static101.aClass170_45.method4584(19, arg0);
		local10 = new Class5_Sub9_Sub19();
		if (local25 != null) {
			local10.method4453(new Class5_Sub1(local25));
		}
		Static353.aClass215_11.method5687(local10, (long) arg0);
		return local10;
	}
}
