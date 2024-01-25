import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "Lclient!dg;")
	private Class20_Sub1_Sub1 aClass20_Sub1_Sub1_3;

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
	private int anInt3418 = 0;

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
	private int anInt3419 = 0;

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
	private int anInt3422 = 0;

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
	private int anInt3420 = 0;

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
	private int anInt3421 = 0;

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "Z")
	private boolean aBoolean327 = false;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "Lclient!h;")
	private final Class32_Sub2 aClass32_Sub2_24;

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "Lclient!dg;")
	private final Class20_Sub1_Sub1 aClass20_Sub1_Sub1_2;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!h;IIII)V")
	public Class5_Sub2(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass32_Sub2_24 = arg0;
		this.aClass20_Sub1_Sub1_2 = Static362.method1390(arg4, arg2, arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!h;II[III)V")
	public Class5_Sub2(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass32_Sub2_24 = arg0;
		this.aClass20_Sub1_Sub1_2 = Static362.method1391(arg1, arg0, arg3, arg2);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
	private void method3143(@OriginalArg(0) int arg0) {
		this.aClass32_Sub2_24.method2314(1);
		this.aClass32_Sub2_24.method2287(this.aClass20_Sub1_Sub1_2);
		this.aClass32_Sub2_24.method2255(this.aClass32_Sub2_24.method2263(arg0), 7681);
		this.aClass32_Sub2_24.method2276(1, 34167, 768);
		this.aClass32_Sub2_24.method2265(0, 34168);
		this.aClass32_Sub2_24.method2314(0);
		this.aClass32_Sub2_24.method2287(this.aClass20_Sub1_Sub1_3);
		this.aClass32_Sub2_24.method2255(34479, 7681);
		this.aClass32_Sub2_24.method2276(1, 34166, 768);
		if (this.anInt3422 == 0) {
			this.aClass32_Sub2_24.method2308(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt3422 == 1) {
			this.aClass32_Sub2_24.method2308(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt3422 == 2) {
			this.aClass32_Sub2_24.method2308(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt3422 == 3) {
			this.aClass32_Sub2_24.method2308(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "()I")
	@Override
	public int method3629() {
		return this.aClass20_Sub1_Sub1_2.anInt1603;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(FFFFFFLclient!em;II)V")
	@Override
	protected void method3635(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class52 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class20_Sub1_Sub1 local3 = ((Class52_Sub2) arg6).aClass20_Sub1_Sub1_4;
		@Pc(10) float local10;
		@Pc(14) float local14;
		@Pc(26) float local26;
		@Pc(32) float local32;
		if (this.aBoolean327) {
			local10 = this.method3632();
			local14 = this.method3630();
			@Pc(20) float local20 = (arg2 - arg0) / local10;
			local26 = (arg3 - arg1) / local10;
			local32 = (arg4 - arg0) / local14;
			@Pc(38) float local38 = (arg5 - arg1) / local14;
			@Pc(44) float local44 = local32 * (float) this.anInt3420;
			@Pc(50) float local50 = local38 * (float) this.anInt3420;
			@Pc(56) float local56 = local20 * (float) this.anInt3418;
			@Pc(62) float local62 = local26 * (float) this.anInt3418;
			@Pc(69) float local69 = -local20 * (float) this.anInt3419;
			@Pc(76) float local76 = -local26 * (float) this.anInt3419;
			@Pc(83) float local83 = -local32 * (float) this.anInt3421;
			@Pc(90) float local90 = -local38 * (float) this.anInt3421;
			arg0 = arg0 + local56 + local44;
			arg1 = arg1 + local62 + local50;
			arg2 = arg2 + local69 + local44;
			arg3 = arg3 + local76 + local50;
			arg4 = arg4 + local56 + local83;
			arg5 = arg5 + local62 + local90;
		}
		local10 = arg4 + arg2 - arg0;
		local14 = arg3 + arg5 - arg1;
		@Pc(142) opengl local142 = this.aClass32_Sub2_24.anOpengl2;
		this.aClass20_Sub1_Sub1_2.method5512(true);
		this.aClass32_Sub2_24.method2293();
		this.aClass32_Sub2_24.method2287(this.aClass20_Sub1_Sub1_2);
		this.aClass32_Sub2_24.method2282(0);
		this.aClass32_Sub2_24.method2314(1);
		this.aClass32_Sub2_24.method2287(local3);
		this.aClass32_Sub2_24.method2255(7681, 8448);
		this.aClass32_Sub2_24.method2276(0, 34168, 768);
		this.aClass32_Sub2_24.method2291(1);
		local26 = local3.aFloat8 / (float) local3.anInt1603;
		local32 = local3.aFloat9 / (float) local3.anInt1602;
		local142.glBegin(7);
		local142.glColor3f(1.0F, 1.0F, 1.0F);
		local142.glMultiTexCoord2f(33984, 0.0F, this.aClass20_Sub1_Sub1_2.aFloat9);
		local142.glMultiTexCoord2f(33985, local26 * (arg0 - (float) arg7), local3.aFloat9 - local32 * (arg1 - (float) arg8));
		local142.glVertex2f(arg0, arg1);
		local142.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		local142.glMultiTexCoord2f(33985, local26 * (arg4 - (float) arg7), local3.aFloat9 - local32 * (arg5 - (float) arg8));
		local142.glVertex2f(arg4, arg5);
		local142.glMultiTexCoord2f(33984, this.aClass20_Sub1_Sub1_2.aFloat8, 0.0F);
		local142.glMultiTexCoord2f(33985, local26 * (local10 - (float) arg7), local3.aFloat9 - local32 * (local14 - (float) arg8));
		local142.glVertex2f(local10, local14);
		local142.glMultiTexCoord2f(33984, this.aClass20_Sub1_Sub1_2.aFloat8, this.aClass20_Sub1_Sub1_2.aFloat9);
		local142.glMultiTexCoord2f(33985, local26 * (arg2 - (float) arg7), local3.aFloat9 - local32 * (arg3 - (float) arg8));
		local142.glVertex2f(arg2, arg3);
		local142.glEnd();
		this.aClass32_Sub2_24.method2276(0, 5890, 768);
		this.aClass32_Sub2_24.method2282(1);
		this.aClass32_Sub2_24.method2287(null);
		this.aClass32_Sub2_24.method2314(0);
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(IIII)V")
	@Override
	public void method3636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3418 = arg0;
		this.anInt3420 = arg1;
		this.anInt3419 = arg2;
		this.anInt3421 = arg3;
		this.aBoolean327 = this.anInt3418 != 0 || this.anInt3420 != 0 || this.anInt3419 != 0 || this.anInt3421 != 0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected void method3638(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean327) {
			local6 = this.method3632();
			local10 = this.method3630();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(28) float local28 = (arg4 - arg0) / local10;
			@Pc(34) float local34 = (arg5 - arg1) / local10;
			@Pc(40) float local40 = local28 * (float) this.anInt3420;
			@Pc(46) float local46 = local34 * (float) this.anInt3420;
			@Pc(52) float local52 = local16 * (float) this.anInt3418;
			@Pc(58) float local58 = local22 * (float) this.anInt3418;
			@Pc(65) float local65 = -local16 * (float) this.anInt3419;
			@Pc(72) float local72 = -local22 * (float) this.anInt3419;
			@Pc(79) float local79 = -local28 * (float) this.anInt3421;
			@Pc(86) float local86 = -local34 * (float) this.anInt3421;
			arg0 = arg0 + local52 + local40;
			arg1 = arg1 + local58 + local46;
			arg2 = arg2 + local65 + local40;
			arg3 = arg3 + local72 + local46;
			arg4 = arg4 + local52 + local79;
			arg5 = arg5 + local58 + local86;
		}
		local6 = arg4 + arg2 - arg0;
		local10 = arg3 + arg5 - arg1;
		@Pc(138) opengl local138 = this.aClass32_Sub2_24.anOpengl2;
		this.aClass20_Sub1_Sub1_2.method5512(true);
		this.aClass32_Sub2_24.method2293();
		this.aClass32_Sub2_24.method2287(this.aClass20_Sub1_Sub1_2);
		this.aClass32_Sub2_24.method2291(1);
		this.aClass32_Sub2_24.method2282(arg6);
		local138.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		local138.glBegin(7);
		local138.glTexCoord2f(0.0F, this.aClass20_Sub1_Sub1_2.aFloat9);
		local138.glVertex2f(arg0, arg1);
		local138.glTexCoord2f(0.0F, 0.0F);
		local138.glVertex2f(arg4, arg5);
		local138.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat8, 0.0F);
		local138.glVertex2f(local6, local10);
		local138.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat8, this.aClass20_Sub1_Sub1_2.aFloat9);
		local138.glVertex2f(arg2, arg3);
		local138.glEnd();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IILclient!em;II)V")
	@Override
	public void method3620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class52 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class52_Sub2 local2 = (Class52_Sub2) arg2;
		@Pc(5) Class20_Sub1_Sub1 local5 = local2.aClass20_Sub1_Sub1_4;
		this.aClass20_Sub1_Sub1_2.method5512(false);
		this.aClass32_Sub2_24.method2293();
		this.aClass32_Sub2_24.method2287(this.aClass20_Sub1_Sub1_2);
		this.aClass32_Sub2_24.method2282(0);
		this.aClass32_Sub2_24.method2314(1);
		this.aClass32_Sub2_24.method2287(local5);
		this.aClass32_Sub2_24.method2255(7681, 8448);
		this.aClass32_Sub2_24.method2276(0, 34168, 768);
		this.aClass32_Sub2_24.method2291(1);
		@Pc(49) int local49 = arg0 + this.anInt3418;
		@Pc(54) int local54 = arg1 + this.anInt3420;
		@Pc(60) int local60 = local49 + this.aClass20_Sub1_Sub1_2.anInt1603;
		@Pc(66) int local66 = local54 + this.aClass20_Sub1_Sub1_2.anInt1602;
		@Pc(73) float local73 = local5.aFloat8 / (float) local5.anInt1603;
		@Pc(80) float local80 = local5.aFloat9 / (float) local5.anInt1602;
		@Pc(87) float local87 = (float) (local49 - arg3) * local73;
		@Pc(94) float local94 = (float) (local60 - arg3) * local73;
		@Pc(104) float local104 = local5.aFloat9 - (float) (local54 - arg4) * local80;
		@Pc(114) float local114 = local5.aFloat9 - (float) (local66 - arg4) * local80;
		@Pc(118) opengl local118 = this.aClass32_Sub2_24.anOpengl2;
		local118.glBegin(7);
		local118.glColor3f(1.0F, 1.0F, 1.0F);
		local118.glMultiTexCoord2f(33984, 0.0F, this.aClass20_Sub1_Sub1_2.aFloat9);
		local118.glMultiTexCoord2f(33985, local87, local104);
		local118.glVertex2i(local49, local54);
		local118.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		local118.glMultiTexCoord2f(33985, local87, local114);
		local118.glVertex2i(local49, local54 + this.aClass20_Sub1_Sub1_2.anInt1602);
		local118.glMultiTexCoord2f(33984, this.aClass20_Sub1_Sub1_2.aFloat8, 0.0F);
		local118.glMultiTexCoord2f(33985, local94, local114);
		local118.glVertex2i(local49 + this.aClass20_Sub1_Sub1_2.anInt1603, local54 + this.aClass20_Sub1_Sub1_2.anInt1602);
		local118.glMultiTexCoord2f(33984, this.aClass20_Sub1_Sub1_2.aFloat8, this.aClass20_Sub1_Sub1_2.aFloat9);
		local118.glMultiTexCoord2f(33985, local94, local104);
		local118.glVertex2i(local49 + this.aClass20_Sub1_Sub1_2.anInt1603, local54);
		local118.glEnd();
		this.aClass32_Sub2_24.method2276(0, 5890, 768);
		this.aClass32_Sub2_24.method2282(1);
		this.aClass32_Sub2_24.method2287(null);
		this.aClass32_Sub2_24.method2314(0);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method3625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) opengl local3 = this.aClass32_Sub2_24.anOpengl2;
		@Pc(7) int local7 = arg0 + arg2;
		@Pc(11) int local11 = arg1 + arg3;
		this.aClass20_Sub1_Sub1_2.method5512(false);
		this.aClass32_Sub2_24.method2293();
		this.aClass32_Sub2_24.method2287(this.aClass20_Sub1_Sub1_2);
		this.aClass32_Sub2_24.method2291(1);
		this.aClass32_Sub2_24.method2282(arg4);
		local3.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass20_Sub1_Sub1_2.aBoolean158 && !this.aBoolean327) {
			@Pc(66) float local66 = this.aClass20_Sub1_Sub1_2.aFloat9 * (float) arg3 / (float) this.aClass20_Sub1_Sub1_2.anInt1602;
			@Pc(78) float local78 = this.aClass20_Sub1_Sub1_2.aFloat8 * (float) arg2 / (float) this.aClass20_Sub1_Sub1_2.anInt1603;
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
		local3.glTranslatef((float) this.anInt3418, (float) this.anInt3420, 0.0F);
		@Pc(130) int local130 = this.method3632();
		@Pc(133) int local133 = this.method3630();
		@Pc(139) int local139 = arg1 + this.aClass20_Sub1_Sub1_2.anInt1602;
		local3.glBegin(7);
		@Pc(144) int local144 = arg1;
		@Pc(153) int local153;
		while (local139 <= local11) {
			local153 = arg0 + this.aClass20_Sub1_Sub1_2.anInt1603;
			@Pc(155) int local155 = arg0;
			while (local153 <= local7) {
				local3.glTexCoord2f(0.0F, this.aClass20_Sub1_Sub1_2.aFloat9);
				local3.glVertex2i(local155, local144);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2i(local155, local139);
				local3.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat8, 0.0F);
				local3.glVertex2i(local153, local139);
				local3.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat8, this.aClass20_Sub1_Sub1_2.aFloat9);
				local3.glVertex2i(local153, local144);
				local153 += local130;
				local155 += local130;
			}
			if (local155 < local7) {
				@Pc(224) float local224 = this.aClass20_Sub1_Sub1_2.aFloat8 * (float) (local7 - local155) / (float) this.aClass20_Sub1_Sub1_2.anInt1603;
				local3.glTexCoord2f(0.0F, this.aClass20_Sub1_Sub1_2.aFloat9);
				local3.glVertex2i(local155, local144);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2i(local155, local139);
				local3.glTexCoord2f(local224, 0.0F);
				local3.glVertex2i(local7, local139);
				local3.glTexCoord2f(local224, this.aClass20_Sub1_Sub1_2.aFloat9);
				local3.glVertex2i(local7, local144);
			}
			local144 += local133;
			local139 += local133;
		}
		if (local144 < local11) {
			@Pc(290) float local290 = this.aClass20_Sub1_Sub1_2.aFloat9 * (float) (this.aClass20_Sub1_Sub1_2.anInt1602 + local144 - local11) / (float) this.aClass20_Sub1_Sub1_2.anInt1602;
			@Pc(296) int local296 = arg0 + this.aClass20_Sub1_Sub1_2.anInt1603;
			local153 = arg0;
			while (local296 <= local7) {
				local3.glTexCoord2f(0.0F, this.aClass20_Sub1_Sub1_2.aFloat9);
				local3.glVertex2i(local153, local144);
				local3.glTexCoord2f(0.0F, local290);
				local3.glVertex2i(local153, local11);
				local3.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat8, local290);
				local3.glVertex2i(local296, local11);
				local3.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat8, this.aClass20_Sub1_Sub1_2.aFloat9);
				local3.glVertex2i(local296, local144);
				local296 += local130;
				local153 += local130;
			}
			if (local153 < local7) {
				@Pc(367) float local367 = this.aClass20_Sub1_Sub1_2.aFloat8 * (float) (local7 - local153) / (float) this.aClass20_Sub1_Sub1_2.anInt1603;
				local3.glTexCoord2f(0.0F, this.aClass20_Sub1_Sub1_2.aFloat9);
				local3.glVertex2i(local153, local144);
				local3.glTexCoord2f(0.0F, local290);
				local3.glVertex2i(local153, local11);
				local3.glTexCoord2f(local367, local290);
				local3.glVertex2i(local7, local11);
				local3.glTexCoord2f(local367, this.aClass20_Sub1_Sub1_2.aFloat9);
				local3.glVertex2i(local7, local144);
			}
		}
		local3.glEnd();
		local3.glPopMatrix();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) opengl local3 = this.aClass32_Sub2_24.anOpengl2;
		this.aClass20_Sub1_Sub1_2.method5512(false);
		this.aClass32_Sub2_24.method2293();
		this.aClass32_Sub2_24.method2291(1);
		local3.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) int local35 = arg0 + this.anInt3418;
		@Pc(40) int local40 = arg1 + this.anInt3420;
		if (this.aClass20_Sub1_Sub1_3 == null) {
			this.aClass32_Sub2_24.method2287(this.aClass20_Sub1_Sub1_2);
			this.aClass32_Sub2_24.method2282(arg2);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, this.aClass20_Sub1_Sub1_2.aFloat9);
			local3.glVertex2i(local35, local40);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(local35, local40 + this.aClass20_Sub1_Sub1_2.anInt1602);
			local3.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat8, 0.0F);
			local3.glVertex2i(local35 + this.aClass20_Sub1_Sub1_2.anInt1603, local40 + this.aClass20_Sub1_Sub1_2.anInt1602);
			local3.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat8, this.aClass20_Sub1_Sub1_2.aFloat9);
			local3.glVertex2i(local35 + this.aClass20_Sub1_Sub1_2.anInt1603, local40);
			local3.glEnd();
			return;
		}
		this.method3143(arg2);
		this.aClass20_Sub1_Sub1_3.method5512(false);
		local3.glBegin(7);
		local3.glMultiTexCoord2f(33985, 0.0F, this.aClass20_Sub1_Sub1_2.aFloat9);
		local3.glTexCoord2f(0.0F, this.aClass20_Sub1_Sub1_2.aFloat9);
		local3.glVertex2i(local35, local40);
		local3.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		local3.glTexCoord2f(0.0F, 0.0F);
		local3.glVertex2i(local35, local40 + this.aClass20_Sub1_Sub1_2.anInt1602);
		local3.glMultiTexCoord2f(33985, this.aClass20_Sub1_Sub1_2.aFloat8, 0.0F);
		local3.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat8, 0.0F);
		local3.glVertex2i(local35 + this.aClass20_Sub1_Sub1_2.anInt1603, local40 + this.aClass20_Sub1_Sub1_2.anInt1602);
		local3.glMultiTexCoord2f(33985, this.aClass20_Sub1_Sub1_2.aFloat8, this.aClass20_Sub1_Sub1_2.aFloat9);
		local3.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat8, this.aClass20_Sub1_Sub1_2.aFloat9);
		local3.glVertex2i(local35 + this.aClass20_Sub1_Sub1_2.anInt1603, local40);
		local3.glEnd();
		this.method3144();
	}

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "()I")
	@Override
	public int method3632() {
		return this.aClass20_Sub1_Sub1_2.anInt1603 + this.anInt3418 + this.anInt3419;
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "()I")
	@Override
	public int method3630() {
		return this.aClass20_Sub1_Sub1_2.anInt1602 + this.anInt3420 + this.anInt3421;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "()I")
	@Override
	public int method3623() {
		return this.aClass20_Sub1_Sub1_2.anInt1602;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method3626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass20_Sub1_Sub1_2.method1385(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "()V")
	private void method3144() {
		this.aClass32_Sub2_24.method2314(1);
		this.aClass32_Sub2_24.method2287(null);
		this.aClass32_Sub2_24.method2255(8448, 8448);
		this.aClass32_Sub2_24.method2276(1, 34168, 768);
		this.aClass32_Sub2_24.method2265(0, 5890);
		this.aClass32_Sub2_24.method2314(0);
		this.aClass32_Sub2_24.method2276(1, 34168, 768);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)V")
	@Override
	public void method3628(@OriginalArg(2) int arg0) {
		@Pc(3) opengl local3 = this.aClass32_Sub2_24.anOpengl2;
		local3.glPixelTransferf(3348, 0.5F);
		local3.glPixelTransferf(3349, 0.499F);
		local3.glPixelTransferf(3352, 0.5F);
		local3.glPixelTransferf(3353, 0.499F);
		local3.glPixelTransferf(3354, 0.5F);
		local3.glPixelTransferf(3355, 0.499F);
		this.aClass20_Sub1_Sub1_3 = Static362.method1390(this.aClass20_Sub1_Sub1_2.anInt1602, 0, this.aClass32_Sub2_24, this.aClass20_Sub1_Sub1_2.anInt1603, 0);
		this.anInt3422 = arg0;
		local3.glPixelTransferf(3348, 1.0F);
		local3.glPixelTransferf(3349, 0.0F);
		local3.glPixelTransferf(3352, 1.0F);
		local3.glPixelTransferf(3353, 0.0F);
		local3.glPixelTransferf(3354, 1.0F);
		local3.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method3634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) opengl local3 = this.aClass32_Sub2_24.anOpengl2;
		this.aClass20_Sub1_Sub1_2.method5512(true);
		this.aClass32_Sub2_24.method2293();
		this.aClass32_Sub2_24.method2291(arg6);
		local3.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean327) {
			@Pc(40) float local40 = (float) arg2 / (float) this.method3632();
			@Pc(47) float local47 = (float) arg3 / (float) this.method3630();
			@Pc(56) float local56 = (float) arg0 + (float) this.anInt3418 * local40;
			@Pc(65) float local65 = (float) arg1 + (float) this.anInt3420 * local47;
			@Pc(74) float local74 = local56 + (float) this.aClass20_Sub1_Sub1_2.anInt1603 * local40;
			@Pc(83) float local83 = local65 + (float) this.aClass20_Sub1_Sub1_2.anInt1602 * local47;
			if (this.aClass20_Sub1_Sub1_3 == null) {
				this.aClass32_Sub2_24.method2287(this.aClass20_Sub1_Sub1_2);
				this.aClass32_Sub2_24.method2282(arg4);
				local3.glBegin(7);
				local3.glTexCoord2f(0.0F, this.aClass20_Sub1_Sub1_2.aFloat9);
				local3.glVertex2f(local56, local65);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2f(local56, local83);
				local3.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat8, 0.0F);
				local3.glVertex2f(local74, local83);
				local3.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat8, this.aClass20_Sub1_Sub1_2.aFloat9);
				local3.glVertex2f(local74, local65);
				local3.glEnd();
			} else {
				this.method3143(arg4);
				this.aClass20_Sub1_Sub1_3.method5512(true);
				local3.glBegin(7);
				local3.glMultiTexCoord2f(33985, 0.0F, this.aClass20_Sub1_Sub1_2.aFloat9);
				local3.glTexCoord2f(0.0F, this.aClass20_Sub1_Sub1_2.aFloat9);
				local3.glVertex2f(local56, local65);
				local3.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2f(local56, local83);
				local3.glMultiTexCoord2f(33985, this.aClass20_Sub1_Sub1_2.aFloat8, 0.0F);
				local3.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat8, 0.0F);
				local3.glVertex2f(local74, local83);
				local3.glMultiTexCoord2f(33985, this.aClass20_Sub1_Sub1_2.aFloat8, this.aClass20_Sub1_Sub1_2.aFloat9);
				local3.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat8, this.aClass20_Sub1_Sub1_2.aFloat9);
				local3.glVertex2f(local74, local65);
				local3.glEnd();
				this.method3144();
			}
		} else if (this.aClass20_Sub1_Sub1_3 == null) {
			this.aClass32_Sub2_24.method2287(this.aClass20_Sub1_Sub1_2);
			this.aClass32_Sub2_24.method2282(arg4);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, this.aClass20_Sub1_Sub1_2.aFloat9);
			local3.glVertex2i(arg0, arg1);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(arg0, arg1 + arg3);
			local3.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat8, 0.0F);
			local3.glVertex2i(arg0 + arg2, arg1 + arg3);
			local3.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat8, this.aClass20_Sub1_Sub1_2.aFloat9);
			local3.glVertex2i(arg0 + arg2, arg1);
			local3.glEnd();
		} else {
			this.method3143(arg4);
			this.aClass20_Sub1_Sub1_3.method5512(true);
			local3.glBegin(7);
			local3.glMultiTexCoord2f(33985, 0.0F, this.aClass20_Sub1_Sub1_2.aFloat9);
			local3.glTexCoord2f(0.0F, this.aClass20_Sub1_Sub1_2.aFloat9);
			local3.glVertex2i(arg0, arg1);
			local3.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(arg0, arg1 + arg3);
			local3.glMultiTexCoord2f(33985, this.aClass20_Sub1_Sub1_2.aFloat8, 0.0F);
			local3.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat8, 0.0F);
			local3.glVertex2i(arg0 + arg2, arg1 + arg3);
			local3.glMultiTexCoord2f(33985, this.aClass20_Sub1_Sub1_2.aFloat8, this.aClass20_Sub1_Sub1_2.aFloat9);
			local3.glTexCoord2f(this.aClass20_Sub1_Sub1_2.aFloat8, this.aClass20_Sub1_Sub1_2.aFloat9);
			local3.glVertex2i(arg0 + arg2, arg1);
			local3.glEnd();
			this.method3144();
		}
	}
}
