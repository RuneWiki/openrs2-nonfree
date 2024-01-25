import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class125 {

	@OriginalMember(owner = "client!gt", name = "r", descriptor = "[[Lclient!aw;")
	private Class22[][] aClass22ArrayArray1;

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "Lclient!qq;")
	private final Class12_Sub2 aClass12_Sub2_10;

	@OriginalMember(owner = "client!gt", name = "p", descriptor = "Lclient!jba;")
	private final Class17_Sub3 aClass17_Sub3_1;

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "I")
	public final int anInt3199;

	@OriginalMember(owner = "client!gt", name = "h", descriptor = "I")
	private final int anInt3200;

	@OriginalMember(owner = "client!gt", name = "q", descriptor = "[B")
	public final byte[] aByteArray26;

	@OriginalMember(owner = "client!gt", name = "i", descriptor = "I")
	private final int anInt3201;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "I")
	private final int anInt3194;

	@OriginalMember(owner = "client!gt", name = "k", descriptor = "I")
	private final int anInt3203;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lclient!qq;Lclient!jba;)V")
	public Class125(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) Class17_Sub3 arg1) {
		this.aClass12_Sub2_10 = arg0;
		this.aClass17_Sub3_1 = arg1;
		this.anInt3199 = (this.aClass17_Sub3_1.anInt7983 * this.aClass17_Sub3_1.anInt7986 >> this.aClass12_Sub2_10.anInt7540) + 2;
		this.anInt3200 = (this.aClass17_Sub3_1.anInt7986 * this.aClass17_Sub3_1.anInt7984 >> this.aClass12_Sub2_10.anInt7540) + 2;
		this.aByteArray26 = new byte[this.anInt3200 * this.anInt3199];
		this.anInt3201 = this.aClass12_Sub2_10.anInt7540 + 7 - this.aClass17_Sub3_1.anInt7988;
		this.anInt3194 = this.aClass17_Sub3_1.anInt7983 >> this.anInt3201;
		this.anInt3203 = this.aClass17_Sub3_1.anInt7984 >> this.anInt3201;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IILclient!ha;I)V")
	public void method2701(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3_Sub4 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class1_Sub3_Sub4_Sub2 local6 = (Class1_Sub3_Sub4_Sub2) arg1;
		arg0 += local6.anInt2027 + 1;
		arg2 += local6.anInt2032 + 1;
		@Pc(28) int local28 = arg0 + arg2 * this.anInt3199;
		@Pc(30) int local30 = 0;
		@Pc(37) int local37 = local6.anInt2031;
		@Pc(40) int local40 = local6.anInt2029;
		@Pc(46) int local46 = this.anInt3199 - local40;
		@Pc(52) int local52;
		if (arg2 <= 0) {
			local52 = 1 - arg2;
			arg2 = 1;
			local30 = local52 * local40;
			local28 += this.anInt3199 * local52;
			local37 -= local52;
		}
		@Pc(73) int local73 = 0;
		if (local37 + arg2 >= this.anInt3200) {
			local52 = local37 + arg2 + 1 - this.anInt3200;
			local37 -= local52;
		}
		if (arg0 <= 0) {
			local52 = 1 - arg0;
			arg0 = 1;
			local28 += local52;
			local46 += local52;
			local30 += local52;
			local73 = local52;
			local40 -= local52;
		}
		if (local40 + arg0 >= this.anInt3199) {
			local52 = local40 + arg0 + 1 - this.anInt3199;
			local40 -= local52;
			local46 += local52;
			local73 += local52;
		}
		if (local40 > 0 && local37 > 0) {
			Static132.method2236(local40, local37, local30, local46, this.aByteArray26, local28, local6.aByteArray16, local73);
			this.method2705(arg0, local40, local37, arg2);
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
	public void method2702() {
		this.aClass22ArrayArray1 = new Class22[this.anInt3194][this.anInt3203];
		for (@Pc(20) int local20 = 0; local20 < this.anInt3203; local20++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt3194; local24++) {
				this.aClass22ArrayArray1[local24][local20] = new Class22(this.aClass12_Sub2_10, this, this.aClass17_Sub3_1, local24, local20, this.anInt3201, local24 * 128 + 1, local20 * 128 + 1);
				if (this.aClass22ArrayArray1[local24][local20].anInt853 == 0) {
					this.aClass22ArrayArray1[local24][local20] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I[[ZBZII)V")
	public void method2703(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aClass12_Sub2_10.method6161(false);
		this.aClass12_Sub2_10.method6184(false);
		this.aClass12_Sub2_10.method6183(1);
		this.aClass12_Sub2_10.method6249(1);
		this.aClass12_Sub2_10.method6236(-2, false, false);
		@Pc(41) float local41 = 1.0F / (float) (this.aClass12_Sub2_10.anInt7550 * 128);
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		if (arg2) {
			for (local45 = 0; local45 < this.anInt3203; local45++) {
				local52 = local45 << this.anInt3201;
				local59 = local45 + 1 << this.anInt3201;
				label87: for (local61 = 0; local61 < this.anInt3194; local61++) {
					if (this.aClass22ArrayArray1[local61][local45] != null) {
						@Pc(315) int local315 = local61 << this.anInt3201;
						@Pc(322) int local322 = local61 + 1 << this.anInt3201;
						for (@Pc(324) int local324 = local315; local324 < local322; local324++) {
							if (local324 - arg4 >= -arg0 && arg0 >= local324 - arg4) {
								for (@Pc(344) int local344 = local52; local344 < local59; local344++) {
									if (-arg0 <= local344 - arg3 && arg0 >= local344 - arg3 && arg1[local324 + arg0 - arg4][local344 + arg0 - arg3]) {
										@Pc(390) Class209_Sub2 local390 = this.aClass12_Sub2_10.method6270();
										local390.method4925(local41, local41, 1.0F);
										local390.U(-local61, -local45, 0);
										this.aClass12_Sub2_10.method6162(Static315.aClass296_3);
										this.aClass22ArrayArray1[local61][local45].method755();
										continue label87;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local45 = 0; local45 < this.anInt3203; local45++) {
				local52 = local45 << this.anInt3201;
				local59 = local45 + 1 << this.anInt3201;
				for (local61 = 0; local61 < this.anInt3194; local61++) {
					@Pc(70) Class22 local70 = this.aClass22ArrayArray1[local61][local45];
					if (local70 != null) {
						@Pc(81) Interface13 local81 = this.aClass12_Sub2_10.method6200(local70.anInt853 * 3);
						@Pc(86) Buffer local86 = local81.method7648();
						if (local86 != null) {
							@Pc(94) Stream local94 = this.aClass12_Sub2_10.method6160(local86);
							@Pc(96) int local96 = 0;
							@Pc(101) int local101 = local61 << this.anInt3201;
							@Pc(108) int local108 = local61 + 1 << this.anInt3201;
							for (@Pc(110) int local110 = local52; local110 < local59; local110++) {
								if (local110 - arg3 >= -arg0 && local110 - arg3 <= arg0) {
									@Pc(133) int local133 = local101 + this.aClass17_Sub3_1.anInt7983 * local110;
									for (@Pc(135) int local135 = local101; local135 < local108; local135++) {
										if (local135 - arg4 >= -arg0 && local135 - arg4 <= arg0 && arg1[local135 + arg0 - arg4][local110 + arg0 - arg3]) {
											@Pc(176) short[] local176 = this.aClass17_Sub3_1.aShortArrayArray3[local133];
											if (local176 != null) {
												@Pc(182) int local182;
												if (Stream.c()) {
													for (local182 = 0; local182 < local176.length; local182++) {
														local94.b(local176[local182] & 0xFFFF);
														local96++;
													}
												} else {
													for (local182 = 0; local182 < local176.length; local182++) {
														local94.e(local176[local182] & 0xFFFF);
														local96++;
													}
												}
											}
										}
										local133++;
									}
								}
							}
							local94.a();
							if (local81.method7652() && local96 > 0) {
								@Pc(246) Class209_Sub2 local246 = this.aClass12_Sub2_10.method6270();
								local246.method4925(local41, local41, 1.0F);
								local246.U(-local61, -local45, 0);
								this.aClass12_Sub2_10.method6162(Static315.aClass296_3);
								local70.method751(local81, local96 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass12_Sub2_10.method6237();
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIILclient!ha;)V")
	public void method2704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub3_Sub4 arg2) {
		@Pc(6) Class1_Sub3_Sub4_Sub2 local6 = (Class1_Sub3_Sub4_Sub2) arg2;
		arg1 += local6.anInt2027 + 1;
		arg0 += local6.anInt2032 + 1;
		@Pc(27) int local27 = arg1 + arg0 * this.anInt3199;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt2031;
		@Pc(35) int local35 = local6.anInt2029;
		@Pc(41) int local41 = this.anInt3199 - local35;
		@Pc(50) int local50;
		if (arg0 <= 0) {
			local50 = 1 - arg0;
			local32 -= local50;
			local27 += this.anInt3199 * local50;
			local29 = local35 * local50;
			arg0 = 1;
		}
		@Pc(71) int local71 = 0;
		if (this.anInt3200 <= local32 + arg0) {
			local50 = local32 + arg0 + 1 - this.anInt3200;
			local32 -= local50;
		}
		if (arg1 <= 0) {
			local50 = 1 - arg1;
			local29 += local50;
			local35 -= local50;
			local27 += local50;
			local41 += local50;
			local71 = local50;
			arg1 = 1;
		}
		if (local35 + arg1 >= this.anInt3199) {
			local50 = local35 + arg1 + 1 - this.anInt3199;
			local71 += local50;
			local41 += local50;
			local35 -= local50;
		}
		if (local35 > 0 && local32 > 0) {
			Static576.method7749(local27, local32, local6.aByteArray16, local35, this.aByteArray26, local29, local71, local41);
			this.method2705(arg1, local35, local32, arg0);
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIII)V")
	private void method2705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass22ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg0 - 1 >> 7;
		@Pc(23) int local23 = arg1 + arg0 - 2 >> 7;
		@Pc(29) int local29 = arg3 - 1 >> 7;
		@Pc(39) int local39 = arg2 + arg3 - 1 - 1 >> 7;
		for (@Pc(41) int local41 = local15; local41 <= local23; local41++) {
			@Pc(48) Class22[] local48 = this.aClass22ArrayArray1[local41];
			for (@Pc(50) int local50 = local29; local50 <= local39; local50++) {
				if (local48[local50] != null) {
					local48[local50].aBoolean75 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BILclient!ha;I)Z")
	public boolean method2706(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3_Sub4 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class1_Sub3_Sub4_Sub2 local16 = (Class1_Sub3_Sub4_Sub2) arg1;
		arg0 += local16.anInt2027 + 1;
		arg2 += local16.anInt2032 + 1;
		@Pc(37) int local37 = this.anInt3199 * arg2 + arg0;
		@Pc(40) int local40 = local16.anInt2031;
		@Pc(43) int local43 = local16.anInt2029;
		@Pc(53) int local53;
		if (arg2 <= 0) {
			local53 = 1 - arg2;
			local40 -= local53;
			local37 += local53 * this.anInt3199;
			arg2 = 1;
		}
		@Pc(72) int local72 = this.anInt3199 - local43;
		if (arg2 + local40 >= this.anInt3200) {
			local53 = local40 + arg2 + 1 - this.anInt3200;
			local40 -= local53;
		}
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			local37 += local53;
			local43 -= local53;
			arg0 = 1;
			local72 += local53;
		}
		if (local43 + arg0 >= this.anInt3199) {
			local53 = arg0 + local43 + 1 - this.anInt3199;
			local43 -= local53;
			local72 += local53;
		}
		if (local43 > 0 && local40 > 0) {
			local72 += this.anInt3199 * 7;
			return Static282.method4332(local40, local43, this.aByteArray26, local37, local72);
		} else {
			return false;
		}
	}
}
