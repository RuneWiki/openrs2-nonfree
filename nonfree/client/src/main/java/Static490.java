import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "I")
	public static int anInt5255;

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "[I")
	public static final int[] anIntArray222 = new int[13];

	@OriginalMember(owner = "client!rfa", name = "g", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_52 = new Class185(68, 3);

	@OriginalMember(owner = "client!rfa", name = "h", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_78 = new Class73(116, 8);

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ZILjava/lang/String;ILjava/lang/String;ZI)V")
	public static void method4311(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static376.aClass223_79.anInt7135 = 1;
		@Pc(11) String local11 = arg2.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg1 != -1) {
			@Pc(27) Class164 local27 = Static69.aClass369_1.method8523(arg1);
			if (local27 == null || arg4 != local27.method4981()) {
				return;
			}
			if (local27.method4981()) {
				local18 = local27.aString66;
			} else {
				local16 = local27.anInt5972;
			}
		}
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < Static356.aClass221_1.anInt7082; local54++) {
			@Pc(61) Class306 local61 = Static356.aClass221_1.method5923(local54);
			if ((!arg0 || local61.aBoolean731) && local61.anInt9029 == -1 && local61.anInt9075 == -1 && local61.anInt9081 == 0 && local61.aString93.toLowerCase().indexOf(local11) != -1) {
				if (arg1 != -1) {
					if (arg4) {
						if (!arg3.equals(local61.method7409(local18, arg1))) {
							continue;
						}
					} else if (local61.method7408(arg1, local16) != arg5) {
						continue;
					}
				}
				if (local52 >= 250) {
					Static347.aShortArray114 = null;
					Static40.anInt1429 = -1;
					return;
				}
				if (local14.length <= local52) {
					@Pc(136) short[] local136 = new short[local14.length * 2];
					for (@Pc(138) int local138 = 0; local138 < local52; local138++) {
						local136[local138] = local14[local138];
					}
					local14 = local136;
				}
				local14[local52++] = (short) local54;
			}
		}
		Static347.aShortArray114 = local14;
		Static40.anInt1429 = local52;
		Static156.anInt3571 = 0;
		@Pc(176) String[] local176 = new String[Static40.anInt1429];
		for (@Pc(178) int local178 = 0; local178 < Static40.anInt1429; local178++) {
			local176[local178] = Static356.aClass221_1.method5923(local14[local178]).aString93;
		}
		Static122.method2608(Static347.aShortArray114, local176);
		Static376.aClass223_79.method5969();
		Static376.aClass223_79.anInt7135 = 2;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIILclient!ha;IZII)V")
	public static void method4312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface22 local11 = (Interface22) Static37.method1328(arg0, arg6, arg2);
		@Pc(20) Class356 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(45) int local45;
		if (local11 != null) {
			local20 = Static249.aClass310_1.method7474(local11.method8436());
			local26 = local11.method8438() & 0x3;
			local30 = local11.method8435();
			if (local20.anInt10249 == -1) {
				local45 = arg7;
				if (local20.anInt10253 > 0) {
					local45 = arg3;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg4.method6118(arg5, arg1, local45, 4);
					} else if (local26 == 1) {
						arg4.method6116(4, local45, arg5, arg1);
					} else if (local26 == 2) {
						arg4.method6118(arg5, arg1 + 3, local45, 4);
					} else if (local26 == 3) {
						arg4.method6116(4, local45, arg5 + 3, arg1);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg4.method6123(1, 1, arg5, local45, arg1);
					} else if (local26 == 1) {
						arg4.method6123(1, 1, arg5, local45, arg1 + 3);
					} else if (local26 == 2) {
						arg4.method6123(1, 1, arg5 + 3, local45, arg1 + 3);
					} else if (local26 == 3) {
						arg4.method6123(1, 1, arg5 + 3, local45, arg1);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg4.method6116(4, local45, arg5, arg1);
					} else if (local26 == 1) {
						arg4.method6118(arg5, arg1 + 3, local45, 4);
					} else if (local26 == 2) {
						arg4.method6116(4, local45, arg5 + 3, arg1);
					} else if (local26 == 3) {
						arg4.method6118(arg5, arg1, local45, 4);
					}
				}
			} else {
				Static233.method4264(local26, local20, arg1, arg4, arg5);
			}
		}
		local11 = (Interface22) Static173.method3262(arg0, arg6, arg2, rl.class);
		if (local11 != null) {
			local20 = Static249.aClass310_1.method7474(local11.method8436());
			local26 = local11.method8438() & 0x3;
			local30 = local11.method8435();
			if (local20.anInt10249 != -1) {
				Static233.method4264(local26, local20, arg1, arg4, arg5);
			} else if (local30 == 9) {
				local45 = -1118482;
				if (local20.anInt10253 > 0) {
					local45 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg4.method6152(arg5 + 3, local45, arg5, arg1 + 3, arg1);
				} else {
					arg4.method6152(arg5, local45, arg5 + 3, arg1 + 3, arg1);
				}
			}
		}
		local11 = (Interface22) Static446.method6808(arg0, arg6, arg2);
		if (local11 == null) {
			return;
		}
		local20 = Static249.aClass310_1.method7474(local11.method8436());
		local26 = local11.method8438() & 0x3;
		if (local20.anInt10249 != -1) {
			Static233.method4264(local26, local20, arg1, arg4, arg5);
			return;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)V")
	public static void method4315() {
		if (Static467.aClass5_13.method6129()) {
			Static467.aClass5_13.method6149(Static428.aCanvas12);
			Static626.method8561();
			if (Static238.aBoolean425) {
				Static181.method3394(Static428.aCanvas12);
			} else {
				@Pc(35) Dimension local35 = Static428.aCanvas12.getSize();
				Static467.aClass5_13.method6104(Static428.aCanvas12, local35.width, local35.height);
			}
			Static467.aClass5_13.method6113(Static428.aCanvas12);
		} else {
			Static237.method4302(Static87.aClass6_Sub33_6.aClass14_Sub8_1.method2640(), false);
		}
		Static486.method8547();
		Static610.aBoolean810 = true;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ILclient!cea;)I")
	public static int method4316(@OriginalArg(1) Class9_Sub4_Sub2_Sub1_Sub1 arg0) {
		@Pc(8) Class158 local8 = arg0.aClass158_1;
		if (local8.anIntArray260 != null) {
			local8 = local8.method4867(Static140.aClass157_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(28) int local28 = local8.anInt5821;
		@Pc(32) Class303 local32 = arg0.method3625();
		if (arg0.anInt4312 == -1 || arg0.aBoolean349) {
			local28 = local8.anInt5833;
		} else if (local32.anInt8969 == arg0.anInt4312 || local32.anInt8943 == arg0.anInt4312 || local32.anInt8981 == arg0.anInt4312 || arg0.anInt4312 == local32.anInt8938) {
			local28 = local8.anInt5849;
		} else if (local32.anInt8948 == arg0.anInt4312 || arg0.anInt4312 == local32.anInt8976 || arg0.anInt4312 == local32.anInt8982 || arg0.anInt4312 == local32.anInt8957) {
			local28 = local8.anInt5843;
		}
		return local28;
	}
}
