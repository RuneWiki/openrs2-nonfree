import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "[Lclient!go;")
	public static Class95[] aClass95Array2;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "[I")
	public static int[] anIntArray530;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "F")
	public static float aFloat167;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_128 = new Class253(93, 6);

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "[I")
	public static final int[] anIntArray529 = new int[32];

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)Z")
	public static boolean method4614(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static282.method3734(arg0, arg1) || Static45.method605(arg0, arg1);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBILclient!vi;Lclient!dr;)V")
	public static void method4616(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class26_Sub2_Sub4_Sub2 arg2, @OriginalArg(4) Class7_Sub14_Sub1 arg3) {
		@Pc(7) byte local7 = -1;
		@Pc(18) int local18;
		@Pc(27) int local27;
		@Pc(31) int local31;
		if ((arg1 & 0x400) != 0) {
			local18 = arg3.method3990();
			if (local18 == 65535) {
				local18 = -1;
			}
			local27 = arg3.method3950();
			local31 = arg3.method3981();
			arg2.method5518(local18, local31, false, local27);
		}
		if ((arg1 & 0x20000) != 0) {
			local18 = arg3.method3935();
			local27 = arg3.method3950();
			if (local18 == 65535) {
				local18 = -1;
			}
			local31 = arg3.method3968();
			arg2.method5518(local18, local31, true, local27);
		}
		if ((arg1 & 0x8) != 0) {
			local18 = arg3.method3940();
			local27 = arg3.method3981();
			arg2.method5511(Static274.anInt4617, local27, local18);
			arg2.anInt7079 = Static274.anInt4617 + 300;
			arg2.anInt7051 = arg3.method3968();
		}
		if ((arg1 & 0x100) != 0) {
			local18 = arg3.method3935();
			arg2.anInt7106 = arg3.method3981();
			arg2.anInt7092 = arg3.method3931();
			arg2.anInt7064 = local18 & 0x7FFF;
			arg2.aBoolean478 = (local18 & 0x8000) != 0;
			arg2.anInt7054 = arg2.anInt7106 + arg2.anInt7064 + Static274.anInt4617;
		}
		if ((arg1 & 0x2000) != 0) {
			arg2.aString68 = arg3.method3986();
			if (arg2.aString68.charAt(0) == '~') {
				arg2.aString68 = arg2.aString68.substring(1);
				Static336.method4383(2, 0, arg2.method5529(), arg2.aString68, arg2.method5527());
			} else if (arg2 == Static104.aClass26_Sub2_Sub4_Sub2_2) {
				Static336.method4383(2, 0, arg2.method5529(), arg2.aString68, arg2.method5527());
			}
			arg2.anInt7084 = 0;
			arg2.anInt7101 = 0;
			arg2.anInt7075 = 150;
		}
		@Pc(228) int local228;
		if ((arg1 & 0x10000) != 0) {
			local18 = arg3.method3981();
			@Pc(220) int[] local220 = new int[local18];
			@Pc(223) int[] local223 = new int[local18];
			@Pc(226) int[] local226 = new int[local18];
			for (local228 = 0; local228 < local18; local228++) {
				@Pc(234) int local234 = arg3.method3943();
				if (local234 == 65535) {
					local234 = -1;
				}
				local220[local228] = local234;
				local223[local228] = arg3.method3968();
				local226[local228] = arg3.method3990();
			}
			Static143.method2212(local220, local223, local226, arg2);
		}
		if ((arg1 & 0x1) != 0) {
			local18 = arg3.method3972();
			@Pc(279) byte[] local279 = new byte[local18];
			@Pc(284) Class7_Sub14 local284 = new Class7_Sub14(local279);
			arg3.method3932(local279, local18);
			Static102.aClass7_Sub14Array1[arg0] = local284;
			arg2.method5525(local284);
		}
		if ((arg1 & 0x8000) != 0) {
			local18 = Static274.anInt4617;
			local27 = arg3.method3940();
			local31 = arg3.method3931();
			arg2.method5511(local18, local31, local27);
		}
		if ((arg1 & 0x1000) != 0) {
			arg2.aBoolean482 = arg3.method3981() == 1;
		}
		if ((arg1 & 0x40000) != 0) {
			arg2.aByte93 = arg3.method3949();
			arg2.aByte96 = arg3.method3945();
			arg2.aByte95 = arg3.method3945();
			arg2.aByte94 = (byte) arg3.method3981();
			arg2.anInt7049 = Static274.anInt4617 + arg3.method3946();
			arg2.anInt7053 = Static274.anInt4617 + arg3.method3943();
		}
		if ((arg1 & 0x4000) != 0) {
			arg2.anInt7105 = arg3.method3949();
			arg2.anInt7048 = arg3.method3945();
			arg2.anInt7059 = arg3.method3930();
			arg2.anInt7088 = arg3.method3980();
			arg2.anInt7112 = arg3.method3946() + Static274.anInt4617;
			arg2.anInt7110 = arg3.method3990() + Static274.anInt4617;
			arg2.anInt7093 = arg3.method3972();
			if (arg2.aBoolean480) {
				arg2.anInt7048 += arg2.anInt7139;
				arg2.anInt7117 = 0;
				arg2.anInt7088 += arg2.anInt7139;
				arg2.anInt7059 += arg2.anInt7147;
				arg2.anInt7105 += arg2.anInt7147;
			} else {
				arg2.anInt7048 += arg2.anIntArray604[0];
				arg2.anInt7059 += arg2.anIntArray603[0];
				arg2.anInt7088 += arg2.anIntArray604[0];
				arg2.anInt7117 = 1;
				arg2.anInt7105 += arg2.anIntArray603[0];
			}
			arg2.anInt7116 = 0;
		}
		if ((arg1 & 0x4) != 0) {
			local27 = arg3.method3946();
			if (local27 == 65535) {
				local27 = -1;
			}
			local31 = arg3.method3972();
			Static381.method4853(arg2, local27, local31);
		}
		if ((arg1 & 0x2) != 0) {
			local27 = arg3.method3990();
			if (local27 == 65535) {
				local27 = -1;
			}
			arg2.anInt7060 = local27;
		}
		if ((arg1 & 0x20) != 0) {
			arg2.anInt7145 = arg3.method3990();
			if (arg2.anInt7117 == 0) {
				arg2.method5521(arg2.anInt7145);
				arg2.anInt7145 = -1;
			}
		}
		if ((arg1 & 0x10) != 0) {
			local27 = arg3.method3990();
			local31 = arg3.method3931();
			@Pc(585) int local585 = arg3.method3981();
			local228 = arg3.anInt4989;
			@Pc(599) boolean local599 = (local27 & 0x8000) != 0;
			if (arg2.aString69 != null && arg2.aClass75_1 != null) {
				@Pc(607) boolean local607 = false;
				if (local31 <= 1) {
					if (!local599 && (Static148.aBoolean171 && !Static419.aBoolean437 || Static22.aBoolean309)) {
						local607 = true;
					} else if (Static21.method221(arg2.aString69)) {
						local607 = true;
					}
				}
				if (!local607 && Static221.anInt3902 == 0) {
					Static342.aClass7_Sub14_6.anInt4989 = 0;
					arg3.method3977(Static342.aClass7_Sub14_6.aByteArray75, local585);
					Static342.aClass7_Sub14_6.anInt4989 = 0;
					@Pc(653) int local653 = -1;
					@Pc(661) String local661;
					if (local599) {
						local27 &= 0x7FFF;
						@Pc(671) Class179 local671 = Static40.method2437(Static342.aClass7_Sub14_6);
						local653 = local671.anInt4841;
						local661 = local671.aClass7_Sub4_Sub13_1.method4273(Static342.aClass7_Sub14_6);
					} else {
						local661 = Static7.method43(Static86.method1477(Static342.aClass7_Sub14_6));
					}
					arg2.aString68 = local661.trim();
					arg2.anInt7084 = local27 & 0xFF;
					arg2.anInt7075 = 150;
					arg2.anInt7101 = local27 >> 8;
					@Pc(711) int local711;
					if (local31 == 1 || local31 == 2) {
						local711 = local599 ? 17 : 1;
					} else {
						local711 = local599 ? 17 : 2;
					}
					if (local31 == 2) {
						Static169.method2464("<img=1>" + arg2.method5529(), local711, 0, local661, local653, null, "<img=1>" + arg2.method5527());
					} else if (local31 == 1) {
						Static169.method2464("<img=0>" + arg2.method5529(), local711, 0, local661, local653, null, "<img=0>" + arg2.method5527());
					} else {
						Static169.method2464(arg2.method5529(), local711, 0, local661, local653, null, arg2.method5527());
					}
				}
			}
			arg3.anInt4989 = local228 + local585;
		}
		if ((arg1 & 0x80) != 0) {
			Static373.aByteArray86[arg0] = arg3.method3945();
		}
		if ((arg1 & 0x800) != 0) {
			local7 = arg3.method3980();
		}
		if (!arg2.aBoolean480) {
			return;
		}
		if (local7 == 127) {
			arg2.method5526(arg2.anInt7139, arg2.anInt7147);
			return;
		}
		@Pc(850) byte local850;
		if (local7 == -1) {
			local850 = Static373.aByteArray86[arg0];
		} else {
			local850 = local7;
		}
		arg2.method5531(arg2.anInt7147, local850, arg2.anInt7139);
	}
}
