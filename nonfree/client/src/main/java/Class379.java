import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class379 {

	@OriginalMember(owner = "client!vo", name = "p", descriptor = "[[Lclient!cp;")
	private Class50[][] aClass50ArrayArray1;

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "Lclient!ll;")
	private final Class42_Sub3 aClass42_Sub3_3;

	@OriginalMember(owner = "client!vo", name = "t", descriptor = "Lclient!wg;")
	private final Class33_Sub2 aClass33_Sub2_22;

	@OriginalMember(owner = "client!vo", name = "l", descriptor = "I")
	public final int anInt10088;

	@OriginalMember(owner = "client!vo", name = "q", descriptor = "I")
	private final int anInt10092;

	@OriginalMember(owner = "client!vo", name = "f", descriptor = "[B")
	public final byte[] aByteArray103;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
	private final int anInt10080;

	@OriginalMember(owner = "client!vo", name = "o", descriptor = "I")
	private final int anInt10091;

	@OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
	private final int anInt10090;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lclient!wg;Lclient!ll;)V")
	public Class379(@OriginalArg(0) Class33_Sub2 arg0, @OriginalArg(1) Class42_Sub3 arg1) {
		this.aClass42_Sub3_3 = arg1;
		this.aClass33_Sub2_22 = arg0;
		this.anInt10088 = (this.aClass42_Sub3_3.anInt8638 * this.aClass42_Sub3_3.anInt8631 >> this.aClass33_Sub2_22.bf) + 2;
		this.anInt10092 = (this.aClass42_Sub3_3.anInt8631 * this.aClass42_Sub3_3.anInt8630 >> this.aClass33_Sub2_22.bf) + 2;
		this.aByteArray103 = new byte[this.anInt10088 * this.anInt10092];
		this.anInt10080 = this.aClass33_Sub2_22.bf + 7 - this.aClass42_Sub3_3.anInt8635;
		this.anInt10091 = this.aClass42_Sub3_3.anInt8638 >> this.anInt10080;
		this.anInt10090 = this.aClass42_Sub3_3.anInt8630 >> this.anInt10080;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I[[ZIIZI)V")
	public void method8551(@OriginalArg(1) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		this.aClass33_Sub2_22.method8213(false);
		this.aClass33_Sub2_22.method8194(false);
		this.aClass33_Sub2_22.method8250(1);
		this.aClass33_Sub2_22.method8167(1);
		this.aClass33_Sub2_22.method8272(false, -2, false);
		@Pc(41) float local41 = 1.0F / (float) (this.aClass33_Sub2_22.anInt9654 * 128);
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		if (arg3) {
			for (local45 = 0; local45 < this.anInt10090; local45++) {
				local52 = local45 << this.anInt10080;
				local59 = local45 + 1 << this.anInt10080;
				label138: for (local61 = 0; local61 < this.anInt10091; local61++) {
					if (this.aClass50ArrayArray1[local61][local45] != null) {
						@Pc(75) int local75 = local61 << this.anInt10080;
						@Pc(82) int local82 = local61 + 1 << this.anInt10080;
						for (@Pc(84) int local84 = local75; local84 < local82; local84++) {
							if (-arg2 <= local84 - arg4 && arg2 >= local84 - arg4) {
								for (@Pc(105) int local105 = local52; local105 < local59; local105++) {
									if (local105 - arg1 >= -arg2 && arg2 >= local105 - arg1 && arg0[arg2 + local84 - arg4][arg2 + local105 - arg1]) {
										@Pc(141) Class92_Sub1 local141 = this.aClass33_Sub2_22.method8271();
										local141.method2302(local41, 1.0F, local41);
										local141.method3851(-local61, -local45, 0);
										this.aClass33_Sub2_22.method8286(Static100.aClass331_1);
										this.aClass50ArrayArray1[local61][local45].method1626();
										continue label138;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local45 = 0; local45 < this.anInt10090; local45++) {
				local52 = local45 << this.anInt10080;
				local59 = local45 + 1 << this.anInt10080;
				for (local61 = 0; local61 < this.anInt10091; local61++) {
					@Pc(228) Class50 local228 = this.aClass50ArrayArray1[local61][local45];
					if (local228 != null) {
						@Pc(239) Interface16 local239 = this.aClass33_Sub2_22.method8247(local228.anInt1637 * 3);
						@Pc(244) Buffer local244 = local239.method8364();
						if (local244 != null) {
							@Pc(252) Stream local252 = this.aClass33_Sub2_22.method8168(local244);
							@Pc(254) int local254 = 0;
							@Pc(259) int local259 = local61 << this.anInt10080;
							@Pc(266) int local266 = local61 + 1 << this.anInt10080;
							for (@Pc(268) int local268 = local52; local268 < local59; local268++) {
								if (-arg2 <= local268 - arg1 && local268 - arg1 <= arg2) {
									@Pc(299) int local299 = local259 + this.aClass42_Sub3_3.anInt8638 * local268;
									for (@Pc(301) int local301 = local259; local301 < local266; local301++) {
										if (-arg2 <= local301 - arg4 && local301 - arg4 <= arg2 && arg0[arg2 + local301 - arg4][local268 + arg2 - arg1]) {
											@Pc(339) short[] local339 = this.aClass42_Sub3_3.aShortArrayArray12[local299];
											if (local339 != null) {
												@Pc(345) int local345;
												if (Stream.b()) {
													for (local345 = 0; local345 < local339.length; local345++) {
														local254++;
														local252.f(local339[local345] & 0xFFFF);
													}
												} else {
													for (local345 = 0; local345 < local339.length; local345++) {
														local252.d(local339[local345] & 0xFFFF);
														local254++;
													}
												}
											}
										}
										local299++;
									}
								}
							}
							local252.c();
							if (local239.method8363() && local254 > 0) {
								@Pc(414) Class92_Sub1 local414 = this.aClass33_Sub2_22.method8271();
								local414.method2302(local41, 1.0F, local41);
								local414.method3851(-local61, -local45, 0);
								this.aClass33_Sub2_22.method8286(Static100.aClass331_1);
								local228.method1625(local254 / 3, local239);
							}
						}
					}
				}
			}
		}
		this.aClass33_Sub2_22.method8201();
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IZILclient!r;)V")
	public void method8552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub5_Sub9 arg2) {
		@Pc(6) Class4_Sub5_Sub9_Sub1 local6 = (Class4_Sub5_Sub9_Sub1) arg2;
		arg0 += local6.anInt3582 + 1;
		arg1 += local6.anInt3578 + 1;
		@Pc(34) int local34 = arg1 + arg0 * this.anInt10088;
		@Pc(36) int local36 = 0;
		@Pc(39) int local39 = local6.anInt3579;
		@Pc(42) int local42 = local6.anInt3583;
		@Pc(48) int local48 = this.anInt10088 - local42;
		@Pc(58) int local58;
		if (arg0 <= 0) {
			local58 = 1 - arg0;
			local36 = local58 * local42;
			arg0 = 1;
			local34 += this.anInt10088 * local58;
			local39 -= local58;
		}
		@Pc(79) int local79 = 0;
		if (local39 + arg0 >= this.anInt10092) {
			local58 = arg0 + local39 + 1 - this.anInt10092;
			local39 -= local58;
		}
		if (arg1 <= 0) {
			local58 = 1 - arg1;
			local79 = local58;
			local48 += local58;
			arg1 = 1;
			local42 -= local58;
			local36 += local58;
			local34 += local58;
		}
		if (this.anInt10088 <= arg1 + local42) {
			local58 = local42 + arg1 + 1 - this.anInt10088;
			local48 += local58;
			local79 += local58;
			local42 -= local58;
		}
		if (local42 > 0 && local39 > 0) {
			Static250.method3667(local42, local34, local6.aByteArray41, local39, local48, local36, this.aByteArray103, local79);
			this.method8554(arg0, arg1, local42, local39);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IILclient!r;I)V")
	public void method8553(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub5_Sub9 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class4_Sub5_Sub9_Sub1 local6 = (Class4_Sub5_Sub9_Sub1) arg1;
		arg2 += local6.anInt3578 + 1;
		arg0 += local6.anInt3582 + 1;
		@Pc(27) int local27 = arg0 * this.anInt10088 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt3579;
		@Pc(35) int local35 = local6.anInt3583;
		@Pc(41) int local41 = this.anInt10088 - local35;
		@Pc(51) int local51;
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			arg0 = 1;
			local27 += local51 * this.anInt10088;
			local32 -= local51;
			local29 = local51 * local35;
		}
		@Pc(83) int local83 = 0;
		if (this.anInt10092 <= local32 + arg0) {
			local51 = local32 + arg0 + 1 - this.anInt10092;
			local32 -= local51;
		}
		if (arg2 <= 0) {
			local51 = 1 - arg2;
			local35 -= local51;
			local29 += local51;
			local27 += local51;
			local41 += local51;
			local83 = local51;
			arg2 = 1;
		}
		if (arg2 + local35 >= this.anInt10088) {
			local51 = arg2 + local35 + 1 - this.anInt10088;
			local35 -= local51;
			local41 += local51;
			local83 += local51;
		}
		if (local35 > 0 && local32 > 0) {
			Static529.method2530(local27, local6.aByteArray41, local35, local41, local83, local32, local29, this.aByteArray103);
			this.method8554(arg0, arg2, local35, local32);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIII)V")
	private void method8554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass50ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg1 - 1 >> 7;
		@Pc(26) int local26 = arg1 + arg2 - 1 - 1 >> 7;
		@Pc(32) int local32 = arg0 - 1 >> 7;
		@Pc(41) int local41 = arg0 + arg3 - 2 >> 7;
		for (@Pc(43) int local43 = local15; local43 <= local26; local43++) {
			@Pc(50) Class50[] local50 = this.aClass50ArrayArray1[local43];
			for (@Pc(52) int local52 = local32; local52 <= local41; local52++) {
				if (local50[local52] != null) {
					local50[local52].aBoolean108 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
	public void method8557() {
		this.aClass50ArrayArray1 = new Class50[this.anInt10091][this.anInt10090];
		for (@Pc(14) int local14 = 0; local14 < this.anInt10090; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt10091; local18++) {
				this.aClass50ArrayArray1[local18][local14] = new Class50(this.aClass33_Sub2_22, this, this.aClass42_Sub3_3, local18, local14, this.anInt10080, local18 * 128 + 1, local14 * 128 + 1);
				if (this.aClass50ArrayArray1[local18][local14].anInt1637 == 0) {
					this.aClass50ArrayArray1[local18][local14] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIILclient!r;)Z")
	public boolean method8559(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub5_Sub9 arg2) {
		@Pc(6) Class4_Sub5_Sub9_Sub1 local6 = (Class4_Sub5_Sub9_Sub1) arg2;
		arg1 += local6.anInt3582 + 1;
		arg0 += local6.anInt3578 + 1;
		@Pc(27) int local27 = arg1 * this.anInt10088 + arg0;
		@Pc(36) int local36 = local6.anInt3579;
		@Pc(39) int local39 = local6.anInt3583;
		@Pc(49) int local49;
		if (arg1 <= 0) {
			local49 = 1 - arg1;
			local36 -= local49;
			local27 += this.anInt10088 * local49;
			arg1 = 1;
		}
		@Pc(67) int local67 = this.anInt10088 - local39;
		if (local36 + arg1 >= this.anInt10092) {
			local49 = arg1 + local36 + 1 - this.anInt10092;
			local36 -= local49;
		}
		if (arg0 <= 0) {
			local49 = 1 - arg0;
			arg0 = 1;
			local67 += local49;
			local39 -= local49;
			local27 += local49;
		}
		if (this.anInt10088 <= local39 + arg0) {
			local49 = local39 + arg0 + 1 - this.anInt10088;
			local39 -= local49;
			local67 += local49;
		}
		if (local39 > 0 && local36 > 0) {
			local67 += this.anInt10088 * 7;
			return Static189.method2959(local67, local36, this.aByteArray103, local39, local27);
		} else {
			return false;
		}
	}
}
