import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class5_Sub4_Sub4_Sub1 extends Class5_Sub4_Sub4 {

	@OriginalMember(owner = "client!kg", name = "Gc", descriptor = "I")
	private int anInt3401;

	@OriginalMember(owner = "client!kg", name = "Ic", descriptor = "Lclient!rj;")
	public Class174 aClass174_1;

	@OriginalMember(owner = "client!kg", name = "Oc", descriptor = "Ljava/lang/String;")
	public String aString126;

	@OriginalMember(owner = "client!kg", name = "jd", descriptor = "Ljava/lang/String;")
	public String aString127;

	@OriginalMember(owner = "client!kg", name = "Bc", descriptor = "I")
	public int anInt3397 = -1;

	@OriginalMember(owner = "client!kg", name = "Ac", descriptor = "B")
	private byte aByte31 = 0;

	@OriginalMember(owner = "client!kg", name = "Cc", descriptor = "Z")
	public boolean aBoolean190 = false;

	@OriginalMember(owner = "client!kg", name = "Qc", descriptor = "I")
	public int anInt3408 = -1;

	@OriginalMember(owner = "client!kg", name = "Yc", descriptor = "I")
	public int anInt3416 = 0;

	@OriginalMember(owner = "client!kg", name = "Ec", descriptor = "I")
	public int anInt3399 = -1;

	@OriginalMember(owner = "client!kg", name = "Jc", descriptor = "B")
	private byte aByte32 = 0;

	@OriginalMember(owner = "client!kg", name = "bd", descriptor = "I")
	public int anInt3419 = 0;

	@OriginalMember(owner = "client!kg", name = "Zc", descriptor = "I")
	public int anInt3417 = 0;

	@OriginalMember(owner = "client!kg", name = "Vc", descriptor = "I")
	public int anInt3413 = -1;

	@OriginalMember(owner = "client!kg", name = "dd", descriptor = "I")
	public int anInt3421 = -1;

	@OriginalMember(owner = "client!kg", name = "Wc", descriptor = "I")
	public int anInt3414 = -1;

	@OriginalMember(owner = "client!kg", name = "hd", descriptor = "I")
	public int anInt3425 = -1;

	@OriginalMember(owner = "client!kg", name = "ad", descriptor = "I")
	public int anInt3418 = 0;

	@OriginalMember(owner = "client!kg", name = "id", descriptor = "I")
	public int anInt3426 = 0;

	@OriginalMember(owner = "client!kg", name = "kd", descriptor = "I")
	public int anInt3427 = 255;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!qb;Lclient!ug;ILclient!tj;IIII)V")
	private void method2674(@OriginalArg(0) Class124 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class122 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg6 * arg6 + arg2 * arg2;
		if (local11 < 16 || arg5 < local11) {
			return;
		}
		@Pc(31) int local31 = (int) (Math.atan2((double) arg6, (double) arg2) * 2607.5945876176133D) & 0x3FFF;
		@Pc(50) Class124 local50 = Static350.method5695(super.anInt5901, super.anInt4899, arg4, super.anInt5905, arg3, super.anInt5907, arg0, super.anInt4890, super.anInt4908, local31);
		if (local50 != null) {
			arg3.method4705(false);
			local50.method4079(arg1, null, 0);
			arg3.method4705(true);
		}
	}

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "(B)I")
	@Override
	protected int method4206() {
		return this.anInt3401;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIZ)V")
	public void method2675(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		super.method4212(arg3, arg2, arg1, arg0, this.method4208());
	}

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "(I)Z")
	public boolean method2676() {
		return this.aClass174_1 != null;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)I")
	@Override
	public int method4204() {
		return -1;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method2677() {
		@Pc(7) String local7 = "";
		if (Static66.aStringArray42 != null) {
			local7 = local7 + Static66.aStringArray42[this.aByte31];
		}
		if (Static178.anIntArray252 != null && Static178.anIntArray252[this.aByte31] != -1) {
			@Pc(36) Class3_Sub7_Sub19 local36 = Static42.method733(Static178.anIntArray252[this.aByte31]);
			if (local36.aChar4 == 's') {
				local7 = local7 + local36.method4446(this.aByte32 & 0xFF);
			} else {
				Static69.method1091("gdn1", new Throwable());
				Static178.anIntArray252[this.aByte31] = -1;
			}
		}
		local7 = local7 + this.aString127;
		if (Static120.aStringArray13 != null) {
			local7 = local7 + Static120.aStringArray13[this.aByte31];
		}
		return local7;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!tj;BIZLclient!km;I)V")
	@Override
	public void method5333(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class5 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLclient!tj;)V")
	@Override
	public void method5331(@OriginalArg(1) Class122 arg0) {
		if (this.aClass174_1 != null && (super.aBoolean286 || this.method2679(0, arg0))) {
			this.method4203(super.aBoolean286, super.aClass124Array3, arg0);
		}
	}

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "(B)I")
	@Override
	public int method4208() {
		return this.aClass174_1 == null || this.aClass174_1.anInt5419 == -1 ? super.method4208() : Static339.method4911(this.aClass174_1.anInt5419).anInt3645;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!fb;)V")
	public void method2678(@OriginalArg(1) Class3_Sub4 arg0) {
		arg0.anInt4268 = 0;
		@Pc(12) int local12 = arg0.method3643();
		@Pc(16) int local16 = local12 & 0x1;
		@Pc(27) boolean local27 = (local12 & 0x2) != 0;
		@Pc(38) boolean local38 = (local12 & 0x4) != 0;
		@Pc(42) int local42 = super.method4208();
		this.method4205((local12 >> 3 & 0x7) + 1);
		this.aByte31 = (byte) (local12 >> 6 & 0x3);
		super.anInt5901 += (this.method4208() - local42) * 64;
		super.anInt5905 += (this.method4208() - local42) * 64;
		this.aByte32 = arg0.method3621();
		this.anInt3413 = arg0.method3621();
		this.anInt3397 = arg0.method3621();
		@Pc(102) int local102 = -1;
		this.anInt3419 = 0;
		@Pc(108) int[] local108 = new int[12];
		@Pc(128) int local128;
		@Pc(134) int local134;
		@Pc(172) int local172;
		for (@Pc(110) int local110 = 0; local110 < 12; local110++) {
			@Pc(116) int local116 = arg0.method3643();
			if (local116 == 0) {
				local108[local110] = 0;
			} else {
				local128 = arg0.method3643();
				local134 = local128 + (local116 << 8);
				if (local110 == 0 && local134 == 65535) {
					local102 = arg0.method3649();
					this.anInt3419 = arg0.method3643();
					break;
				}
				if (local134 >= 32768) {
					local134 = Static97.anIntArray120[local134 - 32768];
					local108[local110] = local134 | 0x40000000;
					local172 = Static230.method5537(local134).anInt1207;
					if (local172 != 0) {
						this.anInt3419 = local172;
					}
				} else {
					local108[local110] = Integer.MIN_VALUE | local134 - 256;
				}
			}
		}
		@Pc(199) int[] local199 = new int[5];
		for (local128 = 0; local128 < 5; local128++) {
			local134 = arg0.method3643();
			if (local134 < 0 || Static196.aShortArrayArray4[local128].length <= local134) {
				local134 = 0;
			}
			local199[local128] = local134;
		}
		this.anInt3401 = arg0.method3649();
		this.aString127 = arg0.method3671();
		if (local27) {
			this.aString126 = arg0.method3671();
		} else {
			this.aString126 = this.aString127;
		}
		this.anInt3417 = arg0.method3643();
		if (local38) {
			this.anInt3418 = arg0.method3649();
			this.anInt3408 = -1;
			this.anInt3426 = this.anInt3417;
		} else {
			this.anInt3418 = 0;
			this.anInt3426 = arg0.method3643();
			this.anInt3408 = arg0.method3643();
			if (this.anInt3408 == 255) {
				this.anInt3408 = -1;
			}
		}
		local134 = this.anInt3416;
		this.anInt3416 = arg0.method3643();
		@Pc(328) int local328;
		if (this.anInt3416 == 0) {
			Static240.method4141(this);
		} else {
			local172 = this.anInt3425;
			@Pc(325) int local325 = this.anInt3414;
			local328 = this.anInt3421;
			@Pc(331) int local331 = this.anInt3399;
			@Pc(334) int local334 = this.anInt3427;
			this.anInt3425 = arg0.method3649();
			this.anInt3414 = arg0.method3649();
			this.anInt3421 = arg0.method3649();
			this.anInt3399 = arg0.method3649();
			this.anInt3427 = arg0.method3643();
			if (this.anInt3416 != local134 || local172 != this.anInt3425 || this.anInt3414 != local325 || this.anInt3421 != local328 || local331 != this.anInt3399 || local334 != this.anInt3427) {
				Static225.method4597(this);
			}
		}
		if (this.aClass174_1 == null) {
			this.aClass174_1 = new Class174();
		}
		local172 = this.aClass174_1.anInt5419;
		@Pc(423) int[] local423 = this.aClass174_1.anIntArray434;
		this.aClass174_1.method4555(local108, local199, this.method4206(), local16 == 1, local102);
		if (local102 != local172) {
			super.anInt5901 = super.anIntArray405[0] * 128 + this.method4208() * 64;
			super.anInt5905 = super.anIntArray404[0] * 128 + this.method4208() * 64;
		}
		if (super.anInt4946 == 2047 && local423 != null) {
			for (local328 = 0; local328 < local199.length; local328++) {
				if (local423[local328] != local199[local328]) {
					Static235.method4016();
					break;
				}
			}
		}
		if (super.aClass8_Sub5_6 != null) {
			super.aClass8_Sub5_6.method3573();
		}
		if (super.anInt4911 == -1 || !super.aBoolean285) {
			return;
		}
		@Pc(521) Class54 local521 = this.method4201();
		if (!local521.method1154(super.anInt4911)) {
			super.anInt4911 = -1;
			super.aBoolean285 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IILclient!tj;)Z")
	private boolean method2679(@OriginalArg(0) int arg0, @OriginalArg(2) Class122 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class54 local11 = this.method4201();
		@Pc(28) Class131 local28 = super.anInt4915 != -1 && super.anInt4918 == 0 ? Static343.method5604(super.anInt4915) : null;
		@Pc(48) Class131 local48 = super.anInt4911 == -1 || this.aBoolean190 || super.aBoolean285 && local28 != null ? null : Static343.method5604(super.anInt4911);
		@Pc(51) int local51 = local11.anInt1515;
		@Pc(59) int local59 = local11.anInt1489;
		if (local51 != 0 || local59 != 0 || local11.anInt1486 != 0 || local11.anInt1478 != 0) {
			arg0 |= 0x7;
		}
		super.aClass124Array3[0] = this.aClass174_1.method4556(super.anInt4929, super.anInt4932, arg1, super.anInt4903, super.anInt4912, super.anInt4927, super.aClass46Array3, super.anInt4928, arg0, local28, local48);
		@Pc(103) int local103 = Static180.method3224();
		if (Static26.anInt699 < 96 && local103 > 50) {
			Static33.method632();
		}
		@Pc(138) int local138;
		if (Static310.anInt6141 != 0 && local103 < 50) {
			local138 = 50 - local103;
			while (local138 > Static260.anInt5194) {
				Static94.aByteArrayArray10[Static260.anInt5194] = new byte[102400];
				Static260.anInt5194++;
			}
			while (local138 < Static260.anInt5194) {
				Static260.anInt5194--;
				Static94.aByteArrayArray10[Static260.anInt5194] = null;
			}
		} else if (Static310.anInt6141 != 0) {
			Static260.anInt5194 = 0;
			Static94.aByteArrayArray10 = new byte[50][];
		}
		if (super.aClass124Array3[0] == null) {
			return false;
		}
		super.anInt4934 = super.aClass124Array3[0].method4106();
		this.method4216(super.aClass124Array3[0]);
		local138 = super.aClass193_7.method5174();
		super.anInt4890 = 0;
		super.anInt4908 = 0;
		super.anInt4899 = 0;
		if (local51 == 0 && local59 == 0) {
			this.method4214(this.method4208() << 7, local138, this.method4208() << 7);
		} else {
			this.method4214(local51, local138, local59);
			if (super.anInt4908 != 0) {
				super.aClass124Array3[0].method4105(super.anInt4908);
			}
			if (super.anInt4899 != 0) {
				super.aClass124Array3[0].method4111(super.anInt4899);
			}
			if (super.anInt4890 != 0) {
				super.aClass124Array3[0].method4077(0, super.anInt4890, 0);
			}
		}
		super.aClass124Array3[1] = null;
		if (!this.aBoolean190 && super.anInt4910 != -1 && super.anInt4887 != -1) {
			@Pc(286) Class2 local286 = Static155.method1566(super.anInt4910);
			@Pc(305) Class124 local305 = local286.method9(super.anInt4930, (local286.aBoolean6 ? 7 : 2) | local7, arg1, super.anInt4891, super.anInt4887);
			if (local305 != null) {
				local305.method4077(0, -super.anInt4906, 0);
				if (local286.aBoolean6 && (local51 != 0 || local59 != 0)) {
					if (super.anInt4908 != 0) {
						local305.method4105(super.anInt4908);
					}
					if (super.anInt4899 != 0) {
						local305.method4111(super.anInt4899);
					}
					if (super.anInt4890 != 0) {
						local305.method4077(0, super.anInt4890, 0);
					}
				}
				super.aClass124Array3[1] = local305;
			}
		}
		super.aClass124Array3[2] = null;
		if (!this.aBoolean190 && super.anInterface5_3 != null) {
			if (Static51.anInt1101 >= super.anInt4951) {
				super.anInterface5_3 = null;
			}
			if (super.anInt4949 <= Static51.anInt1101 && super.anInt4951 > Static51.anInt1101) {
				@Pc(401) Class124 local401 = super.anInterface5_3.method5339(arg1, local7 | 0x7);
				if (local401 != null) {
					local401.method4077(super.anInt4950 - super.anInt5901, super.anInt4959 + -super.anInt5907, -super.anInt5905 + super.anInt4955);
					if (local138 != 0) {
						local401.method4091(-local138 & 0x3FFF);
					}
					super.aClass124Array3[2] = local401;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "(I)I")
	@Override
	public int method5039() {
		return super.anInt4934;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!tj;II)Z")
	@Override
	public boolean method5330(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2) {
		if (this.aClass174_1 == null || !this.method2679(65536, arg1)) {
			return true;
		}
		@Pc(19) Class56 local19 = arg1.method4739();
		@Pc(24) int local24 = super.aClass193_7.method5174();
		local19.method4688(local24);
		local19.method4683(super.anInt5901, super.anInt5907, super.anInt5905);
		for (@Pc(37) int local37 = 0; super.aClass124Array3.length > local37; local37++) {
			if (super.aClass124Array3[local37] != null) {
				return super.aClass124Array3[local37].method4116(arg2, arg0, local19, true);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!tj;I)Lclient!ri;")
	@Override
	public Class8_Sub7 method5329(@OriginalArg(0) Class122 arg0) {
		if (this.aClass174_1 == null || !this.method2679(1024, arg0)) {
			return null;
		}
		@Pc(19) Class56 local19 = arg0.method4739();
		@Pc(24) int local24 = super.aClass193_7.method5174();
		local19.method4688(local24);
		local19.method4691(super.anInt5901, super.anInt5907, super.anInt5905);
		@Pc(38) float local38 = arg0.method4722();
		@Pc(41) float local41 = arg0.method4778();
		if (Static21.aBoolean29) {
			@Pc(47) Class54 local47 = this.method4201();
			if (local47.aBoolean75 && (this.aClass174_1.anInt5419 == -1 || Static339.method4911(this.aClass174_1.anInt5419).aBoolean200)) {
				@Pc(80) Class131 local80 = super.anInt4915 != -1 && super.anInt4918 == 0 ? Static343.method5604(super.anInt4915) : null;
				@Pc(99) Class131 local99 = super.anInt4911 == -1 || this.aBoolean190 || super.aBoolean285 && local80 != null ? null : Static343.method5604(super.anInt4911);
				@Pc(133) Class124 local133 = Static191.method3418(0, super.aBoolean284, local99 == null ? local80 : local99, 0, 160, local99 == null ? super.anInt4912 : super.anInt4932, 1, super.aClass124Array3[0], super.anInt4899, arg0, 240, super.anInt4908, super.anInt4890, local24);
				if (local133 != null) {
					arg0.method4744(local38, local41 - 128.0F);
					arg0.method4705(false);
					local133.method4079(local19, null, 0);
					arg0.method4705(true);
				}
			}
		}
		if (Static349.aClass5_Sub4_Sub4_Sub1_2 == this) {
			arg0.method4744(local38, local41 - 144.0F);
			local19.method4683(super.anInt5901, super.anInt5907, super.anInt5905);
			for (@Pc(179) int local179 = Static108.aClass125Array11.length - 1; local179 >= 0; local179--) {
				@Pc(185) Class125 local185 = Static108.aClass125Array11[local179];
				if (local185 != null && local185.anInt3923 != -1) {
					@Pc(239) int local239;
					@Pc(228) int local228;
					if (local185.anInt3931 == 1 && local185.anInt3922 >= 0 && Static244.aClass5_Sub4_Sub4_Sub2Array1.length > local185.anInt3922) {
						@Pc(215) Class5_Sub4_Sub4_Sub2 local215 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local185.anInt3922];
						if (local215 != null) {
							local228 = local215.anInt5901 / 32 - Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5901 / 32;
							local239 = local215.anInt5905 / 32 - Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5905 / 32;
							this.method2674(super.aClass124Array3[0], local19, local239, arg0, local185.anInt3923, 360000, local228);
						}
					}
					if (local185.anInt3931 == 2) {
						@Pc(275) int local275 = (-Static186.anInt3094 + local185.anInt3929) * 4 + 2 - Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5901 / 32;
						local228 = (local185.anInt3926 - Static296.anInt5889) * 4 + 2 - Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5905 / 32;
						local239 = local185.anInt3925 * 4;
						local239 *= local239;
						this.method2674(super.aClass124Array3[0], local19, local228, arg0, local185.anInt3923, local239, local275);
					}
					if (local185.anInt3931 == 10 && local185.anInt3922 >= 0 && local185.anInt3922 < Static254.aClass5_Sub4_Sub4_Sub1Array1.length) {
						@Pc(335) Class5_Sub4_Sub4_Sub1 local335 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local185.anInt3922];
						if (local335 != null) {
							local228 = local335.anInt5901 / 32 - Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5901 / 32;
							local239 = local335.anInt5905 / 32 - Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5905 / 32;
							this.method2674(super.aClass124Array3[0], local19, local239, arg0, local185.anInt3923, 360000, local228);
						}
					}
				}
			}
			local19.method4688(local24);
			local19.method4691(super.anInt5901, super.anInt5907, super.anInt5905);
		}
		arg0.method4744(local38, local41);
		@Pc(396) Class8_Sub7 local396 = Static97.method1655(super.aClass124Array3.length);
		if (super.aClass8_Sub5_6 == null) {
			arg0.method4761(super.aClass124Array3, local19, local396.aClass8_Sub2Array1, Static349.aClass5_Sub4_Sub4_Sub1_2 == this ? 1 : 0);
		} else {
			@Pc(418) Class9 local418 = super.aClass8_Sub5_6.method3570();
			arg0.method4741(super.aClass124Array3, local418, local19, local396.aClass8_Sub2Array1, Static349.aClass5_Sub4_Sub4_Sub1_2 == this ? 1 : 0);
		}
		this.method4203(false, super.aClass124Array3, arg0);
		if (super.aClass124Array3[2] != null) {
			if (local24 != 0) {
				super.aClass124Array3[2].method4091(local24);
			}
			super.aClass124Array3[2].method4077(super.anInt5901 - super.anInt4950, super.anInt5907 + -super.anInt4959, -super.anInt4955 + super.anInt5905);
		}
		return local396;
	}

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)V")
	@Override
	public void method5328() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	public String method2680() {
		return this.aString126;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5327() {
		return false;
	}
}
