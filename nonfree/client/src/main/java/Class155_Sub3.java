import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class155_Sub3 extends Class155 {

	@OriginalMember(owner = "client!ro", name = "q", descriptor = "Lclient!ub;")
	private Class29_Sub3_Sub1 aClass29_Sub3_Sub1_3;

	@OriginalMember(owner = "client!ro", name = "v", descriptor = "Z")
	private boolean aBoolean557 = false;

	@OriginalMember(owner = "client!ro", name = "r", descriptor = "I")
	private int anInt8381 = 0;

	@OriginalMember(owner = "client!ro", name = "y", descriptor = "I")
	private int anInt8388 = 0;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
	private int anInt8389 = 0;

	@OriginalMember(owner = "client!ro", name = "B", descriptor = "I")
	private int anInt8374 = 0;

	@OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
	private int anInt8391 = 0;

	@OriginalMember(owner = "client!ro", name = "g", descriptor = "Lclient!vf;")
	private final Class100_Sub3 aClass100_Sub3_38;

	@OriginalMember(owner = "client!ro", name = "o", descriptor = "Lclient!ub;")
	private final Class29_Sub3_Sub1 aClass29_Sub3_Sub1_4;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lclient!vf;IIZ)V")
	public Class155_Sub3(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass100_Sub3_38 = arg0;
		this.aClass29_Sub3_Sub1_4 = Static238.method3760(arg0, arg3 ? 6408 : 6407, arg2, arg1);
	}

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lclient!vf;IIII)V")
	public Class155_Sub3(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass100_Sub3_38 = arg0;
		this.aClass29_Sub3_Sub1_4 = Static32.method4589(arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lclient!vf;II[III)V")
	public Class155_Sub3(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass100_Sub3_38 = arg0;
		this.aClass29_Sub3_Sub1_4 = Static610.method8375(arg2, arg0, arg1, arg4, arg5, arg3);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "()I")
	@Override
	public int method7213() {
		return this.aClass29_Sub3_Sub1_4.anInt9593;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!this.aClass100_Sub3_38.aBoolean716) {
			this.aClass29_Sub3_Sub1_4.method8172(arg0, arg4, arg3, arg1, arg5, arg2);
			return;
		}
		@Pc(27) int[] local27 = this.aClass100_Sub3_38.na(arg4, arg5, arg2, arg3);
		if (local27 != null) {
			for (@Pc(31) int local31 = 0; local31 < local27.length; local31++) {
				local27[local31] |= 0xFF000000;
			}
			this.method7216(arg0, arg1, arg2, arg3, local27, arg2);
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method7203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg2;
		@Pc(9) Class29_Sub3_Sub1 local9 = local6.aClass29_Sub3_Sub1_1;
		this.aClass29_Sub3_Sub1_4.method8164(false);
		this.aClass100_Sub3_38.method8677();
		this.aClass100_Sub3_38.method8743(this.aClass29_Sub3_Sub1_4);
		this.aClass100_Sub3_38.method8671(1);
		this.aClass100_Sub3_38.method8678(1);
		this.aClass100_Sub3_38.method8743(local9);
		this.aClass100_Sub3_38.method8738(8448, 7681);
		this.aClass100_Sub3_38.method8702(768, 34168, 0);
		this.aClass100_Sub3_38.method8728(1);
		@Pc(62) int local62 = arg1 + this.anInt8391;
		@Pc(67) int local67 = arg0 + this.anInt8374;
		@Pc(73) int local73 = local67 + this.aClass29_Sub3_Sub1_4.anInt9593;
		@Pc(80) int local80 = local62 + this.aClass29_Sub3_Sub1_4.anInt9590;
		@Pc(87) float local87 = local9.aFloat186 / (float) local9.anInt9593;
		@Pc(94) float local94 = local9.aFloat187 / (float) local9.anInt9590;
		@Pc(101) float local101 = (float) (local67 - arg3) * local87;
		@Pc(109) float local109 = local87 * (float) (local73 - arg3);
		@Pc(120) float local120 = local9.aFloat187 - local94 * (float) (local62 - arg4);
		@Pc(131) float local131 = local9.aFloat187 - (float) (local80 - arg4) * local94;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass29_Sub3_Sub1_4.aFloat187);
		OpenGL.glMultiTexCoord2f(33985, local101, local120);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local131);
		OpenGL.glVertex2i(local67, local62 + this.aClass29_Sub3_Sub1_4.anInt9590);
		OpenGL.glMultiTexCoord2f(33984, this.aClass29_Sub3_Sub1_4.aFloat186, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local131);
		OpenGL.glVertex2i(this.aClass29_Sub3_Sub1_4.anInt9593 + local67, this.aClass29_Sub3_Sub1_4.anInt9590 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass29_Sub3_Sub1_4.aFloat186, this.aClass29_Sub3_Sub1_4.aFloat187);
		OpenGL.glMultiTexCoord2f(33985, local109, local120);
		OpenGL.glVertex2i(this.aClass29_Sub3_Sub1_4.anInt9593 + local67, local62);
		OpenGL.glEnd();
		this.aClass100_Sub3_38.method8702(768, 5890, 0);
		this.aClass100_Sub3_38.method8671(0);
		this.aClass100_Sub3_38.method8743((Class29) null);
		this.aClass100_Sub3_38.method8678(0);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIII[III)V")
	private void method7216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.aClass29_Sub3_Sub1_4.method8175(arg4, arg0, arg3, arg2, arg1, arg5);
	}

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "()I")
	@Override
	public int method7209() {
		return this.aClass29_Sub3_Sub1_4.anInt9590 + this.anInt8391 + this.anInt8381;
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "()I")
	@Override
	public int method7198() {
		return this.aClass29_Sub3_Sub1_4.anInt9590;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(III)V")
	@Override
	public void method7212(@OriginalArg(2) int arg0) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass29_Sub3_Sub1_3 = Static32.method4589(this.aClass100_Sub3_38, 0, this.aClass29_Sub3_Sub1_4.anInt9593, this.aClass29_Sub3_Sub1_4.anInt9590, 0);
		this.anInt8388 = arg0;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method7196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass29_Sub3_Sub1_4.method8164(true);
		this.aClass100_Sub3_38.method8677();
		this.aClass100_Sub3_38.method8728(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean557) {
			@Pc(195) float local195 = (float) arg2 / (float) this.method7206();
			@Pc(202) float local202 = (float) arg3 / (float) this.method7209();
			@Pc(211) float local211 = (float) arg0 + (float) this.anInt8374 * local195;
			@Pc(220) float local220 = (float) arg1 + (float) this.anInt8391 * local202;
			@Pc(229) float local229 = local195 * (float) this.aClass29_Sub3_Sub1_4.anInt9593 + local211;
			@Pc(238) float local238 = local202 * (float) this.aClass29_Sub3_Sub1_4.anInt9590 + local220;
			if (this.aClass29_Sub3_Sub1_3 == null) {
				this.aClass100_Sub3_38.method8743(this.aClass29_Sub3_Sub1_4);
				this.aClass100_Sub3_38.method8671(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass29_Sub3_Sub1_4.aFloat187);
				OpenGL.glVertex2f(local211, local220);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local211, local238);
				OpenGL.glTexCoord2f(this.aClass29_Sub3_Sub1_4.aFloat186, 0.0F);
				OpenGL.glVertex2f(local229, local238);
				OpenGL.glTexCoord2f(this.aClass29_Sub3_Sub1_4.aFloat186, this.aClass29_Sub3_Sub1_4.aFloat187);
				OpenGL.glVertex2f(local229, local220);
				OpenGL.glEnd();
			} else {
				this.method7221(arg4);
				this.aClass29_Sub3_Sub1_3.method8164(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass29_Sub3_Sub1_4.aFloat187);
				OpenGL.glTexCoord2f(0.0F, this.aClass29_Sub3_Sub1_4.aFloat187);
				OpenGL.glVertex2f(local211, local220);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local211, local238);
				OpenGL.glMultiTexCoord2f(33985, this.aClass29_Sub3_Sub1_4.aFloat186, 0.0F);
				OpenGL.glTexCoord2f(this.aClass29_Sub3_Sub1_4.aFloat186, 0.0F);
				OpenGL.glVertex2f(local229, local238);
				OpenGL.glMultiTexCoord2f(33985, this.aClass29_Sub3_Sub1_4.aFloat186, this.aClass29_Sub3_Sub1_4.aFloat187);
				OpenGL.glTexCoord2f(this.aClass29_Sub3_Sub1_4.aFloat186, this.aClass29_Sub3_Sub1_4.aFloat187);
				OpenGL.glVertex2f(local229, local220);
				OpenGL.glEnd();
				this.method7219();
			}
		} else if (this.aClass29_Sub3_Sub1_3 == null) {
			this.aClass100_Sub3_38.method8743(this.aClass29_Sub3_Sub1_4);
			this.aClass100_Sub3_38.method8671(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass29_Sub3_Sub1_4.aFloat187);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass29_Sub3_Sub1_4.aFloat186, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg1 - -arg3);
			OpenGL.glTexCoord2f(this.aClass29_Sub3_Sub1_4.aFloat186, this.aClass29_Sub3_Sub1_4.aFloat187);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method7221(arg4);
			this.aClass29_Sub3_Sub1_3.method8164(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass29_Sub3_Sub1_4.aFloat187);
			OpenGL.glTexCoord2f(0.0F, this.aClass29_Sub3_Sub1_4.aFloat187);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass29_Sub3_Sub1_4.aFloat186, 0.0F);
			OpenGL.glTexCoord2f(this.aClass29_Sub3_Sub1_4.aFloat186, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass29_Sub3_Sub1_4.aFloat186, this.aClass29_Sub3_Sub1_4.aFloat187);
			OpenGL.glTexCoord2f(this.aClass29_Sub3_Sub1_4.aFloat186, this.aClass29_Sub3_Sub1_4.aFloat187);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method7219();
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method7207(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean557) {
			local6 = (float) this.method7206();
			local10 = (float) this.method7209();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(23) float local23 = (arg3 - arg1) / local6;
			@Pc(29) float local29 = (arg4 - arg0) / local10;
			@Pc(36) float local36 = (arg5 - arg1) / local10;
			@Pc(42) float local42 = (float) this.anInt8391 * local29;
			@Pc(48) float local48 = local36 * (float) this.anInt8391;
			@Pc(54) float local54 = (float) this.anInt8374 * local16;
			@Pc(60) float local60 = (float) this.anInt8374 * local23;
			@Pc(67) float local67 = (float) this.anInt8389 * -local16;
			@Pc(74) float local74 = -local23 * (float) this.anInt8389;
			@Pc(81) float local81 = (float) this.anInt8381 * -local29;
			@Pc(88) float local88 = -local36 * (float) this.anInt8381;
			arg4 = local81 + local54 + arg4;
			arg3 = arg3 + local74 + local48;
			arg0 = local54 + arg0 + local42;
			arg1 = arg1 + local60 + local48;
			arg2 = local42 + arg2 + local67;
			arg5 = local88 + local60 + arg5;
		}
		local6 = arg4 + arg2 - arg0;
		local10 = arg5 + arg3 - arg1;
		this.aClass29_Sub3_Sub1_4.method8164(true);
		this.aClass100_Sub3_38.method8677();
		this.aClass100_Sub3_38.method8743(this.aClass29_Sub3_Sub1_4);
		this.aClass100_Sub3_38.method8728(1);
		this.aClass100_Sub3_38.method8671(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass29_Sub3_Sub1_4.aFloat187);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass29_Sub3_Sub1_4.aFloat186, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass29_Sub3_Sub1_4.aFloat186, this.aClass29_Sub3_Sub1_4.aFloat187);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)V")
	private void method7219() {
		this.aClass100_Sub3_38.method8678(1);
		this.aClass100_Sub3_38.method8743((Class29) null);
		this.aClass100_Sub3_38.method8738(8448, 8448);
		this.aClass100_Sub3_38.method8702(768, 34168, 1);
		this.aClass100_Sub3_38.method8673(5890, 0);
		this.aClass100_Sub3_38.method8678(0);
		this.aClass100_Sub3_38.method8702(768, 34168, 1);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method7205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass29_Sub3_Sub1_4.method8164(false);
		this.aClass100_Sub3_38.method8677();
		this.aClass100_Sub3_38.method8728(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt8391;
		@Pc(42) int local42 = arg0 + this.anInt8374;
		if (this.aClass29_Sub3_Sub1_3 == null) {
			this.aClass100_Sub3_38.method8743(this.aClass29_Sub3_Sub1_4);
			this.aClass100_Sub3_38.method8671(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass29_Sub3_Sub1_4.aFloat187);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, this.aClass29_Sub3_Sub1_4.anInt9590 + local37);
			OpenGL.glTexCoord2f(this.aClass29_Sub3_Sub1_4.aFloat186, 0.0F);
			OpenGL.glVertex2i(local42 + this.aClass29_Sub3_Sub1_4.anInt9593, this.aClass29_Sub3_Sub1_4.anInt9590 + local37);
			OpenGL.glTexCoord2f(this.aClass29_Sub3_Sub1_4.aFloat186, this.aClass29_Sub3_Sub1_4.aFloat187);
			OpenGL.glVertex2i(this.aClass29_Sub3_Sub1_4.anInt9593 + local42, local37);
			OpenGL.glEnd();
			return;
		}
		this.method7221(arg2);
		this.aClass29_Sub3_Sub1_3.method8164(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass29_Sub3_Sub1_4.aFloat187);
		OpenGL.glTexCoord2f(0.0F, this.aClass29_Sub3_Sub1_4.aFloat187);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, this.aClass29_Sub3_Sub1_4.anInt9590 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass29_Sub3_Sub1_4.aFloat186, 0.0F);
		OpenGL.glTexCoord2f(this.aClass29_Sub3_Sub1_4.aFloat186, 0.0F);
		OpenGL.glVertex2i(this.aClass29_Sub3_Sub1_4.anInt9593 + local42, this.aClass29_Sub3_Sub1_4.anInt9590 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass29_Sub3_Sub1_4.aFloat186, this.aClass29_Sub3_Sub1_4.aFloat187);
		OpenGL.glTexCoord2f(this.aClass29_Sub3_Sub1_4.aFloat186, this.aClass29_Sub3_Sub1_4.aFloat187);
		OpenGL.glVertex2i(this.aClass29_Sub3_Sub1_4.anInt9593 + local42, local37);
		OpenGL.glEnd();
		this.method7219();
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "([I)V")
	@Override
	public void method7208(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt8381;
		arg0[0] = this.anInt8374;
		arg0[2] = this.anInt8389;
		arg0[1] = this.anInt8391;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int local10 = arg0 + arg2;
		this.aClass29_Sub3_Sub1_4.method8164(false);
		@Pc(20) int local20 = arg1 + arg3;
		this.aClass100_Sub3_38.method8677();
		this.aClass100_Sub3_38.method8743(this.aClass29_Sub3_Sub1_4);
		this.aClass100_Sub3_38.method8728(arg6);
		this.aClass100_Sub3_38.method8671(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass29_Sub3_Sub1_4.aBoolean672 && !this.aBoolean557) {
			@Pc(371) float local371 = this.aClass29_Sub3_Sub1_4.aFloat187 * (float) arg3 / (float) this.aClass29_Sub3_Sub1_4.anInt9590;
			@Pc(383) float local383 = this.aClass29_Sub3_Sub1_4.aFloat186 * (float) arg2 / (float) this.aClass29_Sub3_Sub1_4.anInt9593;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local371);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local20);
			OpenGL.glTexCoord2f(local383, 0.0F);
			OpenGL.glVertex2i(local10, local20);
			OpenGL.glTexCoord2f(local383, local371);
			OpenGL.glVertex2i(local10, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt8374, (float) this.anInt8391, 0.0F);
		@Pc(76) int local76 = this.method7206();
		@Pc(79) int local79 = this.method7209();
		@Pc(85) int local85 = arg1 + this.aClass29_Sub3_Sub1_4.anInt9590;
		OpenGL.glBegin(7);
		@Pc(89) int local89 = arg1;
		@Pc(100) int local100;
		while (local20 >= local85) {
			local100 = arg0 + this.aClass29_Sub3_Sub1_4.anInt9593;
			@Pc(102) int local102 = arg0;
			while (local10 >= local100) {
				OpenGL.glTexCoord2f(0.0F, this.aClass29_Sub3_Sub1_4.aFloat187);
				OpenGL.glVertex2i(local102, local89);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local102, local85);
				OpenGL.glTexCoord2f(this.aClass29_Sub3_Sub1_4.aFloat186, 0.0F);
				OpenGL.glVertex2i(local100, local85);
				OpenGL.glTexCoord2f(this.aClass29_Sub3_Sub1_4.aFloat186, this.aClass29_Sub3_Sub1_4.aFloat187);
				OpenGL.glVertex2i(local100, local89);
				local102 += local76;
				local100 += local76;
			}
			if (local10 > local102) {
				@Pc(177) float local177 = (float) (local10 - local102) * this.aClass29_Sub3_Sub1_4.aFloat186 / (float) this.aClass29_Sub3_Sub1_4.anInt9593;
				OpenGL.glTexCoord2f(0.0F, this.aClass29_Sub3_Sub1_4.aFloat187);
				OpenGL.glVertex2i(local102, local89);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local102, local85);
				OpenGL.glTexCoord2f(local177, 0.0F);
				OpenGL.glVertex2i(local10, local85);
				OpenGL.glTexCoord2f(local177, this.aClass29_Sub3_Sub1_4.aFloat187);
				OpenGL.glVertex2i(local10, local89);
			}
			local89 += local79;
			local85 += local79;
		}
		if (local89 < local20) {
			@Pc(246) float local246 = this.aClass29_Sub3_Sub1_4.aFloat187 * (float) (this.aClass29_Sub3_Sub1_4.anInt9590 + local89 - local20) / (float) this.aClass29_Sub3_Sub1_4.anInt9590;
			@Pc(252) int local252 = arg0 + this.aClass29_Sub3_Sub1_4.anInt9593;
			local100 = arg0;
			while (local10 >= local252) {
				OpenGL.glTexCoord2f(0.0F, this.aClass29_Sub3_Sub1_4.aFloat187);
				OpenGL.glVertex2i(local100, local89);
				OpenGL.glTexCoord2f(0.0F, local246);
				OpenGL.glVertex2i(local100, local20);
				OpenGL.glTexCoord2f(this.aClass29_Sub3_Sub1_4.aFloat186, local246);
				OpenGL.glVertex2i(local252, local20);
				OpenGL.glTexCoord2f(this.aClass29_Sub3_Sub1_4.aFloat186, this.aClass29_Sub3_Sub1_4.aFloat187);
				OpenGL.glVertex2i(local252, local89);
				local100 += local76;
				local252 += local76;
			}
			if (local100 < local10) {
				@Pc(328) float local328 = (float) (local10 - local100) * this.aClass29_Sub3_Sub1_4.aFloat186 / (float) this.aClass29_Sub3_Sub1_4.anInt9593;
				OpenGL.glTexCoord2f(0.0F, this.aClass29_Sub3_Sub1_4.aFloat187);
				OpenGL.glVertex2i(local100, local89);
				OpenGL.glTexCoord2f(0.0F, local246);
				OpenGL.glVertex2i(local100, local20);
				OpenGL.glTexCoord2f(local328, local246);
				OpenGL.glVertex2i(local10, local20);
				OpenGL.glTexCoord2f(local328, this.aClass29_Sub3_Sub1_4.aFloat187);
				OpenGL.glVertex2i(local10, local89);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(II)V")
	private void method7221(@OriginalArg(0) int arg0) {
		this.aClass100_Sub3_38.method8678(1);
		this.aClass100_Sub3_38.method8743(this.aClass29_Sub3_Sub1_4);
		this.aClass100_Sub3_38.method8738(7681, this.aClass100_Sub3_38.method8732(arg0));
		this.aClass100_Sub3_38.method8702(768, 34167, 1);
		this.aClass100_Sub3_38.method8673(34168, 0);
		this.aClass100_Sub3_38.method8678(0);
		this.aClass100_Sub3_38.method8743(this.aClass29_Sub3_Sub1_3);
		this.aClass100_Sub3_38.method8738(7681, 34479);
		this.aClass100_Sub3_38.method8702(768, 34166, 1);
		if (this.anInt8388 == 0) {
			this.aClass100_Sub3_38.method8701(0.5F, 0.5F, 0.0F, 1.0F);
		} else if (this.anInt8388 == 1) {
			this.aClass100_Sub3_38.method8701(0.5F, 1.0F, 0.0F, 0.5F);
		} else if (this.anInt8388 == 2) {
			this.aClass100_Sub3_38.method8701(1.0F, 0.5F, 0.0F, 0.5F);
		} else if (this.anInt8388 == 3) {
			this.aClass100_Sub3_38.method8701(128.5F, 128.5F, 0.0F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(IIII)V")
	@Override
	public void method7190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8389 = arg2;
		this.anInt8381 = arg3;
		this.anInt8374 = arg0;
		this.anInt8391 = arg1;
		this.aBoolean557 = this.anInt8374 != 0 || this.anInt8391 != 0 || this.anInt8389 != 0 || this.anInt8381 != 0;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method7191(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class29_Sub3_Sub1 local7 = ((Class1_Sub1) arg6).aClass29_Sub3_Sub1_1;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(31) float local31;
		if (this.aBoolean557) {
			local14 = (float) this.method7206();
			local18 = (float) this.method7209();
			local24 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(38) float local38 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = (float) this.anInt8391 * local38;
			@Pc(56) float local56 = local44 * (float) this.anInt8391;
			@Pc(62) float local62 = local24 * (float) this.anInt8374;
			@Pc(68) float local68 = local31 * (float) this.anInt8374;
			@Pc(75) float local75 = -local24 * (float) this.anInt8389;
			@Pc(82) float local82 = (float) this.anInt8389 * -local31;
			@Pc(89) float local89 = (float) this.anInt8381 * -local38;
			@Pc(96) float local96 = -local44 * (float) this.anInt8381;
			arg1 = local56 + local68 + arg1;
			arg3 = arg3 + local82 + local56;
			arg0 = local62 + arg0 + local50;
			arg4 = arg4 + local62 + local89;
			arg2 = local75 + arg2 + local50;
			arg5 = local96 + arg5 + local68;
		}
		local14 = arg4 + arg2 - arg0;
		local18 = arg5 + arg3 - arg1;
		this.aClass29_Sub3_Sub1_4.method8164(true);
		this.aClass100_Sub3_38.method8677();
		this.aClass100_Sub3_38.method8743(this.aClass29_Sub3_Sub1_4);
		this.aClass100_Sub3_38.method8671(1);
		this.aClass100_Sub3_38.method8678(1);
		this.aClass100_Sub3_38.method8743(local7);
		this.aClass100_Sub3_38.method8738(8448, 7681);
		this.aClass100_Sub3_38.method8702(768, 34168, 0);
		this.aClass100_Sub3_38.method8728(1);
		local24 = local7.aFloat186 / (float) local7.anInt9593;
		local31 = local7.aFloat187 / (float) local7.anInt9590;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass29_Sub3_Sub1_4.aFloat187);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg0) * local24, local7.aFloat187 - (arg1 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * local24, local7.aFloat187 - (arg5 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass29_Sub3_Sub1_4.aFloat186, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (local14 - (float) arg7) * local24, local7.aFloat187 - local31 * ((float) -arg8 + local18));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass29_Sub3_Sub1_4.aFloat186, this.aClass29_Sub3_Sub1_4.aFloat187);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg2 - (float) arg7), local7.aFloat187 - local31 * ((float) -arg8 + arg3));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass100_Sub3_38.method8702(768, 5890, 0);
		this.aClass100_Sub3_38.method8671(0);
		this.aClass100_Sub3_38.method8743((Class29) null);
		this.aClass100_Sub3_38.method8678(0);
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "()I")
	@Override
	public int method7206() {
		return this.anInt8374 + this.aClass29_Sub3_Sub1_4.anInt9593 + this.anInt8389;
	}
}
