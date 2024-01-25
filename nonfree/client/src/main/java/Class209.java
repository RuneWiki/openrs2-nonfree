import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mha")
public final class Class209 {

	@OriginalMember(owner = "client!mha", name = "n", descriptor = "[[Lclient!sm;")
	private Class318[][] aClass318ArrayArray1;

	@OriginalMember(owner = "client!mha", name = "g", descriptor = "Lclient!qo;")
	private final Class20_Sub3 aClass20_Sub3_25;

	@OriginalMember(owner = "client!mha", name = "m", descriptor = "Lclient!ed;")
	private final Class65_Sub2 aClass65_Sub2_2;

	@OriginalMember(owner = "client!mha", name = "o", descriptor = "I")
	public final int anInt6955;

	@OriginalMember(owner = "client!mha", name = "c", descriptor = "I")
	private final int anInt6948;

	@OriginalMember(owner = "client!mha", name = "d", descriptor = "I")
	private final int anInt6949;

	@OriginalMember(owner = "client!mha", name = "h", descriptor = "[B")
	public final byte[] aByteArray92;

	@OriginalMember(owner = "client!mha", name = "i", descriptor = "I")
	private final int anInt6952;

	@OriginalMember(owner = "client!mha", name = "p", descriptor = "I")
	private final int anInt6956;

