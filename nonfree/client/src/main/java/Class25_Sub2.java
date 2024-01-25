import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class25_Sub2 extends Class25 {

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "Lclient!og;")
	private Class4_Sub2_Sub1 aClass4_Sub2_Sub1_3;

	@OriginalMember(owner = "client!rr", name = "s", descriptor = "Z")
	private boolean aBoolean543 = false;

	@OriginalMember(owner = "client!rr", name = "u", descriptor = "I")
	private int anInt7649 = 0;

	@OriginalMember(owner = "client!rr", name = "w", descriptor = "I")
	private int anInt7651 = 0;

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
	private int anInt7641 = 0;

	@OriginalMember(owner = "client!rr", name = "x", descriptor = "I")
	private int anInt7652 = 0;

	@OriginalMember(owner = "client!rr", name = "v", descriptor = "I")
	private int anInt7650 = 0;

	@OriginalMember(owner = "client!rr", name = "m", descriptor = "Lclient!jj;")
	private final Class62_Sub3 aClass62_Sub3_34;

	@OriginalMember(owner = "client!rr", name = "l", descriptor = "Lclient!og;")
	private final Class4_Sub2_Sub1 aClass4_Sub2_Sub1_4;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!jj;IIII)V")
	public Class25_Sub2(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass62_Sub3_34 = arg0;
		this.aClass4_Sub2_Sub1_4 = Static70.method1322(arg0, arg3, arg1, arg4, arg2);
	}

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!jj;II[III)V")
	public Class25_Sub2(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass62_Sub3_34 = arg0;
		this.aClass4_Sub2_Sub1_4 = Static402.method5841(arg2, arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "(IIIIIII)V")
	@Override
	public void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		this.aClass4_Sub2_Sub1_4.method5502(false);
		@Pc(19) int local19 = arg1 + arg3;
		this.aClass62_Sub3_34.method3978();
		this.aClass62_Sub3_34.method4007(this.aClass4_Sub2_Sub1_4);
		this.aClass62_Sub3_34.method3979(arg6);
		this.aClass62_Sub3_34.method3999(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass4_Sub2_Sub1_4.aBoolean457 && !this.aBoolean543) {
			@Pc(73) float local73 = this.aClass4_Sub2_Sub1_4.aFloat277 * (float) arg3 / (float) this.aClass4_Sub2_Sub1_4.anInt6595;
			@Pc(85) float local85 = (float) arg2 * this.aClass4_Sub2_Sub1_4.aFloat278 / (float) this.aClass4_Sub2_Sub1_4.anInt6596;
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
		OpenGL.glTranslatef((float) this.anInt7649, (float) this.anInt7651, 0.0F);
		@Pc(125) int local125 = this.EA();
		@Pc(128) int local128 = this.ma();
		@Pc(134) int local134 = this.aClass4_Sub2_Sub1_4.anInt6595 + arg1;
		OpenGL.glBegin(7);
		@Pc(138) int local138 = arg1;
		@Pc(146) int local146;
		while (local19 >= local134) {
			local146 = this.aClass4_Sub2_Sub1_4.anInt6596 + arg0;
			@Pc(148) int local148 = arg0;
			while (local146 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub2_Sub1_4.aFloat277);
				OpenGL.glVertex2i(local148, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local134);
				OpenGL.glTexCoord2f(this.aClass4_Sub2_Sub1_4.aFloat278, 0.0F);
				OpenGL.glVertex2i(local146, local134);
				OpenGL.glTexCoord2f(this.aClass4_Sub2_Sub1_4.aFloat278, this.aClass4_Sub2_Sub1_4.aFloat277);
				OpenGL.glVertex2i(local146, local138);
				local148 += local125;
				local146 += local125;
			}
			if (local148 < local9) {
				@Pc(219) float local219 = (float) (local9 - local148) * this.aClass4_Sub2_Sub1_4.aFloat278 / (float) this.aClass4_Sub2_Sub1_4.anInt6596;
				OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub2_Sub1_4.aFloat277);
				OpenGL.glVertex2i(local148, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local134);
				OpenGL.glTexCoord2f(local219, 0.0F);
				OpenGL.glVertex2i(local9, local134);
				OpenGL.glTexCoord2f(local219, this.aClass4_Sub2_Sub1_4.aFloat277);
				OpenGL.glVertex2i(local9, local138);
			}
			local134 += local128;
			local138 += local128;
		}
		if (local138 < local19) {
			@Pc(280) float local280 = this.aClass4_Sub2_Sub1_4.aFloat277 * (float) (this.aClass4_Sub2_Sub1_4.anInt6595 + local138 - local19) / (float) this.aClass4_Sub2_Sub1_4.anInt6595;
			@Pc(286) int local286 = this.aClass4_Sub2_Sub1_4.anInt6596 + arg0;
			local146 = arg0;
			while (local286 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub2_Sub1_4.aFloat277);
				OpenGL.glVertex2i(local146, local138);
				OpenGL.glTexCoord2f(0.0F, local280);
				OpenGL.glVertex2i(local146, local19);
				OpenGL.glTexCoord2f(this.aClass4_Sub2_Sub1_4.aFloat278, local280);
				OpenGL.glVertex2i(local286, local19);
				OpenGL.glTexCoord2f(this.aClass4_Sub2_Sub1_4.aFloat278, this.aClass4_Sub2_Sub1_4.aFloat277);
				OpenGL.glVertex2i(local286, local138);
				local286 += local125;
				local146 += local125;
			}
			if (local9 > local146) {
				@Pc(354) float local354 = (float) (local9 - local146) * this.aClass4_Sub2_Sub1_4.aFloat278 / (float) this.aClass4_Sub2_Sub1_4.anInt6596;
				OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub2_Sub1_4.aFloat277);
				OpenGL.glVertex2i(local146, local138);
				OpenGL.glTexCoord2f(0.0F, local280);
				OpenGL.glVertex2i(local146, local19);
				OpenGL.glTexCoord2f(local354, local280);
				OpenGL.glVertex2i(local9, local19);
				OpenGL.glTexCoord2f(local354, this.aClass4_Sub2_Sub1_4.aFloat277);
				OpenGL.glVertex2i(local9, local138);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!rr", name = "P", descriptor = "(IIIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass4_Sub2_Sub1_4.method5466(arg2, arg3, arg4, arg0, arg5, arg1);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IILclient!pa;II)V")
	@Override
	public void method6965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class87 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class87_Sub1 local6 = (Class87_Sub1) arg2;
		@Pc(9) Class4_Sub2_Sub1 local9 = local6.aClass4_Sub2_Sub1_1;
		this.aClass4_Sub2_Sub1_4.method5502(false);
		this.aClass62_Sub3_34.method3978();
		this.aClass62_Sub3_34.method4007(this.aClass4_Sub2_Sub1_4);
		this.aClass62_Sub3_34.method3999(1);
		this.aClass62_Sub3_34.method4009(1);
		this.aClass62_Sub3_34.method4007(local9);
		this.aClass62_Sub3_34.method4011(8448, 7681);
		this.aClass62_Sub3_34.method3984(34168, 0, 768);
		this.aClass62_Sub3_34.method3979(1);
		@Pc(62) int local62 = arg1 + this.anInt7651;
		@Pc(67) int local67 = arg0 + this.anInt7649;
		@Pc(74) int local74 = local67 + this.aClass4_Sub2_Sub1_4.anInt6596;
		@Pc(80) int local80 = this.aClass4_Sub2_Sub1_4.anInt6595 + local62;
		@Pc(87) float local87 = local9.aFloat278 / (float) local9.anInt6596;
		@Pc(94) float local94 = local9.aFloat277 / (float) local9.anInt6595;
		@Pc(102) float local102 = (float) (local67 - arg3) * local87;
		@Pc(110) float local110 = local87 * (float) (local74 - arg3);
		@Pc(121) float local121 = local9.aFloat277 - (float) (local62 - arg4) * local94;
		@Pc(132) float local132 = local9.aFloat277 - local94 * (float) (local80 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass4_Sub2_Sub1_4.aFloat277);
		OpenGL.glMultiTexCoord2f(33985, local102, local121);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local102, local132);
		OpenGL.glVertex2i(local67, local62 + this.aClass4_Sub2_Sub1_4.anInt6595);
		OpenGL.glMultiTexCoord2f(33984, this.aClass4_Sub2_Sub1_4.aFloat278, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local110, local132);
		OpenGL.glVertex2i(this.aClass4_Sub2_Sub1_4.anInt6596 + local67, this.aClass4_Sub2_Sub1_4.anInt6595 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass4_Sub2_Sub1_4.aFloat278, this.aClass4_Sub2_Sub1_4.aFloat277);
		OpenGL.glMultiTexCoord2f(33985, local110, local121);
		OpenGL.glVertex2i(local67 + this.aClass4_Sub2_Sub1_4.anInt6596, local62);
		OpenGL.glEnd();
		this.aClass62_Sub3_34.method3984(5890, 0, 768);
		this.aClass62_Sub3_34.method3999(0);
		this.aClass62_Sub3_34.method4007(null);
		this.aClass62_Sub3_34.method4009(0);
	}

	@OriginalMember(owner = "client!rr", name = "DA", descriptor = "(IIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass4_Sub2_Sub1_4.method5502(false);
		this.aClass62_Sub3_34.method3978();
		this.aClass62_Sub3_34.method3979(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt7651;
		@Pc(42) int local42 = arg0 + this.anInt7649;
		if (this.aClass4_Sub2_Sub1_3 == null) {
			this.aClass62_Sub3_34.method4007(this.aClass4_Sub2_Sub1_4);
			this.aClass62_Sub3_34.method3999(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub2_Sub1_4.aFloat277);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, local37 + this.aClass4_Sub2_Sub1_4.anInt6595);
			OpenGL.glTexCoord2f(this.aClass4_Sub2_Sub1_4.aFloat278, 0.0F);
			OpenGL.glVertex2i(local42 + this.aClass4_Sub2_Sub1_4.anInt6596, local37 - -this.aClass4_Sub2_Sub1_4.anInt6595);
			OpenGL.glTexCoord2f(this.aClass4_Sub2_Sub1_4.aFloat278, this.aClass4_Sub2_Sub1_4.aFloat277);
			OpenGL.glVertex2i(this.aClass4_Sub2_Sub1_4.anInt6596 + local42, local37);
			OpenGL.glEnd();
			return;
		}
		this.method6201(arg2);
		this.aClass4_Sub2_Sub1_3.method5502(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass4_Sub2_Sub1_4.aFloat277);
		OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub2_Sub1_4.aFloat277);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, local37 + this.aClass4_Sub2_Sub1_4.anInt6595);
		OpenGL.glMultiTexCoord2f(33985, this.aClass4_Sub2_Sub1_4.aFloat278, 0.0F);
		OpenGL.glTexCoord2f(this.aClass4_Sub2_Sub1_4.aFloat278, 0.0F);
		OpenGL.glVertex2i(this.aClass4_Sub2_Sub1_4.anInt6596 + local42, local37 - -this.aClass4_Sub2_Sub1_4.anInt6595);
		OpenGL.glMultiTexCoord2f(33985, this.aClass4_Sub2_Sub1_4.aFloat278, this.aClass4_Sub2_Sub1_4.aFloat277);
		OpenGL.glTexCoord2f(this.aClass4_Sub2_Sub1_4.aFloat278, this.aClass4_Sub2_Sub1_4.aFloat277);
		OpenGL.glVertex2i(local42 + this.aClass4_Sub2_Sub1_4.anInt6596, local37);
		OpenGL.glEnd();
		this.method6198();
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V")
	private void method6198() {
		this.aClass62_Sub3_34.method4009(1);
		this.aClass62_Sub3_34.method4007(null);
		this.aClass62_Sub3_34.method4011(8448, 8448);
		this.aClass62_Sub3_34.method3984(34168, 1, 768);
		this.aClass62_Sub3_34.method4003(0, 5890);
		this.aClass62_Sub3_34.method4009(0);
		this.aClass62_Sub3_34.method3984(34168, 1, 768);
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "()I")
	@Override
	public int c() {
		return this.aClass4_Sub2_Sub1_4.anInt6596;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(FFFFFFLclient!pa;II)V")
	@Override
	protected void method6963(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class87 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class4_Sub2_Sub1 local7 = ((Class87_Sub1) arg6).aClass4_Sub2_Sub1_1;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(32) float local32;
		if (this.aBoolean543) {
			local14 = this.EA();
			local18 = this.ma();
			local25 = (arg2 - arg0) / local14;
			local32 = (arg3 - arg1) / local14;
			@Pc(38) float local38 = (arg4 - arg0) / local18;
			@Pc(45) float local45 = (arg5 - arg1) / local18;
			@Pc(51) float local51 = (float) this.anInt7651 * local38;
			@Pc(57) float local57 = (float) this.anInt7651 * local45;
			@Pc(63) float local63 = local25 * (float) this.anInt7649;
			@Pc(69) float local69 = (float) this.anInt7649 * local32;
			@Pc(76) float local76 = (float) this.anInt7641 * -local25;
			@Pc(83) float local83 = -local32 * (float) this.anInt7641;
			@Pc(90) float local90 = -local38 * (float) this.anInt7652;
			arg2 = local76 + arg2 + local51;
			arg0 = local51 + local63 + arg0;
			arg1 = local69 + arg1 + local57;
			@Pc(115) float local115 = -local45 * (float) this.anInt7652;
			arg4 = local90 + local63 + arg4;
			arg3 = arg3 + local83 + local57;
			arg5 = local115 + local69 + arg5;
		}
		local14 = arg2 + arg4 - arg0;
		this.aClass4_Sub2_Sub1_4.method5502(true);
		local18 = arg3 + arg5 - arg1;
		this.aClass62_Sub3_34.method3978();
		this.aClass62_Sub3_34.method4007(this.aClass4_Sub2_Sub1_4);
		this.aClass62_Sub3_34.method3999(1);
		this.aClass62_Sub3_34.method4009(1);
		this.aClass62_Sub3_34.method4007(local7);
		this.aClass62_Sub3_34.method4011(8448, 7681);
		this.aClass62_Sub3_34.method3984(34168, 0, 768);
		this.aClass62_Sub3_34.method3979(1);
		local25 = local7.aFloat278 / (float) local7.anInt6596;
		local32 = local7.aFloat277 / (float) local7.anInt6595;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass4_Sub2_Sub1_4.aFloat277);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + arg0), local7.aFloat277 - (arg1 - (float) arg8) * local32);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg4 - (float) arg7), local7.aFloat277 - local32 * ((float) -arg8 + arg5));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass4_Sub2_Sub1_4.aFloat278, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + local14) * local25, local7.aFloat277 - local32 * ((float) -arg8 + local18));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass4_Sub2_Sub1_4.aFloat278, this.aClass4_Sub2_Sub1_4.aFloat277);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg2 - (float) arg7), local7.aFloat277 - (arg3 - (float) arg8) * local32);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass62_Sub3_34.method3984(5890, 0, 768);
		this.aClass62_Sub3_34.method3999(0);
		this.aClass62_Sub3_34.method4007(null);
		this.aClass62_Sub3_34.method4009(0);
	}

	@OriginalMember(owner = "client!rr", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7649 = arg0;
		this.anInt7651 = arg1;
		this.anInt7652 = arg3;
		this.anInt7641 = arg2;
		this.aBoolean543 = this.anInt7649 != 0 || this.anInt7651 != 0 || this.anInt7641 != 0 || this.anInt7652 != 0;
	}

	@OriginalMember(owner = "client!rr", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		return this.aClass4_Sub2_Sub1_4.anInt6595 + this.anInt7651 + this.anInt7652;
	}

	@OriginalMember(owner = "client!rr", name = "CA", descriptor = "(FFFFFFIII)V")
	@Override
	protected void CA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean543) {
			local10 = this.EA();
			local14 = this.ma();
			@Pc(20) float local20 = (arg2 - arg0) / local10;
			@Pc(26) float local26 = (arg3 - arg1) / local10;
			@Pc(33) float local33 = (arg4 - arg0) / local14;
			@Pc(39) float local39 = (arg5 - arg1) / local14;
			@Pc(45) float local45 = local33 * (float) this.anInt7651;
			@Pc(51) float local51 = (float) this.anInt7651 * local39;
			@Pc(57) float local57 = (float) this.anInt7649 * local20;
			@Pc(63) float local63 = (float) this.anInt7649 * local26;
			@Pc(70) float local70 = (float) this.anInt7641 * -local20;
			@Pc(77) float local77 = -local26 * (float) this.anInt7641;
			@Pc(84) float local84 = -local33 * (float) this.anInt7652;
			@Pc(91) float local91 = -local39 * (float) this.anInt7652;
			arg2 = local70 + arg2 + local45;
			arg4 = local84 + arg4 + local57;
			arg1 = local51 + local63 + arg1;
			arg0 = local57 + arg0 + local45;
			arg3 = local51 + local77 + arg3;
			arg5 = local63 + arg5 + local91;
		}
		local10 = arg2 + arg4 - arg0;
		this.aClass4_Sub2_Sub1_4.method5502(true);
		local14 = arg3 + arg5 - arg1;
		this.aClass62_Sub3_34.method3978();
		this.aClass62_Sub3_34.method4007(this.aClass4_Sub2_Sub1_4);
		this.aClass62_Sub3_34.method3979(arg8);
		this.aClass62_Sub3_34.method3999(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub2_Sub1_4.aFloat277);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass4_Sub2_Sub1_4.aFloat278, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass4_Sub2_Sub1_4.aFloat278, this.aClass4_Sub2_Sub1_4.aFloat277);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!rr", name = "BA", descriptor = "(III)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass4_Sub2_Sub1_3 = Static70.method1322(this.aClass62_Sub3_34, this.aClass4_Sub2_Sub1_4.anInt6596, arg0, this.aClass4_Sub2_Sub1_4.anInt6595, arg1);
		this.anInt7650 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(II)V")
	private void method6201(@OriginalArg(0) int arg0) {
		this.aClass62_Sub3_34.method4009(1);
		this.aClass62_Sub3_34.method4007(this.aClass4_Sub2_Sub1_4);
		this.aClass62_Sub3_34.method4011(7681, this.aClass62_Sub3_34.method3971(arg0));
		this.aClass62_Sub3_34.method3984(34167, 1, 768);
		this.aClass62_Sub3_34.method4003(0, 34168);
		this.aClass62_Sub3_34.method4009(0);
		this.aClass62_Sub3_34.method4007(this.aClass4_Sub2_Sub1_3);
		this.aClass62_Sub3_34.method4011(7681, 34479);
		this.aClass62_Sub3_34.method3984(34166, 1, 768);
		if (this.anInt7650 == 0) {
			this.aClass62_Sub3_34.method3941(0.5F, 0.5F, 0.0F, 1.0F);
		} else if (this.anInt7650 == 1) {
			this.aClass62_Sub3_34.method3941(1.0F, 0.5F, 0.0F, 0.5F);
		} else if (this.anInt7650 == 2) {
			this.aClass62_Sub3_34.method3941(0.5F, 1.0F, 0.0F, 0.5F);
			return;
		} else if (this.anInt7650 == 3) {
			this.aClass62_Sub3_34.method3941(128.5F, 128.5F, 0.0F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!rr", name = "ra", descriptor = "(IIIIIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass4_Sub2_Sub1_4.method5502(true);
		this.aClass62_Sub3_34.method3978();
		this.aClass62_Sub3_34.method3979(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean543) {
			@Pc(181) float local181 = (float) arg2 / (float) this.EA();
			@Pc(188) float local188 = (float) arg3 / (float) this.ma();
			@Pc(197) float local197 = (float) this.anInt7649 * local181 + (float) arg0;
			@Pc(206) float local206 = (float) this.anInt7651 * local188 + (float) arg1;
			@Pc(215) float local215 = local197 + local181 * (float) this.aClass4_Sub2_Sub1_4.anInt6596;
			@Pc(224) float local224 = local188 * (float) this.aClass4_Sub2_Sub1_4.anInt6595 + local206;
			if (this.aClass4_Sub2_Sub1_3 == null) {
				this.aClass62_Sub3_34.method4007(this.aClass4_Sub2_Sub1_4);
				this.aClass62_Sub3_34.method3999(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub2_Sub1_4.aFloat277);
				OpenGL.glVertex2f(local197, local206);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local197, local224);
				OpenGL.glTexCoord2f(this.aClass4_Sub2_Sub1_4.aFloat278, 0.0F);
				OpenGL.glVertex2f(local215, local224);
				OpenGL.glTexCoord2f(this.aClass4_Sub2_Sub1_4.aFloat278, this.aClass4_Sub2_Sub1_4.aFloat277);
				OpenGL.glVertex2f(local215, local206);
				OpenGL.glEnd();
			} else {
				this.method6201(arg4);
				this.aClass4_Sub2_Sub1_3.method5502(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass4_Sub2_Sub1_4.aFloat277);
				OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub2_Sub1_4.aFloat277);
				OpenGL.glVertex2f(local197, local206);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local197, local224);
				OpenGL.glMultiTexCoord2f(33985, this.aClass4_Sub2_Sub1_4.aFloat278, 0.0F);
				OpenGL.glTexCoord2f(this.aClass4_Sub2_Sub1_4.aFloat278, 0.0F);
				OpenGL.glVertex2f(local215, local224);
				OpenGL.glMultiTexCoord2f(33985, this.aClass4_Sub2_Sub1_4.aFloat278, this.aClass4_Sub2_Sub1_4.aFloat277);
				OpenGL.glTexCoord2f(this.aClass4_Sub2_Sub1_4.aFloat278, this.aClass4_Sub2_Sub1_4.aFloat277);
				OpenGL.glVertex2f(local215, local206);
				OpenGL.glEnd();
				this.method6198();
			}
		} else if (this.aClass4_Sub2_Sub1_3 == null) {
			this.aClass62_Sub3_34.method4007(this.aClass4_Sub2_Sub1_4);
			this.aClass62_Sub3_34.method3999(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub2_Sub1_4.aFloat277);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass4_Sub2_Sub1_4.aFloat278, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass4_Sub2_Sub1_4.aFloat278, this.aClass4_Sub2_Sub1_4.aFloat277);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method6201(arg4);
			this.aClass4_Sub2_Sub1_3.method5502(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass4_Sub2_Sub1_4.aFloat277);
			OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub2_Sub1_4.aFloat277);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass4_Sub2_Sub1_4.aFloat278, 0.0F);
			OpenGL.glTexCoord2f(this.aClass4_Sub2_Sub1_4.aFloat278, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass4_Sub2_Sub1_4.aFloat278, this.aClass4_Sub2_Sub1_4.aFloat277);
			OpenGL.glTexCoord2f(this.aClass4_Sub2_Sub1_4.aFloat278, this.aClass4_Sub2_Sub1_4.aFloat277);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method6198();
		}
	}

	@OriginalMember(owner = "client!rr", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		return this.aClass4_Sub2_Sub1_4.anInt6596 + this.anInt7649 + this.anInt7641;
	}

	@OriginalMember(owner = "client!rr", name = "la", descriptor = "()I")
	@Override
	public int la() {
		return this.aClass4_Sub2_Sub1_4.anInt6595;
	}
}
