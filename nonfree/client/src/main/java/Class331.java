import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class331 {

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "[[Lclient!cu;")
	private Class60[][] aClass60ArrayArray1;

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "Lclient!fo;")
	private final Class9_Sub3 aClass9_Sub3_20;

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "Lclient!ow;")
	private final Class62_Sub3 aClass62_Sub3_3;

	@OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
	public final int anInt9333;

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
	private final int anInt9326;

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
	private final int anInt9329;

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "[B")
	public final byte[] aByteArray122;

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
	private final int anInt9327;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
	private final int anInt9321;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lclient!fo;Lclient!ow;)V")
	public Class331(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) Class62_Sub3 arg1) {
		this.aClass9_Sub3_20 = arg0;
		this.aClass62_Sub3_3 = arg1;
		this.anInt9333 = (this.aClass62_Sub3_3.anInt9881 * this.aClass62_Sub3_3.anInt9884 >> this.aClass9_Sub3_20.anInt6529) + 2;
		this.anInt9326 = (this.aClass62_Sub3_3.anInt9885 * this.aClass62_Sub3_3.anInt9884 >> this.aClass9_Sub3_20.anInt6529) + 2;
		this.anInt9329 = this.aClass9_Sub3_20.anInt6529 + 7 - this.aClass62_Sub3_3.anInt9883;
		this.aByteArray122 = new byte[this.anInt9326 * this.anInt9333];
		this.anInt9327 = this.aClass62_Sub3_3.anInt9881 >> this.anInt9329;
		this.anInt9321 = this.aClass62_Sub3_3.anInt9885 >> this.anInt9329;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[[ZIZZI)V")
	public void method7800(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		this.aClass9_Sub3_20.method5502(false);
		this.aClass9_Sub3_20.method5526(false);
		this.aClass9_Sub3_20.method5587(1);
		this.aClass9_Sub3_20.method5545(1);
		this.aClass9_Sub3_20.method5559(-2, false, false);
		@Pc(41) float local41 = 1.0F / (float) (this.aClass9_Sub3_20.anInt6528 * 128);
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		if (arg3) {
			for (local45 = 0; local45 < this.anInt9321; local45++) {
				local52 = local45 << this.anInt9329;
				local59 = local45 + 1 << this.anInt9329;
				label87: for (local61 = 0; local61 < this.anInt9327; local61++) {
					if (this.aClass60ArrayArray1[local61][local45] != null) {
						@Pc(318) int local318 = local61 << this.anInt9329;
						@Pc(325) int local325 = local61 + 1 << this.anInt9329;
						for (@Pc(327) int local327 = local318; local327 < local325; local327++) {
							if (local327 - arg0 >= -arg2 && local327 - arg0 <= arg2) {
								for (@Pc(347) int local347 = local52; local347 < local59; local347++) {
									if (-arg2 <= local347 - arg4 && arg2 >= local347 - arg4 && arg1[local327 + arg2 - arg0][arg2 + local347 - arg4]) {
										@Pc(390) Class8_Sub3 local390 = this.aClass9_Sub3_20.method5553();
										local390.method8198(local41, local41, 1.0F);
										local390.G(-local61, -local45, 0);
										this.aClass9_Sub3_20.method5481(Static52.aClass340_4);
										this.aClass60ArrayArray1[local61][local45].method1693();
										continue label87;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local45 = 0; local45 < this.anInt9321; local45++) {
				local52 = local45 << this.anInt9329;
				local59 = local45 + 1 << this.anInt9329;
				for (local61 = 0; local61 < this.anInt9327; local61++) {
					@Pc(70) Class60 local70 = this.aClass60ArrayArray1[local61][local45];
					if (local70 != null) {
						@Pc(81) Interface21 local81 = this.aClass9_Sub3_20.method5497(local70.anInt1884 * 3);
						@Pc(86) Buffer local86 = local81.method6521();
						if (local86 != null) {
							@Pc(94) Stream local94 = this.aClass9_Sub3_20.method5524(local86);
							@Pc(96) int local96 = 0;
							@Pc(101) int local101 = local61 << this.anInt9329;
							@Pc(108) int local108 = local61 + 1 << this.anInt9329;
							for (@Pc(110) int local110 = local52; local110 < local59; local110++) {
								if (-arg2 <= local110 - arg4 && arg2 >= local110 - arg4) {
									@Pc(133) int local133 = this.aClass62_Sub3_3.anInt9881 * local110 + local101;
									for (@Pc(135) int local135 = local101; local135 < local108; local135++) {
										if (local135 - arg0 >= -arg2 && local135 - arg0 <= arg2 && arg1[arg2 + local135 - arg0][local110 + arg2 - arg4]) {
											@Pc(180) short[] local180 = this.aClass62_Sub3_3.aShortArrayArray9[local133];
											if (local180 != null) {
												@Pc(186) int local186;
												if (Stream.c()) {
													for (local186 = 0; local186 < local180.length; local186++) {
														local94.c(local180[local186] & 0xFFFF);
														local96++;
													}
												} else {
													for (local186 = 0; local186 < local180.length; local186++) {
														local96++;
														local94.d(local180[local186] & 0xFFFF);
													}
												}
											}
										}
										local133++;
									}
								}
							}
							local94.a();
							if (local81.method6524() && local96 > 0) {
								@Pc(245) Class8_Sub3 local245 = this.aClass9_Sub3_20.method5553();
								local245.method8198(local41, local41, 1.0F);
								local245.G(-local61, -local45, 0);
								this.aClass9_Sub3_20.method5481(Static52.aClass340_4);
								local70.method1694(local81, local96 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass9_Sub3_20.method5498();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILclient!w;II)V")
	public void method7801(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub4_Sub2 arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class6_Sub4_Sub2_Sub2 local16 = (Class6_Sub4_Sub2_Sub2) arg1;
		arg0 += local16.anInt9115 + 1;
		arg2 += local16.anInt9110 + 1;
		@Pc(37) int local37 = arg2 * this.anInt9333 + arg0;
		@Pc(39) int local39 = 0;
		@Pc(42) int local42 = local16.anInt9109;
		@Pc(45) int local45 = local16.anInt9107;
		@Pc(50) int local50 = this.anInt9333 - local45;
		@Pc(52) int local52 = 0;
		@Pc(59) int local59;
		if (arg2 <= 0) {
			local59 = 1 - arg2;
			arg2 = 1;
			local42 -= local59;
			local37 += this.anInt9333 * local59;
			local39 = local45 * local59;
		}
		if (arg2 + local42 >= this.anInt9326) {
			local59 = arg2 + local42 + 1 - this.anInt9326;
			local42 -= local59;
		}
		if (arg0 <= 0) {
			local59 = 1 - arg0;
			local52 = local59;
			local50 += local59;
			local45 -= local59;
			local39 += local59;
			local37 += local59;
			arg0 = 1;
		}
		if (this.anInt9333 <= arg0 + local45) {
			local59 = arg0 + local45 + 1 - this.anInt9333;
			local50 += local59;
			local52 += local59;
			local45 -= local59;
		}
		if (local45 > 0 && local42 > 0) {
			Static378.method5980(local37, local45, local39, local42, local52, this.aByteArray122, local50, local16.aByteArray121);
			this.method7802(arg0, local42, arg2, local45);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIII)V")
	private void method7802(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass60ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg0 - 1 >> 7;
		@Pc(25) int local25 = arg0 + arg3 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg2 - 1 >> 7;
		@Pc(41) int local41 = arg2 + arg1 - 1 - 1 >> 7;
		for (@Pc(51) int local51 = local15; local51 <= local25; local51++) {
			@Pc(58) Class60[] local58 = this.aClass60ArrayArray1[local51];
			for (@Pc(60) int local60 = local31; local60 <= local41; local60++) {
				if (local58[local60] != null) {
					local58[local60].aBoolean189 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILclient!w;B)Z")
	public boolean method7803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub4_Sub2 arg2) {
		@Pc(6) Class6_Sub4_Sub2_Sub2 local6 = (Class6_Sub4_Sub2_Sub2) arg2;
		arg0 += local6.anInt9115 + 1;
		arg1 += local6.anInt9110 + 1;
		@Pc(28) int local28 = arg0 + this.anInt9333 * arg1;
		@Pc(31) int local31 = local6.anInt9109;
		@Pc(34) int local34 = local6.anInt9107;
		@Pc(40) int local40;
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			arg1 = 1;
			local31 -= local40;
			local28 += this.anInt9333 * local40;
		}
		@Pc(59) int local59 = this.anInt9333 - local34;
		if (arg1 + local31 >= this.anInt9326) {
			local40 = arg1 + local31 + 1 - this.anInt9326;
			local31 -= local40;
		}
		if (arg0 <= 0) {
			local40 = 1 - arg0;
			local34 -= local40;
			local59 += local40;
			arg0 = 1;
			local28 += local40;
		}
		if (arg0 + local34 >= this.anInt9333) {
			local40 = local34 + arg0 + 1 - this.anInt9333;
			local34 -= local40;
			local59 += local40;
		}
		if (local34 > 0 && local31 > 0) {
			local59 += this.anInt9333 * 7;
			return Static357.method5791(local28, local34, this.aByteArray122, local59, local31);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!w;BII)V")
	public void method7804(@OriginalArg(0) Class6_Sub4_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6_Sub4_Sub2_Sub2 local6 = (Class6_Sub4_Sub2_Sub2) arg0;
		arg2 += local6.anInt9115 + 1;
		arg1 += local6.anInt9110 + 1;
		@Pc(37) int local37 = arg2 + this.anInt9333 * arg1;
		@Pc(39) int local39 = 0;
		@Pc(42) int local42 = local6.anInt9109;
		@Pc(45) int local45 = local6.anInt9107;
		@Pc(51) int local51 = this.anInt9333 - local45;
		@Pc(58) int local58;
		if (arg1 <= 0) {
			local58 = 1 - arg1;
			local37 += local58 * this.anInt9333;
			arg1 = 1;
			local39 = local58 * local45;
			local42 -= local58;
		}
		@Pc(79) int local79 = 0;
		if (this.anInt9326 <= arg1 + local42) {
			local58 = arg1 + local42 + 1 - this.anInt9326;
			local42 -= local58;
		}
		if (arg2 <= 0) {
			local58 = 1 - arg2;
			local51 += local58;
			local45 -= local58;
			local79 = local58;
			arg2 = 1;
			local37 += local58;
			local39 += local58;
		}
		if (arg2 + local45 >= this.anInt9333) {
			local58 = local45 + arg2 + 1 - this.anInt9333;
			local45 -= local58;
			local51 += local58;
			local79 += local58;
		}
		if (local45 > 0 && local42 > 0) {
			Static309.method5013(this.aByteArray122, local42, local51, local45, local39, local79, local37, local6.aByteArray121);
			this.method7802(arg2, local42, arg1, local45);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
	public void method7805() {
		this.aClass60ArrayArray1 = new Class60[this.anInt9327][this.anInt9321];
		for (@Pc(14) int local14 = 0; local14 < this.anInt9321; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt9327; local18++) {
				this.aClass60ArrayArray1[local18][local14] = new Class60(this.aClass9_Sub3_20, this, this.aClass62_Sub3_3, local18, local14, this.anInt9329, local18 * 128 + 1, local14 * 128 + 1);
				if (this.aClass60ArrayArray1[local18][local14].anInt1884 == 0) {
					this.aClass60ArrayArray1[local18][local14] = null;
				}
			}
		}
	}
}
