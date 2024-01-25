import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class200 {

	@OriginalMember(owner = "client!la", name = "j", descriptor = "[I")
	public int[] anIntArray387;

	@OriginalMember(owner = "client!la", name = "n", descriptor = "[I")
	public int[] anIntArray388;

	@OriginalMember(owner = "client!la", name = "r", descriptor = "[I")
	public int[] anIntArray389;

	@OriginalMember(owner = "client!la", name = "s", descriptor = "[I")
	public int[] anIntArray390;

	@OriginalMember(owner = "client!la", name = "u", descriptor = "I")
	public int anInt4881;

	@OriginalMember(owner = "client!la", name = "y", descriptor = "Lclient!vga;")
	public Class359 aClass359_1;

	@OriginalMember(owner = "client!la", name = "C", descriptor = "[I")
	private int[] anIntArray391;

	@OriginalMember(owner = "client!la", name = "D", descriptor = "[I")
	public int[] anIntArray392;

	@OriginalMember(owner = "client!la", name = "F", descriptor = "[[I")
	public int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!la", name = "H", descriptor = "[Z")
	public boolean[] aBooleanArray34;

	@OriginalMember(owner = "client!la", name = "h", descriptor = "I")
	public int anInt4875 = -1;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "I")
	public int anInt4873 = -1;

	@OriginalMember(owner = "client!la", name = "q", descriptor = "Z")
	public boolean aBoolean402 = false;

	@OriginalMember(owner = "client!la", name = "p", descriptor = "Z")
	public boolean aBoolean401 = false;

	@OriginalMember(owner = "client!la", name = "c", descriptor = "I")
	public int anInt4871 = 2;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "I")
	public int anInt4870 = 5;

	@OriginalMember(owner = "client!la", name = "m", descriptor = "I")
	public int anInt4879 = -1;

	@OriginalMember(owner = "client!la", name = "w", descriptor = "I")
	public int anInt4883 = 99;

	@OriginalMember(owner = "client!la", name = "E", descriptor = "I")
	public int anInt4887 = -1;

	@OriginalMember(owner = "client!la", name = "B", descriptor = "Z")
	public boolean aBoolean403 = false;

	@OriginalMember(owner = "client!la", name = "J", descriptor = "Z")
	public boolean aBoolean404 = false;

	@OriginalMember(owner = "client!la", name = "I", descriptor = "I")
	public int anInt4889 = -1;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILclient!ka;ZI)Lclient!ka;")
	public Class180 method4462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class180 arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray388[arg2];
		@Pc(13) int local13 = this.anIntArray389[arg2];
		@Pc(21) Class5_Sub4_Sub2 local21 = this.aClass359_1.method8413(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg3.method7945((byte) 1, arg0, true);
		}
		@Pc(35) Class5_Sub4_Sub2 local35 = null;
		if ((this.aBoolean401 || Static35.aBoolean59) && arg4 != -1 && arg4 < this.anIntArray389.length) {
			@Pc(57) int local57 = this.anIntArray389[arg4];
			local35 = this.aClass359_1.method8413(local57 >> 16);
			arg4 = local57 & 0xFFFF;
		}
		@Pc(71) Class5_Sub4_Sub2 local71 = null;
		@Pc(73) Class5_Sub4_Sub2 local73 = null;
		@Pc(75) int local75 = 0;
		@Pc(77) int local77 = 0;
		if (this.anIntArray391 != null) {
			if (this.anIntArray391.length > arg2) {
				local75 = this.anIntArray391[arg2];
				if (local75 != 65535) {
					local71 = this.aClass359_1.method8413(local75 >> 16);
					local75 &= 0xFFFF;
				}
			}
			if ((this.aBoolean401 || Static35.aBoolean59) && arg4 != -1 && arg4 < this.anIntArray391.length) {
				local77 = this.anIntArray391[arg4];
				if (local77 != 65535) {
					local73 = this.aClass359_1.method8413(local77 >> 16);
					local77 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean402) {
			arg0 |= 0x200;
		}
		if (local21.method652(local25)) {
			arg0 |= 0x80;
		}
		if (local21.method657(local25)) {
			arg0 |= 0x100;
		}
		if (local21.method654(local25)) {
			arg0 |= 0x400;
		}
		if (local71 != null) {
			if (local71.method652(local75)) {
				arg0 |= 0x80;
			}
			if (local71.method657(local75)) {
				arg0 |= 0x100;
			}
			if (local71.method654(local75)) {
				arg0 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method652(arg4)) {
				arg0 |= 0x80;
			}
			if (local35.method657(arg4)) {
				arg0 |= 0x100;
			}
			if (local35.method654(arg4)) {
				arg0 |= 0x400;
			}
		}
		if (local73 != null) {
			if (local73.method652(local77)) {
				arg0 |= 0x80;
			}
			if (local73.method657(local77)) {
				arg0 |= 0x100;
			}
			if (local73.method654(local77)) {
				arg0 |= 0x400;
			}
		}
		arg0 |= 0x20;
		@Pc(280) Class180 local280 = arg3.method7945((byte) 1, arg0, true);
		local280.method7930(local21, this.aBoolean402, arg4, local8, local25, 0, arg1 - 1, local35);
		if (local71 != null) {
			local280.method7930(local71, this.aBoolean402, local77, local8, local75, 0, arg1 - 1, local73);
		}
		return local280;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!ee;I)V")
	public void method4463(@OriginalArg(0) Class5_Sub12 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method8645();
			if (local10 == 0) {
				return;
			}
			this.method4468(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
	public void method4464() {
		if (this.anInt4873 == -1) {
			if (this.aBooleanArray34 == null) {
				this.anInt4873 = 0;
			} else {
				this.anInt4873 = 2;
			}
		}
		if (this.anInt4875 != -1) {
			return;
		}
		if (this.aBooleanArray34 == null) {
			this.anInt4875 = 0;
		} else {
			this.anInt4875 = 2;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BZII)I")
	public int method4467(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray389[arg1];
		@Pc(14) Class5_Sub4_Sub2 local14 = null;
		@Pc(22) Class5_Sub4_Sub2 local22 = this.aClass359_1.method8413(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean401 || Static35.aBoolean59) && arg2 != -1 && arg2 < this.anIntArray389.length) {
			local7 = this.anIntArray389[arg2];
			local14 = this.aClass359_1.method8413(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean402) {
			local5 = 512;
		}
		if (local22.method652(local26)) {
			local5 |= 0x80;
		}
		if (local22.method657(local26)) {
			local5 |= 0x100;
		}
		if (local22.method654(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method652(local7)) {
				local5 |= 0x80;
			}
			if (local14.method657(local7)) {
				local5 |= 0x100;
			}
			if (local14.method654(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray391 != null && arg0) {
			@Pc(153) int local153;
			@Pc(164) Class5_Sub4_Sub2 local164;
			if (arg1 < this.anIntArray391.length) {
				local153 = this.anIntArray391[arg1];
				if (local153 != 65535) {
					local164 = this.aClass359_1.method8413(local153 >> 16);
					local153 &= 0xFFFF;
					if (local164 != null) {
						if (local164.method652(local153)) {
							local5 |= 0x80;
						}
						if (local164.method657(local153)) {
							local5 |= 0x100;
						}
						if (local164.method654(local153)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean401 || Static35.aBoolean59) && arg2 != -1 && arg2 < this.anIntArray391.length) {
				local153 = this.anIntArray391[arg2];
				if (local153 != 65535) {
					local164 = this.aClass359_1.method8413(local153 >> 16);
					local153 &= 0xFFFF;
					if (local164 != null) {
						if (local164.method652(local153)) {
							local5 |= 0x80;
						}
						if (local164.method657(local153)) {
							local5 |= 0x100;
						}
						if (local164.method654(local153)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!ee;II)V")
	private void method4468(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(1) int arg1) {
		@Pc(71) int local71;
		@Pc(77) int local77;
		@Pc(83) int local83;
		@Pc(102) int local102;
		if (arg1 == 1) {
			local71 = arg0.method8631();
			this.anIntArray388 = new int[local71];
			for (local77 = 0; local77 < local71; local77++) {
				this.anIntArray388[local77] = arg0.method8631();
			}
			this.anIntArray389 = new int[local71];
			for (local83 = 0; local83 < local71; local83++) {
				this.anIntArray389[local83] = arg0.method8631();
			}
			for (local102 = 0; local102 < local71; local102++) {
				this.anIntArray389[local102] = (arg0.method8631() << 16) + this.anIntArray389[local102];
			}
		} else if (arg1 == 2) {
			this.anInt4887 = arg0.method8631();
		} else if (arg1 == 3) {
			this.aBooleanArray34 = new boolean[256];
			local71 = arg0.method8645();
			for (local77 = 0; local77 < local71; local77++) {
				this.aBooleanArray34[arg0.method8645()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt4870 = arg0.method8645();
		} else if (arg1 == 6) {
			this.anInt4889 = arg0.method8631();
		} else if (arg1 == 7) {
			this.anInt4879 = arg0.method8631();
		} else if (arg1 == 8) {
			this.anInt4883 = arg0.method8645();
		} else if (arg1 == 9) {
			this.anInt4875 = arg0.method8645();
		} else if (arg1 == 10) {
			this.anInt4873 = arg0.method8645();
		} else if (arg1 == 11) {
			this.anInt4871 = arg0.method8645();
		} else if (arg1 == 12) {
			local71 = arg0.method8645();
			this.anIntArray391 = new int[local71];
			for (local77 = 0; local77 < local71; local77++) {
				this.anIntArray391[local77] = arg0.method8631();
			}
			for (local83 = 0; local83 < local71; local83++) {
				this.anIntArray391[local83] += arg0.method8631() << 16;
			}
		} else if (arg1 == 13) {
			local71 = arg0.method8631();
			this.anIntArrayArray23 = new int[local71][];
			for (local77 = 0; local77 < local71; local77++) {
				local83 = arg0.method8645();
				if (local83 > 0) {
					this.anIntArrayArray23[local77] = new int[local83];
					this.anIntArrayArray23[local77][0] = arg0.method8657();
					for (local102 = 1; local102 < local83; local102++) {
						this.anIntArrayArray23[local77][local102] = arg0.method8631();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean402 = true;
		} else if (arg1 == 15) {
			this.aBoolean401 = true;
		} else if (arg1 == 16) {
			this.aBoolean403 = true;
		} else if (arg1 == 18) {
			this.aBoolean404 = true;
		} else if (arg1 == 19) {
			if (this.anIntArray392 == null) {
				this.anIntArray392 = new int[this.anIntArrayArray23.length];
				for (local71 = 0; local71 < this.anIntArrayArray23.length; local71++) {
					this.anIntArray392[local71] = 255;
				}
			}
			this.anIntArray392[arg0.method8645()] = arg0.method8645();
		} else if (arg1 == 20) {
			if (this.anIntArray387 == null || this.anIntArray390 == null) {
				this.anIntArray387 = new int[this.anIntArrayArray23.length];
				this.anIntArray390 = new int[this.anIntArrayArray23.length];
				for (local71 = 0; local71 < this.anIntArrayArray23.length; local71++) {
					this.anIntArray387[local71] = 256;
					this.anIntArray390[local71] = 256;
				}
			}
			local71 = arg0.method8645();
			this.anIntArray387[local71] = arg0.method8631();
			this.anIntArray390[local71] = arg0.method8631();
			return;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BIIILclient!ka;IIB)Lclient!ka;")
	public Class180 method4469(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class180 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte arg6) {
		@Pc(8) int local8 = this.anIntArray388[arg1];
		@Pc(13) int local13 = this.anIntArray389[arg1];
		@Pc(23) Class5_Sub4_Sub2 local23 = this.aClass359_1.method8413(local13 >> 16);
		@Pc(32) int local32 = local13 & 0xFFFF;
		if (local23 == null) {
			return arg3.method7945(arg6, arg4, true);
		}
		@Pc(42) Class5_Sub4_Sub2 local42 = null;
		if ((this.aBoolean401 || Static35.aBoolean59) && arg5 != -1 && this.anIntArray389.length > arg5) {
			@Pc(64) int local64 = this.anIntArray389[arg5];
			local42 = this.aClass359_1.method8413(local64 >> 16);
			arg5 = local64 & 0xFFFF;
		}
		if (this.aBoolean402) {
			arg4 |= 0x200;
		}
		if (local23.method652(local32)) {
			arg4 |= 0x80;
		}
		if (local23.method657(local32)) {
			arg4 |= 0x100;
		}
		if (local23.method654(local32)) {
			arg4 |= 0x400;
		}
		if (local42 != null) {
			if (local42.method652(arg5)) {
				arg4 |= 0x80;
			}
			if (local42.method657(arg5)) {
				arg4 |= 0x100;
			}
			if (local42.method654(arg5)) {
				arg4 |= 0x400;
			}
		}
		arg4 |= 0x20;
		@Pc(153) Class180 local153 = arg3.method7945(arg6, arg4, true);
		local153.method7930(local23, this.aBoolean402, arg5, local8, local32, arg2, arg0 - 1, local42);
		return local153;
	}
}
