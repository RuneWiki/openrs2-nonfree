import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!er", name = "c", descriptor = "Lclient!qea;")
	public static Class296 aClass296_2;

	@OriginalMember(owner = "client!er", name = "g", descriptor = "Lclient!daa;")
	public static Class68 aClass68_2;

	@OriginalMember(owner = "client!er", name = "d", descriptor = "Lclient!op;")
	public static final Class275 aClass275_2 = new Class275("", 14);

	@OriginalMember(owner = "client!er", name = "f", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("b25c50df54691608830a3d4b1b51c2df17466fe540ff9214acff8b1ace500c7ed9996773e3fc7a6ec44e376a28705deb876bed393863c441854806d5618fb2b92c1f4cda70e40c3be6ec42518564640b39014bf1874f6b7ab540b90e8564c2634eee204138f5bce08d60887a5e3edede7fae61405e17e95a735c25db28f2c1092ec12619ee6312d6632602c826b679b24b48b3aad8781b478b2116c4f9e975bd19045bd0129ae180fa967d69a68c9a208bda5f6d9077142fb1564fedb85ee97eb3b2531f091e1ed6b7af1d7cb1d4fab3ae5d45e059341dee5990dd0501dd3ed3bd2cd89c43ad2a601eaea1917b0f07fbfca4c08b9072490b107dc3a3b7a3d6315ebe09efaf1e86f80795a85899859842d4d986eb441a36286df0ae4c9c9551e07e38184cd786ab72cea9aabb18b610435d1789c1d6caa4a140842486ea4b17ee0e32a638e79275b2c293becf6a5e8ef3a1ba5d3c5d586d8590a30079caf298131ace564bc84bbc41e600e1e4ada33bc32b60e6e4978299f19a973364476426d6ee337d31bce00a5000beac57bdc34802a9b1c115a464e4dd1661f817e0b138cad2c665fa5bf52e2d58b16e3f1eaff5375898003c12c3c0c98519af5ff34997b232c8203319291796e08c45f364e1af1de7bcb25faf1b10a5557511d18a113917311d36cb75befe029156b93321ecd2dc1d10576b77d0075f61e2473305f4ad63", 16);

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IBIZZ)V")
	public static void method438(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		Static288.method4727(arg0, arg3, 0, Static59.aClass204_Sub1Array1.length - 1, arg1, arg2);
		Static392.aClass6_Sub46_1 = null;
		Static638.anInt9936 = 0;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)V")
	public static void method439(@OriginalArg(1) int arg0) {
		if (Static318.anIntArray319 == null || Static318.anIntArray319.length < arg0) {
			Static318.anIntArray319 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!ha;ILclient!vo;IZ)V")
	public static void method441(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class381 arg2, @OriginalArg(3) int arg3) {
		@Pc(18) Class1 local18 = arg2.method8751(arg0);
		if (local18 == null) {
			return;
		}
		arg0.KA(arg3, arg1, arg2.anInt10159 + arg3, arg1 + arg2.anInt10131);
		if (Static378.anInt6595 == 2 || Static378.anInt6595 == 5 || Static289.aClass49_24 == null) {
			arg0.A(-16777216, local18, arg3, arg1);
			return;
		}
		@Pc(71) int local71;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(73) int local73;
		if (Static526.anInt8626 == 4) {
			local63 = Static553.anInt8968;
			local69 = (int) -Static409.aFloat135 & 0x3FFF;
			local71 = Static492.anInt3485;
			local73 = 4096;
		} else {
			local73 = 4096 - Static41.anInt542 * 16;
			local63 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9057;
			local71 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9048;
			local69 = Static51.anInt622 + (int) -Static409.aFloat135 & 0x3FFF;
		}
		@Pc(109) int local109 = local71 / 128 + 208 + 48 - Static29.anInt380 * 2;
		@Pc(128) int local128 = Static327.anInt5650 * 4 + 48 + 208 - Static327.anInt5650 * 2 - local63 / 128;
		Static289.aClass49_24.method8978((float) arg2.anInt10159 / 2.0F + (float) arg3, (float) arg2.anInt10131 / 2.0F + (float) arg1, (float) local109, (float) local128, local73, local69 << 2, local18, arg3, arg1);
		@Pc(181) int local181;
		@Pc(191) int local191;
		@Pc(202) int local202;
		@Pc(213) int local213;
		for (@Pc(162) Class6_Sub6 local162 = (Class6_Sub6) Static519.aClass340_66.method8124(); local162 != null; local162 = (Class6_Sub6) Static519.aClass340_66.method8134()) {
			@Pc(169) int local169 = local162.anInt482;
			local181 = (Static66.aClass176_1.anIntArray272[local169] >> 14 & 0x3FFF) - Static50.anInt606;
			local191 = (Static66.aClass176_1.anIntArray272[local169] & 0x3FFF) - Static404.anInt7039;
			local202 = local181 * 4 + 2 - local71 / 128;
			local213 = local191 * 4 + 2 - local63 / 128;
			Static1.method8905(arg1, Static66.aClass176_1.anIntArray273[local169], local213, local18, arg0, arg3, arg2, local202);
		}
		for (local181 = 0; local181 < Static529.anInt8695; local181++) {
			local191 = Static360.anIntArray359[local181] * 4 + 2 - local71 / 128;
			local202 = Static477.anIntArray275[local181] * 4 + 2 - local63 / 128;
			@Pc(273) Class125 local273 = Static290.aClass163_5.method4124(127, Static630.anIntArray238[local181]);
			if (local273.anIntArray198 != null) {
				local273 = local273.method3383(Static303.aClass55_2);
				if (local273 == null || local273.anInt3580 == -1) {
					continue;
				}
			}
			Static1.method8905(arg1, local273.anInt3580, local202, local18, arg0, arg3, arg2, local191);
		}
		@Pc(366) int local366;
		@Pc(377) int local377;
		for (@Pc(320) Class6_Sub36 local320 = (Class6_Sub36) Static650.aClass74_72.method1404(); local320 != null; local320 = (Class6_Sub36) Static650.aClass74_72.method1405()) {
			local202 = (int) (local320.aLong346 >> 28 & 0x3L);
			if (Static494.anInt4033 == local202) {
				local213 = (int) (local320.aLong346 & 0x3FFFL) - Static50.anInt606;
				@Pc(356) int local356 = (int) (local320.aLong346 >> 14 & 0x3FFFL) - Static404.anInt7039;
				local366 = local213 * 4 + 2 - local71 / 128;
				local377 = local356 * 4 + 2 - local63 / 128;
				Static161.method3199(local18, arg2, Static690.aClass49Array20[0], arg1, local366, arg3, local377);
			}
		}
		@Pc(480) int local480;
		for (local202 = 0; local202 < Static201.anInt4069; local202++) {
			@Pc(417) Class6_Sub11 local417 = (Class6_Sub11) Static419.aClass74_45.method1401((long) Static531.anIntArray580[local202]);
			if (local417 != null) {
				@Pc(422) Class60_Sub1_Sub1_Sub3_Sub2 local422 = local417.aClass60_Sub1_Sub1_Sub3_Sub2_1;
				if (local422.method4439() && Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135 == local422.aByte135) {
					@Pc(436) Class294 local436 = local422.aClass294_1;
					if (local436 != null && local436.anIntArray511 != null) {
						local436 = local436.method7168(Static303.aClass55_2);
					}
					if (local436 != null && local436.aBoolean619 && local436.aBoolean615) {
						local377 = local422.anInt9048 / 128 - local71 / 128;
						local480 = local422.anInt9057 / 128 - local63 / 128;
						if (local436.anInt8150 == -1) {
							Static161.method3199(local18, arg2, Static690.aClass49Array20[1], arg1, local377, arg3, local480);
						} else {
							Static1.method8905(arg1, local436.anInt8150, local480, local18, arg0, arg3, arg2, local377);
						}
					}
				}
			}
		}
		local213 = Static661.anInt10532;
		@Pc(524) int[] local524 = Static591.anIntArray611;
		@Pc(582) int local582;
		@Pc(586) int local586;
		@Pc(618) int local618;
		for (local366 = 0; local366 < local213; local366++) {
			@Pc(534) Class60_Sub1_Sub1_Sub3_Sub1 local534 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local524[local366]];
			if (local534 != null && local534.method2710() && !local534.aBoolean229 && local534 != Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1 && local534.aByte135 == Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135) {
				local480 = local534.anInt9048 / 128 - local71 / 128;
				local582 = local534.anInt9057 / 128 - local63 / 128;
				@Pc(584) boolean local584 = false;
				for (local586 = 0; local586 < Static265.anInt5023; local586++) {
					if (local534.aString23.equals(Static35.aStringArray5[local586]) && Static241.anIntArray241[local586] != 0) {
						local584 = true;
						break;
					}
				}
				@Pc(616) boolean local616 = false;
				for (local618 = 0; local618 < Static188.anInt3786; local618++) {
					if (local534.aString23.equals(Static29.aClass231Array1[local618].aString72)) {
						local616 = true;
						break;
					}
				}
				@Pc(644) boolean local644 = false;
				if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt2867 != 0 && local534.anInt2867 != 0 && Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt2867 == local534.anInt2867) {
					local644 = true;
				}
				if (local534.aBoolean226) {
					Static161.method3199(local18, arg2, Static690.aClass49Array20[6], arg1, local480, arg3, local582);
				} else if (local644) {
					Static161.method3199(local18, arg2, Static690.aClass49Array20[4], arg1, local480, arg3, local582);
				} else if (local534.aBoolean227) {
					Static161.method3199(local18, arg2, Static690.aClass49Array20[7], arg1, local480, arg3, local582);
				} else if (local584) {
					Static161.method3199(local18, arg2, Static690.aClass49Array20[3], arg1, local480, arg3, local582);
				} else if (local616) {
					Static161.method3199(local18, arg2, Static690.aClass49Array20[5], arg1, local480, arg3, local582);
				} else {
					Static161.method3199(local18, arg2, Static690.aClass49Array20[2], arg1, local480, arg3, local582);
				}
			}
		}
		@Pc(781) Class232[] local781 = Static236.aClass232Array1;
		@Pc(878) int local878;
		for (local480 = 0; local480 < local781.length; local480++) {
			@Pc(789) Class232 local789 = local781[local480];
			if (local789 != null && local789.anInt6164 != 0 && Static141.anInt8737 % 20 < 10) {
				@Pc(841) int local841;
				if (local789.anInt6164 == 1) {
					@Pc(826) Class6_Sub11 local826 = (Class6_Sub11) Static419.aClass74_45.method1401((long) local789.anInt6165);
					if (local826 != null) {
						@Pc(831) Class60_Sub1_Sub1_Sub3_Sub2 local831 = local826.aClass60_Sub1_Sub1_Sub3_Sub2_1;
						local841 = local831.anInt9048 / 128 - local71 / 128;
						local618 = local831.anInt9057 / 128 - local63 / 128;
						Static353.method5409(arg1, local18, local789.anInt6162, local618, local841, arg2, arg3, 360000L);
					}
				}
				if (local789.anInt6164 == 2) {
					local878 = local789.anInt6167 / 128 - local71 / 128;
					local586 = local789.anInt6174 / 128 - local63 / 128;
					@Pc(893) long local893 = (long) (local789.anInt6166 << 7);
					@Pc(897) long local897 = local893 * local893;
					Static353.method5409(arg1, local18, local789.anInt6162, local586, local878, arg2, arg3, local897);
				}
				if (local789.anInt6164 == 10 && local789.anInt6165 >= 0 && Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1.length > local789.anInt6165) {
					@Pc(933) Class60_Sub1_Sub1_Sub3_Sub1 local933 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local789.anInt6165];
					if (local933 != null) {
						local586 = local933.anInt9048 / 128 - local71 / 128;
						local841 = local933.anInt9057 / 128 - local63 / 128;
						Static353.method5409(arg1, local18, local789.anInt6162, local841, local586, arg2, arg3, 360000L);
					}
				}
			}
		}
		if (Static526.anInt8626 == 4) {
			return;
		}
		if (Static97.anInt1434 != 0) {
			local582 = Static97.anInt1434 * 4 + Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.method4424((byte) -28) * 2 + 2 - local71 / 128 - 2;
			local878 = Static208.anInt4167 * 4 + (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.method4424((byte) -28) + -1) * 2 + 2 - local63 / 128;
			Static161.method3199(local18, arg2, Static305.aClass49Array9[Static566.aBoolean645 ? 1 : 0], arg1, local582, arg3, local878);
		}
		if (!Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aBoolean229) {
			arg0.method6631(3, arg2.anInt10159 / 2 + arg3 - 1, 3, -1, arg1 + arg2.anInt10131 / 2 - 1);
			return;
		}
	}
}
