import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bda")
public final class Class15_Sub2_Sub1_Sub1 extends Class15_Sub2_Sub1 {

	@OriginalMember(owner = "client!bda", name = "wc", descriptor = "I")
	private int anInt823;

	@OriginalMember(owner = "client!bda", name = "Lc", descriptor = "Ljava/lang/String;")
	public String aString18;

	@OriginalMember(owner = "client!bda", name = "Oc", descriptor = "Ljava/lang/String;")
	public String aString19;

	@OriginalMember(owner = "client!bda", name = "Sc", descriptor = "I")
	public int anInt840;

	@OriginalMember(owner = "client!bda", name = "Yc", descriptor = "I")
	public int anInt846;

	@OriginalMember(owner = "client!bda", name = "ld", descriptor = "Lclient!qn;")
	public Class248 aClass248_1;

	@OriginalMember(owner = "client!bda", name = "Jc", descriptor = "B")
	private byte aByte18 = 0;

	@OriginalMember(owner = "client!bda", name = "Ec", descriptor = "I")
	public int anInt829 = 0;

	@OriginalMember(owner = "client!bda", name = "Rc", descriptor = "I")
	public int anInt839 = -1;

	@OriginalMember(owner = "client!bda", name = "Bc", descriptor = "B")
	private byte aByte17 = 0;

	@OriginalMember(owner = "client!bda", name = "Nc", descriptor = "I")
	public int anInt836 = 0;

	@OriginalMember(owner = "client!bda", name = "Pc", descriptor = "I")
	public int anInt837 = 255;

	@OriginalMember(owner = "client!bda", name = "Zc", descriptor = "I")
	public int anInt847 = -1;

	@OriginalMember(owner = "client!bda", name = "Kc", descriptor = "I")
	public int anInt834 = -1;

	@OriginalMember(owner = "client!bda", name = "Dc", descriptor = "Z")
	public boolean aBoolean31 = false;

	@OriginalMember(owner = "client!bda", name = "dd", descriptor = "B")
	private byte aByte19 = 0;

	@OriginalMember(owner = "client!bda", name = "id", descriptor = "I")
	public int anInt852 = 0;

	@OriginalMember(owner = "client!bda", name = "md", descriptor = "I")
	public int anInt855 = 0;

	@OriginalMember(owner = "client!bda", name = "hd", descriptor = "I")
	public int anInt851 = 0;

	@OriginalMember(owner = "client!bda", name = "jd", descriptor = "I")
	public int anInt853 = -1;

	@OriginalMember(owner = "client!bda", name = "Tc", descriptor = "I")
	public int anInt841 = -1;

	@OriginalMember(owner = "client!bda", name = "ad", descriptor = "Z")
	public boolean aBoolean32 = false;

	@OriginalMember(owner = "client!bda", name = "cd", descriptor = "I")
	public int anInt848 = -1;

	@OriginalMember(owner = "client!bda", name = "nd", descriptor = "I")
	public int anInt856 = -1;

	@OriginalMember(owner = "client!bda", name = "ed", descriptor = "Z")
	public boolean aBoolean33 = false;

