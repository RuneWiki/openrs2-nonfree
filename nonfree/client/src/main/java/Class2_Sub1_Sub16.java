import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class2_Sub1_Sub16 extends Class2_Sub1 {

	@OriginalMember(owner = "client!nl", name = "F", descriptor = "[J")
	public static final long[] aLongArray16 = new long[256];

	@OriginalMember(owner = "client!nl", name = "D", descriptor = "[I")
	private final int[] anIntArray365;

	@OriginalMember(owner = "client!nl", name = "H", descriptor = "[I")
	private final int[] anIntArray366;

	@OriginalMember(owner = "client!nl", name = "G", descriptor = "Lclient!ica;")
	private final Class2_Sub15 aClass2_Sub15_2;

	@OriginalMember(owner = "client!nl", name = "J", descriptor = "Lclient!ica;")
	private final Class2_Sub15 aClass2_Sub15_3;

	@OriginalMember(owner = "client!nl", name = "C", descriptor = "Lclient!ica;")
	private final Class2_Sub15 aClass2_Sub15_1;

	@OriginalMember(owner = "client!nl", name = "A", descriptor = "[Lclient!ica;")
	private final Class2_Sub15[] aClass2_Sub15Array21;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(8) long local8 = (long) local4;
			for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
				if ((local8 & 0x1L) == 1L) {
					local8 = local8 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local8 >>>= 0x1;
				}
			}
			aLongArray16[local4] = local8;
		}
	}

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
	private Class2_Sub1_Sub16() {
		this.anIntArray365 = new int[0];
		this.anIntArray366 = new int[0];
		this.aClass2_Sub15_2 = new Class2_Sub15_Sub2(0);
		this.aClass2_Sub15_2.anInt11361 = 1;
		this.aClass2_Sub15_3 = new Class2_Sub15_Sub2();
		this.aClass2_Sub15_3.anInt11361 = 1;
		this.aClass2_Sub15_1 = new Class2_Sub15_Sub2();
		this.aClass2_Sub15_1.anInt11361 = 1;
		this.aClass2_Sub15Array21 = new Class2_Sub15[] { this.aClass2_Sub15_3, this.aClass2_Sub15_1, this.aClass2_Sub15_2 };
	}

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lclient!ol;)V")
	public Class2_Sub1_Sub16(@OriginalArg(0) Class2_Sub8 arg0) {
		@Pc(7) int local7 = arg0.method5203();
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		this.aClass2_Sub15Array21 = new Class2_Sub15[local7];
		@Pc(18) int[][] local18 = new int[local7][];
		@Pc(50) int local50;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(26) Class2_Sub15 local26 = Static104.method1879(arg0);
			if (local26.method9726() >= 0) {
				local9++;
			}
			if (local26.method9728() >= 0) {
				local11++;
			}
			@Pc(43) int local43 = local26.aClass2_Sub15Array42.length;
			local18[local20] = new int[local43];
			for (local50 = 0; local50 < local43; local50++) {
				local18[local20][local50] = arg0.method5203();
			}
			this.aClass2_Sub15Array21[local20] = local26;
		}
		this.anIntArray365 = new int[local9];
		this.anIntArray366 = new int[local11];
		local9 = 0;
		local11 = 0;
		for (@Pc(95) int local95 = 0; local95 < local7; local95++) {
			@Pc(102) Class2_Sub15 local102 = this.aClass2_Sub15Array21[local95];
			local50 = local102.aClass2_Sub15Array42.length;
			for (@Pc(108) int local108 = 0; local108 < local50; local108++) {
				local102.aClass2_Sub15Array42[local108] = this.aClass2_Sub15Array21[local18[local95][local108]];
			}
			@Pc(130) int local130 = local102.method9726();
			@Pc(134) int local134 = local102.method9728();
			if (local130 > 0) {
				this.anIntArray365[local9++] = local130;
			}
			if (local134 > 0) {
				this.anIntArray366[local11++] = local134;
			}
			local18[local95] = null;
		}
		this.aClass2_Sub15_3 = this.aClass2_Sub15Array21[arg0.method5203()];
		this.aClass2_Sub15_1 = this.aClass2_Sub15Array21[arg0.method5203()];
		this.aClass2_Sub15_2 = this.aClass2_Sub15Array21[arg0.method5203()];
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZDLclient!d;Lclient!gga;IZ)[I")
	public int[] method6697(@OriginalArg(0) int arg0, @OriginalArg(2) double arg1, @OriginalArg(3) Interface3 arg2, @OriginalArg(4) Class124 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		Static414.anInterface3_9 = arg2;
		Static285.aClass124_61 = arg3;
		for (@Pc(17) int local17 = 0; local17 < this.aClass2_Sub15Array21.length; local17++) {
			this.aClass2_Sub15Array21[local17].method9719(arg0, arg4);
		}
		Static136.method2389(arg1);
		Static463.method7433(arg4, arg0);
		@Pc(49) int[] local49 = new int[arg0 * arg4];
		@Pc(51) int local51 = 0;
		for (@Pc(53) int local53 = 0; local53 < arg4; local53++) {
			@Pc(73) int[] local73;
			@Pc(69) int[] local69;
			@Pc(77) int[] local77;
			@Pc(85) int[] local85;
			if (this.aClass2_Sub15_3.aBoolean803) {
				local85 = this.aClass2_Sub15_3.method9724(local53);
				local77 = local85;
				local69 = local85;
				local73 = local85;
			} else {
				@Pc(65) int[][] local65 = this.aClass2_Sub15_3.method9723(local53);
				local69 = local65[1];
				local73 = local65[0];
				local77 = local65[2];
			}
			if (this.aClass2_Sub15_1.aBoolean803) {
				local85 = this.aClass2_Sub15_1.method9724(local53);
			} else {
				local85 = this.aClass2_Sub15_1.method9723(local53)[0];
			}
			if (arg5) {
				local51 = local53;
			}
			for (@Pc(119) int local119 = arg0 - 1; local119 >= 0; local119--) {
				@Pc(127) int local127 = local73[local119] >> 4;
				if (local127 > 255) {
					local127 = 255;
				}
				if (local127 < 0) {
					local127 = 0;
				}
				@Pc(142) int local142 = local69[local119] >> 4;
				if (local142 > 255) {
					local142 = 255;
				}
				if (local142 < 0) {
					local142 = 0;
				}
				@Pc(162) int local162 = local77[local119] >> 4;
				if (local162 > 255) {
					local162 = 255;
				}
				if (local162 < 0) {
					local162 = 0;
				}
				local142 = Static62.anIntArray63[local142];
				local127 = Static62.anIntArray63[local127];
				local162 = Static62.anIntArray63[local162];
				@Pc(200) int local200;
				if (local127 == 0 && local142 == 0 && local162 == 0) {
					local200 = 0;
				} else {
					local200 = local85[local119] >> 4;
					if (local200 > 255) {
						local200 = 255;
					}
					if (local200 < 0) {
						local200 = 0;
					}
				}
				local49[local51++] = local162 + (local200 << 24) + (local127 << 16) + (local142 << 8);
				if (arg5) {
					local51 += arg0 - 1;
				}
			}
		}
		for (@Pc(249) int local249 = 0; local249 < this.aClass2_Sub15Array21.length; local249++) {
			this.aClass2_Sub15Array21[local249].method9720();
		}
		return local49;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!gga;BZIILclient!d;)[F")
	public float[] method6698(@OriginalArg(0) Class124 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface3 arg4) {
		Static285.aClass124_61 = arg0;
		Static414.anInterface3_9 = arg4;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub15Array21.length; local11++) {
			this.aClass2_Sub15Array21[local11].method9719(arg2, arg3);
		}
		Static463.method7433(arg3, arg2);
		@Pc(38) float[] local38 = new float[arg2 * 4 * arg3];
		@Pc(40) int local40 = 0;
		for (@Pc(50) int local50 = 0; local50 < arg3; local50++) {
			@Pc(68) int[] local68;
			@Pc(64) int[] local64;
			@Pc(66) int[] local66;
			if (this.aClass2_Sub15_3.aBoolean803) {
				@Pc(62) int[] local62 = this.aClass2_Sub15_3.method9724(local50);
				local64 = local62;
				local66 = local62;
				local68 = local62;
			} else {
				@Pc(76) int[][] local76 = this.aClass2_Sub15_3.method9723(local50);
				local64 = local76[1];
				local66 = local76[2];
				local68 = local76[0];
			}
			@Pc(98) int[] local98;
			if (this.aClass2_Sub15_1.aBoolean803) {
				local98 = this.aClass2_Sub15_1.method9724(local50);
			} else {
				local98 = this.aClass2_Sub15_1.method9723(local50)[0];
			}
			if (arg1) {
				local40 = local50 << 2;
			}
			@Pc(126) int[] local126;
			if (this.aClass2_Sub15_2.aBoolean803) {
				local126 = this.aClass2_Sub15_2.method9724(local50);
			} else {
				local126 = this.aClass2_Sub15_2.method9723(local50)[0];
			}
			for (@Pc(138) int local138 = arg2 - 1; local138 >= 0; local138--) {
				@Pc(147) float local147 = (float) local98[local138] / 4096.0F;
				if (local147 < 0.0F) {
					local147 = 0.0F;
				} else if (local147 > 1.0F) {
					local147 = 1.0F;
				}
				@Pc(174) float local174 = ((float) local126[local138] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
				local38[local40++] = (float) local68[local138] * local174;
				local38[local40++] = local174 * (float) local64[local138];
				local38[local40++] = local174 * (float) local66[local138];
				local38[local40++] = local147;
				if (arg1) {
					local40 += (arg2 << 2) - 4;
				}
			}
		}
		for (@Pc(231) int local231 = 0; local231 < this.aClass2_Sub15Array21.length; local231++) {
			this.aClass2_Sub15Array21[local231].method9720();
		}
		return local38;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!gga;ZLclient!d;IZDII)[I")
	public int[] method6699(@OriginalArg(0) Class124 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Interface3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) double arg5, @OriginalArg(6) int arg6) {
		Static285.aClass124_61 = arg0;
		Static414.anInterface3_9 = arg2;
		for (@Pc(11) int local11 = 0; local11 < this.aClass2_Sub15Array21.length; local11++) {
			this.aClass2_Sub15Array21[local11].method9719(arg6, arg3);
		}
		Static136.method2389(arg5);
		Static463.method7433(arg3, arg6);
		@Pc(43) int[] local43 = new int[arg6 * arg3];
		@Pc(51) int local51;
		@Pc(53) int local53;
		@Pc(47) byte local47;
		if (arg4) {
			local47 = -1;
			local51 = arg6 - 1;
			local53 = -1;
		} else {
			local51 = 0;
			local47 = 1;
			local53 = arg6;
		}
		@Pc(63) int local63 = 0;
		for (@Pc(65) int local65 = 0; local65 < arg3; local65++) {
			@Pc(85) int[] local85;
			@Pc(81) int[] local81;
			@Pc(89) int[] local89;
			if (this.aClass2_Sub15_3.aBoolean803) {
				@Pc(97) int[] local97 = this.aClass2_Sub15_3.method9724(local65);
				local89 = local97;
				local85 = local97;
				local81 = local97;
			} else {
				@Pc(77) int[][] local77 = this.aClass2_Sub15_3.method9723(local65);
				local81 = local77[1];
				local85 = local77[0];
				local89 = local77[2];
			}
			if (arg1) {
				local63 = local65;
			}
			for (@Pc(109) int local109 = local51; local109 != local53; local109 += local47) {
				@Pc(117) int local117 = local85[local109] >> 4;
				if (local117 > 255) {
					local117 = 255;
				}
				if (local117 < 0) {
					local117 = 0;
				}
				@Pc(134) int local134 = local81[local109] >> 4;
				if (local134 > 255) {
					local134 = 255;
				}
				if (local134 < 0) {
					local134 = 0;
				}
				@Pc(151) int local151 = local89[local109] >> 4;
				if (local151 > 255) {
					local151 = 255;
				}
				local134 = Static62.anIntArray63[local134];
				local117 = Static62.anIntArray63[local117];
				if (local151 < 0) {
					local151 = 0;
				}
				local151 = Static62.anIntArray63[local151];
				@Pc(187) int local187 = local151 + (local134 << 8) + (local117 << 16);
				if (local187 != 0) {
					local187 |= 0xFF000000;
				}
				local43[local63++] = local187;
				if (arg1) {
					local63 += arg6 - 1;
				}
			}
		}
		for (@Pc(223) int local223 = 0; local223 < this.aClass2_Sub15Array21.length; local223++) {
			this.aClass2_Sub15Array21[local223].method9720();
		}
		return local43;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!gga;BLclient!d;)Z")
	public boolean method6700(@OriginalArg(0) Class124 arg0, @OriginalArg(2) Interface3 arg1) {
		@Pc(9) int local9;
		if (Static378.anInt7175 >= 0) {
			for (local9 = 0; local9 < this.anIntArray365.length; local9++) {
				if (!arg0.method3609(Static378.anInt7175, this.anIntArray365[local9])) {
					return false;
				}
			}
		} else {
			for (local9 = 0; local9 < this.anIntArray365.length; local9++) {
				if (!arg0.method3627(this.anIntArray365[local9])) {
					return false;
				}
			}
		}
		for (local9 = 0; local9 < this.anIntArray366.length; local9++) {
			if (!arg1.method1940(this.anIntArray366[local9])) {
				return false;
			}
		}
		return true;
	}
}