	@OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(Lclient!qo;Lclient!ed;)V")
	public Class209(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) Class65_Sub2 arg1) {
		this.aClass20_Sub3_25 = arg0;
		this.aClass65_Sub2_2 = arg1;
		this.anInt6955 = (this.aClass65_Sub2_2.anInt9620 * this.aClass65_Sub2_2.anInt9615 >> this.aClass20_Sub3_25.anInt8771) + 2;
		this.anInt6948 = (this.aClass65_Sub2_2.anInt9620 * this.aClass65_Sub2_2.anInt9618 >> this.aClass20_Sub3_25.anInt8771) + 2;
		this.anInt6949 = this.aClass20_Sub3_25.anInt8771 + 7 - this.aClass65_Sub2_2.anInt9616;
		this.aByteArray92 = new byte[this.anInt6955 * this.anInt6948];
		this.anInt6952 = this.aClass65_Sub2_2.anInt9615 >> this.anInt6949;
		this.anInt6956 = this.aClass65_Sub2_2.anInt9618 >> this.anInt6949;
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(Lclient!r;III)V")
	public void method5938(@OriginalArg(0) Class2_Sub6_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class2_Sub6_Sub7_Sub2 local6 = (Class2_Sub6_Sub7_Sub2) arg0;
		arg1 += local6.anInt10150 + 1;
		arg2 += local6.anInt10147 + 1;
		@Pc(27) int local27 = this.anInt6955 * arg2 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt10149;
		@Pc(35) int local35 = local6.anInt10145;
		@Pc(40) int local40 = this.anInt6955 - local35;
		@Pc(42) int local42 = 0;
		@Pc(49) int local49;
		if (arg2 <= 0) {
			local49 = 1 - arg2;
			local29 = local49 * local35;
			local32 -= local49;
			arg2 = 1;
			local27 += local49 * this.anInt6955;
		}
		if (this.anInt6948 <= arg2 + local32) {
			local49 = local32 + arg2 + 1 - this.anInt6948;
			local32 -= local49;
		}
		if (arg1 <= 0) {
			local49 = 1 - arg1;
			local35 -= local49;
			local27 += local49;
			arg1 = 1;
			local40 += local49;
			local42 = local49;
			local29 += local49;
		}
		if (this.anInt6955 <= local35 + arg1) {
			local49 = arg1 + local35 + 1 - this.anInt6955;
			local42 += local49;
			local40 += local49;
			local35 -= local49;
		}
		if (local35 > 0 && local32 > 0) {
			Static542.method8120(local29, this.aByteArray92, local32, local27, local40, local42, local6.aByteArray129, local35);
			this.method5939(local32, local35, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIIII)V")
	private void method5939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass318ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg2 - 1 >> 7;
		@Pc(26) int local26 = arg2 + arg1 - 1 - 1 >> 7;
		@Pc(32) int local32 = arg3 - 1 >> 7;
		@Pc(42) int local42 = arg0 + arg3 - 1 - 1 >> 7;
		for (@Pc(44) int local44 = local15; local44 <= local26; local44++) {
			@Pc(51) Class318[] local51 = this.aClass318ArrayArray1[local44];
			for (@Pc(53) int local53 = local32; local53 <= local42; local53++) {
				local51[local53].aBoolean671 = true;
			}
		}
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IBILclient!r;)Z")
	public boolean method5941(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub6_Sub7 arg2) {
		@Pc(6) Class2_Sub6_Sub7_Sub2 local6 = (Class2_Sub6_Sub7_Sub2) arg2;
		arg1 += local6.anInt10147 + 1;
		arg0 += local6.anInt10150 + 1;
		@Pc(33) int local33 = arg1 * this.anInt6955 + arg0;
		@Pc(36) int local36 = local6.anInt10149;
		@Pc(39) int local39 = local6.anInt10145;
		@Pc(45) int local45 = this.anInt6955 - local39;
		@Pc(52) int local52;
		if (arg1 <= 0) {
			local52 = 1 - arg1;
			local36 -= local52;
			arg1 = 1;
			local33 += this.anInt6955 * local52;
		}
		if (this.anInt6948 <= local36 + arg1) {
			local52 = arg1 + local36 + 1 - this.anInt6948;
			local36 -= local52;
		}
		if (arg0 <= 0) {
			local52 = 1 - arg0;
			local39 -= local52;
			local33 += local52;
			local45 += local52;
			arg0 = 1;
		}
		if (this.anInt6955 <= arg0 + local39) {
			local52 = arg0 + local39 + 1 - this.anInt6955;
			local39 -= local52;
			local45 += local52;
		}
		if (local39 > 0 && local36 > 0) {
			local45 += this.anInt6955 * 7;
			return Static487.method7983(local45, local36, local39, local33, this.aByteArray92);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(ZI[[ZIII)V")
	public void method5943(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aClass20_Sub3_25.method7315(false);
		this.aClass20_Sub3_25.method7335(false);
		this.aClass20_Sub3_25.method7344(-2);
		this.aClass20_Sub3_25.method7348(1);
		this.aClass20_Sub3_25.method7340(1);
		@Pc(47) float local47 = 1.0F / (float) (this.aClass20_Sub3_25.anInt8772 * 128);
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(76) int local76;
		@Pc(83) int local83;
		if (arg0) {
			for (local51 = 0; local51 < this.anInt6956; local51++) {
				local58 = local51 << this.anInt6949;
				local65 = local51 + 1 << this.anInt6949;
				label81: for (local67 = 0; local67 < this.anInt6952; local67++) {
					local71 = local67 << this.anInt6949;
					local76 = local67 + 1 << this.anInt6949;
					for (local83 = local71; local83 < local76; local83++) {
						if (local83 - arg4 >= -arg2 && arg2 >= local83 - arg4) {
							for (@Pc(331) int local331 = local58; local331 < local65; local331++) {
								if (-arg2 <= local331 - arg3 && local331 - arg3 <= arg2 && arg1[arg2 + local83 - arg4][arg2 + local331 - arg3]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local47, local47, 1.0F);
									OpenGL.glTranslatef((float) -local67 / local47, (float) -local51 / local47, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass318ArrayArray1[local67][local51].method7892();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local51 = 0; local51 < this.anInt6956; local51++) {
				local58 = local51 << this.anInt6949;
				local65 = local51 + 1 << this.anInt6949;
				for (local67 = 0; local67 < this.anInt6952; local67++) {
					local71 = 0;
					local76 = local67 << this.anInt6949;
					local83 = local67 + 1 << this.anInt6949;
					@Pc(87) Class2_Sub11_Sub1 local87 = this.aClass20_Sub3_25.aClass2_Sub11_Sub1_1;
					local87.anInt10066 = 0;
					for (@Pc(92) int local92 = local58; local92 < local65; local92++) {
						if (local92 - arg3 >= -arg2 && local92 - arg3 <= arg2) {
							@Pc(119) int local119 = local76 + local92 * this.aClass65_Sub2_2.anInt9615;
							for (@Pc(121) int local121 = local76; local121 < local83; local121++) {
								if (local121 - arg4 >= -arg2 && local121 - arg4 <= arg2 && arg1[arg2 + local121 - arg4][arg2 + local92 - arg3]) {
									@Pc(161) short[] local161 = this.aClass65_Sub2_2.aShortArrayArray10[local119];
									if (local161 != null) {
										@Pc(169) int local169;
										if (this.aClass20_Sub3_25.aBoolean616) {
											for (local169 = 0; local169 < local161.length; local169++) {
												local71++;
												local87.method8333(local161[local169] & 0xFFFF);
											}
										} else {
											for (local169 = 0; local169 < local161.length; local169++) {
												local87.method8393(local161[local169] & 0xFFFF);
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
						this.aClass318ArrayArray1[local67][local51].method7891(local87.aByteArray128, local71);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(I)V")
	public void method5944() {
		this.aClass318ArrayArray1 = new Class318[this.anInt6952][this.anInt6956];
		for (@Pc(14) int local14 = 0; local14 < this.anInt6956; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt6952; local18++) {
				this.aClass318ArrayArray1[local18][local14] = new Class318(this.aClass20_Sub3_25, this, this.aClass65_Sub2_2, local18, local14, this.anInt6949, local18 * 128 + 1, local14 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIBLclient!r;)V")
	public void method5946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub6_Sub7 arg2) {
		@Pc(6) Class2_Sub6_Sub7_Sub2 local6 = (Class2_Sub6_Sub7_Sub2) arg2;
		arg1 += local6.anInt10147 + 1;
		arg0 += local6.anInt10150 + 1;
		@Pc(27) int local27 = this.anInt6955 * arg1 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt10149;
		@Pc(35) int local35 = local6.anInt10145;
		@Pc(46) int local46 = this.anInt6955 - local35;
		@Pc(53) int local53;
		if (arg1 <= 0) {
			local53 = 1 - arg1;
			local29 = local35 * local53;
			local32 -= local53;
			arg1 = 1;
			local27 += local53 * this.anInt6955;
		}
		@Pc(74) int local74 = 0;
		if (arg1 + local32 >= this.anInt6948) {
			local53 = arg1 + local32 + 1 - this.anInt6948;
			local32 -= local53;
		}
		if (arg0 <= 0) {
			local53 = 1 - arg0;
			local35 -= local53;
			local27 += local53;
			arg0 = 1;
			local74 = local53;
			local29 += local53;
			local46 += local53;
		}
		if (this.anInt6955 <= local35 + arg0) {
			local53 = local35 + arg0 + 1 - this.anInt6955;
			local74 += local53;
			local35 -= local53;
			local46 += local53;
		}
		if (local35 > 0 && local32 > 0) {
			Static215.method4188(local74, local29, local6.aByteArray129, local35, this.aByteArray92, local32, local27, local46);
			this.method5939(local32, local35, arg0, arg1);
		}
	}
}