	@OriginalMember(owner = "client!bda", name = "sd", descriptor = "I")
	public int anInt861 = -1;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!qa;I)Lclient!bi;")
	@Override
	public Class30_Sub1 method6858(@OriginalArg(0) Class62 arg0) {
		if (this.aClass248_1 == null || !this.method804(2048, arg0)) {
			return null;
		}
		@Pc(19) Class78 local19 = arg0.method6994();
		@Pc(26) int local26 = super.aClass257_7.method6126();
		local19.ma(local26);
		local19.TA(super.anInt8492, super.anInt8494, super.anInt8493);
		@Pc(40) float local40 = arg0.P();
		@Pc(43) float local43 = arg0.ra();
		@Pc(109) int local109;
		if (Static300.aClass5_Sub28_Sub1_1.aBoolean340) {
			@Pc(50) Class281 local50 = this.method4026();
			if (local50.aBoolean576 && (this.aClass248_1.anInt7240 == -1 || Static204.aClass282_1.method6596(this.aClass248_1.anInt7240).aBoolean639)) {
				@Pc(87) Class31 local87 = super.anInt4711 != -1 && super.anInt4714 == 0 ? Static155.aClass76_2.method2152(super.anInt4711) : null;
				@Pc(107) Class31 local107 = super.anInt4725 == -1 || this.aBoolean32 || super.aBoolean299 && local87 != null ? null : Static155.aClass76_2.method2152(super.anInt4725);
				local109 = 0;
				if (super.anInt4738 != 0) {
					local109 = this.method4033();
				}
				@Pc(149) Class36 local149 = Static491.method6811(local109, local107 == null ? local87 : local107, local26, super.anInt4678, super.anInt4748, 240, 0, super.anInt4688, 1, 160, local107 == null ? super.anInt4709 : super.anInt4682, 0, arg0, super.aClass36Array3[0]);
				if (local149 != null) {
					arg0.la(local40, local43 - 128.0F);
					arg0.method7022(false);
					local149.method7360(local19, null, 0);
					arg0.method7022(true);
				}
			}
		}
		if (Static35.aClass15_Sub2_Sub1_Sub1_1 == this) {
			arg0.la(local40, local43 - 144.0F);
			local19.oa(super.anInt8492, super.anInt8494, super.anInt8493);
			for (@Pc(190) int local190 = Static531.aClass34Array1.length - 1; local190 >= 0; local190--) {
				@Pc(196) Class34 local196 = Static531.aClass34Array1[local190];
				if (local196 != null && local196.anInt979 != -1) {
					@Pc(226) int local226;
					if (local196.anInt976 == 1) {
						@Pc(214) Class5_Sub51 local214 = (Class5_Sub51) Static521.aClass42_42.method1109((long) local196.anInt973);
						if (local214 != null) {
							@Pc(219) Class15_Sub2_Sub1_Sub2 local219 = local214.aClass15_Sub2_Sub1_Sub2_2;
							local226 = local219.anInt8492 - Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8492;
							@Pc(233) int local233 = local219.anInt8493 - Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8493;
							this.method805(super.aClass36Array3[0], local196.anInt979, 5760000, arg0, local226, local19, local233);
						}
					}
					if (local196.anInt976 == 2) {
						@Pc(259) int local259 = local196.anInt978 + 64 - Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8492;
						local109 = local196.anInt972 + 64 - Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8493;
						local226 = local196.anInt980 << 7;
						local226 *= local226;
						this.method805(super.aClass36Array3[0], local196.anInt979, local226, arg0, local259, local19, local109);
					}
					if (local196.anInt976 == 10 && local196.anInt973 >= 0 && Static10.aClass15_Sub2_Sub1_Sub1Array1.length > local196.anInt973) {
						@Pc(308) Class15_Sub2_Sub1_Sub1 local308 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local196.anInt973];
						if (local308 != null) {
							local109 = local308.anInt8492 - Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8492;
							local226 = local308.anInt8493 - Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8493;
							this.method805(super.aClass36Array3[0], local196.anInt979, 5760000, arg0, local109, local19, local226);
						}
					}
				}
			}
			local19.ma(local26);
			local19.TA(super.anInt8492, super.anInt8494, super.anInt8493);
		}
		arg0.la(local40, local43);
		@Pc(365) Class30_Sub1 local365 = Static363.method5549(super.aClass36Array3.length);
		if (super.aClass30_Sub7_4 == null) {
			arg0.method7019(super.aClass36Array3, local19, local365.aClass30_Sub6Array1, Static35.aClass15_Sub2_Sub1_Sub1_1 == this ? 1 : 0);
		} else {
			@Pc(372) Class267 local372 = super.aClass30_Sub7_4.method5906();
			arg0.method7008(super.aClass36Array3, local372, local19, local365.aClass30_Sub6Array1, Static35.aClass15_Sub2_Sub1_Sub1_1 == this ? 1 : 0);
		}
		this.method4029(false, arg0, super.aClass36Array3);
		super.anInt4701 = Static314.anInt4188;
		super.aClass36Array3[0] = super.aClass36Array3[1] = super.aClass36Array3[2] = super.aClass36Array3[3] = null;
		return local365;
	}

	@OriginalMember(owner = "client!bda", name = "e", descriptor = "(I)V")
	@Override
	public void method6860() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bda", name = "h", descriptor = "(I)Z")
	public boolean method797() {
		return this.aClass248_1 != null;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)I")
	@Override
	public int method4035() {
		return this.aClass248_1 == null || this.aClass248_1.anInt7240 == -1 ? super.method4035() : Static204.aClass282_1.method6596(this.aClass248_1.anInt7240).anInt8815;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(BLclient!qa;II)Z")
	@Override
	public boolean method6857(@OriginalArg(1) Class62 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass248_1 == null || !this.method804(131072, arg0)) {
			return false;
		}
		@Pc(19) Class78 local19 = arg0.method6994();
		@Pc(31) int local31 = super.aClass257_7.method6126();
		local19.ma(local31);
		local19.TA(super.anInt8492, super.anInt8494, super.anInt8493);
		@Pc(44) boolean local44 = false;
		for (@Pc(46) int local46 = 0; local46 < super.aClass36Array3.length; local46++) {
			if (super.aClass36Array3[local46] != null && super.aClass36Array3[local46].method7359(arg1, arg2, local19, true)) {
				local44 = true;
				break;
			}
		}
		super.aClass36Array3[0] = super.aClass36Array3[1] = super.aClass36Array3[2] = super.aClass36Array3[3] = null;
		return local44;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6862(@OriginalArg(0) Class62 arg0) {
		if (this.aClass248_1 != null && (super.aBoolean302 || this.method804(0, arg0))) {
			this.method4029(super.aBoolean302, arg0, super.aClass36Array3);
			super.aClass36Array3[0] = super.aClass36Array3[1] = super.aClass36Array3[2] = super.aClass36Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6861() {
		return false;
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(Z)I")
	@Override
	public int method6864() {
		return super.anInt4736;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(BIII)V")
	public void method798(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (super.anInt4711 != -1 && Static155.aClass76_2.method2152(super.anInt4711).anInt932 == 1) {
			super.anInt4711 = -1;
		}
		@Pc(32) Class48 local32;
		if (super.anInt4689 != -1) {
			local32 = Static501.aClass41_2.method1068(super.anInt4689);
			if (local32.aBoolean68 && local32.anInt1218 != -1 && Static155.aClass76_2.method2152(local32.anInt1218).anInt932 == 1) {
				super.anInt4689 = -1;
			}
		}
		if (super.anInt4715 != -1) {
			local32 = Static501.aClass41_2.method1068(super.anInt4715);
			if (local32.aBoolean68 && local32.anInt1218 != -1 && Static155.aClass76_2.method2152(local32.anInt1218).anInt932 == 1) {
				super.anInt4715 = -1;
			}
		}
		this.anInt861 = -1;
		if (arg1 < 0 || Static460.anInt7894 <= arg1 || arg2 < 0 || arg2 >= Static235.anInt4493) {
			this.method800(arg1, arg2);
		} else if (super.anIntArray306[0] >= 0 && super.anIntArray306[0] < Static460.anInt7894 && super.anIntArray307[0] >= 0 && Static235.anInt4493 > super.anIntArray307[0]) {
			if (arg0 == 2) {
				Static445.method6300(this, arg2, arg1);
			}
			this.method801(arg0, arg2, arg1);
		} else {
			this.method800(arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "(Z)I")
	@Override
	protected int method4034() {
		return this.anInt823;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(BZILclient!qa;IILclient!cea;)V")
	@Override
	public void method6859(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class15 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(IIB)V")
	public void method800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anIntArray306[0] = arg0;
		super.anInt4755 = 0;
		super.anInt4756 = 0;
		super.anInt4753 = 0;
		super.anIntArray307[0] = arg1;
		@Pc(32) int local32 = this.method4035();
		super.anInt8493 = super.anIntArray307[0] * 128 + local32 * 64;
		super.anInt8492 = local32 * 64 + super.anIntArray306[0] * 128;
		if (Static35.aClass15_Sub2_Sub1_Sub1_1 == this) {
			Static81.method1438();
		}
		if (super.aClass30_Sub7_4 != null) {
			super.aClass30_Sub7_4.method5910();
		}
	}

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "(I)I")
	@Override
	public int method4032() {
		return -1;
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(BIII)V")
	public void method801(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt4753 < 9) {
			super.anInt4753++;
		}
		for (@Pc(18) int local18 = super.anInt4753; local18 > 0; local18--) {
			super.anIntArray306[local18] = super.anIntArray306[local18 - 1];
			super.anIntArray307[local18] = super.anIntArray307[local18 - 1];
			super.aByteArray59[local18] = super.aByteArray59[local18 - 1];
		}
		super.anIntArray306[0] = arg2;
		super.anIntArray307[0] = arg1;
		super.aByteArray59[0] = arg0;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method802() {
		return this.aString18;
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(ILclient!qa;)Lclient!km;")
	@Override
	public Class175 method6854(@OriginalArg(1) Class62 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!co;B)V")
	public void method803(@OriginalArg(0) Class5_Sub3 arg0) {
		arg0.anInt4960 = 0;
		@Pc(12) int local12 = arg0.method4220();
		this.aByte17 = (byte) (local12 & 0x1);
		@Pc(26) boolean local26 = (local12 & 0x2) != 0;
		@Pc(34) boolean local34 = (local12 & 0x4) != 0;
		@Pc(38) int local38 = super.method4035();
		this.method4030((local12 >> 3 & 0x7) + 1);
		this.aByte18 = (byte) (local12 >> 6 & 0x3);
		super.anInt8492 += this.method4035() - local38 << 6;
		super.anInt8493 += this.method4035() - local38 << 6;
		this.aByte19 = arg0.method4196();
		this.anInt848 = arg0.method4196();
		this.anInt853 = arg0.method4196();
		@Pc(98) int local98 = -1;
		this.anInt829 = 0;
		@Pc(104) int[] local104 = new int[12];
		@Pc(127) int local127;
		@Pc(133) int local133;
		@Pc(177) int local177;
		for (@Pc(106) int local106 = 0; local106 < 12; local106++) {
			@Pc(112) int local112 = arg0.method4220();
			if (local112 == 0) {
				local104[local106] = 0;
			} else {
				local127 = arg0.method4220();
				local133 = local127 + (local112 << 8);
				if (local106 == 0 && local133 == 65535) {
					local98 = arg0.method4227();
					this.anInt829 = arg0.method4220();
					break;
				}
				if (local133 >= 32768) {
					local133 = Static415.anIntArray570[local133 - 32768];
					local104[local106] = local133 | 0x40000000;
					local177 = Static451.aClass67_2.method2006(local133).anInt584;
					if (local177 != 0) {
						this.anInt829 = local177;
					}
				} else {
					local104[local106] = Integer.MIN_VALUE | local133 - 256;
				}
			}
		}
		@Pc(202) int[] local202 = new int[5];
		for (local127 = 0; local127 < 5; local127++) {
			local133 = arg0.method4220();
			if (local133 < 0 || Static130.aShortArrayArray2[local127].length <= local133) {
				local133 = 0;
			}
			local202[local127] = local133;
		}
		this.anInt823 = arg0.method4227();
		this.aString19 = arg0.method4234();
		if (local26) {
			this.aString18 = arg0.method4234();
		} else {
			this.aString18 = this.aString19;
		}
		this.anInt852 = arg0.method4220();
		if (local34) {
			this.anInt836 = arg0.method4227();
			this.anInt851 = this.anInt852;
			this.anInt856 = -1;
		} else {
			this.anInt836 = 0;
			this.anInt851 = arg0.method4220();
			this.anInt856 = arg0.method4220();
			if (this.anInt856 == 255) {
				this.anInt856 = -1;
			}
		}
		local133 = this.anInt855;
		this.anInt855 = arg0.method4220();
		@Pc(322) int local322;
		if (this.anInt855 == 0) {
			Static236.method4044(this);
		} else {
			local177 = this.anInt834;
			@Pc(319) int local319 = this.anInt847;
			local322 = this.anInt839;
			@Pc(325) int local325 = this.anInt841;
			@Pc(328) int local328 = this.anInt837;
			this.anInt834 = arg0.method4227();
			this.anInt847 = arg0.method4227();
			this.anInt839 = arg0.method4227();
			this.anInt841 = arg0.method4227();
			this.anInt837 = arg0.method4220();
			if (local133 != this.anInt855 || this.anInt834 != local177 || local319 != this.anInt847 || local322 != this.anInt839 || local325 != this.anInt841 || this.anInt837 != local328) {
				Static311.method5045(this);
			}
		}
		if (this.aClass248_1 == null) {
			this.aClass248_1 = new Class248();
		}
		local177 = this.aClass248_1.anInt7240;
		@Pc(413) int[] local413 = this.aClass248_1.anIntArray563;
		this.aClass248_1.method5876(local104, local202, this.aByte17 == 1, local98, this.method4034());
		if (local98 != local177) {
			super.anInt8492 = (super.anIntArray306[0] << 7) + (this.method4035() << 6);
			super.anInt8493 = (super.anIntArray307[0] << 7) + (this.method4035() << 6);
		}
		if (Static510.anInt8653 == super.anInt4745 && local413 != null) {
			for (local322 = 0; local322 < local202.length; local322++) {
				if (local202[local322] != local413[local322]) {
					Static451.aClass67_2.method2008();
					break;
				}
			}
		}
		if (super.aClass30_Sub7_4 != null) {
			super.aClass30_Sub7_4.method5910();
		}
		if (super.anInt4725 == -1 || !super.aBoolean299) {
			return;
		}
		@Pc(518) Class281 local518 = this.method4026();
		if (!local518.method6590(super.anInt4725)) {
			super.aBoolean299 = false;
			super.anInt4725 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILclient!qa;Z)Z")
	private boolean method804(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class281 local11 = this.method4026();
		@Pc(26) Class31 local26 = super.anInt4711 != -1 && super.anInt4714 == 0 ? Static155.aClass76_2.method2152(super.anInt4711) : null;
		@Pc(46) Class31 local46 = super.anInt4725 == -1 || this.aBoolean32 || super.aBoolean299 && local26 != null ? null : Static155.aClass76_2.method2152(super.anInt4725);
		@Pc(49) int local49 = local11.anInt8108;
		@Pc(52) int local52 = local11.anInt8128;
		if (local49 != 0 || local52 != 0 || local11.anInt8095 != 0 || local11.anInt8115 != 0) {
			arg0 |= 0x7;
		}
		@Pc(92) boolean local92 = super.aByte48 != 0 && Static481.anInt8318 >= super.lb && Static481.anInt8318 < super.anInt4717;
		if (local92) {
			arg0 |= 0x80000;
		}
		@Pc(133) Class36 local133 = super.aClass36Array3[0] = this.aClass248_1.method5872(Static540.aClass242_1, super.anInt4703, Static261.aClass211_2, Static451.aClass67_2, super.anInt4682, Static155.aClass76_2, super.aClass170Array3, Static201.aClass85_1, Static204.aClass282_1, local26, super.anInt4730, local46, super.anInt4709, arg1, super.anInt4704, super.anInt4677, arg0);
		@Pc(136) int local136 = Static73.method1330();
		if (Static193.anInt3735 < 96 && local136 > 50) {
			Static225.method3576();
		}
		@Pc(167) int local167;
		if (Static134.aClass199_4 != Static124.aClass199_3 && local136 < 50) {
			local167 = 50 - local136;
			while (Static315.anInt6126 < local167) {
				Static246.aByteArrayArray28[Static315.anInt6126] = new byte[102400];
				Static315.anInt6126++;
			}
			while (local167 < Static315.anInt6126) {
				Static315.anInt6126--;
				Static246.aByteArrayArray28[Static315.anInt6126] = null;
			}
		} else if (Static124.aClass199_3 != Static134.aClass199_4) {
			Static315.anInt6126 = 0;
			Static246.aByteArrayArray28 = new byte[50][];
		}
		if (local133 == null) {
			return false;
		}
		super.anInt4736 = local133.TA();
		this.method4037(local133);
		local167 = super.aClass257_7.method6126();
		if (local49 == 0 && local52 == 0) {
			this.method4042(local167, this.method4035() << 7, 0, 0, this.method4035() << 7);
		} else {
			this.method4042(local167, local49, local11.anInt8125, local11.anInt8104, local52);
			if (super.anInt4688 != 0) {
				local133.D(super.anInt4688);
			}
			if (super.anInt4678 != 0) {
				local133.b(super.anInt4678);
			}
			if (super.anInt4748 != 0) {
				local133.ca(0, super.anInt4748, 0);
			}
		}
		if (local92) {
			local133.method7352(super.aByte50, super.aByte49, super.aByte47, super.aByte48 & 0xFF);
		}
		@Pc(301) Class48 local301;
		@Pc(315) boolean local315;
		@Pc(317) int local317;
		@Pc(360) Class36 local360;
		if (this.aBoolean32 || super.anInt4689 == -1 || super.anInt4744 == -1) {
			super.aClass36Array3[1] = null;
		} else {
			local301 = Static501.aClass41_2.method1068(super.anInt4689);
			local315 = local301.aByte31 == 3 && (local49 != 0 || local52 != 0);
			local317 = local7;
			if (local315) {
				local317 = local7 | 0x7;
			} else {
				if (super.anInt4702 != 0) {
					local317 = local7 | 0x5;
				}
				if (super.anInt4699 != 0) {
					local317 |= 0x2;
				}
			}
			local360 = super.aClass36Array3[1] = local301.method1167(local317, super.anInt4726, super.anInt4744, super.anInt4694, arg1, Static155.aClass76_2);
			if (local360 != null) {
				if (super.anInt4699 != 0) {
					local360.ca(0, -super.anInt4699 << 0, 0);
				}
				if (super.anInt4702 != 0) {
					local360.OA(super.anInt4702 * 2048);
				}
				if (local315) {
					if (super.anInt4688 != 0) {
						local360.D(super.anInt4688);
					}
					if (super.anInt4678 != 0) {
						local360.b(super.anInt4678);
					}
					if (super.anInt4748 != 0) {
						local360.ca(0, super.anInt4748, 0);
					}
				}
			}
		}
		if (this.aBoolean32 || super.anInt4715 == -1 || super.anInt4728 == -1) {
			super.aClass36Array3[3] = null;
		} else {
			local301 = Static501.aClass41_2.method1068(super.anInt4715);
			local315 = local301.aByte31 == 3 && (local49 != 0 || local52 != 0);
			local317 = local7;
			if (local315) {
				local317 = local7 | 0x7;
			} else {
				if (super.anInt4727 != 0) {
					local317 = local7 | 0x5;
				}
				if (super.anInt4706 != 0) {
					local317 |= 0x2;
				}
			}
			local360 = super.aClass36Array3[3] = local301.method1173(arg1, super.anInt4728, Static155.aClass76_2, local317, super.anInt4750, super.anInt4710);
			if (local360 != null) {
				if (super.anInt4706 != 0) {
					local360.ca(0, -super.anInt4706 << 0, 0);
				}
				if (super.anInt4727 != 0) {
					local360.OA(super.anInt4727 * 2048);
				}
				if (local315) {
					if (super.anInt4688 != 0) {
						local360.D(super.anInt4688);
					}
					if (super.anInt4678 != 0) {
						local360.b(super.anInt4678);
					}
					if (super.anInt4748 != 0) {
						local360.ca(0, super.anInt4748, 0);
					}
				}
			}
		}
		super.aClass36Array3[2] = null;
		if (!this.aBoolean32 && super.aClass5_Sub32_3 != null) {
			if (Static481.anInt8318 >= super.aClass5_Sub32_3.anInt6217) {
				super.aClass5_Sub32_3 = null;
			} else if (Static481.anInt8318 >= super.aClass5_Sub32_3.anInt6221) {
				@Pc(609) Class36 local609 = super.aClass5_Sub32_3.method5177(arg1, local7 | 0x7);
				if (local609 != null) {
					local609.ca(-super.anInt8492 + super.aClass5_Sub32_3.anInt6220, super.aClass5_Sub32_3.anInt6222 - super.anInt8494, -super.anInt8493 + super.aClass5_Sub32_3.anInt6225);
					if (local167 != 0) {
						local609.OA(-local167 & 0x3FFF);
					}
					super.aClass36Array3[2] = local609;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!r;IIILclient!qa;ILclient!m;I)V")
	private void method805(@OriginalArg(0) Class36 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class62 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class78 arg5, @OriginalArg(7) int arg6) {
		@Pc(20) int local20 = arg4 * arg4 + arg6 * arg6;
		if (local20 < 16384 || local20 > arg2) {
			return;
		}
		@Pc(40) int local40 = (int) (Math.atan2((double) arg4, (double) arg6) * 2607.5945876176133D) & 0x3FFF;
		@Pc(52) Class36 local52 = Static77.method4912(arg1, super.anInt4678, local40, super.anInt4748, super.anInt4688, arg3);
		if (local52 != null) {
			arg3.method7022(false);
			local52.method7360(arg5, null, 0);
			arg3.method7022(true);
		}
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	public String method806() {
		@Pc(12) String local12 = "";
		if (Static75.aStringArray13 != null) {
			local12 = local12 + Static75.aStringArray13[this.aByte18];
		}
		@Pc(36) int[] local36;
		if (this.aByte17 == 1 && Static324.anIntArray467 != null) {
			local36 = Static324.anIntArray467;
		} else {
			local36 = Static101.anIntArray198;
		}
		if (local36 != null && local36[this.aByte18] != -1) {
			@Pc(56) Class254 local56 = Static518.aClass241_1.method5714(local36[this.aByte18]);
			if (local56.aChar4 == 's') {
				local12 = local12 + local56.method6085(this.aByte19 & 0xFF);
			} else {
				Static370.method6434("gdn1", new Throwable());
				local36[this.aByte18] = -1;
			}
		}
		local12 = local12 + this.aString19;
		if (Static513.aStringArray38 != null) {
			local12 = local12 + Static513.aStringArray38[this.aByte18];
		}
		return local12;
	}
}
