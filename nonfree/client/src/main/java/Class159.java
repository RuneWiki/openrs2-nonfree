import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class159 {

	@OriginalMember(owner = "client!ht", name = "i", descriptor = "[[Lclient!lfa;")
	private Class216[][] aClass216ArrayArray1;

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "Lclient!mg;")
	private final Class88_Sub2 aClass88_Sub2_2;

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "Lclient!wk;")
	private final Class143_Sub1 aClass143_Sub1_7;

	@OriginalMember(owner = "client!ht", name = "m", descriptor = "I")
	public final int anInt3800;

	@OriginalMember(owner = "client!ht", name = "l", descriptor = "I")
	private final int anInt3799;

	@OriginalMember(owner = "client!ht", name = "n", descriptor = "[B")
	public final byte[] aByteArray40;

	@OriginalMember(owner = "client!ht", name = "j", descriptor = "I")
	private final int anInt3797;

	@OriginalMember(owner = "client!ht", name = "g", descriptor = "I")
	private final int anInt3795;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
	private final int anInt3791;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lclient!wk;Lclient!mg;)V")
	public Class159(@OriginalArg(0) Class143_Sub1 arg0, @OriginalArg(1) Class88_Sub2 arg1) {
		this.aClass88_Sub2_2 = arg1;
		this.aClass143_Sub1_7 = arg0;
		this.anInt3800 = (this.aClass88_Sub2_2.anInt10541 * this.aClass88_Sub2_2.anInt10540 >> this.aClass143_Sub1_7.anInt7392) + 2;
		this.anInt3799 = (this.aClass88_Sub2_2.anInt10540 * this.aClass88_Sub2_2.anInt10545 >> this.aClass143_Sub1_7.anInt7392) + 2;
		this.aByteArray40 = new byte[this.anInt3800 * this.anInt3799];
		this.anInt3797 = this.aClass143_Sub1_7.anInt7392 + 7 - this.aClass88_Sub2_2.anInt10547;
		this.anInt3795 = this.aClass88_Sub2_2.anInt10541 >> this.anInt3797;
		this.anInt3791 = this.aClass88_Sub2_2.anInt10545 >> this.anInt3797;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZII[[ZZI)V")
	public void method3350(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(5) int arg4) {
		this.aClass143_Sub1_7.method6288(false);
		this.aClass143_Sub1_7.method6405(false);
		this.aClass143_Sub1_7.method6321(1);
		this.aClass143_Sub1_7.method6322(1);
		this.aClass143_Sub1_7.method6312(false, false, -2);
		@Pc(41) float local41 = 1.0F / (float) (this.aClass143_Sub1_7.anInt7400 * 128);
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		if (arg0) {
			for (local45 = 0; local45 < this.anInt3791; local45++) {
				local52 = local45 << this.anInt3797;
				local59 = local45 + 1 << this.anInt3797;
				label138: for (local61 = 0; local61 < this.anInt3795; local61++) {
					if (this.aClass216ArrayArray1[local61][local45] != null) {
						@Pc(75) int local75 = local61 << this.anInt3797;
						@Pc(82) int local82 = local61 + 1 << this.anInt3797;
						for (@Pc(84) int local84 = local75; local84 < local82; local84++) {
							if (local84 - arg2 >= -arg4 && local84 - arg2 <= arg4) {
								for (@Pc(104) int local104 = local52; local104 < local59; local104++) {
									if (-arg4 <= local104 - arg1 && arg4 >= local104 - arg1 && arg3[arg4 + local84 - arg2][arg4 + local104 - arg1]) {
										@Pc(146) Class56_Sub2 local146 = this.aClass143_Sub1_7.method6277();
										local146.method6820(1.0F, local41, local41);
										local146.method8390(-local61, -local45, 0);
										this.aClass143_Sub1_7.method6307(Static73.aClass270_1);
										this.aClass216ArrayArray1[local61][local45].method5135();
										continue label138;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local45 = 0; local45 < this.anInt3791; local45++) {
				local52 = local45 << this.anInt3797;
				local59 = local45 + 1 << this.anInt3797;
				for (local61 = 0; local61 < this.anInt3795; local61++) {
					@Pc(229) Class216 local229 = this.aClass216ArrayArray1[local61][local45];
					if (local229 != null) {
						@Pc(240) Interface16 local240 = this.aClass143_Sub1_7.method6387(local229.anInt6027 * 3);
						@Pc(245) Buffer local245 = local240.method7864();
						if (local245 != null) {
							@Pc(253) Stream local253 = this.aClass143_Sub1_7.method6361(local245);
							@Pc(255) int local255 = 0;
							@Pc(260) int local260 = local61 << this.anInt3797;
							@Pc(267) int local267 = local61 + 1 << this.anInt3797;
							for (@Pc(269) int local269 = local52; local269 < local59; local269++) {
								if (local269 - arg1 >= -arg4 && arg4 >= local269 - arg1) {
									@Pc(300) int local300 = local260 + this.aClass88_Sub2_2.anInt10541 * local269;
									for (@Pc(302) int local302 = local260; local302 < local267; local302++) {
										if (-arg4 <= local302 - arg2 && local302 - arg2 <= arg4 && arg3[local302 + arg4 - arg2][local269 + arg4 - arg1]) {
											@Pc(342) short[] local342 = this.aClass88_Sub2_2.aShortArrayArray14[local300];
											if (local342 != null) {
												@Pc(348) int local348;
												if (Stream.a()) {
													for (local348 = 0; local348 < local342.length; local348++) {
														local255++;
														local253.b(local342[local348] & 0xFFFF);
													}
												} else {
													for (local348 = 0; local348 < local342.length; local348++) {
														local253.f(local342[local348] & 0xFFFF);
														local255++;
													}
												}
											}
										}
										local300++;
									}
								}
							}
							local253.c();
							if (local240.method7862() && local255 > 0) {
								@Pc(416) Class56_Sub2 local416 = this.aClass143_Sub1_7.method6277();
								local416.method6820(1.0F, local41, local41);
								local416.method8390(-local61, -local45, 0);
								this.aClass143_Sub1_7.method6307(Static73.aClass270_1);
								local229.method5132(local255 / 3, local240);
							}
						}
					}
				}
			}
		}
		this.aClass143_Sub1_7.method6282();
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Z)V")
	public void method3351() {
		this.aClass216ArrayArray1 = new Class216[this.anInt3795][this.anInt3791];
		for (@Pc(14) int local14 = 0; local14 < this.anInt3791; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt3795; local18++) {
				this.aClass216ArrayArray1[local18][local14] = new Class216(this.aClass143_Sub1_7, this, this.aClass88_Sub2_2, local18, local14, this.anInt3797, local18 * 128 + 1, local14 * 128 - -1);
				if (this.aClass216ArrayArray1[local18][local14].anInt6027 == 0) {
					this.aClass216ArrayArray1[local18][local14] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIILclient!r;)V")
	public void method3352(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub2_Sub7 arg2) {
		@Pc(6) Class5_Sub2_Sub7_Sub1 local6 = (Class5_Sub2_Sub7_Sub1) arg2;
		arg0 += local6.anInt3076 + 1;
		arg1 += local6.anInt3075 + 1;
		@Pc(28) int local28 = arg0 + arg1 * this.anInt3800;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt3074;
		@Pc(36) int local36 = local6.anInt3071;
		@Pc(41) int local41 = this.anInt3800 - local36;
		@Pc(48) int local48;
		if (arg1 <= 0) {
			local48 = 1 - arg1;
			arg1 = 1;
			local30 = local36 * local48;
			local28 += this.anInt3800 * local48;
			local33 -= local48;
		}
		@Pc(69) int local69 = 0;
		if (this.anInt3799 <= arg1 + local33) {
			local48 = arg1 + local33 + 1 - this.anInt3799;
			local33 -= local48;
		}
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			local28 += local48;
			local41 += local48;
			local69 = local48;
			arg0 = 1;
			local36 -= local48;
			local30 += local48;
		}
		if (this.anInt3800 <= arg0 + local36) {
			local48 = arg0 + local36 + 1 - this.anInt3800;
			local69 += local48;
			local36 -= local48;
			local41 += local48;
		}
		if (local36 > 0 && local33 > 0) {
			Static486.method7097(local6.aByteArray25, local28, local69, local41, local36, this.aByteArray40, local30, local33);
			this.method3355(local33, arg1, arg0, local36);
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IBLclient!r;I)Z")
	public boolean method3353(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub2_Sub7 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class5_Sub2_Sub7_Sub1 local6 = (Class5_Sub2_Sub7_Sub1) arg1;
		arg2 += local6.anInt3075 + 1;
		arg0 += local6.anInt3076 + 1;
		@Pc(27) int local27 = this.anInt3800 * arg2 + arg0;
		@Pc(30) int local30 = local6.anInt3074;
		@Pc(33) int local33 = local6.anInt3071;
		@Pc(47) int local47 = this.anInt3800 - local33;
		@Pc(54) int local54;
		if (arg2 <= 0) {
			local54 = 1 - arg2;
			local27 += local54 * this.anInt3800;
			local30 -= local54;
			arg2 = 1;
		}
		if (arg2 + local30 >= this.anInt3799) {
			local54 = arg2 + local30 + 1 - this.anInt3799;
			local30 -= local54;
		}
		if (arg0 <= 0) {
			local54 = 1 - arg0;
			local27 += local54;
			arg0 = 1;
			local33 -= local54;
			local47 += local54;
		}
		if (arg0 + local33 >= this.anInt3800) {
			local54 = local33 + arg0 + 1 - this.anInt3800;
			local47 += local54;
			local33 -= local54;
		}
		if (local33 > 0 && local30 > 0) {
			local47 += this.anInt3800 * 7;
			return Static227.method3235(this.aByteArray40, local33, local27, local47, local30);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(BIILclient!r;)V")
	public void method3354(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub2_Sub7 arg2) {
		@Pc(6) Class5_Sub2_Sub7_Sub1 local6 = (Class5_Sub2_Sub7_Sub1) arg2;
		arg0 += local6.anInt3075 + 1;
		arg1 += local6.anInt3076 + 1;
		@Pc(27) int local27 = arg0 * this.anInt3800 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt3074;
		@Pc(35) int local35 = local6.anInt3071;
		@Pc(41) int local41 = this.anInt3800 - local35;
		@Pc(43) int local43 = 0;
		@Pc(52) int local52;
		if (arg0 <= 0) {
			local52 = 1 - arg0;
			arg0 = 1;
			local32 -= local52;
			local27 += this.anInt3800 * local52;
			local29 = local35 * local52;
		}
		if (local32 + arg0 >= this.anInt3799) {
			local52 = local32 + arg0 + 1 - this.anInt3799;
			local32 -= local52;
		}
		if (arg1 <= 0) {
			local52 = 1 - arg1;
			local35 -= local52;
			local27 += local52;
			arg1 = 1;
			local41 += local52;
			local43 = local52;
			local29 += local52;
		}
		if (this.anInt3800 <= local35 + arg1) {
			local52 = local35 + arg1 + 1 - this.anInt3800;
			local41 += local52;
			local43 += local52;
			local35 -= local52;
		}
		if (local35 > 0 && local32 > 0) {
			Static125.method1951(local43, local6.aByteArray25, local35, local29, local27, this.aByteArray40, local41, local32);
			this.method3355(local32, arg0, arg1, local35);
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIIB)V")
	private void method3355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass216ArrayArray1 == null) {
			return;
		}
		@Pc(19) int local19 = arg2 - 1 >> 7;
		@Pc(29) int local29 = arg3 + arg2 - 1 - 1 >> 7;
		@Pc(35) int local35 = arg1 - 1 >> 7;
		@Pc(45) int local45 = arg1 + arg0 - 1 - 1 >> 7;
		for (@Pc(47) int local47 = local19; local47 <= local29; local47++) {
			@Pc(54) Class216[] local54 = this.aClass216ArrayArray1[local47];
			for (@Pc(56) int local56 = local35; local56 <= local45; local56++) {
				if (local54[local56] != null) {
					local54[local56].aBoolean439 = true;
				}
			}
		}
	}
}
