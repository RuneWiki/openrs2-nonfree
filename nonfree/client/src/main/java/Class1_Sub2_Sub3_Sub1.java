import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class1_Sub2_Sub3_Sub1 extends Class1_Sub2_Sub3 {

	@OriginalMember(owner = "client!je", name = "zc", descriptor = "I")
	private int anInt3391;

	@OriginalMember(owner = "client!je", name = "Bc", descriptor = "Ljava/lang/String;")
	public String aString33;

	@OriginalMember(owner = "client!je", name = "Ec", descriptor = "I")
	public int anInt3394;

	@OriginalMember(owner = "client!je", name = "Lc", descriptor = "I")
	public int anInt3399;

	@OriginalMember(owner = "client!je", name = "Oc", descriptor = "Lclient!we;")
	public Class217 aClass217_1;

	@OriginalMember(owner = "client!je", name = "ed", descriptor = "Ljava/lang/String;")
	public String aString34;

	@OriginalMember(owner = "client!je", name = "rc", descriptor = "I")
	public int anInt3383 = -1;

	@OriginalMember(owner = "client!je", name = "sc", descriptor = "I")
	public int anInt3384 = -1;

	@OriginalMember(owner = "client!je", name = "wc", descriptor = "I")
	public int anInt3388 = 0;

	@OriginalMember(owner = "client!je", name = "yc", descriptor = "I")
	public int anInt3390 = 255;

	@OriginalMember(owner = "client!je", name = "tc", descriptor = "I")
	public int anInt3385 = -1;

	@OriginalMember(owner = "client!je", name = "Nc", descriptor = "I")
	public int anInt3401 = 0;

	@OriginalMember(owner = "client!je", name = "ad", descriptor = "I")
	public int anInt3410 = -1;

	@OriginalMember(owner = "client!je", name = "Xc", descriptor = "B")
	private byte aByte39 = 0;

	@OriginalMember(owner = "client!je", name = "Yc", descriptor = "I")
	public int anInt3408 = 0;

	@OriginalMember(owner = "client!je", name = "Pc", descriptor = "I")
	public int anInt3402 = -1;

	@OriginalMember(owner = "client!je", name = "Hc", descriptor = "I")
	public int anInt3396 = 0;

	@OriginalMember(owner = "client!je", name = "Tc", descriptor = "Z")
	public boolean aBoolean306 = false;

	@OriginalMember(owner = "client!je", name = "bd", descriptor = "I")
	public int anInt3411 = -1;

	@OriginalMember(owner = "client!je", name = "Rc", descriptor = "B")
	private byte aByte38 = 0;

	@OriginalMember(owner = "client!je", name = "gd", descriptor = "B")
	private byte aByte40 = 0;

	@OriginalMember(owner = "client!je", name = "ld", descriptor = "I")
	public int anInt3418 = -1;

	@OriginalMember(owner = "client!je", name = "hd", descriptor = "I")
	public int anInt3414 = 0;

	@OriginalMember(owner = "client!je", name = "md", descriptor = "I")
	public int anInt3419 = -1;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method2966() {
		@Pc(7) String local7 = "";
		if (Static6.aStringArray2 != null) {
			local7 = local7 + Static6.aStringArray2[this.aByte39];
		}
		@Pc(31) int[] local31;
		if (this.aByte38 == 1 && Static36.anIntArray67 != null) {
			local31 = Static36.anIntArray67;
		} else {
			local31 = Static225.anIntArray360;
		}
		if (local31 != null && local31[this.aByte39] != -1) {
			@Pc(51) Class2_Sub9_Sub1 local51 = Static359.method5731(local31[this.aByte39]);
			if (local51.aChar3 == 's') {
				local7 = local7 + local51.method1271(this.aByte40 & 0xFF);
			} else {
				Static40.method506("gdn1", new Throwable());
				local31[this.aByte39] = -1;
			}
		}
		local7 = local7 + this.aString33;
		if (Static152.aStringArray20 != null) {
			local7 = local7 + Static152.aStringArray20[this.aByte39];
		}
		return local7;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IBBI)V")
	public void method2967(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt6962 < 9) {
			super.anInt6962++;
		}
		for (@Pc(18) int local18 = super.anInt6962; local18 > 0; local18--) {
			super.anIntArray535[local18] = super.anIntArray535[local18 - 1];
			super.anIntArray534[local18] = super.anIntArray534[local18 - 1];
			super.aByteArray93[local18] = super.aByteArray93[local18 - 1];
		}
		super.anIntArray535[0] = arg2;
		super.aByteArray93[0] = arg1;
		super.anIntArray534[0] = arg0;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BLclient!ef;)V")
	public void method2969(@OriginalArg(1) Class2_Sub12 arg0) {
		arg0.anInt3606 = 0;
		@Pc(12) int local12 = arg0.method3124();
		this.aByte38 = (byte) (local12 & 0x1);
		@Pc(29) boolean local29 = (local12 & 0x2) != 0;
		@Pc(37) boolean local37 = (local12 & 0x4) != 0;
		@Pc(43) int local43 = super.method5787();
		this.method5782((local12 >> 3 & 0x7) + 1);
		this.aByte39 = (byte) (local12 >> 6 & 0x3);
		super.anInt6893 += (this.method5787() - local43) * 64;
		super.anInt6888 += (this.method5787() - local43) * 64;
		this.aByte40 = arg0.method3122();
		this.anInt3385 = arg0.method3122();
		this.anInt3419 = arg0.method3122();
		@Pc(110) int local110 = -1;
		this.anInt3401 = 0;
		@Pc(116) int[] local116 = new int[12];
		@Pc(141) int local141;
		@Pc(147) int local147;
		@Pc(193) int local193;
		for (@Pc(118) int local118 = 0; local118 < 12; local118++) {
			@Pc(126) int local126 = arg0.method3124();
			if (local126 == 0) {
				local116[local118] = 0;
			} else {
				local141 = arg0.method3124();
				local147 = local141 + (local126 << 8);
				if (local118 == 0 && local147 == 65535) {
					local110 = arg0.method3104();
					this.anInt3401 = arg0.method3124();
					break;
				}
				if (local147 >= 32768) {
					local147 = Static298.anIntArray456[local147 - 32768];
					local116[local118] = local147 | 0x40000000;
					local193 = Static310.aClass184_2.method5040(local147).anInt3900;
					if (local193 != 0) {
						this.anInt3401 = local193;
					}
				} else {
					local116[local118] = local147 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(220) int[] local220 = new int[5];
		for (local141 = 0; local141 < 5; local141++) {
			local147 = arg0.method3124();
			if (local147 < 0 || Static26.aShortArrayArray12[local141].length <= local147) {
				local147 = 0;
			}
			local220[local141] = local147;
		}
		this.anInt3391 = arg0.method3104();
		this.aString33 = arg0.method3113();
		if (local29) {
			this.aString34 = arg0.method3113();
		} else {
			this.aString34 = this.aString33;
		}
		this.anInt3388 = arg0.method3124();
		if (local37) {
			this.anInt3408 = arg0.method3104();
			this.anInt3411 = -1;
			this.anInt3396 = this.anInt3388;
		} else {
			this.anInt3408 = 0;
			this.anInt3396 = arg0.method3124();
			this.anInt3411 = arg0.method3124();
			if (this.anInt3411 == 255) {
				this.anInt3411 = -1;
			}
		}
		local147 = this.anInt3414;
		this.anInt3414 = arg0.method3124();
		@Pc(340) int local340;
		if (this.anInt3414 == 0) {
			Static40.method504(this);
		} else {
			local193 = this.anInt3418;
			@Pc(337) int local337 = this.anInt3384;
			local340 = this.anInt3383;
			@Pc(343) int local343 = this.anInt3410;
			@Pc(346) int local346 = this.anInt3390;
			this.anInt3418 = arg0.method3104();
			this.anInt3384 = arg0.method3104();
			this.anInt3383 = arg0.method3104();
			this.anInt3410 = arg0.method3104();
			this.anInt3390 = arg0.method3124();
			if (this.anInt3414 != local147 || local193 != this.anInt3418 || local337 != this.anInt3384 || this.anInt3383 != local340 || local343 != this.anInt3410 || local346 != this.anInt3390) {
				Static341.method393(this);
			}
		}
		if (this.aClass217_1 == null) {
			this.aClass217_1 = new Class217();
		}
		local193 = this.aClass217_1.anInt6784;
		@Pc(420) int[] local420 = this.aClass217_1.anIntArray521;
		this.aClass217_1.method5671(local220, this.method5780(), local110, local116, this.aByte38 == 1);
		if (local110 != local193) {
			super.anInt6893 = super.anIntArray535[0] * 128 + this.method5787() * 64;
			super.anInt6888 = super.anIntArray534[0] * 128 + this.method5787() * 64;
		}
		if (super.anInt6896 == Static217.anInt4819 && local420 != null) {
			for (local340 = 0; local340 < local220.length; local340++) {
				if (local220[local340] != local420[local340]) {
					Static310.aClass184_2.method5052();
					break;
				}
			}
		}
		if (super.aClass57_Sub6_7 != null) {
			super.aClass57_Sub6_7.method3852();
		}
		if (super.anInt6901 == -1 || !super.aBoolean613) {
			return;
		}
		@Pc(528) Class142 local528 = this.method5778();
		if (!local528.method4175(super.anInt6901)) {
			super.anInt6901 = -1;
			super.aBoolean613 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!je", name = "f", descriptor = "(B)I")
	@Override
	protected int method5780() {
		return this.anInt3391;
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(Lclient!dr;I)Lclient!kq;")
	@Override
	public Class57_Sub5 method5758(@OriginalArg(0) Class37 arg0) {
		if (this.aClass217_1 == null || !this.method2972(arg0, 1024)) {
			return null;
		}
		@Pc(19) Class38 local19 = arg0.method3672();
		@Pc(24) int local24 = super.aClass219_7.method5719();
		local19.method4480(local24);
		local19.method4470(super.anInt6893, super.anInt6886, super.anInt6888);
		@Pc(38) float local38 = arg0.method3705();
		@Pc(41) float local41 = arg0.method3744();
		if (Static39.aBoolean48) {
			@Pc(47) Class142 local47 = this.method5778();
			if (local47.aBoolean428 && (this.aClass217_1.anInt6784 == -1 || Static90.method1809(this.aClass217_1.anInt6784).aBoolean416)) {
				@Pc(76) Class84 local76 = super.anInt6915 != -1 && super.anInt6900 == 0 ? Static91.method1822(super.anInt6915) : null;
				@Pc(95) Class84 local95 = super.anInt6901 == -1 || this.aBoolean306 || super.aBoolean613 && local76 != null ? null : Static91.method1822(super.anInt6901);
				@Pc(129) Class49 local129 = Static295.method4925(local24, super.anInt6897, local95 == null ? local76 : local95, 1, super.anInt6931, 160, 0, local95 == null ? super.anInt6895 : super.anInt6942, arg0, 240, super.anInt6925, super.aClass49Array3[0], super.aBoolean614, 0);
				if (local129 != null) {
					arg0.method3662(local38, local41 - 128.0F);
					arg0.method3675(false);
					local129.method5825(local19, null, 0);
					arg0.method3675(true);
				}
			}
		}
		if (Static177.aClass1_Sub2_Sub3_Sub1_1 == this) {
			arg0.method3662(local38, local41 - 144.0F);
			local19.method4474(super.anInt6893, super.anInt6886, super.anInt6888);
			for (@Pc(170) int local170 = Static223.aClass52Array1.length - 1; local170 >= 0; local170--) {
				@Pc(176) Class52 local176 = Static223.aClass52Array1[local170];
				if (local176 != null && local176.anInt1016 != -1) {
					@Pc(231) int local231;
					@Pc(221) int local221;
					if (local176.anInt1018 == 1 && local176.anInt1012 >= 0 && Static95.aClass1_Sub2_Sub3_Sub2Array1.length > local176.anInt1012) {
						@Pc(208) Class1_Sub2_Sub3_Sub2 local208 = Static95.aClass1_Sub2_Sub3_Sub2Array1[local176.anInt1012];
						if (local208 != null) {
							local221 = local208.anInt6893 / 32 - Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6893 / 32;
							local231 = local208.anInt6888 / 32 - Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6888 / 32;
							this.method2976(local19, local231, super.aClass49Array3[0], local221, 360000, local176.anInt1016, arg0);
						}
					}
					if (local176.anInt1018 == 2) {
						@Pc(265) int local265 = (local176.anInt1011 - Static150.anInt3453) * 4 + 2 - Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6893 / 32;
						local221 = (local176.anInt1022 - Static287.anInt5776) * 4 + 2 - Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6888 / 32;
						local231 = local176.anInt1023 * 4;
						local231 *= local231;
						this.method2976(local19, local221, super.aClass49Array3[0], local265, local231, local176.anInt1016, arg0);
					}
					if (local176.anInt1018 == 10 && local176.anInt1012 >= 0 && Static164.aClass1_Sub2_Sub3_Sub1Array1.length > local176.anInt1012) {
						@Pc(323) Class1_Sub2_Sub3_Sub1 local323 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local176.anInt1012];
						if (local323 != null) {
							local221 = local323.anInt6893 / 32 - Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6893 / 32;
							local231 = local323.anInt6888 / 32 - Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6888 / 32;
							this.method2976(local19, local231, super.aClass49Array3[0], local221, 360000, local176.anInt1016, arg0);
						}
					}
				}
			}
			local19.method4480(local24);
			local19.method4470(super.anInt6893, super.anInt6886, super.anInt6888);
		}
		arg0.method3662(local38, local41);
		@Pc(391) Class57_Sub5 local391 = Static116.method2281(super.aClass49Array3.length);
		if (super.aClass57_Sub6_7 == null) {
			arg0.method3714(super.aClass49Array3, local19, local391.aClass57_Sub4Array1, Static177.aClass1_Sub2_Sub3_Sub1_1 == this ? 1 : 0);
		} else {
			@Pc(398) Class214 local398 = super.aClass57_Sub6_7.method3844();
			arg0.method3666(super.aClass49Array3, local398, local19, local391.aClass57_Sub4Array1, Static177.aClass1_Sub2_Sub3_Sub1_1 == this ? 1 : 0);
		}
		this.method5781(super.aClass49Array3, arg0, false);
		if (super.aClass49Array3[2] != null) {
			if (local24 != 0) {
				super.aClass49Array3[2].method5857(local24);
			}
			super.aClass49Array3[2].method5849(-super.aClass2_Sub25_3.anInt4097 + super.anInt6893, super.anInt6886 - super.aClass2_Sub25_3.anInt4094, -super.aClass2_Sub25_3.anInt4105 + super.anInt6888);
		}
		return local391;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
	public void method2970(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.anInt6963 = 0;
		super.anInt6962 = 0;
		super.anInt6964 = 0;
		super.anIntArray535[0] = arg1;
		super.anIntArray534[0] = arg0;
		@Pc(26) int local26 = this.method5787();
		super.anInt6893 = local26 * 64 + super.anIntArray535[0] * 128;
		super.anInt6888 = super.anIntArray534[0] * 128 + local26 * 64;
		if (Static177.aClass1_Sub2_Sub3_Sub1_1 == this) {
			Static225.method4189();
		}
		if (super.aClass57_Sub6_7 != null) {
			super.aClass57_Sub6_7.method3852();
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZILclient!la;IIILclient!dr;)V")
	@Override
	public void method5762(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class37 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5759() {
		return false;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IILclient!dr;I)Z")
	@Override
	public boolean method5757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class37 arg2) {
		if (this.aClass217_1 == null || !this.method2972(arg2, 65536)) {
			return true;
		}
		@Pc(19) Class38 local19 = arg2.method3672();
		@Pc(24) int local24 = super.aClass219_7.method5719();
		local19.method4480(local24);
		local19.method4470(super.anInt6893, super.anInt6886, super.anInt6888);
		for (@Pc(42) int local42 = 0; super.aClass49Array3.length > local42; local42++) {
			if (super.aClass49Array3[local42] != null && super.aClass49Array3[local42].method5816(arg0, arg1, local19, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(Z)I")
	@Override
	public int method5766() {
		return super.anInt6909;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BIII)V")
	public void method2971(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt6915 != -1 && Static91.method1822(super.anInt6915).anInt2463 == 1) {
			super.anInt6915 = -1;
		}
		if (super.anInt6902 != -1) {
			@Pc(33) Class177 local33 = Static41.method4707(super.anInt6902);
			if (local33.aBoolean516 && local33.anInt5808 != -1 && Static91.method1822(local33.anInt5808).anInt2463 == 1) {
				super.anInt6902 = -1;
			}
		}
		this.anInt3402 = -1;
		if (arg2 < 0 || arg2 >= Static66.anInt1177 || arg1 < 0 || Static12.anInt213 <= arg1) {
			this.method2970(arg1, arg2);
		} else if (super.anIntArray535[0] >= 0 && Static66.anInt1177 > super.anIntArray535[0] && super.anIntArray534[0] >= 0 && Static12.anInt213 > super.anIntArray534[0]) {
			if (arg0 == 2) {
				Static346.method5008(arg1, this, arg2);
			}
			this.method2967(arg1, arg0, arg2);
		} else {
			this.method2970(arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!dr;II)Z")
	private boolean method2972(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class142 local11 = this.method5778();
		@Pc(25) Class84 local25 = super.anInt6915 != -1 && super.anInt6900 == 0 ? Static91.method1822(super.anInt6915) : null;
		@Pc(44) Class84 local44 = super.anInt6901 == -1 || this.aBoolean306 || super.aBoolean613 && local25 != null ? null : Static91.method1822(super.anInt6901);
		@Pc(47) int local47 = local11.anInt4900;
		@Pc(50) int local50 = local11.anInt4896;
		if (local47 != 0 || local50 != 0 || local11.anInt4901 != 0 || local11.anInt4885 != 0) {
			arg1 |= 0x7;
		}
		super.aClass49Array3[0] = this.aClass217_1.method5674(super.aClass212Array3, super.anInt6943, local25, Static310.aClass184_2, arg0, super.anInt6895, arg1, super.anInt6921, local44, super.anInt6942, super.anInt6904, super.anInt6899);
		@Pc(97) int local97 = Static268.method4691();
		if (Static147.anInt3175 < 96 && local97 > 50) {
			Static127.method2503();
		}
		@Pc(131) int local131;
		if (Static63.anInt1130 != 0 && local97 < 50) {
			local131 = 50 - local97;
			while (local131 > Static115.anInt2461) {
				Static201.aByteArrayArray11[Static115.anInt2461] = new byte[102400];
				Static115.anInt2461++;
			}
			while (local131 < Static115.anInt2461) {
				Static115.anInt2461--;
				Static201.aByteArrayArray11[Static115.anInt2461] = null;
			}
		} else if (Static63.anInt1130 != 0) {
			Static201.aByteArrayArray11 = new byte[50][];
			Static115.anInt2461 = 0;
		}
		if (super.aClass49Array3[0] == null) {
			return false;
		}
		super.anInt6909 = super.aClass49Array3[0].method5842();
		this.method5777(super.aClass49Array3[0]);
		local131 = super.aClass219_7.method5719();
		super.anInt6925 = 0;
		super.anInt6897 = 0;
		super.anInt6931 = 0;
		if (local47 == 0 && local50 == 0) {
			this.method5770(this.method5787() << 7, this.method5787() << 7, local131);
		} else {
			this.method5770(local47, local50, local131);
			if (super.anInt6931 != 0) {
				super.aClass49Array3[0].method5856(super.anInt6931);
			}
			if (super.anInt6925 != 0) {
				super.aClass49Array3[0].method5829(super.anInt6925);
			}
			if (super.anInt6897 != 0) {
				super.aClass49Array3[0].method5849(0, super.anInt6897, 0);
			}
		}
		super.aClass49Array3[1] = null;
		if (!this.aBoolean306 && super.anInt6902 != -1 && super.anInt6898 != -1) {
			@Pc(305) Class177 local305 = Static41.method4707(super.anInt6902);
			@Pc(324) Class49 local324 = local305.method4854(super.anInt6898, local7 | (local305.aBoolean515 ? 7 : 2), super.anInt6945, arg0, super.anInt6957);
			if (local324 != null) {
				local324.method5849(0, -super.anInt6946, 0);
				if (local305.aBoolean515 && (local47 != 0 || local50 != 0)) {
					if (super.anInt6931 != 0) {
						local324.method5856(super.anInt6931);
					}
					if (super.anInt6925 != 0) {
						local324.method5829(super.anInt6925);
					}
					if (super.anInt6897 != 0) {
						local324.method5849(0, super.anInt6897, 0);
					}
				}
				super.aClass49Array3[1] = local324;
			}
		}
		super.aClass49Array3[2] = null;
		if (!this.aBoolean306 && super.aClass2_Sub25_3 != null) {
			if (super.aClass2_Sub25_3.anInt4103 <= Static6.anInt91) {
				super.aClass2_Sub25_3 = null;
			} else if (super.aClass2_Sub25_3.anInt4099 <= Static6.anInt91) {
				@Pc(412) Class49 local412 = super.aClass2_Sub25_3.method3504(arg0, local7 | 0x7);
				if (local412 != null) {
					local412.method5849(-super.anInt6893 + super.aClass2_Sub25_3.anInt4097, super.aClass2_Sub25_3.anInt4094 - super.anInt6886, -super.anInt6888 + super.aClass2_Sub25_3.anInt4105);
					if (local131 != 0) {
						local412.method5857(-local131 & 0x3FFF);
					}
					super.aClass49Array3[2] = local412;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(I)I")
	@Override
	public int method5787() {
		return this.aClass217_1 == null || this.aClass217_1.anInt6784 == -1 ? super.method5787() : Static90.method1809(this.aClass217_1.anInt6784).anInt4778;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(Lclient!dr;I)V")
	@Override
	public void method5754(@OriginalArg(0) Class37 arg0) {
		if (this.aClass217_1 != null && (super.aBoolean617 || this.method2972(arg0, 0))) {
			this.method5781(super.aClass49Array3, arg0, super.aBoolean617);
		}
	}

	@OriginalMember(owner = "client!je", name = "i", descriptor = "(B)Z")
	public boolean method2974() {
		return this.aClass217_1 != null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method2975() {
		return this.aString34;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!jd;ILclient!wp;IIIILclient!dr;)V")
	private void method2976(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class49 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class37 arg6) {
		@Pc(12) int local12 = arg3 * arg3 + arg1 * arg1;
		if (local12 < 16 || local12 > arg4) {
			return;
		}
		@Pc(37) int local37 = (int) (Math.atan2((double) arg3, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
		@Pc(56) Class49 local56 = Static95.method1867(super.anInt6893, super.anInt6897, arg6, arg5, arg2, local37, super.anInt6931, super.anInt6888, super.anInt6925, super.anInt6886);
		if (local56 != null) {
			arg6.method3675(false);
			local56.method5825(arg0, null, 0);
			arg6.method3675(true);
		}
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(B)I")
	@Override
	public int method5776() {
		return -1;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
	@Override
	public void method5761() {
		throw new IllegalStateException();
	}
}
