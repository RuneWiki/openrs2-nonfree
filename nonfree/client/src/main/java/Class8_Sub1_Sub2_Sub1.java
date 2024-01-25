import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class8_Sub1_Sub2_Sub1 extends Class8_Sub1_Sub2 {

	@OriginalMember(owner = "client!fa", name = "Nc", descriptor = "Lclient!cn;")
	public Class33 aClass33_1;

	@OriginalMember(owner = "client!fa", name = "Tc", descriptor = "Ljava/lang/String;")
	public String aString23;

	@OriginalMember(owner = "client!fa", name = "Vc", descriptor = "I")
	private int anInt2354;

	@OriginalMember(owner = "client!fa", name = "Zc", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!fa", name = "Ec", descriptor = "Z")
	public boolean aBoolean169 = false;

	@OriginalMember(owner = "client!fa", name = "Qc", descriptor = "I")
	public int anInt2350 = -1;

	@OriginalMember(owner = "client!fa", name = "Kc", descriptor = "B")
	private byte aByte24 = 0;

	@OriginalMember(owner = "client!fa", name = "Jc", descriptor = "I")
	public int anInt2345 = -1;

	@OriginalMember(owner = "client!fa", name = "Wc", descriptor = "I")
	public int anInt2355 = -1;

	@OriginalMember(owner = "client!fa", name = "Yc", descriptor = "I")
	public int anInt2357 = -1;

	@OriginalMember(owner = "client!fa", name = "Lc", descriptor = "I")
	public int anInt2346 = 0;

	@OriginalMember(owner = "client!fa", name = "jd", descriptor = "I")
	public int anInt2365 = 0;

	@OriginalMember(owner = "client!fa", name = "ed", descriptor = "I")
	public int anInt2361 = 0;

	@OriginalMember(owner = "client!fa", name = "dd", descriptor = "I")
	public int anInt2360 = -1;

	@OriginalMember(owner = "client!fa", name = "nd", descriptor = "B")
	private byte aByte25 = 0;

	@OriginalMember(owner = "client!fa", name = "rd", descriptor = "I")
	public int anInt2372 = -1;

	@OriginalMember(owner = "client!fa", name = "vd", descriptor = "I")
	public int anInt2374 = 255;

	@OriginalMember(owner = "client!fa", name = "sd", descriptor = "I")
	public int anInt2373 = 0;

	@OriginalMember(owner = "client!fa", name = "ud", descriptor = "B")
	private byte aByte26 = 0;

	@OriginalMember(owner = "client!fa", name = "wd", descriptor = "I")
	public int anInt2375 = 0;

	@OriginalMember(owner = "client!fa", name = "yd", descriptor = "I")
	public int anInt2377 = -1;

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "(B)I")
	@Override
	public int method4349() {
		return this.aClass33_1 == null || this.aClass33_1.anInt1242 == -1 ? super.method4349() : Static36.method744(this.aClass33_1.anInt1242).anInt4382;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!vq;B)V")
	@Override
	public void method5627(@OriginalArg(0) Class47 arg0) {
		if (this.aClass33_1 != null && (super.aBoolean375 || this.method2089(arg0, 0))) {
			this.method4338(super.aClass38Array3, super.aBoolean375, arg0);
		}
	}

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)I")
	@Override
	public int method5629() {
		return super.anInt4941;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V")
	public void method2082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray415[0];
		@Pc(15) int local15 = super.anIntArray416[0];
		if (arg1 == 0) {
			local10--;
			local15++;
		}
		if (arg1 == 1) {
			local15++;
		}
		if (arg1 == 2) {
			local15++;
			local10++;
		}
		if (arg1 == 3) {
			local10--;
		}
		if (arg1 == 4) {
			local10++;
		}
		if (arg1 == 5) {
			local10--;
			local15--;
		}
		if (arg1 == 6) {
			local15--;
		}
		if (arg1 == 7) {
			local15--;
			local10++;
		}
		if (super.anInt4954 != -1 && Static225.method4042(super.anInt4954).anInt352 == 1) {
			super.anInt4954 = -1;
		}
		if (super.anInt4972 != -1) {
			@Pc(77) Class5 local77 = Static116.method2427(super.anInt4972);
			if (local77.aBoolean11 && local77.anInt101 != -1 && Static225.method4042(local77.anInt101).anInt352 == 1) {
				super.anInt4972 = -1;
			}
		}
		if (super.anInt4987 < 9) {
			super.anInt4987++;
		}
		for (@Pc(118) int local118 = super.anInt4987; local118 > 0; local118--) {
			super.anIntArray415[local118] = super.anIntArray415[local118 - 1];
			super.anIntArray416[local118] = super.anIntArray416[local118 - 1];
			super.aByteArray67[local118] = super.aByteArray67[local118 - 1];
		}
		super.anIntArray415[0] = local10;
		super.anIntArray416[0] = local15;
		super.aByteArray67[0] = (byte) arg0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!lf;)V")
	public void method2083(@OriginalArg(1) Class4_Sub11 arg0) {
		arg0.anInt3768 = 0;
		@Pc(12) int local12 = arg0.method3440();
		this.aByte24 = (byte) (local12 & 0x1);
		@Pc(29) boolean local29 = (local12 & 0x2) != 0;
		@Pc(40) boolean local40 = (local12 & 0x4) != 0;
		@Pc(44) int local44 = super.method4349();
		this.method4350((local12 >> 3 & 0x7) + 1);
		this.aByte26 = (byte) (local12 >> 6 & 0x3);
		super.anInt6701 += (this.method4349() - local44) * 64;
		super.anInt6702 += (this.method4349() - local44) * 64;
		this.aByte25 = arg0.method3426();
		this.anInt2377 = arg0.method3426();
		this.anInt2355 = arg0.method3426();
		this.anInt2361 = 0;
		@Pc(107) int local107 = -1;
		@Pc(110) int[] local110 = new int[12];
		@Pc(130) int local130;
		@Pc(137) int local137;
		@Pc(175) int local175;
		for (@Pc(112) int local112 = 0; local112 < 12; local112++) {
			@Pc(118) int local118 = arg0.method3440();
			if (local118 == 0) {
				local110[local112] = 0;
			} else {
				local130 = arg0.method3440();
				local137 = (local118 << 8) + local130;
				if (local112 == 0 && local137 == 65535) {
					local107 = arg0.method3401();
					this.anInt2361 = arg0.method3440();
					break;
				}
				if (local137 >= 32768) {
					local137 = Static315.anIntArray478[local137 - 32768];
					local110[local112] = local137 | 0x40000000;
					local175 = Static177.method3465(local137).anInt6515;
					if (local175 != 0) {
						this.anInt2361 = local175;
					}
				} else {
					local110[local112] = local137 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(197) int[] local197 = new int[5];
		for (local130 = 0; local130 < 5; local130++) {
			local137 = arg0.method3440();
			if (local137 < 0 || Static106.aShortArrayArray5[local130].length <= local137) {
				local137 = 0;
			}
			local197[local130] = local137;
		}
		this.anInt2354 = arg0.method3401();
		this.aString23 = arg0.method3446();
		if (local29) {
			this.aString24 = arg0.method3446();
		} else {
			this.aString24 = this.aString23;
		}
		this.anInt2346 = arg0.method3440();
		if (local40) {
			this.anInt2375 = arg0.method3401();
			this.anInt2345 = -1;
			this.anInt2373 = this.anInt2346;
		} else {
			this.anInt2375 = 0;
			this.anInt2373 = arg0.method3440();
			this.anInt2345 = arg0.method3440();
			if (this.anInt2345 == 255) {
				this.anInt2345 = -1;
			}
		}
		local137 = this.anInt2365;
		this.anInt2365 = arg0.method3440();
		@Pc(321) int local321;
		if (this.anInt2365 == 0) {
			Static262.method4566(this);
		} else {
			local175 = this.anInt2357;
			@Pc(318) int local318 = this.anInt2360;
			local321 = this.anInt2350;
			@Pc(324) int local324 = this.anInt2372;
			@Pc(327) int local327 = this.anInt2374;
			this.anInt2357 = arg0.method3401();
			this.anInt2360 = arg0.method3401();
			this.anInt2350 = arg0.method3401();
			this.anInt2372 = arg0.method3401();
			this.anInt2374 = arg0.method3440();
			if (this.anInt2365 != local137 || local175 != this.anInt2357 || this.anInt2360 != local318 || local321 != this.anInt2350 || local324 != this.anInt2372 || local327 != this.anInt2374) {
				Static15.method873(this);
			}
		}
		if (this.aClass33_1 == null) {
			this.aClass33_1 = new Class33();
		}
		local175 = this.aClass33_1.anInt1242;
		@Pc(404) int[] local404 = this.aClass33_1.anIntArray56;
		this.aClass33_1.method927(this.aByte24 == 1, this.method4336(), local197, local107, local110);
		if (local107 != local175) {
			super.anInt6701 = super.anIntArray415[0] * 128 + this.method4349() * 64;
			super.anInt6702 = super.anIntArray416[0] * 128 + this.method4349() * 64;
		}
		if (super.anInt4916 == 2047 && local404 != null) {
			for (local321 = 0; local321 < local197.length; local321++) {
				if (local197[local321] != local404[local321]) {
					Static192.method3640();
					break;
				}
			}
		}
		if (super.aClass2_Sub4_5 != null) {
			super.aClass2_Sub4_5.method3928();
		}
		if (super.anInt4937 == -1 || !super.aBoolean371) {
			return;
		}
		@Pc(497) Class40 local497 = this.method4347();
		if (!local497.method1179(super.anInt4937)) {
			super.anInt4937 = -1;
			super.aBoolean371 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "(B)I")
	@Override
	public int method4339() {
		return -1;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIZI)V")
	public void method2084(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		super.method4340(arg3, arg0, arg2, this.method4349(), arg1);
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5622() {
		return false;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!vq;ZLclient!km;IIBI)V")
	@Override
	public void method5621(@OriginalArg(0) Class47 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!vq;IIB)Z")
	@Override
	public boolean method5623(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass33_1 == null || !this.method2089(arg0, 65536)) {
			return true;
		}
		@Pc(19) Class57 local19 = arg0.method2706();
		@Pc(24) int local24 = super.aClass106_7.method3018();
		local19.method4192(local24);
		local19.method4190(super.anInt6701, super.anInt6697, super.anInt6702);
		for (@Pc(45) int local45 = 0; local45 < super.aClass38Array3.length; local45++) {
			if (super.aClass38Array3[local45] != null && super.aClass38Array3[local45].method1905(arg1, arg2, local19, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!s;IBIILclient!ni;ILclient!vq;)V")
	private void method2086(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class38 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class47 arg6) {
		@Pc(11) int local11 = arg3 * arg3 + arg1 * arg1;
		if (local11 < 16 || arg5 < local11) {
			return;
		}
		@Pc(38) int local38 = (int) (Math.atan2((double) arg1, (double) arg3) * 2607.5945876176133D) & 0x3FFF;
		@Pc(57) Class38 local57 = Static114.method2395(super.anInt4951, super.anInt6702, super.anInt6697, super.anInt6701, arg4, arg2, super.anInt4948, arg6, local38, super.anInt4946);
		if (local57 != null) {
			arg6.method2758(false);
			local57.method1925(arg0, null, 0);
			arg6.method2758(true);
		}
	}

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "(I)Z")
	public boolean method2087() {
		return this.aClass33_1 != null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BLclient!vq;I)Z")
	private boolean method2089(@OriginalArg(1) Class47 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class40 local11 = this.method4347();
		@Pc(26) Class14 local26 = super.anInt4954 != -1 && super.anInt4935 == 0 ? Static225.method4042(super.anInt4954) : null;
		@Pc(45) Class14 local45 = super.anInt4937 == -1 || this.aBoolean169 || super.aBoolean371 && local26 != null ? null : Static225.method4042(super.anInt4937);
		@Pc(48) int local48 = local11.anInt1454;
		@Pc(51) int local51 = local11.anInt1460;
		if (local48 != 0 || local51 != 0 || local11.anInt1463 != 0 || local11.anInt1436 != 0) {
			arg1 |= 0x7;
		}
		super.aClass38Array3[0] = this.aClass33_1.method923(super.anInt4945, super.aClass202Array3, arg0, super.anInt4961, super.anInt4921, arg1, local26, super.anInt4920, super.anInt4913, super.anInt4969, local45);
		@Pc(107) int local107 = Static44.method884();
		if (Static286.anInt6700 < 96 && local107 > 50) {
			Static169.method3267();
		}
		@Pc(129) int local129;
		if (Static110.anInt2697 != 0 && local107 < 50) {
			local129 = 50 - local107;
			while (local129 > Static56.anInt1503) {
				Static223.aByteArrayArray17[Static56.anInt1503] = new byte[102400];
				Static56.anInt1503++;
			}
			while (local129 < Static56.anInt1503) {
				Static56.anInt1503--;
				Static223.aByteArrayArray17[Static56.anInt1503] = null;
			}
		} else if (Static110.anInt2697 != 0) {
			Static56.anInt1503 = 0;
			Static223.aByteArrayArray17 = new byte[50][];
		}
		if (super.aClass38Array3[0] == null) {
			return false;
		}
		super.anInt4941 = super.aClass38Array3[0].method1921();
		this.method4341(super.aClass38Array3[0]);
		local129 = super.aClass106_7.method3018();
		super.anInt4951 = 0;
		super.anInt4948 = 0;
		super.anInt4946 = 0;
		if (local48 == 0 && local51 == 0) {
			this.method4334(local129, this.method4349() << 7, this.method4349() << 7);
		} else {
			this.method4334(local129, local51, local48);
			if (super.anInt4951 != 0) {
				super.aClass38Array3[0].method1913(super.anInt4951);
			}
			if (super.anInt4946 != 0) {
				super.aClass38Array3[0].method1897(super.anInt4946);
			}
			if (super.anInt4948 != 0) {
				super.aClass38Array3[0].method1883(0, super.anInt4948, 0);
			}
		}
		super.aClass38Array3[1] = null;
		if (!this.aBoolean169 && super.anInt4972 != -1 && super.anInt4971 != -1) {
			@Pc(303) Class5 local303 = Static116.method2427(super.anInt4972);
			@Pc(324) Class38 local324 = local303.method121(local7 | (local303.aBoolean12 ? 7 : 2), super.anInt4971, arg0, super.anInt4949, super.anInt4980);
			if (local324 != null) {
				local324.method1883(0, -super.anInt4943, 0);
				if (local303.aBoolean12 && (local48 != 0 || local51 != 0)) {
					if (super.anInt4951 != 0) {
						local324.method1913(super.anInt4951);
					}
					if (super.anInt4946 != 0) {
						local324.method1897(super.anInt4946);
					}
					if (super.anInt4948 != 0) {
						local324.method1883(0, super.anInt4948, 0);
					}
				}
				super.aClass38Array3[1] = local324;
			}
		}
		super.aClass38Array3[2] = null;
		if (!this.aBoolean169 && super.anInterface7_3 != null) {
			if (Static199.anInt4137 >= super.anInt4986) {
				super.anInterface7_3 = null;
			}
			if (super.anInt4988 <= Static199.anInt4137 && super.anInt4986 > Static199.anInt4137) {
				@Pc(425) Class38 local425 = super.anInterface7_3.method5588(local7 | 0x7, arg0);
				if (local425 != null) {
					local425.method1883(super.anInt4991 - super.anInt6701, super.anInt4983 + -super.anInt6697, -super.anInt6702 + super.anInt4984);
					if (local129 != 0) {
						local425.method1899(-local129 & 0x3FFF);
					}
					super.aClass38Array3[2] = local425;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BLclient!vq;)Lclient!bf;")
	@Override
	public Class2_Sub2 method5624(@OriginalArg(1) Class47 arg0) {
		if (this.aClass33_1 == null || !this.method2089(arg0, 1024)) {
			return null;
		}
		@Pc(27) Class57 local27 = arg0.method2706();
		@Pc(32) int local32 = super.aClass106_7.method3018();
		local27.method4192(local32);
		local27.method4190(super.anInt6701, super.anInt6697, super.anInt6702);
		@Pc(46) float local46 = arg0.method2702();
		@Pc(49) float local49 = arg0.method2734();
		if (Static241.aBoolean366) {
			@Pc(55) Class40 local55 = this.method4347();
			if (local55.aBoolean106 && (this.aClass33_1.anInt1242 == -1 || Static36.method744(this.aClass33_1.anInt1242).aBoolean336)) {
				@Pc(85) Class14 local85 = super.anInt4954 != -1 && super.anInt4935 == 0 ? Static225.method4042(super.anInt4954) : null;
				@Pc(105) Class14 local105 = super.anInt4937 == -1 || this.aBoolean169 || super.aBoolean371 && local85 != null ? null : Static225.method4042(super.anInt4937);
				@Pc(139) Class38 local139 = Static3.method119(arg0, 160, 1, local105 == null ? super.anInt4961 : super.anInt4921, super.aClass38Array3[0], 240, super.aBoolean374, 0, local32, local105 == null ? local85 : local105, super.anInt4946, 0, super.anInt4948, super.anInt4951);
				if (local139 != null) {
					arg0.method2701(local46, local49 - 128.0F);
					arg0.method2758(false);
					local139.method1925(local27, null, 0);
					arg0.method2758(true);
				}
			}
		}
		if (Static158.aClass8_Sub1_Sub2_Sub1_1 == this) {
			arg0.method2701(local46, local49 - 144.0F);
			local27.method4189(super.anInt6701, super.anInt6697, super.anInt6702);
			for (@Pc(180) int local180 = Static116.aClass187Array1.length - 1; local180 >= 0; local180--) {
				@Pc(186) Class187 local186 = Static116.aClass187Array1[local180];
				if (local186 != null && local186.anInt5732 != -1) {
					@Pc(235) int local235;
					@Pc(224) int local224;
					if (local186.anInt5730 == 1 && local186.anInt5734 >= 0 && Static169.aClass8_Sub1_Sub2_Sub2Array1.length > local186.anInt5734) {
						@Pc(211) Class8_Sub1_Sub2_Sub2 local211 = Static169.aClass8_Sub1_Sub2_Sub2Array1[local186.anInt5734];
						if (local211 != null) {
							local224 = local211.anInt6701 / 32 - Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6701 / 32;
							local235 = local211.anInt6702 / 32 - Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6702 / 32;
							this.method2086(local27, local224, local186.anInt5732, local235, super.aClass38Array3[0], 360000, arg0);
						}
					}
					if (local186.anInt5730 == 2) {
						@Pc(271) int local271 = (-Static286.anInt6699 + local186.anInt5735) * 4 + 2 - Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6701 / 32;
						local224 = (local186.anInt5739 - Static136.anInt3193) * 4 + 2 - Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6702 / 32;
						local235 = local186.anInt5737 * 4;
						local235 *= local235;
						this.method2086(local27, local271, local186.anInt5732, local224, super.aClass38Array3[0], local235, arg0);
					}
					if (local186.anInt5730 == 10 && local186.anInt5734 >= 0 && local186.anInt5734 < Static327.aClass8_Sub1_Sub2_Sub1Array1.length) {
						@Pc(333) Class8_Sub1_Sub2_Sub1 local333 = Static327.aClass8_Sub1_Sub2_Sub1Array1[local186.anInt5734];
						if (local333 != null) {
							local224 = local333.anInt6701 / 32 - Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6701 / 32;
							local235 = local333.anInt6702 / 32 - Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6702 / 32;
							this.method2086(local27, local224, local186.anInt5732, local235, super.aClass38Array3[0], 360000, arg0);
						}
					}
				}
			}
			local27.method4192(local32);
			local27.method4190(super.anInt6701, super.anInt6697, super.anInt6702);
		}
		arg0.method2701(local46, local49);
		@Pc(395) Class2_Sub2 local395 = Static248.method4393(super.aClass38Array3.length);
		if (super.aClass2_Sub4_5 == null) {
			arg0.method2711(super.aClass38Array3, local27, local395.aClass2_Sub5Array1, Static158.aClass8_Sub1_Sub2_Sub1_1 == this ? 1 : 0);
		} else {
			@Pc(417) Class176 local417 = super.aClass2_Sub4_5.method3927();
			arg0.method2714(super.aClass38Array3, local417, local27, local395.aClass2_Sub5Array1, Static158.aClass8_Sub1_Sub2_Sub1_1 == this ? 1 : 0);
		}
		this.method4338(super.aClass38Array3, false, arg0);
		if (super.aClass38Array3[2] != null) {
			if (local32 != 0) {
				super.aClass38Array3[2].method1899(local32);
			}
			super.aClass38Array3[2].method1883(super.anInt6701 - super.anInt4991, super.anInt6697 - super.anInt4983, -super.anInt4984 + super.anInt6702);
		}
		return local395;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)I")
	@Override
	protected int method4336() {
		return this.anInt2354;
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)V")
	@Override
	public void method5625() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method2092() {
		@Pc(15) String local15 = "";
		if (Static252.aStringArray61 != null) {
			local15 = local15 + Static252.aStringArray61[this.aByte26];
		}
		@Pc(37) int[] local37;
		if (this.aByte24 == 1 && Static122.anIntArray249 != null) {
			local37 = Static122.anIntArray249;
		} else {
			local37 = Static157.anIntArray299;
		}
		if (local37 != null && local37[this.aByte26] != -1) {
			@Pc(56) Class4_Sub4_Sub9 local56 = Static355.method5665(local37[this.aByte26]);
			if (local56.aChar2 == 's') {
				local15 = local15 + local56.method3299(this.aByte25 & 0xFF);
			} else {
				Static289.method4874("gdn1", new Throwable());
				local37[this.aByte26] = -1;
			}
		}
		local15 = local15 + this.aString23;
		if (Static42.aStringArray10 != null) {
			local15 = local15 + Static42.aStringArray10[this.aByte26];
		}
		return local15;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZZ)Ljava/lang/String;")
	public String method2093() {
		return this.aString24;
	}
}
