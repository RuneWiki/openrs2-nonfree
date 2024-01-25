import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class59_Sub2 extends Class59 {

	@OriginalMember(owner = "client!qf", name = "s", descriptor = "Lclient!bo;")
	private Class44_Sub1_Sub1 aClass44_Sub1_Sub1_5;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
	private int anInt8215 = 0;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "Z")
	private boolean aBoolean590 = false;

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
	private int anInt8227 = 0;

	@OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
	private int anInt8224 = 0;

	@OriginalMember(owner = "client!qf", name = "y", descriptor = "I")
	private int anInt8233 = 0;

	@OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
	private int anInt8229 = 0;

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "Lclient!kv;")
	private final Class143_Sub2 aClass143_Sub2_33;

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "Lclient!bo;")
	private final Class44_Sub1_Sub1 aClass44_Sub1_Sub1_4;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!kv;IIZ)V")
	public Class59_Sub2(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass143_Sub2_33 = arg0;
		this.aClass44_Sub1_Sub1_4 = Static107.method1771(arg3 ? 6408 : 6407, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!kv;IIII)V")
	public Class59_Sub2(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass143_Sub2_33 = arg0;
		this.aClass44_Sub1_Sub1_4 = Static653.method8580(arg0, arg4, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!kv;II[III)V")
	public Class59_Sub2(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass143_Sub2_33 = arg0;
		this.aClass44_Sub1_Sub1_4 = Static160.method2417(arg5, arg3, arg0, arg1, arg2, arg4);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "()I")
	@Override
	public int method8049() {
		return this.aClass44_Sub1_Sub1_4.anInt850;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)V")
	private void method7001(@OriginalArg(0) int arg0) {
		this.aClass143_Sub2_33.method4930(1);
		this.aClass143_Sub2_33.method4945(this.aClass44_Sub1_Sub1_4);
		this.aClass143_Sub2_33.method4940(this.aClass143_Sub2_33.method4971(arg0), 7681);
		this.aClass143_Sub2_33.method4947(768, 1, 34167);
		this.aClass143_Sub2_33.method4933(34168, 0);
		this.aClass143_Sub2_33.method4930(0);
		this.aClass143_Sub2_33.method4945(this.aClass44_Sub1_Sub1_5);
		this.aClass143_Sub2_33.method4940(34479, 7681);
		this.aClass143_Sub2_33.method4947(768, 1, 34166);
		if (this.anInt8215 == 0) {
			this.aClass143_Sub2_33.method4984(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt8215 == 1) {
			this.aClass143_Sub2_33.method4984(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt8215 == 2) {
			this.aClass143_Sub2_33.method4984(0.5F, 0.5F, 1.0F, 0.0F);
			return;
		} else if (this.anInt8215 == 3) {
			this.aClass143_Sub2_33.method4984(128.5F, 128.5F, 128.5F, 0.0F);
			return;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method8072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg2;
		@Pc(9) Class44_Sub1_Sub1 local9 = local6.aClass44_Sub1_Sub1_3;
		this.aClass44_Sub1_Sub1_4.method6706(false);
		this.aClass143_Sub2_33.method4969();
		this.aClass143_Sub2_33.method4945(this.aClass44_Sub1_Sub1_4);
		this.aClass143_Sub2_33.method4994(1);
		this.aClass143_Sub2_33.method4930(1);
		this.aClass143_Sub2_33.method4945(local9);
		this.aClass143_Sub2_33.method4940(7681, 8448);
		this.aClass143_Sub2_33.method4947(768, 0, 34168);
		this.aClass143_Sub2_33.method4922(1);
		@Pc(62) int local62 = arg0 + this.anInt8224;
		@Pc(67) int local67 = arg1 + this.anInt8229;
		@Pc(74) int local74 = local62 + this.aClass44_Sub1_Sub1_4.anInt850;
		@Pc(80) int local80 = local67 + this.aClass44_Sub1_Sub1_4.anInt848;
		@Pc(87) float local87 = local9.aFloat11 / (float) local9.anInt850;
		@Pc(94) float local94 = local9.aFloat12 / (float) local9.anInt848;
		@Pc(101) float local101 = local87 * (float) (local62 - arg3);
		@Pc(109) float local109 = (float) (local74 - arg3) * local87;
		@Pc(119) float local119 = local9.aFloat12 - local94 * (float) (local67 - arg4);
		@Pc(131) float local131 = local9.aFloat12 - (float) (local80 - arg4) * local94;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass44_Sub1_Sub1_4.aFloat12);
		OpenGL.glMultiTexCoord2f(33985, local101, local119);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local131);
		OpenGL.glVertex2i(local62, local67 + this.aClass44_Sub1_Sub1_4.anInt848);
		OpenGL.glMultiTexCoord2f(33984, this.aClass44_Sub1_Sub1_4.aFloat11, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local131);
		OpenGL.glVertex2i(local62 + this.aClass44_Sub1_Sub1_4.anInt850, local67 - -this.aClass44_Sub1_Sub1_4.anInt848);
		OpenGL.glMultiTexCoord2f(33984, this.aClass44_Sub1_Sub1_4.aFloat11, this.aClass44_Sub1_Sub1_4.aFloat12);
		OpenGL.glMultiTexCoord2f(33985, local109, local119);
		OpenGL.glVertex2i(local62 + this.aClass44_Sub1_Sub1_4.anInt850, local67);
		OpenGL.glEnd();
		this.aClass143_Sub2_33.method4947(768, 0, 5890);
		this.aClass143_Sub2_33.method4994(0);
		this.aClass143_Sub2_33.method4945((Class44) null);
		this.aClass143_Sub2_33.method4930(0);
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIII)V")
	@Override
	public void method8062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8229 = arg1;
		this.anInt8227 = arg3;
		this.anInt8233 = arg2;
		this.anInt8224 = arg0;
		this.aBoolean590 = this.anInt8224 != 0 || this.anInt8229 != 0 || this.anInt8233 != 0 || this.anInt8227 != 0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method8067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass44_Sub1_Sub1_4.method6706(false);
		this.aClass143_Sub2_33.method4969();
		this.aClass143_Sub2_33.method4922(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt8229;
		@Pc(42) int local42 = arg0 + this.anInt8224;
		if (this.aClass44_Sub1_Sub1_5 == null) {
			this.aClass143_Sub2_33.method4945(this.aClass44_Sub1_Sub1_4);
			this.aClass143_Sub2_33.method4994(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass44_Sub1_Sub1_4.aFloat12);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, this.aClass44_Sub1_Sub1_4.anInt848 + local37);
			OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_4.aFloat11, 0.0F);
			OpenGL.glVertex2i(this.aClass44_Sub1_Sub1_4.anInt850 + local42, local37 + this.aClass44_Sub1_Sub1_4.anInt848);
			OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_4.aFloat11, this.aClass44_Sub1_Sub1_4.aFloat12);
			OpenGL.glVertex2i(local42 + this.aClass44_Sub1_Sub1_4.anInt850, local37);
			OpenGL.glEnd();
			return;
		}
		this.method7001(arg2);
		this.aClass44_Sub1_Sub1_5.method6706(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass44_Sub1_Sub1_4.aFloat12);
		OpenGL.glTexCoord2f(0.0F, this.aClass44_Sub1_Sub1_4.aFloat12);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, this.aClass44_Sub1_Sub1_4.anInt848 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass44_Sub1_Sub1_4.aFloat11, 0.0F);
		OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_4.aFloat11, 0.0F);
		OpenGL.glVertex2i(local42 + this.aClass44_Sub1_Sub1_4.anInt850, local37 - -this.aClass44_Sub1_Sub1_4.anInt848);
		OpenGL.glMultiTexCoord2f(33985, this.aClass44_Sub1_Sub1_4.aFloat11, this.aClass44_Sub1_Sub1_4.aFloat12);
		OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_4.aFloat11, this.aClass44_Sub1_Sub1_4.aFloat12);
		OpenGL.glVertex2i(this.aClass44_Sub1_Sub1_4.anInt850 + local42, local37);
		OpenGL.glEnd();
		this.method7004();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIII[III)V")
	private void method7002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.aClass44_Sub1_Sub1_4.method796(arg5, arg2, arg4, arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!this.aClass143_Sub2_33.aBoolean422) {
			this.aClass44_Sub1_Sub1_4.method795(arg5, arg1, arg0, arg4, arg2, arg3);
			return;
		}
		@Pc(25) int[] local25 = this.aClass143_Sub2_33.na(arg4, arg5, arg2, arg3);
		if (local25 != null) {
			for (@Pc(29) int local29 = 0; local29 < local25.length; local29++) {
				local25[local29] |= 0xFF000000;
			}
			this.method7002(arg0, arg1, arg2, arg3, local25, arg2);
		}
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method8060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg0 + arg2;
		this.aClass44_Sub1_Sub1_4.method6706(false);
		@Pc(19) int local19 = arg1 + arg3;
		this.aClass143_Sub2_33.method4969();
		this.aClass143_Sub2_33.method4945(this.aClass44_Sub1_Sub1_4);
		this.aClass143_Sub2_33.method4922(arg6);
		this.aClass143_Sub2_33.method4994(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass44_Sub1_Sub1_4.aBoolean56 && !this.aBoolean590) {
			@Pc(73) float local73 = (float) arg3 * this.aClass44_Sub1_Sub1_4.aFloat12 / (float) this.aClass44_Sub1_Sub1_4.anInt848;
			@Pc(85) float local85 = this.aClass44_Sub1_Sub1_4.aFloat11 * (float) arg2 / (float) this.aClass44_Sub1_Sub1_4.anInt850;
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
		OpenGL.glTranslatef((float) this.anInt8224, (float) this.anInt8229, 0.0F);
		@Pc(125) int local125 = this.method8053();
		@Pc(128) int local128 = this.method8064();
		@Pc(134) int local134 = this.aClass44_Sub1_Sub1_4.anInt848 + arg1;
		OpenGL.glBegin(7);
		@Pc(138) int local138 = arg1;
		@Pc(147) int local147;
		while (local19 >= local134) {
			local147 = arg0 + this.aClass44_Sub1_Sub1_4.anInt850;
			@Pc(149) int local149 = arg0;
			while (local147 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass44_Sub1_Sub1_4.aFloat12);
				OpenGL.glVertex2i(local149, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local149, local134);
				OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_4.aFloat11, 0.0F);
				OpenGL.glVertex2i(local147, local134);
				OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_4.aFloat11, this.aClass44_Sub1_Sub1_4.aFloat12);
				OpenGL.glVertex2i(local147, local138);
				local147 += local125;
				local149 += local125;
			}
			if (local149 < local9) {
				@Pc(212) float local212 = (float) (local9 - local149) * this.aClass44_Sub1_Sub1_4.aFloat11 / (float) this.aClass44_Sub1_Sub1_4.anInt850;
				OpenGL.glTexCoord2f(0.0F, this.aClass44_Sub1_Sub1_4.aFloat12);
				OpenGL.glVertex2i(local149, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local149, local134);
				OpenGL.glTexCoord2f(local212, 0.0F);
				OpenGL.glVertex2i(local9, local134);
				OpenGL.glTexCoord2f(local212, this.aClass44_Sub1_Sub1_4.aFloat12);
				OpenGL.glVertex2i(local9, local138);
			}
			local134 += local128;
			local138 += local128;
		}
		if (local138 < local19) {
			@Pc(281) float local281 = this.aClass44_Sub1_Sub1_4.aFloat12 * (float) (local138 + this.aClass44_Sub1_Sub1_4.anInt848 - local19) / (float) this.aClass44_Sub1_Sub1_4.anInt848;
			@Pc(287) int local287 = this.aClass44_Sub1_Sub1_4.anInt850 + arg0;
			local147 = arg0;
			while (local9 >= local287) {
				OpenGL.glTexCoord2f(0.0F, this.aClass44_Sub1_Sub1_4.aFloat12);
				OpenGL.glVertex2i(local147, local138);
				OpenGL.glTexCoord2f(0.0F, local281);
				OpenGL.glVertex2i(local147, local19);
				OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_4.aFloat11, local281);
				OpenGL.glVertex2i(local287, local19);
				OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_4.aFloat11, this.aClass44_Sub1_Sub1_4.aFloat12);
				OpenGL.glVertex2i(local287, local138);
				local287 += local125;
				local147 += local125;
			}
			if (local147 < local9) {
				@Pc(355) float local355 = (float) (local9 - local147) * this.aClass44_Sub1_Sub1_4.aFloat11 / (float) this.aClass44_Sub1_Sub1_4.anInt850;
				OpenGL.glTexCoord2f(0.0F, this.aClass44_Sub1_Sub1_4.aFloat12);
				OpenGL.glVertex2i(local147, local138);
				OpenGL.glTexCoord2f(0.0F, local281);
				OpenGL.glVertex2i(local147, local19);
				OpenGL.glTexCoord2f(local355, local281);
				OpenGL.glVertex2i(local9, local19);
				OpenGL.glTexCoord2f(local355, this.aClass44_Sub1_Sub1_4.aFloat12);
				OpenGL.glVertex2i(local9, local138);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "()I")
	@Override
	public int method8064() {
		return this.anInt8227 + this.anInt8229 + this.aClass44_Sub1_Sub1_4.anInt848;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method8051(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean590) {
			local10 = (float) this.method8053();
			local14 = (float) this.method8064();
			@Pc(21) float local21 = (arg2 - arg0) / local10;
			@Pc(27) float local27 = (arg3 - arg1) / local10;
			@Pc(33) float local33 = (arg4 - arg0) / local14;
			@Pc(39) float local39 = (arg5 - arg1) / local14;
			@Pc(45) float local45 = local33 * (float) this.anInt8229;
			@Pc(51) float local51 = local39 * (float) this.anInt8229;
			@Pc(57) float local57 = (float) this.anInt8224 * local21;
			@Pc(63) float local63 = (float) this.anInt8224 * local27;
			@Pc(70) float local70 = -local21 * (float) this.anInt8233;
			@Pc(77) float local77 = -local27 * (float) this.anInt8233;
			@Pc(84) float local84 = (float) this.anInt8227 * -local33;
			arg3 = local51 + arg3 + local77;
			@Pc(97) float local97 = (float) this.anInt8227 * -local39;
			arg1 = local63 + arg1 + local51;
			arg4 = local57 + arg4 + local84;
			arg2 = local45 + local70 + arg2;
			arg0 = local57 + arg0 + local45;
			arg5 = local97 + arg5 + local63;
		}
		local10 = arg4 + arg2 - arg0;
		local14 = arg5 + arg3 - arg1;
		this.aClass44_Sub1_Sub1_4.method6706(true);
		this.aClass143_Sub2_33.method4969();
		this.aClass143_Sub2_33.method4945(this.aClass44_Sub1_Sub1_4);
		this.aClass143_Sub2_33.method4922(1);
		this.aClass143_Sub2_33.method4994(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass44_Sub1_Sub1_4.aFloat12);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_4.aFloat11, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_4.aFloat11, this.aClass44_Sub1_Sub1_4.aFloat12);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method8065(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class44_Sub1_Sub1 local7 = ((Class1_Sub3) arg6).aClass44_Sub1_Sub1_3;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(31) float local31;
		if (this.aBoolean590) {
			local14 = (float) this.method8053();
			local18 = (float) this.method8064();
			local24 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(38) float local38 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = local38 * (float) this.anInt8229;
			@Pc(56) float local56 = local44 * (float) this.anInt8229;
			@Pc(62) float local62 = local24 * (float) this.anInt8224;
			@Pc(68) float local68 = local31 * (float) this.anInt8224;
			@Pc(75) float local75 = (float) this.anInt8233 * -local24;
			@Pc(82) float local82 = (float) this.anInt8233 * -local31;
			@Pc(89) float local89 = -local38 * (float) this.anInt8227;
			arg3 = local56 + local82 + arg3;
			arg0 = local62 + arg0 + local50;
			arg1 = arg1 + local68 + local56;
			@Pc(114) float local114 = (float) this.anInt8227 * -local44;
			arg2 = local50 + arg2 + local75;
			arg4 = arg4 + local62 + local89;
			arg5 = local114 + local68 + arg5;
		}
		local14 = arg4 + arg2 - arg0;
		local18 = arg5 + arg3 - arg1;
		this.aClass44_Sub1_Sub1_4.method6706(true);
		this.aClass143_Sub2_33.method4969();
		this.aClass143_Sub2_33.method4945(this.aClass44_Sub1_Sub1_4);
		this.aClass143_Sub2_33.method4994(1);
		this.aClass143_Sub2_33.method4930(1);
		this.aClass143_Sub2_33.method4945(local7);
		this.aClass143_Sub2_33.method4940(7681, 8448);
		this.aClass143_Sub2_33.method4947(768, 0, 34168);
		this.aClass143_Sub2_33.method4922(1);
		local24 = local7.aFloat11 / (float) local7.anInt850;
		local31 = local7.aFloat12 / (float) local7.anInt848;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass44_Sub1_Sub1_4.aFloat12);
		OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * local24, local7.aFloat12 - local31 * ((float) -arg8 + arg1));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg4) * local24, local7.aFloat12 - local31 * (arg5 - (float) arg8));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass44_Sub1_Sub1_4.aFloat11, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * (local14 - (float) arg7), local7.aFloat12 - local31 * ((float) -arg8 + local18));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass44_Sub1_Sub1_4.aFloat11, this.aClass44_Sub1_Sub1_4.aFloat12);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg2), local7.aFloat12 - ((float) -arg8 + arg3) * local31);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass143_Sub2_33.method4947(768, 0, 5890);
		this.aClass143_Sub2_33.method4994(0);
		this.aClass143_Sub2_33.method4945((Class44) null);
		this.aClass143_Sub2_33.method4930(0);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)V")
	@Override
	public void method8066(@OriginalArg(2) int arg0) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass44_Sub1_Sub1_5 = Static653.method8580(this.aClass143_Sub2_33, this.aClass44_Sub1_Sub1_4.anInt848, 0, 0, this.aClass44_Sub1_Sub1_4.anInt850);
		this.anInt8215 = arg0;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "()I")
	@Override
	public int method8053() {
		return this.anInt8233 + this.aClass44_Sub1_Sub1_4.anInt850 + this.anInt8224;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([I)V")
	@Override
	public void method8059(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt8224;
		arg0[1] = this.anInt8229;
		arg0[2] = this.anInt8233;
		arg0[3] = this.anInt8227;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method8050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass44_Sub1_Sub1_4.method6706(true);
		this.aClass143_Sub2_33.method4969();
		this.aClass143_Sub2_33.method4922(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean590) {
			@Pc(48) float local48 = (float) arg2 / (float) this.method8053();
			@Pc(55) float local55 = (float) arg3 / (float) this.method8064();
			@Pc(64) float local64 = (float) arg0 + (float) this.anInt8224 * local48;
			@Pc(73) float local73 = (float) this.anInt8229 * local55 + (float) arg1;
			@Pc(82) float local82 = local64 + local48 * (float) this.aClass44_Sub1_Sub1_4.anInt850;
			@Pc(91) float local91 = local55 * (float) this.aClass44_Sub1_Sub1_4.anInt848 + local73;
			if (this.aClass44_Sub1_Sub1_5 == null) {
				this.aClass143_Sub2_33.method4945(this.aClass44_Sub1_Sub1_4);
				this.aClass143_Sub2_33.method4994(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass44_Sub1_Sub1_4.aFloat12);
				OpenGL.glVertex2f(local64, local73);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local64, local91);
				OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_4.aFloat11, 0.0F);
				OpenGL.glVertex2f(local82, local91);
				OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_4.aFloat11, this.aClass44_Sub1_Sub1_4.aFloat12);
				OpenGL.glVertex2f(local82, local73);
				OpenGL.glEnd();
			} else {
				this.method7001(arg4);
				this.aClass44_Sub1_Sub1_5.method6706(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass44_Sub1_Sub1_4.aFloat12);
				OpenGL.glTexCoord2f(0.0F, this.aClass44_Sub1_Sub1_4.aFloat12);
				OpenGL.glVertex2f(local64, local73);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local64, local91);
				OpenGL.glMultiTexCoord2f(33985, this.aClass44_Sub1_Sub1_4.aFloat11, 0.0F);
				OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_4.aFloat11, 0.0F);
				OpenGL.glVertex2f(local82, local91);
				OpenGL.glMultiTexCoord2f(33985, this.aClass44_Sub1_Sub1_4.aFloat11, this.aClass44_Sub1_Sub1_4.aFloat12);
				OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_4.aFloat11, this.aClass44_Sub1_Sub1_4.aFloat12);
				OpenGL.glVertex2f(local82, local73);
				OpenGL.glEnd();
				this.method7004();
			}
		} else if (this.aClass44_Sub1_Sub1_5 == null) {
			this.aClass143_Sub2_33.method4945(this.aClass44_Sub1_Sub1_4);
			this.aClass143_Sub2_33.method4994(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass44_Sub1_Sub1_4.aFloat12);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_4.aFloat11, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_4.aFloat11, this.aClass44_Sub1_Sub1_4.aFloat12);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method7001(arg4);
			this.aClass44_Sub1_Sub1_5.method6706(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass44_Sub1_Sub1_4.aFloat12);
			OpenGL.glTexCoord2f(0.0F, this.aClass44_Sub1_Sub1_4.aFloat12);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass44_Sub1_Sub1_4.aFloat11, 0.0F);
			OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_4.aFloat11, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass44_Sub1_Sub1_4.aFloat11, this.aClass44_Sub1_Sub1_4.aFloat12);
			OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_4.aFloat11, this.aClass44_Sub1_Sub1_4.aFloat12);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method7004();
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	private void method7004() {
		this.aClass143_Sub2_33.method4930(1);
		this.aClass143_Sub2_33.method4945((Class44) null);
		this.aClass143_Sub2_33.method4940(8448, 8448);
		this.aClass143_Sub2_33.method4947(768, 1, 34168);
		this.aClass143_Sub2_33.method4933(5890, 0);
		this.aClass143_Sub2_33.method4930(0);
		this.aClass143_Sub2_33.method4947(768, 1, 34168);
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "()I")
	@Override
	public int method8061() {
		return this.aClass44_Sub1_Sub1_4.anInt848;
	}
}
