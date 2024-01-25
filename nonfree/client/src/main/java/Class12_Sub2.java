import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "Lclient!js;")
	private Class40_Sub3_Sub1 aClass40_Sub3_Sub1_5;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "Z")
	private boolean aBoolean473 = false;

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
	private int anInt6976 = 0;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
	private int anInt6968 = 0;

	@OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
	private int anInt6984 = 0;

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
	private int anInt6977 = 0;

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
	private int anInt6974 = 0;

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Lclient!bl;")
	private final Class28_Sub1 aClass28_Sub1_41;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "Lclient!js;")
	private final Class40_Sub3_Sub1 aClass40_Sub3_Sub1_4;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!bl;IIII)V")
	public Class12_Sub2(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass28_Sub1_41 = arg0;
		this.aClass40_Sub3_Sub1_4 = Static281.method4250(arg4, arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!bl;II[III)V")
	public Class12_Sub2(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass28_Sub1_41 = arg0;
		this.aClass40_Sub3_Sub1_4 = Static203.method3208(arg3, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6977 = arg1;
		this.anInt6976 = arg2;
		this.anInt6984 = arg0;
		this.anInt6968 = arg3;
		this.aBoolean473 = this.anInt6984 != 0 || this.anInt6977 != 0 || this.anInt6976 != 0 || this.anInt6968 != 0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "()I")
	@Override
	public int method5654() {
		return this.aClass40_Sub3_Sub1_4.anInt3384 + this.anInt6984 + this.anInt6976;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method5658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass40_Sub3_Sub1_4.method5148(false);
		this.aClass28_Sub1_41.method648();
		this.aClass28_Sub1_41.method708(1);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt6977;
		@Pc(42) int local42 = arg0 + this.anInt6984;
		if (this.aClass40_Sub3_Sub1_5 == null) {
			this.aClass28_Sub1_41.method654(this.aClass40_Sub3_Sub1_4);
			this.aClass28_Sub1_41.method678(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass40_Sub3_Sub1_4.aFloat62);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, this.aClass40_Sub3_Sub1_4.anInt3385 + local37);
			OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_4.aFloat61, 0.0F);
			OpenGL.glVertex2i(this.aClass40_Sub3_Sub1_4.anInt3384 + local42, this.aClass40_Sub3_Sub1_4.anInt3385 + local37);
			OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_4.aFloat61, this.aClass40_Sub3_Sub1_4.aFloat62);
			OpenGL.glVertex2i(local42 + this.aClass40_Sub3_Sub1_4.anInt3384, local37);
			OpenGL.glEnd();
			return;
		}
		this.method5675(arg2);
		this.aClass40_Sub3_Sub1_5.method5148(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass40_Sub3_Sub1_4.aFloat62);
		OpenGL.glTexCoord2f(0.0F, this.aClass40_Sub3_Sub1_4.aFloat62);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, local37 + this.aClass40_Sub3_Sub1_4.anInt3385);
		OpenGL.glMultiTexCoord2f(33985, this.aClass40_Sub3_Sub1_4.aFloat61, 0.0F);
		OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_4.aFloat61, 0.0F);
		OpenGL.glVertex2i(local42 + this.aClass40_Sub3_Sub1_4.anInt3384, this.aClass40_Sub3_Sub1_4.anInt3385 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass40_Sub3_Sub1_4.aFloat61, this.aClass40_Sub3_Sub1_4.aFloat62);
		OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_4.aFloat61, this.aClass40_Sub3_Sub1_4.aFloat62);
		OpenGL.glVertex2i(this.aClass40_Sub3_Sub1_4.anInt3384 + local42, local37);
		OpenGL.glEnd();
		this.method5676();
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "()I")
	@Override
	public int method5664() {
		return this.aClass40_Sub3_Sub1_4.anInt3385;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method5669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(9) int local9 = arg2 + arg0;
		this.aClass40_Sub3_Sub1_4.method5148(false);
		@Pc(18) int local18 = arg3 + arg1;
		this.aClass28_Sub1_41.method648();
		this.aClass28_Sub1_41.method654(this.aClass40_Sub3_Sub1_4);
		this.aClass28_Sub1_41.method708(1);
		this.aClass28_Sub1_41.method678(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass40_Sub3_Sub1_4.aBoolean236 && !this.aBoolean473) {
			@Pc(349) float local349 = this.aClass40_Sub3_Sub1_4.aFloat62 * (float) arg3 / (float) this.aClass40_Sub3_Sub1_4.anInt3385;
			@Pc(361) float local361 = (float) arg2 * this.aClass40_Sub3_Sub1_4.aFloat61 / (float) this.aClass40_Sub3_Sub1_4.anInt3384;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local349);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local18);
			OpenGL.glTexCoord2f(local361, 0.0F);
			OpenGL.glVertex2i(local9, local18);
			OpenGL.glTexCoord2f(local361, local349);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt6984, (float) this.anInt6977, 0.0F);
		@Pc(72) int local72 = this.method5654();
		@Pc(75) int local75 = this.method5655();
		@Pc(81) int local81 = this.aClass40_Sub3_Sub1_4.anInt3385 + arg1;
		OpenGL.glBegin(7);
		@Pc(85) int local85 = arg1;
		@Pc(94) int local94;
		while (local81 <= local18) {
			local94 = arg0 + this.aClass40_Sub3_Sub1_4.anInt3384;
			@Pc(96) int local96 = arg0;
			while (local94 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass40_Sub3_Sub1_4.aFloat62);
				OpenGL.glVertex2i(local96, local85);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local96, local81);
				OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_4.aFloat61, 0.0F);
				OpenGL.glVertex2i(local94, local81);
				OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_4.aFloat61, this.aClass40_Sub3_Sub1_4.aFloat62);
				OpenGL.glVertex2i(local94, local85);
				local94 += local72;
				local96 += local72;
			}
			if (local9 > local96) {
				@Pc(163) float local163 = this.aClass40_Sub3_Sub1_4.aFloat61 * (float) (local9 - local96) / (float) this.aClass40_Sub3_Sub1_4.anInt3384;
				OpenGL.glTexCoord2f(0.0F, this.aClass40_Sub3_Sub1_4.aFloat62);
				OpenGL.glVertex2i(local96, local85);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local96, local81);
				OpenGL.glTexCoord2f(local163, 0.0F);
				OpenGL.glVertex2i(local9, local81);
				OpenGL.glTexCoord2f(local163, this.aClass40_Sub3_Sub1_4.aFloat62);
				OpenGL.glVertex2i(local9, local85);
			}
			local81 += local75;
			local85 += local75;
		}
		if (local85 < local18) {
			@Pc(228) float local228 = this.aClass40_Sub3_Sub1_4.aFloat62 * (float) (this.aClass40_Sub3_Sub1_4.anInt3385 + local85 - local18) / (float) this.aClass40_Sub3_Sub1_4.anInt3385;
			@Pc(234) int local234 = this.aClass40_Sub3_Sub1_4.anInt3384 + arg0;
			local94 = arg0;
			while (local9 >= local234) {
				OpenGL.glTexCoord2f(0.0F, this.aClass40_Sub3_Sub1_4.aFloat62);
				OpenGL.glVertex2i(local94, local85);
				OpenGL.glTexCoord2f(0.0F, local228);
				OpenGL.glVertex2i(local94, local18);
				OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_4.aFloat61, local228);
				OpenGL.glVertex2i(local234, local18);
				OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_4.aFloat61, this.aClass40_Sub3_Sub1_4.aFloat62);
				OpenGL.glVertex2i(local234, local85);
				local234 += local72;
				local94 += local72;
			}
			if (local9 > local94) {
				@Pc(306) float local306 = this.aClass40_Sub3_Sub1_4.aFloat61 * (float) (local9 - local94) / (float) this.aClass40_Sub3_Sub1_4.anInt3384;
				OpenGL.glTexCoord2f(0.0F, this.aClass40_Sub3_Sub1_4.aFloat62);
				OpenGL.glVertex2i(local94, local85);
				OpenGL.glTexCoord2f(0.0F, local228);
				OpenGL.glVertex2i(local94, local18);
				OpenGL.glTexCoord2f(local306, local228);
				OpenGL.glVertex2i(local9, local18);
				OpenGL.glTexCoord2f(local306, this.aClass40_Sub3_Sub1_4.aFloat62);
				OpenGL.glVertex2i(local9, local85);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)V")
	@Override
	public void method5660(@OriginalArg(2) int arg0) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass40_Sub3_Sub1_5 = Static281.method4250(this.aClass40_Sub3_Sub1_4.anInt3385, this.aClass28_Sub1_41, 0, this.aClass40_Sub3_Sub1_4.anInt3384, 0);
		this.anInt6974 = arg0;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(FFFFFFLclient!be;II)V")
	@Override
	protected void method5671(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class24 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class40_Sub3_Sub1 local7 = ((Class24_Sub2) arg6).aClass40_Sub3_Sub1_2;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(32) float local32;
		if (this.aBoolean473) {
			local14 = this.method5654();
			local18 = this.method5655();
			local25 = (arg2 - arg0) / local14;
			local32 = (arg3 - arg1) / local14;
			@Pc(39) float local39 = (arg4 - arg0) / local18;
			@Pc(45) float local45 = (arg5 - arg1) / local18;
			@Pc(51) float local51 = local39 * (float) this.anInt6977;
			@Pc(57) float local57 = local45 * (float) this.anInt6977;
			@Pc(63) float local63 = (float) this.anInt6984 * local25;
			@Pc(69) float local69 = (float) this.anInt6984 * local32;
			@Pc(76) float local76 = -local25 * (float) this.anInt6976;
			@Pc(83) float local83 = -local32 * (float) this.anInt6976;
			@Pc(90) float local90 = -local39 * (float) this.anInt6968;
			@Pc(97) float local97 = (float) this.anInt6968 * -local45;
			arg1 = arg1 + local69 + local57;
			arg4 = local90 + arg4 + local63;
			arg0 = arg0 + local63 + local51;
			arg2 = local76 + arg2 + local51;
			arg3 = local83 + arg3 + local57;
			arg5 = local69 + arg5 + local97;
		}
		local14 = arg2 + arg4 - arg0;
		this.aClass40_Sub3_Sub1_4.method5148(true);
		local18 = arg5 + arg3 - arg1;
		this.aClass28_Sub1_41.method648();
		this.aClass28_Sub1_41.method654(this.aClass40_Sub3_Sub1_4);
		this.aClass28_Sub1_41.method678(1);
		this.aClass28_Sub1_41.method650(1);
		this.aClass28_Sub1_41.method654(local7);
		this.aClass28_Sub1_41.method692(8448, 7681);
		this.aClass28_Sub1_41.method665(34168, 768, 0);
		this.aClass28_Sub1_41.method708(1);
		local25 = local7.aFloat61 / (float) local7.anInt3384;
		local32 = local7.aFloat62 / (float) local7.anInt3385;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass40_Sub3_Sub1_4.aFloat62);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + arg0), local7.aFloat62 - local32 * (arg1 - (float) arg8));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * local25, local7.aFloat62 - ((float) -arg8 + arg5) * local32);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass40_Sub3_Sub1_4.aFloat61, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + local14) * local25, local7.aFloat62 - ((float) -arg8 + local18) * local32);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass40_Sub3_Sub1_4.aFloat61, this.aClass40_Sub3_Sub1_4.aFloat62);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg2) * local25, local7.aFloat62 - ((float) -arg8 + arg3) * local32);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass28_Sub1_41.method665(5890, 768, 0);
		this.aClass28_Sub1_41.method678(0);
		this.aClass28_Sub1_41.method654(null);
		this.aClass28_Sub1_41.method650(0);
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "()I")
	@Override
	public int method5672() {
		return this.aClass40_Sub3_Sub1_4.anInt3384;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)V")
	private void method5675(@OriginalArg(1) int arg0) {
		this.aClass28_Sub1_41.method650(1);
		this.aClass28_Sub1_41.method654(this.aClass40_Sub3_Sub1_4);
		this.aClass28_Sub1_41.method692(7681, this.aClass28_Sub1_41.method693(arg0));
		this.aClass28_Sub1_41.method665(34167, 768, 1);
		this.aClass28_Sub1_41.method643(34168, 0);
		this.aClass28_Sub1_41.method650(0);
		this.aClass28_Sub1_41.method654(this.aClass40_Sub3_Sub1_5);
		this.aClass28_Sub1_41.method692(7681, 34479);
		this.aClass28_Sub1_41.method665(34166, 768, 1);
		if (this.anInt6974 == 0) {
			this.aClass28_Sub1_41.method704(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt6974 == 1) {
			this.aClass28_Sub1_41.method704(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt6974 == 2) {
			this.aClass28_Sub1_41.method704(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt6974 == 3) {
			this.aClass28_Sub1_41.method704(128.5F, 128.5F, 128.5F, 0.0F);
			return;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
	private void method5676() {
		this.aClass28_Sub1_41.method650(1);
		this.aClass28_Sub1_41.method654(null);
		this.aClass28_Sub1_41.method692(8448, 8448);
		this.aClass28_Sub1_41.method665(34168, 768, 1);
		this.aClass28_Sub1_41.method643(5890, 0);
		this.aClass28_Sub1_41.method650(0);
		this.aClass28_Sub1_41.method665(34168, 768, 1);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected void method5668(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean473) {
			local6 = this.method5654();
			local10 = this.method5655();
			@Pc(17) float local17 = (arg2 - arg0) / local6;
			@Pc(23) float local23 = (arg3 - arg1) / local6;
			@Pc(29) float local29 = (arg4 - arg0) / local10;
			@Pc(35) float local35 = (arg5 - arg1) / local10;
			@Pc(41) float local41 = local29 * (float) this.anInt6977;
			@Pc(47) float local47 = (float) this.anInt6977 * local35;
			@Pc(53) float local53 = (float) this.anInt6984 * local17;
			@Pc(59) float local59 = local23 * (float) this.anInt6984;
			@Pc(66) float local66 = -local17 * (float) this.anInt6976;
			@Pc(73) float local73 = (float) this.anInt6976 * -local23;
			@Pc(80) float local80 = -local29 * (float) this.anInt6968;
			arg3 = local47 + local73 + arg3;
			@Pc(93) float local93 = (float) this.anInt6968 * -local35;
			arg2 = local41 + arg2 + local66;
			arg1 = local47 + local59 + arg1;
			arg4 = local53 + arg4 + local80;
			arg0 = local53 + arg0 + local41;
			arg5 = local93 + arg5 + local59;
		}
		local6 = arg2 + arg4 - arg0;
		local10 = arg5 + arg3 - arg1;
		this.aClass40_Sub3_Sub1_4.method5148(true);
		this.aClass28_Sub1_41.method648();
		this.aClass28_Sub1_41.method654(this.aClass40_Sub3_Sub1_4);
		this.aClass28_Sub1_41.method708(1);
		this.aClass28_Sub1_41.method678(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass40_Sub3_Sub1_4.aFloat62);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_4.aFloat61, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_4.aFloat61, this.aClass40_Sub3_Sub1_4.aFloat62);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass40_Sub3_Sub1_4.method5148(true);
		this.aClass28_Sub1_41.method648();
		this.aClass28_Sub1_41.method708(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean473) {
			@Pc(42) float local42 = (float) arg2 / (float) this.method5654();
			@Pc(49) float local49 = (float) arg3 / (float) this.method5655();
			@Pc(58) float local58 = (float) arg0 + (float) this.anInt6984 * local42;
			@Pc(67) float local67 = local49 * (float) this.anInt6977 + (float) arg1;
			@Pc(76) float local76 = local58 + local42 * (float) this.aClass40_Sub3_Sub1_4.anInt3384;
			@Pc(85) float local85 = (float) this.aClass40_Sub3_Sub1_4.anInt3385 * local49 + local67;
			if (this.aClass40_Sub3_Sub1_5 == null) {
				this.aClass28_Sub1_41.method654(this.aClass40_Sub3_Sub1_4);
				this.aClass28_Sub1_41.method678(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass40_Sub3_Sub1_4.aFloat62);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_4.aFloat61, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_4.aFloat61, this.aClass40_Sub3_Sub1_4.aFloat62);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
			} else {
				this.method5675(arg4);
				this.aClass40_Sub3_Sub1_5.method5148(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass40_Sub3_Sub1_4.aFloat62);
				OpenGL.glTexCoord2f(0.0F, this.aClass40_Sub3_Sub1_4.aFloat62);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass40_Sub3_Sub1_4.aFloat61, 0.0F);
				OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_4.aFloat61, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass40_Sub3_Sub1_4.aFloat61, this.aClass40_Sub3_Sub1_4.aFloat62);
				OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_4.aFloat61, this.aClass40_Sub3_Sub1_4.aFloat62);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
				this.method5676();
			}
		} else if (this.aClass40_Sub3_Sub1_5 == null) {
			this.aClass28_Sub1_41.method654(this.aClass40_Sub3_Sub1_4);
			this.aClass28_Sub1_41.method678(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass40_Sub3_Sub1_4.aFloat62);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_4.aFloat61, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_4.aFloat61, this.aClass40_Sub3_Sub1_4.aFloat62);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method5675(arg4);
			this.aClass40_Sub3_Sub1_5.method5148(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass40_Sub3_Sub1_4.aFloat62);
			OpenGL.glTexCoord2f(0.0F, this.aClass40_Sub3_Sub1_4.aFloat62);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass40_Sub3_Sub1_4.aFloat61, 0.0F);
			OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_4.aFloat61, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass40_Sub3_Sub1_4.aFloat61, this.aClass40_Sub3_Sub1_4.aFloat62);
			OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_4.aFloat61, this.aClass40_Sub3_Sub1_4.aFloat62);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method5676();
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "()I")
	@Override
	public int method5655() {
		return this.anInt6968 + this.aClass40_Sub3_Sub1_4.anInt3385 + this.anInt6977;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILclient!be;II)V")
	@Override
	public void method5662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class24 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class24_Sub2 local6 = (Class24_Sub2) arg2;
		@Pc(9) Class40_Sub3_Sub1 local9 = local6.aClass40_Sub3_Sub1_2;
		this.aClass40_Sub3_Sub1_4.method5148(false);
		this.aClass28_Sub1_41.method648();
		this.aClass28_Sub1_41.method654(this.aClass40_Sub3_Sub1_4);
		this.aClass28_Sub1_41.method678(1);
		this.aClass28_Sub1_41.method650(1);
		this.aClass28_Sub1_41.method654(local9);
		this.aClass28_Sub1_41.method692(8448, 7681);
		this.aClass28_Sub1_41.method665(34168, 768, 0);
		this.aClass28_Sub1_41.method708(1);
		@Pc(62) int local62 = arg0 + this.anInt6984;
		@Pc(67) int local67 = arg1 + this.anInt6977;
		@Pc(73) int local73 = this.aClass40_Sub3_Sub1_4.anInt3384 + local62;
		@Pc(79) int local79 = this.aClass40_Sub3_Sub1_4.anInt3385 + local67;
		@Pc(86) float local86 = local9.aFloat61 / (float) local9.anInt3384;
		@Pc(93) float local93 = local9.aFloat62 / (float) local9.anInt3385;
		@Pc(100) float local100 = local86 * (float) (local62 - arg3);
		@Pc(108) float local108 = (float) (local73 - arg3) * local86;
		@Pc(120) float local120 = local9.aFloat62 - (float) (local67 - arg4) * local93;
		@Pc(131) float local131 = local9.aFloat62 - (float) (local79 - arg4) * local93;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass40_Sub3_Sub1_4.aFloat62);
		OpenGL.glMultiTexCoord2f(33985, local100, local120);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local100, local131);
		OpenGL.glVertex2i(local62, local67 + this.aClass40_Sub3_Sub1_4.anInt3385);
		OpenGL.glMultiTexCoord2f(33984, this.aClass40_Sub3_Sub1_4.aFloat61, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local108, local131);
		OpenGL.glVertex2i(local62 + this.aClass40_Sub3_Sub1_4.anInt3384, this.aClass40_Sub3_Sub1_4.anInt3385 + local67);
		OpenGL.glMultiTexCoord2f(33984, this.aClass40_Sub3_Sub1_4.aFloat61, this.aClass40_Sub3_Sub1_4.aFloat62);
		OpenGL.glMultiTexCoord2f(33985, local108, local120);
		OpenGL.glVertex2i(this.aClass40_Sub3_Sub1_4.anInt3384 + local62, local67);
		OpenGL.glEnd();
		this.aClass28_Sub1_41.method665(5890, 768, 0);
		this.aClass28_Sub1_41.method678(0);
		this.aClass28_Sub1_41.method654(null);
		this.aClass28_Sub1_41.method650(0);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass40_Sub3_Sub1_4.method3026(arg3, arg0, arg2, arg1);
	}
}
