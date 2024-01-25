import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pia")
public final class Class260 {

	@OriginalMember(owner = "client!pia", name = "c", descriptor = "[[Lclient!jr;")
	private Class181[][] aClass181ArrayArray1;

	@OriginalMember(owner = "client!pia", name = "h", descriptor = "Lclient!oea;")
	private final Class87_Sub2 aClass87_Sub2_28;

	@OriginalMember(owner = "client!pia", name = "k", descriptor = "Lclient!uea;")
	private final Class112_Sub3 aClass112_Sub3_3;

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "I")
	public final int anInt7739;

	@OriginalMember(owner = "client!pia", name = "o", descriptor = "I")
	private final int anInt7748;

	@OriginalMember(owner = "client!pia", name = "j", descriptor = "[B")
	public final byte[] aByteArray73;

	@OriginalMember(owner = "client!pia", name = "m", descriptor = "I")
	private final int anInt7746;

	@OriginalMember(owner = "client!pia", name = "g", descriptor = "I")
	private final int anInt7744;

	@OriginalMember(owner = "client!pia", name = "b", descriptor = "I")
	private final int anInt7740;

	@OriginalMember(owner = "client!pia", name = "<init>", descriptor = "(Lclient!oea;Lclient!uea;)V")
	public Class260(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) Class112_Sub3 arg1) {
		this.aClass87_Sub2_28 = arg0;
		this.aClass112_Sub3_3 = arg1;
		this.anInt7739 = (this.aClass112_Sub3_3.anInt9344 * this.aClass112_Sub3_3.anInt9348 >> this.aClass87_Sub2_28.anInt7367) + 2;
		this.anInt7748 = (this.aClass112_Sub3_3.anInt9340 * this.aClass112_Sub3_3.anInt9344 >> this.aClass87_Sub2_28.anInt7367) + 2;
		this.aByteArray73 = new byte[this.anInt7739 * this.anInt7748];
		this.anInt7746 = this.aClass87_Sub2_28.anInt7367 + 7 - this.aClass112_Sub3_3.anInt9341;
		this.anInt7744 = this.aClass112_Sub3_3.anInt9348 >> this.anInt7746;
		this.anInt7740 = this.aClass112_Sub3_3.anInt9340 >> this.anInt7746;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(Lclient!r;III)V")
	public void method6475(@OriginalArg(0) Class2_Sub5_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub5_Sub12_Sub2 local6 = (Class2_Sub5_Sub12_Sub2) arg0;
		arg1 += local6.anInt8815 + 1;
		arg2 += local6.anInt8819 + 1;
		@Pc(32) int local32 = arg2 + arg1 * this.anInt7739;
		@Pc(34) int local34 = 0;
		@Pc(37) int local37 = local6.anInt8817;
		@Pc(40) int local40 = local6.anInt8820;
		@Pc(46) int local46 = this.anInt7739 - local40;
		@Pc(56) int local56;
		if (arg1 <= 0) {
			local56 = 1 - arg1;
			local37 -= local56;
			arg1 = 1;
			local32 += this.anInt7739 * local56;
			local34 = local40 * local56;
		}
		@Pc(77) int local77 = 0;
		if (arg1 + local37 >= this.anInt7748) {
			local56 = local37 + arg1 + 1 - this.anInt7748;
			local37 -= local56;
		}
		if (arg2 <= 0) {
			local56 = 1 - arg2;
			local32 += local56;
			local40 -= local56;
			local77 = local56;
			arg2 = 1;
			local34 += local56;
			local46 += local56;
		}
		if (this.anInt7739 <= arg2 + local40) {
			local56 = local40 + arg2 + 1 - this.anInt7739;
			local77 += local56;
			local40 -= local56;
			local46 += local56;
		}
		if (local40 > 0 && local37 > 0) {
			Static307.method4719(local77, this.aByteArray73, local46, local32, local40, local34, local6.aByteArray90, local37);
			this.method6478(arg2, local40, arg1, local37);
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(Z)V")
	public void method6476() {
		this.aClass181ArrayArray1 = new Class181[this.anInt7744][this.anInt7740];
		for (@Pc(14) int local14 = 0; local14 < this.anInt7740; local14++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt7744; local24++) {
				this.aClass181ArrayArray1[local24][local14] = new Class181(this.aClass87_Sub2_28, this, this.aClass112_Sub3_3, local24, local14, this.anInt7746, local24 * 128 + 1, local14 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIIII)V")
	private void method6478(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass181ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg0 - 1 >> 7;
		@Pc(25) int local25 = arg1 + arg0 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg2 - 1 >> 7;
		@Pc(41) int local41 = arg3 + arg2 - 1 - 1 >> 7;
		for (@Pc(43) int local43 = local15; local43 <= local25; local43++) {
			@Pc(50) Class181[] local50 = this.aClass181ArrayArray1[local43];
			for (@Pc(52) int local52 = local31; local52 <= local41; local52++) {
				local50[local52].aBoolean408 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pia", name = "b", descriptor = "(Lclient!r;III)V")
	public void method6479(@OriginalArg(0) Class2_Sub5_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class2_Sub5_Sub12_Sub2 local6 = (Class2_Sub5_Sub12_Sub2) arg0;
		arg2 += local6.anInt8815 + 1;
		arg1 += local6.anInt8819 + 1;
		@Pc(28) int local28 = arg1 + this.anInt7739 * arg2;
		@Pc(30) int local30 = 0;
		@Pc(43) int local43 = local6.anInt8817;
		@Pc(46) int local46 = local6.anInt8820;
		@Pc(52) int local52 = this.anInt7739 - local46;
		@Pc(58) int local58;
		if (arg2 <= 0) {
			local58 = 1 - arg2;
			local30 = local58 * local46;
			local43 -= local58;
			arg2 = 1;
			local28 += local58 * this.anInt7739;
		}
		@Pc(79) int local79 = 0;
		if (arg2 + local43 >= this.anInt7748) {
			local58 = local43 + arg2 + 1 - this.anInt7748;
			local43 -= local58;
		}
		if (arg1 <= 0) {
			local58 = 1 - arg1;
			local52 += local58;
			local30 += local58;
			local79 = local58;
			local46 -= local58;
			local28 += local58;
			arg1 = 1;
		}
		if (this.anInt7739 <= local46 + arg1) {
			local58 = arg1 + local46 + 1 - this.anInt7739;
			local79 += local58;
			local52 += local58;
			local46 -= local58;
		}
		if (local46 > 0 && local43 > 0) {
			Static628.method8474(local30, this.aByteArray73, local6.aByteArray90, local46, local79, local43, local28, local52);
			this.method6478(arg1, local46, arg2, local43);
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIIZI[[Z)V")
	public void method6480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) boolean[][] arg4) {
		this.aClass87_Sub2_28.method6205(false);
		this.aClass87_Sub2_28.method6225(false);
		this.aClass87_Sub2_28.method6228(-2);
		this.aClass87_Sub2_28.method6159(1);
		this.aClass87_Sub2_28.method6196(1);
		@Pc(47) float local47 = 1.0F / (float) (this.aClass87_Sub2_28.anInt7368 * 128);
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(76) int local76;
		@Pc(83) int local83;
		if (arg3) {
			for (local51 = 0; local51 < this.anInt7740; local51++) {
				local58 = local51 << this.anInt7746;
				local65 = local51 + 1 << this.anInt7746;
				label81: for (local67 = 0; local67 < this.anInt7744; local67++) {
					local71 = local67 << this.anInt7746;
					local76 = local67 + 1 << this.anInt7746;
					for (local83 = local71; local83 < local76; local83++) {
						if (local83 - arg2 >= -arg1 && arg1 >= local83 - arg2) {
							for (@Pc(327) int local327 = local58; local327 < local65; local327++) {
								if (-arg1 <= local327 - arg0 && arg1 >= local327 - arg0 && arg4[local83 + arg1 - arg2][local327 + arg1 - arg0]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local47, local47, 1.0F);
									OpenGL.glTranslatef((float) -local67 / local47, (float) -local51 / local47, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass181ArrayArray1[local67][local51].method4399();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local51 = 0; local51 < this.anInt7740; local51++) {
				local58 = local51 << this.anInt7746;
				local65 = local51 + 1 << this.anInt7746;
				for (local67 = 0; local67 < this.anInt7744; local67++) {
					local71 = 0;
					local76 = local67 << this.anInt7746;
					local83 = local67 + 1 << this.anInt7746;
					@Pc(87) Class2_Sub34_Sub1 local87 = this.aClass87_Sub2_28.aClass2_Sub34_Sub1_3;
					local87.anInt8188 = 0;
					for (@Pc(92) int local92 = local58; local92 < local65; local92++) {
						if (-arg1 <= local92 - arg0 && arg1 >= local92 - arg0) {
							@Pc(119) int local119 = this.aClass112_Sub3_3.anInt9348 * local92 + local76;
							for (@Pc(121) int local121 = local76; local121 < local83; local121++) {
								if (local121 - arg2 >= -arg1 && arg1 >= local121 - arg2 && arg4[arg1 + local121 - arg2][local92 + arg1 - arg0]) {
									@Pc(158) short[] local158 = this.aClass112_Sub3_3.aShortArrayArray30[local119];
									if (local158 != null) {
										@Pc(166) int local166;
										if (this.aClass87_Sub2_28.aBoolean559) {
											for (local166 = 0; local166 < local158.length; local166++) {
												local87.method6854(local158[local166] & 0xFFFF);
												local71++;
											}
										} else {
											for (local166 = 0; local166 < local158.length; local166++) {
												local87.method6868(local158[local166] & 0xFFFF);
												local71++;
											}
										}
									}
								}
								local119++;
							}
						}
					}
					if (local71 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local47, local47, 1.0F);
						OpenGL.glTranslatef((float) -local67 / local47, (float) -local51 / local47, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass181ArrayArray1[local67][local51].method4396(local71, local87.aByteArray77);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIILclient!r;)Z")
	public boolean method6481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub5_Sub12 arg2) {
		@Pc(6) Class2_Sub5_Sub12_Sub2 local6 = (Class2_Sub5_Sub12_Sub2) arg2;
		arg1 += local6.anInt8815 + 1;
		arg0 += local6.anInt8819 + 1;
		@Pc(27) int local27 = this.anInt7739 * arg1 + arg0;
		@Pc(35) int local35 = local6.anInt8817;
		@Pc(38) int local38 = local6.anInt8820;
		@Pc(43) int local43 = this.anInt7739 - local38;
		@Pc(53) int local53;
		if (arg1 <= 0) {
			local53 = 1 - arg1;
			local35 -= local53;
			arg1 = 1;
			local27 += this.anInt7739 * local53;
		}
		if (local35 + arg1 >= this.anInt7748) {
			local53 = arg1 + local35 + 1 - this.anInt7748;
			local35 -= local53;
		}
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			local38 -= local53;
			local43 += local53;
			local27 += local53;
			arg0 = 1;
		}
		if (local38 + arg0 >= this.anInt7739) {
			local53 = local38 + arg0 + 1 - this.anInt7739;
			local38 -= local53;
			local43 += local53;
		}
		if (local38 > 0 && local35 > 0) {
			local43 += this.anInt7739 * 7;
			return Static348.method6554(local27, this.aByteArray73, local43, local35, local38);
		} else {
			return false;
		}
	}
}
