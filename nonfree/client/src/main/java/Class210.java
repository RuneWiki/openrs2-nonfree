import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lea")
public final class Class210 {

	@OriginalMember(owner = "client!lea", name = "g", descriptor = "[[Lclient!pv;")
	private Class278[][] aClass278ArrayArray1;

	@OriginalMember(owner = "client!lea", name = "f", descriptor = "Lclient!qfa;")
	private final Class137_Sub3 aClass137_Sub3_21;

	@OriginalMember(owner = "client!lea", name = "m", descriptor = "Lclient!re;")
	private final Class51_Sub3 aClass51_Sub3_1;

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "I")
	public final int anInt6186;

	@OriginalMember(owner = "client!lea", name = "o", descriptor = "I")
	private final int anInt6196;

	@OriginalMember(owner = "client!lea", name = "q", descriptor = "[B")
	public final byte[] aByteArray73;

	@OriginalMember(owner = "client!lea", name = "e", descriptor = "I")
	private final int anInt6189;

	@OriginalMember(owner = "client!lea", name = "p", descriptor = "I")
	private final int anInt6197;

	@OriginalMember(owner = "client!lea", name = "r", descriptor = "I")
	private final int anInt6198;

	@OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Lclient!qfa;Lclient!re;)V")
	public Class210(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) Class51_Sub3 arg1) {
		this.aClass137_Sub3_21 = arg0;
		this.aClass51_Sub3_1 = arg1;
		this.anInt6186 = (this.aClass51_Sub3_1.anInt9511 * this.aClass51_Sub3_1.anInt9506 >> this.aClass137_Sub3_21.anInt8545) + 2;
		this.anInt6196 = (this.aClass51_Sub3_1.anInt9506 * this.aClass51_Sub3_1.anInt9512 >> this.aClass137_Sub3_21.anInt8545) + 2;
		this.aByteArray73 = new byte[this.anInt6196 * this.anInt6186];
		this.anInt6189 = this.aClass137_Sub3_21.anInt8545 + 7 - this.aClass51_Sub3_1.anInt9507;
		this.anInt6197 = this.aClass51_Sub3_1.anInt9511 >> this.anInt6189;
		this.anInt6198 = this.aClass51_Sub3_1.anInt9512 >> this.anInt6189;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)V")
	public void method5127() {
		this.aClass278ArrayArray1 = new Class278[this.anInt6197][this.anInt6198];
		for (@Pc(14) int local14 = 0; local14 < this.anInt6198; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt6197; local18++) {
				this.aClass278ArrayArray1[local18][local14] = new Class278(this.aClass137_Sub3_21, this, this.aClass51_Sub3_1, local18, local14, this.anInt6189, local18 * 128 + 1, local14 * 128 - -1);
			}
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIII)V")
	private void method5128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass278ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg1 - 1 >> 7;
		@Pc(25) int local25 = arg3 + arg1 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg0 - 1 >> 7;
		@Pc(41) int local41 = arg2 + arg0 - 1 - 1 >> 7;
		for (@Pc(43) int local43 = local15; local43 <= local25; local43++) {
			@Pc(50) Class278[] local50 = this.aClass278ArrayArray1[local43];
			for (@Pc(52) int local52 = local31; local52 <= local41; local52++) {
				local50[local52].aBoolean570 = true;
			}
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IZILclient!r;)V")
	public void method5129(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class14_Sub3_Sub14 arg2) {
		@Pc(6) Class14_Sub3_Sub14_Sub2 local6 = (Class14_Sub3_Sub14_Sub2) arg2;
		arg1 += local6.anInt10449 + 1;
		arg0 += local6.anInt10448 + 1;
		@Pc(27) int local27 = this.anInt6186 * arg0 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt10453;
		@Pc(39) int local39 = local6.anInt10455;
		@Pc(45) int local45 = this.anInt6186 - local39;
		@Pc(55) int local55;
		if (arg0 <= 0) {
			local55 = 1 - arg0;
			local32 -= local55;
			arg0 = 1;
			local29 = local55 * local39;
			local27 += this.anInt6186 * local55;
		}
		@Pc(76) int local76 = 0;
		if (local32 + arg0 >= this.anInt6196) {
			local55 = arg0 + local32 + 1 - this.anInt6196;
			local32 -= local55;
		}
		if (arg1 <= 0) {
			local55 = 1 - arg1;
			local27 += local55;
			local29 += local55;
			local39 -= local55;
			local45 += local55;
			local76 = local55;
			arg1 = 1;
		}
		if (local39 + arg1 >= this.anInt6186) {
			local55 = local39 + arg1 + 1 - this.anInt6186;
			local45 += local55;
			local76 += local55;
			local39 -= local55;
		}
		if (local39 > 0 && local32 > 0) {
			Static413.method1528(local45, local27, this.aByteArray73, local6.aByteArray131, local76, local29, local32, local39);
			this.method5128(arg0, arg1, local32, local39);
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILclient!r;II)Z")
	public boolean method5130(@OriginalArg(1) Class14_Sub3_Sub14 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class14_Sub3_Sub14_Sub2 local12 = (Class14_Sub3_Sub14_Sub2) arg0;
		arg2 += local12.anInt10449 + 1;
		arg1 += local12.anInt10448 + 1;
		@Pc(34) int local34 = arg2 + arg1 * this.anInt6186;
		@Pc(37) int local37 = local12.anInt10453;
		@Pc(40) int local40 = local12.anInt10455;
		@Pc(47) int local47;
		if (arg1 <= 0) {
			local47 = 1 - arg1;
			local37 -= local47;
			arg1 = 1;
			local34 += this.anInt6186 * local47;
		}
		@Pc(65) int local65 = this.anInt6186 - local40;
		if (this.anInt6196 <= arg1 + local37) {
			local47 = arg1 + local37 + 1 - this.anInt6196;
			local37 -= local47;
		}
		if (arg2 <= 0) {
			local47 = 1 - arg2;
			local40 -= local47;
			local65 += local47;
			arg2 = 1;
			local34 += local47;
		}
		if (arg2 + local40 >= this.anInt6186) {
			local47 = arg2 + local40 + 1 - this.anInt6186;
			local65 += local47;
			local40 -= local47;
		}
		if (local40 > 0 && local37 > 0) {
			local65 += this.anInt6186 * 7;
			return Static243.method3624(local40, local65, local37, this.aByteArray73, local34);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "([[ZIIBZI)V")
	public void method5131(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		this.aClass137_Sub3_21.method7038(false);
		this.aClass137_Sub3_21.method7073(false);
		this.aClass137_Sub3_21.method7029(-2);
		this.aClass137_Sub3_21.method7077(1);
		this.aClass137_Sub3_21.method7082(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass137_Sub3_21.anInt8546 * 128);
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(73) int local73;
		@Pc(75) int local75;
		if (arg3) {
			for (local43 = 0; local43 < this.anInt6198; local43++) {
				local50 = local43 << this.anInt6189;
				local57 = local43 + 1 << this.anInt6189;
				label128: for (local59 = 0; local59 < this.anInt6197; local59++) {
					local66 = local59 << this.anInt6189;
					local73 = local59 + 1 << this.anInt6189;
					for (local75 = local66; local75 < local73; local75++) {
						if (-arg4 <= local75 - arg2 && arg4 >= local75 - arg2) {
							for (@Pc(95) int local95 = local50; local95 < local57; local95++) {
								if (local95 - arg1 >= -arg4 && arg4 >= local95 - arg1 && arg0[arg4 + local75 - arg2][arg4 + local95 - arg1]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local39, local39, 1.0F);
									OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass278ArrayArray1[local59][local43].method6833();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local43 = 0; local43 < this.anInt6198; local43++) {
				local50 = local43 << this.anInt6189;
				local57 = local43 + 1 << this.anInt6189;
				for (local59 = 0; local59 < this.anInt6197; local59++) {
					local66 = 0;
					local73 = local59 << this.anInt6189;
					local75 = local59 + 1 << this.anInt6189;
					@Pc(230) Class14_Sub29_Sub2 local230 = this.aClass137_Sub3_21.aClass14_Sub29_Sub2_2;
					local230.anInt7264 = 0;
					for (@Pc(235) int local235 = local50; local235 < local57; local235++) {
						if (local235 - arg1 >= -arg4 && local235 - arg1 <= arg4) {
							@Pc(261) int local261 = local73 + this.aClass51_Sub3_1.anInt9511 * local235;
							for (@Pc(263) int local263 = local73; local263 < local75; local263++) {
								if (local263 - arg2 >= -arg4 && arg4 >= local263 - arg2 && arg0[local263 + arg4 - arg2][arg4 + local235 - arg1]) {
									@Pc(299) short[] local299 = this.aClass51_Sub3_1.aShortArrayArray17[local261];
									if (local299 != null) {
										@Pc(307) int local307;
										if (this.aClass137_Sub3_21.aBoolean594) {
											for (local307 = 0; local307 < local299.length; local307++) {
												local66++;
												local230.method5859(local299[local307] & 0xFFFF);
											}
										} else {
											for (local307 = 0; local307 < local299.length; local307++) {
												local230.method5867(local299[local307] & 0xFFFF);
												local66++;
											}
										}
									}
								}
								local261++;
							}
						}
					}
					if (local66 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local39, local39, 1.0F);
						OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass278ArrayArray1[local59][local43].method6836(local66, local230.aByteArray84);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!r;III)V")
	public void method5132(@OriginalArg(0) Class14_Sub3_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class14_Sub3_Sub14_Sub2 local6 = (Class14_Sub3_Sub14_Sub2) arg0;
		arg2 += local6.anInt10448 + 1;
		arg1 += local6.anInt10449 + 1;
		@Pc(28) int local28 = arg1 + this.anInt6186 * arg2;
		@Pc(40) int local40 = 0;
		@Pc(43) int local43 = local6.anInt10453;
		@Pc(46) int local46 = local6.anInt10455;
		@Pc(52) int local52 = this.anInt6186 - local46;
		@Pc(54) int local54 = 0;
		@Pc(61) int local61;
		if (arg2 <= 0) {
			local61 = 1 - arg2;
			local40 = local61 * local46;
			local28 += this.anInt6186 * local61;
			local43 -= local61;
			arg2 = 1;
		}
		if (arg2 + local43 >= this.anInt6196) {
			local61 = local43 + arg2 + 1 - this.anInt6196;
			local43 -= local61;
		}
		if (arg1 <= 0) {
			local61 = 1 - arg1;
			local52 += local61;
			local46 -= local61;
			local40 += local61;
			arg1 = 1;
			local28 += local61;
			local54 = local61;
		}
		if (arg1 + local46 >= this.anInt6186) {
			local61 = local46 + arg1 + 1 - this.anInt6186;
			local54 += local61;
			local46 -= local61;
			local52 += local61;
		}
		if (local46 > 0 && local43 > 0) {
			Static18.method214(local6.aByteArray131, local52, local40, local28, this.aByteArray73, local54, local46, local43);
			this.method5128(arg2, arg1, local43, local46);
		}
	}
}
