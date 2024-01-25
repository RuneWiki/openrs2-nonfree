import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!ifa", name = "h", descriptor = "Lclient!rh;")
	public static Class287 aClass287_2;

	@OriginalMember(owner = "client!ifa", name = "d", descriptor = "Lclient!aj;")
	public static final Class10 aClass10_20 = new Class10(260);

	@OriginalMember(owner = "client!ifa", name = "i", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_130 = new Class272(109, -1);

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILclient!r;IILclient!lk;)V")
	public static void method3815(@OriginalArg(0) int arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class203 arg3) {
		@Pc(10) Class146 local10 = arg3.method4780(arg1);
		if (local10 == null) {
			return;
		}
		arg1.da(arg0, arg2, arg3.anInt5513 + arg0, arg3.anInt5476 + arg2);
		if (Static355.anInt6148 == 2 || Static355.anInt6148 == 5 || Static564.aClass46_32 == null) {
			arg1.FA(-16777216, local10, arg0, arg2);
			return;
		}
		@Pc(53) int local53;
		@Pc(62) int local62;
		@Pc(70) int local70;
		@Pc(59) int local59;
		if (Static446.anInt7363 == 4) {
			local59 = 4096;
			local62 = Static383.anInt6591;
			local70 = (int) -Static439.aFloat151 & 0x3FFF;
			local53 = Static92.anInt2289;
		} else {
			local53 = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8975;
			local59 = 4096 - Static435.anInt7196 * 16;
			local62 = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8980;
			local70 = Static278.anInt5101 + (int) -Static439.aFloat151 & 0x3FFF;
		}
		@Pc(96) int local96 = local53 / 128 + 208 + 48 - Static400.anInt6818 * 2;
		@Pc(113) int local113 = Static271.anInt5050 * 4 + 48 + 208 - local62 / 128 - Static271.anInt5050 * 2;
		Static564.aClass46_32.method7607((float) arg0 + (float) arg3.anInt5513 / 2.0F, (float) arg3.anInt5476 / 2.0F + (float) arg2, (float) local96, (float) local113, local59, local70 << 2, local10, arg0, arg2);
		@Pc(166) int local166;
		@Pc(176) int local176;
		@Pc(186) int local186;
		@Pc(197) int local197;
		for (@Pc(149) Class3_Sub4 local149 = (Class3_Sub4) Static17.aClass130_4.method3543(); local149 != null; local149 = (Class3_Sub4) Static17.aClass130_4.method3551()) {
			@Pc(154) int local154 = local149.anInt109;
			local166 = (Static190.aClass149_1.anIntArray352[local154] >> 14 & 0x3FFF) - Static529.anInt8344;
			local176 = (Static190.aClass149_1.anIntArray352[local154] & 0x3FFF) - Static463.anInt7588;
			local186 = local166 * 4 + 2 - local53 / 128;
			local197 = local176 * 4 + 2 - local62 / 128;
			Static390.method5752(Static190.aClass149_1.anIntArray351[local154], arg3, local197, local10, local186, arg2, arg0, arg1);
		}
		for (local166 = 0; local166 < Static272.anInt5060; local166++) {
			local176 = Static501.anIntArray614[local166] * 4 + 2 - local53 / 128;
			local186 = Static337.anIntArray466[local166] * 4 + 2 - local62 / 128;
			@Pc(256) Class23 local256 = Static476.aClass69_5.method2181(Static119.anIntArray241[local166]);
			if (local256.anIntArray78 != null) {
				local256 = local256.method587(Static427.aClass56_1);
				if (local256 == null || local256.anInt776 == -1) {
					continue;
				}
			}
			Static390.method5752(local256.anInt776, arg3, local186, local10, local176, arg2, arg0, arg1);
		}
		@Pc(344) int local344;
		@Pc(355) int local355;
		for (@Pc(297) Class3_Sub46 local297 = (Class3_Sub46) Static508.aClass310_33.method6602(); local297 != null; local297 = (Class3_Sub46) Static508.aClass310_33.method6599()) {
			local186 = (int) (local297.aLong273 >> 28 & 0x3L);
			if (local186 == Static238.anInt4475) {
				local197 = (int) (local297.aLong273 & 0x3FFFL) - Static529.anInt8344;
				@Pc(333) int local333 = (int) (local297.aLong273 >> 14 & 0x3FFFL) - Static463.anInt7588;
				local344 = local197 * 4 + 2 - local53 / 128;
				local355 = local333 * 4 + 2 - local62 / 128;
				Static555.method7393(arg3, local355, arg2, local344, local10, Static277.aClass46Array11[0], arg0);
			}
		}
		@Pc(446) int local446;
		for (local186 = 0; local186 < Static49.anInt1058; local186++) {
			@Pc(388) Class3_Sub39 local388 = (Class3_Sub39) Static243.aClass310_16.method6601((long) Static480.anIntArray603[local186]);
			if (local388 != null) {
				@Pc(393) Class9_Sub1_Sub1_Sub2_Sub1 local393 = local388.aClass9_Sub1_Sub1_Sub2_Sub1_2;
				if (local393.method418() && Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126 == local393.aByte126) {
					@Pc(409) Class294 local409 = local393.aClass294_1;
					if (local409 != null && local409.anIntArray588 != null) {
						local409 = local409.method6429(Static427.aClass56_1);
					}
					if (local409 != null && local409.aBoolean602 && local409.aBoolean599) {
						local355 = local393.anInt8975 / 128 - local53 / 128;
						local446 = local393.anInt8980 / 128 - local62 / 128;
						if (local409.anInt7624 == -1) {
							Static555.method7393(arg3, local446, arg2, local355, local10, Static277.aClass46Array11[1], arg0);
						} else {
							Static390.method5752(local409.anInt7624, arg3, local446, local10, local355, arg2, arg0, arg1);
						}
					}
				}
			}
		}
		local197 = Static476.anInt8277;
		@Pc(482) int[] local482 = Static10.anIntArray19;
		@Pc(526) int local526;
		@Pc(530) int local530;
		@Pc(559) int local559;
		for (local344 = 0; local344 < local197; local344++) {
			@Pc(492) Class9_Sub1_Sub1_Sub2_Sub2 local492 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local482[local344]];
			if (local492 != null && local492.method5582() && local492 != Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2 && Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126 == local492.aByte126) {
				local446 = local492.anInt8975 / 128 - local53 / 128;
				local526 = local492.anInt8980 / 128 - local62 / 128;
				@Pc(528) boolean local528 = false;
				for (local530 = 0; local530 < Static590.anInt9377; local530++) {
					if (local492.aString94.equals(Static595.aStringArray49[local530]) && Static334.anIntArray461[local530] != 0) {
						local528 = true;
						break;
					}
				}
				@Pc(557) boolean local557 = false;
				for (local559 = 0; local559 < Static583.anInt9304; local559++) {
					if (local492.aString94.equals(Static419.aClass325Array5[local559].aString111)) {
						local557 = true;
						break;
					}
				}
				@Pc(583) boolean local583 = false;
				if (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt6500 != 0 && local492.anInt6500 != 0 && local492.anInt6500 == Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt6500) {
					local583 = true;
				}
				if (local492.aBoolean535) {
					Static555.method7393(arg3, local526, arg2, local446, local10, Static277.aClass46Array11[6], arg0);
				} else if (local528) {
					Static555.method7393(arg3, local526, arg2, local446, local10, Static277.aClass46Array11[3], arg0);
				} else if (local557) {
					Static555.method7393(arg3, local526, arg2, local446, local10, Static277.aClass46Array11[5], arg0);
				} else if (local583) {
					Static555.method7393(arg3, local526, arg2, local446, local10, Static277.aClass46Array11[4], arg0);
				} else {
					Static555.method7393(arg3, local526, arg2, local446, local10, Static277.aClass46Array11[2], arg0);
				}
			}
		}
		@Pc(679) Class122[] local679 = Static443.aClass122Array1;
		@Pc(763) int local763;
		for (local446 = 0; local446 < local679.length; local446++) {
			@Pc(687) Class122 local687 = local679[local446];
			if (local687 != null && local687.anInt3557 != 0 && Static305.anInt5560 % 20 < 10) {
				@Pc(726) int local726;
				if (local687.anInt3557 == 1) {
					@Pc(711) Class3_Sub39 local711 = (Class3_Sub39) Static243.aClass310_16.method6601((long) local687.anInt3554);
					if (local711 != null) {
						@Pc(716) Class9_Sub1_Sub1_Sub2_Sub1 local716 = local711.aClass9_Sub1_Sub1_Sub2_Sub1_2;
						local726 = local716.anInt8975 / 128 - local53 / 128;
						local559 = local716.anInt8980 / 128 - local62 / 128;
						Static483.method6586(360000L, arg0, arg3, local10, local559, arg2, local687.anInt3547, local726);
					}
				}
				if (local687.anInt3557 == 2) {
					local763 = local687.anInt3555 / 128 - local53 / 128;
					local530 = local687.anInt3553 / 128 - local62 / 128;
					@Pc(779) long local779 = (long) (local687.anInt3548 << 7);
					@Pc(783) long local783 = local779 * local779;
					Static483.method6586(local783, arg0, arg3, local10, local530, arg2, local687.anInt3547, local763);
				}
				if (local687.anInt3557 == 10 && local687.anInt3554 >= 0 && Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2.length > local687.anInt3554) {
					@Pc(816) Class9_Sub1_Sub1_Sub2_Sub2 local816 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local687.anInt3554];
					if (local816 != null) {
						local530 = local816.anInt8975 / 128 - local53 / 128;
						local726 = local816.anInt8980 / 128 - local62 / 128;
						Static483.method6586(360000L, arg0, arg3, local10, local726, arg2, local687.anInt3547, local530);
					}
				}
			}
		}
		if (Static446.anInt7363 == 4) {
			return;
		}
		if (Static341.anInt6021 != 0) {
			local526 = Static341.anInt6021 * 4 + (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.method5569() + -1) * 2 + 2 - local53 / 128;
			local763 = Static329.anInt5894 * 4 + (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.method5569() - 1) * 2 + 2 - local62 / 128;
			Static555.method7393(arg3, local763, arg2, local526, local10, Static191.aClass46Array7[Static77.aBoolean168 ? 1 : 0], arg0);
		}
		arg1.method7185(arg3.anInt5476 / 2 + arg2 - 1, 3, 3, arg0 + arg3.anInt5513 / 2 - 1, -1);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "()V")
	public static void method3819() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static488.aClass313Array1.length; local3++) {
				if (Static488.aClass313Array1[local3].method6674()) {
					Static455.aLongArray12[local3] = Static488.aClass313Array1[local3].method6672();
				} else {
					synchronized (Static488.aClass313Array1[local3]) {
						Static488.aClass313Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static488.aClass313Array1[Static488.aClass313Array1.length - 1].method6678();
				Static363.method5458(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static488.aClass313Array1.length - 1; local3++) {
						if (!Static488.aClass313Array1[local3].method6674()) {
							synchronized (Static488.aClass313Array1[local3]) {
								Static488.aClass313Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static488.aClass313Array1.length - 2; local102++) {
							Static488.aClass313Array1[local102].method6678();
						}
						Static363.method5458(2);
						while (!Static488.aClass313Array1[0].method6674()) {
							synchronized (Static488.aClass313Array1[0]) {
								Static488.aClass313Array1[0].notify();
							}
							try {
								Static374.method5521(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static488.aClass313Array1[0].method6678();
						return;
					}
					try {
						Static374.method5521(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static374.method5521(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}
}
