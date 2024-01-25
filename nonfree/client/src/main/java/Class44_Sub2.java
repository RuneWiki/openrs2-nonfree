import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class44_Sub2 extends Class44 {

	@OriginalMember(owner = "client!ip", name = "A", descriptor = "Lclient!qd;")
	private Class24_Sub4_Sub1 aClass24_Sub4_Sub1_4;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
	private int anInt4075 = 0;

	@OriginalMember(owner = "client!ip", name = "n", descriptor = "I")
	private int anInt4084 = 0;

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
	private int anInt4079 = 0;

	@OriginalMember(owner = "client!ip", name = "k", descriptor = "Z")
	private boolean aBoolean336 = false;

	@OriginalMember(owner = "client!ip", name = "u", descriptor = "I")
	private int anInt4091 = 0;

	@OriginalMember(owner = "client!ip", name = "w", descriptor = "I")
	private int anInt4093 = 0;

	@OriginalMember(owner = "client!ip", name = "f", descriptor = "Lclient!rda;")
	private final Class126_Sub3 aClass126_Sub3_15;

	@OriginalMember(owner = "client!ip", name = "h", descriptor = "Lclient!qd;")
	private final Class24_Sub4_Sub1 aClass24_Sub4_Sub1_3;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!rda;IIZ)V")
	public Class44_Sub2(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass126_Sub3_15 = arg0;
		this.aClass24_Sub4_Sub1_3 = Static401.method7256(arg0, arg3 ? 6408 : 6407, arg2, arg1);
	}

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!rda;IIII)V")
	public Class44_Sub2(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass126_Sub3_15 = arg0;
		this.aClass24_Sub4_Sub1_3 = Static535.method7637(arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!rda;II[III)V")
	public Class44_Sub2(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass126_Sub3_15 = arg0;
		this.aClass24_Sub4_Sub1_3 = Static128.method1910(arg2, arg5, arg3, arg4, arg1, arg0);
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "()I")
	@Override
	public int method5320() {
		return this.aClass24_Sub4_Sub1_3.anInt7731;
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method5324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		@Pc(13) int local13 = arg3 + arg1;
		this.aClass24_Sub4_Sub1_3.method6783(false);
		this.aClass126_Sub3_15.method7088();
		this.aClass126_Sub3_15.method7113(this.aClass24_Sub4_Sub1_3);
		this.aClass126_Sub3_15.method7109(arg6);
		this.aClass126_Sub3_15.method7105(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass24_Sub4_Sub1_3.aBoolean636 && !this.aBoolean336) {
			@Pc(72) float local72 = this.aClass24_Sub4_Sub1_3.aFloat153 * (float) arg3 / (float) this.aClass24_Sub4_Sub1_3.anInt7731;
			@Pc(84) float local84 = this.aClass24_Sub4_Sub1_3.aFloat154 * (float) arg2 / (float) this.aClass24_Sub4_Sub1_3.anInt7730;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local72);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local13);
			OpenGL.glTexCoord2f(local84, 0.0F);
			OpenGL.glVertex2i(local9, local13);
			OpenGL.glTexCoord2f(local84, local72);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt4084, (float) this.anInt4075, 0.0F);
		@Pc(124) int local124 = this.method5313();
		@Pc(127) int local127 = this.method5325();
		@Pc(133) int local133 = arg1 + this.aClass24_Sub4_Sub1_3.anInt7731;
		OpenGL.glBegin(7);
		@Pc(137) int local137 = arg1;
		@Pc(145) int local145;
		while (local133 <= local13) {
			local145 = this.aClass24_Sub4_Sub1_3.anInt7730 + arg0;
			@Pc(147) int local147 = arg0;
			while (local145 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass24_Sub4_Sub1_3.aFloat153);
				OpenGL.glVertex2i(local147, local137);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local133);
				OpenGL.glTexCoord2f(this.aClass24_Sub4_Sub1_3.aFloat154, 0.0F);
				OpenGL.glVertex2i(local145, local133);
				OpenGL.glTexCoord2f(this.aClass24_Sub4_Sub1_3.aFloat154, this.aClass24_Sub4_Sub1_3.aFloat153);
				OpenGL.glVertex2i(local145, local137);
				local147 += local124;
				local145 += local124;
			}
			if (local147 < local9) {
				@Pc(217) float local217 = (float) (local9 - local147) * this.aClass24_Sub4_Sub1_3.aFloat154 / (float) this.aClass24_Sub4_Sub1_3.anInt7730;
				OpenGL.glTexCoord2f(0.0F, this.aClass24_Sub4_Sub1_3.aFloat153);
				OpenGL.glVertex2i(local147, local137);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local133);
				OpenGL.glTexCoord2f(local217, 0.0F);
				OpenGL.glVertex2i(local9, local133);
				OpenGL.glTexCoord2f(local217, this.aClass24_Sub4_Sub1_3.aFloat153);
				OpenGL.glVertex2i(local9, local137);
			}
			local137 += local127;
			local133 += local127;
		}
		if (local137 < local13) {
			@Pc(286) float local286 = this.aClass24_Sub4_Sub1_3.aFloat153 * (float) (this.aClass24_Sub4_Sub1_3.anInt7731 + local137 - local13) / (float) this.aClass24_Sub4_Sub1_3.anInt7731;
			@Pc(292) int local292 = this.aClass24_Sub4_Sub1_3.anInt7730 + arg0;
			local145 = arg0;
			while (local9 >= local292) {
				OpenGL.glTexCoord2f(0.0F, this.aClass24_Sub4_Sub1_3.aFloat153);
				OpenGL.glVertex2i(local145, local137);
				OpenGL.glTexCoord2f(0.0F, local286);
				OpenGL.glVertex2i(local145, local13);
				OpenGL.glTexCoord2f(this.aClass24_Sub4_Sub1_3.aFloat154, local286);
				OpenGL.glVertex2i(local292, local13);
				OpenGL.glTexCoord2f(this.aClass24_Sub4_Sub1_3.aFloat154, this.aClass24_Sub4_Sub1_3.aFloat153);
				OpenGL.glVertex2i(local292, local137);
				local145 += local124;
				local292 += local124;
			}
			if (local9 > local145) {
				@Pc(361) float local361 = this.aClass24_Sub4_Sub1_3.aFloat154 * (float) (local9 - local145) / (float) this.aClass24_Sub4_Sub1_3.anInt7730;
				OpenGL.glTexCoord2f(0.0F, this.aClass24_Sub4_Sub1_3.aFloat153);
				OpenGL.glVertex2i(local145, local137);
				OpenGL.glTexCoord2f(0.0F, local286);
				OpenGL.glVertex2i(local145, local13);
				OpenGL.glTexCoord2f(local361, local286);
				OpenGL.glVertex2i(local9, local13);
				OpenGL.glTexCoord2f(local361, this.aClass24_Sub4_Sub1_3.aFloat153);
				OpenGL.glVertex2i(local9, local137);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "()I")
	@Override
	public int method5319() {
		return this.aClass24_Sub4_Sub1_3.anInt7730;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method5327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass24_Sub4_Sub1_3.method6783(true);
		this.aClass126_Sub3_15.method7088();
		this.aClass126_Sub3_15.method7109(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean336) {
			@Pc(189) float local189 = (float) arg2 / (float) this.method5313();
			@Pc(196) float local196 = (float) arg3 / (float) this.method5325();
			@Pc(205) float local205 = (float) this.anInt4084 * local189 + (float) arg0;
			@Pc(214) float local214 = (float) arg1 + local196 * (float) this.anInt4075;
			@Pc(223) float local223 = local205 + local189 * (float) this.aClass24_Sub4_Sub1_3.anInt7730;
			@Pc(232) float local232 = local196 * (float) this.aClass24_Sub4_Sub1_3.anInt7731 + local214;
			if (this.aClass24_Sub4_Sub1_4 == null) {
				this.aClass126_Sub3_15.method7113(this.aClass24_Sub4_Sub1_3);
				this.aClass126_Sub3_15.method7105(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass24_Sub4_Sub1_3.aFloat153);
				OpenGL.glVertex2f(local205, local214);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local205, local232);
				OpenGL.glTexCoord2f(this.aClass24_Sub4_Sub1_3.aFloat154, 0.0F);
				OpenGL.glVertex2f(local223, local232);
				OpenGL.glTexCoord2f(this.aClass24_Sub4_Sub1_3.aFloat154, this.aClass24_Sub4_Sub1_3.aFloat153);
				OpenGL.glVertex2f(local223, local214);
				OpenGL.glEnd();
			} else {
				this.method3723(arg4);
				this.aClass24_Sub4_Sub1_4.method6783(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass24_Sub4_Sub1_3.aFloat153);
				OpenGL.glTexCoord2f(0.0F, this.aClass24_Sub4_Sub1_3.aFloat153);
				OpenGL.glVertex2f(local205, local214);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local205, local232);
				OpenGL.glMultiTexCoord2f(33985, this.aClass24_Sub4_Sub1_3.aFloat154, 0.0F);
				OpenGL.glTexCoord2f(this.aClass24_Sub4_Sub1_3.aFloat154, 0.0F);
				OpenGL.glVertex2f(local223, local232);
				OpenGL.glMultiTexCoord2f(33985, this.aClass24_Sub4_Sub1_3.aFloat154, this.aClass24_Sub4_Sub1_3.aFloat153);
				OpenGL.glTexCoord2f(this.aClass24_Sub4_Sub1_3.aFloat154, this.aClass24_Sub4_Sub1_3.aFloat153);
				OpenGL.glVertex2f(local223, local214);
				OpenGL.glEnd();
				this.method3721();
			}
		} else if (this.aClass24_Sub4_Sub1_4 == null) {
			this.aClass126_Sub3_15.method7113(this.aClass24_Sub4_Sub1_3);
			this.aClass126_Sub3_15.method7105(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass24_Sub4_Sub1_3.aFloat153);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass24_Sub4_Sub1_3.aFloat154, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass24_Sub4_Sub1_3.aFloat154, this.aClass24_Sub4_Sub1_3.aFloat153);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method3723(arg4);
			this.aClass24_Sub4_Sub1_4.method6783(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass24_Sub4_Sub1_3.aFloat153);
			OpenGL.glTexCoord2f(0.0F, this.aClass24_Sub4_Sub1_3.aFloat153);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass24_Sub4_Sub1_3.aFloat154, 0.0F);
			OpenGL.glTexCoord2f(this.aClass24_Sub4_Sub1_3.aFloat154, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass24_Sub4_Sub1_3.aFloat154, this.aClass24_Sub4_Sub1_3.aFloat153);
			OpenGL.glTexCoord2f(this.aClass24_Sub4_Sub1_3.aFloat154, this.aClass24_Sub4_Sub1_3.aFloat153);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method3721();
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!this.aClass126_Sub3_15.aBoolean672) {
			this.aClass24_Sub4_Sub1_3.method6790(arg5, arg2, arg3, arg1, arg4, arg0);
			return;
		}
		@Pc(28) int[] local28 = this.aClass126_Sub3_15.na(arg4, arg5, arg2, arg3);
		if (local28 != null) {
			for (@Pc(32) int local32 = 0; local32 < local28.length; local32++) {
				local28[local32] |= 0xFF000000;
			}
			this.method3722(arg0, arg1, arg2, arg3, local28, arg2);
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4091 = arg2;
		this.anInt4084 = arg0;
		this.anInt4075 = arg1;
		this.anInt4079 = arg3;
		this.aBoolean336 = this.anInt4084 != 0 || this.anInt4075 != 0 || this.anInt4091 != 0 || this.anInt4079 != 0;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method5311(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean336) {
			local10 = (float) this.method5313();
			local14 = (float) this.method5325();
			@Pc(21) float local21 = (arg2 - arg0) / local10;
			@Pc(28) float local28 = (arg3 - arg1) / local10;
			@Pc(35) float local35 = (arg4 - arg0) / local14;
			@Pc(42) float local42 = (arg5 - arg1) / local14;
			@Pc(48) float local48 = local35 * (float) this.anInt4075;
			@Pc(54) float local54 = (float) this.anInt4075 * local42;
			@Pc(60) float local60 = (float) this.anInt4084 * local21;
			@Pc(66) float local66 = (float) this.anInt4084 * local28;
			@Pc(73) float local73 = -local21 * (float) this.anInt4091;
			@Pc(80) float local80 = -local28 * (float) this.anInt4091;
			@Pc(87) float local87 = -local35 * (float) this.anInt4079;
			arg0 = arg0 + local60 + local48;
			arg4 = arg4 + local60 + local87;
			arg1 = local54 + arg1 + local66;
			arg2 = local48 + arg2 + local73;
			@Pc(118) float local118 = -local42 * (float) this.anInt4079;
			arg3 = local54 + local80 + arg3;
			arg5 = local118 + arg5 + local66;
		}
		local10 = arg2 + arg4 - arg0;
		this.aClass24_Sub4_Sub1_3.method6783(true);
		local14 = arg3 + arg5 - arg1;
		this.aClass126_Sub3_15.method7088();
		this.aClass126_Sub3_15.method7113(this.aClass24_Sub4_Sub1_3);
		this.aClass126_Sub3_15.method7109(1);
		this.aClass126_Sub3_15.method7105(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass24_Sub4_Sub1_3.aFloat153);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass24_Sub4_Sub1_3.aFloat154, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass24_Sub4_Sub1_3.aFloat154, this.aClass24_Sub4_Sub1_3.aFloat153);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
	private void method3721() {
		this.aClass126_Sub3_15.method7104(1);
		this.aClass126_Sub3_15.method7113((Class24) null);
		this.aClass126_Sub3_15.method7082(8448, 8448);
		this.aClass126_Sub3_15.method7135(768, 34168, 1);
		this.aClass126_Sub3_15.method7073(0, 5890);
		this.aClass126_Sub3_15.method7104(0);
		this.aClass126_Sub3_15.method7135(768, 34168, 1);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(III)V")
	@Override
	public void method5321(@OriginalArg(2) int arg0) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass24_Sub4_Sub1_4 = Static535.method7637(this.aClass126_Sub3_15, 0, this.aClass24_Sub4_Sub1_3.anInt7730, this.aClass24_Sub4_Sub1_3.anInt7731, 0);
		this.anInt4093 = arg0;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "()I")
	@Override
	public int method5313() {
		return this.anInt4091 + this.aClass24_Sub4_Sub1_3.anInt7730 + this.anInt4084;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method5318(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class24_Sub4_Sub1 local7 = ((Class1_Sub2) arg6).aClass24_Sub4_Sub1_2;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(31) float local31;
		if (this.aBoolean336) {
			local14 = (float) this.method5313();
			local18 = (float) this.method5325();
			local25 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(37) float local37 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = local37 * (float) this.anInt4075;
			@Pc(56) float local56 = local44 * (float) this.anInt4075;
			@Pc(62) float local62 = (float) this.anInt4084 * local25;
			@Pc(68) float local68 = (float) this.anInt4084 * local31;
			@Pc(75) float local75 = -local25 * (float) this.anInt4091;
			@Pc(82) float local82 = -local31 * (float) this.anInt4091;
			@Pc(89) float local89 = (float) this.anInt4079 * -local37;
			arg2 = local75 + arg2 + local50;
			arg4 = arg4 + local62 + local89;
			@Pc(108) float local108 = -local44 * (float) this.anInt4079;
			arg0 = arg0 + local62 + local50;
			arg1 = arg1 + local68 + local56;
			arg3 = local56 + local82 + arg3;
			arg5 = local68 + arg5 + local108;
		}
		local14 = arg2 + arg4 - arg0;
		this.aClass24_Sub4_Sub1_3.method6783(true);
		local18 = arg3 + arg5 - arg1;
		this.aClass126_Sub3_15.method7088();
		this.aClass126_Sub3_15.method7113(this.aClass24_Sub4_Sub1_3);
		this.aClass126_Sub3_15.method7105(1);
		this.aClass126_Sub3_15.method7104(1);
		this.aClass126_Sub3_15.method7113(local7);
		this.aClass126_Sub3_15.method7082(8448, 7681);
		this.aClass126_Sub3_15.method7135(768, 34168, 0);
		this.aClass126_Sub3_15.method7109(1);
		local25 = local7.aFloat154 / (float) local7.anInt7730;
		local31 = local7.aFloat153 / (float) local7.anInt7731;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass24_Sub4_Sub1_3.aFloat153);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg0 - (float) arg7), local7.aFloat153 - (arg1 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg4) * local25, local7.aFloat153 - (arg5 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass24_Sub4_Sub1_3.aFloat154, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + local14), local7.aFloat153 - ((float) -arg8 + local18) * local31);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass24_Sub4_Sub1_3.aFloat154, this.aClass24_Sub4_Sub1_3.aFloat153);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg2) * local25, local7.aFloat153 - local31 * (arg3 - (float) arg8));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass126_Sub3_15.method7135(768, 5890, 0);
		this.aClass126_Sub3_15.method7105(0);
		this.aClass126_Sub3_15.method7113((Class24) null);
		this.aClass126_Sub3_15.method7104(0);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIII[III)V")
	private void method3722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.aClass24_Sub4_Sub1_3.method6788(arg2, arg3, arg1, arg4, arg5, arg0);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IB)V")
	private void method3723(@OriginalArg(0) int arg0) {
		this.aClass126_Sub3_15.method7104(1);
		this.aClass126_Sub3_15.method7113(this.aClass24_Sub4_Sub1_3);
		this.aClass126_Sub3_15.method7082(7681, this.aClass126_Sub3_15.method7116(arg0));
		this.aClass126_Sub3_15.method7135(768, 34167, 1);
		this.aClass126_Sub3_15.method7073(0, 34168);
		this.aClass126_Sub3_15.method7104(0);
		this.aClass126_Sub3_15.method7113(this.aClass24_Sub4_Sub1_4);
		this.aClass126_Sub3_15.method7082(7681, 34479);
		this.aClass126_Sub3_15.method7135(768, 34166, 1);
		if (this.anInt4093 == 0) {
			this.aClass126_Sub3_15.method7134(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt4093 == 1) {
			this.aClass126_Sub3_15.method7134(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt4093 == 2) {
			this.aClass126_Sub3_15.method7134(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt4093 == 3) {
			this.aClass126_Sub3_15.method7134(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method5308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg2;
		@Pc(9) Class24_Sub4_Sub1 local9 = local6.aClass24_Sub4_Sub1_2;
		this.aClass24_Sub4_Sub1_3.method6783(false);
		this.aClass126_Sub3_15.method7088();
		this.aClass126_Sub3_15.method7113(this.aClass24_Sub4_Sub1_3);
		this.aClass126_Sub3_15.method7105(1);
		this.aClass126_Sub3_15.method7104(1);
		this.aClass126_Sub3_15.method7113(local9);
		this.aClass126_Sub3_15.method7082(8448, 7681);
		this.aClass126_Sub3_15.method7135(768, 34168, 0);
		this.aClass126_Sub3_15.method7109(1);
		@Pc(62) int local62 = arg1 + this.anInt4075;
		@Pc(67) int local67 = arg0 + this.anInt4084;
		@Pc(73) int local73 = this.aClass24_Sub4_Sub1_3.anInt7730 + local67;
		@Pc(79) int local79 = this.aClass24_Sub4_Sub1_3.anInt7731 + local62;
		@Pc(86) float local86 = local9.aFloat154 / (float) local9.anInt7730;
		@Pc(93) float local93 = local9.aFloat153 / (float) local9.anInt7731;
		@Pc(101) float local101 = (float) (local67 - arg3) * local86;
		@Pc(108) float local108 = local86 * (float) (local73 - arg3);
		@Pc(118) float local118 = local9.aFloat153 - local93 * (float) (local62 - arg4);
		@Pc(129) float local129 = local9.aFloat153 - local93 * (float) (local79 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass24_Sub4_Sub1_3.aFloat153);
		OpenGL.glMultiTexCoord2f(33985, local101, local118);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local129);
		OpenGL.glVertex2i(local67, this.aClass24_Sub4_Sub1_3.anInt7731 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass24_Sub4_Sub1_3.aFloat154, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local108, local129);
		OpenGL.glVertex2i(local67 + this.aClass24_Sub4_Sub1_3.anInt7730, this.aClass24_Sub4_Sub1_3.anInt7731 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass24_Sub4_Sub1_3.aFloat154, this.aClass24_Sub4_Sub1_3.aFloat153);
		OpenGL.glMultiTexCoord2f(33985, local108, local118);
		OpenGL.glVertex2i(this.aClass24_Sub4_Sub1_3.anInt7730 + local67, local62);
		OpenGL.glEnd();
		this.aClass126_Sub3_15.method7135(768, 5890, 0);
		this.aClass126_Sub3_15.method7105(0);
		this.aClass126_Sub3_15.method7113((Class24) null);
		this.aClass126_Sub3_15.method7104(0);
	}

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "()I")
	@Override
	public int method5325() {
		return this.aClass24_Sub4_Sub1_3.anInt7731 + this.anInt4075 + this.anInt4079;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "([I)V")
	@Override
	public void method5323(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt4079;
		arg0[0] = this.anInt4084;
		arg0[1] = this.anInt4075;
		arg0[2] = this.anInt4091;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method5322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass24_Sub4_Sub1_3.method6783(false);
		this.aClass126_Sub3_15.method7088();
		this.aClass126_Sub3_15.method7109(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt4075;
		@Pc(42) int local42 = arg0 + this.anInt4084;
		if (this.aClass24_Sub4_Sub1_4 == null) {
			this.aClass126_Sub3_15.method7113(this.aClass24_Sub4_Sub1_3);
			this.aClass126_Sub3_15.method7105(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass24_Sub4_Sub1_3.aFloat153);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, local37 + this.aClass24_Sub4_Sub1_3.anInt7731);
			OpenGL.glTexCoord2f(this.aClass24_Sub4_Sub1_3.aFloat154, 0.0F);
			OpenGL.glVertex2i(this.aClass24_Sub4_Sub1_3.anInt7730 + local42, local37 + this.aClass24_Sub4_Sub1_3.anInt7731);
			OpenGL.glTexCoord2f(this.aClass24_Sub4_Sub1_3.aFloat154, this.aClass24_Sub4_Sub1_3.aFloat153);
			OpenGL.glVertex2i(local42 + this.aClass24_Sub4_Sub1_3.anInt7730, local37);
			OpenGL.glEnd();
			return;
		}
		this.method3723(arg2);
		this.aClass24_Sub4_Sub1_4.method6783(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass24_Sub4_Sub1_3.aFloat153);
		OpenGL.glTexCoord2f(0.0F, this.aClass24_Sub4_Sub1_3.aFloat153);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, this.aClass24_Sub4_Sub1_3.anInt7731 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass24_Sub4_Sub1_3.aFloat154, 0.0F);
		OpenGL.glTexCoord2f(this.aClass24_Sub4_Sub1_3.aFloat154, 0.0F);
		OpenGL.glVertex2i(local42 + this.aClass24_Sub4_Sub1_3.anInt7730, this.aClass24_Sub4_Sub1_3.anInt7731 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass24_Sub4_Sub1_3.aFloat154, this.aClass24_Sub4_Sub1_3.aFloat153);
		OpenGL.glTexCoord2f(this.aClass24_Sub4_Sub1_3.aFloat154, this.aClass24_Sub4_Sub1_3.aFloat153);
		OpenGL.glVertex2i(local42 + this.aClass24_Sub4_Sub1_3.anInt7730, local37);
		OpenGL.glEnd();
		this.method3721();
	}
}
