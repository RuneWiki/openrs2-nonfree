import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class46 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
	public int anInt1223;

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "[Z")
	public boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "[I")
	private int[] anIntArray93;

	@OriginalMember(owner = "client!eg", name = "v", descriptor = "[I")
	public int[] anIntArray94;

	@OriginalMember(owner = "client!eg", name = "z", descriptor = "[I")
	public int[] anIntArray95;

	@OriginalMember(owner = "client!eg", name = "F", descriptor = "[[I")
	public int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
	public int anInt1224 = -1;

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "Z")
	public boolean aBoolean70 = false;

	@OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
	public int anInt1238 = 2;

	@OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
	public int anInt1237 = -1;

	@OriginalMember(owner = "client!eg", name = "x", descriptor = "Z")
	public boolean aBoolean71 = false;

	@OriginalMember(owner = "client!eg", name = "A", descriptor = "I")
	public int anInt1240 = -1;

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
	public int anInt1232 = -1;

	@OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
	public int anInt1239 = 99;

	@OriginalMember(owner = "client!eg", name = "y", descriptor = "Z")
	public boolean aBoolean72 = false;

	@OriginalMember(owner = "client!eg", name = "E", descriptor = "I")
	public int anInt1242 = -1;

	@OriginalMember(owner = "client!eg", name = "B", descriptor = "Z")
	public boolean aBoolean73 = false;

	@OriginalMember(owner = "client!eg", name = "G", descriptor = "I")
	public int anInt1243 = 5;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZIILclient!vg;II)Lclient!vg;")
	public Class53_Sub4 method1014(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class53_Sub4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = this.anIntArray94[arg1];
		@Pc(15) int local15 = this.anIntArray95[arg1];
		@Pc(21) Class4_Sub3_Sub19 local21 = Static253.method4021(local15 >> 16);
		@Pc(25) int local25 = local15 & 0xFFFF;
		if (local21 == null) {
			return arg2.method3868(true, true, true);
		}
		@Pc(35) Class4_Sub3_Sub19 local35 = null;
		@Pc(39) int local39 = arg3 & 0x3;
		if ((this.aBoolean70 || Static269.aBoolean258) && arg0 != -1 && this.anIntArray95.length > arg0) {
			@Pc(63) int local63 = this.anIntArray95[arg0];
			local35 = Static253.method4021(local63 >> 16);
			arg0 = local63 & 0xFFFF;
		}
		@Pc(124) Class53_Sub4 local124;
		if (local35 == null) {
			local124 = arg2.method3868(!local21.method4187(local25), !local21.method4188(local25), !this.aBoolean72);
		} else {
			local124 = arg2.method3868(!local21.method4187(local25) & !local35.method4187(arg0), !local21.method4188(local25) & !local35.method4188(arg0), !this.aBoolean72);
		}
		if (this.aBoolean72 && Static94.aBoolean138) {
			if (local39 == 1) {
				((Class53_Sub4_Sub2) local124).method3885();
			} else if (local39 == 2) {
				((Class53_Sub4_Sub2) local124).method3886();
			} else if (local39 == 3) {
				((Class53_Sub4_Sub2) local124).method3899();
			}
		} else if (local39 == 1) {
			local124.method3864();
		} else if (local39 == 2) {
			local124.method3865();
		} else if (local39 == 3) {
			local124.method3857();
		}
		local124.method3872(local21, local25, local35, arg0, arg4 - 1, local10, this.aBoolean72);
		if (this.aBoolean72 && Static94.aBoolean138) {
			if (local39 == 1) {
				((Class53_Sub4_Sub2) local124).method3899();
			} else if (local39 == 2) {
				((Class53_Sub4_Sub2) local124).method3886();
			} else if (local39 == 3) {
				((Class53_Sub4_Sub2) local124).method3885();
			}
		} else if (local39 == 1) {
			local124.method3857();
		} else if (local39 == 2) {
			local124.method3865();
		} else if (local39 == 3) {
			local124.method3864();
		}
		return local124;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!fd;Z)V")
	public void method1016(@OriginalArg(0) Class4_Sub10 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method4666();
			if (local14 == 0) {
				return;
			}
			this.method1020(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZIILclient!vg;I)Lclient!vg;")
	public Class53_Sub4 method1017(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class53_Sub4 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray94[arg3];
		@Pc(19) int local19 = this.anIntArray95[arg3];
		@Pc(25) Class4_Sub3_Sub19 local25 = Static253.method4021(local19 >> 16);
		@Pc(29) int local29 = local19 & 0xFFFF;
		if (local25 == null) {
			return arg2.method3868(true, true, true);
		}
		@Pc(39) Class4_Sub3_Sub19 local39 = null;
		if ((this.aBoolean70 || Static269.aBoolean258) && arg1 != -1 && arg1 < this.anIntArray95.length) {
			@Pc(61) int local61 = this.anIntArray95[arg1];
			local39 = Static253.method4021(local61 >> 16);
			arg1 = local61 & 0xFFFF;
		}
		@Pc(73) Class4_Sub3_Sub19 local73 = null;
		@Pc(75) int local75 = 0;
		@Pc(77) int local77 = 0;
		@Pc(79) Class4_Sub3_Sub19 local79 = null;
		if (this.anIntArray93 != null) {
			if (arg3 < this.anIntArray93.length) {
				local77 = this.anIntArray93[arg3];
				if (local77 != 65535) {
					local73 = Static253.method4021(local77 >> 16);
					local77 &= 0xFFFF;
				}
			}
			if ((this.aBoolean70 || Static269.aBoolean258) && arg1 != -1 && arg1 < this.anIntArray93.length) {
				local75 = this.anIntArray93[arg1];
				if (local75 != 65535) {
					local79 = Static253.method4021(local75 >> 16);
					local75 &= 0xFFFF;
				}
			}
		}
		@Pc(152) boolean local152 = !local25.method4187(local29);
		@Pc(161) boolean local161 = !local25.method4188(local29);
		if (local73 != null) {
			local152 &= !local73.method4187(local77);
			local161 &= !local73.method4188(local77);
		}
		if (local39 != null) {
			local152 &= !local39.method4187(arg1);
			local161 &= !local39.method4188(arg1);
		}
		if (local79 != null) {
			local152 &= !local79.method4187(local75);
			local161 &= !local79.method4188(local75);
		}
		@Pc(246) Class53_Sub4 local246 = arg2.method3868(local152, local161, !this.aBoolean72);
		local246.method3872(local25, local29, local39, arg1, arg0 - 1, local8, this.aBoolean72);
		if (local73 != null) {
			local246.method3872(local73, local77, local79, local75, arg0 - 1, local8, this.aBoolean72);
		}
		return local246;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIILclient!vg;I)Lclient!vg;")
	public Class53_Sub4 method1018(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class53_Sub4 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = this.anIntArray94[arg0];
		@Pc(21) int local21 = this.anIntArray95[arg0];
		@Pc(27) Class4_Sub3_Sub19 local27 = Static253.method4021(local21 >> 16);
		@Pc(31) int local31 = local21 & 0xFFFF;
		if (local27 == null) {
			return arg2.method3873(true, true, true);
		}
		@Pc(43) Class4_Sub3_Sub19 local43 = null;
		if ((this.aBoolean70 || Static269.aBoolean258) && arg3 != -1 && arg3 < this.anIntArray95.length) {
			@Pc(64) int local64 = this.anIntArray95[arg3];
			local43 = Static253.method4021(local64 >> 16);
			arg3 = local64 & 0xFFFF;
		}
		@Pc(102) Class53_Sub4 local102;
		if (local43 == null) {
			local102 = arg2.method3873(!local27.method4187(local31), !local27.method4188(local31), !this.aBoolean72);
		} else {
			local102 = arg2.method3873(!local27.method4187(local31) & !local43.method4187(arg3), !local27.method4188(local31) & !local43.method4188(arg3), !this.aBoolean72);
		}
		local102.method3872(local27, local31, local43, arg3, arg1 - 1, local8, this.aBoolean72);
		return local102;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!fd;II)V")
	private void method1020(@OriginalArg(0) Class4_Sub10 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8;
		@Pc(14) int local14;
		if (arg1 == 1) {
			local8 = arg0.method4653();
			this.anIntArray94 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray94[local14] = arg0.method4653();
			}
			this.anIntArray95 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray95[local14] = arg0.method4653();
			}
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray95[local14] = (arg0.method4653() << 16) + this.anIntArray95[local14];
			}
		} else if (arg1 == 2) {
			this.anInt1242 = arg0.method4653();
		} else if (arg1 == 3) {
			this.aBooleanArray6 = new boolean[256];
			local8 = arg0.method4666();
			for (local14 = 0; local14 < local8; local14++) {
				this.aBooleanArray6[arg0.method4666()] = true;
			}
		} else if (arg1 == 4) {
			this.aBoolean73 = true;
		} else if (arg1 == 5) {
			this.anInt1243 = arg0.method4666();
		} else if (arg1 == 6) {
			this.anInt1224 = arg0.method4653();
		} else if (arg1 == 7) {
			this.anInt1232 = arg0.method4653();
		} else if (arg1 == 8) {
			this.anInt1239 = arg0.method4666();
		} else if (arg1 == 9) {
			this.anInt1240 = arg0.method4666();
		} else if (arg1 == 10) {
			this.anInt1237 = arg0.method4666();
		} else if (arg1 == 11) {
			this.anInt1238 = arg0.method4666();
		} else if (arg1 == 12) {
			local8 = arg0.method4666();
			this.anIntArray93 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray93[local14] = arg0.method4653();
			}
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray93[local14] += arg0.method4653() << 16;
			}
		} else if (arg1 == 13) {
			local8 = arg0.method4653();
			this.anIntArrayArray11 = new int[local8][];
			for (local14 = 0; local14 < local8; local14++) {
				@Pc(198) int local198 = arg0.method4666();
				if (local198 > 0) {
					this.anIntArrayArray11[local14] = new int[local198];
					this.anIntArrayArray11[local14][0] = arg0.method4655();
					for (@Pc(221) int local221 = 1; local221 < local198; local221++) {
						this.anIntArrayArray11[local14][local221] = arg0.method4653();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean72 = true;
		} else if (arg1 == 15) {
			this.aBoolean70 = true;
		} else if (arg1 == 16) {
			this.aBoolean71 = true;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIILclient!vg;)Lclient!vg;")
	public Class53_Sub4 method1021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class53_Sub4 arg4) {
		@Pc(10) int local10 = this.anIntArray94[arg2];
		@Pc(15) int local15 = this.anIntArray95[arg2];
		@Pc(21) Class4_Sub3_Sub19 local21 = Static253.method4021(local15 >> 16);
		@Pc(25) int local25 = local15 & 0xFFFF;
		if (local21 == null) {
			return arg4.method3870(true, true, true);
		}
		@Pc(38) int local38 = arg3 & 0x3;
		@Pc(40) Class4_Sub3_Sub19 local40 = null;
		if ((this.aBoolean70 || Static269.aBoolean258) && arg0 != -1 && arg0 < this.anIntArray95.length) {
			@Pc(59) int local59 = this.anIntArray95[arg0];
			local40 = Static253.method4021(local59 >> 16);
			arg0 = local59 & 0xFFFF;
		}
		@Pc(116) Class53_Sub4 local116;
		if (local40 == null) {
			local116 = arg4.method3870(!local21.method4187(local25), !local21.method4188(local25), !this.aBoolean72);
		} else {
			local116 = arg4.method3870(!local21.method4187(local25) & !local40.method4187(arg0), !local21.method4188(local25) & !local40.method4188(arg0), !this.aBoolean72);
		}
		if (Static94.aBoolean138 && this.aBoolean72) {
			if (local38 == 1) {
				((Class53_Sub4_Sub2) local116).method3885();
			} else if (local38 == 2) {
				((Class53_Sub4_Sub2) local116).method3886();
			} else if (local38 == 3) {
				((Class53_Sub4_Sub2) local116).method3899();
			}
		} else if (local38 == 1) {
			local116.method3864();
		} else if (local38 == 2) {
			local116.method3865();
		} else if (local38 == 3) {
			local116.method3857();
		}
		local116.method3872(local21, local25, local40, arg0, arg1 - 1, local10, this.aBoolean72);
		if (Static94.aBoolean138 && this.aBoolean72) {
			if (local38 == 1) {
				((Class53_Sub4_Sub2) local116).method3899();
			} else if (local38 == 2) {
				((Class53_Sub4_Sub2) local116).method3886();
			} else if (local38 == 3) {
				((Class53_Sub4_Sub2) local116).method3885();
			}
		} else if (local38 == 1) {
			local116.method3857();
		} else if (local38 == 2) {
			local116.method3865();
		} else if (local38 == 3) {
			local116.method3864();
		}
		return local116;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
	public void method1022() {
		if (this.anInt1240 == -1) {
			if (this.aBooleanArray6 == null) {
				this.anInt1240 = 0;
			} else {
				this.anInt1240 = 2;
			}
		}
		if (this.anInt1237 != -1) {
			return;
		}
		if (this.aBooleanArray6 == null) {
			this.anInt1237 = 0;
		} else {
			this.anInt1237 = 2;
		}
	}
}
