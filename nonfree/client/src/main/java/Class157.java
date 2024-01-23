import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class157 {

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "[Z")
	public boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "[I")
	public int[] anIntArray395;

	@OriginalMember(owner = "client!ro", name = "m", descriptor = "[I")
	public int[] anIntArray396;

	@OriginalMember(owner = "client!ro", name = "s", descriptor = "[[I")
	public int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!ro", name = "t", descriptor = "I")
	public int anInt4523;

	@OriginalMember(owner = "client!ro", name = "A", descriptor = "[I")
	private int[] anIntArray397;

	@OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
	public int anInt4519 = 99;

	@OriginalMember(owner = "client!ro", name = "p", descriptor = "I")
	public int anInt4520 = -1;

	@OriginalMember(owner = "client!ro", name = "j", descriptor = "Z")
	public boolean aBoolean309 = false;

	@OriginalMember(owner = "client!ro", name = "u", descriptor = "Z")
	public boolean aBoolean311 = false;

	@OriginalMember(owner = "client!ro", name = "v", descriptor = "I")
	public int anInt4524 = 2;

	@OriginalMember(owner = "client!ro", name = "y", descriptor = "I")
	public int anInt4526 = -1;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
	public int anInt4512 = 5;

	@OriginalMember(owner = "client!ro", name = "F", descriptor = "I")
	public int anInt4530 = -1;

	@OriginalMember(owner = "client!ro", name = "w", descriptor = "Z")
	public boolean aBoolean312 = false;

	@OriginalMember(owner = "client!ro", name = "i", descriptor = "Z")
	public boolean aBoolean308 = false;

	@OriginalMember(owner = "client!ro", name = "E", descriptor = "I")
	public int anInt4529 = -1;

	@OriginalMember(owner = "client!ro", name = "D", descriptor = "I")
	public int anInt4528 = -1;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZILclient!bf;I)Lclient!bf;")
	public Class15_Sub2 method3937(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class15_Sub2 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray395[arg1];
		@Pc(13) int local13 = this.anIntArray396[arg1];
		@Pc(19) Class1_Sub2_Sub22 local19 = Static48.method901(local13 >> 16);
		@Pc(28) int local28 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg2.method1030(true, true, true);
		}
		@Pc(39) Class1_Sub2_Sub22 local39 = null;
		@Pc(41) int local41 = 0;
		@Pc(43) Class1_Sub2_Sub22 local43 = null;
		@Pc(45) int local45 = 0;
		@Pc(47) Class1_Sub2_Sub22 local47 = null;
		if ((this.aBoolean309 || Static269.aBoolean159) && arg3 != -1 && arg3 < this.anIntArray396.length) {
			@Pc(70) int local70 = this.anIntArray396[arg3];
			local47 = Static48.method901(local70 >> 16);
			arg3 = local70 & 0xFFFF;
		}
		if (this.anIntArray397 != null) {
			if (arg1 < this.anIntArray397.length) {
				local41 = this.anIntArray397[arg1];
				if (local41 != 65535) {
					local39 = Static48.method901(local41 >> 16);
					local41 &= 0xFFFF;
				}
			}
			if ((this.aBoolean309 || Static269.aBoolean159) && arg3 != -1 && arg3 < this.anIntArray397.length) {
				local45 = this.anIntArray397[arg3];
				if (local45 != 65535) {
					local43 = Static48.method901(local45 >> 16);
					local45 &= 0xFFFF;
				}
			}
		}
		@Pc(153) boolean local153 = !local19.method4391(local28);
		@Pc(162) boolean local162 = !local19.method4388(local28);
		if (local39 != null) {
			local153 &= !local39.method4391(local41);
			local162 &= !local39.method4388(local41);
		}
		if (local47 != null) {
			local153 &= !local47.method4391(arg3);
			local162 &= !local47.method4388(arg3);
		}
		if (local43 != null) {
			local153 &= !local43.method4391(local45);
			local162 &= !local43.method4388(local45);
		}
		@Pc(250) Class15_Sub2 local250 = arg2.method1030(local153, local162, !this.aBoolean308);
		local250.method1022(local19, local28, local47, arg3, arg0 - 1, local8, this.aBoolean308);
		if (local39 != null) {
			local250.method1022(local39, local41, local43, local45, arg0 - 1, local8, this.aBoolean308);
		}
		return local250;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!lf;Z)V")
	public void method3939(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(8) int local8 = arg0.method1378();
			if (local8 == 0) {
				return;
			}
			this.method3944(arg0, local8);
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V")
	public void method3940() {
		if (this.anInt4529 == -1) {
			if (this.aBooleanArray20 == null) {
				this.anInt4529 = 0;
			} else {
				this.anInt4529 = 2;
			}
		}
		if (this.anInt4528 != -1) {
			return;
		}
		if (this.aBooleanArray20 == null) {
			this.anInt4528 = 0;
		} else {
			this.anInt4528 = 2;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BLclient!bf;IIII)Lclient!bf;")
	public Class15_Sub2 method3941(@OriginalArg(1) Class15_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(22) int local22 = this.anIntArray395[arg1];
		@Pc(27) int local27 = this.anIntArray396[arg1];
		@Pc(33) Class1_Sub2_Sub22 local33 = Static48.method901(local27 >> 16);
		@Pc(37) int local37 = local27 & 0xFFFF;
		if (local33 == null) {
			return arg0.method1020(true, true, true);
		}
		@Pc(49) int local49 = arg3 & 0x3;
		@Pc(51) Class1_Sub2_Sub22 local51 = null;
		if ((this.aBoolean309 || Static269.aBoolean159) && arg2 != -1 && arg2 < this.anIntArray396.length) {
			@Pc(74) int local74 = this.anIntArray396[arg2];
			local51 = Static48.method901(local74 >> 16);
			arg2 = local74 & 0xFFFF;
		}
		@Pc(130) Class15_Sub2 local130;
		if (local51 == null) {
			local130 = arg0.method1020(!local33.method4391(local37), !local33.method4388(local37), !this.aBoolean308);
		} else {
			local130 = arg0.method1020(!local33.method4391(local37) & !local51.method4391(arg2), !local33.method4388(local37) & !local51.method4388(arg2), !this.aBoolean308);
		}
		if (Static156.aBoolean211 && this.aBoolean308) {
			if (local49 == 1) {
				((Class15_Sub2_Sub1) local130).method862();
			} else if (local49 == 2) {
				((Class15_Sub2_Sub1) local130).method872();
			} else if (local49 == 3) {
				((Class15_Sub2_Sub1) local130).method876();
			}
		} else if (local49 == 1) {
			local130.method1025();
		} else if (local49 == 2) {
			local130.method1045();
		} else if (local49 == 3) {
			local130.method1042();
		}
		local130.method1022(local33, local37, local51, arg2, arg4 - 1, local22, this.aBoolean308);
		if (Static156.aBoolean211 && this.aBoolean308) {
			if (local49 == 1) {
				((Class15_Sub2_Sub1) local130).method876();
			} else if (local49 == 2) {
				((Class15_Sub2_Sub1) local130).method872();
			} else if (local49 == 3) {
				((Class15_Sub2_Sub1) local130).method862();
			}
		} else if (local49 == 1) {
			local130.method1042();
		} else if (local49 == 2) {
			local130.method1045();
		} else if (local49 == 3) {
			local130.method1025();
		}
		return local130;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZIILclient!bf;I)Lclient!bf;")
	public Class15_Sub2 method3942(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class15_Sub2 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray395[arg1];
		@Pc(13) int local13 = this.anIntArray396[arg1];
		@Pc(19) Class1_Sub2_Sub22 local19 = Static48.method901(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg2.method1032(true, true, true);
		}
		@Pc(35) Class1_Sub2_Sub22 local35 = null;
		if ((this.aBoolean309 || Static269.aBoolean159) && arg3 != -1 && arg3 < this.anIntArray396.length) {
			@Pc(53) int local53 = this.anIntArray396[arg3];
			local35 = Static48.method901(local53 >> 16);
			arg3 = local53 & 0xFFFF;
		}
		@Pc(108) Class15_Sub2 local108;
		if (local35 == null) {
			local108 = arg2.method1032(!local19.method4391(local23), !local19.method4388(local23), !this.aBoolean308);
		} else {
			local108 = arg2.method1032(!local19.method4391(local23) & !local35.method4391(arg3), !local19.method4388(local23) & !local35.method4388(arg3), !this.aBoolean308);
		}
		local108.method1022(local19, local23, local35, arg3, arg0 - 1, local8, this.aBoolean308);
		return local108;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIBILclient!bf;I)Lclient!bf;")
	public Class15_Sub2 method3943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class15_Sub2 arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = this.anIntArray395[arg4];
		@Pc(15) int local15 = this.anIntArray396[arg4];
		@Pc(21) Class1_Sub2_Sub22 local21 = Static48.method901(local15 >> 16);
		@Pc(25) int local25 = local15 & 0xFFFF;
		if (local21 == null) {
			return arg3.method1030(true, true, true);
		}
		@Pc(38) int local38 = arg1 & 0x3;
		@Pc(40) Class1_Sub2_Sub22 local40 = null;
		if ((this.aBoolean309 || Static269.aBoolean159) && arg0 != -1 && arg0 < this.anIntArray396.length) {
			@Pc(62) int local62 = this.anIntArray396[arg0];
			local40 = Static48.method901(local62 >> 16);
			arg0 = local62 & 0xFFFF;
		}
		@Pc(99) Class15_Sub2 local99;
		if (local40 == null) {
			local99 = arg3.method1030(!local21.method4391(local25), !local21.method4388(local25), !this.aBoolean308);
		} else {
			local99 = arg3.method1030(!local21.method4391(local25) & !local40.method4391(arg0), !local21.method4388(local25) & !local40.method4388(arg0), !this.aBoolean308);
		}
		if (this.aBoolean308 && Static156.aBoolean211) {
			if (local38 == 1) {
				((Class15_Sub2_Sub1) local99).method862();
			} else if (local38 == 2) {
				((Class15_Sub2_Sub1) local99).method872();
			} else if (local38 == 3) {
				((Class15_Sub2_Sub1) local99).method876();
			}
		} else if (local38 == 1) {
			local99.method1025();
		} else if (local38 == 2) {
			local99.method1045();
		} else if (local38 == 3) {
			local99.method1042();
		}
		local99.method1022(local21, local25, local40, arg0, arg2 - 1, local10, this.aBoolean308);
		if (this.aBoolean308 && Static156.aBoolean211) {
			if (local38 == 1) {
				((Class15_Sub2_Sub1) local99).method876();
			} else if (local38 == 2) {
				((Class15_Sub2_Sub1) local99).method872();
			} else if (local38 == 3) {
				((Class15_Sub2_Sub1) local99).method862();
			}
		} else if (local38 == 1) {
			local99.method1042();
		} else if (local38 == 2) {
			local99.method1045();
		} else if (local38 == 3) {
			local99.method1025();
		}
		return local99;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZLclient!lf;I)V")
	private void method3944(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (arg1 == 1) {
			local18 = arg0.method1386();
			this.anIntArray395 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray395[local24] = arg0.method1386();
			}
			this.anIntArray396 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray396[local24] = arg0.method1386();
			}
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray396[local24] += arg0.method1386() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt4530 = arg0.method1386();
		} else if (arg1 == 3) {
			this.aBooleanArray20 = new boolean[256];
			local18 = arg0.method1378();
			for (local24 = 0; local24 < local18; local24++) {
				this.aBooleanArray20[arg0.method1378()] = true;
			}
		} else if (arg1 == 4) {
			this.aBoolean311 = true;
		} else if (arg1 == 5) {
			this.anInt4512 = arg0.method1378();
		} else if (arg1 == 6) {
			this.anInt4526 = arg0.method1386();
		} else if (arg1 == 7) {
			this.anInt4520 = arg0.method1386();
		} else if (arg1 == 8) {
			this.anInt4519 = arg0.method1378();
		} else if (arg1 == 9) {
			this.anInt4528 = arg0.method1378();
		} else if (arg1 == 10) {
			this.anInt4529 = arg0.method1378();
		} else if (arg1 == 11) {
			this.anInt4524 = arg0.method1378();
		} else if (arg1 == 12) {
			local18 = arg0.method1378();
			this.anIntArray397 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray397[local24] = arg0.method1386();
			}
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray397[local24] = (arg0.method1386() << 16) + this.anIntArray397[local24];
			}
		} else if (arg1 == 13) {
			local18 = arg0.method1386();
			this.anIntArrayArray37 = new int[local18][];
			for (local24 = 0; local24 < local18; local24++) {
				@Pc(216) int local216 = arg0.method1378();
				if (local216 > 0) {
					this.anIntArrayArray37[local24] = new int[local216];
					this.anIntArrayArray37[local24][0] = arg0.method1352();
					for (@Pc(235) int local235 = 1; local235 < local216; local235++) {
						this.anIntArrayArray37[local24][local235] = arg0.method1386();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean308 = true;
		} else if (arg1 == 15) {
			this.aBoolean309 = true;
		} else if (arg1 == 16) {
			this.aBoolean312 = true;
		}
	}
}
