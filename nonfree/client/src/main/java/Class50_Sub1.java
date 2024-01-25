import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class50_Sub1 extends Class50 {

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "Lclient!rc;")
	private Class80_Sub2_Sub1 aClass80_Sub2_Sub1_1;

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
	private int anInt963 = 0;

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
	private int anInt961 = 0;

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
	private int anInt956 = 0;

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
	private int anInt960 = 0;

	@OriginalMember(owner = "client!ca", name = "B", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
	private int anInt979 = 0;

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "Lclient!ck;")
	private final Class65_Sub1 aClass65_Sub1_2;

	@OriginalMember(owner = "client!ca", name = "v", descriptor = "Lclient!rc;")
	private final Class80_Sub2_Sub1 aClass80_Sub2_Sub1_2;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!ck;IIZ)V")
	public Class50_Sub1(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass65_Sub1_2 = arg0;
		this.aClass80_Sub2_Sub1_2 = Static197.method3242(arg1, arg0, arg2, arg3 ? 6408 : 6407);
	}

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!ck;IIII)V")
	public Class50_Sub1(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass65_Sub1_2 = arg0;
		this.aClass80_Sub2_Sub1_2 = Static189.method3161(arg4, arg1, arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!ck;II[III)V")
	public Class50_Sub1(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass65_Sub1_2 = arg0;
		this.aClass80_Sub2_Sub1_2 = Static476.method6821(arg0, arg4, arg3, arg5, arg1, arg2);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt979 = arg1;
		this.anInt956 = arg3;
		this.anInt961 = arg2;
		this.anInt963 = arg0;
		this.aBoolean71 = this.anInt963 != 0 || this.anInt979 != 0 || this.anInt961 != 0 || this.anInt956 != 0;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)V")
	@Override
	public void method6000(@OriginalArg(2) int arg0) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass80_Sub2_Sub1_1 = Static189.method3161(this.aClass80_Sub2_Sub1_2.anInt8362, 0, 0, this.aClass65_Sub1_2, this.aClass80_Sub2_Sub1_2.anInt8361);
		this.anInt960 = arg0;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method6001(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class80_Sub2_Sub1 local7 = ((Class1_Sub1) arg6).aClass80_Sub2_Sub1_5;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(32) float local32;
		if (this.aBoolean71) {
			local14 = (float) this.method6003();
			local18 = (float) this.method6010();
			local25 = (arg2 - arg0) / local14;
			local32 = (arg3 - arg1) / local14;
			@Pc(39) float local39 = (arg4 - arg0) / local18;
			@Pc(46) float local46 = (arg5 - arg1) / local18;
			@Pc(52) float local52 = (float) this.anInt979 * local39;
			@Pc(58) float local58 = (float) this.anInt979 * local46;
			@Pc(64) float local64 = (float) this.anInt963 * local25;
			@Pc(70) float local70 = (float) this.anInt963 * local32;
			@Pc(77) float local77 = (float) this.anInt961 * -local25;
			@Pc(84) float local84 = -local32 * (float) this.anInt961;
			@Pc(91) float local91 = -local39 * (float) this.anInt956;
			arg2 = local52 + local77 + arg2;
			arg3 = arg3 + local84 + local58;
			arg4 = local64 + arg4 + local91;
			arg1 = local70 + arg1 + local58;
			arg0 = arg0 + local64 + local52;
			@Pc(128) float local128 = -local46 * (float) this.anInt956;
			arg5 = local70 + arg5 + local128;
		}
		local14 = arg2 + arg4 - arg0;
		this.aClass80_Sub2_Sub1_2.method7142(true);
		local18 = arg5 + arg3 - arg1;
		this.aClass65_Sub1_2.method1225();
		this.aClass65_Sub1_2.method1286(this.aClass80_Sub2_Sub1_2);
		this.aClass65_Sub1_2.method1290(1);
		this.aClass65_Sub1_2.method1256(1);
		this.aClass65_Sub1_2.method1286(local7);
		this.aClass65_Sub1_2.method1228(7681, 8448);
		this.aClass65_Sub1_2.method1265(0, 768, 34168);
		this.aClass65_Sub1_2.method1231(1);
		local25 = local7.aFloat169 / (float) local7.anInt8361;
		local32 = local7.aFloat168 / (float) local7.anInt8362;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass80_Sub2_Sub1_2.aFloat168);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + arg0), local7.aFloat168 - local32 * (arg1 - (float) arg8));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * local25, local7.aFloat168 - local32 * ((float) -arg8 + arg5));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass80_Sub2_Sub1_2.aFloat169, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + local14) * local25, local7.aFloat168 - (local18 - (float) arg8) * local32);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass80_Sub2_Sub1_2.aFloat169, this.aClass80_Sub2_Sub1_2.aFloat168);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + arg2), local7.aFloat168 - ((float) -arg8 + arg3) * local32);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass65_Sub1_2.method1265(0, 768, 5890);
		this.aClass65_Sub1_2.method1290(0);
		this.aClass65_Sub1_2.method1286((Class80) null);
		this.aClass65_Sub1_2.method1256(0);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "()I")
	@Override
	public int method5992() {
		return this.aClass80_Sub2_Sub1_2.anInt8362;
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "()I")
	@Override
	public int method6003() {
		return this.aClass80_Sub2_Sub1_2.anInt8361 + this.anInt963 + this.anInt961;
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "()I")
	@Override
	public int method6010() {
		return this.anInt956 + this.anInt979 + this.aClass80_Sub2_Sub1_2.anInt8362;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII[III)V")
	private void method891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.aClass80_Sub2_Sub1_2.method7144(arg4, arg2, arg0, arg1, arg5, arg3);
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V")
	private void method893() {
		this.aClass65_Sub1_2.method1256(1);
		this.aClass65_Sub1_2.method1286((Class80) null);
		this.aClass65_Sub1_2.method1228(8448, 8448);
		this.aClass65_Sub1_2.method1265(1, 768, 34168);
		this.aClass65_Sub1_2.method1233(0, 5890);
		this.aClass65_Sub1_2.method1256(0);
		this.aClass65_Sub1_2.method1265(1, 768, 34168);
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "()I")
	@Override
	public int method6002() {
		return this.aClass80_Sub2_Sub1_2.anInt8361;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "([I)V")
	@Override
	public void method5999(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt956;
		arg0[2] = this.anInt961;
		arg0[1] = this.anInt979;
		arg0[0] = this.anInt963;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)V")
	private void method895(@OriginalArg(1) int arg0) {
		this.aClass65_Sub1_2.method1256(1);
		this.aClass65_Sub1_2.method1286(this.aClass80_Sub2_Sub1_2);
		this.aClass65_Sub1_2.method1228(this.aClass65_Sub1_2.method1301(arg0), 7681);
		this.aClass65_Sub1_2.method1265(1, 768, 34167);
		this.aClass65_Sub1_2.method1233(0, 34168);
		this.aClass65_Sub1_2.method1256(0);
		this.aClass65_Sub1_2.method1286(this.aClass80_Sub2_Sub1_1);
		this.aClass65_Sub1_2.method1228(34479, 7681);
		this.aClass65_Sub1_2.method1265(1, 768, 34166);
		if (this.anInt960 == 0) {
			this.aClass65_Sub1_2.method1276(0.5F, 0.5F, 0.0F, 1.0F);
		} else if (this.anInt960 == 1) {
			this.aClass65_Sub1_2.method1276(0.5F, 1.0F, 0.0F, 0.5F);
		} else if (this.anInt960 == 2) {
			this.aClass65_Sub1_2.method1276(1.0F, 0.5F, 0.0F, 0.5F);
			return;
		} else if (this.anInt960 == 3) {
			this.aClass65_Sub1_2.method1276(128.5F, 128.5F, 0.0F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!this.aClass65_Sub1_2.aBoolean105) {
			this.aClass80_Sub2_Sub1_2.method7143(arg0, arg1, arg5, arg3, arg2, arg4);
			return;
		}
		@Pc(17) int[] local17 = this.aClass65_Sub1_2.na(arg4, arg5, arg2, arg3);
		if (local17 == null) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < local17.length; local21++) {
			local17[local21] |= 0xFF000000;
		}
		this.method891(arg0, arg1, arg2, arg3, local17, arg2);
		return;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method6005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg0 + arg2;
		this.aClass80_Sub2_Sub1_2.method7142(false);
		@Pc(19) int local19 = arg1 + arg3;
		this.aClass65_Sub1_2.method1225();
		this.aClass65_Sub1_2.method1286(this.aClass80_Sub2_Sub1_2);
		this.aClass65_Sub1_2.method1231(arg6);
		this.aClass65_Sub1_2.method1290(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass80_Sub2_Sub1_2.aBoolean710 && !this.aBoolean71) {
			@Pc(73) float local73 = (float) arg3 * this.aClass80_Sub2_Sub1_2.aFloat168 / (float) this.aClass80_Sub2_Sub1_2.anInt8362;
			@Pc(85) float local85 = (float) arg2 * this.aClass80_Sub2_Sub1_2.aFloat169 / (float) this.aClass80_Sub2_Sub1_2.anInt8361;
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
		OpenGL.glTranslatef((float) this.anInt963, (float) this.anInt979, 0.0F);
		@Pc(125) int local125 = this.method6003();
		@Pc(128) int local128 = this.method6010();
		@Pc(134) int local134 = this.aClass80_Sub2_Sub1_2.anInt8362 + arg1;
		OpenGL.glBegin(7);
		@Pc(138) int local138 = arg1;
		@Pc(146) int local146;
		while (local134 <= local19) {
			local146 = arg0 + this.aClass80_Sub2_Sub1_2.anInt8361;
			@Pc(148) int local148 = arg0;
			while (local146 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass80_Sub2_Sub1_2.aFloat168);
				OpenGL.glVertex2i(local148, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local134);
				OpenGL.glTexCoord2f(this.aClass80_Sub2_Sub1_2.aFloat169, 0.0F);
				OpenGL.glVertex2i(local146, local134);
				OpenGL.glTexCoord2f(this.aClass80_Sub2_Sub1_2.aFloat169, this.aClass80_Sub2_Sub1_2.aFloat168);
				OpenGL.glVertex2i(local146, local138);
				local148 += local125;
				local146 += local125;
			}
			if (local9 > local148) {
				@Pc(215) float local215 = this.aClass80_Sub2_Sub1_2.aFloat169 * (float) (local9 - local148) / (float) this.aClass80_Sub2_Sub1_2.anInt8361;
				OpenGL.glTexCoord2f(0.0F, this.aClass80_Sub2_Sub1_2.aFloat168);
				OpenGL.glVertex2i(local148, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local134);
				OpenGL.glTexCoord2f(local215, 0.0F);
				OpenGL.glVertex2i(local9, local134);
				OpenGL.glTexCoord2f(local215, this.aClass80_Sub2_Sub1_2.aFloat168);
				OpenGL.glVertex2i(local9, local138);
			}
			local138 += local128;
			local134 += local128;
		}
		if (local19 > local138) {
			@Pc(280) float local280 = this.aClass80_Sub2_Sub1_2.aFloat168 * (float) (local138 + this.aClass80_Sub2_Sub1_2.anInt8362 - local19) / (float) this.aClass80_Sub2_Sub1_2.anInt8362;
			@Pc(286) int local286 = this.aClass80_Sub2_Sub1_2.anInt8361 + arg0;
			local146 = arg0;
			while (local286 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass80_Sub2_Sub1_2.aFloat168);
				OpenGL.glVertex2i(local146, local138);
				OpenGL.glTexCoord2f(0.0F, local280);
				OpenGL.glVertex2i(local146, local19);
				OpenGL.glTexCoord2f(this.aClass80_Sub2_Sub1_2.aFloat169, local280);
				OpenGL.glVertex2i(local286, local19);
				OpenGL.glTexCoord2f(this.aClass80_Sub2_Sub1_2.aFloat169, this.aClass80_Sub2_Sub1_2.aFloat168);
				OpenGL.glVertex2i(local286, local138);
				local286 += local125;
				local146 += local125;
			}
			if (local146 < local9) {
				@Pc(355) float local355 = this.aClass80_Sub2_Sub1_2.aFloat169 * (float) (local9 - local146) / (float) this.aClass80_Sub2_Sub1_2.anInt8361;
				OpenGL.glTexCoord2f(0.0F, this.aClass80_Sub2_Sub1_2.aFloat168);
				OpenGL.glVertex2i(local146, local138);
				OpenGL.glTexCoord2f(0.0F, local280);
				OpenGL.glVertex2i(local146, local19);
				OpenGL.glTexCoord2f(local355, local280);
				OpenGL.glVertex2i(local9, local19);
				OpenGL.glTexCoord2f(local355, this.aClass80_Sub2_Sub1_2.aFloat168);
				OpenGL.glVertex2i(local9, local138);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method6007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass80_Sub2_Sub1_2.method7142(true);
		this.aClass65_Sub1_2.method1225();
		this.aClass65_Sub1_2.method1231(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean71) {
			@Pc(51) float local51 = (float) arg2 / (float) this.method6003();
			@Pc(58) float local58 = (float) arg3 / (float) this.method6010();
			@Pc(67) float local67 = (float) arg0 + (float) this.anInt963 * local51;
			@Pc(76) float local76 = (float) arg1 + local58 * (float) this.anInt979;
			@Pc(85) float local85 = (float) this.aClass80_Sub2_Sub1_2.anInt8361 * local51 + local67;
			@Pc(94) float local94 = local76 + (float) this.aClass80_Sub2_Sub1_2.anInt8362 * local58;
			if (this.aClass80_Sub2_Sub1_1 == null) {
				this.aClass65_Sub1_2.method1286(this.aClass80_Sub2_Sub1_2);
				this.aClass65_Sub1_2.method1290(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass80_Sub2_Sub1_2.aFloat168);
				OpenGL.glVertex2f(local67, local76);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local67, local94);
				OpenGL.glTexCoord2f(this.aClass80_Sub2_Sub1_2.aFloat169, 0.0F);
				OpenGL.glVertex2f(local85, local94);
				OpenGL.glTexCoord2f(this.aClass80_Sub2_Sub1_2.aFloat169, this.aClass80_Sub2_Sub1_2.aFloat168);
				OpenGL.glVertex2f(local85, local76);
				OpenGL.glEnd();
			} else {
				this.method895(arg4);
				this.aClass80_Sub2_Sub1_1.method7142(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass80_Sub2_Sub1_2.aFloat168);
				OpenGL.glTexCoord2f(0.0F, this.aClass80_Sub2_Sub1_2.aFloat168);
				OpenGL.glVertex2f(local67, local76);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local67, local94);
				OpenGL.glMultiTexCoord2f(33985, this.aClass80_Sub2_Sub1_2.aFloat169, 0.0F);
				OpenGL.glTexCoord2f(this.aClass80_Sub2_Sub1_2.aFloat169, 0.0F);
				OpenGL.glVertex2f(local85, local94);
				OpenGL.glMultiTexCoord2f(33985, this.aClass80_Sub2_Sub1_2.aFloat169, this.aClass80_Sub2_Sub1_2.aFloat168);
				OpenGL.glTexCoord2f(this.aClass80_Sub2_Sub1_2.aFloat169, this.aClass80_Sub2_Sub1_2.aFloat168);
				OpenGL.glVertex2f(local85, local76);
				OpenGL.glEnd();
				this.method893();
			}
		} else if (this.aClass80_Sub2_Sub1_1 == null) {
			this.aClass65_Sub1_2.method1286(this.aClass80_Sub2_Sub1_2);
			this.aClass65_Sub1_2.method1290(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass80_Sub2_Sub1_2.aFloat168);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass80_Sub2_Sub1_2.aFloat169, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass80_Sub2_Sub1_2.aFloat169, this.aClass80_Sub2_Sub1_2.aFloat168);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method895(arg4);
			this.aClass80_Sub2_Sub1_1.method7142(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass80_Sub2_Sub1_2.aFloat168);
			OpenGL.glTexCoord2f(0.0F, this.aClass80_Sub2_Sub1_2.aFloat168);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass80_Sub2_Sub1_2.aFloat169, 0.0F);
			OpenGL.glTexCoord2f(this.aClass80_Sub2_Sub1_2.aFloat169, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass80_Sub2_Sub1_2.aFloat169, this.aClass80_Sub2_Sub1_2.aFloat168);
			OpenGL.glTexCoord2f(this.aClass80_Sub2_Sub1_2.aFloat169, this.aClass80_Sub2_Sub1_2.aFloat168);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method893();
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method5990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg2;
		@Pc(9) Class80_Sub2_Sub1 local9 = local6.aClass80_Sub2_Sub1_5;
		this.aClass80_Sub2_Sub1_2.method7142(false);
		this.aClass65_Sub1_2.method1225();
		this.aClass65_Sub1_2.method1286(this.aClass80_Sub2_Sub1_2);
		this.aClass65_Sub1_2.method1290(1);
		this.aClass65_Sub1_2.method1256(1);
		this.aClass65_Sub1_2.method1286(local9);
		this.aClass65_Sub1_2.method1228(7681, 8448);
		this.aClass65_Sub1_2.method1265(0, 768, 34168);
		this.aClass65_Sub1_2.method1231(1);
		@Pc(62) int local62 = arg1 + this.anInt979;
		@Pc(67) int local67 = arg0 + this.anInt963;
		@Pc(73) int local73 = this.aClass80_Sub2_Sub1_2.anInt8361 + local67;
		@Pc(79) int local79 = this.aClass80_Sub2_Sub1_2.anInt8362 + local62;
		@Pc(86) float local86 = local9.aFloat169 / (float) local9.anInt8361;
		@Pc(93) float local93 = local9.aFloat168 / (float) local9.anInt8362;
		@Pc(101) float local101 = local86 * (float) (local67 - arg3);
		@Pc(109) float local109 = (float) (local73 - arg3) * local86;
		@Pc(119) float local119 = local9.aFloat168 - (float) (local62 - arg4) * local93;
		@Pc(131) float local131 = local9.aFloat168 - local93 * (float) (local79 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass80_Sub2_Sub1_2.aFloat168);
		OpenGL.glMultiTexCoord2f(33985, local101, local119);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local131);
		OpenGL.glVertex2i(local67, local62 + this.aClass80_Sub2_Sub1_2.anInt8362);
		OpenGL.glMultiTexCoord2f(33984, this.aClass80_Sub2_Sub1_2.aFloat169, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local131);
		OpenGL.glVertex2i(local67 + this.aClass80_Sub2_Sub1_2.anInt8361, this.aClass80_Sub2_Sub1_2.anInt8362 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass80_Sub2_Sub1_2.aFloat169, this.aClass80_Sub2_Sub1_2.aFloat168);
		OpenGL.glMultiTexCoord2f(33985, local109, local119);
		OpenGL.glVertex2i(this.aClass80_Sub2_Sub1_2.anInt8361 + local67, local62);
		OpenGL.glEnd();
		this.aClass65_Sub1_2.method1265(0, 768, 5890);
		this.aClass65_Sub1_2.method1290(0);
		this.aClass65_Sub1_2.method1286((Class80) null);
		this.aClass65_Sub1_2.method1256(0);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method5997(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean71) {
			local6 = (float) this.method6003();
			local10 = (float) this.method6010();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(23) float local23 = (arg3 - arg1) / local6;
			@Pc(30) float local30 = (arg4 - arg0) / local10;
			@Pc(37) float local37 = (arg5 - arg1) / local10;
			@Pc(43) float local43 = (float) this.anInt979 * local30;
			@Pc(49) float local49 = local37 * (float) this.anInt979;
			@Pc(55) float local55 = (float) this.anInt963 * local16;
			@Pc(61) float local61 = local23 * (float) this.anInt963;
			@Pc(68) float local68 = (float) this.anInt961 * -local16;
			@Pc(75) float local75 = (float) this.anInt961 * -local23;
			@Pc(82) float local82 = -local30 * (float) this.anInt956;
			arg1 = arg1 + local61 + local49;
			arg2 = local68 + arg2 + local43;
			@Pc(101) float local101 = (float) this.anInt956 * -local37;
			arg4 = local82 + local55 + arg4;
			arg3 = local75 + arg3 + local49;
			arg0 = arg0 + local55 + local43;
			arg5 = local101 + local61 + arg5;
		}
		local6 = arg2 + arg4 - arg0;
		this.aClass80_Sub2_Sub1_2.method7142(true);
		local10 = arg5 + arg3 - arg1;
		this.aClass65_Sub1_2.method1225();
		this.aClass65_Sub1_2.method1286(this.aClass80_Sub2_Sub1_2);
		this.aClass65_Sub1_2.method1231(1);
		this.aClass65_Sub1_2.method1290(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass80_Sub2_Sub1_2.aFloat168);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass80_Sub2_Sub1_2.aFloat169, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass80_Sub2_Sub1_2.aFloat169, this.aClass80_Sub2_Sub1_2.aFloat168);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method5987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass80_Sub2_Sub1_2.method7142(false);
		this.aClass65_Sub1_2.method1225();
		this.aClass65_Sub1_2.method1231(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt979;
		@Pc(42) int local42 = arg0 + this.anInt963;
		if (this.aClass80_Sub2_Sub1_1 == null) {
			this.aClass65_Sub1_2.method1286(this.aClass80_Sub2_Sub1_2);
			this.aClass65_Sub1_2.method1290(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass80_Sub2_Sub1_2.aFloat168);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, this.aClass80_Sub2_Sub1_2.anInt8362 + local37);
			OpenGL.glTexCoord2f(this.aClass80_Sub2_Sub1_2.aFloat169, 0.0F);
			OpenGL.glVertex2i(this.aClass80_Sub2_Sub1_2.anInt8361 + local42, local37 - -this.aClass80_Sub2_Sub1_2.anInt8362);
			OpenGL.glTexCoord2f(this.aClass80_Sub2_Sub1_2.aFloat169, this.aClass80_Sub2_Sub1_2.aFloat168);
			OpenGL.glVertex2i(local42 + this.aClass80_Sub2_Sub1_2.anInt8361, local37);
			OpenGL.glEnd();
			return;
		}
		this.method895(arg2);
		this.aClass80_Sub2_Sub1_1.method7142(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass80_Sub2_Sub1_2.aFloat168);
		OpenGL.glTexCoord2f(0.0F, this.aClass80_Sub2_Sub1_2.aFloat168);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, local37 + this.aClass80_Sub2_Sub1_2.anInt8362);
		OpenGL.glMultiTexCoord2f(33985, this.aClass80_Sub2_Sub1_2.aFloat169, 0.0F);
		OpenGL.glTexCoord2f(this.aClass80_Sub2_Sub1_2.aFloat169, 0.0F);
		OpenGL.glVertex2i(this.aClass80_Sub2_Sub1_2.anInt8361 + local42, this.aClass80_Sub2_Sub1_2.anInt8362 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass80_Sub2_Sub1_2.aFloat169, this.aClass80_Sub2_Sub1_2.aFloat168);
		OpenGL.glTexCoord2f(this.aClass80_Sub2_Sub1_2.aFloat169, this.aClass80_Sub2_Sub1_2.aFloat168);
		OpenGL.glVertex2i(this.aClass80_Sub2_Sub1_2.anInt8361 + local42, local37);
		OpenGL.glEnd();
		this.method893();
	}
}
