import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class73 {

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "[[Lclient!mc;")
	private Class202[][] aClass202ArrayArray1;

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "Lclient!wga;")
	private final Class20_Sub2 aClass20_Sub2_4;

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "Lclient!qm;")
	private final Class65_Sub3 aClass65_Sub3_1;

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
	public final int anInt2726;

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
	private final int anInt2733;

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "[B")
	public final byte[] aByteArray34;

	@OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
	private final int anInt2734;

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
	private final int anInt2732;

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
	private final int anInt2729;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!wga;Lclient!qm;)V")
	public Class73(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) Class65_Sub3 arg1) {
		this.aClass20_Sub2_4 = arg0;
		this.aClass65_Sub3_1 = arg1;
		this.anInt2726 = (this.aClass65_Sub3_1.anInt9615 * this.aClass65_Sub3_1.anInt9620 >> this.aClass20_Sub2_4.anInt1550) + 2;
		this.anInt2733 = (this.aClass65_Sub3_1.anInt9620 * this.aClass65_Sub3_1.anInt9618 >> this.aClass20_Sub2_4.anInt1550) + 2;
		this.aByteArray34 = new byte[this.anInt2726 * this.anInt2733];
		this.anInt2734 = this.aClass20_Sub2_4.anInt1550 + 7 - this.aClass65_Sub3_1.anInt9616;
		this.anInt2732 = this.aClass65_Sub3_1.anInt9615 >> this.anInt2734;
		this.anInt2729 = this.aClass65_Sub3_1.anInt9618 >> this.anInt2734;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBLclient!r;I)Z")
	public boolean method2565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub6_Sub7 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub6_Sub7_Sub1 local6 = (Class2_Sub6_Sub7_Sub1) arg1;
		arg2 += local6.anInt3515 + 1;
		arg0 += local6.anInt3510 + 1;
		@Pc(35) int local35 = arg2 * this.anInt2726 + arg0;
		@Pc(38) int local38 = local6.anInt3509;
		@Pc(41) int local41 = local6.anInt3508;
		@Pc(47) int local47 = this.anInt2726 - local41;
		@Pc(57) int local57;
		if (arg2 <= 0) {
			local57 = 1 - arg2;
			local38 -= local57;
			local35 += this.anInt2726 * local57;
			arg2 = 1;
		}
		if (local38 + arg2 >= this.anInt2733) {
			local57 = local38 + arg2 + 1 - this.anInt2733;
			local38 -= local57;
		}
		if (arg0 <= 0) {
			local57 = 1 - arg0;
			arg0 = 1;
			local47 += local57;
			local41 -= local57;
			local35 += local57;
		}
		if (local41 + arg0 >= this.anInt2726) {
			local57 = arg0 + local41 + 1 - this.anInt2726;
			local41 -= local57;
			local47 += local57;
		}
		if (local41 > 0 && local38 > 0) {
			local47 += this.anInt2726 * 7;
			return Static257.method4731(local47, local35, this.aByteArray34, local41, local38);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILclient!r;II)V")
	public void method2566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub6_Sub7 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub6_Sub7_Sub1 local6 = (Class2_Sub6_Sub7_Sub1) arg1;
		arg2 += local6.anInt3510 + 1;
		arg0 += local6.anInt3515 + 1;
		@Pc(27) int local27 = arg0 * this.anInt2726 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt3509;
		@Pc(35) int local35 = local6.anInt3508;
		@Pc(41) int local41 = this.anInt2726 - local35;
		@Pc(48) int local48;
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			local27 += this.anInt2726 * local48;
			local32 -= local48;
			arg0 = 1;
			local29 = local48 * local35;
		}
		@Pc(69) int local69 = 0;
		if (local32 + arg0 >= this.anInt2733) {
			local48 = arg0 + local32 + 1 - this.anInt2733;
			local32 -= local48;
		}
		if (arg2 <= 0) {
			local48 = 1 - arg2;
			local69 = local48;
			local41 += local48;
			arg2 = 1;
			local27 += local48;
			local29 += local48;
			local35 -= local48;
		}
		if (this.anInt2726 <= arg2 + local35) {
			local48 = local35 + arg2 + 1 - this.anInt2726;
			local41 += local48;
			local35 -= local48;
			local69 += local48;
		}
		if (local35 > 0 && local32 > 0) {
			Static146.method3245(local41, local35, local69, local32, local27, this.aByteArray34, local6.aByteArray42, local29);
			this.method2571(arg0, arg2, local32, local35);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIZ[[ZI)V")
	public void method2567(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) int arg4) {
		this.aClass20_Sub2_4.method1500(false);
		this.aClass20_Sub2_4.method1580(false);
		this.aClass20_Sub2_4.method1451(1);
		this.aClass20_Sub2_4.method1557(1);
		this.aClass20_Sub2_4.method1448(false, false, -2);
		@Pc(41) float local41 = 1.0F / (float) (this.aClass20_Sub2_4.anInt1557 * 128);
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		if (arg2) {
			for (local45 = 0; local45 < this.anInt2729; local45++) {
				local52 = local45 << this.anInt2734;
				local59 = local45 + 1 << this.anInt2734;
				label138: for (local61 = 0; local61 < this.anInt2732; local61++) {
					if (this.aClass202ArrayArray1[local61][local45] != null) {
						@Pc(75) int local75 = local61 << this.anInt2734;
						@Pc(82) int local82 = local61 + 1 << this.anInt2734;
						for (@Pc(84) int local84 = local75; local84 < local82; local84++) {
							if (-arg0 <= local84 - arg1 && arg0 >= local84 - arg1) {
								for (@Pc(105) int local105 = local52; local105 < local59; local105++) {
									if (-arg0 <= local105 - arg4 && arg0 >= local105 - arg4 && arg3[arg0 + local84 - arg1][local105 + arg0 - arg4]) {
										@Pc(141) Class30_Sub2 local141 = this.aClass20_Sub2_4.method1454();
										local141.method4052(1.0F, local41, local41);
										local141.method4646(-local61, -local45, 0);
										this.aClass20_Sub2_4.method1487(Static547.aClass332_6);
										this.aClass202ArrayArray1[local61][local45].method5847();
										continue label138;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local45 = 0; local45 < this.anInt2729; local45++) {
				local52 = local45 << this.anInt2734;
				local59 = local45 + 1 << this.anInt2734;
				for (local61 = 0; local61 < this.anInt2732; local61++) {
					@Pc(226) Class202 local226 = this.aClass202ArrayArray1[local61][local45];
					if (local226 != null) {
						@Pc(237) Interface24 local237 = this.aClass20_Sub2_4.method1456(local226.anInt6851 * 3);
						@Pc(242) Buffer local242 = local237.method6477();
						if (local242 != null) {
							@Pc(250) Stream local250 = this.aClass20_Sub2_4.method1527(local242);
							@Pc(252) int local252 = 0;
							@Pc(257) int local257 = local61 << this.anInt2734;
							@Pc(264) int local264 = local61 + 1 << this.anInt2734;
							for (@Pc(266) int local266 = local52; local266 < local59; local266++) {
								if (local266 - arg4 >= -arg0 && arg0 >= local266 - arg4) {
									@Pc(293) int local293 = local266 * this.aClass65_Sub3_1.anInt9615 + local257;
									for (@Pc(295) int local295 = local257; local295 < local264; local295++) {
										if (-arg0 <= local295 - arg1 && arg0 >= local295 - arg1 && arg3[arg0 + local295 - arg1][arg0 + local266 - arg4]) {
											@Pc(335) short[] local335 = this.aClass65_Sub3_1.aShortArrayArray23[local293];
											if (local335 != null) {
												@Pc(341) int local341;
												if (Stream.c()) {
													for (local341 = 0; local341 < local335.length; local341++) {
														local250.d(local335[local341] & 0xFFFF);
														local252++;
													}
												} else {
													for (local341 = 0; local341 < local335.length; local341++) {
														local252++;
														local250.a(local335[local341] & 0xFFFF);
													}
												}
											}
										}
										local293++;
									}
								}
							}
							local250.a();
							if (local237.method6474() && local252 > 0) {
								@Pc(405) Class30_Sub2 local405 = this.aClass20_Sub2_4.method1454();
								local405.method4052(1.0F, local41, local41);
								local405.method4646(-local61, -local45, 0);
								this.aClass20_Sub2_4.method1487(Static547.aClass332_6);
								local226.method5851(local237, local252 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass20_Sub2_4.method1513();
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
	public void method2569() {
		this.aClass202ArrayArray1 = new Class202[this.anInt2732][this.anInt2729];
		for (@Pc(25) int local25 = 0; local25 < this.anInt2729; local25++) {
			for (@Pc(29) int local29 = 0; local29 < this.anInt2732; local29++) {
				this.aClass202ArrayArray1[local29][local25] = new Class202(this.aClass20_Sub2_4, this, this.aClass65_Sub3_1, local29, local25, this.anInt2734, local29 * 128 + 1, local25 * 128 + 1);
				if (this.aClass202ArrayArray1[local29][local25].anInt6851 == 0) {
					this.aClass202ArrayArray1[local29][local25] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILclient!r;I)V")
	public void method2570(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub6_Sub7 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub6_Sub7_Sub1 local6 = (Class2_Sub6_Sub7_Sub1) arg1;
		arg2 += local6.anInt3515 + 1;
		arg0 += local6.anInt3510 + 1;
		@Pc(37) int local37 = arg0 + this.anInt2726 * arg2;
		@Pc(39) int local39 = 0;
		@Pc(42) int local42 = local6.anInt3509;
		@Pc(45) int local45 = local6.anInt3508;
		@Pc(51) int local51 = this.anInt2726 - local45;
		@Pc(58) int local58;
		if (arg2 <= 0) {
			local58 = 1 - arg2;
			local37 += this.anInt2726 * local58;
			local42 -= local58;
			local39 = local58 * local45;
			arg2 = 1;
		}
		@Pc(79) int local79 = 0;
		if (this.anInt2733 <= local42 + arg2) {
			local58 = arg2 + local42 + 1 - this.anInt2733;
			local42 -= local58;
		}
		if (arg0 <= 0) {
			local58 = 1 - arg0;
			local39 += local58;
			local51 += local58;
			local79 = local58;
			local37 += local58;
			arg0 = 1;
			local45 -= local58;
		}
		if (this.anInt2726 <= local45 + arg0) {
			local58 = local45 + arg0 + 1 - this.anInt2726;
			local79 += local58;
			local45 -= local58;
			local51 += local58;
		}
		if (local45 > 0 && local42 > 0) {
			Static342.method5876(local45, this.aByteArray34, local6.aByteArray42, local39, local42, local37, local51, local79);
			this.method2571(arg2, arg0, local42, local45);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIII)V")
	private void method2571(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass202ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg1 - 1 >> 7;
		@Pc(25) int local25 = arg3 + arg1 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg0 - 1 >> 7;
		@Pc(42) int local42 = arg0 + arg2 - 1 - 1 >> 7;
		for (@Pc(44) int local44 = local15; local44 <= local25; local44++) {
			@Pc(51) Class202[] local51 = this.aClass202ArrayArray1[local44];
			for (@Pc(53) int local53 = local31; local53 <= local42; local53++) {
				if (local51[local53] != null) {
					local51[local53].aBoolean504 = true;
				}
			}
		}
	}
}
