import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class15 {

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "J")
	private long aLong20;

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "[I")
	private int[] anIntArray64;

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "Z")
	public boolean aBoolean28;

	@OriginalMember(owner = "client!dd", name = "u", descriptor = "J")
	private long aLong21;

	@OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
	private int anInt475;

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "[I")
	private int[] anIntArray66;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)Lclient!de;")
	public Class3_Sub3_Sub1_Sub1 method336() {
		if (this.anInt475 != -1) {
			return Static99.method1802(this.anInt475).method714();
		}
		@Pc(18) boolean local18 = false;
		for (@Pc(20) int local20 = 0; local20 < 12; local20++) {
			@Pc(33) int local33 = this.anIntArray66[local20];
			if (local33 >= 256 && local33 < 512 && !Static77.method1517(local33 - 256).method1190()) {
				local18 = true;
			}
			if (local33 >= 512 && !Static37.method696(local33 - 512).method1261(this.aBoolean28)) {
				local18 = true;
			}
		}
		if (local18) {
			return null;
		}
		@Pc(83) Class3_Sub3_Sub1_Sub1[] local83 = new Class3_Sub3_Sub1_Sub1[12];
		@Pc(85) int local85 = 0;
		for (@Pc(87) int local87 = 0; local87 < 12; local87++) {
			@Pc(94) int local94 = this.anIntArray66[local87];
			@Pc(112) Class3_Sub3_Sub1_Sub1 local112;
			if (local94 >= 256 && local94 < 512) {
				local112 = Static77.method1517(local94 - 256).method1179();
				if (local112 != null) {
					local83[local85++] = local112;
				}
			}
			if (local94 >= 512) {
				local112 = Static37.method696(local94 - 512).method1263(this.aBoolean28);
				if (local112 != null) {
					local83[local85++] = local112;
				}
			}
		}
		@Pc(153) Class3_Sub3_Sub1_Sub1 local153 = new Class3_Sub3_Sub1_Sub1(local83, local85);
		for (@Pc(155) int local155 = 0; local155 < 5; local155++) {
			if (this.anIntArray64[local155] != 0) {
				local153.method406(Static102.anIntArrayArray70[local155][0], Static102.anIntArrayArray70[local155][this.anIntArray64[local155]]);
				if (local155 == 1) {
					local153.method406(Static42.anIntArray203[0], Static42.anIntArray203[this.anIntArray64[local155]]);
				}
			}
		}
		return local153;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZI)V")
	public void method337(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean28) {
			this.method347(null, this.anIntArray64, -1, arg0);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!wd;)V")
	public void method339(@OriginalArg(1) Class3_Sub11 arg0) {
		arg0.method1443(this.aBoolean28 ? 1 : 0);
		@Pc(30) int local30;
		for (@Pc(21) int local21 = 0; local21 < 7; local21++) {
			local30 = this.anIntArray66[Static52.anIntArray232[local21]];
			if (local30 == 0) {
				arg0.method1443(-1);
			} else {
				arg0.method1443(local30 - 256);
			}
		}
		for (local30 = 0; local30 < 5; local30++) {
			arg0.method1443(this.anIntArray64[local30]);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZBI)V")
	public void method340(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray64[arg1];
		if (arg0) {
			local8++;
			if (Static102.anIntArrayArray70[arg1].length <= local8) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static102.anIntArrayArray70[arg1].length - 1;
			}
		}
		this.anIntArray64[arg1] = local8;
		this.method344();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZIZ)V")
	public void method341(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 1 && this.aBoolean28) {
			return;
		}
		@Pc(19) int local19 = this.anIntArray66[Static52.anIntArray232[arg0]];
		if (local19 == 0) {
			return;
		}
		local19 -= 256;
		@Pc(54) Class3_Sub3_Sub7 local54;
		do {
			if (arg1) {
				local19++;
				if (local19 >= Static42.anInt1230) {
					local19 = 0;
				}
			} else {
				local19--;
				if (local19 < 0) {
					local19 = Static42.anInt1230 - 1;
				}
			}
			local54 = Static77.method1517(local19);
		} while (local54 == null || local54.aBoolean87 || local54.anInt1647 != (this.aBoolean28 ? 7 : 0) + arg0);
		this.anIntArray66[Static52.anIntArray232[arg0]] = local19 + 256;
		this.method344();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!ua;IBILclient!ua;)Lclient!de;")
	public Class3_Sub3_Sub1_Sub1 method343(@OriginalArg(0) Class3_Sub3_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub3_Sub14 arg3) {
		if (this.anInt475 != -1) {
			return Static99.method1802(this.anInt475).method719(arg0, arg1, arg2, arg3);
		}
		@Pc(32) long local32 = this.aLong21;
		@Pc(35) int[] local35 = this.anIntArray66;
		if (arg0 != null && (arg0.anInt2618 >= 0 || arg0.anInt2612 >= 0)) {
			local35 = new int[12];
			for (@Pc(51) int local51 = 0; local51 < 12; local51++) {
				local35[local51] = this.anIntArray66[local51];
			}
			if (arg0.anInt2618 >= 0) {
				local32 += arg0.anInt2618 - this.anIntArray66[5] << 8;
				local35[5] = arg0.anInt2618;
			}
			if (arg0.anInt2612 >= 0) {
				local32 += arg0.anInt2612 - this.anIntArray66[3] << 16;
				local35[3] = arg0.anInt2612;
			}
		}
		@Pc(116) Class3_Sub3_Sub1_Sub1 local116 = (Class3_Sub3_Sub1_Sub1) Static3.aClass21_2.method658(local32);
		if (local116 == null) {
			@Pc(120) boolean local120 = false;
			for (@Pc(122) int local122 = 0; local122 < 12; local122++) {
				@Pc(128) int local128 = local35[local122];
				if (local128 >= 256 && local128 < 512 && !Static77.method1517(local128 - 256).method1186()) {
					local120 = true;
				}
				if (local128 >= 512 && !Static37.method696(local128 - 512).method1268(this.aBoolean28)) {
					local120 = true;
				}
			}
			if (local120) {
				if (this.aLong20 != -1L) {
					local116 = (Class3_Sub3_Sub1_Sub1) Static3.aClass21_2.method658(this.aLong20);
				}
				if (local116 == null) {
					return null;
				}
			}
			if (local116 == null) {
				@Pc(186) Class3_Sub3_Sub1_Sub1[] local186 = new Class3_Sub3_Sub1_Sub1[12];
				@Pc(188) int local188 = 0;
				@Pc(196) int local196;
				for (@Pc(190) int local190 = 0; local190 < 12; local190++) {
					local196 = local35[local190];
					@Pc(214) Class3_Sub3_Sub1_Sub1 local214;
					if (local196 >= 256 && local196 < 512) {
						local214 = Static77.method1517(local196 - 256).method1191();
						if (local214 != null) {
							local186[local188++] = local214;
						}
					}
					if (local196 >= 512) {
						local214 = Static37.method696(local196 - 512).method1270(this.aBoolean28);
						if (local214 != null) {
							local186[local188++] = local214;
						}
					}
				}
				local116 = new Class3_Sub3_Sub1_Sub1(local186, local188);
				for (local196 = 0; local196 < 5; local196++) {
					if (this.anIntArray64[local196] != 0) {
						local116.method406(Static102.anIntArrayArray70[local196][0], Static102.anIntArrayArray70[local196][this.anIntArray64[local196]]);
						if (local196 == 1) {
							local116.method406(Static42.anIntArray203[0], Static42.anIntArray203[this.anIntArray64[local196]]);
						}
					}
				}
				local116.method396();
				local116.method407(64, 850, -30, -50, -30, true);
				Static3.aClass21_2.method660(local116, local32);
				this.aLong20 = local32;
			}
		}
		if (arg0 == null && arg3 == null) {
			return local116;
		}
		@Pc(336) Class3_Sub3_Sub1_Sub1 local336;
		if (arg0 != null && arg3 != null) {
			local336 = arg0.method1805(local116, arg3, arg1, arg2);
		} else if (arg0 == null) {
			local336 = arg3.method1796(local116, arg2);
		} else {
			local336 = arg0.method1796(local116, arg1);
		}
		return local336;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
	private void method344() {
		@Pc(8) long local8 = this.aLong21;
		@Pc(13) int local13 = this.anIntArray66[5];
		@Pc(18) int local18 = this.anIntArray66[9];
		this.anIntArray66[5] = local18;
		this.anIntArray66[9] = local13;
		this.aLong21 = 0L;
		for (@Pc(37) int local37 = 0; local37 < 12; local37++) {
			this.aLong21 <<= 0x4;
			if (this.anIntArray66[local37] >= 256) {
				this.aLong21 += this.anIntArray66[local37] - 256;
			}
		}
		if (this.anIntArray66[0] >= 256) {
			this.aLong21 += this.anIntArray66[0] - 256 >> 4;
		}
		if (this.anIntArray66[1] >= 256) {
			this.aLong21 += this.anIntArray66[1] - 256 >> 8;
		}
		for (@Pc(113) int local113 = 0; local113 < 5; local113++) {
			this.aLong21 <<= 0x3;
			this.aLong21 += this.anIntArray64[local113];
		}
		this.aLong21 <<= 0x1;
		this.aLong21 += this.aBoolean28 ? 1 : 0;
		this.anIntArray66[5] = local13;
		this.anIntArray66[9] = local18;
		if (local8 != 0L && this.aLong21 != local8) {
			Static3.aClass21_2.method661(local8);
		}
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)I")
	public int method346() {
		return this.anInt475 == -1 ? this.anIntArray66[1] + (this.anIntArray66[11] << 5) + (this.anIntArray66[8] << 10) + (this.anIntArray66[0] << 15) + (this.anIntArray64[4] << 20) + (this.anIntArray64[0] << 25) : Static99.method1802(this.anInt475).anInt914 + 305419896;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[I[IIZ)V")
	public void method347(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (arg0 == null) {
			arg0 = new int[12];
			for (@Pc(8) int local8 = 0; local8 < 7; local8++) {
				for (@Pc(12) int local12 = 0; local12 < Static42.anInt1230; local12++) {
					@Pc(18) Class3_Sub3_Sub7 local18 = Static77.method1517(local12);
					if (local18 != null && !local18.aBoolean87 && local18.anInt1647 == local8 + (arg3 ? 7 : 0)) {
						arg0[Static52.anIntArray232[local8]] = local12 + 256;
						break;
					}
				}
			}
		}
		this.anIntArray64 = arg1;
		this.anIntArray66 = arg0;
		this.aBoolean28 = arg3;
		this.anInt475 = arg2;
		this.method344();
	}
}
