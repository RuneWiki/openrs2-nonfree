import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class177 {

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "[I")
	public int[] anIntArray528;

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!rj", name = "j", descriptor = "[I")
	public int[] anIntArray529;

	@OriginalMember(owner = "client!rj", name = "o", descriptor = "[Z")
	public boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!rj", name = "A", descriptor = "[I")
	private int[] anIntArray530;

	@OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
	public int anInt5423;

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
	public int anInt5408 = -1;

	@OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
	public int anInt5415 = -1;

	@OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
	public int anInt5422 = 99;

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "Z")
	public boolean aBoolean449 = false;

	@OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
	public int anInt5413 = -1;

	@OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
	public int anInt5420 = 2;

	@OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
	public int anInt5419 = -1;

	@OriginalMember(owner = "client!rj", name = "x", descriptor = "Z")
	public boolean aBoolean450 = false;

	@OriginalMember(owner = "client!rj", name = "D", descriptor = "Z")
	public boolean aBoolean452 = false;

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
	public int anInt5410 = -1;

	@OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
	public int anInt5417 = 5;

	@OriginalMember(owner = "client!rj", name = "C", descriptor = "Z")
	public boolean aBoolean451 = false;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
	public void method4738() {
		if (this.anInt5410 == -1) {
			if (this.aBooleanArray23 == null) {
				this.anInt5410 = 0;
			} else {
				this.anInt5410 = 2;
			}
		}
		if (this.anInt5413 != -1) {
			return;
		}
		if (this.aBooleanArray23 == null) {
			this.anInt5413 = 0;
		} else {
			this.anInt5413 = 2;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BIIIILclient!dc;II)Lclient!dc;")
	public Class40 method4740(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class40 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray528[arg2];
		@Pc(13) int local13 = this.anIntArray529[arg2];
		@Pc(24) Class1_Sub2_Sub13 local24 = Static327.method5522(local13 >> 16);
		@Pc(28) int local28 = local13 & 0xFFFF;
		if (local24 == null) {
			return arg4.method4599((byte) 1, arg6, true);
		}
		@Pc(38) Class1_Sub2_Sub13 local38 = null;
		if ((this.aBoolean450 || Static221.aBoolean374) && arg3 != -1 && this.anIntArray529.length > arg3) {
			@Pc(60) int local60 = this.anIntArray529[arg3];
			local38 = Static327.method5522(local60 >> 16);
			arg3 = local60 & 0xFFFF;
		}
		if (this.aBoolean451) {
			arg6 |= 0x200;
		}
		if (local24.method4655(local28)) {
			arg6 |= 0x80;
		}
		if (local24.method4656(local28)) {
			arg6 |= 0x100;
		}
		if (local38 != null) {
			if (local38.method4655(arg3)) {
				arg6 |= 0x80;
			}
			if (local38.method4656(arg3)) {
				arg6 |= 0x100;
			}
		}
		arg6 |= 0x20;
		@Pc(125) Class40 local125 = arg4.method4599(arg0, arg6, true);
		local125.method4596(local28, local8, local38, arg5 - 1, arg3, arg1, local24, this.aBoolean451);
		return local125;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!nj;I)V")
	public void method4741(@OriginalArg(0) Class1_Sub21 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method5720();
			if (local16 == 0) {
				return;
			}
			this.method4743(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BIIZ)I")
	public int method4742(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(18) int local18 = this.anIntArray529[arg0];
		@Pc(20) Class1_Sub2_Sub13 local20 = null;
		@Pc(26) Class1_Sub2_Sub13 local26 = Static327.method5522(local18 >> 16);
		@Pc(30) int local30 = local18 & 0xFFFF;
		if (local26 == null) {
			return 0;
		}
		if ((this.aBoolean450 || Static221.aBoolean374) && arg1 != -1 && arg1 < this.anIntArray529.length) {
			local7 = this.anIntArray529[arg1];
			local20 = Static327.method5522(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean451) {
			local5 = 512;
		}
		if (local26.method4655(local30)) {
			local5 |= 0x80;
		}
		if (local26.method4656(local30)) {
			local5 |= 0x100;
		}
		if (local20 != null) {
			if (local20.method4655(local7)) {
				local5 |= 0x80;
			}
			if (local20.method4656(local7)) {
				local5 |= 0x100;
			}
		}
		if (this.anIntArray530 != null && arg2) {
			@Pc(123) int local123;
			@Pc(134) Class1_Sub2_Sub13 local134;
			if (this.anIntArray530.length > arg0) {
				local123 = this.anIntArray530[arg0];
				if (local123 != 65535) {
					local134 = Static327.method5522(local123 >> 16);
					local123 &= 0xFFFF;
					if (local134 != null) {
						if (local134.method4655(local123)) {
							local5 |= 0x80;
						}
						if (local134.method4656(local123)) {
							local5 |= 0x100;
						}
					}
				}
			}
			if ((this.aBoolean450 || Static221.aBoolean374) && arg1 != -1 && this.anIntArray530.length > arg1) {
				local123 = this.anIntArray530[arg1];
				if (local123 != 65535) {
					local134 = Static327.method5522(local123 >> 16);
					local123 &= 0xFFFF;
					if (local134 != null) {
						if (local134.method4655(local123)) {
							local5 |= 0x80;
						}
						if (local134.method4656(local123)) {
							local5 |= 0x100;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!nj;II)V")
	private void method4743(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(2) int arg1) {
		@Pc(28) int local28;
		@Pc(30) int local30;
		@Pc(153) int local153;
		@Pc(215) int local215;
		if (arg1 == 1) {
			local28 = arg0.method5715();
			this.anIntArray528 = new int[local28];
			for (local30 = 0; local30 < local28; local30++) {
				this.anIntArray528[local30] = arg0.method5715();
			}
			this.anIntArray529 = new int[local28];
			for (local153 = 0; local153 < local28; local153++) {
				this.anIntArray529[local153] = arg0.method5715();
			}
			for (local215 = 0; local215 < local28; local215++) {
				this.anIntArray529[local215] += arg0.method5715() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt5408 = arg0.method5715();
		} else if (arg1 == 3) {
			this.aBooleanArray23 = new boolean[256];
			local28 = arg0.method5720();
			for (local30 = 0; local30 < local28; local30++) {
				this.aBooleanArray23[arg0.method5720()] = true;
			}
		} else if (arg1 == 4) {
			this.aBoolean452 = true;
		} else if (arg1 == 5) {
			this.anInt5417 = arg0.method5720();
		} else if (arg1 == 6) {
			this.anInt5415 = arg0.method5715();
		} else if (arg1 == 7) {
			this.anInt5419 = arg0.method5715();
		} else if (arg1 == 8) {
			this.anInt5422 = arg0.method5720();
		} else if (arg1 == 9) {
			this.anInt5410 = arg0.method5720();
		} else if (arg1 == 10) {
			this.anInt5413 = arg0.method5720();
		} else if (arg1 == 11) {
			this.anInt5420 = arg0.method5720();
		} else if (arg1 == 12) {
			local28 = arg0.method5720();
			this.anIntArray530 = new int[local28];
			for (local30 = 0; local30 < local28; local30++) {
				this.anIntArray530[local30] = arg0.method5715();
			}
			for (local153 = 0; local153 < local28; local153++) {
				this.anIntArray530[local153] += arg0.method5715() << 16;
			}
		} else if (arg1 == 13) {
			local28 = arg0.method5715();
			this.anIntArrayArray44 = new int[local28][];
			for (local30 = 0; local30 < local28; local30++) {
				local153 = arg0.method5720();
				if (local153 > 0) {
					this.anIntArrayArray44[local30] = new int[local153];
					this.anIntArrayArray44[local30][0] = arg0.method5705();
					for (local215 = 1; local215 < local153; local215++) {
						this.anIntArrayArray44[local30][local215] = arg0.method5715();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean451 = true;
		} else if (arg1 == 15) {
			this.aBoolean450 = true;
		} else if (arg1 == 16) {
			this.aBoolean449 = true;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLclient!dc;IIII)Lclient!dc;")
	public Class40 method4746(@OriginalArg(1) Class40 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray528[arg2];
		@Pc(13) int local13 = this.anIntArray529[arg2];
		@Pc(19) Class1_Sub2_Sub13 local19 = Static327.method5522(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg0.method4599((byte) 1, arg1, true);
		}
		@Pc(33) Class1_Sub2_Sub13 local33 = null;
		if ((this.aBoolean450 || Static221.aBoolean374) && arg4 != -1 && arg4 < this.anIntArray529.length) {
			@Pc(52) int local52 = this.anIntArray529[arg4];
			local33 = Static327.method5522(local52 >> 16);
			arg4 = local52 & 0xFFFF;
		}
		@Pc(64) Class1_Sub2_Sub13 local64 = null;
		@Pc(66) Class1_Sub2_Sub13 local66 = null;
		@Pc(76) int local76 = 0;
		@Pc(78) int local78 = 0;
		if (this.anIntArray530 != null) {
			if (arg2 < this.anIntArray530.length) {
				local76 = this.anIntArray530[arg2];
				if (local76 != 65535) {
					local64 = Static327.method5522(local76 >> 16);
					local76 &= 0xFFFF;
				}
			}
			if ((this.aBoolean450 || Static221.aBoolean374) && arg4 != -1 && this.anIntArray530.length > arg4) {
				local78 = this.anIntArray530[arg4];
				if (local78 != 65535) {
					local66 = Static327.method5522(local78 >> 16);
					local78 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean451) {
			arg1 |= 0x200;
		}
		if (local19.method4655(local23)) {
			arg1 |= 0x80;
		}
		if (local19.method4656(local23)) {
			arg1 |= 0x100;
		}
		if (local64 != null) {
			if (local64.method4655(local76)) {
				arg1 |= 0x80;
			}
			if (local64.method4656(local76)) {
				arg1 |= 0x100;
			}
		}
		if (local33 != null) {
			if (local33.method4655(arg4)) {
				arg1 |= 0x80;
			}
			if (local33.method4656(arg4)) {
				arg1 |= 0x100;
			}
		}
		if (local66 != null) {
			if (local66.method4655(local78)) {
				arg1 |= 0x80;
			}
			if (local66.method4656(local78)) {
				arg1 |= 0x100;
			}
		}
		arg1 |= 0x20;
		@Pc(240) Class40 local240 = arg0.method4599((byte) 1, arg1, true);
		local240.method4596(local23, local8, local33, arg3 - 1, arg4, 0, local19, this.aBoolean451);
		if (local64 != null) {
			local240.method4596(local76, local8, local66, arg3 - 1, local78, 0, local64, this.aBoolean451);
		}
		return local240;
	}
}
