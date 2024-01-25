import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_12 = new Class32("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
	public static int anInt642 = 0;

	@OriginalMember(owner = "client!bo", name = "h", descriptor = "Z")
	public static boolean aBoolean54 = false;

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
	public static int anInt643 = 0;

	@OriginalMember(owner = "client!bo", name = "j", descriptor = "I")
	public static int anInt644 = 10;

	@OriginalMember(owner = "client!bo", name = "k", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_16 = new Class205(13, 8);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;B)V")
	public static void method548(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		Static241.anInt4323 = arg1;
		Static385.aString67 = arg2;
		Static192.aString41 = arg0;
		if (Static385.aString67.equals("") || Static192.aString41.equals("")) {
			Static139.anInt2783 = 3;
		} else if (Static347.anInt5864 == -1) {
			Static139.anInt2783 = -3;
			Static74.anInt1434 = 0;
			Static19.anInt435 = 0;
			Static154.anInt2989 = 1;
			@Pc(39) Class2_Sub16 local39 = new Class2_Sub16(128);
			local39.method5358(10);
			local39.method5355((int) (Math.random() * 9.9999999E7D));
			local39.method5368(Static363.method5387(Static385.aString67));
			local39.method5355((int) (Math.random() * 9.9999999E7D));
			local39.method5362(Static192.aString41);
			local39.method5355((int) (Math.random() * 9.9999999E7D));
			local39.method5347(Static200.aBigInteger1, Static278.aBigInteger2);
			Static372.aClass2_Sub16_Sub2_4.anInt6145 = 0;
			Static372.aClass2_Sub16_Sub2_4.method5358(Static320.aClass17_10.anInt444);
			Static372.aClass2_Sub16_Sub2_4.method5358(local39.anInt6145 + 2);
			Static372.aClass2_Sub16_Sub2_4.method5351(573);
			Static372.aClass2_Sub16_Sub2_4.method5344(local39.aByteArray112, local39.anInt6145);
		} else {
			Static302.method2601();
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	public static void method549() {
		for (@Pc(7) int local7 = 0; local7 < Static158.anInt3041; local7++) {
			@Pc(21) int local21 = Static4.anIntArray45[local7];
			@Pc(25) Class1_Sub5_Sub1_Sub2 local25 = Static299.aClass1_Sub5_Sub1_Sub2Array1[local21];
			@Pc(29) int local29 = Static218.aClass2_Sub16_Sub2_3.method5350();
			if ((local29 & 0x8) != 0) {
				local29 += Static218.aClass2_Sub16_Sub2_3.method5350() << 8;
			}
			@Pc(52) int local52;
			@Pc(69) int local69;
			if ((local29 & 0x200) != 0) {
				local52 = Static218.aClass2_Sub16_Sub2_3.method5338();
				@Pc(55) int[] local55 = new int[local52];
				@Pc(58) int[] local58 = new int[local52];
				@Pc(61) int[] local61 = new int[local52];
				for (@Pc(63) int local63 = 0; local63 < local52; local63++) {
					local69 = Static218.aClass2_Sub16_Sub2_3.method5312();
					if (local69 == 65535) {
						local69 = -1;
					}
					local55[local63] = local69;
					local58[local63] = Static218.aClass2_Sub16_Sub2_3.method5338();
					local61[local63] = Static218.aClass2_Sub16_Sub2_3.method5323();
				}
				Static92.method1696(local25, local55, local58, local61);
			}
			@Pc(124) int local124;
			if ((local29 & 0x10) != 0) {
				local52 = Static218.aClass2_Sub16_Sub2_3.method5323();
				if (local52 == 65535) {
					local52 = -1;
				}
				local124 = Static218.aClass2_Sub16_Sub2_3.method5338();
				Static365.method5394(local124, local52, local25);
			}
			if ((local29 & 0x2) != 0) {
				local25.anInt6410 = Static218.aClass2_Sub16_Sub2_3.method5349();
				if (local25.anInt6410 == 65535) {
					local25.anInt6410 = -1;
				}
			}
			if ((local29 & 0x80) != 0) {
				local52 = Static218.aClass2_Sub16_Sub2_3.method5311();
				local124 = Static218.aClass2_Sub16_Sub2_3.method5338();
				local25.method5543(local124, local52, Static253.anInt4469);
				local25.anInt6421 = Static253.anInt4469 + 300;
				local25.anInt6403 = Static218.aClass2_Sub16_Sub2_3.method5359();
			}
			if ((local29 & 0x1) != 0) {
				if (local25.aClass133_1.method3085()) {
					Static215.method3587(local25);
				}
				local25.method5566(Static356.aClass48_2.method951(Static218.aClass2_Sub16_Sub2_3.method5349()));
				local25.method5544(local25.aClass133_1.anInt3332);
				local25.anInt6435 = local25.aClass133_1.anInt3347 << 3;
				if (local25.aClass133_1.method3085()) {
					Static185.method3197(local25, local25.anIntArray1324[0], 0, local25.anIntArray1323[0], local25.aByte69, null, null);
				}
			}
			if ((local29 & 0x40) != 0) {
				local25.aString66 = Static218.aClass2_Sub16_Sub2_3.method5364();
				local25.anInt6449 = 100;
			}
			if ((local29 & 0x20) != 0) {
				local52 = Static218.aClass2_Sub16_Sub2_3.method5312();
				if (local52 == 65535) {
					local52 = -1;
				}
				local124 = Static218.aClass2_Sub16_Sub2_3.method5369();
				@Pc(276) boolean local276 = true;
				@Pc(307) Class202 local307;
				if (local52 != -1 && local25.anInt6420 != -1) {
					@Pc(293) Class34 local293;
					if (local25.anInt6420 == local52) {
						local293 = Static149.aClass173_5.method3800(local52);
						if (local293.aBoolean65 && local293.anInt863 != -1) {
							local307 = Static36.aClass236_1.method5396(local293.anInt863);
							local69 = local307.anInt4932;
							if (local69 == 0) {
								local276 = false;
							} else if (local69 == 1) {
								local276 = true;
							} else if (local69 == 2) {
								local25.anInt6452 = 0;
								local276 = false;
							}
						}
					} else {
						local293 = Static149.aClass173_5.method3800(local52);
						@Pc(346) Class34 local346 = Static149.aClass173_5.method3800(local25.anInt6420);
						if (local293.anInt863 != -1 && local346.anInt863 != -1) {
							@Pc(362) Class202 local362 = Static36.aClass236_1.method5396(local293.anInt863);
							@Pc(368) Class202 local368 = Static36.aClass236_1.method5396(local346.anInt863);
							if (local368.anInt4945 > local362.anInt4945) {
								local276 = false;
							}
						}
					}
				}
				if (local276) {
					local25.anInt6420 = local52;
					local25.anInt6400 = 0;
					local25.anInt6404 = 0;
					local25.anInt6411 = local124 >> 16;
					local25.anInt6442 = 1;
					local25.anInt6395 = (local124 & 0xFFFF) + Static253.anInt4469;
					if (local25.anInt6395 > Static253.anInt4469) {
						local25.anInt6404 = -1;
					}
					if (local25.anInt6420 != -1 && Static253.anInt4469 == local25.anInt6395) {
						@Pc(428) int local428 = Static149.aClass173_5.method3800(local25.anInt6420).anInt863;
						if (local428 != -1) {
							local307 = Static36.aClass236_1.method5396(local428);
							if (local307 != null && local307.anIntArray974 != null) {
								Static169.method2965(0, false, local25.aByte69, local25.anInt6390, local307, local25.anInt6386);
							}
						}
					}
				}
			}
			if ((local29 & 0x100) != 0) {
				local25.anInt6459 = Static218.aClass2_Sub16_Sub2_3.method5323();
				local25.anInt6475 = Static218.aClass2_Sub16_Sub2_3.method5323();
			}
			if ((local29 & 0x4) != 0) {
				local52 = Static218.aClass2_Sub16_Sub2_3.method5311();
				local124 = Static218.aClass2_Sub16_Sub2_3.method5315();
				local25.method5543(local124, local52, Static253.anInt4469);
			}
			if ((local29 & 0x400) != 0) {
				local52 = Static218.aClass2_Sub16_Sub2_3.method5323();
				local25.anInt6446 = Static218.aClass2_Sub16_Sub2_3.method5350();
				local25.anInt6424 = Static218.aClass2_Sub16_Sub2_3.method5350();
				local25.aBoolean458 = (local52 & 0x8000) != 0;
				local25.anInt6401 = local52 & 0x7FFF;
				local25.anInt6447 = local25.anInt6446 + local25.anInt6401 + Static253.anInt4469;
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V")
	public static void method550() {
		Static29.aClass171_10.anInt4076 = 1;
		Static387.aClient1.method758();
		Static331.aBoolean417 = true;
		Static90.aBoolean129 = true;
		Static157.method2849();
		Static372.aClass2_Sub16_Sub2_4.anInt6145 = 0;
		Static339.aClass205_128 = null;
		Static37.aClass205_20 = null;
		Static239.aClass205_95 = null;
		Static113.aClass205_56 = null;
		Static322.anInt5530 = 0;
		Static358.anInt2087 = 0;
		Static218.anInt4548 = 0;
		Static218.aClass2_Sub16_Sub2_3.anInt6145 = 0;
		for (@Pc(4357) int local4357 = 0; local4357 < Static335.aClass141Array1.length; local4357++) {
			Static335.aClass141Array1[local4357] = null;
		}
		for (@Pc(4380) int local4380 = 0; local4380 < 100; local4380++) {
			Static220.aStringArray99[local4380] = null;
		}
		Static189.anInt6619 = (int) (Math.random() * 80.0D) - 40;
		Static190.anInt3567 = (int) (Math.random() * 120.0D) - 60;
		anInt643 = (int) (Math.random() * 30.0D) - 20;
		Class2_Sub4_Sub9.lb = 0;
		Static110.aBoolean180 = false;
		Static250.anInt4448 = (int) (Math.random() * 110.0D) - 55;
		Static3.anInt135 = 0;
		Static174.anInt3329 = (int) (Math.random() * 100.0D) - 50;
		Static127.aFloat41 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static328.method4850();
		for (@Pc(4447) int local4447 = 0; local4447 < 2048; local4447++) {
			Static125.aClass1_Sub5_Sub1_Sub1Array1[local4447] = null;
		}
		Static171.anInt3311 = 0;
		for (@Pc(4463) int local4463 = 0; local4463 < 32768; local4463++) {
			Static299.aClass1_Sub5_Sub1_Sub2Array1[local4463] = null;
		}
		Static169.aClass30_19.method692();
		Static261.aClass30_37.method692();
		Static163.aClass154_4.method3488();
		Static94.aClass246_6.method5610();
		Static370.aClass30_43 = new Class30();
		Static339.anInt5795 = 0;
		Static121.anInt2600 = 0;
		Static321.aClass211_1.method4469();
		Static245.method3917();
		Static296.anInt5089 = 0;
		Static169.anInt3235 = 0;
		Static139.anInt2784 = 0;
		Static131.anInt2701 = 0;
		Static235.anInt4192 = 0;
		Static240.anInt4284 = 0;
		Static9.anInt252 = 0;
		Static217.anInt3930 = 0;
		Static177.anInt3412 = 0;
		Static111.anInt2355 = 0;
		for (@Pc(4522) int local4522 = 0; local4522 < Static330.anIntArray1157.length; local4522++) {
			if (!Static88.aBooleanArray13[local4522]) {
				Static330.anIntArray1157[local4522] = -1;
			}
		}
		if (Static234.anInt4158 != -1) {
			Static96.method1918(Static234.anInt4158);
		}
		for (@Pc(4548) Class2_Sub38 local4548 = (Class2_Sub38) Static12.aClass246_2.method5606(); local4548 != null; local4548 = (Class2_Sub38) Static12.aClass246_2.method5614()) {
			if (!local4548.method5618()) {
				local4548 = (Class2_Sub38) Static12.aClass246_2.method5606();
				if (local4548 == null) {
					break;
				}
			}
			Static293.method5577(local4548, false, true);
		}
		Static234.anInt4158 = -1;
		Static12.aClass246_2 = new Class246(8);
		Static148.method2760();
		Static108.aClass4_26 = null;
		for (@Pc(4588) int local4588 = 0; local4588 < 8; local4588++) {
			Static292.aStringArray132[local4588] = null;
			Static2.aBooleanArray1[local4588] = false;
			Static176.anIntArray656[local4588] = -1;
		}
		Static165.method2923();
		Static67.aBoolean96 = true;
		for (@Pc(4616) int local4616 = 0; local4616 < 100; local4616++) {
			Static331.aBooleanArray30[local4616] = true;
		}
		Static19.anInt436 = 0;
		Static303.aString56 = null;
		Static372.aClass234Array1 = null;
		for (@Pc(4634) int local4634 = 0; local4634 < 6; local4634++) {
			Static61.aClass158Array1[local4634] = new Class158();
		}
		for (@Pc(4650) int local4650 = 0; local4650 < 25; local4650++) {
			Static267.anIntArray895[local4650] = 0;
			Static115.anIntArray476[local4650] = 0;
			Static214.anIntArray761[local4650] = 0;
		}
		Static181.method5324();
		Static66.aShortArray13 = Static205.aShortArray67 = Static15.aShortArray1 = Static198.aShortArray66 = new short[256];
		Static285.aBoolean378 = true;
		Static82.aString17 = Static297.aClass32_78.method701(Static107.anInt2498);
		Static389.aBoolean472 = false;
		Static48.anInt968 = 0;
		Static202.method3430();
		Static169.method2967();
		Static160.aClass2_Sub21_1 = null;
		Static29.aClass171_10.anInt4076 = 2;
		Static125.aLong95 = 0L;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!du;Lclient!vc;I)I")
	public static int method551(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class63 arg1) {
		if (arg0.anInt1283 != -1) {
			return arg0.anInt1283;
		}
		if (arg0.anInt1288 != -1) {
			@Pc(24) Class132 local24 = arg1.anInterface9_3.method139(arg1.method2032() ? arg0.anInt1288 : arg0.anInt1289);
			if (!local24.aBoolean255) {
				return local24.aShort52;
			}
		}
		return arg0.anInt1294;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IZII)I")
	public static int method553(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg2) {
			return arg0;
		}
		@Pc(13) int local13 = 128 - arg1;
		@Pc(27) int local27 = (arg2 & 0x7F) * arg1 + (arg0 & 0x7F) * local13 >> 7;
		@Pc(47) int local47 = (arg0 & 0x380) * local13 + (arg2 & 0x380) * arg1 >> 7;
		@Pc(62) int local62 = local13 * (arg0 & 0xFC00) + (arg2 & 0xFC00) * arg1 >> 7;
		return local62 & 0xFC00 | local47 & 0x380 | local27 & 0x7F;
	}
}
