import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class362 {

	@OriginalMember(owner = "client!ve", name = "r", descriptor = "[[Lclient!pe;")
	private Class274[][] aClass274ArrayArray1;

	@OriginalMember(owner = "client!ve", name = "q", descriptor = "Lclient!mf;")
	private final Class51_Sub2 aClass51_Sub2_3;

	@OriginalMember(owner = "client!ve", name = "s", descriptor = "Lclient!pj;")
	private final Class137_Sub1 aClass137_Sub1_23;

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
	public final int anInt10549;

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
	private final int anInt10552;

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "[B")
	public final byte[] aByteArray134;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
	private final int anInt10548;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
	private final int anInt10544;

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
	private final int anInt10553;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!pj;Lclient!mf;)V")
	public Class362(@OriginalArg(0) Class137_Sub1 arg0, @OriginalArg(1) Class51_Sub2 arg1) {
		this.aClass51_Sub2_3 = arg1;
		this.aClass137_Sub1_23 = arg0;
		this.anInt10549 = (this.aClass51_Sub2_3.anInt9511 * this.aClass51_Sub2_3.anInt9506 >> this.aClass137_Sub1_23.anInt9731) + 2;
		this.anInt10552 = (this.aClass51_Sub2_3.anInt9512 * this.aClass51_Sub2_3.anInt9506 >> this.aClass137_Sub1_23.anInt9731) + 2;
		this.aByteArray134 = new byte[this.anInt10549 * this.anInt10552];
		this.anInt10548 = this.aClass137_Sub1_23.anInt9731 + 7 - this.aClass51_Sub2_3.anInt9507;
		this.anInt10544 = this.aClass51_Sub2_3.anInt9511 >> this.anInt10548;
		this.anInt10553 = this.aClass51_Sub2_3.anInt9512 >> this.anInt10548;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	public void method8795() {
		this.aClass274ArrayArray1 = new Class274[this.anInt10544][this.anInt10553];
		for (@Pc(14) int local14 = 0; local14 < this.anInt10553; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt10544; local18++) {
				this.aClass274ArrayArray1[local18][local14] = new Class274(this.aClass137_Sub1_23, this, this.aClass51_Sub2_3, local18, local14, this.anInt10548, local18 * 128 + 1, local14 * 128 + 1);
				if (this.aClass274ArrayArray1[local18][local14].anInt7875 == 0) {
					this.aClass274ArrayArray1[local18][local14] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILclient!r;I)Z")
	public boolean method8796(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub3_Sub14 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class14_Sub3_Sub14_Sub1 local6 = (Class14_Sub3_Sub14_Sub1) arg1;
		arg2 += local6.anInt8098 + 1;
		arg0 += local6.anInt8093 + 1;
		@Pc(27) int local27 = arg0 + arg2 * this.anInt10549;
		@Pc(30) int local30 = local6.anInt8090;
		@Pc(33) int local33 = local6.anInt8091;
		@Pc(38) int local38 = this.anInt10549 - local33;
		@Pc(45) int local45;
		if (arg2 <= 0) {
			local45 = 1 - arg2;
			local30 -= local45;
			arg2 = 1;
			local27 += this.anInt10549 * local45;
		}
		if (this.anInt10552 <= local30 + arg2) {
			local45 = arg2 + local30 + 1 - this.anInt10552;
			local30 -= local45;
		}
		if (arg0 <= 0) {
			local45 = 1 - arg0;
			arg0 = 1;
			local38 += local45;
			local33 -= local45;
			local27 += local45;
		}
		if (this.anInt10549 <= arg0 + local33) {
			local45 = local33 + arg0 + 1 - this.anInt10549;
			local38 += local45;
			local33 -= local45;
		}
		if (local33 > 0 && local30 > 0) {
			local38 += this.anInt10549 * 7;
			return Static618.method8664(local30, this.aByteArray134, local27, local33, local38);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZIILclient!r;)V")
	public void method8797(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class14_Sub3_Sub14 arg2) {
		@Pc(6) Class14_Sub3_Sub14_Sub1 local6 = (Class14_Sub3_Sub14_Sub1) arg2;
		arg0 += local6.anInt8098 + 1;
		arg1 += local6.anInt8093 + 1;
		@Pc(27) int local27 = arg1 + arg0 * this.anInt10549;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt8090;
		@Pc(35) int local35 = local6.anInt8091;
		@Pc(41) int local41 = this.anInt10549 - local35;
		@Pc(43) int local43 = 0;
		@Pc(53) int local53;
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			local29 = local35 * local53;
			arg0 = 1;
			local27 += this.anInt10549 * local53;
			local32 -= local53;
		}
		if (arg0 + local32 >= this.anInt10552) {
			local53 = local32 + arg0 + 1 - this.anInt10552;
			local32 -= local53;
		}
		if (arg1 <= 0) {
			local53 = 1 - arg1;
			local27 += local53;
			local29 += local53;
			local43 = local53;
			local35 -= local53;
			arg1 = 1;
			local41 += local53;
		}
		if (this.anInt10549 <= arg1 + local35) {
			local53 = arg1 + local35 + 1 - this.anInt10549;
			local35 -= local53;
			local41 += local53;
			local43 += local53;
		}
		if (local35 > 0 && local32 > 0) {
			Static401.method5989(local32, this.aByteArray134, local27, local41, local29, local35, local43, local6.aByteArray95);
			this.method8802(arg1, local35, local32, arg0);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZB[[ZIII)V")
	public void method8798(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aClass137_Sub1_23.method8077(false);
		this.aClass137_Sub1_23.method8022(false);
		this.aClass137_Sub1_23.method7990(1);
		this.aClass137_Sub1_23.method8078(1);
		this.aClass137_Sub1_23.method7962(false, -2, false);
		@Pc(47) float local47 = 1.0F / (float) (this.aClass137_Sub1_23.anInt9708 * 128);
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(67) int local67;
		if (arg0) {
			for (local51 = 0; local51 < this.anInt10553; local51++) {
				local58 = local51 << this.anInt10548;
				local65 = local51 + 1 << this.anInt10548;
				label87: for (local67 = 0; local67 < this.anInt10544; local67++) {
					if (this.aClass274ArrayArray1[local67][local51] != null) {
						@Pc(337) int local337 = local67 << this.anInt10548;
						@Pc(344) int local344 = local67 + 1 << this.anInt10548;
						for (@Pc(346) int local346 = local337; local346 < local344; local346++) {
							if (-arg4 <= local346 - arg3 && local346 - arg3 <= arg4) {
								for (@Pc(370) int local370 = local58; local370 < local65; local370++) {
									if (-arg4 <= local370 - arg2 && local370 - arg2 <= arg4 && arg1[local346 + arg4 - arg3][local370 + arg4 - arg2]) {
										@Pc(415) Class26_Sub1 local415 = this.aClass137_Sub1_23.method8050();
										local415.method790(local47, local47, 1.0F);
										local415.method6443(-local67, -local51, 0);
										this.aClass137_Sub1_23.method8041(Static658.aClass70_6);
										this.aClass274ArrayArray1[local67][local51].method6512();
										continue label87;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local51 = 0; local51 < this.anInt10553; local51++) {
				local58 = local51 << this.anInt10548;
				local65 = local51 + 1 << this.anInt10548;
				for (local67 = 0; local67 < this.anInt10544; local67++) {
					@Pc(76) Class274 local76 = this.aClass274ArrayArray1[local67][local51];
					if (local76 != null) {
						@Pc(87) Interface4 local87 = this.aClass137_Sub1_23.method8005(local76.anInt7875 * 3);
						@Pc(92) Buffer local92 = local87.method5680();
						if (local92 != null) {
							@Pc(100) Stream local100 = this.aClass137_Sub1_23.method8079(local92);
							@Pc(102) int local102 = 0;
							@Pc(107) int local107 = local67 << this.anInt10548;
							@Pc(114) int local114 = local67 + 1 << this.anInt10548;
							for (@Pc(116) int local116 = local58; local116 < local65; local116++) {
								if (-arg4 <= local116 - arg2 && arg4 >= local116 - arg2) {
									@Pc(147) int local147 = local107 + this.aClass51_Sub2_3.anInt9511 * local116;
									for (@Pc(149) int local149 = local107; local149 < local114; local149++) {
										if (-arg4 <= local149 - arg3 && local149 - arg3 <= arg4 && arg1[arg4 + local149 - arg3][local116 + arg4 - arg2]) {
											@Pc(190) short[] local190 = this.aClass51_Sub2_3.aShortArrayArray15[local147];
											if (local190 != null) {
												@Pc(196) int local196;
												if (Stream.c()) {
													for (local196 = 0; local196 < local190.length; local196++) {
														local102++;
														local100.a(local190[local196] & 0xFFFF);
													}
												} else {
													for (local196 = 0; local196 < local190.length; local196++) {
														local102++;
														local100.e(local190[local196] & 0xFFFF);
													}
												}
											}
										}
										local147++;
									}
								}
							}
							local100.b();
							if (local87.method5682() && local102 > 0) {
								@Pc(260) Class26_Sub1 local260 = this.aClass137_Sub1_23.method8050();
								local260.method790(local47, local47, 1.0F);
								local260.method6443(-local67, -local51, 0);
								this.aClass137_Sub1_23.method8041(Static658.aClass70_6);
								local76.method6513(local87, local102 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass137_Sub1_23.method8071();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!r;BI)V")
	public void method8801(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub3_Sub14 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class14_Sub3_Sub14_Sub1 local6 = (Class14_Sub3_Sub14_Sub1) arg1;
		arg0 += local6.anInt8093 + 1;
		arg2 += local6.anInt8098 + 1;
		@Pc(33) int local33 = this.anInt10549 * arg2 + arg0;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = local6.anInt8090;
		@Pc(41) int local41 = local6.anInt8091;
		@Pc(47) int local47 = this.anInt10549 - local41;
		@Pc(49) int local49 = 0;
		@Pc(58) int local58;
		if (arg2 <= 0) {
			local58 = 1 - arg2;
			local38 -= local58;
			arg2 = 1;
			local33 += local58 * this.anInt10549;
			local35 = local41 * local58;
		}
		if (this.anInt10552 <= arg2 + local38) {
			local58 = arg2 + local38 + 1 - this.anInt10552;
			local38 -= local58;
		}
		if (arg0 <= 0) {
			local58 = 1 - arg0;
			local47 += local58;
			local49 = local58;
			arg0 = 1;
			local35 += local58;
			local41 -= local58;
			local33 += local58;
		}
		if (local41 + arg0 >= this.anInt10549) {
			local58 = arg0 + local41 + 1 - this.anInt10549;
			local41 -= local58;
			local47 += local58;
			local49 += local58;
		}
		if (local41 > 0 && local38 > 0) {
			Static4.method25(local49, local6.aByteArray95, local47, local41, local38, this.aByteArray134, local33, local35);
			this.method8802(arg0, local41, local38, arg2);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIII)V")
	private void method8802(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass274ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg0 - 1 >> 7;
		@Pc(25) int local25 = arg1 + arg0 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg3 - 1 >> 7;
		@Pc(45) int local45 = arg2 + arg3 - 1 - 1 >> 7;
		for (@Pc(47) int local47 = local15; local47 <= local25; local47++) {
			@Pc(54) Class274[] local54 = this.aClass274ArrayArray1[local47];
			for (@Pc(56) int local56 = local31; local56 <= local45; local56++) {
				if (local54[local56] != null) {
					local54[local56].aBoolean539 = true;
				}
			}
		}
	}
}
