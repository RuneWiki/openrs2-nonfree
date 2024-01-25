import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!qt", name = "g", descriptor = "Lclient!cg;")
	private static Class3_Sub14 aClass3_Sub14_9;

	@OriginalMember(owner = "client!qt", name = "D", descriptor = "[J")
	private static long[] aLongArray21;

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray35;

	@OriginalMember(owner = "client!qt", name = "n", descriptor = "Lclient!nt;")
	private static Class270 aClass270_16;

	@OriginalMember(owner = "client!qt", name = "w", descriptor = "Lclient!eaa;")
	private static Class84 aClass84_3;

	@OriginalMember(owner = "client!qt", name = "e", descriptor = "[I")
	private static int[] anIntArray606;

	@OriginalMember(owner = "client!qt", name = "d", descriptor = "Lclient!nt;")
	private static Class270 aClass270_17;

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "Lclient!kha;")
	private static Class210 aClass210_1;

	@OriginalMember(owner = "client!qt", name = "z", descriptor = "I")
	private static int anInt8389 = 0;

	@OriginalMember(owner = "client!qt", name = "G", descriptor = "I")
	private static int anInt8390 = 0;

	@OriginalMember(owner = "client!qt", name = "H", descriptor = "[I")
	private static final int[] anIntArray603 = new int[5];

	@OriginalMember(owner = "client!qt", name = "j", descriptor = "Lclient!qfa;")
	public static final Class307 aClass307_83 = new Class307(4);

	@OriginalMember(owner = "client!qt", name = "o", descriptor = "[I")
	private static final int[] anIntArray604 = new int[3];

	@OriginalMember(owner = "client!qt", name = "B", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray36 = new String[1000];

	@OriginalMember(owner = "client!qt", name = "y", descriptor = "[[I")
	private static final int[][] anIntArrayArray45 = new int[5][5000];

	@OriginalMember(owner = "client!qt", name = "C", descriptor = "[J")
	private static final long[] aLongArray22 = new long[1000];

	@OriginalMember(owner = "client!qt", name = "h", descriptor = "I")
	private static int anInt8397 = 0;

	@OriginalMember(owner = "client!qt", name = "s", descriptor = "[Lclient!sh;")
	private static final Class340[] aClass340Array1 = new Class340[50];

	@OriginalMember(owner = "client!qt", name = "t", descriptor = "[I")
	private static final int[] anIntArray605 = new int[1000];

	@OriginalMember(owner = "client!qt", name = "E", descriptor = "I")
	private static int anInt8398 = 0;

	@OriginalMember(owner = "client!qt", name = "l", descriptor = "Z")
	public static boolean aBoolean564 = false;

	@OriginalMember(owner = "client!qt", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString107 = null;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
	private static int anInt8402 = 0;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method7147(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static432.anInt6579 == 0 && (Static24.aBoolean48 && !Static584.aBoolean596 || Static297.aBoolean293)) {
			return;
		}
		@Pc(18) String local18 = arg0.toLowerCase();
		@Pc(20) byte local20 = 0;
		if (local18.startsWith(Static430.aClass257_46.method5699(0))) {
			local20 = 0;
			arg0 = arg0.substring(Static430.aClass257_46.method5699(0).length());
		} else if (local18.startsWith(Static430.aClass257_47.method5699(0))) {
			local20 = 1;
			arg0 = arg0.substring(Static430.aClass257_47.method5699(0).length());
		} else if (local18.startsWith(Static430.aClass257_48.method5699(0))) {
			local20 = 2;
			arg0 = arg0.substring(Static430.aClass257_48.method5699(0).length());
		} else if (local18.startsWith(Static430.aClass257_49.method5699(0))) {
			local20 = 3;
			arg0 = arg0.substring(Static430.aClass257_49.method5699(0).length());
		} else if (local18.startsWith(Static430.aClass257_50.method5699(0))) {
			local20 = 4;
			arg0 = arg0.substring(Static430.aClass257_50.method5699(0).length());
		} else if (local18.startsWith(Static430.aClass257_51.method5699(0))) {
			local20 = 5;
			arg0 = arg0.substring(Static430.aClass257_51.method5699(0).length());
		} else if (local18.startsWith(Static430.aClass257_52.method5699(0))) {
			local20 = 6;
			arg0 = arg0.substring(Static430.aClass257_52.method5699(0).length());
		} else if (local18.startsWith(Static430.aClass257_53.method5699(0))) {
			local20 = 7;
			arg0 = arg0.substring(Static430.aClass257_53.method5699(0).length());
		} else if (local18.startsWith(Static430.aClass257_54.method5699(0))) {
			local20 = 8;
			arg0 = arg0.substring(Static430.aClass257_54.method5699(0).length());
		} else if (local18.startsWith(Static430.aClass257_55.method5699(0))) {
			local20 = 9;
			arg0 = arg0.substring(Static430.aClass257_55.method5699(0).length());
		} else if (local18.startsWith(Static430.aClass257_56.method5699(0))) {
			local20 = 10;
			arg0 = arg0.substring(Static430.aClass257_56.method5699(0).length());
		} else if (local18.startsWith(Static430.aClass257_57.method5699(0))) {
			local20 = 11;
			arg0 = arg0.substring(Static430.aClass257_57.method5699(0).length());
		} else if (Static456.anInt7118 != 0) {
			if (local18.startsWith(Static430.aClass257_46.method5699(Static456.anInt7118))) {
				local20 = 0;
				arg0 = arg0.substring(Static430.aClass257_46.method5699(Static456.anInt7118).length());
			} else if (local18.startsWith(Static430.aClass257_47.method5699(Static456.anInt7118))) {
				local20 = 1;
				arg0 = arg0.substring(Static430.aClass257_47.method5699(Static456.anInt7118).length());
			} else if (local18.startsWith(Static430.aClass257_48.method5699(Static456.anInt7118))) {
				local20 = 2;
				arg0 = arg0.substring(Static430.aClass257_48.method5699(Static456.anInt7118).length());
			} else if (local18.startsWith(Static430.aClass257_49.method5699(Static456.anInt7118))) {
				local20 = 3;
				arg0 = arg0.substring(Static430.aClass257_49.method5699(Static456.anInt7118).length());
			} else if (local18.startsWith(Static430.aClass257_50.method5699(Static456.anInt7118))) {
				local20 = 4;
				arg0 = arg0.substring(Static430.aClass257_50.method5699(Static456.anInt7118).length());
			} else if (local18.startsWith(Static430.aClass257_51.method5699(Static456.anInt7118))) {
				local20 = 5;
				arg0 = arg0.substring(Static430.aClass257_51.method5699(Static456.anInt7118).length());
			} else if (local18.startsWith(Static430.aClass257_52.method5699(Static456.anInt7118))) {
				local20 = 6;
				arg0 = arg0.substring(Static430.aClass257_52.method5699(Static456.anInt7118).length());
			} else if (local18.startsWith(Static430.aClass257_53.method5699(Static456.anInt7118))) {
				local20 = 7;
				arg0 = arg0.substring(Static430.aClass257_53.method5699(Static456.anInt7118).length());
			} else if (local18.startsWith(Static430.aClass257_54.method5699(Static456.anInt7118))) {
				local20 = 8;
				arg0 = arg0.substring(Static430.aClass257_54.method5699(Static456.anInt7118).length());
			} else if (local18.startsWith(Static430.aClass257_55.method5699(Static456.anInt7118))) {
				local20 = 9;
				arg0 = arg0.substring(Static430.aClass257_55.method5699(Static456.anInt7118).length());
			} else if (local18.startsWith(Static430.aClass257_56.method5699(Static456.anInt7118))) {
				local20 = 10;
				arg0 = arg0.substring(Static430.aClass257_56.method5699(Static456.anInt7118).length());
			} else if (local18.startsWith(Static430.aClass257_57.method5699(Static456.anInt7118))) {
				local20 = 11;
				arg0 = arg0.substring(Static430.aClass257_57.method5699(Static456.anInt7118).length());
			}
		}
		local18 = arg0.toLowerCase();
		@Pc(460) byte local460 = 0;
		if (local18.startsWith(Static430.aClass257_58.method5699(0))) {
			local460 = 1;
			arg0 = arg0.substring(Static430.aClass257_58.method5699(0).length());
		} else if (local18.startsWith(Static430.aClass257_59.method5699(0))) {
			local460 = 2;
			arg0 = arg0.substring(Static430.aClass257_59.method5699(0).length());
		} else if (local18.startsWith(Static430.aClass257_60.method5699(0))) {
			local460 = 3;
			arg0 = arg0.substring(Static430.aClass257_60.method5699(0).length());
		} else if (local18.startsWith(Static430.aClass257_61.method5699(0))) {
			local460 = 4;
			arg0 = arg0.substring(Static430.aClass257_61.method5699(0).length());
		} else if (local18.startsWith(Static430.aClass257_62.method5699(0))) {
			local460 = 5;
			arg0 = arg0.substring(Static430.aClass257_62.method5699(0).length());
		} else if (Static456.anInt7118 != 0) {
			if (local18.startsWith(Static430.aClass257_58.method5699(Static456.anInt7118))) {
				local460 = 1;
				arg0 = arg0.substring(Static430.aClass257_58.method5699(Static456.anInt7118).length());
			} else if (local18.startsWith(Static430.aClass257_59.method5699(Static456.anInt7118))) {
				local460 = 2;
				arg0 = arg0.substring(Static430.aClass257_59.method5699(Static456.anInt7118).length());
			} else if (local18.startsWith(Static430.aClass257_60.method5699(Static456.anInt7118))) {
				local460 = 3;
				arg0 = arg0.substring(Static430.aClass257_60.method5699(Static456.anInt7118).length());
			} else if (local18.startsWith(Static430.aClass257_61.method5699(Static456.anInt7118))) {
				local460 = 4;
				arg0 = arg0.substring(Static430.aClass257_61.method5699(Static456.anInt7118).length());
			} else if (local18.startsWith(Static430.aClass257_62.method5699(Static456.anInt7118))) {
				local460 = 5;
				arg0 = arg0.substring(Static430.aClass257_62.method5699(Static456.anInt7118).length());
			}
		}
		@Pc(650) Class292 local650 = Static631.method8307();
		@Pc(656) Class3_Sub29 local656 = Static507.method6901(Static678.aClass144_104, local650.aClass88_2);
		local656.aClass3_Sub2_Sub1_1.method2065(0);
		@Pc(665) int local665 = local656.aClass3_Sub2_Sub1_1.anInt2178;
		local656.aClass3_Sub2_Sub1_1.method2065(local20);
		local656.aClass3_Sub2_Sub1_1.method2065(local460);
		Static710.method4896(arg0, local656.aClass3_Sub2_Sub1_1);
		local656.aClass3_Sub2_Sub1_1.method2057(local656.aClass3_Sub2_Sub1_1.anInt2178 - local665);
		local650.method6855(local656);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)Ljava/lang/String;")
	private static String method7148(@OriginalArg(0) int arg0) {
		@Pc(9) String local9 = aClass84_3.method2326(Static346.aClass309_6.anInt8217 << 16 | arg0);
		return local9 == null ? "" : local9;
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(IZ)V")
	public static void method7149() {
	}

	@OriginalMember(owner = "client!qt", name = "d", descriptor = "(I)I")
	private static int method7150(@OriginalArg(0) int arg0) {
		@Pc(4) Class329 local4 = Static368.aClass67_1.method1952(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c112");
		}
		@Pc(24) Integer local24 = aClass84_3.method2322(Static346.aClass309_6.anInt8217 << 16 | arg0);
		if (local24 == null) {
			return local4.aChar6 == 'i' || local4.aChar6 == '1' ? 0 : -1;
		} else {
			return local24;
		}
	}

	@OriginalMember(owner = "client!qt", name = "e", descriptor = "(I)I")
	private static int method7151(@OriginalArg(0) int arg0) {
		@Pc(4) Class329 local4 = Static368.aClass67_1.method1952(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c113");
		}
		@Pc(29) Integer local29 = aClass84_3.method2332(Static346.aClass309_6.anInt8217 << 16 | local4.anInt8631, local4.anInt8625, local4.anInt8632);
		return local29 == null ? 0 : local29;
	}

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "(IZ)V")
	private static void method7152(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(220) Class270 local220;
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(15) int local15;
		@Pc(303) Class270 local303;
		@Pc(38) Class270 local38;
		@Pc(72) int local72;
		@Pc(248) Class270 local248;
		if (arg0 < 300) {
			if (arg0 == 150) {
				anInt8397 -= 3;
				local15 = anIntArray605[anInt8397];
				local21 = anIntArray605[anInt8397 + 1];
				local27 = anIntArray605[anInt8397 + 2];
				if (local21 == 0) {
					throw new RuntimeException();
				}
				local38 = Static254.method3544(local15);
				if (local38.aClass270Array3 == null) {
					local38.aClass270Array3 = new Class270[local27 + 1];
					local38.aClass270Array2 = local38.aClass270Array3;
				}
				if (local38.aClass270Array3.length <= local27) {
					@Pc(70) Class270[] local70;
					if (local38.aClass270Array3 == local38.aClass270Array2) {
						local70 = new Class270[local27 + 1];
						for (local72 = 0; local72 < local38.aClass270Array3.length; local72++) {
							local70[local72] = local38.aClass270Array3[local72];
						}
						local38.aClass270Array3 = local38.aClass270Array2 = local70;
					} else {
						local70 = new Class270[local27 + 1];
						@Pc(104) Class270[] local104 = new Class270[local27 + 1];
						for (@Pc(106) int local106 = 0; local106 < local38.aClass270Array3.length; local106++) {
							local70[local106] = local38.aClass270Array3[local106];
							local104[local106] = local38.aClass270Array2[local106];
						}
						local38.aClass270Array3 = local70;
						local38.aClass270Array2 = local104;
					}
				}
				if (local27 > 0 && local38.aClass270Array3[local27 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local27 - 1));
				}
				@Pc(166) Class270 local166 = new Class270();
				local166.anInt7008 = local21;
				local166.anInt7050 = local166.anInt6973 = local38.anInt6973;
				local166.anInt7020 = local27;
				local38.aClass270Array3[local27] = local166;
				if (local38.aClass270Array2 != local38.aClass270Array3) {
					local38.aClass270Array2[local27] = local166;
				}
				if (arg1) {
					aClass270_17 = local166;
				} else {
					aClass270_16 = local166;
				}
				Static539.method7146(local38);
				return;
			}
			if (arg0 == 151) {
				local220 = arg1 ? aClass270_17 : aClass270_16;
				if (local220.anInt7020 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local248 = Static254.method3544(local220.anInt6973);
				local248.aClass270Array3[local220.anInt7020] = null;
				Static539.method7146(local248);
				return;
			}
			if (arg0 == 152) {
				local220 = Static254.method3544(anIntArray605[--anInt8397]);
				local220.aClass270Array3 = null;
				local220.aClass270Array2 = null;
				Static539.method7146(local220);
				return;
			}
			if (arg0 == 200) {
				anInt8397 -= 2;
				local15 = anIntArray605[anInt8397];
				local21 = anIntArray605[anInt8397 + 1];
				local303 = Static1.method9504(local21, local15);
				if (local303 != null && local21 != -1) {
					anIntArray605[anInt8397++] = 1;
					if (arg1) {
						aClass270_17 = local303;
						return;
					}
					aClass270_16 = local303;
					return;
				}
				anIntArray605[anInt8397++] = 0;
				return;
			}
			if (arg0 == 201) {
				local15 = anIntArray605[--anInt8397];
				local248 = Static254.method3544(local15);
				if (local248 != null) {
					anIntArray605[anInt8397++] = 1;
					if (arg1) {
						aClass270_17 = local248;
						return;
					}
					aClass270_16 = local248;
					return;
				}
				anIntArray605[anInt8397++] = 0;
				return;
			}
			if (arg0 == 202 || arg0 == 204) {
				if (arg0 == 202) {
					local21 = anIntArray605[--anInt8397];
					local220 = Static254.method3544(local21);
				} else {
					local220 = arg1 ? aClass270_17 : aClass270_16;
				}
				method7153(local220);
				return;
			}
			if (arg0 == 203 || arg0 == 205) {
				if (arg0 == 203) {
					local21 = anIntArray605[--anInt8397];
					local220 = Static254.method3544(local21);
				} else {
					local220 = arg1 ? aClass270_17 : aClass270_16;
				}
				method7156(local220);
				return;
			}
		} else {
			@Pc(506) int local506;
			@Pc(575) boolean local575;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt8397 -= 2;
					local15 = anIntArray605[anInt8397];
					local21 = anIntArray605[anInt8397 + 1];
					if (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aClass34_1 == null) {
						return;
					}
					for (local27 = 0; local27 < Static290.anIntArray340.length; local27++) {
						if (Static290.anIntArray340[local27] == local15) {
							Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aClass34_1.method1165(local21, local27, Static661.aClass73_1);
							return;
						}
					}
					for (local506 = 0; local506 < Static608.anIntArray666.length; local506++) {
						if (Static608.anIntArray666[local506] == local15) {
							Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aClass34_1.method1165(local21, local506, Static661.aClass73_1);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt8397 -= 2;
					local15 = anIntArray605[anInt8397];
					local21 = anIntArray605[anInt8397 + 1];
					if (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aClass34_1 == null) {
						return;
					}
					Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aClass34_1.method1164(local21, local15);
					return;
				}
				if (arg0 == 410) {
					local575 = anIntArray605[--anInt8397] != 0;
					if (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aClass34_1 == null) {
						return;
					}
					Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aClass34_1.method1158(local575);
					return;
				}
				if (arg0 == 411) {
					anInt8397 -= 2;
					local15 = anIntArray605[anInt8397];
					local21 = anIntArray605[anInt8397 + 1];
					if (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aClass34_1 == null) {
						return;
					}
					Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aClass34_1.method1155(Static606.aClass62_2, local21, local15);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local220 = Static254.method3544(anIntArray605[--anInt8397]);
				} else {
					local220 = arg1 ? aClass270_17 : aClass270_16;
				}
				if (arg0 == 1000) {
					anInt8397 -= 4;
					local220.anInt7054 = anIntArray605[anInt8397];
					local220.anInt6974 = anIntArray605[anInt8397 + 1];
					local21 = anIntArray605[anInt8397 + 2];
					if (local21 < 0) {
						local21 = 0;
					} else if (local21 > 5) {
						local21 = 5;
					}
					local27 = anIntArray605[anInt8397 + 3];
					if (local27 < 0) {
						local27 = 0;
					} else if (local27 > 5) {
						local27 = 5;
					}
					local220.aByte109 = (byte) local21;
					local220.aByte110 = (byte) local27;
					Static539.method7146(local220);
					Static619.method7939(local220);
					if (local220.anInt7020 == -1) {
						Static174.method2803(local220.anInt6973);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt8397 -= 4;
					local220.anInt7011 = anIntArray605[anInt8397];
					local220.anInt7048 = anIntArray605[anInt8397 + 1];
					local220.anInt7016 = 0;
					local220.anInt7032 = 0;
					local21 = anIntArray605[anInt8397 + 2];
					if (local21 < 0) {
						local21 = 0;
					} else if (local21 > 4) {
						local21 = 4;
					}
					local27 = anIntArray605[anInt8397 + 3];
					if (local27 < 0) {
						local27 = 0;
					} else if (local27 > 4) {
						local27 = 4;
					}
					local220.aByte107 = (byte) local21;
					local220.aByte108 = (byte) local27;
					Static539.method7146(local220);
					Static619.method7939(local220);
					if (local220.anInt7008 == 0) {
						Static145.method2463(local220, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(834) boolean local834 = anIntArray605[--anInt8397] == 1;
					if (local220.aBoolean470 != local834) {
						local220.aBoolean470 = local834;
						Static539.method7146(local220);
					}
					if (local220.anInt7020 == -1) {
						Static639.method8419(local220.anInt6973);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt8397 -= 2;
					local220.anInt6980 = anIntArray605[anInt8397];
					local220.anInt7039 = anIntArray605[anInt8397 + 1];
					Static539.method7146(local220);
					Static619.method7939(local220);
					if (local220.anInt7008 == 0) {
						Static145.method2463(local220, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local220.aBoolean463 = anIntArray605[--anInt8397] == 1;
					return;
				}
			} else {
				@Pc(1791) String local1791;
				@Pc(1394) String local1394;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local220 = Static254.method3544(anIntArray605[--anInt8397]);
					} else {
						local220 = arg1 ? aClass270_17 : aClass270_16;
					}
					if (arg0 == 1100) {
						anInt8397 -= 2;
						local220.anInt6982 = anIntArray605[anInt8397];
						if (local220.anInt6982 > local220.anInt7037 - local220.anInt7015) {
							local220.anInt6982 = local220.anInt7037 - local220.anInt7015;
						}
						if (local220.anInt6982 < 0) {
							local220.anInt6982 = 0;
						}
						local220.lb = anIntArray605[anInt8397 + 1];
						if (local220.lb > local220.anInt7013 - local220.anInt7045) {
							local220.lb = local220.anInt7013 - local220.anInt7045;
						}
						if (local220.lb < 0) {
							local220.lb = 0;
						}
						Static539.method7146(local220);
						if (local220.anInt7020 == -1) {
							Static126.method2309(local220.anInt6973);
						}
						return;
					}
					if (arg0 == 1101) {
						local220.anInt6972 = anIntArray605[--anInt8397];
						Static539.method7146(local220);
						if (local220.anInt7020 == -1) {
							Static403.method5440(local220.anInt6973);
						}
						return;
					}
					if (arg0 == 1102) {
						local220.aBoolean473 = anIntArray605[--anInt8397] == 1;
						Static539.method7146(local220);
						return;
					}
					if (arg0 == 1103) {
						local220.anInt7002 = anIntArray605[--anInt8397];
						Static539.method7146(local220);
						return;
					}
					if (arg0 == 1104) {
						local220.anInt7033 = anIntArray605[--anInt8397];
						Static539.method7146(local220);
						return;
					}
					if (arg0 == 1105) {
						local21 = anIntArray605[--anInt8397];
						if (local220.anInt7040 != local21) {
							local220.anInt7040 = local21;
							Static539.method7146(local220);
						}
						if (local220.anInt7020 == -1) {
							Static466.method6306(local220.anInt6973);
						}
						return;
					}
					if (arg0 == 1106) {
						local220.anInt6966 = anIntArray605[--anInt8397];
						Static539.method7146(local220);
						return;
					}
					if (arg0 == 1107) {
						local220.aBoolean471 = anIntArray605[--anInt8397] == 1;
						Static539.method7146(local220);
						return;
					}
					if (arg0 == 1108) {
						local220.anInt7027 = 1;
						local220.anInt7007 = anIntArray605[--anInt8397];
						Static539.method7146(local220);
						if (local220.anInt7020 == -1) {
							Static346.method4910(local220.anInt6973);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt8397 -= 6;
						local220.anInt7009 = anIntArray605[anInt8397];
						local220.anInt7043 = anIntArray605[anInt8397 + 1];
						local220.anInt6989 = anIntArray605[anInt8397 + 2];
						local220.anInt6993 = anIntArray605[anInt8397 + 3];
						local220.anInt7046 = anIntArray605[anInt8397 + 4];
						local220.anInt7004 = anIntArray605[anInt8397 + 5];
						Static539.method7146(local220);
						if (local220.anInt7020 == -1) {
							Static571.method7407(local220.anInt6973);
							Static416.method3201(local220.anInt6973);
						}
						return;
					}
					if (arg0 == 1110) {
						local21 = anIntArray605[--anInt8397];
						if (local21 != local220.anInt7026) {
							if (local21 == -1) {
								local220.aClass45_8 = null;
							} else {
								if (local220.aClass45_8 == null) {
									local220.aClass45_8 = new Class45_Sub1();
								}
								local220.aClass45_8.method6576(local21);
							}
							local220.anInt7026 = local21;
							Static539.method7146(local220);
						}
						if (local220.anInt7020 == -1) {
							Static406.method9100(local220.anInt6973);
						}
						return;
					}
					if (arg0 == 1111) {
						local220.aBoolean467 = anIntArray605[--anInt8397] == 1;
						Static539.method7146(local220);
						return;
					}
					if (arg0 == 1112) {
						local1394 = aStringArray36[--anInt8398];
						if (!local1394.equals(local220.aString89)) {
							local220.aString89 = local1394;
							Static539.method7146(local220);
						}
						if (local220.anInt7020 == -1) {
							Static433.method5741(local220.anInt6973);
						}
						return;
					}
					if (arg0 == 1113) {
						local220.anInt6987 = anIntArray605[--anInt8397];
						Static539.method7146(local220);
						if (local220.anInt7020 == -1) {
							Static210.method3150(local220.anInt6973);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt8397 -= 3;
						local220.anInt6963 = anIntArray605[anInt8397];
						local220.anInt6971 = anIntArray605[anInt8397 + 1];
						local220.anInt7034 = anIntArray605[anInt8397 + 2];
						Static539.method7146(local220);
						return;
					}
					if (arg0 == 1115) {
						local220.aBoolean469 = anIntArray605[--anInt8397] == 1;
						Static539.method7146(local220);
						return;
					}
					if (arg0 == 1116) {
						local220.anInt6990 = anIntArray605[--anInt8397];
						Static539.method7146(local220);
						return;
					}
					if (arg0 == 1117) {
						local220.anInt6968 = anIntArray605[--anInt8397];
						Static539.method7146(local220);
						return;
					}
					if (arg0 == 1118) {
						local220.aBoolean464 = anIntArray605[--anInt8397] == 1;
						Static539.method7146(local220);
						return;
					}
					if (arg0 == 1119) {
						local220.aBoolean465 = anIntArray605[--anInt8397] == 1;
						Static539.method7146(local220);
						return;
					}
					if (arg0 == 1120) {
						anInt8397 -= 2;
						local220.anInt7037 = anIntArray605[anInt8397];
						local220.anInt7013 = anIntArray605[anInt8397 + 1];
						Static539.method7146(local220);
						if (local220.anInt7008 == 0) {
							Static145.method2463(local220, false);
						}
						return;
					}
					if (arg0 == 1122) {
						local220.aBoolean472 = anIntArray605[--anInt8397] == 1;
						Static539.method7146(local220);
						return;
					}
					if (arg0 == 1123) {
						local220.anInt7004 = anIntArray605[--anInt8397];
						Static539.method7146(local220);
						if (local220.anInt7020 == -1) {
							Static571.method7407(local220.anInt6973);
						}
						return;
					}
					if (arg0 == 1124) {
						local21 = anIntArray605[--anInt8397];
						local220.aBoolean476 = local21 == 1;
						Static539.method7146(local220);
						return;
					}
					if (arg0 == 1125) {
						anInt8397 -= 2;
						local220.anInt7024 = anIntArray605[anInt8397];
						local220.anInt6998 = anIntArray605[anInt8397 + 1];
						Static539.method7146(local220);
						return;
					}
					if (arg0 == 1126) {
						local220.anInt6959 = anIntArray605[--anInt8397];
						Static539.method7146(local220);
						return;
					}
					@Pc(1756) Class303 local1756;
					if (arg0 == 1127) {
						anInt8397 -= 2;
						local21 = anIntArray605[anInt8397];
						local27 = anIntArray605[anInt8397 + 1];
						local1756 = Static583.aClass150_2.method3385(local21);
						if (local27 != local1756.anInt8150) {
							local220.method6024(local21, local27);
							return;
						}
						local220.method6019(local21);
						return;
					}
					if (arg0 == 1128) {
						local21 = anIntArray605[--anInt8397];
						local1791 = aStringArray36[--anInt8398];
						local1756 = Static583.aClass150_2.method3385(local21);
						if (!local1756.aString101.equals(local1791)) {
							local220.method6009(local1791, local21);
							return;
						}
						local220.method6019(local21);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local21 = anIntArray605[--anInt8397];
						if ((local220.anInt7008 == 5 || arg0 != 1129) && (local220.anInt7008 == 4 || arg0 != 1130)) {
							if (local220.anInt7044 != local21) {
								local220.anInt7044 = local21;
								Static539.method7146(local220);
							}
							if (local220.anInt7020 == -1) {
								Static679.method9040(local220.anInt6973);
							}
							return;
						}
						return;
					}
					@Pc(1892) short local1892;
					@Pc(1899) short local1899;
					if (arg0 == 1131) {
						anInt8397 -= 3;
						local21 = anIntArray605[anInt8397];
						local1892 = (short) anIntArray605[anInt8397 + 1];
						local1899 = (short) anIntArray605[anInt8397 + 2];
						if (local21 >= 0 && local21 < 5) {
							local220.method6014(local21, local1899, local1892);
							Static539.method7146(local220);
							if (local220.anInt7020 == -1) {
								Static545.method7198(local21, local220.anInt6973);
							}
							return;
						}
						return;
					}
					if (arg0 == 1132) {
						anInt8397 -= 3;
						local21 = anIntArray605[anInt8397];
						local1892 = (short) anIntArray605[anInt8397 + 1];
						local1899 = (short) anIntArray605[anInt8397 + 2];
						if (local21 >= 0 && local21 < 5) {
							local220.method6022(local1899, local1892, local21);
							Static539.method7146(local220);
							if (local220.anInt7020 == -1) {
								Static407.method5468(local220.anInt6973, local21);
							}
							return;
						}
						return;
					}
					if (arg0 == 1133) {
						local220.aBoolean474 = anIntArray605[--anInt8397] == 1;
						Static539.method7146(local220);
						if (local220.anInt7020 == -1) {
							Static49.method1248(local220.anInt6973);
						}
						return;
					}
					if (arg0 == 1134) {
						anInt8397 -= 2;
						local21 = anIntArray605[anInt8397];
						local27 = anIntArray605[anInt8397 + 1];
						local1756 = Static583.aClass150_2.method3385(local21);
						if (local27 != local1756.anInt8150) {
							local220.method6024(local21, local27);
							return;
						}
						local220.method6019(local21);
						return;
					}
					if (arg0 == 1135) {
						local220.aBoolean468 = anIntArray605[--anInt8397] == 1;
						Static539.method7146(local220);
						if (local220.anInt7020 == -1) {
							Static454.method6006(local220.anInt6973);
						}
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2978) int local2978;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local220 = Static254.method3544(anIntArray605[--anInt8397]);
						} else {
							local220 = arg1 ? aClass270_17 : aClass270_16;
						}
						if (arg0 == 1300) {
							local21 = anIntArray605[--anInt8397] - 1;
							if (local21 >= 0 && local21 <= 9) {
								local220.method6029(local21, aStringArray36[--anInt8398]);
								return;
							}
							anInt8398--;
							return;
						}
						if (arg0 == 1301) {
							anInt8397 -= 2;
							local21 = anIntArray605[anInt8397];
							local27 = anIntArray605[anInt8397 + 1];
							if (local21 == -1 && local27 == -1) {
								local220.aClass270_15 = null;
								return;
							}
							local220.aClass270_15 = Static1.method9504(local27, local21);
							return;
						}
						if (arg0 == 1302) {
							local21 = anIntArray605[--anInt8397];
							if (local21 != Static561.anInt8574 && local21 != Static505.anInt8052 && local21 != Static466.anInt7300) {
								return;
							}
							local220.anInt7018 = local21;
							return;
						}
						if (arg0 == 1303) {
							local220.anInt6999 = anIntArray605[--anInt8397];
							return;
						}
						if (arg0 == 1304) {
							local220.anInt6979 = anIntArray605[--anInt8397];
							return;
						}
						if (arg0 == 1305) {
							local220.aString93 = aStringArray36[--anInt8398];
							return;
						}
						if (arg0 == 1306) {
							local220.aString92 = aStringArray36[--anInt8398];
							return;
						}
						if (arg0 == 1307) {
							local220.aStringArray28 = null;
							return;
						}
						if (arg0 == 1308) {
							local220.anInt7022 = anIntArray605[--anInt8397];
							local220.anInt6975 = anIntArray605[--anInt8397];
							return;
						}
						if (arg0 == 1309) {
							local21 = anIntArray605[--anInt8397];
							local27 = anIntArray605[--anInt8397];
							if (local27 >= 1 && local27 <= 10) {
								local220.method6018(local21, local27 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local220.aString91 = aStringArray36[--anInt8398];
							return;
						}
						if (arg0 == 1311) {
							local220.anInt7053 = anIntArray605[--anInt8397];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt8397 -= 3;
								local21 = anIntArray605[anInt8397] - 1;
								local27 = anIntArray605[anInt8397 + 1];
								local506 = anIntArray605[anInt8397 + 2];
								if (local21 < 0 || local21 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt8397 -= 2;
								local21 = 10;
								local27 = anIntArray605[anInt8397];
								local506 = anIntArray605[anInt8397 + 1];
							}
							if (local220.aByteArray68 == null) {
								if (local27 == 0) {
									return;
								}
								local220.aByteArray68 = new byte[11];
								local220.aByteArray67 = new byte[11];
								local220.anIntArray519 = new int[11];
							}
							local220.aByteArray68[local21] = (byte) local27;
							if (local27 == 0) {
								local220.aBoolean475 = false;
								for (local2978 = 0; local2978 < local220.aByteArray68.length; local2978++) {
									if (local220.aByteArray68[local2978] != 0) {
										local220.aBoolean475 = true;
										break;
									}
								}
							} else {
								local220.aBoolean475 = true;
							}
							local220.aByteArray67[local21] = (byte) local506;
							return;
						}
						if (arg0 == 1314) {
							local220.anInt7031 = anIntArray605[--anInt8397];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local220 = Static254.method3544(anIntArray605[--anInt8397]);
						} else {
							local220 = arg1 ? aClass270_17 : aClass270_16;
						}
						if (arg0 == 1499) {
							local220.method6021();
							return;
						}
						local1394 = aStringArray36[--anInt8398];
						@Pc(3077) int[] local3077 = null;
						if (local1394.length() > 0 && local1394.charAt(local1394.length() - 1) == 'Y') {
							local506 = anIntArray605[--anInt8397];
							if (local506 > 0) {
								local3077 = new int[local506];
								while (local506-- > 0) {
									local3077[local506] = anIntArray605[--anInt8397];
								}
							}
							local1394 = local1394.substring(0, local1394.length() - 1);
						}
						@Pc(3131) Object[] local3131 = new Object[local1394.length() + 1];
						for (local2978 = local3131.length - 1; local2978 >= 1; local2978--) {
							if (local1394.charAt(local2978 - 1) == 's') {
								local3131[local2978] = aStringArray36[--anInt8398];
							} else if (local1394.charAt(local2978 - 1) == '§') {
								local3131[local2978] = Long.valueOf(aLongArray22[--anInt8389]);
							} else {
								local3131[local2978] = Integer.valueOf(anIntArray605[--anInt8397]);
							}
						}
						local72 = anIntArray605[--anInt8397];
						if (local72 == -1) {
							local3131 = null;
						} else {
							local3131[0] = Integer.valueOf(local72);
						}
						if (arg0 == 1400) {
							local220.anObjectArray21 = local3131;
						} else if (arg0 == 1401) {
							local220.anObjectArray9 = local3131;
						} else if (arg0 == 1402) {
							local220.anObjectArray28 = local3131;
						} else if (arg0 == 1403) {
							local220.anObjectArray35 = local3131;
						} else if (arg0 == 1404) {
							local220.anObjectArray15 = local3131;
						} else if (arg0 == 1405) {
							local220.anObjectArray6 = local3131;
						} else if (arg0 == 1406) {
							local220.anObjectArray38 = local3131;
						} else if (arg0 == 1407) {
							local220.anObjectArray11 = local3131;
							local220.anIntArray514 = local3077;
						} else if (arg0 == 1408) {
							local220.anObjectArray19 = local3131;
						} else if (arg0 == 1409) {
							local220.anObjectArray30 = local3131;
						} else if (arg0 == 1410) {
							local220.anObjectArray24 = local3131;
						} else if (arg0 == 1411) {
							local220.anObjectArray26 = local3131;
						} else if (arg0 == 1412) {
							local220.anObjectArray27 = local3131;
						} else if (arg0 == 1414) {
							local220.anObjectArray5 = local3131;
							local220.anIntArray518 = local3077;
						} else if (arg0 == 1415) {
							local220.anObjectArray29 = local3131;
							local220.anIntArray515 = local3077;
						} else if (arg0 == 1416) {
							local220.anObjectArray13 = local3131;
						} else if (arg0 == 1417) {
							local220.anObjectArray18 = local3131;
						} else if (arg0 == 1418) {
							local220.anObjectArray17 = local3131;
						} else if (arg0 == 1419) {
							local220.anObjectArray37 = local3131;
						} else if (arg0 == 1420) {
							local220.anObjectArray32 = local3131;
						} else if (arg0 == 1421) {
							local220.anObjectArray16 = local3131;
						} else if (arg0 == 1422) {
							local220.anObjectArray10 = local3131;
						} else if (arg0 == 1423) {
							local220.anObjectArray20 = local3131;
						} else if (arg0 == 1424) {
							local220.anObjectArray7 = local3131;
						} else if (arg0 == 1425) {
							local220.anObjectArray22 = local3131;
						} else if (arg0 == 1426) {
							local220.anObjectArray36 = local3131;
						} else if (arg0 == 1427) {
							local220.anObjectArray33 = local3131;
						} else if (arg0 == 1428) {
							local220.anObjectArray25 = local3131;
							local220.anIntArray520 = local3077;
						} else if (arg0 == 1429) {
							local220.anObjectArray34 = local3131;
							local220.anIntArray512 = local3077;
						} else if (arg0 == 1430) {
							local220.anObjectArray23 = local3131;
						} else if (arg0 == 1431) {
							local220.anObjectArray12 = local3131;
						} else if (arg0 == 1432) {
							local220.anObjectArray8 = local3131;
						} else if (arg0 == 1433) {
							local220.anObjectArray14 = local3131;
						}
						local220.aBoolean481 = true;
						return;
					} else if (arg0 < 1600) {
						local220 = arg1 ? aClass270_17 : aClass270_16;
						if (arg0 == 1500) {
							anIntArray605[anInt8397++] = local220.anInt7036;
							return;
						}
						if (arg0 == 1501) {
							anIntArray605[anInt8397++] = local220.anInt6981;
							return;
						}
						if (arg0 == 1502) {
							anIntArray605[anInt8397++] = local220.anInt7015;
							return;
						}
						if (arg0 == 1503) {
							anIntArray605[anInt8397++] = local220.anInt7045;
							return;
						}
						if (arg0 == 1504) {
							anIntArray605[anInt8397++] = local220.aBoolean470 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray605[anInt8397++] = local220.anInt7050;
							return;
						}
						if (arg0 == 1506) {
							local248 = Static518.method6970(local220);
							anIntArray605[anInt8397++] = local248 == null ? -1 : local248.anInt6973;
							return;
						}
						if (arg0 == 1507) {
							anIntArray605[anInt8397++] = local220.anInt6972;
							return;
						}
					} else {
						@Pc(3848) Class303 local3848;
						if (arg0 < 1700) {
							local220 = arg1 ? aClass270_17 : aClass270_16;
							if (arg0 == 1600) {
								anIntArray605[anInt8397++] = local220.anInt6982;
								return;
							}
							if (arg0 == 1601) {
								anIntArray605[anInt8397++] = local220.lb;
								return;
							}
							if (arg0 == 1602) {
								aStringArray36[anInt8398++] = local220.aString89;
								return;
							}
							if (arg0 == 1603) {
								anIntArray605[anInt8397++] = local220.anInt7037;
								return;
							}
							if (arg0 == 1604) {
								anIntArray605[anInt8397++] = local220.anInt7013;
								return;
							}
							if (arg0 == 1605) {
								anIntArray605[anInt8397++] = local220.anInt7004;
								return;
							}
							if (arg0 == 1606) {
								anIntArray605[anInt8397++] = local220.anInt6989;
								return;
							}
							if (arg0 == 1607) {
								anIntArray605[anInt8397++] = local220.anInt7046;
								return;
							}
							if (arg0 == 1608) {
								anIntArray605[anInt8397++] = local220.anInt6993;
								return;
							}
							if (arg0 == 1609) {
								anIntArray605[anInt8397++] = local220.anInt7002;
								return;
							}
							if (arg0 == 1610) {
								anIntArray605[anInt8397++] = local220.anInt7009;
								return;
							}
							if (arg0 == 1611) {
								anIntArray605[anInt8397++] = local220.anInt7043;
								return;
							}
							if (arg0 == 1612) {
								anIntArray605[anInt8397++] = local220.anInt7040;
								return;
							}
							if (arg0 == 1613) {
								local21 = anIntArray605[--anInt8397];
								local3848 = Static583.aClass150_2.method3385(local21);
								if (local3848.method6975()) {
									aStringArray36[anInt8398++] = local220.method6010(local3848.aString101, local21);
									return;
								}
								anIntArray605[anInt8397++] = local220.method6023(local3848.anInt8150, local21);
								return;
							}
							if (arg0 == 1614) {
								anIntArray605[anInt8397++] = local220.anInt6966;
								return;
							}
							if (arg0 == 2614) {
								anIntArray605[anInt8397++] = local220.anInt7027 == 1 ? local220.anInt7007 : -1;
								return;
							}
						} else if (arg0 < 1800) {
							local220 = arg1 ? aClass270_17 : aClass270_16;
							if (arg0 == 1700) {
								anIntArray605[anInt8397++] = local220.anInt7001;
								return;
							}
							if (arg0 == 1701) {
								if (local220.anInt7001 != -1) {
									anIntArray605[anInt8397++] = local220.anInt7003;
									return;
								}
								anIntArray605[anInt8397++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray605[anInt8397++] = local220.anInt7020;
								return;
							}
						} else if (arg0 < 1900) {
							local220 = arg1 ? aClass270_17 : aClass270_16;
							if (arg0 == 1800) {
								anIntArray605[anInt8397++] = Static85.method1871(local220).method6627();
								return;
							}
							if (arg0 == 1801) {
								local21 = anIntArray605[--anInt8397];
								local21--;
								if (local220.aStringArray28 != null && local21 < local220.aStringArray28.length && local220.aStringArray28[local21] != null) {
									aStringArray36[anInt8398++] = local220.aStringArray28[local21];
									return;
								}
								aStringArray36[anInt8398++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local220.aString93 == null) {
									aStringArray36[anInt8398++] = "";
									return;
								}
								aStringArray36[anInt8398++] = local220.aString93;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local220 = Static254.method3544(anIntArray605[--anInt8397]);
								arg0 -= 1000;
							} else {
								local220 = arg1 ? aClass270_17 : aClass270_16;
							}
							if (anInt8402 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local220.anObjectArray33 == null) {
									return;
								}
								@Pc(4155) Class3_Sub41 local4155 = new Class3_Sub41();
								local4155.aClass270_12 = local220;
								local4155.anObjectArray4 = local220.anObjectArray33;
								local4155.anInt6141 = anInt8402 + 1;
								Static501.aClass342_61.method7654(local4155);
								return;
							}
						} else if (arg0 < 2600) {
							local220 = Static254.method3544(anIntArray605[--anInt8397]);
							if (arg0 == 2500) {
								anIntArray605[anInt8397++] = local220.anInt7036;
								return;
							}
							if (arg0 == 2501) {
								anIntArray605[anInt8397++] = local220.anInt6981;
								return;
							}
							if (arg0 == 2502) {
								anIntArray605[anInt8397++] = local220.anInt7015;
								return;
							}
							if (arg0 == 2503) {
								anIntArray605[anInt8397++] = local220.anInt7045;
								return;
							}
							if (arg0 == 2504) {
								anIntArray605[anInt8397++] = local220.aBoolean470 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray605[anInt8397++] = local220.anInt7050;
								return;
							}
							if (arg0 == 2506) {
								local248 = Static518.method6970(local220);
								anIntArray605[anInt8397++] = local248 == null ? -1 : local248.anInt6973;
								return;
							}
							if (arg0 == 2507) {
								anIntArray605[anInt8397++] = local220.anInt6972;
								return;
							}
						} else if (arg0 < 2700) {
							local220 = Static254.method3544(anIntArray605[--anInt8397]);
							if (arg0 == 2600) {
								anIntArray605[anInt8397++] = local220.anInt6982;
								return;
							}
							if (arg0 == 2601) {
								anIntArray605[anInt8397++] = local220.lb;
								return;
							}
							if (arg0 == 2602) {
								aStringArray36[anInt8398++] = local220.aString89;
								return;
							}
							if (arg0 == 2603) {
								anIntArray605[anInt8397++] = local220.anInt7037;
								return;
							}
							if (arg0 == 2604) {
								anIntArray605[anInt8397++] = local220.anInt7013;
								return;
							}
							if (arg0 == 2605) {
								anIntArray605[anInt8397++] = local220.anInt7004;
								return;
							}
							if (arg0 == 2606) {
								anIntArray605[anInt8397++] = local220.anInt6989;
								return;
							}
							if (arg0 == 2607) {
								anIntArray605[anInt8397++] = local220.anInt7046;
								return;
							}
							if (arg0 == 2608) {
								anIntArray605[anInt8397++] = local220.anInt6993;
								return;
							}
							if (arg0 == 2609) {
								anIntArray605[anInt8397++] = local220.anInt7002;
								return;
							}
							if (arg0 == 2610) {
								anIntArray605[anInt8397++] = local220.anInt7009;
								return;
							}
							if (arg0 == 2611) {
								anIntArray605[anInt8397++] = local220.anInt7043;
								return;
							}
							if (arg0 == 2612) {
								anIntArray605[anInt8397++] = local220.anInt7040;
								return;
							}
							if (arg0 == 2613) {
								anIntArray605[anInt8397++] = local220.anInt6966;
								return;
							}
							if (arg0 == 2614) {
								anIntArray605[anInt8397++] = local220.anInt7027 == 1 ? local220.anInt7007 : -1;
								return;
							}
						} else {
							@Pc(4732) Class3_Sub20 local4732;
							@Pc(4625) Class3_Sub20 local4625;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local220 = Static254.method3544(anIntArray605[--anInt8397]);
									anIntArray605[anInt8397++] = local220.anInt7001;
									return;
								}
								if (arg0 == 2701) {
									local220 = Static254.method3544(anIntArray605[--anInt8397]);
									if (local220.anInt7001 != -1) {
										anIntArray605[anInt8397++] = local220.anInt7003;
										return;
									}
									anIntArray605[anInt8397++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local15 = anIntArray605[--anInt8397];
									local4625 = (Class3_Sub20) Static432.aClass313_34.method7104((long) local15);
									if (local4625 != null) {
										anIntArray605[anInt8397++] = 1;
										return;
									}
									anIntArray605[anInt8397++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local220 = Static254.method3544(anIntArray605[--anInt8397]);
									if (local220.aClass270Array3 == null) {
										anIntArray605[anInt8397++] = 0;
										return;
									}
									local21 = local220.aClass270Array3.length;
									for (local27 = 0; local27 < local220.aClass270Array3.length; local27++) {
										if (local220.aClass270Array3[local27] == null) {
											local21 = local27;
											break;
										}
									}
									anIntArray605[anInt8397++] = local21;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt8397 -= 2;
									local15 = anIntArray605[anInt8397];
									local21 = anIntArray605[anInt8397 + 1];
									local4732 = (Class3_Sub20) Static432.aClass313_34.method7104((long) local15);
									if (local4732 != null && local4732.anInt2493 == local21) {
										anIntArray605[anInt8397++] = 1;
										return;
									}
									anIntArray605[anInt8397++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local220 = Static254.method3544(anIntArray605[--anInt8397]);
								if (arg0 == 2800) {
									anIntArray605[anInt8397++] = Static85.method1871(local220).method6627();
									return;
								}
								if (arg0 == 2801) {
									local21 = anIntArray605[--anInt8397];
									local21--;
									if (local220.aStringArray28 != null && local21 < local220.aStringArray28.length && local220.aStringArray28[local21] != null) {
										aStringArray36[anInt8398++] = local220.aStringArray28[local21];
										return;
									}
									aStringArray36[anInt8398++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local220.aString93 == null) {
										aStringArray36[anInt8398++] = "";
										return;
									}
									aStringArray36[anInt8398++] = local220.aString93;
									return;
								}
							} else {
								@Pc(4883) String local4883;
								@Pc(4977) Class3_Sub29 local4977;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local4883 = aStringArray36[--anInt8398];
										Static691.method9168(local4883);
										return;
									}
									if (arg0 == 3101) {
										anInt8397 -= 2;
										Static389.method5284(anIntArray605[anInt8397 + 1], Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2, anIntArray605[anInt8397]);
										return;
									}
									if (arg0 == 3103) {
										Static513.method6951();
										return;
									}
									if (arg0 == 3104) {
										local4883 = aStringArray36[--anInt8398];
										local21 = 0;
										if (Static473.method6432(local4883)) {
											local21 = Static636.method8390(local4883);
										}
										@Pc(4946) Class3_Sub29 local4946 = Static507.method6901(Static461.aClass144_70, Static95.aClass292_2.aClass88_2);
										local4946.aClass3_Sub2_Sub1_1.method2018(local21);
										Static95.aClass292_2.method6855(local4946);
										return;
									}
									if (arg0 == 3105) {
										local4883 = aStringArray36[--anInt8398];
										local4977 = Static507.method6901(Static27.aClass144_7, Static95.aClass292_2.aClass88_2);
										local4977.aClass3_Sub2_Sub1_1.method2065(local4883.length() + 1);
										local4977.aClass3_Sub2_Sub1_1.method2073(local4883);
										Static95.aClass292_2.method6855(local4977);
										return;
									}
									if (arg0 == 3106) {
										local4883 = aStringArray36[--anInt8398];
										local4977 = Static507.method6901(Static424.aClass144_65, Static95.aClass292_2.aClass88_2);
										local4977.aClass3_Sub2_Sub1_1.method2065(local4883.length() + 1);
										local4977.aClass3_Sub2_Sub1_1.method2073(local4883);
										Static95.aClass292_2.method6855(local4977);
										return;
									}
									if (arg0 == 3107) {
										local15 = anIntArray605[--anInt8397];
										local1394 = aStringArray36[--anInt8398];
										Static713.method9478(local15, local1394);
										return;
									}
									if (arg0 == 3108) {
										anInt8397 -= 3;
										local15 = anIntArray605[anInt8397];
										local21 = anIntArray605[anInt8397 + 1];
										local27 = anIntArray605[anInt8397 + 2];
										local38 = Static254.method3544(local27);
										Static355.method9496(local15, local21, local38);
										return;
									}
									if (arg0 == 3109) {
										anInt8397 -= 2;
										local15 = anIntArray605[anInt8397];
										local21 = anIntArray605[anInt8397 + 1];
										local303 = arg1 ? aClass270_17 : aClass270_16;
										Static355.method9496(local15, local21, local303);
										return;
									}
									if (arg0 == 3110) {
										local15 = anIntArray605[--anInt8397];
										local4977 = Static507.method6901(Static651.aClass144_99, Static95.aClass292_2.aClass88_2);
										local4977.aClass3_Sub2_Sub1_1.method2032(local15);
										Static95.aClass292_2.method6855(local4977);
										return;
									}
									if (arg0 == 3111) {
										anInt8397 -= 2;
										local15 = anIntArray605[anInt8397];
										local21 = anIntArray605[anInt8397 + 1];
										local4732 = (Class3_Sub20) Static432.aClass313_34.method7104((long) local15);
										if (local4732 != null) {
											Static46.method1229(local4732.anInt2493 != local21, true, local4732);
										}
										Static217.method3247(3, local15, true, local21);
										return;
									}
									if (arg0 == 3112) {
										anInt8397--;
										local15 = anIntArray605[anInt8397];
										local4625 = (Class3_Sub20) Static432.aClass313_34.method7104((long) local15);
										if (local4625 != null && local4625.anInt2491 == 3) {
											Static46.method1229(true, true, local4625);
										}
										return;
									}
									if (arg0 == 3113) {
										Static231.method3378(aStringArray36[--anInt8398]);
										return;
									}
									if (arg0 == 3114) {
										anInt8397 -= 2;
										local15 = anIntArray605[anInt8397];
										local21 = anIntArray605[anInt8397 + 1];
										local1791 = aStringArray36[--anInt8398];
										Static97.method1971(local1791, "", "", "", local15, local21);
										return;
									}
									if (arg0 == 3115) {
										anInt8397 -= 11;
										@Pc(5292) Class223[] local5292 = Static525.method7024();
										@Pc(5295) Class352[] local5295 = Static588.method7593();
										Static52.method1295(anIntArray605[anInt8397 + 7], anIntArray605[anInt8397 + 3], anIntArray605[anInt8397 + 6], anIntArray605[anInt8397 + 5], local5292[anIntArray605[anInt8397]], anIntArray605[anInt8397 + 2], anIntArray605[anInt8397 + 8], local5295[anIntArray605[anInt8397 + 1]], anIntArray605[anInt8397 + 10], anIntArray605[anInt8397 + 9], anIntArray605[anInt8397 + 4]);
										return;
									}
									if (arg0 == 3116) {
										local15 = anIntArray605[--anInt8397];
										local4977 = Static507.method6901(Static429.aClass144_67, Static95.aClass292_2.aClass88_2);
										local4977.aClass3_Sub2_Sub1_1.method2032(local15);
										Static95.aClass292_2.method6855(local4977);
										return;
									}
									if (arg0 == 3117) {
										local4883 = aStringArray36[--anInt8398];
										local4977 = Static507.method6901(Static537.aClass144_81, Static95.aClass292_2.aClass88_2);
										local4977.aClass3_Sub2_Sub1_1.method2065(local4883.length() + 1);
										local4977.aClass3_Sub2_Sub1_1.method2073(local4883);
										Static95.aClass292_2.method6855(local4977);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt8397 -= 3;
										Static355.method9493(256, 255, anIntArray605[anInt8397 + 1], anIntArray605[anInt8397], anIntArray605[anInt8397 + 2]);
										return;
									}
									if (arg0 == 3201) {
										Static232.method3382(50, anIntArray605[--anInt8397], 255);
										return;
									}
									if (arg0 == 3202) {
										anInt8397 -= 2;
										Static502.method6857(anIntArray605[anInt8397], anIntArray605[anInt8397 + 1], 255);
										return;
									}
									if (arg0 == 3203) {
										anInt8397 -= 4;
										Static355.method9493(256, anIntArray605[anInt8397 + 3], anIntArray605[anInt8397 + 1], anIntArray605[anInt8397], anIntArray605[anInt8397 + 2]);
										return;
									}
									if (arg0 == 3204) {
										anInt8397 -= 3;
										Static232.method3382(anIntArray605[anInt8397 + 2], anIntArray605[anInt8397], anIntArray605[anInt8397 + 1]);
										return;
									}
									if (arg0 == 3205) {
										anInt8397 -= 3;
										Static502.method6857(anIntArray605[anInt8397], anIntArray605[anInt8397 + 1], anIntArray605[anInt8397 + 2]);
										return;
									}
									if (arg0 == 3206) {
										anInt8397 -= 4;
										Static606.method7781(false, 256, anIntArray605[anInt8397], anIntArray605[anInt8397 + 3], anIntArray605[anInt8397 + 1], anIntArray605[anInt8397 + 2]);
										return;
									}
									if (arg0 == 3207) {
										anInt8397 -= 4;
										Static606.method7781(true, 256, anIntArray605[anInt8397], anIntArray605[anInt8397 + 3], anIntArray605[anInt8397 + 1], anIntArray605[anInt8397 + 2]);
										return;
									}
									if (arg0 == 3208) {
										anInt8397 -= 5;
										Static355.method9493(anIntArray605[anInt8397 + 4], anIntArray605[anInt8397 + 3], anIntArray605[anInt8397 + 1], anIntArray605[anInt8397], anIntArray605[anInt8397 + 2]);
										return;
									}
									if (arg0 == 3209) {
										anInt8397 -= 5;
										Static606.method7781(false, anIntArray605[anInt8397 + 4], anIntArray605[anInt8397], anIntArray605[anInt8397 + 3], anIntArray605[anInt8397 + 1], anIntArray605[anInt8397 + 2]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray605[anInt8397++] = Static716.anInt11157;
										return;
									}
									if (arg0 == 3301) {
										anInt8397 -= 2;
										local15 = anIntArray605[anInt8397];
										local21 = anIntArray605[anInt8397 + 1];
										anIntArray605[anInt8397++] = Static148.method2491(local21, false, local15);
										return;
									}
									if (arg0 == 3302) {
										anInt8397 -= 2;
										local15 = anIntArray605[anInt8397];
										local21 = anIntArray605[anInt8397 + 1];
										anIntArray605[anInt8397++] = Static708.method9459(false, local21, local15);
										return;
									}
									if (arg0 == 3303) {
										anInt8397 -= 2;
										local15 = anIntArray605[anInt8397];
										local21 = anIntArray605[anInt8397 + 1];
										anIntArray605[anInt8397++] = Static78.method1728(local15, false, local21);
										return;
									}
									if (arg0 == 3304) {
										local15 = anIntArray605[--anInt8397];
										anIntArray605[anInt8397++] = Static614.aClass51_1.method1491(local15).anInt1677;
										return;
									}
									if (arg0 == 3305) {
										local15 = anIntArray605[--anInt8397];
										anIntArray605[anInt8397++] = Static410.anIntArray184[local15];
										return;
									}
									if (arg0 == 3306) {
										local15 = anIntArray605[--anInt8397];
										anIntArray605[anInt8397++] = Static212.anIntArray243[local15];
										return;
									}
									if (arg0 == 3307) {
										local15 = anIntArray605[--anInt8397];
										anIntArray605[anInt8397++] = Static400.anIntArray475[local15];
										return;
									}
									if (arg0 == 3308) {
										@Pc(5901) byte local5901 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139;
										local21 = (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10694 >> 9) + Static291.anInt4448;
										local27 = (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10695 >> 9) + Static189.anInt3243;
										anIntArray605[anInt8397++] = (local5901 << 28) + (local21 << 14) + local27;
										return;
									}
									if (arg0 == 3309) {
										local15 = anIntArray605[--anInt8397];
										anIntArray605[anInt8397++] = local15 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local15 = anIntArray605[--anInt8397];
										anIntArray605[anInt8397++] = local15 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local15 = anIntArray605[--anInt8397];
										anIntArray605[anInt8397++] = local15 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray605[anInt8397++] = Static5.aBoolean3 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt8397 -= 2;
										local15 = anIntArray605[anInt8397];
										local21 = anIntArray605[anInt8397 + 1];
										anIntArray605[anInt8397++] = Static148.method2491(local21, true, local15);
										return;
									}
									if (arg0 == 3314) {
										anInt8397 -= 2;
										local15 = anIntArray605[anInt8397];
										local21 = anIntArray605[anInt8397 + 1];
										anIntArray605[anInt8397++] = Static708.method9459(true, local21, local15);
										return;
									}
									if (arg0 == 3315) {
										anInt8397 -= 2;
										local15 = anIntArray605[anInt8397];
										local21 = anIntArray605[anInt8397 + 1];
										anIntArray605[anInt8397++] = Static78.method1728(local15, true, local21);
										return;
									}
									if (arg0 == 3316) {
										if (Static432.anInt6579 >= 2) {
											anIntArray605[anInt8397++] = Static432.anInt6579;
											return;
										}
										anIntArray605[anInt8397++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray605[anInt8397++] = Static708.anInt11107;
										return;
									}
									if (arg0 == 3318) {
										anIntArray605[anInt8397++] = Static226.aClass43_3.anInt1402;
										return;
									}
									if (arg0 == 3321) {
										anIntArray605[anInt8397++] = Static179.anInt3141;
										return;
									}
									if (arg0 == 3322) {
										anIntArray605[anInt8397++] = Static496.anInt7902;
										return;
									}
									if (arg0 == 3323) {
										if (Static541.anInt8426 >= 5 && Static541.anInt8426 <= 9) {
											anIntArray605[anInt8397++] = 1;
											return;
										}
										anIntArray605[anInt8397++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static541.anInt8426 >= 5 && Static541.anInt8426 <= 9) {
											anIntArray605[anInt8397++] = Static541.anInt8426;
											return;
										}
										anIntArray605[anInt8397++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray605[anInt8397++] = Static601.aBoolean608 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray605[anInt8397++] = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt552;
										return;
									}
									if (arg0 == 3327) {
										anIntArray605[anInt8397++] = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aClass34_1 != null && Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aClass34_1.aBoolean86 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray605[anInt8397++] = Static297.aBoolean293 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local15 = anIntArray605[--anInt8397];
										anIntArray605[anInt8397++] = Static360.method7135(local15);
										return;
									}
									if (arg0 == 3331) {
										anInt8397 -= 2;
										local15 = anIntArray605[anInt8397];
										local21 = anIntArray605[anInt8397 + 1];
										anIntArray605[anInt8397++] = Static98.method1977(local15, false, local21);
										return;
									}
									if (arg0 == 3332) {
										anInt8397 -= 2;
										local15 = anIntArray605[anInt8397];
										local21 = anIntArray605[anInt8397 + 1];
										anIntArray605[anInt8397++] = Static98.method1977(local15, true, local21);
										return;
									}
									if (arg0 == 3333) {
										anIntArray605[anInt8397++] = Static604.method7755();
										return;
									}
									if (arg0 == 3335) {
										anIntArray605[anInt8397++] = Static456.anInt7118;
										return;
									}
									if (arg0 == 3336) {
										anInt8397 -= 4;
										local15 = anIntArray605[anInt8397];
										local21 = anIntArray605[anInt8397 + 1];
										local27 = anIntArray605[anInt8397 + 2];
										local506 = anIntArray605[anInt8397 + 3];
										local15 += local21 << 14;
										local15 += local27 << 28;
										local15 += local506;
										anIntArray605[anInt8397++] = local15;
										return;
									}
									if (arg0 == 3337) {
										anIntArray605[anInt8397++] = Static281.anInt4321;
										return;
									}
									if (arg0 == 3338) {
										anIntArray605[anInt8397++] = Static270.method3826();
										return;
									}
									if (arg0 == 3339) {
										anIntArray605[anInt8397++] = 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray605[anInt8397++] = Static213.aBoolean221 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray605[anInt8397++] = Static259.aBoolean257 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray605[anInt8397++] = Static334.aClass18_1.method4192();
										return;
									}
									if (arg0 == 3343) {
										anIntArray605[anInt8397++] = Static334.aClass18_1.method4196();
										return;
									}
									if (arg0 == 3344) {
										aStringArray36[anInt8398++] = Static712.method2316();
										return;
									}
									if (arg0 == 3345) {
										aStringArray36[anInt8398++] = Static337.method4836();
										return;
									}
									if (arg0 == 3346) {
										anIntArray605[anInt8397++] = Static424.method5632();
										return;
									}
									if (arg0 == 3347) {
										anIntArray605[anInt8397++] = Static500.anInt7979;
										return;
									}
									if (arg0 == 3349) {
										anIntArray605[anInt8397++] = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aClass365_7.method8385() >> 3;
										return;
									}
									if (arg0 == 3350) {
										local4883 = aStringArray36[--anInt8398];
										if (Static225.aString53 != null && Static225.aString53.equalsIgnoreCase(local4883)) {
											anIntArray605[anInt8397++] = 1;
											return;
										}
										anIntArray605[anInt8397++] = 0;
										return;
									}
								} else {
									@Pc(7266) String local7266;
									if (arg0 < 3500) {
										@Pc(6743) Class241 local6743;
										if (arg0 == 3400) {
											anInt8397 -= 2;
											local15 = anIntArray605[anInt8397];
											local21 = anIntArray605[anInt8397 + 1];
											local6743 = Static298.aClass322_1.method7220(local15);
											aStringArray36[anInt8398++] = local6743.method5331(local21);
											return;
										}
										@Pc(6789) Class241 local6789;
										if (arg0 == 3408) {
											anInt8397 -= 4;
											local15 = anIntArray605[anInt8397];
											local21 = anIntArray605[anInt8397 + 1];
											local27 = anIntArray605[anInt8397 + 2];
											local506 = anIntArray605[anInt8397 + 3];
											local6789 = Static298.aClass322_1.method7220(local27);
											if (local6789.aChar3 == local15 && local6789.aChar4 == local21) {
												if (local21 == 115) {
													aStringArray36[anInt8398++] = local6789.method5331(local506);
													return;
												}
												anIntArray605[anInt8397++] = local6789.method5334(local506);
												return;
											}
											throw new RuntimeException("C3408-1 " + local27 + "-" + local506);
										}
										@Pc(6884) Class241 local6884;
										if (arg0 == 3409) {
											anInt8397 -= 3;
											local15 = anIntArray605[anInt8397];
											local21 = anIntArray605[anInt8397 + 1];
											local27 = anIntArray605[anInt8397 + 2];
											if (local21 == -1) {
												throw new RuntimeException("C3409-2");
											}
											local6884 = Static298.aClass322_1.method7220(local21);
											if (local6884.aChar4 != local15) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray605[anInt8397++] = local6884.method5339(local27) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local15 = anIntArray605[--anInt8397];
											local1394 = aStringArray36[--anInt8398];
											if (local15 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local6743 = Static298.aClass322_1.method7220(local15);
											if (local6743.aChar4 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray605[anInt8397++] = local6743.method5330(local1394) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local15 = anIntArray605[--anInt8397];
											@Pc(6993) Class241 local6993 = Static298.aClass322_1.method7220(local15);
											anIntArray605[anInt8397++] = local6993.method5338();
											return;
										}
										if (arg0 == 3412) {
											anInt8397 -= 3;
											local15 = anIntArray605[anInt8397];
											local21 = anIntArray605[anInt8397 + 1];
											local27 = anIntArray605[anInt8397 + 2];
											if (local21 == -1) {
												throw new RuntimeException();
											}
											local6884 = Static298.aClass322_1.method7220(local21);
											if (local6884.aChar4 != local15) {
												throw new RuntimeException();
											}
											@Pc(7054) Class3_Sub18 local7054 = local6884.method5329(local27);
											local72 = 0;
											if (local7054 != null) {
												local72 = local7054.anIntArray130.length;
											}
											anIntArray605[anInt8397++] = local72;
											return;
										}
										if (arg0 == 3413) {
											local15 = anIntArray605[--anInt8397];
											local1394 = aStringArray36[--anInt8398];
											if (local15 == -1) {
												throw new RuntimeException();
											}
											local6743 = Static298.aClass322_1.method7220(local15);
											if (local6743.aChar4 != 's') {
												throw new RuntimeException();
											}
											@Pc(7117) Class3_Sub6 local7117 = local6743.method5336(local1394);
											local2978 = 0;
											if (local7117 != null) {
												local2978 = local7117.anIntArray49.length;
											}
											anIntArray605[anInt8397++] = local2978;
											return;
										}
										if (arg0 == 3414) {
											anInt8397 -= 5;
											local15 = anIntArray605[anInt8397];
											local21 = anIntArray605[anInt8397 + 1];
											local27 = anIntArray605[anInt8397 + 2];
											local506 = anIntArray605[anInt8397 + 3];
											local2978 = anIntArray605[anInt8397 + 4];
											if (local27 == -1) {
												throw new RuntimeException();
											}
											@Pc(7182) Class241 local7182 = Static298.aClass322_1.method7220(local27);
											if (local7182.aChar3 != local21) {
												throw new RuntimeException();
											}
											if (local7182.aChar4 != local15) {
												throw new RuntimeException();
											}
											@Pc(7205) Class3_Sub18 local7205 = local7182.method5329(local506);
											if (local2978 >= 0 && local7205 != null && local7205.anIntArray130.length > local2978) {
												anIntArray605[anInt8397++] = local7205.anIntArray130[local2978];
												return;
											}
											throw new RuntimeException();
										}
										if (arg0 == 3415) {
											anInt8397 -= 3;
											local15 = anIntArray605[anInt8397];
											local21 = anIntArray605[anInt8397 + 1];
											local27 = anIntArray605[anInt8397 + 2];
											local7266 = aStringArray36[--anInt8398];
											if (local21 == -1) {
												throw new RuntimeException();
											}
											local6789 = Static298.aClass322_1.method7220(local21);
											if (local6789.aChar3 != local15) {
												throw new RuntimeException();
											}
											if (local6789.aChar4 != 's') {
												throw new RuntimeException();
											}
											@Pc(7302) Class3_Sub6 local7302 = local6789.method5336(local7266);
											if (local27 >= 0 && local7302 != null && local7302.anIntArray49.length > local27) {
												anIntArray605[anInt8397++] = local7302.anIntArray49[local27];
												return;
											}
											throw new RuntimeException();
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static134.anInt2600 == 0) {
												anIntArray605[anInt8397++] = -2;
												return;
											}
											if (Static134.anInt2600 == 1) {
												anIntArray605[anInt8397++] = -1;
												return;
											}
											anIntArray605[anInt8397++] = Static544.anInt9946;
											return;
										}
										if (arg0 == 3601) {
											local15 = anIntArray605[--anInt8397];
											if (Static134.anInt2600 == 2 && local15 < Static544.anInt9946) {
												aStringArray36[anInt8398++] = Static636.aStringArray41[local15];
												if (Static61.aStringArray3[local15] != null) {
													aStringArray36[anInt8398++] = Static61.aStringArray3[local15];
													return;
												}
												aStringArray36[anInt8398++] = "";
												return;
											}
											aStringArray36[anInt8398++] = "";
											aStringArray36[anInt8398++] = "";
											return;
										}
										if (arg0 == 3602) {
											local15 = anIntArray605[--anInt8397];
											if (Static134.anInt2600 == 2 && local15 < Static544.anInt9946) {
												anIntArray605[anInt8397++] = Static113.anIntArray135[local15];
												return;
											}
											anIntArray605[anInt8397++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local15 = anIntArray605[--anInt8397];
											if (Static134.anInt2600 == 2 && local15 < Static544.anInt9946) {
												anIntArray605[anInt8397++] = Static543.anIntArray608[local15];
												return;
											}
											anIntArray605[anInt8397++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local4883 = aStringArray36[--anInt8398];
											local21 = anIntArray605[--anInt8397];
											Static516.method6963(local21, local4883);
											return;
										}
										if (arg0 == 3605) {
											local4883 = aStringArray36[--anInt8398];
											Static525.method7023(local4883);
											return;
										}
										if (arg0 == 3606) {
											local4883 = aStringArray36[--anInt8398];
											Static486.method6604(local4883);
											return;
										}
										if (arg0 == 3607) {
											local4883 = aStringArray36[--anInt8398];
											Static626.method8237(local4883, false);
											return;
										}
										if (arg0 == 3608) {
											local4883 = aStringArray36[--anInt8398];
											Static499.method6811(local4883);
											return;
										}
										if (arg0 == 3609) {
											local4883 = aStringArray36[--anInt8398];
											if (local4883.startsWith("<img=0>") || local4883.startsWith("<img=1>")) {
												local4883 = local4883.substring(7);
											}
											anIntArray605[anInt8397++] = Static193.method2998(local4883) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local15 = anIntArray605[--anInt8397];
											if (Static134.anInt2600 == 2 && local15 < Static544.anInt9946) {
												aStringArray36[anInt8398++] = Static95.aStringArray7[local15];
												return;
											}
											aStringArray36[anInt8398++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static379.aString77 != null) {
												aStringArray36[anInt8398++] = Static668.method8760(Static379.aString77);
												return;
											}
											aStringArray36[anInt8398++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static379.aString77 != null) {
												anIntArray605[anInt8397++] = Static651.anInt10057;
												return;
											}
											anIntArray605[anInt8397++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local15 = anIntArray605[--anInt8397];
											if (Static379.aString77 != null && local15 < Static651.anInt10057) {
												aStringArray36[anInt8398++] = Static273.aClass61Array1[local15].aString36;
												return;
											}
											aStringArray36[anInt8398++] = "";
											return;
										}
										if (arg0 == 3614) {
											local15 = anIntArray605[--anInt8397];
											if (Static379.aString77 != null && local15 < Static651.anInt10057) {
												anIntArray605[anInt8397++] = Static273.aClass61Array1[local15].anInt2035;
												return;
											}
											anIntArray605[anInt8397++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local15 = anIntArray605[--anInt8397];
											if (Static379.aString77 != null && local15 < Static651.anInt10057) {
												anIntArray605[anInt8397++] = Static273.aClass61Array1[local15].aByte48;
												return;
											}
											anIntArray605[anInt8397++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray605[anInt8397++] = Static547.aByte118;
											return;
										}
										if (arg0 == 3617) {
											local4883 = aStringArray36[--anInt8398];
											Static17.method559(local4883);
											return;
										}
										if (arg0 == 3618) {
											anIntArray605[anInt8397++] = Static317.aByte71;
											return;
										}
										if (arg0 == 3619) {
											local4883 = aStringArray36[--anInt8398];
											Static417.method7297(local4883);
											return;
										}
										if (arg0 == 3620) {
											Static194.method3003();
											return;
										}
										if (arg0 == 3621) {
											if (Static134.anInt2600 == 0) {
												anIntArray605[anInt8397++] = -1;
												return;
											}
											anIntArray605[anInt8397++] = Static453.anInt6954;
											return;
										}
										if (arg0 == 3622) {
											local15 = anIntArray605[--anInt8397];
											if (Static134.anInt2600 != 0 && local15 < Static453.anInt6954) {
												aStringArray36[anInt8398++] = Static501.aStringArray34[local15];
												if (Static166.aStringArray15[local15] != null) {
													aStringArray36[anInt8398++] = Static166.aStringArray15[local15];
													return;
												}
												aStringArray36[anInt8398++] = "";
												return;
											}
											aStringArray36[anInt8398++] = "";
											aStringArray36[anInt8398++] = "";
											return;
										}
										if (arg0 == 3623) {
											local4883 = aStringArray36[--anInt8398];
											if (local4883.startsWith("<img=0>") || local4883.startsWith("<img=1>")) {
												local4883 = local4883.substring(7);
											}
											anIntArray605[anInt8397++] = Static543.method7194(local4883, (byte) -86) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local15 = anIntArray605[--anInt8397];
											if (Static273.aClass61Array1 != null && local15 < Static651.anInt10057 && Static273.aClass61Array1[local15].aString37.equalsIgnoreCase(Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aString4)) {
												anIntArray605[anInt8397++] = 1;
												return;
											}
											anIntArray605[anInt8397++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static571.aString114 != null) {
												aStringArray36[anInt8398++] = Static571.aString114;
												return;
											}
											aStringArray36[anInt8398++] = "";
											return;
										}
										if (arg0 == 3626) {
											local15 = anIntArray605[--anInt8397];
											if (Static379.aString77 != null && local15 < Static651.anInt10057) {
												aStringArray36[anInt8398++] = Static273.aClass61Array1[local15].aString35;
												return;
											}
											aStringArray36[anInt8398++] = "";
											return;
										}
										if (arg0 == 3627) {
											local15 = anIntArray605[--anInt8397];
											if (Static134.anInt2600 == 2 && local15 >= 0 && local15 < Static544.anInt9946) {
												anIntArray605[anInt8397++] = Static241.aBooleanArray8[local15] ? 1 : 0;
												return;
											}
											anIntArray605[anInt8397++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local4883 = aStringArray36[--anInt8398];
											if (local4883.startsWith("<img=0>") || local4883.startsWith("<img=1>")) {
												local4883 = local4883.substring(7);
											}
											anIntArray605[anInt8397++] = Static478.method5101(local4883);
											return;
										}
										if (arg0 == 3629) {
											anIntArray605[anInt8397++] = Static373.anInt2732;
											return;
										}
										if (arg0 == 3630) {
											local4883 = aStringArray36[--anInt8398];
											Static626.method8237(local4883, true);
											return;
										}
										if (arg0 == 3631) {
											local15 = anIntArray605[--anInt8397];
											anIntArray605[anInt8397++] = Static113.aBooleanArray1[local15] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local15 = anIntArray605[--anInt8397];
											if (Static379.aString77 != null && local15 < Static651.anInt10057) {
												aStringArray36[anInt8398++] = Static273.aClass61Array1[local15].aString37;
												return;
											}
											aStringArray36[anInt8398++] = "";
											return;
										}
										if (arg0 == 3633) {
											local15 = anIntArray605[--anInt8397];
											if (Static134.anInt2600 != 0 && local15 < Static453.anInt6954) {
												aStringArray36[anInt8398++] = Static646.aStringArray43[local15];
												return;
											}
											aStringArray36[anInt8398++] = "";
											return;
										}
										if (arg0 == 3634) {
											local15 = anIntArray605[--anInt8397];
											if (Static134.anInt2600 == 2 && local15 < Static544.anInt9946) {
												anIntArray605[anInt8397++] = Static560.aBooleanArray34[local15] ? 1 : 0;
												return;
											}
											anIntArray605[anInt8397++] = 0;
											return;
										}
									} else if (arg0 < 3800) {
										if (arg0 == 3700) {
											if (Static215.aClass84_2 != null) {
												anIntArray605[anInt8397++] = 1;
												aClass84_3 = Static215.aClass84_2;
												return;
											}
											anIntArray605[anInt8397++] = 0;
											return;
										}
										if (arg0 == 3701) {
											if (Static35.aClass84_1 != null) {
												anIntArray605[anInt8397++] = 1;
												aClass84_3 = Static35.aClass84_1;
												return;
											}
											anIntArray605[anInt8397++] = 0;
											return;
										}
										if (arg0 == 3702) {
											aStringArray36[anInt8398++] = aClass84_3.aString45;
											return;
										}
										if (arg0 == 3703) {
											anIntArray605[anInt8397++] = aClass84_3.aBoolean167 ? 1 : 0;
											return;
										}
										if (arg0 == 3704) {
											anIntArray605[anInt8397++] = aClass84_3.aByte54;
											return;
										}
										if (arg0 == 3705) {
											anIntArray605[anInt8397++] = aClass84_3.aByte51;
											return;
										}
										if (arg0 == 3706) {
											anIntArray605[anInt8397++] = aClass84_3.aByte53;
											return;
										}
										if (arg0 == 3707) {
											anIntArray605[anInt8397++] = aClass84_3.aByte52;
											return;
										}
										if (arg0 == 3709) {
											anIntArray605[anInt8397++] = aClass84_3.anInt2562;
											return;
										}
										if (arg0 == 3710) {
											local15 = anIntArray605[--anInt8397];
											aStringArray36[anInt8398++] = aClass84_3.aStringArray10[local15];
											return;
										}
										if (arg0 == 3711) {
											local15 = anIntArray605[--anInt8397];
											anIntArray605[anInt8397++] = aClass84_3.aByteArray22[local15];
											return;
										}
										if (arg0 == 3712) {
											anIntArray605[anInt8397++] = aClass84_3.anInt2553;
											return;
										}
										if (arg0 == 3713) {
											local15 = anIntArray605[--anInt8397];
											aStringArray36[anInt8398++] = aClass84_3.aStringArray11[local15];
											return;
										}
										if (arg0 == 3714) {
											anInt8397 -= 3;
											local15 = anIntArray605[anInt8397];
											local21 = anIntArray605[anInt8397 + 1];
											local27 = anIntArray605[anInt8397 + 2];
											anIntArray605[anInt8397++] = aClass84_3.method2327(local15, local27, local21);
											return;
										}
										if (arg0 == 3715) {
											anIntArray605[anInt8397++] = aClass84_3.anInt2552;
											return;
										}
										if (arg0 == 3716) {
											anIntArray605[anInt8397++] = aClass84_3.anInt2568;
											return;
										}
										if (arg0 == 3717) {
											anIntArray605[anInt8397++] = aClass84_3.method2330(aStringArray36[--anInt8398]);
											return;
										}
										if (arg0 == 3718) {
											anIntArray605[anInt8397 - 1] = aClass84_3.method2333()[anIntArray605[anInt8397 - 1]];
											return;
										}
										if (arg0 == 3719) {
											Static308.method4571(anIntArray605[--anInt8397]);
											return;
										}
										if (arg0 == 3720) {
											local15 = anIntArray605[--anInt8397];
											anIntArray605[anInt8397++] = aClass84_3.anIntArray156[local15];
											return;
										}
										if (arg0 == 3750) {
											if (Static12.aClass3_Sub14_15 != null) {
												anIntArray605[anInt8397++] = 1;
												aClass3_Sub14_9 = Static12.aClass3_Sub14_15;
												return;
											}
											anIntArray605[anInt8397++] = 0;
											return;
										}
										if (arg0 == 3751) {
											if (Static107.aClass3_Sub14_10 != null) {
												anIntArray605[anInt8397++] = 1;
												aClass3_Sub14_9 = Static107.aClass3_Sub14_10;
												return;
											}
											anIntArray605[anInt8397++] = 0;
											return;
										}
										if (arg0 == 3752) {
											aStringArray36[anInt8398++] = aClass3_Sub14_9.aString32;
											return;
										}
										if (arg0 == 3753) {
											anIntArray605[anInt8397++] = aClass3_Sub14_9.aByte45;
											return;
										}
										if (arg0 == 3754) {
											anIntArray605[anInt8397++] = aClass3_Sub14_9.aByte44;
											return;
										}
										if (arg0 == 3755) {
											anIntArray605[anInt8397++] = aClass3_Sub14_9.anInt1731;
											return;
										}
										if (arg0 == 3756) {
											local15 = anIntArray605[--anInt8397];
											aStringArray36[anInt8398++] = aClass3_Sub14_9.aClass54Array1[local15].aString30;
											return;
										}
										if (arg0 == 3757) {
											local15 = anIntArray605[--anInt8397];
											anIntArray605[anInt8397++] = aClass3_Sub14_9.aClass54Array1[local15].aByte42;
											return;
										}
										if (arg0 == 3758) {
											local15 = anIntArray605[--anInt8397];
											anIntArray605[anInt8397++] = aClass3_Sub14_9.aClass54Array1[local15].anInt1629;
											return;
										}
										if (arg0 == 3759) {
											local15 = anIntArray605[--anInt8397];
											Static494.method6741(aClass3_Sub14_9 == Static107.aClass3_Sub14_10, local15);
											return;
										}
										if (arg0 == 3760) {
											anIntArray605[anInt8397++] = aClass3_Sub14_9.method1631(aStringArray36[--anInt8398]);
											return;
										}
										if (arg0 == 3761) {
											anIntArray605[anInt8397 - 1] = aClass3_Sub14_9.method1630()[anIntArray605[anInt8397 - 1]];
											return;
										}
										if (arg0 == 3790) {
											anIntArray605[anInt8397++] = Static637.anObjectArray39 == null ? 0 : 1;
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local15 = anIntArray605[--anInt8397];
											anIntArray605[anInt8397++] = Static469.aClass240Array1[local15].method5324();
											return;
										}
										if (arg0 == 3904) {
											local15 = anIntArray605[--anInt8397];
											anIntArray605[anInt8397++] = Static469.aClass240Array1[local15].anInt6111;
											return;
										}
										if (arg0 == 3905) {
											local15 = anIntArray605[--anInt8397];
											anIntArray605[anInt8397++] = Static469.aClass240Array1[local15].anInt6116;
											return;
										}
										if (arg0 == 3906) {
											local15 = anIntArray605[--anInt8397];
											anIntArray605[anInt8397++] = Static469.aClass240Array1[local15].anInt6117;
											return;
										}
										if (arg0 == 3907) {
											local15 = anIntArray605[--anInt8397];
											anIntArray605[anInt8397++] = Static469.aClass240Array1[local15].anInt6118;
											return;
										}
										if (arg0 == 3908) {
											local15 = anIntArray605[--anInt8397];
											anIntArray605[anInt8397++] = Static469.aClass240Array1[local15].anInt6115;
											return;
										}
										if (arg0 == 3910) {
											local15 = anIntArray605[--anInt8397];
											local21 = Static469.aClass240Array1[local15].method5325();
											anIntArray605[anInt8397++] = local21 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local15 = anIntArray605[--anInt8397];
											local21 = Static469.aClass240Array1[local15].method5325();
											anIntArray605[anInt8397++] = local21 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local15 = anIntArray605[--anInt8397];
											local21 = Static469.aClass240Array1[local15].method5325();
											anIntArray605[anInt8397++] = local21 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local15 = anIntArray605[--anInt8397];
											local21 = Static469.aClass240Array1[local15].method5325();
											anIntArray605[anInt8397++] = local21 == 1 ? 1 : 0;
											return;
										}
									} else {
										@Pc(9626) long local9626;
										if (arg0 < 4100) {
											if (arg0 == 4000) {
												anInt8397 -= 2;
												local15 = anIntArray605[anInt8397];
												local21 = anIntArray605[anInt8397 + 1];
												anIntArray605[anInt8397++] = local15 + local21;
												return;
											}
											if (arg0 == 4001) {
												anInt8397 -= 2;
												local15 = anIntArray605[anInt8397];
												local21 = anIntArray605[anInt8397 + 1];
												anIntArray605[anInt8397++] = local15 - local21;
												return;
											}
											if (arg0 == 4002) {
												anInt8397 -= 2;
												local15 = anIntArray605[anInt8397];
												local21 = anIntArray605[anInt8397 + 1];
												anIntArray605[anInt8397++] = local15 * local21;
												return;
											}
											if (arg0 == 4003) {
												anInt8397 -= 2;
												local15 = anIntArray605[anInt8397];
												local21 = anIntArray605[anInt8397 + 1];
												anIntArray605[anInt8397++] = local15 / local21;
												return;
											}
											if (arg0 == 4004) {
												local15 = anIntArray605[--anInt8397];
												anIntArray605[anInt8397++] = (int) (Math.random() * (double) local15);
												return;
											}
											if (arg0 == 4005) {
												local15 = anIntArray605[--anInt8397];
												anIntArray605[anInt8397++] = (int) (Math.random() * (double) (local15 + 1));
												return;
											}
											if (arg0 == 4006) {
												anInt8397 -= 5;
												local15 = anIntArray605[anInt8397];
												local21 = anIntArray605[anInt8397 + 1];
												local27 = anIntArray605[anInt8397 + 2];
												local506 = anIntArray605[anInt8397 + 3];
												local2978 = anIntArray605[anInt8397 + 4];
												anIntArray605[anInt8397++] = local15 + (local21 - local15) * (local2978 - local27) / (local506 - local27);
												return;
											}
											@Pc(9633) long local9633;
											if (arg0 == 4007) {
												anInt8397 -= 2;
												local9626 = (long) anIntArray605[anInt8397];
												local9633 = (long) anIntArray605[anInt8397 + 1];
												anIntArray605[anInt8397++] = (int) (local9626 + local9626 * local9633 / 100L);
												return;
											}
											if (arg0 == 4008) {
												anInt8397 -= 2;
												local15 = anIntArray605[anInt8397];
												local21 = anIntArray605[anInt8397 + 1];
												anIntArray605[anInt8397++] = local15 | 0x1 << local21;
												return;
											}
											if (arg0 == 4009) {
												anInt8397 -= 2;
												local15 = anIntArray605[anInt8397];
												local21 = anIntArray605[anInt8397 + 1];
												anIntArray605[anInt8397++] = local15 & -(0x1 << local21) - 1;
												return;
											}
											if (arg0 == 4010) {
												anInt8397 -= 2;
												local15 = anIntArray605[anInt8397];
												local21 = anIntArray605[anInt8397 + 1];
												anIntArray605[anInt8397++] = (local15 & 0x1 << local21) == 0 ? 0 : 1;
												return;
											}
											if (arg0 == 4011) {
												anInt8397 -= 2;
												local15 = anIntArray605[anInt8397];
												local21 = anIntArray605[anInt8397 + 1];
												anIntArray605[anInt8397++] = local15 % local21;
												return;
											}
											if (arg0 == 4012) {
												anInt8397 -= 2;
												local15 = anIntArray605[anInt8397];
												local21 = anIntArray605[anInt8397 + 1];
												if (local15 == 0) {
													anIntArray605[anInt8397++] = 0;
													return;
												}
												anIntArray605[anInt8397++] = (int) Math.pow((double) local15, (double) local21);
												return;
											}
											if (arg0 == 4013) {
												anInt8397 -= 2;
												local15 = anIntArray605[anInt8397];
												local21 = anIntArray605[anInt8397 + 1];
												if (local15 == 0) {
													anIntArray605[anInt8397++] = 0;
													return;
												}
												if (local21 == 0) {
													anIntArray605[anInt8397++] = Integer.MAX_VALUE;
													return;
												}
												anIntArray605[anInt8397++] = (int) Math.pow((double) local15, 1.0D / (double) local21);
												return;
											}
											if (arg0 == 4014) {
												anInt8397 -= 2;
												local15 = anIntArray605[anInt8397];
												local21 = anIntArray605[anInt8397 + 1];
												anIntArray605[anInt8397++] = local15 & local21;
												return;
											}
											if (arg0 == 4015) {
												anInt8397 -= 2;
												local15 = anIntArray605[anInt8397];
												local21 = anIntArray605[anInt8397 + 1];
												anIntArray605[anInt8397++] = local15 | local21;
												return;
											}
											if (arg0 == 4016) {
												anInt8397 -= 2;
												local15 = anIntArray605[anInt8397];
												local21 = anIntArray605[anInt8397 + 1];
												anIntArray605[anInt8397++] = local15 < local21 ? local15 : local21;
												return;
											}
											if (arg0 == 4017) {
												anInt8397 -= 2;
												local15 = anIntArray605[anInt8397];
												local21 = anIntArray605[anInt8397 + 1];
												anIntArray605[anInt8397++] = local15 > local21 ? local15 : local21;
												return;
											}
											if (arg0 == 4018) {
												anInt8397 -= 3;
												local9626 = (long) anIntArray605[anInt8397];
												local9633 = (long) anIntArray605[anInt8397 + 1];
												@Pc(10020) long local10020 = (long) anIntArray605[anInt8397 + 2];
												anIntArray605[anInt8397++] = (int) (local9626 * local10020 / local9633);
												return;
											}
											if (arg0 == 4019) {
												anInt8397 -= 2;
												local15 = anIntArray605[anInt8397];
												local21 = anIntArray605[anInt8397 + 1];
												if (local15 > 700 || local21 > 700) {
													anIntArray605[anInt8397++] = 256;
												}
												@Pc(10083) double local10083 = (Math.random() * (double) (local21 + local15) + 800.0D - (double) local15) / 100.0D;
												anIntArray605[anInt8397++] = (int) (Math.pow(2.0D, local10083) + 0.5D);
												return;
											}
											if (arg0 == 4020) {
												local15 = anIntArray605[--anInt8397];
												anIntArray605[anInt8397++] = Static546.anIntArray610[Static150.method2497(local15) & 0xFFFF];
												return;
											}
										} else if (arg0 < 4200) {
											if (arg0 == 4100) {
												local4883 = aStringArray36[--anInt8398];
												local21 = anIntArray605[--anInt8397];
												aStringArray36[anInt8398++] = local4883 + local21;
												return;
											}
											if (arg0 == 4101) {
												anInt8398 -= 2;
												local4883 = aStringArray36[anInt8398];
												local1394 = aStringArray36[anInt8398 + 1];
												aStringArray36[anInt8398++] = local4883 + local1394;
												return;
											}
											if (arg0 == 4102) {
												local4883 = aStringArray36[--anInt8398];
												local21 = anIntArray605[--anInt8397];
												aStringArray36[anInt8398++] = local4883 + Static619.method7940(true, local21);
												return;
											}
											if (arg0 == 4103) {
												local4883 = aStringArray36[--anInt8398];
												aStringArray36[anInt8398++] = local4883.toLowerCase();
												return;
											}
											if (arg0 == 4104) {
												aStringArray36[anInt8398++] = Static594.method6760(Static96.method9132(anIntArray605[--anInt8397]), Static456.anInt7118);
												return;
											}
											if (arg0 == 4105) {
												anInt8398 -= 2;
												local4883 = aStringArray36[anInt8398];
												local1394 = aStringArray36[anInt8398 + 1];
												if (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aClass34_1 != null && Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aClass34_1.aBoolean86) {
													aStringArray36[anInt8398++] = local1394;
													return;
												}
												aStringArray36[anInt8398++] = local4883;
												return;
											}
											if (arg0 == 4106) {
												local15 = anIntArray605[--anInt8397];
												aStringArray36[anInt8398++] = Integer.toString(local15);
												return;
											}
											if (arg0 == 4107) {
												anInt8398 -= 2;
												anIntArray605[anInt8397++] = Static169.method2736(aStringArray36[anInt8398], aStringArray36[anInt8398 + 1], Static456.anInt7118);
												return;
											}
											@Pc(10403) Class169 local10403;
											if (arg0 == 4108) {
												local4883 = aStringArray36[--anInt8398];
												anInt8397 -= 2;
												local21 = anIntArray605[anInt8397];
												local27 = anIntArray605[anInt8397 + 1];
												local10403 = Static613.method7850(local27, Static652.aClass182_33);
												anIntArray605[anInt8397++] = local10403.method3647(local21, Static212.aClass178Array8, local4883);
												return;
											}
											if (arg0 == 4109) {
												local4883 = aStringArray36[--anInt8398];
												anInt8397 -= 2;
												local21 = anIntArray605[anInt8397];
												local27 = anIntArray605[anInt8397 + 1];
												local10403 = Static613.method7850(local27, Static652.aClass182_33);
												anIntArray605[anInt8397++] = local10403.method3652(local21, Static212.aClass178Array8, local4883);
												return;
											}
											if (arg0 == 4110) {
												anInt8398 -= 2;
												local4883 = aStringArray36[anInt8398];
												local1394 = aStringArray36[anInt8398 + 1];
												if (anIntArray605[--anInt8397] == 1) {
													aStringArray36[anInt8398++] = local4883;
													return;
												}
												aStringArray36[anInt8398++] = local1394;
												return;
											}
											if (arg0 == 4111) {
												local4883 = aStringArray36[--anInt8398];
												aStringArray36[anInt8398++] = Static411.method5495(-4712, local4883);
												return;
											}
											if (arg0 == 4112) {
												local4883 = aStringArray36[--anInt8398];
												local21 = anIntArray605[--anInt8397];
												if (local21 == -1) {
													throw new RuntimeException("null char");
												}
												aStringArray36[anInt8398++] = local4883 + (char) local21;
												return;
											}
											if (arg0 == 4113) {
												local15 = anIntArray605[--anInt8397];
												anIntArray605[anInt8397++] = method7155((char) local15);
												return;
											}
											if (arg0 == 4114) {
												local15 = anIntArray605[--anInt8397];
												anIntArray605[anInt8397++] = Static78.method1726((char) local15) ? 1 : 0;
												return;
											}
											if (arg0 == 4115) {
												local15 = anIntArray605[--anInt8397];
												anIntArray605[anInt8397++] = Static715.method9489((char) local15) ? 1 : 0;
												return;
											}
											if (arg0 == 4116) {
												local15 = anIntArray605[--anInt8397];
												anIntArray605[anInt8397++] = Static20.method621((char) local15) ? 1 : 0;
												return;
											}
											if (arg0 == 4117) {
												local4883 = aStringArray36[--anInt8398];
												if (local4883 != null) {
													anIntArray605[anInt8397++] = local4883.length();
													return;
												}
												anIntArray605[anInt8397++] = 0;
												return;
											}
											if (arg0 == 4118) {
												local4883 = aStringArray36[--anInt8398];
												anInt8397 -= 2;
												local21 = anIntArray605[anInt8397];
												local27 = anIntArray605[anInt8397 + 1];
												aStringArray36[anInt8398++] = local4883.substring(local21, local27);
												return;
											}
											if (arg0 == 4119) {
												local4883 = aStringArray36[--anInt8398];
												@Pc(10769) StringBuffer local10769 = new StringBuffer(local4883.length());
												@Pc(10771) boolean local10771 = false;
												for (local506 = 0; local506 < local4883.length(); local506++) {
													@Pc(10778) char local10778 = local4883.charAt(local506);
													if (local10778 == '<') {
														local10771 = true;
													} else if (local10778 == '>') {
														local10771 = false;
													} else if (!local10771) {
														local10769.append(local10778);
													}
												}
												aStringArray36[anInt8398++] = local10769.toString();
												return;
											}
											if (arg0 == 4120) {
												local4883 = aStringArray36[--anInt8398];
												anInt8397 -= 2;
												local21 = anIntArray605[anInt8397];
												local27 = anIntArray605[anInt8397 + 1];
												anIntArray605[anInt8397++] = local4883.indexOf(local21, local27);
												return;
											}
											if (arg0 == 4121) {
												anInt8398 -= 2;
												local4883 = aStringArray36[anInt8398];
												local1394 = aStringArray36[anInt8398 + 1];
												local27 = anIntArray605[--anInt8397];
												anIntArray605[anInt8397++] = local4883.indexOf(local1394, local27);
												return;
											}
											if (arg0 == 4122) {
												local15 = anIntArray605[--anInt8397];
												anIntArray605[anInt8397++] = Character.toLowerCase((char) local15);
												return;
											}
											if (arg0 == 4123) {
												local15 = anIntArray605[--anInt8397];
												anIntArray605[anInt8397++] = Character.toUpperCase((char) local15);
												return;
											}
											if (arg0 == 4124) {
												local575 = anIntArray605[--anInt8397] != 0;
												local21 = anIntArray605[--anInt8397];
												aStringArray36[anInt8398++] = Static234.method3394(local575, Static456.anInt7118, 0, (long) local21);
												return;
											}
											if (arg0 == 4125) {
												local4883 = aStringArray36[--anInt8398];
												local21 = anIntArray605[--anInt8397];
												@Pc(10998) Class169 local10998 = Static613.method7850(local21, Static652.aClass182_33);
												anIntArray605[anInt8397++] = local10998.method3646(Static212.aClass178Array8, local4883);
												return;
											}
											if (arg0 == 4126) {
												aStringArray36[anInt8398++] = Static456.method6090(Static456.anInt7118, (long) anIntArray605[--anInt8397] * 60000L) + " UTC";
												return;
											}
											if (arg0 == 4127) {
												local9626 = aLongArray22[--anInt8389];
												aStringArray36[anInt8398++] = local9626 == -1L ? "" : Long.toString(local9626, 36).toUpperCase();
												return;
											}
										} else if (arg0 < 4300) {
											if (arg0 == 4200) {
												local15 = anIntArray605[--anInt8397];
												aStringArray36[anInt8398++] = Static606.aClass62_2.method1887(local15).aString94;
												return;
											}
											@Pc(11127) Class275 local11127;
											if (arg0 == 4201) {
												anInt8397 -= 2;
												local15 = anIntArray605[anInt8397];
												local21 = anIntArray605[anInt8397 + 1];
												local11127 = Static606.aClass62_2.method1887(local15);
												if (local21 >= 1 && local21 <= 5 && local11127.aStringArray29[local21 - 1] != null) {
													aStringArray36[anInt8398++] = local11127.aStringArray29[local21 - 1];
													return;
												}
												aStringArray36[anInt8398++] = "";
												return;
											}
											if (arg0 == 4202) {
												anInt8397 -= 2;
												local15 = anIntArray605[anInt8397];
												local21 = anIntArray605[anInt8397 + 1];
												local11127 = Static606.aClass62_2.method1887(local15);
												if (local21 >= 1 && local21 <= 5 && local11127.aStringArray30[local21 - 1] != null) {
													aStringArray36[anInt8398++] = local11127.aStringArray30[local21 - 1];
													return;
												}
												aStringArray36[anInt8398++] = "";
												return;
											}
											if (arg0 == 4203) {
												local15 = anIntArray605[--anInt8397];
												anIntArray605[anInt8397++] = Static606.aClass62_2.method1887(local15).anInt7279;
												return;
											}
											if (arg0 == 4204) {
												local15 = anIntArray605[--anInt8397];
												anIntArray605[anInt8397++] = Static606.aClass62_2.method1887(local15).anInt7250 == 1 ? 1 : 0;
												return;
											}
											@Pc(11301) Class275 local11301;
											if (arg0 == 4205) {
												local15 = anIntArray605[--anInt8397];
												local11301 = Static606.aClass62_2.method1887(local15);
												if (local11301.anInt7228 == -1 && local11301.anInt7266 >= 0) {
													anIntArray605[anInt8397++] = local11301.anInt7266;
													return;
												}
												anIntArray605[anInt8397++] = local15;
												return;
											}
											if (arg0 == 4206) {
												local15 = anIntArray605[--anInt8397];
												local11301 = Static606.aClass62_2.method1887(local15);
												if (local11301.anInt7228 >= 0 && local11301.anInt7266 >= 0) {
													anIntArray605[anInt8397++] = local11301.anInt7266;
													return;
												}
												anIntArray605[anInt8397++] = local15;
												return;
											}
											if (arg0 == 4207) {
												local15 = anIntArray605[--anInt8397];
												anIntArray605[anInt8397++] = Static606.aClass62_2.method1887(local15).aBoolean490 ? 1 : 0;
												return;
											}
											if (arg0 == 4208) {
												anInt8397 -= 2;
												local15 = anIntArray605[anInt8397];
												local21 = anIntArray605[anInt8397 + 1];
												local3848 = Static583.aClass150_2.method3385(local21);
												if (local3848.method6975()) {
													aStringArray36[anInt8398++] = Static606.aClass62_2.method1887(local15).method6281(local3848.aString101, local21);
													return;
												}
												anIntArray605[anInt8397++] = Static606.aClass62_2.method1887(local15).method6283(local3848.anInt8150, local21);
												return;
											}
											if (arg0 == 4209) {
												anInt8397 -= 2;
												local15 = anIntArray605[anInt8397];
												local21 = anIntArray605[anInt8397 + 1] - 1;
												local11127 = Static606.aClass62_2.method1887(local15);
												if (local11127.anInt7287 == local21) {
													anIntArray605[anInt8397++] = local11127.anInt7290;
													return;
												}
												if (local11127.anInt7269 == local21) {
													anIntArray605[anInt8397++] = local11127.anInt7289;
													return;
												}
												anIntArray605[anInt8397++] = -1;
												return;
											}
											if (arg0 == 4210) {
												local4883 = aStringArray36[--anInt8398];
												local21 = anIntArray605[--anInt8397];
												Static657.method8602(local21 == 1, local4883);
												anIntArray605[anInt8397++] = Static685.anInt6067;
												return;
											}
											if (arg0 == 4211) {
												if (Static721.aShortArray66 != null && Static528.anInt8243 < Static685.anInt6067) {
													anIntArray605[anInt8397++] = Static721.aShortArray66[Static528.anInt8243++] & 0xFFFF;
													return;
												}
												anIntArray605[anInt8397++] = -1;
												return;
											}
											if (arg0 == 4212) {
												Static528.anInt8243 = 0;
												return;
											}
											if (arg0 == 4213) {
												local15 = anIntArray605[--anInt8397];
												anIntArray605[anInt8397++] = Static606.aClass62_2.method1887(local15).anInt7262;
												return;
											}
											if (arg0 == 4214) {
												local4883 = aStringArray36[--anInt8398];
												anInt8397 -= 3;
												local21 = anIntArray605[anInt8397];
												local27 = anIntArray605[anInt8397 + 1];
												local506 = anIntArray605[anInt8397 + 2];
												Static467.method6339(local506, local27, local4883, local21 == 1);
												anIntArray605[anInt8397++] = Static685.anInt6067;
												return;
											}
											if (arg0 == 4215) {
												anInt8398 -= 2;
												anInt8397 -= 2;
												local4883 = aStringArray36[anInt8398];
												local21 = anIntArray605[anInt8397];
												local27 = anIntArray605[anInt8397 + 1];
												local7266 = aStringArray36[anInt8398 + 1];
												Static621.method7962(local7266, local27, local4883, local21 == 1);
												anIntArray605[anInt8397++] = Static685.anInt6067;
												return;
											}
										} else if (arg0 < 4400) {
											if (arg0 == 4300) {
												anInt8397 -= 2;
												local15 = anIntArray605[anInt8397];
												local21 = anIntArray605[anInt8397 + 1];
												local3848 = Static583.aClass150_2.method3385(local21);
												if (local3848.method6975()) {
													aStringArray36[anInt8398++] = Static255.aClass14_1.method619(local15).method5033(local3848.aString101, local21);
													return;
												}
												anIntArray605[anInt8397++] = Static255.aClass14_1.method619(local15).method5030(local3848.anInt8150, local21);
												return;
											}
										} else if (arg0 < 4500) {
											if (arg0 == 4400) {
												anInt8397 -= 2;
												local15 = anIntArray605[anInt8397];
												local21 = anIntArray605[anInt8397 + 1];
												local3848 = Static583.aClass150_2.method3385(local21);
												if (local3848.method6975()) {
													aStringArray36[anInt8398++] = Static216.aClass53_3.method1523(local15).method5428(local21, local3848.aString101);
													return;
												}
												anIntArray605[anInt8397++] = Static216.aClass53_3.method1523(local15).method5432(local3848.anInt8150, local21);
												return;
											}
										} else if (arg0 < 4600) {
											if (arg0 == 4500) {
												anInt8397 -= 2;
												local15 = anIntArray605[anInt8397];
												local21 = anIntArray605[anInt8397 + 1];
												local3848 = Static583.aClass150_2.method3385(local21);
												if (local3848.method6975()) {
													aStringArray36[anInt8398++] = Static291.aClass251_1.method5498(local15).method4650(local21, local3848.aString101);
													return;
												}
												anIntArray605[anInt8397++] = Static291.aClass251_1.method5498(local15).method4646(local3848.anInt8150, local21);
												return;
											}
										} else if (arg0 < 4700) {
											if (arg0 == 4600) {
												local15 = anIntArray605[--anInt8397];
												@Pc(11958) Class226 local11958 = Static288.aClass97_1.method2458(local15);
												if (local11958.anIntArray422 != null && local11958.anIntArray422.length > 0) {
													local27 = 0;
													local506 = local11958.anIntArray420[0];
													for (local2978 = 1; local2978 < local11958.anIntArray422.length; local2978++) {
														if (local11958.anIntArray420[local2978] > local506) {
															local27 = local2978;
															local506 = local11958.anIntArray420[local2978];
														}
													}
													anIntArray605[anInt8397++] = local11958.anIntArray422[local27];
													return;
												}
												anIntArray605[anInt8397++] = local11958.anInt5814;
												return;
											}
										} else if (arg0 < 4800) {
											if (arg0 == 4700) {
												anIntArray605[anInt8397++] = Static353.aBoolean363 ? 1 : 0;
												return;
											}
											if (arg0 == 4701) {
												local4883 = aStringArray36[--anInt8398];
												if (Static98.anInt2140 == 7 && !Static524.method7018(-1)) {
													if (local4883.length() > 20) {
														Static539.aByte117 = -4;
														return;
													}
													Static539.aByte117 = -1;
													local4977 = Static507.method6901(Static452.aClass144_69, Static95.aClass292_1.aClass88_2);
													local4977.aClass3_Sub2_Sub1_1.method2065(0);
													local27 = local4977.aClass3_Sub2_Sub1_1.anInt2178;
													local4977.aClass3_Sub2_Sub1_1.method2073(local4883);
													local4977.aClass3_Sub2_Sub1_1.method2057(local4977.aClass3_Sub2_Sub1_1.anInt2178 - local27);
													Static95.aClass292_1.method6855(local4977);
													return;
												}
												Static539.aByte117 = -5;
												return;
											}
											if (arg0 == 4702) {
												anIntArray605[anInt8397++] = Static539.aByte117;
												if (Static539.aByte117 != -1) {
													Static539.aByte117 = -6;
												}
												return;
											}
										}
									}
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local220 = Static254.method3544(anIntArray605[--anInt8397]);
					} else {
						local220 = arg1 ? aClass270_17 : aClass270_16;
					}
					Static539.method7146(local220);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt8397 -= 2;
						local21 = anIntArray605[anInt8397];
						local27 = anIntArray605[anInt8397 + 1];
						if (local220.anInt7020 == -1) {
							Static374.method5102(local220.anInt6973);
							Static571.method7407(local220.anInt6973);
							Static416.method3201(local220.anInt6973);
						}
						if (local21 == -1) {
							local220.anInt7027 = 1;
							local220.anInt7007 = -1;
							local220.anInt7001 = -1;
							return;
						}
						local220.anInt7001 = local21;
						local220.anInt7003 = local27;
						if (arg0 == 1208 || arg0 == 1209) {
							local220.aBoolean478 = true;
						} else {
							local220.aBoolean478 = false;
						}
						@Pc(2236) Class275 local2236 = Static606.aClass62_2.method1887(local21);
						local220.anInt6989 = local2236.anInt7275;
						local220.anInt6993 = local2236.anInt7239;
						local220.anInt7046 = local2236.anInt7241;
						local220.anInt7009 = local2236.anInt7245;
						local220.anInt7043 = local2236.anInt7280;
						local220.anInt7004 = local2236.anInt7244;
						if (arg0 == 1205 || arg0 == 1209) {
							local220.anInt6961 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local220.anInt6961 = 1;
						} else {
							local220.anInt6961 = 2;
						}
						if (local220.anInt7016 > 0) {
							local220.anInt7004 = local220.anInt7004 * 32 / local220.anInt7016;
							return;
						}
						if (local220.anInt7011 > 0) {
							local220.anInt7004 = local220.anInt7004 * 32 / local220.anInt7011;
						}
						return;
					}
					if (arg0 == 1201) {
						local220.anInt7027 = 2;
						local220.anInt7007 = anIntArray605[--anInt8397];
						if (local220.anInt7020 == -1) {
							Static346.method4910(local220.anInt6973);
						}
						return;
					}
					if (arg0 == 1202) {
						local220.anInt7027 = 3;
						local220.anInt7007 = -1;
						if (local220.anInt7020 == -1) {
							Static346.method4910(local220.anInt6973);
						}
						return;
					}
					if (arg0 == 1203) {
						local220.anInt7027 = 6;
						local220.anInt7007 = anIntArray605[--anInt8397];
						if (local220.anInt7020 == -1) {
							Static346.method4910(local220.anInt6973);
						}
						return;
					}
					if (arg0 == 1204) {
						local220.anInt7027 = 5;
						local220.anInt7007 = anIntArray605[--anInt8397];
						if (local220.anInt7020 == -1) {
							Static346.method4910(local220.anInt6973);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt8397 -= 4;
						local220.anInt6962 = anIntArray605[anInt8397];
						local220.anInt7041 = anIntArray605[anInt8397 + 1];
						local220.anInt7005 = anIntArray605[anInt8397 + 2];
						local220.anInt6994 = anIntArray605[anInt8397 + 3];
						Static539.method7146(local220);
						return;
					}
					if (arg0 == 1207) {
						anInt8397 -= 2;
						local220.anInt6965 = anIntArray605[anInt8397];
						local220.anInt7023 = anIntArray605[anInt8397 + 1];
						Static539.method7146(local220);
						return;
					}
					if (arg0 == 1210) {
						anInt8397 -= 4;
						local220.anInt7007 = anIntArray605[anInt8397];
						local220.anInt6977 = anIntArray605[anInt8397 + 1];
						if (anIntArray605[anInt8397 + 2] == 1) {
							local220.anInt7027 = 9;
						} else {
							local220.anInt7027 = 8;
						}
						if (anIntArray605[anInt8397 + 3] == 1) {
							local220.aBoolean478 = true;
						} else {
							local220.aBoolean478 = false;
						}
						if (local220.anInt7020 == -1) {
							Static346.method4910(local220.anInt6973);
						}
						return;
					}
					if (arg0 == 1211) {
						local220.anInt7027 = 5;
						local220.anInt7007 = Static574.anInt8718;
						local220.anInt6977 = 0;
						if (local220.anInt7020 == -1) {
							Static346.method4910(local220.anInt6973);
						}
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(Lclient!nt;)V")
	private static void method7153(@OriginalArg(0) Class270 arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(71) Class270[] local71;
		if (arg0.anInt7020 == -1) {
			@Pc(119) int local119 = arg0.anInt6973 >>> 16;
			@Pc(123) Class270[] local123 = Static158.aClass270ArrayArray1[local119];
			if (local123 == null) {
				local71 = Static172.aClass270ArrayArray2[local119];
				@Pc(132) int local132 = local71.length;
				local123 = Static158.aClass270ArrayArray1[local119] = new Class270[local132];
				Static732.method6316(local71, 0, local123, 0, local71.length);
			}
			@Pc(148) int local148;
			for (local148 = 0; local148 < local123.length && local123[local148] != arg0; local148++) {
			}
			if (local148 >= local123.length) {
				return;
			}
			Static732.method6316(local123, local148 + 1, local123, local148, local123.length - local148 - 1);
			local123[local123.length - 1] = arg0;
			return;
		}
		@Pc(12) Class270 local12 = Static254.method3544(arg0.anInt7050);
		if (local12 == null) {
			return;
		}
		if (local12.aClass270Array2 == local12.aClass270Array3) {
			local12.aClass270Array2 = new Class270[local12.aClass270Array3.length];
			local12.aClass270Array2[local12.aClass270Array2.length - 1] = arg0;
			Static732.method6316(local12.aClass270Array3, 0, local12.aClass270Array2, 0, arg0.anInt7020);
			Static732.method6316(local12.aClass270Array3, arg0.anInt7020 + 1, local12.aClass270Array2, arg0.anInt7020, local12.aClass270Array3.length - arg0.anInt7020 - 1);
			return;
		}
		@Pc(68) int local68 = 0;
		local71 = local12.aClass270Array2;
		while (local68 < local71.length && local71[local68] != arg0) {
			local68++;
		}
		if (local68 >= local71.length) {
			return;
		}
		Static732.method6316(local71, local68 + 1, local71, local68, local71.length - local68 - 1);
		local71[local12.aClass270Array2.length - 1] = arg0;
		return;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(C)I")
	private static int method7155(@OriginalArg(0) char arg0) {
		return Static198.method3051(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!nt;)V")
	private static void method7156(@OriginalArg(0) Class270 arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(69) Class270[] local69;
		if (arg0.anInt7020 == -1) {
			@Pc(106) int local106 = arg0.anInt6973 >>> 16;
			@Pc(110) Class270[] local110 = Static158.aClass270ArrayArray1[local106];
			if (local110 == null) {
				local69 = Static172.aClass270ArrayArray2[local106];
				@Pc(119) int local119 = local69.length;
				local110 = Static158.aClass270ArrayArray1[local106] = new Class270[local119];
				Static732.method6316(local69, 0, local110, 0, local69.length);
			}
			@Pc(135) int local135;
			for (local135 = 0; local135 < local110.length && local110[local135] != arg0; local135++) {
			}
			if (local135 >= local110.length) {
				return;
			}
			Static732.method6316(local110, 0, local110, 1, local135);
			local110[0] = arg0;
			return;
		}
		@Pc(12) Class270 local12 = Static254.method3544(arg0.anInt7050);
		if (local12 == null) {
			return;
		}
		if (local12.aClass270Array2 == local12.aClass270Array3) {
			local12.aClass270Array2 = new Class270[local12.aClass270Array3.length];
			local12.aClass270Array2[0] = arg0;
			Static732.method6316(local12.aClass270Array3, 0, local12.aClass270Array2, 1, arg0.anInt7020);
			Static732.method6316(local12.aClass270Array3, arg0.anInt7020 + 1, local12.aClass270Array2, arg0.anInt7020 + 1, local12.aClass270Array3.length - arg0.anInt7020 - 1);
			return;
		}
		@Pc(66) int local66 = 0;
		local69 = local12.aClass270Array2;
		while (local66 < local69.length && local69[local66] != arg0) {
			local66++;
		}
		if (local66 >= local69.length) {
			return;
		}
		Static732.method6316(local69, 0, local69, 1, local66);
		local69[0] = arg0;
		return;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!maa;I)V")
	private static void method7157(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray4;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class3_Sub7_Sub1 local12 = Static86.method1881(local8);
		if (local12 == null) {
			return;
		}
		anIntArray606 = new int[local12.anInt1119];
		@Pc(22) int local22 = 0;
		aStringArray35 = new String[local12.anInt1118];
		@Pc(28) int local28 = 0;
		aLongArray21 = new long[local12.anInt1114];
		@Pc(34) int local34 = 0;
		for (@Pc(36) int local36 = 1; local36 < local2.length; local36++) {
			if (local2[local36] instanceof Integer) {
				@Pc(48) int local48 = (Integer) local2[local36];
				if (local48 == -2147483647) {
					local48 = arg0.anInt6145;
				}
				if (local48 == -2147483646) {
					local48 = arg0.anInt6143;
				}
				if (local48 == -2147483645) {
					local48 = arg0.aClass270_12 == null ? -1 : arg0.aClass270_12.anInt6973;
				}
				if (local48 == -2147483644) {
					local48 = arg0.anInt6147;
				}
				if (local48 == -2147483643) {
					local48 = arg0.aClass270_12 == null ? -1 : arg0.aClass270_12.anInt7020;
				}
				if (local48 == -2147483642) {
					local48 = arg0.aClass270_13 == null ? -1 : arg0.aClass270_13.anInt6973;
				}
				if (local48 == -2147483641) {
					local48 = arg0.aClass270_13 == null ? -1 : arg0.aClass270_13.anInt7020;
				}
				if (local48 == -2147483640) {
					local48 = arg0.anInt6140;
				}
				if (local48 == -2147483639) {
					local48 = arg0.anInt6148;
				}
				anIntArray606[local22++] = local48;
			} else if (local2[local36] instanceof String) {
				@Pc(154) String local154 = (String) local2[local36];
				if (local154.equals("event_opbase")) {
					local154 = arg0.aString82;
				}
				aStringArray35[local28++] = local154;
			} else if (local2[local36] instanceof Long) {
				@Pc(180) long local180 = (Long) local2[local36];
				aLongArray21[local34++] = local180;
			}
		}
		anInt8402 = arg0.anInt6141;
		method7164(local12, arg1);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "()V")
	public static void method7158() {
	}

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "(I)V")
	public static void method7159(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static221.method3276(arg0)) {
			return;
		}
		@Pc(14) Class270[] local14 = Static172.aClass270ArrayArray2[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(21) Class270 local21 = local14[local16];
			if (local21.anObjectArray31 != null) {
				@Pc(28) Class3_Sub41 local28 = new Class3_Sub41();
				local28.aClass270_12 = local21;
				local28.anObjectArray4 = local21.anObjectArray31;
				method7157(local28, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!maa;)V")
	public static void method7160(@OriginalArg(0) Class3_Sub41 arg0) {
		method7157(arg0, 200000);
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)J")
	private static long method7161(@OriginalArg(0) int arg0) {
		@Pc(9) Long local9 = aClass84_3.method2323(Static346.aClass309_6.anInt8217 << 16 | arg0);
		return local9 == null ? -1L : local9;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!dja;II)V")
	public static void method7162(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class3_Sub7_Sub1 local5 = Static106.method2116(arg1, arg2, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray606 = new int[local5.anInt1119];
		aStringArray35 = new String[local5.anInt1118];
		if (local5.aClass78_1 == Static210.aClass78_5 || local5.aClass78_1 == Static657.aClass78_14 || local5.aClass78_1 == Static165.aClass78_4) {
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = 0;
			if (Static140.aClass270_6 != null) {
				local35 = Static140.aClass270_6.anInt7036;
				local37 = Static140.aClass270_6.anInt6981;
			}
			anIntArray606[0] = Static334.aClass18_1.method4192() - local35;
			anIntArray606[1] = Static334.aClass18_1.method4196() - local37;
		}
		method7164(local5, 200000);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method7163(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class3_Sub7_Sub1 local5 = Static106.method2116(arg0, -1, Static639.aClass78_12);
		if (local5 == null) {
			return;
		}
		anIntArray606 = new int[local5.anInt1119];
		aStringArray35 = new String[local5.anInt1118];
		aStringArray35[0] = arg1;
		anIntArray606[0] = arg2;
		method7164(local5, 200000);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!b;I)V")
	private static void method7164(@OriginalArg(0) Class3_Sub7_Sub1 arg0, @OriginalArg(1) int arg1) {
		anInt8397 = 0;
		anInt8398 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray66;
		@Pc(11) int[] local11 = arg0.anIntArray65;
		@Pc(13) byte local13 = -1;
		anInt8390 = 0;
		@Pc(706) int local706;
		try {
			@Pc(17) int local17 = 0;
			label381: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(34) int local34 = local8[local5];
				if (aBoolean564 && (aString107 == null || arg0.aString10 != null && arg0.aString10.indexOf(aString107) != -1)) {
					System.out.println(arg0.aString10 + ": " + local34);
				}
				if (local34 >= 150) {
					@Pc(1436) boolean local1436;
					if (local11[local5] == 1) {
						local1436 = true;
					} else {
						local1436 = false;
					}
					if (local34 >= 150 && local34 < 5000) {
						method7152(local34, local1436);
					} else if (local34 >= 5000 && local34 < 10000) {
						method7165(local34, local1436);
					} else {
						throw new IllegalStateException("Command: " + local34);
					}
				} else if (local34 == 0) {
					anIntArray605[anInt8397++] = local11[local5];
				} else {
					@Pc(96) int local96;
					if (local34 == 1) {
						local96 = local11[local5];
						anIntArray605[anInt8397++] = Static380.aClass127_1.anIntArray219[local96];
					} else if (local34 == 2) {
						local96 = local11[local5];
						Static380.aClass127_1.method2988(anIntArray605[--anInt8397], local96);
					} else if (local34 == 3) {
						aStringArray36[anInt8398++] = arg0.aStringArray2[local5];
					} else if (local34 == 6) {
						local5 += local11[local5];
					} else if (local34 == 7) {
						anInt8397 -= 2;
						if (anIntArray605[anInt8397] != anIntArray605[anInt8397 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 8) {
						anInt8397 -= 2;
						if (anIntArray605[anInt8397] == anIntArray605[anInt8397 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 9) {
						anInt8397 -= 2;
						if (anIntArray605[anInt8397] < anIntArray605[anInt8397 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 10) {
						anInt8397 -= 2;
						if (anIntArray605[anInt8397] > anIntArray605[anInt8397 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 21) {
						if (anInt8390 == 0) {
							return;
						}
						@Pc(270) Class340 local270 = aClass340Array1[--anInt8390];
						arg0 = local270.aClass3_Sub7_Sub1_1;
						local8 = arg0.anIntArray66;
						local11 = arg0.anIntArray65;
						local5 = local270.anInt8961;
						anIntArray606 = local270.anIntArray655;
						aStringArray35 = local270.aStringArray40;
						aLongArray21 = local270.aLongArray23;
					} else if (local34 == 25) {
						local96 = local11[local5];
						anIntArray605[anInt8397++] = Static380.aClass127_1.method6960(local96);
					} else if (local34 == 27) {
						local96 = local11[local5];
						Static380.aClass127_1.method2987(local96, anIntArray605[--anInt8397]);
					} else if (local34 == 31) {
						anInt8397 -= 2;
						if (anIntArray605[anInt8397] <= anIntArray605[anInt8397 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 32) {
						anInt8397 -= 2;
						if (anIntArray605[anInt8397] >= anIntArray605[anInt8397 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 33) {
						anIntArray605[anInt8397++] = anIntArray606[local11[local5]];
					} else if (local34 == 34) {
						anIntArray606[local11[local5]] = anIntArray605[--anInt8397];
					} else if (local34 == 35) {
						aStringArray36[anInt8398++] = aStringArray35[local11[local5]];
					} else if (local34 == 36) {
						aStringArray35[local11[local5]] = aStringArray36[--anInt8398];
					} else {
						@Pc(465) String local465;
						if (local34 == 37) {
							local96 = local11[local5];
							anInt8398 -= local96;
							local465 = Static713.method9476(anInt8398, local96, aStringArray36);
							aStringArray36[anInt8398++] = local465;
						} else if (local34 == 38) {
							anInt8397--;
						} else if (local34 == 39) {
							anInt8398--;
						} else if (local34 == 40) {
							local96 = local11[local5];
							@Pc(503) Class3_Sub7_Sub1 local503 = Static86.method1881(local96);
							if (local503 == null) {
								throw new RuntimeException();
							}
							@Pc(514) int[] local514 = new int[local503.anInt1119];
							@Pc(518) String[] local518 = new String[local503.anInt1118];
							@Pc(522) long[] local522 = new long[local503.anInt1114];
							for (@Pc(524) int local524 = 0; local524 < local503.anInt1112; local524++) {
								local514[local524] = anIntArray605[anInt8397 + local524 - local503.anInt1112];
							}
							for (@Pc(543) int local543 = 0; local543 < local503.anInt1116; local543++) {
								local518[local543] = aStringArray36[anInt8398 + local543 - local503.anInt1116];
							}
							for (@Pc(562) int local562 = 0; local562 < local503.anInt1117; local562++) {
								local522[local562] = aLongArray22[anInt8389 + local562 - local503.anInt1117];
							}
							anInt8397 -= local503.anInt1112;
							anInt8398 -= local503.anInt1116;
							anInt8389 -= local503.anInt1117;
							@Pc(598) Class340 local598 = new Class340();
							local598.aClass3_Sub7_Sub1_1 = arg0;
							local598.anInt8961 = local5;
							local598.anIntArray655 = anIntArray606;
							local598.aStringArray40 = aStringArray35;
							local598.aLongArray23 = aLongArray21;
							if (anInt8390 >= aClass340Array1.length) {
								throw new RuntimeException();
							}
							aClass340Array1[anInt8390++] = local598;
							arg0 = local503;
							local8 = local503.anIntArray66;
							local11 = local503.anIntArray65;
							local5 = -1;
							anIntArray606 = local514;
							aStringArray35 = local518;
							aLongArray21 = local522;
						} else if (local34 == 42) {
							anIntArray605[anInt8397++] = Static227.anIntArray269[local11[local5]];
						} else if (local34 == 43) {
							local96 = local11[local5];
							Static227.anIntArray269[local96] = anIntArray605[--anInt8397];
							Static198.method3050(local96);
							Static652.aBoolean155 |= Static317.aBooleanArray10[local96];
						} else if (local34 == 44) {
							local96 = local11[local5] >> 16;
							local706 = local11[local5] & 0xFFFF;
							@Pc(714) int local714 = anIntArray605[--anInt8397];
							if (local714 >= 0 && local714 <= 5000) {
								anIntArray603[local96] = local714;
								@Pc(732) byte local732 = -1;
								if (local706 == 105) {
									local732 = 0;
								}
								@Pc(739) int local739 = 0;
								while (true) {
									if (local739 >= local714) {
										continue label381;
									}
									anIntArrayArray45[local96][local739] = local732;
									local739++;
								}
							}
							throw new RuntimeException();
						} else if (local34 == 45) {
							local96 = local11[local5];
							local706 = anIntArray605[--anInt8397];
							if (local706 < 0 || local706 >= anIntArray603[local96]) {
								throw new RuntimeException();
							}
							anIntArray605[anInt8397++] = anIntArrayArray45[local96][local706];
						} else if (local34 == 46) {
							local96 = local11[local5];
							anInt8397 -= 2;
							local706 = anIntArray605[anInt8397];
							if (local706 < 0 || local706 >= anIntArray603[local96]) {
								throw new RuntimeException();
							}
							anIntArrayArray45[local96][local706] = anIntArray605[anInt8397 + 1];
						} else if (local34 == 47) {
							@Pc(843) String local843 = Static115.aStringArray8[local11[local5]];
							if (local843 == null) {
								local843 = "null";
							}
							aStringArray36[anInt8398++] = local843;
						} else if (local34 == 48) {
							local96 = local11[local5];
							Static115.aStringArray8[local96] = aStringArray36[--anInt8398];
							Static466.method6307(local96);
						} else if (local34 == 51) {
							@Pc(889) Class313 local889 = arg0.aClass313Array1[local11[local5]];
							@Pc(902) Class3_Sub44 local902 = (Class3_Sub44) local889.method7104((long) anIntArray605[--anInt8397]);
							if (local902 != null) {
								local5 += local902.anInt7298;
							}
						} else if (local34 == 54) {
							aLongArray22[anInt8389++] = arg0.aLongArray2[local5];
						} else if (local34 == 55) {
							anInt8389--;
						} else if (local34 == 66) {
							aLongArray22[anInt8389++] = aLongArray21[local11[local5]];
						} else if (local34 == 67) {
							aLongArray21[local11[local5]] = aLongArray22[--anInt8389];
						} else if (local34 == 68) {
							anInt8389 -= 2;
							if (aLongArray22[anInt8389] != aLongArray22[anInt8389 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 69) {
							anInt8389 -= 2;
							if (aLongArray22[anInt8389] == aLongArray22[anInt8389 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 70) {
							anInt8389 -= 2;
							if (aLongArray22[anInt8389] < aLongArray22[anInt8389 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 71) {
							anInt8389 -= 2;
							if (aLongArray22[anInt8389] > aLongArray22[anInt8389 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 72) {
							anInt8389 -= 2;
							if (aLongArray22[anInt8389] <= aLongArray22[anInt8389 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 73) {
							anInt8389 -= 2;
							if (aLongArray22[anInt8389] >= aLongArray22[anInt8389 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 86) {
							if (anIntArray605[--anInt8397] == 1) {
								local5 += local11[local5];
							}
						} else if (local34 == 87) {
							if (anIntArray605[--anInt8397] == 0) {
								local5 += local11[local5];
							}
						} else if (local34 == 106) {
							local96 = local11[local5];
							@Pc(1178) Integer local1178 = (Integer) Static637.anObjectArray39[local96];
							if (local1178 == null) {
								@Pc(1185) Class69 local1185 = Static118.aClass17_1.method653(local96);
								if (local1185.aChar1 == 'i' || local1185.aChar1 == '1') {
									anIntArray605[anInt8397++] = 0;
								} else {
									anIntArray605[anInt8397++] = -1;
								}
							} else {
								anIntArray605[anInt8397++] = local1178;
							}
						} else if (local34 == 107) {
							local96 = local11[local5];
							@Pc(1236) Class69 local1236 = Static118.aClass17_1.method653(local96);
							if (local1236.aChar1 != '\u0001') {
								anIntArray605[anInt8397++] = 0;
							}
							@Pc(1256) Integer local1256 = (Integer) Static637.anObjectArray39[local1236.anInt2131];
							if (local1256 == null) {
								anIntArray605[anInt8397++] = 0;
							} else {
								@Pc(1284) int local1284 = local1236.anInt2128 == 31 ? -1 : (0x1 << local1236.anInt2128 + 1) - 1;
								anIntArray605[anInt8397++] = (local1256 & local1284) >>> local1236.anInt2130;
							}
						} else if (local34 == 108) {
							local96 = local11[local5];
							@Pc(1311) Long local1311 = (Long) Static637.anObjectArray39[local96];
							if (local1311 == null) {
								aLongArray22[anInt8389++] = -1L;
							} else {
								aLongArray22[anInt8389++] = local1311;
							}
						} else if (local34 == 109) {
							local96 = local11[local5];
							local465 = (String) Static637.anObjectArray39[local96];
							if (local465 == null) {
								aStringArray36[anInt8398++] = "";
							} else {
								aStringArray36[anInt8398++] = local465;
							}
						} else if (local34 == 112) {
							anIntArray605[anInt8397++] = method7150(local11[local5]);
						} else if (local34 == 113) {
							anIntArray605[anInt8397++] = method7151(local11[local5]);
						} else if (local34 == 114) {
							aLongArray22[anInt8389++] = method7161(local11[local5]);
						} else if (local34 == 115) {
							aStringArray36[anInt8398++] = method7148(local11[local5]);
						}
					}
				}
			}
		} catch (@Pc(1479) Exception local1479) {
			@Pc(1484) StringBuffer local1484 = new StringBuffer(30);
			local1484.append("CS2: ").append(arg0.aLong345).append(" ");
			for (local706 = anInt8390 - 1; local706 >= 0; local706--) {
				local1484.append("v: ").append(aClass340Array1[local706].aClass3_Sub7_Sub1_1.aLong345).append(" ");
			}
			local1484.append("op: ").append(local13);
			Static275.method4893(local1484.toString(), local1479);
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IZ)V")
	private static void method7165(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(109) int local109;
		@Pc(375) int local375;
		@Pc(95) String local95;
		@Pc(192) int local192;
		@Pc(1578) boolean local1578;
		@Pc(834) int local834;
		@Pc(115) int local115;
		@Pc(198) String local198;
		@Pc(101) String local101;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray605[anInt8397++] = Static485.anInt7642;
				return;
			}
			@Pc(57) Class292 local57;
			@Pc(63) Class3_Sub29 local63;
			if (arg0 == 5001) {
				anInt8397 -= 3;
				Static485.anInt7642 = anIntArray605[anInt8397];
				Static684.aClass74_4 = Static283.method3998(anIntArray605[anInt8397 + 1]);
				if (Static684.aClass74_4 == null) {
					Static684.aClass74_4 = Static129.aClass74_1;
				}
				Static276.anInt4230 = anIntArray605[anInt8397 + 2];
				local57 = Static631.method8307();
				local63 = Static507.method6901(Static144.aClass144_24, local57.aClass88_2);
				local63.aClass3_Sub2_Sub1_1.method2065(Static485.anInt7642);
				local63.aClass3_Sub2_Sub1_1.method2065(Static684.aClass74_4.anInt2269);
				local63.aClass3_Sub2_Sub1_1.method2065(Static276.anInt4230);
				local57.method6855(local63);
				return;
			}
			if (arg0 == 5002) {
				anInt8398 -= 2;
				local95 = aStringArray36[anInt8398];
				local101 = aStringArray36[anInt8398 + 1];
				anInt8397 -= 2;
				local109 = anIntArray605[anInt8397];
				local115 = anIntArray605[anInt8397 + 1];
				if (local101 == null) {
					local101 = "";
				}
				if (local101.length() > 80) {
					local101 = local101.substring(0, 80);
				}
				@Pc(135) Class292 local135 = Static631.method8307();
				@Pc(141) Class3_Sub29 local141 = Static507.method6901(Static402.aClass144_64, local135.aClass88_2);
				local141.aClass3_Sub2_Sub1_1.method2065(Static63.method1479(local95) + Static63.method1479(local101) + 2);
				local141.aClass3_Sub2_Sub1_1.method2073(local95);
				local141.aClass3_Sub2_Sub1_1.method2065(local109 - 1);
				local141.aClass3_Sub2_Sub1_1.method2065(local115);
				local141.aClass3_Sub2_Sub1_1.method2073(local101);
				local135.method6855(local141);
				return;
			}
			@Pc(196) Class31 local196;
			if (arg0 == 5003) {
				local192 = anIntArray605[--anInt8397];
				local196 = Static234.method3391(local192);
				local198 = "";
				if (local196 != null && local196.aString13 != null) {
					local198 = local196.aString13;
				}
				aStringArray36[anInt8398++] = local198;
				return;
			}
			if (arg0 == 5004) {
				local192 = anIntArray605[--anInt8397];
				local196 = Static234.method3391(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt1198;
				}
				anIntArray605[anInt8397++] = local109;
				return;
			}
			if (arg0 == 5005) {
				if (Static684.aClass74_4 == null) {
					anIntArray605[anInt8397++] = -1;
					return;
				}
				anIntArray605[anInt8397++] = Static684.aClass74_4.anInt2269;
				return;
			}
			@Pc(295) Class3_Sub29 local295;
			@Pc(289) Class292 local289;
			if (arg0 == 5006) {
				local192 = anIntArray605[--anInt8397];
				local289 = Static631.method8307();
				local295 = Static507.method6901(Static219.aClass144_37, local289.aClass88_2);
				local295.aClass3_Sub2_Sub1_1.method2065(local192);
				local289.method6855(local295);
				return;
			}
			if (arg0 == 5008) {
				local95 = aStringArray36[--anInt8398];
				method7147(local95, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt8398 -= 2;
				local95 = aStringArray36[anInt8398];
				local101 = aStringArray36[anInt8398 + 1];
				if (Static432.anInt6579 != 0 || (!Static24.aBoolean48 || Static584.aBoolean596) && !Static297.aBoolean293) {
					@Pc(360) Class292 local360 = Static631.method8307();
					@Pc(366) Class3_Sub29 local366 = Static507.method6901(Static25.aClass144_6, local360.aClass88_2);
					local366.aClass3_Sub2_Sub1_1.method2065(0);
					local375 = local366.aClass3_Sub2_Sub1_1.anInt2178;
					local366.aClass3_Sub2_Sub1_1.method2073(local95);
					Static710.method4896(local101, local366.aClass3_Sub2_Sub1_1);
					local366.aClass3_Sub2_Sub1_1.method2057(local366.aClass3_Sub2_Sub1_1.anInt2178 - local375);
					local360.method6855(local366);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local192 = anIntArray605[--anInt8397];
				local196 = Static234.method3391(local192);
				local198 = "";
				if (local196 != null && local196.aString14 != null) {
					local198 = local196.aString14;
				}
				aStringArray36[anInt8398++] = local198;
				return;
			}
			if (arg0 == 5011) {
				local192 = anIntArray605[--anInt8397];
				local196 = Static234.method3391(local192);
				local198 = "";
				if (local196 != null && local196.aString15 != null) {
					local198 = local196.aString15;
				}
				aStringArray36[anInt8398++] = local198;
				return;
			}
			if (arg0 == 5012) {
				local192 = anIntArray605[--anInt8397];
				local196 = Static234.method3391(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt1197;
				}
				anIntArray605[anInt8397++] = local109;
				return;
			}
			if (arg0 == 5015) {
				if (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2 == null || Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aString3 == null) {
					local95 = "";
				} else {
					local95 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.method475();
				}
				aStringArray36[anInt8398++] = local95;
				return;
			}
			if (arg0 == 5016) {
				anIntArray605[anInt8397++] = Static276.anInt4230;
				return;
			}
			if (arg0 == 5017) {
				anIntArray605[anInt8397++] = Static380.method5130();
				return;
			}
			if (arg0 == 5018) {
				local192 = anIntArray605[--anInt8397];
				local196 = Static234.method3391(local192);
				local109 = 0;
				if (local196 != null) {
					local109 = local196.anInt1201;
				}
				anIntArray605[anInt8397++] = local109;
				return;
			}
			if (arg0 == 5019) {
				local192 = anIntArray605[--anInt8397];
				local196 = Static234.method3391(local192);
				local198 = "";
				if (local196 != null && local196.aString17 != null) {
					local198 = local196.aString17;
				}
				aStringArray36[anInt8398++] = local198;
				return;
			}
			if (arg0 == 5020) {
				if (Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2 == null || Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aString3 == null) {
					local95 = "";
				} else {
					local95 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.method472();
				}
				aStringArray36[anInt8398++] = local95;
				return;
			}
			if (arg0 == 5023) {
				local192 = anIntArray605[--anInt8397];
				local196 = Static234.method3391(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt1199;
				}
				anIntArray605[anInt8397++] = local109;
				return;
			}
			if (arg0 == 5024) {
				local192 = anIntArray605[--anInt8397];
				local196 = Static234.method3391(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt1195;
				}
				anIntArray605[anInt8397++] = local109;
				return;
			}
			if (arg0 == 5025) {
				local192 = anIntArray605[--anInt8397];
				local196 = Static234.method3391(local192);
				local198 = "";
				if (local196 != null && local196.aString16 != null) {
					local198 = local196.aString16;
				}
				aStringArray36[anInt8398++] = local198;
				return;
			}
			if (arg0 == 5050) {
				local192 = anIntArray605[--anInt8397];
				aStringArray36[anInt8398++] = Static521.aClass249_1.method5448(local192).aString11;
				return;
			}
			@Pc(793) Class3_Sub7_Sub2 local793;
			if (arg0 == 5051) {
				local192 = anIntArray605[--anInt8397];
				local793 = Static521.aClass249_1.method5448(local192);
				if (local793.anIntArray71 == null) {
					anIntArray605[anInt8397++] = 0;
					return;
				}
				anIntArray605[anInt8397++] = local793.anIntArray71.length;
				return;
			}
			if (arg0 == 5052) {
				anInt8397 -= 2;
				local192 = anIntArray605[anInt8397];
				local834 = anIntArray605[anInt8397 + 1];
				@Pc(839) Class3_Sub7_Sub2 local839 = Static521.aClass249_1.method5448(local192);
				local115 = local839.anIntArray71[local834];
				anIntArray605[anInt8397++] = local115;
				return;
			}
			if (arg0 == 5053) {
				local192 = anIntArray605[--anInt8397];
				local793 = Static521.aClass249_1.method5448(local192);
				if (local793.anIntArray70 == null) {
					anIntArray605[anInt8397++] = 0;
					return;
				}
				anIntArray605[anInt8397++] = local793.anIntArray70.length;
				return;
			}
			if (arg0 == 5054) {
				anInt8397 -= 2;
				local192 = anIntArray605[anInt8397];
				local834 = anIntArray605[anInt8397 + 1];
				anIntArray605[anInt8397++] = Static521.aClass249_1.method5448(local192).anIntArray70[local834];
				return;
			}
			if (arg0 == 5055) {
				local192 = anIntArray605[--anInt8397];
				aStringArray36[anInt8398++] = Static134.aClass246_1.method5420(local192).method8500();
				return;
			}
			if (arg0 == 5056) {
				local192 = anIntArray605[--anInt8397];
				@Pc(966) Class3_Sub7_Sub20 local966 = Static134.aClass246_1.method5420(local192);
				if (local966.anIntArray719 == null) {
					anIntArray605[anInt8397++] = 0;
					return;
				}
				anIntArray605[anInt8397++] = local966.anIntArray719.length;
				return;
			}
			if (arg0 == 5057) {
				anInt8397 -= 2;
				local192 = anIntArray605[anInt8397];
				local834 = anIntArray605[anInt8397 + 1];
				anIntArray605[anInt8397++] = Static134.aClass246_1.method5420(local192).anIntArray719[local834];
				return;
			}
			if (arg0 == 5058) {
				aClass210_1 = new Class210();
				aClass210_1.anInt5499 = anIntArray605[--anInt8397];
				aClass210_1.aClass3_Sub7_Sub20_1 = Static134.aClass246_1.method5420(aClass210_1.anInt5499);
				aClass210_1.anIntArray395 = new int[aClass210_1.aClass3_Sub7_Sub20_1.method8493()];
				return;
			}
			if (arg0 == 5059) {
				local57 = Static631.method8307();
				local63 = Static507.method6901(Static572.aClass144_87, local57.aClass88_2);
				local63.aClass3_Sub2_Sub1_1.method2065(0);
				local109 = local63.aClass3_Sub2_Sub1_1.anInt2178;
				local63.aClass3_Sub2_Sub1_1.method2065(0);
				local63.aClass3_Sub2_Sub1_1.method2032(aClass210_1.anInt5499);
				aClass210_1.aClass3_Sub7_Sub20_1.method8495(local63.aClass3_Sub2_Sub1_1, aClass210_1.anIntArray395);
				local63.aClass3_Sub2_Sub1_1.method2057(local63.aClass3_Sub2_Sub1_1.anInt2178 - local109);
				local57.method6855(local63);
				return;
			}
			if (arg0 == 5060) {
				local95 = aStringArray36[--anInt8398];
				local289 = Static631.method8307();
				local295 = Static507.method6901(Static719.aClass144_78, local289.aClass88_2);
				local295.aClass3_Sub2_Sub1_1.method2065(0);
				local115 = local295.aClass3_Sub2_Sub1_1.anInt2178;
				local295.aClass3_Sub2_Sub1_1.method2073(local95);
				local295.aClass3_Sub2_Sub1_1.method2032(aClass210_1.anInt5499);
				aClass210_1.aClass3_Sub7_Sub20_1.method8495(local295.aClass3_Sub2_Sub1_1, aClass210_1.anIntArray395);
				local295.aClass3_Sub2_Sub1_1.method2057(local295.aClass3_Sub2_Sub1_1.anInt2178 - local115);
				local289.method6855(local295);
				return;
			}
			if (arg0 == 5061) {
				local57 = Static631.method8307();
				local63 = Static507.method6901(Static572.aClass144_87, local57.aClass88_2);
				local63.aClass3_Sub2_Sub1_1.method2065(0);
				local109 = local63.aClass3_Sub2_Sub1_1.anInt2178;
				local63.aClass3_Sub2_Sub1_1.method2065(1);
				local63.aClass3_Sub2_Sub1_1.method2032(aClass210_1.anInt5499);
				aClass210_1.aClass3_Sub7_Sub20_1.method8495(local63.aClass3_Sub2_Sub1_1, aClass210_1.anIntArray395);
				local63.aClass3_Sub2_Sub1_1.method2057(local63.aClass3_Sub2_Sub1_1.anInt2178 - local109);
				local57.method6855(local63);
				return;
			}
			if (arg0 == 5062) {
				anInt8397 -= 2;
				local192 = anIntArray605[anInt8397];
				local834 = anIntArray605[anInt8397 + 1];
				anIntArray605[anInt8397++] = Static521.aClass249_1.method5448(local192).aCharArray1[local834];
				return;
			}
			if (arg0 == 5063) {
				anInt8397 -= 2;
				local192 = anIntArray605[anInt8397];
				local834 = anIntArray605[anInt8397 + 1];
				anIntArray605[anInt8397++] = Static521.aClass249_1.method5448(local192).aCharArray2[local834];
				return;
			}
			if (arg0 == 5064) {
				anInt8397 -= 2;
				local192 = anIntArray605[anInt8397];
				local834 = anIntArray605[anInt8397 + 1];
				if (local834 == -1) {
					anIntArray605[anInt8397++] = -1;
					return;
				}
				anIntArray605[anInt8397++] = Static521.aClass249_1.method5448(local192).method1096((char) local834);
				return;
			}
			if (arg0 == 5065) {
				anInt8397 -= 2;
				local192 = anIntArray605[anInt8397];
				local834 = anIntArray605[anInt8397 + 1];
				if (local834 == -1) {
					anIntArray605[anInt8397++] = -1;
					return;
				}
				anIntArray605[anInt8397++] = Static521.aClass249_1.method5448(local192).method1091((char) local834);
				return;
			}
			if (arg0 == 5066) {
				local192 = anIntArray605[--anInt8397];
				anIntArray605[anInt8397++] = Static134.aClass246_1.method5420(local192).method8493();
				return;
			}
			if (arg0 == 5067) {
				anInt8397 -= 2;
				local192 = anIntArray605[anInt8397];
				local834 = anIntArray605[anInt8397 + 1];
				local109 = Static134.aClass246_1.method5420(local192).method8498(local834).anInt3237;
				anIntArray605[anInt8397++] = local109;
				return;
			}
			if (arg0 == 5068) {
				anInt8397 -= 2;
				local192 = anIntArray605[anInt8397];
				local834 = anIntArray605[anInt8397 + 1];
				aClass210_1.anIntArray395[local192] = local834;
				return;
			}
			if (arg0 == 5069) {
				anInt8397 -= 2;
				local192 = anIntArray605[anInt8397];
				local834 = anIntArray605[anInt8397 + 1];
				aClass210_1.anIntArray395[local192] = local834;
				return;
			}
			if (arg0 == 5070) {
				anInt8397 -= 3;
				local192 = anIntArray605[anInt8397];
				local834 = anIntArray605[anInt8397 + 1];
				local109 = anIntArray605[anInt8397 + 2];
				@Pc(1526) Class3_Sub7_Sub20 local1526 = Static134.aClass246_1.method5420(local192);
				if (local1526.method8498(local834).anInt3237 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray605[anInt8397++] = local1526.method8494(local834, local109);
				return;
			}
			if (arg0 == 5071) {
				local95 = aStringArray36[--anInt8398];
				local1578 = anIntArray605[--anInt8397] == 1;
				Static114.method2191(local95, local1578);
				anIntArray605[anInt8397++] = Static685.anInt6067;
				return;
			}
			if (arg0 == 5072) {
				if (Static721.aShortArray66 != null && Static528.anInt8243 < Static685.anInt6067) {
					anIntArray605[anInt8397++] = Static721.aShortArray66[Static528.anInt8243++] & 0xFFFF;
					return;
				}
				anIntArray605[anInt8397++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static528.anInt8243 = 0;
				return;
			}
			if (arg0 == 5074) {
				local57 = Static631.method8307();
				local63 = Static507.method6901(Static572.aClass144_87, local57.aClass88_2);
				local63.aClass3_Sub2_Sub1_1.method2065(0);
				local109 = local63.aClass3_Sub2_Sub1_1.anInt2178;
				local63.aClass3_Sub2_Sub1_1.method2065(2);
				local63.aClass3_Sub2_Sub1_1.method2032(aClass210_1.anInt5499);
				aClass210_1.aClass3_Sub7_Sub20_1.method8495(local63.aClass3_Sub2_Sub1_1, aClass210_1.anIntArray395);
				local63.aClass3_Sub2_Sub1_1.method2057(local63.aClass3_Sub2_Sub1_1.anInt2178 - local109);
				local57.method6855(local63);
				return;
			}
			if (arg0 == 5075) {
				local57 = Static631.method8307();
				local63 = Static507.method6901(Static572.aClass144_87, local57.aClass88_2);
				local63.aClass3_Sub2_Sub1_1.method2065(0);
				local109 = local63.aClass3_Sub2_Sub1_1.anInt2178;
				local63.aClass3_Sub2_Sub1_1.method2065(3);
				local63.aClass3_Sub2_Sub1_1.method2032(aClass210_1.anInt5499);
				aClass210_1.aClass3_Sub7_Sub20_1.method8495(local63.aClass3_Sub2_Sub1_1, aClass210_1.anIntArray395);
				local63.aClass3_Sub2_Sub1_1.method2057(local63.aClass3_Sub2_Sub1_1.anInt2178 - local109);
				local57.method6855(local63);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static43.aClass50_1.method7394(86)) {
					anIntArray605[anInt8397++] = 1;
					return;
				}
				anIntArray605[anInt8397++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static43.aClass50_1.method7394(82)) {
					anIntArray605[anInt8397++] = 1;
					return;
				}
				anIntArray605[anInt8397++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static43.aClass50_1.method7394(81)) {
					anIntArray605[anInt8397++] = 1;
					return;
				}
				anIntArray605[anInt8397++] = 0;
				return;
			}
		} else {
			@Pc(2331) boolean local2331;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static507.method6905(-112, anIntArray605[--anInt8397]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray605[anInt8397++] = Static148.method2487();
					return;
				}
				if (arg0 == 5205) {
					Static76.method1623(-1, -1, false, anIntArray605[--anInt8397]);
					return;
				}
				@Pc(1908) Class3_Sub7_Sub18 local1908;
				if (arg0 == 5206) {
					local192 = anIntArray605[--anInt8397];
					local1908 = Static327.method1007(local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
					if (local1908 == null) {
						anIntArray605[anInt8397++] = -1;
						return;
					}
					anIntArray605[anInt8397++] = local1908.anInt8103;
					return;
				}
				@Pc(1942) Class3_Sub7_Sub18 local1942;
				if (arg0 == 5207) {
					local1942 = Static327.method1014(anIntArray605[--anInt8397]);
					if (local1942 != null && local1942.aString99 != null) {
						aStringArray36[anInt8398++] = local1942.aString99;
						return;
					}
					aStringArray36[anInt8398++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray605[anInt8397++] = Static353.anInt5602;
					anIntArray605[anInt8397++] = Static353.anInt5597;
					return;
				}
				if (arg0 == 5209) {
					anIntArray605[anInt8397++] = Static550.anInt8467 + Static327.anInt1084;
					anIntArray605[anInt8397++] = Static90.anInt4562 + Static327.anInt1076;
					return;
				}
				if (arg0 == 5210) {
					local192 = anIntArray605[--anInt8397];
					local1908 = Static327.method1014(local192);
					if (local1908 == null) {
						anIntArray605[anInt8397++] = 0;
						anIntArray605[anInt8397++] = 0;
						return;
					}
					anIntArray605[anInt8397++] = local1908.anInt8107 >> 14 & 0x3FFF;
					anIntArray605[anInt8397++] = local1908.anInt8107 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local192 = anIntArray605[--anInt8397];
					local1908 = Static327.method1014(local192);
					if (local1908 == null) {
						anIntArray605[anInt8397++] = 0;
						anIntArray605[anInt8397++] = 0;
						return;
					}
					anIntArray605[anInt8397++] = local1908.anInt8108 - local1908.anInt8097;
					anIntArray605[anInt8397++] = local1908.anInt8111 - local1908.anInt8102;
					return;
				}
				@Pc(2139) Class3_Sub48 local2139;
				if (arg0 == 5212) {
					local2139 = Static390.method5300();
					if (local2139 == null) {
						anIntArray605[anInt8397++] = -1;
						anIntArray605[anInt8397++] = -1;
						return;
					}
					anIntArray605[anInt8397++] = local2139.anInt8050;
					local834 = local2139.anInt8048 << 28 | local2139.anInt8047 + Static327.anInt1084 << 14 | local2139.anInt8049 + Static327.anInt1076;
					anIntArray605[anInt8397++] = local834;
					return;
				}
				if (arg0 == 5213) {
					local2139 = Static464.method8628();
					if (local2139 == null) {
						anIntArray605[anInt8397++] = -1;
						anIntArray605[anInt8397++] = -1;
						return;
					}
					anIntArray605[anInt8397++] = local2139.anInt8050;
					local834 = local2139.anInt8048 << 28 | local2139.anInt8047 + Static327.anInt1084 << 14 | local2139.anInt8049 + Static327.anInt1076;
					anIntArray605[anInt8397++] = local834;
					return;
				}
				@Pc(2289) boolean local2289;
				if (arg0 == 5214) {
					local192 = anIntArray605[--anInt8397];
					local1908 = Static145.method2459();
					if (local1908 != null) {
						local2289 = local1908.method6936(local192 >> 28 & 0x3, local192 & 0x3FFF, local192 >> 14 & 0x3FFF, anIntArray604);
						if (local2289) {
							Static80.method3577(anIntArray604[2], anIntArray604[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt8397 -= 2;
					local192 = anIntArray605[anInt8397];
					local834 = anIntArray605[anInt8397 + 1];
					@Pc(2329) Class147 local2329 = Static327.method1009(local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
					local2331 = false;
					for (@Pc(2336) Class3_Sub7_Sub18 local2336 = (Class3_Sub7_Sub18) local2329.method3334(); local2336 != null; local2336 = (Class3_Sub7_Sub18) local2329.method3332()) {
						if (local2336.anInt8103 == local834) {
							local2331 = true;
							break;
						}
					}
					if (local2331) {
						anIntArray605[anInt8397++] = 1;
						return;
					}
					anIntArray605[anInt8397++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local192 = anIntArray605[--anInt8397];
					local1908 = Static327.method1014(local192);
					if (local1908 == null) {
						anIntArray605[anInt8397++] = -1;
						return;
					}
					anIntArray605[anInt8397++] = local1908.anInt8101;
					return;
				}
				if (arg0 == 5220) {
					anIntArray605[anInt8397++] = Static147.anInt2696 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local192 = anIntArray605[--anInt8397];
					Static80.method3577(local192 & 0x3FFF, local192 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1942 = Static145.method2459();
					if (local1942 != null) {
						local1578 = local1942.method6942(anIntArray604, Static550.anInt8467 + Static327.anInt1084, Static90.anInt4562 + Static327.anInt1076);
						if (local1578) {
							anIntArray605[anInt8397++] = anIntArray604[1];
							anIntArray605[anInt8397++] = anIntArray604[2];
							return;
						}
						anIntArray605[anInt8397++] = -1;
						anIntArray605[anInt8397++] = -1;
						return;
					}
					anIntArray605[anInt8397++] = -1;
					anIntArray605[anInt8397++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt8397 -= 2;
					local192 = anIntArray605[anInt8397];
					local834 = anIntArray605[anInt8397 + 1];
					Static76.method1623(local834 >> 14 & 0x3FFF, local834 & 0x3FFF, false, local192);
					return;
				}
				if (arg0 == 5224) {
					local192 = anIntArray605[--anInt8397];
					local1908 = Static145.method2459();
					if (local1908 != null) {
						local2289 = local1908.method6936(local192 >> 28 & 0x3, local192 & 0x3FFF, local192 >> 14 & 0x3FFF, anIntArray604);
						if (local2289) {
							anIntArray605[anInt8397++] = anIntArray604[1];
							anIntArray605[anInt8397++] = anIntArray604[2];
							return;
						}
						anIntArray605[anInt8397++] = -1;
						anIntArray605[anInt8397++] = -1;
						return;
					}
					anIntArray605[anInt8397++] = -1;
					anIntArray605[anInt8397++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local192 = anIntArray605[--anInt8397];
					local1908 = Static145.method2459();
					if (local1908 != null) {
						local2289 = local1908.method6942(anIntArray604, local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
						if (local2289) {
							anIntArray605[anInt8397++] = anIntArray604[1];
							anIntArray605[anInt8397++] = anIntArray604[2];
							return;
						}
						anIntArray605[anInt8397++] = -1;
						anIntArray605[anInt8397++] = -1;
						return;
					}
					anIntArray605[anInt8397++] = -1;
					anIntArray605[anInt8397++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static234.method3396(anIntArray605[--anInt8397]);
					return;
				}
				if (arg0 == 5227) {
					anInt8397 -= 2;
					local192 = anIntArray605[anInt8397];
					local834 = anIntArray605[anInt8397 + 1];
					Static76.method1623(local834 >> 14 & 0x3FFF, local834 & 0x3FFF, true, local192);
					return;
				}
				if (arg0 == 5228) {
					Static247.aBoolean242 = anIntArray605[--anInt8397] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray605[anInt8397++] = Static247.aBoolean242 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local192 = anIntArray605[--anInt8397];
					Static31.method1036(local192);
					return;
				}
				@Pc(2867) Class3 local2867;
				if (arg0 == 5231) {
					anInt8397 -= 2;
					local192 = anIntArray605[anInt8397];
					local1578 = anIntArray605[anInt8397 + 1] == 1;
					if (Static356.aClass313_26 != null) {
						local2867 = Static356.aClass313_26.method7104((long) local192);
						if (local2867 != null && !local1578) {
							local2867.method9596();
							return;
						}
						if (local2867 == null && local1578) {
							local2867 = new Class3();
							Static356.aClass313_26.method7107((long) local192, local2867);
						}
					}
					return;
				}
				@Pc(2914) Class3 local2914;
				if (arg0 == 5232) {
					local192 = anIntArray605[--anInt8397];
					if (Static356.aClass313_26 != null) {
						local2914 = Static356.aClass313_26.method7104((long) local192);
						anIntArray605[anInt8397++] = local2914 == null ? 0 : 1;
						return;
					}
					anIntArray605[anInt8397++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt8397 -= 2;
					local192 = anIntArray605[anInt8397];
					local1578 = anIntArray605[anInt8397 + 1] == 1;
					if (Static147.aClass313_13 != null) {
						local2867 = Static147.aClass313_13.method7104((long) local192);
						if (local2867 != null && !local1578) {
							local2867.method9596();
							return;
						}
						if (local2867 == null && local1578) {
							local2867 = new Class3();
							Static147.aClass313_13.method7107((long) local192, local2867);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local192 = anIntArray605[--anInt8397];
					if (Static147.aClass313_13 != null) {
						local2914 = Static147.aClass313_13.method7104((long) local192);
						anIntArray605[anInt8397++] = local2914 == null ? 0 : 1;
						return;
					}
					anIntArray605[anInt8397++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray605[anInt8397++] = Static327.aClass3_Sub7_Sub18_2 == null ? -1 : Static327.aClass3_Sub7_Sub18_2.anInt8103;
					return;
				}
				if (arg0 == 5236) {
					anInt8397 -= 2;
					local192 = anIntArray605[anInt8397];
					local834 = anIntArray605[anInt8397 + 1];
					local109 = local834 >> 14 & 0x3FFF;
					local115 = local834 & 0x3FFF;
					local375 = Static493.method6697(local192, local109, local115);
					if (local375 < 0) {
						anIntArray605[anInt8397++] = -1;
						return;
					}
					anIntArray605[anInt8397++] = local375;
					return;
				}
				if (arg0 == 5237) {
					Static172.method2787();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt8397 -= 2;
					local192 = anIntArray605[anInt8397];
					local834 = anIntArray605[anInt8397 + 1];
					Static112.method2180(3, false, local192, local834);
					anIntArray605[anInt8397++] = Static702.aFrame3 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static702.aFrame3 != null) {
						Static112.method2180(Static580.aClass3_Sub22_24.aClass21_Sub29_1.method8657(), false, -1, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(3186) Class192[] local3186 = Static439.method5851();
					anIntArray605[anInt8397++] = local3186.length;
					return;
				}
				if (arg0 == 5303) {
					local192 = anIntArray605[--anInt8397];
					@Pc(3210) Class192[] local3210 = Static439.method5851();
					anIntArray605[anInt8397++] = local3210[local192].anInt4995;
					anIntArray605[anInt8397++] = local3210[local192].anInt4999;
					return;
				}
				if (arg0 == 5305) {
					local192 = Static109.anInt2314;
					local834 = Static508.anInt8074;
					local109 = -1;
					@Pc(3245) Class192[] local3245 = Static439.method5851();
					for (local375 = 0; local375 < local3245.length; local375++) {
						@Pc(3252) Class192 local3252 = local3245[local375];
						if (local3252.anInt4995 == local192 && local3252.anInt4999 == local834) {
							local109 = local375;
							break;
						}
					}
					anIntArray605[anInt8397++] = local109;
					return;
				}
				if (arg0 == 5306) {
					anIntArray605[anInt8397++] = Static276.method3880(3);
					return;
				}
				if (arg0 == 5307) {
					local192 = anIntArray605[--anInt8397];
					if (local192 >= 1 && local192 <= 2) {
						Static112.method2180(local192, false, -1, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub29_1.method8657();
					return;
				}
				if (arg0 == 5309) {
					local192 = anIntArray605[--anInt8397];
					if (local192 >= 1 && local192 <= 2) {
						Static580.aClass3_Sub22_24.method2423(local192, Static580.aClass3_Sub22_24.aClass21_Sub29_1);
						Static580.aClass3_Sub22_24.method2423(local192, Static580.aClass3_Sub22_24.aClass21_Sub29_2);
						Static124.method2284();
						return;
					}
					return;
				}
			} else {
				@Pc(3561) int local3561;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt8398 -= 2;
						local95 = aStringArray36[anInt8398];
						local101 = aStringArray36[anInt8398 + 1];
						local109 = anIntArray605[--anInt8397];
						@Pc(3411) Class292 local3411 = Static631.method8307();
						@Pc(3417) Class3_Sub29 local3417 = Static507.method6901(Static252.aClass144_74, local3411.aClass88_2);
						local3417.aClass3_Sub2_Sub1_1.method2065(Static63.method1479(local95) + Static63.method1479(local101) + 1);
						local3417.aClass3_Sub2_Sub1_1.method2073(local95);
						local3417.aClass3_Sub2_Sub1_1.method2073(local101);
						local3417.aClass3_Sub2_Sub1_1.method2065(local109);
						local3411.method6855(local3417);
						return;
					}
					if (arg0 == 5401) {
						anInt8397 -= 2;
						Static657.aShortArray139[anIntArray605[anInt8397]] = (short) Static454.method6020(anIntArray605[anInt8397 + 1]);
						Static606.aClass62_2.method1888();
						Static606.aClass62_2.method1884();
						Static255.aClass14_1.method618();
						Static402.method5423();
						return;
					}
					if (arg0 == 5405) {
						anInt8397 -= 2;
						local192 = anIntArray605[anInt8397];
						local834 = anIntArray605[anInt8397 + 1];
						if (local192 >= 0 && local192 < 2) {
							Static269.anIntArrayArrayArray5[local192] = new int[local834 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt8397 -= 7;
						local192 = anIntArray605[anInt8397];
						local834 = anIntArray605[anInt8397 + 1] << 1;
						local109 = anIntArray605[anInt8397 + 2];
						local115 = anIntArray605[anInt8397 + 3];
						local375 = anIntArray605[anInt8397 + 4];
						local3561 = anIntArray605[anInt8397 + 5];
						@Pc(3567) int local3567 = anIntArray605[anInt8397 + 6];
						if (local192 >= 0 && local192 < 2 && Static269.anIntArrayArrayArray5[local192] != null && local834 >= 0 && local834 < Static269.anIntArrayArrayArray5[local192].length) {
							Static269.anIntArrayArrayArray5[local192][local834] = new int[] { (local109 >> 14 & 0x3FFF) << 9, local115 << 2, (local109 & 0x3FFF) << 9, local3567 };
							Static269.anIntArrayArrayArray5[local192][local834 + 1] = new int[] { (local375 >> 14 & 0x3FFF) << 9, local3561 << 2, (local375 & 0x3FFF) << 9 };
						}
						return;
					}
					if (arg0 == 5407) {
						local192 = Static269.anIntArrayArrayArray5[anIntArray605[--anInt8397]].length >> 1;
						anIntArray605[anInt8397++] = local192;
						return;
					}
					if (arg0 == 5411) {
						if (Static702.aFrame3 != null) {
							Static112.method2180(Static580.aClass3_Sub22_24.aClass21_Sub29_1.method8657(), false, -1, -1);
						}
						if (Static628.aFrame2 != null) {
							Static563.method7341();
							System.exit(0);
							return;
						}
						local95 = Static7.aString2 == null ? Static638.method8413() : Static7.aString2;
						Static280.method3947(false, local95, Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620() == 1, Static122.aClass47_1);
						return;
					}
					if (arg0 == 5419) {
						local95 = "";
						if (Static85.aClass338_3 != null) {
							if (Static85.aClass338_3.anObject16 == null) {
								local95 = Static350.method4930(Static85.aClass338_3.anInt8936);
							} else {
								local95 = (String) Static85.aClass338_3.anObject16;
							}
						}
						aStringArray36[anInt8398++] = local95;
						return;
					}
					if (arg0 == 5420) {
						anIntArray605[anInt8397++] = Static122.aClass47_1.aBoolean105 ? 0 : 1;
						return;
					}
					if (arg0 == 5421) {
						if (Static702.aFrame3 != null) {
							Static112.method2180(Static580.aClass3_Sub22_24.aClass21_Sub29_1.method8657(), false, -1, -1);
						}
						local95 = aStringArray36[--anInt8398];
						local1578 = anIntArray605[--anInt8397] == 1;
						local198 = Static638.method8413() + local95;
						Static280.method3947(local1578, local198, Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620() == 1, Static122.aClass47_1);
						return;
					}
					if (arg0 == 5422) {
						anInt8398 -= 2;
						local95 = aStringArray36[anInt8398];
						local101 = aStringArray36[anInt8398 + 1];
						local109 = anIntArray605[--anInt8397];
						if (local95.length() > 0) {
							if (Static586.aStringArray39 == null) {
								Static586.aStringArray39 = new String[Static260.anIntArray301[Static346.aClass309_6.anInt8217]];
							}
							Static586.aStringArray39[local109] = local95;
						}
						if (local101.length() > 0) {
							if (Static231.aStringArray19 == null) {
								Static231.aStringArray19 = new String[Static260.anIntArray301[Static346.aClass309_6.anInt8217]];
							}
							Static231.aStringArray19[local109] = local101;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray36[--anInt8398]);
						return;
					}
					if (arg0 == 5424) {
						anInt8397 -= 11;
						Static32.anInt1113 = anIntArray605[anInt8397];
						Static276.anInt4227 = anIntArray605[anInt8397 + 1];
						Static302.anInt4870 = anIntArray605[anInt8397 + 2];
						Static591.anInt8978 = anIntArray605[anInt8397 + 3];
						Static393.anInt6110 = anIntArray605[anInt8397 + 4];
						Static481.anInt7537 = anIntArray605[anInt8397 + 5];
						Static649.anInt10015 = anIntArray605[anInt8397 + 6];
						Static66.anInt1586 = anIntArray605[anInt8397 + 7];
						Static298.anInt4559 = anIntArray605[anInt8397 + 8];
						Static587.anInt8945 = anIntArray605[anInt8397 + 9];
						Static119.anInt6371 = anIntArray605[anInt8397 + 10];
						Static218.aClass182_59.method3964(Static393.anInt6110);
						Static218.aClass182_59.method3964(Static481.anInt7537);
						Static218.aClass182_59.method3964(Static649.anInt10015);
						Static218.aClass182_59.method3964(Static66.anInt1586);
						Static218.aClass182_59.method3964(Static298.anInt4559);
						Static724.aClass178_34 = null;
						Static11.aClass178_1 = null;
						Static627.aClass178_27 = null;
						Static392.aClass178_12 = null;
						Static490.aClass178_21 = null;
						Static111.aClass178_2 = null;
						Static628.aClass178_28 = null;
						Static551.aClass178_22 = null;
						Static477.aBoolean508 = true;
						return;
					}
					if (arg0 == 5425) {
						Static494.method6740();
						Static477.aBoolean508 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt8397 -= 2;
						Static52.anInt1387 = anIntArray605[anInt8397];
						Static337.anInt5410 = anIntArray605[anInt8397 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt8397 -= 2;
						return;
					}
					if (arg0 == 5428) {
						anInt8397 -= 2;
						local192 = anIntArray605[anInt8397];
						local834 = anIntArray605[anInt8397 + 1];
						anIntArray605[anInt8397++] = Static627.method8254(local834, local192) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static382.method1852(false, aStringArray36[--anInt8398], false);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static728.method688(Static41.anApplet1, "accountcreated");
							return;
						} catch (@Pc(4148) Throwable local4148) {
							return;
						}
					}
					if (arg0 == 5431) {
						try {
							Static728.method688(Static41.anApplet1, "accountcreatestarted");
							return;
						} catch (@Pc(4161) Throwable local4161) {
							return;
						}
					}
					if (arg0 == 5432) {
						local95 = "";
						if (Static627.aClipboard1 != null) {
							@Pc(4173) Transferable local4173 = Static627.aClipboard1.getContents((Object) null);
							if (local4173 != null) {
								try {
									local95 = (String) local4173.getTransferData(DataFlavor.stringFlavor);
									if (local95 == null) {
										local95 = "";
									}
								} catch (@Pc(4186) Exception local4186) {
								}
							}
						}
						aStringArray36[anInt8398++] = local95;
						return;
					}
					if (arg0 == 5433) {
						Static7.anInt227 = anIntArray605[--anInt8397];
						return;
					}
					if (arg0 == 5435) {
						anIntArray605[anInt8397++] = Static304.aBoolean320 ? 1 : 0;
						return;
					}
					if (arg0 == 5436) {
						if (Static12.aClass3_Sub39_12.anInt5866 < 6) {
							anIntArray605[anInt8397++] = 0;
							return;
						}
						if (Static12.aClass3_Sub39_12.anInt5866 == 6 && Static12.aClass3_Sub39_12.anInt5860 < 10) {
							anIntArray605[anInt8397++] = 0;
							return;
						}
						anIntArray605[anInt8397++] = 1;
						return;
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt8397 -= 4;
						local192 = anIntArray605[anInt8397];
						local834 = anIntArray605[anInt8397 + 1];
						local109 = anIntArray605[anInt8397 + 2];
						local115 = anIntArray605[anInt8397 + 3];
						Static727.method9602(local115, (local192 & 0x3FFF) - Static189.anInt3243, local834 << 2, (local192 >> 14 & 0x3FFF) - Static291.anInt4448, false, local109);
						return;
					}
					if (arg0 == 5501) {
						anInt8397 -= 4;
						local192 = anIntArray605[anInt8397];
						local834 = anIntArray605[anInt8397 + 1];
						local109 = anIntArray605[anInt8397 + 2];
						local115 = anIntArray605[anInt8397 + 3];
						Static51.method1286(local834 << 2, (local192 & 0x3FFF) - Static189.anInt3243, (local192 >> 14 & 0x3FFF) - Static291.anInt4448, local115, local109);
						return;
					}
					if (arg0 == 5502) {
						anInt8397 -= 6;
						local192 = anIntArray605[anInt8397];
						if (local192 >= 2) {
							throw new RuntimeException();
						}
						Static67.anInt1614 = local192;
						local834 = anIntArray605[anInt8397 + 1];
						if (local834 + 1 >= Static269.anIntArrayArrayArray5[Static67.anInt1614].length >> 1) {
							throw new RuntimeException();
						}
						Static430.anInt6558 = local834;
						Static93.anInt2108 = 0;
						Static675.anInt10593 = anIntArray605[anInt8397 + 2];
						Static212.anInt3494 = anIntArray605[anInt8397 + 3];
						local109 = anIntArray605[anInt8397 + 4];
						if (local109 >= 2) {
							throw new RuntimeException();
						}
						Static565.anInt8603 = local109;
						local115 = anIntArray605[anInt8397 + 5];
						if (local115 + 1 >= Static269.anIntArrayArrayArray5[Static565.anInt8603].length >> 1) {
							throw new RuntimeException();
						}
						Static686.anInt10661 = local115;
						Static262.anInt4081 = 3;
						Static358.anInt5640 = -1;
						Static494.anInt7853 = -1;
						return;
					}
					if (arg0 == 5503) {
						Static492.method6653();
						return;
					}
					if (arg0 == 5504) {
						anInt8397 -= 2;
						Static143.method2427(anIntArray605[anInt8397 + 1], anIntArray605[anInt8397]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray605[anInt8397++] = (int) Static447.aFloat107 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray605[anInt8397++] = (int) Static382.aFloat40 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static316.method4633();
						return;
					}
					if (arg0 == 5508) {
						Static376.method5110();
						return;
					}
					if (arg0 == 5509) {
						Static588.method7595();
						return;
					}
					if (arg0 == 5510) {
						Static495.method6771();
						return;
					}
					if (arg0 == 5511) {
						local192 = anIntArray605[--anInt8397];
						local834 = local192 >> 14 & 0x3FFF;
						local109 = local192 & 0x3FFF;
						local834 -= Static291.anInt4448;
						if (local834 < 0) {
							local834 = 0;
						} else if (local834 >= Static497.anInt7926) {
							local834 = Static497.anInt7926;
						}
						local109 -= Static189.anInt3243;
						if (local109 < 0) {
							local109 = 0;
						} else if (local109 >= Static646.anInt9979) {
							local109 = Static646.anInt9979;
						}
						Static13.anInt566 = (local834 << 9) + 256;
						Static78.anInt1842 = (local109 << 9) + 256;
						Static262.anInt4081 = 4;
						Static358.anInt5640 = -1;
						Static494.anInt7853 = -1;
						return;
					}
					if (arg0 == 5512) {
						Static456.method6104();
						return;
					}
					if (arg0 == 5514) {
						Static668.anInt10259 = anIntArray605[--anInt8397];
						return;
					}
					if (arg0 == 5516) {
						anIntArray605[anInt8397++] = Static668.anInt10259;
						return;
					}
					if (arg0 == 5517) {
						local192 = anIntArray605[--anInt8397];
						if (local192 == -1) {
							local834 = local192 >> 14 & 0x3FFF;
							local109 = local192 & 0x3FFF;
							local834 -= Static291.anInt4448;
							if (local834 < 0) {
								local834 = 0;
							} else if (local834 >= Static497.anInt7926) {
								local834 = Static497.anInt7926;
							}
							local109 -= Static189.anInt3243;
							if (local109 < 0) {
								local109 = 0;
							} else if (local109 >= Static646.anInt9979) {
								local109 = Static646.anInt9979;
							}
							Static494.anInt7853 = (local834 << 9) + 256;
							Static358.anInt5640 = (local109 << 9) + 256;
							return;
						}
						Static494.anInt7853 = -1;
						Static358.anInt5640 = -1;
						return;
					}
					if (arg0 == 5547) {
						anIntArray605[anInt8397++] = Static262.anInt4081;
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt8398 -= 2;
						local95 = aStringArray36[anInt8398];
						local101 = aStringArray36[anInt8398 + 1];
						local109 = anIntArray605[--anInt8397];
						Static441.method5857(local101, local95, local109);
						return;
					}
					if (arg0 == 5601) {
						Static638.method8411();
						return;
					}
					if (arg0 == 5602) {
						if (!Static524.method7018(-1)) {
							Static55.method1309();
						}
						return;
					}
					if (arg0 == 5604) {
						anInt8398--;
						if (Static98.anInt2140 != 3) {
							return;
						}
						if (!Static524.method7018(-1) && Static446.anInt6827 == 0) {
							Static163.method2666(aStringArray36[anInt8398]);
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt8398 -= 2;
						anInt8397 -= 2;
						if (Static98.anInt2140 != 3) {
							return;
						}
						if (!Static524.method7018(-1) && Static446.anInt6827 == 0) {
							Static711.method9320(aStringArray36[anInt8398], anIntArray605[anInt8397], aStringArray36[anInt8398 + 1], anIntArray605[anInt8397 + 1] == 1);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static446.anInt6827 == 0) {
							Static468.anInt7366 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray605[anInt8397++] = Static289.anInt4432;
						return;
					}
					if (arg0 == 5608) {
						anIntArray605[anInt8397++] = Static151.anInt2726;
						return;
					}
					if (arg0 == 5609) {
						anIntArray605[anInt8397++] = Static468.anInt7366;
						return;
					}
					if (arg0 == 5611) {
						anIntArray605[anInt8397++] = Static92.anInt2098;
						return;
					}
					if (arg0 == 5612) {
						local192 = anIntArray605[--anInt8397];
						Static475.method6475(local192);
						return;
					}
					if (arg0 == 5613) {
						anIntArray605[anInt8397++] = Static289.anInt4432;
						return;
					}
					if (arg0 == 5615) {
						anInt8398 -= 2;
						local95 = aStringArray36[anInt8398];
						local101 = aStringArray36[anInt8398 + 1];
						Static395.method5347(local101, local95);
						return;
					}
					if (arg0 == 5616) {
						Static164.method2681(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray605[anInt8397++] = Static725.anInt11246;
						return;
					}
					if (arg0 == 5618) {
						anInt8397--;
						return;
					}
					if (arg0 == 5619) {
						anInt8397--;
						return;
					}
					if (arg0 == 5620) {
						anIntArray605[anInt8397++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt8398 -= 2;
						anInt8397 -= 2;
						return;
					}
					if (arg0 == 5622) {
						return;
					}
					if (arg0 == 5623) {
						if (Static633.aByteArray92 != null) {
							anIntArray605[anInt8397++] = 1;
							return;
						}
						anIntArray605[anInt8397++] = 0;
						return;
					}
					if (arg0 == 5624) {
						anIntArray605[anInt8397++] = (int) (Static268.aLong150 >> 32);
						anIntArray605[anInt8397++] = (int) (Static268.aLong150 & 0xFFFFFFFFFFFFFFFFL);
						return;
					}
					if (arg0 == 5625) {
						anIntArray605[anInt8397++] = Static504.aBoolean540 ? 1 : 0;
						return;
					}
					if (arg0 == 5626) {
						Static504.aBoolean540 = true;
						Static434.method9045();
						return;
					}
					if (arg0 == 5627) {
						anIntArray605[anInt8397++] = Static474.anInt7460;
						anIntArray605[anInt8397++] = Static127.anInt2527;
						anIntArray605[anInt8397++] = Static369.anInt5763;
						Static474.anInt7460 = -2;
						Static127.anInt2527 = -1;
						Static369.anInt5763 = -1;
						return;
					}
					if (arg0 == 5628) {
						anIntArray605[anInt8397++] = Static524.method7018(-1) ? 1 : 0;
						return;
					}
					if (arg0 == 5629) {
						anIntArray605[anInt8397++] = Static321.anInt5167;
						return;
					}
					if (arg0 == 5630) {
						Static383.method5139();
						return;
					}
					if (arg0 == 5631) {
						anInt8397 -= 2;
						local192 = anIntArray605[anInt8397];
						local834 = anIntArray605[anInt8397 + 1];
						Static459.method6216(local192, local834);
						return;
					}
					if (arg0 == 5632) {
						local192 = anIntArray605[--anInt8397];
						Static22.method650(local192);
						return;
					}
					if (arg0 == 5633) {
						anIntArray605[anInt8397++] = Static325.anInt5284;
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local192 = anIntArray605[--anInt8397];
						Static580.aClass3_Sub22_24.method2423(local192, Static580.aClass3_Sub22_24.aClass21_Sub18_1);
						Static19.method616();
						Static124.method2284();
						Static569.aBoolean580 = false;
						return;
					}
					@Pc(5330) boolean local5330;
					if (arg0 == 6002) {
						local5330 = anIntArray605[--anInt8397] == 1;
						Static580.aClass3_Sub22_24.method2423(local5330 ? 1 : 0, Static580.aClass3_Sub22_24.aClass21_Sub15_1);
						Static580.aClass3_Sub22_24.method2423(local5330 ? 1 : 0, Static580.aClass3_Sub22_24.aClass21_Sub15_2);
						Static19.method616();
						Static436.method5765();
						Static124.method2284();
						Static569.aBoolean580 = false;
						return;
					}
					if (arg0 == 6003) {
						local5330 = anIntArray605[--anInt8397] == 1;
						Static580.aClass3_Sub22_24.method2423(local5330 ? 2 : 1, Static580.aClass3_Sub22_24.aClass21_Sub21_1);
						Static580.aClass3_Sub22_24.method2423(local5330 ? 2 : 1, Static580.aClass3_Sub22_24.aClass21_Sub21_2);
						Static436.method5765();
						Static124.method2284();
						Static569.aBoolean580 = false;
						return;
					}
					if (arg0 == 6005) {
						Static580.aClass3_Sub22_24.method2423(anIntArray605[--anInt8397] == 1 ? 1 : 0, Static580.aClass3_Sub22_24.aClass21_Sub5_1);
						Static19.method616();
						Static124.method2284();
						Static569.aBoolean580 = false;
						return;
					}
					if (arg0 == 6007) {
						Static580.aClass3_Sub22_24.method2423(anIntArray605[--anInt8397], Static580.aClass3_Sub22_24.aClass21_Sub1_1);
						Static124.method2284();
						Static569.aBoolean580 = false;
						return;
					}
					if (arg0 == 6008) {
						Static580.aClass3_Sub22_24.method2423(anIntArray605[--anInt8397] == 1 ? 1 : 0, Static580.aClass3_Sub22_24.aClass21_Sub9_1);
						Static124.method2284();
						Static569.aBoolean580 = false;
						return;
					}
					if (arg0 == 6010) {
						Static580.aClass3_Sub22_24.method2423(anIntArray605[--anInt8397] == 1 ? 1 : 0, Static580.aClass3_Sub22_24.aClass21_Sub7_1);
						Static124.method2284();
						Static569.aBoolean580 = false;
						return;
					}
					if (arg0 == 6011) {
						Static580.aClass3_Sub22_24.method2423(anIntArray605[--anInt8397], Static580.aClass3_Sub22_24.aClass21_Sub30_1);
						Static19.method616();
						Static124.method2284();
						Static569.aBoolean580 = false;
						return;
					}
					if (arg0 == 6012) {
						Static580.aClass3_Sub22_24.method2423(anIntArray605[--anInt8397] == 1 ? 1 : 0, Static580.aClass3_Sub22_24.aClass21_Sub2_1);
						Static585.method7560();
						Static509.method6646();
						Static124.method2284();
						Static569.aBoolean580 = false;
						return;
					}
					if (arg0 == 6014) {
						Static580.aClass3_Sub22_24.method2423(anIntArray605[--anInt8397] == 1 ? 2 : 0, Static580.aClass3_Sub22_24.aClass21_Sub25_1);
						Static19.method616();
						Static124.method2284();
						Static569.aBoolean580 = false;
						return;
					}
					if (arg0 == 6015) {
						Static580.aClass3_Sub22_24.method2423(anIntArray605[--anInt8397] == 1 ? 1 : 0, Static580.aClass3_Sub22_24.aClass21_Sub8_1);
						Static19.method616();
						Static124.method2284();
						Static569.aBoolean580 = false;
						return;
					}
					if (arg0 == 6016) {
						Static580.aClass3_Sub22_24.method2423(anIntArray605[--anInt8397], Static580.aClass3_Sub22_24.aClass21_Sub6_2);
						Static36.method1127(false, Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620());
						Static124.method2284();
						return;
					}
					if (arg0 == 6017) {
						Static580.aClass3_Sub22_24.method2423(anIntArray605[--anInt8397] == 1 ? 1 : 0, Static580.aClass3_Sub22_24.aClass21_Sub3_1);
						Static476.method6481();
						Static124.method2284();
						Static569.aBoolean580 = false;
						return;
					}
					if (arg0 == 6018) {
						Static580.aClass3_Sub22_24.method2423(anIntArray605[--anInt8397], Static580.aClass3_Sub22_24.aClass21_Sub16_1);
						Static124.method2284();
						Static569.aBoolean580 = false;
						return;
					}
					if (arg0 == 6019) {
						local192 = anIntArray605[--anInt8397];
						local834 = Static580.aClass3_Sub22_24.aClass21_Sub16_4.method5404();
						if (local192 != local834) {
							if (Static472.method6431(Static98.anInt2140)) {
								if (local834 == 0 && Static659.anInt10097 != -1) {
									Static356.method4981(local192, Static185.aClass182_50, Static659.anInt10097);
									Static217.method3246();
									Static627.aBoolean651 = false;
								} else if (local192 == 0) {
									Static625.method8226();
									Static627.aBoolean651 = false;
								} else {
									Static616.method7920(local192);
								}
							}
							Static580.aClass3_Sub22_24.method2423(local192, Static580.aClass3_Sub22_24.aClass21_Sub16_4);
							Static124.method2284();
							Static569.aBoolean580 = false;
						}
						return;
					}
					if (arg0 == 6020) {
						Static580.aClass3_Sub22_24.method2423(anIntArray605[--anInt8397], Static580.aClass3_Sub22_24.aClass21_Sub16_2);
						Static124.method2284();
						Static569.aBoolean580 = false;
						return;
					}
					if (arg0 == 6021) {
						local192 = Static580.aClass3_Sub22_24.aClass21_Sub21_1.method6042();
						Static580.aClass3_Sub22_24.method2423(anIntArray605[--anInt8397] == 1 ? 0 : local192, Static580.aClass3_Sub22_24.aClass21_Sub21_2);
						Static436.method5765();
						return;
					}
					if (arg0 == 6023) {
						local192 = anIntArray605[--anInt8397];
						Static580.aClass3_Sub22_24.method2423(local192, Static580.aClass3_Sub22_24.aClass21_Sub26_1);
						Static124.method2284();
						Static569.aBoolean580 = false;
						return;
					}
					if (arg0 == 6024) {
						Static580.aClass3_Sub22_24.method2423(anIntArray605[--anInt8397], Static580.aClass3_Sub22_24.aClass21_Sub6_1);
						Static124.method2284();
						return;
					}
					if (arg0 == 6025) {
						Static580.aClass3_Sub22_24.method2423(anIntArray605[--anInt8397], Static580.aClass3_Sub22_24.aClass21_Sub23_1);
						Static124.method2284();
						Static569.aBoolean580 = false;
						return;
					}
					if (arg0 == 6027) {
						local192 = anIntArray605[--anInt8397];
						if (local192 < 0 || local192 > 1) {
							local192 = 0;
						}
						Static451.method5965(local192 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static580.aClass3_Sub22_24.method2423(anIntArray605[--anInt8397] == 0 ? 0 : 1, Static580.aClass3_Sub22_24.aClass21_Sub4_1);
						Static124.method2284();
						return;
					}
					if (arg0 == 6029) {
						Static580.aClass3_Sub22_24.method2423(anIntArray605[--anInt8397], Static580.aClass3_Sub22_24.aClass21_Sub1_1);
						Static124.method2284();
						return;
					}
					if (arg0 == 6030) {
						Static580.aClass3_Sub22_24.method2423(anIntArray605[--anInt8397] == 0 ? 0 : 1, Static580.aClass3_Sub22_24.aClass21_Sub22_1);
						Static124.method2284();
						Static19.method616();
						return;
					}
					if (arg0 == 6031) {
						local192 = anIntArray605[--anInt8397];
						if (local192 < 0 || local192 > 5) {
							local192 = 2;
						}
						Static36.method1127(false, local192);
						return;
					}
					if (arg0 == 6032) {
						anInt8397 -= 2;
						local192 = anIntArray605[anInt8397];
						local1578 = anIntArray605[anInt8397 + 1] == 1;
						Static580.aClass3_Sub22_24.method2423(local192, Static580.aClass3_Sub22_24.aClass21_Sub28_1);
						if (!local1578) {
							Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub13_1);
						}
						Static124.method2284();
						Static569.aBoolean580 = false;
						return;
					}
					if (arg0 == 6033) {
						Static580.aClass3_Sub22_24.method2423(anIntArray605[--anInt8397], Static580.aClass3_Sub22_24.aClass21_Sub12_1);
						Static124.method2284();
						return;
					}
					if (arg0 == 6034) {
						Static580.aClass3_Sub22_24.method2423(anIntArray605[--anInt8397] == 1 ? 1 : 0, Static580.aClass3_Sub22_24.aClass21_Sub27_1);
						Static124.method2284();
						Static585.method7560();
						Static569.aBoolean580 = false;
						return;
					}
					if (arg0 == 6035) {
						local192 = Static580.aClass3_Sub22_24.aClass21_Sub15_1.method5064();
						Static580.aClass3_Sub22_24.method2423(anIntArray605[--anInt8397] == 1 ? 1 : local192, Static580.aClass3_Sub22_24.aClass21_Sub15_2);
						Static19.method616();
						Static436.method5765();
						return;
					}
					if (arg0 == 6036) {
						Static580.aClass3_Sub22_24.method2423(anIntArray605[--anInt8397], Static580.aClass3_Sub22_24.aClass21_Sub11_1);
						Static124.method2284();
						Static477.aBoolean507 = true;
						return;
					}
					if (arg0 == 6037) {
						Static580.aClass3_Sub22_24.method2423(anIntArray605[--anInt8397], Static580.aClass3_Sub22_24.aClass21_Sub16_5);
						Static124.method2284();
						Static569.aBoolean580 = false;
						return;
					}
					if (arg0 == 6038) {
						local192 = anIntArray605[--anInt8397];
						local834 = Static580.aClass3_Sub22_24.aClass21_Sub16_3.method5404();
						if (local192 != local834 && Static659.anInt10097 == Static480.anInt7532) {
							if (!Static472.method6431(Static98.anInt2140)) {
								if (local834 == 0) {
									Static356.method4981(local192, Static185.aClass182_50, Static659.anInt10097);
									Static217.method3246();
									Static627.aBoolean651 = false;
								} else if (local192 == 0) {
									Static625.method8226();
									Static627.aBoolean651 = false;
								} else {
									Static616.method7920(local192);
								}
							}
							Static580.aClass3_Sub22_24.method2423(local192, Static580.aClass3_Sub22_24.aClass21_Sub16_3);
							Static124.method2284();
							Static569.aBoolean580 = false;
						}
						return;
					}
					if (arg0 == 6039) {
						local192 = anIntArray605[--anInt8397];
						if (local192 > 255 || local192 < 0) {
							local192 = 0;
						}
						if (local192 != Static580.aClass3_Sub22_24.aClass21_Sub17_1.method5418()) {
							Static580.aClass3_Sub22_24.method2423(local192, Static580.aClass3_Sub22_24.aClass21_Sub17_1);
							Static124.method2284();
							Static569.aBoolean580 = false;
						}
						return;
					}
					if (arg0 == 6040) {
						local192 = anIntArray605[--anInt8397];
						if (local192 != Static580.aClass3_Sub22_24.aClass21_Sub10_1.method4499()) {
							Static580.aClass3_Sub22_24.method2423(local192, Static580.aClass3_Sub22_24.aClass21_Sub10_1);
							Static124.method2284();
							Static569.aBoolean580 = false;
							Static248.method3510();
						}
						return;
					}
					if (arg0 == 6041) {
						local192 = anIntArray605[--anInt8397];
						if (local192 != Static580.aClass3_Sub22_24.aClass21_Sub14_1.method5011()) {
							Static580.aClass3_Sub22_24.method2423(local192, Static580.aClass3_Sub22_24.aClass21_Sub14_1);
							Static124.method2284();
							Static569.aBoolean580 = false;
						}
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub18_1.method5634();
						return;
					}
					if (arg0 == 6102) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub15_1.method5064() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub21_1.method6042() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub5_1.method2407() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub1_1.method712();
						return;
					}
					if (arg0 == 6108) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub9_1.method4103() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub7_1.method3410() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub30_1.method9242();
						return;
					}
					if (arg0 == 6112) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub2_1.method1740() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub25_1.method7954() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub8_1.method3997() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub6_2.method3188();
						return;
					}
					if (arg0 == 6117) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub3_1.method1940() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub16_1.method5404();
						return;
					}
					if (arg0 == 6119) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub16_4.method5404();
						return;
					}
					if (arg0 == 6120) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub16_2.method5404();
						return;
					}
					if (arg0 == 6123) {
						anIntArray605[anInt8397++] = Static615.method7885();
						return;
					}
					if (arg0 == 6124) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub6_1.method3188();
						return;
					}
					if (arg0 == 6125) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub23_1.method7366();
						return;
					}
					if (arg0 == 6127) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub19_1.method5679() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub4_1.method2001() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub1_1.method712();
						return;
					}
					if (arg0 == 6130) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub22_1.method7245() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620();
						return;
					}
					if (arg0 == 6132) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub28_1.method8620();
						return;
					}
					if (arg0 == 6133) {
						anIntArray605[anInt8397++] = Static122.aClass47_1.aBoolean105 && !Static122.aClass47_1.aBoolean106 ? 1 : 0;
						return;
					}
					if (arg0 == 6135) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub12_1.method4833();
						return;
					}
					if (arg0 == 6136) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub27_1.method8320() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6138) {
						anIntArray605[anInt8397++] = Static93.method1944(200, Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620());
						return;
					}
					if (arg0 == 6139) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub11_1.method4664();
						return;
					}
					if (arg0 == 6142) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub16_5.method5404();
						return;
					}
					if (arg0 == 6143) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub16_3.method5404();
						return;
					}
					if (arg0 == 6144) {
						anIntArray605[anInt8397++] = Static498.aBoolean532 ? 1 : 0;
						return;
					}
					if (arg0 == 6145) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub17_1.method5418();
						return;
					}
					if (arg0 == 6146) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub10_1.method4499();
						return;
					}
					if (arg0 == 6147) {
						anIntArray605[anInt8397++] = Static12.aClass3_Sub39_12.anInt5861 < 512 || Static498.aBoolean532 || Static234.aBoolean236 ? 1 : 0;
						return;
					}
					if (arg0 == 6148) {
						anIntArray605[anInt8397++] = Static533.aBoolean558 ? 1 : 0;
						return;
					}
					if (arg0 == 6149) {
						anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub14_1.method5011();
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt8397 -= 2;
						Static680.aShort119 = (short) anIntArray605[anInt8397];
						if (Static680.aShort119 <= 0) {
							Static680.aShort119 = 256;
						}
						Static304.aShort63 = (short) anIntArray605[anInt8397 + 1];
						if (Static304.aShort63 <= 0) {
							Static304.aShort63 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt8397 -= 2;
						Static644.aShort114 = (short) anIntArray605[anInt8397];
						if (Static644.aShort114 <= 0) {
							Static644.aShort114 = 256;
						}
						Static566.aShort92 = (short) anIntArray605[anInt8397 + 1];
						if (Static566.aShort92 <= 0) {
							Static566.aShort92 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt8397 -= 4;
						Static232.aShort50 = (short) anIntArray605[anInt8397];
						if (Static232.aShort50 <= 0) {
							Static232.aShort50 = 1;
						}
						Static59.aShort26 = (short) anIntArray605[anInt8397 + 1];
						if (Static59.aShort26 <= 0) {
							Static59.aShort26 = 32767;
						} else if (Static59.aShort26 < Static232.aShort50) {
							Static59.aShort26 = Static232.aShort50;
						}
						Static720.aShort128 = (short) anIntArray605[anInt8397 + 2];
						if (Static720.aShort128 <= 0) {
							Static720.aShort128 = 1;
						}
						Static608.aShort99 = (short) anIntArray605[anInt8397 + 3];
						if (Static608.aShort99 <= 0) {
							Static608.aShort99 = 32767;
							return;
						}
						if (Static608.aShort99 < Static720.aShort128) {
							Static608.aShort99 = Static720.aShort128;
						}
						return;
					}
					if (arg0 == 6203) {
						Static511.method6939(0, false, 0, Static34.aClass270_2.anInt7045, Static34.aClass270_2.anInt7015);
						anIntArray605[anInt8397++] = Static239.anInt3796;
						anIntArray605[anInt8397++] = Static581.anInt8861;
						return;
					}
					if (arg0 == 6204) {
						anIntArray605[anInt8397++] = Static644.aShort114;
						anIntArray605[anInt8397++] = Static566.aShort92;
						return;
					}
					if (arg0 == 6205) {
						anIntArray605[anInt8397++] = Static680.aShort119;
						anIntArray605[anInt8397++] = Static304.aShort63;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray605[anInt8397++] = (int) (Static517.method6965() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray605[anInt8397++] = (int) (Static517.method6965() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt8397 -= 3;
						local192 = anIntArray605[anInt8397];
						local834 = anIntArray605[anInt8397 + 1];
						local109 = anIntArray605[anInt8397 + 2];
						@Pc(7377) long local7377 = Static64.method1480(local834, local109, local192);
						local3561 = Static167.method2713(local7377);
						if (local109 < 1970) {
							local3561--;
						}
						anIntArray605[anInt8397++] = local3561;
						return;
					}
					if (arg0 == 6303) {
						anIntArray605[anInt8397++] = Static467.method6343(Static517.method6965());
						return;
					}
					if (arg0 == 6304) {
						local192 = anIntArray605[--anInt8397];
						local1578 = true;
						if (local192 < 0) {
							local1578 = (local192 + 1) % 4 == 0;
						} else if (local192 < 1582) {
							local1578 = local192 % 4 == 0;
						} else if (local192 % 4 != 0) {
							local1578 = false;
						} else if (local192 % 100 != 0) {
							local1578 = true;
						} else if (local192 % 400 != 0) {
							local1578 = false;
						}
						anIntArray605[anInt8397++] = local1578 ? 1 : 0;
						return;
					}
					if (arg0 == 6305) {
						local192 = anIntArray605[--anInt8397];
						@Pc(7505) int[] local7505 = Static615.method7919(local192);
						Static732.method6321(local7505, 0, anIntArray605, anInt8397, 3);
						anInt8397 += 3;
						return;
					}
					if (arg0 == 6306) {
						local192 = anIntArray605[--anInt8397];
						anIntArray605[anInt8397++] = (int) (Static96.method9132(local192) / 60000L);
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray605[anInt8397++] = Static528.method7046() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray605[anInt8397++] = Static358.method4991() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static98.anInt2140 == 7 && !Static524.method7018(-1) && Static446.anInt6827 == 0) {
							if (Static351.aBoolean362) {
								anIntArray605[anInt8397++] = 0;
								return;
							}
							if (Static321.aLong176 > Static517.method6965() - 1000L) {
								anIntArray605[anInt8397++] = 1;
								return;
							}
							Static351.aBoolean362 = true;
							@Pc(7655) Class3_Sub29 local7655 = Static507.method6901(Static148.aClass144_26, Static95.aClass292_1.aClass88_2);
							local7655.aClass3_Sub2_Sub1_1.method2018(Static97.anInt2129);
							Static95.aClass292_1.method6855(local7655);
							anIntArray605[anInt8397++] = 0;
							return;
						}
						anIntArray605[anInt8397++] = 1;
						return;
					}
					@Pc(7712) Class374 local7712;
					@Pc(7679) Class238_Sub1 local7679;
					if (arg0 == 6501) {
						local7679 = Static571.method7400();
						if (local7679 != null) {
							anIntArray605[anInt8397++] = local7679.anInt6079;
							anIntArray605[anInt8397++] = local7679.anInt6068;
							aStringArray36[anInt8398++] = local7679.aString80;
							local7712 = local7679.method5302();
							anIntArray605[anInt8397++] = local7712.anInt10058;
							aStringArray36[anInt8398++] = local7712.aString121;
							anIntArray605[anInt8397++] = local7679.anInt6065;
							anIntArray605[anInt8397++] = local7679.anInt6078;
							aStringArray36[anInt8398++] = local7679.aString79;
							return;
						}
						anIntArray605[anInt8397++] = -1;
						anIntArray605[anInt8397++] = 0;
						aStringArray36[anInt8398++] = "";
						anIntArray605[anInt8397++] = 0;
						aStringArray36[anInt8398++] = "";
						anIntArray605[anInt8397++] = 0;
						anIntArray605[anInt8397++] = 0;
						aStringArray36[anInt8398++] = "";
						return;
					}
					if (arg0 == 6502) {
						local7679 = Static368.method5066();
						if (local7679 != null) {
							anIntArray605[anInt8397++] = local7679.anInt6079;
							anIntArray605[anInt8397++] = local7679.anInt6068;
							aStringArray36[anInt8398++] = local7679.aString80;
							local7712 = local7679.method5302();
							anIntArray605[anInt8397++] = local7712.anInt10058;
							aStringArray36[anInt8398++] = local7712.aString121;
							anIntArray605[anInt8397++] = local7679.anInt6065;
							anIntArray605[anInt8397++] = local7679.anInt6078;
							aStringArray36[anInt8398++] = local7679.aString79;
							return;
						}
						anIntArray605[anInt8397++] = -1;
						anIntArray605[anInt8397++] = 0;
						aStringArray36[anInt8398++] = "";
						anIntArray605[anInt8397++] = 0;
						aStringArray36[anInt8398++] = "";
						anIntArray605[anInt8397++] = 0;
						anIntArray605[anInt8397++] = 0;
						aStringArray36[anInt8398++] = "";
						return;
					}
					if (arg0 == 6503) {
						local192 = anIntArray605[--anInt8397];
						local101 = aStringArray36[--anInt8398];
						if (Static98.anInt2140 == 7 && !Static524.method7018(-1) && Static446.anInt6827 == 0) {
							anIntArray605[anInt8397++] = Static615.method7906(local192, local101) ? 1 : 0;
							return;
						}
						anIntArray605[anInt8397++] = 0;
						return;
					}
					if (arg0 == 6506) {
						local192 = anIntArray605[--anInt8397];
						@Pc(8046) Class238_Sub1 local8046 = Static131.method2341(local192);
						if (local8046 != null) {
							anIntArray605[anInt8397++] = local8046.anInt6068;
							aStringArray36[anInt8398++] = local8046.aString80;
							@Pc(8070) Class374 local8070 = local8046.method5302();
							anIntArray605[anInt8397++] = local8070.anInt10058;
							aStringArray36[anInt8398++] = local8070.aString121;
							anIntArray605[anInt8397++] = local8046.anInt6065;
							anIntArray605[anInt8397++] = local8046.anInt6078;
							aStringArray36[anInt8398++] = local8046.aString79;
							return;
						}
						anIntArray605[anInt8397++] = -1;
						aStringArray36[anInt8398++] = "";
						anIntArray605[anInt8397++] = 0;
						aStringArray36[anInt8398++] = "";
						anIntArray605[anInt8397++] = 0;
						anIntArray605[anInt8397++] = 0;
						aStringArray36[anInt8398++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt8397 -= 4;
						local192 = anIntArray605[anInt8397];
						local1578 = anIntArray605[anInt8397 + 1] == 1;
						local109 = anIntArray605[anInt8397 + 2];
						local2331 = anIntArray605[anInt8397 + 3] == 1;
						Static480.method6504(local192, local2331, local109, local1578);
						return;
					}
					if (arg0 == 6508) {
						Static683.method9053();
						return;
					}
					if (arg0 == 6509) {
						if (Static98.anInt2140 != 7) {
							return;
						}
						Static518.aBoolean547 = anIntArray605[--anInt8397] == 1;
						return;
					}
					if (arg0 == 6510) {
						anIntArray605[anInt8397++] = Static297.anInt4549;
						return;
					}
				} else if (arg0 >= 6700) {
					if (arg0 < 6800 && Static654.aClass258_4 == Static268.aClass258_2) {
						if (arg0 == 6700) {
							local192 = Static432.aClass313_34.method7108();
							if (Static589.anInt8959 != -1) {
								local192++;
							}
							anIntArray605[anInt8397++] = local192;
							return;
						}
						if (arg0 == 6701) {
							local192 = anIntArray605[--anInt8397];
							if (Static589.anInt8959 != -1) {
								if (local192 == 0) {
									anIntArray605[anInt8397++] = Static589.anInt8959;
									return;
								}
								local192--;
							}
							@Pc(8337) Class3_Sub20 local8337 = (Class3_Sub20) Static432.aClass313_34.method7103();
							while (local192-- > 0) {
								local8337 = (Class3_Sub20) Static432.aClass313_34.method7110();
							}
							anIntArray605[anInt8397++] = local8337.anInt2493;
							return;
						}
						if (arg0 == 6702) {
							local192 = anIntArray605[--anInt8397];
							if (Static172.aClass270ArrayArray2[local192] == null) {
								aStringArray36[anInt8398++] = "";
								return;
							}
							local101 = Static172.aClass270ArrayArray2[local192][0].aString90;
							if (local101 == null) {
								aStringArray36[anInt8398++] = "";
								return;
							}
							aStringArray36[anInt8398++] = local101.substring(0, local101.indexOf(58));
							return;
						}
						if (arg0 == 6703) {
							local192 = anIntArray605[--anInt8397];
							if (Static172.aClass270ArrayArray2[local192] == null) {
								anIntArray605[anInt8397++] = 0;
								return;
							}
							anIntArray605[anInt8397++] = Static172.aClass270ArrayArray2[local192].length;
							return;
						}
						if (arg0 == 6704) {
							anInt8397 -= 2;
							local192 = anIntArray605[anInt8397];
							local834 = anIntArray605[anInt8397 + 1];
							if (Static172.aClass270ArrayArray2[local192] == null) {
								aStringArray36[anInt8398++] = "";
								return;
							}
							local198 = Static172.aClass270ArrayArray2[local192][local834].aString90;
							if (local198 == null) {
								aStringArray36[anInt8398++] = "";
								return;
							}
							aStringArray36[anInt8398++] = local198;
							return;
						}
						if (arg0 == 6705) {
							anInt8397 -= 2;
							local192 = anIntArray605[anInt8397];
							local834 = anIntArray605[anInt8397 + 1];
							if (Static172.aClass270ArrayArray2[local192] == null) {
								anIntArray605[anInt8397++] = 0;
								return;
							}
							anIntArray605[anInt8397++] = Static172.aClass270ArrayArray2[local192][local834].anInt7030;
							return;
						}
						if (arg0 == 6706) {
							return;
						}
						if (arg0 == 6707) {
							anInt8397 -= 3;
							local192 = anIntArray605[anInt8397];
							local834 = anIntArray605[anInt8397 + 1];
							local109 = anIntArray605[anInt8397 + 2];
							Static412.method5512("", 1, local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6708) {
							anInt8397 -= 3;
							local192 = anIntArray605[anInt8397];
							local834 = anIntArray605[anInt8397 + 1];
							local109 = anIntArray605[anInt8397 + 2];
							Static412.method5512("", 2, local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6709) {
							anInt8397 -= 3;
							local192 = anIntArray605[anInt8397];
							local834 = anIntArray605[anInt8397 + 1];
							local109 = anIntArray605[anInt8397 + 2];
							Static412.method5512("", 3, local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6710) {
							anInt8397 -= 3;
							local192 = anIntArray605[anInt8397];
							local834 = anIntArray605[anInt8397 + 1];
							local109 = anIntArray605[anInt8397 + 2];
							Static412.method5512("", 4, local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6711) {
							anInt8397 -= 3;
							local192 = anIntArray605[anInt8397];
							local834 = anIntArray605[anInt8397 + 1];
							local109 = anIntArray605[anInt8397 + 2];
							Static412.method5512("", 5, local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6712) {
							anInt8397 -= 3;
							local192 = anIntArray605[anInt8397];
							local834 = anIntArray605[anInt8397 + 1];
							local109 = anIntArray605[anInt8397 + 2];
							Static412.method5512("", 6, local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6713) {
							anInt8397 -= 3;
							local192 = anIntArray605[anInt8397];
							local834 = anIntArray605[anInt8397 + 1];
							local109 = anIntArray605[anInt8397 + 2];
							Static412.method5512("", 7, local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6714) {
							anInt8397 -= 3;
							local192 = anIntArray605[anInt8397];
							local834 = anIntArray605[anInt8397 + 1];
							local109 = anIntArray605[anInt8397 + 2];
							Static412.method5512("", 8, local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6715) {
							anInt8397 -= 3;
							local192 = anIntArray605[anInt8397];
							local834 = anIntArray605[anInt8397 + 1];
							local109 = anIntArray605[anInt8397 + 2];
							Static412.method5512("", 9, local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6716) {
							anInt8397 -= 3;
							local192 = anIntArray605[anInt8397];
							local834 = anIntArray605[anInt8397 + 1];
							local109 = anIntArray605[anInt8397 + 2];
							Static412.method5512("", 10, local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6717) {
							anInt8397 -= 3;
							local192 = anIntArray605[anInt8397];
							local834 = anIntArray605[anInt8397 + 1];
							local109 = anIntArray605[anInt8397 + 2];
							@Pc(8933) Class270 local8933 = Static1.method9504(local109, local192 << 16 | local834);
							Static443.method5872();
							@Pc(8938) Class3_Sub47 local8938 = Static85.method1871(local8933);
							Static340.method4863(local8938.anInt7683, local8933, local8938.method6627());
							return;
						}
					} else if (arg0 < 6900) {
						@Pc(8968) Class198 local8968;
						if (arg0 == 6800) {
							local192 = anIntArray605[--anInt8397];
							local8968 = Static47.aClass111_3.method2739(local192);
							if (local8968.aString62 == null) {
								aStringArray36[anInt8398++] = "";
								return;
							}
							aStringArray36[anInt8398++] = local8968.aString62;
							return;
						}
						if (arg0 == 6801) {
							local192 = anIntArray605[--anInt8397];
							local8968 = Static47.aClass111_3.method2739(local192);
							anIntArray605[anInt8397++] = local8968.anInt5156;
							return;
						}
						if (arg0 == 6802) {
							local192 = anIntArray605[--anInt8397];
							local8968 = Static47.aClass111_3.method2739(local192);
							anIntArray605[anInt8397++] = local8968.anInt5126;
							return;
						}
						if (arg0 == 6803) {
							local192 = anIntArray605[--anInt8397];
							local8968 = Static47.aClass111_3.method2739(local192);
							anIntArray605[anInt8397++] = local8968.anInt5135;
							return;
						}
						if (arg0 == 6804) {
							anInt8397 -= 2;
							local192 = anIntArray605[anInt8397];
							local834 = anIntArray605[anInt8397 + 1];
							@Pc(9091) Class303 local9091 = Static583.aClass150_2.method3385(local834);
							if (local9091.method6975()) {
								aStringArray36[anInt8398++] = Static47.aClass111_3.method2739(local192).method4670(local9091.aString101, local834);
								return;
							}
							anIntArray605[anInt8397++] = Static47.aClass111_3.method2739(local192).method4676(local9091.anInt8150, local834);
							return;
						}
					} else if (arg0 < 7000) {
						if (arg0 == 6900) {
							anIntArray605[anInt8397++] = Static24.aBoolean48 && !Static584.aBoolean596 ? 1 : 0;
							return;
						}
						if (arg0 == 6901) {
							anIntArray605[anInt8397++] = (int) (Static57.aLong45 / 60000L);
							anIntArray605[anInt8397++] = (int) ((Static57.aLong45 - Static517.method6965() - Static643.aLong315) / 60000L);
							anIntArray605[anInt8397++] = Static141.aBoolean170 ? 1 : 0;
							return;
						}
						if (arg0 == 6902) {
							anIntArray605[anInt8397++] = Static445.anInt6825;
							return;
						}
						if (arg0 == 6903) {
							anIntArray605[anInt8397++] = Static337.anInt5412;
							return;
						}
						if (arg0 == 6904) {
							anIntArray605[anInt8397++] = Static334.anInt5362;
							return;
						}
						if (arg0 == 6905) {
							local95 = "";
							if (Static85.aClass338_3 != null) {
								if (Static85.aClass338_3.anObject16 == null) {
									local95 = Static350.method4930(Static85.aClass338_3.anInt8936);
								} else {
									local95 = (String) Static85.aClass338_3.anObject16;
								}
							}
							aStringArray36[anInt8398++] = local95;
							return;
						}
						if (arg0 == 6906) {
							anIntArray605[anInt8397++] = Static73.anInt1696;
							return;
						}
						if (arg0 == 6907) {
							anIntArray605[anInt8397++] = Static574.anInt8715;
							return;
						}
						if (arg0 == 6908) {
							anIntArray605[anInt8397++] = Static543.anInt8438;
							return;
						}
						if (arg0 == 6909) {
							anIntArray605[anInt8397++] = Static701.aBoolean741 ? 1 : 0;
							return;
						}
						if (arg0 == 6910) {
							anIntArray605[anInt8397++] = Static426.anInt6539;
							return;
						}
						if (arg0 == 6911) {
							anIntArray605[anInt8397++] = Static290.anInt4445;
							return;
						}
						if (arg0 == 6912) {
							anIntArray605[anInt8397++] = Static384.anInt5960;
							return;
						}
						if (arg0 == 6913) {
							anIntArray605[anInt8397++] = Static529.anInt8251;
							return;
						}
						if (arg0 == 6914) {
							anIntArray605[anInt8397++] = Static232.aBoolean233 ? 1 : 0;
							return;
						}
						if (arg0 == 6915) {
							anIntArray605[anInt8397++] = Static348.anInt5563;
							return;
						}
					} else if (arg0 < 7100) {
						if (arg0 == 7000) {
							local192 = Static482.method6515();
							anIntArray605[anInt8397++] = Static360.anInt8373 = Static580.aClass3_Sub22_24.aClass21_Sub28_2.method8620();
							anIntArray605[anInt8397++] = local192;
							Static19.method616();
							Static124.method2284();
							Static569.aBoolean580 = false;
							return;
						}
						if (arg0 == 7001) {
							Static542.method7186();
							Static19.method616();
							Static124.method2284();
							Static569.aBoolean580 = false;
							return;
						}
						if (arg0 == 7002) {
							Static71.method1572();
							Static19.method616();
							Static124.method2284();
							Static569.aBoolean580 = false;
							return;
						}
						if (arg0 == 7003) {
							Static719.method6597();
							Static19.method616();
							Static124.method2284();
							Static569.aBoolean580 = false;
							return;
						}
						if (arg0 == 7004) {
							Static274.method3861();
							Static19.method616();
							Static124.method2284();
							Static569.aBoolean580 = false;
							return;
						}
						if (arg0 == 7005) {
							Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub13_1);
							Static124.method2284();
							Static569.aBoolean580 = false;
							return;
						}
						if (arg0 == 7006) {
							if (Static360.anInt8373 == 2) {
								Static435.aBoolean442 = true;
								return;
							}
							if (Static360.anInt8373 == 1) {
								Static59.aBoolean104 = true;
								return;
							}
							if (Static360.anInt8373 == 3) {
								Static552.aBoolean568 = true;
							}
							return;
						}
						if (arg0 == 7007) {
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub13_1.method4944();
							return;
						}
					} else if (arg0 < 7200) {
						if (arg0 == 7100) {
							anInt8397 -= 2;
							local192 = anIntArray605[anInt8397];
							local834 = anIntArray605[anInt8397 + 1];
							if (local192 != -1) {
								if (local834 > 255) {
									local834 = 255;
								} else if (local834 < 0) {
									local834 = 0;
								}
								Static41.method1163(local192, false, local834);
							}
							return;
						}
						if (arg0 == 7101) {
							local192 = anIntArray605[--anInt8397];
							if (local192 != -1) {
								Static56.method1314(local192);
							}
							return;
						}
						if (arg0 == 7102) {
							local192 = anIntArray605[--anInt8397];
							if (local192 != -1) {
								Static694.method9185(local192);
							}
							return;
						}
						if (arg0 == 7103) {
							anIntArray605[anInt8397++] = Static437.method5770("jagtheora") ? 1 : 0;
							return;
						}
					} else if (arg0 < 7300) {
						if (arg0 == 7201) {
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub5_1.method2409() ? 1 : 0;
							return;
						}
						if (arg0 == 7202) {
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub7_1.method3408() ? 1 : 0;
							return;
						}
						if (arg0 == 7203) {
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub30_1.method9243() ? 1 : 0;
							return;
						}
						if (arg0 == 7204) {
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub25_1.method7955() ? 1 : 0;
							return;
						}
						if (arg0 == 7205) {
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub6_1.method3187() && Static153.aClass22_4.method9323() ? 1 : 0;
							return;
						}
						if (arg0 == 7206) {
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub26_1.method8224() ? 1 : 0;
							return;
						}
						if (arg0 == 7207) {
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub23_1.method7367() ? 1 : 0;
							return;
						}
						if (arg0 == 7208) {
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub19_1.method5675() && Static153.aClass22_4.method9380() ? 1 : 0;
							return;
						}
						if (arg0 == 7209) {
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub22_1.method7244() ? 1 : 0;
							return;
						}
						if (arg0 == 7210) {
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub27_1.method8322() ? 1 : 0;
							return;
						}
						if (arg0 == 7211) {
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub11_1.method4665() ? 1 : 0;
							return;
						}
						if (arg0 == 7212) {
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub8_1.method3999() ? 1 : 0;
							return;
						}
						if (arg0 == 7213) {
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub10_1.method4496() ? 1 : 0;
							return;
						}
						if (arg0 == 7214) {
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub28_1.method8622() ? 1 : 0;
							return;
						}
						if (arg0 == 7215) {
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub14_1.method5009() ? 1 : 0;
							return;
						}
					} else if (arg0 < 7400) {
						if (arg0 == 7301) {
							local192 = anIntArray605[--anInt8397];
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub5_1.method9238(local192);
							return;
						}
						if (arg0 == 7302) {
							local192 = anIntArray605[--anInt8397];
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub7_1.method9238(local192);
							return;
						}
						if (arg0 == 7303) {
							local192 = anIntArray605[--anInt8397];
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub30_1.method9238(local192);
							return;
						}
						if (arg0 == 7304) {
							local192 = anIntArray605[--anInt8397];
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub25_1.method9238(local192);
							return;
						}
						if (arg0 == 7305) {
							local192 = anIntArray605[--anInt8397];
							if (!Static153.aClass22_4.method9323()) {
								anIntArray605[anInt8397++] = 3;
								return;
							}
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub6_1.method9238(local192);
							return;
						}
						if (arg0 == 7306) {
							local192 = anIntArray605[--anInt8397];
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub26_1.method9238(local192);
							return;
						}
						if (arg0 == 7307) {
							local192 = anIntArray605[--anInt8397];
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub23_1.method9238(local192);
							return;
						}
						if (arg0 == 7308) {
							local192 = anIntArray605[--anInt8397];
							if (!Static153.aClass22_4.method9380()) {
								anIntArray605[anInt8397++] = 3;
								return;
							}
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub19_1.method9238(local192);
							return;
						}
						if (arg0 == 7309) {
							local192 = anIntArray605[--anInt8397];
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub22_1.method9238(local192);
							return;
						}
						if (arg0 == 7310) {
							local192 = anIntArray605[--anInt8397];
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub27_1.method9238(local192);
							return;
						}
						if (arg0 == 7311) {
							local192 = anIntArray605[--anInt8397];
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub11_1.method9238(local192);
							return;
						}
						if (arg0 == 7312) {
							local192 = anIntArray605[--anInt8397];
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub8_1.method9238(local192);
							return;
						}
						if (arg0 == 7313) {
							local192 = anIntArray605[--anInt8397];
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub10_1.method9238(local192);
							return;
						}
						if (arg0 == 7314) {
							local192 = anIntArray605[--anInt8397];
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub28_1.method9238(local192);
							return;
						}
						if (arg0 == 7315) {
							local192 = anIntArray605[--anInt8397];
							anIntArray605[anInt8397++] = Static580.aClass3_Sub22_24.aClass21_Sub14_1.method9238(local192);
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}
}
