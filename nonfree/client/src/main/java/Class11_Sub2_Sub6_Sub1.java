import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class11_Sub2_Sub6_Sub1 extends Class11_Sub2_Sub6 {

	@OriginalMember(owner = "client!wc", name = "vc", descriptor = "I")
	public int anInt6684;

	@OriginalMember(owner = "client!wc", name = "zc", descriptor = "Lclient!tq;")
	public Class200 aClass200_1;

	@OriginalMember(owner = "client!wc", name = "Fc", descriptor = "I")
	public int anInt6691;

	@OriginalMember(owner = "client!wc", name = "Hc", descriptor = "I")
	private int anInt6693;

	@OriginalMember(owner = "client!wc", name = "Pc", descriptor = "Ljava/lang/String;")
	public String aString62;

	@OriginalMember(owner = "client!wc", name = "ed", descriptor = "Ljava/lang/String;")
	public String aString63;

	@OriginalMember(owner = "client!wc", name = "mc", descriptor = "B")
	private byte aByte76 = 0;

	@OriginalMember(owner = "client!wc", name = "lc", descriptor = "B")
	private byte aByte75 = 0;

	@OriginalMember(owner = "client!wc", name = "Ic", descriptor = "I")
	public int anInt6694 = -1;

	@OriginalMember(owner = "client!wc", name = "Dc", descriptor = "I")
	public int anInt6689 = 0;

	@OriginalMember(owner = "client!wc", name = "Ec", descriptor = "I")
	public int anInt6690 = -1;

	@OriginalMember(owner = "client!wc", name = "oc", descriptor = "I")
	public int anInt6677 = -1;

	@OriginalMember(owner = "client!wc", name = "Kc", descriptor = "I")
	public int anInt6696 = 255;

	@OriginalMember(owner = "client!wc", name = "tc", descriptor = "I")
	public int anInt6682 = -1;

	@OriginalMember(owner = "client!wc", name = "Yc", descriptor = "I")
	public int anInt6708 = 0;

	@OriginalMember(owner = "client!wc", name = "Xc", descriptor = "I")
	public int anInt6707 = 0;

	@OriginalMember(owner = "client!wc", name = "Cc", descriptor = "B")
	private byte aByte77 = 0;

	@OriginalMember(owner = "client!wc", name = "wc", descriptor = "I")
	public int anInt6685 = 0;

	@OriginalMember(owner = "client!wc", name = "Lc", descriptor = "I")
	public int anInt6697 = -1;

	@OriginalMember(owner = "client!wc", name = "Jc", descriptor = "I")
	public int anInt6695 = 0;

	@OriginalMember(owner = "client!wc", name = "ad", descriptor = "I")
	public int anInt6710 = -1;

	@OriginalMember(owner = "client!wc", name = "Vc", descriptor = "I")
	public int anInt6705 = -1;

	@OriginalMember(owner = "client!wc", name = "fd", descriptor = "Z")
	public boolean aBoolean496 = false;

	@OriginalMember(owner = "client!wc", name = "Zc", descriptor = "I")
	public int anInt6709 = -1;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!fp;I)Z")
	private boolean method5851(@OriginalArg(1) Class63 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class67 local11 = this.method5898();
		@Pc(34) Class199 local34 = super.anInt6772 != -1 && super.anInt6761 == 0 ? Static161.method3066(super.anInt6772) : null;
		@Pc(54) Class199 local54 = super.anInt6733 == -1 || this.aBoolean496 || super.aBoolean499 && local34 != null ? null : Static161.method3066(super.anInt6733);
		@Pc(57) int local57 = local11.anInt2121;
		@Pc(60) int local60 = local11.anInt2118;
		if (local57 != 0 || local60 != 0 || local11.anInt2131 != 0 || local11.anInt2125 != 0) {
			arg1 |= 0x7;
		}
		super.aClass3Array3[0] = this.aClass200_1.method5419(local54, local34, super.anInt6794, super.anInt6776, arg0, super.anInt6788, super.anInt6743, super.aClass163Array3, super.anInt6768, Static243.aClass220_2, arg1, super.anInt6747);
		@Pc(114) int local114 = Static25.method1282();
		if (Static268.anInt5269 < 96 && local114 > 50) {
			Static15.method342();
		}
		@Pc(144) int local144;
		if (Static355.anInt6715 != 0 && local114 < 50) {
			local144 = 50 - local114;
			while (Static128.anInt5882 < local144) {
				Static291.aByteArrayArray16[Static128.anInt5882] = new byte[102400];
				Static128.anInt5882++;
			}
			while (Static128.anInt5882 > local144) {
				Static128.anInt5882--;
				Static291.aByteArrayArray16[Static128.anInt5882] = null;
			}
		} else if (Static355.anInt6715 != 0) {
			Static291.aByteArrayArray16 = new byte[50][];
			Static128.anInt5882 = 0;
		}
		if (super.aClass3Array3[0] == null) {
			return false;
		}
		super.anInt6760 = super.aClass3Array3[0].method1245();
		this.method5897(super.aClass3Array3[0]);
		local144 = super.aClass223_7.method6057();
		super.anInt6756 = 0;
		super.anInt6763 = 0;
		super.anInt6749 = 0;
		if (local57 == 0 && local60 == 0) {
			this.method5888(this.method5894() << 7, this.method5894() << 7, local144);
		} else {
			this.method5888(local57, local60, local144);
			if (super.anInt6749 != 0) {
				super.aClass3Array3[0].method1239(super.anInt6749);
			}
			if (super.anInt6756 != 0) {
				super.aClass3Array3[0].method1253(super.anInt6756);
			}
			if (super.anInt6763 != 0) {
				super.aClass3Array3[0].method1241(0, super.anInt6763, 0);
			}
		}
		super.aClass3Array3[1] = null;
		if (!this.aBoolean496 && super.anInt6795 != -1 && super.anInt6778 != -1) {
			@Pc(309) Class109 local309 = Static345.method5752(super.anInt6795);
			@Pc(328) Class3 local328 = local309.method2993((local309.aBoolean220 ? 7 : 2) | local7, super.anInt6782, super.anInt6748, super.anInt6778, arg0);
			if (local328 != null) {
				local328.method1241(0, -super.anInt6734, 0);
				if (local309.aBoolean220 && (local57 != 0 || local60 != 0)) {
					if (super.anInt6749 != 0) {
						local328.method1239(super.anInt6749);
					}
					if (super.anInt6756 != 0) {
						local328.method1253(super.anInt6756);
					}
					if (super.anInt6763 != 0) {
						local328.method1241(0, super.anInt6763, 0);
					}
				}
				super.aClass3Array3[1] = local328;
			}
		}
		super.aClass3Array3[2] = null;
		if (!this.aBoolean496 && super.aClass1_Sub41_3 != null) {
			if (Static51.anInt1301 >= super.aClass1_Sub41_3.anInt6214) {
				super.aClass1_Sub41_3 = null;
			} else if (super.aClass1_Sub41_3.anInt6226 <= Static51.anInt1301) {
				@Pc(412) Class3 local412 = super.aClass1_Sub41_3.method5565(local7 | 0x7, arg0);
				if (local412 != null) {
					local412.method1241(super.aClass1_Sub41_3.anInt6230 - super.anInt6729, super.aClass1_Sub41_3.anInt6211 + -super.anInt6727, -super.anInt6726 + super.aClass1_Sub41_3.anInt6210);
					if (local144 != 0) {
						local412.method1249(-local144 & 0x3FFF);
					}
					super.aClass3Array3[2] = local412;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V")
	@Override
	public void method5911() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILclient!m;ILclient!fp;ILclient!bi;)V")
	private void method5852(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class129 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class63 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class3 arg6) {
		@Pc(11) int local11 = arg0 * arg0 + arg5 * arg5;
		if (local11 < 16 || local11 > arg1) {
			return;
		}
		@Pc(34) int local34 = (int) (Math.atan2((double) arg5, (double) arg0) * 2607.5945876176133D) & 0x3FFF;
		@Pc(53) Class3 local53 = Static18.method518(arg6, super.anInt6726, super.anInt6763, super.anInt6756, super.anInt6729, super.anInt6727, arg4, super.anInt6749, arg3, local34);
		if (local53 != null) {
			arg4.method4635(false);
			local53.method1242(arg2, null, 0);
			arg4.method4635(true);
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	public String method5853() {
		@Pc(7) String local7 = "";
		if (Static324.aStringArray40 != null) {
			local7 = local7 + Static324.aStringArray40[this.aByte75];
		}
		@Pc(29) int[] local29;
		if (this.aByte76 == 1 && Static217.anIntArray349 != null) {
			local29 = Static217.anIntArray349;
		} else {
			local29 = Static154.anIntArray230;
		}
		if (local29 != null && local29[this.aByte75] != -1) {
			@Pc(48) Class1_Sub4_Sub19 local48 = Static330.method5564(local29[this.aByte75]);
			if (local48.aChar2 == 's') {
				local7 = local7 + local48.method3965(this.aByte77 & 0xFF);
			} else {
				Static119.method2541("gdn1", new Throwable());
				local29[this.aByte75] = -1;
			}
		}
		local7 = local7 + this.aString62;
		if (Static121.aStringArray10 != null) {
			local7 = local7 + Static121.aStringArray10[this.aByte75];
		}
		return local7;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(ILclient!fp;)V")
	@Override
	public void method5912(@OriginalArg(1) Class63 arg0) {
		if (this.aClass200_1 != null && (super.aBoolean503 || this.method5851(arg0, 0))) {
			this.method5889(super.aClass3Array3, super.aBoolean503, arg0);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!fp;Lclient!je;ZIIII)V")
	@Override
	public void method5915(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "(B)I")
	@Override
	protected int method5896() {
		return this.anInt6693;
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5913() {
		return false;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!fp;)Lclient!uq;")
	@Override
	public Class32_Sub7 method5909(@OriginalArg(1) Class63 arg0) {
		if (this.aClass200_1 == null || !this.method5851(arg0, 1024)) {
			return null;
		}
		@Pc(24) Class129 local24 = arg0.method4634();
		@Pc(29) int local29 = super.aClass223_7.method6057();
		local24.method5787(local29);
		local24.method5776(super.anInt6729, super.anInt6727, super.anInt6726);
		@Pc(43) float local43 = arg0.method4621();
		@Pc(46) float local46 = arg0.method4638();
		if (Static61.aBoolean108) {
			@Pc(52) Class67 local52 = this.method5898();
			if (local52.aBoolean148 && (this.aClass200_1.anInt6027 == -1 || Static139.method2817(this.aClass200_1.anInt6027).aBoolean461)) {
				@Pc(85) Class199 local85 = super.anInt6772 != -1 && super.anInt6761 == 0 ? Static161.method3066(super.anInt6772) : null;
				@Pc(105) Class199 local105 = super.anInt6733 == -1 || this.aBoolean496 || super.aBoolean499 && local85 != null ? null : Static161.method3066(super.anInt6733);
				@Pc(139) Class3 local139 = Static28.method696(0, 240, local29, 1, super.anInt6756, super.anInt6749, arg0, super.anInt6763, local105 == null ? local85 : local105, super.aBoolean501, super.aClass3Array3[0], 0, local105 == null ? super.anInt6743 : super.anInt6747, 160);
				if (local139 != null) {
					arg0.method4570(local43, local46 - 128.0F);
					arg0.method4635(false);
					local139.method1242(local24, null, 0);
					arg0.method4635(true);
				}
			}
		}
		if (Static191.aClass11_Sub2_Sub6_Sub1_4 == this) {
			arg0.method4570(local43, local46 - 144.0F);
			local24.method5774(super.anInt6729, super.anInt6727, super.anInt6726);
			for (@Pc(180) int local180 = Static60.aClass101Array1.length - 1; local180 >= 0; local180--) {
				@Pc(186) Class101 local186 = Static60.aClass101Array1[local180];
				if (local186 != null && local186.anInt3095 != -1) {
					@Pc(236) int local236;
					@Pc(225) int local225;
					if (local186.anInt3096 == 1 && local186.anInt3103 >= 0 && local186.anInt3103 < Static231.aClass11_Sub2_Sub6_Sub2Array1.length) {
						@Pc(212) Class11_Sub2_Sub6_Sub2 local212 = Static231.aClass11_Sub2_Sub6_Sub2Array1[local186.anInt3103];
						if (local212 != null) {
							local225 = local212.anInt6729 / 32 - Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6729 / 32;
							local236 = local212.anInt6726 / 32 - Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6726 / 32;
							this.method5852(local236, 360000, local24, local186.anInt3095, arg0, local225, super.aClass3Array3[0]);
						}
					}
					if (local186.anInt3096 == 2) {
						@Pc(271) int local271 = (local186.anInt3098 - Static50.anInt1271) * 4 + 2 - Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6729 / 32;
						local225 = (local186.anInt3094 - Static299.anInt4036) * 4 + 2 - Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6726 / 32;
						local236 = local186.anInt3107 * 4;
						local236 *= local236;
						this.method5852(local225, local236, local24, local186.anInt3095, arg0, local271, super.aClass3Array3[0]);
					}
					if (local186.anInt3096 == 10 && local186.anInt3103 >= 0 && Static275.aClass11_Sub2_Sub6_Sub1Array1.length > local186.anInt3103) {
						@Pc(332) Class11_Sub2_Sub6_Sub1 local332 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local186.anInt3103];
						if (local332 != null) {
							local225 = local332.anInt6729 / 32 - Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6729 / 32;
							local236 = local332.anInt6726 / 32 - Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6726 / 32;
							this.method5852(local236, 360000, local24, local186.anInt3095, arg0, local225, super.aClass3Array3[0]);
						}
					}
				}
			}
			local24.method5787(local29);
			local24.method5776(super.anInt6729, super.anInt6727, super.anInt6726);
		}
		arg0.method4570(local43, local46);
		@Pc(394) Class32_Sub7 local394 = Static67.method1550(super.aClass3Array3.length);
		if (super.aClass32_Sub2_7 == null) {
			arg0.method4636(super.aClass3Array3, local24, local394.aClass32_Sub4Array1, Static191.aClass11_Sub2_Sub6_Sub1_4 == this ? 1 : 0);
		} else {
			@Pc(416) Class26 local416 = super.aClass32_Sub2_7.method1403();
			arg0.method4597(super.aClass3Array3, local416, local24, local394.aClass32_Sub4Array1, Static191.aClass11_Sub2_Sub6_Sub1_4 == this ? 1 : 0);
		}
		this.method5889(super.aClass3Array3, false, arg0);
		if (super.aClass3Array3[2] != null) {
			if (local29 != 0) {
				super.aClass3Array3[2].method1249(local29);
			}
			super.aClass3Array3[2].method1241(super.anInt6729 - super.aClass1_Sub41_3.anInt6230, -super.aClass1_Sub41_3.anInt6211 + super.anInt6727, super.anInt6726 - super.aClass1_Sub41_3.anInt6210);
		}
		return local394;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!fp;III)Z")
	@Override
	public boolean method5914(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass200_1 == null || !this.method5851(arg0, 65536)) {
			return true;
		}
		@Pc(19) Class129 local19 = arg0.method4634();
		@Pc(30) int local30 = super.aClass223_7.method6057();
		local19.method5787(local30);
		local19.method5776(super.anInt6729, super.anInt6727, super.anInt6726);
		for (@Pc(43) int local43 = 0; super.aClass3Array3.length > local43; local43++) {
			if (super.aClass3Array3[local43] != null && super.aClass3Array3[local43].method1283(arg2, arg1, local19, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIBI)V")
	public void method5856(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt6772 != -1 && Static161.method3066(super.anInt6772).anInt6016 == 1) {
			super.anInt6772 = -1;
		}
		if (super.anInt6795 != -1) {
			@Pc(28) Class109 local28 = Static345.method5752(super.anInt6795);
			if (local28.aBoolean221 && local28.anInt3267 != -1 && Static161.method3066(local28.anInt3267).anInt6016 == 1) {
				super.anInt6795 = -1;
			}
		}
		this.anInt6697 = -1;
		if (arg2 < 0 || arg2 >= Static311.anInt5653 || arg0 < 0 || Static189.anInt3820 <= arg0) {
			this.method5860(arg2, arg0);
		} else if (super.anIntArray505[0] >= 0 && Static311.anInt5653 > super.anIntArray505[0] && super.anIntArray504[0] >= 0 && Static189.anInt3820 > super.anIntArray504[0]) {
			if (arg1 == 2) {
				Static79.method1695(arg2, arg0, this);
			}
			this.method5861(arg1, arg0, arg2);
		} else {
			this.method5860(arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	public String method5857() {
		return this.aString63;
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "(B)I")
	@Override
	public int method5877() {
		return super.anInt6760;
	}

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)Z")
	public boolean method5858() {
		return this.aClass200_1 != null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!at;I)V")
	public void method5859(@OriginalArg(0) Class1_Sub7 arg0) {
		arg0.anInt2219 = 0;
		@Pc(12) int local12 = arg0.method2132();
		this.aByte76 = (byte) (local12 & 0x1);
		@Pc(29) boolean local29 = (local12 & 0x2) != 0;
		@Pc(40) boolean local40 = (local12 & 0x4) != 0;
		@Pc(44) int local44 = super.method5894();
		this.method5893((local12 >> 3 & 0x7) + 1);
		this.aByte75 = (byte) (local12 >> 6 & 0x3);
		super.anInt6729 += (this.method5894() - local44) * 64;
		super.anInt6726 += (this.method5894() - local44) * 64;
		this.aByte77 = arg0.method2122();
		this.anInt6705 = arg0.method2122();
		this.anInt6677 = arg0.method2122();
		@Pc(105) int local105 = -1;
		this.anInt6707 = 0;
		@Pc(111) int[] local111 = new int[12];
		@Pc(139) int local139;
		@Pc(146) int local146;
		@Pc(190) int local190;
		for (@Pc(113) int local113 = 0; local113 < 12; local113++) {
			@Pc(124) int local124 = arg0.method2132();
			if (local124 == 0) {
				local111[local113] = 0;
			} else {
				local139 = arg0.method2132();
				local146 = (local124 << 8) + local139;
				if (local113 == 0 && local146 == 65535) {
					local105 = arg0.method2161();
					this.anInt6707 = arg0.method2132();
					break;
				}
				if (local146 >= 32768) {
					local146 = Static133.anIntArray216[local146 - 32768];
					local111[local113] = local146 | 0x40000000;
					local190 = Static243.aClass220_2.method5972(local146).anInt890;
					if (local190 != 0) {
						this.anInt6707 = local190;
					}
				} else {
					local111[local113] = local146 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(215) int[] local215 = new int[5];
		for (local139 = 0; local139 < 5; local139++) {
			local146 = arg0.method2132();
			if (local146 < 0 || Static217.aShortArrayArray6[local139].length <= local146) {
				local146 = 0;
			}
			local215[local139] = local146;
		}
		this.anInt6693 = arg0.method2161();
		this.aString62 = arg0.method2109();
		if (local29) {
			this.aString63 = arg0.method2109();
		} else {
			this.aString63 = this.aString62;
		}
		this.anInt6685 = arg0.method2132();
		if (local40) {
			this.anInt6708 = arg0.method2161();
			this.anInt6695 = this.anInt6685;
			this.anInt6710 = -1;
		} else {
			this.anInt6708 = 0;
			this.anInt6695 = arg0.method2132();
			this.anInt6710 = arg0.method2132();
			if (this.anInt6710 == 255) {
				this.anInt6710 = -1;
			}
		}
		local146 = this.anInt6689;
		this.anInt6689 = arg0.method2132();
		@Pc(336) int local336;
		if (this.anInt6689 == 0) {
			Static83.method1774(this);
		} else {
			local190 = this.anInt6694;
			@Pc(333) int local333 = this.anInt6690;
			local336 = this.anInt6709;
			@Pc(339) int local339 = this.anInt6682;
			@Pc(342) int local342 = this.anInt6696;
			this.anInt6694 = arg0.method2161();
			this.anInt6690 = arg0.method2161();
			this.anInt6709 = arg0.method2161();
			this.anInt6682 = arg0.method2161();
			this.anInt6696 = arg0.method2132();
			if (this.anInt6689 != local146 || local190 != this.anInt6694 || this.anInt6690 != local333 || local336 != this.anInt6709 || local339 != this.anInt6682 || this.anInt6696 != local342) {
				Static168.method3170(this);
			}
		}
		if (this.aClass200_1 == null) {
			this.aClass200_1 = new Class200();
		}
		local190 = this.aClass200_1.anInt6027;
		@Pc(426) int[] local426 = this.aClass200_1.anIntArray469;
		this.aClass200_1.method5423(this.aByte76 == 1, local105, local111, local215, this.method5896());
		if (local190 != local105) {
			super.anInt6729 = super.anIntArray505[0] * 128 + this.method5894() * 64;
			super.anInt6726 = super.anIntArray504[0] * 128 + this.method5894() * 64;
		}
		if (Static352.anInt1802 == super.anInt6792 && local426 != null) {
			for (local336 = 0; local336 < local215.length; local336++) {
				if (local426[local336] != local215[local336]) {
					Static243.aClass220_2.method5976();
					break;
				}
			}
		}
		if (super.aClass32_Sub2_7 != null) {
			super.aClass32_Sub2_7.method1406();
		}
		if (super.anInt6733 == -1 || !super.aBoolean499) {
			return;
		}
		@Pc(529) Class67 local529 = this.method5898();
		if (!local529.method2064(super.anInt6733)) {
			super.aBoolean499 = false;
			super.anInt6733 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)I")
	@Override
	public int method5894() {
		return this.aClass200_1 == null || this.aClass200_1.anInt6027 == -1 ? super.method5894() : Static139.method2817(this.aClass200_1.anInt6027).anInt6162;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BII)V")
	public void method5860(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.anInt6797 = 0;
		super.anInt6798 = 0;
		super.anInt6796 = 0;
		super.anIntArray505[0] = arg0;
		super.anIntArray504[0] = arg1;
		@Pc(32) int local32 = this.method5894();
		super.anInt6729 = super.anIntArray505[0] * 128 + local32 * 64;
		super.anInt6726 = local32 * 64 + super.anIntArray504[0] * 128;
		if (Static191.aClass11_Sub2_Sub6_Sub1_4 == this) {
			Static119.method2539();
		}
		if (super.aClass32_Sub2_7 != null) {
			super.aClass32_Sub2_7.method1406();
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)I")
	@Override
	public int method5886() {
		return -1;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BIIB)V")
	public void method5861(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (super.anInt6798 < 9) {
			super.anInt6798++;
		}
		for (@Pc(18) int local18 = super.anInt6798; local18 > 0; local18--) {
			super.anIntArray505[local18] = super.anIntArray505[local18 - 1];
			super.anIntArray504[local18] = super.anIntArray504[local18 - 1];
			super.aByteArray97[local18] = super.aByteArray97[local18 - 1];
		}
		super.anIntArray505[0] = arg2;
		super.aByteArray97[0] = arg0;
		super.anIntArray504[0] = arg1;
	}
}
