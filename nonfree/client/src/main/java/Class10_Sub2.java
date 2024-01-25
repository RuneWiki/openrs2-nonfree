import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!af", name = "A", descriptor = "Lclient!ck;")
	private Class52_Sub1_Sub1 aClass52_Sub1_Sub1_2;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "I")
	private int anInt222 = 0;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "Z")
	private boolean aBoolean9 = false;

	@OriginalMember(owner = "client!af", name = "s", descriptor = "I")
	private int anInt235 = 0;

	@OriginalMember(owner = "client!af", name = "q", descriptor = "I")
	private int anInt234 = 0;

	@OriginalMember(owner = "client!af", name = "p", descriptor = "I")
	private int anInt233 = 0;

	@OriginalMember(owner = "client!af", name = "x", descriptor = "I")
	private int anInt239 = 0;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "Lclient!ag;")
	private final Class12_Sub1 aClass12_Sub1_4;

	@OriginalMember(owner = "client!af", name = "t", descriptor = "Lclient!ck;")
	public final Class52_Sub1_Sub1 aClass52_Sub1_Sub1_1;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!ag;IIZ)V")
	public Class10_Sub2(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass12_Sub1_4 = arg0;
		this.aClass52_Sub1_Sub1_1 = Static28.method2621(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!ag;IIII)V")
	public Class10_Sub2(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass12_Sub1_4 = arg0;
		this.aClass52_Sub1_Sub1_1 = Static67.method1440(arg0, arg3, arg2, arg4, arg1);
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!ag;II[III)V")
	public Class10_Sub2(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass12_Sub1_4 = arg0;
		this.aClass52_Sub1_Sub1_1 = Static583.method7797(arg1, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!af", name = "da", descriptor = "(IIIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass52_Sub1_Sub1_1.method1499(arg1, arg3, arg0, arg4, arg2, arg5);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
	private void method202() {
		this.aClass12_Sub1_4.method376(1);
		this.aClass12_Sub1_4.method378(null);
		this.aClass12_Sub1_4.method420(8448, 8448);
		this.aClass12_Sub1_4.method387(1, 768, 34168);
		this.aClass12_Sub1_4.method388(0, 5890);
		this.aClass12_Sub1_4.method376(0);
		this.aClass12_Sub1_4.method387(1, 768, 34168);
	}

	@OriginalMember(owner = "client!af", name = "ca", descriptor = "()I")
	@Override
	public int ca() {
		return this.anInt235 + this.anInt233 + this.aClass52_Sub1_Sub1_1.anInt1672;
	}

	@OriginalMember(owner = "client!af", name = "xa", descriptor = "(III)V")
	@Override
	public void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass52_Sub1_Sub1_2 = Static67.method1440(this.aClass12_Sub1_4, this.aClass52_Sub1_Sub1_1.anInt1673, arg1, this.aClass52_Sub1_Sub1_1.anInt1672, arg0);
		this.anInt222 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!af", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean9) {
			local10 = this.A();
			local14 = this.ca();
			@Pc(20) float local20 = (arg2 - arg0) / local10;
			@Pc(27) float local27 = (arg3 - arg1) / local10;
			@Pc(34) float local34 = (arg4 - arg0) / local14;
			@Pc(40) float local40 = (arg5 - arg1) / local14;
			@Pc(46) float local46 = (float) this.anInt233 * local34;
			@Pc(52) float local52 = local40 * (float) this.anInt233;
			@Pc(58) float local58 = (float) this.anInt234 * local20;
			@Pc(64) float local64 = local27 * (float) this.anInt234;
			@Pc(71) float local71 = (float) this.anInt239 * -local20;
			@Pc(78) float local78 = (float) this.anInt239 * -local27;
			@Pc(85) float local85 = -local34 * (float) this.anInt235;
			arg4 = arg4 + local58 + local85;
			arg3 = local52 + local78 + arg3;
			@Pc(104) float local104 = (float) this.anInt235 * -local40;
			arg0 = local46 + local58 + arg0;
			arg1 = local52 + arg1 + local64;
			arg2 = arg2 + local71 + local46;
			arg5 = local104 + local64 + arg5;
		}
		local10 = arg2 + arg4 - arg0;
		local14 = arg3 + arg5 - arg1;
		this.aClass52_Sub1_Sub1_1.method5644(true);
		this.aClass12_Sub1_4.method380();
		this.aClass12_Sub1_4.method378(this.aClass52_Sub1_Sub1_1);
		this.aClass12_Sub1_4.method395(arg8);
		this.aClass12_Sub1_4.method401(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass52_Sub1_Sub1_1.aFloat35);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass52_Sub1_Sub1_1.aFloat36, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass52_Sub1_Sub1_1.aFloat36, this.aClass52_Sub1_Sub1_1.aFloat35);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!af", name = "Q", descriptor = "(IIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt239 = arg2;
		this.anInt235 = arg3;
		this.anInt234 = arg0;
		this.anInt233 = arg1;
		this.aBoolean9 = this.anInt234 != 0 || this.anInt233 != 0 || this.anInt239 != 0 || this.anInt235 != 0;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IILclient!ua;II)V")
	@Override
	public void method7683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class200 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class200_Sub3 local6 = (Class200_Sub3) arg2;
		@Pc(9) Class52_Sub1_Sub1 local9 = local6.aClass52_Sub1_Sub1_5;
		this.aClass52_Sub1_Sub1_1.method5644(false);
		this.aClass12_Sub1_4.method380();
		this.aClass12_Sub1_4.method378(this.aClass52_Sub1_Sub1_1);
		this.aClass12_Sub1_4.method401(1);
		this.aClass12_Sub1_4.method376(1);
		this.aClass12_Sub1_4.method378(local9);
		this.aClass12_Sub1_4.method420(8448, 7681);
		this.aClass12_Sub1_4.method387(0, 768, 34168);
		this.aClass12_Sub1_4.method395(1);
		@Pc(62) int local62 = arg0 + this.anInt234;
		@Pc(67) int local67 = arg1 + this.anInt233;
		@Pc(73) int local73 = local62 + this.aClass52_Sub1_Sub1_1.anInt1673;
		@Pc(79) int local79 = this.aClass52_Sub1_Sub1_1.anInt1672 + local67;
		@Pc(86) float local86 = local9.aFloat36 / (float) local9.anInt1673;
		@Pc(93) float local93 = local9.aFloat35 / (float) local9.anInt1672;
		@Pc(101) float local101 = local86 * (float) (local62 - arg3);
		@Pc(109) float local109 = (float) (local73 - arg3) * local86;
		@Pc(119) float local119 = local9.aFloat35 - (float) (local67 - arg4) * local93;
		@Pc(130) float local130 = local9.aFloat35 - (float) (local79 - arg4) * local93;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass52_Sub1_Sub1_1.aFloat35);
		OpenGL.glMultiTexCoord2f(33985, local101, local119);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local130);
		OpenGL.glVertex2i(local62, this.aClass52_Sub1_Sub1_1.anInt1672 + local67);
		OpenGL.glMultiTexCoord2f(33984, this.aClass52_Sub1_Sub1_1.aFloat36, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local130);
		OpenGL.glVertex2i(this.aClass52_Sub1_Sub1_1.anInt1673 + local62, local67 - -this.aClass52_Sub1_Sub1_1.anInt1672);
		OpenGL.glMultiTexCoord2f(33984, this.aClass52_Sub1_Sub1_1.aFloat36, this.aClass52_Sub1_Sub1_1.aFloat35);
		OpenGL.glMultiTexCoord2f(33985, local109, local119);
		OpenGL.glVertex2i(local62 + this.aClass52_Sub1_Sub1_1.anInt1673, local67);
		OpenGL.glEnd();
		this.aClass12_Sub1_4.method387(0, 768, 5890);
		this.aClass12_Sub1_4.method401(0);
		this.aClass12_Sub1_4.method378(null);
		this.aClass12_Sub1_4.method376(0);
	}

	@OriginalMember(owner = "client!af", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.aClass52_Sub1_Sub1_1.anInt1673;
	}

	@OriginalMember(owner = "client!af", name = "YA", descriptor = "(IIIIIIII)V")
	@Override
	protected void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass52_Sub1_Sub1_1.method5644(true);
		this.aClass12_Sub1_4.method380();
		this.aClass12_Sub1_4.method395(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean9) {
			@Pc(188) float local188 = (float) arg2 / (float) this.A();
			@Pc(195) float local195 = (float) arg3 / (float) this.ca();
			@Pc(204) float local204 = local188 * (float) this.anInt234 + (float) arg0;
			@Pc(213) float local213 = (float) arg1 + (float) this.anInt233 * local195;
			@Pc(222) float local222 = local204 + local188 * (float) this.aClass52_Sub1_Sub1_1.anInt1673;
			@Pc(231) float local231 = (float) this.aClass52_Sub1_Sub1_1.anInt1672 * local195 + local213;
			if (this.aClass52_Sub1_Sub1_2 == null) {
				this.aClass12_Sub1_4.method378(this.aClass52_Sub1_Sub1_1);
				this.aClass12_Sub1_4.method401(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass52_Sub1_Sub1_1.aFloat35);
				OpenGL.glVertex2f(local204, local213);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local204, local231);
				OpenGL.glTexCoord2f(this.aClass52_Sub1_Sub1_1.aFloat36, 0.0F);
				OpenGL.glVertex2f(local222, local231);
				OpenGL.glTexCoord2f(this.aClass52_Sub1_Sub1_1.aFloat36, this.aClass52_Sub1_Sub1_1.aFloat35);
				OpenGL.glVertex2f(local222, local213);
				OpenGL.glEnd();
			} else {
				this.method205(arg4);
				this.aClass52_Sub1_Sub1_2.method5644(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass52_Sub1_Sub1_1.aFloat35);
				OpenGL.glTexCoord2f(0.0F, this.aClass52_Sub1_Sub1_1.aFloat35);
				OpenGL.glVertex2f(local204, local213);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local204, local231);
				OpenGL.glMultiTexCoord2f(33985, this.aClass52_Sub1_Sub1_1.aFloat36, 0.0F);
				OpenGL.glTexCoord2f(this.aClass52_Sub1_Sub1_1.aFloat36, 0.0F);
				OpenGL.glVertex2f(local222, local231);
				OpenGL.glMultiTexCoord2f(33985, this.aClass52_Sub1_Sub1_1.aFloat36, this.aClass52_Sub1_Sub1_1.aFloat35);
				OpenGL.glTexCoord2f(this.aClass52_Sub1_Sub1_1.aFloat36, this.aClass52_Sub1_Sub1_1.aFloat35);
				OpenGL.glVertex2f(local222, local213);
				OpenGL.glEnd();
				this.method202();
			}
		} else if (this.aClass52_Sub1_Sub1_2 == null) {
			this.aClass12_Sub1_4.method378(this.aClass52_Sub1_Sub1_1);
			this.aClass12_Sub1_4.method401(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass52_Sub1_Sub1_1.aFloat35);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass52_Sub1_Sub1_1.aFloat36, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass52_Sub1_Sub1_1.aFloat36, this.aClass52_Sub1_Sub1_1.aFloat35);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method205(arg4);
			this.aClass52_Sub1_Sub1_2.method5644(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass52_Sub1_Sub1_1.aFloat35);
			OpenGL.glTexCoord2f(0.0F, this.aClass52_Sub1_Sub1_1.aFloat35);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass52_Sub1_Sub1_1.aFloat36, 0.0F);
			OpenGL.glTexCoord2f(this.aClass52_Sub1_Sub1_1.aFloat36, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass52_Sub1_Sub1_1.aFloat36, this.aClass52_Sub1_Sub1_1.aFloat35);
			OpenGL.glTexCoord2f(this.aClass52_Sub1_Sub1_1.aFloat36, this.aClass52_Sub1_Sub1_1.aFloat35);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method202();
		}
	}

	@OriginalMember(owner = "client!af", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		this.aClass52_Sub1_Sub1_1.method5644(false);
		@Pc(18) int local18 = arg3 + arg1;
		this.aClass12_Sub1_4.method380();
		this.aClass12_Sub1_4.method378(this.aClass52_Sub1_Sub1_1);
		this.aClass12_Sub1_4.method395(arg6);
		this.aClass12_Sub1_4.method401(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass52_Sub1_Sub1_1.aBoolean136 && !this.aBoolean9) {
			@Pc(341) float local341 = this.aClass52_Sub1_Sub1_1.aFloat35 * (float) arg3 / (float) this.aClass52_Sub1_Sub1_1.anInt1672;
			@Pc(353) float local353 = (float) arg2 * this.aClass52_Sub1_Sub1_1.aFloat36 / (float) this.aClass52_Sub1_Sub1_1.anInt1673;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local341);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local18);
			OpenGL.glTexCoord2f(local353, 0.0F);
			OpenGL.glVertex2i(local9, local18);
			OpenGL.glTexCoord2f(local353, local341);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt234, (float) this.anInt233, 0.0F);
		@Pc(72) int local72 = this.A();
		@Pc(75) int local75 = this.ca();
		@Pc(81) int local81 = arg1 + this.aClass52_Sub1_Sub1_1.anInt1672;
		OpenGL.glBegin(7);
		@Pc(85) int local85 = arg1;
		@Pc(93) int local93;
		while (local81 <= local18) {
			local93 = arg0 + this.aClass52_Sub1_Sub1_1.anInt1673;
			@Pc(95) int local95 = arg0;
			while (local93 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass52_Sub1_Sub1_1.aFloat35);
				OpenGL.glVertex2i(local95, local85);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local95, local81);
				OpenGL.glTexCoord2f(this.aClass52_Sub1_Sub1_1.aFloat36, 0.0F);
				OpenGL.glVertex2i(local93, local81);
				OpenGL.glTexCoord2f(this.aClass52_Sub1_Sub1_1.aFloat36, this.aClass52_Sub1_Sub1_1.aFloat35);
				OpenGL.glVertex2i(local93, local85);
				local93 += local72;
				local95 += local72;
			}
			if (local9 > local95) {
				@Pc(162) float local162 = (float) (local9 - local95) * this.aClass52_Sub1_Sub1_1.aFloat36 / (float) this.aClass52_Sub1_Sub1_1.anInt1673;
				OpenGL.glTexCoord2f(0.0F, this.aClass52_Sub1_Sub1_1.aFloat35);
				OpenGL.glVertex2i(local95, local85);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local95, local81);
				OpenGL.glTexCoord2f(local162, 0.0F);
				OpenGL.glVertex2i(local9, local81);
				OpenGL.glTexCoord2f(local162, this.aClass52_Sub1_Sub1_1.aFloat35);
				OpenGL.glVertex2i(local9, local85);
			}
			local81 += local75;
			local85 += local75;
		}
		if (local85 < local18) {
			@Pc(223) float local223 = (float) (local85 + this.aClass52_Sub1_Sub1_1.anInt1672 - local18) * this.aClass52_Sub1_Sub1_1.aFloat35 / (float) this.aClass52_Sub1_Sub1_1.anInt1672;
			@Pc(229) int local229 = this.aClass52_Sub1_Sub1_1.anInt1673 + arg0;
			local93 = arg0;
			while (local9 >= local229) {
				OpenGL.glTexCoord2f(0.0F, this.aClass52_Sub1_Sub1_1.aFloat35);
				OpenGL.glVertex2i(local93, local85);
				OpenGL.glTexCoord2f(0.0F, local223);
				OpenGL.glVertex2i(local93, local18);
				OpenGL.glTexCoord2f(this.aClass52_Sub1_Sub1_1.aFloat36, local223);
				OpenGL.glVertex2i(local229, local18);
				OpenGL.glTexCoord2f(this.aClass52_Sub1_Sub1_1.aFloat36, this.aClass52_Sub1_Sub1_1.aFloat35);
				OpenGL.glVertex2i(local229, local85);
				local229 += local72;
				local93 += local72;
			}
			if (local9 > local93) {
				@Pc(298) float local298 = (float) (local9 - local93) * this.aClass52_Sub1_Sub1_1.aFloat36 / (float) this.aClass52_Sub1_Sub1_1.anInt1673;
				OpenGL.glTexCoord2f(0.0F, this.aClass52_Sub1_Sub1_1.aFloat35);
				OpenGL.glVertex2i(local93, local85);
				OpenGL.glTexCoord2f(0.0F, local223);
				OpenGL.glVertex2i(local93, local18);
				OpenGL.glTexCoord2f(local298, local223);
				OpenGL.glVertex2i(local9, local18);
				OpenGL.glTexCoord2f(local298, this.aClass52_Sub1_Sub1_1.aFloat35);
				OpenGL.glVertex2i(local9, local85);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected void method7675(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class200 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class52_Sub1_Sub1 local7 = ((Class200_Sub3) arg6).aClass52_Sub1_Sub1_5;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(31) float local31;
		if (this.aBoolean9) {
			local14 = this.A();
			local18 = this.ca();
			local24 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(37) float local37 = (arg4 - arg0) / local18;
			@Pc(43) float local43 = (arg5 - arg1) / local18;
			@Pc(49) float local49 = local37 * (float) this.anInt233;
			@Pc(55) float local55 = (float) this.anInt233 * local43;
			@Pc(61) float local61 = (float) this.anInt234 * local24;
			@Pc(67) float local67 = local31 * (float) this.anInt234;
			@Pc(74) float local74 = (float) this.anInt239 * -local24;
			@Pc(81) float local81 = -local31 * (float) this.anInt239;
			@Pc(88) float local88 = -local37 * (float) this.anInt235;
			arg4 = local88 + arg4 + local61;
			arg0 = local61 + arg0 + local49;
			@Pc(107) float local107 = (float) this.anInt235 * -local43;
			arg2 = arg2 + local74 + local49;
			arg1 = local67 + arg1 + local55;
			arg3 = local81 + arg3 + local55;
			arg5 = local107 + local67 + arg5;
		}
		local14 = arg4 + arg2 - arg0;
		local18 = arg5 + arg3 - arg1;
		this.aClass52_Sub1_Sub1_1.method5644(true);
		this.aClass12_Sub1_4.method380();
		this.aClass12_Sub1_4.method378(this.aClass52_Sub1_Sub1_1);
		this.aClass12_Sub1_4.method401(1);
		this.aClass12_Sub1_4.method376(1);
		this.aClass12_Sub1_4.method378(local7);
		this.aClass12_Sub1_4.method420(8448, 7681);
		this.aClass12_Sub1_4.method387(0, 768, 34168);
		this.aClass12_Sub1_4.method395(1);
		local24 = local7.aFloat36 / (float) local7.anInt1673;
		local31 = local7.aFloat35 / (float) local7.anInt1672;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass52_Sub1_Sub1_1.aFloat35);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg0 - (float) arg7), local7.aFloat35 - (arg1 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg4 - (float) arg7), local7.aFloat35 - local31 * (arg5 - (float) arg8));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass52_Sub1_Sub1_1.aFloat36, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (local14 - (float) arg7) * local24, local7.aFloat35 - (local18 - (float) arg8) * local31);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass52_Sub1_Sub1_1.aFloat36, this.aClass52_Sub1_Sub1_1.aFloat35);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg2 - (float) arg7), local7.aFloat35 - ((float) -arg8 + arg3) * local31);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass12_Sub1_4.method387(0, 768, 5890);
		this.aClass12_Sub1_4.method401(0);
		this.aClass12_Sub1_4.method378(null);
		this.aClass12_Sub1_4.method376(0);
	}

	@OriginalMember(owner = "client!af", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.aClass52_Sub1_Sub1_1.anInt1672;
	}

	@OriginalMember(owner = "client!af", name = "A", descriptor = "()I")
	@Override
	public int A() {
		return this.aClass52_Sub1_Sub1_1.anInt1673 + this.anInt234 + this.anInt239;
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(II)V")
	private void method205(@OriginalArg(1) int arg0) {
		this.aClass12_Sub1_4.method376(1);
		this.aClass12_Sub1_4.method378(this.aClass52_Sub1_Sub1_1);
		this.aClass12_Sub1_4.method420(7681, this.aClass12_Sub1_4.method384(arg0));
		this.aClass12_Sub1_4.method387(1, 768, 34167);
		this.aClass12_Sub1_4.method388(0, 34168);
		this.aClass12_Sub1_4.method376(0);
		this.aClass12_Sub1_4.method378(this.aClass52_Sub1_Sub1_2);
		this.aClass12_Sub1_4.method420(7681, 34479);
		this.aClass12_Sub1_4.method387(1, 768, 34166);
		if (this.anInt222 == 0) {
			this.aClass12_Sub1_4.method431(0.0F, 0.5F, 0.5F, 1.0F);
		} else if (this.anInt222 == 1) {
			this.aClass12_Sub1_4.method431(0.0F, 1.0F, 0.5F, 0.5F);
			return;
		} else if (this.anInt222 == 2) {
			this.aClass12_Sub1_4.method431(0.0F, 0.5F, 1.0F, 0.5F);
			return;
		} else if (this.anInt222 == 3) {
			this.aClass12_Sub1_4.method431(0.0F, 128.5F, 128.5F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!af", name = "V", descriptor = "(IIIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass52_Sub1_Sub1_1.method5644(false);
		this.aClass12_Sub1_4.method380();
		this.aClass12_Sub1_4.method395(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt233;
		@Pc(42) int local42 = arg0 + this.anInt234;
		if (this.aClass52_Sub1_Sub1_2 == null) {
			this.aClass12_Sub1_4.method378(this.aClass52_Sub1_Sub1_1);
			this.aClass12_Sub1_4.method401(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass52_Sub1_Sub1_1.aFloat35);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, local37 + this.aClass52_Sub1_Sub1_1.anInt1672);
			OpenGL.glTexCoord2f(this.aClass52_Sub1_Sub1_1.aFloat36, 0.0F);
			OpenGL.glVertex2i(this.aClass52_Sub1_Sub1_1.anInt1673 + local42, local37 - -this.aClass52_Sub1_Sub1_1.anInt1672);
			OpenGL.glTexCoord2f(this.aClass52_Sub1_Sub1_1.aFloat36, this.aClass52_Sub1_Sub1_1.aFloat35);
			OpenGL.glVertex2i(local42 + this.aClass52_Sub1_Sub1_1.anInt1673, local37);
			OpenGL.glEnd();
			return;
		}
		this.method205(arg2);
		this.aClass52_Sub1_Sub1_2.method5644(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass52_Sub1_Sub1_1.aFloat35);
		OpenGL.glTexCoord2f(0.0F, this.aClass52_Sub1_Sub1_1.aFloat35);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, this.aClass52_Sub1_Sub1_1.anInt1672 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass52_Sub1_Sub1_1.aFloat36, 0.0F);
		OpenGL.glTexCoord2f(this.aClass52_Sub1_Sub1_1.aFloat36, 0.0F);
		OpenGL.glVertex2i(local42 + this.aClass52_Sub1_Sub1_1.anInt1673, this.aClass52_Sub1_Sub1_1.anInt1672 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass52_Sub1_Sub1_1.aFloat36, this.aClass52_Sub1_Sub1_1.aFloat35);
		OpenGL.glTexCoord2f(this.aClass52_Sub1_Sub1_1.aFloat36, this.aClass52_Sub1_Sub1_1.aFloat35);
		OpenGL.glVertex2i(this.aClass52_Sub1_Sub1_1.anInt1673 + local42, local37);
		OpenGL.glEnd();
		this.method202();
	}
}
