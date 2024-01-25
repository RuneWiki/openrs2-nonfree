import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class3_Sub4_Sub1_Sub2 extends Class3_Sub4_Sub1 {

	@OriginalMember(owner = "client!pf", name = "Xc", descriptor = "Lclient!ur;")
	public Class249 aClass249_1;

	@OriginalMember(owner = "client!pf", name = "bd", descriptor = "I")
	public int anInt4994;

	@OriginalMember(owner = "client!pf", name = "hd", descriptor = "I")
	public int anInt4999;

	@OriginalMember(owner = "client!pf", name = "ld", descriptor = "I")
	private int anInt5002;

	@OriginalMember(owner = "client!pf", name = "pd", descriptor = "Ljava/lang/String;")
	public String aString147;

	@OriginalMember(owner = "client!pf", name = "sd", descriptor = "Ljava/lang/String;")
	public String aString148;

	@OriginalMember(owner = "client!pf", name = "Lc", descriptor = "I")
	public int anInt4980 = -1;

	@OriginalMember(owner = "client!pf", name = "Qc", descriptor = "I")
	public int anInt4985 = -1;

	@OriginalMember(owner = "client!pf", name = "Uc", descriptor = "I")
	public int anInt4988 = -1;

	@OriginalMember(owner = "client!pf", name = "Nc", descriptor = "I")
	public int anInt4982 = 0;

	@OriginalMember(owner = "client!pf", name = "kd", descriptor = "I")
	public int anInt5001 = 0;

	@OriginalMember(owner = "client!pf", name = "dd", descriptor = "I")
	public int anInt4995 = 0;

	@OriginalMember(owner = "client!pf", name = "jd", descriptor = "B")
	private byte aByte65 = 0;

	@OriginalMember(owner = "client!pf", name = "ad", descriptor = "I")
	public int anInt4993 = 255;

	@OriginalMember(owner = "client!pf", name = "Vc", descriptor = "I")
	public int anInt4989 = -1;

	@OriginalMember(owner = "client!pf", name = "Zc", descriptor = "I")
	public int anInt4992 = 0;

	@OriginalMember(owner = "client!pf", name = "cd", descriptor = "Z")
	public boolean aBoolean357 = false;

	@OriginalMember(owner = "client!pf", name = "Jc", descriptor = "Z")
	public boolean aBoolean356 = false;

	@OriginalMember(owner = "client!pf", name = "Rc", descriptor = "B")
	private byte aByte64 = 0;

	@OriginalMember(owner = "client!pf", name = "Sc", descriptor = "I")
	public int anInt4986 = -1;

	@OriginalMember(owner = "client!pf", name = "ud", descriptor = "I")
	public int anInt5009 = -1;

	@OriginalMember(owner = "client!pf", name = "zd", descriptor = "I")
	public int anInt5013 = 0;

	@OriginalMember(owner = "client!pf", name = "yd", descriptor = "B")
	private byte aByte66 = 0;

	@OriginalMember(owner = "client!pf", name = "Cd", descriptor = "Z")
	public boolean aBoolean358 = false;

	@OriginalMember(owner = "client!pf", name = "qd", descriptor = "I")
	public int anInt5006 = -1;

	@OriginalMember(owner = "client!pf", name = "Dd", descriptor = "I")
	public int anInt5015 = -1;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method4015() {
		return this.aString148;
	}

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "(B)Z")
	public boolean method4016() {
		return this.aClass249_1 != null;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)I")
	@Override
	protected int method3994() {
		return this.anInt5002;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBILclient!za;)Z")
	@Override
	public boolean method5282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class163 arg2) {
		if (this.aClass249_1 == null || !this.method4023(131072, arg2)) {
			return false;
		}
		@Pc(19) Class31 local19 = arg2.method5539();
		@Pc(30) int local30 = super.aClass12_7.method177();
		local19.ca(local30);
		local19.W(super.anInt6833, super.anInt6832, super.anInt6835);
		@Pc(43) boolean local43 = false;
		for (@Pc(45) int local45 = 0; local45 < super.aClass59Array3.length; local45++) {
			if (super.aClass59Array3[local45] != null && super.aClass59Array3[local45].method5748(arg1, arg0, local19, true)) {
				local43 = true;
				break;
			}
		}
		super.aClass59Array3[0] = super.aClass59Array3[1] = super.aClass59Array3[2] = super.aClass59Array3[3] = null;
		return local43;
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5277() {
		return false;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	public String method4017() {
		@Pc(7) String local7 = "";
		if (Static252.aStringArray24 != null) {
			local7 = local7 + Static252.aStringArray24[this.aByte65];
		}
		@Pc(38) int[] local38;
		if (this.aByte66 == 1 && Static338.anIntArray507 != null) {
			local38 = Static338.anIntArray507;
		} else {
			local38 = Static132.anIntArray185;
		}
		if (local38 != null && local38[this.aByte65] != -1) {
			@Pc(58) Class244 local58 = Static128.aClass11_1.method172(local38[this.aByte65]);
			if (local58.aChar4 == 's') {
				local7 = local7 + local58.method5158(this.aByte64 & 0xFF);
			} else {
				Static434.method5460(new Throwable(), "gdn1");
				local38[this.aByte65] = -1;
			}
		}
		local7 = local7 + this.aString147;
		if (Static447.aStringArray42 != null) {
			local7 = local7 + Static447.aStringArray42[this.aByte65];
		}
		return local7;
	}

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)I")
	@Override
	public int method5286() {
		return super.anInt4902;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BII)V")
	public void method4020(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.anInt4976 = 0;
		super.anInt4978 = 0;
		super.anIntArray425[0] = arg1;
		super.anInt4977 = 0;
		super.anIntArray424[0] = arg0;
		@Pc(26) int local26 = this.method4009();
		super.anInt6835 = local26 * 64 + super.anIntArray424[0] * 128;
		super.anInt6833 = local26 * 64 + super.anIntArray425[0] * 128;
		if (Static60.aClass3_Sub4_Sub1_Sub2_1 == this) {
			Static449.method5641();
		}
		if (super.aClass21_Sub2_6 != null) {
			super.aClass21_Sub2_6.method638();
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIB)V")
	public void method4021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2) {
		if (super.anInt4903 != -1 && Static334.aClass62_2.method1418(super.anInt4903).anInt3341 == 1) {
			super.anInt4903 = -1;
		}
		@Pc(31) Class229 local31;
		if (super.anInt4964 != -1) {
			local31 = Static431.aClass36_2.method696(super.anInt4964);
			if (local31.aBoolean449 && local31.anInt6240 != -1 && Static334.aClass62_2.method1418(local31.anInt6240).anInt3341 == 1) {
				super.anInt4964 = -1;
			}
		}
		if (super.anInt4912 != -1) {
			local31 = Static431.aClass36_2.method696(super.anInt4912);
			if (local31.aBoolean449 && local31.anInt6240 != -1 && Static334.aClass62_2.method1418(local31.anInt6240).anInt3341 == 1) {
				super.anInt4912 = -1;
			}
		}
		this.anInt4980 = -1;
		if (arg0 < 0 || arg0 >= Static166.anInt2852 || arg1 < 0 || Static426.anInt6923 <= arg1) {
			this.method4020(arg1, arg0);
		} else if (super.anIntArray425[0] >= 0 && Static166.anInt2852 > super.anIntArray425[0] && super.anIntArray424[0] >= 0 && super.anIntArray424[0] < Static426.anInt6923) {
			if (arg2 == 2) {
				Static457.method5718(arg1, arg0, this);
			}
			this.method4022(arg0, arg2, arg1);
		} else {
			this.method4020(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)V")
	@Override
	public void method5284() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIBI)V")
	public void method4022(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt4977 < 9) {
			super.anInt4977++;
		}
		for (@Pc(26) int local26 = super.anInt4977; local26 > 0; local26--) {
			super.anIntArray425[local26] = super.anIntArray425[local26 - 1];
			super.anIntArray424[local26] = super.anIntArray424[local26 - 1];
			super.aByteArray64[local26] = super.aByteArray64[local26 - 1];
		}
		super.anIntArray425[0] = arg0;
		super.anIntArray424[0] = arg2;
		super.aByteArray64[0] = arg1;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(Z)I")
	@Override
	public int method3998() {
		return -1;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IILclient!za;)Z")
	private boolean method4023(@OriginalArg(0) int arg0, @OriginalArg(2) Class163 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class173 local11 = this.method4001();
		@Pc(29) Class128 local29 = super.anInt4903 != -1 && super.anInt4954 == 0 ? Static334.aClass62_2.method1418(super.anInt4903) : null;
		@Pc(49) Class128 local49 = super.anInt4922 == -1 || this.aBoolean356 || super.aBoolean353 && local29 != null ? null : Static334.aClass62_2.method1418(super.anInt4922);
		@Pc(52) int local52 = local11.anInt4461;
		@Pc(55) int local55 = local11.anInt4451;
		if (local52 != 0 || local55 != 0 || local11.anInt4466 != 0 || local11.anInt4453 != 0) {
			arg0 |= 0x7;
		}
		@Pc(97) boolean local97 = super.aByte60 != 0 && super.anInt4968 <= Static266.anInt4392 && super.anInt4921 > Static266.anInt4392;
		if (local97) {
			arg0 |= 0x80000;
		}
		@Pc(138) Class59 local138 = super.aClass59Array3[0] = this.aClass249_1.method5247(Static394.aClass47_2, super.lb, arg0, local49, super.anInt4963, local29, Static138.aClass268_1, super.aClass194Array3, super.anInt4945, Static56.aClass150_1, Static155.aClass263_1, super.anInt4943, super.anInt4967, Static334.aClass62_2, arg1, Static384.aClass164_2, super.anInt4929);
		@Pc(141) int local141 = Static239.method3069();
		if (Static177.anInt3052 < 96 && local141 > 50) {
			Static203.method2716();
		}
		@Pc(171) int local171;
		if (Static60.aClass258_1 != Static260.aClass258_7 && local141 < 50) {
			local171 = 50 - local141;
			while (local171 > Static443.anInt7115) {
				Static397.aByteArrayArray55[Static443.anInt7115] = new byte[102400];
				Static443.anInt7115++;
			}
			while (local171 < Static443.anInt7115) {
				Static443.anInt7115--;
				Static397.aByteArrayArray55[Static443.anInt7115] = null;
			}
		} else if (Static260.aClass258_7 != Static60.aClass258_1) {
			Static443.anInt7115 = 0;
			Static397.aByteArrayArray55 = new byte[50][];
		}
		if (local138 == null) {
			return false;
		}
		super.anInt4902 = local138.B();
		this.method3995(local138);
		local171 = super.aClass12_7.method177();
		if (local52 == 0 && local55 == 0) {
			this.method4007(0, this.method4009() << 7, local171, this.method4009() << 7, 0);
		} else {
			this.method4007(local11.anInt4469, local55, local171, local52, local11.anInt4474);
			if (super.anInt4962 != 0) {
				local138.W(super.anInt4962);
			}
			if (super.anInt4957 != 0) {
				local138.K(super.anInt4957);
			}
			if (super.anInt4973 != 0) {
				local138.a(0, super.anInt4973, 0);
			}
		}
		if (local97) {
			local138.method5746(super.aByte62, super.aByte61, super.aByte63, super.aByte60 & 0xFF);
		}
		@Pc(321) Class229 local321;
		@Pc(338) boolean local338;
		@Pc(340) int local340;
		@Pc(380) Class59 local380;
		if (this.aBoolean356 || super.anInt4964 == -1 || super.anInt4950 == -1) {
			super.aClass59Array3[1] = null;
		} else {
			local321 = Static431.aClass36_2.method696(super.anInt4964);
			local338 = local321.aByte78 == 3 && (local52 != 0 || local55 != 0);
			local340 = local7;
			if (local338) {
				local340 = local7 | 0x7;
			} else {
				if (super.anInt4924 != 0) {
					local340 = local7 | 0x5;
				}
				if (super.anInt4897 != 0) {
					local340 |= 0x2;
				}
			}
			local380 = super.aClass59Array3[1] = local321.method4862(super.anInt4938, super.anInt4950, local340, arg1, Static334.aClass62_2, super.anInt4955);
			if (local380 != null) {
				if (super.anInt4897 != 0) {
					local380.a(0, -super.anInt4897 << 0, 0);
				}
				if (super.anInt4924 != 0) {
					local380.ma(super.anInt4924 * 2048);
				}
				if (local338) {
					if (super.anInt4962 != 0) {
						local380.W(super.anInt4962);
					}
					if (super.anInt4957 != 0) {
						local380.K(super.anInt4957);
					}
					if (super.anInt4973 != 0) {
						local380.a(0, super.anInt4973, 0);
					}
				}
			}
		}
		if (this.aBoolean356 || super.anInt4912 == -1 || super.anInt4969 == -1) {
			super.aClass59Array3[3] = null;
		} else {
			local321 = Static431.aClass36_2.method696(super.anInt4912);
			local338 = local321.aByte78 == 3 && (local52 != 0 || local55 != 0);
			local340 = local7;
			if (local338) {
				local340 = local7 | 0x7;
			} else {
				if (super.anInt4913 != 0) {
					local340 = local7 | 0x5;
				}
				if (super.anInt4911 != 0) {
					local340 |= 0x2;
				}
			}
			local380 = super.aClass59Array3[3] = local321.method4856(Static334.aClass62_2, arg1, super.anInt4923, super.anInt4937, super.anInt4969, local340);
			if (local380 != null) {
				if (super.anInt4911 != 0) {
					local380.a(0, -super.anInt4911 << 0, 0);
				}
				if (super.anInt4913 != 0) {
					local380.ma(super.anInt4913 * 2048);
				}
				if (local338) {
					if (super.anInt4962 != 0) {
						local380.W(super.anInt4962);
					}
					if (super.anInt4957 != 0) {
						local380.K(super.anInt4957);
					}
					if (super.anInt4973 != 0) {
						local380.a(0, super.anInt4973, 0);
					}
				}
			}
		}
		super.aClass59Array3[2] = null;
		if (!this.aBoolean356 && super.aClass2_Sub41_3 != null) {
			if (super.aClass2_Sub41_3.anInt6956 <= Static266.anInt4392) {
				super.aClass2_Sub41_3 = null;
			} else if (super.aClass2_Sub41_3.anInt6970 <= Static266.anInt4392) {
				@Pc(611) Class59 local611 = super.aClass2_Sub41_3.method5393(local7 | 0x7, arg1);
				if (local611 != null) {
					local611.a(super.aClass2_Sub41_3.anInt6962 - super.anInt6833, -super.anInt6832 + super.aClass2_Sub41_3.anInt6959, super.aClass2_Sub41_3.anInt6973 - super.anInt6835);
					if (local171 != 0) {
						local611.ma(-local171 & 0x3FFF);
					}
					super.aClass59Array3[2] = local611;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "(I)I")
	@Override
	public int method4009() {
		return this.aClass249_1 == null || this.aClass249_1.anInt6781 == -1 ? super.method4009() : Static155.aClass263_1.method5581(this.aClass249_1.anInt6781).anInt6704;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLclient!sv;)V")
	public void method4024(@OriginalArg(1) Class2_Sub13 arg0) {
		arg0.anInt4347 = 0;
		@Pc(12) int local12 = arg0.method3580();
		this.aByte66 = (byte) (local12 & 0x1);
		@Pc(36) boolean local36 = (local12 & 0x2) != 0;
		@Pc(44) boolean local44 = (local12 & 0x4) != 0;
		@Pc(48) int local48 = super.method4009();
		this.method4008((local12 >> 3 & 0x7) + 1);
		this.aByte65 = (byte) (local12 >> 6 & 0x3);
		super.anInt6833 += this.method4009() - local48 << 6;
		super.anInt6835 += this.method4009() - local48 << 6;
		this.aByte64 = arg0.method3605();
		this.anInt5006 = arg0.method3605();
		this.anInt5009 = arg0.method3605();
		this.anInt4982 = 0;
		@Pc(112) int local112 = -1;
		@Pc(115) int[] local115 = new int[12];
		@Pc(135) int local135;
		@Pc(142) int local142;
		@Pc(190) int local190;
		for (@Pc(117) int local117 = 0; local117 < 12; local117++) {
			@Pc(123) int local123 = arg0.method3580();
			if (local123 == 0) {
				local115[local117] = 0;
			} else {
				local135 = arg0.method3580();
				local142 = (local123 << 8) + local135;
				if (local117 == 0 && local142 == 65535) {
					local112 = arg0.method3555();
					this.anInt4982 = arg0.method3580();
					break;
				}
				if (local142 >= 32768) {
					local142 = Static67.anIntArray106[local142 - 32768];
					local115[local117] = local142 | 0x40000000;
					local190 = Static384.aClass164_2.method3458(local142).anInt5686;
					if (local190 != 0) {
						this.anInt4982 = local190;
					}
				} else {
					local115[local117] = Integer.MIN_VALUE | local142 - 256;
				}
			}
		}
		@Pc(214) int[] local214 = new int[5];
		for (local135 = 0; local135 < 5; local135++) {
			local142 = arg0.method3580();
			if (local142 < 0 || Static287.aShortArrayArray6[local135].length <= local142) {
				local142 = 0;
			}
			local214[local135] = local142;
		}
		this.anInt5002 = arg0.method3555();
		this.aString147 = arg0.method3582();
		if (local36) {
			this.aString148 = arg0.method3582();
		} else {
			this.aString148 = this.aString147;
		}
		this.anInt5001 = arg0.method3580();
		if (local44) {
			this.anInt4992 = arg0.method3555();
			this.anInt4995 = this.anInt5001;
			this.anInt4988 = -1;
		} else {
			this.anInt4992 = 0;
			this.anInt4995 = arg0.method3580();
			this.anInt4988 = arg0.method3580();
			if (this.anInt4988 == 255) {
				this.anInt4988 = -1;
			}
		}
		local142 = this.anInt5013;
		this.anInt5013 = arg0.method3580();
		@Pc(342) int local342;
		if (this.anInt5013 == 0) {
			Static142.method2090(this);
		} else {
			local190 = this.anInt4985;
			@Pc(339) int local339 = this.anInt4986;
			local342 = this.anInt4989;
			@Pc(345) int local345 = this.anInt5015;
			@Pc(348) int local348 = this.anInt4993;
			this.anInt4985 = arg0.method3555();
			this.anInt4986 = arg0.method3555();
			this.anInt4989 = arg0.method3555();
			this.anInt5015 = arg0.method3555();
			this.anInt4993 = arg0.method3580();
			if (this.anInt5013 != local142 || local190 != this.anInt4985 || local339 != this.anInt4986 || this.anInt4989 != local342 || this.anInt5015 != local345 || this.anInt4993 != local348) {
				Static137.method5152(this);
			}
		}
		if (this.aClass249_1 == null) {
			this.aClass249_1 = new Class249();
		}
		local190 = this.aClass249_1.anInt6781;
		@Pc(430) int[] local430 = this.aClass249_1.anIntArray566;
		this.aClass249_1.method5245(local115, this.method3994(), local214, local112, this.aByte66 == 1);
		if (local112 != local190) {
			super.anInt6833 = (super.anIntArray425[0] << 7) + (this.method4009() << 6);
			super.anInt6835 = (super.anIntArray424[0] << 7) + (this.method4009() << 6);
		}
		if (Static201.anInt3383 == super.anInt4915 && local430 != null) {
			for (local342 = 0; local342 < local214.length; local342++) {
				if (local430[local342] != local214[local342]) {
					Static384.aClass164_2.method3462();
					break;
				}
			}
		}
		if (super.aClass21_Sub2_6 != null) {
			super.aClass21_Sub2_6.method638();
		}
		if (super.anInt4922 == -1 || !super.aBoolean353) {
			return;
		}
		@Pc(534) Class173 local534 = this.method4001();
		if (!local534.method3666(super.anInt4922)) {
			super.aBoolean353 = false;
			super.anInt4922 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!za;ILclient!c;Lclient!e;III)V")
	private void method4025(@OriginalArg(0) int arg0, @OriginalArg(1) Class163 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class31 arg3, @OriginalArg(4) Class59 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(11) int local11 = arg6 * arg6 + arg0 * arg0;
		if (local11 < 16384 || arg2 < local11) {
			return;
		}
		@Pc(40) int local40 = (int) (Math.atan2((double) arg0, (double) arg6) * 2607.5945876176133D) & 0x3FFF;
		@Pc(52) Class59 local52 = Static286.method3822(arg1, super.anInt4957, super.anInt4973, arg5, super.anInt4962, local40);
		if (local52 != null) {
			arg1.method5534(false);
			local52.method5736(arg3, null, 0);
			arg1.method5534(true);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLclient!za;)Lclient!ql;")
	@Override
	public Class21_Sub6 method5280(@OriginalArg(1) Class163 arg0) {
		if (this.aClass249_1 == null || !this.method4023(2048, arg0)) {
			return null;
		}
		@Pc(19) Class31 local19 = arg0.method5539();
		@Pc(24) int local24 = super.aClass12_7.method177();
		local19.ca(local24);
		local19.W(super.anInt6833, super.anInt6832, super.anInt6835);
		@Pc(38) float local38 = arg0.T();
		@Pc(41) float local41 = arg0.aa();
		@Pc(105) int local105;
		if (Static2.aClass148_Sub1_1.aBoolean255) {
			@Pc(48) Class173 local48 = this.method4001();
			if (local48.aBoolean318 && (this.aClass249_1.anInt6781 == -1 || Static155.aClass263_1.method5581(this.aClass249_1.anInt6781).aBoolean472)) {
				@Pc(82) Class128 local82 = super.anInt4903 != -1 && super.anInt4954 == 0 ? Static334.aClass62_2.method1418(super.anInt4903) : null;
				@Pc(103) Class128 local103 = super.anInt4922 == -1 || this.aBoolean356 || super.aBoolean353 && local82 != null ? null : Static334.aClass62_2.method1418(super.anInt4922);
				local105 = 0;
				if (super.anInt4909 != 0) {
					local105 = this.method3997();
				}
				@Pc(148) Class59 local148 = Static301.method2672(160, 0, super.anInt4962, local103 == null ? super.anInt4929 : super.anInt4967, arg0, local105, 240, 0, local24, super.aClass59Array3[0], super.anInt4957, 1, local103 == null ? local82 : local103, super.anInt4973);
				if (local148 != null) {
					arg0.da(local38, local41 - 128.0F);
					arg0.method5534(false);
					local148.method5736(local19, null, 0);
					arg0.method5534(true);
				}
			}
		}
		if (Static60.aClass3_Sub4_Sub1_Sub2_1 == this) {
			arg0.da(local38, local41 - 144.0F);
			local19.U(super.anInt6833, super.anInt6832, super.anInt6835);
			for (@Pc(189) int local189 = Static186.aClass185Array5.length - 1; local189 >= 0; local189--) {
				@Pc(195) Class185 local195 = Static186.aClass185Array5[local189];
				if (local195 != null && local195.anInt4817 != -1) {
					@Pc(226) int local226;
					if (local195.anInt4814 == 1) {
						@Pc(214) Class2_Sub28 local214 = (Class2_Sub28) Static49.aClass72_11.method1659((long) local195.anInt4822);
						if (local214 != null) {
							@Pc(219) Class3_Sub4_Sub1_Sub1 local219 = local214.aClass3_Sub4_Sub1_Sub1_1;
							local226 = local219.anInt6833 - Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6833;
							@Pc(232) int local232 = local219.anInt6835 - Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6835;
							this.method4025(local226, arg0, 5760000, local19, super.aClass59Array3[0], local195.anInt4817, local232);
						}
					}
					if (local195.anInt4814 == 2) {
						@Pc(263) int local263 = local195.anInt4813 + 64 - Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6833;
						local105 = local195.anInt4816 + 64 - Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6835;
						local226 = local195.anInt4821 << 7;
						local226 *= local226;
						this.method4025(local263, arg0, local226, local19, super.aClass59Array3[0], local195.anInt4817, local105);
					}
					if (local195.anInt4814 == 10 && local195.anInt4822 >= 0 && local195.anInt4822 < Static152.aClass3_Sub4_Sub1_Sub2Array1.length) {
						@Pc(316) Class3_Sub4_Sub1_Sub2 local316 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local195.anInt4822];
						if (local316 != null) {
							local105 = local316.anInt6833 - Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6833;
							local226 = local316.anInt6835 - Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6835;
							this.method4025(local105, arg0, 5760000, local19, super.aClass59Array3[0], local195.anInt4817, local226);
						}
					}
				}
			}
			local19.ca(local24);
			local19.W(super.anInt6833, super.anInt6832, super.anInt6835);
		}
		arg0.da(local38, local41);
		@Pc(371) Class21_Sub6 local371 = Static209.method2805(super.aClass59Array3.length);
		if (super.aClass21_Sub2_6 == null) {
			arg0.method5509(super.aClass59Array3, local19, local371.aClass21_Sub7Array1, Static60.aClass3_Sub4_Sub1_Sub2_1 == this ? 1 : 0);
		} else {
			@Pc(393) Class256 local393 = super.aClass21_Sub2_6.method634();
			arg0.method5556(super.aClass59Array3, local393, local19, local371.aClass21_Sub7Array1, Static60.aClass3_Sub4_Sub1_Sub2_1 == this ? 1 : 0);
		}
		this.method4006(arg0, super.aClass59Array3, false);
		if (super.aClass59Array3[2] != null) {
			if (local24 != 0) {
				super.aClass59Array3[2].ma(local24);
			}
			super.aClass59Array3[2].a(-super.aClass2_Sub41_3.anInt6962 + super.anInt6833, -super.aClass2_Sub41_3.anInt6959 + super.anInt6832, -super.aClass2_Sub41_3.anInt6973 + super.anInt6835);
		}
		super.anInt4935 = Static197.anInt3347;
		super.aClass59Array3[0] = super.aClass59Array3[1] = super.aClass59Array3[2] = super.aClass59Array3[3] = null;
		return local371;
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5285(@OriginalArg(0) Class163 arg0) {
		if (this.aClass249_1 != null && (super.aBoolean355 || this.method4023(0, arg0))) {
			this.method4006(arg0, super.aClass59Array3, super.aBoolean355);
			super.aClass59Array3[0] = super.aClass59Array3[1] = super.aClass59Array3[2] = super.aClass59Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!lb;IZIBILclient!za;)V")
	@Override
	public void method5281(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class163 arg5) {
		throw new IllegalStateException();
	}
}
