import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class4_Sub2_Sub1_Sub2_Sub1 extends Class4_Sub2_Sub1_Sub2 {

	@OriginalMember(owner = "client!bi", name = "Nc", descriptor = "I")
	private int anInt819;

	@OriginalMember(owner = "client!bi", name = "ed", descriptor = "Lclient!ffa;")
	public Class116 aClass116_1;

	@OriginalMember(owner = "client!bi", name = "Jc", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!bi", name = "Kc", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!bi", name = "rd", descriptor = "I")
	public int anInt843;

	@OriginalMember(owner = "client!bi", name = "td", descriptor = "I")
	public int anInt847;

	@OriginalMember(owner = "client!bi", name = "Dc", descriptor = "I")
	public int anInt812 = -1;

	@OriginalMember(owner = "client!bi", name = "cd", descriptor = "Z")
	public boolean aBoolean99 = false;

	@OriginalMember(owner = "client!bi", name = "Wc", descriptor = "I")
	public int anInt816 = -1;

	@OriginalMember(owner = "client!bi", name = "vd", descriptor = "I")
	public int anInt824 = 0;

	@OriginalMember(owner = "client!bi", name = "Mc", descriptor = "B")
	private byte aByte43 = 0;

	@OriginalMember(owner = "client!bi", name = "Zc", descriptor = "I")
	public int anInt826 = 0;

	@OriginalMember(owner = "client!bi", name = "Qc", descriptor = "Z")
	public boolean aBoolean101 = false;

	@OriginalMember(owner = "client!bi", name = "zd", descriptor = "Z")
	public boolean aBoolean102 = false;

	@OriginalMember(owner = "client!bi", name = "Ec", descriptor = "I")
	public int anInt818 = 255;

	@OriginalMember(owner = "client!bi", name = "md", descriptor = "B")
	private byte aByte42 = 0;

	@OriginalMember(owner = "client!bi", name = "Ed", descriptor = "I")
	public int anInt840 = 0;

	@OriginalMember(owner = "client!bi", name = "ad", descriptor = "I")
	public int anInt839 = -1;

	@OriginalMember(owner = "client!bi", name = "id", descriptor = "Z")
	public boolean aBoolean103 = false;

	@OriginalMember(owner = "client!bi", name = "Yc", descriptor = "Z")
	public boolean aBoolean100 = false;

	@OriginalMember(owner = "client!bi", name = "nd", descriptor = "I")
	public int anInt846 = -1;

	@OriginalMember(owner = "client!bi", name = "Dd", descriptor = "I")
	public int anInt836 = -1;

	@OriginalMember(owner = "client!bi", name = "Cc", descriptor = "I")
	public int anInt849 = -1;

	@OriginalMember(owner = "client!bi", name = "Ad", descriptor = "I")
	public int anInt851 = 0;

	@OriginalMember(owner = "client!bi", name = "Uc", descriptor = "Z")
	public boolean aBoolean104 = false;

	@OriginalMember(owner = "client!bi", name = "Cd", descriptor = "B")
	private byte aByte41 = 0;

	@OriginalMember(owner = "client!bi", name = "kd", descriptor = "I")
	public int anInt842 = 0;

	@OriginalMember(owner = "client!bi", name = "dd", descriptor = "I")
	public int anInt848 = -1;

	@OriginalMember(owner = "client!bi", name = "ud", descriptor = "I")
	public int anInt852 = -1;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(I)V")
	public Class4_Sub2_Sub1_Sub2_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub1_Sub2_Sub1() {
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8968() {
		return false;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method729() {
		return this.aString4;
	}

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "(I)I")
	@Override
	public int method2046() {
		return this.aClass116_1 == null || this.aClass116_1.anInt2925 == -1 ? super.method2046() : Static192.aClass41_1.method754(this.aClass116_1.anInt2925, 2).anInt7010;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!et;)V")
	public void method730(@OriginalArg(1) Class2_Sub20 arg0) {
		arg0.anInt9723 = 0;
		@Pc(12) int local12 = arg0.method8581(-17416);
		this.aByte43 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean100;
		this.aBoolean100 = (local12 & 0x2) != 0;
		@Pc(40) boolean local40 = (local12 & 0x4) != 0;
		@Pc(44) int local44 = super.method2046();
		this.method2057((local12 >> 3 & 0x7) + 1);
		this.aByte42 = (byte) (local12 >> 6 & 0x3);
		super.anInt10229 += this.method2046() - local44 << 8;
		super.anInt10228 += this.method2046() - local44 << 8;
		this.aByte41 = arg0.method8536();
		this.anInt816 = arg0.method8536();
		this.anInt849 = arg0.method8536();
		this.aBoolean104 = arg0.method8536() == 1;
		if (Static229.aClass386_6 == Static661.aClass386_10 && Static565.anInt8888 >= 2) {
			this.aBoolean104 = false;
		}
		this.anInt840 = 0;
		@Pc(143) int local143 = -1;
		@Pc(148) int[] local148 = new int[Static227.aClass210_1.anIntArray356.length];
		@Pc(153) Class262[] local153 = new Class262[Static227.aClass210_1.anIntArray356.length];
		@Pc(158) Class203[] local158 = new Class203[Static227.aClass210_1.anIntArray356.length];
		@Pc(174) int local174;
		@Pc(191) int local191;
		@Pc(197) int local197;
		@Pc(248) int local248;
		for (@Pc(160) int local160 = 0; local160 < Static227.aClass210_1.anIntArray356.length; local160++) {
			if (Static227.aClass210_1.anIntArray356[local160] != 1) {
				local174 = arg0.method8581(-17416);
				if (local174 == 0) {
					local148[local160] = 0;
				} else {
					local191 = arg0.method8581(-17416);
					local197 = (local174 << 8) + local191;
					if (local160 == 0 && local197 == 65535) {
						local143 = arg0.method8575();
						this.anInt840 = arg0.method8581(-17416);
						break;
					}
					if (local197 >= 32768) {
						local197 = Static585.anIntArray673[local197 - 32768];
						local148[local160] = local197 | 0x40000000;
						local158[local160] = Static543.aClass37_2.method605(local197);
						local248 = local158[local160].anInt4872;
						if (local248 != 0) {
							this.anInt840 = local248;
						}
					} else {
						local148[local160] = local197 - 256 | Integer.MIN_VALUE;
					}
				}
			}
		}
		if (local143 == -1) {
			local174 = arg0.method8575();
			local191 = 0;
			for (local197 = 0; local197 < Static227.aClass210_1.anIntArray356.length; local197++) {
				if (Static227.aClass210_1.anIntArray356[local197] == 0) {
					if ((local174 & 0x1 << local191) != 0) {
						local153[local197] = Static209.method2950(local158[local197], arg0);
					}
					local191++;
				}
			}
		}
		@Pc(332) int[] local332 = new int[10];
		for (local191 = 0; local191 < 10; local191++) {
			local197 = arg0.method8581(-17416);
			if (Static87.aShortArrayArrayArray1.length <= local191 || local197 < 0 || Static87.aShortArrayArrayArray1[local191][0].length <= local197) {
				local197 = 0;
			}
			local332[local191] = local197;
		}
		this.anInt819 = arg0.method8575();
		this.aString3 = arg0.method8553();
		if (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2 == this) {
			Static247.aString47 = this.aString3;
		}
		this.aString4 = this.aString3;
		this.anInt851 = arg0.method8581(-17416);
		if (local40) {
			this.anInt826 = arg0.method8575();
			if (this.anInt826 == 65535) {
				this.anInt826 = -1;
			}
			this.anInt846 = -1;
			this.anInt824 = this.anInt851;
		} else {
			this.anInt826 = 0;
			this.anInt824 = arg0.method8581(-17416);
			this.anInt846 = arg0.method8581(-17416);
			if (this.anInt846 == 255) {
				this.anInt846 = -1;
			}
		}
		local197 = this.anInt842;
		this.anInt842 = arg0.method8581(-17416);
		@Pc(488) int local488;
		if (this.anInt842 == 0) {
			Static708.method9450(this);
		} else {
			local248 = this.anInt812;
			@Pc(485) int local485 = this.anInt852;
			local488 = this.anInt839;
			@Pc(491) int local491 = this.anInt836;
			@Pc(494) int local494 = this.anInt818;
			this.anInt812 = arg0.method8575();
			this.anInt852 = arg0.method8575();
			this.anInt839 = arg0.method8575();
			this.anInt836 = arg0.method8575();
			this.anInt818 = arg0.method8581(-17416);
			if (this.aBoolean100 != local21 || local197 != this.anInt842 || this.anInt812 != local248 || local485 != this.anInt852 || local488 != this.anInt839 || local491 != this.anInt836 || this.anInt818 != local494) {
				Static112.method1627(this);
			}
		}
		if (this.aClass116_1 == null) {
			this.aClass116_1 = new Class116();
		}
		local248 = this.aClass116_1.anInt2925;
		@Pc(604) int[] local604 = this.aClass116_1.anIntArray221;
		this.aClass116_1.method2543(local148, local332, local143, this.aByte43 == 1, local153, this.method2045());
		if (local143 != local248) {
			super.anInt10229 = (super.anIntArray183[0] << 9) + (this.method2046() << 8);
			super.anInt10228 = (super.anIntArray182[0] << 9) + (this.method2046() << 8);
		}
		if (super.anInt2320 == Class4_Sub2_Sub1_Sub2.lb && local604 != null) {
			for (local488 = 0; local488 < local332.length; local488++) {
				if (local604[local488] != local332[local488]) {
					Static543.aClass37_2.method607();
					break;
				}
			}
		}
		if (super.aClass4_Sub7_4 != null) {
			super.aClass4_Sub7_4.method3634();
		}
		if (!super.aClass53_6.method4094() || !super.aBoolean248) {
			return;
		}
		@Pc(726) Class49 local726 = this.method2064(-113);
		if (!local726.method945(super.aClass53_6.method4088())) {
			super.aClass53_6.method4089(-1);
			super.aBoolean248 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjava/lang/String;II)V")
	public void method731(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		this.method2055(Static280.method6055() * Static519.aClass132_1.anInt3155, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!ka;Lclient!gw;IIBILclient!ha;I)V")
	private void method732(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class145 arg5, @OriginalArg(7) int arg6) {
		@Pc(20) int local20 = arg3 * arg3 + arg4 * arg4;
		if (local20 < 262144 || arg6 < local20) {
			return;
		}
		@Pc(51) int local51 = (int) (Math.atan2((double) arg3, (double) arg4) * 2607.5945876176133D - (double) super.aClass178_7.method3799()) & 0x3FFF;
		@Pc(63) Class45 local63 = Static608.method8326(local51, arg5, super.anInt2326, super.anInt2338, arg2, super.anInt2327);
		if (local63 != null) {
			arg5.C(false);
			local63.method5769(arg1, (Class4_Sub6) null, 0);
			arg5.C(true);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!tl;ILclient!ha;IZIB)V")
	@Override
	public void method8967(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		if (arg6 == 89) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBBI)V")
	public void method733(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt2371 < super.anIntArray183.length - 1) {
			super.anInt2371++;
		}
		for (@Pc(28) int local28 = super.anInt2371; local28 > 0; local28--) {
			super.anIntArray183[local28] = super.anIntArray183[local28 - 1];
			super.anIntArray182[local28] = super.anIntArray182[local28 - 1];
			super.aByteArray27[local28] = super.aByteArray27[local28 - 1];
		}
		super.anIntArray183[0] = arg0;
		super.anIntArray182[0] = arg2;
		super.aByteArray27[0] = arg1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBIB)V")
	public void method734(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		if (super.aClass53_7.method4094() && super.aClass53_7.method4074().anInt8130 == 1) {
			super.anIntArray179 = null;
			super.aClass53_7.method4089(-1);
		}
		if (arg3 < 21) {
			Static50.aClass254_29 = null;
		}
		for (@Pc(40) int local40 = 0; super.aClass315Array3.length > local40; local40++) {
			if (super.aClass315Array3[local40].anInt8456 != -1) {
				@Pc(61) Class347 local61 = Static119.aClass209_1.method4570(super.aClass315Array3[local40].anInt8456);
				if (local61.aBoolean800 && local61.anInt9356 != -1 && Static89.aClass274_1.method6626(local61.anInt9356).anInt8130 == 1) {
					super.aClass315Array3[local40].aClass53_10.method4089(-1);
					super.aClass315Array3[local40].anInt8456 = -1;
				}
			}
		}
		this.anInt848 = -1;
		if (arg0 < 0 || arg0 >= Static426.anInt6942 || arg2 < 0 || arg2 >= Static280.anInt6752) {
			this.method736(arg2, arg0);
		} else if (super.anIntArray183[0] >= 0 && Static426.anInt6942 > super.anIntArray183[0] && super.anIntArray182[0] >= 0 && Static280.anInt6752 > super.anIntArray182[0]) {
			if (arg1 == 2) {
				Static11.method199(arg0, this, arg2);
			}
			this.method733(arg0, arg1, arg2);
		} else {
			this.method736(arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method2048() {
		return Static519.aClass132_1.aBoolean303;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!ha;I)Z")
	private boolean method735(@OriginalArg(1) Class145 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class49 local11 = this.method2064(-52);
		@Pc(29) Class53 local29 = super.aClass53_7.method4094() && !super.aClass53_7.method4075() ? super.aClass53_7 : null;
		@Pc(54) Class53 local54 = !super.aClass53_6.method4094() || this.aBoolean103 || super.aBoolean248 && local29 != null ? null : super.aClass53_6;
		@Pc(57) int local57 = local11.anInt1092;
		@Pc(60) int local60 = local11.anInt1061;
		if (local57 != 0 || local60 != 0 || local11.anInt1079 != 0 || local11.anInt1076 != 0) {
			arg1 |= 0x7;
		}
		@Pc(97) int local97 = super.aClass178_7.method3799();
		@Pc(124) boolean local124 = super.aByte59 != 0 && super.anInt2364 <= Static528.anInt8386 && super.anInt2366 > Static528.anInt8386;
		if (local124) {
			arg1 |= 0x80000;
		}
		@Pc(157) Class45 local157 = super.aClass45Array3[0] = this.aClass116_1.method2531(super.aClass53_Sub1_Sub1Array3, local29, Static378.aClass314_2, local97, Static192.aClass41_1, Static89.aClass274_1, Static91.aClass7_1, Static396.aClass107_1, local54, arg1, Static227.aClass210_1, super.anIntArray181, arg0, Static543.aClass37_2);
		@Pc(160) int local160 = Static136.method1986();
		if (Static510.anInt8117 < 96 && local160 > 50) {
			Static436.method6342();
		}
		if (Static661.aClass386_10 != Static229.aClass386_6 && local160 < 50) {
			@Pc(185) int local185 = 50 - local160;
			while (local185 > Static276.anInt8866) {
				Static648.aByteArrayArray25[Static276.anInt8866] = new byte[102400];
				Static276.anInt8866++;
			}
			while (Static276.anInt8866 > local185) {
				Static276.anInt8866--;
				Static648.aByteArrayArray25[Static276.anInt8866] = null;
			}
		} else if (Static661.aClass386_10 != Static229.aClass386_6) {
			Static276.anInt8866 = 0;
			Static648.aByteArrayArray25 = new byte[50][];
		}
		if (local157 == null) {
			return false;
		}
		super.anInt2322 = local157.fa();
		super.anInt2313 = local157.ma();
		this.method2043(local157);
		if (local57 == 0 && local60 == 0) {
			this.method2062(local97, this.method2046() << 9, 0, this.method2046() << 9, 0);
		} else {
			this.method2062(local97, local60, local11.anInt1091, local57, local11.anInt1080);
			if (super.anInt2326 != 0) {
				local157.FA(super.anInt2326);
			}
			if (super.anInt2327 != 0) {
				local157.VA(super.anInt2327);
			}
			if (super.anInt2338 != 0) {
				local157.H(0, super.anInt2338, 0);
			}
		}
		if (local124) {
			local157.method5748(super.aByte60, super.aByte58, super.aByte61, super.aByte59 & 0xFF);
		}
		if (!this.aBoolean103) {
			this.method2044(local97, local60, local11, arg0, local57, local7, (byte) -28);
		}
		return true;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)V")
	public void method736(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.anInt2369 = 0;
		super.anIntArray183[0] = arg1;
		super.anInt2371 = 0;
		super.anInt2370 = 0;
		super.anIntArray182[0] = arg0;
		@Pc(28) int local28 = this.method2046();
		super.anInt10228 = local28 * 256 + super.anIntArray182[0] * 512;
		super.anInt10229 = super.anIntArray183[0] * 512 + local28 * 256;
		if (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2 == this) {
			Static408.method6014();
		}
		if (super.aClass4_Sub7_4 != null) {
			super.aClass4_Sub7_4.method3634();
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(Lclient!ha;Z)Lclient!it;")
	@Override
	public Class187 method8971(@OriginalArg(0) Class145 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZZ)Ljava/lang/String;")
	public String method738() {
		@Pc(7) String local7 = "";
		if (Static580.aStringArray40 != null) {
			local7 = local7 + Static580.aStringArray40[this.aByte42];
		}
		@Pc(41) int[] local41;
		if (this.aByte43 == 1 && Static45.anIntArray56 != null) {
			local41 = Static45.anIntArray56;
		} else {
			local41 = Static336.anIntArray366;
		}
		if (local41 != null && local41[this.aByte42] != -1) {
			@Pc(63) Class54 local63 = Static10.aClass57_1.method1192(local41[this.aByte42]);
			if (local63.aChar2 == 's') {
				local7 = local7 + local63.method1097(this.aByte41 & 0xFF);
			} else {
				Static329.method4572("gdn1", new Throwable());
				local41[this.aByte42] = -1;
			}
		}
		local7 = local7 + this.aString3;
		if (Static44.aStringArray3 != null) {
			local7 = local7 + Static44.aStringArray3[this.aByte42];
		}
		return local7;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8980(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass116_1 == null || !this.method735(arg0, 131072)) {
			return false;
		}
		@Pc(22) Class86 local22 = arg0.method9699();
		@Pc(27) int local27 = super.aClass178_7.method3799();
		local22.method7023(local27);
		local22.method7020(super.anInt10229, super.anInt10234, super.anInt10228);
		@Pc(40) boolean local40 = false;
		@Pc(42) int local42 = 0;
		if (arg2 != -11191) {
			this.method734(29, (byte) 25, 85, (byte) 11);
		}
		while (local42 < super.aClass45Array3.length) {
			if (super.aClass45Array3[local42] != null && (Static591.aBoolean812 ? super.aClass45Array3[local42].method5743(arg1, arg3, local22, true, 0, Static96.anInt1733) : super.aClass45Array3[local42].method5770(arg1, arg3, local22, true, 0))) {
				local40 = true;
				break;
			}
			local42++;
		}
		for (@Pc(102) int local102 = 0; super.aClass45Array3.length > local102; local102++) {
			super.aClass45Array3[local102] = null;
		}
		return local40;
	}

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "(B)Z")
	public boolean method739() {
		return this.aClass116_1 != null;
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(Z)V")
	@Override
	public void method8973() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "(Z)I")
	@Override
	public int method2042() {
		return -1;
	}

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "(I)I")
	@Override
	protected int method2045() {
		return this.anInt819;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8975(@OriginalArg(1) Class145 arg0) {
		if (this.aClass116_1 == null || !super.aBoolean249 && !this.method735(arg0, 0)) {
			return;
		}
		@Pc(26) Class86 local26 = arg0.method9699();
		local26.method7023(super.aClass178_7.method3799());
		local26.method7020(super.anInt10229, super.anInt10234 - 5, super.anInt10228);
		this.method2059(super.aClass45Array3, local26, super.aBoolean249, arg0);
		for (@Pc(55) int local55 = 0; local55 < super.aClass45Array3.length; local55++) {
			super.aClass45Array3[local55] = null;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLclient!gw;ILclient!ka;Lclient!ha;IIII)V")
	private void method741(@OriginalArg(1) Class86 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class45 arg2, @OriginalArg(4) Class145 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg4 * arg4 + arg6 * arg6;
		if (local11 < 262144 || local11 > arg7) {
			return;
		}
		@Pc(40) int local40 = (int) (Math.atan2((double) arg6, (double) arg4) * 2607.5945876176133D - (double) super.aClass178_7.method3799()) & 0x3FFF;
		@Pc(57) Class45 local57 = Static608.method8326(local40, arg3, super.anInt2326, super.anInt2338, arg1, super.anInt2327);
		if (local57 != null) {
			arg3.C(false);
			local57.method5759(arg0, (Class4_Sub6) null, arg5, 0);
			arg3.C(true);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)Lclient!l;")
	@Override
	public Class217 method2052() {
		if (super.aClass217_3 != null) {
			if (super.aClass217_3.aString60 == null) {
				return null;
			}
			if (Static103.anInt10706 == 0 || Static103.anInt10706 == 3 || Static103.anInt10706 == 1 && Static574.method7978(this.aString4)) {
				return super.aClass217_3;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!ha;B)Lclient!iaa;")
	@Override
	public Class4_Sub8 method8966(@OriginalArg(0) Class145 arg0) {
		if (this.aClass116_1 == null || !this.method735(arg0, 2048)) {
			return null;
		}
		@Pc(22) Class86 local22 = arg0.method9699();
		@Pc(27) int local27 = super.aClass178_7.method3799();
		local22.method7023(local27);
		@Pc(45) Class311 local45 = Static632.aClass311ArrayArrayArray3[super.aByte133][super.anInt10229 >> Static260.anInt4053][super.anInt10228 >> Static260.anInt4053];
		if (local45 == null || local45.aClass4_Sub2_Sub2_1 == null) {
			super.anInt2317 = (int) ((float) super.anInt2317 - (float) super.anInt2317 / 10.0F);
		} else {
			@Pc(60) int local60 = super.anInt2317 - local45.aClass4_Sub2_Sub2_1.aShort86;
			super.anInt2317 = (int) ((float) super.anInt2317 - (float) local60 / 10.0F);
		}
		local22.method7020(super.anInt10229, -super.anInt2317 + super.anInt10234 - 20, super.anInt10228);
		@Pc(103) Class4_Sub8 local103 = null;
		super.aBoolean250 = false;
		if (Static650.aClass2_Sub30_29.aClass11_Sub21_1.method5163() == 1) {
			@Pc(118) Class49 local118 = this.method2064(-77);
			if (local118.aBoolean127 && (this.aClass116_1.anInt2925 == -1 || Static192.aClass41_1.method754(this.aClass116_1.anInt2925, 2).aBoolean590)) {
				@Pc(159) Class53 local159 = super.aClass53_7.method4094() && super.aClass53_7.method4075() ? super.aClass53_7 : null;
				@Pc(179) Class53 local179 = super.aClass53_6.method4094() && (!super.aBoolean248 || local159 == null) ? super.aClass53_6 : null;
				@Pc(205) Class45 local205 = Static190.method2723(160, 1, 240, 0, super.anInt2338, local179 == null ? local159 : local179, local27, 0, super.aClass45Array3[0], super.anInt2326, super.anInt2327, arg0);
				if (local205 != null) {
					local103 = Static118.method1730(super.aClass45Array3.length + 1, true);
					super.aBoolean250 = true;
					arg0.C(false);
					if (Static591.aBoolean812) {
						local205.method5759(local22, local103.aClass4_Sub6Array1[super.aClass45Array3.length], Static96.anInt1733, 0);
					} else {
						local205.method5769(local22, local103.aClass4_Sub6Array1[super.aClass45Array3.length], 0);
					}
					arg0.C(true);
				}
			}
		}
		@Pc(262) int local262;
		if (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2 == this) {
			for (local262 = Static690.aClass350Array1.length - 1; local262 >= 0; local262--) {
				@Pc(268) Class350 local268 = Static690.aClass350Array1[local262];
				if (local268 != null && local268.anInt9435 != -1) {
					@Pc(304) int local304;
					if (local268.anInt9441 == 1) {
						@Pc(292) Class2_Sub49 local292 = (Class2_Sub49) Static467.aClass218_37.method5095((long) local268.anInt9439, 0);
						if (local292 != null) {
							@Pc(297) Class4_Sub2_Sub1_Sub2_Sub2 local297 = local292.aClass4_Sub2_Sub1_Sub2_Sub2_3;
							local304 = local297.anInt10229 - Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10229;
							@Pc(311) int local311 = local297.anInt10228 - Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10228;
							if (Static591.aBoolean812) {
								this.method741(local22, local268.anInt9435, super.aClass45Array3[0], arg0, local311, Static96.anInt1733, local304, 92160000);
							} else {
								this.method732(super.aClass45Array3[0], local22, local268.anInt9435, local304, local311, arg0, 92160000);
							}
						}
					}
					@Pc(366) int local366;
					if (local268.anInt9441 == 2) {
						@Pc(359) int local359 = local268.anInt9443 - Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10229;
						local366 = local268.anInt9434 - Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10228;
						local304 = local268.anInt9442 << 9;
						local304 *= local304;
						if (Static591.aBoolean812) {
							this.method741(local22, local268.anInt9435, super.aClass45Array3[0], arg0, local366, Static96.anInt1733, local359, local304);
						} else {
							this.method732(super.aClass45Array3[0], local22, local268.anInt9435, local359, local366, arg0, local304);
						}
					}
					if (local268.anInt9441 == 10 && local268.anInt9439 >= 0 && local268.anInt9439 < Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1.length) {
						@Pc(442) Class4_Sub2_Sub1_Sub2_Sub1 local442 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local268.anInt9439];
						if (local442 != null) {
							local366 = local442.anInt10229 - Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10229;
							local304 = local442.anInt10228 - Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10228;
							if (Static591.aBoolean812) {
								this.method741(local22, local268.anInt9435, super.aClass45Array3[0], arg0, local304, Static96.anInt1733, local366, 92160000);
							} else {
								this.method732(super.aClass45Array3[0], local22, local268.anInt9435, local366, local304, arg0, 92160000);
							}
						}
					}
				}
			}
			local22.method7023(local27);
			local22.method7020(super.anInt10229, super.anInt10234, super.anInt10228);
		}
		local22.method7023(local27);
		local22.method7020(super.anInt10229, super.anInt10234 - super.anInt2317 - 5, super.anInt10228);
		if (local103 == null) {
			local103 = Static118.method1730(super.aClass45Array3.length, true);
		}
		this.method2059(super.aClass45Array3, local22, false, arg0);
		if (Static591.aBoolean812) {
			for (local262 = 0; super.aClass45Array3.length > local262; local262++) {
				if (super.aClass45Array3[local262] != null) {
					super.aClass45Array3[local262].method5759(local22, local103.aClass4_Sub6Array1[local262], Static96.anInt1733, Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2 == this ? 1 : 0);
				}
			}
		} else {
			for (local262 = 0; local262 < super.aClass45Array3.length; local262++) {
				if (super.aClass45Array3[local262] != null) {
					super.aClass45Array3[local262].method5769(local22, local103.aClass4_Sub6Array1[local262], Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass4_Sub7_4 != null) {
			@Pc(643) Class236 local643 = super.aClass4_Sub7_4.method3640();
			if (Static591.aBoolean812) {
				arg0.method9690(local643, Static96.anInt1733);
			} else {
				arg0.method9666(local643);
			}
		}
		for (local262 = 0; super.aClass45Array3.length > local262; local262++) {
			if (super.aClass45Array3[local262] != null) {
				super.aBoolean250 |= super.aClass45Array3[local262].F();
			}
			super.aClass45Array3[local262] = null;
		}
		if (-123 < -126) {
			this.aString4 = null;
		}
		super.anInt2329 = Static68.anInt1174;
		return local103;
	}
}
