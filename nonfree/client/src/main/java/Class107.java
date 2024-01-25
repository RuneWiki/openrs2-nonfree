import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class107 {

	@OriginalMember(owner = "client!ep", name = "o", descriptor = "[[Lclient!taa;")
	private Class330[][] aClass330ArrayArray1;

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "Lclient!rd;")
	private final Class109_Sub3 aClass109_Sub3_2;

	@OriginalMember(owner = "client!ep", name = "p", descriptor = "Lclient!gd;")
	private final Class65_Sub2 aClass65_Sub2_7;

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
	public final int anInt3022;

	@OriginalMember(owner = "client!ep", name = "r", descriptor = "I")
	private final int anInt3031;

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "[B")
	public final byte[] aByteArray22;

	@OriginalMember(owner = "client!ep", name = "n", descriptor = "I")
	private final int anInt3029;

	@OriginalMember(owner = "client!ep", name = "m", descriptor = "I")
	private final int anInt3028;

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
	private final int anInt3025;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!gd;Lclient!rd;)V")
	public Class107(@OriginalArg(0) Class65_Sub2 arg0, @OriginalArg(1) Class109_Sub3 arg1) {
		this.aClass109_Sub3_2 = arg1;
		this.aClass65_Sub2_7 = arg0;
		this.anInt3022 = (this.aClass109_Sub3_2.anInt9061 * this.aClass109_Sub3_2.anInt9063 >> this.aClass65_Sub2_7.anInt5270) + 2;
		this.anInt3031 = (this.aClass109_Sub3_2.anInt9065 * this.aClass109_Sub3_2.anInt9063 >> this.aClass65_Sub2_7.anInt5270) + 2;
		this.aByteArray22 = new byte[this.anInt3031 * this.anInt3022];
		this.anInt3029 = this.aClass65_Sub2_7.anInt5270 + 7 - this.aClass109_Sub3_2.anInt9066;
		this.anInt3028 = this.aClass109_Sub3_2.anInt9061 >> this.anInt3029;
		this.anInt3025 = this.aClass109_Sub3_2.anInt9065 >> this.anInt3029;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BIILclient!r;)V")
	public void method2678(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub3_Sub7 arg2) {
		@Pc(6) Class5_Sub3_Sub7_Sub1 local6 = (Class5_Sub3_Sub7_Sub1) arg2;
		arg1 += local6.anInt4613 + 1;
		arg0 += local6.anInt4611 + 1;
		@Pc(27) int local27 = arg0 + this.anInt3022 * arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt4605;
		@Pc(35) int local35 = local6.anInt4612;
		@Pc(41) int local41 = this.anInt3022 - local35;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50;
		if (arg1 <= 0) {
			local50 = 1 - arg1;
			local29 = local50 * local35;
			arg1 = 1;
			local27 += local50 * this.anInt3022;
			local32 -= local50;
		}
		if (local32 + arg1 >= this.anInt3031) {
			local50 = arg1 + local32 + 1 - this.anInt3031;
			local32 -= local50;
		}
		if (arg0 <= 0) {
			local50 = 1 - arg0;
			local35 -= local50;
			local43 = local50;
			arg0 = 1;
			local41 += local50;
			local29 += local50;
			local27 += local50;
		}
		if (local35 + arg0 >= this.anInt3022) {
			local50 = arg0 + local35 + 1 - this.anInt3022;
			local35 -= local50;
			local41 += local50;
			local43 += local50;
		}
		if (local35 > 0 && local32 > 0) {
			Static556.method7714(local6.aByteArray40, local43, local32, this.aByteArray22, local35, local29, local41, local27);
			this.method2684(local35, local32, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILclient!r;II)Z")
	public boolean method2679(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub3_Sub7 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class5_Sub3_Sub7_Sub1 local6 = (Class5_Sub3_Sub7_Sub1) arg1;
		arg0 += local6.anInt4613 + 1;
		arg2 += local6.anInt4611 + 1;
		@Pc(28) int local28 = arg2 + arg0 * this.anInt3022;
		@Pc(31) int local31 = local6.anInt4605;
		@Pc(34) int local34 = local6.anInt4612;
		@Pc(44) int local44;
		if (arg0 <= 0) {
			local44 = 1 - arg0;
			arg0 = 1;
			local31 -= local44;
			local28 += local44 * this.anInt3022;
		}
		@Pc(63) int local63 = this.anInt3022 - local34;
		if (arg0 + local31 >= this.anInt3031) {
			local44 = arg0 + local31 + 1 - this.anInt3031;
			local31 -= local44;
		}
		if (arg2 <= 0) {
			local44 = 1 - arg2;
			local34 -= local44;
			arg2 = 1;
			local63 += local44;
			local28 += local44;
		}
		if (arg2 + local34 >= this.anInt3022) {
			local44 = arg2 + local34 + 1 - this.anInt3022;
			local34 -= local44;
			local63 += local44;
		}
		if (local34 > 0 && local31 > 0) {
			local63 += this.anInt3022 * 7;
			return Static164.method2893(local34, local63, this.aByteArray22, local31, local28);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
	public void method2680() {
		this.aClass330ArrayArray1 = new Class330[this.anInt3028][this.anInt3025];
		for (@Pc(24) int local24 = 0; local24 < this.anInt3025; local24++) {
			for (@Pc(28) int local28 = 0; local28 < this.anInt3028; local28++) {
				this.aClass330ArrayArray1[local28][local24] = new Class330(this.aClass65_Sub2_7, this, this.aClass109_Sub3_2, local28, local24, this.anInt3029, local28 * 128 + 1, local24 * 128 - -1);
				if (this.aClass330ArrayArray1[local28][local24].anInt9104 == 0) {
					this.aClass330ArrayArray1[local28][local24] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "([[ZZIBII)V")
	public void method2682(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aClass65_Sub2_7.method4372(false);
		this.aClass65_Sub2_7.method4445(false);
		this.aClass65_Sub2_7.method4419(1);
		this.aClass65_Sub2_7.method4405(1);
		this.aClass65_Sub2_7.method4446(false, -2, false);
		@Pc(49) float local49 = 1.0F / (float) (this.aClass65_Sub2_7.anInt5245 * 128);
		@Pc(53) int local53;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(69) int local69;
		if (arg1) {
			for (local53 = 0; local53 < this.anInt3025; local53++) {
				local60 = local53 << this.anInt3029;
				local67 = local53 + 1 << this.anInt3029;
				label138: for (local69 = 0; local69 < this.anInt3028; local69++) {
					if (this.aClass330ArrayArray1[local69][local53] != null) {
						@Pc(83) int local83 = local69 << this.anInt3029;
						@Pc(90) int local90 = local69 + 1 << this.anInt3029;
						for (@Pc(92) int local92 = local83; local92 < local90; local92++) {
							if (local92 - arg2 >= -arg4 && local92 - arg2 <= arg4) {
								for (@Pc(109) int local109 = local60; local109 < local67; local109++) {
									if (-arg4 <= local109 - arg3 && local109 - arg3 <= arg4 && arg0[arg4 + local92 - arg2][arg4 + local109 - arg3]) {
										@Pc(152) Class254_Sub2 local152 = this.aClass65_Sub2_7.method4439();
										local152.method6237(local49, 1.0F, local49);
										local152.method7358(-local69, -local53, 0);
										this.aClass65_Sub2_7.method4411(Static102.aClass198_1);
										this.aClass330ArrayArray1[local69][local53].method7718();
										continue label138;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local53 = 0; local53 < this.anInt3025; local53++) {
				local60 = local53 << this.anInt3029;
				local67 = local53 + 1 << this.anInt3029;
				for (local69 = 0; local69 < this.anInt3028; local69++) {
					@Pc(231) Class330 local231 = this.aClass330ArrayArray1[local69][local53];
					if (local231 != null) {
						@Pc(242) Interface12 local242 = this.aClass65_Sub2_7.method4399(local231.anInt9104 * 3);
						@Pc(247) Buffer local247 = local242.method900();
						if (local247 != null) {
							@Pc(255) Stream local255 = this.aClass65_Sub2_7.method4457(local247);
							@Pc(257) int local257 = 0;
							@Pc(262) int local262 = local69 << this.anInt3029;
							@Pc(269) int local269 = local69 + 1 << this.anInt3029;
							for (@Pc(271) int local271 = local60; local271 < local67; local271++) {
								if (local271 - arg3 >= -arg4 && arg4 >= local271 - arg3) {
									@Pc(301) int local301 = local262 + local271 * this.aClass109_Sub3_2.anInt9061;
									for (@Pc(303) int local303 = local262; local303 < local269; local303++) {
										if (local303 - arg2 >= -arg4 && local303 - arg2 <= arg4 && arg0[local303 + arg4 - arg2][local271 + arg4 - arg3]) {
											@Pc(348) short[] local348 = this.aClass109_Sub3_2.aShortArrayArray17[local301];
											if (local348 != null) {
												@Pc(354) int local354;
												if (Stream.c()) {
													for (local354 = 0; local354 < local348.length; local354++) {
														local257++;
														local255.e(local348[local354] & 0xFFFF);
													}
												} else {
													for (local354 = 0; local354 < local348.length; local354++) {
														local257++;
														local255.b(local348[local354] & 0xFFFF);
													}
												}
											}
										}
										local301++;
									}
								}
							}
							local255.a();
							if (local242.method903() && local257 > 0) {
								@Pc(414) Class254_Sub2 local414 = this.aClass65_Sub2_7.method4439();
								local414.method6237(local49, 1.0F, local49);
								local414.method7358(-local69, -local53, 0);
								this.aClass65_Sub2_7.method4411(Static102.aClass198_1);
								local231.method7725(local242, local257 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass65_Sub2_7.method4423();
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IILclient!r;I)V")
	public void method2683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub3_Sub7 arg2) {
		@Pc(6) Class5_Sub3_Sub7_Sub1 local6 = (Class5_Sub3_Sub7_Sub1) arg2;
		arg0 += local6.anInt4611 + 1;
		arg1 += local6.anInt4613 + 1;
		@Pc(28) int local28 = arg0 + arg1 * this.anInt3022;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt4605;
		@Pc(42) int local42 = local6.anInt4612;
		@Pc(48) int local48 = this.anInt3022 - local42;
		@Pc(55) int local55;
		if (arg1 <= 0) {
			local55 = 1 - arg1;
			local28 += this.anInt3022 * local55;
			arg1 = 1;
			local33 -= local55;
			local30 = local55 * local42;
		}
		@Pc(76) int local76 = 0;
		if (this.anInt3031 <= arg1 + local33) {
			local55 = local33 + arg1 + 1 - this.anInt3031;
			local33 -= local55;
		}
		if (arg0 <= 0) {
			local55 = 1 - arg0;
			arg0 = 1;
			local30 += local55;
			local48 += local55;
			local42 -= local55;
			local76 = local55;
			local28 += local55;
		}
		if (this.anInt3022 <= local42 + arg0) {
			local55 = local42 + arg0 + 1 - this.anInt3022;
			local48 += local55;
			local76 += local55;
			local42 -= local55;
		}
		if (local42 > 0 && local33 > 0) {
			Static550.method7645(local76, local48, local33, local42, this.aByteArray22, local30, local6.aByteArray40, local28);
			this.method2684(local42, local33, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIII)V")
	private void method2684(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass330ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg2 - 1 >> 7;
		@Pc(26) int local26 = arg2 + arg0 - 1 - 1 >> 7;
		@Pc(32) int local32 = arg3 - 1 >> 7;
		@Pc(50) int local50 = arg3 + arg1 - 1 - 1 >> 7;
		for (@Pc(52) int local52 = local15; local52 <= local26; local52++) {
			@Pc(59) Class330[] local59 = this.aClass330ArrayArray1[local52];
			for (@Pc(61) int local61 = local32; local61 <= local50; local61++) {
				if (local59[local61] != null) {
					local59[local61].aBoolean776 = true;
				}
			}
		}
	}
}
