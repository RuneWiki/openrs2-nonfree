import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class42 {

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
	private int anInt1602;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "[I")
	private int[] anIntArray121;

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "J")
	private long aLong43;

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "J")
	private long aLong44;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "Z")
	public boolean aBoolean72;

	@OriginalMember(owner = "client!kb", name = "P", descriptor = "[I")
	private int[] anIntArray122;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)V")
	public void method1076(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean72 != arg0) {
			this.method1077(null, this.anIntArray122, -1, arg0);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([II[IIZ)V")
	public void method1077(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (arg0 == null) {
			arg0 = new int[12];
			for (@Pc(8) int local8 = 0; local8 < 7; local8++) {
				for (@Pc(12) int local12 = 0; local12 < Static92.anInt2430; local12++) {
					@Pc(18) Class3_Sub1_Sub9 local18 = Static127.method2038(local12);
					if (local18 != null && !local18.aBoolean91 && local18.anInt2055 == (arg3 ? 7 : 0) + local8) {
						arg0[Static22.anIntArray48[local8]] = local12 + 256;
						break;
					}
				}
			}
		}
		this.aBoolean72 = arg3;
		this.anIntArray122 = arg1;
		this.anIntArray121 = arg0;
		this.anInt1602 = arg2;
		this.method1080();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZI)V")
	public void method1078(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == 1 && this.aBoolean72) {
			return;
		}
		@Pc(19) int local19 = this.anIntArray121[Static22.anIntArray48[arg0]];
		if (local19 == 0) {
			return;
		}
		local19 -= 256;
		@Pc(60) Class3_Sub1_Sub9 local60;
		do {
			if (arg1) {
				local19++;
				if (Static92.anInt2430 <= local19) {
					local19 = 0;
				}
			} else {
				local19--;
				if (local19 < 0) {
					local19 = Static92.anInt2430 - 1;
				}
			}
			local60 = Static127.method2038(local19);
		} while (local60 == null || local60.aBoolean91 || local60.anInt2055 != arg0 + (this.aBoolean72 ? 7 : 0));
		this.anIntArray121[Static22.anIntArray48[arg0]] = local19 + 256;
		this.method1080();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	private void method1080() {
		@Pc(8) long local8 = this.aLong44;
		this.aLong44 = 0L;
		@Pc(20) int local20 = this.anIntArray121[5];
		@Pc(25) int local25 = this.anIntArray121[9];
		this.anIntArray121[5] = local25;
		this.anIntArray121[9] = local20;
		for (@Pc(37) int local37 = 0; local37 < 12; local37++) {
			this.aLong44 <<= 0x4;
			if (this.anIntArray121[local37] >= 256) {
				this.aLong44 += this.anIntArray121[local37] - 256;
			}
		}
		if (this.anIntArray121[0] >= 256) {
			this.aLong44 += this.anIntArray121[0] - 256 >> 4;
		}
		if (this.anIntArray121[1] >= 256) {
			this.aLong44 += this.anIntArray121[1] - 256 >> 8;
		}
		for (@Pc(113) int local113 = 0; local113 < 5; local113++) {
			this.aLong44 <<= 0x3;
			this.aLong44 += this.anIntArray122[local113];
		}
		this.aLong44 <<= 0x1;
		this.anIntArray121[9] = local25;
		this.aLong44 += this.aBoolean72 ? 1 : 0;
		this.anIntArray121[5] = local20;
		if (local8 != 0L && local8 != this.aLong44) {
			Static19.aClass52_12.method1345(local8);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!ed;IILclient!ed;)Lclient!t;")
	public Class3_Sub1_Sub2_Sub6 method1082(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class3_Sub1_Sub4 arg3) {
		if (this.anInt1602 != -1) {
			return Static9.method177(this.anInt1602).method1897(arg0, arg1, arg2, arg3);
		}
		@Pc(30) long local30 = this.aLong44;
		@Pc(33) int[] local33 = this.anIntArray121;
		if (arg3 != null && (arg3.anInt866 >= 0 || arg3.anInt877 >= 0)) {
			local33 = new int[12];
			for (@Pc(52) int local52 = 0; local52 < 12; local52++) {
				local33[local52] = this.anIntArray121[local52];
			}
			if (arg3.anInt866 >= 0) {
				local30 += arg3.anInt866 - this.anIntArray121[5] << 8;
				local33[5] = arg3.anInt866;
			}
			if (arg3.anInt877 >= 0) {
				local30 += arg3.anInt877 - this.anIntArray121[3] << 16;
				local33[3] = arg3.anInt877;
			}
		}
		@Pc(115) Class3_Sub1_Sub2_Sub6 local115 = (Class3_Sub1_Sub2_Sub6) Static19.aClass52_12.method1342(local30);
		if (local115 == null) {
			@Pc(119) boolean local119 = false;
			for (@Pc(121) int local121 = 0; local121 < 12; local121++) {
				@Pc(127) int local127 = local33[local121];
				if (local127 >= 256 && local127 < 512 && !Static127.method2038(local127 - 256).method1364()) {
					local119 = true;
				}
				if (local127 >= 512 && !Static12.method239(local127 - 512).method1192(this.aBoolean72)) {
					local119 = true;
				}
			}
			if (local119) {
				if (this.aLong43 != -1L) {
					local115 = (Class3_Sub1_Sub2_Sub6) Static19.aClass52_12.method1342(this.aLong43);
				}
				if (local115 == null) {
					return null;
				}
			}
			if (local115 == null) {
				@Pc(193) Class3_Sub1_Sub2_Sub1[] local193 = new Class3_Sub1_Sub2_Sub1[12];
				@Pc(195) int local195 = 0;
				for (@Pc(197) int local197 = 0; local197 < 12; local197++) {
					@Pc(203) int local203 = local33[local197];
					@Pc(219) Class3_Sub1_Sub2_Sub1 local219;
					if (local203 >= 256 && local203 < 512) {
						local219 = Static127.method2038(local203 - 256).method1368();
						if (local219 != null) {
							local193[local195++] = local219;
						}
					}
					if (local203 >= 512) {
						local219 = Static12.method239(local203 - 512).method1196(this.aBoolean72);
						if (local219 != null) {
							local193[local195++] = local219;
						}
					}
				}
				@Pc(260) Class3_Sub1_Sub2_Sub1 local260 = new Class3_Sub1_Sub2_Sub1(local193, local195);
				for (@Pc(262) int local262 = 0; local262 < 5; local262++) {
					if (this.anIntArray122[local262] != 0) {
						local260.method223(Static57.aShortArrayArray1[local262][0], Static57.aShortArrayArray1[local262][this.anIntArray122[local262]]);
						if (local262 == 1) {
							local260.method223(Static108.aShortArray10[0], Static108.aShortArray10[this.anIntArray122[local262]]);
						}
					}
				}
				local115 = local260.method215(64, 850, -30, -50, -30);
				Static19.aClass52_12.method1344(local115, local30);
				this.aLong43 = local30;
			}
		}
		if (arg3 == null && arg1 == null) {
			return local115;
		}
		@Pc(339) Class3_Sub1_Sub2_Sub6 local339;
		if (arg3 != null && arg1 != null) {
			local339 = arg3.method594(arg0, local115, arg1, arg2);
		} else if (arg3 == null) {
			local339 = arg1.method597(arg2, local115);
		} else {
			local339 = arg3.method597(arg0, local115);
		}
		return local339;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)Lclient!bd;")
	public Class3_Sub1_Sub2_Sub1 method1083() {
		if (this.anInt1602 != -1) {
			return Static9.method177(this.anInt1602).method1894();
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(30) int local30 = 0; local30 < 12; local30++) {
			@Pc(37) int local37 = this.anIntArray121[local30];
			if (local37 >= 256 && local37 < 512 && !Static127.method2038(local37 - 256).method1366()) {
				local23 = true;
			}
			if (local37 >= 512 && !Static12.method239(local37 - 512).method1188(this.aBoolean72)) {
				local23 = true;
			}
		}
		if (local23) {
			return null;
		}
		@Pc(83) Class3_Sub1_Sub2_Sub1[] local83 = new Class3_Sub1_Sub2_Sub1[12];
		@Pc(85) int local85 = 0;
		for (@Pc(87) int local87 = 0; local87 < 12; local87++) {
			@Pc(94) int local94 = this.anIntArray121[local87];
			@Pc(114) Class3_Sub1_Sub2_Sub1 local114;
			if (local94 >= 256 && local94 < 512) {
				local114 = Static127.method2038(local94 - 256).method1367();
				if (local114 != null) {
					local83[local85++] = local114;
				}
			}
			if (local94 >= 512) {
				local114 = Static12.method239(local94 - 512).method1195(this.aBoolean72);
				if (local114 != null) {
					local83[local85++] = local114;
				}
			}
		}
		@Pc(157) Class3_Sub1_Sub2_Sub1 local157 = new Class3_Sub1_Sub2_Sub1(local83, local85);
		for (@Pc(159) int local159 = 0; local159 < 5; local159++) {
			if (this.anIntArray122[local159] != 0) {
				local157.method223(Static57.aShortArrayArray1[local159][0], Static57.aShortArrayArray1[local159][this.anIntArray122[local159]]);
				if (local159 == 1) {
					local157.method223(Static108.aShortArray10[0], Static108.aShortArray10[this.anIntArray122[local159]]);
				}
			}
		}
		return local157;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)I")
	public int method1086() {
		return this.anInt1602 == -1 ? (this.anIntArray121[11] << 5) + ((this.anIntArray122[0] << 25) + (this.anIntArray122[4] << 20)) + (this.anIntArray121[0] << 15) + (this.anIntArray121[8] << 10) + this.anIntArray121[1] : Static9.method177(this.anInt1602).anInt2929 + 305419896;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIZ)V")
	public void method1087(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = this.anIntArray122[arg0];
		if (arg1) {
			local8++;
			if (local8 >= Static57.aShortArrayArray1[arg0].length) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static57.aShortArrayArray1[arg0].length - 1;
			}
		}
		this.anIntArray122[arg0] = local8;
		this.method1080();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!b;Z)V")
	public void method1089(@OriginalArg(0) Class3_Sub2 arg0) {
		arg0.method303(this.aBoolean72 ? 1 : 0);
		@Pc(21) int local21;
		for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
			local21 = this.anIntArray121[Static22.anIntArray48[local12]];
			if (local21 == 0) {
				arg0.method303(-1);
			} else {
				arg0.method303(local21 - 256);
			}
		}
		for (local21 = 0; local21 < 5; local21++) {
			arg0.method303(this.anIntArray122[local21]);
		}
	}
}
