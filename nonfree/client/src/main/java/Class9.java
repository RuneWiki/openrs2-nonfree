import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class9 {

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "[I")
	private int[] anIntArray31;

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "J")
	private long aLong14;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
	private int anInt331;

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "[I")
	private int[] anIntArray32;

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!bf", name = "B", descriptor = "Z")
	public boolean aBoolean13;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILclient!ae;Lclient!ae;B)Lclient!wb;")
	public Class2_Sub1_Sub1_Sub7 method239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub2 arg2, @OriginalArg(3) Class2_Sub1_Sub2 arg3) {
		if (this.anInt331 != -1) {
			return Static116.method1856(this.anInt331).method1560(arg1, arg3, arg2, arg0);
		}
		@Pc(23) long local23 = this.aLong15;
		@Pc(26) int[] local26 = this.anIntArray31;
		if (arg3 != null && (arg3.anInt175 >= 0 || arg3.anInt176 >= 0)) {
			local26 = new int[12];
			for (@Pc(48) int local48 = 0; local48 < 12; local48++) {
				local26[local48] = this.anIntArray31[local48];
			}
			if (arg3.anInt175 >= 0) {
				local23 += arg3.anInt175 - this.anIntArray31[5] << 8;
				local26[5] = arg3.anInt175;
			}
			if (arg3.anInt176 >= 0) {
				local23 += arg3.anInt176 - this.anIntArray31[3] << 16;
				local26[3] = arg3.anInt176;
			}
		}
		@Pc(113) Class2_Sub1_Sub1_Sub7 local113 = (Class2_Sub1_Sub1_Sub7) Static104.aClass8_66.method172(local23);
		if (local113 == null) {
			@Pc(117) boolean local117 = false;
			for (@Pc(119) int local119 = 0; local119 < 12; local119++) {
				@Pc(125) int local125 = local26[local119];
				if (local125 >= 256 && local125 < 512 && !Static5.method121(local125 - 256).method1351()) {
					local117 = true;
				}
				if (local125 >= 512 && !Static4.method872(local125 - 512).method1544(this.aBoolean13)) {
					local117 = true;
				}
			}
			if (local117) {
				if (this.aLong14 != -1L) {
					local113 = (Class2_Sub1_Sub1_Sub7) Static104.aClass8_66.method172(this.aLong14);
				}
				if (local113 == null) {
					return null;
				}
			}
			if (local113 == null) {
				@Pc(187) Class2_Sub1_Sub1_Sub2[] local187 = new Class2_Sub1_Sub1_Sub2[12];
				@Pc(189) int local189 = 0;
				for (@Pc(191) int local191 = 0; local191 < 12; local191++) {
					@Pc(197) int local197 = local26[local191];
					@Pc(213) Class2_Sub1_Sub1_Sub2 local213;
					if (local197 >= 256 && local197 < 512) {
						local213 = Static5.method121(local197 - 256).method1352();
						if (local213 != null) {
							local187[local189++] = local213;
						}
					}
					if (local197 >= 512) {
						local213 = Static4.method872(local197 - 512).method1545(this.aBoolean13);
						if (local213 != null) {
							local187[local189++] = local213;
						}
					}
				}
				@Pc(250) Class2_Sub1_Sub1_Sub2 local250 = new Class2_Sub1_Sub1_Sub2(local187, local189);
				for (@Pc(252) int local252 = 0; local252 < 5; local252++) {
					if (this.anIntArray32[local252] < Static108.aShortArrayArray5[local252].length) {
						local250.method544(Static42.aShortArray13[local252], Static108.aShortArrayArray5[local252][this.anIntArray32[local252]]);
					}
					if (Static132.aShortArrayArray6[local252].length > this.anIntArray32[local252]) {
						local250.method544(Static47.aShortArray14[local252], Static132.aShortArrayArray6[local252][this.anIntArray32[local252]]);
					}
				}
				local113 = local250.method542(64, 850, -30, -50, -30);
				Static104.aClass8_66.method176(local23, local113);
				this.aLong14 = local23;
			}
		}
		if (arg3 == null && arg2 == null) {
			return local113;
		}
		@Pc(334) Class2_Sub1_Sub1_Sub7 local334;
		if (arg3 != null && arg2 != null) {
			local334 = arg3.method118(arg2, arg0, arg1, local113);
		} else if (arg3 == null) {
			local334 = arg2.method120(arg1, local113);
		} else {
			local334 = arg3.method120(arg0, local113);
		}
		return local334;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Lclient!ed;")
	public Class2_Sub1_Sub1_Sub2 method240() {
		if (this.anInt331 != -1) {
			return Static116.method1856(this.anInt331).method1561();
		}
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < 12; local21++) {
			@Pc(33) int local33 = this.anIntArray31[local21];
			if (local33 >= 256 && local33 < 512 && !Static5.method121(local33 - 256).method1350()) {
				local19 = true;
			}
			if (local33 >= 512 && !Static4.method872(local33 - 512).method1541(this.aBoolean13)) {
				local19 = true;
			}
		}
		if (local19) {
			return null;
		}
		@Pc(79) Class2_Sub1_Sub1_Sub2[] local79 = new Class2_Sub1_Sub1_Sub2[12];
		@Pc(81) int local81 = 0;
		for (@Pc(83) int local83 = 0; local83 < 12; local83++) {
			@Pc(90) int local90 = this.anIntArray31[local83];
			@Pc(106) Class2_Sub1_Sub1_Sub2 local106;
			if (local90 >= 256 && local90 < 512) {
				local106 = Static5.method121(local90 - 256).method1348();
				if (local106 != null) {
					local79[local81++] = local106;
				}
			}
			if (local90 >= 512) {
				local106 = Static4.method872(local90 - 512).method1540(this.aBoolean13);
				if (local106 != null) {
					local79[local81++] = local106;
				}
			}
		}
		@Pc(143) Class2_Sub1_Sub1_Sub2 local143 = new Class2_Sub1_Sub1_Sub2(local79, local81);
		for (@Pc(145) int local145 = 0; local145 < 5; local145++) {
			if (Static108.aShortArrayArray5[local145].length > this.anIntArray32[local145]) {
				local143.method544(Static42.aShortArray13[local145], Static108.aShortArrayArray5[local145][this.anIntArray32[local145]]);
			}
			if (this.anIntArray32[local145] < Static132.aShortArrayArray6[local145].length) {
				local143.method544(Static47.aShortArray14[local145], Static132.aShortArrayArray6[local145][this.anIntArray32[local145]]);
			}
		}
		return local143;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BZ)V")
	public void method241(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean13) {
			this.method243(this.anIntArray32, -1, null, arg0);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!be;I)V")
	public void method242(@OriginalArg(0) Class2_Sub4 arg0) {
		arg0.method926(this.aBoolean13 ? 1 : 0);
		@Pc(21) int local21;
		for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
			local21 = this.anIntArray31[Static2.anIntArray7[local12]];
			if (local21 == 0) {
				arg0.method926(-1);
			} else {
				arg0.method926(local21 - 256);
			}
		}
		for (local21 = 0; local21 < 5; local21++) {
			arg0.method926(this.anIntArray32[local21]);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([IBI[IZ)V")
	public void method243(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3) {
		if (arg2 == null) {
			arg2 = new int[12];
			for (@Pc(6) int local6 = 0; local6 < 7; local6++) {
				for (@Pc(9) int local9 = 0; local9 < Static100.anInt2281; local9++) {
					@Pc(14) Class2_Sub1_Sub10 local14 = Static5.method121(local9);
					if (local14 != null && !local14.aBoolean69 && (arg3 ? 7 : 0) + local6 == local14.anInt1799) {
						arg2[Static2.anIntArray7[local6]] = local9 + 256;
						break;
					}
				}
			}
		}
		this.aBoolean13 = arg3;
		this.anIntArray32 = arg0;
		this.anIntArray31 = arg2;
		this.anInt331 = arg1;
		this.method249();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIZ)V")
	public void method245(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = this.anIntArray32[arg0];
		if (arg1) {
			local8++;
			if (local8 >= Static108.aShortArrayArray5[arg0].length) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static108.aShortArrayArray5[arg0].length - 1;
			}
		}
		this.anIntArray32[arg0] = local8;
		this.method249();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZII)V")
	public void method246(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 && this.aBoolean13) {
			return;
		}
		@Pc(19) int local19 = this.anIntArray31[Static2.anIntArray7[arg1]];
		if (local19 == 0) {
			return;
		}
		local19 -= 256;
		@Pc(51) Class2_Sub1_Sub10 local51;
		do {
			if (arg0) {
				local19++;
				if (local19 >= Static100.anInt2281) {
					local19 = 0;
				}
			} else {
				local19--;
				if (local19 < 0) {
					local19 = Static100.anInt2281 - 1;
				}
			}
			local51 = Static5.method121(local19);
		} while (local51 == null || local51.aBoolean69 || (this.aBoolean13 ? 7 : 0) + arg1 != local51.anInt1799);
		this.anIntArray31[Static2.anIntArray7[arg1]] = local19 + 256;
		this.method249();
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V")
	private void method249() {
		@Pc(6) long local6 = this.aLong15;
		@Pc(11) int local11 = this.anIntArray31[5];
		this.aLong15 = 0L;
		@Pc(19) int local19 = this.anIntArray31[9];
		this.anIntArray31[5] = local19;
		this.anIntArray31[9] = local11;
		for (@Pc(39) int local39 = 0; local39 < 12; local39++) {
			this.aLong15 <<= 0x4;
			if (this.anIntArray31[local39] >= 256) {
				this.aLong15 += this.anIntArray31[local39] - 256;
			}
		}
		if (this.anIntArray31[0] >= 256) {
			this.aLong15 += this.anIntArray31[0] - 256 >> 4;
		}
		if (this.anIntArray31[1] >= 256) {
			this.aLong15 += this.anIntArray31[1] - 256 >> 8;
		}
		for (@Pc(116) int local116 = 0; local116 < 5; local116++) {
			this.aLong15 <<= 0x3;
			this.aLong15 += this.anIntArray32[local116];
		}
		this.aLong15 <<= 0x1;
		this.aLong15 += this.aBoolean13 ? 1 : 0;
		this.anIntArray31[9] = local19;
		this.anIntArray31[5] = local11;
		if (local6 != 0L && this.aLong15 != local6) {
			Static104.aClass8_66.method177(local6);
		}
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(B)I")
	public int method250() {
		return this.anInt331 == -1 ? (this.anIntArray32[0] << 25) + ((this.anIntArray32[4] << 20) + (this.anIntArray31[0] << 15) + (this.anIntArray31[8] << 10) - (-(this.anIntArray31[11] << 5) - this.anIntArray31[1])) : Static116.method1856(this.anInt331).anInt2128 + 305419896;
	}
}
