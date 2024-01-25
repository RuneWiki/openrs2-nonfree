import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class358 {

	@OriginalMember(owner = "client!vda", name = "o", descriptor = "[[Lclient!pca;")
	private Class265[][] aClass265ArrayArray1;

	@OriginalMember(owner = "client!vda", name = "q", descriptor = "Lclient!vha;")
	private final Class61_Sub3 aClass61_Sub3_3;

	@OriginalMember(owner = "client!vda", name = "d", descriptor = "Lclient!pj;")
	private final Class133_Sub1 aClass133_Sub1_18;

	@OriginalMember(owner = "client!vda", name = "k", descriptor = "I")
	public final int anInt9900;

	@OriginalMember(owner = "client!vda", name = "p", descriptor = "I")
	private final int anInt9903;

	@OriginalMember(owner = "client!vda", name = "j", descriptor = "I")
	private final int anInt9899;

	@OriginalMember(owner = "client!vda", name = "m", descriptor = "[B")
	public final byte[] aByteArray103;

	@OriginalMember(owner = "client!vda", name = "e", descriptor = "I")
	private final int anInt9895;

	@OriginalMember(owner = "client!vda", name = "h", descriptor = "I")
	private final int anInt9898;

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lclient!pj;Lclient!vha;)V")
	public Class358(@OriginalArg(0) Class133_Sub1 arg0, @OriginalArg(1) Class61_Sub3 arg1) {
		this.aClass61_Sub3_3 = arg1;
		this.aClass133_Sub1_18 = arg0;
		this.anInt9900 = (this.aClass61_Sub3_3.anInt10027 * this.aClass61_Sub3_3.anInt10026 >> this.aClass133_Sub1_18.anInt7012) + 2;
		this.anInt9903 = (this.aClass61_Sub3_3.anInt10027 * this.aClass61_Sub3_3.anInt10029 >> this.aClass133_Sub1_18.anInt7012) + 2;
		this.anInt9899 = this.aClass133_Sub1_18.anInt7012 + 7 - this.aClass61_Sub3_3.anInt10031;
		this.aByteArray103 = new byte[this.anInt9900 * this.anInt9903];
		this.anInt9895 = this.aClass61_Sub3_3.anInt10026 >> this.anInt9899;
		this.anInt9898 = this.aClass61_Sub3_3.anInt10029 >> this.anInt9899;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(BILclient!r;I)V")
	public void method8508(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub5_Sub14 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class5_Sub5_Sub14_Sub2 local6 = (Class5_Sub5_Sub14_Sub2) arg1;
		arg0 += local6.anInt9228 + 1;
		arg2 += local6.anInt9224 + 1;
		@Pc(28) int local28 = arg2 + this.anInt9900 * arg0;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt9230;
		@Pc(36) int local36 = local6.anInt9225;
		@Pc(42) int local42 = this.anInt9900 - local36;
		@Pc(48) int local48;
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			arg0 = 1;
			local33 -= local48;
			local28 += this.anInt9900 * local48;
			local30 = local48 * local36;
		}
		@Pc(69) int local69 = 0;
		if (this.anInt9903 <= local33 + arg0) {
			local48 = local33 + arg0 + 1 - this.anInt9903;
			local33 -= local48;
		}
		if (arg2 <= 0) {
			local48 = 1 - arg2;
			local28 += local48;
			local42 += local48;
			arg2 = 1;
			local30 += local48;
			local69 = local48;
			local36 -= local48;
		}
		if (this.anInt9900 <= local36 + arg2) {
			local48 = local36 + arg2 + 1 - this.anInt9900;
			local36 -= local48;
			local69 += local48;
			local42 += local48;
		}
		if (local36 > 0 && local33 > 0) {
			Static162.method2343(local30, local36, local42, local28, local6.aByteArray97, local69, this.aByteArray103, local33);
			this.method8513(local36, local33, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)V")
	public void method8509() {
		this.aClass265ArrayArray1 = new Class265[this.anInt9895][this.anInt9898];
		for (@Pc(18) int local18 = 0; local18 < this.anInt9898; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt9895; local22++) {
				this.aClass265ArrayArray1[local22][local18] = new Class265(this.aClass133_Sub1_18, this, this.aClass61_Sub3_3, local22, local18, this.anInt9899, local22 * 128 + 1, local18 * 128 + 1);
				if (this.aClass265ArrayArray1[local22][local18].anInt7227 == 0) {
					this.aClass265ArrayArray1[local22][local18] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIILclient!r;)V")
	public void method8510(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub5_Sub14 arg2) {
		@Pc(6) Class5_Sub5_Sub14_Sub2 local6 = (Class5_Sub5_Sub14_Sub2) arg2;
		arg1 += local6.anInt9228 + 1;
		arg0 += local6.anInt9224 + 1;
		@Pc(27) int local27 = arg0 + arg1 * this.anInt9900;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt9230;
		@Pc(35) int local35 = local6.anInt9225;
		@Pc(41) int local41 = this.anInt9900 - local35;
		@Pc(48) int local48;
		if (arg1 <= 0) {
			local48 = 1 - arg1;
			local27 += local48 * this.anInt9900;
			arg1 = 1;
			local32 -= local48;
			local29 = local35 * local48;
		}
		@Pc(69) int local69 = 0;
		if (local32 + arg1 >= this.anInt9903) {
			local48 = local32 + arg1 + 1 - this.anInt9903;
			local32 -= local48;
		}
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			arg0 = 1;
			local35 -= local48;
			local29 += local48;
			local41 += local48;
			local27 += local48;
			local69 = local48;
		}
		if (arg0 + local35 >= this.anInt9900) {
			local48 = local35 + arg0 + 1 - this.anInt9900;
			local69 += local48;
			local35 -= local48;
			local41 += local48;
		}
		if (local35 > 0 && local32 > 0) {
			Static605.method8634(local27, local69, local41, local6.aByteArray97, local32, local35, local29, this.aByteArray103);
			this.method8513(local35, local32, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!r;IIB)Z")
	public boolean method8511(@OriginalArg(0) Class5_Sub5_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class5_Sub5_Sub14_Sub2 local6 = (Class5_Sub5_Sub14_Sub2) arg0;
		arg2 += local6.anInt9228 + 1;
		arg1 += local6.anInt9224 + 1;
		@Pc(27) int local27 = arg2 * this.anInt9900 + arg1;
		@Pc(30) int local30 = local6.anInt9230;
		@Pc(38) int local38 = local6.anInt9225;
		@Pc(44) int local44 = this.anInt9900 - local38;
		@Pc(53) int local53;
		if (arg2 <= 0) {
			local53 = 1 - arg2;
			local27 += local53 * this.anInt9900;
			local30 -= local53;
			arg2 = 1;
		}
		if (arg2 + local30 >= this.anInt9903) {
			local53 = arg2 + local30 + 1 - this.anInt9903;
			local30 -= local53;
		}
		if (arg1 <= 0) {
			local53 = 1 - arg1;
			local27 += local53;
			arg1 = 1;
			local44 += local53;
			local38 -= local53;
		}
		if (local38 + arg1 >= this.anInt9900) {
			local53 = local38 + arg1 + 1 - this.anInt9900;
			local38 -= local53;
			local44 += local53;
		}
		if (local38 > 0 && local30 > 0) {
			local44 += this.anInt9900 * 7;
			return Static66.method1096(local38, local44, local27, local30, this.aByteArray103);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIBI)V")
	private void method8513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass265ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg2 - 1 >> 7;
		@Pc(23) int local23 = arg0 + arg2 - 2 >> 7;
		@Pc(29) int local29 = arg3 - 1 >> 7;
		@Pc(43) int local43 = arg1 + arg3 - 1 - 1 >> 7;
		for (@Pc(45) int local45 = local15; local45 <= local23; local45++) {
			@Pc(52) Class265[] local52 = this.aClass265ArrayArray1[local45];
			for (@Pc(54) int local54 = local29; local54 <= local43; local54++) {
				if (local52[local54] != null) {
					local52[local54].aBoolean517 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(II[[ZIZZ)V")
	public void method8514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		this.aClass133_Sub1_18.method6252(false);
		this.aClass133_Sub1_18.method6259(false);
		this.aClass133_Sub1_18.method6208(1);
		this.aClass133_Sub1_18.method6268(1);
		this.aClass133_Sub1_18.method6277(false, -2, false);
		@Pc(41) float local41 = 1.0F / (float) (this.aClass133_Sub1_18.anInt7001 * 128);
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		if (arg4) {
			for (local45 = 0; local45 < this.anInt9898; local45++) {
				local52 = local45 << this.anInt9899;
				local59 = local45 + 1 << this.anInt9899;
				label138: for (local61 = 0; local61 < this.anInt9895; local61++) {
					if (this.aClass265ArrayArray1[local61][local45] != null) {
						@Pc(75) int local75 = local61 << this.anInt9899;
						@Pc(82) int local82 = local61 + 1 << this.anInt9899;
						for (@Pc(84) int local84 = local75; local84 < local82; local84++) {
							if (local84 - arg3 >= -arg1 && arg1 >= local84 - arg3) {
								for (@Pc(104) int local104 = local52; local104 < local59; local104++) {
									if (local104 - arg0 >= -arg1 && local104 - arg0 <= arg1 && arg2[local84 + arg1 - arg3][local104 + arg1 - arg0]) {
										@Pc(144) Class113_Sub1 local144 = this.aClass133_Sub1_18.method6183();
										local144.method2456(local41, 1.0F, local41);
										local144.method8454(-local61, -local45, 0);
										this.aClass133_Sub1_18.method6225(Static337.aClass373_6);
										this.aClass265ArrayArray1[local61][local45].method6381();
										continue label138;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local45 = 0; local45 < this.anInt9898; local45++) {
				local52 = local45 << this.anInt9899;
				local59 = local45 + 1 << this.anInt9899;
				for (local61 = 0; local61 < this.anInt9895; local61++) {
					@Pc(231) Class265 local231 = this.aClass265ArrayArray1[local61][local45];
					if (local231 != null) {
						@Pc(242) Interface14 local242 = this.aClass133_Sub1_18.method6155(local231.anInt7227 * 3);
						@Pc(247) Buffer local247 = local242.method6770();
						if (local247 != null) {
							@Pc(255) Stream local255 = this.aClass133_Sub1_18.method6242(local247);
							@Pc(257) int local257 = 0;
							@Pc(262) int local262 = local61 << this.anInt9899;
							@Pc(269) int local269 = local61 + 1 << this.anInt9899;
							for (@Pc(271) int local271 = local52; local271 < local59; local271++) {
								if (-arg1 <= local271 - arg0 && local271 - arg0 <= arg1) {
									@Pc(297) int local297 = this.aClass61_Sub3_3.anInt10026 * local271 + local262;
									for (@Pc(299) int local299 = local262; local299 < local269; local299++) {
										if (-arg1 <= local299 - arg3 && arg1 >= local299 - arg3 && arg2[local299 + arg1 - arg3][arg1 + local271 - arg0]) {
											@Pc(340) short[] local340 = this.aClass61_Sub3_3.aShortArrayArray39[local297];
											if (local340 != null) {
												@Pc(346) int local346;
												if (Stream.a()) {
													for (local346 = 0; local346 < local340.length; local346++) {
														local255.f(local340[local346] & 0xFFFF);
														local257++;
													}
												} else {
													for (local346 = 0; local346 < local340.length; local346++) {
														local255.e(local340[local346] & 0xFFFF);
														local257++;
													}
												}
											}
										}
										local297++;
									}
								}
							}
							local255.b();
							if (local242.method6769() && local257 > 0) {
								@Pc(418) Class113_Sub1 local418 = this.aClass133_Sub1_18.method6183();
								local418.method2456(local41, 1.0F, local41);
								local418.method8454(-local61, -local45, 0);
								this.aClass133_Sub1_18.method6225(Static337.aClass373_6);
								local231.method6383(local257 / 3, local242);
							}
						}
					}
				}
			}
		}
		this.aClass133_Sub1_18.method6172();
	}
}
