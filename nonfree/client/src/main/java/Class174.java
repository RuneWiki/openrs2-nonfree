import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class174 {

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
	public int anInt5481;

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "Lclient!ie;")
	public Class157 aClass157_1;

	@OriginalMember(owner = "client!jq", name = "p", descriptor = "[Z")
	public boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!jq", name = "q", descriptor = "[I")
	private int[] anIntArray324;

	@OriginalMember(owner = "client!jq", name = "r", descriptor = "[I")
	public int[] anIntArray325;

	@OriginalMember(owner = "client!jq", name = "z", descriptor = "[[I")
	public int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!jq", name = "B", descriptor = "[I")
	public int[] anIntArray326;

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
	public int anInt5484 = -1;

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
	public int anInt5479 = 99;

	@OriginalMember(owner = "client!jq", name = "v", descriptor = "Z")
	public boolean aBoolean470 = false;

	@OriginalMember(owner = "client!jq", name = "y", descriptor = "I")
	public int anInt5494 = 0;

	@OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
	public int anInt5490 = -1;

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "Z")
	public boolean aBoolean468 = false;

	@OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
	public int anInt5488 = 2;

	@OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
	public int anInt5487 = -1;

	@OriginalMember(owner = "client!jq", name = "x", descriptor = "Z")
	public boolean aBoolean471 = false;

	@OriginalMember(owner = "client!jq", name = "t", descriptor = "Z")
	public boolean aBoolean469 = false;

	@OriginalMember(owner = "client!jq", name = "D", descriptor = "I")
	public int anInt5496 = -1;

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
	public int anInt5485 = -1;

	@OriginalMember(owner = "client!jq", name = "E", descriptor = "I")
	public int anInt5497 = 5;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V")
	public void method4539() {
		if (this.anInt5496 == -1) {
			if (this.aBooleanArray18 == null) {
				this.anInt5496 = 0;
			} else {
				this.anInt5496 = 2;
			}
		}
		if (this.anInt5487 != -1) {
			return;
		}
		if (this.aBooleanArray18 == null) {
			this.anInt5487 = 0;
		} else {
			this.anInt5487 = 2;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!fd;II)V")
	private void method4541(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		@Pc(26) int local26;
		@Pc(28) int local28;
		@Pc(117) int local117;
		@Pc(136) int local136;
		if (arg1 == 1) {
			local26 = arg0.method6535();
			this.anIntArray325 = new int[local26];
			for (local28 = 0; local28 < local26; local28++) {
				this.anIntArray325[local28] = arg0.method6535();
			}
			this.anIntArray326 = new int[local26];
			for (local117 = 0; local117 < local26; local117++) {
				this.anIntArray326[local117] = arg0.method6535();
			}
			for (local136 = 0; local136 < local26; local136++) {
				this.anIntArray326[local136] += arg0.method6535() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt5485 = arg0.method6535();
		} else if (arg1 == 3) {
			this.aBooleanArray18 = new boolean[256];
			local26 = arg0.method6538();
			for (local28 = 0; local28 < local26; local28++) {
				this.aBooleanArray18[arg0.method6538()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt5497 = arg0.method6538();
		} else if (arg1 == 6) {
			this.anInt5490 = arg0.method6535();
		} else if (arg1 == 7) {
			this.anInt5484 = arg0.method6535();
		} else if (arg1 == 8) {
			this.anInt5479 = arg0.method6538();
		} else if (arg1 == 9) {
			this.anInt5487 = arg0.method6538();
		} else if (arg1 == 10) {
			this.anInt5496 = arg0.method6538();
		} else if (arg1 == 11) {
			this.anInt5488 = arg0.method6538();
		} else if (arg1 == 12) {
			local26 = arg0.method6538();
			this.anIntArray324 = new int[local26];
			for (local28 = 0; local28 < local26; local28++) {
				this.anIntArray324[local28] = arg0.method6535();
			}
			for (local117 = 0; local117 < local26; local117++) {
				this.anIntArray324[local117] += arg0.method6535() << 16;
			}
		} else if (arg1 == 13) {
			local26 = arg0.method6535();
			this.anIntArrayArray40 = new int[local26][];
			for (local28 = 0; local28 < local26; local28++) {
				local117 = arg0.method6538();
				if (local117 > 0) {
					this.anIntArrayArray40[local28] = new int[local117];
					this.anIntArrayArray40[local28][0] = arg0.method6506();
					for (local136 = 1; local136 < local117; local136++) {
						this.anIntArrayArray40[local28][local136] = arg0.method6535();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean468 = true;
		} else if (arg1 == 15) {
			this.aBoolean471 = true;
		} else if (arg1 == 16) {
			this.aBoolean470 = true;
		} else if (arg1 == 17) {
			this.anInt5494 = arg0.method6538();
		} else if (arg1 == 18) {
			this.aBoolean469 = true;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!fd;)V")
	public void method4542(@OriginalArg(1) Class3_Sub7 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method6538();
			if (local13 == 0) {
				return;
			}
			this.method4541(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIBIILclient!ba;)Lclient!ba;")
	public Class21 method4546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class21 arg4) {
		@Pc(8) int local8 = this.anIntArray325[arg1];
		@Pc(13) int local13 = this.anIntArray326[arg1];
		@Pc(21) Class3_Sub4_Sub12 local21 = this.aClass157_1.method3737(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg4.method7131((byte) 1, arg3, true);
		}
		@Pc(35) Class3_Sub4_Sub12 local35 = null;
		if ((this.aBoolean471 || Static4.aBoolean20) && arg2 != -1 && arg2 < this.anIntArray326.length) {
			@Pc(58) int local58 = this.anIntArray326[arg2];
			local35 = this.aClass157_1.method3737(local58 >> 16);
			arg2 = local58 & 0xFFFF;
		}
		@Pc(77) Class3_Sub4_Sub12 local77 = null;
		@Pc(79) Class3_Sub4_Sub12 local79 = null;
		@Pc(81) int local81 = 0;
		@Pc(83) int local83 = 0;
		if (this.anIntArray324 != null) {
			if (this.anIntArray324.length > arg1) {
				local81 = this.anIntArray324[arg1];
				if (local81 != 65535) {
					local77 = this.aClass157_1.method3737(local81 >> 16);
					local81 &= 0xFFFF;
				}
			}
			if ((this.aBoolean471 || Static4.aBoolean20) && arg2 != -1 && this.anIntArray324.length > arg2) {
				local83 = this.anIntArray324[arg2];
				if (local83 != 65535) {
					local79 = this.aClass157_1.method3737(local83 >> 16);
					local83 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean468) {
			arg3 |= 0x200;
		}
		if (local21.method2964(local25)) {
			arg3 |= 0x80;
		}
		if (local21.method2966(local25)) {
			arg3 |= 0x100;
		}
		if (local21.method2965(local25)) {
			arg3 |= 0x400;
		}
		if (local77 != null) {
			if (local77.method2964(local81)) {
				arg3 |= 0x80;
			}
			if (local77.method2966(local81)) {
				arg3 |= 0x100;
			}
			if (local77.method2965(local81)) {
				arg3 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method2964(arg2)) {
				arg3 |= 0x80;
			}
			if (local35.method2966(arg2)) {
				arg3 |= 0x100;
			}
			if (local35.method2965(arg2)) {
				arg3 |= 0x400;
			}
		}
		if (local79 != null) {
			if (local79.method2964(local83)) {
				arg3 |= 0x80;
			}
			if (local79.method2966(local83)) {
				arg3 |= 0x100;
			}
			if (local79.method2965(local83)) {
				arg3 |= 0x400;
			}
		}
		arg3 |= 0x20;
		@Pc(279) Class21 local279 = arg4.method7131((byte) 1, arg3, true);
		local279.method7132(this.aBoolean468, local35, arg2, arg0 - 1, local25, 0, local21, local8);
		if (local77 != null) {
			local279.method7132(this.aBoolean468, local79, local83, arg0 - 1, local81, 0, local77, local8);
		}
		return local279;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IBZI)I")
	public int method4547(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(20) int local20 = this.anIntArray326[arg2];
		@Pc(22) Class3_Sub4_Sub12 local22 = null;
		@Pc(30) Class3_Sub4_Sub12 local30 = this.aClass157_1.method3737(local20 >> 16);
		@Pc(34) int local34 = local20 & 0xFFFF;
		if (local30 == null) {
			return 0;
		}
		if ((this.aBoolean471 || Static4.aBoolean20) && arg0 != -1 && arg0 < this.anIntArray326.length) {
			local7 = this.anIntArray326[arg0];
			local22 = this.aClass157_1.method3737(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean468) {
			local5 = 512;
		}
		if (local30.method2964(local34)) {
			local5 |= 0x80;
		}
		if (local30.method2966(local34)) {
			local5 |= 0x100;
		}
		if (local30.method2965(local34)) {
			local5 |= 0x400;
		}
		if (local22 != null) {
			if (local22.method2964(local7)) {
				local5 |= 0x80;
			}
			if (local22.method2966(local7)) {
				local5 |= 0x100;
			}
			if (local22.method2965(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray324 != null && arg1) {
			@Pc(147) int local147;
			@Pc(162) Class3_Sub4_Sub12 local162;
			if (arg2 < this.anIntArray324.length) {
				local147 = this.anIntArray324[arg2];
				if (local147 != 65535) {
					local162 = this.aClass157_1.method3737(local147 >> 16);
					local147 &= 0xFFFF;
					if (local162 != null) {
						if (local162.method2964(local147)) {
							local5 |= 0x80;
						}
						if (local162.method2966(local147)) {
							local5 |= 0x100;
						}
						if (local162.method2965(local147)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean471 || Static4.aBoolean20) && arg0 != -1 && this.anIntArray324.length > arg0) {
				local147 = this.anIntArray324[arg0];
				if (local147 != 65535) {
					local162 = this.aClass157_1.method3737(local147 >> 16);
					local147 &= 0xFFFF;
					if (local162 != null) {
						if (local162.method2964(local147)) {
							local5 |= 0x80;
						}
						if (local162.method2966(local147)) {
							local5 |= 0x100;
						}
						if (local162.method2965(local147)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BIIIILclient!ba;II)Lclient!ba;")
	public Class21 method4548(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class21 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray325[arg1];
		@Pc(13) int local13 = this.anIntArray326[arg1];
		@Pc(23) Class3_Sub4_Sub12 local23 = this.aClass157_1.method3737(local13 >> 16);
		@Pc(27) int local27 = local13 & 0xFFFF;
		if (local23 == null) {
			return arg4.method7131(arg0, arg2, true);
		}
		@Pc(37) Class3_Sub4_Sub12 local37 = null;
		if ((this.aBoolean471 || Static4.aBoolean20) && arg6 != -1 && this.anIntArray326.length > arg6) {
			@Pc(56) int local56 = this.anIntArray326[arg6];
			local37 = this.aClass157_1.method3737(local56 >> 16);
			arg6 = local56 & 0xFFFF;
		}
		if (this.aBoolean468) {
			arg2 |= 0x200;
		}
		if (local23.method2964(local27)) {
			arg2 |= 0x80;
		}
		if (local23.method2966(local27)) {
			arg2 |= 0x100;
		}
		if (local23.method2965(local27)) {
			arg2 |= 0x400;
		}
		if (local37 != null) {
			if (local37.method2964(arg6)) {
				arg2 |= 0x80;
			}
			if (local37.method2966(arg6)) {
				arg2 |= 0x100;
			}
			if (local37.method2965(arg6)) {
				arg2 |= 0x400;
			}
		}
		arg2 |= 0x20;
		@Pc(147) Class21 local147 = arg4.method7131(arg0, arg2, true);
		local147.method7132(this.aBoolean468, local37, arg6, arg5 - 1, local27, arg3, local23, local8);
		return local147;
	}
}
