import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class71_Sub3 extends Class71 {

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "Lclient!uk;")
	private Class50_Sub4_Sub1 aClass50_Sub4_Sub1_4;

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
	private int anInt8711 = 0;

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
	private int anInt8702 = 0;

	@OriginalMember(owner = "client!qg", name = "q", descriptor = "Z")
	private boolean aBoolean635 = false;

	@OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
	private int anInt8720 = 0;

	@OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
	private int anInt8723 = 0;

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
	private int anInt8709 = 0;

	@OriginalMember(owner = "client!qg", name = "A", descriptor = "Lclient!lea;")
	private final Class101_Sub2 aClass101_Sub2_31;

	@OriginalMember(owner = "client!qg", name = "w", descriptor = "Lclient!uk;")
	private final Class50_Sub4_Sub1 aClass50_Sub4_Sub1_5;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lclient!lea;IIZ)V")
	public Class71_Sub3(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass101_Sub2_31 = arg0;
		this.aClass50_Sub4_Sub1_5 = Static134.method2355(arg3 ? 6408 : 6407, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lclient!lea;IIII)V")
	public Class71_Sub3(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass101_Sub2_31 = arg0;
		this.aClass50_Sub4_Sub1_5 = Static428.method7018(arg3, arg2, arg4, arg1, arg0);
	}

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lclient!lea;II[III)V")
	public Class71_Sub3(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass101_Sub2_31 = arg0;
		this.aClass50_Sub4_Sub1_5 = Static263.method4527(arg0, arg5, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "()I")
	@Override
	public int method7707() {
		return this.aClass50_Sub4_Sub1_5.anInt10695;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIII[III)V")
	private void method7713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.aClass50_Sub4_Sub1_5.method9146(arg4, arg2, arg5, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method7697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass50_Sub4_Sub1_5.method9134(false);
		this.aClass101_Sub2_31.method5626();
		this.aClass101_Sub2_31.method5614(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt8702;
		@Pc(42) int local42 = arg0 + this.anInt8711;
		if (this.aClass50_Sub4_Sub1_4 == null) {
			this.aClass101_Sub2_31.method5690(this.aClass50_Sub4_Sub1_5);
			this.aClass101_Sub2_31.method5681(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass50_Sub4_Sub1_5.aFloat190);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, local37 + this.aClass50_Sub4_Sub1_5.anInt10695);
			OpenGL.glTexCoord2f(this.aClass50_Sub4_Sub1_5.aFloat189, 0.0F);
			OpenGL.glVertex2i(local42 + this.aClass50_Sub4_Sub1_5.anInt10693, local37 + this.aClass50_Sub4_Sub1_5.anInt10695);
			OpenGL.glTexCoord2f(this.aClass50_Sub4_Sub1_5.aFloat189, this.aClass50_Sub4_Sub1_5.aFloat190);
			OpenGL.glVertex2i(this.aClass50_Sub4_Sub1_5.anInt10693 + local42, local37);
			OpenGL.glEnd();
			return;
		}
		this.method7714(arg2);
		this.aClass50_Sub4_Sub1_4.method9134(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass50_Sub4_Sub1_5.aFloat190);
		OpenGL.glTexCoord2f(0.0F, this.aClass50_Sub4_Sub1_5.aFloat190);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, this.aClass50_Sub4_Sub1_5.anInt10695 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass50_Sub4_Sub1_5.aFloat189, 0.0F);
		OpenGL.glTexCoord2f(this.aClass50_Sub4_Sub1_5.aFloat189, 0.0F);
		OpenGL.glVertex2i(this.aClass50_Sub4_Sub1_5.anInt10693 + local42, this.aClass50_Sub4_Sub1_5.anInt10695 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass50_Sub4_Sub1_5.aFloat189, this.aClass50_Sub4_Sub1_5.aFloat190);
		OpenGL.glTexCoord2f(this.aClass50_Sub4_Sub1_5.aFloat189, this.aClass50_Sub4_Sub1_5.aFloat190);
		OpenGL.glVertex2i(this.aClass50_Sub4_Sub1_5.anInt10693 + local42, local37);
		OpenGL.glEnd();
		this.method7715();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg0 + arg2;
		this.aClass50_Sub4_Sub1_5.method9134(false);
		@Pc(18) int local18 = arg3 + arg1;
		this.aClass101_Sub2_31.method5626();
		this.aClass101_Sub2_31.method5690(this.aClass50_Sub4_Sub1_5);
		this.aClass101_Sub2_31.method5614(arg6);
		this.aClass101_Sub2_31.method5681(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass50_Sub4_Sub1_5.aBoolean779 && !this.aBoolean635) {
			@Pc(72) float local72 = (float) arg3 * this.aClass50_Sub4_Sub1_5.aFloat190 / (float) this.aClass50_Sub4_Sub1_5.anInt10695;
			@Pc(84) float local84 = (float) arg2 * this.aClass50_Sub4_Sub1_5.aFloat189 / (float) this.aClass50_Sub4_Sub1_5.anInt10693;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local72);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local18);
			OpenGL.glTexCoord2f(local84, 0.0F);
			OpenGL.glVertex2i(local9, local18);
			OpenGL.glTexCoord2f(local84, local72);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt8711, (float) this.anInt8702, 0.0F);
		@Pc(124) int local124 = this.method7709();
		@Pc(127) int local127 = this.method7711();
		@Pc(133) int local133 = arg1 + this.aClass50_Sub4_Sub1_5.anInt10695;
		OpenGL.glBegin(7);
		@Pc(137) int local137 = arg1;
		@Pc(146) int local146;
		while (local18 >= local133) {
			local146 = arg0 + this.aClass50_Sub4_Sub1_5.anInt10693;
			@Pc(148) int local148 = arg0;
			while (local146 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass50_Sub4_Sub1_5.aFloat190);
				OpenGL.glVertex2i(local148, local137);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local133);
				OpenGL.glTexCoord2f(this.aClass50_Sub4_Sub1_5.aFloat189, 0.0F);
				OpenGL.glVertex2i(local146, local133);
				OpenGL.glTexCoord2f(this.aClass50_Sub4_Sub1_5.aFloat189, this.aClass50_Sub4_Sub1_5.aFloat190);
				OpenGL.glVertex2i(local146, local137);
				local146 += local124;
				local148 += local124;
			}
			if (local9 > local148) {
				@Pc(218) float local218 = (float) (local9 - local148) * this.aClass50_Sub4_Sub1_5.aFloat189 / (float) this.aClass50_Sub4_Sub1_5.anInt10693;
				OpenGL.glTexCoord2f(0.0F, this.aClass50_Sub4_Sub1_5.aFloat190);
				OpenGL.glVertex2i(local148, local137);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local133);
				OpenGL.glTexCoord2f(local218, 0.0F);
				OpenGL.glVertex2i(local9, local133);
				OpenGL.glTexCoord2f(local218, this.aClass50_Sub4_Sub1_5.aFloat190);
				OpenGL.glVertex2i(local9, local137);
			}
			local137 += local127;
			local133 += local127;
		}
		if (local137 < local18) {
			@Pc(279) float local279 = this.aClass50_Sub4_Sub1_5.aFloat190 * (float) (this.aClass50_Sub4_Sub1_5.anInt10695 + local137 - local18) / (float) this.aClass50_Sub4_Sub1_5.anInt10695;
			@Pc(285) int local285 = this.aClass50_Sub4_Sub1_5.anInt10693 + arg0;
			local146 = arg0;
			while (local285 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass50_Sub4_Sub1_5.aFloat190);
				OpenGL.glVertex2i(local146, local137);
				OpenGL.glTexCoord2f(0.0F, local279);
				OpenGL.glVertex2i(local146, local18);
				OpenGL.glTexCoord2f(this.aClass50_Sub4_Sub1_5.aFloat189, local279);
				OpenGL.glVertex2i(local285, local18);
				OpenGL.glTexCoord2f(this.aClass50_Sub4_Sub1_5.aFloat189, this.aClass50_Sub4_Sub1_5.aFloat190);
				OpenGL.glVertex2i(local285, local137);
				local285 += local124;
				local146 += local124;
			}
			if (local146 < local9) {
				@Pc(350) float local350 = (float) (local9 - local146) * this.aClass50_Sub4_Sub1_5.aFloat189 / (float) this.aClass50_Sub4_Sub1_5.anInt10693;
				OpenGL.glTexCoord2f(0.0F, this.aClass50_Sub4_Sub1_5.aFloat190);
				OpenGL.glVertex2i(local146, local137);
				OpenGL.glTexCoord2f(0.0F, local279);
				OpenGL.glVertex2i(local146, local18);
				OpenGL.glTexCoord2f(local350, local279);
				OpenGL.glVertex2i(local9, local18);
				OpenGL.glTexCoord2f(local350, this.aClass50_Sub4_Sub1_5.aFloat190);
				OpenGL.glVertex2i(local9, local137);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method7694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass50_Sub4_Sub1_5.method9134(true);
		this.aClass101_Sub2_31.method5626();
		this.aClass101_Sub2_31.method5614(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean635) {
			@Pc(51) float local51 = (float) arg2 / (float) this.method7709();
			@Pc(58) float local58 = (float) arg3 / (float) this.method7711();
			@Pc(67) float local67 = (float) arg0 + local51 * (float) this.anInt8711;
			@Pc(76) float local76 = (float) arg1 + local58 * (float) this.anInt8702;
			@Pc(85) float local85 = (float) this.aClass50_Sub4_Sub1_5.anInt10693 * local51 + local67;
			@Pc(94) float local94 = local58 * (float) this.aClass50_Sub4_Sub1_5.anInt10695 + local76;
			if (this.aClass50_Sub4_Sub1_4 == null) {
				this.aClass101_Sub2_31.method5690(this.aClass50_Sub4_Sub1_5);
				this.aClass101_Sub2_31.method5681(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass50_Sub4_Sub1_5.aFloat190);
				OpenGL.glVertex2f(local67, local76);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local67, local94);
				OpenGL.glTexCoord2f(this.aClass50_Sub4_Sub1_5.aFloat189, 0.0F);
				OpenGL.glVertex2f(local85, local94);
				OpenGL.glTexCoord2f(this.aClass50_Sub4_Sub1_5.aFloat189, this.aClass50_Sub4_Sub1_5.aFloat190);
				OpenGL.glVertex2f(local85, local76);
				OpenGL.glEnd();
			} else {
				this.method7714(arg4);
				this.aClass50_Sub4_Sub1_4.method9134(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass50_Sub4_Sub1_5.aFloat190);
				OpenGL.glTexCoord2f(0.0F, this.aClass50_Sub4_Sub1_5.aFloat190);
				OpenGL.glVertex2f(local67, local76);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local67, local94);
				OpenGL.glMultiTexCoord2f(33985, this.aClass50_Sub4_Sub1_5.aFloat189, 0.0F);
				OpenGL.glTexCoord2f(this.aClass50_Sub4_Sub1_5.aFloat189, 0.0F);
				OpenGL.glVertex2f(local85, local94);
				OpenGL.glMultiTexCoord2f(33985, this.aClass50_Sub4_Sub1_5.aFloat189, this.aClass50_Sub4_Sub1_5.aFloat190);
				OpenGL.glTexCoord2f(this.aClass50_Sub4_Sub1_5.aFloat189, this.aClass50_Sub4_Sub1_5.aFloat190);
				OpenGL.glVertex2f(local85, local76);
				OpenGL.glEnd();
				this.method7715();
			}
		} else if (this.aClass50_Sub4_Sub1_4 == null) {
			this.aClass101_Sub2_31.method5690(this.aClass50_Sub4_Sub1_5);
			this.aClass101_Sub2_31.method5681(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass50_Sub4_Sub1_5.aFloat190);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass50_Sub4_Sub1_5.aFloat189, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass50_Sub4_Sub1_5.aFloat189, this.aClass50_Sub4_Sub1_5.aFloat190);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method7714(arg4);
			this.aClass50_Sub4_Sub1_4.method9134(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass50_Sub4_Sub1_5.aFloat190);
			OpenGL.glTexCoord2f(0.0F, this.aClass50_Sub4_Sub1_5.aFloat190);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass50_Sub4_Sub1_5.aFloat189, 0.0F);
			OpenGL.glTexCoord2f(this.aClass50_Sub4_Sub1_5.aFloat189, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass50_Sub4_Sub1_5.aFloat189, this.aClass50_Sub4_Sub1_5.aFloat190);
			OpenGL.glTexCoord2f(this.aClass50_Sub4_Sub1_5.aFloat189, this.aClass50_Sub4_Sub1_5.aFloat190);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method7715();
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8711 = arg0;
		this.anInt8723 = arg3;
		this.anInt8702 = arg1;
		this.anInt8709 = arg2;
		this.aBoolean635 = this.anInt8711 != 0 || this.anInt8702 != 0 || this.anInt8709 != 0 || this.anInt8723 != 0;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(II)V")
	private void method7714(@OriginalArg(1) int arg0) {
		this.aClass101_Sub2_31.method5627(1);
		this.aClass101_Sub2_31.method5690(this.aClass50_Sub4_Sub1_5);
		this.aClass101_Sub2_31.method5665(this.aClass101_Sub2_31.method5654(arg0), 7681);
		this.aClass101_Sub2_31.method5657(768, 1, 34167);
		this.aClass101_Sub2_31.method5680(0, 34168);
		this.aClass101_Sub2_31.method5627(0);
		this.aClass101_Sub2_31.method5690(this.aClass50_Sub4_Sub1_4);
		this.aClass101_Sub2_31.method5665(34479, 7681);
		this.aClass101_Sub2_31.method5657(768, 1, 34166);
		if (this.anInt8720 == 0) {
			this.aClass101_Sub2_31.method5667(1.0F, 0.5F, 0.0F, 0.5F);
		} else if (this.anInt8720 == 1) {
			this.aClass101_Sub2_31.method5667(0.5F, 1.0F, 0.0F, 0.5F);
		} else if (this.anInt8720 == 2) {
			this.aClass101_Sub2_31.method5667(0.5F, 0.5F, 0.0F, 1.0F);
		} else if (this.anInt8720 == 3) {
			this.aClass101_Sub2_31.method5667(128.5F, 128.5F, 0.0F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method7704(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class50_Sub4_Sub1 local7 = ((Class1_Sub1) arg6).aClass50_Sub4_Sub1_1;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(31) float local31;
		if (this.aBoolean635) {
			local14 = (float) this.method7709();
			local18 = (float) this.method7711();
			local24 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(37) float local37 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = local37 * (float) this.anInt8702;
			@Pc(56) float local56 = local44 * (float) this.anInt8702;
			@Pc(62) float local62 = (float) this.anInt8711 * local24;
			@Pc(68) float local68 = local31 * (float) this.anInt8711;
			@Pc(75) float local75 = (float) this.anInt8709 * -local24;
			@Pc(82) float local82 = -local31 * (float) this.anInt8709;
			@Pc(89) float local89 = -local37 * (float) this.anInt8723;
			arg3 = local56 + arg3 + local82;
			arg2 = local50 + local75 + arg2;
			arg1 = arg1 + local68 + local56;
			arg0 = local62 + arg0 + local50;
			@Pc(120) float local120 = (float) this.anInt8723 * -local44;
			arg4 = arg4 + local62 + local89;
			arg5 = local68 + arg5 + local120;
		}
		local14 = arg4 + arg2 - arg0;
		this.aClass50_Sub4_Sub1_5.method9134(true);
		local18 = arg3 + arg5 - arg1;
		this.aClass101_Sub2_31.method5626();
		this.aClass101_Sub2_31.method5690(this.aClass50_Sub4_Sub1_5);
		this.aClass101_Sub2_31.method5681(1);
		this.aClass101_Sub2_31.method5627(1);
		this.aClass101_Sub2_31.method5690(local7);
		this.aClass101_Sub2_31.method5665(7681, 8448);
		this.aClass101_Sub2_31.method5657(768, 0, 34168);
		this.aClass101_Sub2_31.method5614(1);
		local24 = local7.aFloat189 / (float) local7.anInt10693;
		local31 = local7.aFloat190 / (float) local7.anInt10695;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass50_Sub4_Sub1_5.aFloat190);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg0), local7.aFloat190 - ((float) -arg8 + arg1) * local31);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg4) * local24, local7.aFloat190 - ((float) -arg8 + arg5) * local31);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass50_Sub4_Sub1_5.aFloat189, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + local14), local7.aFloat190 - (local18 - (float) arg8) * local31);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass50_Sub4_Sub1_5.aFloat189, this.aClass50_Sub4_Sub1_5.aFloat190);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg2), local7.aFloat190 - local31 * (arg3 - (float) arg8));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass101_Sub2_31.method5657(768, 0, 5890);
		this.aClass101_Sub2_31.method5681(0);
		this.aClass101_Sub2_31.method5690((Class50) null);
		this.aClass101_Sub2_31.method5627(0);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method7708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg2;
		@Pc(9) Class50_Sub4_Sub1 local9 = local6.aClass50_Sub4_Sub1_1;
		this.aClass50_Sub4_Sub1_5.method9134(false);
		this.aClass101_Sub2_31.method5626();
		this.aClass101_Sub2_31.method5690(this.aClass50_Sub4_Sub1_5);
		this.aClass101_Sub2_31.method5681(1);
		this.aClass101_Sub2_31.method5627(1);
		this.aClass101_Sub2_31.method5690(local9);
		this.aClass101_Sub2_31.method5665(7681, 8448);
		this.aClass101_Sub2_31.method5657(768, 0, 34168);
		this.aClass101_Sub2_31.method5614(1);
		@Pc(62) int local62 = arg0 + this.anInt8711;
		@Pc(67) int local67 = arg1 + this.anInt8702;
		@Pc(74) int local74 = local62 + this.aClass50_Sub4_Sub1_5.anInt10693;
		@Pc(81) int local81 = local67 + this.aClass50_Sub4_Sub1_5.anInt10695;
		@Pc(88) float local88 = local9.aFloat189 / (float) local9.anInt10693;
		@Pc(95) float local95 = local9.aFloat190 / (float) local9.anInt10695;
		@Pc(103) float local103 = (float) (local62 - arg3) * local88;
		@Pc(110) float local110 = local88 * (float) (local74 - arg3);
		@Pc(121) float local121 = local9.aFloat190 - local95 * (float) (local67 - arg4);
		@Pc(132) float local132 = local9.aFloat190 - local95 * (float) (local81 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass50_Sub4_Sub1_5.aFloat190);
		OpenGL.glMultiTexCoord2f(33985, local103, local121);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local103, local132);
		OpenGL.glVertex2i(local62, local67 + this.aClass50_Sub4_Sub1_5.anInt10695);
		OpenGL.glMultiTexCoord2f(33984, this.aClass50_Sub4_Sub1_5.aFloat189, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local110, local132);
		OpenGL.glVertex2i(local62 + this.aClass50_Sub4_Sub1_5.anInt10693, local67 + this.aClass50_Sub4_Sub1_5.anInt10695);
		OpenGL.glMultiTexCoord2f(33984, this.aClass50_Sub4_Sub1_5.aFloat189, this.aClass50_Sub4_Sub1_5.aFloat190);
		OpenGL.glMultiTexCoord2f(33985, local110, local121);
		OpenGL.glVertex2i(local62 + this.aClass50_Sub4_Sub1_5.anInt10693, local67);
		OpenGL.glEnd();
		this.aClass101_Sub2_31.method5657(768, 0, 5890);
		this.aClass101_Sub2_31.method5681(0);
		this.aClass101_Sub2_31.method5690((Class50) null);
		this.aClass101_Sub2_31.method5627(0);
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "()I")
	@Override
	public int method7709() {
		return this.anInt8709 + this.anInt8711 + this.aClass50_Sub4_Sub1_5.anInt10693;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
	private void method7715() {
		this.aClass101_Sub2_31.method5627(1);
		this.aClass101_Sub2_31.method5690((Class50) null);
		this.aClass101_Sub2_31.method5665(8448, 8448);
		this.aClass101_Sub2_31.method5657(768, 1, 34168);
		this.aClass101_Sub2_31.method5680(0, 5890);
		this.aClass101_Sub2_31.method5627(0);
		this.aClass101_Sub2_31.method5657(768, 1, 34168);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "([I)V")
	@Override
	public void method7689(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt8709;
		arg0[1] = this.anInt8702;
		arg0[3] = this.anInt8723;
		arg0[0] = this.anInt8711;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method7705(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean635) {
			local6 = (float) this.method7709();
			local10 = (float) this.method7711();
			@Pc(17) float local17 = (arg2 - arg0) / local6;
			@Pc(23) float local23 = (arg3 - arg1) / local6;
			@Pc(29) float local29 = (arg4 - arg0) / local10;
			@Pc(36) float local36 = (arg5 - arg1) / local10;
			@Pc(42) float local42 = (float) this.anInt8702 * local29;
			@Pc(48) float local48 = local36 * (float) this.anInt8702;
			@Pc(54) float local54 = local17 * (float) this.anInt8711;
			@Pc(60) float local60 = (float) this.anInt8711 * local23;
			@Pc(67) float local67 = -local17 * (float) this.anInt8709;
			@Pc(74) float local74 = -local23 * (float) this.anInt8709;
			@Pc(81) float local81 = (float) this.anInt8723 * -local29;
			arg4 = local81 + arg4 + local54;
			arg0 = local54 + arg0 + local42;
			arg1 = local60 + arg1 + local48;
			arg2 = local42 + arg2 + local67;
			arg3 = local48 + local74 + arg3;
			@Pc(118) float local118 = -local36 * (float) this.anInt8723;
			arg5 = local60 + arg5 + local118;
		}
		local6 = arg4 + arg2 - arg0;
		local10 = arg3 + arg5 - arg1;
		this.aClass50_Sub4_Sub1_5.method9134(true);
		this.aClass101_Sub2_31.method5626();
		this.aClass101_Sub2_31.method5690(this.aClass50_Sub4_Sub1_5);
		this.aClass101_Sub2_31.method5614(1);
		this.aClass101_Sub2_31.method5681(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass50_Sub4_Sub1_5.aFloat190);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass50_Sub4_Sub1_5.aFloat189, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass50_Sub4_Sub1_5.aFloat189, this.aClass50_Sub4_Sub1_5.aFloat190);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)V")
	@Override
	public void method7696(@OriginalArg(2) int arg0) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass50_Sub4_Sub1_4 = Static428.method7018(this.aClass50_Sub4_Sub1_5.anInt10693, 0, this.aClass50_Sub4_Sub1_5.anInt10695, 0, this.aClass101_Sub2_31);
		this.anInt8720 = arg0;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "()I")
	@Override
	public int method7691() {
		return this.aClass50_Sub4_Sub1_5.anInt10693;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!this.aClass101_Sub2_31.aBoolean461) {
			this.aClass50_Sub4_Sub1_5.method9149(arg2, arg5, arg4, arg1, arg3, arg0);
			return;
		}
		@Pc(28) int[] local28 = this.aClass101_Sub2_31.na(arg4, arg5, arg2, arg3);
		if (local28 != null) {
			for (@Pc(32) int local32 = 0; local32 < local28.length; local32++) {
				local28[local32] |= 0xFF000000;
			}
			this.method7713(arg0, arg1, arg2, arg3, local28, arg2);
		}
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "()I")
	@Override
	public int method7711() {
		return this.anInt8723 + this.anInt8702 + this.aClass50_Sub4_Sub1_5.anInt10695;
	}
}
