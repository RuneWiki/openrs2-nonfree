import java.awt.event.ActionEvent;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!lh", name = "A", descriptor = "Lclient!kf;")
	public static Class90 aClass90_4;

	@OriginalMember(owner = "client!lh", name = "r", descriptor = "[I")
	public static int[] anIntArray263 = new int[14];

	@OriginalMember(owner = "client!lh", name = "B", descriptor = "Lclient!gj;")
	public static Class59 aClass59_26 = new Class59();

	@OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
	public static int anInt3143 = 0;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "([ILclient!o;I[I[I)V")
	public static void method2732(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class15_Sub5_Sub1 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
			@Pc(24) int local24 = arg2[local3];
			@Pc(28) int local28 = arg3[local3];
			@Pc(32) int local32 = arg0[local3];
			@Pc(34) int local34 = 0;
			while (local28 != 0 && arg1.aClass14Array3.length > local34) {
				if ((local28 & 0x1) != 0) {
					if (local24 == -1) {
						arg1.aClass14Array3[local34] = null;
					} else {
						@Pc(58) Class157 local58 = Static80.method1561(local24);
						@Pc(61) int local61 = local58.anInt4524;
						@Pc(66) Class14 local66 = arg1.aClass14Array3[local34];
						if (local66 != null) {
							if (local66.anInt236 == local24) {
								if (local61 == 0) {
									local66 = arg1.aClass14Array3[local34] = null;
								} else if (local61 == 1) {
									local66.anInt232 = 0;
									local66.anInt226 = local32;
									local66.anInt227 = 0;
									local66.anInt229 = 0;
									local66.anInt234 = 1;
									Static31.method503(local58, 0, arg1.anInt5557, false, arg1.anInt5559);
								} else if (local61 == 2) {
									local66.anInt227 = 0;
								}
							} else if (local58.anInt4512 >= Static80.method1561(local66.anInt236).anInt4512) {
								local66 = arg1.aClass14Array3[local34] = null;
							}
						}
						if (local66 == null) {
							local66 = arg1.aClass14Array3[local34] = new Class14();
							local66.anInt234 = 1;
							local66.anInt227 = 0;
							local66.anInt226 = local32;
							local66.anInt236 = local24;
							local66.anInt229 = 0;
							local66.anInt232 = 0;
							Static31.method503(local58, 0, arg1.anInt5557, false, arg1.anInt5559);
						}
					}
				}
				local34++;
				local28 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/Throwable;BLjava/lang/String;)V")
	public static void method2733(@OriginalArg(0) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(13) String local13 = "";
			if (arg0 != null) {
				local13 = Static43.method809(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local13 = local13 + " | ";
				}
				local13 = local13 + arg1;
			}
			Static239.method3682(local13);
			local13 = Static74.method1468(":", "%3a", local13);
			local13 = Static74.method1468("@", "%40", local13);
			local13 = Static74.method1468("&", "%26", local13);
			local13 = Static74.method1468("#", "%23", local13);
			if (Static196.aClass154_3.anApplet1 == null) {
				return;
			}
			@Pc(114) Class185 local114 = Static196.aClass154_3.method3890(new URL(Static196.aClass154_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static111.anInt2298 + "&u=" + Static8.aLong11 + "&v1=" + Static246.aString262 + "&v2=" + Static246.aString261 + "&e=" + local13));
			while (local114.anInt5276 == 0) {
				Static282.method4345(1L);
			}
			if (local114.anInt5276 == 1) {
				@Pc(135) DataInputStream local135 = (DataInputStream) local114.anObject6;
				local135.read();
				local135.close();
			}
		} catch (@Pc(142) Exception local142) {
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLclient!lf;)V")
	public static void method2734(@OriginalArg(1) Class1_Sub14 arg0) {
		@Pc(5) byte[][] local5 = new byte[Static109.anInt4234][Static109.anInt4231];
		@Pc(19) int local19 = Static109.anInt4230 >> 2 << 10;
		@Pc(27) int local27 = Static109.anInt4233 >> 1;
		@Pc(35) int local35;
		@Pc(123) int local123;
		@Pc(136) int local136;
		while (arg0.aByteArray17.length > arg0.anInt1480) {
			local35 = 0;
			@Pc(37) boolean local37 = false;
			@Pc(39) int local39 = 0;
			if (arg0.method1378() == 1) {
				local37 = true;
				local35 = arg0.method1378();
				local39 = arg0.method1378();
			}
			@Pc(59) int local59 = arg0.method1378();
			@Pc(63) int local63 = arg0.method1378();
			@Pc(74) int local74 = Static109.anInt4232 + Static109.anInt4231 - local63 * 64 - 1;
			@Pc(81) int local81 = local59 * 64 - Static109.anInt4229;
			if (local81 >= 0 && local74 - 63 >= 0 && local81 + 63 < Static109.anInt4234 && local74 < Static109.anInt4231) {
				for (local123 = 0; local123 < 64; local123++) {
					@Pc(134) byte[] local134 = local5[local123 + local81];
					for (local136 = 0; local136 < 64; local136++) {
						if (!local37 || local35 * 8 <= local123 && local123 < local35 * 8 + 8 && local136 >= local39 * 8 && local136 < local39 * 8 + 8) {
							local134[local74 - local136] = arg0.method1363();
						}
					}
				}
			} else if (local37) {
				arg0.anInt1480 += 64;
			} else {
				arg0.anInt1480 += 4096;
			}
		}
		@Pc(194) int local194 = Static109.anInt4234;
		local35 = Static109.anInt4231;
		@Pc(199) int[] local199 = new int[local35];
		@Pc(202) int[] local202 = new int[local35];
		@Pc(205) int[] local205 = new int[local35];
		@Pc(208) int[] local208 = new int[local35];
		@Pc(211) int[] local211 = new int[local35];
		for (local123 = -5; local123 < local194; local123++) {
			if ((local123 & 0x1FF) == 0) {
				Static157.method1360(true);
			}
			@Pc(249) int local249;
			@Pc(313) int local313;
			for (@Pc(227) int local227 = 0; local227 < local35; local227++) {
				local136 = local123 + 5;
				@Pc(296) int local296;
				if (local136 < local194) {
					local249 = local5[local136][local227] & 0xFF;
					if (local249 > 0) {
						@Pc(260) Class74 local260 = Static75.method1479(local249 - 1);
						local199[local227] += local260.anInt2479;
						local202[local227] += local260.anInt2483;
						local205[local227] += local260.anInt2484;
						local208[local227] += local260.anInt2477;
						local296 = local211[local227]++;
					}
				}
				local249 = local123 - 5;
				if (local249 >= 0) {
					local313 = local5[local249][local227] & 0xFF;
					if (local313 > 0) {
						@Pc(322) Class74 local322 = Static75.method1479(local313 - 1);
						local199[local227] -= local322.anInt2479;
						local202[local227] -= local322.anInt2483;
						local205[local227] -= local322.anInt2484;
						local208[local227] -= local322.anInt2477;
						local296 = local211[local227]--;
					}
				}
			}
			if (local123 >= 0) {
				@Pc(372) int[][] local372 = Static109.anIntArrayArrayArray12[local123 >> 6];
				local249 = 0;
				local136 = 0;
				local313 = 0;
				@Pc(380) int local380 = 0;
				@Pc(382) int local382 = 0;
				for (@Pc(384) int local384 = -5; local384 < local35; local384++) {
					@Pc(391) int local391 = local384 - 5;
					@Pc(395) int local395 = local384 + 5;
					if (local395 < local35) {
						local380 += local211[local395];
						local382 += local208[local395];
						local249 += local202[local395];
						local313 += local205[local395];
						local136 += local199[local395];
					}
					if (local391 >= 0) {
						local382 -= local208[local391];
						local249 -= local202[local391];
						local380 -= local211[local391];
						local313 -= local205[local391];
						local136 -= local199[local391];
					}
					if (local384 >= 0 && local380 > 0) {
						@Pc(479) int[] local479 = local372[local384 >> 6];
						@Pc(500) int local500 = local382 == 0 ? 0 : Static154.method2641(local136 * 256 / local382, local249 / local380, local313 / local380);
						if (local5[local123][local384] != 0) {
							@Pc(512) int local512 = (local500 & 0x7F) + local27;
							if (local512 < 0) {
								local512 = 0;
							} else if (local512 > 127) {
								local512 = 127;
							}
							@Pc(542) int local542 = (local500 & 0x380) + (local500 + local19 & 0xFC00) + local512;
							if (local479 == null) {
								local479 = local372[local384 >> 6] = new int[4096];
							}
							local479[((local384 & 0x3F) << 6) + (local123 & 0x3F)] = Static215.anIntArray340[Static180.method2983(96, local542)];
						} else if (local479 != null) {
							local479[((local384 & 0x3F) << 6) + (local123 & 0x3F)] = 0;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!rj;Ljava/lang/Object;)V")
	public static void method2736(@OriginalArg(1) Class154 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < 50 && arg0.anEventQueue1.peekEvent() != null; local13++) {
			Static282.method4345(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)Z")
	public static boolean method2737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static249.aBoolean307) {
			return false;
		}
		@Pc(13) int local13 = arg0 & 0xFFFF;
		@Pc(17) int local17 = arg0 >> 16;
		if (Static274.aClass66ArrayArray1[local17] == null || Static274.aClass66ArrayArray1[local17][local13] == null) {
			return false;
		}
		@Pc(36) Class66 local36 = Static274.aClass66ArrayArray1[local17][local13];
		@Pc(45) int local45;
		if (arg1 == -1 && local36.anInt2176 == 0) {
			for (local45 = 0; local45 < Static110.anInt2281; local45++) {
				if (Static17.aShortArray2[local45] == 32 || Static17.aShortArray2[local45] == 1006 || Static17.aShortArray2[local45] == 11 || Static17.aShortArray2[local45] == 29 || Static17.aShortArray2[local45] == 45) {
					for (@Pc(90) Class66 local90 = Static53.method968(Static252.anIntArray400[local45]); local90 != null; local90 = Static187.method3064(local90)) {
						if (local36.anInt2157 == local90.anInt2157) {
							return true;
						}
					}
				}
			}
		} else {
			for (local45 = 0; local45 < Static110.anInt2281; local45++) {
				if (Static85.anIntArray147[local45] == arg1 && Static252.anIntArray400[local45] == local36.anInt2157 && (Static17.aShortArray2[local45] == 32 || Static17.aShortArray2[local45] == 1006 || Static17.aShortArray2[local45] == 11 || Static17.aShortArray2[local45] == 29 || Static17.aShortArray2[local45] == 45)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZI)V")
	public static void method2738(@OriginalArg(1) int arg0) {
		Static72.anInt5403 = arg0;
		Static282.method4349(3);
		Static282.method4349(4);
	}
}
