import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class108 {

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "[I")
	public int[] anIntArray312;

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "[[I")
	public int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "[Z")
	public boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!fq", name = "n", descriptor = "[I")
	public int[] anIntArray313;

	@OriginalMember(owner = "client!fq", name = "o", descriptor = "Lclient!wm;")
	public Class345 aClass345_2;

	@OriginalMember(owner = "client!fq", name = "w", descriptor = "[I")
	private int[] anIntArray314;

	@OriginalMember(owner = "client!fq", name = "x", descriptor = "I")
	public int anInt2600;

	@OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
	public int anInt2591 = 2;

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
	public int anInt2587 = -1;

	@OriginalMember(owner = "client!fq", name = "m", descriptor = "I")
	public int anInt2594 = -1;

	@OriginalMember(owner = "client!fq", name = "p", descriptor = "I")
	public int anInt2595 = -1;

	@OriginalMember(owner = "client!fq", name = "t", descriptor = "I")
	public int anInt2598 = 0;

	@OriginalMember(owner = "client!fq", name = "v", descriptor = "Z")
	public boolean aBoolean177 = false;

	@OriginalMember(owner = "client!fq", name = "r", descriptor = "Z")
	public boolean aBoolean176 = false;

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "I")
	public int anInt2593 = -1;

	@OriginalMember(owner = "client!fq", name = "l", descriptor = "Z")
	public boolean aBoolean175 = false;

	@OriginalMember(owner = "client!fq", name = "D", descriptor = "I")
	public int anInt2604 = 5;

	@OriginalMember(owner = "client!fq", name = "A", descriptor = "I")
	public int anInt2603 = -1;

	@OriginalMember(owner = "client!fq", name = "u", descriptor = "I")
	public int anInt2599 = 99;

	@OriginalMember(owner = "client!fq", name = "E", descriptor = "Z")
	public boolean aBoolean178 = false;

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V")
	public void method2184() {
		if (this.anInt2594 == -1) {
			if (this.aBooleanArray18 == null) {
				this.anInt2594 = 0;
			} else {
				this.anInt2594 = 2;
			}
		}
		if (this.anInt2593 != -1) {
			return;
		}
		if (this.aBooleanArray18 == null) {
			this.anInt2593 = 0;
		} else {
			this.anInt2593 = 2;
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IZBLclient!ba;IIII)Lclient!ba;")
	public Class22 method2185(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) Class22 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray313[arg3];
		@Pc(13) int local13 = this.anIntArray312[arg3];
		@Pc(21) Class6_Sub1_Sub7 local21 = this.aClass345_2.method7796(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg2.method4699(arg1, arg0, true);
		}
		@Pc(35) Class6_Sub1_Sub7 local35 = null;
		if ((this.aBoolean177 || Static318.aBoolean368) && arg5 != -1 && arg5 < this.anIntArray312.length) {
			@Pc(54) int local54 = this.anIntArray312[arg5];
			local35 = this.aClass345_2.method7796(local54 >> 16);
			arg5 = local54 & 0xFFFF;
		}
		if (this.aBoolean178) {
			arg0 |= 0x200;
		}
		if (local21.method2235(local25)) {
			arg0 |= 0x80;
		}
		if (local21.method2234(local25)) {
			arg0 |= 0x100;
		}
		if (local21.method2239(local25)) {
			arg0 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method2235(arg5)) {
				arg0 |= 0x80;
			}
			if (local35.method2234(arg5)) {
				arg0 |= 0x100;
			}
			if (local35.method2239(arg5)) {
				arg0 |= 0x400;
			}
		}
		arg0 |= 0x20;
		@Pc(139) Class22 local139 = arg2.method4699(arg1, arg0, true);
		local139.method4700(arg4, arg5, local8, arg6 - 1, local21, local35, this.aBoolean178, local25);
		return local139;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!dga;II)V")
	private void method2187(@OriginalArg(0) Class6_Sub14 arg0, @OriginalArg(1) int arg1) {
		@Pc(66) int local66;
		@Pc(72) int local72;
		@Pc(78) int local78;
		@Pc(100) int local100;
		if (arg1 == 1) {
			local66 = arg0.method6006();
			this.anIntArray313 = new int[local66];
			for (local72 = 0; local72 < local66; local72++) {
				this.anIntArray313[local72] = arg0.method6006();
			}
			this.anIntArray312 = new int[local66];
			for (local78 = 0; local78 < local66; local78++) {
				this.anIntArray312[local78] = arg0.method6006();
			}
			for (local100 = 0; local100 < local66; local100++) {
				this.anIntArray312[local100] += arg0.method6006() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt2603 = arg0.method6006();
		} else if (arg1 == 3) {
			this.aBooleanArray18 = new boolean[256];
			local66 = arg0.method6041();
			for (local72 = 0; local72 < local66; local72++) {
				this.aBooleanArray18[arg0.method6041()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt2604 = arg0.method6041();
		} else if (arg1 == 6) {
			this.anInt2595 = arg0.method6006();
		} else if (arg1 == 7) {
			this.anInt2587 = arg0.method6006();
		} else if (arg1 == 8) {
			this.anInt2599 = arg0.method6041();
		} else if (arg1 == 9) {
			this.anInt2593 = arg0.method6041();
		} else if (arg1 == 10) {
			this.anInt2594 = arg0.method6041();
		} else if (arg1 == 11) {
			this.anInt2591 = arg0.method6041();
		} else if (arg1 == 12) {
			local66 = arg0.method6041();
			this.anIntArray314 = new int[local66];
			for (local72 = 0; local72 < local66; local72++) {
				this.anIntArray314[local72] = arg0.method6006();
			}
			for (local78 = 0; local78 < local66; local78++) {
				this.anIntArray314[local78] = (arg0.method6006() << 16) + this.anIntArray314[local78];
			}
		} else if (arg1 == 13) {
			local66 = arg0.method6006();
			this.anIntArrayArray37 = new int[local66][];
			for (local72 = 0; local72 < local66; local72++) {
				local78 = arg0.method6041();
				if (local78 > 0) {
					this.anIntArrayArray37[local72] = new int[local78];
					this.anIntArrayArray37[local72][0] = arg0.method5988();
					for (local100 = 1; local100 < local78; local100++) {
						this.anIntArrayArray37[local72][local100] = arg0.method6006();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean178 = true;
		} else if (arg1 == 15) {
			this.aBoolean177 = true;
		} else if (arg1 == 16) {
			this.aBoolean175 = true;
		} else if (arg1 == 17) {
			this.anInt2598 = arg0.method6041();
		} else if (arg1 == 18) {
			this.aBoolean176 = true;
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BLclient!ba;IIII)Lclient!ba;")
	public Class22 method2188(@OriginalArg(1) Class22 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray313[arg4];
		@Pc(13) int local13 = this.anIntArray312[arg4];
		@Pc(21) Class6_Sub1_Sub7 local21 = this.aClass345_2.method7796(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg0.method4699((byte) 1, arg3, true);
		}
		@Pc(35) Class6_Sub1_Sub7 local35 = null;
		if ((this.aBoolean177 || Static318.aBoolean368) && arg1 != -1 && this.anIntArray312.length > arg1) {
			@Pc(58) int local58 = this.anIntArray312[arg1];
			local35 = this.aClass345_2.method7796(local58 >> 16);
			arg1 = local58 & 0xFFFF;
		}
		@Pc(72) Class6_Sub1_Sub7 local72 = null;
		@Pc(74) Class6_Sub1_Sub7 local74 = null;
		@Pc(76) int local76 = 0;
		@Pc(78) int local78 = 0;
		if (this.anIntArray314 != null) {
			if (this.anIntArray314.length > arg4) {
				local76 = this.anIntArray314[arg4];
				if (local76 != 65535) {
					local72 = this.aClass345_2.method7796(local76 >> 16);
					local76 &= 0xFFFF;
				}
			}
			if ((this.aBoolean177 || Static318.aBoolean368) && arg1 != -1 && arg1 < this.anIntArray314.length) {
				local78 = this.anIntArray314[arg1];
				if (local78 != 65535) {
					local74 = this.aClass345_2.method7796(local78 >> 16);
					local78 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean178) {
			arg3 |= 0x200;
		}
		if (local21.method2235(local25)) {
			arg3 |= 0x80;
		}
		if (local21.method2234(local25)) {
			arg3 |= 0x100;
		}
		if (local21.method2239(local25)) {
			arg3 |= 0x400;
		}
		if (local72 != null) {
			if (local72.method2235(local76)) {
				arg3 |= 0x80;
			}
			if (local72.method2234(local76)) {
				arg3 |= 0x100;
			}
			if (local72.method2239(local76)) {
				arg3 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method2235(arg1)) {
				arg3 |= 0x80;
			}
			if (local35.method2234(arg1)) {
				arg3 |= 0x100;
			}
			if (local35.method2239(arg1)) {
				arg3 |= 0x400;
			}
		}
		if (local74 != null) {
			if (local74.method2235(local78)) {
				arg3 |= 0x80;
			}
			if (local74.method2234(local78)) {
				arg3 |= 0x100;
			}
			if (local74.method2239(local78)) {
				arg3 |= 0x400;
			}
		}
		arg3 |= 0x20;
		@Pc(293) Class22 local293 = arg0.method4699((byte) 1, arg3, true);
		local293.method4700(0, arg1, local8, arg2 - 1, local21, local35, this.aBoolean178, local25);
		if (local72 != null) {
			local293.method4700(0, local78, local8, arg2 - 1, local72, local74, this.aBoolean178, local76);
		}
		return local293;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIZI)I")
	public int method2189(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray312[arg2];
		@Pc(14) Class6_Sub1_Sub7 local14 = null;
		@Pc(30) Class6_Sub1_Sub7 local30 = this.aClass345_2.method7796(local12 >> 16);
		@Pc(34) int local34 = local12 & 0xFFFF;
		if (local30 == null) {
			return 0;
		}
		if ((this.aBoolean177 || Static318.aBoolean368) && arg0 != -1 && this.anIntArray312.length > arg0) {
			local7 = this.anIntArray312[arg0];
			local14 = this.aClass345_2.method7796(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean178) {
			local5 = 512;
		}
		if (local30.method2235(local34)) {
			local5 |= 0x80;
		}
		if (local30.method2234(local34)) {
			local5 |= 0x100;
		}
		if (local30.method2239(local34)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method2235(local7)) {
				local5 |= 0x80;
			}
			if (local14.method2234(local7)) {
				local5 |= 0x100;
			}
			if (local14.method2239(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray314 != null && arg1) {
			@Pc(150) int local150;
			@Pc(163) Class6_Sub1_Sub7 local163;
			if (arg2 < this.anIntArray314.length) {
				local150 = this.anIntArray314[arg2];
				if (local150 != 65535) {
					local163 = this.aClass345_2.method7796(local150 >> 16);
					local150 &= 0xFFFF;
					if (local163 != null) {
						if (local163.method2235(local150)) {
							local5 |= 0x80;
						}
						if (local163.method2234(local150)) {
							local5 |= 0x100;
						}
						if (local163.method2239(local150)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean177 || Static318.aBoolean368) && arg0 != -1 && arg0 < this.anIntArray314.length) {
				local150 = this.anIntArray314[arg0];
				if (local150 != 65535) {
					local163 = this.aClass345_2.method7796(local150 >> 16);
					local150 &= 0xFFFF;
					if (local163 != null) {
						if (local163.method2235(local150)) {
							local5 |= 0x80;
						}
						if (local163.method2234(local150)) {
							local5 |= 0x100;
						}
						if (local163.method2239(local150)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lclient!dga;Z)V")
	public void method2190(@OriginalArg(0) Class6_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6041();
			if (local5 == 0) {
				return;
			}
			this.method2187(arg0, local5);
		}
	}
}
