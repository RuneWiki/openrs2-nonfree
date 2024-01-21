import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!dh", name = "r", descriptor = "[I")
	public int[] anIntArray49;

	@OriginalMember(owner = "client!dh", name = "s", descriptor = "[I")
	public int[] anIntArray50;

	@OriginalMember(owner = "client!dh", name = "t", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!dh", name = "u", descriptor = "[B")
	private byte[] aByteArray12;

	@OriginalMember(owner = "client!dh", name = "w", descriptor = "S")
	private short aShort5;

	@OriginalMember(owner = "client!dh", name = "x", descriptor = "[I")
	private int[] anIntArray51;

	@OriginalMember(owner = "client!dh", name = "z", descriptor = "[I")
	private int[] anIntArray52;

	@OriginalMember(owner = "client!dh", name = "A", descriptor = "S")
	private short aShort6;

	@OriginalMember(owner = "client!dh", name = "B", descriptor = "[I")
	private int[] anIntArray53;

	@OriginalMember(owner = "client!dh", name = "C", descriptor = "[I")
	private int[] anIntArray54;

	@OriginalMember(owner = "client!dh", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!dh", name = "F", descriptor = "S")
	private short aShort7;

	@OriginalMember(owner = "client!dh", name = "G", descriptor = "[B")
	private byte[] aByteArray13;

	@OriginalMember(owner = "client!dh", name = "H", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!dh", name = "I", descriptor = "S")
	private short aShort8;

	@OriginalMember(owner = "client!dh", name = "J", descriptor = "S")
	private short aShort9;

	@OriginalMember(owner = "client!dh", name = "L", descriptor = "[I")
	private int[] anIntArray55;

	@OriginalMember(owner = "client!dh", name = "N", descriptor = "[I")
	public int[] anIntArray56;

	@OriginalMember(owner = "client!dh", name = "P", descriptor = "[I")
	private int[] anIntArray57;

	@OriginalMember(owner = "client!dh", name = "Q", descriptor = "[I")
	private int[] anIntArray58;

	@OriginalMember(owner = "client!dh", name = "S", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!dh", name = "U", descriptor = "[I")
	private int[] anIntArray59;

	@OriginalMember(owner = "client!dh", name = "V", descriptor = "S")
	private short aShort10;

	@OriginalMember(owner = "client!dh", name = "W", descriptor = "[I")
	private int[] anIntArray60;

	@OriginalMember(owner = "client!dh", name = "X", descriptor = "S")
	private short aShort11;

	@OriginalMember(owner = "client!dh", name = "Y", descriptor = "S")
	private short aShort12;

	@OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
	public int anInt838 = 0;

	@OriginalMember(owner = "client!dh", name = "E", descriptor = "Z")
	public boolean aBoolean52 = false;

	@OriginalMember(owner = "client!dh", name = "R", descriptor = "B")
	private byte aByte2 = 0;

	@OriginalMember(owner = "client!dh", name = "y", descriptor = "I")
	private int anInt839 = 0;

	@OriginalMember(owner = "client!dh", name = "M", descriptor = "I")
	private int anInt840 = 0;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub1() {
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!lg;IIIII)V")
	public Class1_Sub1_Sub1(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method1820();
		arg0.method1802();
		this.anInt838 = arg0.anInt2371;
		this.anIntArray56 = arg0.anIntArray267;
		this.anIntArray49 = arg0.anIntArray265;
		this.anIntArray50 = arg0.anIntArray269;
		this.anInt840 = arg0.anInt2369;
		this.anIntArray54 = arg0.anIntArray263;
		this.anIntArray57 = arg0.anIntArray266;
		this.anIntArray59 = arg0.anIntArray262;
		this.aByteArray11 = arg0.aByteArray40;
		this.aByteArray13 = arg0.aByteArray33;
		this.aByte2 = arg0.aByte4;
		this.anIntArrayArray4 = arg0.anIntArrayArray25;
		this.anIntArrayArray5 = arg0.anIntArrayArray24;
		@Pc(87) int local87 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(93) int local93 = arg2 * local87 >> 8;
		this.anIntArray52 = new int[this.anInt840];
		this.anIntArray53 = new int[this.anInt840];
		this.anIntArray55 = new int[this.anInt840];
		@Pc(118) int local118;
		if (arg0.aShortArray37 == null) {
			this.aShortArray19 = null;
		} else {
			this.aShortArray19 = new short[this.anInt840];
			for (local118 = 0; local118 < this.anInt840; local118++) {
				@Pc(124) short local124 = arg0.aShortArray37[local118];
				if (local124 != -1 && Static149.anInterface1_10.method2487(local124)) {
					this.aShortArray19[local118] = local124;
				} else {
					this.aShortArray19[local118] = -1;
				}
			}
		}
		@Pc(295) int local295;
		if (arg0.anInt2368 > 0 && arg0.aByteArray36 != null) {
			@Pc(162) int[] local162 = new int[arg0.anInt2368];
			for (@Pc(164) int local164 = 0; local164 < this.anInt840; local164++) {
				if (arg0.aByteArray36[local164] != -1) {
					local162[arg0.aByteArray36[local164] & 0xFF]++;
				}
			}
			this.anInt839 = 0;
			for (@Pc(193) int local193 = 0; local193 < arg0.anInt2368; local193++) {
				if (local162[local193] > 0 && arg0.aByteArray39[local193] == 0) {
					this.anInt839++;
				}
			}
			this.anIntArray58 = new int[this.anInt839];
			this.anIntArray51 = new int[this.anInt839];
			this.anIntArray60 = new int[this.anInt839];
			@Pc(231) int local231 = 0;
			for (@Pc(233) int local233 = 0; local233 < arg0.anInt2368; local233++) {
				if (local162[local233] > 0 && arg0.aByteArray39[local233] == 0) {
					this.anIntArray58[local231] = arg0.aShortArray31[local233] & 0xFFFF;
					this.anIntArray51[local231] = arg0.aShortArray34[local233] & 0xFFFF;
					this.anIntArray60[local231] = arg0.aShortArray36[local233] & 0xFFFF;
					local162[local233] = local231++;
				} else {
					local162[local233] = -1;
				}
			}
			this.aByteArray12 = new byte[this.anInt840];
			for (local295 = 0; local295 < this.anInt840; local295++) {
				if (arg0.aByteArray36[local295] == -1) {
					this.aByteArray12[local295] = -1;
				} else {
					this.aByteArray12[local295] = (byte) local162[arg0.aByteArray36[local295] & 0xFF];
					if (this.aByteArray12[local295] == -1 && this.aShortArray19 != null) {
						this.aShortArray19[local295] = -1;
					}
				}
			}
		}
		for (local118 = 0; local118 < this.anInt840; local118++) {
			@Pc(348) byte local348;
			if (arg0.aByteArray37 == null) {
				local348 = 0;
			} else {
				local348 = arg0.aByteArray37[local118];
			}
			@Pc(359) byte local359;
			if (arg0.aByteArray33 == null) {
				local359 = 0;
			} else {
				local359 = arg0.aByteArray33[local118];
			}
			@Pc(370) short local370;
			if (this.aShortArray19 == null) {
				local370 = -1;
			} else {
				local370 = this.aShortArray19[local118];
			}
			if (local359 == -2) {
				local348 = 3;
			}
			if (local359 == -1) {
				local348 = 2;
			}
			@Pc(417) Class94 local417;
			@Pc(578) Class44 local578;
			if (local370 == -1) {
				if (local348 == 0) {
					@Pc(398) int local398 = arg0.aShortArray32[local118] & 0xFFFF;
					if (arg0.aClass94Array2 == null || arg0.aClass94Array2[this.anIntArray54[local118]] == null) {
						local417 = arg0.aClass94Array1[this.anIntArray54[local118]];
					} else {
						local417 = arg0.aClass94Array2[this.anIntArray54[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt3738 + arg4 * local417.anInt3740 + arg5 * local417.anInt3746) / (local93 * local417.anInt3742);
					this.anIntArray52[local118] = Static39.method681(local398, local295);
					if (arg0.aClass94Array2 == null || arg0.aClass94Array2[this.anIntArray57[local118]] == null) {
						local417 = arg0.aClass94Array1[this.anIntArray57[local118]];
					} else {
						local417 = arg0.aClass94Array2[this.anIntArray57[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt3738 + arg4 * local417.anInt3740 + arg5 * local417.anInt3746) / (local93 * local417.anInt3742);
					this.anIntArray53[local118] = Static39.method681(local398, local295);
					if (arg0.aClass94Array2 == null || arg0.aClass94Array2[this.anIntArray59[local118]] == null) {
						local417 = arg0.aClass94Array1[this.anIntArray59[local118]];
					} else {
						local417 = arg0.aClass94Array2[this.anIntArray59[local118]];
					}
					local295 = arg1 + (arg3 * local417.anInt3738 + arg4 * local417.anInt3740 + arg5 * local417.anInt3746) / (local93 * local417.anInt3742);
					this.anIntArray55[local118] = Static39.method681(local398, local295);
				} else if (local348 == 1) {
					local578 = arg0.aClass44Array1[local118];
					local295 = arg1 + (arg3 * local578.anInt1860 + arg4 * local578.anInt1855 + arg5 * local578.anInt1856) / (local93 + local93 / 2);
					this.anIntArray52[local118] = Static39.method681(arg0.aShortArray32[local118] & 0xFFFF, local295);
					this.anIntArray55[local118] = -1;
				} else if (local348 == 3) {
					this.anIntArray52[local118] = 128;
					this.anIntArray55[local118] = -1;
				} else {
					this.anIntArray55[local118] = -2;
				}
			} else if (local348 == 0) {
				if (arg0.aClass94Array2 == null || arg0.aClass94Array2[this.anIntArray54[local118]] == null) {
					local417 = arg0.aClass94Array1[this.anIntArray54[local118]];
				} else {
					local417 = arg0.aClass94Array2[this.anIntArray54[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt3738 + arg4 * local417.anInt3740 + arg5 * local417.anInt3746) / (local93 * local417.anInt3742);
				this.anIntArray52[local118] = Static39.method682(local295);
				if (arg0.aClass94Array2 == null || arg0.aClass94Array2[this.anIntArray57[local118]] == null) {
					local417 = arg0.aClass94Array1[this.anIntArray57[local118]];
				} else {
					local417 = arg0.aClass94Array2[this.anIntArray57[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt3738 + arg4 * local417.anInt3740 + arg5 * local417.anInt3746) / (local93 * local417.anInt3742);
				this.anIntArray53[local118] = Static39.method682(local295);
				if (arg0.aClass94Array2 == null || arg0.aClass94Array2[this.anIntArray59[local118]] == null) {
					local417 = arg0.aClass94Array1[this.anIntArray59[local118]];
				} else {
					local417 = arg0.aClass94Array2[this.anIntArray59[local118]];
				}
				local295 = arg1 + (arg3 * local417.anInt3738 + arg4 * local417.anInt3740 + arg5 * local417.anInt3746) / (local93 * local417.anInt3742);
				this.anIntArray55[local118] = Static39.method682(local295);
			} else if (local348 == 1) {
				local578 = arg0.aClass44Array1[local118];
				local295 = arg1 + (arg3 * local578.anInt1860 + arg4 * local578.anInt1855 + arg5 * local578.anInt1856) / (local93 + local93 / 2);
				this.anIntArray52[local118] = Static39.method682(local295);
				this.anIntArray55[local118] = -1;
			} else {
				this.anIntArray55[local118] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "([Lclient!dh;I)V")
	private Class1_Sub1_Sub1(@OriginalArg(0) Class1_Sub1_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt838 = 0;
		this.anInt840 = 0;
		this.anInt839 = 0;
		this.aByte2 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class1_Sub1_Sub1 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt838 += local43.anInt838;
				this.anInt840 += local43.anInt840;
				this.anInt839 += local43.anInt839;
				if (local43.aByteArray11 == null) {
					if (this.aByte2 == -1) {
						this.aByte2 = local43.aByte2;
					}
					if (this.aByte2 != local43.aByte2) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local43.aByteArray13 != null;
				local22 |= local43.aShortArray19 != null;
				local24 |= local43.aByteArray12 != null;
			}
		}
		this.anIntArray56 = new int[this.anInt838];
		this.anIntArray49 = new int[this.anInt838];
		this.anIntArray50 = new int[this.anInt838];
		this.anIntArray54 = new int[this.anInt840];
		this.anIntArray57 = new int[this.anInt840];
		this.anIntArray59 = new int[this.anInt840];
		this.anIntArray52 = new int[this.anInt840];
		this.anIntArray53 = new int[this.anInt840];
		this.anIntArray55 = new int[this.anInt840];
		if (local18) {
			this.aByteArray11 = new byte[this.anInt840];
		}
		if (local20) {
			this.aByteArray13 = new byte[this.anInt840];
		}
		if (local22) {
			this.aShortArray19 = new short[this.anInt840];
		}
		if (local24) {
			this.aByteArray12 = new byte[this.anInt840];
		}
		if (this.anInt839 > 0) {
			this.anIntArray58 = new int[this.anInt839];
			this.anIntArray51 = new int[this.anInt839];
			this.anIntArray60 = new int[this.anInt839];
		}
		this.anInt838 = 0;
		this.anInt840 = 0;
		this.anInt839 = 0;
		for (@Pc(220) int local220 = 0; local220 < arg1; local220++) {
			@Pc(225) Class1_Sub1_Sub1 local225 = arg0[local220];
			if (local225 != null) {
				for (@Pc(229) int local229 = 0; local229 < local225.anInt840; local229++) {
					this.anIntArray54[this.anInt840] = local225.anIntArray54[local229] + this.anInt838;
					this.anIntArray57[this.anInt840] = local225.anIntArray57[local229] + this.anInt838;
					this.anIntArray59[this.anInt840] = local225.anIntArray59[local229] + this.anInt838;
					this.anIntArray52[this.anInt840] = local225.anIntArray52[local229];
					this.anIntArray53[this.anInt840] = local225.anIntArray53[local229];
					this.anIntArray55[this.anInt840] = local225.anIntArray55[local229];
					if (local18) {
						if (local225.aByteArray11 == null) {
							this.aByteArray11[this.anInt840] = local225.aByte2;
						} else {
							this.aByteArray11[this.anInt840] = local225.aByteArray11[local229];
						}
					}
					if (local20 && local225.aByteArray13 != null) {
						this.aByteArray13[this.anInt840] = local225.aByteArray13[local229];
					}
					if (local22) {
						if (local225.aShortArray19 == null) {
							this.aShortArray19[this.anInt840] = -1;
						} else {
							this.aShortArray19[this.anInt840] = local225.aShortArray19[local229];
						}
					}
					if (local24) {
						if (local225.aByteArray12 == null || local225.aByteArray12[local229] == -1) {
							this.aByteArray12[this.anInt840] = -1;
						} else {
							this.aByteArray12[this.anInt840] = (byte) (local225.aByteArray12[local229] + this.anInt839);
						}
					}
					this.anInt840++;
				}
				for (@Pc(394) int local394 = 0; local394 < local225.anInt839; local394++) {
					this.anIntArray58[this.anInt839] = local225.anIntArray58[local394] + this.anInt838;
					this.anIntArray51[this.anInt839] = local225.anIntArray51[local394] + this.anInt838;
					this.anIntArray60[this.anInt839] = local225.anIntArray60[local394] + this.anInt838;
					this.anInt839++;
				}
				for (@Pc(444) int local444 = 0; local444 < local225.anInt838; local444++) {
					this.anIntArray56[this.anInt838] = local225.anIntArray56[local444];
					this.anIntArray49[this.anInt838] = local225.anIntArray49[local444];
					this.anIntArray50[this.anInt838] = local225.anIntArray50[local444];
					this.anInt838++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "()I")
	@Override
	public int method667() {
		if (!this.aBoolean52) {
			this.method684();
		}
		return this.aShort12;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZLclient!dh;[B)Lclient!a;")
	private Class1_Sub1 method676(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt838 = this.anInt838;
		arg1.anInt840 = this.anInt840;
		arg1.anInt839 = this.anInt839;
		if (arg1.anIntArray56 == null || arg1.anIntArray56.length < this.anInt838) {
			arg1.anIntArray56 = new int[this.anInt838 + 100];
			arg1.anIntArray49 = new int[this.anInt838 + 100];
			arg1.anIntArray50 = new int[this.anInt838 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt838; local43++) {
			arg1.anIntArray56[local43] = this.anIntArray56[local43];
			arg1.anIntArray49[local43] = this.anIntArray49[local43];
			arg1.anIntArray50[local43] = this.anIntArray50[local43];
		}
		if (arg0) {
			arg1.aByteArray13 = this.aByteArray13;
		} else {
			arg1.aByteArray13 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray13 == null) {
				for (local88 = 0; local88 < this.anInt840; local88++) {
					arg1.aByteArray13[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt840; local88++) {
					arg1.aByteArray13[local88] = this.aByteArray13[local88];
				}
			}
		}
		arg1.anIntArray54 = this.anIntArray54;
		arg1.anIntArray57 = this.anIntArray57;
		arg1.anIntArray59 = this.anIntArray59;
		arg1.anIntArray52 = this.anIntArray52;
		arg1.anIntArray53 = this.anIntArray53;
		arg1.anIntArray55 = this.anIntArray55;
		arg1.aByteArray11 = this.aByteArray11;
		arg1.aByteArray12 = this.aByteArray12;
		arg1.aShortArray19 = this.aShortArray19;
		arg1.aByte2 = this.aByte2;
		arg1.anIntArray58 = this.anIntArray58;
		arg1.anIntArray51 = this.anIntArray51;
		arg1.anIntArray60 = this.anIntArray60;
		arg1.anIntArrayArray4 = this.anIntArrayArray4;
		arg1.anIntArrayArray5 = this.anIntArrayArray5;
		arg1.aBoolean51 = super.aBoolean51;
		arg1.aBoolean52 = false;
		return arg1;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I[IIII)V")
	private void method677(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static39.anInt843 = 0;
			Static39.anInt841 = 0;
			Static39.anInt842 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray4.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray4[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static39.anInt843 += this.anIntArray56[local36];
						Static39.anInt841 += this.anIntArray49[local36];
						Static39.anInt842 += this.anIntArray50[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static39.anInt843 = Static39.anInt843 / local6 + arg2;
				Static39.anInt841 = Static39.anInt841 / local6 + arg3;
				Static39.anInt842 = Static39.anInt842 / local6 + arg4;
			} else {
				Static39.anInt843 = arg2;
				Static39.anInt841 = arg3;
				Static39.anInt842 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray4.length) {
					local115 = this.anIntArrayArray4[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray56[local31] += arg2;
						this.anIntArray49[local31] += arg3;
						this.anIntArray50[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray4.length) {
					local115 = this.anIntArrayArray4[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray56[local31] -= Static39.anInt843;
						this.anIntArray49[local31] -= Static39.anInt841;
						this.anIntArray50[local31] -= Static39.anInt842;
						@Pc(217) int local217;
						@Pc(235) int local235;
						if (arg4 != 0) {
							local36 = Class80.anIntArray324[arg4];
							local217 = Class80.anIntArray327[arg4];
							local235 = this.anIntArray49[local31] * local36 + this.anIntArray56[local31] * local217 + 32767 >> 16;
							this.anIntArray49[local31] = this.anIntArray49[local31] * local217 + 32767 - this.anIntArray56[local31] * local36 >> 16;
							this.anIntArray56[local31] = local235;
						}
						if (arg2 != 0) {
							local36 = Class80.anIntArray324[arg2];
							local217 = Class80.anIntArray327[arg2];
							local235 = this.anIntArray49[local31] * local217 + 32767 - this.anIntArray50[local31] * local36 >> 16;
							this.anIntArray50[local31] = this.anIntArray49[local31] * local36 + this.anIntArray50[local31] * local217 + 32767 >> 16;
							this.anIntArray49[local31] = local235;
						}
						if (arg3 != 0) {
							local36 = Class80.anIntArray324[arg3];
							local217 = Class80.anIntArray327[arg3];
							local235 = this.anIntArray50[local31] * local36 + this.anIntArray56[local31] * local217 + 32767 >> 16;
							this.anIntArray50[local31] = this.anIntArray50[local31] * local217 + 32767 - this.anIntArray56[local31] * local36 >> 16;
							this.anIntArray56[local31] = local235;
						}
						this.anIntArray56[local31] += Static39.anInt843;
						this.anIntArray49[local31] += Static39.anInt841;
						this.anIntArray50[local31] += Static39.anInt842;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray4.length) {
					local115 = this.anIntArrayArray4[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray56[local31] -= Static39.anInt843;
						this.anIntArray49[local31] -= Static39.anInt841;
						this.anIntArray50[local31] -= Static39.anInt842;
						this.anIntArray56[local31] = this.anIntArray56[local31] * arg2 / 128;
						this.anIntArray49[local31] = this.anIntArray49[local31] * arg3 / 128;
						this.anIntArray50[local31] = this.anIntArray50[local31] * arg4 / 128;
						this.anIntArray56[local31] += Static39.anInt843;
						this.anIntArray49[local31] += Static39.anInt841;
						this.anIntArray50[local31] += Static39.anInt842;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray5 != null && this.aByteArray13 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray5.length) {
					local115 = this.anIntArrayArray5[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray13[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray13[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!pd;ILclient!pd;I[IZ)V")
	@Override
	public void method658(@OriginalArg(0) Class5_Sub2_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub2_Sub16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method675(arg0, arg1, arg5);
			return;
		}
		@Pc(19) Class19 local19 = arg0.aClass19Array1[arg1];
		@Pc(24) Class19 local24 = arg2.aClass19Array1[arg3];
		@Pc(27) Class5_Sub13 local27 = local19.aClass5_Sub13_1;
		Static39.anInt843 = 0;
		Static39.anInt841 = 0;
		Static39.anInt842 = 0;
		@Pc(35) byte local35 = 0;
		@Pc(38) int local38 = local35 + 1;
		@Pc(40) int local40 = arg4[0];
		for (@Pc(42) int local42 = 0; local42 < local19.anInt706; local42++) {
			@Pc(48) short local48 = local19.aShortArray15[local42];
			while (local48 > local40) {
				local40 = arg4[local38++];
			}
			if (local48 != local40 || local27.anIntArray125[local48] == 0) {
				if (local19.aShortArray12[local42] != -1) {
					this.method677(0, local27.anIntArrayArray14[local19.aShortArray12[local42]], 0, 0, 0);
				}
				this.method677(local27.anIntArray125[local48], local27.anIntArrayArray14[local48], local19.aShortArray16[local42], local19.aShortArray11[local42], local19.aShortArray17[local42]);
			}
		}
		Static39.anInt843 = 0;
		Static39.anInt841 = 0;
		Static39.anInt842 = 0;
		local35 = 0;
		local38 = local35 + 1;
		local40 = arg4[0];
		for (@Pc(126) int local126 = 0; local126 < local24.anInt706; local126++) {
			@Pc(132) short local132 = local24.aShortArray15[local126];
			while (local132 > local40) {
				local40 = arg4[local38++];
			}
			if (local132 == local40 || local27.anIntArray125[local132] == 0) {
				if (local24.aShortArray12[local126] != -1) {
					this.method677(0, local27.anIntArrayArray14[local24.aShortArray12[local126]], 0, 0, 0);
				}
				this.method677(local27.anIntArray125[local132], local27.anIntArrayArray14[local132], local24.aShortArray16[local126], local24.aShortArray11[local126], local24.aShortArray17[local126]);
			}
		}
		this.aBoolean52 = false;
	}

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "()V")
	@Override
	public void method664() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt838; local1++) {
			@Pc(7) int local7 = this.anIntArray56[local1];
			this.anIntArray56[local1] = this.anIntArray50[local1];
			this.anIntArray50[local1] = -local7;
		}
		this.aBoolean52 = false;
	}

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "()I")
	@Override
	public int method671() {
		if (!this.aBoolean52) {
			this.method684();
		}
		return this.aShort9;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZZ)Lclient!a;")
	@Override
	public Class1_Sub1 method660(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (!arg0 && Static39.aByteArray15.length < this.anInt840) {
			Static39.aByteArray15 = new byte[this.anInt840 + 100];
		}
		return this.method676(arg0, Static39.aClass1_Sub1_Sub1_2, Static39.aByteArray15);
	}

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "()I")
	@Override
	public int method669() {
		if (!this.aBoolean52) {
			this.method684();
		}
		return this.aShort11;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "()I")
	@Override
	public int method2449() {
		if (!this.aBoolean52) {
			this.method684();
		}
		return this.aShort10;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method673(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (!this.aBoolean52) {
				this.method684();
			}
			@Pc(6) int local6 = Static149.anInt3059;
			@Pc(8) int local8 = Static149.anInt3063;
			@Pc(12) int local12 = Class80.anIntArray324[0];
			@Pc(16) int local16 = Class80.anIntArray327[0];
			@Pc(20) int local20 = Class80.anIntArray324[arg0];
			@Pc(24) int local24 = Class80.anIntArray327[arg0];
			@Pc(28) int local28 = Class80.anIntArray324[arg1];
			@Pc(32) int local32 = Class80.anIntArray327[arg1];
			@Pc(36) int local36 = Class80.anIntArray324[arg2];
			@Pc(40) int local40 = Class80.anIntArray327[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt838; local52++) {
				@Pc(58) int local58 = this.anIntArray56[local52];
				@Pc(63) int local63 = this.anIntArray49[local52];
				@Pc(68) int local68 = this.anIntArray50[local52];
				@Pc(80) int local80;
				if (arg1 != 0) {
					local80 = local63 * local28 + local58 * local32 >> 16;
					local63 = local63 * local32 - local58 * local28 >> 16;
					local58 = local80;
				}
				if (arg0 != 0) {
					local80 = local68 * local20 + local58 * local24 >> 16;
					local68 = local68 * local24 - local58 * local20 >> 16;
					local58 = local80;
				}
				local58 += arg3;
				local63 += arg4;
				local68 += arg5;
				local80 = local63 * local40 - local68 * local36 >> 16;
				local68 = local63 * local36 + local68 * local40 >> 16;
				Static39.anIntArray64[local52] = local68 - local50;
				Static39.anIntArray70[local52] = local6 + (local58 << 9) / local68;
				Static39.anIntArray66[local52] = local8 + (local80 << 9) / local68;
				if (this.anInt839 > 0) {
					Static39.anIntArray67[local52] = local58;
					Static39.anIntArray68[local52] = local80;
					Static39.anIntArray71[local52] = local68;
				}
			}
			this.method688(false, false, 0L, this.aShort6, this.aShort6 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!a;)Lclient!a;")
	public Class1_Sub1 method679(@OriginalArg(0) Class1_Sub1 arg0) {
		return new Class1_Sub1_Sub1(new Class1_Sub1_Sub1[] { this, (Class1_Sub1_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "()I")
	@Override
	public int method665() {
		if (!this.aBoolean52) {
			this.method684();
		}
		return this.aShort8;
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(IIIIIIII)V")
	public void method680(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			if (!this.aBoolean52) {
				this.method684();
			}
			@Pc(6) int local6 = Static149.anInt3059;
			@Pc(8) int local8 = Static149.anInt3063;
			@Pc(12) int local12 = Class80.anIntArray324[0];
			@Pc(16) int local16 = Class80.anIntArray327[0];
			@Pc(20) int local20 = Class80.anIntArray324[arg0];
			@Pc(24) int local24 = Class80.anIntArray327[arg0];
			@Pc(28) int local28 = Class80.anIntArray324[arg1];
			@Pc(32) int local32 = Class80.anIntArray327[arg1];
			@Pc(36) int local36 = Class80.anIntArray324[arg2];
			@Pc(40) int local40 = Class80.anIntArray327[arg2];
			@Pc(50) int local50 = arg4 * local36 + arg5 * local40 >> 16;
			for (@Pc(52) int local52 = 0; local52 < this.anInt838; local52++) {
				@Pc(58) int local58 = this.anIntArray56[local52];
				@Pc(63) int local63 = this.anIntArray49[local52];
				@Pc(68) int local68 = this.anIntArray50[local52];
				@Pc(80) int local80;
				if (arg1 != 0) {
					local80 = local63 * local28 + local58 * local32 >> 16;
					local63 = local63 * local32 - local58 * local28 >> 16;
					local58 = local80;
				}
				if (arg0 != 0) {
					local80 = local68 * local20 + local58 * local24 >> 16;
					local68 = local68 * local24 - local58 * local20 >> 16;
					local58 = local80;
				}
				local58 += arg3;
				local63 += arg4;
				local68 += arg5;
				local80 = local63 * local40 - local68 * local36 >> 16;
				local68 = local63 * local36 + local68 * local40 >> 16;
				Static39.anIntArray64[local52] = local68 - local50;
				Static39.anIntArray70[local52] = local6 + (local58 << 9) / arg6;
				Static39.anIntArray66[local52] = local8 + (local80 << 9) / arg6;
				if (this.anInt839 > 0) {
					Static39.anIntArray67[local52] = local58;
					Static39.anIntArray68[local52] = local80;
					Static39.anIntArray71[local52] = local68;
				}
			}
			this.method688(false, false, 0L, this.aShort6, this.aShort6 << 1);
		} catch (@Pc(233) RuntimeException local233) {
		}
	}

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "()I")
	@Override
	public int method656() {
		if (!this.aBoolean52) {
			this.method684();
		}
		return this.aShort7;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (!this.aBoolean52) {
			this.method684();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (this.aShort12 * arg2 + this.aShort5 * arg1 >> 16);
		if (local38 <= 50) {
			return;
		}
		@Pc(57) int local57 = local24 + (-this.aShort12 * arg2 + this.aShort10 * arg1 >> 16);
		if (local57 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + this.aShort12 << 9;
		if (local78 / local38 <= Static92.anInt1966) {
			return;
		}
		@Pc(91) int local91 = local71 - this.aShort12 << 9;
		if (local91 / local38 >= Static46.anInt1033) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (this.aShort12 * arg1 + this.aShort5 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static200.anInt3942) {
			return;
		}
		@Pc(146) int local146 = local107 + (-this.aShort12 * arg1 + this.aShort10 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static38.anInt828) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local57 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt839 > 0;
		@Pc(172) int local172 = Static149.anInt3059;
		@Pc(174) int local174 = Static149.anInt3063;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Class80.anIntArray324[arg0];
			local178 = Class80.anIntArray327[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		if (arg8 > 0L && Static194.aBoolean173 && local57 > 0) {
			if (local71 > 0) {
				local204 = local91 / local38;
				local208 = local78 / local57;
			} else {
				local204 = local91 / local57;
				local208 = local78 / local38;
			}
			if (local107 > 0) {
				local223 = local146 / local38;
				local227 = local123 / local57;
			} else {
				local223 = local146 / local57;
				local227 = local123 / local38;
			}
			if (Static93.anInt3215 >= local204 && Static93.anInt3215 <= local208 && Static31.anInt670 >= local223 && Static31.anInt670 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(299) int[] local299 = new int[] { this.aShort7, this.aShort8, this.aShort7, this.aShort8, this.aShort7, this.aShort8, this.aShort7, this.aShort8 };
				@Pc(342) int[] local342 = new int[] { this.aShort11, this.aShort11, this.aShort9, this.aShort9, this.aShort11, this.aShort11, this.aShort9, this.aShort9 };
				@Pc(385) int[] local385 = new int[] { this.aShort10, this.aShort10, this.aShort10, this.aShort10, this.aShort5, this.aShort5, this.aShort5, this.aShort5 };
				for (@Pc(387) int local387 = 0; local387 < 8; local387++) {
					@Pc(392) int local392 = local299[local387];
					@Pc(396) int local396 = local385[local387];
					@Pc(400) int local400 = local342[local387];
					@Pc(412) int local412;
					if (arg0 != 0) {
						local412 = local400 * local176 + local392 * local178 >> 16;
						local400 = local400 * local178 - local392 * local176 >> 16;
						local392 = local412;
					}
					local392 += arg5;
					local396 += arg6;
					local400 += arg7;
					local412 = local400 * arg3 + local392 * arg4 >> 16;
					local400 = local400 * arg4 - local392 * arg3 >> 16;
					local392 = local412;
					local412 = local396 * arg2 - local400 * arg1 >> 16;
					local400 = local396 * arg1 + local400 * arg2 >> 16;
					if (local400 > 0) {
						@Pc(488) int local488 = (local392 << 9) / local400;
						@Pc(494) int local494 = (local412 << 9) / local400;
						if (local488 < local204) {
							local204 = local488;
						}
						if (local488 > local208) {
							local208 = local488;
						}
						if (local494 < local223) {
							local223 = local494;
						}
						if (local494 > local227) {
							local227 = local494;
						}
					}
				}
				if (Static93.anInt3215 >= local204 && Static93.anInt3215 <= local208 && Static31.anInt670 >= local223 && Static31.anInt670 <= local227) {
					if (super.aBoolean51) {
						Static21.aLongArray49[Static134.anInt2785++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < this.anInt838; local204++) {
			local223 = this.anIntArray56[local204];
			local208 = this.anIntArray49[local204];
			local227 = this.anIntArray50[local204];
			@Pc(574) int local574;
			if (arg0 != 0) {
				local574 = local227 * local176 + local223 * local178 >> 16;
				local227 = local227 * local178 - local223 * local176 >> 16;
				local223 = local574;
			}
			local223 += arg5;
			local208 += arg6;
			local227 += arg7;
			local574 = local227 * arg3 + local223 * arg4 >> 16;
			local227 = local227 * arg4 - local223 * arg3 >> 16;
			local223 = local574;
			local574 = local208 * arg2 - local227 * arg1 >> 16;
			local227 = local208 * arg1 + local227 * arg2 >> 16;
			Static39.anIntArray64[local204] = local227 - local24;
			if (local227 >= 50) {
				Static39.anIntArray70[local204] = local172 + (local223 << 9) / local227;
				Static39.anIntArray66[local204] = local174 + (local574 << 9) / local227;
			} else {
				Static39.anIntArray70[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static39.anIntArray67[local204] = local223;
				Static39.anIntArray68[local204] = local574;
				Static39.anIntArray71[local204] = local227;
			}
		}
		try {
			this.method688(local154, local190, arg8, local24 - local57, local38 - local57 + 2);
		} catch (@Pc(712) Exception local712) {
		}
	}

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)V")
	@Override
	public void method663(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class80.anIntArray324[arg0];
		@Pc(7) int local7 = Class80.anIntArray327[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt838; local9++) {
			@Pc(26) int local26 = this.anIntArray49[local9] * local3 + this.anIntArray56[local9] * local7 >> 16;
			this.anIntArray49[local9] = this.anIntArray49[local9] * local7 - this.anIntArray56[local9] * local3 >> 16;
			this.anIntArray56[local9] = local26;
		}
		this.aBoolean52 = false;
	}

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "()V")
	private void method684() {
		@Pc(1) int local1 = 32767;
		@Pc(3) int local3 = 32767;
		@Pc(5) int local5 = 32767;
		@Pc(7) int local7 = -32768;
		@Pc(9) int local9 = -32768;
		@Pc(11) int local11 = -32768;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt838; local17++) {
			@Pc(23) int local23 = this.anIntArray56[local17];
			@Pc(28) int local28 = this.anIntArray49[local17];
			@Pc(33) int local33 = this.anIntArray50[local17];
			if (local23 < local1) {
				local1 = local23;
			}
			if (local23 > local7) {
				local7 = local23;
			}
			if (local28 < local3) {
				local3 = local28;
			}
			if (local28 > local9) {
				local9 = local28;
			}
			if (local33 < local5) {
				local5 = local33;
			}
			if (local33 > local11) {
				local11 = local33;
			}
			@Pc(71) int local71 = local23 * local23 + local33 * local33;
			if (local71 > local13) {
				local13 = local71;
			}
			local71 = local23 * local23 + local33 * local33 + local28 * local28;
			if (local71 > local15) {
				local15 = local71;
			}
		}
		this.aShort7 = (short) local1;
		this.aShort8 = (short) local7;
		this.aShort10 = (short) local3;
		this.aShort5 = (short) local9;
		this.aShort11 = (short) local5;
		this.aShort9 = (short) local11;
		this.aShort12 = (short) (Math.sqrt((double) local13) + 0.99D);
		this.aShort6 = (short) (Math.sqrt((double) local15) + 0.99D);
		this.aBoolean52 = true;
	}

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "(I)V")
	private void method685(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static149.anInt3059;
		@Pc(3) int local3 = Static149.anInt3063;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray54[arg0];
		@Pc(15) int local15 = this.anIntArray57[arg0];
		@Pc(20) int local20 = this.anIntArray59[arg0];
		@Pc(24) int local24 = Static39.anIntArray71[local10];
		@Pc(28) int local28 = Static39.anIntArray71[local15];
		@Pc(32) int local32 = Static39.anIntArray71[local20];
		if (this.aByteArray13 == null) {
			Static149.anInt3062 = 0;
		} else {
			Static149.anInt3062 = this.aByteArray13[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static39.anIntArray72[0] = Static39.anIntArray70[local10];
			Static39.anIntArray69[0] = Static39.anIntArray66[local10];
			local5++;
			Static39.anIntArray62[0] = this.anIntArray52[arg0];
		} else {
			local73 = Static39.anIntArray67[local10];
			local77 = Static39.anIntArray68[local10];
			local82 = this.anIntArray52[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Class80.anIntArray326[local32 - local24];
				Static39.anIntArray72[0] = local1 + (local73 + ((Static39.anIntArray67[local20] - local73) * local95 >> 16) << 9) / 50;
				Static39.anIntArray69[0] = local3 + (local77 + ((Static39.anIntArray68[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static39.anIntArray62[0] = local82 + ((this.anIntArray55[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Class80.anIntArray326[local28 - local24];
				Static39.anIntArray72[local5] = local1 + (local73 + ((Static39.anIntArray67[local15] - local73) * local95 >> 16) << 9) / 50;
				Static39.anIntArray69[local5] = local3 + (local77 + ((Static39.anIntArray68[local15] - local77) * local95 >> 16) << 9) / 50;
				Static39.anIntArray62[local5++] = local82 + ((this.anIntArray53[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static39.anIntArray72[local5] = Static39.anIntArray70[local15];
			Static39.anIntArray69[local5] = Static39.anIntArray66[local15];
			Static39.anIntArray62[local5++] = this.anIntArray53[arg0];
		} else {
			local73 = Static39.anIntArray67[local15];
			local77 = Static39.anIntArray68[local15];
			local82 = this.anIntArray53[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Class80.anIntArray326[local24 - local28];
				Static39.anIntArray72[local5] = local1 + (local73 + ((Static39.anIntArray67[local10] - local73) * local95 >> 16) << 9) / 50;
				Static39.anIntArray69[local5] = local3 + (local77 + ((Static39.anIntArray68[local10] - local77) * local95 >> 16) << 9) / 50;
				Static39.anIntArray62[local5++] = local82 + ((this.anIntArray52[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Class80.anIntArray326[local32 - local28];
				Static39.anIntArray72[local5] = local1 + (local73 + ((Static39.anIntArray67[local20] - local73) * local95 >> 16) << 9) / 50;
				Static39.anIntArray69[local5] = local3 + (local77 + ((Static39.anIntArray68[local20] - local77) * local95 >> 16) << 9) / 50;
				Static39.anIntArray62[local5++] = local82 + ((this.anIntArray55[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static39.anIntArray72[local5] = Static39.anIntArray70[local20];
			Static39.anIntArray69[local5] = Static39.anIntArray66[local20];
			Static39.anIntArray62[local5++] = this.anIntArray55[arg0];
		} else {
			local73 = Static39.anIntArray67[local20];
			local77 = Static39.anIntArray68[local20];
			local82 = this.anIntArray55[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Class80.anIntArray326[local28 - local32];
				Static39.anIntArray72[local5] = local1 + (local73 + ((Static39.anIntArray67[local15] - local73) * local95 >> 16) << 9) / 50;
				Static39.anIntArray69[local5] = local3 + (local77 + ((Static39.anIntArray68[local15] - local77) * local95 >> 16) << 9) / 50;
				Static39.anIntArray62[local5++] = local82 + ((this.anIntArray53[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Class80.anIntArray326[local24 - local32];
				Static39.anIntArray72[local5] = local1 + (local73 + ((Static39.anIntArray67[local10] - local73) * local95 >> 16) << 9) / 50;
				Static39.anIntArray69[local5] = local3 + (local77 + ((Static39.anIntArray68[local10] - local77) * local95 >> 16) << 9) / 50;
				Static39.anIntArray62[local5++] = local82 + ((this.anIntArray52[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static39.anIntArray72[0];
		local77 = Static39.anIntArray72[1];
		local82 = Static39.anIntArray72[2];
		local95 = Static39.anIntArray69[0];
		@Pc(590) int local590 = Static39.anIntArray69[1];
		@Pc(594) int local594 = Static39.anIntArray69[2];
		Static149.aBoolean135 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static149.anInt3060 || local77 > Static149.anInt3060 || local82 > Static149.anInt3060) {
				Static149.aBoolean135 = true;
			}
			if (this.aShortArray19 != null && this.aShortArray19[arg0] != -1) {
				if (this.aByteArray12 == null || this.aByteArray12[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray12[arg0] & 0xFF;
					local683 = this.anIntArray58[local678];
					local688 = this.anIntArray51[local678];
					local693 = this.anIntArray60[local678];
				}
				if (this.anIntArray55[arg0] == -1) {
					Static149.method2273(local95, local590, local594, local73, local77, local82, this.anIntArray52[arg0], this.anIntArray52[arg0], this.anIntArray52[arg0], Static39.anIntArray67[local683], Static39.anIntArray67[local688], Static39.anIntArray67[local693], Static39.anIntArray68[local683], Static39.anIntArray68[local688], Static39.anIntArray68[local693], Static39.anIntArray71[local683], Static39.anIntArray71[local688], Static39.anIntArray71[local693], this.aShortArray19[arg0]);
				} else {
					Static149.method2273(local95, local590, local594, local73, local77, local82, Static39.anIntArray62[0], Static39.anIntArray62[1], Static39.anIntArray62[2], Static39.anIntArray67[local683], Static39.anIntArray67[local688], Static39.anIntArray67[local693], Static39.anIntArray68[local683], Static39.anIntArray68[local688], Static39.anIntArray68[local693], Static39.anIntArray71[local683], Static39.anIntArray71[local688], Static39.anIntArray71[local693], this.aShortArray19[arg0]);
				}
			} else if (this.anIntArray55[arg0] == -1) {
				Static149.method2270(local95, local590, local594, local73, local77, local82, Static149.anIntArray328[this.anIntArray52[arg0]]);
			} else {
				Static149.method2282(local95, local590, local594, local73, local77, local82, Static39.anIntArray62[0], Static39.anIntArray62[1], Static39.anIntArray62[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static149.anInt3060 || local77 > Static149.anInt3060 || local82 > Static149.anInt3060 || Static39.anIntArray72[3] < 0 || Static39.anIntArray72[3] > Static149.anInt3060) {
			Static149.aBoolean135 = true;
		}
		if (this.aShortArray19 == null || this.aShortArray19[arg0] == -1) {
			if (this.anIntArray55[arg0] == -1) {
				local683 = Static149.anIntArray328[this.anIntArray52[arg0]];
				Static149.method2270(local95, local590, local594, local73, local77, local82, local683);
				Static149.method2270(local95, local594, Static39.anIntArray69[3], local73, local82, Static39.anIntArray72[3], local683);
				return;
			}
			Static149.method2282(local95, local590, local594, local73, local77, local82, Static39.anIntArray62[0], Static39.anIntArray62[1], Static39.anIntArray62[2]);
			Static149.method2282(local95, local594, Static39.anIntArray69[3], local73, local82, Static39.anIntArray72[3], Static39.anIntArray62[0], Static39.anIntArray62[2], Static39.anIntArray62[3]);
			return;
		}
		if (this.aByteArray12 == null || this.aByteArray12[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray12[arg0] & 0xFF;
			local683 = this.anIntArray58[local678];
			local688 = this.anIntArray51[local678];
			local693 = this.anIntArray60[local678];
		}
		@Pc(956) short local956 = this.aShortArray19[arg0];
		if (this.anIntArray55[arg0] == -1) {
			Static149.method2273(local95, local590, local594, local73, local77, local82, this.anIntArray52[arg0], this.anIntArray52[arg0], this.anIntArray52[arg0], Static39.anIntArray67[local683], Static39.anIntArray67[local688], Static39.anIntArray67[local693], Static39.anIntArray68[local683], Static39.anIntArray68[local688], Static39.anIntArray68[local693], Static39.anIntArray71[local683], Static39.anIntArray71[local688], Static39.anIntArray71[local693], local956);
			Static149.method2273(local95, local594, Static39.anIntArray69[3], local73, local82, Static39.anIntArray72[3], this.anIntArray52[arg0], this.anIntArray52[arg0], this.anIntArray52[arg0], Static39.anIntArray67[local683], Static39.anIntArray67[local688], Static39.anIntArray67[local693], Static39.anIntArray68[local683], Static39.anIntArray68[local688], Static39.anIntArray68[local693], Static39.anIntArray71[local683], Static39.anIntArray71[local688], Static39.anIntArray71[local693], local956);
			return;
		}
		Static149.method2273(local95, local590, local594, local73, local77, local82, Static39.anIntArray62[0], Static39.anIntArray62[1], Static39.anIntArray62[2], Static39.anIntArray67[local683], Static39.anIntArray67[local688], Static39.anIntArray67[local693], Static39.anIntArray68[local683], Static39.anIntArray68[local688], Static39.anIntArray68[local693], Static39.anIntArray71[local683], Static39.anIntArray71[local688], Static39.anIntArray71[local693], local956);
		Static149.method2273(local95, local594, Static39.anIntArray69[3], local73, local82, Static39.anIntArray72[3], Static39.anIntArray62[0], Static39.anIntArray62[2], Static39.anIntArray62[3], Static39.anIntArray67[local683], Static39.anIntArray67[local688], Static39.anIntArray67[local693], Static39.anIntArray68[local683], Static39.anIntArray68[local688], Static39.anIntArray68[local693], Static39.anIntArray71[local683], Static39.anIntArray71[local688], Static39.anIntArray71[local693], local956);
	}

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V")
	@Override
	public void method674(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class80.anIntArray324[arg0];
		@Pc(7) int local7 = Class80.anIntArray327[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt838; local9++) {
			@Pc(26) int local26 = this.anIntArray49[local9] * local7 - this.anIntArray50[local9] * local3 >> 16;
			this.anIntArray50[local9] = this.anIntArray49[local9] * local3 + this.anIntArray50[local9] * local7 >> 16;
			this.anIntArray49[local9] = local26;
		}
		this.aBoolean52 = false;
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(ZZ)Lclient!a;")
	@Override
	public Class1_Sub1 method670(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (!arg0 && Static39.aByteArray14.length < this.anInt840) {
			Static39.aByteArray14 = new byte[this.anInt840 + 100];
		}
		return this.method676(arg0, Static39.aClass1_Sub1_Sub1_1, Static39.aByteArray14);
	}

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "()V")
	@Override
	public void method662() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt838; local1++) {
			@Pc(7) int local7 = this.anIntArray50[local1];
			this.anIntArray50[local1] = this.anIntArray56[local1];
			this.anIntArray56[local1] = -local7;
		}
		this.aBoolean52 = false;
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(III)V")
	@Override
	public void method657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt838; local1++) {
			this.anIntArray56[local1] = this.anIntArray56[local1] * arg0 / 128;
			this.anIntArray49[local1] = this.anIntArray49[local1] * arg1 / 128;
			this.anIntArray50[local1] = this.anIntArray50[local1] * arg2 / 128;
		}
		this.aBoolean52 = false;
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
	@Override
	public void method659(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Class80.anIntArray324[arg0];
		@Pc(7) int local7 = Class80.anIntArray327[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt838; local9++) {
			@Pc(26) int local26 = this.anIntArray50[local9] * local3 + this.anIntArray56[local9] * local7 >> 16;
			this.anIntArray50[local9] = this.anIntArray50[local9] * local7 - this.anIntArray56[local9] * local3 >> 16;
			this.anIntArray56[local9] = local26;
		}
		this.aBoolean52 = false;
	}

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(III)V")
	@Override
	public void method668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt838; local1++) {
			this.anIntArray56[local1] += arg0;
			this.anIntArray49[local1] += arg1;
			this.anIntArray50[local1] += arg2;
		}
		this.aBoolean52 = false;
	}

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "(I)V")
	private void method686(@OriginalArg(0) int arg0) {
		if (Static39.aBooleanArray11[arg0]) {
			this.method685(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray54[arg0];
		@Pc(17) int local17 = this.anIntArray57[arg0];
		@Pc(22) int local22 = this.anIntArray59[arg0];
		Static149.aBoolean135 = Static39.aBooleanArray10[arg0];
		if (this.aByteArray13 == null) {
			Static149.anInt3062 = 0;
		} else {
			Static149.anInt3062 = this.aByteArray13[arg0] & 0xFF;
		}
		if (this.aShortArray19 != null && this.aShortArray19[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray12 == null || this.aByteArray12[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray12[arg0] & 0xFF;
				local133 = this.anIntArray58[local128];
				local138 = this.anIntArray51[local128];
				local143 = this.anIntArray60[local128];
			}
			if (this.anIntArray55[arg0] == -1) {
				Static149.method2273(Static39.anIntArray66[local12], Static39.anIntArray66[local17], Static39.anIntArray66[local22], Static39.anIntArray70[local12], Static39.anIntArray70[local17], Static39.anIntArray70[local22], this.anIntArray52[arg0], this.anIntArray52[arg0], this.anIntArray52[arg0], Static39.anIntArray67[local133], Static39.anIntArray67[local138], Static39.anIntArray67[local143], Static39.anIntArray68[local133], Static39.anIntArray68[local138], Static39.anIntArray68[local143], Static39.anIntArray71[local133], Static39.anIntArray71[local138], Static39.anIntArray71[local143], this.aShortArray19[arg0]);
			} else {
				Static149.method2273(Static39.anIntArray66[local12], Static39.anIntArray66[local17], Static39.anIntArray66[local22], Static39.anIntArray70[local12], Static39.anIntArray70[local17], Static39.anIntArray70[local22], this.anIntArray52[arg0], this.anIntArray53[arg0], this.anIntArray55[arg0], Static39.anIntArray67[local133], Static39.anIntArray67[local138], Static39.anIntArray67[local143], Static39.anIntArray68[local133], Static39.anIntArray68[local138], Static39.anIntArray68[local143], Static39.anIntArray71[local133], Static39.anIntArray71[local138], Static39.anIntArray71[local143], this.aShortArray19[arg0]);
			}
		} else if (this.anIntArray55[arg0] == -1) {
			Static149.method2270(Static39.anIntArray66[local12], Static39.anIntArray66[local17], Static39.anIntArray66[local22], Static39.anIntArray70[local12], Static39.anIntArray70[local17], Static39.anIntArray70[local22], Static149.anIntArray328[this.anIntArray52[arg0]]);
		} else {
			Static149.method2282(Static39.anIntArray66[local12], Static39.anIntArray66[local17], Static39.anIntArray66[local22], Static39.anIntArray70[local12], Static39.anIntArray70[local17], Static39.anIntArray70[local22], this.anIntArray52[arg0], this.anIntArray53[arg0], this.anIntArray55[arg0]);
		}
	}

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "()V")
	@Override
	public void method661() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt838; local1++) {
			this.anIntArray56[local1] = -this.anIntArray56[local1];
			this.anIntArray50[local1] = -this.anIntArray50[local1];
		}
		this.aBoolean52 = false;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II[[I[[IIIIZ)Lclient!dh;")
	public Class1_Sub1_Sub1 method687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (!this.aBoolean52) {
			this.method684();
		}
		@Pc(9) int local9 = arg4 + this.aShort7;
		@Pc(14) int local14 = arg4 + this.aShort8;
		@Pc(19) int local19 = arg6 + this.aShort11;
		@Pc(24) int local24 = arg6 + this.aShort9;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local9 < 0 || local14 + 128 >> 7 >= arg2.length || local19 < 0 || local24 + 128 >> 7 >= arg2[0].length)) {
			return this;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return this;
			}
			if (local9 < 0 || local14 + 128 >> 7 >= arg3.length || local19 < 0 || local24 + 128 >> 7 >= arg3[0].length) {
				return this;
			}
		} else {
			local9 >>= 0x7;
			local14 = local14 + 127 >> 7;
			local19 >>= 0x7;
			local24 = local24 + 127 >> 7;
			if (arg2[local9][local19] == arg5 && arg2[local14][local19] == arg5 && arg2[local9][local24] == arg5 && arg2[local14][local24] == arg5) {
				return this;
			}
		}
		@Pc(150) Class1_Sub1_Sub1 local150;
		if (arg7) {
			local150 = new Class1_Sub1_Sub1();
			local150.anInt838 = this.anInt838;
			local150.anInt840 = this.anInt840;
			local150.anInt839 = this.anInt839;
			local150.anIntArray54 = this.anIntArray54;
			local150.anIntArray57 = this.anIntArray57;
			local150.anIntArray59 = this.anIntArray59;
			local150.anIntArray52 = this.anIntArray52;
			local150.anIntArray53 = this.anIntArray53;
			local150.anIntArray55 = this.anIntArray55;
			local150.aByteArray11 = this.aByteArray11;
			local150.aByteArray13 = this.aByteArray13;
			local150.aByteArray12 = this.aByteArray12;
			local150.aShortArray19 = this.aShortArray19;
			local150.aByte2 = this.aByte2;
			local150.anIntArray58 = this.anIntArray58;
			local150.anIntArray51 = this.anIntArray51;
			local150.anIntArray60 = this.anIntArray60;
			local150.anIntArrayArray4 = this.anIntArrayArray4;
			local150.anIntArrayArray5 = this.anIntArrayArray5;
			local150.aBoolean51 = super.aBoolean51;
			if (arg0 == 3) {
				local150.anIntArray56 = Static143.method2216(this.anIntArray56);
				local150.anIntArray49 = Static143.method2216(this.anIntArray49);
				local150.anIntArray50 = Static143.method2216(this.anIntArray50);
			} else {
				local150.anIntArray56 = this.anIntArray56;
				local150.anIntArray49 = new int[local150.anInt838];
				local150.anIntArray50 = this.anIntArray50;
			}
		} else {
			local150 = this;
		}
		@Pc(273) int local273;
		@Pc(281) int local281;
		@Pc(288) int local288;
		@Pc(292) int local292;
		@Pc(296) int local296;
		@Pc(300) int local300;
		@Pc(304) int local304;
		@Pc(326) int local326;
		@Pc(352) int local352;
		@Pc(364) int local364;
		if (arg0 == 1) {
			for (local273 = 0; local273 < local150.anInt838; local273++) {
				local281 = this.anIntArray56[local273] + arg4;
				local288 = this.anIntArray50[local273] + arg6;
				local292 = local281 & 0x7F;
				local296 = local288 & 0x7F;
				local300 = local281 >> 7;
				local304 = local288 >> 7;
				local326 = arg2[local300][local304] * (128 - local292) + arg2[local300 + 1][local304] * local292 >> 7;
				local352 = arg2[local300][local304 + 1] * (128 - local292) + arg2[local300 + 1][local304 + 1] * local292 >> 7;
				local364 = local326 * (128 - local296) + local352 * local296 >> 7;
				local150.anIntArray49[local273] = this.anIntArray49[local273] + local364 - arg5;
			}
		} else {
			@Pc(491) int local491;
			if (arg0 == 2) {
				for (local273 = 0; local273 < local150.anInt838; local273++) {
					local281 = (this.anIntArray49[local273] << 16) / this.aShort10;
					if (local281 < arg1) {
						local288 = this.anIntArray56[local273] + arg4;
						local292 = this.anIntArray50[local273] + arg6;
						local296 = local288 & 0x7F;
						local300 = local292 & 0x7F;
						local304 = local288 >> 7;
						local326 = local292 >> 7;
						local352 = arg2[local304][local326] * (128 - local296) + arg2[local304 + 1][local326] * local296 >> 7;
						local364 = arg2[local304][local326 + 1] * (128 - local296) + arg2[local304 + 1][local326 + 1] * local296 >> 7;
						local491 = local352 * (128 - local300) + local364 * local300 >> 7;
						local150.anIntArray49[local273] = this.anIntArray49[local273] + (local491 - arg5) * (arg1 - local281) / arg1;
					} else {
						local150.anIntArray49[local273] = this.anIntArray49[local273];
					}
				}
			} else if (arg0 == 3) {
				local273 = (arg1 & 0xFF) * 4;
				local281 = (arg1 >> 8 & 0xFF) * 4;
				local150.method666(arg2, arg4, arg5, arg6, local273, local281);
			} else if (arg0 == 4) {
				local273 = this.aShort5 - this.aShort10;
				for (local281 = 0; local281 < this.anInt838; local281++) {
					local288 = this.anIntArray56[local281] + arg4;
					local292 = this.anIntArray50[local281] + arg6;
					local296 = local288 & 0x7F;
					local300 = local292 & 0x7F;
					local304 = local288 >> 7;
					local326 = local292 >> 7;
					local352 = arg3[local304][local326] * (128 - local296) + arg3[local304 + 1][local326] * local296 >> 7;
					local364 = arg3[local304][local326 + 1] * (128 - local296) + arg3[local304 + 1][local326 + 1] * local296 >> 7;
					local491 = local352 * (128 - local300) + local364 * local300 >> 7;
					local150.anIntArray49[local281] = this.anIntArray49[local281] + local491 + local273 - arg5;
				}
			} else if (arg0 == 5) {
				local273 = this.aShort5 - this.aShort10;
				for (local281 = 0; local281 < this.anInt838; local281++) {
					local288 = this.anIntArray56[local281] + arg4;
					local292 = this.anIntArray50[local281] + arg6;
					local296 = local288 & 0x7F;
					local300 = local292 & 0x7F;
					local304 = local288 >> 7;
					local326 = local292 >> 7;
					local352 = arg2[local304][local326] * (128 - local296) + arg2[local304 + 1][local326] * local296 >> 7;
					local364 = arg2[local304][local326 + 1] * (128 - local296) + arg2[local304 + 1][local326 + 1] * local296 >> 7;
					local491 = local352 * (128 - local300) + local364 * local300 >> 7;
					local352 = arg3[local304][local326] * (128 - local296) + arg3[local304 + 1][local326] * local296 >> 7;
					local364 = arg3[local304][local326 + 1] * (128 - local296) + arg3[local304 + 1][local326 + 1] * local296 >> 7;
					@Pc(834) int local834 = local352 * (128 - local300) + local364 * local300 >> 7;
					@Pc(838) int local838 = local491 - local834;
					local150.anIntArray49[local281] = ((this.anIntArray49[local281] << 8) / local273 * local838 >> 8) - (arg5 - local491);
				}
			}
		}
		local150.aBoolean52 = false;
		return local150;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZZJII)V")
	private void method688(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			Static39.anIntArray63[local5] = 0;
		}
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(93) int local93;
		for (@Pc(16) int local16 = 0; local16 < this.anInt840; local16++) {
			if (this.anIntArray55[local16] != -2) {
				local28 = this.anIntArray54[local16];
				local33 = this.anIntArray57[local16];
				local38 = this.anIntArray59[local16];
				local42 = Static39.anIntArray70[local28];
				local46 = Static39.anIntArray70[local33];
				local50 = Static39.anIntArray70[local38];
				if (arg0 && (local42 == -5000 || local46 == -5000 || local50 == -5000)) {
					local65 = Static39.anIntArray67[local28];
					local69 = Static39.anIntArray67[local33];
					@Pc(73) int local73 = Static39.anIntArray67[local38];
					@Pc(77) int local77 = Static39.anIntArray68[local28];
					local81 = Static39.anIntArray68[local33];
					local85 = Static39.anIntArray68[local38];
					@Pc(89) int local89 = Static39.anIntArray71[local28];
					local93 = Static39.anIntArray71[local33];
					@Pc(97) int local97 = Static39.anIntArray71[local38];
					local65 -= local69;
					@Pc(105) int local105 = local73 - local69;
					@Pc(109) int local109 = local77 - local81;
					@Pc(113) int local113 = local85 - local81;
					@Pc(117) int local117 = local89 - local93;
					@Pc(121) int local121 = local97 - local93;
					@Pc(129) int local129 = local109 * local121 - local117 * local113;
					@Pc(137) int local137 = local117 * local105 - local65 * local121;
					@Pc(145) int local145 = local65 * local113 - local109 * local105;
					if (local69 * local129 + local81 * local137 + local93 * local145 > 0) {
						Static39.aBooleanArray11[local16] = true;
						@Pc(177) int local177 = (Static39.anIntArray64[local28] + Static39.anIntArray64[local33] + Static39.anIntArray64[local38]) / 3 + arg3;
						Static39.anIntArrayArray7[local177][Static39.anIntArray63[local177]++] = local16;
					}
				} else {
					if (arg1 && this.method678(Static93.anInt3215 + Static149.anInt3059, Static31.anInt670 + Static149.anInt3063, Static39.anIntArray66[local28], Static39.anIntArray66[local33], Static39.anIntArray66[local38], local42, local46, local50)) {
						Static21.aLongArray49[Static134.anInt2785++] = arg2;
						arg1 = false;
					}
					if ((local42 - local46) * (Static39.anIntArray66[local38] - Static39.anIntArray66[local33]) - (Static39.anIntArray66[local28] - Static39.anIntArray66[local33]) * (local50 - local46) > 0) {
						Static39.aBooleanArray11[local16] = false;
						if (local42 >= 0 && local46 >= 0 && local50 >= 0 && local42 <= Static149.anInt3060 && local46 <= Static149.anInt3060 && local50 <= Static149.anInt3060) {
							Static39.aBooleanArray10[local16] = false;
						} else {
							Static39.aBooleanArray10[local16] = true;
						}
						local65 = (Static39.anIntArray64[local28] + Static39.anIntArray64[local33] + Static39.anIntArray64[local38]) / 3 + arg3;
						Static39.anIntArrayArray7[local65][Static39.anIntArray63[local65]++] = local16;
					}
				}
			}
		}
		if (this.aByteArray11 == null) {
			for (local28 = arg4 - 1; local28 >= 0; local28--) {
				local33 = Static39.anIntArray63[local28];
				if (local33 > 0) {
					@Pc(328) int[] local328 = Static39.anIntArrayArray7[local28];
					for (local42 = 0; local42 < local33; local42++) {
						this.method686(local328[local42]);
					}
				}
			}
			return;
		}
		for (local28 = 0; local28 < 12; local28++) {
			Static39.anIntArray74[local28] = 0;
			Static39.anIntArray61[local28] = 0;
		}
		for (local33 = arg4 - 1; local33 >= 0; local33--) {
			local38 = Static39.anIntArray63[local33];
			if (local38 > 0) {
				@Pc(374) int[] local374 = Static39.anIntArrayArray7[local33];
				for (local46 = 0; local46 < local38; local46++) {
					local50 = local374[local46];
					@Pc(386) byte local386 = this.aByteArray11[local50];
					local69 = Static39.anIntArray74[local386]++;
					Static39.anIntArrayArray6[local386][local69] = local50;
					if (local386 < 10) {
						Static39.anIntArray61[local386] += local33;
					} else if (local386 == 10) {
						Static39.anIntArray65[local69] = local33;
					} else {
						Static39.anIntArray73[local69] = local33;
					}
				}
			}
		}
		local38 = 0;
		if (Static39.anIntArray74[1] > 0 || Static39.anIntArray74[2] > 0) {
			local38 = (Static39.anIntArray61[1] + Static39.anIntArray61[2]) / (Static39.anIntArray74[1] + Static39.anIntArray74[2]);
		}
		local42 = 0;
		if (Static39.anIntArray74[3] > 0 || Static39.anIntArray74[4] > 0) {
			local42 = (Static39.anIntArray61[3] + Static39.anIntArray61[4]) / (Static39.anIntArray74[3] + Static39.anIntArray74[4]);
		}
		local46 = 0;
		if (Static39.anIntArray74[6] > 0 || Static39.anIntArray74[8] > 0) {
			local46 = (Static39.anIntArray61[6] + Static39.anIntArray61[8]) / (Static39.anIntArray74[6] + Static39.anIntArray74[8]);
		}
		local65 = 0;
		local69 = Static39.anIntArray74[10];
		@Pc(519) int[] local519 = Static39.anIntArrayArray6[10];
		@Pc(521) int[] local521 = Static39.anIntArray65;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static39.anIntArray74[11];
			local519 = Static39.anIntArrayArray6[11];
			local521 = Static39.anIntArray73;
		}
		if (local69 > 0) {
			local50 = local521[0];
		} else {
			local50 = -1000;
		}
		for (local81 = 0; local81 < 10; local81++) {
			while (local81 == 0 && local50 > local38) {
				this.method686(local519[local65++]);
				if (local65 == local69 && local519 != Static39.anIntArrayArray6[11]) {
					local65 = 0;
					local69 = Static39.anIntArray74[11];
					local519 = Static39.anIntArrayArray6[11];
					local521 = Static39.anIntArray73;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 3 && local50 > local42) {
				this.method686(local519[local65++]);
				if (local65 == local69 && local519 != Static39.anIntArrayArray6[11]) {
					local65 = 0;
					local69 = Static39.anIntArray74[11];
					local519 = Static39.anIntArrayArray6[11];
					local521 = Static39.anIntArray73;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 5 && local50 > local46) {
				this.method686(local519[local65++]);
				if (local65 == local69 && local519 != Static39.anIntArrayArray6[11]) {
					local65 = 0;
					local69 = Static39.anIntArray74[11];
					local519 = Static39.anIntArrayArray6[11];
					local521 = Static39.anIntArray73;
				}
				if (local65 < local69) {
					local50 = local521[local65];
				} else {
					local50 = -1000;
				}
			}
			local85 = Static39.anIntArray74[local81];
			@Pc(684) int[] local684 = Static39.anIntArrayArray6[local81];
			for (local93 = 0; local93 < local85; local93++) {
				this.method686(local684[local93]);
			}
		}
		while (local50 != -1000) {
			this.method686(local519[local65++]);
			if (local65 == local69 && local519 != Static39.anIntArrayArray6[11]) {
				local65 = 0;
				local519 = Static39.anIntArrayArray6[11];
				local69 = Static39.anIntArray74[11];
				local521 = Static39.anIntArray73;
			}
			if (local65 < local69) {
				local50 = local521[local65];
			} else {
				local50 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!pd;IZ)V")
	@Override
	public void method675(@OriginalArg(0) Class5_Sub2_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.anIntArrayArray4 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class19 local12 = arg0.aClass19Array1[arg1];
		@Pc(15) Class5_Sub13 local15 = local12.aClass5_Sub13_1;
		Static39.anInt843 = 0;
		Static39.anInt841 = 0;
		Static39.anInt842 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt706; local23++) {
			@Pc(29) short local29 = local12.aShortArray15[local23];
			if (local12.aShortArray12[local23] != -1) {
				this.method677(0, local15.anIntArrayArray14[local12.aShortArray12[local23]], 0, 0, 0);
			}
			this.method677(local15.anIntArray125[local29], local15.anIntArrayArray14[local29], local12.aShortArray16[local23], local12.aShortArray11[local23], local12.aShortArray17[local23]);
		}
		this.aBoolean52 = false;
	}
}
