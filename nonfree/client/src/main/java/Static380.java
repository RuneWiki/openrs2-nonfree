import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!nn", name = "F", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_76 = new Class185(23, 2);

	@OriginalMember(owner = "client!nn", name = "G", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject15 = null;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method6021(@OriginalArg(1) Class5 arg0) {
		if (Static199.aBoolean358) {
			Static214.method3812(arg0);
		} else {
			Static171.method3230(arg0);
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BLclient!fha;)V")
	public static void method6022(@OriginalArg(1) Class101 arg0) {
		@Pc(12) int local12;
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(135) int local135;
		@Pc(188) int local188;
		@Pc(52) int local52;
		@Pc(64) int local64;
		@Pc(159) int local159;
		if (arg0 == Static4.aClass101_1) {
			local12 = Static84.aClass6_Sub8_Sub1_1.method8253();
			local21 = Static106.anInt5768 + (local12 >> 4 & 0x7);
			local27 = Static573.anInt9802 + (local12 & 0x7);
			local31 = Static84.aClass6_Sub8_Sub1_1.method8253();
			local35 = Static84.aClass6_Sub8_Sub1_1.method8245();
			@Pc(40) Class356 local40 = Static249.aClass310_1.method7474(local35);
			local44 = Static84.aClass6_Sub8_Sub1_1.method8253();
			local48 = local44 >> 2;
			local52 = Static379.anIntArray341[local48];
			if (local48 == 11) {
				local48 = 10;
			}
			local59 = 0;
			if (local40.aByteArray104 != null) {
				local64 = -1;
				for (local66 = 0; local66 < local40.aByteArray104.length; local66++) {
					if (local40.aByteArray104[local66] == local48) {
						local64 = local66;
						break;
					}
				}
				local59 = local40.anIntArrayArray63[local64].length;
			}
			local64 = 0;
			if (local40.aShortArray177 != null) {
				local64 = local40.aShortArray177.length;
			}
			local66 = 0;
			if (local40.aShortArray178 != null) {
				local66 = local40.aShortArray178.length;
			}
			if ((local31 & 0x1) == 1) {
				Static291.method5009(local27, local52, (Class200) null, local21, Static374.anInt9757);
			} else {
				@Pc(123) int[] local123 = null;
				if ((local31 & 0x2) == 2) {
					local123 = new int[local59];
					for (local135 = 0; local135 < local59; local135++) {
						local123[local135] = Static84.aClass6_Sub8_Sub1_1.method8220();
					}
				}
				@Pc(149) short[] local149 = null;
				if ((local31 & 0x4) == 4) {
					local149 = new short[local64];
					for (local159 = 0; local159 < local64; local159++) {
						local149[local159] = (short) Static84.aClass6_Sub8_Sub1_1.method8220();
					}
				}
				@Pc(178) short[] local178 = null;
				if ((local31 & 0x8) == 8) {
					local178 = new short[local66];
					for (local188 = 0; local188 < local66; local188++) {
						local178[local188] = (short) Static84.aClass6_Sub8_Sub1_1.method8220();
					}
				}
				Static291.method5009(local27, local52, new Class200((long) Static493.aLong236++, local123, local149, local178), local21, Static374.anInt9757);
			}
			return;
		}
		@Pc(260) int local260;
		if (arg0 == Static77.aClass101_14) {
			local12 = Static84.aClass6_Sub8_Sub1_1.method8246();
			local21 = Static106.anInt5768 + (local12 >> 4 & 0x7);
			local27 = Static573.anInt9802 + (local12 & 0x7);
			local31 = Static84.aClass6_Sub8_Sub1_1.method8220();
			if (local31 == 65535) {
				local31 = -1;
			}
			local35 = Static84.aClass6_Sub8_Sub1_1.method8246();
			local260 = local35 >> 4 & 0xF;
			local44 = local35 & 0x7;
			local48 = Static84.aClass6_Sub8_Sub1_1.method8246();
			local52 = Static84.aClass6_Sub8_Sub1_1.method8246();
			local59 = Static84.aClass6_Sub8_Sub1_1.method8220();
			if (local21 >= 0 && local27 >= 0 && Static306.anInt6176 > local21 && Static108.anInt2930 > local27) {
				local64 = local260 + 1;
				if (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anIntArray197[0] >= local21 - local64 && local21 + local64 >= Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anIntArray197[0] && local27 - local64 <= Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anIntArray198[0] && Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anIntArray198[0] <= local27 + local64) {
					Static632.method8624(local52, local59, local31, local44, local48, (local27 << 8) + (local21 << 16) + (Static374.anInt9757 << 24) + local260);
				}
			}
		} else if (Static270.aClass101_13 == arg0) {
			local12 = Static84.aClass6_Sub8_Sub1_1.method8243();
			local21 = local12 >> 2;
			local27 = local12 & 0x3;
			local31 = Static379.anIntArray341[local21];
			local35 = Static84.aClass6_Sub8_Sub1_1.method8247();
			local260 = Static106.anInt5768 + (local35 >> 4 & 0x7);
			local44 = Static573.anInt9802 + (local35 & 0x7);
			if (Static542.method7645(Static643.anInt10750) || local260 >= 0 && local44 >= 0 && Static306.anInt6176 > local260 && local44 < Static108.anInt2930) {
				Static142.method2806(local260, local21, local44, local31, -1, local27, Static374.anInt9757);
			}
		} else {
			@Pc(504) int local504;
			if (Static72.aClass101_5 == arg0) {
				local12 = Static84.aClass6_Sub8_Sub1_1.method8246();
				local21 = Static106.anInt5768 * 2 + (local12 >> 4 & 0xF);
				local27 = (local12 & 0xF) + Static573.anInt9802 * 2;
				local31 = Static84.aClass6_Sub8_Sub1_1.method8246();
				@Pc(459) boolean local459 = (local31 & 0x1) != 0;
				@Pc(467) boolean local467 = (local31 & 0x2) != 0;
				local44 = local467 ? local31 >> 2 : -1;
				local48 = local21 + Static84.aClass6_Sub8_Sub1_1.method8208();
				local52 = Static84.aClass6_Sub8_Sub1_1.method8208() + local27;
				local59 = Static84.aClass6_Sub8_Sub1_1.method8231();
				local64 = Static84.aClass6_Sub8_Sub1_1.method8231();
				local66 = Static84.aClass6_Sub8_Sub1_1.method8220();
				local504 = Static84.aClass6_Sub8_Sub1_1.method8246();
				if (local467) {
					local504 = (byte) local504;
				} else {
					local504 *= 4;
				}
				local135 = Static84.aClass6_Sub8_Sub1_1.method8246() * 4;
				local159 = Static84.aClass6_Sub8_Sub1_1.method8220();
				local188 = Static84.aClass6_Sub8_Sub1_1.method8220();
				@Pc(533) int local533 = Static84.aClass6_Sub8_Sub1_1.method8246();
				@Pc(537) int local537 = Static84.aClass6_Sub8_Sub1_1.method8220();
				if (local533 == 255) {
					local533 = -1;
				}
				if (local21 >= 0 && local27 >= 0 && local21 < Static306.anInt6176 * 2 && local27 < Static306.anInt6176 * 2 && local48 >= 0 && local52 >= 0 && Static108.anInt2930 * 2 > local48 && Static108.anInt2930 * 2 > local52 && local66 != 65535) {
					local27 = local27 * 256;
					local135 <<= 0x2;
					local537 <<= 0x2;
					local504 <<= 0x2;
					local21 = local21 * 256;
					local52 = local52 * 256;
					local48 *= 256;
					if (local59 != 0 && local44 != -1) {
						@Pc(625) Class9_Sub4_Sub2_Sub1 local625 = null;
						@Pc(634) int local634;
						if (local59 >= 0) {
							local634 = local59 - 1;
							@Pc(641) Class6_Sub42 local641 = (Class6_Sub42) Static461.aClass380_35.method8747((long) local634);
							if (local641 != null) {
								local625 = local641.aClass9_Sub4_Sub2_Sub1_Sub1_1;
							}
						} else {
							local634 = -local59 - 1;
							if (local634 == Static238.anInt5268) {
								local625 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1;
							} else {
								local625 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local634];
							}
						}
						if (local625 != null) {
							@Pc(672) Class303 local672 = local625.method3625();
							if (local672.anIntArrayArray47 != null && local672.anIntArrayArray47[local44] != null) {
								local504 -= local672.anIntArrayArray47[local44][1];
							}
							if (local672.anIntArrayArray46 != null && local672.anIntArrayArray46[local44] != null) {
								local504 -= local672.anIntArrayArray46[local44][1];
							}
						}
					}
					@Pc(730) Class9_Sub4_Sub2_Sub4 local730 = new Class9_Sub4_Sub2_Sub4(local66, Static374.anInt9757, Static374.anInt9757, local21, local27, local504, local159 + Static384.anInt7234, local188 - -Static384.anInt7234, local533, local537, local59, local64, local135, local459, local44);
					local730.method7224(local48, Static150.method2982(Static374.anInt9757, local52, local48) - local135, Static384.anInt7234 + local159, local52);
					Static493.aClass163_51.method4967(new Class6_Sub5_Sub6(local730));
				}
			} else if (Static429.aClass101_15 == arg0) {
				local12 = Static84.aClass6_Sub8_Sub1_1.method8246();
				@Pc(776) boolean local776 = (local12 & 0x80) != 0;
				local27 = Static106.anInt5768 + (local12 >> 3 & 0x7);
				local31 = (local12 & 0x7) + Static573.anInt9802;
				local35 = local27 + Static84.aClass6_Sub8_Sub1_1.method8208();
				local260 = local31 + Static84.aClass6_Sub8_Sub1_1.method8208();
				local44 = Static84.aClass6_Sub8_Sub1_1.method8231();
				local48 = Static84.aClass6_Sub8_Sub1_1.method8220();
				local52 = Static84.aClass6_Sub8_Sub1_1.method8246() * 4;
				local59 = Static84.aClass6_Sub8_Sub1_1.method8246() * 4;
				local64 = Static84.aClass6_Sub8_Sub1_1.method8220();
				local66 = Static84.aClass6_Sub8_Sub1_1.method8220();
				local504 = Static84.aClass6_Sub8_Sub1_1.method8246();
				local135 = Static84.aClass6_Sub8_Sub1_1.method8220();
				if (local504 == 255) {
					local504 = -1;
				}
				if (local27 >= 0 && local31 >= 0 && Static306.anInt6176 > local27 && Static108.anInt2930 > local31 && local35 >= 0 && local260 >= 0 && local35 < Static306.anInt6176 && local260 < Static108.anInt2930 && local48 != 65535) {
					local59 <<= 0x2;
					local27 = local27 * 512 + 256;
					local52 <<= 0x2;
					local31 = local31 * 512 + 256;
					local35 = local35 * 512 + 256;
					local260 = local260 * 512 + 256;
					local135 <<= 0x2;
					@Pc(941) Class9_Sub4_Sub2_Sub4 local941 = new Class9_Sub4_Sub2_Sub4(local48, Static374.anInt9757, Static374.anInt9757, local27, local31, local52, local64 + Static384.anInt7234, local66 - -Static384.anInt7234, local504, local135, 0, local44, local59, local776, -1);
					local941.method7224(local35, Static150.method2982(Static374.anInt9757, local260, local35) - local59, local64 - -Static384.anInt7234, local260);
					Static493.aClass163_51.method4967(new Class6_Sub5_Sub6(local941));
				}
			} else if (arg0 == Static531.aClass101_16) {
				local12 = Static84.aClass6_Sub8_Sub1_1.method8246();
				local21 = Static573.anInt9802 + (local12 & 0x7);
				local27 = Static227.anInt5049 + local21;
				local31 = (local12 >> 4 & 0x7) + Static106.anInt5768;
				local35 = local31 + Static477.anInt8412;
				local260 = Static84.aClass6_Sub8_Sub1_1.method8220();
				local44 = Static84.aClass6_Sub8_Sub1_1.method8220();
				local48 = Static84.aClass6_Sub8_Sub1_1.method8220();
				if (Static283.aClass380_37 != null) {
					@Pc(1031) Class6_Sub47 local1031 = (Class6_Sub47) Static283.aClass380_37.method8747((long) (local35 | local27 << 14 | Static374.anInt9757 << 28));
					if (local1031 != null) {
						for (@Pc(1039) Class6_Sub32 local1039 = (Class6_Sub32) local1031.aClass163_56.method4966(); local1039 != null; local1039 = (Class6_Sub32) local1031.aClass163_56.method4965()) {
							if ((local260 & 0x7FFF) == local1039.anInt5945 && local1039.anInt5947 == local44) {
								local1039.method8792();
								local1039.anInt5947 = local48;
								Static193.method2214(local1039, Static374.anInt9757, local27, local35);
								break;
							}
						}
						if (local31 >= 0 && local21 >= 0 && local31 < Static306.anInt6176 && local21 < Static108.anInt2930) {
							Static367.method7655(local31, Static374.anInt9757, local21);
						}
					}
				}
			} else if (arg0 == Static151.aClass101_10) {
				Static84.aClass6_Sub8_Sub1_1.method8246();
				local12 = Static84.aClass6_Sub8_Sub1_1.method8246();
				local21 = (local12 >> 4 & 0x7) + Static106.anInt5768;
				local27 = (local12 & 0x7) + Static573.anInt9802;
				local31 = Static84.aClass6_Sub8_Sub1_1.method8220();
				local35 = Static84.aClass6_Sub8_Sub1_1.method8246();
				local260 = Static84.aClass6_Sub8_Sub1_1.method8203();
				@Pc(1140) String local1140 = Static84.aClass6_Sub8_Sub1_1.method8221();
				Static562.method7923(local260, local27, local31, local1140, local35, Static374.anInt9757, local21);
			} else if (Static10.aClass101_4 == arg0) {
				local12 = Static84.aClass6_Sub8_Sub1_1.method8237();
				local21 = Static84.aClass6_Sub8_Sub1_1.method8247();
				local27 = (local21 & 0x7) + Static573.anInt9802;
				local31 = Static227.anInt5049 + local27;
				local35 = Static106.anInt5768 + (local21 >> 4 & 0x7);
				local260 = Static477.anInt8412 + local35;
				local44 = Static84.aClass6_Sub8_Sub1_1.method8237();
				@Pc(1215) boolean local1215 = local35 >= 0 && local27 >= 0 && local35 < Static306.anInt6176 && Static108.anInt2930 > local27;
				if (local1215 || Static542.method7645(Static643.anInt10750)) {
					Static193.method2214(new Class6_Sub32(local12, local44), Static374.anInt9757, local31, local260);
					if (local1215) {
						Static367.method7655(local35, Static374.anInt9757, local27);
					}
				}
			} else if (arg0 == Static149.aClass101_9) {
				local12 = Static84.aClass6_Sub8_Sub1_1.method8247();
				local21 = Static106.anInt5768 + (local12 >> 4 & 0x7);
				local27 = Static573.anInt9802 + (local12 & 0x7);
				local31 = Static84.aClass6_Sub8_Sub1_1.method8237();
				if (local31 == 65535) {
					local31 = -1;
				}
				local35 = Static84.aClass6_Sub8_Sub1_1.method8253();
				local260 = local35 >> 2;
				local44 = local35 & 0x3;
				local48 = Static379.anIntArray341[local260];
				Static499.method7245(local260, local44, local21, local27, Static374.anInt9757, local31, local48);
			} else if (arg0 == Static547.aClass101_3) {
				local12 = Static84.aClass6_Sub8_Sub1_1.method8246();
				local21 = Static106.anInt5768 + (local12 >> 4 & 0x7);
				local27 = (local12 & 0x7) + Static573.anInt9802;
				local31 = Static84.aClass6_Sub8_Sub1_1.method8220();
				if (local31 == 65535) {
					local31 = -1;
				}
				local35 = Static84.aClass6_Sub8_Sub1_1.method8246();
				local260 = local35 >> 4 & 0xF;
				local44 = local35 & 0x7;
				local48 = Static84.aClass6_Sub8_Sub1_1.method8246();
				local52 = Static84.aClass6_Sub8_Sub1_1.method8246();
				local59 = Static84.aClass6_Sub8_Sub1_1.method8220();
				if (local21 >= 0 && local27 >= 0 && Static306.anInt6176 > local21 && Static108.anInt2930 > local27) {
					local64 = local260 + 1;
					if (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anIntArray197[0] >= local21 - local64 && Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anIntArray197[0] <= local64 + local21 && local27 - local64 <= Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anIntArray198[0] && Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anIntArray198[0] <= local64 + local27) {
						Static159.method3113(local59, local48, local44, local52, (local21 << 16) + (Static374.anInt9757 << 24) + (local27 << 8) + local260, local31);
					}
				}
			} else if (arg0 == Static251.aClass101_11) {
				local12 = Static84.aClass6_Sub8_Sub1_1.method8247();
				local21 = (local12 & 0x7) + Static573.anInt9802;
				local27 = Static227.anInt5049 + local21;
				local31 = Static106.anInt5768 + (local12 >> 4 & 0x7);
				local35 = local31 + Static477.anInt8412;
				local260 = Static84.aClass6_Sub8_Sub1_1.method8229();
				@Pc(1499) Class6_Sub47 local1499 = (Class6_Sub47) Static283.aClass380_37.method8747((long) (local35 | local27 << 14 | Static374.anInt9757 << 28));
				if (local1499 != null) {
					for (@Pc(1507) Class6_Sub32 local1507 = (Class6_Sub32) local1499.aClass163_56.method4966(); local1507 != null; local1507 = (Class6_Sub32) local1499.aClass163_56.method4965()) {
						if (local1507.anInt5945 == (local260 & 0x7FFF)) {
							local1507.method8792();
							break;
						}
					}
					if (local1499.aClass163_56.method4968()) {
						local1499.method8792();
					}
					if (local31 >= 0 && local21 >= 0 && local31 < Static306.anInt6176 && local21 < Static108.anInt2930) {
						Static367.method7655(local31, Static374.anInt9757, local21);
					}
				}
			} else if (arg0 == Static118.aClass101_7) {
				local12 = Static84.aClass6_Sub8_Sub1_1.method8243();
				local21 = Static106.anInt5768 + (local12 >> 4 & 0x7);
				local27 = Static573.anInt9802 + (local12 & 0x7);
				local31 = Static84.aClass6_Sub8_Sub1_1.method8245();
				local35 = Static84.aClass6_Sub8_Sub1_1.method8246();
				local260 = local35 >> 2;
				local44 = local35 & 0x3;
				local48 = Static379.anIntArray341[local260];
				if (Static542.method7645(Static643.anInt10750) || local21 >= 0 && local27 >= 0 && Static306.anInt6176 > local21 && Static108.anInt2930 > local27) {
					Static142.method2806(local21, local260, local27, local48, local31, local44, Static374.anInt9757);
				}
			} else if (Static257.aClass101_12 == arg0) {
				local12 = Static84.aClass6_Sub8_Sub1_1.method8220();
				local21 = Static84.aClass6_Sub8_Sub1_1.method8246();
				Static249.aClass310_1.method7474(local12).method8323(local21);
			} else if (Static602.aClass101_17 == arg0) {
				local12 = Static84.aClass6_Sub8_Sub1_1.method8237();
				local21 = Static84.aClass6_Sub8_Sub1_1.method8229();
				local27 = Static84.aClass6_Sub8_Sub1_1.method8220();
				local31 = Static84.aClass6_Sub8_Sub1_1.method8243();
				local35 = Static573.anInt9802 + (local31 & 0x7);
				local260 = local35 + Static227.anInt5049;
				local44 = (local31 >> 4 & 0x7) + Static106.anInt5768;
				local48 = Static477.anInt8412 + local44;
				if (Static238.anInt5268 != local27) {
					@Pc(1727) boolean local1727 = local44 >= 0 && local35 >= 0 && local44 < Static306.anInt6176 && Static108.anInt2930 > local35;
					if (local1727 || Static542.method7645(Static643.anInt10750)) {
						Static193.method2214(new Class6_Sub32(local12, local21), Static374.anInt9757, local260, local48);
						if (local1727) {
							Static367.method7655(local44, Static374.anInt9757, local35);
						}
					}
				}
			} else if (arg0 == Static122.aClass101_8) {
				local12 = Static84.aClass6_Sub8_Sub1_1.method8246();
				local21 = (local12 >> 4 & 0x7) + Static106.anInt5768;
				local27 = Static573.anInt9802 + (local12 & 0x7);
				local31 = Static84.aClass6_Sub8_Sub1_1.method8220();
				local35 = Static84.aClass6_Sub8_Sub1_1.method8246();
				local260 = Static84.aClass6_Sub8_Sub1_1.method8220();
				local44 = Static84.aClass6_Sub8_Sub1_1.method8246();
				if (local21 >= 0 && local27 >= 0 && Static306.anInt6176 > local21 && Static108.anInt2930 > local27) {
					local48 = local21 * 512 + 256;
					local52 = local27 * 512 + 256;
					local59 = Static374.anInt9757;
					if (local59 < 3 && Static3.method52(local27, local21)) {
						local59++;
					}
					@Pc(1849) Class9_Sub4_Sub2_Sub3 local1849 = new Class9_Sub4_Sub2_Sub3(local31, local260, Static384.anInt7234, Static374.anInt9757, local59, local48, Static150.method2982(Static374.anInt9757, local52, local48) - local35, local52, local21, local21, local27, local27, local44);
					Static158.aClass163_20.method4967(new Class6_Sub5_Sub4(local1849));
				}
			} else {
				Static358.method5809((Throwable) null, "T3 - " + arg0);
				Static5.method440(false);
			}
		}
	}
}
