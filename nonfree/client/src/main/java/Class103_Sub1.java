import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gba")
public final class Class103_Sub1 extends Class103 {

	@OriginalMember(owner = "client!gba", name = "c", descriptor = "Lclient!gv;")
	private Class94_Sub2_Sub1 aClass94_Sub2_Sub1_2;

	@OriginalMember(owner = "client!gba", name = "m", descriptor = "Z")
	private boolean aBoolean244 = false;

	@OriginalMember(owner = "client!gba", name = "q", descriptor = "I")
	private int anInt3334 = 0;

	@OriginalMember(owner = "client!gba", name = "y", descriptor = "I")
	private int anInt3340 = 0;

	@OriginalMember(owner = "client!gba", name = "v", descriptor = "I")
	private int anInt3337 = 0;

	@OriginalMember(owner = "client!gba", name = "w", descriptor = "I")
	private int anInt3338 = 0;

	@OriginalMember(owner = "client!gba", name = "z", descriptor = "I")
	private int anInt3341 = 0;

	@OriginalMember(owner = "client!gba", name = "t", descriptor = "Lclient!dw;")
	private final Class82_Sub1 aClass82_Sub1_20;

	@OriginalMember(owner = "client!gba", name = "B", descriptor = "Lclient!gv;")
	private final Class94_Sub2_Sub1 aClass94_Sub2_Sub1_3;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lclient!dw;IIZ)V")
	public Class103_Sub1(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass82_Sub1_20 = arg0;
		this.aClass94_Sub2_Sub1_3 = Static13.method237(arg2, arg3 ? 6408 : 6407, arg0, arg1);
	}

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lclient!dw;IIII)V")
	public Class103_Sub1(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass82_Sub1_20 = arg0;
		this.aClass94_Sub2_Sub1_3 = Static56.method1013(arg0, arg1, arg3, arg2, arg4);
	}

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lclient!dw;II[III)V")
	public Class103_Sub1(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass82_Sub1_20 = arg0;
		this.aClass94_Sub2_Sub1_3 = Static275.method4529(arg5, arg3, arg0, arg1, arg2, arg4);
	}

	@OriginalMember(owner = "client!gba", name = "d", descriptor = "()I")
	@Override
	public int method7454() {
		return this.anInt3337 + this.anInt3338 + this.aClass94_Sub2_Sub1_3.anInt3664;
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "()I")
	@Override
	public int method7445() {
		return this.aClass94_Sub2_Sub1_3.anInt3664;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "()I")
	@Override
	public int method7440() {
		return this.aClass94_Sub2_Sub1_3.anInt3671;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "([I)V")
	@Override
	public void method7459(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt3338;
		arg0[2] = this.anInt3337;
		arg0[1] = this.anInt3340;
		arg0[3] = this.anInt3341;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!this.aClass82_Sub1_20.aBoolean175) {
			this.aClass94_Sub2_Sub1_3.method3122(arg2, arg4, arg5, arg0, arg3, arg1);
			return;
		}
		@Pc(25) int[] local25 = this.aClass82_Sub1_20.na(arg4, arg5, arg2, arg3);
		if (local25 != null) {
			for (@Pc(29) int local29 = 0; local29 < local25.length; local29++) {
				local25[local29] |= 0xFF000000;
			}
			this.method2876(arg0, arg1, arg2, arg3, local25, arg2);
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method7452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass94_Sub2_Sub1_3.method4012(true);
		this.aClass82_Sub1_20.method2060();
		this.aClass82_Sub1_20.method2085(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean244) {
			@Pc(48) float local48 = (float) arg2 / (float) this.method7454();
			@Pc(55) float local55 = (float) arg3 / (float) this.method7451();
			@Pc(64) float local64 = (float) arg0 + local48 * (float) this.anInt3338;
			@Pc(73) float local73 = (float) arg1 + local55 * (float) this.anInt3340;
			@Pc(82) float local82 = local64 + local48 * (float) this.aClass94_Sub2_Sub1_3.anInt3664;
			@Pc(91) float local91 = local73 + local55 * (float) this.aClass94_Sub2_Sub1_3.anInt3671;
			if (this.aClass94_Sub2_Sub1_2 == null) {
				this.aClass82_Sub1_20.method2029(this.aClass94_Sub2_Sub1_3);
				this.aClass82_Sub1_20.method2068(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass94_Sub2_Sub1_3.aFloat77);
				OpenGL.glVertex2f(local64, local73);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local64, local91);
				OpenGL.glTexCoord2f(this.aClass94_Sub2_Sub1_3.aFloat78, 0.0F);
				OpenGL.glVertex2f(local82, local91);
				OpenGL.glTexCoord2f(this.aClass94_Sub2_Sub1_3.aFloat78, this.aClass94_Sub2_Sub1_3.aFloat77);
				OpenGL.glVertex2f(local82, local73);
				OpenGL.glEnd();
			} else {
				this.method2881(arg4);
				this.aClass94_Sub2_Sub1_2.method4012(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass94_Sub2_Sub1_3.aFloat77);
				OpenGL.glTexCoord2f(0.0F, this.aClass94_Sub2_Sub1_3.aFloat77);
				OpenGL.glVertex2f(local64, local73);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local64, local91);
				OpenGL.glMultiTexCoord2f(33985, this.aClass94_Sub2_Sub1_3.aFloat78, 0.0F);
				OpenGL.glTexCoord2f(this.aClass94_Sub2_Sub1_3.aFloat78, 0.0F);
				OpenGL.glVertex2f(local82, local91);
				OpenGL.glMultiTexCoord2f(33985, this.aClass94_Sub2_Sub1_3.aFloat78, this.aClass94_Sub2_Sub1_3.aFloat77);
				OpenGL.glTexCoord2f(this.aClass94_Sub2_Sub1_3.aFloat78, this.aClass94_Sub2_Sub1_3.aFloat77);
				OpenGL.glVertex2f(local82, local73);
				OpenGL.glEnd();
				this.method2877();
			}
		} else if (this.aClass94_Sub2_Sub1_2 == null) {
			this.aClass82_Sub1_20.method2029(this.aClass94_Sub2_Sub1_3);
			this.aClass82_Sub1_20.method2068(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass94_Sub2_Sub1_3.aFloat77);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass94_Sub2_Sub1_3.aFloat78, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass94_Sub2_Sub1_3.aFloat78, this.aClass94_Sub2_Sub1_3.aFloat77);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method2881(arg4);
			this.aClass94_Sub2_Sub1_2.method4012(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass94_Sub2_Sub1_3.aFloat77);
			OpenGL.glTexCoord2f(0.0F, this.aClass94_Sub2_Sub1_3.aFloat77);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass94_Sub2_Sub1_3.aFloat78, 0.0F);
			OpenGL.glTexCoord2f(this.aClass94_Sub2_Sub1_3.aFloat78, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass94_Sub2_Sub1_3.aFloat78, this.aClass94_Sub2_Sub1_3.aFloat77);
			OpenGL.glTexCoord2f(this.aClass94_Sub2_Sub1_3.aFloat78, this.aClass94_Sub2_Sub1_3.aFloat77);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method2877();
		}
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method7453(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class94_Sub2_Sub1 local7 = ((Class1_Sub1) arg6).aClass94_Sub2_Sub1_5;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(31) float local31;
		if (this.aBoolean244) {
			local14 = (float) this.method7454();
			local18 = (float) this.method7451();
			local25 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(38) float local38 = (arg4 - arg0) / local18;
			@Pc(45) float local45 = (arg5 - arg1) / local18;
			@Pc(51) float local51 = (float) this.anInt3340 * local38;
			@Pc(57) float local57 = local45 * (float) this.anInt3340;
			@Pc(63) float local63 = local25 * (float) this.anInt3338;
			@Pc(69) float local69 = (float) this.anInt3338 * local31;
			@Pc(76) float local76 = (float) this.anInt3337 * -local25;
			@Pc(83) float local83 = -local31 * (float) this.anInt3337;
			@Pc(90) float local90 = -local38 * (float) this.anInt3341;
			arg4 = arg4 + local63 + local90;
			arg0 = local63 + arg0 + local51;
			arg2 = arg2 + local76 + local51;
			@Pc(115) float local115 = (float) this.anInt3341 * -local45;
			arg1 = local69 + arg1 + local57;
			arg3 = local57 + local83 + arg3;
			arg5 = local115 + local69 + arg5;
		}
		local14 = arg2 + arg4 - arg0;
		this.aClass94_Sub2_Sub1_3.method4012(true);
		local18 = arg5 + arg3 - arg1;
		this.aClass82_Sub1_20.method2060();
		this.aClass82_Sub1_20.method2029(this.aClass94_Sub2_Sub1_3);
		this.aClass82_Sub1_20.method2068(1);
		this.aClass82_Sub1_20.method2086(1);
		this.aClass82_Sub1_20.method2029(local7);
		this.aClass82_Sub1_20.method2077(7681, 8448);
		this.aClass82_Sub1_20.method2066(34168, 768, 0);
		this.aClass82_Sub1_20.method2085(1);
		local25 = local7.aFloat78 / (float) local7.anInt3664;
		local31 = local7.aFloat77 / (float) local7.anInt3671;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass94_Sub2_Sub1_3.aFloat77);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + arg0), local7.aFloat77 - ((float) -arg8 + arg1) * local31);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * local25, local7.aFloat77 - local31 * ((float) -arg8 + arg5));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass94_Sub2_Sub1_3.aFloat78, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * (local14 - (float) arg7), local7.aFloat77 - ((float) -arg8 + local18) * local31);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass94_Sub2_Sub1_3.aFloat78, this.aClass94_Sub2_Sub1_3.aFloat77);
		OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * local25, local7.aFloat77 - local31 * (arg3 - (float) arg8));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass82_Sub1_20.method2066(5890, 768, 0);
		this.aClass82_Sub1_20.method2068(0);
		this.aClass82_Sub1_20.method2029((Class94) null);
		this.aClass82_Sub1_20.method2086(0);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method7439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg2;
		@Pc(9) Class94_Sub2_Sub1 local9 = local6.aClass94_Sub2_Sub1_5;
		this.aClass94_Sub2_Sub1_3.method4012(false);
		this.aClass82_Sub1_20.method2060();
		this.aClass82_Sub1_20.method2029(this.aClass94_Sub2_Sub1_3);
		this.aClass82_Sub1_20.method2068(1);
		this.aClass82_Sub1_20.method2086(1);
		this.aClass82_Sub1_20.method2029(local9);
		this.aClass82_Sub1_20.method2077(7681, 8448);
		this.aClass82_Sub1_20.method2066(34168, 768, 0);
		this.aClass82_Sub1_20.method2085(1);
		@Pc(62) int local62 = arg1 + this.anInt3340;
		@Pc(67) int local67 = arg0 + this.anInt3338;
		@Pc(73) int local73 = local67 + this.aClass94_Sub2_Sub1_3.anInt3664;
		@Pc(79) int local79 = this.aClass94_Sub2_Sub1_3.anInt3671 + local62;
		@Pc(86) float local86 = local9.aFloat78 / (float) local9.anInt3664;
		@Pc(93) float local93 = local9.aFloat77 / (float) local9.anInt3671;
		@Pc(100) float local100 = (float) (local67 - arg3) * local86;
		@Pc(108) float local108 = (float) (local73 - arg3) * local86;
		@Pc(119) float local119 = local9.aFloat77 - local93 * (float) (local62 - arg4);
		@Pc(130) float local130 = local9.aFloat77 - local93 * (float) (local79 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass94_Sub2_Sub1_3.aFloat77);
		OpenGL.glMultiTexCoord2f(33985, local100, local119);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local100, local130);
		OpenGL.glVertex2i(local67, local62 + this.aClass94_Sub2_Sub1_3.anInt3671);
		OpenGL.glMultiTexCoord2f(33984, this.aClass94_Sub2_Sub1_3.aFloat78, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local108, local130);
		OpenGL.glVertex2i(this.aClass94_Sub2_Sub1_3.anInt3664 + local67, this.aClass94_Sub2_Sub1_3.anInt3671 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass94_Sub2_Sub1_3.aFloat78, this.aClass94_Sub2_Sub1_3.aFloat77);
		OpenGL.glMultiTexCoord2f(33985, local108, local119);
		OpenGL.glVertex2i(this.aClass94_Sub2_Sub1_3.anInt3664 + local67, local62);
		OpenGL.glEnd();
		this.aClass82_Sub1_20.method2066(5890, 768, 0);
		this.aClass82_Sub1_20.method2068(0);
		this.aClass82_Sub1_20.method2029((Class94) null);
		this.aClass82_Sub1_20.method2086(0);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIII[III)V")
	private void method2876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.aClass94_Sub2_Sub1_3.method3127(arg2, arg0, arg3, arg1, arg5, arg4);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)V")
	private void method2877() {
		this.aClass82_Sub1_20.method2086(1);
		this.aClass82_Sub1_20.method2029((Class94) null);
		this.aClass82_Sub1_20.method2077(8448, 8448);
		this.aClass82_Sub1_20.method2066(34168, 768, 1);
		this.aClass82_Sub1_20.method2063(5890, 0);
		this.aClass82_Sub1_20.method2086(0);
		this.aClass82_Sub1_20.method2066(34168, 768, 1);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int local10 = arg0 + arg2;
		this.aClass94_Sub2_Sub1_3.method4012(false);
		@Pc(20) int local20 = arg1 + arg3;
		this.aClass82_Sub1_20.method2060();
		this.aClass82_Sub1_20.method2029(this.aClass94_Sub2_Sub1_3);
		this.aClass82_Sub1_20.method2085(arg6);
		this.aClass82_Sub1_20.method2068(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass94_Sub2_Sub1_3.aBoolean265 && !this.aBoolean244) {
			@Pc(341) float local341 = this.aClass94_Sub2_Sub1_3.aFloat77 * (float) arg3 / (float) this.aClass94_Sub2_Sub1_3.anInt3671;
			@Pc(353) float local353 = (float) arg2 * this.aClass94_Sub2_Sub1_3.aFloat78 / (float) this.aClass94_Sub2_Sub1_3.anInt3664;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local341);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local20);
			OpenGL.glTexCoord2f(local353, 0.0F);
			OpenGL.glVertex2i(local10, local20);
			OpenGL.glTexCoord2f(local353, local341);
			OpenGL.glVertex2i(local10, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt3338, (float) this.anInt3340, 0.0F);
		@Pc(74) int local74 = this.method7454();
		@Pc(77) int local77 = this.method7451();
		@Pc(83) int local83 = this.aClass94_Sub2_Sub1_3.anInt3671 + arg1;
		OpenGL.glBegin(7);
		@Pc(87) int local87 = arg1;
		@Pc(95) int local95;
		while (local20 >= local83) {
			local95 = arg0 + this.aClass94_Sub2_Sub1_3.anInt3664;
			@Pc(97) int local97 = arg0;
			while (local95 <= local10) {
				OpenGL.glTexCoord2f(0.0F, this.aClass94_Sub2_Sub1_3.aFloat77);
				OpenGL.glVertex2i(local97, local87);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local97, local83);
				OpenGL.glTexCoord2f(this.aClass94_Sub2_Sub1_3.aFloat78, 0.0F);
				OpenGL.glVertex2i(local95, local83);
				OpenGL.glTexCoord2f(this.aClass94_Sub2_Sub1_3.aFloat78, this.aClass94_Sub2_Sub1_3.aFloat77);
				OpenGL.glVertex2i(local95, local87);
				local97 += local74;
				local95 += local74;
			}
			if (local97 < local10) {
				@Pc(160) float local160 = (float) (local10 - local97) * this.aClass94_Sub2_Sub1_3.aFloat78 / (float) this.aClass94_Sub2_Sub1_3.anInt3664;
				OpenGL.glTexCoord2f(0.0F, this.aClass94_Sub2_Sub1_3.aFloat77);
				OpenGL.glVertex2i(local97, local87);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local97, local83);
				OpenGL.glTexCoord2f(local160, 0.0F);
				OpenGL.glVertex2i(local10, local83);
				OpenGL.glTexCoord2f(local160, this.aClass94_Sub2_Sub1_3.aFloat77);
				OpenGL.glVertex2i(local10, local87);
			}
			local83 += local77;
			local87 += local77;
		}
		if (local87 < local20) {
			@Pc(224) float local224 = (float) (local87 + this.aClass94_Sub2_Sub1_3.anInt3671 - local20) * this.aClass94_Sub2_Sub1_3.aFloat77 / (float) this.aClass94_Sub2_Sub1_3.anInt3671;
			@Pc(230) int local230 = this.aClass94_Sub2_Sub1_3.anInt3664 + arg0;
			local95 = arg0;
			while (local10 >= local230) {
				OpenGL.glTexCoord2f(0.0F, this.aClass94_Sub2_Sub1_3.aFloat77);
				OpenGL.glVertex2i(local95, local87);
				OpenGL.glTexCoord2f(0.0F, local224);
				OpenGL.glVertex2i(local95, local20);
				OpenGL.glTexCoord2f(this.aClass94_Sub2_Sub1_3.aFloat78, local224);
				OpenGL.glVertex2i(local230, local20);
				OpenGL.glTexCoord2f(this.aClass94_Sub2_Sub1_3.aFloat78, this.aClass94_Sub2_Sub1_3.aFloat77);
				OpenGL.glVertex2i(local230, local87);
				local230 += local74;
				local95 += local74;
			}
			if (local10 > local95) {
				@Pc(298) float local298 = (float) (local10 - local95) * this.aClass94_Sub2_Sub1_3.aFloat78 / (float) this.aClass94_Sub2_Sub1_3.anInt3664;
				OpenGL.glTexCoord2f(0.0F, this.aClass94_Sub2_Sub1_3.aFloat77);
				OpenGL.glVertex2i(local95, local87);
				OpenGL.glTexCoord2f(0.0F, local224);
				OpenGL.glVertex2i(local95, local20);
				OpenGL.glTexCoord2f(local298, local224);
				OpenGL.glVertex2i(local10, local20);
				OpenGL.glTexCoord2f(local298, this.aClass94_Sub2_Sub1_3.aFloat77);
				OpenGL.glVertex2i(local10, local87);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!gba", name = "c", descriptor = "()I")
	@Override
	public int method7451() {
		return this.anInt3341 + this.anInt3340 + this.aClass94_Sub2_Sub1_3.anInt3671;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3338 = arg0;
		this.anInt3340 = arg1;
		this.anInt3341 = arg3;
		this.anInt3337 = arg2;
		this.aBoolean244 = this.anInt3338 != 0 || this.anInt3340 != 0 || this.anInt3337 != 0 || this.anInt3341 != 0;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method7444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass94_Sub2_Sub1_3.method4012(false);
		this.aClass82_Sub1_20.method2060();
		this.aClass82_Sub1_20.method2085(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt3338;
		@Pc(42) int local42 = arg1 + this.anInt3340;
		if (this.aClass94_Sub2_Sub1_2 == null) {
			this.aClass82_Sub1_20.method2029(this.aClass94_Sub2_Sub1_3);
			this.aClass82_Sub1_20.method2068(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass94_Sub2_Sub1_3.aFloat77);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, this.aClass94_Sub2_Sub1_3.anInt3671 + local42);
			OpenGL.glTexCoord2f(this.aClass94_Sub2_Sub1_3.aFloat78, 0.0F);
			OpenGL.glVertex2i(this.aClass94_Sub2_Sub1_3.anInt3664 + local37, local42 - -this.aClass94_Sub2_Sub1_3.anInt3671);
			OpenGL.glTexCoord2f(this.aClass94_Sub2_Sub1_3.aFloat78, this.aClass94_Sub2_Sub1_3.aFloat77);
			OpenGL.glVertex2i(this.aClass94_Sub2_Sub1_3.anInt3664 + local37, local42);
			OpenGL.glEnd();
			return;
		}
		this.method2881(arg2);
		this.aClass94_Sub2_Sub1_2.method4012(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass94_Sub2_Sub1_3.aFloat77);
		OpenGL.glTexCoord2f(0.0F, this.aClass94_Sub2_Sub1_3.aFloat77);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, this.aClass94_Sub2_Sub1_3.anInt3671 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass94_Sub2_Sub1_3.aFloat78, 0.0F);
		OpenGL.glTexCoord2f(this.aClass94_Sub2_Sub1_3.aFloat78, 0.0F);
		OpenGL.glVertex2i(local37 + this.aClass94_Sub2_Sub1_3.anInt3664, local42 - -this.aClass94_Sub2_Sub1_3.anInt3671);
		OpenGL.glMultiTexCoord2f(33985, this.aClass94_Sub2_Sub1_3.aFloat78, this.aClass94_Sub2_Sub1_3.aFloat77);
		OpenGL.glTexCoord2f(this.aClass94_Sub2_Sub1_3.aFloat78, this.aClass94_Sub2_Sub1_3.aFloat77);
		OpenGL.glVertex2i(local37 + this.aClass94_Sub2_Sub1_3.anInt3664, local42);
		OpenGL.glEnd();
		this.method2877();
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method7457(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean244) {
			local6 = (float) this.method7454();
			local10 = (float) this.method7451();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(29) float local29 = (arg4 - arg0) / local10;
			@Pc(35) float local35 = (arg5 - arg1) / local10;
			@Pc(41) float local41 = local29 * (float) this.anInt3340;
			@Pc(47) float local47 = (float) this.anInt3340 * local35;
			@Pc(53) float local53 = local16 * (float) this.anInt3338;
			@Pc(59) float local59 = local22 * (float) this.anInt3338;
			@Pc(66) float local66 = -local16 * (float) this.anInt3337;
			@Pc(73) float local73 = (float) this.anInt3337 * -local22;
			@Pc(80) float local80 = (float) this.anInt3341 * -local29;
			arg1 = local59 + arg1 + local47;
			arg0 = arg0 + local53 + local41;
			arg2 = local41 + arg2 + local66;
			arg4 = arg4 + local53 + local80;
			arg3 = local47 + arg3 + local73;
			@Pc(117) float local117 = -local35 * (float) this.anInt3341;
			arg5 = local117 + local59 + arg5;
		}
		local6 = arg2 + arg4 - arg0;
		this.aClass94_Sub2_Sub1_3.method4012(true);
		local10 = arg3 + arg5 - arg1;
		this.aClass82_Sub1_20.method2060();
		this.aClass82_Sub1_20.method2029(this.aClass94_Sub2_Sub1_3);
		this.aClass82_Sub1_20.method2085(1);
		this.aClass82_Sub1_20.method2068(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass94_Sub2_Sub1_3.aFloat77);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass94_Sub2_Sub1_3.aFloat78, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass94_Sub2_Sub1_3.aFloat78, this.aClass94_Sub2_Sub1_3.aFloat77);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(III)V")
	@Override
	public void method7458(@OriginalArg(2) int arg0) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass94_Sub2_Sub1_2 = Static56.method1013(this.aClass82_Sub1_20, 0, this.aClass94_Sub2_Sub1_3.anInt3664, 0, this.aClass94_Sub2_Sub1_3.anInt3671);
		this.anInt3334 = arg0;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(II)V")
	private void method2881(@OriginalArg(1) int arg0) {
		this.aClass82_Sub1_20.method2086(1);
		this.aClass82_Sub1_20.method2029(this.aClass94_Sub2_Sub1_3);
		this.aClass82_Sub1_20.method2077(this.aClass82_Sub1_20.method2078(arg0), 7681);
		this.aClass82_Sub1_20.method2066(34167, 768, 1);
		this.aClass82_Sub1_20.method2063(34168, 0);
		this.aClass82_Sub1_20.method2086(0);
		this.aClass82_Sub1_20.method2029(this.aClass94_Sub2_Sub1_2);
		this.aClass82_Sub1_20.method2077(34479, 7681);
		this.aClass82_Sub1_20.method2066(34166, 768, 1);
		if (this.anInt3334 == 0) {
			this.aClass82_Sub1_20.method2087(0.5F, 0.0F, 0.5F, 1.0F);
		} else if (this.anInt3334 == 1) {
			this.aClass82_Sub1_20.method2087(0.5F, 0.0F, 1.0F, 0.5F);
		} else if (this.anInt3334 == 2) {
			this.aClass82_Sub1_20.method2087(1.0F, 0.0F, 0.5F, 0.5F);
			return;
		} else if (this.anInt3334 == 3) {
			this.aClass82_Sub1_20.method2087(128.5F, 0.0F, 128.5F, 128.5F);
			return;
		}
	}
}
