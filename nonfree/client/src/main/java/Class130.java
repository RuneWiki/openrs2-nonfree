import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class130 {

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "[I")
	public int[] anIntArray306;

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "[I")
	private int[] anIntArray307;

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
	public int anInt3949;

	@OriginalMember(owner = "client!kg", name = "u", descriptor = "[Z")
	public boolean[] aBooleanArray76;

	@OriginalMember(owner = "client!kg", name = "v", descriptor = "[[I")
	public int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!kg", name = "x", descriptor = "Lclient!gj;")
	public Class85 aClass85_2;

	@OriginalMember(owner = "client!kg", name = "A", descriptor = "[I")
	public int[] anIntArray308;

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
	public int anInt3938 = 5;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
	public int anInt3937 = 2;

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
	public int anInt3940 = -1;

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
	public int anInt3945 = -1;

	@OriginalMember(owner = "client!kg", name = "q", descriptor = "Z")
	public boolean aBoolean247 = false;

	@OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
	public int anInt3948 = -1;

	@OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
	public int anInt3950 = -1;

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "Z")
	public boolean aBoolean246 = false;

	@OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
	public int anInt3951 = -1;

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "Z")
	public boolean aBoolean248 = false;

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
	public int anInt3947 = 0;

	@OriginalMember(owner = "client!kg", name = "z", descriptor = "I")
	public int anInt3952 = 99;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZLclient!wn;)V")
	public void method3533(@OriginalArg(1) Class4_Sub20 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4614();
			if (local13 == 0) {
				return;
			}
			this.method3537(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!ka;IIIII)Lclient!ka;")
	public Class57 method3534(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray308[arg2];
		@Pc(13) int local13 = this.anIntArray306[arg2];
		@Pc(21) Class4_Sub1_Sub17 local21 = this.aClass85_2.method2403(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg0.method6075((byte) 1, arg1, true);
		}
		@Pc(35) Class4_Sub1_Sub17 local35 = null;
		if ((this.aBoolean247 || Static198.aBoolean245) && arg4 != -1 && this.anIntArray306.length > arg4) {
			@Pc(58) int local58 = this.anIntArray306[arg4];
			local35 = this.aClass85_2.method2403(local58 >> 16);
			arg4 = local58 & 0xFFFF;
		}
		@Pc(72) Class4_Sub1_Sub17 local72 = null;
		@Pc(74) Class4_Sub1_Sub17 local74 = null;
		@Pc(90) int local90 = 0;
		@Pc(92) int local92 = 0;
		if (this.anIntArray307 != null) {
			if (this.anIntArray307.length > arg2) {
				local90 = this.anIntArray307[arg2];
				if (local90 != 65535) {
					local72 = this.aClass85_2.method2403(local90 >> 16);
					local90 &= 0xFFFF;
				}
			}
			if ((this.aBoolean247 || Static198.aBoolean245) && arg4 != -1 && this.anIntArray307.length > arg4) {
				local92 = this.anIntArray307[arg4];
				if (local92 != 65535) {
					local74 = this.aClass85_2.method2403(local92 >> 16);
					local92 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean246) {
			arg1 |= 0x200;
		}
		if (local21.method5227(local25)) {
			arg1 |= 0x80;
		}
		if (local21.method5223(local25)) {
			arg1 |= 0x100;
		}
		if (local21.method5221(local25)) {
			arg1 |= 0x400;
		}
		if (local72 != null) {
			if (local72.method5227(local90)) {
				arg1 |= 0x80;
			}
			if (local72.method5223(local90)) {
				arg1 |= 0x100;
			}
			if (local72.method5221(local90)) {
				arg1 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method5227(arg4)) {
				arg1 |= 0x80;
			}
			if (local35.method5223(arg4)) {
				arg1 |= 0x100;
			}
			if (local35.method5221(arg4)) {
				arg1 |= 0x400;
			}
		}
		if (local74 != null) {
			if (local74.method5227(local92)) {
				arg1 |= 0x80;
			}
			if (local74.method5223(local92)) {
				arg1 |= 0x100;
			}
			if (local74.method5221(local92)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(292) Class57 local292 = arg0.method6075((byte) 1, arg1, true);
		local292.method6077(arg4, 0, local8, arg3 - 1, local21, this.aBoolean246, local35, local25);
		if (local72 != null) {
			local292.method6077(local92, 0, local8, arg3 - 1, local72, this.aBoolean246, local74, local90);
		}
		return local292;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BBIIIILclient!ka;I)Lclient!ka;")
	public Class57 method3536(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class57 arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray308[arg1];
		@Pc(13) int local13 = this.anIntArray306[arg1];
		@Pc(21) Class4_Sub1_Sub17 local21 = this.aClass85_2.method2403(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg5.method6075(arg0, arg6, true);
		}
		@Pc(35) Class4_Sub1_Sub17 local35 = null;
		if ((this.aBoolean247 || Static198.aBoolean245) && arg4 != -1 && this.anIntArray306.length > arg4) {
			@Pc(54) int local54 = this.anIntArray306[arg4];
			local35 = this.aClass85_2.method2403(local54 >> 16);
			arg4 = local54 & 0xFFFF;
		}
		if (this.aBoolean246) {
			arg6 |= 0x200;
		}
		if (local21.method5227(local25)) {
			arg6 |= 0x80;
		}
		if (local21.method5223(local25)) {
			arg6 |= 0x100;
		}
		if (local21.method5221(local25)) {
			arg6 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method5227(arg4)) {
				arg6 |= 0x80;
			}
			if (local35.method5223(arg4)) {
				arg6 |= 0x100;
			}
			if (local35.method5221(arg4)) {
				arg6 |= 0x400;
			}
		}
		arg6 |= 0x20;
		@Pc(144) Class57 local144 = arg5.method6075(arg0, arg6, true);
		local144.method6077(arg4, arg2, local8, arg3 - 1, local21, this.aBoolean246, local35, local25);
		return local144;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IILclient!wn;)V")
	private void method3537(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub20 arg1) {
		@Pc(74) int local74;
		@Pc(80) int local80;
		@Pc(86) int local86;
		@Pc(105) int local105;
		if (arg0 == 1) {
			local74 = arg1.method4560();
			this.anIntArray308 = new int[local74];
			for (local80 = 0; local80 < local74; local80++) {
				this.anIntArray308[local80] = arg1.method4560();
			}
			this.anIntArray306 = new int[local74];
			for (local86 = 0; local86 < local74; local86++) {
				this.anIntArray306[local86] = arg1.method4560();
			}
			for (local105 = 0; local105 < local74; local105++) {
				this.anIntArray306[local105] += arg1.method4560() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt3940 = arg1.method4560();
		} else if (arg0 == 3) {
			this.aBooleanArray76 = new boolean[256];
			local74 = arg1.method4614();
			for (local80 = 0; local80 < local74; local80++) {
				this.aBooleanArray76[arg1.method4614()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt3938 = arg1.method4614();
		} else if (arg0 == 6) {
			this.anInt3951 = arg1.method4560();
		} else if (arg0 == 7) {
			this.anInt3945 = arg1.method4560();
		} else if (arg0 == 8) {
			this.anInt3952 = arg1.method4614();
		} else if (arg0 == 9) {
			this.anInt3948 = arg1.method4614();
		} else if (arg0 == 10) {
			this.anInt3950 = arg1.method4614();
		} else if (arg0 == 11) {
			this.anInt3937 = arg1.method4614();
		} else if (arg0 == 12) {
			local74 = arg1.method4614();
			this.anIntArray307 = new int[local74];
			for (local80 = 0; local80 < local74; local80++) {
				this.anIntArray307[local80] = arg1.method4560();
			}
			for (local86 = 0; local86 < local74; local86++) {
				this.anIntArray307[local86] = (arg1.method4560() << 16) + this.anIntArray307[local86];
			}
		} else if (arg0 == 13) {
			local74 = arg1.method4560();
			this.anIntArrayArray28 = new int[local74][];
			for (local80 = 0; local80 < local74; local80++) {
				local86 = arg1.method4614();
				if (local86 > 0) {
					this.anIntArrayArray28[local80] = new int[local86];
					this.anIntArrayArray28[local80][0] = arg1.method4582();
					for (local105 = 1; local105 < local86; local105++) {
						this.anIntArrayArray28[local80][local105] = arg1.method4560();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean246 = true;
		} else if (arg0 == 15) {
			this.aBoolean247 = true;
		} else if (arg0 == 16) {
			this.aBoolean248 = true;
		} else if (arg0 == 17) {
			this.anInt3947 = arg1.method4614();
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
	public void method3538() {
		if (this.anInt3950 == -1) {
			if (this.aBooleanArray76 == null) {
				this.anInt3950 = 0;
			} else {
				this.anInt3950 = 2;
			}
		}
		if (this.anInt3948 != -1) {
			return;
		}
		if (this.aBooleanArray76 == null) {
			this.anInt3948 = 0;
		} else {
			this.anInt3948 = 2;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIZ)I")
	public int method3539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray306[arg0];
		@Pc(14) Class4_Sub1_Sub17 local14 = null;
		@Pc(22) Class4_Sub1_Sub17 local22 = this.aClass85_2.method2403(local12 >> 16);
		@Pc(31) int local31 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean247 || Static198.aBoolean245) && arg1 != -1 && this.anIntArray306.length > arg1) {
			local7 = this.anIntArray306[arg1];
			local14 = this.aClass85_2.method2403(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean246) {
			local5 = 512;
		}
		if (local22.method5227(local31)) {
			local5 |= 0x80;
		}
		if (local22.method5223(local31)) {
			local5 |= 0x100;
		}
		if (local22.method5221(local31)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method5227(local7)) {
				local5 |= 0x80;
			}
			if (local14.method5223(local7)) {
				local5 |= 0x100;
			}
			if (local14.method5221(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray307 != null && arg2) {
			@Pc(147) int local147;
			@Pc(160) Class4_Sub1_Sub17 local160;
			if (this.anIntArray307.length > arg0) {
				local147 = this.anIntArray307[arg0];
				if (local147 != 65535) {
					local160 = this.aClass85_2.method2403(local147 >> 16);
					local147 &= 0xFFFF;
					if (local160 != null) {
						if (local160.method5227(local147)) {
							local5 |= 0x80;
						}
						if (local160.method5223(local147)) {
							local5 |= 0x100;
						}
						if (local160.method5221(local147)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean247 || Static198.aBoolean245) && arg1 != -1 && arg1 < this.anIntArray307.length) {
				local147 = this.anIntArray307[arg1];
				if (local147 != 65535) {
					local160 = this.aClass85_2.method2403(local147 >> 16);
					local147 &= 0xFFFF;
					if (local160 != null) {
						if (local160.method5227(local147)) {
							local5 |= 0x80;
						}
						if (local160.method5223(local147)) {
							local5 |= 0x100;
						}
						if (local160.method5221(local147)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}
}
