import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class80_Sub2 extends Class80 {

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "Lclient!cq;")
	private Class13_Sub1_Sub1 aClass13_Sub1_Sub1_4;

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "Z")
	private boolean aBoolean275 = false;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
	private int anInt4021 = 0;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
	private int anInt4023 = 0;

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
	private int anInt4030 = 0;

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
	private int anInt4014 = 0;

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
	private int anInt4028 = 0;

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "Lclient!ht;")
	private final Class109_Sub1 aClass109_Sub1_28;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "Lclient!cq;")
	private final Class13_Sub1_Sub1 aClass13_Sub1_Sub1_3;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!ht;IIII)V")
	public Class80_Sub2(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass109_Sub1_28 = arg0;
		this.aClass13_Sub1_Sub1_3 = Static133.method1909(arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!ht;II[III)V")
	public Class80_Sub2(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass109_Sub1_28 = arg0;
		this.aClass13_Sub1_Sub1_3 = Static439.method5872(arg2, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!lb", name = "M", descriptor = "(IIIIIII)V")
	@Override
	public void M(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass13_Sub1_Sub1_3.method2745(true);
		this.aClass109_Sub1_28.method2589();
		this.aClass109_Sub1_28.method2522(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean275) {
			@Pc(182) float local182 = (float) arg2 / (float) this.ja();
			@Pc(189) float local189 = (float) arg3 / (float) this.JA();
			@Pc(198) float local198 = (float) arg0 + local182 * (float) this.anInt4014;
			@Pc(207) float local207 = (float) arg1 + (float) this.anInt4030 * local189;
			@Pc(216) float local216 = local182 * (float) this.aClass13_Sub1_Sub1_3.anInt1249 + local198;
			@Pc(225) float local225 = (float) this.aClass13_Sub1_Sub1_3.anInt1252 * local189 + local207;
			if (this.aClass13_Sub1_Sub1_4 == null) {
				this.aClass109_Sub1_28.method2578(this.aClass13_Sub1_Sub1_3);
				this.aClass109_Sub1_28.method2531(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass13_Sub1_Sub1_3.aFloat27);
				OpenGL.glVertex2f(local198, local207);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local198, local225);
				OpenGL.glTexCoord2f(this.aClass13_Sub1_Sub1_3.aFloat28, 0.0F);
				OpenGL.glVertex2f(local216, local225);
				OpenGL.glTexCoord2f(this.aClass13_Sub1_Sub1_3.aFloat28, this.aClass13_Sub1_Sub1_3.aFloat27);
				OpenGL.glVertex2f(local216, local207);
				OpenGL.glEnd();
			} else {
				this.method3356(arg4);
				this.aClass13_Sub1_Sub1_4.method2745(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass13_Sub1_Sub1_3.aFloat27);
				OpenGL.glTexCoord2f(0.0F, this.aClass13_Sub1_Sub1_3.aFloat27);
				OpenGL.glVertex2f(local198, local207);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local198, local225);
				OpenGL.glMultiTexCoord2f(33985, this.aClass13_Sub1_Sub1_3.aFloat28, 0.0F);
				OpenGL.glTexCoord2f(this.aClass13_Sub1_Sub1_3.aFloat28, 0.0F);
				OpenGL.glVertex2f(local216, local225);
				OpenGL.glMultiTexCoord2f(33985, this.aClass13_Sub1_Sub1_3.aFloat28, this.aClass13_Sub1_Sub1_3.aFloat27);
				OpenGL.glTexCoord2f(this.aClass13_Sub1_Sub1_3.aFloat28, this.aClass13_Sub1_Sub1_3.aFloat27);
				OpenGL.glVertex2f(local216, local207);
				OpenGL.glEnd();
				this.method3355();
			}
		} else if (this.aClass13_Sub1_Sub1_4 == null) {
			this.aClass109_Sub1_28.method2578(this.aClass13_Sub1_Sub1_3);
			this.aClass109_Sub1_28.method2531(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass13_Sub1_Sub1_3.aFloat27);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass13_Sub1_Sub1_3.aFloat28, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass13_Sub1_Sub1_3.aFloat28, this.aClass13_Sub1_Sub1_3.aFloat27);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method3356(arg4);
			this.aClass13_Sub1_Sub1_4.method2745(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass13_Sub1_Sub1_3.aFloat27);
			OpenGL.glTexCoord2f(0.0F, this.aClass13_Sub1_Sub1_3.aFloat27);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass13_Sub1_Sub1_3.aFloat28, 0.0F);
			OpenGL.glTexCoord2f(this.aClass13_Sub1_Sub1_3.aFloat28, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass13_Sub1_Sub1_3.aFloat28, this.aClass13_Sub1_Sub1_3.aFloat27);
			OpenGL.glTexCoord2f(this.aClass13_Sub1_Sub1_3.aFloat28, this.aClass13_Sub1_Sub1_3.aFloat27);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method3355();
		}
	}

	@OriginalMember(owner = "client!lb", name = "qa", descriptor = "()I")
	@Override
	public int qa() {
		return this.aClass13_Sub1_Sub1_3.anInt1252;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILclient!ea;II)V")
	@Override
	public void method6096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class62 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class62_Sub2 local6 = (Class62_Sub2) arg2;
		@Pc(9) Class13_Sub1_Sub1 local9 = local6.aClass13_Sub1_Sub1_5;
		this.aClass13_Sub1_Sub1_3.method2745(false);
		this.aClass109_Sub1_28.method2589();
		this.aClass109_Sub1_28.method2578(this.aClass13_Sub1_Sub1_3);
		this.aClass109_Sub1_28.method2531(1);
		this.aClass109_Sub1_28.method2564(1);
		this.aClass109_Sub1_28.method2578(local9);
		this.aClass109_Sub1_28.method2549(7681, 8448);
		this.aClass109_Sub1_28.method2528(34168, 768, 0);
		this.aClass109_Sub1_28.method2522(1);
		@Pc(62) int local62 = arg0 + this.anInt4014;
		@Pc(67) int local67 = arg1 + this.anInt4030;
		@Pc(73) int local73 = local62 + this.aClass13_Sub1_Sub1_3.anInt1249;
		@Pc(80) int local80 = local67 + this.aClass13_Sub1_Sub1_3.anInt1252;
		@Pc(87) float local87 = local9.aFloat28 / (float) local9.anInt1249;
		@Pc(94) float local94 = local9.aFloat27 / (float) local9.anInt1252;
		@Pc(102) float local102 = local87 * (float) (local62 - arg3);
		@Pc(110) float local110 = local87 * (float) (local73 - arg3);
		@Pc(121) float local121 = local9.aFloat27 - local94 * (float) (local67 - arg4);
		@Pc(132) float local132 = local9.aFloat27 - (float) (local80 - arg4) * local94;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass13_Sub1_Sub1_3.aFloat27);
		OpenGL.glMultiTexCoord2f(33985, local102, local121);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local102, local132);
		OpenGL.glVertex2i(local62, this.aClass13_Sub1_Sub1_3.anInt1252 + local67);
		OpenGL.glMultiTexCoord2f(33984, this.aClass13_Sub1_Sub1_3.aFloat28, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local110, local132);
		OpenGL.glVertex2i(local62 + this.aClass13_Sub1_Sub1_3.anInt1249, local67 + this.aClass13_Sub1_Sub1_3.anInt1252);
		OpenGL.glMultiTexCoord2f(33984, this.aClass13_Sub1_Sub1_3.aFloat28, this.aClass13_Sub1_Sub1_3.aFloat27);
		OpenGL.glMultiTexCoord2f(33985, local110, local121);
		OpenGL.glVertex2i(local62 + this.aClass13_Sub1_Sub1_3.anInt1249, local67);
		OpenGL.glEnd();
		this.aClass109_Sub1_28.method2528(5890, 768, 0);
		this.aClass109_Sub1_28.method2531(0);
		this.aClass109_Sub1_28.method2578(null);
		this.aClass109_Sub1_28.method2564(0);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(FFFFFFLclient!ea;II)V")
	@Override
	protected void method6091(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class62 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class13_Sub1_Sub1 local7 = ((Class62_Sub2) arg6).aClass13_Sub1_Sub1_5;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(32) float local32;
		if (this.aBoolean275) {
			local14 = this.ja();
			local18 = this.JA();
			local25 = (arg2 - arg0) / local14;
			local32 = (arg3 - arg1) / local14;
			@Pc(39) float local39 = (arg4 - arg0) / local18;
			@Pc(45) float local45 = (arg5 - arg1) / local18;
			@Pc(51) float local51 = (float) this.anInt4030 * local39;
			@Pc(57) float local57 = local45 * (float) this.anInt4030;
			@Pc(63) float local63 = local25 * (float) this.anInt4014;
			@Pc(69) float local69 = local32 * (float) this.anInt4014;
			@Pc(76) float local76 = -local25 * (float) this.anInt4021;
			@Pc(83) float local83 = -local32 * (float) this.anInt4021;
			@Pc(90) float local90 = -local39 * (float) this.anInt4023;
			@Pc(97) float local97 = -local45 * (float) this.anInt4023;
			arg1 = arg1 + local69 + local57;
			arg4 = local90 + local63 + arg4;
			arg2 = arg2 + local76 + local51;
			arg3 = local57 + arg3 + local83;
			arg0 = arg0 + local63 + local51;
			arg5 = local69 + arg5 + local97;
		}
		local14 = arg2 + arg4 - arg0;
		local18 = arg5 + arg3 - arg1;
		this.aClass13_Sub1_Sub1_3.method2745(true);
		this.aClass109_Sub1_28.method2589();
		this.aClass109_Sub1_28.method2578(this.aClass13_Sub1_Sub1_3);
		this.aClass109_Sub1_28.method2531(1);
		this.aClass109_Sub1_28.method2564(1);
		this.aClass109_Sub1_28.method2578(local7);
		this.aClass109_Sub1_28.method2549(7681, 8448);
		this.aClass109_Sub1_28.method2528(34168, 768, 0);
		this.aClass109_Sub1_28.method2522(1);
		local25 = local7.aFloat28 / (float) local7.anInt1249;
		local32 = local7.aFloat27 / (float) local7.anInt1252;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass13_Sub1_Sub1_3.aFloat27);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg0 - (float) arg7), local7.aFloat27 - (arg1 - (float) arg8) * local32);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + arg4), local7.aFloat27 - local32 * ((float) -arg8 + arg5));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass13_Sub1_Sub1_3.aFloat28, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (local14 - (float) arg7) * local25, local7.aFloat27 - local32 * ((float) -arg8 + local18));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass13_Sub1_Sub1_3.aFloat28, this.aClass13_Sub1_Sub1_3.aFloat27);
		OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * local25, local7.aFloat27 - local32 * ((float) -arg8 + arg3));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass109_Sub1_28.method2528(5890, 768, 0);
		this.aClass109_Sub1_28.method2531(0);
		this.aClass109_Sub1_28.method2578(null);
		this.aClass109_Sub1_28.method2564(0);
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
	private void method3355() {
		this.aClass109_Sub1_28.method2564(1);
		this.aClass109_Sub1_28.method2578(null);
		this.aClass109_Sub1_28.method2549(8448, 8448);
		this.aClass109_Sub1_28.method2528(34168, 768, 1);
		this.aClass109_Sub1_28.method2545(5890, 0);
		this.aClass109_Sub1_28.method2564(0);
		this.aClass109_Sub1_28.method2528(34168, 768, 1);
	}

	@OriginalMember(owner = "client!lb", name = "W", descriptor = "(IIIIII)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass13_Sub1_Sub1_3.method1056(arg0, arg1, arg4, arg5, arg2, arg3);
	}

	@OriginalMember(owner = "client!lb", name = "ka", descriptor = "(IIII)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4030 = arg1;
		this.anInt4023 = arg3;
		this.anInt4021 = arg2;
		this.anInt4014 = arg0;
		this.aBoolean275 = this.anInt4014 != 0 || this.anInt4030 != 0 || this.anInt4021 != 0 || this.anInt4023 != 0;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V")
	private void method3356(@OriginalArg(1) int arg0) {
		this.aClass109_Sub1_28.method2564(1);
		this.aClass109_Sub1_28.method2578(this.aClass13_Sub1_Sub1_3);
		this.aClass109_Sub1_28.method2549(this.aClass109_Sub1_28.method2593(arg0), 7681);
		this.aClass109_Sub1_28.method2528(34167, 768, 1);
		this.aClass109_Sub1_28.method2545(34168, 0);
		this.aClass109_Sub1_28.method2564(0);
		this.aClass109_Sub1_28.method2578(this.aClass13_Sub1_Sub1_4);
		this.aClass109_Sub1_28.method2549(34479, 7681);
		this.aClass109_Sub1_28.method2528(34166, 768, 1);
		if (this.anInt4028 == 0) {
			this.aClass109_Sub1_28.method2540(0.0F, 0.5F, 0.5F, 1.0F);
		} else if (this.anInt4028 == 1) {
			this.aClass109_Sub1_28.method2540(0.0F, 1.0F, 0.5F, 0.5F);
		} else if (this.anInt4028 == 2) {
			this.aClass109_Sub1_28.method2540(0.0F, 0.5F, 1.0F, 0.5F);
		} else if (this.anInt4028 == 3) {
			this.aClass109_Sub1_28.method2540(0.0F, 128.5F, 128.5F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!lb", name = "JA", descriptor = "()I")
	@Override
	public int JA() {
		return this.aClass13_Sub1_Sub1_3.anInt1252 + this.anInt4030 + this.anInt4023;
	}

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "(IIIIIII)V")
	@Override
	public void D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int local10 = arg0 + arg2;
		@Pc(14) int local14 = arg3 + arg1;
		this.aClass13_Sub1_Sub1_3.method2745(false);
		this.aClass109_Sub1_28.method2589();
		this.aClass109_Sub1_28.method2578(this.aClass13_Sub1_Sub1_3);
		this.aClass109_Sub1_28.method2522(arg6);
		this.aClass109_Sub1_28.method2531(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass13_Sub1_Sub1_3.aBoolean60 && !this.aBoolean275) {
			@Pc(347) float local347 = this.aClass13_Sub1_Sub1_3.aFloat27 * (float) arg3 / (float) this.aClass13_Sub1_Sub1_3.anInt1252;
			@Pc(359) float local359 = (float) arg2 * this.aClass13_Sub1_Sub1_3.aFloat28 / (float) this.aClass13_Sub1_Sub1_3.anInt1249;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local347);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local14);
			OpenGL.glTexCoord2f(local359, 0.0F);
			OpenGL.glVertex2i(local10, local14);
			OpenGL.glTexCoord2f(local359, local347);
			OpenGL.glVertex2i(local10, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt4014, (float) this.anInt4030, 0.0F);
		@Pc(73) int local73 = this.ja();
		@Pc(76) int local76 = this.JA();
		@Pc(82) int local82 = this.aClass13_Sub1_Sub1_3.anInt1252 + arg1;
		OpenGL.glBegin(7);
		@Pc(86) int local86 = arg1;
		@Pc(95) int local95;
		while (local82 <= local14) {
			local95 = arg0 + this.aClass13_Sub1_Sub1_3.anInt1249;
			@Pc(97) int local97 = arg0;
			while (local95 <= local10) {
				OpenGL.glTexCoord2f(0.0F, this.aClass13_Sub1_Sub1_3.aFloat27);
				OpenGL.glVertex2i(local97, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local97, local82);
				OpenGL.glTexCoord2f(this.aClass13_Sub1_Sub1_3.aFloat28, 0.0F);
				OpenGL.glVertex2i(local95, local82);
				OpenGL.glTexCoord2f(this.aClass13_Sub1_Sub1_3.aFloat28, this.aClass13_Sub1_Sub1_3.aFloat27);
				OpenGL.glVertex2i(local95, local86);
				local97 += local73;
				local95 += local73;
			}
			if (local97 < local10) {
				@Pc(164) float local164 = (float) (local10 - local97) * this.aClass13_Sub1_Sub1_3.aFloat28 / (float) this.aClass13_Sub1_Sub1_3.anInt1249;
				OpenGL.glTexCoord2f(0.0F, this.aClass13_Sub1_Sub1_3.aFloat27);
				OpenGL.glVertex2i(local97, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local97, local82);
				OpenGL.glTexCoord2f(local164, 0.0F);
				OpenGL.glVertex2i(local10, local82);
				OpenGL.glTexCoord2f(local164, this.aClass13_Sub1_Sub1_3.aFloat27);
				OpenGL.glVertex2i(local10, local86);
			}
			local86 += local76;
			local82 += local76;
		}
		if (local14 > local86) {
			@Pc(229) float local229 = (float) (this.aClass13_Sub1_Sub1_3.anInt1252 + local86 - local14) * this.aClass13_Sub1_Sub1_3.aFloat27 / (float) this.aClass13_Sub1_Sub1_3.anInt1252;
			@Pc(235) int local235 = arg0 + this.aClass13_Sub1_Sub1_3.anInt1249;
			local95 = arg0;
			while (local235 <= local10) {
				OpenGL.glTexCoord2f(0.0F, this.aClass13_Sub1_Sub1_3.aFloat27);
				OpenGL.glVertex2i(local95, local86);
				OpenGL.glTexCoord2f(0.0F, local229);
				OpenGL.glVertex2i(local95, local14);
				OpenGL.glTexCoord2f(this.aClass13_Sub1_Sub1_3.aFloat28, local229);
				OpenGL.glVertex2i(local235, local14);
				OpenGL.glTexCoord2f(this.aClass13_Sub1_Sub1_3.aFloat28, this.aClass13_Sub1_Sub1_3.aFloat27);
				OpenGL.glVertex2i(local235, local86);
				local235 += local73;
				local95 += local73;
			}
			if (local95 < local10) {
				@Pc(304) float local304 = this.aClass13_Sub1_Sub1_3.aFloat28 * (float) (local10 - local95) / (float) this.aClass13_Sub1_Sub1_3.anInt1249;
				OpenGL.glTexCoord2f(0.0F, this.aClass13_Sub1_Sub1_3.aFloat27);
				OpenGL.glVertex2i(local95, local86);
				OpenGL.glTexCoord2f(0.0F, local229);
				OpenGL.glVertex2i(local95, local14);
				OpenGL.glTexCoord2f(local304, local229);
				OpenGL.glVertex2i(local10, local14);
				OpenGL.glTexCoord2f(local304, this.aClass13_Sub1_Sub1_3.aFloat27);
				OpenGL.glVertex2i(local10, local86);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!lb", name = "YA", descriptor = "(IIIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass13_Sub1_Sub1_3.method2745(false);
		this.aClass109_Sub1_28.method2589();
		this.aClass109_Sub1_28.method2522(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt4014;
		@Pc(42) int local42 = arg1 + this.anInt4030;
		if (this.aClass13_Sub1_Sub1_4 == null) {
			this.aClass109_Sub1_28.method2578(this.aClass13_Sub1_Sub1_3);
			this.aClass109_Sub1_28.method2531(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass13_Sub1_Sub1_3.aFloat27);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, local42 + this.aClass13_Sub1_Sub1_3.anInt1252);
			OpenGL.glTexCoord2f(this.aClass13_Sub1_Sub1_3.aFloat28, 0.0F);
			OpenGL.glVertex2i(this.aClass13_Sub1_Sub1_3.anInt1249 + local37, this.aClass13_Sub1_Sub1_3.anInt1252 + local42);
			OpenGL.glTexCoord2f(this.aClass13_Sub1_Sub1_3.aFloat28, this.aClass13_Sub1_Sub1_3.aFloat27);
			OpenGL.glVertex2i(this.aClass13_Sub1_Sub1_3.anInt1249 + local37, local42);
			OpenGL.glEnd();
			return;
		}
		this.method3356(arg2);
		this.aClass13_Sub1_Sub1_4.method2745(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass13_Sub1_Sub1_3.aFloat27);
		OpenGL.glTexCoord2f(0.0F, this.aClass13_Sub1_Sub1_3.aFloat27);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, this.aClass13_Sub1_Sub1_3.anInt1252 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass13_Sub1_Sub1_3.aFloat28, 0.0F);
		OpenGL.glTexCoord2f(this.aClass13_Sub1_Sub1_3.aFloat28, 0.0F);
		OpenGL.glVertex2i(this.aClass13_Sub1_Sub1_3.anInt1249 + local37, local42 - -this.aClass13_Sub1_Sub1_3.anInt1252);
		OpenGL.glMultiTexCoord2f(33985, this.aClass13_Sub1_Sub1_3.aFloat28, this.aClass13_Sub1_Sub1_3.aFloat27);
		OpenGL.glTexCoord2f(this.aClass13_Sub1_Sub1_3.aFloat28, this.aClass13_Sub1_Sub1_3.aFloat27);
		OpenGL.glVertex2i(local37 + this.aClass13_Sub1_Sub1_3.anInt1249, local42);
		OpenGL.glEnd();
		this.method3355();
	}

	@OriginalMember(owner = "client!lb", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass13_Sub1_Sub1_4 = Static133.method1909(this.aClass109_Sub1_28, arg0, this.aClass13_Sub1_Sub1_3.anInt1249, this.aClass13_Sub1_Sub1_3.anInt1252, arg1);
		this.anInt4028 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!lb", name = "UA", descriptor = "()I")
	@Override
	public int UA() {
		return this.aClass13_Sub1_Sub1_3.anInt1249;
	}

	@OriginalMember(owner = "client!lb", name = "aa", descriptor = "(FFFFFFIII)V")
	@Override
	protected void aa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean275) {
			local10 = this.ja();
			local14 = this.JA();
			@Pc(21) float local21 = (arg2 - arg0) / local10;
			@Pc(28) float local28 = (arg3 - arg1) / local10;
			@Pc(34) float local34 = (arg4 - arg0) / local14;
			@Pc(40) float local40 = (arg5 - arg1) / local14;
			@Pc(46) float local46 = (float) this.anInt4030 * local34;
			@Pc(52) float local52 = (float) this.anInt4030 * local40;
			@Pc(58) float local58 = local21 * (float) this.anInt4014;
			@Pc(64) float local64 = (float) this.anInt4014 * local28;
			@Pc(71) float local71 = -local21 * (float) this.anInt4021;
			@Pc(78) float local78 = (float) this.anInt4021 * -local28;
			@Pc(85) float local85 = -local34 * (float) this.anInt4023;
			arg3 = arg3 + local78 + local52;
			arg2 = arg2 + local71 + local46;
			arg0 = local46 + local58 + arg0;
			arg4 = local58 + arg4 + local85;
			arg1 = arg1 + local64 + local52;
			@Pc(122) float local122 = -local40 * (float) this.anInt4023;
			arg5 = local64 + arg5 + local122;
		}
		local10 = arg2 + arg4 - arg0;
		local14 = arg3 + arg5 - arg1;
		this.aClass13_Sub1_Sub1_3.method2745(true);
		this.aClass109_Sub1_28.method2589();
		this.aClass109_Sub1_28.method2578(this.aClass13_Sub1_Sub1_3);
		this.aClass109_Sub1_28.method2522(arg8);
		this.aClass109_Sub1_28.method2531(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass13_Sub1_Sub1_3.aFloat27);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass13_Sub1_Sub1_3.aFloat28, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass13_Sub1_Sub1_3.aFloat28, this.aClass13_Sub1_Sub1_3.aFloat27);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!lb", name = "ja", descriptor = "()I")
	@Override
	public int ja() {
		return this.aClass13_Sub1_Sub1_3.anInt1249 + this.anInt4014 + this.anInt4021;
	}
}
