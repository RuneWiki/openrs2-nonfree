import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class133 {

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "[I")
	private int[] anIntArray459;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
	public int anInt4020;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "[I")
	public int[] anIntArray460;

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "[Z")
	public boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!pi", name = "q", descriptor = "[I")
	public int[] anIntArray461;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
	public int anInt4013 = 5;

	@OriginalMember(owner = "client!pi", name = "t", descriptor = "Z")
	public boolean aBoolean302 = false;

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
	public int anInt4019 = -1;

	@OriginalMember(owner = "client!pi", name = "r", descriptor = "Z")
	public boolean aBoolean301 = false;

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
	public int anInt4022 = 99;

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
	public int anInt4021 = 2;

	@OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
	public int anInt4026 = -1;

	@OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
	public int anInt4024 = -1;

	@OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
	public int anInt4030 = -1;

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "Z")
	public boolean aBoolean300 = false;

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
	public int anInt4016 = -1;

	@OriginalMember(owner = "client!pi", name = "u", descriptor = "Z")
	public boolean aBoolean303 = false;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!jj;II)V")
	private void method3158(@OriginalArg(0) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		@Pc(31) int local31;
		@Pc(33) int local33;
		if (arg1 == 1) {
			local31 = arg0.method3107();
			this.anIntArray460 = new int[local31];
			for (local33 = 0; local33 < local31; local33++) {
				this.anIntArray460[local33] = arg0.method3107();
			}
			this.anIntArray461 = new int[local31];
			for (local33 = 0; local33 < local31; local33++) {
				this.anIntArray461[local33] = arg0.method3107();
			}
			for (local33 = 0; local33 < local31; local33++) {
				this.anIntArray461[local33] = (arg0.method3107() << 16) + this.anIntArray461[local33];
			}
		} else if (arg1 == 2) {
			this.anInt4026 = arg0.method3107();
		} else if (arg1 == 3) {
			this.aBooleanArray19 = new boolean[256];
			local31 = arg0.method3122();
			for (local33 = 0; local33 < local31; local33++) {
				this.aBooleanArray19[arg0.method3122()] = true;
			}
		} else if (arg1 == 4) {
			this.aBoolean301 = true;
		} else if (arg1 == 5) {
			this.anInt4013 = arg0.method3122();
		} else if (arg1 == 6) {
			this.anInt4024 = arg0.method3107();
		} else if (arg1 == 7) {
			this.anInt4016 = arg0.method3107();
		} else if (arg1 == 8) {
			this.anInt4022 = arg0.method3122();
		} else if (arg1 == 9) {
			this.anInt4030 = arg0.method3122();
		} else if (arg1 == 10) {
			this.anInt4019 = arg0.method3122();
		} else if (arg1 == 11) {
			this.anInt4021 = arg0.method3122();
		} else if (arg1 == 12) {
			local31 = arg0.method3122();
			this.anIntArray459 = new int[local31];
			for (local33 = 0; local33 < local31; local33++) {
				this.anIntArray459[local33] = arg0.method3107();
			}
			for (local33 = 0; local33 < local31; local33++) {
				this.anIntArray459[local33] += arg0.method3107() << 16;
			}
		} else if (arg1 == 13) {
			local31 = arg0.method3107();
			this.anIntArrayArray31 = new int[local31][];
			for (local33 = 0; local33 < local31; local33++) {
				@Pc(158) int local158 = arg0.method3122();
				if (local158 > 0) {
					this.anIntArrayArray31[local33] = new int[local158];
					this.anIntArrayArray31[local33][0] = arg0.method3109();
					for (@Pc(181) int local181 = 1; local181 < local158; local181++) {
						this.anIntArrayArray31[local33][local181] = arg0.method3107();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean303 = true;
		} else if (arg1 == 15) {
			this.aBoolean300 = true;
		} else if (arg1 == 16) {
			this.aBoolean302 = true;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZIIIILclient!ei;)Lclient!ei;")
	public Class6_Sub2 method3160(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class6_Sub2 arg4) {
		@Pc(10) int local10 = this.anIntArray460[arg2];
		@Pc(15) int local15 = this.anIntArray461[arg2];
		@Pc(21) Class1_Sub2_Sub4 local21 = Static261.method4028(local15 >> 16);
		@Pc(25) int local25 = local15 & 0xFFFF;
		if (local21 == null) {
			return arg4.method2077(true, true, true);
		}
		@Pc(37) int local37 = arg1 & 0x3;
		@Pc(45) Class1_Sub2_Sub4 local45 = null;
		if ((this.aBoolean300 || Static24.aBoolean44) && arg3 != -1 && this.anIntArray461.length > arg3) {
			@Pc(64) int local64 = this.anIntArray461[arg3];
			local45 = Static261.method4028(local64 >> 16);
			arg3 = local64 & 0xFFFF;
		}
		@Pc(119) Class6_Sub2 local119;
		if (local45 == null) {
			local119 = arg4.method2077(!local21.method457(local25), !local21.method461(local25), !this.aBoolean303);
		} else {
			local119 = arg4.method2077(!local21.method457(local25) & !local45.method457(arg3), !local21.method461(local25) & !local45.method461(arg3), !this.aBoolean303);
		}
		if (Static240.aBoolean369 && this.aBoolean303) {
			if (local37 == 1) {
				((Class6_Sub2_Sub2) local119).method2100();
			} else if (local37 == 2) {
				((Class6_Sub2_Sub2) local119).method2106();
			} else if (local37 == 3) {
				((Class6_Sub2_Sub2) local119).method2123();
			}
		} else if (local37 == 1) {
			local119.method2069();
		} else if (local37 == 2) {
			local119.method2089();
		} else if (local37 == 3) {
			local119.method2071();
		}
		local119.method2087(local21, local25, local45, arg3, arg0 - 1, local10, this.aBoolean303);
		if (Static240.aBoolean369 && this.aBoolean303) {
			if (local37 == 1) {
				((Class6_Sub2_Sub2) local119).method2123();
			} else if (local37 == 2) {
				((Class6_Sub2_Sub2) local119).method2106();
			} else if (local37 == 3) {
				((Class6_Sub2_Sub2) local119).method2100();
			}
		} else if (local37 == 1) {
			local119.method2071();
		} else if (local37 == 2) {
			local119.method2089();
		} else if (local37 == 3) {
			local119.method2069();
		}
		return local119;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
	public void method3161() {
		if (this.anInt4019 == -1) {
			if (this.aBooleanArray19 == null) {
				this.anInt4019 = 0;
			} else {
				this.anInt4019 = 2;
			}
		}
		if (this.anInt4030 != -1) {
			return;
		}
		if (this.aBooleanArray19 == null) {
			this.anInt4030 = 0;
		} else {
			this.anInt4030 = 2;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!ei;III)Lclient!ei;")
	public Class6_Sub2 method3163(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(4) int local4 = this.anIntArray460[arg2];
		@Pc(18) int local18 = this.anIntArray461[arg2];
		@Pc(24) Class1_Sub2_Sub4 local24 = Static261.method4028(local18 >> 16);
		@Pc(28) int local28 = local18 & 0xFFFF;
		if (local24 == null) {
			return arg1.method2094(true, true, true);
		}
		@Pc(39) Class1_Sub2_Sub4 local39 = null;
		if ((this.aBoolean300 || Static24.aBoolean44) && arg3 != -1 && this.anIntArray461.length > arg3) {
			@Pc(60) int local60 = this.anIntArray461[arg3];
			local39 = Static261.method4028(local60 >> 16);
			arg3 = local60 & 0xFFFF;
		}
		@Pc(117) Class6_Sub2 local117;
		if (local39 == null) {
			local117 = arg1.method2094(!local24.method457(local28), !local24.method461(local28), !this.aBoolean303);
		} else {
			local117 = arg1.method2094(!local24.method457(local28) & !local39.method457(arg3), !local24.method461(local28) & !local39.method461(arg3), !this.aBoolean303);
		}
		local117.method2087(local24, local28, local39, arg3, arg0 - 1, local4, this.aBoolean303);
		return local117;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILclient!ei;II)Lclient!ei;")
	public Class6_Sub2 method3164(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray460[arg0];
		@Pc(13) int local13 = this.anIntArray461[arg0];
		@Pc(19) Class1_Sub2_Sub4 local19 = Static261.method4028(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg1.method2068(true, true, true);
		}
		@Pc(35) Class1_Sub2_Sub4 local35 = null;
		@Pc(37) Class1_Sub2_Sub4 local37 = null;
		@Pc(39) int local39 = 0;
		@Pc(41) Class1_Sub2_Sub4 local41 = null;
		@Pc(43) int local43 = 0;
		if ((this.aBoolean300 || Static24.aBoolean44) && arg2 != -1 && this.anIntArray461.length > arg2) {
			@Pc(65) int local65 = this.anIntArray461[arg2];
			local41 = Static261.method4028(local65 >> 16);
			arg2 = local65 & 0xFFFF;
		}
		if (this.anIntArray459 != null) {
			if (arg0 < this.anIntArray459.length) {
				local43 = this.anIntArray459[arg0];
				if (local43 != 65535) {
					local35 = Static261.method4028(local43 >> 16);
					local43 &= 0xFFFF;
				}
			}
			if ((this.aBoolean300 || Static24.aBoolean44) && arg2 != -1 && this.anIntArray459.length > arg2) {
				local39 = this.anIntArray459[arg2];
				if (local39 != 65535) {
					local37 = Static261.method4028(local39 >> 16);
					local39 &= 0xFFFF;
				}
			}
		}
		@Pc(145) boolean local145 = !local19.method457(local23);
		@Pc(156) boolean local156 = !local19.method461(local23);
		if (local35 != null) {
			local145 &= !local35.method457(local43);
			local156 &= !local35.method461(local43);
		}
		if (local41 != null) {
			local145 &= !local41.method457(arg2);
			local156 &= !local41.method461(arg2);
		}
		if (local37 != null) {
			local145 &= !local37.method457(local39);
			local156 &= !local37.method461(local39);
		}
		@Pc(240) Class6_Sub2 local240 = arg1.method2068(local145, local156, !this.aBoolean303);
		local240.method2087(local19, local23, local41, arg2, arg3 - 1, local8, this.aBoolean303);
		if (local35 != null) {
			local240.method2087(local35, local43, local37, local39, arg3 - 1, local8, this.aBoolean303);
		}
		return local240;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILclient!ei;ZII)Lclient!ei;")
	public Class6_Sub2 method3165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = this.anIntArray460[arg0];
		@Pc(15) int local15 = this.anIntArray461[arg0];
		@Pc(21) Class1_Sub2_Sub4 local21 = Static261.method4028(local15 >> 16);
		@Pc(25) int local25 = local15 & 0xFFFF;
		if (local21 == null) {
			return arg2.method2068(true, true, true);
		}
		@Pc(39) int local39 = arg4 & 0x3;
		@Pc(41) Class1_Sub2_Sub4 local41 = null;
		if ((this.aBoolean300 || Static24.aBoolean44) && arg1 != -1 && this.anIntArray461.length > arg1) {
			@Pc(66) int local66 = this.anIntArray461[arg1];
			local41 = Static261.method4028(local66 >> 16);
			arg1 = local66 & 0xFFFF;
		}
		@Pc(103) Class6_Sub2 local103;
		if (local41 == null) {
			local103 = arg2.method2068(!local21.method457(local25), !local21.method461(local25), !this.aBoolean303);
		} else {
			local103 = arg2.method2068(!local21.method457(local25) & !local41.method457(arg1), !local21.method461(local25) & !local41.method461(arg1), !this.aBoolean303);
		}
		if (this.aBoolean303 && Static240.aBoolean369) {
			if (local39 == 1) {
				((Class6_Sub2_Sub2) local103).method2100();
			} else if (local39 == 2) {
				((Class6_Sub2_Sub2) local103).method2106();
			} else if (local39 == 3) {
				((Class6_Sub2_Sub2) local103).method2123();
			}
		} else if (local39 == 1) {
			local103.method2069();
		} else if (local39 == 2) {
			local103.method2089();
		} else if (local39 == 3) {
			local103.method2071();
		}
		local103.method2087(local21, local25, local41, arg1, arg3 - 1, local10, this.aBoolean303);
		if (this.aBoolean303 && Static240.aBoolean369) {
			if (local39 == 1) {
				((Class6_Sub2_Sub2) local103).method2123();
			} else if (local39 == 2) {
				((Class6_Sub2_Sub2) local103).method2106();
			} else if (local39 == 3) {
				((Class6_Sub2_Sub2) local103).method2100();
			}
		} else if (local39 == 1) {
			local103.method2071();
		} else if (local39 == 2) {
			local103.method2089();
		} else if (local39 == 3) {
			local103.method2069();
		}
		return local103;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!jj;B)V")
	public void method3166(@OriginalArg(0) Class1_Sub18 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3122();
			if (local9 == 0) {
				return;
			}
			this.method3158(arg0, local9);
		}
	}
}
