import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class90_Sub2 extends Class90 {

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "Lclient!bc;")
	private Class18_Sub1_Sub1 aClass18_Sub1_Sub1_4;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
	private int anInt6237 = 0;

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
	private int anInt6238 = 0;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "Z")
	private boolean aBoolean550 = false;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
	private int anInt6239 = 0;

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
	private int anInt6241 = 0;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
	private int anInt6240 = 0;

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "Lclient!hj;")
	private final Class2_Sub1 aClass2_Sub1_37;

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "Lclient!bc;")
	private final Class18_Sub1_Sub1 aClass18_Sub1_Sub1_5;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!hj;IIII)V")
	public Class90_Sub2(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass2_Sub1_37 = arg0;
		this.aClass18_Sub1_Sub1_5 = Static356.method505(arg4, arg2, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!hj;II[III)V")
	public Class90_Sub2(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass2_Sub1_37 = arg0;
		this.aClass18_Sub1_Sub1_5 = Static356.method507(arg0, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method5455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) opengl local3 = this.aClass2_Sub1_37.anOpengl1;
		this.aClass18_Sub1_Sub1_5.method4852(false);
		this.aClass2_Sub1_37.method2329();
		this.aClass2_Sub1_37.method2336(1);
		local3.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) int local35 = arg0 + this.anInt6237;
		@Pc(40) int local40 = arg1 + this.anInt6240;
		if (this.aClass18_Sub1_Sub1_4 == null) {
			this.aClass2_Sub1_37.method2376(this.aClass18_Sub1_Sub1_5);
			this.aClass2_Sub1_37.method2340(arg2);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, this.aClass18_Sub1_Sub1_5.aFloat5);
			local3.glVertex2i(local35, local40);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(local35, local40 + this.aClass18_Sub1_Sub1_5.anInt440);
			local3.glTexCoord2f(this.aClass18_Sub1_Sub1_5.aFloat4, 0.0F);
			local3.glVertex2i(local35 + this.aClass18_Sub1_Sub1_5.anInt441, local40 + this.aClass18_Sub1_Sub1_5.anInt440);
			local3.glTexCoord2f(this.aClass18_Sub1_Sub1_5.aFloat4, this.aClass18_Sub1_Sub1_5.aFloat5);
			local3.glVertex2i(local35 + this.aClass18_Sub1_Sub1_5.anInt441, local40);
			local3.glEnd();
			return;
		}
		this.method5473(arg2);
		this.aClass18_Sub1_Sub1_4.method4852(false);
		local3.glBegin(7);
		local3.glMultiTexCoord2f(33985, 0.0F, this.aClass18_Sub1_Sub1_5.aFloat5);
		local3.glTexCoord2f(0.0F, this.aClass18_Sub1_Sub1_5.aFloat5);
		local3.glVertex2i(local35, local40);
		local3.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		local3.glTexCoord2f(0.0F, 0.0F);
		local3.glVertex2i(local35, local40 + this.aClass18_Sub1_Sub1_5.anInt440);
		local3.glMultiTexCoord2f(33985, this.aClass18_Sub1_Sub1_5.aFloat4, 0.0F);
		local3.glTexCoord2f(this.aClass18_Sub1_Sub1_5.aFloat4, 0.0F);
		local3.glVertex2i(local35 + this.aClass18_Sub1_Sub1_5.anInt441, local40 + this.aClass18_Sub1_Sub1_5.anInt440);
		local3.glMultiTexCoord2f(33985, this.aClass18_Sub1_Sub1_5.aFloat4, this.aClass18_Sub1_Sub1_5.aFloat5);
		local3.glTexCoord2f(this.aClass18_Sub1_Sub1_5.aFloat4, this.aClass18_Sub1_Sub1_5.aFloat5);
		local3.glVertex2i(local35 + this.aClass18_Sub1_Sub1_5.anInt441, local40);
		local3.glEnd();
		this.method5472();
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method5465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) opengl local3 = this.aClass2_Sub1_37.anOpengl1;
		@Pc(7) int local7 = arg0 + arg2;
		@Pc(11) int local11 = arg1 + arg3;
		this.aClass18_Sub1_Sub1_5.method4852(false);
		this.aClass2_Sub1_37.method2329();
		this.aClass2_Sub1_37.method2376(this.aClass18_Sub1_Sub1_5);
		this.aClass2_Sub1_37.method2336(1);
		this.aClass2_Sub1_37.method2340(arg4);
		local3.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass18_Sub1_Sub1_5.aBoolean50 && !this.aBoolean550) {
			@Pc(66) float local66 = this.aClass18_Sub1_Sub1_5.aFloat5 * (float) arg3 / (float) this.aClass18_Sub1_Sub1_5.anInt440;
			@Pc(78) float local78 = this.aClass18_Sub1_Sub1_5.aFloat4 * (float) arg2 / (float) this.aClass18_Sub1_Sub1_5.anInt441;
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
		local3.glTranslatef((float) this.anInt6237, (float) this.anInt6240, 0.0F);
		@Pc(130) int local130 = this.method5464();
		@Pc(133) int local133 = this.method5467();
		@Pc(139) int local139 = arg1 + this.aClass18_Sub1_Sub1_5.anInt440;
		local3.glBegin(7);
		@Pc(144) int local144 = arg1;
		@Pc(153) int local153;
		while (local139 <= local11) {
			local153 = arg0 + this.aClass18_Sub1_Sub1_5.anInt441;
			@Pc(155) int local155 = arg0;
			while (local153 <= local7) {
				local3.glTexCoord2f(0.0F, this.aClass18_Sub1_Sub1_5.aFloat5);
				local3.glVertex2i(local155, local144);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2i(local155, local139);
				local3.glTexCoord2f(this.aClass18_Sub1_Sub1_5.aFloat4, 0.0F);
				local3.glVertex2i(local153, local139);
				local3.glTexCoord2f(this.aClass18_Sub1_Sub1_5.aFloat4, this.aClass18_Sub1_Sub1_5.aFloat5);
				local3.glVertex2i(local153, local144);
				local153 += local130;
				local155 += local130;
			}
			if (local155 < local7) {
				@Pc(224) float local224 = this.aClass18_Sub1_Sub1_5.aFloat4 * (float) (local7 - local155) / (float) this.aClass18_Sub1_Sub1_5.anInt441;
				local3.glTexCoord2f(0.0F, this.aClass18_Sub1_Sub1_5.aFloat5);
				local3.glVertex2i(local155, local144);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2i(local155, local139);
				local3.glTexCoord2f(local224, 0.0F);
				local3.glVertex2i(local7, local139);
				local3.glTexCoord2f(local224, this.aClass18_Sub1_Sub1_5.aFloat5);
				local3.glVertex2i(local7, local144);
			}
			local144 += local133;
			local139 += local133;
		}
		if (local144 < local11) {
			@Pc(290) float local290 = this.aClass18_Sub1_Sub1_5.aFloat5 * (float) (this.aClass18_Sub1_Sub1_5.anInt440 + local144 - local11) / (float) this.aClass18_Sub1_Sub1_5.anInt440;
			@Pc(296) int local296 = arg0 + this.aClass18_Sub1_Sub1_5.anInt441;
			local153 = arg0;
			while (local296 <= local7) {
				local3.glTexCoord2f(0.0F, this.aClass18_Sub1_Sub1_5.aFloat5);
				local3.glVertex2i(local153, local144);
				local3.glTexCoord2f(0.0F, local290);
				local3.glVertex2i(local153, local11);
				local3.glTexCoord2f(this.aClass18_Sub1_Sub1_5.aFloat4, local290);
				local3.glVertex2i(local296, local11);
				local3.glTexCoord2f(this.aClass18_Sub1_Sub1_5.aFloat4, this.aClass18_Sub1_Sub1_5.aFloat5);
				local3.glVertex2i(local296, local144);
				local296 += local130;
				local153 += local130;
			}
			if (local153 < local7) {
				@Pc(367) float local367 = this.aClass18_Sub1_Sub1_5.aFloat4 * (float) (local7 - local153) / (float) this.aClass18_Sub1_Sub1_5.anInt441;
				local3.glTexCoord2f(0.0F, this.aClass18_Sub1_Sub1_5.aFloat5);
				local3.glVertex2i(local153, local144);
				local3.glTexCoord2f(0.0F, local290);
				local3.glVertex2i(local153, local11);
				local3.glTexCoord2f(local367, local290);
				local3.glVertex2i(local7, local11);
				local3.glTexCoord2f(local367, this.aClass18_Sub1_Sub1_5.aFloat5);
				local3.glVertex2i(local7, local144);
			}
		}
		local3.glEnd();
		local3.glPopMatrix();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)V")
	@Override
	public void method5456(@OriginalArg(2) int arg0) {
		@Pc(3) opengl local3 = this.aClass2_Sub1_37.anOpengl1;
		local3.glPixelTransferf(3348, 0.5F);
		local3.glPixelTransferf(3349, 0.499F);
		local3.glPixelTransferf(3352, 0.5F);
		local3.glPixelTransferf(3353, 0.499F);
		local3.glPixelTransferf(3354, 0.5F);
		local3.glPixelTransferf(3355, 0.499F);
		this.aClass18_Sub1_Sub1_4 = Static356.method505(this.aClass18_Sub1_Sub1_5.anInt440, 0, 0, this.aClass2_Sub1_37, this.aClass18_Sub1_Sub1_5.anInt441);
		this.anInt6239 = arg0;
		local3.glPixelTransferf(3348, 1.0F);
		local3.glPixelTransferf(3349, 0.0F);
		local3.glPixelTransferf(3352, 1.0F);
		local3.glPixelTransferf(3353, 0.0F);
		local3.glPixelTransferf(3354, 1.0F);
		local3.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "()V")
	private void method5472() {
		this.aClass2_Sub1_37.method2373(1);
		this.aClass2_Sub1_37.method2376(null);
		this.aClass2_Sub1_37.method2351(8448, 8448);
		this.aClass2_Sub1_37.method2372(1, 34168, 768);
		this.aClass2_Sub1_37.method2346(0, 5890);
		this.aClass2_Sub1_37.method2373(0);
		this.aClass2_Sub1_37.method2372(1, 34168, 768);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "()I")
	@Override
	public int method5464() {
		return this.aClass18_Sub1_Sub1_5.anInt441 + this.anInt6237 + this.anInt6238;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "()I")
	@Override
	public int method5466() {
		return this.aClass18_Sub1_Sub1_5.anInt440;
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "()I")
	@Override
	public int method5471() {
		return this.aClass18_Sub1_Sub1_5.anInt441;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected void method5463(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean550) {
			local6 = this.method5464();
			local10 = this.method5467();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(28) float local28 = (arg4 - arg0) / local10;
			@Pc(34) float local34 = (arg5 - arg1) / local10;
			@Pc(40) float local40 = local28 * (float) this.anInt6240;
			@Pc(46) float local46 = local34 * (float) this.anInt6240;
			@Pc(52) float local52 = local16 * (float) this.anInt6237;
			@Pc(58) float local58 = local22 * (float) this.anInt6237;
			@Pc(65) float local65 = -local16 * (float) this.anInt6238;
			@Pc(72) float local72 = -local22 * (float) this.anInt6238;
			@Pc(79) float local79 = -local28 * (float) this.anInt6241;
			@Pc(86) float local86 = -local34 * (float) this.anInt6241;
			arg0 = arg0 + local52 + local40;
			arg1 = arg1 + local58 + local46;
			arg2 = arg2 + local65 + local40;
			arg3 = arg3 + local72 + local46;
			arg4 = arg4 + local52 + local79;
			arg5 = arg5 + local58 + local86;
		}
		local6 = arg4 + arg2 - arg0;
		local10 = arg3 + arg5 - arg1;
		@Pc(138) opengl local138 = this.aClass2_Sub1_37.anOpengl1;
		this.aClass18_Sub1_Sub1_5.method4852(true);
		this.aClass2_Sub1_37.method2329();
		this.aClass2_Sub1_37.method2376(this.aClass18_Sub1_Sub1_5);
		this.aClass2_Sub1_37.method2336(1);
		this.aClass2_Sub1_37.method2340(arg6);
		local138.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		local138.glBegin(7);
		local138.glTexCoord2f(0.0F, this.aClass18_Sub1_Sub1_5.aFloat5);
		local138.glVertex2f(arg0, arg1);
		local138.glTexCoord2f(0.0F, 0.0F);
		local138.glVertex2f(arg4, arg5);
		local138.glTexCoord2f(this.aClass18_Sub1_Sub1_5.aFloat4, 0.0F);
		local138.glVertex2f(local6, local10);
		local138.glTexCoord2f(this.aClass18_Sub1_Sub1_5.aFloat4, this.aClass18_Sub1_Sub1_5.aFloat5);
		local138.glVertex2f(arg2, arg3);
		local138.glEnd();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6237 = arg0;
		this.anInt6240 = arg1;
		this.anInt6238 = arg2;
		this.anInt6241 = arg3;
		this.aBoolean550 = this.anInt6237 != 0 || this.anInt6240 != 0 || this.anInt6238 != 0 || this.anInt6241 != 0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) opengl local3 = this.aClass2_Sub1_37.anOpengl1;
		this.aClass18_Sub1_Sub1_5.method4852(true);
		this.aClass2_Sub1_37.method2329();
		this.aClass2_Sub1_37.method2336(arg6);
		local3.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean550) {
			@Pc(40) float local40 = (float) arg2 / (float) this.method5464();
			@Pc(47) float local47 = (float) arg3 / (float) this.method5467();
			@Pc(56) float local56 = (float) arg0 + (float) this.anInt6237 * local40;
			@Pc(65) float local65 = (float) arg1 + (float) this.anInt6240 * local47;
			@Pc(74) float local74 = local56 + (float) this.aClass18_Sub1_Sub1_5.anInt441 * local40;
			@Pc(83) float local83 = local65 + (float) this.aClass18_Sub1_Sub1_5.anInt440 * local47;
			if (this.aClass18_Sub1_Sub1_4 == null) {
				this.aClass2_Sub1_37.method2376(this.aClass18_Sub1_Sub1_5);
				this.aClass2_Sub1_37.method2340(arg4);
				local3.glBegin(7);
				local3.glTexCoord2f(0.0F, this.aClass18_Sub1_Sub1_5.aFloat5);
				local3.glVertex2f(local56, local65);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2f(local56, local83);
				local3.glTexCoord2f(this.aClass18_Sub1_Sub1_5.aFloat4, 0.0F);
				local3.glVertex2f(local74, local83);
				local3.glTexCoord2f(this.aClass18_Sub1_Sub1_5.aFloat4, this.aClass18_Sub1_Sub1_5.aFloat5);
				local3.glVertex2f(local74, local65);
				local3.glEnd();
			} else {
				this.method5473(arg4);
				this.aClass18_Sub1_Sub1_4.method4852(true);
				local3.glBegin(7);
				local3.glMultiTexCoord2f(33985, 0.0F, this.aClass18_Sub1_Sub1_5.aFloat5);
				local3.glTexCoord2f(0.0F, this.aClass18_Sub1_Sub1_5.aFloat5);
				local3.glVertex2f(local56, local65);
				local3.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2f(local56, local83);
				local3.glMultiTexCoord2f(33985, this.aClass18_Sub1_Sub1_5.aFloat4, 0.0F);
				local3.glTexCoord2f(this.aClass18_Sub1_Sub1_5.aFloat4, 0.0F);
				local3.glVertex2f(local74, local83);
				local3.glMultiTexCoord2f(33985, this.aClass18_Sub1_Sub1_5.aFloat4, this.aClass18_Sub1_Sub1_5.aFloat5);
				local3.glTexCoord2f(this.aClass18_Sub1_Sub1_5.aFloat4, this.aClass18_Sub1_Sub1_5.aFloat5);
				local3.glVertex2f(local74, local65);
				local3.glEnd();
				this.method5472();
			}
		} else if (this.aClass18_Sub1_Sub1_4 == null) {
			this.aClass2_Sub1_37.method2376(this.aClass18_Sub1_Sub1_5);
			this.aClass2_Sub1_37.method2340(arg4);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, this.aClass18_Sub1_Sub1_5.aFloat5);
			local3.glVertex2i(arg0, arg1);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(arg0, arg1 + arg3);
			local3.glTexCoord2f(this.aClass18_Sub1_Sub1_5.aFloat4, 0.0F);
			local3.glVertex2i(arg0 + arg2, arg1 + arg3);
			local3.glTexCoord2f(this.aClass18_Sub1_Sub1_5.aFloat4, this.aClass18_Sub1_Sub1_5.aFloat5);
			local3.glVertex2i(arg0 + arg2, arg1);
			local3.glEnd();
		} else {
			this.method5473(arg4);
			this.aClass18_Sub1_Sub1_4.method4852(true);
			local3.glBegin(7);
			local3.glMultiTexCoord2f(33985, 0.0F, this.aClass18_Sub1_Sub1_5.aFloat5);
			local3.glTexCoord2f(0.0F, this.aClass18_Sub1_Sub1_5.aFloat5);
			local3.glVertex2i(arg0, arg1);
			local3.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(arg0, arg1 + arg3);
			local3.glMultiTexCoord2f(33985, this.aClass18_Sub1_Sub1_5.aFloat4, 0.0F);
			local3.glTexCoord2f(this.aClass18_Sub1_Sub1_5.aFloat4, 0.0F);
			local3.glVertex2i(arg0 + arg2, arg1 + arg3);
			local3.glMultiTexCoord2f(33985, this.aClass18_Sub1_Sub1_5.aFloat4, this.aClass18_Sub1_Sub1_5.aFloat5);
			local3.glTexCoord2f(this.aClass18_Sub1_Sub1_5.aFloat4, this.aClass18_Sub1_Sub1_5.aFloat5);
			local3.glVertex2i(arg0 + arg2, arg1);
			local3.glEnd();
			this.method5472();
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass18_Sub1_Sub1_5.method501(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	private void method5473(@OriginalArg(0) int arg0) {
		this.aClass2_Sub1_37.method2373(1);
		this.aClass2_Sub1_37.method2376(this.aClass18_Sub1_Sub1_5);
		this.aClass2_Sub1_37.method2351(this.aClass2_Sub1_37.method2320(arg0), 7681);
		this.aClass2_Sub1_37.method2372(1, 34167, 768);
		this.aClass2_Sub1_37.method2346(0, 34168);
		this.aClass2_Sub1_37.method2373(0);
		this.aClass2_Sub1_37.method2376(this.aClass18_Sub1_Sub1_4);
		this.aClass2_Sub1_37.method2351(34479, 7681);
		this.aClass2_Sub1_37.method2372(1, 34166, 768);
		if (this.anInt6239 == 0) {
			this.aClass2_Sub1_37.method2315(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt6239 == 1) {
			this.aClass2_Sub1_37.method2315(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt6239 == 2) {
			this.aClass2_Sub1_37.method2315(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt6239 == 3) {
			this.aClass2_Sub1_37.method2315(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(FFFFFFLclient!tm;II)V")
	@Override
	protected void method5460(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class97 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class18_Sub1_Sub1 local3 = ((Class97_Sub1) arg6).aClass18_Sub1_Sub1_3;
		@Pc(10) float local10;
		@Pc(14) float local14;
		@Pc(26) float local26;
		@Pc(32) float local32;
		if (this.aBoolean550) {
			local10 = this.method5464();
			local14 = this.method5467();
			@Pc(20) float local20 = (arg2 - arg0) / local10;
			local26 = (arg3 - arg1) / local10;
			local32 = (arg4 - arg0) / local14;
			@Pc(38) float local38 = (arg5 - arg1) / local14;
			@Pc(44) float local44 = local32 * (float) this.anInt6240;
			@Pc(50) float local50 = local38 * (float) this.anInt6240;
			@Pc(56) float local56 = local20 * (float) this.anInt6237;
			@Pc(62) float local62 = local26 * (float) this.anInt6237;
			@Pc(69) float local69 = -local20 * (float) this.anInt6238;
			@Pc(76) float local76 = -local26 * (float) this.anInt6238;
			@Pc(83) float local83 = -local32 * (float) this.anInt6241;
			@Pc(90) float local90 = -local38 * (float) this.anInt6241;
			arg0 = arg0 + local56 + local44;
			arg1 = arg1 + local62 + local50;
			arg2 = arg2 + local69 + local44;
			arg3 = arg3 + local76 + local50;
			arg4 = arg4 + local56 + local83;
			arg5 = arg5 + local62 + local90;
		}
		local10 = arg4 + arg2 - arg0;
		local14 = arg3 + arg5 - arg1;
		@Pc(142) opengl local142 = this.aClass2_Sub1_37.anOpengl1;
		this.aClass18_Sub1_Sub1_5.method4852(true);
		this.aClass2_Sub1_37.method2329();
		this.aClass2_Sub1_37.method2376(this.aClass18_Sub1_Sub1_5);
		this.aClass2_Sub1_37.method2340(0);
		this.aClass2_Sub1_37.method2373(1);
		this.aClass2_Sub1_37.method2376(local3);
		this.aClass2_Sub1_37.method2351(7681, 8448);
		this.aClass2_Sub1_37.method2372(0, 34168, 768);
		this.aClass2_Sub1_37.method2336(1);
		local26 = local3.aFloat4 / (float) local3.anInt441;
		local32 = local3.aFloat5 / (float) local3.anInt440;
		local142.glBegin(7);
		local142.glColor3f(1.0F, 1.0F, 1.0F);
		local142.glMultiTexCoord2f(33984, 0.0F, this.aClass18_Sub1_Sub1_5.aFloat5);
		local142.glMultiTexCoord2f(33985, local26 * (arg0 - (float) arg7), local3.aFloat5 - local32 * (arg1 - (float) arg8));
		local142.glVertex2f(arg0, arg1);
		local142.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		local142.glMultiTexCoord2f(33985, local26 * (arg4 - (float) arg7), local3.aFloat5 - local32 * (arg5 - (float) arg8));
		local142.glVertex2f(arg4, arg5);
		local142.glMultiTexCoord2f(33984, this.aClass18_Sub1_Sub1_5.aFloat4, 0.0F);
		local142.glMultiTexCoord2f(33985, local26 * (local10 - (float) arg7), local3.aFloat5 - local32 * (local14 - (float) arg8));
		local142.glVertex2f(local10, local14);
		local142.glMultiTexCoord2f(33984, this.aClass18_Sub1_Sub1_5.aFloat4, this.aClass18_Sub1_Sub1_5.aFloat5);
		local142.glMultiTexCoord2f(33985, local26 * (arg2 - (float) arg7), local3.aFloat5 - local32 * (arg3 - (float) arg8));
		local142.glVertex2f(arg2, arg3);
		local142.glEnd();
		this.aClass2_Sub1_37.method2372(0, 5890, 768);
		this.aClass2_Sub1_37.method2340(1);
		this.aClass2_Sub1_37.method2376(null);
		this.aClass2_Sub1_37.method2373(0);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILclient!tm;II)V")
	@Override
	public void method5469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class97_Sub1 local2 = (Class97_Sub1) arg2;
		@Pc(5) Class18_Sub1_Sub1 local5 = local2.aClass18_Sub1_Sub1_3;
		this.aClass18_Sub1_Sub1_5.method4852(false);
		this.aClass2_Sub1_37.method2329();
		this.aClass2_Sub1_37.method2376(this.aClass18_Sub1_Sub1_5);
		this.aClass2_Sub1_37.method2340(0);
		this.aClass2_Sub1_37.method2373(1);
		this.aClass2_Sub1_37.method2376(local5);
		this.aClass2_Sub1_37.method2351(7681, 8448);
		this.aClass2_Sub1_37.method2372(0, 34168, 768);
		this.aClass2_Sub1_37.method2336(1);
		@Pc(49) int local49 = arg0 + this.anInt6237;
		@Pc(54) int local54 = arg1 + this.anInt6240;
		@Pc(60) int local60 = local49 + this.aClass18_Sub1_Sub1_5.anInt441;
		@Pc(66) int local66 = local54 + this.aClass18_Sub1_Sub1_5.anInt440;
		@Pc(73) float local73 = local5.aFloat4 / (float) local5.anInt441;
		@Pc(80) float local80 = local5.aFloat5 / (float) local5.anInt440;
		@Pc(87) float local87 = (float) (local49 - arg3) * local73;
		@Pc(94) float local94 = (float) (local60 - arg3) * local73;
		@Pc(104) float local104 = local5.aFloat5 - (float) (local54 - arg4) * local80;
		@Pc(114) float local114 = local5.aFloat5 - (float) (local66 - arg4) * local80;
		@Pc(118) opengl local118 = this.aClass2_Sub1_37.anOpengl1;
		local118.glBegin(7);
		local118.glColor3f(1.0F, 1.0F, 1.0F);
		local118.glMultiTexCoord2f(33984, 0.0F, this.aClass18_Sub1_Sub1_5.aFloat5);
		local118.glMultiTexCoord2f(33985, local87, local104);
		local118.glVertex2i(local49, local54);
		local118.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		local118.glMultiTexCoord2f(33985, local87, local114);
		local118.glVertex2i(local49, local54 + this.aClass18_Sub1_Sub1_5.anInt440);
		local118.glMultiTexCoord2f(33984, this.aClass18_Sub1_Sub1_5.aFloat4, 0.0F);
		local118.glMultiTexCoord2f(33985, local94, local114);
		local118.glVertex2i(local49 + this.aClass18_Sub1_Sub1_5.anInt441, local54 + this.aClass18_Sub1_Sub1_5.anInt440);
		local118.glMultiTexCoord2f(33984, this.aClass18_Sub1_Sub1_5.aFloat4, this.aClass18_Sub1_Sub1_5.aFloat5);
		local118.glMultiTexCoord2f(33985, local94, local104);
		local118.glVertex2i(local49 + this.aClass18_Sub1_Sub1_5.anInt441, local54);
		local118.glEnd();
		this.aClass2_Sub1_37.method2372(0, 5890, 768);
		this.aClass2_Sub1_37.method2340(1);
		this.aClass2_Sub1_37.method2376(null);
		this.aClass2_Sub1_37.method2373(0);
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "()I")
	@Override
	public int method5467() {
		return this.aClass18_Sub1_Sub1_5.anInt440 + this.anInt6240 + this.anInt6241;
	}
}
