import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class75 {

	@OriginalMember(owner = "client!u", name = "a", descriptor = "J")
	private long aLong164;

	@OriginalMember(owner = "client!u", name = "e", descriptor = "J")
	private long aLong165;

	@OriginalMember(owner = "client!u", name = "g", descriptor = "I")
	private int anInt2656;

	@OriginalMember(owner = "client!u", name = "i", descriptor = "[I")
	private int[] anIntArray448;

	@OriginalMember(owner = "client!u", name = "v", descriptor = "[I")
	private int[] anIntArray449;

	@OriginalMember(owner = "client!u", name = "C", descriptor = "Z")
	public boolean aBoolean119;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I[IZI[I)V")
	public void method1846(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int[] arg3) {
		if (arg3 == null) {
			arg3 = new int[12];
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static16.anInt444; local16++) {
					@Pc(22) Class1_Sub2_Sub18 local22 = Static55.method1028(local16);
					if (local22 != null && !local22.aBoolean117 && (arg2 ? 7 : 0) + local12 == local22.anInt2619) {
						arg3[Static21.anIntArray138[local12]] = local16 + 256;
						break;
					}
				}
			}
		}
		this.anIntArray449 = arg3;
		this.anIntArray448 = arg1;
		this.aBoolean119 = arg2;
		this.anInt2656 = arg0;
		this.method1850();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZII)V")
	public void method1847(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anIntArray448[arg1];
		if (arg0) {
			local4++;
			if (local4 >= Static28.aShortArrayArray1[arg1].length) {
				local4 = 0;
			}
		} else {
			local4--;
			if (local4 < 0) {
				local4 = Static28.aShortArrayArray1[arg1].length - 1;
			}
		}
		this.anIntArray448[arg1] = local4;
		this.method1850();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!qe;ILclient!qe;II)Lclient!da;")
	public Class1_Sub2_Sub3_Sub2 method1848(@OriginalArg(0) Class1_Sub2_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub17 arg2, @OriginalArg(3) int arg3) {
		if (this.anInt2656 != -1) {
			return Static129.method2045(this.anInt2656).method1400(arg2, arg0, arg1, arg3);
		}
		@Pc(24) long local24 = this.aLong165;
		@Pc(27) int[] local27 = this.anIntArray449;
		if (arg2 != null && (arg2.anInt2355 >= 0 || arg2.anInt2337 >= 0)) {
			local27 = new int[12];
			for (@Pc(43) int local43 = 0; local43 < 12; local43++) {
				local27[local43] = this.anIntArray449[local43];
			}
			if (arg2.anInt2355 >= 0) {
				local24 += arg2.anInt2355 - this.anIntArray449[5] << 8;
				local27[5] = arg2.anInt2355;
			}
			if (arg2.anInt2337 >= 0) {
				local24 += arg2.anInt2337 - this.anIntArray449[3] << 16;
				local27[3] = arg2.anInt2337;
			}
		}
		@Pc(106) Class1_Sub2_Sub3_Sub2 local106 = (Class1_Sub2_Sub3_Sub2) Static22.aClass63_4.method1517(local24);
		if (local106 == null) {
			@Pc(110) boolean local110 = false;
			for (@Pc(112) int local112 = 0; local112 < 12; local112++) {
				@Pc(118) int local118 = local27[local112];
				if (local118 >= 256 && local118 < 512 && !Static55.method1028(local118 - 256).method1805()) {
					local110 = true;
				}
				if (local118 >= 512 && !Static33.method736(local118 - 512).method1581(this.aBoolean119)) {
					local110 = true;
				}
			}
			if (local110) {
				if (this.aLong164 != -1L) {
					local106 = (Class1_Sub2_Sub3_Sub2) Static22.aClass63_4.method1517(this.aLong164);
				}
				if (local106 == null) {
					return null;
				}
			}
			if (local106 == null) {
				@Pc(180) Class1_Sub2_Sub3_Sub7[] local180 = new Class1_Sub2_Sub3_Sub7[12];
				@Pc(182) int local182 = 0;
				for (@Pc(184) int local184 = 0; local184 < 12; local184++) {
					@Pc(190) int local190 = local27[local184];
					@Pc(206) Class1_Sub2_Sub3_Sub7 local206;
					if (local190 >= 256 && local190 < 512) {
						local206 = Static55.method1028(local190 - 256).method1806();
						if (local206 != null) {
							local180[local182++] = local206;
						}
					}
					if (local190 >= 512) {
						local206 = Static33.method736(local190 - 512).method1584(this.aBoolean119);
						if (local206 != null) {
							local180[local182++] = local206;
						}
					}
				}
				@Pc(243) Class1_Sub2_Sub3_Sub7 local243 = new Class1_Sub2_Sub3_Sub7(local180, local182);
				for (@Pc(245) int local245 = 0; local245 < 5; local245++) {
					if (this.anIntArray448[local245] != 0) {
						local243.method1888(Static28.aShortArrayArray1[local245][0], Static28.aShortArrayArray1[local245][this.anIntArray448[local245]]);
						if (local245 == 1) {
							local243.method1888(Static65.aShortArray4[0], Static65.aShortArray4[this.anIntArray448[local245]]);
						}
					}
				}
				local106 = local243.method1893(64, 850, -30, -50, -30);
				Static22.aClass63_4.method1520(local106, local24);
				this.aLong164 = local24;
			}
		}
		if (arg2 == null && arg0 == null) {
			return local106;
		}
		@Pc(324) Class1_Sub2_Sub3_Sub2 local324;
		if (arg2 != null && arg0 != null) {
			local324 = arg2.method1672(local106, arg0, arg3, arg1);
		} else if (arg2 == null) {
			local324 = arg0.method1675(arg3, local106);
		} else {
			local324 = arg2.method1675(arg1, local106);
		}
		return local324;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
	private void method1850() {
		@Pc(14) long local14 = this.aLong165;
		this.aLong165 = 0L;
		@Pc(22) int local22 = this.anIntArray449[5];
		@Pc(27) int local27 = this.anIntArray449[9];
		this.anIntArray449[5] = local27;
		this.anIntArray449[9] = local22;
		for (@Pc(39) int local39 = 0; local39 < 12; local39++) {
			this.aLong165 <<= 0x4;
			if (this.anIntArray449[local39] >= 256) {
				this.aLong165 += this.anIntArray449[local39] - 256;
			}
		}
		if (this.anIntArray449[0] >= 256) {
			this.aLong165 += this.anIntArray449[0] - 256 >> 4;
		}
		if (this.anIntArray449[1] >= 256) {
			this.aLong165 += this.anIntArray449[1] - 256 >> 8;
		}
		for (@Pc(115) int local115 = 0; local115 < 5; local115++) {
			this.aLong165 <<= 0x3;
			this.aLong165 += this.anIntArray448[local115];
		}
		this.anIntArray449[5] = local22;
		this.aLong165 <<= 0x1;
		this.anIntArray449[9] = local27;
		this.aLong165 += this.aBoolean119 ? 1 : 0;
		if (local14 != 0L && local14 != this.aLong165) {
			Static22.aClass63_4.method1521(local14);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!dc;)V")
	public void method1851(@OriginalArg(1) Class1_Sub5 arg0) {
		arg0.method676(this.aBoolean119 ? 1 : 0);
		@Pc(30) int local30;
		for (@Pc(21) int local21 = 0; local21 < 7; local21++) {
			local30 = this.anIntArray449[Static21.anIntArray138[local21]];
			if (local30 == 0) {
				arg0.method676(-1);
			} else {
				arg0.method676(local30 - 256);
			}
		}
		for (local30 = 0; local30 < 5; local30++) {
			arg0.method676(this.anIntArray448[local30]);
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(B)I")
	public int method1853() {
		return this.anInt2656 == -1 ? (this.anIntArray449[11] << 5) + (this.anIntArray448[0] << 25) + (this.anIntArray448[4] << 20) + (this.anIntArray449[0] << 15) + (this.anIntArray449[8] << 10) + this.anIntArray449[1] : Static129.method2045(this.anInt2656).anInt1839 + 305419896;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)Lclient!ub;")
	public Class1_Sub2_Sub3_Sub7 method1854() {
		if (this.anInt2656 != -1) {
			return Static129.method2045(this.anInt2656).method1407();
		}
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < 12; local21++) {
			@Pc(28) int local28 = this.anIntArray449[local21];
			if (local28 >= 256 && local28 < 512 && !Static55.method1028(local28 - 256).method1811()) {
				local19 = true;
			}
			if (local28 >= 512 && !Static33.method736(local28 - 512).method1577(this.aBoolean119)) {
				local19 = true;
			}
		}
		if (local19) {
			return null;
		}
		@Pc(72) Class1_Sub2_Sub3_Sub7[] local72 = new Class1_Sub2_Sub3_Sub7[12];
		@Pc(81) int local81 = 0;
		for (@Pc(83) int local83 = 0; local83 < 12; local83++) {
			@Pc(90) int local90 = this.anIntArray449[local83];
			@Pc(106) Class1_Sub2_Sub3_Sub7 local106;
			if (local90 >= 256 && local90 < 512) {
				local106 = Static55.method1028(local90 - 256).method1808();
				if (local106 != null) {
					local72[local81++] = local106;
				}
			}
			if (local90 >= 512) {
				local106 = Static33.method736(local90 - 512).method1595(this.aBoolean119);
				if (local106 != null) {
					local72[local81++] = local106;
				}
			}
		}
		@Pc(143) Class1_Sub2_Sub3_Sub7 local143 = new Class1_Sub2_Sub3_Sub7(local72, local81);
		for (@Pc(145) int local145 = 0; local145 < 5; local145++) {
			if (this.anIntArray448[local145] != 0) {
				local143.method1888(Static28.aShortArrayArray1[local145][0], Static28.aShortArrayArray1[local145][this.anIntArray448[local145]]);
				if (local145 == 1) {
					local143.method1888(Static65.aShortArray4[0], Static65.aShortArray4[this.anIntArray448[local145]]);
				}
			}
		}
		return local143;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZZ)V")
	public void method1855(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean119 != arg0) {
			this.method1846(-1, this.anIntArray448, arg0, null);
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(IIZ)V")
	public void method1856(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 1 && this.aBoolean119) {
			return;
		}
		@Pc(21) int local21 = this.anIntArray449[Static21.anIntArray138[arg0]];
		if (local21 == 0) {
			return;
		}
		local21 -= 256;
		@Pc(54) Class1_Sub2_Sub18 local54;
		do {
			if (arg1) {
				local21++;
				if (Static16.anInt444 <= local21) {
					local21 = 0;
				}
			} else {
				local21--;
				if (local21 < 0) {
					local21 = Static16.anInt444 - 1;
				}
			}
			local54 = Static55.method1028(local21);
		} while (local54 == null || local54.aBoolean117 || local54.anInt2619 != (this.aBoolean119 ? 7 : 0) + arg0);
		this.anIntArray449[Static21.anIntArray138[arg0]] = local21 + 256;
		this.method1850();
	}
}
