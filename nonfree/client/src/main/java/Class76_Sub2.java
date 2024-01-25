import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class76_Sub2 extends Class76 {

	@OriginalMember(owner = "client!wi", name = "w", descriptor = "Lclient!gk;")
	private Class65_Sub3_Sub1 aClass65_Sub3_Sub1_5;

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
	private int anInt7685 = 0;

	@OriginalMember(owner = "client!wi", name = "q", descriptor = "Z")
	private boolean aBoolean659 = false;

	@OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
	private int anInt7687 = 0;

	@OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
	private int anInt7693 = 0;

	@OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
	private int anInt7694 = 0;

	@OriginalMember(owner = "client!wi", name = "C", descriptor = "I")
	private int anInt7699 = 0;

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "Lclient!bo;")
	private final Class26_Sub1 aClass26_Sub1_42;

	@OriginalMember(owner = "client!wi", name = "n", descriptor = "Lclient!gk;")
	private final Class65_Sub3_Sub1 aClass65_Sub3_Sub1_4;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!bo;IIII)V")
	public Class76_Sub2(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass26_Sub1_42 = arg0;
		this.aClass65_Sub3_Sub1_4 = Static378.method5273(arg0, arg1, arg2, arg4, arg3);
	}

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!bo;II[III)V")
	public Class76_Sub2(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass26_Sub1_42 = arg0;
		this.aClass65_Sub3_Sub1_4 = Static157.method2350(arg0, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILclient!ea;II)V")
	@Override
	public void method6094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class14_Sub2 local6 = (Class14_Sub2) arg2;
		@Pc(9) Class65_Sub3_Sub1 local9 = local6.aClass65_Sub3_Sub1_2;
		this.aClass65_Sub3_Sub1_4.method4263(false);
		this.aClass26_Sub1_42.method630();
		this.aClass26_Sub1_42.method673(this.aClass65_Sub3_Sub1_4);
		this.aClass26_Sub1_42.method669(1);
		this.aClass26_Sub1_42.method696(1);
		this.aClass26_Sub1_42.method673(local9);
		this.aClass26_Sub1_42.method695(7681, 8448);
		this.aClass26_Sub1_42.method646(0, 768, 34168);
		this.aClass26_Sub1_42.method671(1);
		@Pc(62) int local62 = arg1 + this.anInt7699;
		@Pc(67) int local67 = arg0 + this.anInt7687;
		@Pc(74) int local74 = local67 + this.aClass65_Sub3_Sub1_4.anInt2650;
		@Pc(81) int local81 = local62 + this.aClass65_Sub3_Sub1_4.anInt2651;
		@Pc(88) float local88 = local9.aFloat84 / (float) local9.anInt2650;
		@Pc(95) float local95 = local9.aFloat85 / (float) local9.anInt2651;
		@Pc(103) float local103 = local88 * (float) (local67 - arg3);
		@Pc(111) float local111 = local88 * (float) (local74 - arg3);
		@Pc(123) float local123 = local9.aFloat85 - local95 * (float) (local62 - arg4);
		@Pc(135) float local135 = local9.aFloat85 - local95 * (float) (local81 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass65_Sub3_Sub1_4.aFloat85);
		OpenGL.glMultiTexCoord2f(33985, local103, local123);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local103, local135);
		OpenGL.glVertex2i(local67, local62 + this.aClass65_Sub3_Sub1_4.anInt2651);
		OpenGL.glMultiTexCoord2f(33984, this.aClass65_Sub3_Sub1_4.aFloat84, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local111, local135);
		OpenGL.glVertex2i(local67 + this.aClass65_Sub3_Sub1_4.anInt2650, local62 + this.aClass65_Sub3_Sub1_4.anInt2651);
		OpenGL.glMultiTexCoord2f(33984, this.aClass65_Sub3_Sub1_4.aFloat84, this.aClass65_Sub3_Sub1_4.aFloat85);
		OpenGL.glMultiTexCoord2f(33985, local111, local123);
		OpenGL.glVertex2i(local67 + this.aClass65_Sub3_Sub1_4.anInt2650, local62);
		OpenGL.glEnd();
		this.aClass26_Sub1_42.method646(0, 768, 5890);
		this.aClass26_Sub1_42.method669(0);
		this.aClass26_Sub1_42.method673(null);
		this.aClass26_Sub1_42.method696(0);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V")
	private void method5961() {
		this.aClass26_Sub1_42.method696(1);
		this.aClass26_Sub1_42.method673(null);
		this.aClass26_Sub1_42.method695(8448, 8448);
		this.aClass26_Sub1_42.method646(1, 768, 34168);
		this.aClass26_Sub1_42.method643(0, 5890);
		this.aClass26_Sub1_42.method696(0);
		this.aClass26_Sub1_42.method646(1, 768, 34168);
	}

	@OriginalMember(owner = "client!wi", name = "W", descriptor = "(IIIIII)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass65_Sub3_Sub1_4.method1959(arg0, arg3, arg1, arg2, arg5, arg4);
	}

	@OriginalMember(owner = "client!wi", name = "M", descriptor = "(IIIIIII)V")
	@Override
	public void M(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass65_Sub3_Sub1_4.method4263(true);
		this.aClass26_Sub1_42.method630();
		this.aClass26_Sub1_42.method671(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean659) {
			@Pc(182) float local182 = (float) arg2 / (float) this.ja();
			@Pc(189) float local189 = (float) arg3 / (float) this.JA();
			@Pc(198) float local198 = (float) arg0 + local182 * (float) this.anInt7687;
			@Pc(207) float local207 = (float) arg1 + (float) this.anInt7699 * local189;
			@Pc(216) float local216 = local182 * (float) this.aClass65_Sub3_Sub1_4.anInt2650 + local198;
			@Pc(225) float local225 = local207 + local189 * (float) this.aClass65_Sub3_Sub1_4.anInt2651;
			if (this.aClass65_Sub3_Sub1_5 == null) {
				this.aClass26_Sub1_42.method673(this.aClass65_Sub3_Sub1_4);
				this.aClass26_Sub1_42.method669(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub3_Sub1_4.aFloat85);
				OpenGL.glVertex2f(local198, local207);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local198, local225);
				OpenGL.glTexCoord2f(this.aClass65_Sub3_Sub1_4.aFloat84, 0.0F);
				OpenGL.glVertex2f(local216, local225);
				OpenGL.glTexCoord2f(this.aClass65_Sub3_Sub1_4.aFloat84, this.aClass65_Sub3_Sub1_4.aFloat85);
				OpenGL.glVertex2f(local216, local207);
				OpenGL.glEnd();
			} else {
				this.method5964(arg4);
				this.aClass65_Sub3_Sub1_5.method4263(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass65_Sub3_Sub1_4.aFloat85);
				OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub3_Sub1_4.aFloat85);
				OpenGL.glVertex2f(local198, local207);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local198, local225);
				OpenGL.glMultiTexCoord2f(33985, this.aClass65_Sub3_Sub1_4.aFloat84, 0.0F);
				OpenGL.glTexCoord2f(this.aClass65_Sub3_Sub1_4.aFloat84, 0.0F);
				OpenGL.glVertex2f(local216, local225);
				OpenGL.glMultiTexCoord2f(33985, this.aClass65_Sub3_Sub1_4.aFloat84, this.aClass65_Sub3_Sub1_4.aFloat85);
				OpenGL.glTexCoord2f(this.aClass65_Sub3_Sub1_4.aFloat84, this.aClass65_Sub3_Sub1_4.aFloat85);
				OpenGL.glVertex2f(local216, local207);
				OpenGL.glEnd();
				this.method5961();
			}
		} else if (this.aClass65_Sub3_Sub1_5 == null) {
			this.aClass26_Sub1_42.method673(this.aClass65_Sub3_Sub1_4);
			this.aClass26_Sub1_42.method669(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub3_Sub1_4.aFloat85);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass65_Sub3_Sub1_4.aFloat84, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass65_Sub3_Sub1_4.aFloat84, this.aClass65_Sub3_Sub1_4.aFloat85);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method5964(arg4);
			this.aClass65_Sub3_Sub1_5.method4263(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass65_Sub3_Sub1_4.aFloat85);
			OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub3_Sub1_4.aFloat85);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass65_Sub3_Sub1_4.aFloat84, 0.0F);
			OpenGL.glTexCoord2f(this.aClass65_Sub3_Sub1_4.aFloat84, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass65_Sub3_Sub1_4.aFloat84, this.aClass65_Sub3_Sub1_4.aFloat85);
			OpenGL.glTexCoord2f(this.aClass65_Sub3_Sub1_4.aFloat84, this.aClass65_Sub3_Sub1_4.aFloat85);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method5961();
		}
	}

	@OriginalMember(owner = "client!wi", name = "YA", descriptor = "(IIIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass65_Sub3_Sub1_4.method4263(false);
		this.aClass26_Sub1_42.method630();
		this.aClass26_Sub1_42.method671(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt7687;
		@Pc(42) int local42 = arg1 + this.anInt7699;
		if (this.aClass65_Sub3_Sub1_5 == null) {
			this.aClass26_Sub1_42.method673(this.aClass65_Sub3_Sub1_4);
			this.aClass26_Sub1_42.method669(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub3_Sub1_4.aFloat85);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, this.aClass65_Sub3_Sub1_4.anInt2651 + local42);
			OpenGL.glTexCoord2f(this.aClass65_Sub3_Sub1_4.aFloat84, 0.0F);
			OpenGL.glVertex2i(local37 + this.aClass65_Sub3_Sub1_4.anInt2650, this.aClass65_Sub3_Sub1_4.anInt2651 + local42);
			OpenGL.glTexCoord2f(this.aClass65_Sub3_Sub1_4.aFloat84, this.aClass65_Sub3_Sub1_4.aFloat85);
			OpenGL.glVertex2i(this.aClass65_Sub3_Sub1_4.anInt2650 + local37, local42);
			OpenGL.glEnd();
			return;
		}
		this.method5964(arg2);
		this.aClass65_Sub3_Sub1_5.method4263(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass65_Sub3_Sub1_4.aFloat85);
		OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub3_Sub1_4.aFloat85);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, this.aClass65_Sub3_Sub1_4.anInt2651 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass65_Sub3_Sub1_4.aFloat84, 0.0F);
		OpenGL.glTexCoord2f(this.aClass65_Sub3_Sub1_4.aFloat84, 0.0F);
		OpenGL.glVertex2i(this.aClass65_Sub3_Sub1_4.anInt2650 + local37, local42 - -this.aClass65_Sub3_Sub1_4.anInt2651);
		OpenGL.glMultiTexCoord2f(33985, this.aClass65_Sub3_Sub1_4.aFloat84, this.aClass65_Sub3_Sub1_4.aFloat85);
		OpenGL.glTexCoord2f(this.aClass65_Sub3_Sub1_4.aFloat84, this.aClass65_Sub3_Sub1_4.aFloat85);
		OpenGL.glVertex2i(this.aClass65_Sub3_Sub1_4.anInt2650 + local37, local42);
		OpenGL.glEnd();
		this.method5961();
	}

	@OriginalMember(owner = "client!wi", name = "UA", descriptor = "()I")
	@Override
	public int UA() {
		return this.aClass65_Sub3_Sub1_4.anInt2650;
	}

	@OriginalMember(owner = "client!wi", name = "aa", descriptor = "(FFFFFFIII)V")
	@Override
	protected void aa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean659) {
			local10 = this.ja();
			local14 = this.JA();
			@Pc(20) float local20 = (arg2 - arg0) / local10;
			@Pc(26) float local26 = (arg3 - arg1) / local10;
			@Pc(33) float local33 = (arg4 - arg0) / local14;
			@Pc(40) float local40 = (arg5 - arg1) / local14;
			@Pc(46) float local46 = local33 * (float) this.anInt7699;
			@Pc(52) float local52 = local40 * (float) this.anInt7699;
			@Pc(58) float local58 = local20 * (float) this.anInt7687;
			@Pc(64) float local64 = (float) this.anInt7687 * local26;
			@Pc(71) float local71 = (float) this.anInt7694 * -local20;
			@Pc(78) float local78 = -local26 * (float) this.anInt7694;
			@Pc(85) float local85 = (float) this.anInt7685 * -local33;
			@Pc(92) float local92 = -local40 * (float) this.anInt7685;
			arg4 = local85 + local58 + arg4;
			arg2 = arg2 + local71 + local46;
			arg0 = local46 + arg0 + local58;
			arg3 = local52 + arg3 + local78;
			arg1 = local64 + arg1 + local52;
			arg5 = local64 + arg5 + local92;
		}
		local10 = arg4 + arg2 - arg0;
		this.aClass65_Sub3_Sub1_4.method4263(true);
		local14 = arg3 + arg5 - arg1;
		this.aClass26_Sub1_42.method630();
		this.aClass26_Sub1_42.method673(this.aClass65_Sub3_Sub1_4);
		this.aClass26_Sub1_42.method671(arg8);
		this.aClass26_Sub1_42.method669(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub3_Sub1_4.aFloat85);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass65_Sub3_Sub1_4.aFloat84, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass65_Sub3_Sub1_4.aFloat84, this.aClass65_Sub3_Sub1_4.aFloat85);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(FFFFFFLclient!ea;II)V")
	@Override
	protected void method6096(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class14 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class65_Sub3_Sub1 local7 = ((Class14_Sub2) arg6).aClass65_Sub3_Sub1_2;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(31) float local31;
		if (this.aBoolean659) {
			local14 = this.ja();
			local18 = this.JA();
			local25 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(37) float local37 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = (float) this.anInt7699 * local37;
			@Pc(56) float local56 = (float) this.anInt7699 * local44;
			@Pc(62) float local62 = local25 * (float) this.anInt7687;
			@Pc(68) float local68 = local31 * (float) this.anInt7687;
			@Pc(75) float local75 = (float) this.anInt7694 * -local25;
			@Pc(82) float local82 = (float) this.anInt7694 * -local31;
			@Pc(89) float local89 = -local37 * (float) this.anInt7685;
			@Pc(96) float local96 = (float) this.anInt7685 * -local44;
			arg0 = local50 + arg0 + local62;
			arg4 = arg4 + local62 + local89;
			arg2 = local50 + local75 + arg2;
			arg1 = arg1 + local68 + local56;
			arg3 = arg3 + local82 + local56;
			arg5 = arg5 + local68 + local96;
		}
		local14 = arg4 + arg2 - arg0;
		this.aClass65_Sub3_Sub1_4.method4263(true);
		local18 = arg3 + arg5 - arg1;
		this.aClass26_Sub1_42.method630();
		this.aClass26_Sub1_42.method673(this.aClass65_Sub3_Sub1_4);
		this.aClass26_Sub1_42.method669(1);
		this.aClass26_Sub1_42.method696(1);
		this.aClass26_Sub1_42.method673(local7);
		this.aClass26_Sub1_42.method695(7681, 8448);
		this.aClass26_Sub1_42.method646(0, 768, 34168);
		this.aClass26_Sub1_42.method671(1);
		local25 = local7.aFloat84 / (float) local7.anInt2650;
		local31 = local7.aFloat85 / (float) local7.anInt2651;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass65_Sub3_Sub1_4.aFloat85);
		OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * local25, local7.aFloat85 - local31 * (arg1 - (float) arg8));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg4) * local25, local7.aFloat85 - (arg5 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass65_Sub3_Sub1_4.aFloat84, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * (local14 - (float) arg7), local7.aFloat85 - local31 * (local18 - (float) arg8));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass65_Sub3_Sub1_4.aFloat84, this.aClass65_Sub3_Sub1_4.aFloat85);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg2 - (float) arg7), local7.aFloat85 - local31 * (arg3 - (float) arg8));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass26_Sub1_42.method646(0, 768, 5890);
		this.aClass26_Sub1_42.method669(0);
		this.aClass26_Sub1_42.method673(null);
		this.aClass26_Sub1_42.method696(0);
	}

	@OriginalMember(owner = "client!wi", name = "JA", descriptor = "()I")
	@Override
	public int JA() {
		return this.aClass65_Sub3_Sub1_4.anInt2651 + this.anInt7699 + this.anInt7685;
	}

	@OriginalMember(owner = "client!wi", name = "ka", descriptor = "(IIII)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7694 = arg2;
		this.anInt7687 = arg0;
		this.anInt7685 = arg3;
		this.anInt7699 = arg1;
		this.aBoolean659 = this.anInt7687 != 0 || this.anInt7699 != 0 || this.anInt7694 != 0 || this.anInt7685 != 0;
	}

	@OriginalMember(owner = "client!wi", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass65_Sub3_Sub1_5 = Static378.method5273(this.aClass26_Sub1_42, arg0, arg1, this.aClass65_Sub3_Sub1_4.anInt2651, this.aClass65_Sub3_Sub1_4.anInt2650);
		this.anInt7693 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!wi", name = "D", descriptor = "(IIIIIII)V")
	@Override
	public void D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		this.aClass65_Sub3_Sub1_4.method4263(false);
		@Pc(18) int local18 = arg3 + arg1;
		this.aClass26_Sub1_42.method630();
		this.aClass26_Sub1_42.method673(this.aClass65_Sub3_Sub1_4);
		this.aClass26_Sub1_42.method671(arg6);
		this.aClass26_Sub1_42.method669(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass65_Sub3_Sub1_4.aBoolean230 && !this.aBoolean659) {
			@Pc(343) float local343 = this.aClass65_Sub3_Sub1_4.aFloat85 * (float) arg3 / (float) this.aClass65_Sub3_Sub1_4.anInt2651;
			@Pc(355) float local355 = this.aClass65_Sub3_Sub1_4.aFloat84 * (float) arg2 / (float) this.aClass65_Sub3_Sub1_4.anInt2650;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local343);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local18);
			OpenGL.glTexCoord2f(local355, 0.0F);
			OpenGL.glVertex2i(local9, local18);
			OpenGL.glTexCoord2f(local355, local343);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt7687, (float) this.anInt7699, 0.0F);
		@Pc(72) int local72 = this.ja();
		@Pc(75) int local75 = this.JA();
		@Pc(82) int local82 = arg1 + this.aClass65_Sub3_Sub1_4.anInt2651;
		OpenGL.glBegin(7);
		@Pc(86) int local86 = arg1;
		@Pc(94) int local94;
		while (local18 >= local82) {
			local94 = this.aClass65_Sub3_Sub1_4.anInt2650 + arg0;
			@Pc(96) int local96 = arg0;
			while (local9 >= local94) {
				OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub3_Sub1_4.aFloat85);
				OpenGL.glVertex2i(local96, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local96, local82);
				OpenGL.glTexCoord2f(this.aClass65_Sub3_Sub1_4.aFloat84, 0.0F);
				OpenGL.glVertex2i(local94, local82);
				OpenGL.glTexCoord2f(this.aClass65_Sub3_Sub1_4.aFloat84, this.aClass65_Sub3_Sub1_4.aFloat85);
				OpenGL.glVertex2i(local94, local86);
				local94 += local72;
				local96 += local72;
			}
			if (local96 < local9) {
				@Pc(163) float local163 = this.aClass65_Sub3_Sub1_4.aFloat84 * (float) (local9 - local96) / (float) this.aClass65_Sub3_Sub1_4.anInt2650;
				OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub3_Sub1_4.aFloat85);
				OpenGL.glVertex2i(local96, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local96, local82);
				OpenGL.glTexCoord2f(local163, 0.0F);
				OpenGL.glVertex2i(local9, local82);
				OpenGL.glTexCoord2f(local163, this.aClass65_Sub3_Sub1_4.aFloat85);
				OpenGL.glVertex2i(local9, local86);
			}
			local86 += local75;
			local82 += local75;
		}
		if (local86 < local18) {
			@Pc(224) float local224 = this.aClass65_Sub3_Sub1_4.aFloat85 * (float) (this.aClass65_Sub3_Sub1_4.anInt2651 + local86 - local18) / (float) this.aClass65_Sub3_Sub1_4.anInt2651;
			@Pc(231) int local231 = arg0 + this.aClass65_Sub3_Sub1_4.anInt2650;
			local94 = arg0;
			while (local9 >= local231) {
				OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub3_Sub1_4.aFloat85);
				OpenGL.glVertex2i(local94, local86);
				OpenGL.glTexCoord2f(0.0F, local224);
				OpenGL.glVertex2i(local94, local18);
				OpenGL.glTexCoord2f(this.aClass65_Sub3_Sub1_4.aFloat84, local224);
				OpenGL.glVertex2i(local231, local18);
				OpenGL.glTexCoord2f(this.aClass65_Sub3_Sub1_4.aFloat84, this.aClass65_Sub3_Sub1_4.aFloat85);
				OpenGL.glVertex2i(local231, local86);
				local231 += local72;
				local94 += local72;
			}
			if (local9 > local94) {
				@Pc(300) float local300 = (float) (local9 - local94) * this.aClass65_Sub3_Sub1_4.aFloat84 / (float) this.aClass65_Sub3_Sub1_4.anInt2650;
				OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub3_Sub1_4.aFloat85);
				OpenGL.glVertex2i(local94, local86);
				OpenGL.glTexCoord2f(0.0F, local224);
				OpenGL.glVertex2i(local94, local18);
				OpenGL.glTexCoord2f(local300, local224);
				OpenGL.glVertex2i(local9, local18);
				OpenGL.glTexCoord2f(local300, this.aClass65_Sub3_Sub1_4.aFloat85);
				OpenGL.glVertex2i(local9, local86);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)V")
	private void method5964(@OriginalArg(1) int arg0) {
		this.aClass26_Sub1_42.method696(1);
		this.aClass26_Sub1_42.method673(this.aClass65_Sub3_Sub1_4);
		this.aClass26_Sub1_42.method695(this.aClass26_Sub1_42.method625(arg0), 7681);
		this.aClass26_Sub1_42.method646(1, 768, 34167);
		this.aClass26_Sub1_42.method643(0, 34168);
		this.aClass26_Sub1_42.method696(0);
		this.aClass26_Sub1_42.method673(this.aClass65_Sub3_Sub1_5);
		this.aClass26_Sub1_42.method695(34479, 7681);
		this.aClass26_Sub1_42.method646(1, 768, 34166);
		if (this.anInt7693 == 0) {
			this.aClass26_Sub1_42.method659(0.5F, 0.0F, 0.5F, 1.0F);
		} else if (this.anInt7693 == 1) {
			this.aClass26_Sub1_42.method659(0.5F, 0.0F, 1.0F, 0.5F);
		} else if (this.anInt7693 == 2) {
			this.aClass26_Sub1_42.method659(1.0F, 0.0F, 0.5F, 0.5F);
		} else if (this.anInt7693 == 3) {
			this.aClass26_Sub1_42.method659(128.5F, 0.0F, 128.5F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!wi", name = "qa", descriptor = "()I")
	@Override
	public int qa() {
		return this.aClass65_Sub3_Sub1_4.anInt2651;
	}

	@OriginalMember(owner = "client!wi", name = "ja", descriptor = "()I")
	@Override
	public int ja() {
		return this.anInt7687 + this.aClass65_Sub3_Sub1_4.anInt2650 + this.anInt7694;
	}
}
