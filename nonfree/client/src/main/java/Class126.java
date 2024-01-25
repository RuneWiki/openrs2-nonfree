import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class126 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "[[Lclient!np;")
	private Class143[][] aClass143ArrayArray1;

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "Lclient!mm;")
	private final Class55_Sub1 aClass55_Sub1_29;

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "Lclient!eb;")
	private final Class51_Sub1 aClass51_Sub1_1;

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
	public final int anInt3693;

	@OriginalMember(owner = "client!lo", name = "i", descriptor = "I")
	private final int anInt3696;

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "I")
	private final int anInt3695;

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "[B")
	public final byte[] aByteArray53;

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
	private final int anInt3694;

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
	private final int anInt3692;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!mm;Lclient!eb;)V")
	public Class126(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) Class51_Sub1 arg1) {
		this.aClass55_Sub1_29 = arg0;
		this.aClass51_Sub1_1 = arg1;
		this.anInt3693 = (this.aClass51_Sub1_1.anInt1963 * this.aClass51_Sub1_1.anInt1186 >> this.aClass55_Sub1_29.anInt3991) + 2;
		this.anInt3696 = (this.aClass51_Sub1_1.anInt1961 * this.aClass51_Sub1_1.anInt1186 >> this.aClass55_Sub1_29.anInt3991) + 2;
		this.anInt3695 = this.aClass55_Sub1_29.anInt3991 + 7 - this.aClass51_Sub1_1.anInt1185;
		this.aByteArray53 = new byte[this.anInt3696 * this.anInt3693];
		this.anInt3694 = this.aClass51_Sub1_1.anInt1963 >> this.anInt3695;
		this.anInt3692 = this.aClass51_Sub1_1.anInt1961 >> this.anInt3695;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!lb;ZI)V")
	public void method3338(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1_Sub10 arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class5_Sub1_Sub10_Sub1 local2 = (Class5_Sub1_Sub10_Sub1) arg1;
		arg0 += local2.anInt2814 + 1;
		arg2 += local2.anInt2816 + 1;
		@Pc(24) int local24 = arg2 + arg0 * this.anInt3693;
		@Pc(26) int local26 = 0;
		@Pc(29) int local29 = local2.anInt2817;
		@Pc(32) int local32 = local2.anInt2815;
		@Pc(38) int local38 = this.anInt3693 - local32;
		@Pc(49) int local49;
		if (arg0 <= 0) {
			local49 = 1 - arg0;
			local26 = local49 * local32;
			local24 += local49 * this.anInt3693;
			local29 -= local49;
			arg0 = 1;
		}
		@Pc(70) int local70 = 0;
		if (this.anInt3696 <= local29 + arg0) {
			local49 = arg0 + local29 + 1 - this.anInt3696;
			local29 -= local49;
		}
		if (arg2 <= 0) {
			local49 = 1 - arg2;
			local38 += local49;
			arg2 = 1;
			local26 += local49;
			local24 += local49;
			local32 -= local49;
			local70 = local49;
		}
		if (this.anInt3693 <= arg2 + local32) {
			local49 = arg2 + local32 + 1 - this.anInt3693;
			local32 -= local49;
			local70 += local49;
			local38 += local49;
		}
		if (local32 > 0 && local29 > 0) {
			Static364.method3337(local70, local26, local29, local2.aByteArray36, this.aByteArray53, local38, local32, local24);
			this.method3343(local32, arg0, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!lb;II)Z")
	public boolean method3339(@OriginalArg(1) Class5_Sub1_Sub10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class5_Sub1_Sub10_Sub1 local2 = (Class5_Sub1_Sub10_Sub1) arg0;
		arg2 += local2.anInt2816 + 1;
		arg1 += local2.anInt2814 + 1;
		@Pc(23) int local23 = arg2 + arg1 * this.anInt3693;
		@Pc(32) int local32 = local2.anInt2817;
		@Pc(35) int local35 = local2.anInt2815;
		@Pc(41) int local41 = this.anInt3693 - local35;
		@Pc(50) int local50;
		if (arg1 <= 0) {
			local50 = 1 - arg1;
			arg1 = 1;
			local32 -= local50;
			local23 += local50 * this.anInt3693;
		}
		if (this.anInt3696 <= arg1 + local32) {
			local50 = arg1 + local32 + 1 - this.anInt3696;
			local32 -= local50;
		}
		if (arg2 <= 0) {
			local50 = 1 - arg2;
			local41 += local50;
			local23 += local50;
			local35 -= local50;
			arg2 = 1;
		}
		if (this.anInt3693 <= arg2 + local35) {
			local50 = arg2 + local35 + 1 - this.anInt3693;
			local35 -= local50;
			local41 += local50;
		}
		if (local35 > 0 && local32 > 0) {
			local41 += this.anInt3693 * 7;
			return Static364.method3341(this.aByteArray53, local35, local23, local32, local41);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILclient!lb;B)V")
	public void method3340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub1_Sub10 arg2) {
		@Pc(2) Class5_Sub1_Sub10_Sub1 local2 = (Class5_Sub1_Sub10_Sub1) arg2;
		arg0 += local2.anInt2816 + 1;
		arg1 += local2.anInt2814 + 1;
		@Pc(23) int local23 = this.anInt3693 * arg1 + arg0;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt2817;
		@Pc(31) int local31 = local2.anInt2815;
		@Pc(37) int local37 = this.anInt3693 - local31;
		@Pc(48) int local48;
		if (arg1 <= 0) {
			local48 = 1 - arg1;
			local25 = local48 * local31;
			arg1 = 1;
			local28 -= local48;
			local23 += this.anInt3693 * local48;
		}
		@Pc(69) int local69 = 0;
		if (arg1 + local28 >= this.anInt3696) {
			local48 = local28 + arg1 + 1 - this.anInt3696;
			local28 -= local48;
		}
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			local31 -= local48;
			local69 = local48;
			local23 += local48;
			local25 += local48;
			arg0 = 1;
			local37 += local48;
		}
		if (this.anInt3693 <= local31 + arg0) {
			local48 = arg0 + local31 + 1 - this.anInt3693;
			local31 -= local48;
			local37 += local48;
			local69 += local48;
		}
		if (local31 > 0 && local28 > 0) {
			Static364.method3342(this.aByteArray53, local25, local31, local2.aByteArray36, local23, local37, local69, local28);
			this.method3343(local31, arg1, local28, arg0);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIII)V")
	private void method3343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass143ArrayArray1 == null) {
			return;
		}
		@Pc(11) int local11 = arg3 - 1 >> 7;
		@Pc(21) int local21 = arg0 + arg3 - 1 - 1 >> 7;
		@Pc(27) int local27 = arg1 - 1 >> 7;
		@Pc(45) int local45 = arg2 + arg1 - 1 - 1 >> 7;
		for (@Pc(47) int local47 = local11; local47 <= local21; local47++) {
			@Pc(59) Class143[] local59 = this.aClass143ArrayArray1[local47];
			for (@Pc(61) int local61 = local27; local61 <= local45; local61++) {
				local59[local61].aBoolean354 = true;
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
	public void method3344() {
		this.aClass143ArrayArray1 = new Class143[this.anInt3694][this.anInt3692];
		for (@Pc(8) int local8 = 0; local8 < this.anInt3692; local8++) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt3694; local14++) {
				this.aClass143ArrayArray1[local14][local8] = new Class143(this.aClass55_Sub1_29, this, this.aClass51_Sub1_1, local14, local8, this.anInt3695, local14 * 128 + 1, local8 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIZII[[Z)V")
	public void method3345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean[][] arg4) {
		@Pc(3) opengl local3 = this.aClass55_Sub1_29.anOpengl1;
		this.aClass55_Sub1_29.method3650();
		this.aClass55_Sub1_29.method3695(false);
		this.aClass55_Sub1_29.method3671(false);
		this.aClass55_Sub1_29.method3666();
		this.aClass55_Sub1_29.method3655(0);
		this.aClass55_Sub1_29.method3692(1);
		@Pc(45) float local45 = 1.0F / (float) (this.aClass55_Sub1_29.anInt3995 * 128);
		@Pc(49) int local49;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(67) int local67;
		@Pc(80) int local80;
		@Pc(87) int local87;
		@Pc(89) int local89;
		if (arg2) {
			for (local49 = 0; local49 < this.anInt3692; local49++) {
				local58 = local49 << this.anInt3695;
				local65 = local49 + 1 << this.anInt3695;
				label131: for (local67 = 0; local67 < this.anInt3694; local67++) {
					local80 = local67 << this.anInt3695;
					local87 = local67 + 1 << this.anInt3695;
					for (local89 = local80; local89 < local87; local89++) {
						if (-arg0 <= local89 - arg1 && arg0 >= local89 - arg1) {
							for (@Pc(111) int local111 = local58; local111 < local65; local111++) {
								if (-arg0 <= local111 - arg3 && local111 - arg3 <= arg0 && arg4[arg0 + local89 - arg1][local111 + arg0 - arg3]) {
									local3.glMatrixMode(5890);
									local3.glLoadIdentity();
									local3.glScalef(local45, local45, 1.0F);
									local3.glTranslatef((float) -local67 / local45, (float) -local49 / local45, 1.0F);
									local3.glMatrixMode(5888);
									this.aClass143ArrayArray1[local67][local49].method4005();
									continue label131;
								}
							}
						}
					}
				}
			}
		} else {
			for (local49 = 0; local49 < this.anInt3692; local49++) {
				local58 = local49 << this.anInt3695;
				local65 = local49 + 1 << this.anInt3695;
				for (local67 = 0; local67 < this.anInt3694; local67++) {
					local80 = 0;
					local87 = local67 << this.anInt3695;
					local89 = local67 + 1 << this.anInt3695;
					@Pc(238) Class5_Sub12 local238 = Static67.aClass5_Sub12_1;
					local238.anInt5731 = 0;
					for (@Pc(243) int local243 = local58; local243 < local65; local243++) {
						if (local243 - arg3 >= -arg0 && local243 - arg3 <= arg0) {
							@Pc(267) int local267 = local87 + local243 * this.aClass51_Sub1_1.anInt1963;
							for (@Pc(269) int local269 = local87; local269 < local89; local269++) {
								if (-arg0 <= local269 - arg1 && local269 - arg1 <= arg0 && arg4[local269 + arg0 - arg1][local243 + arg0 - arg3]) {
									@Pc(311) short[] local311 = this.aClass51_Sub1_1.aShortArrayArray2[local267];
									if (local311 != null) {
										@Pc(320) int local320;
										if (this.aClass55_Sub1_29.aBoolean308) {
											for (local320 = 0; local320 < local311.length; local320++) {
												local80++;
												local238.method5084(local311[local320] & 0xFFFF);
											}
										} else {
											for (local320 = 0; local320 < local311.length; local320++) {
												local238.method5080(local311[local320] & 0xFFFF);
												local80++;
											}
										}
									}
								}
								local267++;
							}
						}
					}
					if (local80 > 0) {
						local3.glMatrixMode(5890);
						local3.glLoadIdentity();
						local3.glScalef(local45, local45, 1.0F);
						local3.glTranslatef((float) -local67 / local45, (float) -local49 / local45, 1.0F);
						local3.glMatrixMode(5888);
						this.aClass143ArrayArray1[local67][local49].method4004(local80, local238.aByteArray90);
					}
				}
			}
		}
		local3.glMatrixMode(5890);
		local3.glLoadIdentity();
		local3.glMatrixMode(5888);
	}
}
