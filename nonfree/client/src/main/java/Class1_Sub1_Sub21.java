import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class1_Sub1_Sub21 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pj", name = "L", descriptor = "[I")
	private int[] anIntArray447;

	@OriginalMember(owner = "client!pj", name = "O", descriptor = "[I")
	private int[] anIntArray448;

	@OriginalMember(owner = "client!pj", name = "R", descriptor = "[[I")
	public int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!pj", name = "Z", descriptor = "[I")
	public int[] anIntArray449;

	@OriginalMember(owner = "client!pj", name = "db", descriptor = "[I")
	public int[] anIntArray450;

	@OriginalMember(owner = "client!pj", name = "J", descriptor = "I")
	public int anInt3434 = 2;

	@OriginalMember(owner = "client!pj", name = "W", descriptor = "I")
	public int anInt3442 = -1;

	@OriginalMember(owner = "client!pj", name = "T", descriptor = "I")
	public int anInt3440 = 5;

	@OriginalMember(owner = "client!pj", name = "Y", descriptor = "Z")
	private boolean aBoolean192 = false;

	@OriginalMember(owner = "client!pj", name = "S", descriptor = "I")
	public int anInt3439 = -1;

	@OriginalMember(owner = "client!pj", name = "hb", descriptor = "Z")
	public boolean aBoolean193 = false;

	@OriginalMember(owner = "client!pj", name = "fb", descriptor = "I")
	public int anInt3448 = -1;

	@OriginalMember(owner = "client!pj", name = "cb", descriptor = "I")
	public int anInt3446 = 99;

	@OriginalMember(owner = "client!pj", name = "jb", descriptor = "I")
	public int anInt3451 = -1;

	@OriginalMember(owner = "client!pj", name = "kb", descriptor = "I")
	public int anInt3452 = -1;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BILclient!cf;)Lclient!cf;")
	public Class9_Sub2 method2615(@OriginalArg(1) int arg0, @OriginalArg(2) Class9_Sub2 arg1) {
		@Pc(4) int local4 = this.anIntArray449[arg0];
		@Pc(12) Class1_Sub1_Sub11 local12 = Static41.method732(local4 >> 16);
		@Pc(16) int local16 = local4 & 0xFFFF;
		if (local12 == null) {
			return arg1.method1703(true, true);
		} else {
			@Pc(44) Class9_Sub2 local44 = arg1.method1703(!local12.method1908(local16), !this.aBoolean192);
			local44.method1709(local12, local16, this.aBoolean192);
			return local44;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIILclient!cf;)Lclient!cf;")
	public Class9_Sub2 method2616(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class9_Sub2 arg2) {
		@Pc(10) int local10 = this.anIntArray449[arg1];
		@Pc(21) Class1_Sub1_Sub11 local21 = Static41.method732(local10 >> 16);
		@Pc(25) int local25 = local10 & 0xFFFF;
		if (local21 == null) {
			return arg2.method1703(true, true);
		}
		@Pc(36) int local36 = arg0 & 0x3;
		@Pc(53) Class9_Sub2 local53 = arg2.method1703(!local21.method1908(local25), !this.aBoolean192);
		if (local36 == 1) {
			local53.method1704();
		} else if (local36 == 2) {
			local53.method1708();
		} else if (local36 == 3) {
			local53.method1701();
		}
		local53.method1709(local21, local25, this.aBoolean192);
		if (local36 == 1) {
			local53.method1701();
		} else if (local36 == 2) {
			local53.method1708();
		} else if (local36 == 3) {
			local53.method1704();
		}
		return local53;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILclient!cf;)Lclient!cf;")
	public Class9_Sub2 method2617(@OriginalArg(0) int arg0, @OriginalArg(2) Class9_Sub2 arg1) {
		@Pc(8) int local8 = this.anIntArray449[arg0];
		@Pc(14) Class1_Sub1_Sub11 local14 = Static41.method732(local8 >> 16);
		@Pc(26) int local26 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1699(true, true);
		} else {
			@Pc(50) Class9_Sub2 local50 = arg1.method1699(!local14.method1908(local26), !this.aBoolean192);
			local50.method1709(local14, local26, this.aBoolean192);
			return local50;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!pj;IILclient!cf;I)Lclient!cf;")
	public Class9_Sub2 method2618(@OriginalArg(0) Class1_Sub1_Sub21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class9_Sub2 arg3) {
		@Pc(13) int local13 = this.anIntArray449[arg1];
		@Pc(19) Class1_Sub1_Sub11 local19 = Static41.method732(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg0.method2615(arg2, arg3);
		}
		@Pc(36) int local36 = arg0.anIntArray449[arg2];
		@Pc(42) Class1_Sub1_Sub11 local42 = Static41.method732(local36 >> 16);
		@Pc(46) int local46 = local36 & 0xFFFF;
		@Pc(65) Class9_Sub2 local65;
		if (local42 == null) {
			local65 = arg3.method1703(!local19.method1908(local23), !this.aBoolean192);
			local65.method1709(local19, local23, this.aBoolean192);
			return local65;
		} else {
			local65 = arg3.method1703(!local19.method1908(local23) & !local42.method1908(local46), !this.aBoolean192 & !arg0.aBoolean192);
			local65.method1705(local19, local23, local42, local46, this.anIntArray448, arg0.aBoolean192 | this.aBoolean192);
			return local65;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!nc;)V")
	public void method2619(@OriginalArg(1) Class1_Sub9 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method895();
			if (local17 == 0) {
				return;
			}
			this.method2622(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!cf;I)Lclient!cf;")
	public Class9_Sub2 method2620(@OriginalArg(0) int arg0, @OriginalArg(1) Class9_Sub2 arg1) {
		@Pc(8) int local8 = this.anIntArray449[arg0];
		@Pc(14) Class1_Sub1_Sub11 local14 = Static41.method732(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1703(true, true);
		}
		@Pc(27) Class1_Sub1_Sub11 local27 = null;
		@Pc(29) int local29 = 0;
		if (this.anIntArray447 != null && arg0 < this.anIntArray447.length) {
			local29 = this.anIntArray447[arg0];
			local27 = Static41.method732(local29 >> 16);
			local29 &= 0xFFFF;
		}
		@Pc(84) Class9_Sub2 local84;
		if (local27 == null || local29 == 65535) {
			local84 = arg1.method1703(!local14.method1908(local18), !this.aBoolean192);
			local84.method1709(local14, local18, this.aBoolean192);
			return local84;
		} else {
			local84 = arg1.method1703(!local14.method1908(local18) & !local27.method1908(local29), !this.aBoolean192);
			local84.method1709(local14, local18, this.aBoolean192);
			local84.method1709(local27, local29, this.aBoolean192);
			return local84;
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
	public void method2621() {
		if (this.anInt3448 == -1) {
			if (this.anIntArray448 == null) {
				this.anInt3448 = 0;
			} else {
				this.anInt3448 = 2;
			}
		}
		if (this.anInt3442 != -1) {
			return;
		}
		if (this.anIntArray448 == null) {
			this.anInt3442 = 0;
		} else {
			this.anInt3442 = 2;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!nc;I)V")
	private void method2622(@OriginalArg(1) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		@Pc(23) int local23;
		@Pc(31) int local31;
		@Pc(141) int local141;
		@Pc(205) int local205;
		if (arg1 == 1) {
			local23 = arg0.method946();
			this.anIntArray450 = new int[local23];
			for (local31 = 0; local31 < local23; local31++) {
				this.anIntArray450[local31] = arg0.method946();
			}
			this.anIntArray449 = new int[local23];
			for (local141 = 0; local141 < local23; local141++) {
				this.anIntArray449[local141] = arg0.method946();
			}
			for (local205 = 0; local205 < local23; local205++) {
				this.anIntArray449[local205] += arg0.method946() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt3439 = arg0.method946();
		} else if (arg1 == 3) {
			local23 = arg0.method895();
			this.anIntArray448 = new int[local23 + 1];
			for (local31 = 0; local31 < local23; local31++) {
				this.anIntArray448[local31] = arg0.method895();
			}
			this.anIntArray448[local23] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean193 = true;
		} else if (arg1 == 5) {
			this.anInt3440 = arg0.method895();
		} else if (arg1 == 6) {
			this.anInt3452 = arg0.method946();
		} else if (arg1 == 7) {
			this.anInt3451 = arg0.method946();
		} else if (arg1 == 8) {
			this.anInt3446 = arg0.method895();
		} else if (arg1 == 9) {
			this.anInt3448 = arg0.method895();
		} else if (arg1 == 10) {
			this.anInt3442 = arg0.method895();
		} else if (arg1 == 11) {
			this.anInt3434 = arg0.method895();
		} else if (arg1 == 12) {
			local23 = arg0.method895();
			this.anIntArray447 = new int[local23];
			for (local31 = 0; local31 < local23; local31++) {
				this.anIntArray447[local31] = arg0.method946();
			}
			for (local141 = 0; local141 < local23; local141++) {
				this.anIntArray447[local141] += arg0.method946() << 16;
			}
		} else if (arg1 == 13) {
			local23 = arg0.method946();
			this.anIntArrayArray55 = new int[local23][];
			for (local31 = 0; local31 < local23; local31++) {
				local141 = arg0.method895();
				if (local141 > 0) {
					this.anIntArrayArray55[local31] = new int[local141];
					this.anIntArrayArray55[local31][0] = arg0.method920();
					for (local205 = 1; local205 < local141; local205++) {
						this.anIntArrayArray55[local31][local205] = arg0.method946();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean192 = true;
		}
	}
}
