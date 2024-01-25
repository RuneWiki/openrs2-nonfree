import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class32_Sub3 extends Class32 {

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "Lclient!iba;")
	private Class3_Sub2_Sub1 aClass3_Sub2_Sub1_3;

	@OriginalMember(owner = "client!ko", name = "s", descriptor = "I")
	private int anInt5801 = 0;

	@OriginalMember(owner = "client!ko", name = "k", descriptor = "I")
	private int anInt5796 = 0;

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
	private int anInt5788 = 0;

	@OriginalMember(owner = "client!ko", name = "y", descriptor = "Z")
	private boolean aBoolean389 = false;

	@OriginalMember(owner = "client!ko", name = "x", descriptor = "I")
	private int anInt5806 = 0;

	@OriginalMember(owner = "client!ko", name = "C", descriptor = "I")
	private int anInt5809 = 0;

	@OriginalMember(owner = "client!ko", name = "r", descriptor = "Lclient!wh;")
	private final Class100_Sub3 aClass100_Sub3_31;

	@OriginalMember(owner = "client!ko", name = "z", descriptor = "Lclient!iba;")
	private final Class3_Sub2_Sub1 aClass3_Sub2_Sub1_4;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!wh;IIZ)V")
	public Class32_Sub3(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass100_Sub3_31 = arg0;
		this.aClass3_Sub2_Sub1_4 = Static486.method7256(arg1, arg2, arg3 ? 6408 : 6407, arg0);
	}

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!wh;IIII)V")
	public Class32_Sub3(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass100_Sub3_31 = arg0;
		this.aClass3_Sub2_Sub1_4 = Static549.method7976(arg4, arg3, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!wh;II[III)V")
	public Class32_Sub3(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass100_Sub3_31 = arg0;
		this.aClass3_Sub2_Sub1_4 = Static312.method5232(arg4, arg1, arg5, arg2, arg3, arg0);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method5069(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class3_Sub2_Sub1 local7 = ((Class1_Sub1) arg6).aClass3_Sub2_Sub1_2;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(32) float local32;
		if (this.aBoolean389) {
			local14 = (float) this.method5080();
			local18 = (float) this.method5079();
			local25 = (arg2 - arg0) / local14;
			local32 = (arg3 - arg1) / local14;
			@Pc(38) float local38 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = local38 * (float) this.anInt5801;
			@Pc(56) float local56 = local44 * (float) this.anInt5801;
			@Pc(62) float local62 = local25 * (float) this.anInt5809;
			@Pc(68) float local68 = (float) this.anInt5809 * local32;
			@Pc(75) float local75 = (float) this.anInt5806 * -local25;
			@Pc(82) float local82 = -local32 * (float) this.anInt5806;
			@Pc(89) float local89 = (float) this.anInt5788 * -local38;
			@Pc(96) float local96 = -local44 * (float) this.anInt5788;
			arg4 = local89 + arg4 + local62;
			arg3 = local56 + local82 + arg3;
			arg0 = arg0 + local62 + local50;
			arg2 = local50 + local75 + arg2;
			arg1 = local56 + local68 + arg1;
			arg5 = local96 + local68 + arg5;
		}
		local14 = arg2 + arg4 - arg0;
		this.aClass3_Sub2_Sub1_4.method5781(true);
		local18 = arg5 + arg3 - arg1;
		this.aClass100_Sub3_31.method8904();
		this.aClass100_Sub3_31.method8925(this.aClass3_Sub2_Sub1_4);
		this.aClass100_Sub3_31.method8903(1);
		this.aClass100_Sub3_31.method8861(1);
		this.aClass100_Sub3_31.method8925(local7);
		this.aClass100_Sub3_31.method8880(8448, 7681);
		this.aClass100_Sub3_31.method8889(34168, 0, 768);
		this.aClass100_Sub3_31.method8876(1);
		local25 = local7.aFloat73 / (float) local7.anInt4469;
		local32 = local7.aFloat74 / (float) local7.anInt4472;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass3_Sub2_Sub1_4.aFloat74);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + arg0), local7.aFloat74 - (arg1 - (float) arg8) * local32);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * local25, local7.aFloat74 - (arg5 - (float) arg8) * local32);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass3_Sub2_Sub1_4.aFloat73, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + local14) * local25, local7.aFloat74 - ((float) -arg8 + local18) * local32);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass3_Sub2_Sub1_4.aFloat73, this.aClass3_Sub2_Sub1_4.aFloat74);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg2 - (float) arg7), local7.aFloat74 - local32 * (arg3 - (float) arg8));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass100_Sub3_31.method8889(5890, 0, 768);
		this.aClass100_Sub3_31.method8903(0);
		this.aClass100_Sub3_31.method8925((Class3) null);
		this.aClass100_Sub3_31.method8861(0);
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method5083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg0 + arg2;
		this.aClass3_Sub2_Sub1_4.method5781(false);
		@Pc(18) int local18 = arg3 + arg1;
		this.aClass100_Sub3_31.method8904();
		this.aClass100_Sub3_31.method8925(this.aClass3_Sub2_Sub1_4);
		this.aClass100_Sub3_31.method8876(arg6);
		this.aClass100_Sub3_31.method8903(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass3_Sub2_Sub1_4.aBoolean317 && !this.aBoolean389) {
			@Pc(342) float local342 = (float) arg3 * this.aClass3_Sub2_Sub1_4.aFloat74 / (float) this.aClass3_Sub2_Sub1_4.anInt4472;
			@Pc(354) float local354 = this.aClass3_Sub2_Sub1_4.aFloat73 * (float) arg2 / (float) this.aClass3_Sub2_Sub1_4.anInt4469;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local342);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local18);
			OpenGL.glTexCoord2f(local354, 0.0F);
			OpenGL.glVertex2i(local9, local18);
			OpenGL.glTexCoord2f(local354, local342);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt5809, (float) this.anInt5801, 0.0F);
		@Pc(72) int local72 = this.method5080();
		@Pc(75) int local75 = this.method5079();
		@Pc(81) int local81 = arg1 + this.aClass3_Sub2_Sub1_4.anInt4472;
		OpenGL.glBegin(7);
		@Pc(85) int local85 = arg1;
		@Pc(93) int local93;
		while (local81 <= local18) {
			local93 = this.aClass3_Sub2_Sub1_4.anInt4469 + arg0;
			@Pc(95) int local95 = arg0;
			while (local9 >= local93) {
				OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_4.aFloat74);
				OpenGL.glVertex2i(local95, local85);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local95, local81);
				OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_4.aFloat73, 0.0F);
				OpenGL.glVertex2i(local93, local81);
				OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_4.aFloat73, this.aClass3_Sub2_Sub1_4.aFloat74);
				OpenGL.glVertex2i(local93, local85);
				local93 += local72;
				local95 += local72;
			}
			if (local95 < local9) {
				@Pc(161) float local161 = (float) (local9 - local95) * this.aClass3_Sub2_Sub1_4.aFloat73 / (float) this.aClass3_Sub2_Sub1_4.anInt4469;
				OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_4.aFloat74);
				OpenGL.glVertex2i(local95, local85);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local95, local81);
				OpenGL.glTexCoord2f(local161, 0.0F);
				OpenGL.glVertex2i(local9, local81);
				OpenGL.glTexCoord2f(local161, this.aClass3_Sub2_Sub1_4.aFloat74);
				OpenGL.glVertex2i(local9, local85);
			}
			local81 += local75;
			local85 += local75;
		}
		if (local85 < local18) {
			@Pc(223) float local223 = (float) (this.aClass3_Sub2_Sub1_4.anInt4472 + local85 - local18) * this.aClass3_Sub2_Sub1_4.aFloat74 / (float) this.aClass3_Sub2_Sub1_4.anInt4472;
			@Pc(230) int local230 = arg0 + this.aClass3_Sub2_Sub1_4.anInt4469;
			local93 = arg0;
			while (local9 >= local230) {
				OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_4.aFloat74);
				OpenGL.glVertex2i(local93, local85);
				OpenGL.glTexCoord2f(0.0F, local223);
				OpenGL.glVertex2i(local93, local18);
				OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_4.aFloat73, local223);
				OpenGL.glVertex2i(local230, local18);
				OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_4.aFloat73, this.aClass3_Sub2_Sub1_4.aFloat74);
				OpenGL.glVertex2i(local230, local85);
				local93 += local72;
				local230 += local72;
			}
			if (local9 > local93) {
				@Pc(299) float local299 = (float) (local9 - local93) * this.aClass3_Sub2_Sub1_4.aFloat73 / (float) this.aClass3_Sub2_Sub1_4.anInt4469;
				OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_4.aFloat74);
				OpenGL.glVertex2i(local93, local85);
				OpenGL.glTexCoord2f(0.0F, local223);
				OpenGL.glVertex2i(local93, local18);
				OpenGL.glTexCoord2f(local299, local223);
				OpenGL.glVertex2i(local9, local18);
				OpenGL.glTexCoord2f(local299, this.aClass3_Sub2_Sub1_4.aFloat74);
				OpenGL.glVertex2i(local9, local85);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method5078(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean389) {
			local6 = (float) this.method5080();
			local10 = (float) this.method5079();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(23) float local23 = (arg3 - arg1) / local6;
			@Pc(29) float local29 = (arg4 - arg0) / local10;
			@Pc(36) float local36 = (arg5 - arg1) / local10;
			@Pc(42) float local42 = local29 * (float) this.anInt5801;
			@Pc(48) float local48 = local36 * (float) this.anInt5801;
			@Pc(54) float local54 = (float) this.anInt5809 * local16;
			@Pc(60) float local60 = local23 * (float) this.anInt5809;
			@Pc(67) float local67 = -local16 * (float) this.anInt5806;
			@Pc(74) float local74 = -local23 * (float) this.anInt5806;
			@Pc(81) float local81 = -local29 * (float) this.anInt5788;
			arg4 = local81 + local54 + arg4;
			arg1 = arg1 + local60 + local48;
			arg2 = local67 + arg2 + local42;
			arg3 = arg3 + local74 + local48;
			arg0 = local42 + arg0 + local54;
			@Pc(118) float local118 = -local36 * (float) this.anInt5788;
			arg5 = local60 + arg5 + local118;
		}
		local6 = arg2 + arg4 - arg0;
		local10 = arg3 + arg5 - arg1;
		this.aClass3_Sub2_Sub1_4.method5781(true);
		this.aClass100_Sub3_31.method8904();
		this.aClass100_Sub3_31.method8925(this.aClass3_Sub2_Sub1_4);
		this.aClass100_Sub3_31.method8876(1);
		this.aClass100_Sub3_31.method8903(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_4.aFloat74);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_4.aFloat73, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_4.aFloat73, this.aClass3_Sub2_Sub1_4.aFloat74);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "()I")
	@Override
	public int method5080() {
		return this.anInt5806 + this.anInt5809 + this.aClass3_Sub2_Sub1_4.anInt4469;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIII[III)V")
	private void method5094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.aClass3_Sub2_Sub1_4.method3902(arg2, arg5, arg0, arg4, arg3, arg1);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method5084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass3_Sub2_Sub1_4.method5781(true);
		this.aClass100_Sub3_31.method8904();
		this.aClass100_Sub3_31.method8876(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean389) {
			@Pc(48) float local48 = (float) arg2 / (float) this.method5080();
			@Pc(55) float local55 = (float) arg3 / (float) this.method5079();
			@Pc(64) float local64 = (float) arg0 + (float) this.anInt5809 * local48;
			@Pc(73) float local73 = local55 * (float) this.anInt5801 + (float) arg1;
			@Pc(82) float local82 = local64 + (float) this.aClass3_Sub2_Sub1_4.anInt4469 * local48;
			@Pc(91) float local91 = local73 + local55 * (float) this.aClass3_Sub2_Sub1_4.anInt4472;
			if (this.aClass3_Sub2_Sub1_3 == null) {
				this.aClass100_Sub3_31.method8925(this.aClass3_Sub2_Sub1_4);
				this.aClass100_Sub3_31.method8903(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_4.aFloat74);
				OpenGL.glVertex2f(local64, local73);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local64, local91);
				OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_4.aFloat73, 0.0F);
				OpenGL.glVertex2f(local82, local91);
				OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_4.aFloat73, this.aClass3_Sub2_Sub1_4.aFloat74);
				OpenGL.glVertex2f(local82, local73);
				OpenGL.glEnd();
			} else {
				this.method5095(arg4);
				this.aClass3_Sub2_Sub1_3.method5781(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass3_Sub2_Sub1_4.aFloat74);
				OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_4.aFloat74);
				OpenGL.glVertex2f(local64, local73);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local64, local91);
				OpenGL.glMultiTexCoord2f(33985, this.aClass3_Sub2_Sub1_4.aFloat73, 0.0F);
				OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_4.aFloat73, 0.0F);
				OpenGL.glVertex2f(local82, local91);
				OpenGL.glMultiTexCoord2f(33985, this.aClass3_Sub2_Sub1_4.aFloat73, this.aClass3_Sub2_Sub1_4.aFloat74);
				OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_4.aFloat73, this.aClass3_Sub2_Sub1_4.aFloat74);
				OpenGL.glVertex2f(local82, local73);
				OpenGL.glEnd();
				this.method5096();
			}
		} else if (this.aClass3_Sub2_Sub1_3 == null) {
			this.aClass100_Sub3_31.method8925(this.aClass3_Sub2_Sub1_4);
			this.aClass100_Sub3_31.method8903(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_4.aFloat74);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_4.aFloat73, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_4.aFloat73, this.aClass3_Sub2_Sub1_4.aFloat74);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method5095(arg4);
			this.aClass3_Sub2_Sub1_3.method5781(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass3_Sub2_Sub1_4.aFloat74);
			OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_4.aFloat74);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass3_Sub2_Sub1_4.aFloat73, 0.0F);
			OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_4.aFloat73, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass3_Sub2_Sub1_4.aFloat73, this.aClass3_Sub2_Sub1_4.aFloat74);
			OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_4.aFloat73, this.aClass3_Sub2_Sub1_4.aFloat74);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method5096();
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method5088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass3_Sub2_Sub1_4.method5781(false);
		this.aClass100_Sub3_31.method8904();
		this.aClass100_Sub3_31.method8876(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt5809;
		@Pc(42) int local42 = arg1 + this.anInt5801;
		if (this.aClass3_Sub2_Sub1_3 == null) {
			this.aClass100_Sub3_31.method8925(this.aClass3_Sub2_Sub1_4);
			this.aClass100_Sub3_31.method8903(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_4.aFloat74);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, this.aClass3_Sub2_Sub1_4.anInt4472 + local42);
			OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_4.aFloat73, 0.0F);
			OpenGL.glVertex2i(local37 + this.aClass3_Sub2_Sub1_4.anInt4469, local42 - -this.aClass3_Sub2_Sub1_4.anInt4472);
			OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_4.aFloat73, this.aClass3_Sub2_Sub1_4.aFloat74);
			OpenGL.glVertex2i(local37 + this.aClass3_Sub2_Sub1_4.anInt4469, local42);
			OpenGL.glEnd();
			return;
		}
		this.method5095(arg2);
		this.aClass3_Sub2_Sub1_3.method5781(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass3_Sub2_Sub1_4.aFloat74);
		OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_4.aFloat74);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, local42 + this.aClass3_Sub2_Sub1_4.anInt4472);
		OpenGL.glMultiTexCoord2f(33985, this.aClass3_Sub2_Sub1_4.aFloat73, 0.0F);
		OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_4.aFloat73, 0.0F);
		OpenGL.glVertex2i(this.aClass3_Sub2_Sub1_4.anInt4469 + local37, local42 - -this.aClass3_Sub2_Sub1_4.anInt4472);
		OpenGL.glMultiTexCoord2f(33985, this.aClass3_Sub2_Sub1_4.aFloat73, this.aClass3_Sub2_Sub1_4.aFloat74);
		OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_4.aFloat73, this.aClass3_Sub2_Sub1_4.aFloat74);
		OpenGL.glVertex2i(local37 + this.aClass3_Sub2_Sub1_4.anInt4469, local42);
		OpenGL.glEnd();
		this.method5096();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "()I")
	@Override
	public int method5072() {
		return this.aClass3_Sub2_Sub1_4.anInt4469;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "()I")
	@Override
	public int method5077() {
		return this.aClass3_Sub2_Sub1_4.anInt4472;
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "()I")
	@Override
	public int method5079() {
		return this.anInt5788 + this.anInt5801 + this.aClass3_Sub2_Sub1_4.anInt4472;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method5075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg2;
		@Pc(9) Class3_Sub2_Sub1 local9 = local6.aClass3_Sub2_Sub1_2;
		this.aClass3_Sub2_Sub1_4.method5781(false);
		this.aClass100_Sub3_31.method8904();
		this.aClass100_Sub3_31.method8925(this.aClass3_Sub2_Sub1_4);
		this.aClass100_Sub3_31.method8903(1);
		this.aClass100_Sub3_31.method8861(1);
		this.aClass100_Sub3_31.method8925(local9);
		this.aClass100_Sub3_31.method8880(8448, 7681);
		this.aClass100_Sub3_31.method8889(34168, 0, 768);
		this.aClass100_Sub3_31.method8876(1);
		@Pc(62) int local62 = arg0 + this.anInt5809;
		@Pc(67) int local67 = arg1 + this.anInt5801;
		@Pc(73) int local73 = this.aClass3_Sub2_Sub1_4.anInt4469 + local62;
		@Pc(79) int local79 = local67 + this.aClass3_Sub2_Sub1_4.anInt4472;
		@Pc(86) float local86 = local9.aFloat73 / (float) local9.anInt4469;
		@Pc(93) float local93 = local9.aFloat74 / (float) local9.anInt4472;
		@Pc(101) float local101 = (float) (local62 - arg3) * local86;
		@Pc(109) float local109 = local86 * (float) (local73 - arg3);
		@Pc(120) float local120 = local9.aFloat74 - local93 * (float) (local67 - arg4);
		@Pc(131) float local131 = local9.aFloat74 - (float) (local79 - arg4) * local93;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass3_Sub2_Sub1_4.aFloat74);
		OpenGL.glMultiTexCoord2f(33985, local101, local120);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local131);
		OpenGL.glVertex2i(local62, this.aClass3_Sub2_Sub1_4.anInt4472 + local67);
		OpenGL.glMultiTexCoord2f(33984, this.aClass3_Sub2_Sub1_4.aFloat73, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local131);
		OpenGL.glVertex2i(local62 + this.aClass3_Sub2_Sub1_4.anInt4469, local67 + this.aClass3_Sub2_Sub1_4.anInt4472);
		OpenGL.glMultiTexCoord2f(33984, this.aClass3_Sub2_Sub1_4.aFloat73, this.aClass3_Sub2_Sub1_4.aFloat74);
		OpenGL.glMultiTexCoord2f(33985, local109, local120);
		OpenGL.glVertex2i(local62 + this.aClass3_Sub2_Sub1_4.anInt4469, local67);
		OpenGL.glEnd();
		this.aClass100_Sub3_31.method8889(5890, 0, 768);
		this.aClass100_Sub3_31.method8903(0);
		this.aClass100_Sub3_31.method8925((Class3) null);
		this.aClass100_Sub3_31.method8861(0);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5809 = arg0;
		this.anInt5788 = arg3;
		this.anInt5806 = arg2;
		this.anInt5801 = arg1;
		this.aBoolean389 = this.anInt5809 != 0 || this.anInt5801 != 0 || this.anInt5806 != 0 || this.anInt5788 != 0;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "([I)V")
	@Override
	public void method5082(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5809;
		arg0[3] = this.anInt5788;
		arg0[1] = this.anInt5801;
		arg0[2] = this.anInt5806;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(II)V")
	private void method5095(@OriginalArg(1) int arg0) {
		this.aClass100_Sub3_31.method8861(1);
		this.aClass100_Sub3_31.method8925(this.aClass3_Sub2_Sub1_4);
		this.aClass100_Sub3_31.method8880(7681, this.aClass100_Sub3_31.method8928(arg0));
		this.aClass100_Sub3_31.method8889(34167, 1, 768);
		this.aClass100_Sub3_31.method8923(34168, 0);
		this.aClass100_Sub3_31.method8861(0);
		this.aClass100_Sub3_31.method8925(this.aClass3_Sub2_Sub1_3);
		this.aClass100_Sub3_31.method8880(7681, 34479);
		this.aClass100_Sub3_31.method8889(34166, 1, 768);
		if (this.anInt5796 == 0) {
			this.aClass100_Sub3_31.method8922(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt5796 == 1) {
			this.aClass100_Sub3_31.method8922(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt5796 == 2) {
			this.aClass100_Sub3_31.method8922(0.5F, 0.5F, 1.0F, 0.0F);
			return;
		} else if (this.anInt5796 == 3) {
			this.aClass100_Sub3_31.method8922(128.5F, 128.5F, 128.5F, 0.0F);
			return;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)V")
	@Override
	public void method5086(@OriginalArg(2) int arg0) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass3_Sub2_Sub1_3 = Static549.method7976(this.aClass3_Sub2_Sub1_4.anInt4472, this.aClass3_Sub2_Sub1_4.anInt4469, 0, 0, this.aClass100_Sub3_31);
		this.anInt5796 = arg0;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!this.aClass100_Sub3_31.aBoolean721) {
			this.aClass3_Sub2_Sub1_4.method3901(arg3, arg2, arg1, arg0, arg5, arg4);
			return;
		}
		@Pc(25) int[] local25 = this.aClass100_Sub3_31.na(arg4, arg5, arg2, arg3);
		if (local25 != null) {
			for (@Pc(29) int local29 = 0; local29 < local25.length; local29++) {
				local25[local29] |= 0xFF000000;
			}
			this.method5094(arg0, arg1, arg2, arg3, local25, arg2);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)V")
	private void method5096() {
		this.aClass100_Sub3_31.method8861(1);
		this.aClass100_Sub3_31.method8925((Class3) null);
		this.aClass100_Sub3_31.method8880(8448, 8448);
		this.aClass100_Sub3_31.method8889(34168, 1, 768);
		this.aClass100_Sub3_31.method8923(5890, 0);
		this.aClass100_Sub3_31.method8861(0);
		this.aClass100_Sub3_31.method8889(34168, 1, 768);
	}
}
