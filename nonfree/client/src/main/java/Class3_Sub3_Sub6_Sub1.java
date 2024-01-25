import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class3_Sub3_Sub6_Sub1 extends Class3_Sub3_Sub6 {

	@OriginalMember(owner = "client!qh", name = "Jc", descriptor = "Ljava/lang/String;")
	public String aString48;

	@OriginalMember(owner = "client!qh", name = "Sc", descriptor = "I")
	public int anInt5521;

	@OriginalMember(owner = "client!qh", name = "Uc", descriptor = "Lclient!eu;")
	public Class73 aClass73_1;

	@OriginalMember(owner = "client!qh", name = "ed", descriptor = "I")
	public int anInt5531;

	@OriginalMember(owner = "client!qh", name = "hd", descriptor = "I")
	private int anInt5534;

	@OriginalMember(owner = "client!qh", name = "ld", descriptor = "Ljava/lang/String;")
	public String aString49;

	@OriginalMember(owner = "client!qh", name = "Cc", descriptor = "I")
	public int anInt5510 = 255;

	@OriginalMember(owner = "client!qh", name = "wc", descriptor = "I")
	public int anInt5504 = 0;

	@OriginalMember(owner = "client!qh", name = "Lc", descriptor = "B")
	private byte aByte79 = 0;

	@OriginalMember(owner = "client!qh", name = "uc", descriptor = "B")
	private byte aByte78 = 0;

	@OriginalMember(owner = "client!qh", name = "zc", descriptor = "I")
	public int anInt5507 = 0;

	@OriginalMember(owner = "client!qh", name = "Pc", descriptor = "Z")
	public boolean aBoolean378 = false;

	@OriginalMember(owner = "client!qh", name = "Mc", descriptor = "Z")
	public boolean aBoolean377 = false;

	@OriginalMember(owner = "client!qh", name = "dd", descriptor = "I")
	public int anInt5530 = -1;

	@OriginalMember(owner = "client!qh", name = "fd", descriptor = "I")
	public int anInt5532 = -1;

	@OriginalMember(owner = "client!qh", name = "id", descriptor = "B")
	private byte aByte80 = 0;

	@OriginalMember(owner = "client!qh", name = "ad", descriptor = "I")
	public int anInt5528 = 0;

	@OriginalMember(owner = "client!qh", name = "Wc", descriptor = "I")
	public int anInt5524 = -1;

	@OriginalMember(owner = "client!qh", name = "Qc", descriptor = "I")
	public int anInt5519 = -1;

	@OriginalMember(owner = "client!qh", name = "Xc", descriptor = "I")
	public int anInt5525 = 0;

	@OriginalMember(owner = "client!qh", name = "md", descriptor = "I")
	public int anInt5536 = -1;

	@OriginalMember(owner = "client!qh", name = "cd", descriptor = "Z")
	public boolean aBoolean379 = false;

	@OriginalMember(owner = "client!qh", name = "Nc", descriptor = "I")
	public int anInt5517 = -1;

	@OriginalMember(owner = "client!qh", name = "Hc", descriptor = "I")
	public int anInt5514 = -1;

	@OriginalMember(owner = "client!qh", name = "Rc", descriptor = "I")
	public int anInt5520 = 0;

	@OriginalMember(owner = "client!qh", name = "xc", descriptor = "I")
	public int anInt5505 = -1;

	static {
		new Class231("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!qq;BII)Z")
	@Override
	public boolean method5797(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass73_1 == null || !this.method4696(arg0, 131072)) {
			return true;
		}
		@Pc(21) Class132 local21 = arg0.method3564();
		@Pc(31) int local31 = super.aClass191_7.method4332();
		local21.method3976(local31);
		local21.method3991(super.anInt6675, super.anInt6673, super.anInt6677);
		for (@Pc(44) int local44 = 0; super.aClass39Array3.length > local44; local44++) {
			if (super.aClass39Array3[local44] != null && super.aClass39Array3[local44].method4888(arg1, arg2, local21, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method4685() {
		@Pc(7) String local7 = "";
		if (Static77.aStringArray11 != null) {
			local7 = local7 + Static77.aStringArray11[this.aByte78];
		}
		@Pc(29) int[] local29;
		if (this.aByte79 == 1 && Static287.anIntArray434 != null) {
			local29 = Static287.anIntArray434;
		} else {
			local29 = Static245.anIntArray378;
		}
		if (local29 != null && local29[this.aByte78] != -1) {
			@Pc(49) Class143 local49 = Static35.aClass122_1.method2750(local29[this.aByte78]);
			if (local49.aChar4 == 's') {
				local7 = local7 + local49.method3277(this.aByte80 & 0xFF);
			} else {
				Static40.method799(new Throwable(), "gdn1");
				local29[this.aByte78] = -1;
			}
		}
		local7 = local7 + this.aString49;
		if (Static293.aStringArray34 != null) {
			local7 = local7 + Static293.aStringArray34[this.aByte78];
		}
		return local7;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IBIB)V")
	public void method4686(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt6713 != -1 && Static244.aClass174_2.method4011(super.anInt6713).anInt1997 == 1) {
			super.anInt6713 = -1;
		}
		@Pc(29) Class250 local29;
		if (super.anInt6712 != -1) {
			local29 = Static93.aClass70_1.method1595(super.anInt6712);
			if (local29.aBoolean474 && local29.anInt6999 != -1 && Static244.aClass174_2.method4011(local29.anInt6999).anInt1997 == 1) {
				super.anInt6712 = -1;
			}
		}
		if (super.anInt6710 != -1) {
			local29 = Static93.aClass70_1.method1595(super.anInt6710);
			if (local29.aBoolean474 && local29.anInt6999 != -1 && Static244.aClass174_2.method4011(local29.anInt6999).anInt1997 == 1) {
				super.anInt6710 = -1;
			}
		}
		this.anInt5530 = -1;
		if (arg1 < 0 || Static84.anInt1632 <= arg1 || arg0 < 0 || Static261.anInt4480 <= arg0) {
			this.method4691(arg0, arg1);
		} else if (super.anIntArray582[0] >= 0 && Static84.anInt1632 > super.anIntArray582[0] && super.anIntArray583[0] >= 0 && Static261.anInt4480 > super.anIntArray583[0]) {
			if (arg2 == 2) {
				Static441.method5930(this, arg1, arg0);
			}
			this.method4692(arg2, arg1, arg0);
		} else {
			this.method4691(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)I")
	@Override
	protected int method5510() {
		return this.anInt5534;
	}

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "(I)I")
	@Override
	public int method5503() {
		return super.anInt6698;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)I")
	@Override
	public int method5508() {
		return -1;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method4690() {
		return this.aString48;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLclient!qq;)Lclient!km;")
	@Override
	public Class48_Sub6 method5790(@OriginalArg(1) Class28 arg0) {
		if (this.aClass73_1 == null || !this.method4696(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class132 local19 = arg0.method3564();
		@Pc(24) int local24 = super.aClass191_7.method4332();
		local19.method3976(local24);
		local19.method3991(super.anInt6675, super.anInt6673, super.anInt6677);
		@Pc(38) float local38 = arg0.method3572();
		@Pc(41) float local41 = arg0.method3556();
		if (Static8.aClass173_Sub1_1.aBoolean307) {
			@Pc(48) Class208 local48 = this.method5511();
			if (local48.aBoolean380 && (this.aClass73_1.anInt1802 == -1 || Static336.aClass59_2.method1468(this.aClass73_1.anInt1802).aBoolean17)) {
				@Pc(83) Class83 local83 = super.anInt6713 != -1 && super.anInt6725 == 0 ? Static244.aClass174_2.method4011(super.anInt6713) : null;
				@Pc(104) Class83 local104 = super.anInt6735 == -1 || this.aBoolean379 || super.aBoolean453 && local83 != null ? null : Static244.aClass174_2.method4011(super.anInt6735);
				@Pc(138) Class39 local138 = Static394.method5399(0, super.anInt6722, 240, local104 == null ? local83 : local104, 0, 1, local104 == null ? super.anInt6683 : super.anInt6729, local24, super.anInt6685, super.anInt6744, 160, super.aBoolean452, super.aClass39Array3[0], arg0);
				if (local138 != null) {
					arg0.method3581(local38, local41 - 128.0F);
					arg0.method3483(false);
					local138.method4910(local19, null, 0);
					arg0.method3483(true);
				}
			}
		}
		if (Static134.aClass3_Sub3_Sub6_Sub1_1 == this) {
			arg0.method3581(local38, local41 - 144.0F);
			local19.method3986(super.anInt6675, super.anInt6673, super.anInt6677);
			for (@Pc(179) int local179 = Static190.aClass107Array1.length - 1; local179 >= 0; local179--) {
				@Pc(185) Class107 local185 = Static190.aClass107Array1[local179];
				if (local185 != null && local185.anInt2682 != -1) {
					@Pc(224) int local224;
					@Pc(217) int local217;
					if (local185.anInt2681 == 1 && local185.anInt2683 >= 0 && local185.anInt2683 < Static450.aClass3_Sub3_Sub6_Sub2Array1.length) {
						@Pc(208) Class3_Sub3_Sub6_Sub2 local208 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local185.anInt2683];
						if (local208 != null) {
							local217 = local208.anInt6675 - Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6675;
							local224 = local208.anInt6677 - Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6677;
							this.method4695(local224, local185.anInt2682, arg0, local217, super.aClass39Array3[0], local19, 5760000);
						}
					}
					if (local185.anInt2681 == 2) {
						@Pc(252) int local252 = local185.anInt2688 + 64 - Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6675;
						local217 = local185.anInt2684 + 64 - Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6677;
						local224 = local185.anInt2687 << 7;
						local224 *= local224;
						this.method4695(local217, local185.anInt2682, arg0, local252, super.aClass39Array3[0], local19, local224);
					}
					if (local185.anInt2681 == 10 && local185.anInt2683 >= 0 && Static355.aClass3_Sub3_Sub6_Sub1Array1.length > local185.anInt2683) {
						@Pc(306) Class3_Sub3_Sub6_Sub1 local306 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local185.anInt2683];
						if (local306 != null) {
							local217 = local306.anInt6675 - Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6675;
							local224 = local306.anInt6677 - Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6677;
							this.method4695(local224, local185.anInt2682, arg0, local217, super.aClass39Array3[0], local19, 5760000);
						}
					}
				}
			}
			local19.method3976(local24);
			local19.method3991(super.anInt6675, super.anInt6673, super.anInt6677);
		}
		arg0.method3581(local38, local41);
		@Pc(364) Class48_Sub6 local364 = Static403.method5489(super.aClass39Array3.length);
		if (super.aClass48_Sub1_7 == null) {
			arg0.method3566(super.aClass39Array3, local19, local364.aClass48_Sub7Array1, Static134.aClass3_Sub3_Sub6_Sub1_1 == this ? 1 : 0);
		} else {
			@Pc(371) Class115 local371 = super.aClass48_Sub1_7.method1293();
			arg0.method3501(super.aClass39Array3, local371, local19, local364.aClass48_Sub7Array1, Static134.aClass3_Sub3_Sub6_Sub1_1 == this ? 1 : 0);
		}
		this.method5514(arg0, super.aClass39Array3, false);
		if (super.aClass39Array3[2] != null) {
			if (local24 != 0) {
				super.aClass39Array3[2].method4907(local24);
			}
			super.aClass39Array3[2].method4874(-super.aClass6_Sub28_3.anInt5235 + super.anInt6675, -super.aClass6_Sub28_3.anInt5223 + super.anInt6673, super.anInt6677 - super.aClass6_Sub28_3.anInt5231);
		}
		super.anInt6696 = Static75.anInt1503;
		return local364;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(III)V")
	public void method4691(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.anInt6756 = 0;
		super.anIntArray582[0] = arg1;
		super.anInt6755 = 0;
		super.anInt6757 = 0;
		super.anIntArray583[0] = arg0;
		@Pc(26) int local26 = this.method5512();
		super.anInt6675 = super.anIntArray582[0] * 128 + local26 * 64;
		super.anInt6677 = local26 * 64 + super.anIntArray583[0] * 128;
		if (Static134.aClass3_Sub3_Sub6_Sub1_1 == this) {
			Static121.method1986();
		}
		if (super.aClass48_Sub1_7 != null) {
			super.aClass48_Sub1_7.method1298();
		}
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)I")
	@Override
	public int method5512() {
		return this.aClass73_1 == null || this.aClass73_1.anInt1802 == -1 ? super.method5512() : Static336.aClass59_2.method1468(this.aClass73_1.anInt1802).anInt344;
	}

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)V")
	@Override
	public void method5798() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BBII)V")
	public void method4692(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt6756 < 9) {
			super.anInt6756++;
		}
		for (@Pc(18) int local18 = super.anInt6756; local18 > 0; local18--) {
			super.anIntArray582[local18] = super.anIntArray582[local18 - 1];
			super.anIntArray583[local18] = super.anIntArray583[local18 - 1];
			super.aByteArray86[local18] = super.aByteArray86[local18 - 1];
		}
		super.anIntArray582[0] = arg1;
		super.anIntArray583[0] = arg2;
		super.aByteArray86[0] = arg0;
	}

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "(B)Z")
	public boolean method4693() {
		return this.aClass73_1 != null;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(ZLclient!qq;)V")
	@Override
	public void method5792(@OriginalArg(1) Class28 arg0) {
		if (this.aClass73_1 != null && (super.aBoolean455 || this.method4696(arg0, 0))) {
			this.method5514(arg0, super.aClass39Array3, super.aBoolean455);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLclient!ha;)V")
	public void method4694(@OriginalArg(1) Class6_Sub15 arg0) {
		arg0.anInt3487 = 0;
		@Pc(12) int local12 = arg0.method3111();
		this.aByte79 = (byte) (local12 & 0x1);
		@Pc(29) boolean local29 = (local12 & 0x2) != 0;
		@Pc(37) boolean local37 = (local12 & 0x4) != 0;
		@Pc(43) int local43 = super.method5512();
		this.method5513((local12 >> 3 & 0x7) + 1);
		this.aByte78 = (byte) (local12 >> 6 & 0x3);
		super.anInt6675 += this.method5512() - local43 << 6;
		super.anInt6677 += this.method5512() - local43 << 6;
		this.aByte80 = arg0.method3116();
		this.anInt5514 = arg0.method3116();
		this.anInt5532 = arg0.method3116();
		this.anInt5525 = 0;
		@Pc(109) int local109 = -1;
		@Pc(112) int[] local112 = new int[12];
		@Pc(136) int local136;
		@Pc(142) int local142;
		@Pc(179) int local179;
		for (@Pc(118) int local118 = 0; local118 < 12; local118++) {
			@Pc(124) int local124 = arg0.method3111();
			if (local124 == 0) {
				local112[local118] = 0;
			} else {
				local136 = arg0.method3111();
				local142 = local136 + (local124 << 8);
				if (local118 == 0 && local142 == 65535) {
					local109 = arg0.method3108();
					this.anInt5525 = arg0.method3111();
					break;
				}
				if (local142 >= 32768) {
					local142 = Static259.anIntArray396[local142 - 32768];
					local112[local118] = local142 | 0x40000000;
					local179 = Static354.aClass170_2.method3865(local142).anInt821;
					if (local179 != 0) {
						this.anInt5525 = local179;
					}
				} else {
					local112[local118] = local142 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(203) int[] local203 = new int[5];
		for (local136 = 0; local136 < 5; local136++) {
			local142 = arg0.method3111();
			if (local142 < 0 || Static339.aShortArrayArray6[local136].length <= local142) {
				local142 = 0;
			}
			local203[local136] = local142;
		}
		this.anInt5534 = arg0.method3108();
		this.aString49 = arg0.method3093();
		if (local29) {
			this.aString48 = arg0.method3093();
		} else {
			this.aString48 = this.aString49;
		}
		this.anInt5504 = arg0.method3111();
		if (local37) {
			this.anInt5507 = arg0.method3108();
			this.anInt5536 = -1;
			this.anInt5520 = this.anInt5504;
		} else {
			this.anInt5507 = 0;
			this.anInt5520 = arg0.method3111();
			this.anInt5536 = arg0.method3111();
			if (this.anInt5536 == 255) {
				this.anInt5536 = -1;
			}
		}
		local142 = this.anInt5528;
		this.anInt5528 = arg0.method3111();
		@Pc(318) int local318;
		if (this.anInt5528 == 0) {
			Static248.method3823(this);
		} else {
			local179 = this.anInt5517;
			@Pc(315) int local315 = this.anInt5519;
			local318 = this.anInt5524;
			@Pc(321) int local321 = this.anInt5505;
			@Pc(324) int local324 = this.anInt5510;
			this.anInt5517 = arg0.method3108();
			this.anInt5519 = arg0.method3108();
			this.anInt5524 = arg0.method3108();
			this.anInt5505 = arg0.method3108();
			this.anInt5510 = arg0.method3111();
			if (this.anInt5528 != local142 || local179 != this.anInt5517 || local315 != this.anInt5519 || local318 != this.anInt5524 || local321 != this.anInt5505 || local324 != this.anInt5510) {
				Static12.method163(this);
			}
		}
		if (this.aClass73_1 == null) {
			this.aClass73_1 = new Class73();
		}
		local179 = this.aClass73_1.anInt1802;
		@Pc(415) int[] local415 = this.aClass73_1.anIntArray191;
		this.aClass73_1.method1673(local112, this.aByte79 == 1, local109, local203, this.method5510());
		if (local109 != local179) {
			super.anInt6675 = (super.anIntArray582[0] << 7) + (this.method5512() << 6);
			super.anInt6677 = (super.anIntArray583[0] << 7) + (this.method5512() << 6);
		}
		if (super.anInt6731 == Static251.anInt4268 && local415 != null) {
			for (local318 = 0; local318 < local203.length; local318++) {
				if (local415[local318] != local203[local318]) {
					Static354.aClass170_2.method3864();
					break;
				}
			}
		}
		if (super.aClass48_Sub1_7 != null) {
			super.aClass48_Sub1_7.method1298();
		}
		if (super.anInt6735 == -1 || !super.aBoolean453) {
			return;
		}
		@Pc(520) Class208 local520 = this.method5511();
		if (!local520.method4709(super.anInt6735)) {
			super.aBoolean453 = false;
			super.anInt6735 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILclient!qq;ILclient!cd;BLclient!ql;I)V")
	private void method4695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class28 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class39 arg4, @OriginalArg(6) Class132 arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg0 * arg0 + arg3 * arg3;
		if (local11 < 16384 || local11 > arg6) {
			return;
		}
		@Pc(41) int local41 = (int) (Math.atan2((double) arg3, (double) arg0) * 2607.5945876176133D) & 0x3FFF;
		@Pc(53) Class39 local53 = Static159.method2620(local41, arg1, arg2, super.anInt6685, super.anInt6744, super.anInt6722);
		if (local53 != null) {
			arg2.method3483(false);
			local53.method4910(arg5, null, 0);
			arg2.method3483(true);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!qq;Lclient!ps;ZZII)V")
	@Override
	public void method5794(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class3 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!qq;II)Z")
	private boolean method4696(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class208 local11 = this.method5511();
		@Pc(29) Class83 local29 = super.anInt6713 != -1 && super.anInt6725 == 0 ? Static244.aClass174_2.method4011(super.anInt6713) : null;
		@Pc(49) Class83 local49 = super.anInt6735 == -1 || this.aBoolean379 || super.aBoolean453 && local29 != null ? null : Static244.aClass174_2.method4011(super.anInt6735);
		@Pc(52) int local52 = local11.anInt5577;
		@Pc(55) int local55 = local11.anInt5579;
		if (local52 != 0 || local55 != 0 || local11.anInt5559 != 0 || local11.anInt5592 != 0) {
			arg1 |= 0x7;
		}
		@Pc(92) boolean local92 = super.aByte96 != 0 && Static125.anInt2225 >= super.anInt6732 && super.anInt6743 > Static125.anInt2225;
		if (local92) {
			arg1 |= 0x80000;
		}
		@Pc(133) Class39 local133 = super.aClass39Array3[0] = this.aClass73_1.method1670(local49, super.anInt6723, arg1, Static336.aClass59_2, super.anInt6738, super.anInt6729, super.anInt6683, super.anInt6733, super.aClass38Array3, Static354.aClass170_2, Static255.aClass222_1, arg0, super.anInt6692, Static71.aClass126_1, local29, Static167.aClass223_1, Static244.aClass174_2);
		@Pc(136) int local136 = Static439.method5910();
		if (Static2.anInt8 < 96 && local136 > 50) {
			Static291.method5976();
		}
		@Pc(157) int local157;
		if (Static449.aClass207_11 != Static194.aClass207_8 && local136 < 50) {
			local157 = 50 - local136;
			while (Static9.anInt163 < local157) {
				Static247.aByteArrayArray25[Static9.anInt163] = new byte[102400];
				Static9.anInt163++;
			}
			while (Static9.anInt163 > local157) {
				Static9.anInt163--;
				Static247.aByteArrayArray25[Static9.anInt163] = null;
			}
		} else if (Static449.aClass207_11 != Static194.aClass207_8) {
			Static9.anInt163 = 0;
			Static247.aByteArrayArray25 = new byte[50][];
		}
		if (local133 == null) {
			return false;
		}
		super.anInt6698 = local133.method4875();
		this.method5520(local133);
		local157 = super.aClass191_7.method4332();
		if (local52 == 0 && local55 == 0) {
			this.method5518(this.method5512() << 7, 0, 0, local157, this.method5512() << 7);
		} else {
			this.method5518(local52, local11.anInt5589, local11.anInt5594, local157, local55);
			if (super.anInt6744 != 0) {
				local133.method4883(super.anInt6744);
			}
			if (super.anInt6685 != 0) {
				local133.method4886(super.anInt6685);
			}
			if (super.anInt6722 != 0) {
				local133.method4874(0, super.anInt6722, 0);
			}
		}
		if (local92) {
			local133.method4869(super.aByte95, super.aByte98, super.aByte97, super.aByte96 & 0xFF);
		}
		@Pc(315) Class250 local315;
		@Pc(327) boolean local327;
		@Pc(329) int local329;
		@Pc(369) Class39 local369;
		if (this.aBoolean379 || super.anInt6712 == -1 || super.anInt6717 == -1) {
			super.aClass39Array3[1] = null;
		} else {
			local315 = Static93.aClass70_1.method1595(super.anInt6712);
			local327 = local315.aByte101 == 3 && (local52 != 0 || local55 != 0);
			local329 = local7;
			if (local327) {
				local329 = local7 | 0x7;
			} else {
				if (super.anInt6716 != 0) {
					local329 = local7 | 0x5;
				}
				if (super.anInt6752 != 0) {
					local329 |= 0x2;
				}
			}
			local369 = super.aClass39Array3[1] = local315.method5686(arg0, Static244.aClass174_2, super.anInt6739, super.anInt6724, local329, super.anInt6717);
			if (local369 != null) {
				if (super.anInt6752 != 0) {
					local369.method4874(0, -super.anInt6752 << 0, 0);
				}
				if (super.anInt6716 != 0) {
					local369.method4907(super.anInt6716 * 2048);
				}
				if (local327) {
					if (super.anInt6744 != 0) {
						local369.method4883(super.anInt6744);
					}
					if (super.anInt6685 != 0) {
						local369.method4886(super.anInt6685);
					}
					if (super.anInt6722 != 0) {
						local369.method4874(0, super.anInt6722, 0);
					}
				}
			}
		}
		if (this.aBoolean379 || super.anInt6710 == -1 || super.anInt6680 == -1) {
			super.aClass39Array3[3] = null;
		} else {
			local315 = Static93.aClass70_1.method1595(super.anInt6710);
			local327 = local315.aByte101 == 3 && (local52 != 0 || local55 != 0);
			local329 = local7;
			if (local327) {
				local329 = local7 | 0x7;
			} else {
				if (super.anInt6703 != 0) {
					local329 = local7 | 0x5;
				}
				if (super.anInt6709 != 0) {
					local329 |= 0x2;
				}
			}
			local369 = super.aClass39Array3[3] = local315.method5679(Static244.aClass174_2, super.anInt6680, super.anInt6715, super.anInt6705, arg0, local329);
			if (local369 != null) {
				if (super.anInt6709 != 0) {
					local369.method4874(0, -super.anInt6709 << 0, 0);
				}
				if (super.anInt6703 != 0) {
					local369.method4907(super.anInt6703 * 2048);
				}
				if (local327) {
					if (super.anInt6744 != 0) {
						local369.method4883(super.anInt6744);
					}
					if (super.anInt6685 != 0) {
						local369.method4886(super.anInt6685);
					}
					if (super.anInt6722 != 0) {
						local369.method4874(0, super.anInt6722, 0);
					}
				}
			}
		}
		super.aClass39Array3[2] = null;
		if (!this.aBoolean379 && super.aClass6_Sub28_3 != null) {
			if (super.aClass6_Sub28_3.anInt5229 <= Static125.anInt2225) {
				super.aClass6_Sub28_3 = null;
			} else if (super.aClass6_Sub28_3.anInt5228 <= Static125.anInt2225) {
				@Pc(616) Class39 local616 = super.aClass6_Sub28_3.method4566(arg0, local7 | 0x7);
				if (local616 != null) {
					local616.method4874(super.aClass6_Sub28_3.anInt5235 - super.anInt6675, -super.anInt6673 + super.aClass6_Sub28_3.anInt5223, super.aClass6_Sub28_3.anInt5231 - super.anInt6677);
					if (local157 != 0) {
						local616.method4907(-local157 & 0x3FFF);
					}
					super.aClass39Array3[2] = local616;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5791() {
		return false;
	}
}
