import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class178 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "[I")
	public int[] anIntArray257;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "[I")
	public int[] anIntArray258;

	@OriginalMember(owner = "client!je", name = "o", descriptor = "[I")
	public int[] anIntArray259;

	@OriginalMember(owner = "client!je", name = "p", descriptor = "[I")
	public int[] anIntArray260;

	@OriginalMember(owner = "client!je", name = "q", descriptor = "Lclient!br;")
	public Class40 aClass40_1;

	@OriginalMember(owner = "client!je", name = "z", descriptor = "I")
	public int anInt5144;

	@OriginalMember(owner = "client!je", name = "B", descriptor = "[Z")
	public boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!je", name = "D", descriptor = "[I")
	private int[] anIntArray261;

	@OriginalMember(owner = "client!je", name = "I", descriptor = "[I")
	public int[] anIntArray262;

	@OriginalMember(owner = "client!je", name = "K", descriptor = "[[I")
	public int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "I")
	public int anInt5131 = -1;

	@OriginalMember(owner = "client!je", name = "j", descriptor = "I")
	public int anInt5134 = -1;

	@OriginalMember(owner = "client!je", name = "f", descriptor = "I")
	public int anInt5130 = 99;

	@OriginalMember(owner = "client!je", name = "t", descriptor = "I")
	public int anInt5138 = 5;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "I")
	public int anInt5132 = -1;

	@OriginalMember(owner = "client!je", name = "e", descriptor = "I")
	public int anInt5129 = 2;

	@OriginalMember(owner = "client!je", name = "s", descriptor = "Z")
	public boolean aBoolean385 = false;

	@OriginalMember(owner = "client!je", name = "l", descriptor = "Z")
	public boolean aBoolean383 = false;

	@OriginalMember(owner = "client!je", name = "m", descriptor = "Z")
	public boolean aBoolean384 = false;

	@OriginalMember(owner = "client!je", name = "y", descriptor = "I")
	public int anInt5143 = -1;

	@OriginalMember(owner = "client!je", name = "E", descriptor = "Z")
	public boolean aBoolean386 = false;

	@OriginalMember(owner = "client!je", name = "x", descriptor = "I")
	public int anInt5142 = -1;

	static {
		new BitSet(65536);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!ka;IZII)Lclient!ka;")
	public Class14 method4676(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray257[arg3];
		@Pc(13) int local13 = this.anIntArray259[arg3];
		@Pc(28) Class2_Sub1_Sub18 local28 = this.aClass40_1.method1120(local13 >> 16);
		@Pc(32) int local32 = local13 & 0xFFFF;
		if (local28 == null) {
			return arg1.method8622((byte) 1, arg2, true);
		}
		@Pc(42) Class2_Sub1_Sub18 local42 = null;
		if ((this.aBoolean386 || Static135.aBoolean192) && arg4 != -1 && this.anIntArray259.length > arg4) {
			@Pc(61) int local61 = this.anIntArray259[arg4];
			local42 = this.aClass40_1.method1120(local61 >> 16);
			arg4 = local61 & 0xFFFF;
		}
		@Pc(75) Class2_Sub1_Sub18 local75 = null;
		@Pc(77) Class2_Sub1_Sub18 local77 = null;
		@Pc(79) int local79 = 0;
		@Pc(81) int local81 = 0;
		if (this.anIntArray261 != null) {
			if (arg3 < this.anIntArray261.length) {
				local79 = this.anIntArray261[arg3];
				if (local79 != 65535) {
					local75 = this.aClass40_1.method1120(local79 >> 16);
					local79 &= 0xFFFF;
				}
			}
			if ((this.aBoolean386 || Static135.aBoolean192) && arg4 != -1 && arg4 < this.anIntArray261.length) {
				local81 = this.anIntArray261[arg4];
				if (local81 != 65535) {
					local77 = this.aClass40_1.method1120(local81 >> 16);
					local81 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean385) {
			arg2 |= 0x200;
		}
		if (local28.method8433(local32)) {
			arg2 |= 0x80;
		}
		if (local28.method8434(local32)) {
			arg2 |= 0x100;
		}
		if (local28.method8432(local32)) {
			arg2 |= 0x400;
		}
		if (local75 != null) {
			if (local75.method8433(local79)) {
				arg2 |= 0x80;
			}
			if (local75.method8434(local79)) {
				arg2 |= 0x100;
			}
			if (local75.method8432(local79)) {
				arg2 |= 0x400;
			}
		}
		if (local42 != null) {
			if (local42.method8433(arg4)) {
				arg2 |= 0x80;
			}
			if (local42.method8434(arg4)) {
				arg2 |= 0x100;
			}
			if (local42.method8432(arg4)) {
				arg2 |= 0x400;
			}
		}
		if (local77 != null) {
			if (local77.method8433(local81)) {
				arg2 |= 0x80;
			}
			if (local77.method8434(local81)) {
				arg2 |= 0x100;
			}
			if (local77.method8432(local81)) {
				arg2 |= 0x400;
			}
		}
		arg2 |= 0x20;
		@Pc(277) Class14 local277 = arg1.method8622((byte) 1, arg2, true);
		local277.method8627(local28, arg0 - 1, this.aBoolean385, local32, 0, local42, arg4, local8);
		if (local75 != null) {
			local277.method8627(local75, arg0 - 1, this.aBoolean385, local79, 0, local77, local81, local8);
		}
		return local277;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!ol;)V")
	public void method4678(@OriginalArg(1) Class2_Sub8 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5203();
			if (local17 == 0) {
				return;
			}
			this.method4679(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BLclient!ol;I)V")
	private void method4679(@OriginalArg(1) Class2_Sub8 arg0, @OriginalArg(2) int arg1) {
		@Pc(28) int local28;
		@Pc(30) int local30;
		@Pc(134) int local134;
		@Pc(202) int local202;
		if (arg1 == 1) {
			local28 = arg0.method5211();
			this.anIntArray257 = new int[local28];
			for (local30 = 0; local30 < local28; local30++) {
				this.anIntArray257[local30] = arg0.method5211();
			}
			this.anIntArray259 = new int[local28];
			for (local134 = 0; local134 < local28; local134++) {
				this.anIntArray259[local134] = arg0.method5211();
			}
			for (local202 = 0; local202 < local28; local202++) {
				this.anIntArray259[local202] = (arg0.method5211() << 16) + this.anIntArray259[local202];
			}
		} else if (arg1 == 2) {
			this.anInt5142 = arg0.method5211();
		} else if (arg1 == 3) {
			this.aBooleanArray25 = new boolean[256];
			local28 = arg0.method5203();
			for (local30 = 0; local30 < local28; local30++) {
				this.aBooleanArray25[arg0.method5203()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt5138 = arg0.method5203();
		} else if (arg1 == 6) {
			this.anInt5131 = arg0.method5211();
		} else if (arg1 == 7) {
			this.anInt5132 = arg0.method5211();
		} else if (arg1 == 8) {
			this.anInt5130 = arg0.method5203();
		} else if (arg1 == 9) {
			this.anInt5143 = arg0.method5203();
		} else if (arg1 == 10) {
			this.anInt5134 = arg0.method5203();
		} else if (arg1 == 11) {
			this.anInt5129 = arg0.method5203();
		} else if (arg1 == 12) {
			local28 = arg0.method5203();
			this.anIntArray261 = new int[local28];
			for (local30 = 0; local30 < local28; local30++) {
				this.anIntArray261[local30] = arg0.method5211();
			}
			for (local134 = 0; local134 < local28; local134++) {
				this.anIntArray261[local134] = (arg0.method5211() << 16) + this.anIntArray261[local134];
			}
		} else if (arg1 == 13) {
			local28 = arg0.method5211();
			this.anIntArrayArray18 = new int[local28][];
			for (local30 = 0; local30 < local28; local30++) {
				local134 = arg0.method5203();
				if (local134 > 0) {
					this.anIntArrayArray18[local30] = new int[local134];
					this.anIntArrayArray18[local30][0] = arg0.method5161();
					for (local202 = 1; local202 < local134; local202++) {
						this.anIntArrayArray18[local30][local202] = arg0.method5211();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean385 = true;
		} else if (arg1 == 15) {
			this.aBoolean386 = true;
		} else if (arg1 == 16) {
			this.aBoolean384 = true;
		} else if (arg1 == 18) {
			this.aBoolean383 = true;
		} else if (arg1 == 19) {
			if (this.anIntArray260 == null) {
				this.anIntArray260 = new int[this.anIntArrayArray18.length];
				for (local28 = 0; local28 < this.anIntArrayArray18.length; local28++) {
					this.anIntArray260[local28] = 255;
				}
			}
			this.anIntArray260[arg0.method5203()] = arg0.method5203();
		} else if (arg1 == 20) {
			if (this.anIntArray258 == null || this.anIntArray262 == null) {
				this.anIntArray258 = new int[this.anIntArrayArray18.length];
				this.anIntArray262 = new int[this.anIntArrayArray18.length];
				for (local28 = 0; local28 < this.anIntArrayArray18.length; local28++) {
					this.anIntArray258[local28] = 256;
					this.anIntArray262[local28] = 256;
				}
			}
			local28 = arg0.method5203();
			this.anIntArray258[local28] = arg0.method5211();
			this.anIntArray262[local28] = arg0.method5211();
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIBLclient!ka;III)Lclient!ka;")
	public Class14 method4681(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) Class14 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray257[arg5];
		@Pc(13) int local13 = this.anIntArray259[arg5];
		@Pc(21) Class2_Sub1_Sub18 local21 = this.aClass40_1.method1120(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg3.method8622(arg2, arg0, true);
		}
		@Pc(35) Class2_Sub1_Sub18 local35 = null;
		if ((this.aBoolean386 || Static135.aBoolean192) && arg4 != -1 && this.anIntArray259.length > arg4) {
			@Pc(54) int local54 = this.anIntArray259[arg4];
			local35 = this.aClass40_1.method1120(local54 >> 16);
			arg4 = local54 & 0xFFFF;
		}
		if (this.aBoolean385) {
			arg0 |= 0x200;
		}
		if (local21.method8433(local25)) {
			arg0 |= 0x80;
		}
		if (local21.method8434(local25)) {
			arg0 |= 0x100;
		}
		if (local21.method8432(local25)) {
			arg0 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method8433(arg4)) {
				arg0 |= 0x80;
			}
			if (local35.method8434(arg4)) {
				arg0 |= 0x100;
			}
			if (local35.method8432(arg4)) {
				arg0 |= 0x400;
			}
		}
		arg0 |= 0x20;
		@Pc(145) Class14 local145 = arg3.method8622(arg2, arg0, true);
		local145.method8627(local21, arg1 - 1, this.aBoolean385, local25, arg6, local35, arg4, local8);
		return local145;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public void method4683() {
		if (this.anInt5134 == -1) {
			if (this.aBooleanArray25 == null) {
				this.anInt5134 = 0;
			} else {
				this.anInt5134 = 2;
			}
		}
		if (this.anInt5143 != -1) {
			return;
		}
		if (this.aBooleanArray25 == null) {
			this.anInt5143 = 0;
		} else {
			this.anInt5143 = 2;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZIZI)I")
	public int method4685(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = 0;
		@Pc(17) int local17 = this.anIntArray259[arg2];
		@Pc(19) Class2_Sub1_Sub18 local19 = null;
		@Pc(27) Class2_Sub1_Sub18 local27 = this.aClass40_1.method1120(local17 >> 16);
		@Pc(31) int local31 = local17 & 0xFFFF;
		if (local27 == null) {
			return 0;
		}
		if ((this.aBoolean386 || Static135.aBoolean192) && arg1 != -1 && arg1 < this.anIntArray259.length) {
			local12 = this.anIntArray259[arg1];
			local19 = this.aClass40_1.method1120(local12 >> 16);
			local12 &= 0xFFFF;
		}
		if (this.aBoolean385) {
			local10 = 512;
		}
		if (local27.method8433(local31)) {
			local10 |= 0x80;
		}
		if (local27.method8434(local31)) {
			local10 |= 0x100;
		}
		if (local27.method8432(local31)) {
			local10 |= 0x400;
		}
		if (local19 != null) {
			if (local19.method8433(local12)) {
				local10 |= 0x80;
			}
			if (local19.method8434(local12)) {
				local10 |= 0x100;
			}
			if (local19.method8432(local12)) {
				local10 |= 0x400;
			}
		}
		if (this.anIntArray261 != null && arg0) {
			@Pc(152) int local152;
			@Pc(165) Class2_Sub1_Sub18 local165;
			if (this.anIntArray261.length > arg2) {
				local152 = this.anIntArray261[arg2];
				if (local152 != 65535) {
					local165 = this.aClass40_1.method1120(local152 >> 16);
					local152 &= 0xFFFF;
					if (local165 != null) {
						if (local165.method8433(local152)) {
							local10 |= 0x80;
						}
						if (local165.method8434(local152)) {
							local10 |= 0x100;
						}
						if (local165.method8432(local152)) {
							local10 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean386 || Static135.aBoolean192) && arg1 != -1 && this.anIntArray261.length > arg1) {
				local152 = this.anIntArray261[arg1];
				if (local152 != 65535) {
					local165 = this.aClass40_1.method1120(local152 >> 16);
					local152 &= 0xFFFF;
					if (local165 != null) {
						if (local165.method8433(local152)) {
							local10 |= 0x80;
						}
						if (local165.method8434(local152)) {
							local10 |= 0x100;
						}
						if (local165.method8432(local152)) {
							local10 |= 0x400;
						}
					}
				}
			}
		}
		return local10 | 0x20;
	}
}
