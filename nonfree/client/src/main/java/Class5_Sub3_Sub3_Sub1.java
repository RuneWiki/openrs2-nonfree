import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class5_Sub3_Sub3_Sub1 extends Class5_Sub3_Sub3 {

	@OriginalMember(owner = "client!ke", name = "Ic", descriptor = "Lclient!cj;")
	public Class31 aClass31_1;

	@OriginalMember(owner = "client!ke", name = "Lc", descriptor = "I")
	private int anInt3303;

	@OriginalMember(owner = "client!ke", name = "Rc", descriptor = "Ljava/lang/String;")
	public String aString129;

	@OriginalMember(owner = "client!ke", name = "ld", descriptor = "Ljava/lang/String;")
	public String aString130;

	@OriginalMember(owner = "client!ke", name = "Qc", descriptor = "I")
	public int anInt3308 = -1;

	@OriginalMember(owner = "client!ke", name = "Vc", descriptor = "I")
	public int anInt3312 = 0;

	@OriginalMember(owner = "client!ke", name = "Oc", descriptor = "I")
	public int anInt3306 = -1;

	@OriginalMember(owner = "client!ke", name = "Tc", descriptor = "I")
	public int anInt3310 = -1;

	@OriginalMember(owner = "client!ke", name = "Gc", descriptor = "I")
	public int anInt3299 = 0;

	@OriginalMember(owner = "client!ke", name = "hd", descriptor = "I")
	public int anInt3323 = -1;

	@OriginalMember(owner = "client!ke", name = "Wc", descriptor = "I")
	public int anInt3313 = -1;

	@OriginalMember(owner = "client!ke", name = "Zc", descriptor = "I")
	public int anInt3316 = 0;

	@OriginalMember(owner = "client!ke", name = "ad", descriptor = "I")
	public int anInt3317 = 0;

	@OriginalMember(owner = "client!ke", name = "rd", descriptor = "I")
	public int anInt3330 = 0;

	@OriginalMember(owner = "client!ke", name = "pd", descriptor = "B")
	private byte aByte30 = 0;

	@OriginalMember(owner = "client!ke", name = "td", descriptor = "I")
	public int anInt3331 = -1;

	@OriginalMember(owner = "client!ke", name = "sd", descriptor = "Z")
	public boolean aBoolean285 = false;

	@OriginalMember(owner = "client!ke", name = "jd", descriptor = "I")
	public int anInt3325 = -1;

	@OriginalMember(owner = "client!ke", name = "ud", descriptor = "B")
	private byte aByte31 = 0;

	@OriginalMember(owner = "client!ke", name = "vd", descriptor = "I")
	public int anInt3332 = 255;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(B)V")
	@Override
	public void method5678() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)I")
	@Override
	public int method4541() {
		return this.aClass31_1 == null || this.aClass31_1.anInt962 == -1 ? super.method4541() : Static232.method5539(this.aClass31_1.anInt962).anInt3819;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method3061() {
		return this.aString130;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!aa;Z)V")
	@Override
	public void method5686(@OriginalArg(0) Class2 arg0) {
		if (this.aClass31_1 != null && (super.aBoolean416 || this.method3068(arg0, 0))) {
			this.method4547(arg0, super.aBoolean416, super.aClass78Array3);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZIILclient!aa;ILclient!qh;)V")
	@Override
	public void method5677(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!eb;)V")
	public void method3062(@OriginalArg(1) Class1_Sub7 arg0) {
		arg0.anInt3368 = 0;
		@Pc(14) int local14 = arg0.method3141();
		@Pc(18) int local18 = local14 & 0x1;
		@Pc(26) boolean local26 = (local14 & 0x2) != 0;
		@Pc(34) boolean local34 = (local14 & 0x4) != 0;
		@Pc(38) int local38 = super.method4541();
		this.method4531((local14 >> 3 & 0x7) + 1);
		this.aByte30 = (byte) (local14 >> 6 & 0x3);
		super.anInt5050 += (this.method4541() - local38) * 64;
		super.anInt5047 += (this.method4541() - local38) * 64;
		this.aByte31 = arg0.method3130();
		this.anInt3310 = arg0.method3130();
		this.anInt3306 = arg0.method3130();
		@Pc(101) int local101 = -1;
		this.anInt3316 = 0;
		@Pc(107) int[] local107 = new int[12];
		@Pc(127) int local127;
		@Pc(134) int local134;
		@Pc(174) int local174;
		for (@Pc(109) int local109 = 0; local109 < 12; local109++) {
			@Pc(115) int local115 = arg0.method3141();
			if (local115 == 0) {
				local107[local109] = 0;
			} else {
				local127 = arg0.method3141();
				local134 = (local115 << 8) + local127;
				if (local109 == 0 && local134 == 65535) {
					local101 = arg0.method3115();
					this.anInt3316 = arg0.method3141();
					break;
				}
				if (local134 >= 32768) {
					local134 = Static155.anIntArray356[local134 - 32768];
					local107[local109] = local134 | 0x40000000;
					local174 = Static241.method4285(local134).anInt1834;
					if (local174 != 0) {
						this.anInt3316 = local174;
					}
				} else {
					local107[local109] = local134 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(201) int[] local201 = new int[5];
		for (local127 = 0; local127 < 5; local127++) {
			local134 = arg0.method3141();
			if (local134 < 0 || local134 >= Static172.aShortArrayArray8[local127].length) {
				local134 = 0;
			}
			local201[local127] = local134;
		}
		this.anInt3303 = arg0.method3115();
		this.aString129 = arg0.method3134();
		if (local26) {
			this.aString130 = arg0.method3134();
		} else {
			this.aString130 = this.aString129;
		}
		this.anInt3330 = arg0.method3141();
		if (local34) {
			this.anInt3312 = arg0.method3115();
			this.anInt3325 = -1;
			this.anInt3317 = this.anInt3330;
		} else {
			this.anInt3312 = 0;
			this.anInt3317 = arg0.method3141();
			this.anInt3325 = arg0.method3141();
			if (this.anInt3325 == 255) {
				this.anInt3325 = -1;
			}
		}
		local134 = this.anInt3299;
		this.anInt3299 = arg0.method3141();
		@Pc(320) int local320;
		if (this.anInt3299 == 0) {
			Static299.method5096(this);
		} else {
			local174 = this.anInt3313;
			@Pc(317) int local317 = this.anInt3323;
			local320 = this.anInt3331;
			@Pc(323) int local323 = this.anInt3308;
			@Pc(326) int local326 = this.anInt3332;
			this.anInt3313 = arg0.method3115();
			this.anInt3323 = arg0.method3115();
			this.anInt3331 = arg0.method3115();
			this.anInt3308 = arg0.method3115();
			this.anInt3332 = arg0.method3141();
			if (local134 != this.anInt3299 || local174 != this.anInt3313 || this.anInt3323 != local317 || local320 != this.anInt3331 || this.anInt3308 != local323 || local326 != this.anInt3332) {
				Static231.method4161(this);
			}
		}
		if (this.aClass31_1 == null) {
			this.aClass31_1 = new Class31();
		}
		local174 = this.aClass31_1.anInt962;
		@Pc(415) int[] local415 = this.aClass31_1.anIntArray118;
		this.aClass31_1.method1009(this.method4544(), local201, local107, local101, local18 == 1);
		if (local101 != local174) {
			super.anInt5050 = super.anIntArray638[0] * 128 + this.method4541() * 64;
			super.anInt5047 = super.anIntArray637[0] * 128 + this.method4541() * 64;
		}
		if (super.anInt4920 == 2047 && local415 != null) {
			for (local320 = 0; local320 < local201.length; local320++) {
				if (local201[local320] != local415[local320]) {
					Static82.method1589();
					break;
				}
			}
		}
		if (super.aClass15_Sub5_6 != null) {
			super.aClass15_Sub5_6.method2866();
		}
		if (super.anInt4975 == -1 || !super.aBoolean412) {
			return;
		}
		@Pc(512) Class45 local512 = this.method4533();
		if (!local512.method1421(super.anInt4975)) {
			super.aBoolean412 = false;
			super.anInt4975 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLclient!ci;IILclient!hc;ILclient!aa;I)V")
	private void method3063(@OriginalArg(1) Class21 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class78 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class2 arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg2 * arg2 + arg6 * arg6;
		if (local11 < 16 || arg4 < local11) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg2, (double) arg6) * 2607.5945876176133D) & 0x3FFF;
		@Pc(60) Class78 local60 = Static245.method4338(super.anInt5047, super.anInt4938, arg1, local33, arg5, arg3, super.anInt5046, super.anInt4948, super.anInt5050, super.anInt4946);
		if (local60 != null) {
			arg5.method3337(false);
			local60.method4379(arg0, null, 0);
			arg5.method3337(true);
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(ZB)Ljava/lang/String;")
	public String method3064() {
		@Pc(7) String local7 = "";
		if (Static87.aStringArray8 != null) {
			local7 = local7 + Static87.aStringArray8[this.aByte30];
		}
		if (Static350.anIntArray806 != null && Static350.anIntArray806[this.aByte30] != -1) {
			@Pc(42) Class1_Sub1_Sub19 local42 = Static307.method5167(Static350.anIntArray806[this.aByte30]);
			if (local42.aChar5 == 's') {
				local7 = local7 + local42.method5403(this.aByte31 & 0xFF);
			} else {
				Static152.method2899("gdn1", new Throwable());
				Static350.anIntArray806[this.aByte30] = -1;
			}
		}
		local7 = local7 + this.aString129;
		if (Static187.aStringArray27 != null) {
			local7 = local7 + Static187.aStringArray27[this.aByte30];
		}
		return local7;
	}

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "(I)Z")
	public boolean method3065() {
		return this.aClass31_1 != null;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)I")
	@Override
	public int method4586() {
		return super.anInt4956;
	}

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "(I)I")
	@Override
	public int method4542() {
		return -1;
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(Z)I")
	@Override
	protected int method4544() {
		return this.anInt3303;
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5681() {
		return false;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!aa;I)Lclient!cn;")
	@Override
	public Class15_Sub3 method5680(@OriginalArg(0) Class2 arg0) {
		if (this.aClass31_1 == null || !this.method3068(arg0, 1024)) {
			return null;
		}
		@Pc(25) Class21 local25 = arg0.method3284();
		@Pc(30) int local30 = super.aClass11_7.method322();
		local25.method2809(local30);
		local25.method2810(super.anInt5050, super.anInt5046, super.anInt5047);
		@Pc(44) float local44 = arg0.method3317();
		@Pc(47) float local47 = arg0.method3282();
		if (Static264.aBoolean464) {
			@Pc(53) Class45 local53 = this.method4533();
			if (local53.aBoolean130 && (this.aClass31_1.anInt962 == -1 || Static232.method5539(this.aClass31_1.anInt962).aBoolean323)) {
				@Pc(84) Class121 local84 = super.anInt4977 != -1 && super.anInt4936 == 0 ? Static133.method2520(super.anInt4977) : null;
				@Pc(103) Class121 local103 = super.anInt4975 == -1 || this.aBoolean285 || super.aBoolean412 && local84 != null ? null : Static133.method2520(super.anInt4975);
				@Pc(137) Class78 local137 = Static56.method1210(super.anInt4948, 160, local30, 0, 1, local103 == null ? local84 : local103, super.anInt4938, local103 == null ? super.anInt4950 : super.anInt4941, super.aClass78Array3[0], super.anInt4946, 240, super.aBoolean414, 0, arg0);
				if (local137 != null) {
					arg0.method3320(local44, local47 - 128.0F);
					arg0.method3337(false);
					local137.method4379(local25, null, 0);
					arg0.method3337(true);
				}
			}
		}
		if (Static130.aClass5_Sub3_Sub3_Sub1_1 == this) {
			arg0.method3320(local44, local47 - 144.0F);
			local25.method2814(super.anInt5050, super.anInt5046, super.anInt5047);
			for (@Pc(178) int local178 = Static135.aClass136Array1.length - 1; local178 >= 0; local178--) {
				@Pc(184) Class136 local184 = Static135.aClass136Array1[local178];
				if (local184 != null && local184.anInt4065 != -1) {
					@Pc(233) int local233;
					@Pc(222) int local222;
					if (local184.anInt4068 == 1 && local184.anInt4063 >= 0 && Static169.aClass5_Sub3_Sub3_Sub2Array2.length > local184.anInt4063) {
						@Pc(209) Class5_Sub3_Sub3_Sub2 local209 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local184.anInt4063];
						if (local209 != null) {
							local222 = local209.anInt5050 / 32 - Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5050 / 32;
							local233 = local209.anInt5047 / 32 - Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5047 / 32;
							this.method3063(local25, local184.anInt4065, local222, super.aClass78Array3[0], 360000, arg0, local233);
						}
					}
					if (local184.anInt4068 == 2) {
						@Pc(266) int local266 = (local184.anInt4067 - Static182.anInt3775) * 4 + 2 - Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5050 / 32;
						local222 = (local184.anInt4052 - Static161.anInt3315) * 4 + 2 - Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5047 / 32;
						local233 = local184.anInt4054 * 4;
						local233 *= local233;
						this.method3063(local25, local184.anInt4065, local266, super.aClass78Array3[0], local233, arg0, local222);
					}
					if (local184.anInt4068 == 10 && local184.anInt4063 >= 0 && Static254.aClass5_Sub3_Sub3_Sub1Array1.length > local184.anInt4063) {
						@Pc(331) Class5_Sub3_Sub3_Sub1 local331 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local184.anInt4063];
						if (local331 != null) {
							local222 = local331.anInt5050 / 32 - Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5050 / 32;
							local233 = local331.anInt5047 / 32 - Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5047 / 32;
							this.method3063(local25, local184.anInt4065, local222, super.aClass78Array3[0], 360000, arg0, local233);
						}
					}
				}
			}
			local25.method2809(local30);
			local25.method2810(super.anInt5050, super.anInt5046, super.anInt5047);
		}
		arg0.method3320(local44, local47);
		@Pc(396) Class15_Sub3 local396 = Static186.method3613(super.aClass78Array3.length);
		if (super.aClass15_Sub5_6 == null) {
			arg0.method3285(super.aClass78Array3, local25, local396.aClass15_Sub2Array1, Static130.aClass5_Sub3_Sub3_Sub1_1 == this ? 1 : 0);
		} else {
			@Pc(403) Class162 local403 = super.aClass15_Sub5_6.method2868();
			arg0.method3318(super.aClass78Array3, local403, local25, local396.aClass15_Sub2Array1, Static130.aClass5_Sub3_Sub3_Sub1_1 == this ? 1 : 0);
		}
		this.method4547(arg0, false, super.aClass78Array3);
		if (super.aClass78Array3[2] != null) {
			if (local30 != 0) {
				super.aClass78Array3[2].method4372(local30);
			}
			super.aClass78Array3[2].method4399(-super.anInt4987 + super.anInt5050, -super.anInt4992 + super.anInt5046, super.anInt5047 - super.anInt4988);
		}
		return local396;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIILclient!aa;)Z")
	@Override
	public boolean method5684(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2 arg2) {
		if (this.aClass31_1 == null || !this.method3068(arg2, 65536)) {
			return true;
		}
		@Pc(19) Class21 local19 = arg2.method3284();
		@Pc(24) int local24 = super.aClass11_7.method322();
		local19.method2809(local24);
		local19.method2810(super.anInt5050, super.anInt5046, super.anInt5047);
		for (@Pc(37) int local37 = 0; local37 < super.aClass78Array3.length; local37++) {
			if (super.aClass78Array3[local37] != null && super.aClass78Array3[local37].method4381(arg0, arg1, local19, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZIZII)V")
	public void method3067(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		super.method4528(this.method4541(), arg3, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!aa;II)Z")
	private boolean method3068(@OriginalArg(0) Class2 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class45 local11 = this.method4533();
		@Pc(29) Class121 local29 = super.anInt4977 != -1 && super.anInt4936 == 0 ? Static133.method2520(super.anInt4977) : null;
		@Pc(49) Class121 local49 = super.anInt4975 == -1 || this.aBoolean285 || super.aBoolean412 && local29 != null ? null : Static133.method2520(super.anInt4975);
		@Pc(52) int local52 = local11.anInt1487;
		@Pc(55) int local55 = local11.anInt1497;
		if (local52 != 0 || local55 != 0 || local11.anInt1483 != 0 || local11.anInt1503 != 0) {
			arg1 |= 0x7;
		}
		super.aClass78Array3[0] = this.aClass31_1.method1013(super.anInt4957, super.aClass59Array3, super.anInt4950, arg1, super.anInt4965, arg0, super.anInt4973, super.anInt4941, super.anInt4954, local49, local29);
		@Pc(110) int local110 = Static61.method1283();
		if (Static157.anInt3131 < 96 && local110 > 50) {
			Static125.method2403();
		}
		@Pc(135) int local135;
		if (Static50.anInt1155 != 0 && local110 < 50) {
			local135 = 50 - local110;
			while (local135 > Static88.anInt1740) {
				Static152.aByteArrayArray10[Static88.anInt1740] = new byte[102400];
				Static88.anInt1740++;
			}
			while (local135 < Static88.anInt1740) {
				Static88.anInt1740--;
				Static152.aByteArrayArray10[Static88.anInt1740] = null;
			}
		} else if (Static50.anInt1155 != 0) {
			Static152.aByteArrayArray10 = new byte[50][];
			Static88.anInt1740 = 0;
		}
		if (super.aClass78Array3[0] == null) {
			return false;
		}
		super.anInt4956 = super.aClass78Array3[0].method4388();
		this.method4539(super.aClass78Array3[0]);
		local135 = super.aClass11_7.method322();
		super.anInt4946 = 0;
		super.anInt4938 = 0;
		super.anInt4948 = 0;
		if (local52 == 0 && local55 == 0) {
			this.method4543(this.method4541() << 7, local135, this.method4541() << 7);
		} else {
			this.method4543(local52, local135, local55);
			if (super.anInt4938 != 0) {
				super.aClass78Array3[0].method4369(super.anInt4938);
			}
			if (super.anInt4946 != 0) {
				super.aClass78Array3[0].method4389(super.anInt4946);
			}
			if (super.anInt4948 != 0) {
				super.aClass78Array3[0].method4399(0, super.anInt4948, 0);
			}
		}
		super.aClass78Array3[1] = null;
		if (!this.aBoolean285 && super.anInt4934 != -1 && super.anInt4979 != -1) {
			@Pc(303) Class125 local303 = Static183.method3571(super.anInt4934);
			@Pc(322) Class78 local322 = local303.method3646(super.anInt4979, super.anInt4976, super.anInt4972, arg0, (local303.aBoolean334 ? 7 : 2) | local7);
			if (local322 != null) {
				local322.method4399(0, -super.anInt4958, 0);
				if (local303.aBoolean334 && (local52 != 0 || local55 != 0)) {
					if (super.anInt4938 != 0) {
						local322.method4369(super.anInt4938);
					}
					if (super.anInt4946 != 0) {
						local322.method4389(super.anInt4946);
					}
					if (super.anInt4948 != 0) {
						local322.method4399(0, super.anInt4948, 0);
					}
				}
				super.aClass78Array3[1] = local322;
			}
		}
		super.aClass78Array3[2] = null;
		if (!this.aBoolean285 && super.anInterface8_3 != null) {
			if (super.anInt4983 <= Static215.anInt4246) {
				super.anInterface8_3 = null;
			}
			if (super.anInt4982 <= Static215.anInt4246 && Static215.anInt4246 < super.anInt4983) {
				@Pc(418) Class78 local418 = super.anInterface8_3.method5695(arg0, local7 | 0x7);
				if (local418 != null) {
					local418.method4399(-super.anInt5050 + super.anInt4987, super.anInt4992 + -super.anInt5046, -super.anInt5047 + super.anInt4988);
					if (local135 != 0) {
						local418.method4372(-local135 & 0x3FFF);
					}
					super.aClass78Array3[2] = local418;
				}
			}
		}
		return true;
	}
}
