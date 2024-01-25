import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class21_Sub1 extends Class21 {

	@OriginalMember(owner = "client!ao", name = "u", descriptor = "Lclient!tea;")
	private Class20_Sub4_Sub1 aClass20_Sub4_Sub1_2;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "Z")
	private boolean aBoolean87 = false;

	@OriginalMember(owner = "client!ao", name = "w", descriptor = "I")
	private int anInt943 = 0;

	@OriginalMember(owner = "client!ao", name = "z", descriptor = "I")
	private int anInt945 = 0;

	@OriginalMember(owner = "client!ao", name = "v", descriptor = "I")
	private int anInt942 = 0;

	@OriginalMember(owner = "client!ao", name = "r", descriptor = "I")
	private int anInt939 = 0;

	@OriginalMember(owner = "client!ao", name = "C", descriptor = "I")
	private int anInt948 = 0;

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "Lclient!nv;")
	private final Class16_Sub3 aClass16_Sub3_5;

	@OriginalMember(owner = "client!ao", name = "o", descriptor = "Lclient!tea;")
	private final Class20_Sub4_Sub1 aClass20_Sub4_Sub1_1;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!nv;IIZ)V")
	public Class21_Sub1(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass16_Sub3_5 = arg0;
		this.aClass20_Sub4_Sub1_1 = Static172.method3380(arg2, arg0, arg1, arg3 ? 6408 : 6407);
	}

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!nv;IIII)V")
	public Class21_Sub1(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass16_Sub3_5 = arg0;
		this.aClass20_Sub4_Sub1_1 = Static611.method8310(arg4, arg3, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!nv;II[III)V")
	public Class21_Sub1(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass16_Sub3_5 = arg0;
		this.aClass20_Sub4_Sub1_1 = Static605.method7732(arg3, arg2, arg1, arg5, arg4, arg0);
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "()I")
	@Override
	public int method5785() {
		return this.anInt945 + this.anInt939 + this.aClass20_Sub4_Sub1_1.anInt9362;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	private void method898() {
		this.aClass16_Sub3_5.method5944(1);
		this.aClass16_Sub3_5.method6020(null);
		this.aClass16_Sub3_5.method5957(8448, 8448);
		this.aClass16_Sub3_5.method6025(768, 1, 34168);
		this.aClass16_Sub3_5.method6029(0, 5890);
		this.aClass16_Sub3_5.method5944(0);
		this.aClass16_Sub3_5.method6025(768, 1, 34168);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass20_Sub4_Sub1_1.method7622(arg4, arg3, arg0, arg2, arg1, arg5);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(III)V")
	@Override
	public void method5794(@OriginalArg(2) int arg0) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass20_Sub4_Sub1_2 = Static611.method8310(this.aClass20_Sub4_Sub1_1.anInt9362, this.aClass20_Sub4_Sub1_1.anInt9361, 0, this.aClass16_Sub3_5, 0);
		this.anInt948 = arg0;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method5786(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean87) {
			local10 = this.method5779();
			local14 = this.method5785();
			@Pc(21) float local21 = (arg2 - arg0) / local10;
			@Pc(27) float local27 = (arg3 - arg1) / local10;
			@Pc(34) float local34 = (arg4 - arg0) / local14;
			@Pc(40) float local40 = (arg5 - arg1) / local14;
			@Pc(46) float local46 = local34 * (float) this.anInt939;
			@Pc(52) float local52 = (float) this.anInt939 * local40;
			@Pc(58) float local58 = (float) this.anInt942 * local21;
			@Pc(64) float local64 = local27 * (float) this.anInt942;
			@Pc(71) float local71 = -local21 * (float) this.anInt943;
			@Pc(78) float local78 = (float) this.anInt943 * -local27;
			@Pc(85) float local85 = (float) this.anInt945 * -local34;
			arg0 = local46 + local58 + arg0;
			arg3 = local78 + arg3 + local52;
			arg4 = local58 + arg4 + local85;
			arg1 = local52 + arg1 + local64;
			arg2 = local71 + arg2 + local46;
			@Pc(122) float local122 = -local40 * (float) this.anInt945;
			arg5 = local122 + local64 + arg5;
		}
		local10 = arg2 + arg4 - arg0;
		this.aClass20_Sub4_Sub1_1.method7620(true);
		local14 = arg5 + arg3 - arg1;
		this.aClass16_Sub3_5.method6019();
		this.aClass16_Sub3_5.method6020(this.aClass20_Sub4_Sub1_1);
		this.aClass16_Sub3_5.method6005(1);
		this.aClass16_Sub3_5.method5972(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub4_Sub1_1.aFloat189);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass20_Sub4_Sub1_1.aFloat188, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass20_Sub4_Sub1_1.aFloat188, this.aClass20_Sub4_Sub1_1.aFloat189);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "()I")
	@Override
	public int method5790() {
		return this.aClass20_Sub4_Sub1_1.anInt9361;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method5791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass20_Sub4_Sub1_1.method7620(false);
		this.aClass16_Sub3_5.method6019();
		this.aClass16_Sub3_5.method6005(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt942;
		@Pc(42) int local42 = arg1 + this.anInt939;
		if (this.aClass20_Sub4_Sub1_2 == null) {
			this.aClass16_Sub3_5.method6020(this.aClass20_Sub4_Sub1_1);
			this.aClass16_Sub3_5.method5972(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub4_Sub1_1.aFloat189);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, this.aClass20_Sub4_Sub1_1.anInt9362 + local42);
			OpenGL.glTexCoord2f(this.aClass20_Sub4_Sub1_1.aFloat188, 0.0F);
			OpenGL.glVertex2i(this.aClass20_Sub4_Sub1_1.anInt9361 + local37, this.aClass20_Sub4_Sub1_1.anInt9362 + local42);
			OpenGL.glTexCoord2f(this.aClass20_Sub4_Sub1_1.aFloat188, this.aClass20_Sub4_Sub1_1.aFloat189);
			OpenGL.glVertex2i(this.aClass20_Sub4_Sub1_1.anInt9361 + local37, local42);
			OpenGL.glEnd();
			return;
		}
		this.method900(arg2);
		this.aClass20_Sub4_Sub1_2.method7620(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass20_Sub4_Sub1_1.aFloat189);
		OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub4_Sub1_1.aFloat189);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, this.aClass20_Sub4_Sub1_1.anInt9362 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass20_Sub4_Sub1_1.aFloat188, 0.0F);
		OpenGL.glTexCoord2f(this.aClass20_Sub4_Sub1_1.aFloat188, 0.0F);
		OpenGL.glVertex2i(this.aClass20_Sub4_Sub1_1.anInt9361 + local37, local42 - -this.aClass20_Sub4_Sub1_1.anInt9362);
		OpenGL.glMultiTexCoord2f(33985, this.aClass20_Sub4_Sub1_1.aFloat188, this.aClass20_Sub4_Sub1_1.aFloat189);
		OpenGL.glTexCoord2f(this.aClass20_Sub4_Sub1_1.aFloat188, this.aClass20_Sub4_Sub1_1.aFloat189);
		OpenGL.glVertex2i(local37 + this.aClass20_Sub4_Sub1_1.anInt9361, local42);
		OpenGL.glEnd();
		this.method898();
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "()I")
	@Override
	public int method5783() {
		return this.aClass20_Sub4_Sub1_1.anInt9362;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		this.aClass20_Sub4_Sub1_1.method7620(false);
		@Pc(18) int local18 = arg3 + arg1;
		this.aClass16_Sub3_5.method6019();
		this.aClass16_Sub3_5.method6020(this.aClass20_Sub4_Sub1_1);
		this.aClass16_Sub3_5.method6005(arg6);
		this.aClass16_Sub3_5.method5972(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass20_Sub4_Sub1_1.aBoolean666 && !this.aBoolean87) {
			@Pc(72) float local72 = this.aClass20_Sub4_Sub1_1.aFloat189 * (float) arg3 / (float) this.aClass20_Sub4_Sub1_1.anInt9362;
			@Pc(84) float local84 = (float) arg2 * this.aClass20_Sub4_Sub1_1.aFloat188 / (float) this.aClass20_Sub4_Sub1_1.anInt9361;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local72);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local18);
			OpenGL.glTexCoord2f(local84, 0.0F);
			OpenGL.glVertex2i(local9, local18);
			OpenGL.glTexCoord2f(local84, local72);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt942, (float) this.anInt939, 0.0F);
		@Pc(124) int local124 = this.method5779();
		@Pc(127) int local127 = this.method5785();
		@Pc(133) int local133 = this.aClass20_Sub4_Sub1_1.anInt9362 + arg1;
		OpenGL.glBegin(7);
		@Pc(137) int local137 = arg1;
		@Pc(145) int local145;
		while (local133 <= local18) {
			local145 = this.aClass20_Sub4_Sub1_1.anInt9361 + arg0;
			@Pc(147) int local147 = arg0;
			while (local145 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub4_Sub1_1.aFloat189);
				OpenGL.glVertex2i(local147, local137);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local133);
				OpenGL.glTexCoord2f(this.aClass20_Sub4_Sub1_1.aFloat188, 0.0F);
				OpenGL.glVertex2i(local145, local133);
				OpenGL.glTexCoord2f(this.aClass20_Sub4_Sub1_1.aFloat188, this.aClass20_Sub4_Sub1_1.aFloat189);
				OpenGL.glVertex2i(local145, local137);
				local145 += local124;
				local147 += local124;
			}
			if (local9 > local147) {
				@Pc(213) float local213 = this.aClass20_Sub4_Sub1_1.aFloat188 * (float) (local9 - local147) / (float) this.aClass20_Sub4_Sub1_1.anInt9361;
				OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub4_Sub1_1.aFloat189);
				OpenGL.glVertex2i(local147, local137);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local133);
				OpenGL.glTexCoord2f(local213, 0.0F);
				OpenGL.glVertex2i(local9, local133);
				OpenGL.glTexCoord2f(local213, this.aClass20_Sub4_Sub1_1.aFloat189);
				OpenGL.glVertex2i(local9, local137);
			}
			local133 += local127;
			local137 += local127;
		}
		if (local18 > local137) {
			@Pc(282) float local282 = (float) (local137 + this.aClass20_Sub4_Sub1_1.anInt9362 - local18) * this.aClass20_Sub4_Sub1_1.aFloat189 / (float) this.aClass20_Sub4_Sub1_1.anInt9362;
			@Pc(288) int local288 = arg0 + this.aClass20_Sub4_Sub1_1.anInt9361;
			local145 = arg0;
			while (local288 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub4_Sub1_1.aFloat189);
				OpenGL.glVertex2i(local145, local137);
				OpenGL.glTexCoord2f(0.0F, local282);
				OpenGL.glVertex2i(local145, local18);
				OpenGL.glTexCoord2f(this.aClass20_Sub4_Sub1_1.aFloat188, local282);
				OpenGL.glVertex2i(local288, local18);
				OpenGL.glTexCoord2f(this.aClass20_Sub4_Sub1_1.aFloat188, this.aClass20_Sub4_Sub1_1.aFloat189);
				OpenGL.glVertex2i(local288, local137);
				local288 += local124;
				local145 += local124;
			}
			if (local145 < local9) {
				@Pc(353) float local353 = this.aClass20_Sub4_Sub1_1.aFloat188 * (float) (local9 - local145) / (float) this.aClass20_Sub4_Sub1_1.anInt9361;
				OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub4_Sub1_1.aFloat189);
				OpenGL.glVertex2i(local145, local137);
				OpenGL.glTexCoord2f(0.0F, local282);
				OpenGL.glVertex2i(local145, local18);
				OpenGL.glTexCoord2f(local353, local282);
				OpenGL.glVertex2i(local9, local18);
				OpenGL.glTexCoord2f(local353, this.aClass20_Sub4_Sub1_1.aFloat189);
				OpenGL.glVertex2i(local9, local137);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method5781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass20_Sub4_Sub1_1.method7620(true);
		this.aClass16_Sub3_5.method6019();
		this.aClass16_Sub3_5.method6005(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean87) {
			@Pc(189) float local189 = (float) arg2 / (float) this.method5779();
			@Pc(196) float local196 = (float) arg3 / (float) this.method5785();
			@Pc(205) float local205 = (float) this.anInt942 * local189 + (float) arg0;
			@Pc(214) float local214 = local196 * (float) this.anInt939 + (float) arg1;
			@Pc(223) float local223 = (float) this.aClass20_Sub4_Sub1_1.anInt9361 * local189 + local205;
			@Pc(232) float local232 = local196 * (float) this.aClass20_Sub4_Sub1_1.anInt9362 + local214;
			if (this.aClass20_Sub4_Sub1_2 == null) {
				this.aClass16_Sub3_5.method6020(this.aClass20_Sub4_Sub1_1);
				this.aClass16_Sub3_5.method5972(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub4_Sub1_1.aFloat189);
				OpenGL.glVertex2f(local205, local214);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local205, local232);
				OpenGL.glTexCoord2f(this.aClass20_Sub4_Sub1_1.aFloat188, 0.0F);
				OpenGL.glVertex2f(local223, local232);
				OpenGL.glTexCoord2f(this.aClass20_Sub4_Sub1_1.aFloat188, this.aClass20_Sub4_Sub1_1.aFloat189);
				OpenGL.glVertex2f(local223, local214);
				OpenGL.glEnd();
			} else {
				this.method900(arg4);
				this.aClass20_Sub4_Sub1_2.method7620(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass20_Sub4_Sub1_1.aFloat189);
				OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub4_Sub1_1.aFloat189);
				OpenGL.glVertex2f(local205, local214);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local205, local232);
				OpenGL.glMultiTexCoord2f(33985, this.aClass20_Sub4_Sub1_1.aFloat188, 0.0F);
				OpenGL.glTexCoord2f(this.aClass20_Sub4_Sub1_1.aFloat188, 0.0F);
				OpenGL.glVertex2f(local223, local232);
				OpenGL.glMultiTexCoord2f(33985, this.aClass20_Sub4_Sub1_1.aFloat188, this.aClass20_Sub4_Sub1_1.aFloat189);
				OpenGL.glTexCoord2f(this.aClass20_Sub4_Sub1_1.aFloat188, this.aClass20_Sub4_Sub1_1.aFloat189);
				OpenGL.glVertex2f(local223, local214);
				OpenGL.glEnd();
				this.method898();
			}
		} else if (this.aClass20_Sub4_Sub1_2 == null) {
			this.aClass16_Sub3_5.method6020(this.aClass20_Sub4_Sub1_1);
			this.aClass16_Sub3_5.method5972(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub4_Sub1_1.aFloat189);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass20_Sub4_Sub1_1.aFloat188, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass20_Sub4_Sub1_1.aFloat188, this.aClass20_Sub4_Sub1_1.aFloat189);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method900(arg4);
			this.aClass20_Sub4_Sub1_2.method7620(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass20_Sub4_Sub1_1.aFloat189);
			OpenGL.glTexCoord2f(0.0F, this.aClass20_Sub4_Sub1_1.aFloat189);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass20_Sub4_Sub1_1.aFloat188, 0.0F);
			OpenGL.glTexCoord2f(this.aClass20_Sub4_Sub1_1.aFloat188, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass20_Sub4_Sub1_1.aFloat188, this.aClass20_Sub4_Sub1_1.aFloat189);
			OpenGL.glTexCoord2f(this.aClass20_Sub4_Sub1_1.aFloat188, this.aClass20_Sub4_Sub1_1.aFloat189);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method898();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method5800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg2;
		@Pc(9) Class20_Sub4_Sub1 local9 = local6.aClass20_Sub4_Sub1_4;
		this.aClass20_Sub4_Sub1_1.method7620(false);
		this.aClass16_Sub3_5.method6019();
		this.aClass16_Sub3_5.method6020(this.aClass20_Sub4_Sub1_1);
		this.aClass16_Sub3_5.method5972(1);
		this.aClass16_Sub3_5.method5944(1);
		this.aClass16_Sub3_5.method6020(local9);
		this.aClass16_Sub3_5.method5957(7681, 8448);
		this.aClass16_Sub3_5.method6025(768, 0, 34168);
		this.aClass16_Sub3_5.method6005(1);
		@Pc(62) int local62 = arg1 + this.anInt939;
		@Pc(67) int local67 = arg0 + this.anInt942;
		@Pc(74) int local74 = local67 + this.aClass20_Sub4_Sub1_1.anInt9361;
		@Pc(80) int local80 = local62 + this.aClass20_Sub4_Sub1_1.anInt9362;
		@Pc(87) float local87 = local9.aFloat188 / (float) local9.anInt9361;
		@Pc(94) float local94 = local9.aFloat189 / (float) local9.anInt9362;
		@Pc(102) float local102 = local87 * (float) (local67 - arg3);
		@Pc(110) float local110 = local87 * (float) (local74 - arg3);
		@Pc(121) float local121 = local9.aFloat189 - (float) (local62 - arg4) * local94;
		@Pc(133) float local133 = local9.aFloat189 - (float) (local80 - arg4) * local94;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass20_Sub4_Sub1_1.aFloat189);
		OpenGL.glMultiTexCoord2f(33985, local102, local121);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local102, local133);
		OpenGL.glVertex2i(local67, local62 + this.aClass20_Sub4_Sub1_1.anInt9362);
		OpenGL.glMultiTexCoord2f(33984, this.aClass20_Sub4_Sub1_1.aFloat188, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local110, local133);
		OpenGL.glVertex2i(this.aClass20_Sub4_Sub1_1.anInt9361 + local67, this.aClass20_Sub4_Sub1_1.anInt9362 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass20_Sub4_Sub1_1.aFloat188, this.aClass20_Sub4_Sub1_1.aFloat189);
		OpenGL.glMultiTexCoord2f(33985, local110, local121);
		OpenGL.glVertex2i(local67 + this.aClass20_Sub4_Sub1_1.anInt9361, local62);
		OpenGL.glEnd();
		this.aClass16_Sub3_5.method6025(768, 0, 5890);
		this.aClass16_Sub3_5.method5972(0);
		this.aClass16_Sub3_5.method6020(null);
		this.aClass16_Sub3_5.method5944(0);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method5799(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class20_Sub4_Sub1 local7 = ((Class1_Sub1) arg6).aClass20_Sub4_Sub1_4;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(30) float local30;
		if (this.aBoolean87) {
			local14 = this.method5779();
			local18 = this.method5785();
			local24 = (arg2 - arg0) / local14;
			local30 = (arg3 - arg1) / local14;
			@Pc(36) float local36 = (arg4 - arg0) / local18;
			@Pc(42) float local42 = (arg5 - arg1) / local18;
			@Pc(48) float local48 = local36 * (float) this.anInt939;
			@Pc(54) float local54 = (float) this.anInt939 * local42;
			@Pc(60) float local60 = (float) this.anInt942 * local24;
			@Pc(66) float local66 = local30 * (float) this.anInt942;
			@Pc(73) float local73 = -local24 * (float) this.anInt943;
			@Pc(80) float local80 = -local30 * (float) this.anInt943;
			@Pc(87) float local87 = -local36 * (float) this.anInt945;
			arg2 = arg2 + local73 + local48;
			arg0 = local60 + arg0 + local48;
			@Pc(106) float local106 = -local42 * (float) this.anInt945;
			arg1 = local66 + arg1 + local54;
			arg3 = local80 + arg3 + local54;
			arg4 = arg4 + local60 + local87;
			arg5 = local106 + arg5 + local66;
		}
		local14 = arg4 + arg2 - arg0;
		this.aClass20_Sub4_Sub1_1.method7620(true);
		local18 = arg5 + arg3 - arg1;
		this.aClass16_Sub3_5.method6019();
		this.aClass16_Sub3_5.method6020(this.aClass20_Sub4_Sub1_1);
		this.aClass16_Sub3_5.method5972(1);
		this.aClass16_Sub3_5.method5944(1);
		this.aClass16_Sub3_5.method6020(local7);
		this.aClass16_Sub3_5.method5957(7681, 8448);
		this.aClass16_Sub3_5.method6025(768, 0, 34168);
		this.aClass16_Sub3_5.method6005(1);
		local24 = local7.aFloat188 / (float) local7.anInt9361;
		local30 = local7.aFloat189 / (float) local7.anInt9362;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass20_Sub4_Sub1_1.aFloat189);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg0 - (float) arg7), local7.aFloat189 - (arg1 - (float) arg8) * local30);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg4) * local24, local7.aFloat189 - local30 * ((float) -arg8 + arg5));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass20_Sub4_Sub1_1.aFloat188, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (local14 - (float) arg7) * local24, local7.aFloat189 - ((float) -arg8 + local18) * local30);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass20_Sub4_Sub1_1.aFloat188, this.aClass20_Sub4_Sub1_1.aFloat189);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg2 - (float) arg7), local7.aFloat189 - local30 * ((float) -arg8 + arg3));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass16_Sub3_5.method6025(768, 0, 5890);
		this.aClass16_Sub3_5.method5972(0);
		this.aClass16_Sub3_5.method6020(null);
		this.aClass16_Sub3_5.method5944(0);
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)V")
	private void method900(@OriginalArg(0) int arg0) {
		this.aClass16_Sub3_5.method5944(1);
		this.aClass16_Sub3_5.method6020(this.aClass20_Sub4_Sub1_1);
		this.aClass16_Sub3_5.method5957(this.aClass16_Sub3_5.method5966(arg0), 7681);
		this.aClass16_Sub3_5.method6025(768, 1, 34167);
		this.aClass16_Sub3_5.method6029(0, 34168);
		this.aClass16_Sub3_5.method5944(0);
		this.aClass16_Sub3_5.method6020(this.aClass20_Sub4_Sub1_2);
		this.aClass16_Sub3_5.method5957(34479, 7681);
		this.aClass16_Sub3_5.method6025(768, 1, 34166);
		if (this.anInt948 == 0) {
			this.aClass16_Sub3_5.method5974(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt948 == 1) {
			this.aClass16_Sub3_5.method5974(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt948 == 2) {
			this.aClass16_Sub3_5.method5974(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt948 == 3) {
			this.aClass16_Sub3_5.method5974(128.5F, 128.5F, 128.5F, 0.0F);
			return;
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt942 = arg0;
		this.anInt939 = arg1;
		this.anInt945 = arg3;
		this.anInt943 = arg2;
		this.aBoolean87 = this.anInt942 != 0 || this.anInt939 != 0 || this.anInt943 != 0 || this.anInt945 != 0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "()I")
	@Override
	public int method5779() {
		return this.anInt943 + this.anInt942 + this.aClass20_Sub4_Sub1_1.anInt9361;
	}
}
