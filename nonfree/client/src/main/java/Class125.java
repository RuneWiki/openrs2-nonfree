import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class125 {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "[[Lclient!wl;")
	private Class216[][] aClass216ArrayArray1;

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "Lclient!sq;")
	private final Class46_Sub2 aClass46_Sub2_23;

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "Lclient!kg;")
	private final Class114_Sub1 aClass114_Sub1_2;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
	public final int anInt3582;

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
	private final int anInt3580;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "[B")
	public final byte[] aByteArray99;

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
	private final int anInt3584;

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
	private final int anInt3583;

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
	private final int anInt3581;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!sq;Lclient!kg;)V")
	public Class125(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) Class114_Sub1 arg1) {
		this.aClass46_Sub2_23 = arg0;
		this.aClass114_Sub1_2 = arg1;
		this.anInt3582 = (this.aClass114_Sub1_2.anInt3871 * this.aClass114_Sub1_2.anInt3432 >> this.aClass46_Sub2_23.anInt5736) + 2;
		this.anInt3580 = (this.aClass114_Sub1_2.anInt3873 * this.aClass114_Sub1_2.anInt3432 >> this.aClass46_Sub2_23.anInt5736) + 2;
		this.aByteArray99 = new byte[this.anInt3580 * this.anInt3582];
		this.anInt3584 = this.aClass46_Sub2_23.anInt5736 + 7 - this.aClass114_Sub1_2.anInt3433;
		this.anInt3583 = this.aClass114_Sub1_2.anInt3871 >> this.anInt3584;
		this.anInt3581 = this.aClass114_Sub1_2.anInt3873 >> this.anInt3584;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BILclient!as;I)V")
	public void method3381(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class14_Sub2_Sub2_Sub1 local8 = (Class14_Sub2_Sub2_Sub1) arg1;
		arg2 += local8.anInt6074 + 1;
		arg0 += local8.anInt6075 + 1;
		@Pc(29) int local29 = arg2 * this.anInt3582 + arg0;
		@Pc(31) int local31 = 0;
		@Pc(34) int local34 = local8.anInt6073;
		@Pc(37) int local37 = local8.anInt6072;
		@Pc(43) int local43 = this.anInt3582 - local37;
		@Pc(45) int local45 = 0;
		@Pc(56) int local56;
		if (arg2 <= 0) {
			local56 = 1 - arg2;
			local34 -= local56;
			arg2 = 1;
			local31 = local37 * local56;
			local29 += local56 * this.anInt3582;
		}
		if (this.anInt3580 <= arg2 + local34) {
			local56 = arg2 + local34 + 1 - this.anInt3580;
			local34 -= local56;
		}
		if (arg0 <= 0) {
			local56 = 1 - arg0;
			local45 = local56;
			local37 -= local56;
			arg0 = 1;
			local31 += local56;
			local43 += local56;
			local29 += local56;
		}
		if (this.anInt3582 <= arg0 + local37) {
			local56 = local37 + arg0 + 1 - this.anInt3582;
			local37 -= local56;
			local45 += local56;
			local43 += local56;
		}
		if (local37 > 0 && local34 > 0) {
			Static361.method3380(local29, local37, local8.aByteArray191, local34, this.aByteArray99, local31, local45, local43);
			this.method3385(arg2, arg0, local34, local37);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZII[[Z)V")
	public void method3382(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean[][] arg4) {
		@Pc(3) opengl local3 = this.aClass46_Sub2_23.anOpengl1;
		this.aClass46_Sub2_23.method5245();
		this.aClass46_Sub2_23.method5241(false);
		this.aClass46_Sub2_23.method5208(false);
		this.aClass46_Sub2_23.method5226();
		this.aClass46_Sub2_23.method5252(0);
		this.aClass46_Sub2_23.method5256(1);
		@Pc(35) float local35 = 1.0F / (float) (this.aClass46_Sub2_23.anInt5737 * 128);
		@Pc(39) int local39;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		@Pc(74) int local74;
		@Pc(81) int local81;
		@Pc(83) int local83;
		if (arg1) {
			for (local39 = 0; local39 < this.anInt3581; local39++) {
				local52 = local39 << this.anInt3584;
				local59 = local39 + 1 << this.anInt3584;
				label132: for (local61 = 0; local61 < this.anInt3583; local61++) {
					local74 = local61 << this.anInt3584;
					local81 = local61 + 1 << this.anInt3584;
					for (local83 = local74; local83 < local81; local83++) {
						if (-arg2 <= local83 - arg0 && local83 - arg0 <= arg2) {
							for (@Pc(110) int local110 = local52; local110 < local59; local110++) {
								if (-arg2 <= local110 - arg3 && arg2 >= local110 - arg3 && arg4[local83 + arg2 - arg0][local110 + arg2 - arg3]) {
									local3.glMatrixMode(5890);
									local3.glLoadIdentity();
									local3.glScalef(local35, local35, 1.0F);
									local3.glTranslatef((float) -local61 / local35, (float) -local39 / local35, 1.0F);
									local3.glMatrixMode(5888);
									this.aClass216ArrayArray1[local61][local39].method5914();
									continue label132;
								}
							}
						}
					}
				}
			}
		} else {
			for (local39 = 0; local39 < this.anInt3581; local39++) {
				local52 = local39 << this.anInt3584;
				local59 = local39 + 1 << this.anInt3584;
				for (local61 = 0; local61 < this.anInt3583; local61++) {
					local74 = 0;
					local81 = local61 << this.anInt3584;
					local83 = local61 + 1 << this.anInt3584;
					@Pc(231) Class14_Sub4 local231 = Static163.aClass14_Sub4_6;
					local231.anInt2637 = 0;
					for (@Pc(236) int local236 = local52; local236 < local59; local236++) {
						if (-arg2 <= local236 - arg3 && local236 - arg3 <= arg2) {
							@Pc(269) int local269 = this.aClass114_Sub1_2.anInt3871 * local236 + local81;
							for (@Pc(271) int local271 = local81; local271 < local83; local271++) {
								if (local271 - arg0 >= -arg2 && arg2 >= local271 - arg0 && arg4[arg2 + local271 - arg0][arg2 + local236 - arg3]) {
									@Pc(321) short[] local321 = this.aClass114_Sub1_2.aShortArrayArray4[local269];
									if (local321 != null) {
										@Pc(330) int local330;
										if (this.aClass46_Sub2_23.aBoolean397) {
											for (local330 = 0; local330 < local321.length; local330++) {
												local231.method2509(local321[local330] & 0xFFFF);
												local74++;
											}
										} else {
											for (local330 = 0; local330 < local321.length; local330++) {
												local231.method2545(local321[local330] & 0xFFFF);
												local74++;
											}
										}
									}
								}
								local269++;
							}
						}
					}
					if (local74 > 0) {
						local3.glMatrixMode(5890);
						local3.glLoadIdentity();
						local3.glScalef(local35, local35, 1.0F);
						local3.glTranslatef((float) -local61 / local35, (float) -local39 / local35, 1.0F);
						local3.glMatrixMode(5888);
						this.aClass216ArrayArray1[local61][local39].method5916(local231.aByteArray74, local74);
					}
				}
			}
		}
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!as;IIZ)V")
	public void method3384(@OriginalArg(0) Class14_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class14_Sub2_Sub2_Sub1 local2 = (Class14_Sub2_Sub2_Sub1) arg0;
		arg2 += local2.anInt6074 + 1;
		arg1 += local2.anInt6075 + 1;
		@Pc(23) int local23 = this.anInt3582 * arg2 + arg1;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt6073;
		@Pc(31) int local31 = local2.anInt6072;
		@Pc(37) int local37 = this.anInt3582 - local31;
		@Pc(47) int local47;
		if (arg2 <= 0) {
			local47 = 1 - arg2;
			local25 = local47 * local31;
			arg2 = 1;
			local23 += local47 * this.anInt3582;
			local28 -= local47;
		}
		@Pc(68) int local68 = 0;
		if (local28 + arg2 >= this.anInt3580) {
			local47 = arg2 + local28 + 1 - this.anInt3580;
			local28 -= local47;
		}
		if (arg1 <= 0) {
			local47 = 1 - arg1;
			local37 += local47;
			local68 = local47;
			local25 += local47;
			local31 -= local47;
			local23 += local47;
			arg1 = 1;
		}
		if (local31 + arg1 >= this.anInt3582) {
			local47 = local31 + arg1 + 1 - this.anInt3582;
			local68 += local47;
			local37 += local47;
			local31 -= local47;
		}
		if (local31 > 0 && local28 > 0) {
			Static361.method3388(local23, this.aByteArray99, local25, local28, local31, local37, local2.aByteArray191, local68);
			this.method3385(arg2, arg1, local28, local31);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BIIII)V")
	private void method3385(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass216ArrayArray1 == null) {
			return;
		}
		@Pc(10) int local10 = arg1 - 1 >> 7;
		@Pc(21) int local21 = arg1 + arg3 - 1 - 1 >> 7;
		@Pc(27) int local27 = arg0 - 1 >> 7;
		@Pc(44) int local44 = arg0 + arg2 - 1 - 1 >> 7;
		for (@Pc(46) int local46 = local10; local46 <= local21; local46++) {
			@Pc(54) Class216[] local54 = this.aClass216ArrayArray1[local46];
			for (@Pc(56) int local56 = local27; local56 <= local44; local56++) {
				local54[local56].aBoolean443 = true;
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!as;III)Z")
	public boolean method3386(@OriginalArg(0) Class14_Sub2_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class14_Sub2_Sub2_Sub1 local2 = (Class14_Sub2_Sub2_Sub1) arg0;
		arg2 += local2.anInt6075 + 1;
		arg1 += local2.anInt6074 + 1;
		@Pc(23) int local23 = this.anInt3582 * arg1 + arg2;
		@Pc(26) int local26 = local2.anInt6073;
		@Pc(29) int local29 = local2.anInt6072;
		@Pc(40) int local40;
		if (arg1 <= 0) {
			local40 = 1 - arg1;
			local26 -= local40;
			local23 += this.anInt3582 * local40;
			arg1 = 1;
		}
		@Pc(59) int local59 = this.anInt3582 - local29;
		if (this.anInt3580 <= local26 + arg1) {
			local40 = local26 + arg1 + 1 - this.anInt3580;
			local26 -= local40;
		}
		if (arg2 <= 0) {
			local40 = 1 - arg2;
			local59 += local40;
			local23 += local40;
			arg2 = 1;
			local29 -= local40;
		}
		if (this.anInt3582 <= local29 + arg2) {
			local40 = arg2 + local29 + 1 - this.anInt3582;
			local29 -= local40;
			local59 += local40;
		}
		if (local29 > 0 && local26 > 0) {
			local59 += this.anInt3582 * 7;
			return Static361.method3383(local59, local23, this.aByteArray99, local29, local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	public void method3387() {
		this.aClass216ArrayArray1 = new Class216[this.anInt3583][this.anInt3581];
		for (@Pc(8) int local8 = 0; local8 < this.anInt3581; local8++) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt3583; local14++) {
				this.aClass216ArrayArray1[local14][local8] = new Class216(this.aClass46_Sub2_23, this, this.aClass114_Sub1_2, local14, local8, this.anInt3584, local14 * 128 + 1, local8 * 128 - -1);
			}
		}
	}
}
