import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class236 {

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "[[Lclient!pk;")
	private Class181[][] aClass181ArrayArray1;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "Lclient!ic;")
	private final Class48_Sub2 aClass48_Sub2_37;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "Lclient!to;")
	private final Class149_Sub1 aClass149_Sub1_3;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
	public final int anInt6609;

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
	private final int anInt6607;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	private final int anInt6608;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "[B")
	public final byte[] aByteArray99;

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
	private final int anInt6611;

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
	private final int anInt6610;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!ic;Lclient!to;)V")
	public Class236(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) Class149_Sub1 arg1) {
		this.aClass48_Sub2_37 = arg0;
		this.aClass149_Sub1_3 = arg1;
		this.anInt6609 = (this.aClass149_Sub1_3.anInt6741 * this.aClass149_Sub1_3.anInt6299 >> this.aClass48_Sub2_37.anInt3051) + 2;
		this.anInt6607 = (this.aClass149_Sub1_3.anInt6299 * this.aClass149_Sub1_3.anInt6740 >> this.aClass48_Sub2_37.anInt3051) + 2;
		this.anInt6608 = this.aClass48_Sub2_37.anInt3051 + 7 - this.aClass149_Sub1_3.anInt6297;
		this.aByteArray99 = new byte[this.anInt6607 * this.anInt6609];
		this.anInt6611 = this.aClass149_Sub1_3.anInt6741 >> this.anInt6608;
		this.anInt6610 = this.aClass149_Sub1_3.anInt6740 >> this.anInt6608;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
	public void method5696() {
		this.aClass181ArrayArray1 = new Class181[this.anInt6611][this.anInt6610];
		for (@Pc(18) int local18 = 0; local18 < this.anInt6610; local18++) {
			for (@Pc(28) int local28 = 0; local28 < this.anInt6611; local28++) {
				this.aClass181ArrayArray1[local28][local18] = new Class181(this.aClass48_Sub2_37, this, this.aClass149_Sub1_3, local28, local18, this.anInt6608, local28 * 128 + 1, local18 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBLclient!ph;I)V")
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub7_Sub11 arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class2_Sub7_Sub11_Sub1 local2 = (Class2_Sub7_Sub11_Sub1) arg1;
		arg2 += local2.anInt3861 + 1;
		arg0 += local2.anInt3860 + 1;
		@Pc(23) int local23 = arg0 + this.anInt6609 * arg2;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt3859;
		@Pc(44) int local44 = local2.anInt3858;
		@Pc(49) int local49 = this.anInt6609 - local44;
		@Pc(56) int local56;
		if (arg2 <= 0) {
			local56 = 1 - arg2;
			arg2 = 1;
			local23 += local56 * this.anInt6609;
			local28 -= local56;
			local25 = local44 * local56;
		}
		@Pc(77) int local77 = 0;
		if (local28 + arg2 >= this.anInt6607) {
			local56 = arg2 + local28 + 1 - this.anInt6607;
			local28 -= local56;
		}
		if (arg0 <= 0) {
			local56 = 1 - arg0;
			local49 += local56;
			local23 += local56;
			arg0 = 1;
			local25 += local56;
			local44 -= local56;
			local77 = local56;
		}
		if (this.anInt6609 <= arg0 + local44) {
			local56 = arg0 + local44 + 1 - this.anInt6609;
			local49 += local56;
			local44 -= local56;
			local77 += local56;
		}
		if (local44 > 0 && local28 > 0) {
			Static404.method5698(local2.aByteArray44, local28, local49, local23, local44, local77, this.aByteArray99, local25);
			this.method5703(local28, arg2, local44, arg0);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I[[ZZIII)V")
	public void method5699(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) opengl local11 = this.aClass48_Sub2_37.anOpengl2;
		this.aClass48_Sub2_37.method2615();
		this.aClass48_Sub2_37.method2558(false);
		this.aClass48_Sub2_37.method2603(false);
		this.aClass48_Sub2_37.method2589();
		this.aClass48_Sub2_37.method2609(0);
		this.aClass48_Sub2_37.method2569(1);
		@Pc(43) float local43 = 1.0F / (float) (this.aClass48_Sub2_37.anInt3045 * 128);
		@Pc(47) int local47;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(69) int local69;
		@Pc(82) int local82;
		@Pc(89) int local89;
		@Pc(91) int local91;
		if (arg2) {
			for (local47 = 0; local47 < this.anInt6610; local47++) {
				local60 = local47 << this.anInt6608;
				local67 = local47 + 1 << this.anInt6608;
				label132: for (local69 = 0; local69 < this.anInt6611; local69++) {
					local82 = local69 << this.anInt6608;
					local89 = local69 + 1 << this.anInt6608;
					for (local91 = local82; local91 < local89; local91++) {
						if (-arg3 <= local91 - arg4 && local91 - arg4 <= arg3) {
							for (@Pc(122) int local122 = local60; local122 < local67; local122++) {
								if (-arg3 <= local122 - arg0 && arg3 >= local122 - arg0 && arg1[local91 + arg3 - arg4][arg3 + local122 - arg0]) {
									local11.glMatrixMode(5890);
									local11.glLoadIdentity();
									local11.glScalef(local43, local43, 1.0F);
									local11.glTranslatef((float) -local69 / local43, (float) -local47 / local43, 1.0F);
									local11.glMatrixMode(5888);
									this.aClass181ArrayArray1[local69][local47].method4527();
									continue label132;
								}
							}
						}
					}
				}
			}
		} else {
			for (local47 = 0; local47 < this.anInt6610; local47++) {
				local60 = local47 << this.anInt6608;
				local67 = local47 + 1 << this.anInt6608;
				for (local69 = 0; local69 < this.anInt6611; local69++) {
					local82 = 0;
					local89 = local69 << this.anInt6608;
					local91 = local69 + 1 << this.anInt6608;
					@Pc(255) Class2_Sub24 local255 = Static341.aClass2_Sub24_5;
					local255.anInt6669 = 0;
					for (@Pc(260) int local260 = local60; local260 < local67; local260++) {
						if (local260 - arg0 >= -arg3 && local260 - arg0 <= arg3) {
							@Pc(292) int local292 = local89 + this.aClass149_Sub1_3.anInt6741 * local260;
							for (@Pc(294) int local294 = local89; local294 < local91; local294++) {
								if (-arg3 <= local294 - arg4 && local294 - arg4 <= arg3 && arg1[arg3 + local294 - arg4][arg3 + local260 - arg0]) {
									@Pc(336) short[] local336 = this.aClass149_Sub1_3.aShortArrayArray26[local292];
									if (local336 != null) {
										@Pc(344) int local344;
										if (this.aClass48_Sub2_37.aBoolean218) {
											for (local344 = 0; local344 < local336.length; local344++) {
												local255.method5721(local336[local344] & 0xFFFF);
												local82++;
											}
										} else {
											for (local344 = 0; local344 < local336.length; local344++) {
												local255.method5717(local336[local344] & 0xFFFF);
												local82++;
											}
										}
									}
								}
								local292++;
							}
						}
					}
					if (local82 > 0) {
						local11.glMatrixMode(5890);
						local11.glLoadIdentity();
						local11.glScalef(local43, local43, 1.0F);
						local11.glTranslatef((float) -local69 / local43, (float) -local47 / local43, 1.0F);
						local11.glMatrixMode(5888);
						this.aClass181ArrayArray1[local69][local47].method4526(local255.aByteArray100, local82);
					}
				}
			}
		}
		local11.glMatrixMode(5890);
		local11.glLoadIdentity();
		local11.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIILclient!ph;)Z")
	public boolean method5700(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub7_Sub11 arg2) {
		@Pc(2) Class2_Sub7_Sub11_Sub1 local2 = (Class2_Sub7_Sub11_Sub1) arg2;
		arg1 += local2.anInt3861 + 1;
		arg0 += local2.anInt3860 + 1;
		@Pc(23) int local23 = arg0 + arg1 * this.anInt6609;
		@Pc(26) int local26 = local2.anInt3859;
		@Pc(29) int local29 = local2.anInt3858;
		@Pc(35) int local35 = this.anInt6609 - local29;
		@Pc(44) int local44;
		if (arg1 <= 0) {
			local44 = 1 - arg1;
			local23 += local44 * this.anInt6609;
			local26 -= local44;
			arg1 = 1;
		}
		if (this.anInt6607 <= arg1 + local26) {
			local44 = local26 + arg1 + 1 - this.anInt6607;
			local26 -= local44;
		}
		if (arg0 <= 0) {
			local44 = 1 - arg0;
			arg0 = 1;
			local29 -= local44;
			local35 += local44;
			local23 += local44;
		}
		if (arg0 + local29 >= this.anInt6609) {
			local44 = local29 + arg0 + 1 - this.anInt6609;
			local29 -= local44;
			local35 += local44;
		}
		if (local29 > 0 && local26 > 0) {
			local35 += this.anInt6609 * 7;
			return Static404.method5702(local23, local29, local26, this.aByteArray99, local35);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIII)V")
	private void method5703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass181ArrayArray1 == null) {
			return;
		}
		@Pc(17) int local17 = arg3 - 1 >> 7;
		@Pc(25) int local25 = arg2 + arg3 - 2 >> 7;
		@Pc(31) int local31 = arg1 - 1 >> 7;
		@Pc(41) int local41 = arg0 + arg1 - 1 - 1 >> 7;
		for (@Pc(43) int local43 = local17; local43 <= local25; local43++) {
			@Pc(55) Class181[] local55 = this.aClass181ArrayArray1[local43];
			for (@Pc(57) int local57 = local31; local57 <= local41; local57++) {
				local55[local57].aBoolean371 = true;
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(IIILclient!ph;)V")
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub7_Sub11 arg2) {
		@Pc(2) Class2_Sub7_Sub11_Sub1 local2 = (Class2_Sub7_Sub11_Sub1) arg2;
		arg0 += local2.anInt3860 + 1;
		arg1 += local2.anInt3861 + 1;
		@Pc(23) int local23 = arg0 + arg1 * this.anInt6609;
		@Pc(38) int local38 = 0;
		@Pc(41) int local41 = local2.anInt3859;
		@Pc(44) int local44 = local2.anInt3858;
		@Pc(50) int local50 = this.anInt6609 - local44;
		@Pc(60) int local60;
		if (arg1 <= 0) {
			local60 = 1 - arg1;
			local38 = local60 * local44;
			local23 += this.anInt6609 * local60;
			local41 -= local60;
			arg1 = 1;
		}
		@Pc(81) int local81 = 0;
		if (arg1 + local41 >= this.anInt6607) {
			local60 = arg1 + local41 + 1 - this.anInt6607;
			local41 -= local60;
		}
		if (arg0 <= 0) {
			local60 = 1 - arg0;
			local38 += local60;
			local50 += local60;
			local81 = local60;
			local44 -= local60;
			arg0 = 1;
			local23 += local60;
		}
		if (this.anInt6609 <= local44 + arg0) {
			local60 = arg0 + local44 + 1 - this.anInt6609;
			local44 -= local60;
			local50 += local60;
			local81 += local60;
		}
		if (local44 > 0 && local41 > 0) {
			Static404.method5701(local2.aByteArray44, local81, local38, local23, this.aByteArray99, local44, local41, local50);
			this.method5703(local41, arg1, local44, arg0);
		}
	}
}
