import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class60_Sub2 extends Class60 {

	@OriginalMember(owner = "client!po", name = "h", descriptor = "Lclient!gn;")
	private Class70_Sub4_Sub1 aClass70_Sub4_Sub1_3;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "Z")
	private boolean aBoolean437 = false;

	@OriginalMember(owner = "client!po", name = "d", descriptor = "I")
	private int anInt5184 = 0;

	@OriginalMember(owner = "client!po", name = "c", descriptor = "I")
	private int anInt5183 = 0;

	@OriginalMember(owner = "client!po", name = "f", descriptor = "I")
	private int anInt5186 = 0;

	@OriginalMember(owner = "client!po", name = "g", descriptor = "I")
	private int anInt5187 = 0;

	@OriginalMember(owner = "client!po", name = "e", descriptor = "I")
	private int anInt5185 = 0;

	@OriginalMember(owner = "client!po", name = "i", descriptor = "Lclient!ql;")
	private final Class92_Sub2 aClass92_Sub2_29;

	@OriginalMember(owner = "client!po", name = "b", descriptor = "Lclient!gn;")
	private final Class70_Sub4_Sub1 aClass70_Sub4_Sub1_2;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!ql;IIII)V")
	public Class60_Sub2(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass92_Sub2_29 = arg0;
		this.aClass70_Sub4_Sub1_2 = Static360.method1997(arg0, arg1, arg4, arg3, arg2);
	}

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!ql;II[III)V")
	public Class60_Sub2(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass92_Sub2_29 = arg0;
		this.aClass70_Sub4_Sub1_2 = Static360.method1995(arg0, arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(III)V")
	@Override
	public void method5693(@OriginalArg(2) int arg0) {
		@Pc(3) opengl local3 = this.aClass92_Sub2_29.anOpengl2;
		local3.glPixelTransferf(3348, 0.5F);
		local3.glPixelTransferf(3349, 0.499F);
		local3.glPixelTransferf(3352, 0.5F);
		local3.glPixelTransferf(3353, 0.499F);
		local3.glPixelTransferf(3354, 0.5F);
		local3.glPixelTransferf(3355, 0.499F);
		this.aClass70_Sub4_Sub1_3 = Static360.method1997(this.aClass92_Sub2_29, 0, this.aClass70_Sub4_Sub1_2.anInt2356, this.aClass70_Sub4_Sub1_2.anInt2357, 0);
		this.anInt5183 = arg0;
		local3.glPixelTransferf(3348, 1.0F);
		local3.glPixelTransferf(3349, 0.0F);
		local3.glPixelTransferf(3352, 1.0F);
		local3.glPixelTransferf(3353, 0.0F);
		local3.glPixelTransferf(3354, 1.0F);
		local3.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method5682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) opengl local3 = this.aClass92_Sub2_29.anOpengl2;
		this.aClass92_Sub2_29.method4619();
		this.aClass92_Sub2_29.method4560(1);
		local3.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(31) int local31 = arg0 + this.anInt5184;
		@Pc(36) int local36 = arg1 + this.anInt5185;
		if (this.aClass70_Sub4_Sub1_3 == null) {
			this.aClass92_Sub2_29.method4548(this.aClass70_Sub4_Sub1_2);
			this.aClass92_Sub2_29.method4570(arg2);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, this.aClass70_Sub4_Sub1_2.aFloat23);
			local3.glVertex2i(local31, local36);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(local31, local36 + this.aClass70_Sub4_Sub1_2.anInt2356);
			local3.glTexCoord2f(this.aClass70_Sub4_Sub1_2.aFloat24, 0.0F);
			local3.glVertex2i(local31 + this.aClass70_Sub4_Sub1_2.anInt2357, local36 + this.aClass70_Sub4_Sub1_2.anInt2356);
			local3.glTexCoord2f(this.aClass70_Sub4_Sub1_2.aFloat24, this.aClass70_Sub4_Sub1_2.aFloat23);
			local3.glVertex2i(local31 + this.aClass70_Sub4_Sub1_2.anInt2357, local36);
			local3.glEnd();
			return;
		}
		this.method4297(arg2);
		local3.glBegin(7);
		local3.glMultiTexCoord2f(33985, 0.0F, this.aClass70_Sub4_Sub1_2.aFloat23);
		local3.glTexCoord2f(0.0F, this.aClass70_Sub4_Sub1_2.aFloat23);
		local3.glVertex2i(local31, local36);
		local3.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		local3.glTexCoord2f(0.0F, 0.0F);
		local3.glVertex2i(local31, local36 + this.aClass70_Sub4_Sub1_2.anInt2356);
		local3.glMultiTexCoord2f(33985, this.aClass70_Sub4_Sub1_2.aFloat24, 0.0F);
		local3.glTexCoord2f(this.aClass70_Sub4_Sub1_2.aFloat24, 0.0F);
		local3.glVertex2i(local31 + this.aClass70_Sub4_Sub1_2.anInt2357, local36 + this.aClass70_Sub4_Sub1_2.anInt2356);
		local3.glMultiTexCoord2f(33985, this.aClass70_Sub4_Sub1_2.aFloat24, this.aClass70_Sub4_Sub1_2.aFloat23);
		local3.glTexCoord2f(this.aClass70_Sub4_Sub1_2.aFloat24, this.aClass70_Sub4_Sub1_2.aFloat23);
		local3.glVertex2i(local31 + this.aClass70_Sub4_Sub1_2.anInt2357, local36);
		local3.glEnd();
		this.method4298();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) opengl local3 = this.aClass92_Sub2_29.anOpengl2;
		@Pc(7) int local7 = arg0 + arg2;
		@Pc(11) int local11 = arg1 + arg3;
		this.aClass92_Sub2_29.method4619();
		this.aClass92_Sub2_29.method4548(this.aClass70_Sub4_Sub1_2);
		this.aClass92_Sub2_29.method4560(1);
		this.aClass92_Sub2_29.method4570(arg4);
		local3.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass70_Sub4_Sub1_2.aBoolean202 && !this.aBoolean437) {
			@Pc(62) float local62 = this.aClass70_Sub4_Sub1_2.aFloat23 * (float) arg3 / (float) this.aClass70_Sub4_Sub1_2.anInt2356;
			@Pc(74) float local74 = this.aClass70_Sub4_Sub1_2.aFloat24 * (float) arg2 / (float) this.aClass70_Sub4_Sub1_2.anInt2357;
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, local62);
			local3.glVertex2i(arg0, arg1);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(arg0, local11);
			local3.glTexCoord2f(local74, 0.0F);
			local3.glVertex2i(local7, local11);
			local3.glTexCoord2f(local74, local62);
			local3.glVertex2i(local7, arg1);
			local3.glEnd();
			return;
		}
		local3.glPushMatrix();
		local3.glTranslatef((float) this.anInt5184, (float) this.anInt5185, 0.0F);
		@Pc(126) int local126 = this.method5683();
		@Pc(129) int local129 = this.method5691();
		@Pc(135) int local135 = arg1 + this.aClass70_Sub4_Sub1_2.anInt2356;
		local3.glBegin(7);
		@Pc(140) int local140 = arg1;
		@Pc(149) int local149;
		while (local135 <= local11) {
			local149 = arg0 + this.aClass70_Sub4_Sub1_2.anInt2357;
			@Pc(151) int local151 = arg0;
			while (local149 <= local7) {
				local3.glTexCoord2f(0.0F, this.aClass70_Sub4_Sub1_2.aFloat23);
				local3.glVertex2i(local151, local140);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2i(local151, local135);
				local3.glTexCoord2f(this.aClass70_Sub4_Sub1_2.aFloat24, 0.0F);
				local3.glVertex2i(local149, local135);
				local3.glTexCoord2f(this.aClass70_Sub4_Sub1_2.aFloat24, this.aClass70_Sub4_Sub1_2.aFloat23);
				local3.glVertex2i(local149, local140);
				local149 += local126;
				local151 += local126;
			}
			if (local151 < local7) {
				@Pc(220) float local220 = this.aClass70_Sub4_Sub1_2.aFloat24 * (float) (local7 - local151) / (float) this.aClass70_Sub4_Sub1_2.anInt2357;
				local3.glTexCoord2f(0.0F, this.aClass70_Sub4_Sub1_2.aFloat23);
				local3.glVertex2i(local151, local140);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2i(local151, local135);
				local3.glTexCoord2f(local220, 0.0F);
				local3.glVertex2i(local7, local135);
				local3.glTexCoord2f(local220, this.aClass70_Sub4_Sub1_2.aFloat23);
				local3.glVertex2i(local7, local140);
			}
			local140 += local129;
			local135 += local129;
		}
		if (local140 < local11) {
			@Pc(286) float local286 = this.aClass70_Sub4_Sub1_2.aFloat23 * (float) (this.aClass70_Sub4_Sub1_2.anInt2353 + local140 - local11) / (float) this.aClass70_Sub4_Sub1_2.anInt2356;
			@Pc(292) int local292 = arg0 + this.aClass70_Sub4_Sub1_2.anInt2357;
			local149 = arg0;
			while (local292 <= local7) {
				local3.glTexCoord2f(0.0F, this.aClass70_Sub4_Sub1_2.aFloat23);
				local3.glVertex2i(local149, local140);
				local3.glTexCoord2f(0.0F, local286);
				local3.glVertex2i(local149, local11);
				local3.glTexCoord2f(this.aClass70_Sub4_Sub1_2.aFloat24, local286);
				local3.glVertex2i(local292, local11);
				local3.glTexCoord2f(this.aClass70_Sub4_Sub1_2.aFloat24, this.aClass70_Sub4_Sub1_2.aFloat23);
				local3.glVertex2i(local292, local140);
				local292 += local126;
				local149 += local126;
			}
			if (local149 < local7) {
				@Pc(363) float local363 = this.aClass70_Sub4_Sub1_2.aFloat24 * (float) (local7 - local149) / (float) this.aClass70_Sub4_Sub1_2.anInt2357;
				local3.glTexCoord2f(0.0F, this.aClass70_Sub4_Sub1_2.aFloat23);
				local3.glVertex2i(local149, local140);
				local3.glTexCoord2f(0.0F, local286);
				local3.glVertex2i(local149, local11);
				local3.glTexCoord2f(local363, local286);
				local3.glVertex2i(local7, local11);
				local3.glTexCoord2f(local363, this.aClass70_Sub4_Sub1_2.aFloat23);
				local3.glVertex2i(local7, local140);
			}
		}
		local3.glEnd();
		local3.glPopMatrix();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(FFFFFFLclient!go;II)V")
	@Override
	protected void method5678(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class84 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class70_Sub4_Sub1 local3 = ((Class84_Sub2) arg6).aClass70_Sub4_Sub1_5;
		@Pc(10) float local10;
		@Pc(14) float local14;
		@Pc(26) float local26;
		@Pc(32) float local32;
		if (this.aBoolean437) {
			local10 = this.method5683();
			local14 = this.method5691();
			@Pc(20) float local20 = (arg2 - arg0) / local10;
			local26 = (arg3 - arg1) / local10;
			local32 = (arg4 - arg0) / local14;
			@Pc(38) float local38 = (arg5 - arg1) / local14;
			@Pc(44) float local44 = local32 * (float) this.anInt5185;
			@Pc(50) float local50 = local38 * (float) this.anInt5185;
			@Pc(56) float local56 = local20 * (float) this.anInt5184;
			@Pc(62) float local62 = local26 * (float) this.anInt5184;
			@Pc(69) float local69 = -local20 * (float) this.anInt5187;
			@Pc(76) float local76 = -local26 * (float) this.anInt5187;
			@Pc(83) float local83 = -local32 * (float) this.anInt5186;
			@Pc(90) float local90 = -local38 * (float) this.anInt5186;
			arg0 = arg0 + local56 + local44;
			arg1 = arg1 + local62 + local50;
			arg2 = arg2 + local69 + local44;
			arg3 = arg3 + local76 + local50;
			arg4 = arg4 + local56 + local83;
			arg5 = arg5 + local62 + local90;
		}
		local10 = arg4 + arg2 - arg0;
		local14 = arg3 + arg5 - arg1;
		@Pc(142) opengl local142 = this.aClass92_Sub2_29.anOpengl2;
		this.aClass92_Sub2_29.method4619();
		this.aClass92_Sub2_29.method4548(this.aClass70_Sub4_Sub1_2);
		this.aClass92_Sub2_29.method4570(0);
		this.aClass92_Sub2_29.method4568(1);
		this.aClass92_Sub2_29.method4548(local3);
		this.aClass92_Sub2_29.method4569(7681, 8448);
		this.aClass92_Sub2_29.method4578(0, 34168, 768);
		this.aClass92_Sub2_29.method4560(1);
		local26 = local3.aFloat24 / (float) local3.anInt2357;
		local32 = local3.aFloat23 / (float) local3.anInt2356;
		local142.glBegin(7);
		local142.glColor3f(1.0F, 1.0F, 1.0F);
		local142.glMultiTexCoord2f(33984, 0.0F, this.aClass70_Sub4_Sub1_2.aFloat23);
		local142.glMultiTexCoord2f(33985, local26 * (arg0 - (float) arg7), local3.aFloat23 - local32 * (arg1 - (float) arg8));
		local142.glVertex2f(arg0, arg1);
		local142.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		local142.glMultiTexCoord2f(33985, local26 * (arg4 - (float) arg7), local3.aFloat23 - local32 * (arg5 - (float) arg8));
		local142.glVertex2f(arg4, arg5);
		local142.glMultiTexCoord2f(33984, this.aClass70_Sub4_Sub1_2.aFloat24, 0.0F);
		local142.glMultiTexCoord2f(33985, local26 * (local10 - (float) arg7), local3.aFloat23 - local32 * (local14 - (float) arg8));
		local142.glVertex2f(local10, local14);
		local142.glMultiTexCoord2f(33984, this.aClass70_Sub4_Sub1_2.aFloat24, this.aClass70_Sub4_Sub1_2.aFloat23);
		local142.glMultiTexCoord2f(33985, local26 * (arg2 - (float) arg7), local3.aFloat23 - local32 * (arg3 - (float) arg8));
		local142.glVertex2f(arg2, arg3);
		local142.glEnd();
		this.aClass92_Sub2_29.method4578(0, 5890, 768);
		this.aClass92_Sub2_29.method4570(1);
		this.aClass92_Sub2_29.method4548(null);
		this.aClass92_Sub2_29.method4568(0);
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5184 = arg0;
		this.anInt5185 = arg1;
		this.anInt5187 = arg2;
		this.anInt5186 = arg3;
		this.aBoolean437 = this.anInt5184 != 0 || this.anInt5185 != 0 || this.anInt5187 != 0 || this.anInt5186 != 0;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass70_Sub4_Sub1_2.method1994(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
	private void method4297(@OriginalArg(0) int arg0) {
		this.aClass92_Sub2_29.method4568(1);
		this.aClass92_Sub2_29.method4548(this.aClass70_Sub4_Sub1_2);
		this.aClass92_Sub2_29.method4569(this.aClass92_Sub2_29.method4579(arg0), 7681);
		this.aClass92_Sub2_29.method4578(1, 34167, 768);
		this.aClass92_Sub2_29.method4556(0, 34168);
		this.aClass92_Sub2_29.method4568(0);
		this.aClass92_Sub2_29.method4548(this.aClass70_Sub4_Sub1_3);
		this.aClass92_Sub2_29.method4569(34479, 7681);
		this.aClass92_Sub2_29.method4578(1, 34166, 768);
		if (this.anInt5183 == 0) {
			this.aClass92_Sub2_29.method4572(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt5183 == 1) {
			this.aClass92_Sub2_29.method4572(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt5183 == 2) {
			this.aClass92_Sub2_29.method4572(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt5183 == 3) {
			this.aClass92_Sub2_29.method4572(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "()I")
	@Override
	public int method5683() {
		return this.aClass70_Sub4_Sub1_2.anInt2357 + this.anInt5184 + this.anInt5187;
	}

	@OriginalMember(owner = "client!po", name = "e", descriptor = "()V")
	private void method4298() {
		this.aClass92_Sub2_29.method4568(1);
		this.aClass92_Sub2_29.method4548(null);
		this.aClass92_Sub2_29.method4569(8448, 8448);
		this.aClass92_Sub2_29.method4578(1, 34168, 768);
		this.aClass92_Sub2_29.method4556(0, 5890);
		this.aClass92_Sub2_29.method4568(0);
		this.aClass92_Sub2_29.method4578(1, 34168, 768);
	}

	@OriginalMember(owner = "client!po", name = "d", descriptor = "()I")
	@Override
	public int method5691() {
		return this.aClass70_Sub4_Sub1_2.anInt2356 + this.anInt5185 + this.anInt5186;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected void method5680(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean437) {
			local6 = this.method5683();
			local10 = this.method5691();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(28) float local28 = (arg4 - arg0) / local10;
			@Pc(34) float local34 = (arg5 - arg1) / local10;
			@Pc(40) float local40 = local28 * (float) this.anInt5185;
			@Pc(46) float local46 = local34 * (float) this.anInt5185;
			@Pc(52) float local52 = local16 * (float) this.anInt5184;
			@Pc(58) float local58 = local22 * (float) this.anInt5184;
			@Pc(65) float local65 = -local16 * (float) this.anInt5187;
			@Pc(72) float local72 = -local22 * (float) this.anInt5187;
			@Pc(79) float local79 = -local28 * (float) this.anInt5186;
			@Pc(86) float local86 = -local34 * (float) this.anInt5186;
			arg0 = arg0 + local52 + local40;
			arg1 = arg1 + local58 + local46;
			arg2 = arg2 + local65 + local40;
			arg3 = arg3 + local72 + local46;
			arg4 = arg4 + local52 + local79;
			arg5 = arg5 + local58 + local86;
		}
		local6 = arg4 + arg2 - arg0;
		local10 = arg3 + arg5 - arg1;
		@Pc(138) opengl local138 = this.aClass92_Sub2_29.anOpengl2;
		this.aClass92_Sub2_29.method4619();
		this.aClass92_Sub2_29.method4548(this.aClass70_Sub4_Sub1_2);
		this.aClass92_Sub2_29.method4560(1);
		this.aClass92_Sub2_29.method4570(arg6);
		local138.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		local138.glBegin(7);
		local138.glTexCoord2f(0.0F, this.aClass70_Sub4_Sub1_2.aFloat23);
		local138.glVertex2f(arg0, arg1);
		local138.glTexCoord2f(0.0F, 0.0F);
		local138.glVertex2f(arg4, arg5);
		local138.glTexCoord2f(this.aClass70_Sub4_Sub1_2.aFloat24, 0.0F);
		local138.glVertex2f(local6, local10);
		local138.glTexCoord2f(this.aClass70_Sub4_Sub1_2.aFloat24, this.aClass70_Sub4_Sub1_2.aFloat23);
		local138.glVertex2f(arg2, arg3);
		local138.glEnd();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "()I")
	@Override
	public int method5679() {
		return this.aClass70_Sub4_Sub1_2.anInt2357;
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "()I")
	@Override
	public int method5687() {
		return this.aClass70_Sub4_Sub1_2.anInt2356;
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method5692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) opengl local3 = this.aClass92_Sub2_29.anOpengl2;
		this.aClass92_Sub2_29.method4619();
		this.aClass92_Sub2_29.method4560(arg6);
		local3.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean437) {
			@Pc(36) float local36 = (float) arg2 / (float) this.method5683();
			@Pc(43) float local43 = (float) arg3 / (float) this.method5691();
			@Pc(52) float local52 = (float) arg0 + (float) this.anInt5184 * local36;
			@Pc(61) float local61 = (float) arg1 + (float) this.anInt5185 * local43;
			@Pc(70) float local70 = local52 + (float) this.aClass70_Sub4_Sub1_2.anInt2357 * local36;
			@Pc(79) float local79 = local61 + (float) this.aClass70_Sub4_Sub1_2.anInt2356 * local43;
			if (this.aClass70_Sub4_Sub1_3 == null) {
				this.aClass92_Sub2_29.method4548(this.aClass70_Sub4_Sub1_2);
				this.aClass92_Sub2_29.method4570(arg4);
				local3.glBegin(7);
				local3.glTexCoord2f(0.0F, this.aClass70_Sub4_Sub1_2.aFloat23);
				local3.glVertex2f(local52, local61);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2f(local52, local79);
				local3.glTexCoord2f(this.aClass70_Sub4_Sub1_2.aFloat24, 0.0F);
				local3.glVertex2f(local70, local79);
				local3.glTexCoord2f(this.aClass70_Sub4_Sub1_2.aFloat24, this.aClass70_Sub4_Sub1_2.aFloat23);
				local3.glVertex2f(local70, local61);
				local3.glEnd();
			} else {
				this.method4297(arg4);
				local3.glBegin(7);
				local3.glMultiTexCoord2f(33985, 0.0F, this.aClass70_Sub4_Sub1_2.aFloat23);
				local3.glTexCoord2f(0.0F, this.aClass70_Sub4_Sub1_2.aFloat23);
				local3.glVertex2f(local52, local61);
				local3.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2f(local52, local79);
				local3.glMultiTexCoord2f(33985, this.aClass70_Sub4_Sub1_2.aFloat24, 0.0F);
				local3.glTexCoord2f(this.aClass70_Sub4_Sub1_2.aFloat24, 0.0F);
				local3.glVertex2f(local70, local79);
				local3.glMultiTexCoord2f(33985, this.aClass70_Sub4_Sub1_2.aFloat24, this.aClass70_Sub4_Sub1_2.aFloat23);
				local3.glTexCoord2f(this.aClass70_Sub4_Sub1_2.aFloat24, this.aClass70_Sub4_Sub1_2.aFloat23);
				local3.glVertex2f(local70, local61);
				local3.glEnd();
				this.method4298();
			}
		} else if (this.aClass70_Sub4_Sub1_3 == null) {
			this.aClass92_Sub2_29.method4548(this.aClass70_Sub4_Sub1_2);
			this.aClass92_Sub2_29.method4570(arg4);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, this.aClass70_Sub4_Sub1_2.aFloat23);
			local3.glVertex2i(arg0, arg1);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(arg0, arg1 + arg3);
			local3.glTexCoord2f(this.aClass70_Sub4_Sub1_2.aFloat24, 0.0F);
			local3.glVertex2i(arg0 + arg2, arg1 + arg3);
			local3.glTexCoord2f(this.aClass70_Sub4_Sub1_2.aFloat24, this.aClass70_Sub4_Sub1_2.aFloat23);
			local3.glVertex2i(arg0 + arg2, arg1);
			local3.glEnd();
		} else {
			this.method4297(arg4);
			local3.glBegin(7);
			local3.glMultiTexCoord2f(33985, 0.0F, this.aClass70_Sub4_Sub1_2.aFloat23);
			local3.glTexCoord2f(0.0F, this.aClass70_Sub4_Sub1_2.aFloat23);
			local3.glVertex2i(arg0, arg1);
			local3.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(arg0, arg1 + arg3);
			local3.glMultiTexCoord2f(33985, this.aClass70_Sub4_Sub1_2.aFloat24, 0.0F);
			local3.glTexCoord2f(this.aClass70_Sub4_Sub1_2.aFloat24, 0.0F);
			local3.glVertex2i(arg0 + arg2, arg1 + arg3);
			local3.glMultiTexCoord2f(33985, this.aClass70_Sub4_Sub1_2.aFloat24, this.aClass70_Sub4_Sub1_2.aFloat23);
			local3.glTexCoord2f(this.aClass70_Sub4_Sub1_2.aFloat24, this.aClass70_Sub4_Sub1_2.aFloat23);
			local3.glVertex2i(arg0 + arg2, arg1);
			local3.glEnd();
			this.method4298();
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IILclient!go;II)V")
	@Override
	public void method5686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class84 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class84_Sub2 local2 = (Class84_Sub2) arg2;
		@Pc(5) Class70_Sub4_Sub1 local5 = local2.aClass70_Sub4_Sub1_5;
		this.aClass92_Sub2_29.method4619();
		this.aClass92_Sub2_29.method4548(this.aClass70_Sub4_Sub1_2);
		this.aClass92_Sub2_29.method4570(0);
		this.aClass92_Sub2_29.method4568(1);
		this.aClass92_Sub2_29.method4548(local5);
		this.aClass92_Sub2_29.method4569(7681, 8448);
		this.aClass92_Sub2_29.method4578(0, 34168, 768);
		this.aClass92_Sub2_29.method4560(1);
		@Pc(45) int local45 = arg0 + this.anInt5184;
		@Pc(50) int local50 = arg1 + this.anInt5185;
		@Pc(56) int local56 = local45 + this.aClass70_Sub4_Sub1_2.anInt2357;
		@Pc(62) int local62 = local50 + this.aClass70_Sub4_Sub1_2.anInt2356;
		@Pc(69) float local69 = local5.aFloat24 / (float) local5.anInt2357;
		@Pc(76) float local76 = local5.aFloat23 / (float) local5.anInt2356;
		@Pc(83) float local83 = (float) (local45 - arg3) * local69;
		@Pc(90) float local90 = (float) (local56 - arg3) * local69;
		@Pc(100) float local100 = local5.aFloat23 - (float) (local50 - arg4) * local76;
		@Pc(110) float local110 = local5.aFloat23 - (float) (local62 - arg4) * local76;
		@Pc(114) opengl local114 = this.aClass92_Sub2_29.anOpengl2;
		local114.glBegin(7);
		local114.glColor3f(1.0F, 1.0F, 1.0F);
		local114.glMultiTexCoord2f(33984, 0.0F, this.aClass70_Sub4_Sub1_2.aFloat23);
		local114.glMultiTexCoord2f(33985, local83, local100);
		local114.glVertex2i(local45, local50);
		local114.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		local114.glMultiTexCoord2f(33985, local83, local110);
		local114.glVertex2i(local45, local50 + this.aClass70_Sub4_Sub1_2.anInt2356);
		local114.glMultiTexCoord2f(33984, this.aClass70_Sub4_Sub1_2.aFloat24, 0.0F);
		local114.glMultiTexCoord2f(33985, local90, local110);
		local114.glVertex2i(local45 + this.aClass70_Sub4_Sub1_2.anInt2357, local50 + this.aClass70_Sub4_Sub1_2.anInt2356);
		local114.glMultiTexCoord2f(33984, this.aClass70_Sub4_Sub1_2.aFloat24, this.aClass70_Sub4_Sub1_2.aFloat23);
		local114.glMultiTexCoord2f(33985, local90, local100);
		local114.glVertex2i(local45 + this.aClass70_Sub4_Sub1_2.anInt2357, local50);
		local114.glEnd();
		this.aClass92_Sub2_29.method4578(0, 5890, 768);
		this.aClass92_Sub2_29.method4570(1);
		this.aClass92_Sub2_29.method4548(null);
		this.aClass92_Sub2_29.method4568(0);
	}
}
