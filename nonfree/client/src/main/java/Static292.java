import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "[Lclient!td;")
	public static Class193[] aClass193Array2;

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "Lclient!lc;")
	public static Class126 aClass126_7;

	@OriginalMember(owner = "client!sh", name = "m", descriptor = "Lclient!al;")
	public static final Class11 aClass11_128 = new Class11(50);

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V")
	public static void method4997() {
		while (true) {
			if (Static30.aClass14_Sub4_Sub2_1.method2562(Static327.anInt6307) >= 11) {
				@Pc(16) int local16 = Static30.aClass14_Sub4_Sub2_1.method2558(11);
				if (local16 != 2047) {
					@Pc(23) boolean local23 = false;
					if (Static29.aClass10_Sub3_Sub3_Sub2Array3[local16] == null) {
						Static29.aClass10_Sub3_Sub3_Sub2Array3[local16] = new Class10_Sub3_Sub3_Sub2();
						Static29.aClass10_Sub3_Sub3_Sub2Array3[local16].anInt5954 = local16;
						local23 = true;
						if (Static46.aClass14_Sub4Array1[local16] != null) {
							Static29.aClass10_Sub3_Sub3_Sub2Array3[local16].method5373(Static46.aClass14_Sub4Array1[local16]);
						}
					}
					Static213.anIntArray380[Static307.anInt2887++] = local16;
					@Pc(64) Class10_Sub3_Sub3_Sub2 local64 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local16];
					local64.anInt5927 = Static153.anInt3257;
					@Pc(74) int local74 = Static199.anIntArray345[Static30.aClass14_Sub4_Sub2_1.method2558(3)];
					@Pc(79) int local79 = Static30.aClass14_Sub4_Sub2_1.method2558(1);
					@Pc(84) int local84 = Static30.aClass14_Sub4_Sub2_1.method2558(5);
					if (local84 > 15) {
						local84 -= 32;
					}
					@Pc(93) int local93 = Static30.aClass14_Sub4_Sub2_1.method2558(1);
					if (local93 == 1) {
						Static116.anIntArray227[Static222.anInt4457++] = local16;
					}
					@Pc(111) int local111 = Static30.aClass14_Sub4_Sub2_1.method2558(5);
					if (local23) {
						local64.method5366(local74);
					}
					if (local111 > 15) {
						local111 -= 32;
					}
					local64.method5378(Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0] + local111, local79 == 1, Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0] + local84, Static219.anInt4400);
					continue;
				}
			}
			Static30.aClass14_Sub4_Sub2_1.method2559();
			return;
		}
	}

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "(I)V")
	public static void method4998() {
		@Pc(5) Class82 local5 = Static28.aClass82_1;
		synchronized (Static28.aClass82_1) {
			Static199.anInt4021 = Static85.anInt2084;
			Static270.anInt5147++;
			Static63.anInt1529 = Static319.anInt6145;
			Static328.anInt6333 = Static283.anInt5383;
			Static68.anInt1636 = Static185.anInt3818;
			Static272.anInt5167 = Static239.anInt6269;
			Static321.anInt6195 = Static249.anInt4827;
			Static203.aLong197 = Static18.aLong13;
			Static185.anInt3818 = 0;
		}
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(B)V")
	public static void method4999() {
		Static117.aClass18_32.method461();
		for (@Pc(13) Class14_Sub23 local13 = (Class14_Sub23) Static95.aClass18_9.method459(); local13 != null; local13 = (Class14_Sub23) Static95.aClass18_9.method453()) {
			if (local13.anInt4355 < 1000) {
				local13.method5986();
				Static117.aClass18_32.method451(local13);
			}
		}
		Static117.aClass18_32.method462(Static95.aClass18_9);
		if (Static176.aClass146_40 != null || (Static94.aClass146_21 != null || Static86.anInt2091 > 0)) {
			return;
		}
		@Pc(58) int local58 = Static68.anInt1636;
		@Pc(74) int local74;
		if (!Static302.aBoolean409) {
			if (local58 == 1 && Static41.anInt980 > 0) {
				local74 = ((Class14_Sub23) Static95.aClass18_9.aClass14_17.aClass14_247).anInt4355;
				if (local74 == 17 || local74 == 51 || local74 == 31 || local74 == 35 || local74 == 15 || local74 == 45 || local74 == 28 || local74 == 58 || local74 == 12 || local74 == 8 || local74 == 7 || local74 == 1003) {
					@Pc(127) Class14_Sub23 local127 = (Class14_Sub23) Static95.aClass18_9.aClass14_17.aClass14_247;
					@Pc(132) Class146 local132 = Static273.method4632(local127.anInt4350);
					@Pc(135) Class14_Sub17 local135 = Static42.method1040(local132);
					if (local135.method2582()) {
						Static193.anInt3955 = 0;
						Static266.aBoolean338 = false;
						if (Static176.aClass146_40 != null) {
							Static166.method3295(Static176.aClass146_40);
						}
						Static176.aClass146_40 = Static273.method4632(local127.anInt4350);
						Static354.anInt6717 = local127.anInt4351;
						Static44.anInt1107 = Static321.anInt6195;
						Static302.anInt5839 = Static272.anInt5167;
						Static166.method3295(Static176.aClass146_40);
						return;
					}
				}
			}
			if (local58 <= 0 && Static238.anInt4660 > 0) {
				local58 = Static238.anInt4660;
			}
			Static238.anInt4660 = 0;
			if (local58 == 1 && (Static327.anInt6303 == 1 && Static41.anInt980 > 2 || Static66.method1649())) {
				local58 = 2;
			}
			if (local58 == 2 && Static41.anInt980 > 0) {
				Static28.method721(Static321.anInt6195, Static272.anInt5167);
			}
			if (local58 == 1 && Static41.anInt980 > 0) {
				Static258.method4427();
				return;
			}
			return;
		}
		@Pc(215) int local215;
		if (local58 != 1) {
			local74 = Static63.anInt1529;
			local215 = Static328.anInt6333;
			if (Static349.anInt6632 - 10 > local74 || Static349.anInt6632 + Static124.anInt2716 + 10 < local74 || local215 < Static127.anInt2787 - 10 || Static127.anInt2787 + Static147.anInt2656 + 10 < local215) {
				Static302.aBoolean409 = false;
				Static26.method683(Static127.anInt2787, Static147.anInt2656, Static349.anInt6632, Static124.anInt2716);
			}
		}
		if (local58 != 1) {
			return;
		}
		local74 = Static349.anInt6632;
		local215 = Static127.anInt2787;
		@Pc(265) int local265 = Static124.anInt2716;
		@Pc(267) int local267 = Static272.anInt5167;
		@Pc(269) int local269 = Static321.anInt6195;
		@Pc(271) int local271 = -1;
		@Pc(291) int local291;
		for (@Pc(273) int local273 = 0; local273 < Static41.anInt980; local273++) {
			if (Static45.aBoolean80) {
				local291 = local215 + (Static41.anInt980 + -1 + -local273) * 16 + 33;
				if (local74 < local267 && local267 < local265 + local74 && local291 - 13 < local269 && local269 < local291 + 4) {
					local271 = local273;
				}
			} else {
				local291 = local215 + (-local273 + -1 + Static41.anInt980) * 16 + 31;
				if (local74 < local267 && local74 + local265 > local267 && local291 - 13 < local269 && local269 < local291 + 3) {
					local271 = local273;
				}
			}
		}
		if (local271 != -1) {
			local291 = 0;
			@Pc(382) Class165 local382 = new Class165(Static95.aClass18_9);
			for (@Pc(387) Class14_Sub23 local387 = (Class14_Sub23) local382.method4354(); local387 != null; local387 = (Class14_Sub23) local382.method4355()) {
				if (local291 == local271) {
					Static97.method2213(local387);
				}
				local291++;
			}
		}
		Static302.aBoolean409 = false;
		Static26.method683(Static127.anInt2787, Static147.anInt2656, Static349.anInt6632, Static124.anInt2716);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IILclient!jd;IIBI)V")
	public static void method5001(@OriginalArg(2) Class10_Sub3_Sub3 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		Static273.method4630(0, arg0.anInt5908, arg1, arg3, arg0.anInt5910, arg2);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIB)V")
	public static void method5002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class14_Sub2_Sub13 local8 = Static1.method5711(11, arg2);
		local8.method3540();
		local8.anInt3805 = arg0;
		local8.anInt3808 = arg1;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(Z)V")
	public static void method5003() {
		@Pc(5) Class11 local5 = Static178.aClass11_79;
		synchronized (Static178.aClass11_79) {
			Static178.aClass11_79.method214();
		}
		local5 = Static95.aClass11_52;
		synchronized (Static95.aClass11_52) {
			Static95.aClass11_52.method214();
		}
		local5 = Static206.aClass11_144;
		synchronized (Static206.aClass11_144) {
			Static206.aClass11_144.method214();
		}
	}
}
