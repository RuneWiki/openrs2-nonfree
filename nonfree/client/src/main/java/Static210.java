import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!on", name = "d", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger4 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ILclient!la;)[Lclient!ti;")
	public static Class168[] method3508(@OriginalArg(1) Class102 arg0) {
		if (!arg0.method2880()) {
			return new Class168[0];
		}
		@Pc(24) Class111 local24 = arg0.method2877();
		while (local24.anInt3788 == 0) {
			Static138.method2475(10L);
		}
		if (local24.anInt3788 == 2) {
			return new Class168[0];
		}
		@Pc(50) int[] local50 = (int[]) local24.anObject4;
		@Pc(56) Class168[] local56 = new Class168[local50.length >> 2];
		for (@Pc(58) int local58 = 0; local58 < local56.length; local58++) {
			@Pc(70) Class168 local70 = new Class168();
			local56[local58] = local70;
			local70.anInt5413 = local50[local58 << 2];
			local70.anInt5415 = local50[(local58 << 2) + 1];
			local70.anInt5416 = local50[(local58 << 2) + 2];
			local70.anInt5417 = local50[(local58 << 2) + 3];
		}
		return local56;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIILclient!th;)V")
	public static void method3510(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class15_Sub2_Sub2 arg2) {
		if ((arg1 & 0x10) != 0) {
			arg2.anInt5352 = Static91.aClass2_Sub16_Sub1_1.method2195();
			if (arg2.anInt5352 == 65535) {
				arg2.anInt5352 = -1;
			}
		}
		@Pc(45) int local45;
		if ((arg1 & 0x100) != 0) {
			local45 = Static91.aClass2_Sub16_Sub1_1.method2148();
			@Pc(48) int[] local48 = new int[local45];
			@Pc(51) int[] local51 = new int[local45];
			@Pc(54) int[] local54 = new int[local45];
			for (@Pc(56) int local56 = 0; local56 < local45; local56++) {
				@Pc(67) int local67 = Static91.aClass2_Sub16_Sub1_1.method2195();
				if (local67 == 65535) {
					local67 = -1;
				}
				local48[local56] = local67;
				local51[local56] = Static91.aClass2_Sub16_Sub1_1.method2175();
				local54[local56] = Static91.aClass2_Sub16_Sub1_1.method2130();
			}
			Static264.method4159(local51, local54, local48, arg2);
		}
		@Pc(117) int local117;
		if ((arg1 & 0x4) != 0) {
			local45 = Static91.aClass2_Sub16_Sub1_1.method2195();
			if (local45 == 65535) {
				local45 = -1;
			}
			local117 = Static91.aClass2_Sub16_Sub1_1.method2133();
			Static136.method2462(local117, arg2, local45);
		}
		if ((arg1 & 0x400) != 0) {
			arg2.anInt5346 = Static91.aClass2_Sub16_Sub1_1.method2146();
			arg2.anInt5350 = Static91.aClass2_Sub16_Sub1_1.method2133();
			arg2.anInt5376 = Static91.aClass2_Sub16_Sub1_1.method2146();
			arg2.anInt5331 = Static91.aClass2_Sub16_Sub1_1.method2146();
			arg2.anInt5335 = Static91.aClass2_Sub16_Sub1_1.method2130() + Static268.anInt5236;
			arg2.anInt5328 = Static91.aClass2_Sub16_Sub1_1.method2130() + Static268.anInt5236;
			arg2.anInt5320 = Static91.aClass2_Sub16_Sub1_1.method2146();
			arg2.anInt5342 = 1;
			arg2.anInt5370 = 0;
		}
		if ((arg1 & 0x80) != 0) {
			local45 = Static91.aClass2_Sub16_Sub1_1.method2161();
			local117 = Static91.aClass2_Sub16_Sub1_1.method2146();
			arg2.method4284(Static268.anInt5236, local45, local117);
			arg2.anInt5309 = Static268.anInt5236 + 300;
			arg2.anInt5337 = Static91.aClass2_Sub16_Sub1_1.method2133();
		}
		@Pc(303) int local303;
		if ((arg1 & 0x200) != 0) {
			local45 = Static91.aClass2_Sub16_Sub1_1.method2130();
			@Pc(219) boolean local219 = true;
			local117 = Static91.aClass2_Sub16_Sub1_1.method2165();
			if (local45 == 65535) {
				local45 = -1;
			}
			if (local45 != -1 && arg2.anInt5301 != -1 && Static208.method3496(Static156.method2852(local45).anInt3389).anInt3870 < Static208.method3496(Static156.method2852(arg2.anInt5301).anInt3389).anInt3870) {
				local219 = false;
			}
			if (local219) {
				arg2.anInt5363 = 1;
				arg2.anInt5321 = 0;
				arg2.anInt5316 = 0;
				arg2.anInt5326 = local117 >> 16;
				arg2.anInt5301 = local45;
				arg2.anInt5367 = (local117 & 0xFFFF) + Static268.anInt5236;
				if (arg2.anInt5367 > Static268.anInt5236) {
					arg2.anInt5316 = -1;
				}
				if (arg2.anInt5301 != -1 && arg2.anInt5367 == Static268.anInt5236) {
					local303 = Static156.method2852(arg2.anInt5301).anInt3389;
					if (local303 != -1) {
						@Pc(310) Class112 local310 = Static208.method3496(local303);
						if (local310 != null && local310.anIntArray378 != null) {
							Static28.method558(Static22.aClass15_Sub2_Sub2_1 == arg2, local310, 0, arg2.anInt5358, arg2.anInt5371);
						}
					}
				}
			}
		}
		if ((arg1 & 0x800) != 0) {
			local45 = Static91.aClass2_Sub16_Sub1_1.method2161();
			local117 = Static91.aClass2_Sub16_Sub1_1.method2133();
			arg2.method4284(Static268.anInt5236, local45, local117);
		}
		if ((arg1 & 0x40) != 0) {
			local45 = Static91.aClass2_Sub16_Sub1_1.method2130();
			local117 = Static91.aClass2_Sub16_Sub1_1.method2175();
			@Pc(366) int local366 = Static91.aClass2_Sub16_Sub1_1.method2148();
			@Pc(377) boolean local377 = (local45 & 0x8000) != 0;
			local303 = Static91.aClass2_Sub16_Sub1_1.anInt2789;
			if (arg2.aString184 != null && arg2.aClass97_2 != null) {
				@Pc(388) boolean local388 = false;
				if (local117 <= 1) {
					if (!local377 && (Static294.aBoolean381 && !Static11.aBoolean21 || Static63.aBoolean103)) {
						local388 = true;
					} else if (Static44.method842(arg2.aString184)) {
						local388 = true;
					}
				}
				if (!local388 && Static151.anInt3324 == 0) {
					Static94.aClass2_Sub16_5.anInt2789 = 0;
					Static91.aClass2_Sub16_Sub1_1.method2193(local366, Static94.aClass2_Sub16_5.aByteArray17);
					Static94.aClass2_Sub16_5.anInt2789 = 0;
					@Pc(434) int local434 = -1;
					@Pc(443) String local443;
					if (local377) {
						local45 &= 0x7FFF;
						@Pc(453) Class7 local453 = Static273.method4311(Static94.aClass2_Sub16_5);
						local434 = local453.anInt121;
						local443 = local453.aClass2_Sub8_Sub8_1.method1865(Static94.aClass2_Sub16_5);
					} else {
						local443 = Static135.method1223(Static295.method4527(Static219.method3638(Static94.aClass2_Sub16_5)));
					}
					arg2.aString181 = local443.trim();
					arg2.anInt5300 = local45 >> 8;
					arg2.anInt5314 = local45 & 0xFF;
					@Pc(490) int local490;
					if (local117 == 1 || local117 == 2) {
						local490 = local377 ? 17 : 1;
					} else {
						local490 = local377 ? 17 : 2;
					}
					arg2.anInt5374 = 150;
					if (local117 == 2) {
						Static120.method2007(null, local443, "<img=1>" + arg2.method4299(false), local434, "<img=1>" + arg2.method4299(true), local490, 0);
					} else if (local117 == 1) {
						Static120.method2007(null, local443, "<img=0>" + arg2.method4299(false), local434, "<img=0>" + arg2.method4299(true), local490, 0);
					} else {
						Static120.method2007(null, local443, arg2.method4299(false), local434, arg2.method4299(true), local490, 0);
					}
				}
			}
			Static91.aClass2_Sub16_Sub1_1.anInt2789 = local366 + local303;
		}
		if ((arg1 & 0x20) != 0) {
			local45 = Static91.aClass2_Sub16_Sub1_1.method2175();
			@Pc(607) byte[] local607 = new byte[local45];
			@Pc(612) Class2_Sub16 local612 = new Class2_Sub16(local607);
			Static91.aClass2_Sub16_Sub1_1.method2156(local45, local607);
			Static59.aClass2_Sub16Array1[arg0] = local612;
			arg2.method4301(arg0, local612);
		}
		if ((arg1 & 0x1) != 0) {
			arg2.aString181 = Static91.aClass2_Sub16_Sub1_1.method2158();
			if (arg2.aString181.charAt(0) == '~') {
				arg2.aString181 = arg2.aString181.substring(1);
				Static155.method2848(arg2.aString181, arg2.method4299(false), 0, arg2.method4299(true), 2);
			} else if (Static22.aClass15_Sub2_Sub2_1 == arg2) {
				Static155.method2848(arg2.aString181, arg2.method4299(false), 0, arg2.method4299(true), 2);
			}
			arg2.anInt5314 = 0;
			arg2.anInt5374 = 150;
			arg2.anInt5300 = 0;
		}
		if ((arg1 & 0x8) != 0) {
			arg2.anInt5324 = Static91.aClass2_Sub16_Sub1_1.method2195();
			arg2.anInt5344 = Static91.aClass2_Sub16_Sub1_1.method2152();
		}
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(B)V")
	public static void method3511() {
		Static157.aClass157_29.method4027();
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
	public static void method3512() {
		Static81.aClass157_15.method4027();
	}
}
