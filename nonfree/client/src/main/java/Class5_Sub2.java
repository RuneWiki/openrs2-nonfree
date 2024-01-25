import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!au", name = "a", descriptor = "Lclient!mba;")
	private Class121_Sub2_Sub1 aClass121_Sub2_Sub1_1;

	@OriginalMember(owner = "client!au", name = "l", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!au", name = "q", descriptor = "I")
	private int anInt441 = 0;

	@OriginalMember(owner = "client!au", name = "t", descriptor = "I")
	private int anInt444 = 0;

	@OriginalMember(owner = "client!au", name = "k", descriptor = "I")
	private int anInt436 = 0;

	@OriginalMember(owner = "client!au", name = "v", descriptor = "I")
	private int anInt445 = 0;

	@OriginalMember(owner = "client!au", name = "C", descriptor = "I")
	private int anInt451 = 0;

	@OriginalMember(owner = "client!au", name = "z", descriptor = "Lclient!eq;")
	private final Class33_Sub3 aClass33_Sub3_4;

	@OriginalMember(owner = "client!au", name = "u", descriptor = "Lclient!mba;")
	private final Class121_Sub2_Sub1 aClass121_Sub2_Sub1_2;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lclient!eq;IIZ)V")
	public Class5_Sub2(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass33_Sub3_4 = arg0;
		this.aClass121_Sub2_Sub1_2 = Static622.method7859(arg2, arg3 ? 6408 : 6407, arg0, arg1);
	}

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lclient!eq;IIII)V")
	public Class5_Sub2(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass33_Sub3_4 = arg0;
		this.aClass121_Sub2_Sub1_2 = Static541.method7683(arg2, arg4, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lclient!eq;II[III)V")
	public Class5_Sub2(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass33_Sub3_4 = arg0;
		this.aClass121_Sub2_Sub1_2 = Static341.method5636(arg0, arg1, arg4, arg2, arg5, arg3);
	}

	@OriginalMember(owner = "client!au", name = "d", descriptor = "()I")
	@Override
	public int method7589() {
		return this.aClass121_Sub2_Sub1_2.anInt6665 + this.anInt451 + this.anInt441;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIII[III)V")
	private void method458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.aClass121_Sub2_Sub1_2.method5559(arg5, arg4, arg0, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		this.aClass121_Sub2_Sub1_2.method7326(false);
		@Pc(18) int local18 = arg3 + arg1;
		this.aClass33_Sub3_4.method3008();
		this.aClass33_Sub3_4.method3012(this.aClass121_Sub2_Sub1_2);
		this.aClass33_Sub3_4.method3087(arg6);
		this.aClass33_Sub3_4.method3045(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass121_Sub2_Sub1_2.aBoolean567 && !this.aBoolean42) {
			@Pc(354) float local354 = (float) arg3 * this.aClass121_Sub2_Sub1_2.aFloat187 / (float) this.aClass121_Sub2_Sub1_2.anInt6660;
			@Pc(366) float local366 = this.aClass121_Sub2_Sub1_2.aFloat185 * (float) arg2 / (float) this.aClass121_Sub2_Sub1_2.anInt6665;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local354);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local18);
			OpenGL.glTexCoord2f(local366, 0.0F);
			OpenGL.glVertex2i(local9, local18);
			OpenGL.glTexCoord2f(local366, local354);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt451, (float) this.anInt436, 0.0F);
		@Pc(72) int local72 = this.method7589();
		@Pc(75) int local75 = this.method7585();
		@Pc(81) int local81 = this.aClass121_Sub2_Sub1_2.anInt6660 + arg1;
		OpenGL.glBegin(7);
		@Pc(85) int local85 = arg1;
		@Pc(93) int local93;
		while (local81 <= local18) {
			local93 = arg0 + this.aClass121_Sub2_Sub1_2.anInt6665;
			@Pc(95) int local95 = arg0;
			while (local9 >= local93) {
				OpenGL.glTexCoord2f(0.0F, this.aClass121_Sub2_Sub1_2.aFloat187);
				OpenGL.glVertex2i(local95, local85);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local95, local81);
				OpenGL.glTexCoord2f(this.aClass121_Sub2_Sub1_2.aFloat185, 0.0F);
				OpenGL.glVertex2i(local93, local81);
				OpenGL.glTexCoord2f(this.aClass121_Sub2_Sub1_2.aFloat185, this.aClass121_Sub2_Sub1_2.aFloat187);
				OpenGL.glVertex2i(local93, local85);
				local95 += local72;
				local93 += local72;
			}
			if (local9 > local95) {
				@Pc(166) float local166 = (float) (local9 - local95) * this.aClass121_Sub2_Sub1_2.aFloat185 / (float) this.aClass121_Sub2_Sub1_2.anInt6665;
				OpenGL.glTexCoord2f(0.0F, this.aClass121_Sub2_Sub1_2.aFloat187);
				OpenGL.glVertex2i(local95, local85);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local95, local81);
				OpenGL.glTexCoord2f(local166, 0.0F);
				OpenGL.glVertex2i(local9, local81);
				OpenGL.glTexCoord2f(local166, this.aClass121_Sub2_Sub1_2.aFloat187);
				OpenGL.glVertex2i(local9, local85);
			}
			local85 += local75;
			local81 += local75;
		}
		if (local18 > local85) {
			@Pc(232) float local232 = this.aClass121_Sub2_Sub1_2.aFloat187 * (float) (local85 + this.aClass121_Sub2_Sub1_2.anInt6660 - local18) / (float) this.aClass121_Sub2_Sub1_2.anInt6660;
			@Pc(238) int local238 = arg0 + this.aClass121_Sub2_Sub1_2.anInt6665;
			local93 = arg0;
			while (local238 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass121_Sub2_Sub1_2.aFloat187);
				OpenGL.glVertex2i(local93, local85);
				OpenGL.glTexCoord2f(0.0F, local232);
				OpenGL.glVertex2i(local93, local18);
				OpenGL.glTexCoord2f(this.aClass121_Sub2_Sub1_2.aFloat185, local232);
				OpenGL.glVertex2i(local238, local18);
				OpenGL.glTexCoord2f(this.aClass121_Sub2_Sub1_2.aFloat185, this.aClass121_Sub2_Sub1_2.aFloat187);
				OpenGL.glVertex2i(local238, local85);
				local238 += local72;
				local93 += local72;
			}
			if (local9 > local93) {
				@Pc(311) float local311 = (float) (local9 - local93) * this.aClass121_Sub2_Sub1_2.aFloat185 / (float) this.aClass121_Sub2_Sub1_2.anInt6665;
				OpenGL.glTexCoord2f(0.0F, this.aClass121_Sub2_Sub1_2.aFloat187);
				OpenGL.glVertex2i(local93, local85);
				OpenGL.glTexCoord2f(0.0F, local232);
				OpenGL.glVertex2i(local93, local18);
				OpenGL.glTexCoord2f(local311, local232);
				OpenGL.glVertex2i(local9, local18);
				OpenGL.glTexCoord2f(local311, this.aClass121_Sub2_Sub1_2.aFloat187);
				OpenGL.glVertex2i(local9, local85);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "()I")
	@Override
	public int method7580() {
		return this.aClass121_Sub2_Sub1_2.anInt6660;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method7583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg2;
		@Pc(9) Class121_Sub2_Sub1 local9 = local6.aClass121_Sub2_Sub1_5;
		this.aClass121_Sub2_Sub1_2.method7326(false);
		this.aClass33_Sub3_4.method3008();
		this.aClass33_Sub3_4.method3012(this.aClass121_Sub2_Sub1_2);
		this.aClass33_Sub3_4.method3045(1);
		this.aClass33_Sub3_4.method3027(1);
		this.aClass33_Sub3_4.method3012(local9);
		this.aClass33_Sub3_4.method3057(8448, 7681);
		this.aClass33_Sub3_4.method3024(768, 34168, 0);
		this.aClass33_Sub3_4.method3087(1);
		@Pc(62) int local62 = arg1 + this.anInt436;
		@Pc(67) int local67 = arg0 + this.anInt451;
		@Pc(74) int local74 = local67 + this.aClass121_Sub2_Sub1_2.anInt6665;
		@Pc(80) int local80 = this.aClass121_Sub2_Sub1_2.anInt6660 + local62;
		@Pc(87) float local87 = local9.aFloat185 / (float) local9.anInt6665;
		@Pc(94) float local94 = local9.aFloat187 / (float) local9.anInt6660;
		@Pc(102) float local102 = local87 * (float) (local67 - arg3);
		@Pc(110) float local110 = (float) (local74 - arg3) * local87;
		@Pc(122) float local122 = local9.aFloat187 - local94 * (float) (local62 - arg4);
		@Pc(134) float local134 = local9.aFloat187 - local94 * (float) (local80 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass121_Sub2_Sub1_2.aFloat187);
		OpenGL.glMultiTexCoord2f(33985, local102, local122);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local102, local134);
		OpenGL.glVertex2i(local67, local62 + this.aClass121_Sub2_Sub1_2.anInt6660);
		OpenGL.glMultiTexCoord2f(33984, this.aClass121_Sub2_Sub1_2.aFloat185, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local110, local134);
		OpenGL.glVertex2i(local67 + this.aClass121_Sub2_Sub1_2.anInt6665, this.aClass121_Sub2_Sub1_2.anInt6660 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass121_Sub2_Sub1_2.aFloat185, this.aClass121_Sub2_Sub1_2.aFloat187);
		OpenGL.glMultiTexCoord2f(33985, local110, local122);
		OpenGL.glVertex2i(this.aClass121_Sub2_Sub1_2.anInt6665 + local67, local62);
		OpenGL.glEnd();
		this.aClass33_Sub3_4.method3024(768, 5890, 0);
		this.aClass33_Sub3_4.method3045(0);
		this.aClass33_Sub3_4.method3012(null);
		this.aClass33_Sub3_4.method3027(0);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method7576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass121_Sub2_Sub1_2.method7326(true);
		this.aClass33_Sub3_4.method3008();
		this.aClass33_Sub3_4.method3087(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean42) {
			@Pc(191) float local191 = (float) arg2 / (float) this.method7589();
			@Pc(198) float local198 = (float) arg3 / (float) this.method7585();
			@Pc(207) float local207 = local191 * (float) this.anInt451 + (float) arg0;
			@Pc(216) float local216 = local198 * (float) this.anInt436 + (float) arg1;
			@Pc(225) float local225 = (float) this.aClass121_Sub2_Sub1_2.anInt6665 * local191 + local207;
			@Pc(234) float local234 = local216 + (float) this.aClass121_Sub2_Sub1_2.anInt6660 * local198;
			if (this.aClass121_Sub2_Sub1_1 == null) {
				this.aClass33_Sub3_4.method3012(this.aClass121_Sub2_Sub1_2);
				this.aClass33_Sub3_4.method3045(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass121_Sub2_Sub1_2.aFloat187);
				OpenGL.glVertex2f(local207, local216);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local207, local234);
				OpenGL.glTexCoord2f(this.aClass121_Sub2_Sub1_2.aFloat185, 0.0F);
				OpenGL.glVertex2f(local225, local234);
				OpenGL.glTexCoord2f(this.aClass121_Sub2_Sub1_2.aFloat185, this.aClass121_Sub2_Sub1_2.aFloat187);
				OpenGL.glVertex2f(local225, local216);
				OpenGL.glEnd();
			} else {
				this.method461(arg4);
				this.aClass121_Sub2_Sub1_1.method7326(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass121_Sub2_Sub1_2.aFloat187);
				OpenGL.glTexCoord2f(0.0F, this.aClass121_Sub2_Sub1_2.aFloat187);
				OpenGL.glVertex2f(local207, local216);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local207, local234);
				OpenGL.glMultiTexCoord2f(33985, this.aClass121_Sub2_Sub1_2.aFloat185, 0.0F);
				OpenGL.glTexCoord2f(this.aClass121_Sub2_Sub1_2.aFloat185, 0.0F);
				OpenGL.glVertex2f(local225, local234);
				OpenGL.glMultiTexCoord2f(33985, this.aClass121_Sub2_Sub1_2.aFloat185, this.aClass121_Sub2_Sub1_2.aFloat187);
				OpenGL.glTexCoord2f(this.aClass121_Sub2_Sub1_2.aFloat185, this.aClass121_Sub2_Sub1_2.aFloat187);
				OpenGL.glVertex2f(local225, local216);
				OpenGL.glEnd();
				this.method462();
			}
		} else if (this.aClass121_Sub2_Sub1_1 == null) {
			this.aClass33_Sub3_4.method3012(this.aClass121_Sub2_Sub1_2);
			this.aClass33_Sub3_4.method3045(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass121_Sub2_Sub1_2.aFloat187);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass121_Sub2_Sub1_2.aFloat185, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass121_Sub2_Sub1_2.aFloat185, this.aClass121_Sub2_Sub1_2.aFloat187);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method461(arg4);
			this.aClass121_Sub2_Sub1_1.method7326(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass121_Sub2_Sub1_2.aFloat187);
			OpenGL.glTexCoord2f(0.0F, this.aClass121_Sub2_Sub1_2.aFloat187);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass121_Sub2_Sub1_2.aFloat185, 0.0F);
			OpenGL.glTexCoord2f(this.aClass121_Sub2_Sub1_2.aFloat185, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg1 - -arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass121_Sub2_Sub1_2.aFloat185, this.aClass121_Sub2_Sub1_2.aFloat187);
			OpenGL.glTexCoord2f(this.aClass121_Sub2_Sub1_2.aFloat185, this.aClass121_Sub2_Sub1_2.aFloat187);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method462();
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(III)V")
	@Override
	public void method7587(@OriginalArg(2) int arg0) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass121_Sub2_Sub1_1 = Static541.method7683(0, this.aClass121_Sub2_Sub1_2.anInt6660, 0, this.aClass33_Sub3_4, this.aClass121_Sub2_Sub1_2.anInt6665);
		this.anInt445 = arg0;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!this.aClass33_Sub3_4.aBoolean256) {
			this.aClass121_Sub2_Sub1_2.method5562(arg3, arg1, arg0, arg5, arg2, arg4);
			return;
		}
		@Pc(28) int[] local28 = this.aClass33_Sub3_4.na(arg4, arg5, arg2, arg3);
		if (local28 != null) {
			for (@Pc(32) int local32 = 0; local32 < local28.length; local32++) {
				local28[local32] |= 0xFF000000;
			}
			this.method458(arg0, arg1, arg2, arg3, local28, arg2);
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method7575(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class121_Sub2_Sub1 local7 = ((Class1_Sub3) arg6).aClass121_Sub2_Sub1_5;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(31) float local31;
		if (this.aBoolean42) {
			local14 = this.method7589();
			local18 = this.method7585();
			local24 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(37) float local37 = (arg4 - arg0) / local18;
			@Pc(43) float local43 = (arg5 - arg1) / local18;
			@Pc(49) float local49 = (float) this.anInt436 * local37;
			@Pc(55) float local55 = (float) this.anInt436 * local43;
			@Pc(61) float local61 = local24 * (float) this.anInt451;
			@Pc(67) float local67 = local31 * (float) this.anInt451;
			@Pc(74) float local74 = (float) this.anInt441 * -local24;
			@Pc(81) float local81 = (float) this.anInt441 * -local31;
			@Pc(88) float local88 = (float) this.anInt444 * -local37;
			arg4 = local88 + local61 + arg4;
			arg1 = local55 + arg1 + local67;
			arg2 = local49 + arg2 + local74;
			@Pc(113) float local113 = -local43 * (float) this.anInt444;
			arg3 = local81 + arg3 + local55;
			arg0 = local49 + local61 + arg0;
			arg5 = local113 + local67 + arg5;
		}
		local14 = arg4 + arg2 - arg0;
		local18 = arg3 + arg5 - arg1;
		this.aClass121_Sub2_Sub1_2.method7326(true);
		this.aClass33_Sub3_4.method3008();
		this.aClass33_Sub3_4.method3012(this.aClass121_Sub2_Sub1_2);
		this.aClass33_Sub3_4.method3045(1);
		this.aClass33_Sub3_4.method3027(1);
		this.aClass33_Sub3_4.method3012(local7);
		this.aClass33_Sub3_4.method3057(8448, 7681);
		this.aClass33_Sub3_4.method3024(768, 34168, 0);
		this.aClass33_Sub3_4.method3087(1);
		local24 = local7.aFloat185 / (float) local7.anInt6665;
		local31 = local7.aFloat187 / (float) local7.anInt6660;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass121_Sub2_Sub1_2.aFloat187);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg0 - (float) arg7), local7.aFloat187 - (arg1 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg4) * local24, local7.aFloat187 - local31 * ((float) -arg8 + arg5));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass121_Sub2_Sub1_2.aFloat185, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + local14), local7.aFloat187 - ((float) -arg8 + local18) * local31);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass121_Sub2_Sub1_2.aFloat185, this.aClass121_Sub2_Sub1_2.aFloat187);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg2), local7.aFloat187 - local31 * ((float) -arg8 + arg3));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass33_Sub3_4.method3024(768, 5890, 0);
		this.aClass33_Sub3_4.method3045(0);
		this.aClass33_Sub3_4.method3012(null);
		this.aClass33_Sub3_4.method3027(0);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method7581(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean42) {
			local6 = this.method7589();
			local10 = this.method7585();
			@Pc(17) float local17 = (arg2 - arg0) / local6;
			@Pc(24) float local24 = (arg3 - arg1) / local6;
			@Pc(31) float local31 = (arg4 - arg0) / local10;
			@Pc(37) float local37 = (arg5 - arg1) / local10;
			@Pc(43) float local43 = local31 * (float) this.anInt436;
			@Pc(49) float local49 = (float) this.anInt436 * local37;
			@Pc(55) float local55 = local17 * (float) this.anInt451;
			@Pc(61) float local61 = (float) this.anInt451 * local24;
			@Pc(68) float local68 = (float) this.anInt441 * -local17;
			@Pc(75) float local75 = -local24 * (float) this.anInt441;
			@Pc(82) float local82 = (float) this.anInt444 * -local31;
			arg0 = local55 + arg0 + local43;
			arg1 = local49 + arg1 + local61;
			arg3 = local49 + arg3 + local75;
			arg4 = local82 + local55 + arg4;
			@Pc(113) float local113 = -local37 * (float) this.anInt444;
			arg2 = local43 + arg2 + local68;
			arg5 = local113 + arg5 + local61;
		}
		local6 = arg4 + arg2 - arg0;
		this.aClass121_Sub2_Sub1_2.method7326(true);
		local10 = arg3 + arg5 - arg1;
		this.aClass33_Sub3_4.method3008();
		this.aClass33_Sub3_4.method3012(this.aClass121_Sub2_Sub1_2);
		this.aClass33_Sub3_4.method3087(1);
		this.aClass33_Sub3_4.method3045(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass121_Sub2_Sub1_2.aFloat187);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass121_Sub2_Sub1_2.aFloat185, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass121_Sub2_Sub1_2.aFloat185, this.aClass121_Sub2_Sub1_2.aFloat187);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt441 = arg2;
		this.anInt444 = arg3;
		this.anInt436 = arg1;
		this.anInt451 = arg0;
		this.aBoolean42 = this.anInt451 != 0 || this.anInt436 != 0 || this.anInt441 != 0 || this.anInt444 != 0;
	}

	@OriginalMember(owner = "client!au", name = "c", descriptor = "(II)V")
	private void method461(@OriginalArg(0) int arg0) {
		this.aClass33_Sub3_4.method3027(1);
		this.aClass33_Sub3_4.method3012(this.aClass121_Sub2_Sub1_2);
		this.aClass33_Sub3_4.method3057(7681, this.aClass33_Sub3_4.method3022(arg0));
		this.aClass33_Sub3_4.method3024(768, 34167, 1);
		this.aClass33_Sub3_4.method3081(34168, 0);
		this.aClass33_Sub3_4.method3027(0);
		this.aClass33_Sub3_4.method3012(this.aClass121_Sub2_Sub1_1);
		this.aClass33_Sub3_4.method3057(7681, 34479);
		this.aClass33_Sub3_4.method3024(768, 34166, 1);
		if (this.anInt445 == 0) {
			this.aClass33_Sub3_4.method3055(0.5F, 1.0F, 0.0F, 0.5F);
		} else if (this.anInt445 == 1) {
			this.aClass33_Sub3_4.method3055(0.5F, 0.5F, 0.0F, 1.0F);
		} else if (this.anInt445 == 2) {
			this.aClass33_Sub3_4.method3055(1.0F, 0.5F, 0.0F, 0.5F);
		} else if (this.anInt445 == 3) {
			this.aClass33_Sub3_4.method3055(128.5F, 128.5F, 0.0F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "()I")
	@Override
	public int method7585() {
		return this.anInt444 + this.aClass121_Sub2_Sub1_2.anInt6660 + this.anInt436;
	}

	@OriginalMember(owner = "client!au", name = "c", descriptor = "()I")
	@Override
	public int method7588() {
		return this.aClass121_Sub2_Sub1_2.anInt6665;
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(Z)V")
	private void method462() {
		this.aClass33_Sub3_4.method3027(1);
		this.aClass33_Sub3_4.method3012(null);
		this.aClass33_Sub3_4.method3057(8448, 8448);
		this.aClass33_Sub3_4.method3024(768, 34168, 1);
		this.aClass33_Sub3_4.method3081(5890, 0);
		this.aClass33_Sub3_4.method3027(0);
		this.aClass33_Sub3_4.method3024(768, 34168, 1);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "([I)V")
	@Override
	public void method7597(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt451;
		arg0[1] = this.anInt436;
		arg0[2] = this.anInt441;
		arg0[3] = this.anInt444;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method7595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass121_Sub2_Sub1_2.method7326(false);
		this.aClass33_Sub3_4.method3008();
		this.aClass33_Sub3_4.method3087(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt451;
		@Pc(42) int local42 = arg1 + this.anInt436;
		if (this.aClass121_Sub2_Sub1_1 == null) {
			this.aClass33_Sub3_4.method3012(this.aClass121_Sub2_Sub1_2);
			this.aClass33_Sub3_4.method3045(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass121_Sub2_Sub1_2.aFloat187);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, local42 + this.aClass121_Sub2_Sub1_2.anInt6660);
			OpenGL.glTexCoord2f(this.aClass121_Sub2_Sub1_2.aFloat185, 0.0F);
			OpenGL.glVertex2i(this.aClass121_Sub2_Sub1_2.anInt6665 + local37, this.aClass121_Sub2_Sub1_2.anInt6660 + local42);
			OpenGL.glTexCoord2f(this.aClass121_Sub2_Sub1_2.aFloat185, this.aClass121_Sub2_Sub1_2.aFloat187);
			OpenGL.glVertex2i(local37 + this.aClass121_Sub2_Sub1_2.anInt6665, local42);
			OpenGL.glEnd();
			return;
		}
		this.method461(arg2);
		this.aClass121_Sub2_Sub1_1.method7326(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass121_Sub2_Sub1_2.aFloat187);
		OpenGL.glTexCoord2f(0.0F, this.aClass121_Sub2_Sub1_2.aFloat187);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, local42 + this.aClass121_Sub2_Sub1_2.anInt6660);
		OpenGL.glMultiTexCoord2f(33985, this.aClass121_Sub2_Sub1_2.aFloat185, 0.0F);
		OpenGL.glTexCoord2f(this.aClass121_Sub2_Sub1_2.aFloat185, 0.0F);
		OpenGL.glVertex2i(local37 + this.aClass121_Sub2_Sub1_2.anInt6665, this.aClass121_Sub2_Sub1_2.anInt6660 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass121_Sub2_Sub1_2.aFloat185, this.aClass121_Sub2_Sub1_2.aFloat187);
		OpenGL.glTexCoord2f(this.aClass121_Sub2_Sub1_2.aFloat185, this.aClass121_Sub2_Sub1_2.aFloat187);
		OpenGL.glVertex2i(local37 + this.aClass121_Sub2_Sub1_2.anInt6665, local42);
		OpenGL.glEnd();
		this.method462();
	}
}
