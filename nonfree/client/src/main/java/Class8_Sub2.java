import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "Lclient!mk;")
	private Class112_Sub2_Sub1 aClass112_Sub2_Sub1_3;

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
	private int anInt2995 = 0;

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "Z")
	private boolean aBoolean271 = false;

	@OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
	private int anInt3008 = 0;

	@OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
	private int anInt3010 = 0;

	@OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
	private int anInt3003 = 0;

	@OriginalMember(owner = "client!hf", name = "x", descriptor = "I")
	private int anInt3011 = 0;

	@OriginalMember(owner = "client!hf", name = "A", descriptor = "Lclient!vj;")
	private final Class172_Sub2 aClass172_Sub2_9;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "Lclient!mk;")
	private final Class112_Sub2_Sub1 aClass112_Sub2_Sub1_2;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!vj;IIII)V")
	public Class8_Sub2(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass172_Sub2_9 = arg0;
		this.aClass112_Sub2_Sub1_2 = Static150.method3210(arg4, arg2, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!vj;II[III)V")
	public Class8_Sub2(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass172_Sub2_9 = arg0;
		this.aClass112_Sub2_Sub1_2 = Static25.method592(arg2, arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!hf", name = "D", descriptor = "(IIIIIII)V")
	@Override
	public void D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg0 + arg2;
		this.aClass112_Sub2_Sub1_2.method4551(false);
		@Pc(19) int local19 = arg1 + arg3;
		this.aClass172_Sub2_9.method5570();
		this.aClass172_Sub2_9.method5630(this.aClass112_Sub2_Sub1_2);
		this.aClass172_Sub2_9.method5574(arg6);
		this.aClass172_Sub2_9.method5629(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass112_Sub2_Sub1_2.aBoolean412 && !this.aBoolean271) {
			@Pc(73) float local73 = (float) arg3 * this.aClass112_Sub2_Sub1_2.aFloat34 / (float) this.aClass112_Sub2_Sub1_2.anInt4736;
			@Pc(85) float local85 = (float) arg2 * this.aClass112_Sub2_Sub1_2.aFloat33 / (float) this.aClass112_Sub2_Sub1_2.anInt4737;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local73);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local19);
			OpenGL.glTexCoord2f(local85, 0.0F);
			OpenGL.glVertex2i(local9, local19);
			OpenGL.glTexCoord2f(local85, local73);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt3008, (float) this.anInt2995, 0.0F);
		@Pc(125) int local125 = this.ja();
		@Pc(128) int local128 = this.JA();
		@Pc(134) int local134 = this.aClass112_Sub2_Sub1_2.anInt4736 + arg1;
		OpenGL.glBegin(7);
		@Pc(138) int local138 = arg1;
		@Pc(147) int local147;
		while (local134 <= local19) {
			local147 = arg0 + this.aClass112_Sub2_Sub1_2.anInt4737;
			@Pc(149) int local149 = arg0;
			while (local9 >= local147) {
				OpenGL.glTexCoord2f(0.0F, this.aClass112_Sub2_Sub1_2.aFloat34);
				OpenGL.glVertex2i(local149, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local149, local134);
				OpenGL.glTexCoord2f(this.aClass112_Sub2_Sub1_2.aFloat33, 0.0F);
				OpenGL.glVertex2i(local147, local134);
				OpenGL.glTexCoord2f(this.aClass112_Sub2_Sub1_2.aFloat33, this.aClass112_Sub2_Sub1_2.aFloat34);
				OpenGL.glVertex2i(local147, local138);
				local149 += local125;
				local147 += local125;
			}
			if (local149 < local9) {
				@Pc(211) float local211 = (float) (local9 - local149) * this.aClass112_Sub2_Sub1_2.aFloat33 / (float) this.aClass112_Sub2_Sub1_2.anInt4737;
				OpenGL.glTexCoord2f(0.0F, this.aClass112_Sub2_Sub1_2.aFloat34);
				OpenGL.glVertex2i(local149, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local149, local134);
				OpenGL.glTexCoord2f(local211, 0.0F);
				OpenGL.glVertex2i(local9, local134);
				OpenGL.glTexCoord2f(local211, this.aClass112_Sub2_Sub1_2.aFloat34);
				OpenGL.glVertex2i(local9, local138);
			}
			local138 += local128;
			local134 += local128;
		}
		if (local19 > local138) {
			@Pc(276) float local276 = (float) (this.aClass112_Sub2_Sub1_2.anInt4736 + local138 - local19) * this.aClass112_Sub2_Sub1_2.aFloat34 / (float) this.aClass112_Sub2_Sub1_2.anInt4736;
			@Pc(283) int local283 = arg0 + this.aClass112_Sub2_Sub1_2.anInt4737;
			local147 = arg0;
			while (local283 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass112_Sub2_Sub1_2.aFloat34);
				OpenGL.glVertex2i(local147, local138);
				OpenGL.glTexCoord2f(0.0F, local276);
				OpenGL.glVertex2i(local147, local19);
				OpenGL.glTexCoord2f(this.aClass112_Sub2_Sub1_2.aFloat33, local276);
				OpenGL.glVertex2i(local283, local19);
				OpenGL.glTexCoord2f(this.aClass112_Sub2_Sub1_2.aFloat33, this.aClass112_Sub2_Sub1_2.aFloat34);
				OpenGL.glVertex2i(local283, local138);
				local147 += local125;
				local283 += local125;
			}
			if (local9 > local147) {
				@Pc(351) float local351 = this.aClass112_Sub2_Sub1_2.aFloat33 * (float) (local9 - local147) / (float) this.aClass112_Sub2_Sub1_2.anInt4737;
				OpenGL.glTexCoord2f(0.0F, this.aClass112_Sub2_Sub1_2.aFloat34);
				OpenGL.glVertex2i(local147, local138);
				OpenGL.glTexCoord2f(0.0F, local276);
				OpenGL.glVertex2i(local147, local19);
				OpenGL.glTexCoord2f(local351, local276);
				OpenGL.glVertex2i(local9, local19);
				OpenGL.glTexCoord2f(local351, this.aClass112_Sub2_Sub1_2.aFloat34);
				OpenGL.glVertex2i(local9, local138);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!hf", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass112_Sub2_Sub1_3 = Static150.method3210(this.aClass112_Sub2_Sub1_2.anInt4736, arg1, this.aClass112_Sub2_Sub1_2.anInt4737, arg0, this.aClass172_Sub2_9);
		this.anInt3011 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
	private void method2408() {
		this.aClass172_Sub2_9.method5569(1);
		this.aClass172_Sub2_9.method5630(null);
		this.aClass172_Sub2_9.method5591(8448, 8448);
		this.aClass172_Sub2_9.method5561(768, 34168, 1);
		this.aClass172_Sub2_9.method5592(5890, 0);
		this.aClass172_Sub2_9.method5569(0);
		this.aClass172_Sub2_9.method5561(768, 34168, 1);
	}

	@OriginalMember(owner = "client!hf", name = "M", descriptor = "(IIIIIII)V")
	@Override
	public void M(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass112_Sub2_Sub1_2.method4551(true);
		this.aClass172_Sub2_9.method5570();
		this.aClass172_Sub2_9.method5574(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean271) {
			@Pc(42) float local42 = (float) arg2 / (float) this.ja();
			@Pc(49) float local49 = (float) arg3 / (float) this.JA();
			@Pc(58) float local58 = local42 * (float) this.anInt3008 + (float) arg0;
			@Pc(67) float local67 = (float) arg1 + local49 * (float) this.anInt2995;
			@Pc(76) float local76 = local58 + local42 * (float) this.aClass112_Sub2_Sub1_2.anInt4737;
			@Pc(85) float local85 = (float) this.aClass112_Sub2_Sub1_2.anInt4736 * local49 + local67;
			if (this.aClass112_Sub2_Sub1_3 == null) {
				this.aClass172_Sub2_9.method5630(this.aClass112_Sub2_Sub1_2);
				this.aClass172_Sub2_9.method5629(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass112_Sub2_Sub1_2.aFloat34);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glTexCoord2f(this.aClass112_Sub2_Sub1_2.aFloat33, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glTexCoord2f(this.aClass112_Sub2_Sub1_2.aFloat33, this.aClass112_Sub2_Sub1_2.aFloat34);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
			} else {
				this.method2411(arg4);
				this.aClass112_Sub2_Sub1_3.method4551(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass112_Sub2_Sub1_2.aFloat34);
				OpenGL.glTexCoord2f(0.0F, this.aClass112_Sub2_Sub1_2.aFloat34);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass112_Sub2_Sub1_2.aFloat33, 0.0F);
				OpenGL.glTexCoord2f(this.aClass112_Sub2_Sub1_2.aFloat33, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass112_Sub2_Sub1_2.aFloat33, this.aClass112_Sub2_Sub1_2.aFloat34);
				OpenGL.glTexCoord2f(this.aClass112_Sub2_Sub1_2.aFloat33, this.aClass112_Sub2_Sub1_2.aFloat34);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
				this.method2408();
			}
		} else if (this.aClass112_Sub2_Sub1_3 == null) {
			this.aClass172_Sub2_9.method5630(this.aClass112_Sub2_Sub1_2);
			this.aClass172_Sub2_9.method5629(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass112_Sub2_Sub1_2.aFloat34);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass112_Sub2_Sub1_2.aFloat33, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass112_Sub2_Sub1_2.aFloat33, this.aClass112_Sub2_Sub1_2.aFloat34);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method2411(arg4);
			this.aClass112_Sub2_Sub1_3.method4551(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass112_Sub2_Sub1_2.aFloat34);
			OpenGL.glTexCoord2f(0.0F, this.aClass112_Sub2_Sub1_2.aFloat34);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass112_Sub2_Sub1_2.aFloat33, 0.0F);
			OpenGL.glTexCoord2f(this.aClass112_Sub2_Sub1_2.aFloat33, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass112_Sub2_Sub1_2.aFloat33, this.aClass112_Sub2_Sub1_2.aFloat34);
			OpenGL.glTexCoord2f(this.aClass112_Sub2_Sub1_2.aFloat33, this.aClass112_Sub2_Sub1_2.aFloat34);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method2408();
		}
	}

	@OriginalMember(owner = "client!hf", name = "YA", descriptor = "(IIIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass112_Sub2_Sub1_2.method4551(false);
		this.aClass172_Sub2_9.method5570();
		this.aClass172_Sub2_9.method5574(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt3008;
		@Pc(42) int local42 = arg1 + this.anInt2995;
		if (this.aClass112_Sub2_Sub1_3 == null) {
			this.aClass172_Sub2_9.method5630(this.aClass112_Sub2_Sub1_2);
			this.aClass172_Sub2_9.method5629(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass112_Sub2_Sub1_2.aFloat34);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, local42 + this.aClass112_Sub2_Sub1_2.anInt4736);
			OpenGL.glTexCoord2f(this.aClass112_Sub2_Sub1_2.aFloat33, 0.0F);
			OpenGL.glVertex2i(local37 + this.aClass112_Sub2_Sub1_2.anInt4737, local42 + this.aClass112_Sub2_Sub1_2.anInt4736);
			OpenGL.glTexCoord2f(this.aClass112_Sub2_Sub1_2.aFloat33, this.aClass112_Sub2_Sub1_2.aFloat34);
			OpenGL.glVertex2i(this.aClass112_Sub2_Sub1_2.anInt4737 + local37, local42);
			OpenGL.glEnd();
			return;
		}
		this.method2411(arg2);
		this.aClass112_Sub2_Sub1_3.method4551(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass112_Sub2_Sub1_2.aFloat34);
		OpenGL.glTexCoord2f(0.0F, this.aClass112_Sub2_Sub1_2.aFloat34);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, local42 + this.aClass112_Sub2_Sub1_2.anInt4736);
		OpenGL.glMultiTexCoord2f(33985, this.aClass112_Sub2_Sub1_2.aFloat33, 0.0F);
		OpenGL.glTexCoord2f(this.aClass112_Sub2_Sub1_2.aFloat33, 0.0F);
		OpenGL.glVertex2i(this.aClass112_Sub2_Sub1_2.anInt4737 + local37, this.aClass112_Sub2_Sub1_2.anInt4736 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass112_Sub2_Sub1_2.aFloat33, this.aClass112_Sub2_Sub1_2.aFloat34);
		OpenGL.glTexCoord2f(this.aClass112_Sub2_Sub1_2.aFloat33, this.aClass112_Sub2_Sub1_2.aFloat34);
		OpenGL.glVertex2i(local37 + this.aClass112_Sub2_Sub1_2.anInt4737, local42);
		OpenGL.glEnd();
		this.method2408();
	}

	@OriginalMember(owner = "client!hf", name = "qa", descriptor = "()I")
	@Override
	public int qa() {
		return this.aClass112_Sub2_Sub1_2.anInt4736;
	}

	@OriginalMember(owner = "client!hf", name = "aa", descriptor = "(FFFFFFIII)V")
	@Override
	protected void aa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean271) {
			local10 = this.ja();
			local14 = this.JA();
			@Pc(20) float local20 = (arg2 - arg0) / local10;
			@Pc(26) float local26 = (arg3 - arg1) / local10;
			@Pc(33) float local33 = (arg4 - arg0) / local14;
			@Pc(39) float local39 = (arg5 - arg1) / local14;
			@Pc(45) float local45 = (float) this.anInt2995 * local33;
			@Pc(51) float local51 = (float) this.anInt2995 * local39;
			@Pc(57) float local57 = (float) this.anInt3008 * local20;
			@Pc(63) float local63 = local26 * (float) this.anInt3008;
			@Pc(70) float local70 = (float) this.anInt3003 * -local20;
			@Pc(77) float local77 = (float) this.anInt3003 * -local26;
			@Pc(84) float local84 = (float) this.anInt3010 * -local33;
			@Pc(91) float local91 = -local39 * (float) this.anInt3010;
			arg0 = local57 + arg0 + local45;
			arg4 = local84 + local57 + arg4;
			arg1 = local63 + arg1 + local51;
			arg2 = local45 + arg2 + local70;
			arg3 = local77 + arg3 + local51;
			arg5 = local91 + local63 + arg5;
		}
		local10 = arg4 + arg2 - arg0;
		local14 = arg3 + arg5 - arg1;
		this.aClass112_Sub2_Sub1_2.method4551(true);
		this.aClass172_Sub2_9.method5570();
		this.aClass172_Sub2_9.method5630(this.aClass112_Sub2_Sub1_2);
		this.aClass172_Sub2_9.method5574(arg8);
		this.aClass172_Sub2_9.method5629(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass112_Sub2_Sub1_2.aFloat34);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass112_Sub2_Sub1_2.aFloat33, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass112_Sub2_Sub1_2.aFloat33, this.aClass112_Sub2_Sub1_2.aFloat34);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!hf", name = "UA", descriptor = "()I")
	@Override
	public int UA() {
		return this.aClass112_Sub2_Sub1_2.anInt4737;
	}

	@OriginalMember(owner = "client!hf", name = "ja", descriptor = "()I")
	@Override
	public int ja() {
		return this.aClass112_Sub2_Sub1_2.anInt4737 + this.anInt3008 + this.anInt3003;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(FFFFFFLclient!ea;II)V")
	@Override
	protected void method5996(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class58 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class112_Sub2_Sub1 local7 = ((Class58_Sub2) arg6).aClass112_Sub2_Sub1_4;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(31) float local31;
		if (this.aBoolean271) {
			local14 = this.ja();
			local18 = this.JA();
			local24 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(38) float local38 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = (float) this.anInt2995 * local38;
			@Pc(56) float local56 = local44 * (float) this.anInt2995;
			@Pc(62) float local62 = (float) this.anInt3008 * local24;
			@Pc(68) float local68 = local31 * (float) this.anInt3008;
			@Pc(75) float local75 = (float) this.anInt3003 * -local24;
			@Pc(82) float local82 = (float) this.anInt3003 * -local31;
			@Pc(89) float local89 = -local38 * (float) this.anInt3010;
			@Pc(96) float local96 = (float) this.anInt3010 * -local44;
			arg4 = local62 + arg4 + local89;
			arg2 = local50 + local75 + arg2;
			arg0 = local50 + local62 + arg0;
			arg3 = local82 + arg3 + local56;
			arg1 = local68 + arg1 + local56;
			arg5 = local96 + local68 + arg5;
		}
		local14 = arg2 + arg4 - arg0;
		this.aClass112_Sub2_Sub1_2.method4551(true);
		local18 = arg5 + arg3 - arg1;
		this.aClass172_Sub2_9.method5570();
		this.aClass172_Sub2_9.method5630(this.aClass112_Sub2_Sub1_2);
		this.aClass172_Sub2_9.method5629(1);
		this.aClass172_Sub2_9.method5569(1);
		this.aClass172_Sub2_9.method5630(local7);
		this.aClass172_Sub2_9.method5591(7681, 8448);
		this.aClass172_Sub2_9.method5561(768, 34168, 0);
		this.aClass172_Sub2_9.method5574(1);
		local24 = local7.aFloat33 / (float) local7.anInt4737;
		local31 = local7.aFloat34 / (float) local7.anInt4736;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass112_Sub2_Sub1_2.aFloat34);
		OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * local24, local7.aFloat34 - local31 * (arg1 - (float) arg8));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg4), local7.aFloat34 - local31 * ((float) -arg8 + arg5));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass112_Sub2_Sub1_2.aFloat33, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * (local14 - (float) arg7), local7.aFloat34 - local31 * (local18 - (float) arg8));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass112_Sub2_Sub1_2.aFloat33, this.aClass112_Sub2_Sub1_2.aFloat34);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg2) * local24, local7.aFloat34 - ((float) -arg8 + arg3) * local31);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass172_Sub2_9.method5561(768, 5890, 0);
		this.aClass172_Sub2_9.method5629(0);
		this.aClass172_Sub2_9.method5630(null);
		this.aClass172_Sub2_9.method5569(0);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)V")
	private void method2411(@OriginalArg(1) int arg0) {
		this.aClass172_Sub2_9.method5569(1);
		this.aClass172_Sub2_9.method5630(this.aClass112_Sub2_Sub1_2);
		this.aClass172_Sub2_9.method5591(this.aClass172_Sub2_9.method5549(arg0), 7681);
		this.aClass172_Sub2_9.method5561(768, 34167, 1);
		this.aClass172_Sub2_9.method5592(34168, 0);
		this.aClass172_Sub2_9.method5569(0);
		this.aClass172_Sub2_9.method5630(this.aClass112_Sub2_Sub1_3);
		this.aClass172_Sub2_9.method5591(34479, 7681);
		this.aClass172_Sub2_9.method5561(768, 34166, 1);
		if (this.anInt3011 == 0) {
			this.aClass172_Sub2_9.method5607(1.0F, 0.0F, 0.5F, 0.5F);
		} else if (this.anInt3011 == 1) {
			this.aClass172_Sub2_9.method5607(0.5F, 0.0F, 0.5F, 1.0F);
		} else if (this.anInt3011 == 2) {
			this.aClass172_Sub2_9.method5607(0.5F, 0.0F, 1.0F, 0.5F);
		} else if (this.anInt3011 == 3) {
			this.aClass172_Sub2_9.method5607(128.5F, 0.0F, 128.5F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!hf", name = "W", descriptor = "(IIIIII)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass112_Sub2_Sub1_2.method3732(arg0, arg2, arg3, arg5, arg1, arg4);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILclient!ea;II)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class58 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class58_Sub2 local6 = (Class58_Sub2) arg2;
		@Pc(9) Class112_Sub2_Sub1 local9 = local6.aClass112_Sub2_Sub1_4;
		this.aClass112_Sub2_Sub1_2.method4551(false);
		this.aClass172_Sub2_9.method5570();
		this.aClass172_Sub2_9.method5630(this.aClass112_Sub2_Sub1_2);
		this.aClass172_Sub2_9.method5629(1);
		this.aClass172_Sub2_9.method5569(1);
		this.aClass172_Sub2_9.method5630(local9);
		this.aClass172_Sub2_9.method5591(7681, 8448);
		this.aClass172_Sub2_9.method5561(768, 34168, 0);
		this.aClass172_Sub2_9.method5574(1);
		@Pc(62) int local62 = arg1 + this.anInt2995;
		@Pc(67) int local67 = arg0 + this.anInt3008;
		@Pc(73) int local73 = this.aClass112_Sub2_Sub1_2.anInt4737 + local67;
		@Pc(79) int local79 = this.aClass112_Sub2_Sub1_2.anInt4736 + local62;
		@Pc(86) float local86 = local9.aFloat33 / (float) local9.anInt4737;
		@Pc(93) float local93 = local9.aFloat34 / (float) local9.anInt4736;
		@Pc(101) float local101 = local86 * (float) (local67 - arg3);
		@Pc(109) float local109 = local86 * (float) (local73 - arg3);
		@Pc(120) float local120 = local9.aFloat34 - local93 * (float) (local62 - arg4);
		@Pc(131) float local131 = local9.aFloat34 - local93 * (float) (local79 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass112_Sub2_Sub1_2.aFloat34);
		OpenGL.glMultiTexCoord2f(33985, local101, local120);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local131);
		OpenGL.glVertex2i(local67, local62 + this.aClass112_Sub2_Sub1_2.anInt4736);
		OpenGL.glMultiTexCoord2f(33984, this.aClass112_Sub2_Sub1_2.aFloat33, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local131);
		OpenGL.glVertex2i(local67 + this.aClass112_Sub2_Sub1_2.anInt4737, local62 - -this.aClass112_Sub2_Sub1_2.anInt4736);
		OpenGL.glMultiTexCoord2f(33984, this.aClass112_Sub2_Sub1_2.aFloat33, this.aClass112_Sub2_Sub1_2.aFloat34);
		OpenGL.glMultiTexCoord2f(33985, local109, local120);
		OpenGL.glVertex2i(this.aClass112_Sub2_Sub1_2.anInt4737 + local67, local62);
		OpenGL.glEnd();
		this.aClass172_Sub2_9.method5561(768, 5890, 0);
		this.aClass172_Sub2_9.method5629(0);
		this.aClass172_Sub2_9.method5630(null);
		this.aClass172_Sub2_9.method5569(0);
	}

	@OriginalMember(owner = "client!hf", name = "ka", descriptor = "(IIII)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3008 = arg0;
		this.anInt3003 = arg2;
		this.anInt3010 = arg3;
		this.anInt2995 = arg1;
		this.aBoolean271 = this.anInt3008 != 0 || this.anInt2995 != 0 || this.anInt3003 != 0 || this.anInt3010 != 0;
	}

	@OriginalMember(owner = "client!hf", name = "JA", descriptor = "()I")
	@Override
	public int JA() {
		return this.aClass112_Sub2_Sub1_2.anInt4736 + this.anInt2995 + this.anInt3010;
	}
}
