import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class1_Sub2_Sub6_Sub2 extends Class1_Sub2_Sub6 {

	@OriginalMember(owner = "client!wk", name = "Bc", descriptor = "I")
	public int anInt7648;

	@OriginalMember(owner = "client!wk", name = "Dc", descriptor = "I")
	private int anInt7649;

	@OriginalMember(owner = "client!wk", name = "Hc", descriptor = "Ljava/lang/String;")
	public String aString69;

	@OriginalMember(owner = "client!wk", name = "Pc", descriptor = "Lclient!qi;")
	public Class198 aClass198_1;

	@OriginalMember(owner = "client!wk", name = "Qc", descriptor = "Ljava/lang/String;")
	public String aString70;

	@OriginalMember(owner = "client!wk", name = "ud", descriptor = "I")
	public int anInt7683;

	@OriginalMember(owner = "client!wk", name = "zc", descriptor = "I")
	public int anInt7646 = 255;

	@OriginalMember(owner = "client!wk", name = "Kc", descriptor = "I")
	public int anInt7655 = 0;

	@OriginalMember(owner = "client!wk", name = "Ac", descriptor = "I")
	public int anInt7647 = -1;

	@OriginalMember(owner = "client!wk", name = "Uc", descriptor = "I")
	public int anInt7662 = 0;

	@OriginalMember(owner = "client!wk", name = "Fc", descriptor = "I")
	public int anInt7651 = 0;

	@OriginalMember(owner = "client!wk", name = "Gc", descriptor = "I")
	public int anInt7652 = -1;

	@OriginalMember(owner = "client!wk", name = "Sc", descriptor = "B")
	private byte aByte106 = 0;

	@OriginalMember(owner = "client!wk", name = "Cc", descriptor = "Z")
	public boolean aBoolean512 = false;

	@OriginalMember(owner = "client!wk", name = "Vc", descriptor = "I")
	public int anInt7663 = -1;

	@OriginalMember(owner = "client!wk", name = "Ec", descriptor = "I")
	public int anInt7650 = 0;

	@OriginalMember(owner = "client!wk", name = "jd", descriptor = "I")
	public int anInt7674 = -1;

	@OriginalMember(owner = "client!wk", name = "nd", descriptor = "I")
	public int anInt7678 = -1;

	@OriginalMember(owner = "client!wk", name = "fd", descriptor = "B")
	private byte aByte108 = 0;

	@OriginalMember(owner = "client!wk", name = "dd", descriptor = "Z")
	public boolean aBoolean513 = false;

	@OriginalMember(owner = "client!wk", name = "ad", descriptor = "B")
	private byte aByte107 = 0;

	@OriginalMember(owner = "client!wk", name = "id", descriptor = "I")
	public int anInt7673 = -1;

	@OriginalMember(owner = "client!wk", name = "Jc", descriptor = "I")
	public int anInt7654 = -1;

	@OriginalMember(owner = "client!wk", name = "Ic", descriptor = "I")
	public int anInt7653 = -1;

	@OriginalMember(owner = "client!wk", name = "pd", descriptor = "Z")
	public boolean aBoolean514 = false;

	@OriginalMember(owner = "client!wk", name = "ld", descriptor = "I")
	public int anInt7676 = 0;

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method6247() {
		return false;
	}

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "(I)Z")
	public boolean method6208() {
		return this.aClass198_1 != null;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)V")
	public void method6209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anInt7644 = 0;
		super.anInt7642 = 0;
		super.anIntArray510[0] = arg1;
		super.anInt7641 = 0;
		super.anIntArray509[0] = arg0;
		@Pc(26) int local26 = this.method6204();
		super.anInt7560 = local26 * 64 + super.anIntArray510[0] * 128;
		super.anInt7557 = local26 * 64 + super.anIntArray509[0] * 128;
		if (Static203.aClass1_Sub2_Sub6_Sub2_1 == this) {
			Static106.method4449();
		}
		if (super.aClass23_Sub3_7 != null) {
			super.aClass23_Sub3_7.method2970();
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!qa;II)Z")
	private boolean method6210(@OriginalArg(0) Class167 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class142 local11 = this.method6189();
		@Pc(29) Class261 local29 = super.anInt7612 != -1 && super.anInt7624 == 0 ? Static444.aClass59_3.method1552(super.anInt7612) : null;
		@Pc(50) Class261 local50 = super.anInt7586 == -1 || this.aBoolean513 || super.aBoolean507 && local29 != null ? null : Static444.aClass59_3.method1552(super.anInt7586);
		@Pc(53) int local53 = local11.anInt4156;
		@Pc(56) int local56 = local11.anInt4167;
		if (local53 != 0 || local56 != 0 || local11.anInt4178 != 0 || local11.anInt4172 != 0) {
			arg1 |= 0x7;
		}
		@Pc(97) boolean local97 = super.aByte102 != 0 && super.anInt7638 <= Static172.anInt3107 && Static172.anInt3107 < super.anInt7633;
		if (local97) {
			arg1 |= 0x80000;
		}
		@Pc(138) Class108 local138 = super.aClass108Array3[0] = this.aClass198_1.method4677(super.anInt7588, local29, arg0, super.anInt7617, Static444.aClass59_3, Static158.aClass272_1, super.anInt7576, Static212.aClass238_1, super.anInt7569, super.aClass60Array3, Static119.aClass47_1, super.anInt7620, super.anInt7581, Static421.aClass7_1, local50, arg1, Static118.aClass19_1);
		@Pc(141) int local141 = Static386.method5389();
		if (Static61.anInt1155 < 96 && local141 > 50) {
			Static9.method138();
		}
		@Pc(170) int local170;
		if (Static80.aClass35_1 != Static230.aClass35_2 && local141 < 50) {
			local170 = 50 - local141;
			while (Static376.anInt6360 < local170) {
				Static351.aByteArrayArray24[Static376.anInt6360] = new byte[102400];
				Static376.anInt6360++;
			}
			while (Static376.anInt6360 > local170) {
				Static376.anInt6360--;
				Static351.aByteArrayArray24[Static376.anInt6360] = null;
			}
		} else if (Static80.aClass35_1 != Static230.aClass35_2) {
			Static351.aByteArrayArray24 = new byte[50][];
			Static376.anInt6360 = 0;
		}
		if (local138 == null) {
			return false;
		}
		super.anInt7626 = local138.ja();
		this.method6205(local138);
		local170 = super.aClass234_7.method5422();
		if (local53 == 0 && local56 == 0) {
			this.method6199(0, local170, this.method6204() << 7, 0, this.method6204() << 7);
		} else {
			this.method6199(local11.anInt4160, local170, local53, local11.anInt4152, local56);
			if (super.anInt7573 != 0) {
				local138.E(super.anInt7573);
			}
			if (super.anInt7600 != 0) {
				local138.S(super.anInt7600);
			}
			if (super.anInt7566 != 0) {
				local138.R(0, super.anInt7566, 0);
			}
		}
		if (local97) {
			local138.method4938(super.aByte104, super.aByte103, super.aByte105, super.aByte102 & 0xFF);
		}
		@Pc(323) Class52 local323;
		@Pc(338) boolean local338;
		@Pc(340) int local340;
		@Pc(386) Class108 local386;
		if (this.aBoolean513 || super.anInt7596 == -1 || super.anInt7572 == -1) {
			super.aClass108Array3[1] = null;
		} else {
			local323 = Static387.aClass201_2.method4775(super.anInt7596);
			local338 = local323.aByte12 == 3 && (local53 != 0 || local56 != 0);
			local340 = local7;
			if (local338) {
				local340 = local7 | 0x7;
			} else {
				if (super.anInt7635 != 0) {
					local340 = local7 | 0x5;
				}
				if (super.anInt7631 != 0) {
					local340 |= 0x2;
				}
			}
			local386 = super.aClass108Array3[1] = local323.method1411(arg0, super.anInt7572, super.anInt7604, local340, super.anInt7614, Static444.aClass59_3);
			if (local386 != null) {
				if (super.anInt7631 != 0) {
					local386.R(0, -super.anInt7631 << 0, 0);
				}
				if (super.anInt7635 != 0) {
					local386.l(super.anInt7635 * 2048);
				}
				if (local338) {
					if (super.anInt7573 != 0) {
						local386.E(super.anInt7573);
					}
					if (super.anInt7600 != 0) {
						local386.S(super.anInt7600);
					}
					if (super.anInt7566 != 0) {
						local386.R(0, super.anInt7566, 0);
					}
				}
			}
		}
		if (this.aBoolean513 || super.anInt7605 == -1 || super.anInt7629 == -1) {
			super.aClass108Array3[3] = null;
		} else {
			local323 = Static387.aClass201_2.method4775(super.anInt7605);
			local338 = local323.aByte12 == 3 && (local53 != 0 || local56 != 0);
			local340 = local7;
			if (local338) {
				local340 = local7 | 0x7;
			} else {
				if (super.anInt7584 != 0) {
					local340 = local7 | 0x5;
				}
				if (super.anInt7606 != 0) {
					local340 |= 0x2;
				}
			}
			local386 = super.aClass108Array3[3] = local323.method1410(super.anInt7629, local340, super.anInt7593, arg0, super.anInt7592, Static444.aClass59_3);
			if (local386 != null) {
				if (super.anInt7606 != 0) {
					local386.R(0, -super.anInt7606 << 0, 0);
				}
				if (super.anInt7584 != 0) {
					local386.l(super.anInt7584 * 2048);
				}
				if (local338) {
					if (super.anInt7573 != 0) {
						local386.E(super.anInt7573);
					}
					if (super.anInt7600 != 0) {
						local386.S(super.anInt7600);
					}
					if (super.anInt7566 != 0) {
						local386.R(0, super.anInt7566, 0);
					}
				}
			}
		}
		super.aClass108Array3[2] = null;
		if (!this.aBoolean513 && super.aClass3_Sub47_3 != null) {
			if (Static172.anInt3107 >= super.aClass3_Sub47_3.anInt7701) {
				super.aClass3_Sub47_3 = null;
			} else if (super.aClass3_Sub47_3.anInt7693 <= Static172.anInt3107) {
				@Pc(616) Class108 local616 = super.aClass3_Sub47_3.method6228(arg0, local7 | 0x7);
				if (local616 != null) {
					local616.R(-super.anInt7560 + super.aClass3_Sub47_3.anInt7703, -super.anInt7563 + super.aClass3_Sub47_3.anInt7698, -super.anInt7557 + super.aClass3_Sub47_3.anInt7707);
					if (local170 != 0) {
						local616.l(-local170 & 0x3FFF);
					}
					super.aClass108Array3[2] = local616;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!qa;)Lclient!ou;")
	@Override
	public Class23_Sub5 method6242(@OriginalArg(1) Class167 arg0) {
		if (this.aClass198_1 == null || !this.method6210(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class11 local19 = arg0.method5989();
		@Pc(24) int local24 = super.aClass234_7.method5422();
		local19.s(local24);
		local19.J(super.anInt7560, super.anInt7563, super.anInt7557);
		@Pc(38) float local38 = arg0.I();
		@Pc(41) float local41 = arg0.s();
		@Pc(105) int local105;
		if (Static39.aClass79_Sub1_1.aBoolean151) {
			@Pc(48) Class142 local48 = this.method6189();
			if (local48.aBoolean300 && (this.aClass198_1.anInt5633 == -1 || Static118.aClass19_1.method401(this.aClass198_1.anInt5633).aBoolean326)) {
				@Pc(82) Class261 local82 = super.anInt7612 != -1 && super.anInt7624 == 0 ? Static444.aClass59_3.method1552(super.anInt7612) : null;
				@Pc(103) Class261 local103 = super.anInt7586 == -1 || this.aBoolean513 || super.aBoolean507 && local82 != null ? null : Static444.aClass59_3.method1552(super.anInt7586);
				local105 = 0;
				if (super.anInt7628 != 0) {
					local105 = this.method6191();
				}
				@Pc(148) Class108 local148 = Static21.method6255(local24, local103 == null ? super.anInt7588 : super.anInt7569, 0, super.anInt7566, 0, arg0, local103 == null ? local82 : local103, super.anInt7600, 160, 240, super.anInt7573, local105, 1, super.aClass108Array3[0]);
				if (local148 != null) {
					arg0.PA(local38, local41 - 128.0F);
					arg0.method6011(false);
					local148.method4931(local19, null, 0);
					arg0.method6011(true);
				}
			}
		}
		if (Static203.aClass1_Sub2_Sub6_Sub2_1 == this) {
			arg0.PA(local38, local41 - 144.0F);
			local19.C(super.anInt7560, super.anInt7563, super.anInt7557);
			for (@Pc(189) int local189 = Static138.aClass36Array1.length - 1; local189 >= 0; local189--) {
				@Pc(195) Class36 local195 = Static138.aClass36Array1[local189];
				if (local195 != null && local195.anInt1117 != -1) {
					@Pc(224) int local224;
					if (local195.anInt1123 == 1) {
						@Pc(213) Class3_Sub40 local213 = (Class3_Sub40) Static63.aClass140_37.method3490((long) local195.anInt1122);
						if (local213 != null) {
							@Pc(218) Class1_Sub2_Sub6_Sub1 local218 = local213.aClass1_Sub2_Sub6_Sub1_2;
							local224 = local218.anInt7560 - Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7560;
							@Pc(231) int local231 = local218.anInt7557 - Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7557;
							this.method6217(local19, local195.anInt1117, 5760000, super.aClass108Array3[0], local231, local224, arg0);
						}
					}
					if (local195.anInt1123 == 2) {
						@Pc(259) int local259 = local195.anInt1120 + 64 - Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7560;
						local105 = local195.anInt1126 + 64 - Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7557;
						local224 = local195.anInt1116 << 7;
						local224 *= local224;
						this.method6217(local19, local195.anInt1117, local224, super.aClass108Array3[0], local105, local259, arg0);
					}
					if (local195.anInt1123 == 10 && local195.anInt1122 >= 0 && Static216.aClass1_Sub2_Sub6_Sub2Array1.length > local195.anInt1122) {
						@Pc(313) Class1_Sub2_Sub6_Sub2 local313 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local195.anInt1122];
						if (local313 != null) {
							local105 = local313.anInt7560 - Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7560;
							local224 = local313.anInt7557 - Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7557;
							this.method6217(local19, local195.anInt1117, 5760000, super.aClass108Array3[0], local224, local105, arg0);
						}
					}
				}
			}
			local19.s(local24);
			local19.J(super.anInt7560, super.anInt7563, super.anInt7557);
		}
		arg0.PA(local38, local41);
		@Pc(370) Class23_Sub5 local370 = Static217.method1031(super.aClass108Array3.length);
		if (super.aClass23_Sub3_7 == null) {
			arg0.method6015(super.aClass108Array3, local19, local370.aClass23_Sub6Array1, Static203.aClass1_Sub2_Sub6_Sub2_1 == this ? 1 : 0);
		} else {
			@Pc(377) Class77 local377 = super.aClass23_Sub3_7.method2974();
			arg0.method5950(super.aClass108Array3, local377, local19, local370.aClass23_Sub6Array1, Static203.aClass1_Sub2_Sub6_Sub2_1 == this ? 1 : 0);
		}
		this.method6195(arg0, super.aClass108Array3, false);
		if (super.aClass108Array3[2] != null) {
			if (local24 != 0) {
				super.aClass108Array3[2].l(local24);
			}
			super.aClass108Array3[2].R(super.anInt7560 - super.aClass3_Sub47_3.anInt7703, -super.aClass3_Sub47_3.anInt7698 + super.anInt7563, -super.aClass3_Sub47_3.anInt7707 + super.anInt7557);
		}
		super.anInt7575 = Static463.anInt7797;
		super.aClass108Array3[0] = super.aClass108Array3[1] = super.aClass108Array3[2] = super.aClass108Array3[3] = null;
		return local370;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)I")
	@Override
	public int method6184() {
		return super.anInt7626;
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(Z)I")
	@Override
	public int method6206() {
		return -1;
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)I")
	@Override
	protected int method6194() {
		return this.anInt7649;
	}

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "(B)I")
	@Override
	public int method6204() {
		return this.aClass198_1 == null || this.aClass198_1.anInt5633 == -1 ? super.method6204() : Static118.aClass19_1.method401(this.aClass198_1.anInt5633).anInt4454;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BBII)V")
	public void method6212(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt7612 != -1 && Static444.aClass59_3.method1552(super.anInt7612).anInt7404 == 1) {
			super.anInt7612 = -1;
		}
		@Pc(31) Class52 local31;
		if (super.anInt7596 != -1) {
			local31 = Static387.aClass201_2.method4775(super.anInt7596);
			if (local31.aBoolean92 && local31.anInt1397 != -1 && Static444.aClass59_3.method1552(local31.anInt1397).anInt7404 == 1) {
				super.anInt7596 = -1;
			}
		}
		if (super.anInt7605 != -1) {
			local31 = Static387.aClass201_2.method4775(super.anInt7605);
			if (local31.aBoolean92 && local31.anInt1397 != -1 && Static444.aClass59_3.method1552(local31.anInt1397).anInt7404 == 1) {
				super.anInt7605 = -1;
			}
		}
		this.anInt7647 = -1;
		if (arg2 < 0 || arg2 >= Static373.anInt6324 || arg1 < 0 || arg1 >= Static291.anInt5062) {
			this.method6209(arg1, arg2);
		} else if (super.anIntArray510[0] >= 0 && Static373.anInt6324 > super.anIntArray510[0] && super.anIntArray509[0] >= 0 && super.anIntArray509[0] < Static291.anInt5062) {
			if (arg0 == 2) {
				Static349.method4873(this, arg1, arg2);
			}
			this.method6215(arg2, arg1, arg0);
		} else {
			this.method6209(arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	public String method6213() {
		@Pc(7) String local7 = "";
		if (Static415.aStringArray44 != null) {
			local7 = local7 + Static415.aStringArray44[this.aByte108];
		}
		@Pc(31) int[] local31;
		if (this.aByte107 == 1 && Static37.anIntArray24 != null) {
			local31 = Static37.anIntArray24;
		} else {
			local31 = Static31.anIntArray22;
		}
		if (local31 != null && local31[this.aByte108] != -1) {
			@Pc(51) Class249 local51 = Static150.aClass218_1.method5113(local31[this.aByte108]);
			if (local51.aChar5 == 's') {
				local7 = local7 + local51.method5777(this.aByte106 & 0xFF);
			} else {
				Static120.method1926("gdn1", new Throwable());
				local31[this.aByte108] = -1;
			}
		}
		local7 = local7 + this.aString70;
		if (Static396.aStringArray41 != null) {
			local7 = local7 + Static396.aStringArray41[this.aByte108];
		}
		return local7;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BIILclient!qa;)Z")
	@Override
	public boolean method6245(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class167 arg2) {
		if (this.aClass198_1 == null || !this.method6210(arg2, 131072)) {
			return false;
		}
		@Pc(19) Class11 local19 = arg2.method5989();
		@Pc(24) int local24 = super.aClass234_7.method5422();
		local19.s(local24);
		local19.J(super.anInt7560, super.anInt7563, super.anInt7557);
		@Pc(43) boolean local43 = false;
		for (@Pc(45) int local45 = 0; local45 < super.aClass108Array3.length; local45++) {
			if (super.aClass108Array3[local45] != null && super.aClass108Array3[local45].method4937(arg1, arg0, local19, true)) {
				local43 = true;
				break;
			}
		}
		super.aClass108Array3[0] = super.aClass108Array3[1] = super.aClass108Array3[2] = super.aClass108Array3[3] = null;
		return local43;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6241(@OriginalArg(1) Class167 arg0) {
		if (this.aClass198_1 != null && (super.aBoolean511 || this.method6210(arg0, 0))) {
			this.method6195(arg0, super.aClass108Array3, super.aBoolean511);
			super.aClass108Array3[0] = super.aClass108Array3[1] = super.aClass108Array3[2] = super.aClass108Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!nj;B)V")
	public void method6214(@OriginalArg(0) Class3_Sub25 arg0) {
		arg0.anInt4974 = 0;
		@Pc(12) int local12 = arg0.method4096();
		this.aByte107 = (byte) (local12 & 0x1);
		@Pc(26) boolean local26 = (local12 & 0x2) != 0;
		@Pc(37) boolean local37 = (local12 & 0x4) != 0;
		@Pc(41) int local41 = super.method6204();
		this.method6203((local12 >> 3 & 0x7) + 1);
		this.aByte108 = (byte) (local12 >> 6 & 0x3);
		super.anInt7560 += this.method6204() - local41 << 6;
		super.anInt7557 += this.method6204() - local41 << 6;
		this.aByte106 = arg0.method4097();
		this.anInt7652 = arg0.method4097();
		this.anInt7678 = arg0.method4097();
		@Pc(115) int local115 = -1;
		this.anInt7655 = 0;
		@Pc(121) int[] local121 = new int[12];
		@Pc(144) int local144;
		@Pc(151) int local151;
		@Pc(193) int local193;
		for (@Pc(123) int local123 = 0; local123 < 12; local123++) {
			@Pc(129) int local129 = arg0.method4096();
			if (local129 == 0) {
				local121[local123] = 0;
			} else {
				local144 = arg0.method4096();
				local151 = (local129 << 8) + local144;
				if (local123 == 0 && local151 == 65535) {
					local115 = arg0.method4083();
					this.anInt7655 = arg0.method4096();
					break;
				}
				if (local151 >= 32768) {
					local151 = Static332.anIntArray347[local151 - 32768];
					local121[local123] = local151 | 0x40000000;
					local193 = Static158.aClass272_1.method6283(local151).anInt6028;
					if (local193 != 0) {
						this.anInt7655 = local193;
					}
				} else {
					local121[local123] = local151 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(220) int[] local220 = new int[5];
		for (local144 = 0; local144 < 5; local144++) {
			local151 = arg0.method4096();
			if (local151 < 0 || local151 >= Static417.aShortArrayArray9[local144].length) {
				local151 = 0;
			}
			local220[local144] = local151;
		}
		this.anInt7649 = arg0.method4083();
		this.aString70 = arg0.method4073();
		if (local26) {
			this.aString69 = arg0.method4073();
		} else {
			this.aString69 = this.aString70;
		}
		this.anInt7651 = arg0.method4096();
		if (local37) {
			this.anInt7650 = arg0.method4083();
			this.anInt7676 = this.anInt7651;
			this.anInt7654 = -1;
		} else {
			this.anInt7650 = 0;
			this.anInt7676 = arg0.method4096();
			this.anInt7654 = arg0.method4096();
			if (this.anInt7654 == 255) {
				this.anInt7654 = -1;
			}
		}
		local151 = this.anInt7662;
		this.anInt7662 = arg0.method4096();
		@Pc(336) int local336;
		if (this.anInt7662 == 0) {
			Static27.method496(this);
		} else {
			local193 = this.anInt7673;
			@Pc(333) int local333 = this.anInt7663;
			local336 = this.anInt7674;
			@Pc(339) int local339 = this.anInt7653;
			@Pc(342) int local342 = this.anInt7646;
			this.anInt7673 = arg0.method4083();
			this.anInt7663 = arg0.method4083();
			this.anInt7674 = arg0.method4083();
			this.anInt7653 = arg0.method4083();
			this.anInt7646 = arg0.method4096();
			if (this.anInt7662 != local151 || local193 != this.anInt7673 || this.anInt7663 != local333 || this.anInt7674 != local336 || this.anInt7653 != local339 || this.anInt7646 != local342) {
				Static210.method3183(this);
			}
		}
		if (this.aClass198_1 == null) {
			this.aClass198_1 = new Class198();
		}
		local193 = this.aClass198_1.anInt5633;
		@Pc(419) int[] local419 = this.aClass198_1.anIntArray349;
		this.aClass198_1.method4673(local115, this.aByte107 == 1, local121, local220, this.method6194());
		if (local115 != local193) {
			super.anInt7560 = (super.anIntArray510[0] << 7) + (this.method6204() << 6);
			super.anInt7557 = (super.anIntArray509[0] << 7) + (this.method6204() << 6);
		}
		if (Static317.anInt5364 == super.anInt7621 && local419 != null) {
			for (local336 = 0; local336 < local220.length; local336++) {
				if (local220[local336] != local419[local336]) {
					Static158.aClass272_1.method6281();
					break;
				}
			}
		}
		if (super.aClass23_Sub3_7 != null) {
			super.aClass23_Sub3_7.method2970();
		}
		if (super.anInt7586 == -1 || !super.aBoolean507) {
			return;
		}
		@Pc(529) Class142 local529 = this.method6189();
		if (!local529.method3513(super.anInt7586)) {
			super.aBoolean507 = false;
			super.anInt7586 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIBB)V")
	public void method6215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (super.anInt7644 < 9) {
			super.anInt7644++;
		}
		for (@Pc(18) int local18 = super.anInt7644; local18 > 0; local18--) {
			super.anIntArray510[local18] = super.anIntArray510[local18 - 1];
			super.anIntArray509[local18] = super.anIntArray509[local18 - 1];
			super.aByteArray122[local18] = super.aByteArray122[local18 - 1];
		}
		super.anIntArray510[0] = arg0;
		super.aByteArray122[0] = arg2;
		super.anIntArray509[0] = arg1;
	}

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "(I)V")
	@Override
	public void method6244() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!a;IIILclient!qa;Z)V")
	@Override
	public void method6248(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class167 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BLclient!n;IILclient!ka;IILclient!qa;)V")
	private void method6217(@OriginalArg(1) Class11 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class108 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class167 arg6) {
		@Pc(19) int local19 = arg4 * arg4 + arg5 * arg5;
		if (local19 < 16384 || arg2 < local19) {
			return;
		}
		@Pc(43) int local43 = (int) (Math.atan2((double) arg5, (double) arg4) * 2607.5945876176133D) & 0x3FFF;
		@Pc(55) Class108 local55 = Static195.method3029(local43, super.anInt7573, super.anInt7600, arg6, arg1, super.anInt7566);
		if (local55 != null) {
			arg6.method6011(false);
			local55.method4931(arg0, null, 0);
			arg6.method6011(true);
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BZ)Ljava/lang/String;")
	public String method6218() {
		return this.aString69;
	}
}
