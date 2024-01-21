import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class67 {

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "[I")
	private int[] anIntArray343;

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "J")
	private long aLong85;

	@OriginalMember(owner = "client!vc", name = "z", descriptor = "J")
	private long aLong86;

	@OriginalMember(owner = "client!vc", name = "A", descriptor = "[I")
	private int[] anIntArray345;

	@OriginalMember(owner = "client!vc", name = "E", descriptor = "Z")
	public boolean aBoolean134;

	@OriginalMember(owner = "client!vc", name = "J", descriptor = "I")
	private int anInt2888;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZI[I[I)V")
	public void method1996(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 == null) {
			arg2 = new int[12];
			for (@Pc(8) int local8 = 0; local8 < 7; local8++) {
				for (@Pc(12) int local12 = 0; local12 < Static26.anInt698; local12++) {
					@Pc(18) Class2_Sub1_Sub5 local18 = Static89.method1641(local12);
					if (local18 != null && !local18.aBoolean23 && local18.anInt619 == local8 + (arg1 ? 7 : 0)) {
						arg2[Static52.anIntArray186[local8]] = local12 + 256;
						break;
					}
				}
			}
		}
		this.anIntArray343 = arg2;
		this.anIntArray345 = arg3;
		this.anInt2888 = arg0;
		this.aBoolean134 = arg1;
		this.method1998();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!s;Lclient!s;ZII)Lclient!fd;")
	public Class2_Sub1_Sub4_Sub1 method1997(@OriginalArg(0) Class2_Sub1_Sub14 arg0, @OriginalArg(1) Class2_Sub1_Sub14 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInt2888 != -1) {
			return Static49.method953(this.anInt2888).method1072(arg2, arg0, arg1, arg3);
		}
		@Pc(29) long local29 = this.aLong85;
		@Pc(32) int[] local32 = this.anIntArray343;
		if (arg0 != null && (arg0.anInt2410 >= 0 || arg0.anInt2390 >= 0)) {
			local32 = new int[12];
			for (@Pc(48) int local48 = 0; local48 < 12; local48++) {
				local32[local48] = this.anIntArray343[local48];
			}
			if (arg0.anInt2410 >= 0) {
				local29 += arg0.anInt2410 - this.anIntArray343[5] << 8;
				local32[5] = arg0.anInt2410;
			}
			if (arg0.anInt2390 >= 0) {
				local29 += arg0.anInt2390 - this.anIntArray343[3] << 16;
				local32[3] = arg0.anInt2390;
			}
		}
		@Pc(113) Class2_Sub1_Sub4_Sub1 local113 = (Class2_Sub1_Sub4_Sub1) Static26.aClass22_7.method711(local29);
		if (local113 == null) {
			@Pc(117) boolean local117 = false;
			for (@Pc(119) int local119 = 0; local119 < 12; local119++) {
				@Pc(125) int local125 = local32[local119];
				if (local125 >= 256 && local125 < 512 && !Static89.method1641(local125 - 256).method514()) {
					local117 = true;
				}
				if (local125 >= 512 && !Static43.method832(local125 - 512).method1988(this.aBoolean134)) {
					local117 = true;
				}
			}
			if (local117) {
				if (this.aLong86 != -1L) {
					local113 = (Class2_Sub1_Sub4_Sub1) Static26.aClass22_7.method711(this.aLong86);
				}
				if (local113 == null) {
					return null;
				}
			}
			if (local113 == null) {
				@Pc(185) Class2_Sub1_Sub4_Sub1[] local185 = new Class2_Sub1_Sub4_Sub1[12];
				@Pc(187) int local187 = 0;
				@Pc(195) int local195;
				for (@Pc(189) int local189 = 0; local189 < 12; local189++) {
					local195 = local32[local189];
					@Pc(213) Class2_Sub1_Sub4_Sub1 local213;
					if (local195 >= 256 && local195 < 512) {
						local213 = Static89.method1641(local195 - 256).method513();
						if (local213 != null) {
							local185[local187++] = local213;
						}
					}
					if (local195 >= 512) {
						local213 = Static43.method832(local195 - 512).method1991(this.aBoolean134);
						if (local213 != null) {
							local185[local187++] = local213;
						}
					}
				}
				local113 = new Class2_Sub1_Sub4_Sub1(local185, local187);
				for (local195 = 0; local195 < 5; local195++) {
					if (this.anIntArray345[local195] != 0) {
						local113.method674(Static63.anIntArrayArray19[local195][0], Static63.anIntArrayArray19[local195][this.anIntArray345[local195]]);
						if (local195 == 1) {
							local113.method674(Static47.anIntArray168[0], Static47.anIntArray168[this.anIntArray345[local195]]);
						}
					}
				}
				local113.method681();
				local113.method655(64, 850, -30, -50, -30, true);
				Static26.aClass22_7.method712(local113, local29);
				this.aLong86 = local29;
			}
		}
		if (arg0 == null && arg1 == null) {
			return local113;
		}
		@Pc(339) Class2_Sub1_Sub4_Sub1 local339;
		if (arg0 != null && arg1 != null) {
			local339 = arg0.method1679(arg2, arg1, local113, arg3);
		} else if (arg0 == null) {
			local339 = arg1.method1680(arg3, local113);
		} else {
			local339 = arg0.method1680(arg2, local113);
		}
		return local339;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
	private void method1998() {
		@Pc(8) long local8 = this.aLong85;
		@Pc(20) int local20 = this.anIntArray343[9];
		this.aLong85 = 0L;
		@Pc(28) int local28 = this.anIntArray343[5];
		this.anIntArray343[9] = local28;
		this.anIntArray343[5] = local20;
		for (@Pc(40) int local40 = 0; local40 < 12; local40++) {
			this.aLong85 <<= 0x4;
			if (this.anIntArray343[local40] >= 256) {
				this.aLong85 += this.anIntArray343[local40] - 256;
			}
		}
		if (this.anIntArray343[0] >= 256) {
			this.aLong85 += this.anIntArray343[0] - 256 >> 4;
		}
		if (this.anIntArray343[1] >= 256) {
			this.aLong85 += this.anIntArray343[1] - 256 >> 8;
		}
		for (@Pc(112) int local112 = 0; local112 < 5; local112++) {
			this.aLong85 <<= 0x3;
			this.aLong85 += this.anIntArray345[local112];
		}
		this.anIntArray343[9] = local20;
		this.anIntArray343[5] = local28;
		this.aLong85 <<= 0x1;
		this.aLong85 += this.aBoolean134 ? 1 : 0;
		if (local8 != 0L && local8 != this.aLong85) {
			Static26.aClass22_7.method713(local8);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BZI)V")
	public void method1999(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 && this.aBoolean134) {
			return;
		}
		@Pc(21) int local21 = this.anIntArray343[Static52.anIntArray186[arg1]];
		if (local21 == 0) {
			return;
		}
		local21 -= 256;
		@Pc(53) Class2_Sub1_Sub5 local53;
		do {
			if (arg0) {
				local21++;
				if (local21 >= Static26.anInt698) {
					local21 = 0;
				}
			} else {
				local21--;
				if (local21 < 0) {
					local21 = Static26.anInt698 - 1;
				}
			}
			local53 = Static89.method1641(local21);
		} while (local53 == null || local53.aBoolean23 || local53.anInt619 != (this.aBoolean134 ? 7 : 0) + arg1);
		this.anIntArray343[Static52.anIntArray186[arg1]] = local21 + 256;
		this.method1998();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZII)V")
	public void method2001(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray345[arg1];
		if (arg0) {
			local8++;
			if (local8 >= Static63.anIntArrayArray19[arg1].length) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static63.anIntArrayArray19[arg1].length - 1;
			}
		}
		this.anIntArray345[arg1] = local8;
		this.method1998();
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)Lclient!fd;")
	public Class2_Sub1_Sub4_Sub1 method2005() {
		if (this.anInt2888 != -1) {
			return Static49.method953(this.anInt2888).method1074();
		}
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < 12; local21++) {
			@Pc(28) int local28 = this.anIntArray343[local21];
			if (local28 >= 256 && local28 < 512 && !Static89.method1641(local28 - 256).method517()) {
				local19 = true;
			}
			if (local28 >= 512 && !Static43.method832(local28 - 512).method1983(this.aBoolean134)) {
				local19 = true;
			}
		}
		if (local19) {
			return null;
		}
		@Pc(78) Class2_Sub1_Sub4_Sub1[] local78 = new Class2_Sub1_Sub4_Sub1[12];
		@Pc(80) int local80 = 0;
		for (@Pc(82) int local82 = 0; local82 < 12; local82++) {
			@Pc(89) int local89 = this.anIntArray343[local82];
			@Pc(103) Class2_Sub1_Sub4_Sub1 local103;
			if (local89 >= 256 && local89 < 512) {
				local103 = Static89.method1641(local89 - 256).method512();
				if (local103 != null) {
					local78[local80++] = local103;
				}
			}
			if (local89 >= 512) {
				local103 = Static43.method832(local89 - 512).method1981(this.aBoolean134);
				if (local103 != null) {
					local78[local80++] = local103;
				}
			}
		}
		@Pc(144) Class2_Sub1_Sub4_Sub1 local144 = new Class2_Sub1_Sub4_Sub1(local78, local80);
		for (@Pc(146) int local146 = 0; local146 < 5; local146++) {
			if (this.anIntArray345[local146] != 0) {
				local144.method674(Static63.anIntArrayArray19[local146][0], Static63.anIntArrayArray19[local146][this.anIntArray345[local146]]);
				if (local146 == 1) {
					local144.method674(Static47.anIntArray168[0], Static47.anIntArray168[this.anIntArray345[local146]]);
				}
			}
		}
		return local144;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!wd;)V")
	public void method2007(@OriginalArg(1) Class2_Sub12 arg0) {
		arg0.method1409(this.aBoolean134 ? 1 : 0);
		@Pc(33) int local33;
		for (@Pc(24) int local24 = 0; local24 < 7; local24++) {
			local33 = this.anIntArray343[Static52.anIntArray186[local24]];
			if (local33 == 0) {
				arg0.method1409(-1);
			} else {
				arg0.method1409(local33 - 256);
			}
		}
		for (local33 = 0; local33 < 5; local33++) {
			arg0.method1409(this.anIntArray345[local33]);
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)I")
	public int method2008() {
		return this.anInt2888 == -1 ? (this.anIntArray343[8] << 10) + (this.anIntArray345[4] << 20) + (this.anIntArray345[0] << 25) + (this.anIntArray343[0] << 15) + (this.anIntArray343[11] << 5) + this.anIntArray343[1] : Static49.method953(this.anInt2888).anInt1546 + 305419896;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BZ)V")
	public void method2010(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean134 != arg0) {
			this.method1996(-1, arg0, null, this.anIntArray345);
		}
	}
}
