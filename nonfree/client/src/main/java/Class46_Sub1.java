import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class46_Sub1 extends Class46 {

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "Lclient!qq;")
	private Class81_Sub4_Sub1 aClass81_Sub4_Sub1_3;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
	private int anInt831 = 0;

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
	private int anInt832 = 0;

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
	private int anInt833 = 0;

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "Z")
	private boolean aBoolean86 = false;

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
	private int anInt834 = 0;

	@OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
	private int anInt835 = 0;

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "Lclient!cg;")
	private final Class37_Sub1 aClass37_Sub1_6;

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "Lclient!qq;")
	private final Class81_Sub4_Sub1 aClass81_Sub4_Sub1_2;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lclient!cg;IIII)V")
	public Class46_Sub1(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass37_Sub1_6 = arg0;
		this.aClass81_Sub4_Sub1_2 = Static375.method4751(arg2, arg3, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lclient!cg;II[III)V")
	public Class46_Sub1(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass37_Sub1_6 = arg0;
		this.aClass81_Sub4_Sub1_2 = Static375.method4752(arg1, arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected void method5028(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean86) {
			local6 = this.method5031();
			local10 = this.method5022();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(28) float local28 = (arg4 - arg0) / local10;
			@Pc(34) float local34 = (arg5 - arg1) / local10;
			@Pc(40) float local40 = local28 * (float) this.anInt835;
			@Pc(46) float local46 = local34 * (float) this.anInt835;
			@Pc(52) float local52 = local16 * (float) this.anInt833;
			@Pc(58) float local58 = local22 * (float) this.anInt833;
			@Pc(65) float local65 = -local16 * (float) this.anInt831;
			@Pc(72) float local72 = -local22 * (float) this.anInt831;
			@Pc(79) float local79 = -local28 * (float) this.anInt834;
			@Pc(86) float local86 = -local34 * (float) this.anInt834;
			arg0 = arg0 + local52 + local40;
			arg1 = arg1 + local58 + local46;
			arg2 = arg2 + local65 + local40;
			arg3 = arg3 + local72 + local46;
			arg4 = arg4 + local52 + local79;
			arg5 = arg5 + local58 + local86;
		}
		local6 = arg4 + arg2 - arg0;
		local10 = arg3 + arg5 - arg1;
		@Pc(138) opengl local138 = this.aClass37_Sub1_6.anOpengl1;
		this.aClass81_Sub4_Sub1_2.method4737(true);
		this.aClass37_Sub1_6.method754();
		this.aClass37_Sub1_6.method767(this.aClass81_Sub4_Sub1_2);
		this.aClass37_Sub1_6.method731(1);
		this.aClass37_Sub1_6.method774(arg6);
		local138.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		local138.glBegin(7);
		local138.glTexCoord2f(0.0F, this.aClass81_Sub4_Sub1_2.aFloat67);
		local138.glVertex2f(arg0, arg1);
		local138.glTexCoord2f(0.0F, 0.0F);
		local138.glVertex2f(arg4, arg5);
		local138.glTexCoord2f(this.aClass81_Sub4_Sub1_2.aFloat66, 0.0F);
		local138.glVertex2f(local6, local10);
		local138.glTexCoord2f(this.aClass81_Sub4_Sub1_2.aFloat66, this.aClass81_Sub4_Sub1_2.aFloat67);
		local138.glVertex2f(arg2, arg3);
		local138.glEnd();
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) opengl local3 = this.aClass37_Sub1_6.anOpengl1;
		@Pc(7) int local7 = arg0 + arg2;
		@Pc(11) int local11 = arg1 + arg3;
		this.aClass81_Sub4_Sub1_2.method4737(false);
		this.aClass37_Sub1_6.method754();
		this.aClass37_Sub1_6.method767(this.aClass81_Sub4_Sub1_2);
		this.aClass37_Sub1_6.method731(1);
		this.aClass37_Sub1_6.method774(arg4);
		local3.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass81_Sub4_Sub1_2.aBoolean497 && !this.aBoolean86) {
			@Pc(66) float local66 = this.aClass81_Sub4_Sub1_2.aFloat67 * (float) arg3 / (float) this.aClass81_Sub4_Sub1_2.anInt5615;
			@Pc(78) float local78 = this.aClass81_Sub4_Sub1_2.aFloat66 * (float) arg2 / (float) this.aClass81_Sub4_Sub1_2.anInt5616;
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, local66);
			local3.glVertex2i(arg0, arg1);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(arg0, local11);
			local3.glTexCoord2f(local78, 0.0F);
			local3.glVertex2i(local7, local11);
			local3.glTexCoord2f(local78, local66);
			local3.glVertex2i(local7, arg1);
			local3.glEnd();
			return;
		}
		local3.glPushMatrix();
		local3.glTranslatef((float) this.anInt833, (float) this.anInt835, 0.0F);
		@Pc(130) int local130 = this.method5031();
		@Pc(133) int local133 = this.method5022();
		@Pc(139) int local139 = arg1 + this.aClass81_Sub4_Sub1_2.anInt5615;
		local3.glBegin(7);
		@Pc(144) int local144 = arg1;
		@Pc(153) int local153;
		while (local139 <= local11) {
			local153 = arg0 + this.aClass81_Sub4_Sub1_2.anInt5616;
			@Pc(155) int local155 = arg0;
			while (local153 <= local7) {
				local3.glTexCoord2f(0.0F, this.aClass81_Sub4_Sub1_2.aFloat67);
				local3.glVertex2i(local155, local144);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2i(local155, local139);
				local3.glTexCoord2f(this.aClass81_Sub4_Sub1_2.aFloat66, 0.0F);
				local3.glVertex2i(local153, local139);
				local3.glTexCoord2f(this.aClass81_Sub4_Sub1_2.aFloat66, this.aClass81_Sub4_Sub1_2.aFloat67);
				local3.glVertex2i(local153, local144);
				local153 += local130;
				local155 += local130;
			}
			if (local155 < local7) {
				@Pc(224) float local224 = this.aClass81_Sub4_Sub1_2.aFloat66 * (float) (local7 - local155) / (float) this.aClass81_Sub4_Sub1_2.anInt5616;
				local3.glTexCoord2f(0.0F, this.aClass81_Sub4_Sub1_2.aFloat67);
				local3.glVertex2i(local155, local144);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2i(local155, local139);
				local3.glTexCoord2f(local224, 0.0F);
				local3.glVertex2i(local7, local139);
				local3.glTexCoord2f(local224, this.aClass81_Sub4_Sub1_2.aFloat67);
				local3.glVertex2i(local7, local144);
			}
			local144 += local133;
			local139 += local133;
		}
		if (local144 < local11) {
			@Pc(290) float local290 = this.aClass81_Sub4_Sub1_2.aFloat67 * (float) (this.aClass81_Sub4_Sub1_2.anInt5615 + local144 - local11) / (float) this.aClass81_Sub4_Sub1_2.anInt5615;
			@Pc(296) int local296 = arg0 + this.aClass81_Sub4_Sub1_2.anInt5616;
			local153 = arg0;
			while (local296 <= local7) {
				local3.glTexCoord2f(0.0F, this.aClass81_Sub4_Sub1_2.aFloat67);
				local3.glVertex2i(local153, local144);
				local3.glTexCoord2f(0.0F, local290);
				local3.glVertex2i(local153, local11);
				local3.glTexCoord2f(this.aClass81_Sub4_Sub1_2.aFloat66, local290);
				local3.glVertex2i(local296, local11);
				local3.glTexCoord2f(this.aClass81_Sub4_Sub1_2.aFloat66, this.aClass81_Sub4_Sub1_2.aFloat67);
				local3.glVertex2i(local296, local144);
				local296 += local130;
				local153 += local130;
			}
			if (local153 < local7) {
				@Pc(367) float local367 = this.aClass81_Sub4_Sub1_2.aFloat66 * (float) (local7 - local153) / (float) this.aClass81_Sub4_Sub1_2.anInt5616;
				local3.glTexCoord2f(0.0F, this.aClass81_Sub4_Sub1_2.aFloat67);
				local3.glVertex2i(local153, local144);
				local3.glTexCoord2f(0.0F, local290);
				local3.glVertex2i(local153, local11);
				local3.glTexCoord2f(local367, local290);
				local3.glVertex2i(local7, local11);
				local3.glTexCoord2f(local367, this.aClass81_Sub4_Sub1_2.aFloat67);
				local3.glVertex2i(local7, local144);
			}
		}
		local3.glEnd();
		local3.glPopMatrix();
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "()I")
	@Override
	public int method5022() {
		return this.aClass81_Sub4_Sub1_2.anInt5615 + this.anInt835 + this.anInt834;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(III)V")
	@Override
	public void method5024(@OriginalArg(2) int arg0) {
		@Pc(3) opengl local3 = this.aClass37_Sub1_6.anOpengl1;
		local3.glPixelTransferf(3348, 0.5F);
		local3.glPixelTransferf(3349, 0.499F);
		local3.glPixelTransferf(3352, 0.5F);
		local3.glPixelTransferf(3353, 0.499F);
		local3.glPixelTransferf(3354, 0.5F);
		local3.glPixelTransferf(3355, 0.499F);
		this.aClass81_Sub4_Sub1_3 = Static375.method4751(0, this.aClass81_Sub4_Sub1_2.anInt5616, this.aClass37_Sub1_6, 0, this.aClass81_Sub4_Sub1_2.anInt5615);
		this.anInt832 = arg0;
		local3.glPixelTransferf(3348, 1.0F);
		local3.glPixelTransferf(3349, 0.0F);
		local3.glPixelTransferf(3352, 1.0F);
		local3.glPixelTransferf(3353, 0.0F);
		local3.glPixelTransferf(3354, 1.0F);
		local3.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method5034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) opengl local3 = this.aClass37_Sub1_6.anOpengl1;
		this.aClass81_Sub4_Sub1_2.method4737(false);
		this.aClass37_Sub1_6.method754();
		this.aClass37_Sub1_6.method731(1);
		local3.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) int local35 = arg0 + this.anInt833;
		@Pc(40) int local40 = arg1 + this.anInt835;
		if (this.aClass81_Sub4_Sub1_3 == null) {
			this.aClass37_Sub1_6.method767(this.aClass81_Sub4_Sub1_2);
			this.aClass37_Sub1_6.method774(arg2);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, this.aClass81_Sub4_Sub1_2.aFloat67);
			local3.glVertex2i(local35, local40);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(local35, local40 + this.aClass81_Sub4_Sub1_2.anInt5615);
			local3.glTexCoord2f(this.aClass81_Sub4_Sub1_2.aFloat66, 0.0F);
			local3.glVertex2i(local35 + this.aClass81_Sub4_Sub1_2.anInt5616, local40 + this.aClass81_Sub4_Sub1_2.anInt5615);
			local3.glTexCoord2f(this.aClass81_Sub4_Sub1_2.aFloat66, this.aClass81_Sub4_Sub1_2.aFloat67);
			local3.glVertex2i(local35 + this.aClass81_Sub4_Sub1_2.anInt5616, local40);
			local3.glEnd();
			return;
		}
		this.method991(arg2);
		this.aClass81_Sub4_Sub1_3.method4737(false);
		local3.glBegin(7);
		local3.glMultiTexCoord2f(33985, 0.0F, this.aClass81_Sub4_Sub1_2.aFloat67);
		local3.glTexCoord2f(0.0F, this.aClass81_Sub4_Sub1_2.aFloat67);
		local3.glVertex2i(local35, local40);
		local3.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		local3.glTexCoord2f(0.0F, 0.0F);
		local3.glVertex2i(local35, local40 + this.aClass81_Sub4_Sub1_2.anInt5615);
		local3.glMultiTexCoord2f(33985, this.aClass81_Sub4_Sub1_2.aFloat66, 0.0F);
		local3.glTexCoord2f(this.aClass81_Sub4_Sub1_2.aFloat66, 0.0F);
		local3.glVertex2i(local35 + this.aClass81_Sub4_Sub1_2.anInt5616, local40 + this.aClass81_Sub4_Sub1_2.anInt5615);
		local3.glMultiTexCoord2f(33985, this.aClass81_Sub4_Sub1_2.aFloat66, this.aClass81_Sub4_Sub1_2.aFloat67);
		local3.glTexCoord2f(this.aClass81_Sub4_Sub1_2.aFloat66, this.aClass81_Sub4_Sub1_2.aFloat67);
		local3.glVertex2i(local35 + this.aClass81_Sub4_Sub1_2.anInt5616, local40);
		local3.glEnd();
		this.method990();
	}

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "()I")
	@Override
	public int method5031() {
		return this.aClass81_Sub4_Sub1_2.anInt5616 + this.anInt833 + this.anInt831;
	}

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "()I")
	@Override
	public int method5023() {
		return this.aClass81_Sub4_Sub1_2.anInt5615;
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method5026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) opengl local3 = this.aClass37_Sub1_6.anOpengl1;
		this.aClass81_Sub4_Sub1_2.method4737(true);
		this.aClass37_Sub1_6.method754();
		this.aClass37_Sub1_6.method731(arg6);
		local3.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean86) {
			@Pc(40) float local40 = (float) arg2 / (float) this.method5031();
			@Pc(47) float local47 = (float) arg3 / (float) this.method5022();
			@Pc(56) float local56 = (float) arg0 + (float) this.anInt833 * local40;
			@Pc(65) float local65 = (float) arg1 + (float) this.anInt835 * local47;
			@Pc(74) float local74 = local56 + (float) this.aClass81_Sub4_Sub1_2.anInt5616 * local40;
			@Pc(83) float local83 = local65 + (float) this.aClass81_Sub4_Sub1_2.anInt5615 * local47;
			if (this.aClass81_Sub4_Sub1_3 == null) {
				this.aClass37_Sub1_6.method767(this.aClass81_Sub4_Sub1_2);
				this.aClass37_Sub1_6.method774(arg4);
				local3.glBegin(7);
				local3.glTexCoord2f(0.0F, this.aClass81_Sub4_Sub1_2.aFloat67);
				local3.glVertex2f(local56, local65);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2f(local56, local83);
				local3.glTexCoord2f(this.aClass81_Sub4_Sub1_2.aFloat66, 0.0F);
				local3.glVertex2f(local74, local83);
				local3.glTexCoord2f(this.aClass81_Sub4_Sub1_2.aFloat66, this.aClass81_Sub4_Sub1_2.aFloat67);
				local3.glVertex2f(local74, local65);
				local3.glEnd();
			} else {
				this.method991(arg4);
				this.aClass81_Sub4_Sub1_3.method4737(true);
				local3.glBegin(7);
				local3.glMultiTexCoord2f(33985, 0.0F, this.aClass81_Sub4_Sub1_2.aFloat67);
				local3.glTexCoord2f(0.0F, this.aClass81_Sub4_Sub1_2.aFloat67);
				local3.glVertex2f(local56, local65);
				local3.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2f(local56, local83);
				local3.glMultiTexCoord2f(33985, this.aClass81_Sub4_Sub1_2.aFloat66, 0.0F);
				local3.glTexCoord2f(this.aClass81_Sub4_Sub1_2.aFloat66, 0.0F);
				local3.glVertex2f(local74, local83);
				local3.glMultiTexCoord2f(33985, this.aClass81_Sub4_Sub1_2.aFloat66, this.aClass81_Sub4_Sub1_2.aFloat67);
				local3.glTexCoord2f(this.aClass81_Sub4_Sub1_2.aFloat66, this.aClass81_Sub4_Sub1_2.aFloat67);
				local3.glVertex2f(local74, local65);
				local3.glEnd();
				this.method990();
			}
		} else if (this.aClass81_Sub4_Sub1_3 == null) {
			this.aClass37_Sub1_6.method767(this.aClass81_Sub4_Sub1_2);
			this.aClass37_Sub1_6.method774(arg4);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, this.aClass81_Sub4_Sub1_2.aFloat67);
			local3.glVertex2i(arg0, arg1);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(arg0, arg1 + arg3);
			local3.glTexCoord2f(this.aClass81_Sub4_Sub1_2.aFloat66, 0.0F);
			local3.glVertex2i(arg0 + arg2, arg1 + arg3);
			local3.glTexCoord2f(this.aClass81_Sub4_Sub1_2.aFloat66, this.aClass81_Sub4_Sub1_2.aFloat67);
			local3.glVertex2i(arg0 + arg2, arg1);
			local3.glEnd();
		} else {
			this.method991(arg4);
			this.aClass81_Sub4_Sub1_3.method4737(true);
			local3.glBegin(7);
			local3.glMultiTexCoord2f(33985, 0.0F, this.aClass81_Sub4_Sub1_2.aFloat67);
			local3.glTexCoord2f(0.0F, this.aClass81_Sub4_Sub1_2.aFloat67);
			local3.glVertex2i(arg0, arg1);
			local3.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(arg0, arg1 + arg3);
			local3.glMultiTexCoord2f(33985, this.aClass81_Sub4_Sub1_2.aFloat66, 0.0F);
			local3.glTexCoord2f(this.aClass81_Sub4_Sub1_2.aFloat66, 0.0F);
			local3.glVertex2i(arg0 + arg2, arg1 + arg3);
			local3.glMultiTexCoord2f(33985, this.aClass81_Sub4_Sub1_2.aFloat66, this.aClass81_Sub4_Sub1_2.aFloat67);
			local3.glTexCoord2f(this.aClass81_Sub4_Sub1_2.aFloat66, this.aClass81_Sub4_Sub1_2.aFloat67);
			local3.glVertex2i(arg0 + arg2, arg1);
			local3.glEnd();
			this.method990();
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass81_Sub4_Sub1_2.method4747(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "()V")
	private void method990() {
		this.aClass37_Sub1_6.method759(1);
		this.aClass37_Sub1_6.method767(null);
		this.aClass37_Sub1_6.method735(8448, 8448);
		this.aClass37_Sub1_6.method732(1, 34168, 768);
		this.aClass37_Sub1_6.method769(0, 5890);
		this.aClass37_Sub1_6.method759(0);
		this.aClass37_Sub1_6.method732(1, 34168, 768);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt833 = arg0;
		this.anInt835 = arg1;
		this.anInt831 = arg2;
		this.anInt834 = arg3;
		this.aBoolean86 = this.anInt833 != 0 || this.anInt835 != 0 || this.anInt831 != 0 || this.anInt834 != 0;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(FFFFFFLclient!or;II)V")
	@Override
	protected void method5035(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class124 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class81_Sub4_Sub1 local3 = ((Class124_Sub2) arg6).aClass81_Sub4_Sub1_5;
		@Pc(10) float local10;
		@Pc(14) float local14;
		@Pc(26) float local26;
		@Pc(32) float local32;
		if (this.aBoolean86) {
			local10 = this.method5031();
			local14 = this.method5022();
			@Pc(20) float local20 = (arg2 - arg0) / local10;
			local26 = (arg3 - arg1) / local10;
			local32 = (arg4 - arg0) / local14;
			@Pc(38) float local38 = (arg5 - arg1) / local14;
			@Pc(44) float local44 = local32 * (float) this.anInt835;
			@Pc(50) float local50 = local38 * (float) this.anInt835;
			@Pc(56) float local56 = local20 * (float) this.anInt833;
			@Pc(62) float local62 = local26 * (float) this.anInt833;
			@Pc(69) float local69 = -local20 * (float) this.anInt831;
			@Pc(76) float local76 = -local26 * (float) this.anInt831;
			@Pc(83) float local83 = -local32 * (float) this.anInt834;
			@Pc(90) float local90 = -local38 * (float) this.anInt834;
			arg0 = arg0 + local56 + local44;
			arg1 = arg1 + local62 + local50;
			arg2 = arg2 + local69 + local44;
			arg3 = arg3 + local76 + local50;
			arg4 = arg4 + local56 + local83;
			arg5 = arg5 + local62 + local90;
		}
		local10 = arg4 + arg2 - arg0;
		local14 = arg3 + arg5 - arg1;
		@Pc(142) opengl local142 = this.aClass37_Sub1_6.anOpengl1;
		this.aClass81_Sub4_Sub1_2.method4737(true);
		this.aClass37_Sub1_6.method754();
		this.aClass37_Sub1_6.method767(this.aClass81_Sub4_Sub1_2);
		this.aClass37_Sub1_6.method774(0);
		this.aClass37_Sub1_6.method759(1);
		this.aClass37_Sub1_6.method767(local3);
		this.aClass37_Sub1_6.method735(7681, 8448);
		this.aClass37_Sub1_6.method732(0, 34168, 768);
		this.aClass37_Sub1_6.method731(1);
		local26 = local3.aFloat66 / (float) local3.anInt5616;
		local32 = local3.aFloat67 / (float) local3.anInt5615;
		local142.glBegin(7);
		local142.glColor3f(1.0F, 1.0F, 1.0F);
		local142.glMultiTexCoord2f(33984, 0.0F, this.aClass81_Sub4_Sub1_2.aFloat67);
		local142.glMultiTexCoord2f(33985, local26 * (arg0 - (float) arg7), local3.aFloat67 - local32 * (arg1 - (float) arg8));
		local142.glVertex2f(arg0, arg1);
		local142.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		local142.glMultiTexCoord2f(33985, local26 * (arg4 - (float) arg7), local3.aFloat67 - local32 * (arg5 - (float) arg8));
		local142.glVertex2f(arg4, arg5);
		local142.glMultiTexCoord2f(33984, this.aClass81_Sub4_Sub1_2.aFloat66, 0.0F);
		local142.glMultiTexCoord2f(33985, local26 * (local10 - (float) arg7), local3.aFloat67 - local32 * (local14 - (float) arg8));
		local142.glVertex2f(local10, local14);
		local142.glMultiTexCoord2f(33984, this.aClass81_Sub4_Sub1_2.aFloat66, this.aClass81_Sub4_Sub1_2.aFloat67);
		local142.glMultiTexCoord2f(33985, local26 * (arg2 - (float) arg7), local3.aFloat67 - local32 * (arg3 - (float) arg8));
		local142.glVertex2f(arg2, arg3);
		local142.glEnd();
		this.aClass37_Sub1_6.method732(0, 5890, 768);
		this.aClass37_Sub1_6.method774(1);
		this.aClass37_Sub1_6.method767(null);
		this.aClass37_Sub1_6.method759(0);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
	private void method991(@OriginalArg(0) int arg0) {
		this.aClass37_Sub1_6.method759(1);
		this.aClass37_Sub1_6.method767(this.aClass81_Sub4_Sub1_2);
		this.aClass37_Sub1_6.method735(this.aClass37_Sub1_6.method747(arg0), 7681);
		this.aClass37_Sub1_6.method732(1, 34167, 768);
		this.aClass37_Sub1_6.method769(0, 34168);
		this.aClass37_Sub1_6.method759(0);
		this.aClass37_Sub1_6.method767(this.aClass81_Sub4_Sub1_3);
		this.aClass37_Sub1_6.method735(34479, 7681);
		this.aClass37_Sub1_6.method732(1, 34166, 768);
		if (this.anInt832 == 0) {
			this.aClass37_Sub1_6.method787(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt832 == 1) {
			this.aClass37_Sub1_6.method787(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt832 == 2) {
			this.aClass37_Sub1_6.method787(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt832 == 3) {
			this.aClass37_Sub1_6.method787(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "()I")
	@Override
	public int method5019() {
		return this.aClass81_Sub4_Sub1_2.anInt5616;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IILclient!or;II)V")
	@Override
	public void method5018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class124_Sub2 local2 = (Class124_Sub2) arg2;
		@Pc(5) Class81_Sub4_Sub1 local5 = local2.aClass81_Sub4_Sub1_5;
		this.aClass81_Sub4_Sub1_2.method4737(false);
		this.aClass37_Sub1_6.method754();
		this.aClass37_Sub1_6.method767(this.aClass81_Sub4_Sub1_2);
		this.aClass37_Sub1_6.method774(0);
		this.aClass37_Sub1_6.method759(1);
		this.aClass37_Sub1_6.method767(local5);
		this.aClass37_Sub1_6.method735(7681, 8448);
		this.aClass37_Sub1_6.method732(0, 34168, 768);
		this.aClass37_Sub1_6.method731(1);
		@Pc(49) int local49 = arg0 + this.anInt833;
		@Pc(54) int local54 = arg1 + this.anInt835;
		@Pc(60) int local60 = local49 + this.aClass81_Sub4_Sub1_2.anInt5616;
		@Pc(66) int local66 = local54 + this.aClass81_Sub4_Sub1_2.anInt5615;
		@Pc(73) float local73 = local5.aFloat66 / (float) local5.anInt5616;
		@Pc(80) float local80 = local5.aFloat67 / (float) local5.anInt5615;
		@Pc(87) float local87 = (float) (local49 - arg3) * local73;
		@Pc(94) float local94 = (float) (local60 - arg3) * local73;
		@Pc(104) float local104 = local5.aFloat67 - (float) (local54 - arg4) * local80;
		@Pc(114) float local114 = local5.aFloat67 - (float) (local66 - arg4) * local80;
		@Pc(118) opengl local118 = this.aClass37_Sub1_6.anOpengl1;
		local118.glBegin(7);
		local118.glColor3f(1.0F, 1.0F, 1.0F);
		local118.glMultiTexCoord2f(33984, 0.0F, this.aClass81_Sub4_Sub1_2.aFloat67);
		local118.glMultiTexCoord2f(33985, local87, local104);
		local118.glVertex2i(local49, local54);
		local118.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		local118.glMultiTexCoord2f(33985, local87, local114);
		local118.glVertex2i(local49, local54 + this.aClass81_Sub4_Sub1_2.anInt5615);
		local118.glMultiTexCoord2f(33984, this.aClass81_Sub4_Sub1_2.aFloat66, 0.0F);
		local118.glMultiTexCoord2f(33985, local94, local114);
		local118.glVertex2i(local49 + this.aClass81_Sub4_Sub1_2.anInt5616, local54 + this.aClass81_Sub4_Sub1_2.anInt5615);
		local118.glMultiTexCoord2f(33984, this.aClass81_Sub4_Sub1_2.aFloat66, this.aClass81_Sub4_Sub1_2.aFloat67);
		local118.glMultiTexCoord2f(33985, local94, local104);
		local118.glVertex2i(local49 + this.aClass81_Sub4_Sub1_2.anInt5616, local54);
		local118.glEnd();
		this.aClass37_Sub1_6.method732(0, 5890, 768);
		this.aClass37_Sub1_6.method774(1);
		this.aClass37_Sub1_6.method767(null);
		this.aClass37_Sub1_6.method759(0);
	}
}
