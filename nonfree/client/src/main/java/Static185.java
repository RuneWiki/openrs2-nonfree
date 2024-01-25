import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)Z")
	public static boolean method3003() throws IOException {
		if (Static485.aClass43_1 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static284.aClass83_193 == null) {
			if (Static259.aBoolean361) {
				if (!Static485.aClass43_1.method1049(1)) {
					return false;
				}
				Static485.aClass43_1.method1048(1, 0, Static158.aClass1_Sub3_Sub1_2.aByteArray104);
				Static122.anInt2507++;
				Static101.anInt1769 = 0;
				Static259.aBoolean361 = false;
			}
			Static158.aClass1_Sub3_Sub1_2.anInt9802 = 0;
			if (Static158.aClass1_Sub3_Sub1_2.method4989()) {
				if (!Static485.aClass43_1.method1049(1)) {
					return false;
				}
				Static485.aClass43_1.method1048(1, 1, Static158.aClass1_Sub3_Sub1_2.aByteArray104);
				Static122.anInt2507++;
				Static101.anInt1769 = 0;
			}
			Static259.aBoolean361 = true;
			@Pc(69) Class83[] local69 = Static318.method4728();
			local73 = Static158.aClass1_Sub3_Sub1_2.method4993();
			if (local73 < 0 || local73 >= local69.length) {
				throw new IOException("invo:" + local73 + " ip:" + Static158.aClass1_Sub3_Sub1_2.anInt9802);
			}
			Static284.aClass83_193 = local69[local73];
			Static464.anInt8696 = Static284.aClass83_193.anInt2514;
		}
		if (Static464.anInt8696 == -1) {
			if (!Static485.aClass43_1.method1049(1)) {
				return false;
			}
			Static485.aClass43_1.method1048(1, 0, Static158.aClass1_Sub3_Sub1_2.aByteArray104);
			Static464.anInt8696 = Static158.aClass1_Sub3_Sub1_2.aByteArray104[0] & 0xFF;
			Static122.anInt2507++;
			Static101.anInt1769 = 0;
		}
		if (Static464.anInt8696 == -2) {
			if (!Static485.aClass43_1.method1049(2)) {
				return false;
			}
			Static485.aClass43_1.method1048(2, 0, Static158.aClass1_Sub3_Sub1_2.aByteArray104);
			Static158.aClass1_Sub3_Sub1_2.anInt9802 = 0;
			Static464.anInt8696 = Static158.aClass1_Sub3_Sub1_2.method7945();
			Static122.anInt2507 += 2;
			Static101.anInt1769 = 0;
		}
		if (Static464.anInt8696 > 0) {
			if (!Static485.aClass43_1.method1049(Static464.anInt8696)) {
				return false;
			}
			Static158.aClass1_Sub3_Sub1_2.anInt9802 = 0;
			Static485.aClass43_1.method1048(Static464.anInt8696, 0, Static158.aClass1_Sub3_Sub1_2.aByteArray104);
			Static122.anInt2507 += Static464.anInt8696;
			Static101.anInt1769 = 0;
		}
		Static365.aClass83_141 = Static169.aClass83_74;
		Static169.aClass83_74 = Static403.aClass83_147;
		Static403.aClass83_147 = Static284.aClass83_193;
		@Pc(208) int local208;
		@Pc(221) boolean local221;
		if (Static284.aClass83_193 == Static2.aClass83_2) {
			local208 = Static158.aClass1_Sub3_Sub1_2.method7938();
			local73 = Static158.aClass1_Sub3_Sub1_2.method7945();
			local221 = (local208 & 0x1) == 1;
			Static517.method7177(local221, local73);
			Static125.anIntArray98[Static188.anInt3737++ & 0x1F] = local73;
			Static284.aClass83_193 = null;
			return true;
		}
		@Pc(254) int local254;
		@Pc(258) int local258;
		@Pc(895) int local895;
		@Pc(606) int local606;
		@Pc(465) int local465;
		@Pc(351) int local351;
		@Pc(262) int local262;
		@Pc(285) int local285;
		@Pc(889) int local889;
		@Pc(598) boolean local598;
		@Pc(314) int local314;
		@Pc(641) int local641;
		@Pc(273) boolean local273;
		if (Static284.aClass83_193 == Static84.aClass83_44) {
			local208 = Static158.aClass1_Sub3_Sub1_2.method7931();
			local73 = Static158.aClass1_Sub3_Sub1_2.method7958();
			local254 = Static158.aClass1_Sub3_Sub1_2.method7945();
			local258 = Static158.aClass1_Sub3_Sub1_2.method7946();
			local262 = Static158.aClass1_Sub3_Sub1_2.method7946();
			local273 = (local208 & 0x80) != 0;
			if (local73 >> 30 == 0) {
				@Pc(334) Class134 local334;
				@Pc(348) Class197 local348;
				@Pc(395) Class197 local395;
				if (local73 >> 29 != 0) {
					local285 = local73 & 0xFFFF;
					@Pc(292) Class1_Sub33 local292 = (Class1_Sub33) Static372.aClass91_30.method2271((long) local285);
					if (local292 != null) {
						if (local258 == 65535) {
							local258 = -1;
						}
						@Pc(304) Class11_Sub1_Sub1_Sub3_Sub2 local304 = local292.aClass11_Sub1_Sub1_Sub3_Sub2_2;
						@Pc(306) boolean local306 = true;
						local314 = local273 ? local304.anInt7570 : local304.anInt7547;
						if (local258 != -1 && local314 != -1) {
							if (local258 == local314) {
								local334 = Static583.aClass256_2.method5466(local258);
								if (local334.aBoolean272 && local334.anInt3775 != -1) {
									local348 = Static223.aClass245_1.method5312(local334.anInt3775);
									local351 = local348.anInt5072;
									if (local351 == 0 || local351 == 2) {
										local306 = false;
									} else if (local351 == 1) {
										local306 = true;
									}
								}
							} else {
								local334 = Static583.aClass256_2.method5466(local258);
								@Pc(381) Class134 local381 = Static583.aClass256_2.method5466(local314);
								if (local334.anInt3775 != -1 && local381.anInt3775 != -1) {
									local395 = Static223.aClass245_1.method5312(local334.anInt3775);
									@Pc(401) Class197 local401 = Static223.aClass245_1.method5312(local381.anInt3775);
									if (local395.anInt5076 < local401.anInt5076) {
										local306 = false;
									}
								}
							}
						}
						if (local306) {
							if (local273) {
								local304.anInt7570 = local258;
								local304.anInt7585 = local262 + Static518.anInt9331;
								local304.anInt7553 = local254;
								local304.anInt7533 = 1;
								local304.anInt7600 = 0;
								local304.anInt7592 = 0;
								local304.anInt7535 = local208 & 0x7;
								if (Static518.anInt9331 < local304.anInt7585) {
									local304.anInt7600 = -1;
								}
								if (local304.anInt7570 != -1 && local304.anInt7585 == Static518.anInt9331) {
									local465 = Static583.aClass256_2.method5466(local304.anInt7570).anInt3775;
									if (local465 != -1) {
										local348 = Static223.aClass245_1.method5312(local465);
										if (local348 != null && local348.anIntArray284 != null && !local304.aBoolean577) {
											Static473.method6515(local304, local348, 0);
										}
									}
								}
							} else {
								local304.anInt7574 = 0;
								local304.anInt7575 = 0;
								local304.anInt7588 = local208 & 0x7;
								local304.anInt7544 = 1;
								local304.anInt7560 = local254;
								local304.anInt7547 = local258;
								local304.anInt7566 = Static518.anInt9331 + local262;
								if (Static518.anInt9331 < local304.anInt7566) {
									local304.anInt7575 = -1;
								}
								if (local304.anInt7547 != -1 && Static518.anInt9331 == local304.anInt7566) {
									local465 = Static583.aClass256_2.method5466(local304.anInt7547).anInt3775;
									if (local465 != -1) {
										local348 = Static223.aClass245_1.method5312(local465);
										if (local348 != null && local348.anIntArray284 != null && !local304.aBoolean577) {
											Static473.method6515(local304, local348, 0);
										}
									}
								}
							}
						}
					}
				} else if (local73 >> 28 != 0) {
					local285 = local73 & 0xFFFF;
					@Pc(585) Class11_Sub1_Sub1_Sub3_Sub1 local585;
					if (Static310.anInt5693 == local285) {
						local585 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2;
					} else {
						local585 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local285];
					}
					if (local585 != null) {
						if (local258 == 65535) {
							local258 = -1;
						}
						local598 = true;
						local606 = local273 ? local585.anInt7570 : local585.anInt7547;
						@Pc(638) Class197 local638;
						if (local258 != -1 && local606 != -1) {
							@Pc(624) Class134 local624;
							if (local606 == local258) {
								local624 = Static583.aClass256_2.method5466(local258);
								if (local624.aBoolean272 && local624.anInt3775 != -1) {
									local638 = Static223.aClass245_1.method5312(local624.anInt3775);
									local641 = local638.anInt5072;
									if (local641 == 0 || local641 == 2) {
										local598 = false;
									} else if (local641 == 1) {
										local598 = true;
									}
								}
							} else {
								local624 = Static583.aClass256_2.method5466(local258);
								local334 = Static583.aClass256_2.method5466(local606);
								if (local624.anInt3775 != -1 && local334.anInt3775 != -1) {
									local348 = Static223.aClass245_1.method5312(local624.anInt3775);
									local395 = Static223.aClass245_1.method5312(local334.anInt3775);
									if (local348.anInt5076 < local395.anInt5076) {
										local598 = false;
									}
								}
							}
						}
						if (local598) {
							if (local273) {
								local585.anInt7585 = Static518.anInt9331 + local262;
								local585.anInt7600 = 0;
								local585.anInt7535 = local208 & 0x7;
								local585.anInt7570 = local258;
								local585.anInt7553 = local254;
								local585.anInt7533 = 1;
								local585.anInt7592 = 0;
								if (local585.anInt7570 == 65535) {
									local585.anInt7570 = -1;
								}
								if (local585.anInt7585 > Static518.anInt9331) {
									local585.anInt7600 = -1;
								}
								if (local585.anInt7570 != -1 && Static518.anInt9331 == local585.anInt7585) {
									local314 = Static583.aClass256_2.method5466(local585.anInt7570).anInt3775;
									if (local314 != -1) {
										local638 = Static223.aClass245_1.method5312(local314);
										if (local638 != null && local638.anIntArray284 != null && !local585.aBoolean577) {
											Static473.method6515(local585, local638, 0);
										}
									}
								}
							} else {
								local585.anInt7547 = local258;
								local585.anInt7560 = local254;
								local585.anInt7575 = 0;
								local585.anInt7566 = Static518.anInt9331 + local262;
								local585.anInt7544 = 1;
								local585.anInt7588 = local208 & 0x7;
								local585.anInt7574 = 0;
								if (local585.anInt7547 == 65535) {
									local585.anInt7547 = -1;
								}
								if (local585.anInt7566 > Static518.anInt9331) {
									local585.anInt7575 = -1;
								}
								if (local585.anInt7547 != -1 && local585.anInt7566 == Static518.anInt9331) {
									local314 = Static583.aClass256_2.method5466(local585.anInt7547).anInt3775;
									if (local314 != -1) {
										local638 = Static223.aClass245_1.method5312(local314);
										if (local638 != null && local638.anIntArray284 != null && !local585.aBoolean577) {
											Static473.method6515(local585, local638, 0);
										}
									}
								}
							}
						}
					}
				}
			} else {
				local285 = local73 >> 28 & 0x3;
				local889 = (local73 >> 14 & 0x3FFF) - Static539.anInt9045;
				local895 = (local73 & 0x3FFF) - Static311.anInt5708;
				if (local889 >= 0 && local895 >= 0 && Static458.anInt9736 > local889 && local895 < Static378.anInt6747) {
					local606 = local889 * 512 + 256;
					local314 = local895 * 512 + 256;
					local465 = local285;
					if (local285 < 3 && Static34.method641(local889, local895)) {
						local465 = local285 + 1;
					}
					@Pc(965) Class11_Sub1_Sub1_Sub1 local965 = new Class11_Sub1_Sub1_Sub1(local258, 0, Static518.anInt9331, local285, local465, local606, Static538.method6114(local285, local314, local606) - local254, local314, local889, local889, local895, local895, local208 & 0x7);
					Static297.aClass111_25.method2552(new Class1_Sub8_Sub5(local965));
				}
			}
			Static284.aClass83_193 = null;
			return true;
		} else if (Static284.aClass83_193 == Static281.aClass83_102) {
			Static457.anInt7992 = Static158.aClass1_Sub3_Sub1_2.method7975();
			Static303.anInt5647 = Static259.anInt4739;
			Static284.aClass83_193 = null;
			return true;
		} else if (Static284.aClass83_193 == Static51.aClass83_34) {
			Static383.aString80 = Static464.anInt8696 <= 2 ? Static375.aClass253_30.method5453(Static161.anInt3095) : Static158.aClass1_Sub3_Sub1_2.method7951();
			Static358.anInt9364 = Static464.anInt8696 <= 0 ? -1 : Static158.aClass1_Sub3_Sub1_2.method7945();
			if (Static358.anInt9364 == 65535) {
				Static358.anInt9364 = -1;
			}
			Static284.aClass83_193 = null;
			return true;
		} else if (Static312.aClass83_114 == Static284.aClass83_193) {
			local208 = Static158.aClass1_Sub3_Sub1_2.method7945();
			local73 = Static158.aClass1_Sub3_Sub1_2.method7915();
			Static390.aClass353_29.method7622(local208, local73);
			Static284.aClass83_193 = null;
			return true;
		} else if (Static160.aClass83_71 == Static284.aClass83_193) {
			local208 = Static158.aClass1_Sub3_Sub1_2.method7946();
			local73 = Static158.aClass1_Sub3_Sub1_2.method7916();
			local254 = Static158.aClass1_Sub3_Sub1_2.method7940();
			local258 = Static158.aClass1_Sub3_Sub1_2.method7946();
			local262 = Static158.aClass1_Sub3_Sub1_2.method7916();
			if (Static184.method2977(local208)) {
				Static406.method5823(local73, local262, local254, local258);
			}
			Static284.aClass83_193 = null;
			return true;
		} else {
			@Pc(1201) Class254 local1201;
			@Pc(1104) String local1104;
			@Pc(1197) String local1197;
			@Pc(1087) String local1087;
			if (Static264.aClass83_101 == Static284.aClass83_193) {
				local1087 = Static158.aClass1_Sub3_Sub1_2.method7951();
				local221 = Static158.aClass1_Sub3_Sub1_2.method7974() == 1;
				if (local221) {
					local1104 = Static158.aClass1_Sub3_Sub1_2.method7951();
				} else {
					local1104 = local1087;
				}
				local258 = Static158.aClass1_Sub3_Sub1_2.method7945();
				@Pc(1116) byte local1116 = Static158.aClass1_Sub3_Sub1_2.method7963();
				local273 = false;
				if (local1116 == -128) {
					local273 = true;
				}
				if (local273) {
					if (Static33.anInt723 == 0) {
						Static284.aClass83_193 = null;
						return true;
					}
					for (local285 = 0; local285 < Static33.anInt723 && (!Static272.aClass254Array1[local285].aString77.equals(local1104) || Static272.aClass254Array1[local285].anInt6737 != local258); local285++) {
					}
					if (Static33.anInt723 > local285) {
						while (local285 < Static33.anInt723 - 1) {
							Static272.aClass254Array1[local285] = Static272.aClass254Array1[local285 + 1];
							local285++;
						}
						Static33.anInt723--;
						Static272.aClass254Array1[Static33.anInt723] = null;
					}
				} else {
					local1197 = Static158.aClass1_Sub3_Sub1_2.method7951();
					local1201 = new Class254();
					local1201.aString76 = local1087;
					local1201.aString77 = local1104;
					local1201.aString79 = Static583.method7816(local1201.aString77);
					local1201.aString78 = local1197;
					local1201.aByte89 = local1116;
					local1201.anInt6737 = local258;
					for (local895 = Static33.anInt723 - 1; local895 >= 0; local895--) {
						local606 = Static272.aClass254Array1[local895].aString79.compareTo(local1201.aString79);
						if (local606 == 0) {
							Static272.aClass254Array1[local895].anInt6737 = local258;
							Static272.aClass254Array1[local895].aByte89 = local1116;
							Static272.aClass254Array1[local895].aString78 = local1197;
							if (local1104.equals(Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aString35)) {
								Static591.aByte130 = local1116;
							}
							Static284.aClass83_193 = null;
							Static364.anInt8302 = Static259.anInt4739;
							return true;
						}
						if (local606 < 0) {
							break;
						}
					}
					if (Static272.aClass254Array1.length <= Static33.anInt723) {
						Static284.aClass83_193 = null;
						return true;
					}
					for (local606 = Static33.anInt723 - 1; local606 > local895; local606--) {
						Static272.aClass254Array1[local606 + 1] = Static272.aClass254Array1[local606];
					}
					if (Static33.anInt723 == 0) {
						Static272.aClass254Array1 = new Class254[100];
					}
					Static272.aClass254Array1[local895 + 1] = local1201;
					Static33.anInt723++;
					if (local1104.equals(Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aString35)) {
						Static591.aByte130 = local1116;
					}
				}
				Static364.anInt8302 = Static259.anInt4739;
				Static284.aClass83_193 = null;
				return true;
			} else if (Static284.aClass83_193 == Static169.aClass83_73) {
				local208 = Static158.aClass1_Sub3_Sub1_2.method7945();
				local1104 = Static158.aClass1_Sub3_Sub1_2.method7951();
				@Pc(1354) Object[] local1354 = new Object[local1104.length() + 1];
				for (local258 = local1104.length() - 1; local258 >= 0; local258--) {
					if (local1104.charAt(local258) == 's') {
						local1354[local258 + 1] = Static158.aClass1_Sub3_Sub1_2.method7951();
					} else {
						local1354[local258 + 1] = Integer.valueOf(Static158.aClass1_Sub3_Sub1_2.method7940());
					}
				}
				local1354[0] = Integer.valueOf(Static158.aClass1_Sub3_Sub1_2.method7940());
				if (Static184.method2977(local208)) {
					@Pc(1412) Class1_Sub22 local1412 = new Class1_Sub22();
					local1412.anObjectArray1 = local1354;
					Static451.method6311(local1412);
				}
				Static284.aClass83_193 = null;
				return true;
			} else if (Static284.aClass83_193 == Static592.aClass83_211) {
				Static269.method3928(Static158.aClass1_Sub3_Sub1_2.method7951());
				Static284.aClass83_193 = null;
				return true;
			} else if (Static263.aClass83_100 == Static284.aClass83_193) {
				local208 = Static158.aClass1_Sub3_Sub1_2.method7916();
				local73 = Static158.aClass1_Sub3_Sub1_2.method7958();
				if (Static184.method2977(local208)) {
					Static441.method6228(0, Static310.anInt5693, local73, 5);
				}
				Static284.aClass83_193 = null;
				return true;
			} else if (Static197.aClass83_83 == Static284.aClass83_193) {
				Static256.method3744(Static149.aClass295_3);
				Static284.aClass83_193 = null;
				return true;
			} else if (Static426.aClass83_157 == Static284.aClass83_193) {
				Static256.method3744(Static355.aClass295_7);
				Static284.aClass83_193 = null;
				return true;
			} else if (Static284.aClass83_193 == Static32.aClass83_14) {
				Static256.method3744(Static593.aClass295_15);
				Static284.aClass83_193 = null;
				return true;
			} else if (Static284.aClass83_193 == Static213.aClass83_86) {
				Static542.anInt9093 = Static158.aClass1_Sub3_Sub1_2.method7974();
				Static59.anInt1128 = Static158.aClass1_Sub3_Sub1_2.method7931();
				Static284.aClass83_193 = null;
				return true;
			} else if (Static284.aClass83_193 == Static131.aClass83_56) {
				local208 = Static158.aClass1_Sub3_Sub1_2.method7945();
				if (Static184.method2977(local208)) {
					Static88.method1393();
				}
				Static284.aClass83_193 = null;
				return true;
			} else if (Static390.aClass83_205 == Static284.aClass83_193) {
				Static416.method5916(Static464.anInt8696, Static158.aClass1_Sub3_Sub1_2);
				Static284.aClass83_193 = null;
				return true;
			} else {
				@Pc(1563) int local1563;
				if (Static284.aClass83_193 == Static336.aClass83_129) {
					local208 = Static158.aClass1_Sub3_Sub1_2.method7916();
					if (local208 == 65535) {
						local208 = -1;
					}
					local73 = Static158.aClass1_Sub3_Sub1_2.method7974();
					local254 = local73 >> 2;
					local258 = local73 & 0x3;
					local262 = Static17.anIntArray20[local254];
					local1563 = Static158.aClass1_Sub3_Sub1_2.method7940();
					local285 = local1563 >> 28 & 0x3;
					local889 = local1563 >> 14 & 0x3FFF;
					local889 -= Static539.anInt9045;
					local895 = local1563 & 0x3FFF;
					local895 -= Static311.anInt5708;
					Static432.method6173(local895, local254, local262, local258, local285, local208, local889);
					Static284.aClass83_193 = null;
					return true;
				}
				@Pc(1612) boolean local1612;
				@Pc(1618) String local1618;
				@Pc(1628) long local1628;
				@Pc(1633) long local1633;
				@Pc(1638) long local1638;
				if (Static244.aClass83_130 == Static284.aClass83_193) {
					local1612 = Static158.aClass1_Sub3_Sub1_2.method7974() == 1;
					local1104 = Static158.aClass1_Sub3_Sub1_2.method7951();
					local1618 = local1104;
					if (local1612) {
						local1618 = Static158.aClass1_Sub3_Sub1_2.method7951();
					}
					local1628 = Static158.aClass1_Sub3_Sub1_2.method7949();
					local1633 = Static158.aClass1_Sub3_Sub1_2.method7945();
					local1638 = Static158.aClass1_Sub3_Sub1_2.method7919();
					local606 = Static158.aClass1_Sub3_Sub1_2.method7974();
					local314 = Static158.aClass1_Sub3_Sub1_2.method7945();
					@Pc(1652) long local1652 = local1638 + (local1633 << 32);
					@Pc(1654) boolean local1654 = false;
					@Pc(1656) int local1656 = 0;
					while (true) {
						if (local1656 >= 100) {
							if (local606 <= 1 && Static234.method3456(local1618)) {
								local1654 = true;
							}
							break;
						}
						if (local1652 == Static574.aLongArray16[local1656]) {
							local1654 = true;
							break;
						}
						local1656++;
					}
					if (!local1654 && Static406.anInt7247 == 0) {
						Static574.aLongArray16[Static154.anInt2917] = local1652;
						Static154.anInt2917 = (Static154.anInt2917 + 1) % 100;
						@Pc(1712) String local1712 = Static109.aClass211_1.method4599(local314).method7100(Static158.aClass1_Sub3_Sub1_2);
						if (local606 == 2) {
							Static489.method6727(local1712, "<img=1>" + local1618, 20, local1104, local314, Static387.method5586(local1628), "<img=1>" + local1104, 0);
						} else if (local606 == 1) {
							Static489.method6727(local1712, "<img=0>" + local1618, 20, local1104, local314, Static387.method5586(local1628), "<img=0>" + local1104, 0);
						} else {
							Static489.method6727(local1712, local1618, 20, local1104, local314, Static387.method5586(local1628), local1104, 0);
						}
					}
					Static284.aClass83_193 = null;
					return true;
				} else if (Static250.aClass83_95 == Static284.aClass83_193) {
					local208 = Static158.aClass1_Sub3_Sub1_2.method7916();
					local73 = Static158.aClass1_Sub3_Sub1_2.method7915();
					local254 = Static158.aClass1_Sub3_Sub1_2.method7946();
					if (Static184.method2977(local254)) {
						Static4.method7631(local208, local73);
					}
					Static284.aClass83_193 = null;
					return true;
				} else if (Static318.aClass83_117 == Static284.aClass83_193) {
					local208 = Static158.aClass1_Sub3_Sub1_2.method7938();
					local73 = Static158.aClass1_Sub3_Sub1_2.method7946();
					@Pc(1831) int[] local1831 = new int[4];
					for (local258 = 0; local258 < 4; local258++) {
						local1831[local258] = Static158.aClass1_Sub3_Sub1_2.method7946();
					}
					@Pc(1852) Class1_Sub33 local1852 = (Class1_Sub33) Static372.aClass91_30.method2271((long) local73);
					if (local1852 != null) {
						Static217.method3240(local1831, local1852.aClass11_Sub1_Sub1_Sub3_Sub2_2, local208);
					}
					Static284.aClass83_193 = null;
					return true;
				} else if (Static284.aClass83_193 == Static44.aClass83_25) {
					local208 = Static158.aClass1_Sub3_Sub1_2.method7940();
					local73 = Static158.aClass1_Sub3_Sub1_2.method7938();
					local254 = Static158.aClass1_Sub3_Sub1_2.method7938();
					Static504.anIntArray527[local254] = local208;
					Static586.anIntArray616[local254] = local73;
					Static163.anIntArray143[local254] = 1;
					local258 = Static520.anIntArray631[local254] - 1;
					for (local262 = 0; local262 < local258; local262++) {
						if (local208 >= Class196.anIntArray278[local262]) {
							Static163.anIntArray143[local254] = local262 + 2;
						}
					}
					Static154.anIntArray130[Static501.anInt8747++ & 0x1F] = local254;
					Static284.aClass83_193 = null;
					return true;
				} else {
					@Pc(1945) byte local1945;
					if (Static284.aClass83_193 == Static591.aClass83_210) {
						local208 = Static158.aClass1_Sub3_Sub1_2.method7967();
						local1945 = Static158.aClass1_Sub3_Sub1_2.method7927();
						local254 = Static158.aClass1_Sub3_Sub1_2.method7945();
						if (Static184.method2977(local254)) {
							Static4.method7631(local208, local1945);
						}
						Static284.aClass83_193 = null;
						return true;
					} else if (Static284.aClass83_193 == Static8.aClass83_123) {
						Static76.anInt6368 = Static158.aClass1_Sub3_Sub1_2.method7966();
						Static381.aBoolean523 = Static158.aClass1_Sub3_Sub1_2.method7974() == 1;
						Static284.aClass83_193 = null;
						return true;
					} else if (Static144.aClass83_63 == Static284.aClass83_193) {
						local208 = Static158.aClass1_Sub3_Sub1_2.method7946();
						local73 = Static158.aClass1_Sub3_Sub1_2.method7928();
						local254 = Static158.aClass1_Sub3_Sub1_2.method7967();
						if (local254 == 65535) {
							local254 = -1;
						}
						local258 = Static158.aClass1_Sub3_Sub1_2.method7940();
						if (Static184.method2977(local208)) {
							Static329.method4869(local73, local254, local258);
							@Pc(2021) Class222 local2021 = Static230.aClass225_1.method4857(local254);
							Static406.method5823(local2021.anInt5921, local2021.anInt5868, local258, local2021.anInt5901);
							Static311.method4643(local258, local2021.anInt5924, local2021.lb, local2021.anInt5893);
						}
						Static284.aClass83_193 = null;
						return true;
					} else if (Static473.aClass83_175 == Static284.aClass83_193) {
						Static256.method3744(Static509.aClass295_13);
						Static284.aClass83_193 = null;
						return true;
					} else if (Static284.aClass83_193 == Static470.aClass83_65) {
						local208 = Static158.aClass1_Sub3_Sub1_2.method7974();
						local73 = local208 >> 5;
						local254 = local208 & 0x1F;
						if (local254 == 0) {
							Static243.aClass358Array1[local73] = null;
							Static284.aClass83_193 = null;
							return true;
						}
						@Pc(2085) Class358 local2085 = new Class358();
						local2085.anInt9530 = local254;
						local2085.anInt9538 = Static158.aClass1_Sub3_Sub1_2.method7974();
						if (local2085.anInt9538 >= 0 && Static99.aClass5Array6.length > local2085.anInt9538) {
							if (local2085.anInt9530 == 1 || local2085.anInt9530 == 10) {
								local2085.anInt9537 = Static158.aClass1_Sub3_Sub1_2.method7945();
								Static158.aClass1_Sub3_Sub1_2.anInt9802 += 6;
							} else if (local2085.anInt9530 >= 2 && local2085.anInt9530 <= 6) {
								if (local2085.anInt9530 == 2) {
									local2085.anInt9534 = 256;
									local2085.anInt9532 = 256;
								}
								if (local2085.anInt9530 == 3) {
									local2085.anInt9534 = 0;
									local2085.anInt9532 = 256;
								}
								if (local2085.anInt9530 == 4) {
									local2085.anInt9532 = 256;
									local2085.anInt9534 = 512;
								}
								if (local2085.anInt9530 == 5) {
									local2085.anInt9532 = 0;
									local2085.anInt9534 = 256;
								}
								if (local2085.anInt9530 == 6) {
									local2085.anInt9532 = 512;
									local2085.anInt9534 = 256;
								}
								local2085.anInt9530 = 2;
								local2085.anInt9539 = Static158.aClass1_Sub3_Sub1_2.method7974();
								local2085.anInt9534 += Static158.aClass1_Sub3_Sub1_2.method7945() - Static539.anInt9045 << 9;
								local2085.anInt9532 += Static158.aClass1_Sub3_Sub1_2.method7945() - Static311.anInt5708 << 9;
								local2085.anInt9531 = Static158.aClass1_Sub3_Sub1_2.method7974() << 2;
								local2085.anInt9540 = Static158.aClass1_Sub3_Sub1_2.method7945();
							}
							local2085.anInt9533 = Static158.aClass1_Sub3_Sub1_2.method7945();
							if (local2085.anInt9533 == 65535) {
								local2085.anInt9533 = -1;
							}
							Static243.aClass358Array1[local73] = local2085;
						}
						Static284.aClass83_193 = null;
						return true;
					} else {
						@Pc(2301) boolean local2301;
						if (Static284.aClass83_193 == Static223.aClass83_90) {
							local208 = Static158.aClass1_Sub3_Sub1_2.method7945();
							@Pc(2275) Class11_Sub1_Sub1_Sub3_Sub1 local2275;
							if (Static310.anInt5693 == local208) {
								local2275 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2;
							} else {
								local2275 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local208];
							}
							if (local2275 == null) {
								Static284.aClass83_193 = null;
								return true;
							}
							local254 = Static158.aClass1_Sub3_Sub1_2.method7945();
							local258 = Static158.aClass1_Sub3_Sub1_2.method7974();
							local2301 = (local254 & 0x8000) != 0;
							if (local2275.aString35 != null && local2275.aClass283_1 != null) {
								local273 = false;
								if (local258 <= 1) {
									if (!local2301 && (Static381.aBoolean523 && !Static81.aBoolean101 || Static52.aBoolean594)) {
										local273 = true;
									} else if (Static234.method3456(local2275.aString35)) {
										local273 = true;
									}
								}
								if (!local273 && Static406.anInt7247 == 0) {
									local889 = -1;
									if (local2301) {
										local254 &= 0x7FFF;
										@Pc(2358) Class70 local2358 = Static56.method959(Static158.aClass1_Sub3_Sub1_2);
										local889 = local2358.anInt1778;
										local1197 = local2358.aClass1_Sub8_Sub17_1.method7100(Static158.aClass1_Sub3_Sub1_2);
									} else {
										local1197 = Static294.method4380(Static134.method2330(Static158.aClass1_Sub3_Sub1_2));
									}
									local2275.aString86 = local1197.trim();
									local2275.anInt7546 = local254 & 0xFF;
									local2275.anInt7573 = local254 >> 8;
									local2275.anInt7571 = 150;
									if (local258 == 1 || local258 == 2) {
										local895 = local2301 ? 17 : 1;
									} else {
										local895 = local2301 ? 17 : 2;
									}
									if (local258 == 2) {
										Static489.method6727(local1197, "<img=1>" + local2275.method2950(), local895, local2275.aString34, local889, null, "<img=1>" + local2275.method2947(), 0);
									} else if (local258 == 1) {
										Static489.method6727(local1197, "<img=0>" + local2275.method2950(), local895, local2275.aString34, local889, null, "<img=0>" + local2275.method2947(), 0);
									} else {
										Static489.method6727(local1197, local2275.method2950(), local895, local2275.aString34, local889, null, local2275.method2947(), 0);
									}
								}
							}
							Static284.aClass83_193 = null;
							return true;
						} else if (Static102.aClass83_52 == Static284.aClass83_193) {
							local208 = Static158.aClass1_Sub3_Sub1_2.method7974();
							local73 = Static158.aClass1_Sub3_Sub1_2.method7967();
							local254 = Static158.aClass1_Sub3_Sub1_2.method7916();
							if (Static184.method2977(local73)) {
								if (local208 == 2) {
									Static382.method7880();
								}
								Static165.anInt3165 = local254;
								Static15.method368(local254);
								Static209.method7201(false);
								Static451.method6308(Static165.anInt3165);
								for (local258 = 0; local258 < 100; local258++) {
									Static73.aBooleanArray6[local258] = true;
								}
							}
							Static284.aClass83_193 = null;
							return true;
						} else if (Static284.aClass83_193 == Static99.aClass83_49) {
							local208 = Static158.aClass1_Sub3_Sub1_2.method7945();
							local73 = Static158.aClass1_Sub3_Sub1_2.method7945();
							local254 = Static158.aClass1_Sub3_Sub1_2.method7945();
							local258 = Static158.aClass1_Sub3_Sub1_2.method7945();
							if (Static184.method2977(local208) && Static115.aClass160ArrayArray1[local73] != null) {
								for (local262 = local254; local262 < local258; local262++) {
									local1563 = Static158.aClass1_Sub3_Sub1_2.method7919();
									if (Static115.aClass160ArrayArray1[local73].length > local262 && Static115.aClass160ArrayArray1[local73][local262] != null) {
										Static115.aClass160ArrayArray1[local73][local262].anInt4177 = local1563;
									}
								}
							}
							Static284.aClass83_193 = null;
							return true;
						} else if (Static284.aClass83_193 == Static133.aClass83_57) {
							Static71.anInt1363 = Static158.aClass1_Sub3_Sub1_2.method7974();
							Static284.aClass83_193 = null;
							return true;
						} else if (Static284.aClass83_193 == Static85.aClass83_46) {
							Static256.method3744(Static303.aClass295_4);
							Static284.aClass83_193 = null;
							return true;
						} else if (Static284.aClass83_193 == Static195.aClass83_138) {
							local208 = Static158.aClass1_Sub3_Sub1_2.method7946();
							local73 = Static158.aClass1_Sub3_Sub1_2.method7940();
							local1618 = Static158.aClass1_Sub3_Sub1_2.method7951();
							if (Static184.method2977(local208)) {
								Static375.method5451(local73, local1618);
							}
							Static284.aClass83_193 = null;
							return true;
						} else if (Static284.aClass83_193 == Static290.aClass83_105) {
							Static256.method3744(Static419.aClass295_9);
							Static284.aClass83_193 = null;
							return true;
						} else if (Static575.aClass83_207 == Static284.aClass83_193) {
							Static256.method3744(Static341.aClass295_6);
							Static284.aClass83_193 = null;
							return true;
						} else {
							@Pc(2699) boolean local2699;
							@Pc(2707) String local2707;
							@Pc(2717) String local2717;
							@Pc(2721) String local2721;
							if (Static107.aClass83_53 == Static284.aClass83_193) {
								local208 = Static158.aClass1_Sub3_Sub1_2.method7974();
								local2699 = (local208 & 0x1) == 1;
								local1618 = Static158.aClass1_Sub3_Sub1_2.method7951();
								local2707 = Static158.aClass1_Sub3_Sub1_2.method7951();
								if (local2707.equals("")) {
									local2707 = local1618;
								}
								local2717 = Static158.aClass1_Sub3_Sub1_2.method7951();
								local2721 = Static158.aClass1_Sub3_Sub1_2.method7951();
								if (local2721.equals("")) {
									local2721 = local2717;
								}
								if (local2699) {
									for (local285 = 0; local285 < Static549.anInt9183; local285++) {
										if (Static433.aStringArray15[local285].equals(local2721)) {
											Static149.aStringArray3[local285] = local1618;
											Static433.aStringArray15[local285] = local2707;
											Static314.aStringArray18[local285] = local2717;
											Static593.aStringArray42[local285] = local2721;
											break;
										}
									}
								} else {
									Static149.aStringArray3[Static549.anInt9183] = local1618;
									Static433.aStringArray15[Static549.anInt9183] = local2707;
									Static314.aStringArray18[Static549.anInt9183] = local2717;
									Static593.aStringArray42[Static549.anInt9183] = local2721;
									Static508.aBooleanArray35[Static549.anInt9183] = (local208 & 0x2) == 2;
									Static549.anInt9183++;
								}
								Static284.aClass83_193 = null;
								Static544.anInt9118 = Static259.anInt4739;
								return true;
							} else if (Static284.aClass83_193 == Static260.aClass83_99) {
								Static390.aClass353_29.method7621();
								Static317.anInt9284 += 32;
								Static284.aClass83_193 = null;
								return true;
							} else if (Static284.aClass83_193 == Static87.aClass83_47) {
								Static136.method2372(false);
								Static284.aClass83_193 = null;
								return false;
							} else if (Static304.aClass83_111 == Static284.aClass83_193) {
								local1087 = Static158.aClass1_Sub3_Sub1_2.method7951();
								local73 = Static158.aClass1_Sub3_Sub1_2.method7945();
								local1618 = Static109.aClass211_1.method4599(local73).method7100(Static158.aClass1_Sub3_Sub1_2);
								Static489.method6727(local1618, local1087, 19, local1087, local73, null, local1087, 0);
								Static284.aClass83_193 = null;
								return true;
							} else if (Static284.aClass83_193 == Static429.aClass83_162) {
								local1612 = Static158.aClass1_Sub3_Sub1_2.method7974() == 1;
								local1104 = Static158.aClass1_Sub3_Sub1_2.method7951();
								local1618 = local1104;
								if (local1612) {
									local1618 = Static158.aClass1_Sub3_Sub1_2.method7951();
								}
								local1628 = Static158.aClass1_Sub3_Sub1_2.method7945();
								local1633 = Static158.aClass1_Sub3_Sub1_2.method7919();
								local889 = Static158.aClass1_Sub3_Sub1_2.method7974();
								local895 = Static158.aClass1_Sub3_Sub1_2.method7945();
								@Pc(2907) long local2907 = local1633 + (local1628 << 32);
								@Pc(2909) boolean local2909 = false;
								local641 = 0;
								while (true) {
									if (local641 >= 100) {
										if (local889 <= 1 && Static234.method3456(local1618)) {
											local2909 = true;
										}
										break;
									}
									if (local2907 == Static574.aLongArray16[local641]) {
										local2909 = true;
										break;
									}
									local641++;
								}
								if (!local2909 && Static406.anInt7247 == 0) {
									Static574.aLongArray16[Static154.anInt2917] = local2907;
									Static154.anInt2917 = (Static154.anInt2917 + 1) % 100;
									@Pc(2964) String local2964 = Static109.aClass211_1.method4599(local895).method7100(Static158.aClass1_Sub3_Sub1_2);
									if (local889 == 2) {
										Static489.method6727(local2964, "<img=1>" + local1618, 18, local1104, local895, null, "<img=1>" + local1104, 0);
									} else if (local889 == 1) {
										Static489.method6727(local2964, "<img=0>" + local1618, 18, local1104, local895, null, "<img=0>" + local1104, 0);
									} else {
										Static489.method6727(local2964, local1618, 18, local1104, local895, null, local1104, 0);
									}
								}
								Static284.aClass83_193 = null;
								return true;
							} else if (Static284.aClass83_193 == Static97.aClass83_48) {
								local1612 = Static158.aClass1_Sub3_Sub1_2.method7974() == 1;
								local1104 = Static158.aClass1_Sub3_Sub1_2.method7951();
								local1618 = local1104;
								if (local1612) {
									local1618 = Static158.aClass1_Sub3_Sub1_2.method7951();
								}
								local258 = Static158.aClass1_Sub3_Sub1_2.method7974();
								local2301 = false;
								if (local258 <= 1) {
									if (Static381.aBoolean523 && !Static81.aBoolean101 || Static52.aBoolean594) {
										local2301 = true;
									} else if (local258 <= 1 && Static234.method3456(local1618)) {
										local2301 = true;
									}
								}
								if (!local2301 && Static406.anInt7247 == 0) {
									local2721 = Static294.method4380(Static134.method2330(Static158.aClass1_Sub3_Sub1_2));
									if (local258 == 2) {
										Static489.method6727(local2721, "<img=1>" + local1618, 24, local1104, -1, null, "<img=1>" + local1104, 0);
									} else if (local258 == 1) {
										Static489.method6727(local2721, "<img=0>" + local1618, 24, local1104, -1, null, "<img=0>" + local1104, 0);
									} else {
										Static489.method6727(local2721, local1618, 24, local1104, -1, null, local1104, 0);
									}
								}
								Static284.aClass83_193 = null;
								return true;
							} else if (Static284.aClass83_193 == Static340.aClass83_131) {
								Static256.method3744(Static560.aClass295_14);
								Static284.aClass83_193 = null;
								return true;
							} else if (Static490.aClass83_177 == Static284.aClass83_193) {
								local208 = Static158.aClass1_Sub3_Sub1_2.method7945();
								if (local208 == 65535) {
									local208 = -1;
								}
								local73 = Static158.aClass1_Sub3_Sub1_2.method7974();
								local254 = Static158.aClass1_Sub3_Sub1_2.method7945();
								local258 = Static158.aClass1_Sub3_Sub1_2.method7974();
								local262 = Static158.aClass1_Sub3_Sub1_2.method7945();
								Static17.method396(local262, local73, false, local208, local258, local254);
								Static284.aClass83_193 = null;
								return true;
							} else if (Static583.aClass83_209 == Static284.aClass83_193) {
								local208 = Static158.aClass1_Sub3_Sub1_2.method7967();
								local73 = Static158.aClass1_Sub3_Sub1_2.method7967();
								local254 = Static158.aClass1_Sub3_Sub1_2.method7946();
								local258 = Static158.aClass1_Sub3_Sub1_2.method7940();
								local262 = Static158.aClass1_Sub3_Sub1_2.method7946();
								if (Static184.method2977(local262)) {
									Static441.method6228(local73, local254 | local208 << 16, local258, 7);
								}
								Static284.aClass83_193 = null;
								return true;
							} else if (Static284.aClass83_193 == Static226.aClass83_91) {
								Static256.method3744(Static304.aClass295_5);
								Static284.aClass83_193 = null;
								return true;
							} else if (Static296.aClass83_106 == Static284.aClass83_193) {
								local208 = Static158.aClass1_Sub3_Sub1_2.method7974();
								local73 = Static158.aClass1_Sub3_Sub1_2.method7974();
								if (local208 == 255) {
									local73 = -1;
									local208 = -1;
								}
								Static118.method2142(local208, local73);
								Static284.aClass83_193 = null;
								return true;
							} else if (Static284.aClass83_193 == Static15.aClass83_6) {
								local208 = Static158.aClass1_Sub3_Sub1_2.method7958();
								local73 = Static158.aClass1_Sub3_Sub1_2.method7967();
								local254 = Static158.aClass1_Sub3_Sub1_2.method7938();
								if (Static184.method2977(local73)) {
									Static526.method7240(local208, local254);
								}
								Static284.aClass83_193 = null;
								return true;
							} else if (Static284.aClass83_193 == Static441.aClass83_167) {
								local208 = Static158.aClass1_Sub3_Sub1_2.method7945();
								local1945 = Static158.aClass1_Sub3_Sub1_2.method7963();
								Static390.aClass353_29.method7622(local208, local1945);
								Static284.aClass83_193 = null;
								return true;
							} else if (Static284.aClass83_193 == Static183.aClass83_78) {
								local1087 = Static158.aClass1_Sub3_Sub1_2.method7951();
								local1104 = Static294.method4380(Static134.method2330(Static158.aClass1_Sub3_Sub1_2));
								Static308.method4624(local1087, 0, 6, local1087, local1104, local1087);
								Static284.aClass83_193 = null;
								return true;
							} else if (Static284.aClass83_193 == Static214.aClass83_87) {
								Static256.method3744(Static55.aClass295_1);
								Static284.aClass83_193 = null;
								return true;
							} else if (Static284.aClass83_193 == Static429.aClass83_161) {
								for (local208 = 0; local208 < Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1.length; local208++) {
									if (Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local208] != null) {
										Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local208].anIntArray448 = null;
										Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local208].anInt7591 = -1;
									}
								}
								for (local73 = 0; local73 < Static547.anInt9151; local73++) {
									Static501.aClass1_Sub33Array1[local73].aClass11_Sub1_Sub1_Sub3_Sub2_2.anIntArray448 = null;
									Static501.aClass1_Sub33Array1[local73].aClass11_Sub1_Sub1_Sub3_Sub2_2.anInt7591 = -1;
								}
								Static284.aClass83_193 = null;
								return true;
							} else if (Static311.aClass83_112 == Static284.aClass83_193) {
								local208 = Static158.aClass1_Sub3_Sub1_2.method7967();
								local73 = Static158.aClass1_Sub3_Sub1_2.method7928();
								if (Static184.method2977(local208)) {
									Static441.method6228(-1, -1, local73, 3);
								}
								Static284.aClass83_193 = null;
								return true;
							} else if (Static284.aClass83_193 == Static391.aClass83_145) {
								Static422.method5976(Static464.anInt8696, Static361.aClass198_3, Static158.aClass1_Sub3_Sub1_2);
								Static284.aClass83_193 = null;
								return true;
							} else if (Static135.aClass83_58 == Static284.aClass83_193) {
								Static340.method5075();
								Static284.aClass83_193 = null;
								return false;
							} else if (Static284.aClass83_193 == Static115.aClass83_54) {
								Static256.method3744(Static383.aClass295_8);
								Static284.aClass83_193 = null;
								return true;
							} else if (Static254.aClass83_61 == Static284.aClass83_193) {
								Static256.method3744(Static501.aClass295_12);
								Static284.aClass83_193 = null;
								return true;
							} else if (Static101.aClass83_51 == Static284.aClass83_193) {
								local1612 = Static158.aClass1_Sub3_Sub1_2.method7974() == 1;
								local1104 = Static158.aClass1_Sub3_Sub1_2.method7951();
								local1618 = local1104;
								if (local1612) {
									local1618 = Static158.aClass1_Sub3_Sub1_2.method7951();
								}
								local258 = Static158.aClass1_Sub3_Sub1_2.method7974();
								local262 = Static158.aClass1_Sub3_Sub1_2.method7945();
								local273 = false;
								if (local258 <= 1 && Static234.method3456(local1618)) {
									local273 = true;
								}
								if (!local273 && Static406.anInt7247 == 0) {
									local1197 = Static109.aClass211_1.method4599(local262).method7100(Static158.aClass1_Sub3_Sub1_2);
									if (local258 == 2) {
										Static489.method6727(local1197, "<img=1>" + local1618, 25, local1104, local262, null, "<img=1>" + local1104, 0);
									} else if (local258 == 1) {
										Static489.method6727(local1197, "<img=0>" + local1618, 25, local1104, local262, null, "<img=0>" + local1104, 0);
									} else {
										Static489.method6727(local1197, local1618, 25, local1104, local262, null, local1104, 0);
									}
								}
								Static284.aClass83_193 = null;
								return true;
							} else if (Static284.aClass83_193 == Static297.aClass83_107) {
								Static256.method3744(Static420.aClass295_10);
								Static284.aClass83_193 = null;
								return true;
							} else if (Static498.aClass83_22 == Static284.aClass83_193) {
								Static136.method2372(Static447.aBoolean596);
								Static284.aClass83_193 = null;
								return false;
							} else if (Static519.aClass83_191 == Static284.aClass83_193) {
								local208 = Static158.aClass1_Sub3_Sub1_2.method7945();
								local73 = Static158.aClass1_Sub3_Sub1_2.method7974();
								local254 = Static158.aClass1_Sub3_Sub1_2.method7974();
								local258 = Static158.aClass1_Sub3_Sub1_2.method7945() << 2;
								local262 = Static158.aClass1_Sub3_Sub1_2.method7974();
								local1563 = Static158.aClass1_Sub3_Sub1_2.method7974();
								if (Static184.method2977(local208)) {
									Static189.method3048(local254, local262, local1563, local73, local258);
								}
								Static284.aClass83_193 = null;
								return true;
							} else if (Static284.aClass83_193 == Static352.aClass83_136) {
								Static229.anInt4281 = Static158.aClass1_Sub3_Sub1_2.method7974();
								Static284.aClass83_193 = null;
								Static303.anInt5647 = Static259.anInt4739;
								return true;
							} else if (Static353.aClass83_137 == Static284.aClass83_193) {
								Static549.anInt9183 = Static158.aClass1_Sub3_Sub1_2.method7974();
								for (local208 = 0; local208 < Static549.anInt9183; local208++) {
									Static149.aStringArray3[local208] = Static158.aClass1_Sub3_Sub1_2.method7951();
									Static433.aStringArray15[local208] = Static158.aClass1_Sub3_Sub1_2.method7951();
									if (Static433.aStringArray15[local208].equals("")) {
										Static433.aStringArray15[local208] = Static149.aStringArray3[local208];
									}
									Static314.aStringArray18[local208] = Static158.aClass1_Sub3_Sub1_2.method7951();
									Static593.aStringArray42[local208] = Static158.aClass1_Sub3_Sub1_2.method7951();
									if (Static593.aStringArray42[local208].equals("")) {
										Static593.aStringArray42[local208] = Static314.aStringArray18[local208];
									}
									Static508.aBooleanArray35[local208] = false;
								}
								Static544.anInt9118 = Static259.anInt4739;
								Static284.aClass83_193 = null;
								return true;
							} else if (Static284.aClass83_193 == Static162.aClass83_72) {
								Static544.anInt9118 = Static259.anInt4739;
								Static284.aClass83_193 = null;
								Static71.anInt1353 = 1;
								return true;
							} else if (Static284.aClass83_193 == Static430.aClass83_163) {
								local208 = Static158.aClass1_Sub3_Sub1_2.method7945();
								if (Static184.method2977(local208)) {
									Static238.method2517();
								}
								Static284.aClass83_193 = null;
								return true;
							} else if (Static196.aClass83_82 == Static284.aClass83_193) {
								local208 = Static158.aClass1_Sub3_Sub1_2.method7945();
								local73 = Static158.aClass1_Sub3_Sub1_2.method7974();
								local254 = Static158.aClass1_Sub3_Sub1_2.method7974();
								local258 = Static158.aClass1_Sub3_Sub1_2.method7974();
								local262 = Static158.aClass1_Sub3_Sub1_2.method7974();
								local1563 = Static158.aClass1_Sub3_Sub1_2.method7945();
								if (Static184.method2977(local208)) {
									Static586.aBooleanArray40[local73] = true;
									Static260.anIntArray262[local73] = local254;
									Static293.anIntArray308[local73] = local258;
									Static537.anIntArray567[local73] = local262;
									Static472.anIntArray513[local73] = local1563;
								}
								Static284.aClass83_193 = null;
								return true;
							} else if (Static284.aClass83_193 == Static414.aClass83_166) {
								Static17.aClass41_1 = Static1.method37(Static158.aClass1_Sub3_Sub1_2.method7974());
								Static284.aClass83_193 = null;
								return true;
							} else if (Static46.aClass83_26 == Static284.aClass83_193) {
								local208 = Static158.aClass1_Sub3_Sub1_2.method7943();
								local73 = Static158.aClass1_Sub3_Sub1_2.method7916();
								if (local73 == 65535) {
									local73 = -1;
								}
								local254 = Static158.aClass1_Sub3_Sub1_2.method7931();
								Static353.method5269(local73, local254, local208);
								Static284.aClass83_193 = null;
								return true;
							} else if (Static284.aClass83_193 == Static73.aClass83_40) {
								local208 = Static158.aClass1_Sub3_Sub1_2.method7968();
								local73 = Static158.aClass1_Sub3_Sub1_2.method7967();
								if (local73 == 65535) {
									local73 = -1;
								}
								local254 = Static158.aClass1_Sub3_Sub1_2.method7931();
								Static196.method3085(local254, local208, local73);
								Static284.aClass83_193 = null;
								return true;
							} else {
								@Pc(4003) long local4003;
								@Pc(4025) Class1_Sub10 local4025;
								@Pc(4009) Class1_Sub10 local4009;
								if (Static284.aClass83_193 == Static324.aClass83_120) {
									local208 = Static158.aClass1_Sub3_Sub1_2.method7967();
									if (local208 == 65535) {
										local208 = -1;
									}
									local73 = Static158.aClass1_Sub3_Sub1_2.method7967();
									local254 = Static158.aClass1_Sub3_Sub1_2.method7940();
									local258 = Static158.aClass1_Sub3_Sub1_2.method7967();
									local262 = Static158.aClass1_Sub3_Sub1_2.method7916();
									if (local262 == 65535) {
										local262 = -1;
									}
									if (Static184.method2977(local258)) {
										for (local1563 = local262; local1563 <= local208; local1563++) {
											local4003 = ((long) local254 << 32) + ((long) local1563);
											local4009 = (Class1_Sub10) Static441.aClass91_34.method2271(local4003);
											if (local4009 != null) {
												local4025 = new Class1_Sub10(local4009.anInt658, local73);
												local4009.method7908();
											} else if (local1563 == -1) {
												local4025 = new Class1_Sub10(Static512.method7155(local254).aClass1_Sub10_1.anInt658, local73);
											} else {
												local4025 = new Class1_Sub10(0, local73);
											}
											Static441.aClass91_34.method2269(local4003, local4025);
										}
									}
									Static284.aClass83_193 = null;
									return true;
								} else if (Static581.aClass83_208 == Static284.aClass83_193) {
									if (Static45.method761(Static55.anInt1068)) {
										Static208.anInt8063 = (int) ((float) Static158.aClass1_Sub3_Sub1_2.method7945() * 2.5F);
									} else {
										Static208.anInt8063 = Static158.aClass1_Sub3_Sub1_2.method7945() * 30;
									}
									Static284.aClass83_193 = null;
									Static303.anInt5647 = Static259.anInt4739;
									return true;
								} else if (Static284.aClass83_193 == Static379.aClass83_143) {
									local1612 = Static158.aClass1_Sub3_Sub1_2.method7974() == 1;
									local1104 = Static158.aClass1_Sub3_Sub1_2.method7951();
									local1618 = local1104;
									if (local1612) {
										local1618 = Static158.aClass1_Sub3_Sub1_2.method7951();
									}
									local1628 = Static158.aClass1_Sub3_Sub1_2.method7949();
									local1633 = Static158.aClass1_Sub3_Sub1_2.method7945();
									local1638 = Static158.aClass1_Sub3_Sub1_2.method7919();
									local606 = Static158.aClass1_Sub3_Sub1_2.method7974();
									@Pc(4138) long local4138 = (local1633 << 32) + local1638;
									@Pc(4140) boolean local4140 = false;
									local351 = 0;
									while (true) {
										if (local351 >= 100) {
											if (local606 <= 1) {
												if (Static381.aBoolean523 && !Static81.aBoolean101 || Static52.aBoolean594) {
													local4140 = true;
												} else if (Static234.method3456(local1618)) {
													local4140 = true;
												}
											}
											break;
										}
										if (Static574.aLongArray16[local351] == local4138) {
											local4140 = true;
											break;
										}
										local351++;
									}
									if (!local4140 && Static406.anInt7247 == 0) {
										Static574.aLongArray16[Static154.anInt2917] = local4138;
										Static154.anInt2917 = (Static154.anInt2917 + 1) % 100;
										@Pc(4199) String local4199 = Static294.method4380(Static134.method2330(Static158.aClass1_Sub3_Sub1_2));
										if (local606 == 2 || local606 == 3) {
											Static489.method6727(local4199, "<img=1>" + local1618, 9, local1104, -1, Static387.method5586(local1628), "<img=1>" + local1104, 0);
										} else if (local606 == 1) {
											Static489.method6727(local4199, "<img=0>" + local1618, 9, local1104, -1, Static387.method5586(local1628), "<img=0>" + local1104, 0);
										} else {
											Static489.method6727(local4199, local1618, 9, local1104, -1, Static387.method5586(local1628), local1104, 0);
										}
									}
									Static284.aClass83_193 = null;
									return true;
								} else if (Static284.aClass83_193 == Static154.aClass83_66) {
									local208 = Static158.aClass1_Sub3_Sub1_2.method7958();
									local73 = Static158.aClass1_Sub3_Sub1_2.method7916();
									local254 = Static158.aClass1_Sub3_Sub1_2.method7916();
									if (Static184.method2977(local73)) {
										Static65.method1052(local254, local208);
									}
									Static284.aClass83_193 = null;
									return true;
								} else if (Static284.aClass83_193 == Static193.aClass83_80) {
									local208 = Static158.aClass1_Sub3_Sub1_2.method7946();
									local1104 = Static158.aClass1_Sub3_Sub1_2.method7951();
									local254 = Static158.aClass1_Sub3_Sub1_2.method7967();
									if (Static184.method2977(local254)) {
										Static477.method6642(local1104, local208);
									}
									Static284.aClass83_193 = null;
									return true;
								} else if (Static446.aClass83_169 == Static284.aClass83_193) {
									local208 = Static158.aClass1_Sub3_Sub1_2.method7940();
									local73 = Static158.aClass1_Sub3_Sub1_2.method7916();
									if (local73 == 65535) {
										local73 = -1;
									}
									local254 = Static158.aClass1_Sub3_Sub1_2.method7946();
									if (Static184.method2977(local254)) {
										Static441.method6228(-1, local73, local208, 1);
									}
									Static284.aClass83_193 = null;
									return true;
								} else if (Static219.aClass83_88 == Static284.aClass83_193) {
									local208 = Static158.aClass1_Sub3_Sub1_2.method7946();
									local73 = Static158.aClass1_Sub3_Sub1_2.method7958();
									Static390.aClass353_29.method7626(local208, local73);
									Static284.aClass83_193 = null;
									return true;
								} else if (Static284.aClass83_193 == Static223.aClass83_89) {
									Static236.method7225();
									Static284.aClass83_193 = null;
									return false;
								} else if (Static50.aClass83_32 == Static284.aClass83_193) {
									Static89.anInt1657 = Static158.aClass1_Sub3_Sub1_2.method7976() << 3;
									Static202.anInt3819 = Static158.aClass1_Sub3_Sub1_2.method7963() << 3;
									Static89.anInt1658 = Static158.aClass1_Sub3_Sub1_2.method7938();
									for (@Pc(4419) Class1_Sub20 local4419 = (Class1_Sub20) Static365.aClass91_29.method2278(); local4419 != null; local4419 = (Class1_Sub20) Static365.aClass91_29.method2276()) {
										local73 = (int) (local4419.aLong268 >> 28 & 0x3L);
										local254 = (int) (local4419.aLong268 & 0x3FFFL);
										local258 = local254 - Static539.anInt9045;
										local262 = (int) (local4419.aLong268 >> 14 & 0x3FFFL);
										local1563 = local262 - Static311.anInt5708;
										if (Static89.anInt1658 == local73 && local258 >= Static89.anInt1657 && local258 < Static89.anInt1657 + 8 && Static202.anInt3819 <= local1563 && Static202.anInt3819 + 8 > local1563) {
											local4419.method7908();
											if (local258 >= 0 && local1563 >= 0 && local258 < Static458.anInt9736 && local1563 < Static378.anInt6747) {
												Static198.method3089(local1563, Static89.anInt1658, local258);
											}
										}
									}
									for (@Pc(4517) Class1_Sub43 local4517 = (Class1_Sub43) Static64.aClass111_5.method2547(); local4517 != null; local4517 = (Class1_Sub43) Static64.aClass111_5.method2554()) {
										if (local4517.anInt8101 >= Static89.anInt1657 && Static89.anInt1657 + 8 > local4517.anInt8101 && local4517.anInt8102 >= Static202.anInt3819 && local4517.anInt8102 < Static202.anInt3819 + 8 && local4517.anInt8109 == Static89.anInt1658) {
											local4517.anInt8096 = 0;
										}
									}
									Static284.aClass83_193 = null;
									return true;
								} else {
									@Pc(4605) boolean local4605;
									if (Static85.aClass83_45 == Static284.aClass83_193) {
										while (Static464.anInt8696 > Static158.aClass1_Sub3_Sub1_2.anInt9802) {
											local1612 = Static158.aClass1_Sub3_Sub1_2.method7974() == 1;
											local1104 = Static158.aClass1_Sub3_Sub1_2.method7951();
											local1618 = Static158.aClass1_Sub3_Sub1_2.method7951();
											local258 = Static158.aClass1_Sub3_Sub1_2.method7945();
											local262 = Static158.aClass1_Sub3_Sub1_2.method7974();
											local2721 = "";
											local4605 = false;
											if (local258 > 0) {
												local2721 = Static158.aClass1_Sub3_Sub1_2.method7951();
												local4605 = Static158.aClass1_Sub3_Sub1_2.method7974() == 1;
											}
											for (local889 = 0; local889 < Static99.anInt1760; local889++) {
												if (local1612) {
													if (local1618.equals(Static187.aStringArray6[local889])) {
														Static187.aStringArray6[local889] = local1104;
														Static527.aStringArray36[local889] = local1618;
														local1104 = null;
														break;
													}
												} else if (local1104.equals(Static187.aStringArray6[local889])) {
													if (Static225.anIntArray201[local889] != local258) {
														local598 = true;
														for (@Pc(4649) Class11_Sub5_Sub2 local4649 = (Class11_Sub5_Sub2) Static386.aClass196_7.method4024(); local4649 != null; local4649 = (Class11_Sub5_Sub2) Static386.aClass196_7.method4028()) {
															if (local4649.aString55.equals(local1104)) {
																if (local258 != 0 && local4649.aShort57 == 0) {
																	local4649.method7200();
																	local598 = false;
																} else if (local258 == 0 && local4649.aShort57 != 0) {
																	local598 = false;
																	local4649.method7200();
																}
															}
														}
														if (local598) {
															Static386.aClass196_7.method4032(new Class11_Sub5_Sub2(local1104, local258));
														}
														Static225.anIntArray201[local889] = local258;
													}
													Static527.aStringArray36[local889] = local1618;
													Static481.aStringArray32[local889] = local2721;
													Static7.anIntArray8[local889] = local262;
													local1104 = null;
													Static317.aBooleanArray37[local889] = local4605;
													break;
												}
											}
											if (local1104 != null && Static99.anInt1760 < 200) {
												Static187.aStringArray6[Static99.anInt1760] = local1104;
												Static527.aStringArray36[Static99.anInt1760] = local1618;
												Static225.anIntArray201[Static99.anInt1760] = local258;
												Static481.aStringArray32[Static99.anInt1760] = local2721;
												Static7.anIntArray8[Static99.anInt1760] = local262;
												Static317.aBooleanArray37[Static99.anInt1760] = local4605;
												Static99.anInt1760++;
											}
										}
										Static544.anInt9118 = Static259.anInt4739;
										Static71.anInt1353 = 2;
										local73 = Static99.anInt1760;
										while (local73 > 0) {
											local73--;
											local1612 = true;
											for (local254 = 0; local254 < local73; local254++) {
												if (Static221.aClass261_3.anInt6921 != Static225.anIntArray201[local254] && Static225.anIntArray201[local254 + 1] == Static221.aClass261_3.anInt6921 || Static225.anIntArray201[local254] == 0 && Static225.anIntArray201[local254 + 1] != 0) {
													local258 = Static225.anIntArray201[local254];
													Static225.anIntArray201[local254] = Static225.anIntArray201[local254 + 1];
													Static225.anIntArray201[local254 + 1] = local258;
													local2717 = Static481.aStringArray32[local254];
													Static481.aStringArray32[local254] = Static481.aStringArray32[local254 + 1];
													Static481.aStringArray32[local254 + 1] = local2717;
													local2721 = Static187.aStringArray6[local254];
													Static187.aStringArray6[local254] = Static187.aStringArray6[local254 + 1];
													Static187.aStringArray6[local254 + 1] = local2721;
													local1197 = Static527.aStringArray36[local254];
													Static527.aStringArray36[local254] = Static527.aStringArray36[local254 + 1];
													Static527.aStringArray36[local254 + 1] = local1197;
													local889 = Static7.anIntArray8[local254];
													Static7.anIntArray8[local254] = Static7.anIntArray8[local254 + 1];
													Static7.anIntArray8[local254 + 1] = local889;
													local598 = Static317.aBooleanArray37[local254];
													Static317.aBooleanArray37[local254] = Static317.aBooleanArray37[local254 + 1];
													local1612 = false;
													Static317.aBooleanArray37[local254 + 1] = local598;
												}
											}
											if (local1612) {
												break;
											}
										}
										Static284.aClass83_193 = null;
										return true;
									} else if (Static116.aClass83_55 == Static284.aClass83_193) {
										if (Static180.aFrame5 != null) {
											Static447.method6284(-1, false, Static86.aClass1_Sub30_Sub1_1.anInt6199, -1);
										}
										@Pc(4969) byte[] local4969 = new byte[Static464.anInt8696];
										Static158.aClass1_Sub3_Sub1_2.method4999(Static464.anInt8696, local4969);
										local1104 = Static8.method4852(Static464.anInt8696, local4969, 0);
										Static13.method258(true, local1104, Static286.anInt5239 == 1, Static361.aClass198_3);
										Static284.aClass83_193 = null;
										return true;
									} else if (Static139.aClass83_62 == Static284.aClass83_193) {
										local208 = Static158.aClass1_Sub3_Sub1_2.method7946();
										if (local208 == 65535) {
											local208 = -1;
										}
										local73 = Static158.aClass1_Sub3_Sub1_2.method7940();
										local254 = Static158.aClass1_Sub3_Sub1_2.method7946();
										if (Static184.method2977(local254)) {
											Static531.method7287(local73, local208);
										}
										Static284.aClass83_193 = null;
										return true;
									} else if (Static538.aClass83_160 == Static284.aClass83_193) {
										Static89.anInt1658 = Static158.aClass1_Sub3_Sub1_2.method7938();
										Static89.anInt1657 = Static158.aClass1_Sub3_Sub1_2.method7976() << 3;
										Static202.anInt3819 = Static158.aClass1_Sub3_Sub1_2.method7963() << 3;
										while (Static158.aClass1_Sub3_Sub1_2.anInt9802 < Static464.anInt8696) {
											@Pc(5058) Class295 local5058 = Static11.method246()[Static158.aClass1_Sub3_Sub1_2.method7974()];
											Static256.method3744(local5058);
										}
										Static284.aClass83_193 = null;
										return true;
									} else if (Static332.aClass83_128 == Static284.aClass83_193) {
										if (Static165.anInt3165 != -1) {
											Static568.method7207(Static165.anInt3165, 0);
										}
										Static284.aClass83_193 = null;
										return true;
									} else if (Static183.aClass83_79 == Static284.aClass83_193) {
										local208 = Static158.aClass1_Sub3_Sub1_2.method7945();
										local73 = Static158.aClass1_Sub3_Sub1_2.method7940();
										if (Static184.method2977(local208)) {
											@Pc(5110) Class1_Sub38 local5110 = (Class1_Sub38) Static148.aClass91_6.method2271((long) local73);
											if (local5110 != null) {
												Static336.method5001(true, local5110, false);
											}
											if (Static390.aClass160_43 != null) {
												Static415.method5900(Static390.aClass160_43);
												Static390.aClass160_43 = null;
											}
										}
										Static284.aClass83_193 = null;
										return true;
									} else {
										@Pc(5161) Class1_Sub38 local5161;
										if (Static497.aClass83_110 == Static284.aClass83_193) {
											local208 = Static158.aClass1_Sub3_Sub1_2.method7915();
											local73 = Static158.aClass1_Sub3_Sub1_2.method7916();
											local254 = Static158.aClass1_Sub3_Sub1_2.method7915();
											if (Static184.method2977(local73)) {
												@Pc(5154) Class1_Sub38 local5154 = (Class1_Sub38) Static148.aClass91_6.method2271((long) local254);
												local5161 = (Class1_Sub38) Static148.aClass91_6.method2271((long) local208);
												if (local5161 != null) {
													Static336.method5001(local5154 == null || local5154.anInt7676 != local5161.anInt7676, local5161, false);
												}
												if (local5154 != null) {
													local5154.method7908();
													Static148.aClass91_6.method2269((long) local208, local5154);
												}
												@Pc(5192) Class160 local5192 = Static512.method7155(local254);
												if (local5192 != null) {
													Static415.method5900(local5192);
												}
												local5192 = Static512.method7155(local208);
												if (local5192 != null) {
													Static415.method5900(local5192);
													Static361.method5313(local5192, true);
												}
												if (Static165.anInt3165 != -1) {
													Static568.method7207(Static165.anInt3165, 1);
												}
											}
											Static284.aClass83_193 = null;
											return true;
										} else if (Static284.aClass83_193 == Static349.aClass83_135) {
											Static142.method2419();
											Static284.aClass83_193 = null;
											return true;
										} else if (Static54.aClass83_35 == Static284.aClass83_193) {
											Static284.aClass83_193 = null;
											return false;
										} else if (Static517.aClass83_190 == Static284.aClass83_193) {
											local208 = Static158.aClass1_Sub3_Sub1_2.method7931();
											local73 = Static158.aClass1_Sub3_Sub1_2.method7931();
											local254 = Static158.aClass1_Sub3_Sub1_2.method7945();
											if (local254 == 65535) {
												local254 = -1;
											}
											local2707 = Static158.aClass1_Sub3_Sub1_2.method7951();
											if (local73 >= 1 && local73 <= 8) {
												if (local2707.equalsIgnoreCase("null")) {
													local2707 = null;
												}
												Static490.aStringArray33[local73 - 1] = local2707;
												Static498.anIntArray38[local73 - 1] = local254;
												Static563.aBooleanArray39[local73 - 1] = local208 == 0;
											}
											Static284.aClass83_193 = null;
											return true;
										} else if (Static525.aClass83_192 == Static284.aClass83_193) {
											local208 = Static158.aClass1_Sub3_Sub1_2.method7945();
											local73 = Static158.aClass1_Sub3_Sub1_2.method7974();
											local254 = Static158.aClass1_Sub3_Sub1_2.method7974();
											local258 = Static158.aClass1_Sub3_Sub1_2.method7945() << 2;
											local262 = Static158.aClass1_Sub3_Sub1_2.method7974();
											local1563 = Static158.aClass1_Sub3_Sub1_2.method7974();
											if (Static184.method2977(local208)) {
												Static195.method5286(local73, true, local1563, local262, local258, local254);
											}
											Static284.aClass83_193 = null;
											return true;
										} else if (Static284.aClass83_193 == Static58.aClass83_37) {
											local208 = Static158.aClass1_Sub3_Sub1_2.method7916();
											local73 = Static158.aClass1_Sub3_Sub1_2.method7915();
											local254 = Static158.aClass1_Sub3_Sub1_2.method7940();
											local258 = Static158.aClass1_Sub3_Sub1_2.method7946();
											if (Static184.method2977(local208)) {
												Static441.method6228(local73, local258, local254, 5);
											}
											Static284.aClass83_193 = null;
											return true;
										} else if (Static40.aClass83_23 == Static284.aClass83_193) {
											local208 = Static158.aClass1_Sub3_Sub1_2.method7967();
											local73 = Static158.aClass1_Sub3_Sub1_2.method7946();
											local254 = Static158.aClass1_Sub3_Sub1_2.method7928();
											if (Static184.method2977(local208)) {
												Static548.method7479(local254, local73);
											}
											Static284.aClass83_193 = null;
											return true;
										} else if (Static555.aClass83_200 == Static284.aClass83_193) {
											Static89.anInt1658 = Static158.aClass1_Sub3_Sub1_2.method7931();
											Static202.anInt3819 = Static158.aClass1_Sub3_Sub1_2.method7963() << 3;
											Static89.anInt1657 = Static158.aClass1_Sub3_Sub1_2.method7963() << 3;
											Static284.aClass83_193 = null;
											return true;
										} else if (Static284.aClass83_193 == Static413.aClass83_148) {
											local208 = Static158.aClass1_Sub3_Sub1_2.method7975();
											local73 = Static158.aClass1_Sub3_Sub1_2.method7915();
											local254 = Static158.aClass1_Sub3_Sub1_2.method7916();
											if (Static184.method2977(local254)) {
												Static501.method7058(local208, local73);
											}
											Static284.aClass83_193 = null;
											return true;
										} else if (Static284.aClass83_193 == Static397.aClass83_146) {
											local1087 = Static158.aClass1_Sub3_Sub1_2.method7951();
											local73 = Static158.aClass1_Sub3_Sub1_2.method7946();
											local254 = Static158.aClass1_Sub3_Sub1_2.method7945();
											if (Static184.method2977(local73)) {
												Static477.method6642(local1087, local254);
											}
											Static284.aClass83_193 = null;
											return true;
										} else if (Static487.aClass83_176 == Static284.aClass83_193) {
											local208 = Static158.aClass1_Sub3_Sub1_2.method7916();
											local73 = Static158.aClass1_Sub3_Sub1_2.method7958();
											local254 = Static158.aClass1_Sub3_Sub1_2.method7940();
											local258 = Static158.aClass1_Sub3_Sub1_2.method7916();
											if (local258 == 65535) {
												local258 = -1;
											}
											local262 = Static158.aClass1_Sub3_Sub1_2.method7945();
											if (local262 == 65535) {
												local262 = -1;
											}
											if (Static184.method2977(local208)) {
												for (local1563 = local258; local1563 <= local262; local1563++) {
													local4003 = ((long) local73 << 32) + (long) local1563;
													local4009 = (Class1_Sub10) Static441.aClass91_34.method2271(local4003);
													if (local4009 != null) {
														local4025 = new Class1_Sub10(local254, local4009.anInt649);
														local4009.method7908();
													} else if (local1563 == -1) {
														local4025 = new Class1_Sub10(local254, Static512.method7155(local73).aClass1_Sub10_1.anInt649);
													} else {
														local4025 = new Class1_Sub10(local254, -1);
													}
													Static441.aClass91_34.method2269(local4003, local4025);
												}
											}
											Static284.aClass83_193 = null;
											return true;
										} else if (Static2.aClass83_1 == Static284.aClass83_193) {
											local208 = Static158.aClass1_Sub3_Sub1_2.method7945();
											if (local208 == 65535) {
												local208 = -1;
											}
											local73 = Static158.aClass1_Sub3_Sub1_2.method7974();
											local254 = Static158.aClass1_Sub3_Sub1_2.method7945();
											local258 = Static158.aClass1_Sub3_Sub1_2.method7974();
											Static17.method396(256, local73, true, local208, local258, local254);
											Static284.aClass83_193 = null;
											return true;
										} else if (Static50.aClass83_33 == Static284.aClass83_193) {
											Static347.method5189();
											Static284.aClass83_193 = null;
											return true;
										} else if (Static284.aClass83_193 == Static501.aClass83_185) {
											local208 = Static158.aClass1_Sub3_Sub1_2.method7928();
											local73 = Static158.aClass1_Sub3_Sub1_2.method7967();
											if (Static184.method2977(local73)) {
												if (local208 == -1) {
													Static434.anInt7761 = -1;
													Static469.anInt8080 = -1;
												} else {
													local254 = local208 >> 14 & 0x3FFF;
													local258 = local208 & 0x3FFF;
													local254 -= Static539.anInt9045;
													if (local254 < 0) {
														local254 = 0;
													} else if (Static458.anInt9736 <= local254) {
														local254 = Static458.anInt9736;
													}
													local258 -= Static311.anInt5708;
													Static469.anInt8080 = (local254 << 9) + 256;
													if (local258 < 0) {
														local258 = 0;
													} else if (Static378.anInt6747 <= local258) {
														local258 = Static378.anInt6747;
													}
													Static434.anInt7761 = (local258 << 9) + 256;
												}
											}
											Static284.aClass83_193 = null;
											return true;
										} else if (Static284.aClass83_193 == Static299.aClass83_108) {
											local208 = Static158.aClass1_Sub3_Sub1_2.method7958();
											local73 = Static158.aClass1_Sub3_Sub1_2.method7946();
											local254 = Static158.aClass1_Sub3_Sub1_2.method7916();
											if (Static184.method2977(local73)) {
												Static68.method1136(local254, local208);
											}
											Static284.aClass83_193 = null;
											return true;
										} else if (Static28.aClass83_13 == Static284.aClass83_193) {
											local208 = Static158.aClass1_Sub3_Sub1_2.method7945();
											local73 = Static158.aClass1_Sub3_Sub1_2.method7974();
											local221 = (local73 & 0x1) == 1;
											Static560.method7580(local221, local208);
											local258 = Static158.aClass1_Sub3_Sub1_2.method7945();
											for (local262 = 0; local262 < local258; local262++) {
												local1563 = Static158.aClass1_Sub3_Sub1_2.method7938();
												if (local1563 == 255) {
													local1563 = Static158.aClass1_Sub3_Sub1_2.method7915();
												}
												local285 = Static158.aClass1_Sub3_Sub1_2.method7916();
												Static377.method5457(local208, local1563, local262, local221, local285 - 1);
											}
											Static125.anIntArray98[Static188.anInt3737++ & 0x1F] = local208;
											Static284.aClass83_193 = null;
											return true;
										} else if (Static250.aClass83_96 == Static284.aClass83_193) {
											local208 = Static158.aClass1_Sub3_Sub1_2.method7928();
											local73 = Static158.aClass1_Sub3_Sub1_2.method7916();
											if (local73 == 65535) {
												local73 = -1;
											}
											local254 = Static158.aClass1_Sub3_Sub1_2.method7916();
											if (Static184.method2977(local254)) {
												Static441.method6228(-1, local73, local208, 2);
											}
											Static284.aClass83_193 = null;
											return true;
										} else if (Static284.aClass83_193 == Static508.aClass83_188) {
											local208 = Static158.aClass1_Sub3_Sub1_2.method7946();
											local73 = Static158.aClass1_Sub3_Sub1_2.method7938();
											Static390.aClass353_29.method7626(local208, local73);
											Static284.aClass83_193 = null;
											return true;
										} else if (Static76.aClass83_133 == Static284.aClass83_193) {
											local208 = Static158.aClass1_Sub3_Sub1_2.method7916();
											local73 = Static158.aClass1_Sub3_Sub1_2.method7938();
											if (Static184.method2977(local208)) {
												Static293.anInt5290 = local73;
											}
											Static284.aClass83_193 = null;
											return true;
										} else if (Static4.aClass83_203 == Static284.aClass83_193) {
											local1612 = Static158.aClass1_Sub3_Sub1_2.method7974() == 1;
											local1104 = Static158.aClass1_Sub3_Sub1_2.method7951();
											local1618 = local1104;
											if (local1612) {
												local1618 = Static158.aClass1_Sub3_Sub1_2.method7951();
											}
											local1628 = Static158.aClass1_Sub3_Sub1_2.method7945();
											local1633 = Static158.aClass1_Sub3_Sub1_2.method7919();
											local889 = Static158.aClass1_Sub3_Sub1_2.method7974();
											@Pc(5949) long local5949 = (local1628 << 32) + local1633;
											@Pc(5951) boolean local5951 = false;
											local465 = 0;
											while (true) {
												if (local465 >= 100) {
													if (local889 <= 1) {
														if (Static381.aBoolean523 && !Static81.aBoolean101 || Static52.aBoolean594) {
															local5951 = true;
														} else if (Static234.method3456(local1618)) {
															local5951 = true;
														}
													}
													break;
												}
												if (local5949 == Static574.aLongArray16[local465]) {
													local5951 = true;
													break;
												}
												local465++;
											}
											if (!local5951 && Static406.anInt7247 == 0) {
												Static574.aLongArray16[Static154.anInt2917] = local5949;
												Static154.anInt2917 = (Static154.anInt2917 + 1) % 100;
												@Pc(6013) String local6013 = Static294.method4380(Static134.method2330(Static158.aClass1_Sub3_Sub1_2));
												if (local889 == 2) {
													Static489.method6727(local6013, "<img=1>" + local1618, 7, local1104, -1, null, "<img=1>" + local1104, 0);
												} else if (local889 == 1) {
													Static489.method6727(local6013, "<img=0>" + local1618, 7, local1104, -1, null, "<img=0>" + local1104, 0);
												} else {
													Static489.method6727(local6013, local1618, 3, local1104, -1, null, local1104, 0);
												}
											}
											Static284.aClass83_193 = null;
											return true;
										} else if (Static170.aClass83_75 == Static284.aClass83_193) {
											local208 = Static158.aClass1_Sub3_Sub1_2.method7974();
											if (Static158.aClass1_Sub3_Sub1_2.method7974() == 0) {
												Static288.aClass7Array1[local208] = new Class7();
											} else {
												Static158.aClass1_Sub3_Sub1_2.anInt9802--;
												Static288.aClass7Array1[local208] = new Class7(Static158.aClass1_Sub3_Sub1_2);
											}
											Static284.aClass83_193 = null;
											Static242.anInt4480 = Static259.anInt4739;
											return true;
										} else if (Static459.aClass83_174 == Static284.aClass83_193) {
											Static256.method3744(Static431.aClass295_11);
											Static284.aClass83_193 = null;
											return true;
										} else if (Static4.aClass83_202 == Static284.aClass83_193) {
											local208 = Static158.aClass1_Sub3_Sub1_2.method7958();
											local73 = Static158.aClass1_Sub3_Sub1_2.method7930();
											local254 = Static158.aClass1_Sub3_Sub1_2.method7942();
											local258 = Static158.aClass1_Sub3_Sub1_2.method7946();
											if (Static184.method2977(local258)) {
												Static153.method2529(local208, local254, local73);
											}
											Static284.aClass83_193 = null;
											return true;
										} else if (Static390.aClass83_204 == Static284.aClass83_193) {
											local208 = Static158.aClass1_Sub3_Sub1_2.method7945();
											if (local208 == 65535) {
												local208 = -1;
											}
											local73 = Static158.aClass1_Sub3_Sub1_2.method7974();
											local254 = Static158.aClass1_Sub3_Sub1_2.method7945();
											local258 = Static158.aClass1_Sub3_Sub1_2.method7974();
											local262 = Static158.aClass1_Sub3_Sub1_2.method7945();
											Static485.method6697(local254, local258, local73, local262, local208);
											Static284.aClass83_193 = null;
											return true;
										} else if (Static284.aClass83_193 == Static558.aClass83_201) {
											@Pc(6214) byte local6214 = Static158.aClass1_Sub3_Sub1_2.method7927();
											local73 = Static158.aClass1_Sub3_Sub1_2.method7943();
											local254 = Static158.aClass1_Sub3_Sub1_2.method7967();
											if (Static184.method2977(local254)) {
												Static470.method2478(local73, local6214);
											}
											Static284.aClass83_193 = null;
											return true;
										} else if (Static289.aClass83_104 == Static284.aClass83_193) {
											local1612 = Static158.aClass1_Sub3_Sub1_2.method7974() == 1;
											@Pc(6251) byte[] local6251 = new byte[Static464.anInt8696 - 1];
											Static158.aClass1_Sub3_Sub1_2.method7957(local6251, Static464.anInt8696 - 1);
											Static411.method5855(local6251, local1612);
											Static284.aClass83_193 = null;
											return true;
										} else if (Static311.aClass83_113 == Static284.aClass83_193) {
											local208 = Static158.aClass1_Sub3_Sub1_2.method7967();
											local73 = Static158.aClass1_Sub3_Sub1_2.method7945();
											local254 = Static158.aClass1_Sub3_Sub1_2.method7945();
											local258 = Static158.aClass1_Sub3_Sub1_2.method7958();
											if (Static184.method2977(local254)) {
												Static370.method5418(local258, (local73 << 16) + local208);
											}
											Static284.aClass83_193 = null;
											return true;
										} else if (Static284.aClass83_193 == Static100.aClass83_50) {
											Static158.aClass1_Sub3_Sub1_2.anInt9802 += 28;
											if (Static158.aClass1_Sub3_Sub1_2.method7954()) {
												Static531.method7288(Static158.aClass1_Sub3_Sub1_2, Static158.aClass1_Sub3_Sub1_2.anInt9802 - 28);
											}
											Static284.aClass83_193 = null;
											return true;
										} else if (Static542.aClass83_197 == Static284.aClass83_193) {
											local208 = Static158.aClass1_Sub3_Sub1_2.method7974();
											local73 = Static158.aClass1_Sub3_Sub1_2.method7945();
											local254 = Static158.aClass1_Sub3_Sub1_2.method7945();
											local258 = Static158.aClass1_Sub3_Sub1_2.method7940();
											if (Static184.method2977(local73)) {
												local5161 = (Class1_Sub38) Static148.aClass91_6.method2271((long) local258);
												if (local5161 != null) {
													Static336.method5001(local5161.anInt7676 != local254, local5161, false);
												}
												Static543.method7388(local258, local254, local208, false);
											}
											Static284.aClass83_193 = null;
											return true;
										} else if (Static284.aClass83_193 == Static515.aClass83_189) {
											local208 = Static158.aClass1_Sub3_Sub1_2.method7940();
											Static439.aClass191_14 = Static361.aClass198_3.method4292(local208);
											Static284.aClass83_193 = null;
											return true;
										} else if (Static373.aClass83_142 == Static284.aClass83_193) {
											local208 = Static158.aClass1_Sub3_Sub1_2.method7971();
											local73 = Static158.aClass1_Sub3_Sub1_2.method7940();
											local254 = Static158.aClass1_Sub3_Sub1_2.method7974();
											local2707 = "";
											local2717 = local2707;
											if ((local254 & 0x1) != 0) {
												local2707 = Static158.aClass1_Sub3_Sub1_2.method7951();
												if ((local254 & 0x2) == 0) {
													local2717 = local2707;
												} else {
													local2717 = Static158.aClass1_Sub3_Sub1_2.method7951();
												}
											}
											local2721 = Static158.aClass1_Sub3_Sub1_2.method7951();
											if (local208 == 99) {
												Static415.method5896(local2721);
											} else if (local2717.equals("") || !Static234.method3456(local2717)) {
												Static308.method4624(local2717, local73, local208, local2707, local2721, local2707);
											} else {
												Static284.aClass83_193 = null;
												return true;
											}
											Static284.aClass83_193 = null;
											return true;
										} else if (Static284.aClass83_193 == Static539.aClass83_194) {
											local208 = Static158.aClass1_Sub3_Sub1_2.method7945();
											local73 = Static158.aClass1_Sub3_Sub1_2.method7974();
											local221 = (local73 & 0x1) == 1;
											while (Static464.anInt8696 > Static158.aClass1_Sub3_Sub1_2.anInt9802) {
												local258 = Static158.aClass1_Sub3_Sub1_2.method7971();
												local262 = Static158.aClass1_Sub3_Sub1_2.method7945();
												local1563 = 0;
												if (local262 != 0) {
													local1563 = Static158.aClass1_Sub3_Sub1_2.method7974();
													if (local1563 == 255) {
														local1563 = Static158.aClass1_Sub3_Sub1_2.method7940();
													}
												}
												Static377.method5457(local208, local1563, local258, local221, local262 - 1);
											}
											Static125.anIntArray98[Static188.anInt3737++ & 0x1F] = local208;
											Static284.aClass83_193 = null;
											return true;
										} else if (Static284.aClass83_193 == Static446.aClass83_168) {
											local208 = Static158.aClass1_Sub3_Sub1_2.method7967();
											local73 = Static158.aClass1_Sub3_Sub1_2.method7946();
											local254 = Static158.aClass1_Sub3_Sub1_2.method7967();
											if (Static184.method2977(local73)) {
												Static445.method6247(local208, local254);
											}
											Static284.aClass83_193 = null;
											return true;
										} else if (Static284.aClass83_193 == Static499.aClass83_182) {
											local208 = Static158.aClass1_Sub3_Sub1_2.method7945();
											local2699 = Static158.aClass1_Sub3_Sub1_2.method7938() == 1;
											if (Static184.method2977(local208)) {
												Static6.aBoolean717 = local2699;
											}
											Static284.aClass83_193 = null;
											return true;
										} else if (Static345.aClass83_206 == Static284.aClass83_193) {
											Static256.method3744(Static122.aClass295_2);
											Static284.aClass83_193 = null;
											return true;
										} else if (Static316.aClass83_116 == Static284.aClass83_193) {
											Static364.anInt8302 = Static259.anInt4739;
											if (Static464.anInt8696 == 0) {
												Static272.aClass254Array1 = null;
												Static7.aString1 = null;
												Static33.anInt723 = 0;
												Static284.aClass83_193 = null;
												Static84.aString15 = null;
												return true;
											}
											Static7.aString1 = Static158.aClass1_Sub3_Sub1_2.method7951();
											local1612 = Static158.aClass1_Sub3_Sub1_2.method7974() == 1;
											if (local1612) {
												Static158.aClass1_Sub3_Sub1_2.method7951();
											}
											@Pc(6671) long local6671 = Static158.aClass1_Sub3_Sub1_2.method7949();
											Static84.aString15 = Static56.method961(local6671);
											Static177.aByte111 = Static158.aClass1_Sub3_Sub1_2.method7963();
											local258 = Static158.aClass1_Sub3_Sub1_2.method7974();
											if (local258 == 255) {
												Static284.aClass83_193 = null;
												return true;
											}
											Static33.anInt723 = local258;
											@Pc(6697) Class254[] local6697 = new Class254[100];
											for (local1563 = 0; local1563 < Static33.anInt723; local1563++) {
												local6697[local1563] = new Class254();
												local6697[local1563].aString76 = Static158.aClass1_Sub3_Sub1_2.method7951();
												local1612 = Static158.aClass1_Sub3_Sub1_2.method7974() == 1;
												if (local1612) {
													local6697[local1563].aString77 = Static158.aClass1_Sub3_Sub1_2.method7951();
												} else {
													local6697[local1563].aString77 = local6697[local1563].aString76;
												}
												local6697[local1563].aString79 = Static583.method7816(local6697[local1563].aString77);
												local6697[local1563].anInt6737 = Static158.aClass1_Sub3_Sub1_2.method7945();
												local6697[local1563].aByte89 = Static158.aClass1_Sub3_Sub1_2.method7963();
												local6697[local1563].aString78 = Static158.aClass1_Sub3_Sub1_2.method7951();
												if (local6697[local1563].aString77.equals(Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aString35)) {
													Static591.aByte130 = local6697[local1563].aByte89;
												}
											}
											local895 = Static33.anInt723;
											while (local895 > 0) {
												local4605 = true;
												local895--;
												for (local606 = 0; local606 < local895; local606++) {
													if (local6697[local606].aString79.compareTo(local6697[local606 + 1].aString79) > 0) {
														local1201 = local6697[local606];
														local6697[local606] = local6697[local606 + 1];
														local4605 = false;
														local6697[local606 + 1] = local1201;
													}
												}
												if (local4605) {
													break;
												}
											}
											Static272.aClass254Array1 = local6697;
											Static284.aClass83_193 = null;
											return true;
										} else {
											Static419.method5957("T1 - " + (Static284.aClass83_193 == null ? -1 : Static284.aClass83_193.method2190()) + "," + (Static169.aClass83_74 == null ? -1 : Static169.aClass83_74.method2190()) + "," + (Static365.aClass83_141 == null ? -1 : Static365.aClass83_141.method2190()) + " - " + Static464.anInt8696, null);
											Static136.method2372(false);
											return true;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Ljava/lang/String;ZZZ)V")
	public static void method3004(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		try {
			label693: {
				if (!arg0.equalsIgnoreCase("commands") && !arg0.equalsIgnoreCase("help")) {
					if (!arg0.equalsIgnoreCase("cls")) {
						if (arg0.equalsIgnoreCase("displayfps")) {
							Static541.aBoolean677 = !Static541.aBoolean677;
							if (Static541.aBoolean677) {
								Static415.method5896("FPS on");
								return;
							}
							Static415.method5896("FPS off");
							return;
						}
						if (arg0.equals("renderer")) {
							@Pc(69) Class141 local69 = Static31.aClass78_18.method6841();
							Static415.method5896("Vendor: " + local69.anInt3807);
							Static415.method5896("Name: " + local69.aString38);
							Static415.method5896("Version: " + local69.anInt3806);
							Static415.method5896("Device: " + local69.aString39);
							Static415.method5896("Driver Version: " + local69.aLong99);
							return;
						}
						if (arg0.equals("heap")) {
							Static415.method5896("Heap: " + Static221.anInt4095 + "MB");
							return;
						}
						break label693;
					}
					Static296.anInt5348 = 0;
					Static232.anInt4308 = 0;
					return;
				}
				Static415.method5896("commands - This command");
				Static415.method5896("cls - Clear console");
				Static415.method5896("displayfps - Toggle FPS and other information");
				Static415.method5896("renderer - Print graphics renderer information");
				Static415.method5896("heap - Print java memory information");
				return;
			}
		} catch (@Pc(137) Exception local137) {
			Static415.method5896(Static375.aClass253_6.method5453(Static161.anInt3095));
			return;
		}
		if (Static76.aClass93_3 != Static405.aClass93_6 || Static203.anInt3822 >= 2) {
			if (arg0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg0.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg0.equalsIgnoreCase("printfps")) {
					Static415.method5896("FPS: " + Static403.anInt7222);
					return;
				}
				if (arg0.equalsIgnoreCase("occlude")) {
					Static204.aBoolean276 = !Static204.aBoolean276;
					if (Static204.aBoolean276) {
						Static415.method5896("Occlsion now on!");
						return;
					}
					Static415.method5896("Occlsion now off!");
					return;
				}
				if (arg0.equalsIgnoreCase("fpson")) {
					Static541.aBoolean677 = true;
					Static415.method5896("fps debug enabled");
					return;
				}
				if (arg0.equalsIgnoreCase("fpsoff")) {
					Static541.aBoolean677 = false;
					Static415.method5896("fps debug disabled");
					return;
				}
				if (arg0.equals("systemmem")) {
					try {
						Static415.method5896("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
						return;
					} catch (@Pc(248) Throwable local248) {
						return;
					}
				}
				if (arg0.equalsIgnoreCase("cleartext")) {
					Static337.aClass196_5.method4031();
					Static415.method5896("Text coords cleared");
					return;
				}
				@Pc(287) int local287;
				@Pc(268) int local268;
				@Pc(277) Runtime local277;
				if (arg0.equalsIgnoreCase("gc")) {
					Static65.method1051();
					for (local268 = 0; local268 < 10; local268++) {
						System.gc();
					}
					local277 = Runtime.getRuntime();
					local287 = (int) ((local277.totalMemory() - local277.freeMemory()) / 1024L);
					Static415.method5896("mem=" + local287 + "k");
					return;
				}
				if (arg0.equalsIgnoreCase("compact")) {
					Static65.method1051();
					for (local268 = 0; local268 < 10; local268++) {
						System.gc();
					}
					local277 = Runtime.getRuntime();
					local287 = (int) ((local277.totalMemory() - local277.freeMemory()) / 1024L);
					Static415.method5896("Memory before cleanup=" + local287 + "k");
					Static264.method3875();
					Static65.method1051();
					for (@Pc(345) int local345 = 0; local345 < 10; local345++) {
						System.gc();
					}
					local287 = (int) ((local277.totalMemory() - local277.freeMemory()) / 1024L);
					Static415.method5896("Memory after cleanup=" + local287 + "k");
					return;
				}
				if (arg0.equalsIgnoreCase("unloadnatives")) {
					Static415.method5896(Static585.method7838() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg0.equalsIgnoreCase("clientdrop")) {
					Static415.method5896("Dropped client connection");
					if (Static55.anInt1068 == 10) {
						Static335.method4988();
						return;
					}
					if (Static55.anInt1068 == 11) {
						Static303.aBoolean438 = true;
					}
					return;
				}
				if (arg0.equalsIgnoreCase("rotateconnectmethods")) {
					Static221.aClass261_3.method5585();
					Static415.method5896("Rotated connection methods");
					return;
				}
				if (arg0.equalsIgnoreCase("clientjs5drop")) {
					Static571.aClass205_3.method4361();
					Static415.method5896("Dropped client js5 net queue");
					return;
				}
				if (arg0.equalsIgnoreCase("serverjs5drop")) {
					Static571.aClass205_3.method4362();
					Static415.method5896("Dropped server js5 net queue");
					return;
				}
				if (arg0.equalsIgnoreCase("breakcon")) {
					Static361.aClass198_3.method4299();
					Static485.aClass43_1.method1043();
					Static571.aClass205_3.method4372();
					Static415.method5896("Breaking new connections for 5 seconds");
					return;
				}
				if (arg0.equalsIgnoreCase("rebuild")) {
					Static207.method3172();
					Static339.method5062();
					Static415.method5896("Rebuilding map");
					return;
				}
				if (arg0.equalsIgnoreCase("rebuildprofile")) {
					Static196.aLong98 = Static480.method6650();
					Static330.aBoolean466 = true;
					Static207.method3172();
					Static339.method5062();
					Static415.method5896("Rebuilding map (with profiling)");
					return;
				}
				if (arg0.equalsIgnoreCase("wm1")) {
					Static447.method6284(-1, false, 1, -1);
					if (Static470.method2475() != 1) {
						Static415.method5896("wm1 failed");
						return;
					}
					Static415.method5896("wm1 succeeded");
					return;
				}
				if (arg0.equalsIgnoreCase("wm2")) {
					Static447.method6284(-1, false, 2, -1);
					if (Static470.method2475() != 2) {
						Static415.method5896("wm2 failed");
						return;
					}
					Static415.method5896("wm2 succeeded");
					return;
				}
				if (arg0.equalsIgnoreCase("wm3")) {
					Static447.method6284(768, false, 3, 1024);
					if (Static470.method2475() == 3) {
						Static415.method5896("wm3 succeeded");
						return;
					}
					Static415.method5896("wm3 failed");
					return;
				}
				if (arg0.equalsIgnoreCase("tk0")) {
					Static358.method7632(0);
					if (Static286.anInt5239 != 0) {
						Static415.method5896("Failed to enter tk0");
						return;
					}
					Static415.method5896("Entered tk0");
					Static86.aClass1_Sub30_Sub1_1.anInt6200 = 0;
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("tk1")) {
					Static358.method7632(1);
					if (Static286.anInt5239 == 1) {
						Static415.method5896("Entered tk1");
						Static86.aClass1_Sub30_Sub1_1.anInt6200 = 1;
						Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
						Static518.aBoolean696 = false;
						return;
					}
					Static415.method5896("Failed to enter tk1");
					return;
				}
				if (arg0.equalsIgnoreCase("tk2")) {
					Static358.method7632(2);
					if (Static286.anInt5239 != 2) {
						Static415.method5896("Failed to enter tk2");
						return;
					}
					Static415.method5896("Entered tk2");
					Static86.aClass1_Sub30_Sub1_1.anInt6200 = 2;
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("tk3")) {
					Static358.method7632(3);
					if (Static286.anInt5239 != 3) {
						Static415.method5896("Failed to enter tk3");
						return;
					}
					Static415.method5896("Entered tk3");
					Static86.aClass1_Sub30_Sub1_1.anInt6200 = 3;
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("tk5")) {
					Static358.method7632(5);
					if (Static286.anInt5239 != 5) {
						Static415.method5896("Failed to enter tk5");
						return;
					}
					Static415.method5896("Entered tk5");
					Static86.aClass1_Sub30_Sub1_1.anInt6200 = 5;
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("ot")) {
					Static86.aClass1_Sub30_Sub1_1.aBoolean484 = !Static86.aClass1_Sub30_Sub1_1.aBoolean484;
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					Static207.method3172();
					Static415.method5896("ot=" + Static86.aClass1_Sub30_Sub1_1.aBoolean484);
					return;
				}
				if (arg0.equalsIgnoreCase("gb")) {
					Static86.aClass1_Sub30_Sub1_1.aBoolean480 = !Static86.aClass1_Sub30_Sub1_1.aBoolean480;
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					Static207.method3172();
					Static415.method5896("gb=" + Static86.aClass1_Sub30_Sub1_1.aBoolean480);
					return;
				}
				@Pc(782) int local782;
				if (arg0.startsWith("shadows")) {
					if (arg0.length() < 8) {
						Static415.method5896("Invalid shadows value");
						return;
					}
					@Pc(772) String local772 = arg0.substring(8);
					local782 = Static570.method7674(local772) ? Static216.method3234(local772) : -1;
					if (local782 >= 0 && local782 <= 2) {
						Static86.aClass1_Sub30_Sub1_1.method5022(local782, Static286.anInt5239);
						Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
						Static518.aBoolean696 = false;
						Static207.method3172();
						Static415.method5896("shadows=" + local782);
						return;
					}
					Static415.method5896("Invalid shadows value");
					return;
				}
				if (arg0.startsWith("textures")) {
					Static86.aClass1_Sub30_Sub1_1.aBoolean475 = !Static86.aClass1_Sub30_Sub1_1.aBoolean475;
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					Static308.method4625();
					Static207.method3172();
					Static415.method5896("textures=" + Static86.aClass1_Sub30_Sub1_1.aBoolean475);
					return;
				}
				if (arg0.startsWith("lighting")) {
					Static86.aClass1_Sub30_Sub1_1.method5024(!Static86.aClass1_Sub30_Sub1_1.method5019(Static286.anInt5239), Static286.anInt5239);
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					Static585.method7837();
					Static308.method4625();
					Static207.method3172();
					Static415.method5896("lighting=" + Static86.aClass1_Sub30_Sub1_1.method5019(Static286.anInt5239));
					return;
				}
				if (arg0.startsWith("setba")) {
					if (arg0.length() < 6) {
						Static415.method5896("Invalid buildarea value");
						return;
					}
					local268 = Static216.method3234(arg0.substring(6));
					if (local268 >= 0 && local268 <= Static523.method6293(Static221.anInt4095)) {
						Static86.aClass1_Sub30_Sub1_1.anInt6197 = local268;
						Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
						Static518.aBoolean696 = false;
						Static415.method5896("maxbuildarea=" + Static86.aClass1_Sub30_Sub1_1.anInt6197);
						return;
					}
					Static415.method5896("Invalid buildarea value");
					return;
				}
				if (arg0.startsWith("rect_debug")) {
					if (arg0.length() < 10) {
						Static415.method5896("Invalid rect_debug value");
						return;
					}
					Static235.anInt4324 = Static216.method3234(arg0.substring(10).trim());
					Static415.method5896("rect_debug=" + Static235.anInt4324);
					return;
				}
				if (arg0.equalsIgnoreCase("qa_op_test")) {
					Static506.aBoolean659 = true;
					Static415.method5896("qa_op_test=" + Static506.aBoolean659);
					return;
				}
				if (arg0.equalsIgnoreCase("clipcomponents")) {
					Static556.aBoolean690 = !Static556.aBoolean690;
					Static415.method5896("clipcomponents=" + Static556.aBoolean690);
					return;
				}
				if (arg0.startsWith("bloom")) {
					@Pc(1020) boolean local1020 = Static31.aClass78_18.method6802();
					if (!Static165.method2704(!local1020)) {
						Static415.method5896("Failed to enable bloom");
						return;
					}
					if (local1020) {
						Static415.method5896("Bloom disabled");
						return;
					}
					Static415.method5896("Bloom enabled");
					return;
				}
				if (arg0.equalsIgnoreCase("tween")) {
					if (!Static503.aBoolean658) {
						Static503.aBoolean658 = true;
						Static415.method5896("Forced tweening ENABLED!");
						return;
					}
					Static503.aBoolean658 = false;
					Static415.method5896("Forced tweening disabled.");
					return;
				}
				if (arg0.equalsIgnoreCase("shiftclick")) {
					if (!Static240.aBoolean315) {
						Static415.method5896("Shift-click ENABLED!");
						Static240.aBoolean315 = true;
						return;
					}
					Static415.method5896("Shift-click disabled.");
					Static240.aBoolean315 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("getcgcoord")) {
					Static415.method5896("x:" + (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8902 >> 9) + " z:" + (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8906 >> 9));
					return;
				}
				if (arg0.equalsIgnoreCase("getheight")) {
					Static415.method5896("Height: " + Static310.aClass129Array5[Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113].method6481(Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8906 >> 9, Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8902 >> 9));
					return;
				}
				if (arg0.equalsIgnoreCase("resetminimap")) {
					Static121.aClass308_48.method6561();
					Static121.aClass308_48.method6543();
					Static191.aClass33_2.method791();
					Static144.aClass113_1.method2590();
					Static339.method5062();
					Static415.method5896("Minimap reset");
					return;
				}
				if (arg0.startsWith("mc")) {
					if (!Static31.aClass78_18.method6845()) {
						Static415.method5896("Current toolkit doesn't support multiple cores");
						return;
					}
					local268 = Integer.parseInt(arg0.substring(3));
					if (local268 < 1) {
						local268 = 1;
					} else if (local268 > 4) {
						local268 = 4;
					}
					Static23.anInt574 = local268;
					Static207.method3172();
					Static415.method5896("Render cores now: " + Static23.anInt574);
					return;
				}
				if (arg0.startsWith("cachespace")) {
					Static415.method5896("I(s): " + Static79.aClass207_5.method4388() + "/" + Static79.aClass207_5.method4393());
					Static415.method5896("I(m): " + Static301.aClass207_29.method4388() + "/" + Static301.aClass207_29.method4393());
					Static415.method5896("O(s): " + Static230.aClass225_1.aClass63_1.method1411() + "/" + Static230.aClass225_1.aClass63_1.method1404());
					return;
				}
				if (arg0.equalsIgnoreCase("getcamerapos")) {
					Static415.method5896("Pos: " + Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113 + "," + ((Static393.anInt6978 >> 9) + Static539.anInt9045 >> 6) + "," + ((Static78.anInt1534 >> 9) + Static311.anInt5708 >> 6) + "," + ((Static393.anInt6978 >> 9) + Static539.anInt9045 & 0x3F) + "," + ((Static78.anInt1534 >> 9) + Static311.anInt5708 & 0x3F) + " Height: " + (Static538.method6114(Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113, Static78.anInt1534, Static393.anInt6978) - Static20.anInt542));
					Static415.method5896("Look: " + Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113 + "," + (Static539.anInt9045 + Static506.anInt8778 >> 6) + "," + (Static311.anInt5708 + Static57.anInt1083 >> 6) + "," + (Static539.anInt9045 + Static506.anInt8778 & 0x3F) + "," + (Static311.anInt5708 + Static57.anInt1083 & 0x3F) + " Height: " + (Static538.method6114(Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113, Static57.anInt1083, Static506.anInt8778) - Static157.anInt2976));
					return;
				}
				if (arg0.equals("renderprofile") || arg0.equals("rp")) {
					Static169.aBoolean233 = !Static169.aBoolean233;
					Static31.aClass78_18.method6852(Static169.aBoolean233);
					Static480.method6649();
					Static415.method5896("showprofiling=" + Static169.aBoolean233);
					return;
				}
				@Pc(1422) String[] local1422;
				if (arg0.startsWith("performancetest")) {
					local268 = -1;
					local782 = 1000;
					if (arg0.length() > 15) {
						local1422 = Static95.method1438(arg0, ' ');
						try {
							if (local1422.length > 1) {
								local782 = Integer.parseInt(local1422[1]);
							}
						} catch (@Pc(1435) Throwable local1435) {
						}
						try {
							if (local1422.length > 2) {
								local268 = Integer.parseInt(local1422[2]);
							}
						} catch (@Pc(1446) Throwable local1446) {
						}
					}
					if (local268 == -1) {
						Static415.method5896("Java toolkit: " + Static271.method3981(local782, 0));
						Static415.method5896("SSE toolkit:  " + Static271.method3981(local782, 2));
						Static415.method5896("D3D toolkit:  " + Static271.method3981(local782, 3));
						Static415.method5896("GL toolkit:   " + Static271.method3981(local782, 1));
						Static415.method5896("GLX toolkit:  " + Static271.method3981(local782, 5));
						return;
					}
					Static415.method5896("Performance: " + Static271.method3981(local782, Static286.anInt5239));
					return;
				}
				if (arg0.equals("nonpcs")) {
					Static332.aBoolean467 = !Static332.aBoolean467;
					Static415.method5896("nonpcs=" + Static332.aBoolean467);
					return;
				}
				if (arg0.equals("autoworld")) {
					Static338.method5037();
					Static415.method5896("auto world selected");
					return;
				}
				if (arg0.startsWith("switchworld")) {
					local268 = Integer.parseInt(arg0.substring(12));
					Static247.method3623(Static160.method2621(local268).aString92, local268);
					Static415.method5896("switched");
					return;
				}
				if (arg0.equals("getworld")) {
					Static415.method5896("w: " + Static221.aClass261_3.anInt6921);
					return;
				}
				@Pc(1600) Class1_Sub9 local1600;
				if (arg0.startsWith("pc")) {
					local1600 = Static123.method2194(Static469.aClass235_2, Static207.aClass208_48);
					local1600.aClass1_Sub3_Sub1_1.method7917(0);
					local782 = local1600.aClass1_Sub3_Sub1_1.anInt9802;
					local287 = arg0.indexOf(" ", 4);
					local1600.aClass1_Sub3_Sub1_1.method7920(arg0.substring(3, local287));
					Static228.method3396(arg0.substring(local287), local1600.aClass1_Sub3_Sub1_1);
					local1600.aClass1_Sub3_Sub1_1.method7947(local1600.aClass1_Sub3_Sub1_1.anInt9802 - local782);
					Static42.method746(local1600);
					return;
				}
				if (arg0.equals("savevarcs")) {
					Static132.method2304();
					Static415.method5896("perm varcs saved");
					return;
				}
				if (arg0.equals("scramblevarcs")) {
					for (local268 = 0; local268 < Static250.anIntArray251.length; local268++) {
						if (Static166.aBooleanArray34[local268]) {
							Static250.anIntArray251[local268] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static250.anIntArray251[local268] *= -1;
							}
						}
					}
					Static132.method2304();
					Static415.method5896("perm varcs scrambled");
					return;
				}
				if (arg0.equals("showcolmap")) {
					Static24.aBoolean35 = true;
					Static339.method5062();
					Static415.method5896("colmap is shown");
					return;
				}
				if (arg0.equals("hidecolmap")) {
					Static24.aBoolean35 = false;
					Static339.method5062();
					Static415.method5896("colmap is hidden");
					return;
				}
				if (arg0.equals("resetcache")) {
					Static412.method5871();
					Static415.method5896("Caches reset");
					return;
				}
				if (arg0.equals("profilecpu")) {
					Static415.method5896(Static228.method3400() + "ms");
					return;
				}
				if (arg0.startsWith("getclientvarpbit")) {
					local268 = Integer.parseInt(arg0.substring(17));
					Static415.method5896("varpbit=" + Static390.aClass353_29.method7619(local268));
					return;
				}
				if (arg0.startsWith("getclientvarp")) {
					local268 = Integer.parseInt(arg0.substring(14));
					Static415.method5896("varp=" + Static390.aClass353_29.method7618(local268));
					return;
				}
				if (arg0.startsWith("demologin")) {
					Static188.method3045(false, 0);
					return;
				}
				if (arg0.startsWith("newdemologin")) {
					Static188.method3045(true, 0);
					return;
				}
				if (arg0.startsWith("directlogin")) {
					@Pc(1822) String[] local1822 = Static95.method1438(arg0.substring(12), ' ');
					if (local1822.length >= 2) {
						local782 = local1822.length > 2 ? Integer.parseInt(local1822[2]) : 0;
						Static372.method5444(local1822[0], local1822[1], local782);
						return;
					}
				}
				if (arg0.startsWith("csprofileclear")) {
					Static451.method6305();
					return;
				}
				if (arg0.startsWith("csprofileoutputc")) {
					Static451.method6307();
					return;
				}
				if (arg0.startsWith("csprofileoutputt")) {
					Static451.method6307();
					return;
				}
				if (arg0.startsWith("texsize")) {
					local268 = Integer.parseInt(arg0.substring(8));
					Static31.aClass78_18.method6839(local268);
					return;
				}
				if (arg0.equals("soundstreamcount")) {
					Static415.method5896("Active streams: " + Static425.aClass1_Sub6_Sub3_2.method6529());
					return;
				}
				if (arg0.equals("autosetup")) {
					Static86.aClass1_Sub30_Sub1_1.method5025();
					Static415.method5896("Complete. Toolkit now: " + Static286.anInt5239);
					return;
				}
				if (arg0.equals("errormessage")) {
					Static415.method5896(Static475.aClient1.method1084());
					return;
				}
				if (arg0.equals("heapdump")) {
					if (Static285.aString59.startsWith("win")) {
						Static94.method5761(new File("C:\\Temp\\heap.dump"));
					} else {
						Static94.method5761(new File("/tmp/heap.dump"));
					}
					Static415.method5896("Done");
					return;
				}
				if (arg0.equals("os")) {
					Static415.method5896("Name: " + Static285.aString59);
					Static415.method5896("Arch: " + Static285.aString57);
					Static415.method5896("Ver: " + Static285.aString63);
					return;
				}
				if (arg0.startsWith("w2debug")) {
					local268 = Integer.parseInt(arg0.substring(8, 9));
					Static402.anInt7196 = local268;
					Static207.method3172();
					Static415.method5896("Toggled!");
					return;
				}
				@Pc(2018) File local2018;
				if (arg0.startsWith("setoutput ")) {
					local2018 = new File(arg0.substring(10));
					if (local2018.exists()) {
						local2018 = new File(arg0.substring(10) + "." + Static480.method6650() + ".log");
						if (local2018.exists()) {
							Static415.method5896("file already exists!");
							return;
						}
					}
					if (Static467.aFileOutputStream2 != null) {
						Static467.aFileOutputStream2.close();
						Static467.aFileOutputStream2 = null;
					}
					try {
						Static467.aFileOutputStream2 = new FileOutputStream(local2018);
						return;
					} catch (@Pc(2060) FileNotFoundException local2060) {
						Static415.method5896("Could not create " + local2018.getName());
						return;
					} catch (@Pc(2072) SecurityException local2072) {
						Static415.method5896("Cannot write to " + local2018.getName());
						return;
					}
				}
				if (arg0.equals("closeoutput")) {
					if (Static467.aFileOutputStream2 != null) {
						Static467.aFileOutputStream2.close();
					}
					Static467.aFileOutputStream2 = null;
					return;
				}
				if (arg0.startsWith("runscript ")) {
					local2018 = new File(arg0.substring(10));
					if (!local2018.exists()) {
						Static415.method5896("No such file");
						return;
					}
					@Pc(2116) byte[] local2116 = Static250.method3664(local2018);
					if (local2116 == null) {
						Static415.method5896("Failed to read file");
						return;
					}
					local1422 = Static95.method1438(Static201.method3095("", Static316.method4702(local2116)), '\n');
					Static94.method5764(local1422);
					return;
				}
				if (Static55.anInt1068 == 10) {
					local1600 = Static123.method2194(Static469.aClass235_2, Static588.aClass208_111);
					local1600.aClass1_Sub3_Sub1_1.method7917(arg0.length() + 3);
					local1600.aClass1_Sub3_Sub1_1.method7917(arg2 ? 1 : 0);
					local1600.aClass1_Sub3_Sub1_1.method7917(arg1 ? 1 : 0);
					local1600.aClass1_Sub3_Sub1_1.method7920(arg0);
					Static42.method746(local1600);
				}
				if (arg0.startsWith("fps ") && Static76.aClass93_3 != Static405.aClass93_6) {
					Static524.method1204(Static216.method3234(arg0.substring(4)));
					return;
				}
			} catch (@Pc(2199) Exception local2199) {
				Static415.method5896(Static375.aClass253_6.method5453(Static161.anInt3095));
				return;
			}
		}
		if (Static55.anInt1068 != 10) {
			Static415.method5896(Static375.aClass253_7.method5453(Static161.anInt3095) + arg0);
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIIIZIIII)V")
	public static void method3005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static67.method1102(arg7)) {
			if (Static549.aClass160ArrayArray2[arg7] == null) {
				Static377.method5460(arg3, Static115.aClass160ArrayArray1[arg7], arg6, -1, arg4, arg1, arg5, arg2, arg0);
			} else {
				Static377.method5460(arg3, Static549.aClass160ArrayArray2[arg7], arg6, -1, arg4, arg1, arg5, arg2, arg0);
			}
		} else if (arg4 == -1) {
			for (@Pc(23) int local23 = 0; local23 < 100; local23++) {
				Static73.aBooleanArray6[local23] = true;
			}
		} else {
			Static73.aBooleanArray6[arg4] = true;
		}
	}

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "(III)Z")
	public static boolean method3006(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}
}
