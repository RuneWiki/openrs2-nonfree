import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!pd", name = "ab", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1193 = null;

	@OriginalMember(owner = "client!pd", name = "db", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1194 = Static64.method1101("Schlie-8en");

	@OriginalMember(owner = "client!pd", name = "gb", descriptor = "Z")
	public static boolean aBoolean161 = false;

	@OriginalMember(owner = "client!pd", name = "ib", descriptor = "Z")
	public static boolean aBoolean162 = false;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!mb;III)Lclient!fe;")
	public static Class41_Sub1 method2646(@OriginalArg(0) Class70 arg0, @OriginalArg(3) int arg1) {
		return Static36.method640(arg1, arg0) ? Static181.method3051() : null;
	}

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "(I)Z")
	public static boolean method2647() {
		@Pc(8) long local8 = Static144.method2489();
		@Pc(14) int local14 = (int) (local8 - Static176.aLong132);
		if (local14 > 200) {
			local14 = 200;
		}
		Static176.aLong132 = local8;
		Static188.anInt4066 += local14;
		if (Static216.anInt4584 == 0 && Static227.anInt4783 == 0 && Static201.anInt4257 == 0 && Static144.anInt3150 == 0) {
			return true;
		} else if (Static81.aClass11_15 == null) {
			return false;
		} else {
			try {
				if (Static188.anInt4066 > 30000) {
					throw new IOException();
				}
				@Pc(64) Class1_Sub2_Sub8 local64;
				@Pc(69) Class1_Sub16 local69;
				while (Static227.anInt4783 < 20 && Static144.anInt3150 > 0) {
					local64 = (Class1_Sub2_Sub8) Static146.aClass102_5.method3086();
					local69 = new Class1_Sub16(4);
					local69.method3765(1);
					local69.method3761((int) local64.aLong170);
					Static81.aClass11_15.method269(4, local69.aByteArray62);
					Static113.aClass102_13.method3083(local64, local64.aLong170);
					Static144.anInt3150--;
					Static227.anInt4783++;
				}
				while (Static216.anInt4584 < 20 && Static201.anInt4257 > 0) {
					local64 = (Class1_Sub2_Sub8) Static2.aClass116_1.method3453();
					local69 = new Class1_Sub16(4);
					local69.method3765(0);
					local69.method3761((int) local64.aLong170);
					Static81.aClass11_15.method269(4, local69.aByteArray62);
					local64.method3318();
					Static50.aClass102_7.method3083(local64, local64.aLong170);
					Static216.anInt4584++;
					Static201.anInt4257--;
				}
				for (@Pc(168) int local168 = 0; local168 < 100; local168++) {
					@Pc(174) int local174 = Static81.aClass11_15.method273();
					if (local174 < 0) {
						throw new IOException();
					}
					if (local174 == 0) {
						break;
					}
					Static188.anInt4066 = 0;
					@Pc(192) byte local192 = 0;
					if (Static79.aClass1_Sub2_Sub8_1 == null) {
						local192 = 8;
					} else if (Static127.anInt2864 == 0) {
						local192 = 1;
					}
					@Pc(222) int local222;
					@Pc(214) int local214;
					@Pc(259) int local259;
					@Pc(335) int local335;
					if (local192 <= 0) {
						local214 = 512 - Static127.anInt2864;
						local222 = Static61.aClass1_Sub16_3.aByteArray62.length - Static79.aClass1_Sub2_Sub8_1.aByte5;
						if (local214 > local222 - Static61.aClass1_Sub16_3.anInt4860) {
							local214 = local222 - Static61.aClass1_Sub16_3.anInt4860;
						}
						if (local174 < local214) {
							local214 = local174;
						}
						Static81.aClass11_15.method274(Static61.aClass1_Sub16_3.aByteArray62, Static61.aClass1_Sub16_3.anInt4860, local214);
						if (Static149.aByte14 != 0) {
							for (local259 = 0; local259 < local214; local259++) {
								Static61.aClass1_Sub16_3.aByteArray62[Static61.aClass1_Sub16_3.anInt4860 + local259] = (byte) (Static61.aClass1_Sub16_3.aByteArray62[Static61.aClass1_Sub16_3.anInt4860 + local259] ^ Static149.aByte14);
							}
						}
						Static61.aClass1_Sub16_3.anInt4860 += local214;
						Static127.anInt2864 += local214;
						if (local222 == Static61.aClass1_Sub16_3.anInt4860) {
							if (Static79.aClass1_Sub2_Sub8_1.aLong170 == 16711935L) {
								Static38.aClass1_Sub16_1 = Static61.aClass1_Sub16_3;
								for (local259 = 0; local259 < 256; local259++) {
									@Pc(322) Class70_Sub1 local322 = Static144.aClass70_Sub1Array1[local259];
									if (local322 != null) {
										Static38.aClass1_Sub16_1.anInt4860 = local259 * 8 + 5;
										local335 = Static38.aClass1_Sub16_1.method3784();
										@Pc(339) int local339 = Static38.aClass1_Sub16_1.method3784();
										local322.method3547(local339, local335);
									}
								}
							} else {
								Static58.aCRC32_1.reset();
								Static58.aCRC32_1.update(Static61.aClass1_Sub16_3.aByteArray62, 0, local222);
								local259 = (int) Static58.aCRC32_1.getValue();
								if (local259 != Static79.aClass1_Sub2_Sub8_1.anInt1664) {
									try {
										Static81.aClass11_15.method271();
									} catch (@Pc(371) Exception local371) {
									}
									Static81.aClass11_15 = null;
									Static157.anInt3434++;
									Static149.aByte14 = (byte) (Math.random() * 255.0D + 1.0D);
									return false;
								}
								Static157.anInt3434 = 0;
								Static71.anInt1634 = 0;
								Static79.aClass1_Sub2_Sub8_1.aClass70_Sub1_19.method3544(Static202.aBoolean193, (int) (Static79.aClass1_Sub2_Sub8_1.aLong170 & 0xFFFFL), (Static79.aClass1_Sub2_Sub8_1.aLong170 & 0xFF0000L) == 16711680L, Static61.aClass1_Sub16_3.aByteArray62);
							}
							Static79.aClass1_Sub2_Sub8_1.method3758();
							if (Static202.aBoolean193) {
								Static227.anInt4783--;
							} else {
								Static216.anInt4584--;
							}
							Static79.aClass1_Sub2_Sub8_1 = null;
							Static127.anInt2864 = 0;
							Static61.aClass1_Sub16_3 = null;
						} else {
							if (Static127.anInt2864 != 512) {
								break;
							}
							Static127.anInt2864 = 0;
						}
					} else {
						local222 = local192 - Static174.aClass1_Sub16_5.anInt4860;
						if (local222 > local174) {
							local222 = local174;
						}
						Static81.aClass11_15.method274(Static174.aClass1_Sub16_5.aByteArray62, Static174.aClass1_Sub16_5.anInt4860, local222);
						if (Static149.aByte14 != 0) {
							for (local214 = 0; local214 < local222; local214++) {
								Static174.aClass1_Sub16_5.aByteArray62[Static174.aClass1_Sub16_5.anInt4860 + local214] = (byte) (Static174.aClass1_Sub16_5.aByteArray62[Static174.aClass1_Sub16_5.anInt4860 + local214] ^ Static149.aByte14);
							}
						}
						Static174.aClass1_Sub16_5.anInt4860 += local222;
						if (Static174.aClass1_Sub16_5.anInt4860 < local192) {
							break;
						}
						if (Static79.aClass1_Sub2_Sub8_1 == null) {
							Static174.aClass1_Sub16_5.anInt4860 = 0;
							local214 = Static174.aClass1_Sub16_5.method3793();
							local259 = Static174.aClass1_Sub16_5.method3805();
							@Pc(527) int local527 = Static174.aClass1_Sub16_5.method3793();
							local335 = Static174.aClass1_Sub16_5.method3784();
							@Pc(539) long local539 = (long) ((local214 << 16) + local259);
							@Pc(545) Class1_Sub2_Sub8 local545 = (Class1_Sub2_Sub8) Static113.aClass102_13.method3093(local539);
							Static202.aBoolean193 = true;
							if (local545 == null) {
								local545 = (Class1_Sub2_Sub8) Static50.aClass102_7.method3093(local539);
								Static202.aBoolean193 = false;
							}
							if (local545 == null) {
								throw new IOException();
							}
							@Pc(572) int local572 = local527 == 0 ? 5 : 9;
							Static79.aClass1_Sub2_Sub8_1 = local545;
							Static61.aClass1_Sub16_3 = new Class1_Sub16(Static79.aClass1_Sub2_Sub8_1.aByte5 + local572 + local335);
							Static61.aClass1_Sub16_3.method3765(local527);
							Static61.aClass1_Sub16_3.method3808(local335);
							Static127.anInt2864 = 8;
							Static174.aClass1_Sub16_5.anInt4860 = 0;
						} else if (Static127.anInt2864 == 0) {
							if (Static174.aClass1_Sub16_5.aByteArray62[0] == -1) {
								Static127.anInt2864 = 1;
								Static174.aClass1_Sub16_5.anInt4860 = 0;
							} else {
								Static79.aClass1_Sub2_Sub8_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(629) IOException local629) {
				try {
					Static81.aClass11_15.method271();
				} catch (@Pc(634) Exception local634) {
				}
				Static71.anInt1634++;
				Static81.aClass11_15 = null;
				return false;
			}
		}
	}
}
