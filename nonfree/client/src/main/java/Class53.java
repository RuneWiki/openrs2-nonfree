import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class53 {

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Z")
	public boolean aBoolean121;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "[I")
	private int[] anIntArray234;

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "[I")
	private int[] anIntArray235;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "J")
	private long aLong58;

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
	private int anInt2079;

	@OriginalMember(owner = "client!pb", name = "z", descriptor = "J")
	private long aLong59;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIZ)V")
	public void method1256(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(4) int local4 = this.anIntArray235[arg0];
		if (arg1) {
			local4++;
			if (local4 >= Static21.anIntArrayArray5[arg0].length) {
				local4 = 0;
			}
		} else {
			local4--;
			if (local4 < 0) {
				local4 = Static21.anIntArrayArray5[arg0].length - 1;
			}
		}
		this.anIntArray235[arg0] = local4;
		this.method1264();
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!kd;I)V")
	public void method1257(@OriginalArg(0) Class3_Sub8 arg0) {
		arg0.method1806(this.aBoolean121 ? 1 : 0);
		@Pc(33) int local33;
		for (@Pc(24) int local24 = 0; local24 < 7; local24++) {
			local33 = this.anIntArray234[Static6.anIntArray20[local24]];
			if (local33 == 0) {
				arg0.method1806(-1);
			} else {
				arg0.method1806(local33 - 256);
			}
		}
		for (local33 = 0; local33 < 5; local33++) {
			arg0.method1806(this.anIntArray235[local33]);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)V")
	public void method1258(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean121) {
			this.method1265(this.anIntArray235, null, arg0, -1);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZI)V")
	public void method1259(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == 1 && this.aBoolean121) {
			return;
		}
		@Pc(19) int local19 = this.anIntArray234[Static6.anIntArray20[arg0]];
		if (local19 == 0) {
			return;
		}
		local19 -= 256;
		@Pc(44) Class3_Sub1_Sub14 local44;
		do {
			if (arg1) {
				local19++;
				if (Static34.anInt1096 <= local19) {
					local19 = 0;
				}
			} else {
				local19--;
				if (local19 < 0) {
					local19 = Static34.anInt1096 - 1;
				}
			}
			local44 = Static28.method571(local19);
		} while (local44 == null || local44.aBoolean138 || local44.anInt2309 != arg0 + (this.aBoolean121 ? 7 : 0));
		this.anIntArray234[Static6.anIntArray20[arg0]] = local19 + 256;
		this.method1264();
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)Lclient!lb;")
	public Class3_Sub1_Sub3_Sub3 method1261() {
		if (this.anInt2079 != -1) {
			return Static92.method1547(this.anInt2079).method436();
		}
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < 12; local21++) {
			@Pc(28) int local28 = this.anIntArray234[local21];
			if (local28 >= 256 && local28 < 512 && !Static28.method571(local28 - 256).method1417()) {
				local19 = true;
			}
			if (local28 >= 512 && !Static4.method160(local28 - 512).method207(this.aBoolean121)) {
				local19 = true;
			}
		}
		if (local19) {
			return null;
		}
		@Pc(74) Class3_Sub1_Sub3_Sub3[] local74 = new Class3_Sub1_Sub3_Sub3[12];
		@Pc(76) int local76 = 0;
		for (@Pc(86) int local86 = 0; local86 < 12; local86++) {
			@Pc(93) int local93 = this.anIntArray234[local86];
			@Pc(107) Class3_Sub1_Sub3_Sub3 local107;
			if (local93 >= 256 && local93 < 512) {
				local107 = Static28.method571(local93 - 256).method1410();
				if (local107 != null) {
					local74[local76++] = local107;
				}
			}
			if (local93 >= 512) {
				local107 = Static4.method160(local93 - 512).method210(this.aBoolean121);
				if (local107 != null) {
					local74[local76++] = local107;
				}
			}
		}
		@Pc(146) Class3_Sub1_Sub3_Sub3 local146 = new Class3_Sub1_Sub3_Sub3(local74, local76);
		for (@Pc(148) int local148 = 0; local148 < 5; local148++) {
			if (this.anIntArray235[local148] != 0) {
				local146.method965(Static21.anIntArrayArray5[local148][0], Static21.anIntArrayArray5[local148][this.anIntArray235[local148]]);
				if (local148 == 1) {
					local146.method965(Static51.anIntArray253[0], Static51.anIntArray253[this.anIntArray235[local148]]);
				}
			}
		}
		return local146;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!oe;ILclient!oe;II)Lclient!lb;")
	public Class3_Sub1_Sub3_Sub3 method1262(@OriginalArg(0) Class3_Sub1_Sub11 arg0, @OriginalArg(2) Class3_Sub1_Sub11 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInt2079 != -1) {
			return Static92.method1547(this.anInt2079).method441(arg1, arg3, arg2, arg0);
		}
		@Pc(24) int[] local24 = this.anIntArray234;
		@Pc(27) long local27 = this.aLong59;
		if (arg1 != null && (arg1.anInt2013 >= 0 || arg1.anInt2024 >= 0)) {
			local24 = new int[12];
			for (@Pc(43) int local43 = 0; local43 < 12; local43++) {
				local24[local43] = this.anIntArray234[local43];
			}
			if (arg1.anInt2013 >= 0) {
				local27 += arg1.anInt2013 - this.anIntArray234[5] << 8;
				local24[5] = arg1.anInt2013;
			}
			if (arg1.anInt2024 >= 0) {
				local27 += arg1.anInt2024 - this.anIntArray234[3] << 16;
				local24[3] = arg1.anInt2024;
			}
		}
		@Pc(114) Class3_Sub1_Sub3_Sub3 local114 = (Class3_Sub1_Sub3_Sub3) Static92.aClass34_30.method764(local27);
		if (local114 == null) {
			@Pc(118) boolean local118 = false;
			for (@Pc(120) int local120 = 0; local120 < 12; local120++) {
				@Pc(126) int local126 = local24[local120];
				if (local126 >= 256 && local126 < 512 && !Static28.method571(local126 - 256).method1420()) {
					local118 = true;
				}
				if (local126 >= 512 && !Static4.method160(local126 - 512).method209(this.aBoolean121)) {
					local118 = true;
				}
			}
			if (local118) {
				if (this.aLong58 != -1L) {
					local114 = (Class3_Sub1_Sub3_Sub3) Static92.aClass34_30.method764(this.aLong58);
				}
				if (local114 == null) {
					return null;
				}
			}
			if (local114 == null) {
				@Pc(192) Class3_Sub1_Sub3_Sub3[] local192 = new Class3_Sub1_Sub3_Sub3[12];
				@Pc(194) int local194 = 0;
				@Pc(202) int local202;
				for (@Pc(196) int local196 = 0; local196 < 12; local196++) {
					local202 = local24[local196];
					@Pc(216) Class3_Sub1_Sub3_Sub3 local216;
					if (local202 >= 256 && local202 < 512) {
						local216 = Static28.method571(local202 - 256).method1415();
						if (local216 != null) {
							local192[local194++] = local216;
						}
					}
					if (local202 >= 512) {
						local216 = Static4.method160(local202 - 512).method205(this.aBoolean121);
						if (local216 != null) {
							local192[local194++] = local216;
						}
					}
				}
				local114 = new Class3_Sub1_Sub3_Sub3(local192, local194);
				for (local202 = 0; local202 < 5; local202++) {
					if (this.anIntArray235[local202] != 0) {
						local114.method965(Static21.anIntArrayArray5[local202][0], Static21.anIntArrayArray5[local202][this.anIntArray235[local202]]);
						if (local202 == 1) {
							local114.method965(Static51.anIntArray253[0], Static51.anIntArray253[this.anIntArray235[local202]]);
						}
					}
				}
				local114.method945();
				local114.method953(64, 850, -30, -50, -30, true);
				Static92.aClass34_30.method765(local27, local114);
				this.aLong58 = local27;
			}
		}
		if (arg1 == null && arg0 == null) {
			return local114;
		}
		@Pc(335) Class3_Sub1_Sub3_Sub3 local335;
		if (arg1 != null && arg0 != null) {
			local335 = arg1.method1225(arg3, arg2, arg0, local114);
		} else if (arg1 == null) {
			local335 = arg0.method1228(local114, arg2);
		} else {
			local335 = arg1.method1228(local114, arg3);
		}
		return local335;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)I")
	public int method1263() {
		return this.anInt2079 == -1 ? this.anIntArray234[1] + (this.anIntArray235[4] << 20) + (this.anIntArray235[0] << 25) + (this.anIntArray234[0] << 15) + (this.anIntArray234[8] << 10) + (this.anIntArray234[11] << 5) : Static92.method1547(this.anInt2079).anInt660 + 305419896;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)V")
	private void method1264() {
		@Pc(6) int local6 = this.anIntArray234[5];
		@Pc(11) int local11 = this.anIntArray234[9];
		@Pc(14) long local14 = this.aLong59;
		this.anIntArray234[5] = local11;
		this.anIntArray234[9] = local6;
		this.aLong59 = 0L;
		for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
			this.aLong59 <<= 0x4;
			if (this.anIntArray234[local33] >= 256) {
				this.aLong59 += this.anIntArray234[local33] - 256;
			}
		}
		if (this.anIntArray234[0] >= 256) {
			this.aLong59 += this.anIntArray234[0] - 256 >> 4;
		}
		if (this.anIntArray234[1] >= 256) {
			this.aLong59 += this.anIntArray234[1] - 256 >> 8;
		}
		for (@Pc(115) int local115 = 0; local115 < 5; local115++) {
			this.aLong59 <<= 0x3;
			this.aLong59 += this.anIntArray235[local115];
		}
		this.aLong59 <<= 0x1;
		this.aLong59 += this.aBoolean121 ? 1 : 0;
		this.anIntArray234[5] = local6;
		this.anIntArray234[9] = local11;
		if (local14 != 0L && this.aLong59 != local14) {
			Static92.aClass34_30.method759(local14);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "([I[IZZI)V")
	public void method1265(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (arg1 == null) {
			arg1 = new int[12];
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static34.anInt1096; local16++) {
					@Pc(22) Class3_Sub1_Sub14 local22 = Static28.method571(local16);
					if (local22 != null && !local22.aBoolean138 && local22.anInt2309 == (arg2 ? 7 : 0) + local12) {
						arg1[Static6.anIntArray20[local12]] = local16 + 256;
						break;
					}
				}
			}
		}
		this.anInt2079 = arg3;
		this.anIntArray235 = arg0;
		this.aBoolean121 = arg2;
		this.anIntArray234 = arg1;
		this.method1264();
	}
}
