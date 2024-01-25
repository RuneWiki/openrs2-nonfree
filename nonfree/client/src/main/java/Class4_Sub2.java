import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "Lclient!mm;")
	private Class35_Sub3_Sub1 aClass35_Sub3_Sub1_1;

	@OriginalMember(owner = "client!gm", name = "h", descriptor = "Z")
	private boolean aBoolean203 = false;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
	private int anInt3022 = 0;

	@OriginalMember(owner = "client!gm", name = "s", descriptor = "I")
	private int anInt3035 = 0;

	@OriginalMember(owner = "client!gm", name = "x", descriptor = "I")
	private int anInt3039 = 0;

	@OriginalMember(owner = "client!gm", name = "l", descriptor = "I")
	private int anInt3029 = 0;

	@OriginalMember(owner = "client!gm", name = "z", descriptor = "I")
	private int anInt3041 = 0;

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "Lclient!pea;")
	private final Class121_Sub3 aClass121_Sub3_17;

	@OriginalMember(owner = "client!gm", name = "g", descriptor = "Lclient!mm;")
	private final Class35_Sub3_Sub1 aClass35_Sub3_Sub1_2;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!pea;IIII)V")
	public Class4_Sub2(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass121_Sub3_17 = arg0;
		this.aClass35_Sub3_Sub1_2 = Static11.method180(arg4, arg1, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!pea;II[III)V")
	public Class4_Sub2(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass121_Sub3_17 = arg0;
		this.aClass35_Sub3_Sub1_2 = Static528.method7590(arg2, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V")
	private void method2608() {
		this.aClass121_Sub3_17.method5648(1);
		this.aClass121_Sub3_17.method5713(null);
		this.aClass121_Sub3_17.method5659(8448, 8448);
		this.aClass121_Sub3_17.method5685(768, 34168, 1);
		this.aClass121_Sub3_17.method5717(0, 5890);
		this.aClass121_Sub3_17.method5648(0);
		this.aClass121_Sub3_17.method5685(768, 34168, 1);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(BI)V")
	private void method2609(@OriginalArg(1) int arg0) {
		this.aClass121_Sub3_17.method5648(1);
		this.aClass121_Sub3_17.method5713(this.aClass35_Sub3_Sub1_2);
		this.aClass121_Sub3_17.method5659(7681, this.aClass121_Sub3_17.method5673(arg0));
		this.aClass121_Sub3_17.method5685(768, 34167, 1);
		this.aClass121_Sub3_17.method5717(0, 34168);
		this.aClass121_Sub3_17.method5648(0);
		this.aClass121_Sub3_17.method5713(this.aClass35_Sub3_Sub1_1);
		this.aClass121_Sub3_17.method5659(7681, 34479);
		this.aClass121_Sub3_17.method5685(768, 34166, 1);
		if (this.anInt3035 == 0) {
			this.aClass121_Sub3_17.method5675(0.5F, 0.5F, 0.0F, 1.0F);
		} else if (this.anInt3035 == 1) {
			this.aClass121_Sub3_17.method5675(1.0F, 0.5F, 0.0F, 0.5F);
		} else if (this.anInt3035 == 2) {
			this.aClass121_Sub3_17.method5675(0.5F, 1.0F, 0.0F, 0.5F);
		} else if (this.anInt3035 == 3) {
			this.aClass121_Sub3_17.method5675(128.5F, 128.5F, 0.0F, 128.5F);
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IILclient!fa;II)V")
	@Override
	public void method6510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class16_Sub3 local6 = (Class16_Sub3) arg2;
		@Pc(9) Class35_Sub3_Sub1 local9 = local6.aClass35_Sub3_Sub1_3;
		this.aClass35_Sub3_Sub1_2.method5329(false);
		this.aClass121_Sub3_17.method5724();
		this.aClass121_Sub3_17.method5713(this.aClass35_Sub3_Sub1_2);
		this.aClass121_Sub3_17.method5684(1);
		this.aClass121_Sub3_17.method5648(1);
		this.aClass121_Sub3_17.method5713(local9);
		this.aClass121_Sub3_17.method5659(8448, 7681);
		this.aClass121_Sub3_17.method5685(768, 34168, 0);
		this.aClass121_Sub3_17.method5707(1);
		@Pc(62) int local62 = arg1 + this.anInt3039;
		@Pc(67) int local67 = arg0 + this.anInt3041;
		@Pc(74) int local74 = local67 + this.aClass35_Sub3_Sub1_2.anInt5653;
		@Pc(80) int local80 = this.aClass35_Sub3_Sub1_2.anInt5654 + local62;
		@Pc(87) float local87 = local9.aFloat128 / (float) local9.anInt5653;
		@Pc(94) float local94 = local9.aFloat129 / (float) local9.anInt5654;
		@Pc(102) float local102 = local87 * (float) (local67 - arg3);
		@Pc(110) float local110 = (float) (local74 - arg3) * local87;
		@Pc(121) float local121 = local9.aFloat129 - local94 * (float) (local62 - arg4);
		@Pc(133) float local133 = local9.aFloat129 - local94 * (float) (local80 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass35_Sub3_Sub1_2.aFloat129);
		OpenGL.glMultiTexCoord2f(33985, local102, local121);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local102, local133);
		OpenGL.glVertex2i(local67, this.aClass35_Sub3_Sub1_2.anInt5654 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass35_Sub3_Sub1_2.aFloat128, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local110, local133);
		OpenGL.glVertex2i(local67 + this.aClass35_Sub3_Sub1_2.anInt5653, local62 - -this.aClass35_Sub3_Sub1_2.anInt5654);
		OpenGL.glMultiTexCoord2f(33984, this.aClass35_Sub3_Sub1_2.aFloat128, this.aClass35_Sub3_Sub1_2.aFloat129);
		OpenGL.glMultiTexCoord2f(33985, local110, local121);
		OpenGL.glVertex2i(local67 + this.aClass35_Sub3_Sub1_2.anInt5653, local62);
		OpenGL.glEnd();
		this.aClass121_Sub3_17.method5685(768, 5890, 0);
		this.aClass121_Sub3_17.method5684(0);
		this.aClass121_Sub3_17.method5713(null);
		this.aClass121_Sub3_17.method5648(0);
	}

	@OriginalMember(owner = "client!gm", name = "QA", descriptor = "()I")
	@Override
	public int QA() {
		return this.aClass35_Sub3_Sub1_2.anInt5653;
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return this.aClass35_Sub3_Sub1_2.anInt5654;
	}

	@OriginalMember(owner = "client!gm", name = "ba", descriptor = "(IIIIIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		this.aClass35_Sub3_Sub1_2.method5329(false);
		@Pc(18) int local18 = arg3 + arg1;
		this.aClass121_Sub3_17.method5724();
		this.aClass121_Sub3_17.method5713(this.aClass35_Sub3_Sub1_2);
		this.aClass121_Sub3_17.method5707(arg6);
		this.aClass121_Sub3_17.method5684(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass35_Sub3_Sub1_2.aBoolean362 && !this.aBoolean203) {
			@Pc(338) float local338 = (float) arg3 * this.aClass35_Sub3_Sub1_2.aFloat129 / (float) this.aClass35_Sub3_Sub1_2.anInt5654;
			@Pc(350) float local350 = this.aClass35_Sub3_Sub1_2.aFloat128 * (float) arg2 / (float) this.aClass35_Sub3_Sub1_2.anInt5653;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local338);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local18);
			OpenGL.glTexCoord2f(local350, 0.0F);
			OpenGL.glVertex2i(local9, local18);
			OpenGL.glTexCoord2f(local350, local338);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt3041, (float) this.anInt3039, 0.0F);
		@Pc(72) int local72 = this.AA();
		@Pc(75) int local75 = this.a();
		@Pc(82) int local82 = arg1 + this.aClass35_Sub3_Sub1_2.anInt5654;
		OpenGL.glBegin(7);
		@Pc(86) int local86 = arg1;
		@Pc(94) int local94;
		while (local82 <= local18) {
			local94 = this.aClass35_Sub3_Sub1_2.anInt5653 + arg0;
			@Pc(96) int local96 = arg0;
			while (local94 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass35_Sub3_Sub1_2.aFloat129);
				OpenGL.glVertex2i(local96, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local96, local82);
				OpenGL.glTexCoord2f(this.aClass35_Sub3_Sub1_2.aFloat128, 0.0F);
				OpenGL.glVertex2i(local94, local82);
				OpenGL.glTexCoord2f(this.aClass35_Sub3_Sub1_2.aFloat128, this.aClass35_Sub3_Sub1_2.aFloat129);
				OpenGL.glVertex2i(local94, local86);
				local96 += local72;
				local94 += local72;
			}
			if (local96 < local9) {
				@Pc(163) float local163 = (float) (local9 - local96) * this.aClass35_Sub3_Sub1_2.aFloat128 / (float) this.aClass35_Sub3_Sub1_2.anInt5653;
				OpenGL.glTexCoord2f(0.0F, this.aClass35_Sub3_Sub1_2.aFloat129);
				OpenGL.glVertex2i(local96, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local96, local82);
				OpenGL.glTexCoord2f(local163, 0.0F);
				OpenGL.glVertex2i(local9, local82);
				OpenGL.glTexCoord2f(local163, this.aClass35_Sub3_Sub1_2.aFloat129);
				OpenGL.glVertex2i(local9, local86);
			}
			local86 += local75;
			local82 += local75;
		}
		if (local18 > local86) {
			@Pc(224) float local224 = this.aClass35_Sub3_Sub1_2.aFloat129 * (float) (this.aClass35_Sub3_Sub1_2.anInt5654 + local86 - local18) / (float) this.aClass35_Sub3_Sub1_2.anInt5654;
			@Pc(230) int local230 = this.aClass35_Sub3_Sub1_2.anInt5653 + arg0;
			local94 = arg0;
			while (local230 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass35_Sub3_Sub1_2.aFloat129);
				OpenGL.glVertex2i(local94, local86);
				OpenGL.glTexCoord2f(0.0F, local224);
				OpenGL.glVertex2i(local94, local18);
				OpenGL.glTexCoord2f(this.aClass35_Sub3_Sub1_2.aFloat128, local224);
				OpenGL.glVertex2i(local230, local18);
				OpenGL.glTexCoord2f(this.aClass35_Sub3_Sub1_2.aFloat128, this.aClass35_Sub3_Sub1_2.aFloat129);
				OpenGL.glVertex2i(local230, local86);
				local94 += local72;
				local230 += local72;
			}
			if (local94 < local9) {
				@Pc(295) float local295 = this.aClass35_Sub3_Sub1_2.aFloat128 * (float) (local9 - local94) / (float) this.aClass35_Sub3_Sub1_2.anInt5653;
				OpenGL.glTexCoord2f(0.0F, this.aClass35_Sub3_Sub1_2.aFloat129);
				OpenGL.glVertex2i(local94, local86);
				OpenGL.glTexCoord2f(0.0F, local224);
				OpenGL.glVertex2i(local94, local18);
				OpenGL.glTexCoord2f(local295, local224);
				OpenGL.glVertex2i(local9, local18);
				OpenGL.glTexCoord2f(local295, this.aClass35_Sub3_Sub1_2.aFloat129);
				OpenGL.glVertex2i(local9, local86);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!gm", name = "sa", descriptor = "(FFFFFFIII)V")
	@Override
	protected void sa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean203) {
			local6 = this.AA();
			local10 = this.a();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(23) float local23 = (arg3 - arg1) / local6;
			@Pc(30) float local30 = (arg4 - arg0) / local10;
			@Pc(36) float local36 = (arg5 - arg1) / local10;
			@Pc(42) float local42 = local30 * (float) this.anInt3039;
			@Pc(48) float local48 = local36 * (float) this.anInt3039;
			@Pc(54) float local54 = (float) this.anInt3041 * local16;
			@Pc(60) float local60 = (float) this.anInt3041 * local23;
			@Pc(67) float local67 = (float) this.anInt3022 * -local16;
			@Pc(74) float local74 = -local23 * (float) this.anInt3022;
			@Pc(81) float local81 = -local30 * (float) this.anInt3029;
			arg3 = local48 + local74 + arg3;
			arg1 = local60 + arg1 + local48;
			@Pc(100) float local100 = (float) this.anInt3029 * -local36;
			arg4 = local81 + arg4 + local54;
			arg2 = local67 + arg2 + local42;
			arg0 = arg0 + local54 + local42;
			arg5 = arg5 + local60 + local100;
		}
		local6 = arg4 + arg2 - arg0;
		local10 = arg5 + arg3 - arg1;
		this.aClass35_Sub3_Sub1_2.method5329(true);
		this.aClass121_Sub3_17.method5724();
		this.aClass121_Sub3_17.method5713(this.aClass35_Sub3_Sub1_2);
		this.aClass121_Sub3_17.method5707(arg8);
		this.aClass121_Sub3_17.method5684(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass35_Sub3_Sub1_2.aFloat129);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass35_Sub3_Sub1_2.aFloat128, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass35_Sub3_Sub1_2.aFloat128, this.aClass35_Sub3_Sub1_2.aFloat129);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!gm", name = "t", descriptor = "(III)V")
	@Override
	public void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass35_Sub3_Sub1_1 = Static11.method180(this.aClass35_Sub3_Sub1_2.anInt5654, arg0, this.aClass121_Sub3_17, arg1, this.aClass35_Sub3_Sub1_2.anInt5653);
		this.anInt3035 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!gm", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3039 = arg1;
		this.anInt3041 = arg0;
		this.anInt3022 = arg2;
		this.anInt3029 = arg3;
		this.aBoolean203 = this.anInt3041 != 0 || this.anInt3039 != 0 || this.anInt3022 != 0 || this.anInt3029 != 0;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(FFFFFFLclient!fa;II)V")
	@Override
	protected void method6508(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class16 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class35_Sub3_Sub1 local7 = ((Class16_Sub3) arg6).aClass35_Sub3_Sub1_3;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(30) float local30;
		if (this.aBoolean203) {
			local14 = this.AA();
			local18 = this.a();
			local24 = (arg2 - arg0) / local14;
			local30 = (arg3 - arg1) / local14;
			@Pc(37) float local37 = (arg4 - arg0) / local18;
			@Pc(43) float local43 = (arg5 - arg1) / local18;
			@Pc(49) float local49 = (float) this.anInt3039 * local37;
			@Pc(55) float local55 = (float) this.anInt3039 * local43;
			@Pc(61) float local61 = local24 * (float) this.anInt3041;
			@Pc(67) float local67 = (float) this.anInt3041 * local30;
			@Pc(74) float local74 = -local24 * (float) this.anInt3022;
			@Pc(81) float local81 = (float) this.anInt3022 * -local30;
			@Pc(88) float local88 = (float) this.anInt3029 * -local37;
			arg2 = local49 + local74 + arg2;
			arg4 = local88 + arg4 + local61;
			arg3 = local55 + arg3 + local81;
			arg1 = local55 + local67 + arg1;
			arg0 = local49 + local61 + arg0;
			@Pc(125) float local125 = (float) this.anInt3029 * -local43;
			arg5 = arg5 + local67 + local125;
		}
		local14 = arg2 + arg4 - arg0;
		this.aClass35_Sub3_Sub1_2.method5329(true);
		local18 = arg5 + arg3 - arg1;
		this.aClass121_Sub3_17.method5724();
		this.aClass121_Sub3_17.method5713(this.aClass35_Sub3_Sub1_2);
		this.aClass121_Sub3_17.method5684(1);
		this.aClass121_Sub3_17.method5648(1);
		this.aClass121_Sub3_17.method5713(local7);
		this.aClass121_Sub3_17.method5659(8448, 7681);
		this.aClass121_Sub3_17.method5685(768, 34168, 0);
		this.aClass121_Sub3_17.method5707(1);
		local24 = local7.aFloat128 / (float) local7.anInt5653;
		local30 = local7.aFloat129 / (float) local7.anInt5654;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass35_Sub3_Sub1_2.aFloat129);
		OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * local24, local7.aFloat129 - (arg1 - (float) arg8) * local30);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg4) * local24, local7.aFloat129 - ((float) -arg8 + arg5) * local30);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass35_Sub3_Sub1_2.aFloat128, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * (local14 - (float) arg7), local7.aFloat129 - local30 * (local18 - (float) arg8));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass35_Sub3_Sub1_2.aFloat128, this.aClass35_Sub3_Sub1_2.aFloat129);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg2 - (float) arg7), local7.aFloat129 - ((float) -arg8 + arg3) * local30);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass121_Sub3_17.method5685(768, 5890, 0);
		this.aClass121_Sub3_17.method5684(0);
		this.aClass121_Sub3_17.method5713(null);
		this.aClass121_Sub3_17.method5648(0);
	}

	@OriginalMember(owner = "client!gm", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.aClass35_Sub3_Sub1_2.anInt5653 + this.anInt3041 + this.anInt3022;
	}

	@OriginalMember(owner = "client!gm", name = "GA", descriptor = "(IIIIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass35_Sub3_Sub1_2.method4858(arg1, arg4, arg0, arg5, arg3, arg2);
	}

	@OriginalMember(owner = "client!gm", name = "I", descriptor = "(IIIII)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass35_Sub3_Sub1_2.method5329(false);
		this.aClass121_Sub3_17.method5724();
		this.aClass121_Sub3_17.method5707(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt3039;
		@Pc(42) int local42 = arg0 + this.anInt3041;
		if (this.aClass35_Sub3_Sub1_1 == null) {
			this.aClass121_Sub3_17.method5713(this.aClass35_Sub3_Sub1_2);
			this.aClass121_Sub3_17.method5684(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass35_Sub3_Sub1_2.aFloat129);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, this.aClass35_Sub3_Sub1_2.anInt5654 + local37);
			OpenGL.glTexCoord2f(this.aClass35_Sub3_Sub1_2.aFloat128, 0.0F);
			OpenGL.glVertex2i(this.aClass35_Sub3_Sub1_2.anInt5653 + local42, this.aClass35_Sub3_Sub1_2.anInt5654 + local37);
			OpenGL.glTexCoord2f(this.aClass35_Sub3_Sub1_2.aFloat128, this.aClass35_Sub3_Sub1_2.aFloat129);
			OpenGL.glVertex2i(this.aClass35_Sub3_Sub1_2.anInt5653 + local42, local37);
			OpenGL.glEnd();
			return;
		}
		this.method2609(arg2);
		this.aClass35_Sub3_Sub1_1.method5329(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass35_Sub3_Sub1_2.aFloat129);
		OpenGL.glTexCoord2f(0.0F, this.aClass35_Sub3_Sub1_2.aFloat129);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, local37 + this.aClass35_Sub3_Sub1_2.anInt5654);
		OpenGL.glMultiTexCoord2f(33985, this.aClass35_Sub3_Sub1_2.aFloat128, 0.0F);
		OpenGL.glTexCoord2f(this.aClass35_Sub3_Sub1_2.aFloat128, 0.0F);
		OpenGL.glVertex2i(local42 + this.aClass35_Sub3_Sub1_2.anInt5653, this.aClass35_Sub3_Sub1_2.anInt5654 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass35_Sub3_Sub1_2.aFloat128, this.aClass35_Sub3_Sub1_2.aFloat129);
		OpenGL.glTexCoord2f(this.aClass35_Sub3_Sub1_2.aFloat128, this.aClass35_Sub3_Sub1_2.aFloat129);
		OpenGL.glVertex2i(local42 + this.aClass35_Sub3_Sub1_2.anInt5653, local37);
		OpenGL.glEnd();
		this.method2608();
	}

	@OriginalMember(owner = "client!gm", name = "KA", descriptor = "(IIIIIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass35_Sub3_Sub1_2.method5329(true);
		this.aClass121_Sub3_17.method5724();
		this.aClass121_Sub3_17.method5707(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean203) {
			@Pc(42) float local42 = (float) arg2 / (float) this.AA();
			@Pc(49) float local49 = (float) arg3 / (float) this.a();
			@Pc(58) float local58 = (float) arg0 + (float) this.anInt3041 * local42;
			@Pc(67) float local67 = (float) this.anInt3039 * local49 + (float) arg1;
			@Pc(76) float local76 = (float) this.aClass35_Sub3_Sub1_2.anInt5653 * local42 + local58;
			@Pc(85) float local85 = local67 + local49 * (float) this.aClass35_Sub3_Sub1_2.anInt5654;
			if (this.aClass35_Sub3_Sub1_1 == null) {
				this.aClass121_Sub3_17.method5713(this.aClass35_Sub3_Sub1_2);
				this.aClass121_Sub3_17.method5684(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass35_Sub3_Sub1_2.aFloat129);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glTexCoord2f(this.aClass35_Sub3_Sub1_2.aFloat128, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glTexCoord2f(this.aClass35_Sub3_Sub1_2.aFloat128, this.aClass35_Sub3_Sub1_2.aFloat129);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
			} else {
				this.method2609(arg4);
				this.aClass35_Sub3_Sub1_1.method5329(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass35_Sub3_Sub1_2.aFloat129);
				OpenGL.glTexCoord2f(0.0F, this.aClass35_Sub3_Sub1_2.aFloat129);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass35_Sub3_Sub1_2.aFloat128, 0.0F);
				OpenGL.glTexCoord2f(this.aClass35_Sub3_Sub1_2.aFloat128, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass35_Sub3_Sub1_2.aFloat128, this.aClass35_Sub3_Sub1_2.aFloat129);
				OpenGL.glTexCoord2f(this.aClass35_Sub3_Sub1_2.aFloat128, this.aClass35_Sub3_Sub1_2.aFloat129);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
				this.method2608();
			}
		} else if (this.aClass35_Sub3_Sub1_1 == null) {
			this.aClass121_Sub3_17.method5713(this.aClass35_Sub3_Sub1_2);
			this.aClass121_Sub3_17.method5684(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass35_Sub3_Sub1_2.aFloat129);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass35_Sub3_Sub1_2.aFloat128, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass35_Sub3_Sub1_2.aFloat128, this.aClass35_Sub3_Sub1_2.aFloat129);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method2609(arg4);
			this.aClass35_Sub3_Sub1_1.method5329(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass35_Sub3_Sub1_2.aFloat129);
			OpenGL.glTexCoord2f(0.0F, this.aClass35_Sub3_Sub1_2.aFloat129);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass35_Sub3_Sub1_2.aFloat128, 0.0F);
			OpenGL.glTexCoord2f(this.aClass35_Sub3_Sub1_2.aFloat128, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass35_Sub3_Sub1_2.aFloat128, this.aClass35_Sub3_Sub1_2.aFloat129);
			OpenGL.glTexCoord2f(this.aClass35_Sub3_Sub1_2.aFloat128, this.aClass35_Sub3_Sub1_2.aFloat129);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method2608();
		}
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "()I")
	@Override
	public int a() {
		return this.anInt3039 + this.aClass35_Sub3_Sub1_2.anInt5654 + this.anInt3029;
	}
}
