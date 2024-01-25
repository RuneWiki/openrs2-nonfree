import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class9_Sub2 extends Class9 {

	@OriginalMember(owner = "client!rp", name = "B", descriptor = "Lclient!iq;")
	private Class53_Sub2_Sub1 aClass53_Sub2_Sub1_5;

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
	private int anInt8623 = 0;

	@OriginalMember(owner = "client!rp", name = "s", descriptor = "I")
	private int anInt8638 = 0;

	@OriginalMember(owner = "client!rp", name = "y", descriptor = "I")
	private int anInt8643 = 0;

	@OriginalMember(owner = "client!rp", name = "i", descriptor = "Z")
	private boolean aBoolean609 = false;

	@OriginalMember(owner = "client!rp", name = "n", descriptor = "I")
	private int anInt8633 = 0;

	@OriginalMember(owner = "client!rp", name = "z", descriptor = "I")
	private int anInt8644 = 0;

	@OriginalMember(owner = "client!rp", name = "w", descriptor = "Lclient!pq;")
	private final Class132_Sub3 aClass132_Sub3_37;

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "Lclient!iq;")
	private final Class53_Sub2_Sub1 aClass53_Sub2_Sub1_4;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!pq;IIZ)V")
	public Class9_Sub2(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass132_Sub3_37 = arg0;
		this.aClass53_Sub2_Sub1_4 = Static366.method5297(arg0, arg2, arg1, arg3 ? 6408 : 6407);
	}

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!pq;IIII)V")
	public Class9_Sub2(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass132_Sub3_37 = arg0;
		this.aClass53_Sub2_Sub1_4 = Static146.method4128(arg3, arg0, arg4, arg1, arg2);
	}

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!pq;II[III)V")
	public Class9_Sub2(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass132_Sub3_37 = arg0;
		this.aClass53_Sub2_Sub1_4 = Static117.method1835(arg3, arg1, arg5, arg0, arg4, arg2);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method8916(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class53_Sub2_Sub1 local7 = ((Class1_Sub2) arg6).aClass53_Sub2_Sub1_2;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(32) float local32;
		if (this.aBoolean609) {
			local14 = (float) this.method8937();
			local18 = (float) this.method8930();
			local25 = (arg2 - arg0) / local14;
			local32 = (arg3 - arg1) / local14;
			@Pc(39) float local39 = (arg4 - arg0) / local18;
			@Pc(46) float local46 = (arg5 - arg1) / local18;
			@Pc(52) float local52 = (float) this.anInt8644 * local39;
			@Pc(58) float local58 = local46 * (float) this.anInt8644;
			@Pc(64) float local64 = local25 * (float) this.anInt8633;
			@Pc(70) float local70 = local32 * (float) this.anInt8633;
			@Pc(77) float local77 = -local25 * (float) this.anInt8638;
			@Pc(84) float local84 = (float) this.anInt8638 * -local32;
			@Pc(91) float local91 = (float) this.anInt8643 * -local39;
			arg1 = arg1 + local70 + local58;
			arg3 = local84 + arg3 + local58;
			arg4 = local91 + arg4 + local64;
			arg2 = local52 + arg2 + local77;
			arg0 = local64 + arg0 + local52;
			@Pc(128) float local128 = -local46 * (float) this.anInt8643;
			arg5 = arg5 + local70 + local128;
		}
		local14 = arg2 + arg4 - arg0;
		this.aClass53_Sub2_Sub1_4.method8287(true);
		local18 = arg5 + arg3 - arg1;
		this.aClass132_Sub3_37.method6767();
		this.aClass132_Sub3_37.method6759(this.aClass53_Sub2_Sub1_4);
		this.aClass132_Sub3_37.method6803(1);
		this.aClass132_Sub3_37.method6802(1);
		this.aClass132_Sub3_37.method6759(local7);
		this.aClass132_Sub3_37.method6770(8448, 7681);
		this.aClass132_Sub3_37.method6763(0, 768, 34168);
		this.aClass132_Sub3_37.method6781(1);
		local25 = local7.aFloat31 / (float) local7.anInt4464;
		local32 = local7.aFloat32 / (float) local7.anInt4466;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass53_Sub2_Sub1_4.aFloat32);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg0) * local25, local7.aFloat32 - local32 * (arg1 - (float) arg8));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg4) * local25, local7.aFloat32 - local32 * ((float) -arg8 + arg5));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass53_Sub2_Sub1_4.aFloat31, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + local14), local7.aFloat32 - local32 * ((float) -arg8 + local18));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass53_Sub2_Sub1_4.aFloat31, this.aClass53_Sub2_Sub1_4.aFloat32);
		OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * local25, local7.aFloat32 - local32 * ((float) -arg8 + arg3));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass132_Sub3_37.method6763(0, 768, 5890);
		this.aClass132_Sub3_37.method6803(0);
		this.aClass132_Sub3_37.method6759((Class53) null);
		this.aClass132_Sub3_37.method6802(0);
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method8926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		this.aClass53_Sub2_Sub1_4.method8287(false);
		@Pc(18) int local18 = arg3 + arg1;
		this.aClass132_Sub3_37.method6767();
		this.aClass132_Sub3_37.method6759(this.aClass53_Sub2_Sub1_4);
		this.aClass132_Sub3_37.method6781(arg6);
		this.aClass132_Sub3_37.method6803(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass53_Sub2_Sub1_4.aBoolean279 && !this.aBoolean609) {
			@Pc(347) float local347 = this.aClass53_Sub2_Sub1_4.aFloat32 * (float) arg3 / (float) this.aClass53_Sub2_Sub1_4.anInt4466;
			@Pc(359) float local359 = (float) arg2 * this.aClass53_Sub2_Sub1_4.aFloat31 / (float) this.aClass53_Sub2_Sub1_4.anInt4464;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local347);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local18);
			OpenGL.glTexCoord2f(local359, 0.0F);
			OpenGL.glVertex2i(local9, local18);
			OpenGL.glTexCoord2f(local359, local347);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt8633, (float) this.anInt8644, 0.0F);
		@Pc(72) int local72 = this.method8937();
		@Pc(75) int local75 = this.method8930();
		@Pc(81) int local81 = this.aClass53_Sub2_Sub1_4.anInt4466 + arg1;
		OpenGL.glBegin(7);
		@Pc(85) int local85 = arg1;
		@Pc(93) int local93;
		while (local18 >= local81) {
			local93 = arg0 + this.aClass53_Sub2_Sub1_4.anInt4464;
			@Pc(95) int local95 = arg0;
			while (local93 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass53_Sub2_Sub1_4.aFloat32);
				OpenGL.glVertex2i(local95, local85);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local95, local81);
				OpenGL.glTexCoord2f(this.aClass53_Sub2_Sub1_4.aFloat31, 0.0F);
				OpenGL.glVertex2i(local93, local81);
				OpenGL.glTexCoord2f(this.aClass53_Sub2_Sub1_4.aFloat31, this.aClass53_Sub2_Sub1_4.aFloat32);
				OpenGL.glVertex2i(local93, local85);
				local93 += local72;
				local95 += local72;
			}
			if (local9 > local95) {
				@Pc(165) float local165 = this.aClass53_Sub2_Sub1_4.aFloat31 * (float) (local9 - local95) / (float) this.aClass53_Sub2_Sub1_4.anInt4464;
				OpenGL.glTexCoord2f(0.0F, this.aClass53_Sub2_Sub1_4.aFloat32);
				OpenGL.glVertex2i(local95, local85);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local95, local81);
				OpenGL.glTexCoord2f(local165, 0.0F);
				OpenGL.glVertex2i(local9, local81);
				OpenGL.glTexCoord2f(local165, this.aClass53_Sub2_Sub1_4.aFloat32);
				OpenGL.glVertex2i(local9, local85);
			}
			local85 += local75;
			local81 += local75;
		}
		if (local18 > local85) {
			@Pc(225) float local225 = (float) (this.aClass53_Sub2_Sub1_4.anInt4466 + local85 - local18) * this.aClass53_Sub2_Sub1_4.aFloat32 / (float) this.aClass53_Sub2_Sub1_4.anInt4466;
			@Pc(231) int local231 = this.aClass53_Sub2_Sub1_4.anInt4464 + arg0;
			local93 = arg0;
			while (local231 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass53_Sub2_Sub1_4.aFloat32);
				OpenGL.glVertex2i(local93, local85);
				OpenGL.glTexCoord2f(0.0F, local225);
				OpenGL.glVertex2i(local93, local18);
				OpenGL.glTexCoord2f(this.aClass53_Sub2_Sub1_4.aFloat31, local225);
				OpenGL.glVertex2i(local231, local18);
				OpenGL.glTexCoord2f(this.aClass53_Sub2_Sub1_4.aFloat31, this.aClass53_Sub2_Sub1_4.aFloat32);
				OpenGL.glVertex2i(local231, local85);
				local231 += local72;
				local93 += local72;
			}
			if (local93 < local9) {
				@Pc(304) float local304 = this.aClass53_Sub2_Sub1_4.aFloat31 * (float) (local9 - local93) / (float) this.aClass53_Sub2_Sub1_4.anInt4464;
				OpenGL.glTexCoord2f(0.0F, this.aClass53_Sub2_Sub1_4.aFloat32);
				OpenGL.glVertex2i(local93, local85);
				OpenGL.glTexCoord2f(0.0F, local225);
				OpenGL.glVertex2i(local93, local18);
				OpenGL.glTexCoord2f(local304, local225);
				OpenGL.glVertex2i(local9, local18);
				OpenGL.glTexCoord2f(local304, this.aClass53_Sub2_Sub1_4.aFloat32);
				OpenGL.glVertex2i(local9, local85);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "([I)V")
	@Override
	public void method8923(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt8643;
		arg0[0] = this.anInt8633;
		arg0[1] = this.anInt8644;
		arg0[2] = this.anInt8638;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "()I")
	@Override
	public int method8918() {
		return this.aClass53_Sub2_Sub1_4.anInt4466;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)V")
	private void method7334() {
		this.aClass132_Sub3_37.method6802(1);
		this.aClass132_Sub3_37.method6759((Class53) null);
		this.aClass132_Sub3_37.method6770(8448, 8448);
		this.aClass132_Sub3_37.method6763(1, 768, 34168);
		this.aClass132_Sub3_37.method6760(5890, 0);
		this.aClass132_Sub3_37.method6802(0);
		this.aClass132_Sub3_37.method6763(1, 768, 34168);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(III)V")
	@Override
	public void method8935(@OriginalArg(2) int arg0) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass53_Sub2_Sub1_5 = Static146.method4128(this.aClass53_Sub2_Sub1_4.anInt4464, this.aClass132_Sub3_37, this.aClass53_Sub2_Sub1_4.anInt4466, 0, 0);
		this.anInt8623 = arg0;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method8929(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean609) {
			local6 = (float) this.method8937();
			local10 = (float) this.method8930();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(23) float local23 = (arg3 - arg1) / local6;
			@Pc(29) float local29 = (arg4 - arg0) / local10;
			@Pc(36) float local36 = (arg5 - arg1) / local10;
			@Pc(42) float local42 = (float) this.anInt8644 * local29;
			@Pc(48) float local48 = local36 * (float) this.anInt8644;
			@Pc(54) float local54 = local16 * (float) this.anInt8633;
			@Pc(60) float local60 = (float) this.anInt8633 * local23;
			@Pc(67) float local67 = (float) this.anInt8638 * -local16;
			@Pc(74) float local74 = -local23 * (float) this.anInt8638;
			@Pc(81) float local81 = -local29 * (float) this.anInt8643;
			arg0 = local42 + arg0 + local54;
			@Pc(94) float local94 = -local36 * (float) this.anInt8643;
			arg4 = local81 + arg4 + local54;
			arg1 = arg1 + local60 + local48;
			arg3 = arg3 + local74 + local48;
			arg2 = local42 + arg2 + local67;
			arg5 = local60 + arg5 + local94;
		}
		local6 = arg2 + arg4 - arg0;
		local10 = arg3 + arg5 - arg1;
		this.aClass53_Sub2_Sub1_4.method8287(true);
		this.aClass132_Sub3_37.method6767();
		this.aClass132_Sub3_37.method6759(this.aClass53_Sub2_Sub1_4);
		this.aClass132_Sub3_37.method6781(1);
		this.aClass132_Sub3_37.method6803(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass53_Sub2_Sub1_4.aFloat32);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass53_Sub2_Sub1_4.aFloat31, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass53_Sub2_Sub1_4.aFloat31, this.aClass53_Sub2_Sub1_4.aFloat32);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "()I")
	@Override
	public int method8937() {
		return this.anInt8633 + this.aClass53_Sub2_Sub1_4.anInt4464 + this.anInt8638;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IB)V")
	private void method7335(@OriginalArg(0) int arg0) {
		this.aClass132_Sub3_37.method6802(1);
		this.aClass132_Sub3_37.method6759(this.aClass53_Sub2_Sub1_4);
		this.aClass132_Sub3_37.method6770(7681, this.aClass132_Sub3_37.method6790(arg0));
		this.aClass132_Sub3_37.method6763(1, 768, 34167);
		this.aClass132_Sub3_37.method6760(34168, 0);
		this.aClass132_Sub3_37.method6802(0);
		this.aClass132_Sub3_37.method6759(this.aClass53_Sub2_Sub1_5);
		this.aClass132_Sub3_37.method6770(7681, 34479);
		this.aClass132_Sub3_37.method6763(1, 768, 34166);
		if (this.anInt8623 == 0) {
			this.aClass132_Sub3_37.method6746(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt8623 == 1) {
			this.aClass132_Sub3_37.method6746(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt8623 == 2) {
			this.aClass132_Sub3_37.method6746(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt8623 == 3) {
			this.aClass132_Sub3_37.method6746(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "()I")
	@Override
	public int method8938() {
		return this.aClass53_Sub2_Sub1_4.anInt4464;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method8933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg2;
		@Pc(9) Class53_Sub2_Sub1 local9 = local6.aClass53_Sub2_Sub1_2;
		this.aClass53_Sub2_Sub1_4.method8287(false);
		this.aClass132_Sub3_37.method6767();
		this.aClass132_Sub3_37.method6759(this.aClass53_Sub2_Sub1_4);
		this.aClass132_Sub3_37.method6803(1);
		this.aClass132_Sub3_37.method6802(1);
		this.aClass132_Sub3_37.method6759(local9);
		this.aClass132_Sub3_37.method6770(8448, 7681);
		this.aClass132_Sub3_37.method6763(0, 768, 34168);
		this.aClass132_Sub3_37.method6781(1);
		@Pc(62) int local62 = arg1 + this.anInt8644;
		@Pc(67) int local67 = arg0 + this.anInt8633;
		@Pc(74) int local74 = local67 + this.aClass53_Sub2_Sub1_4.anInt4464;
		@Pc(80) int local80 = this.aClass53_Sub2_Sub1_4.anInt4466 + local62;
		@Pc(87) float local87 = local9.aFloat31 / (float) local9.anInt4464;
		@Pc(94) float local94 = local9.aFloat32 / (float) local9.anInt4466;
		@Pc(102) float local102 = (float) (local67 - arg3) * local87;
		@Pc(110) float local110 = (float) (local74 - arg3) * local87;
		@Pc(122) float local122 = local9.aFloat32 - (float) (local62 - arg4) * local94;
		@Pc(133) float local133 = local9.aFloat32 - local94 * (float) (local80 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass53_Sub2_Sub1_4.aFloat32);
		OpenGL.glMultiTexCoord2f(33985, local102, local122);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local102, local133);
		OpenGL.glVertex2i(local67, local62 + this.aClass53_Sub2_Sub1_4.anInt4466);
		OpenGL.glMultiTexCoord2f(33984, this.aClass53_Sub2_Sub1_4.aFloat31, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local110, local133);
		OpenGL.glVertex2i(local67 + this.aClass53_Sub2_Sub1_4.anInt4464, local62 + this.aClass53_Sub2_Sub1_4.anInt4466);
		OpenGL.glMultiTexCoord2f(33984, this.aClass53_Sub2_Sub1_4.aFloat31, this.aClass53_Sub2_Sub1_4.aFloat32);
		OpenGL.glMultiTexCoord2f(33985, local110, local122);
		OpenGL.glVertex2i(local67 + this.aClass53_Sub2_Sub1_4.anInt4464, local62);
		OpenGL.glEnd();
		this.aClass132_Sub3_37.method6763(0, 768, 5890);
		this.aClass132_Sub3_37.method6803(0);
		this.aClass132_Sub3_37.method6759((Class53) null);
		this.aClass132_Sub3_37.method6802(0);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method8915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass53_Sub2_Sub1_4.method8287(true);
		this.aClass132_Sub3_37.method6767();
		this.aClass132_Sub3_37.method6781(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean609) {
			@Pc(48) float local48 = (float) arg2 / (float) this.method8937();
			@Pc(55) float local55 = (float) arg3 / (float) this.method8930();
			@Pc(64) float local64 = (float) this.anInt8633 * local48 + (float) arg0;
			@Pc(73) float local73 = (float) arg1 + (float) this.anInt8644 * local55;
			@Pc(82) float local82 = local64 + (float) this.aClass53_Sub2_Sub1_4.anInt4464 * local48;
			@Pc(91) float local91 = local73 + (float) this.aClass53_Sub2_Sub1_4.anInt4466 * local55;
			if (this.aClass53_Sub2_Sub1_5 == null) {
				this.aClass132_Sub3_37.method6759(this.aClass53_Sub2_Sub1_4);
				this.aClass132_Sub3_37.method6803(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass53_Sub2_Sub1_4.aFloat32);
				OpenGL.glVertex2f(local64, local73);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local64, local91);
				OpenGL.glTexCoord2f(this.aClass53_Sub2_Sub1_4.aFloat31, 0.0F);
				OpenGL.glVertex2f(local82, local91);
				OpenGL.glTexCoord2f(this.aClass53_Sub2_Sub1_4.aFloat31, this.aClass53_Sub2_Sub1_4.aFloat32);
				OpenGL.glVertex2f(local82, local73);
				OpenGL.glEnd();
			} else {
				this.method7335(arg4);
				this.aClass53_Sub2_Sub1_5.method8287(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass53_Sub2_Sub1_4.aFloat32);
				OpenGL.glTexCoord2f(0.0F, this.aClass53_Sub2_Sub1_4.aFloat32);
				OpenGL.glVertex2f(local64, local73);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local64, local91);
				OpenGL.glMultiTexCoord2f(33985, this.aClass53_Sub2_Sub1_4.aFloat31, 0.0F);
				OpenGL.glTexCoord2f(this.aClass53_Sub2_Sub1_4.aFloat31, 0.0F);
				OpenGL.glVertex2f(local82, local91);
				OpenGL.glMultiTexCoord2f(33985, this.aClass53_Sub2_Sub1_4.aFloat31, this.aClass53_Sub2_Sub1_4.aFloat32);
				OpenGL.glTexCoord2f(this.aClass53_Sub2_Sub1_4.aFloat31, this.aClass53_Sub2_Sub1_4.aFloat32);
				OpenGL.glVertex2f(local82, local73);
				OpenGL.glEnd();
				this.method7334();
			}
		} else if (this.aClass53_Sub2_Sub1_5 == null) {
			this.aClass132_Sub3_37.method6759(this.aClass53_Sub2_Sub1_4);
			this.aClass132_Sub3_37.method6803(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass53_Sub2_Sub1_4.aFloat32);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass53_Sub2_Sub1_4.aFloat31, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass53_Sub2_Sub1_4.aFloat31, this.aClass53_Sub2_Sub1_4.aFloat32);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method7335(arg4);
			this.aClass53_Sub2_Sub1_5.method8287(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass53_Sub2_Sub1_4.aFloat32);
			OpenGL.glTexCoord2f(0.0F, this.aClass53_Sub2_Sub1_4.aFloat32);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass53_Sub2_Sub1_4.aFloat31, 0.0F);
			OpenGL.glTexCoord2f(this.aClass53_Sub2_Sub1_4.aFloat31, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass53_Sub2_Sub1_4.aFloat31, this.aClass53_Sub2_Sub1_4.aFloat32);
			OpenGL.glTexCoord2f(this.aClass53_Sub2_Sub1_4.aFloat31, this.aClass53_Sub2_Sub1_4.aFloat32);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method7334();
		}
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(IIII)V")
	@Override
	public void method8931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8644 = arg1;
		this.anInt8638 = arg2;
		this.anInt8633 = arg0;
		this.anInt8643 = arg3;
		this.aBoolean609 = this.anInt8633 != 0 || this.anInt8644 != 0 || this.anInt8638 != 0 || this.anInt8643 != 0;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIII[III)V")
	private void method7336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.aClass53_Sub2_Sub1_4.method3727(arg0, arg5, arg4, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "()I")
	@Override
	public int method8930() {
		return this.anInt8643 + this.aClass53_Sub2_Sub1_4.anInt4466 + this.anInt8644;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!this.aClass132_Sub3_37.aBoolean534) {
			this.aClass53_Sub2_Sub1_4.method3732(arg1, arg4, arg3, arg0, arg2, arg5);
			return;
		}
		@Pc(17) int[] local17 = this.aClass132_Sub3_37.na(arg4, arg5, arg2, arg3);
		if (local17 == null) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < local17.length; local21++) {
			local17[local21] |= 0xFF000000;
		}
		this.method7336(arg0, arg1, arg2, arg3, local17, arg2);
		return;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method8919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass53_Sub2_Sub1_4.method8287(false);
		this.aClass132_Sub3_37.method6767();
		this.aClass132_Sub3_37.method6781(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt8633;
		@Pc(42) int local42 = arg1 + this.anInt8644;
		if (this.aClass53_Sub2_Sub1_5 == null) {
			this.aClass132_Sub3_37.method6759(this.aClass53_Sub2_Sub1_4);
			this.aClass132_Sub3_37.method6803(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass53_Sub2_Sub1_4.aFloat32);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, this.aClass53_Sub2_Sub1_4.anInt4466 + local42);
			OpenGL.glTexCoord2f(this.aClass53_Sub2_Sub1_4.aFloat31, 0.0F);
			OpenGL.glVertex2i(local37 + this.aClass53_Sub2_Sub1_4.anInt4464, this.aClass53_Sub2_Sub1_4.anInt4466 + local42);
			OpenGL.glTexCoord2f(this.aClass53_Sub2_Sub1_4.aFloat31, this.aClass53_Sub2_Sub1_4.aFloat32);
			OpenGL.glVertex2i(this.aClass53_Sub2_Sub1_4.anInt4464 + local37, local42);
			OpenGL.glEnd();
			return;
		}
		this.method7335(arg2);
		this.aClass53_Sub2_Sub1_5.method8287(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass53_Sub2_Sub1_4.aFloat32);
		OpenGL.glTexCoord2f(0.0F, this.aClass53_Sub2_Sub1_4.aFloat32);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, local42 + this.aClass53_Sub2_Sub1_4.anInt4466);
		OpenGL.glMultiTexCoord2f(33985, this.aClass53_Sub2_Sub1_4.aFloat31, 0.0F);
		OpenGL.glTexCoord2f(this.aClass53_Sub2_Sub1_4.aFloat31, 0.0F);
		OpenGL.glVertex2i(local37 + this.aClass53_Sub2_Sub1_4.anInt4464, this.aClass53_Sub2_Sub1_4.anInt4466 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass53_Sub2_Sub1_4.aFloat31, this.aClass53_Sub2_Sub1_4.aFloat32);
		OpenGL.glTexCoord2f(this.aClass53_Sub2_Sub1_4.aFloat31, this.aClass53_Sub2_Sub1_4.aFloat32);
		OpenGL.glVertex2i(this.aClass53_Sub2_Sub1_4.anInt4464 + local37, local42);
		OpenGL.glEnd();
		this.method7334();
	}
}
