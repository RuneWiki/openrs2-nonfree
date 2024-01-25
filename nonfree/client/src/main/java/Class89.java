import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class89 {

	@OriginalMember(owner = "client!fu", name = "k", descriptor = "[[Lclient!dr;")
	private Class57[][] aClass57ArrayArray1;

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "Lclient!ug;")
	private final Class135_Sub2 aClass135_Sub2_11;

	@OriginalMember(owner = "client!fu", name = "g", descriptor = "Lclient!ul;")
	private final Class41_Sub2 aClass41_Sub2_1;

	@OriginalMember(owner = "client!fu", name = "s", descriptor = "I")
	public final int anInt2180;

	@OriginalMember(owner = "client!fu", name = "m", descriptor = "I")
	private final int anInt2176;

	@OriginalMember(owner = "client!fu", name = "o", descriptor = "[B")
	public final byte[] aByteArray16;

	@OriginalMember(owner = "client!fu", name = "n", descriptor = "I")
	private final int anInt2177;

	@OriginalMember(owner = "client!fu", name = "q", descriptor = "I")
	private final int anInt2178;

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "I")
	private final int anInt2171;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!ug;Lclient!ul;)V")
	public Class89(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) Class41_Sub2 arg1) {
		this.aClass135_Sub2_11 = arg0;
		this.aClass41_Sub2_1 = arg1;
		this.anInt2180 = (this.aClass41_Sub2_1.anInt6905 * this.aClass41_Sub2_1.anInt6908 >> this.aClass135_Sub2_11.anInt6780) + 2;
		this.anInt2176 = (this.aClass41_Sub2_1.anInt6905 * this.aClass41_Sub2_1.anInt6909 >> this.aClass135_Sub2_11.anInt6780) + 2;
		this.aByteArray16 = new byte[this.anInt2176 * this.anInt2180];
		this.anInt2177 = this.aClass135_Sub2_11.anInt6780 + 7 - this.aClass41_Sub2_1.anInt6907;
		this.anInt2178 = this.aClass41_Sub2_1.anInt6908 >> this.anInt2177;
		this.anInt2171 = this.aClass41_Sub2_1.anInt6909 >> this.anInt2177;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIII)V")
	private void method1724(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass57ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg0 - 1 >> 7;
		@Pc(25) int local25 = arg3 + arg0 - 1 - 1 >> 7;
		@Pc(31) int local31 = arg2 - 1 >> 7;
		@Pc(47) int local47 = arg1 + arg2 - 1 - 1 >> 7;
		for (@Pc(49) int local49 = local15; local49 <= local25; local49++) {
			@Pc(56) Class57[] local56 = this.aClass57ArrayArray1[local49];
			for (@Pc(58) int local58 = local31; local58 <= local47; local58++) {
				local56[local58].aBoolean102 = true;
			}
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ZIIII[[Z)V")
	public void method1725(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean[][] arg4) {
		this.aClass135_Sub2_11.method5461(false);
		this.aClass135_Sub2_11.method5473(false);
		this.aClass135_Sub2_11.method5485(-2);
		this.aClass135_Sub2_11.method5441(1);
		this.aClass135_Sub2_11.method5426(1);
		@Pc(41) float local41 = 1.0F / (float) (this.aClass135_Sub2_11.anInt6778 * 128);
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		@Pc(68) int local68;
		@Pc(75) int local75;
		@Pc(77) int local77;
		if (arg0) {
			for (local45 = 0; local45 < this.anInt2171; local45++) {
				local52 = local45 << this.anInt2177;
				local59 = local45 + 1 << this.anInt2177;
				label128: for (local61 = 0; local61 < this.anInt2178; local61++) {
					local68 = local61 << this.anInt2177;
					local75 = local61 + 1 << this.anInt2177;
					for (local77 = local68; local77 < local75; local77++) {
						if (-arg1 <= local77 - arg2 && local77 - arg2 <= arg1) {
							for (@Pc(93) int local93 = local52; local93 < local59; local93++) {
								if (local93 - arg3 >= -arg1 && local93 - arg3 <= arg1 && arg4[local77 + arg1 - arg2][arg1 + local93 - arg3]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local41, local41, 1.0F);
									OpenGL.glTranslatef((float) -local61 / local41, (float) -local45 / local41, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass57ArrayArray1[local61][local45].method1252();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local45 = 0; local45 < this.anInt2171; local45++) {
				local52 = local45 << this.anInt2177;
				local59 = local45 + 1 << this.anInt2177;
				for (local61 = 0; local61 < this.anInt2178; local61++) {
					local68 = 0;
					local75 = local61 << this.anInt2177;
					local77 = local61 + 1 << this.anInt2177;
					@Pc(223) Class4_Sub9_Sub1 local223 = this.aClass135_Sub2_11.aClass4_Sub9_Sub1_3;
					local223.anInt6207 = 0;
					for (@Pc(228) int local228 = local52; local228 < local59; local228++) {
						if (local228 - arg3 >= -arg1 && arg1 >= local228 - arg3) {
							@Pc(250) int local250 = local75 + this.aClass41_Sub2_1.anInt6908 * local228;
							for (@Pc(252) int local252 = local75; local252 < local77; local252++) {
								if (-arg1 <= local252 - arg2 && arg1 >= local252 - arg2 && arg4[arg1 + local252 - arg2][local228 + arg1 - arg3]) {
									@Pc(288) short[] local288 = this.aClass41_Sub2_1.aShortArrayArray7[local250];
									if (local288 != null) {
										@Pc(296) int local296;
										if (this.aClass135_Sub2_11.aBoolean474) {
											for (local296 = 0; local296 < local288.length; local296++) {
												local68++;
												local223.method5029(local288[local296] & 0xFFFF);
											}
										} else {
											for (local296 = 0; local296 < local288.length; local296++) {
												local223.method5060(local288[local296] & 0xFFFF);
												local68++;
											}
										}
									}
								}
								local250++;
							}
						}
					}
					if (local68 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local41, local41, 1.0F);
						OpenGL.glTranslatef((float) -local61 / local41, (float) -local45 / local41, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass57ArrayArray1[local61][local45].method1251(local223.aByteArray81, local68);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILclient!ba;BI)V")
	public void method1726(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub2_Sub3 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class4_Sub2_Sub3_Sub1 local6 = (Class4_Sub2_Sub3_Sub1) arg1;
		arg2 += local6.anInt6496 + 1;
		arg0 += local6.anInt6490 + 1;
		@Pc(33) int local33 = this.anInt2180 * arg0 + arg2;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = local6.anInt6492;
		@Pc(41) int local41 = local6.anInt6493;
		@Pc(47) int local47 = this.anInt2180 - local41;
		@Pc(49) int local49 = 0;
		@Pc(59) int local59;
		if (arg0 <= 0) {
			local59 = 1 - arg0;
			local35 = local59 * local41;
			local33 += this.anInt2180 * local59;
			arg0 = 1;
			local38 -= local59;
		}
		if (local38 + arg0 >= this.anInt2176) {
			local59 = local38 + arg0 + 1 - this.anInt2176;
			local38 -= local59;
		}
		if (arg2 <= 0) {
			local59 = 1 - arg2;
			local49 = local59;
			local35 += local59;
			local41 -= local59;
			local47 += local59;
			local33 += local59;
			arg2 = 1;
		}
		if (local41 + arg2 >= this.anInt2180) {
			local59 = arg2 + local41 + 1 - this.anInt2180;
			local47 += local59;
			local41 -= local59;
			local49 += local59;
		}
		if (local41 > 0 && local38 > 0) {
			Static383.method5082(local47, local49, local35, local33, local38, local6.aByteArray83, local41, this.aByteArray16);
			this.method1724(arg2, local38, arg0, local41);
		}
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(I)V")
	public void method1728() {
		this.aClass57ArrayArray1 = new Class57[this.anInt2178][this.anInt2171];
		for (@Pc(14) int local14 = 0; local14 < this.anInt2171; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt2178; local18++) {
				this.aClass57ArrayArray1[local18][local14] = new Class57(this.aClass135_Sub2_11, this, this.aClass41_Sub2_1, local18, local14, this.anInt2177, local18 * 128 + 1, local14 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!ba;III)V")
	public void method1731(@OriginalArg(0) Class4_Sub2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class4_Sub2_Sub3_Sub1 local6 = (Class4_Sub2_Sub3_Sub1) arg0;
		arg1 += local6.anInt6496 + 1;
		arg2 += local6.anInt6490 + 1;
		@Pc(28) int local28 = arg1 + arg2 * this.anInt2180;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt6492;
		@Pc(36) int local36 = local6.anInt6493;
		@Pc(42) int local42 = this.anInt2180 - local36;
		@Pc(49) int local49;
		if (arg2 <= 0) {
			local49 = 1 - arg2;
			local30 = local36 * local49;
			local33 -= local49;
			local28 += local49 * this.anInt2180;
			arg2 = 1;
		}
		@Pc(70) int local70 = 0;
		if (arg2 + local33 >= this.anInt2176) {
			local49 = local33 + arg2 + 1 - this.anInt2176;
			local33 -= local49;
		}
		if (arg1 <= 0) {
			local49 = 1 - arg1;
			local42 += local49;
			arg1 = 1;
			local36 -= local49;
			local30 += local49;
			local70 = local49;
			local28 += local49;
		}
		if (local36 + arg1 >= this.anInt2180) {
			local49 = arg1 + local36 + 1 - this.anInt2180;
			local36 -= local49;
			local42 += local49;
			local70 += local49;
		}
		if (local36 > 0 && local33 > 0) {
			Static168.method1845(local33, this.aByteArray16, local28, local30, local70, local42, local36, local6.aByteArray83);
			this.method1724(arg1, local33, arg2, local36);
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIILclient!ba;)Z")
	public boolean method1732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class4_Sub2_Sub3 arg2) {
		@Pc(6) Class4_Sub2_Sub3_Sub1 local6 = (Class4_Sub2_Sub3_Sub1) arg2;
		arg0 += local6.anInt6496 + 1;
		arg1 += local6.anInt6490 + 1;
		@Pc(28) int local28 = arg0 + this.anInt2180 * arg1;
		@Pc(31) int local31 = local6.anInt6492;
		@Pc(34) int local34 = local6.anInt6493;
		if (arg1 <= 0) {
			@Pc(41) int local41 = 1 - arg1;
			local31 -= local41;
			arg1 = 1;
			local28 += this.anInt2180 * local41;
		}
		@Pc(60) int local60 = this.anInt2180 - local34;
		@Pc(87) int local87;
		if (this.anInt2176 <= local31 + arg1) {
			local87 = local31 + arg1 + 1 - this.anInt2176;
			local31 -= local87;
		}
		if (arg0 <= 0) {
			local87 = 1 - arg0;
			local28 += local87;
			arg0 = 1;
			local60 += local87;
			local34 -= local87;
		}
		if (this.anInt2180 <= local34 + arg0) {
			local87 = local34 + arg0 + 1 - this.anInt2180;
			local34 -= local87;
			local60 += local87;
		}
		if (local34 > 0 && local31 > 0) {
			local60 += this.anInt2180 * 7;
			return Static71.method5808(this.aByteArray16, local28, local34, local60, local31);
		} else {
			return false;
		}
	}
}
