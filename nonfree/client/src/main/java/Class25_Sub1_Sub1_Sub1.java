import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class25_Sub1_Sub1_Sub1 extends Class25_Sub1_Sub1 {

	@OriginalMember(owner = "client!nj", name = "cd", descriptor = "I")
	private int anInt4078;

	@OriginalMember(owner = "client!nj", name = "kd", descriptor = "Lclient!eq;")
	public Class61 aClass61_1;

	@OriginalMember(owner = "client!nj", name = "od", descriptor = "Ljava/lang/String;")
	public String aString237;

	@OriginalMember(owner = "client!nj", name = "wd", descriptor = "Ljava/lang/String;")
	public String aString238;

	@OriginalMember(owner = "client!nj", name = "Sc", descriptor = "I")
	public int anInt4068 = 0;

	@OriginalMember(owner = "client!nj", name = "Mc", descriptor = "B")
	private byte aByte44 = 0;

	@OriginalMember(owner = "client!nj", name = "gd", descriptor = "I")
	public int anInt4082 = -1;

	@OriginalMember(owner = "client!nj", name = "Kc", descriptor = "B")
	private byte aByte43 = 0;

	@OriginalMember(owner = "client!nj", name = "Wc", descriptor = "I")
	public int anInt4072 = 255;

	@OriginalMember(owner = "client!nj", name = "fd", descriptor = "I")
	public int anInt4081 = -1;

	@OriginalMember(owner = "client!nj", name = "dd", descriptor = "I")
	public int anInt4079 = 0;

	@OriginalMember(owner = "client!nj", name = "Rc", descriptor = "I")
	public int anInt4067 = -1;

	@OriginalMember(owner = "client!nj", name = "bd", descriptor = "I")
	public int anInt4077 = 0;

	@OriginalMember(owner = "client!nj", name = "Nc", descriptor = "I")
	public int anInt4063 = -1;

	@OriginalMember(owner = "client!nj", name = "rd", descriptor = "I")
	public int anInt4089 = 0;

	@OriginalMember(owner = "client!nj", name = "ld", descriptor = "I")
	public int anInt4085 = -1;

	@OriginalMember(owner = "client!nj", name = "Qc", descriptor = "I")
	public int anInt4066 = -1;

	@OriginalMember(owner = "client!nj", name = "Uc", descriptor = "I")
	public int anInt4070 = 0;

	@OriginalMember(owner = "client!nj", name = "xd", descriptor = "I")
	public int anInt4093 = -1;

	@OriginalMember(owner = "client!nj", name = "vd", descriptor = "Z")
	public boolean aBoolean289 = false;

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	public String method3678() {
		return this.aString237;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)I")
	@Override
	public int method4646() {
		return this.aClass61_1 == null || this.aClass61_1.anInt1853 == -1 ? super.method4646() : Static2.method5(this.aClass61_1.anInt1853).anInt6566;
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(IZ)Ljava/lang/String;")
	public String method3679() {
		@Pc(16) String local16 = "";
		if (Static205.aStringArray26 != null) {
			local16 = local16 + Static205.aStringArray26[this.aByte43];
		}
		if (Static279.anIntArray406 != null && Static279.anIntArray406[this.aByte43] != -1) {
			@Pc(46) Class5_Sub9_Sub5 local46 = Static66.method1397(Static279.anIntArray406[this.aByte43]);
			if (local46.aChar3 == 's') {
				local16 = local16 + local46.method1764(this.aByte44 & 0xFF);
			} else {
				Static113.method2252(new Throwable(), "gdn1");
				Static279.anIntArray406[this.aByte43] = -1;
			}
		}
		local16 = local16 + this.aString238;
		if (Static213.aStringArray30 != null) {
			local16 = local16 + Static213.aStringArray30[this.aByte43];
		}
		return local16;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IILclient!en;)Z")
	private boolean method3681(@OriginalArg(1) int arg0, @OriginalArg(2) Class59 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class33 local11 = this.method4659();
		@Pc(25) Class17 local25 = super.anInt5312 != -1 && super.anInt5263 == 0 ? Static261.method4492(super.anInt5312) : null;
		@Pc(44) Class17 local44 = super.anInt5276 == -1 || this.aBoolean289 || super.aBoolean405 && local25 != null ? null : Static261.method4492(super.anInt5276);
		@Pc(47) int local47 = local11.anInt978;
		@Pc(50) int local50 = local11.anInt969;
		if (local47 != 0 || local50 != 0 || local11.anInt968 != 0 || local11.anInt986 != 0) {
			arg0 |= 0x7;
		}
		super.aClass101Array3[0] = this.aClass61_1.method1715(local25, super.anInt5281, super.anInt5322, super.aClass146Array3, super.anInt5299, arg0, super.anInt5268, super.anInt5285, local44, super.anInt5298, arg1);
		@Pc(100) int local100 = Static170.method3230();
		if (Static46.anInt1196 < 96 && local100 > 50) {
			Static94.method1998();
		}
		@Pc(127) int local127;
		if (Static54.anInt1335 != 0 && local100 < 50) {
			local127 = 50 - local100;
			while (Static230.anInt4506 < local127) {
				Static269.aByteArrayArray17[Static230.anInt4506] = new byte[102400];
				Static230.anInt4506++;
			}
			while (Static230.anInt4506 > local127) {
				Static230.anInt4506--;
				Static269.aByteArrayArray17[Static230.anInt4506] = null;
			}
		} else if (Static54.anInt1335 != 0) {
			Static269.aByteArrayArray17 = new byte[50][];
			Static230.anInt4506 = 0;
		}
		if (super.aClass101Array3[0] == null) {
			return false;
		}
		super.anInt5274 = super.aClass101Array3[0].method5147();
		this.method4652(super.aClass101Array3[0]);
		local127 = super.aClass131_7.method3517();
		super.anInt5260 = 0;
		super.anInt5331 = 0;
		super.anInt5265 = 0;
		if (local47 == 0 && local50 == 0) {
			this.method4641(this.method4646() << 7, local127, this.method4646() << 7);
		} else {
			this.method4641(local47, local127, local50);
			if (super.anInt5331 != 0) {
				super.aClass101Array3[0].method5144(super.anInt5331);
			}
			if (super.anInt5265 != 0) {
				super.aClass101Array3[0].method5186(super.anInt5265);
			}
			if (super.anInt5260 != 0) {
				super.aClass101Array3[0].method5194(0, super.anInt5260, 0);
			}
		}
		super.aClass101Array3[1] = null;
		if (!this.aBoolean289 && super.anInt5269 != -1 && super.anInt5315 != -1) {
			@Pc(282) Class128 local282 = Static136.method2578(super.anInt5269);
			@Pc(301) Class101 local301 = local282.method3470((local282.aBoolean267 ? 7 : 2) | local7, arg1, super.anInt5330, super.anInt5279, super.anInt5315);
			if (local301 != null) {
				local301.method5194(0, -super.anInt5319, 0);
				if (local282.aBoolean267 && (local47 != 0 || local50 != 0)) {
					if (super.anInt5331 != 0) {
						local301.method5144(super.anInt5331);
					}
					if (super.anInt5265 != 0) {
						local301.method5186(super.anInt5265);
					}
					if (super.anInt5260 != 0) {
						local301.method5194(0, super.anInt5260, 0);
					}
				}
				super.aClass101Array3[1] = local301;
			}
		}
		super.aClass101Array3[2] = null;
		if (!this.aBoolean289 && super.anInterface8_3 != null) {
			if (super.anInt5338 <= Static180.anInt3606) {
				super.anInterface8_3 = null;
			}
			if (super.anInt5335 <= Static180.anInt3606 && super.anInt5338 > Static180.anInt3606) {
				@Pc(403) Class101 local403 = super.anInterface8_3.method5548(local7 | 0x7, arg1);
				if (local403 != null) {
					local403.method5194(super.anInt5345 - super.anInt5769, super.anInt5342 - super.anInt5772, -super.anInt5773 + super.anInt5344);
					if (local127 != 0) {
						local403.method5177(-local127 & 0x3FFF);
					}
					super.aClass101Array3[2] = local403;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILclient!en;)Lclient!ir;")
	@Override
	public Class63_Sub3 method5590(@OriginalArg(1) Class59 arg0) {
		if (this.aClass61_1 == null || !this.method3681(1024, arg0)) {
			return null;
		}
		@Pc(19) Class112 local19 = arg0.method4798();
		@Pc(24) int local24 = super.aClass131_7.method3517();
		local19.method3595(local24);
		local19.method3584(super.anInt5769, super.anInt5772, super.anInt5773);
		@Pc(38) float local38 = arg0.method4808();
		@Pc(41) float local41 = arg0.method4814();
		if (Static267.aBoolean391) {
			@Pc(47) Class33 local47 = this.method4659();
			if (local47.aBoolean67 && (this.aClass61_1.anInt1853 == -1 || Static2.method5(this.aClass61_1.anInt1853).aBoolean485)) {
				@Pc(77) Class17 local77 = super.anInt5312 != -1 && super.anInt5263 == 0 ? Static261.method4492(super.anInt5312) : null;
				@Pc(96) Class17 local96 = super.anInt5276 == -1 || this.aBoolean289 || super.aBoolean405 && local77 != null ? null : Static261.method4492(super.anInt5276);
				@Pc(130) Class101 local130 = Static73.method1594(super.anInt5265, local24, 1, local96 == null ? local77 : local96, 160, super.aBoolean404, 0, arg0, super.anInt5331, 0, 240, local96 == null ? super.anInt5285 : super.anInt5268, super.anInt5260, super.aClass101Array3[0]);
				if (local130 != null) {
					arg0.method4859(local38, local41 - 128.0F);
					arg0.method4825(false);
					local130.method5172(local19, null, 0);
					arg0.method4825(true);
				}
			}
		}
		if (Static85.aClass25_Sub1_Sub1_Sub1_1 == this) {
			arg0.method4859(local38, local41 - 144.0F);
			local19.method3589(super.anInt5769, super.anInt5772, super.anInt5773);
			for (@Pc(171) int local171 = Static141.aClass104Array1.length - 1; local171 >= 0; local171--) {
				@Pc(177) Class104 local177 = Static141.aClass104Array1[local171];
				if (local177 != null && local177.anInt3092 != -1) {
					@Pc(229) int local229;
					@Pc(219) int local219;
					if (local177.anInt3106 == 1 && local177.anInt3095 >= 0 && Static188.aClass25_Sub1_Sub1_Sub2Array1.length > local177.anInt3095) {
						@Pc(207) Class25_Sub1_Sub1_Sub2 local207 = Static188.aClass25_Sub1_Sub1_Sub2Array1[local177.anInt3095];
						if (local207 != null) {
							local219 = local207.anInt5769 / 32 - Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5769 / 32;
							local229 = local207.anInt5773 / 32 - Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5773 / 32;
							this.method3687(local177.anInt3092, local229, local219, super.aClass101Array3[0], local19, arg0, 360000);
						}
					}
					if (local177.anInt3106 == 2) {
						@Pc(265) int local265 = (local177.anInt3105 - Static263.anInt5063) * 4 + 2 - Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5769 / 32;
						local219 = (local177.anInt3100 - Static28.anInt773) * 4 + 2 - Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5773 / 32;
						local229 = local177.anInt3096 * 4;
						local229 *= local229;
						this.method3687(local177.anInt3092, local219, local265, super.aClass101Array3[0], local19, arg0, local229);
					}
					if (local177.anInt3106 == 10 && local177.anInt3095 >= 0 && local177.anInt3095 < Static312.aClass25_Sub1_Sub1_Sub1Array1.length) {
						@Pc(327) Class25_Sub1_Sub1_Sub1 local327 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local177.anInt3095];
						if (local327 != null) {
							local219 = local327.anInt5769 / 32 - Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5769 / 32;
							local229 = local327.anInt5773 / 32 - Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5773 / 32;
							this.method3687(local177.anInt3092, local229, local219, super.aClass101Array3[0], local19, arg0, 360000);
						}
					}
				}
			}
			local19.method3595(local24);
			local19.method3584(super.anInt5769, super.anInt5772, super.anInt5773);
		}
		arg0.method4859(local38, local41);
		@Pc(396) Class63_Sub3 local396 = Static273.method4667(super.aClass101Array3.length);
		if (super.aClass63_Sub5_4 == null) {
			arg0.method4840(super.aClass101Array3, local19, local396.aClass63_Sub7Array1, Static85.aClass25_Sub1_Sub1_Sub1_1 == this ? 1 : 0);
		} else {
			@Pc(418) Class21 local418 = super.aClass63_Sub5_4.method4125();
			arg0.method4856(super.aClass101Array3, local418, local19, local396.aClass63_Sub7Array1, Static85.aClass25_Sub1_Sub1_Sub1_1 == this ? 1 : 0);
		}
		this.method4655(super.aClass101Array3, arg0, false);
		if (super.aClass101Array3[2] != null) {
			if (local24 != 0) {
				super.aClass101Array3[2].method5177(local24);
			}
			super.aClass101Array3[2].method5194(-super.anInt5345 + super.anInt5769, -super.anInt5342 + super.anInt5772, super.anInt5773 - super.anInt5344);
		}
		return local396;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I")
	@Override
	public int method4643() {
		return -1;
	}

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "(I)V")
	@Override
	public void method5588() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(Z)I")
	@Override
	protected int method4639() {
		return this.anInt4078;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!en;I)V")
	@Override
	public void method5583(@OriginalArg(0) Class59 arg0) {
		if (this.aClass61_1 != null && (super.aBoolean406 || this.method3681(0, arg0))) {
			this.method4655(super.aClass101Array3, arg0, super.aBoolean406);
		}
	}

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "(I)Z")
	public boolean method3683() {
		return this.aClass61_1 != null;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BIZII)V")
	public void method3684(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		super.method4658(arg2, arg3, arg0, this.method4646(), arg1);
	}

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "(I)I")
	@Override
	public int method5096() {
		return super.anInt5274;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILclient!en;IBLclient!fs;IZ)V")
	@Override
	public void method5584(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class25 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5585() {
		return false;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILclient!bk;)V")
	public void method3686(@OriginalArg(1) Class5_Sub1 arg0) {
		arg0.anInt2029 = 0;
		@Pc(12) int local12 = arg0.method1832();
		@Pc(16) int local16 = local12 & 0x1;
		@Pc(24) boolean local24 = (local12 & 0x2) != 0;
		@Pc(35) boolean local35 = (local12 & 0x4) != 0;
		@Pc(39) int local39 = super.method4646();
		this.method4644((local12 >> 3 & 0x7) + 1);
		this.aByte43 = (byte) (local12 >> 6 & 0x3);
		super.anInt5769 += (this.method4646() - local39) * 64;
		super.anInt5773 += (this.method4646() - local39) * 64;
		this.aByte44 = arg0.method1863();
		this.anInt4081 = arg0.method1863();
		this.anInt4067 = arg0.method1863();
		this.anInt4068 = 0;
		@Pc(109) int local109 = -1;
		@Pc(112) int[] local112 = new int[12];
		@Pc(132) int local132;
		@Pc(138) int local138;
		@Pc(178) int local178;
		for (@Pc(114) int local114 = 0; local114 < 12; local114++) {
			@Pc(120) int local120 = arg0.method1832();
			if (local120 == 0) {
				local112[local114] = 0;
			} else {
				local132 = arg0.method1832();
				local138 = (local120 << 8) + local132;
				if (local114 == 0 && local138 == 65535) {
					local109 = arg0.method1845();
					this.anInt4068 = arg0.method1832();
					break;
				}
				if (local138 >= 32768) {
					local138 = Static290.anIntArray418[local138 - 32768];
					local112[local114] = local138 | 0x40000000;
					local178 = Static88.method1382(local138).anInt4954;
					if (local178 != 0) {
						this.anInt4068 = local178;
					}
				} else {
					local112[local114] = Integer.MIN_VALUE | local138 - 256;
				}
			}
		}
		@Pc(200) int[] local200 = new int[5];
		for (local132 = 0; local132 < 5; local132++) {
			local138 = arg0.method1832();
			if (local138 < 0 || local138 >= Static165.aShortArrayArray9[local132].length) {
				local138 = 0;
			}
			local200[local132] = local138;
		}
		this.anInt4078 = arg0.method1845();
		this.aString238 = arg0.method1840();
		if (local24) {
			this.aString237 = arg0.method1840();
		} else {
			this.aString237 = this.aString238;
		}
		this.anInt4070 = arg0.method1832();
		if (local35) {
			this.anInt4089 = arg0.method1845();
			this.anInt4063 = -1;
			this.anInt4077 = this.anInt4070;
		} else {
			this.anInt4089 = 0;
			this.anInt4077 = arg0.method1832();
			this.anInt4063 = arg0.method1832();
			if (this.anInt4063 == 255) {
				this.anInt4063 = -1;
			}
		}
		local138 = this.anInt4079;
		this.anInt4079 = arg0.method1832();
		@Pc(314) int local314;
		if (this.anInt4079 == 0) {
			Static296.method5015(this);
		} else {
			local178 = this.anInt4093;
			@Pc(311) int local311 = this.anInt4066;
			local314 = this.anInt4085;
			@Pc(317) int local317 = this.anInt4082;
			@Pc(320) int local320 = this.anInt4072;
			this.anInt4093 = arg0.method1845();
			this.anInt4066 = arg0.method1845();
			this.anInt4085 = arg0.method1845();
			this.anInt4082 = arg0.method1845();
			this.anInt4072 = arg0.method1832();
			if (this.anInt4079 != local138 || local178 != this.anInt4093 || this.anInt4066 != local311 || local314 != this.anInt4085 || this.anInt4082 != local317 || this.anInt4072 != local320) {
				Static103.method2059(this);
			}
		}
		if (this.aClass61_1 == null) {
			this.aClass61_1 = new Class61();
		}
		local178 = this.aClass61_1.anInt1853;
		@Pc(409) int[] local409 = this.aClass61_1.anIntArray101;
		this.aClass61_1.method1717(local16 == 1, local112, local109, local200, this.method4639());
		if (local109 != local178) {
			super.anInt5769 = super.anIntArray402[0] * 128 + this.method4646() * 64;
			super.anInt5773 = super.anIntArray401[0] * 128 + this.method4646() * 64;
		}
		if (super.anInt5287 == 2047 && local409 != null) {
			for (local314 = 0; local314 < local200.length; local314++) {
				if (local200[local314] != local409[local314]) {
					Static125.method2420();
					break;
				}
			}
		}
		if (super.aClass63_Sub5_4 != null) {
			super.aClass63_Sub5_4.method4121();
		}
		if (super.anInt5276 == -1 || !super.aBoolean405) {
			return;
		}
		@Pc(510) Class33 local510 = this.method4659();
		if (!local510.method885(super.anInt5276)) {
			super.aBoolean405 = false;
			super.anInt5276 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIZLclient!mj;Lclient!vr;Lclient!en;I)V")
	private void method3687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class101 arg3, @OriginalArg(5) Class112 arg4, @OriginalArg(6) Class59 arg5, @OriginalArg(7) int arg6) {
		@Pc(17) int local17 = arg1 * arg1 + arg2 * arg2;
		if (local17 < 16 || local17 > arg6) {
			return;
		}
		@Pc(41) int local41 = (int) (Math.atan2((double) arg2, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
		@Pc(60) Class101 local60 = Static347.method5721(arg0, super.anInt5769, super.anInt5265, super.anInt5772, super.anInt5773, arg3, super.anInt5331, local41, arg5, super.anInt5260);
		if (local60 != null) {
			arg5.method4825(false);
			local60.method5172(arg4, null, 0);
			arg5.method4825(true);
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIZLclient!en;)Z")
	@Override
	public boolean method5586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class59 arg2) {
		if (this.aClass61_1 == null || !this.method3681(65536, arg2)) {
			return true;
		}
		@Pc(19) Class112 local19 = arg2.method4798();
		@Pc(24) int local24 = super.aClass131_7.method3517();
		local19.method3595(local24);
		local19.method3589(super.anInt5769, super.anInt5772, super.anInt5773);
		for (@Pc(42) int local42 = 0; local42 < super.aClass101Array3.length; local42++) {
			if (super.aClass101Array3[local42] != null) {
				return super.aClass101Array3[local42].method5187(arg0, arg1, local19, true);
			}
		}
		return false;
	}
}
