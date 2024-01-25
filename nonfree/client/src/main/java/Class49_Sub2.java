import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class49_Sub2 extends Class49 {

	@OriginalMember(owner = "client!ul", name = "C", descriptor = "[I")
	public static final int[] anIntArray470 = new int[256];

	@OriginalMember(owner = "client!ul", name = "s", descriptor = "Lclient!f;")
	private Class31_Sub1_Sub1 aClass31_Sub1_Sub1_3;

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
	private int anInt6883 = 0;

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
	private int anInt6889 = 0;

	@OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
	private int anInt6892 = 0;

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
	private int anInt6890 = 0;

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "Z")
	private boolean aBoolean462 = false;

	@OriginalMember(owner = "client!ul", name = "y", descriptor = "I")
	private int anInt6899 = 0;

	@OriginalMember(owner = "client!ul", name = "o", descriptor = "Lclient!tt;")
	private final Class200_Sub2 aClass200_Sub2_38;

	@OriginalMember(owner = "client!ul", name = "A", descriptor = "Lclient!f;")
	private final Class31_Sub1_Sub1 aClass31_Sub1_Sub1_4;

	static {
		for (@Pc(33) int local33 = 0; local33 < 256; local33++) {
			@Pc(36) int local36 = local33;
			for (@Pc(38) int local38 = 0; local38 < 8; local38++) {
				if ((local36 & 0x1) == 1) {
					local36 = local36 >>> 1 ^ 0xEDB88320;
				} else {
					local36 >>>= 0x1;
				}
			}
			anIntArray470[local33] = local36;
		}
	}

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!tt;IIII)V")
	public Class49_Sub2(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass200_Sub2_38 = arg0;
		this.aClass31_Sub1_Sub1_4 = Static26.method442(arg1, arg4, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!tt;II[III)V")
	public Class49_Sub2(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass200_Sub2_38 = arg0;
		this.aClass31_Sub1_Sub1_4 = Static200.method2685(arg1, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(FFFFFFLclient!ta;II)V")
	@Override
	protected void method5791(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class97 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class31_Sub1_Sub1 local7 = ((Class97_Sub2) arg6).aClass31_Sub1_Sub1_1;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(32) float local32;
		if (this.aBoolean462) {
			local14 = this.RA();
			local18 = this.Q();
			local25 = (arg2 - arg0) / local14;
			local32 = (arg3 - arg1) / local14;
			@Pc(38) float local38 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = local38 * (float) this.anInt6883;
			@Pc(56) float local56 = local44 * (float) this.anInt6883;
			@Pc(62) float local62 = (float) this.anInt6892 * local25;
			@Pc(68) float local68 = local32 * (float) this.anInt6892;
			@Pc(75) float local75 = (float) this.anInt6899 * -local25;
			@Pc(82) float local82 = -local32 * (float) this.anInt6899;
			@Pc(89) float local89 = (float) this.anInt6889 * -local38;
			arg3 = arg3 + local82 + local56;
			arg1 = local56 + arg1 + local68;
			arg4 = local62 + arg4 + local89;
			arg2 = local50 + local75 + arg2;
			@Pc(120) float local120 = -local44 * (float) this.anInt6889;
			arg0 = local50 + arg0 + local62;
			arg5 = local120 + local68 + arg5;
		}
		local14 = arg4 + arg2 - arg0;
		this.aClass31_Sub1_Sub1_4.method4591(true);
		local18 = arg3 + arg5 - arg1;
		this.aClass200_Sub2_38.method5321();
		this.aClass200_Sub2_38.method5312(this.aClass31_Sub1_Sub1_4);
		this.aClass200_Sub2_38.method5297(1);
		this.aClass200_Sub2_38.method5319(1);
		this.aClass200_Sub2_38.method5312(local7);
		this.aClass200_Sub2_38.method5304(7681, 8448);
		this.aClass200_Sub2_38.method5343(768, 34168, 0);
		this.aClass200_Sub2_38.method5295(1);
		local25 = local7.aFloat39 / (float) local7.anInt1876;
		local32 = local7.aFloat38 / (float) local7.anInt1877;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass31_Sub1_Sub1_4.aFloat38);
		OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * local25, local7.aFloat38 - local32 * ((float) -arg8 + arg1));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg4 - (float) arg7), local7.aFloat38 - (arg5 - (float) arg8) * local32);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass31_Sub1_Sub1_4.aFloat39, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + local14), local7.aFloat38 - (local18 - (float) arg8) * local32);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass31_Sub1_Sub1_4.aFloat39, this.aClass31_Sub1_Sub1_4.aFloat38);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg2) * local25, local7.aFloat38 - (arg3 - (float) arg8) * local32);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass200_Sub2_38.method5343(768, 5890, 0);
		this.aClass200_Sub2_38.method5297(0);
		this.aClass200_Sub2_38.method5312(null);
		this.aClass200_Sub2_38.method5319(0);
	}

	@OriginalMember(owner = "client!ul", name = "ya", descriptor = "(IIIIIII)V")
	@Override
	public void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass31_Sub1_Sub1_4.method4591(true);
		this.aClass200_Sub2_38.method5321();
		this.aClass200_Sub2_38.method5295(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean462) {
			@Pc(183) float local183 = (float) arg2 / (float) this.RA();
			@Pc(190) float local190 = (float) arg3 / (float) this.Q();
			@Pc(199) float local199 = (float) arg0 + local183 * (float) this.anInt6892;
			@Pc(208) float local208 = (float) arg1 + (float) this.anInt6883 * local190;
			@Pc(217) float local217 = local183 * (float) this.aClass31_Sub1_Sub1_4.anInt1876 + local199;
			@Pc(226) float local226 = local208 + local190 * (float) this.aClass31_Sub1_Sub1_4.anInt1877;
			if (this.aClass31_Sub1_Sub1_3 == null) {
				this.aClass200_Sub2_38.method5312(this.aClass31_Sub1_Sub1_4);
				this.aClass200_Sub2_38.method5297(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass31_Sub1_Sub1_4.aFloat38);
				OpenGL.glVertex2f(local199, local208);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local199, local226);
				OpenGL.glTexCoord2f(this.aClass31_Sub1_Sub1_4.aFloat39, 0.0F);
				OpenGL.glVertex2f(local217, local226);
				OpenGL.glTexCoord2f(this.aClass31_Sub1_Sub1_4.aFloat39, this.aClass31_Sub1_Sub1_4.aFloat38);
				OpenGL.glVertex2f(local217, local208);
				OpenGL.glEnd();
			} else {
				this.method5449(arg4);
				this.aClass31_Sub1_Sub1_3.method4591(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass31_Sub1_Sub1_4.aFloat38);
				OpenGL.glTexCoord2f(0.0F, this.aClass31_Sub1_Sub1_4.aFloat38);
				OpenGL.glVertex2f(local199, local208);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local199, local226);
				OpenGL.glMultiTexCoord2f(33985, this.aClass31_Sub1_Sub1_4.aFloat39, 0.0F);
				OpenGL.glTexCoord2f(this.aClass31_Sub1_Sub1_4.aFloat39, 0.0F);
				OpenGL.glVertex2f(local217, local226);
				OpenGL.glMultiTexCoord2f(33985, this.aClass31_Sub1_Sub1_4.aFloat39, this.aClass31_Sub1_Sub1_4.aFloat38);
				OpenGL.glTexCoord2f(this.aClass31_Sub1_Sub1_4.aFloat39, this.aClass31_Sub1_Sub1_4.aFloat38);
				OpenGL.glVertex2f(local217, local208);
				OpenGL.glEnd();
				this.method5448();
			}
		} else if (this.aClass31_Sub1_Sub1_3 == null) {
			this.aClass200_Sub2_38.method5312(this.aClass31_Sub1_Sub1_4);
			this.aClass200_Sub2_38.method5297(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass31_Sub1_Sub1_4.aFloat38);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass31_Sub1_Sub1_4.aFloat39, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass31_Sub1_Sub1_4.aFloat39, this.aClass31_Sub1_Sub1_4.aFloat38);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method5449(arg4);
			this.aClass31_Sub1_Sub1_3.method4591(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass31_Sub1_Sub1_4.aFloat38);
			OpenGL.glTexCoord2f(0.0F, this.aClass31_Sub1_Sub1_4.aFloat38);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass31_Sub1_Sub1_4.aFloat39, 0.0F);
			OpenGL.glTexCoord2f(this.aClass31_Sub1_Sub1_4.aFloat39, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass31_Sub1_Sub1_4.aFloat39, this.aClass31_Sub1_Sub1_4.aFloat38);
			OpenGL.glTexCoord2f(this.aClass31_Sub1_Sub1_4.aFloat39, this.aClass31_Sub1_Sub1_4.aFloat38);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method5448();
		}
	}

	@OriginalMember(owner = "client!ul", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		return this.aClass31_Sub1_Sub1_4.anInt1877;
	}

	@OriginalMember(owner = "client!ul", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return this.aClass31_Sub1_Sub1_4.anInt1876;
	}

	@OriginalMember(owner = "client!ul", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		return this.anInt6892 + this.aClass31_Sub1_Sub1_4.anInt1876 + this.anInt6899;
	}

	@OriginalMember(owner = "client!ul", name = "W", descriptor = "(IIIII)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass31_Sub1_Sub1_4.method4591(false);
		this.aClass200_Sub2_38.method5321();
		this.aClass200_Sub2_38.method5295(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt6892;
		@Pc(42) int local42 = arg1 + this.anInt6883;
		if (this.aClass31_Sub1_Sub1_3 == null) {
			this.aClass200_Sub2_38.method5312(this.aClass31_Sub1_Sub1_4);
			this.aClass200_Sub2_38.method5297(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass31_Sub1_Sub1_4.aFloat38);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, this.aClass31_Sub1_Sub1_4.anInt1877 + local42);
			OpenGL.glTexCoord2f(this.aClass31_Sub1_Sub1_4.aFloat39, 0.0F);
			OpenGL.glVertex2i(this.aClass31_Sub1_Sub1_4.anInt1876 + local37, local42 + this.aClass31_Sub1_Sub1_4.anInt1877);
			OpenGL.glTexCoord2f(this.aClass31_Sub1_Sub1_4.aFloat39, this.aClass31_Sub1_Sub1_4.aFloat38);
			OpenGL.glVertex2i(local37 + this.aClass31_Sub1_Sub1_4.anInt1876, local42);
			OpenGL.glEnd();
			return;
		}
		this.method5449(arg2);
		this.aClass31_Sub1_Sub1_3.method4591(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass31_Sub1_Sub1_4.aFloat38);
		OpenGL.glTexCoord2f(0.0F, this.aClass31_Sub1_Sub1_4.aFloat38);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, this.aClass31_Sub1_Sub1_4.anInt1877 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass31_Sub1_Sub1_4.aFloat39, 0.0F);
		OpenGL.glTexCoord2f(this.aClass31_Sub1_Sub1_4.aFloat39, 0.0F);
		OpenGL.glVertex2i(this.aClass31_Sub1_Sub1_4.anInt1876 + local37, local42 + this.aClass31_Sub1_Sub1_4.anInt1877);
		OpenGL.glMultiTexCoord2f(33985, this.aClass31_Sub1_Sub1_4.aFloat39, this.aClass31_Sub1_Sub1_4.aFloat38);
		OpenGL.glTexCoord2f(this.aClass31_Sub1_Sub1_4.aFloat39, this.aClass31_Sub1_Sub1_4.aFloat38);
		OpenGL.glVertex2i(local37 + this.aClass31_Sub1_Sub1_4.anInt1876, local42);
		OpenGL.glEnd();
		this.method5448();
	}

	@OriginalMember(owner = "client!ul", name = "XA", descriptor = "(IIIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass31_Sub1_Sub1_4.method1523(arg0, arg2, arg5, arg1, arg4, arg3);
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V")
	private void method5448() {
		this.aClass200_Sub2_38.method5319(1);
		this.aClass200_Sub2_38.method5312(null);
		this.aClass200_Sub2_38.method5304(8448, 8448);
		this.aClass200_Sub2_38.method5343(768, 34168, 1);
		this.aClass200_Sub2_38.method5341(5890, 0);
		this.aClass200_Sub2_38.method5319(0);
		this.aClass200_Sub2_38.method5343(768, 34168, 1);
	}

	@OriginalMember(owner = "client!ul", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass31_Sub1_Sub1_3 = Static26.method442(arg0, this.aClass31_Sub1_Sub1_4.anInt1877, this.aClass31_Sub1_Sub1_4.anInt1876, arg1, this.aClass200_Sub2_38);
		this.anInt6890 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!ul", name = "H", descriptor = "(FFFFFFIII)V")
	@Override
	protected void H(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean462) {
			local6 = this.RA();
			local10 = this.Q();
			@Pc(17) float local17 = (arg2 - arg0) / local6;
			@Pc(23) float local23 = (arg3 - arg1) / local6;
			@Pc(30) float local30 = (arg4 - arg0) / local10;
			@Pc(37) float local37 = (arg5 - arg1) / local10;
			@Pc(43) float local43 = local30 * (float) this.anInt6883;
			@Pc(49) float local49 = (float) this.anInt6883 * local37;
			@Pc(55) float local55 = (float) this.anInt6892 * local17;
			@Pc(61) float local61 = local23 * (float) this.anInt6892;
			@Pc(68) float local68 = -local17 * (float) this.anInt6899;
			@Pc(75) float local75 = -local23 * (float) this.anInt6899;
			@Pc(82) float local82 = (float) this.anInt6889 * -local30;
			arg4 = local82 + local55 + arg4;
			arg1 = local49 + local61 + arg1;
			arg3 = local49 + local75 + arg3;
			arg2 = arg2 + local68 + local43;
			arg0 = local55 + arg0 + local43;
			@Pc(119) float local119 = -local37 * (float) this.anInt6889;
			arg5 = local119 + arg5 + local61;
		}
		local6 = arg2 + arg4 - arg0;
		this.aClass31_Sub1_Sub1_4.method4591(true);
		local10 = arg3 + arg5 - arg1;
		this.aClass200_Sub2_38.method5321();
		this.aClass200_Sub2_38.method5312(this.aClass31_Sub1_Sub1_4);
		this.aClass200_Sub2_38.method5295(arg8);
		this.aClass200_Sub2_38.method5297(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass31_Sub1_Sub1_4.aFloat38);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass31_Sub1_Sub1_4.aFloat39, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass31_Sub1_Sub1_4.aFloat39, this.aClass31_Sub1_Sub1_4.aFloat38);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ul", name = "ha", descriptor = "(IIII)V")
	@Override
	public void ha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6883 = arg1;
		this.anInt6889 = arg3;
		this.anInt6899 = arg2;
		this.anInt6892 = arg0;
		this.aBoolean462 = this.anInt6892 != 0 || this.anInt6883 != 0 || this.anInt6899 != 0 || this.anInt6889 != 0;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)V")
	private void method5449(@OriginalArg(0) int arg0) {
		this.aClass200_Sub2_38.method5319(1);
		this.aClass200_Sub2_38.method5312(this.aClass31_Sub1_Sub1_4);
		this.aClass200_Sub2_38.method5304(this.aClass200_Sub2_38.method5299(arg0), 7681);
		this.aClass200_Sub2_38.method5343(768, 34167, 1);
		this.aClass200_Sub2_38.method5341(34168, 0);
		this.aClass200_Sub2_38.method5319(0);
		this.aClass200_Sub2_38.method5312(this.aClass31_Sub1_Sub1_3);
		this.aClass200_Sub2_38.method5304(34479, 7681);
		this.aClass200_Sub2_38.method5343(768, 34166, 1);
		if (this.anInt6890 == 0) {
			this.aClass200_Sub2_38.method5272(0.5F, 1.0F, 0.0F, 0.5F);
		} else if (this.anInt6890 == 1) {
			this.aClass200_Sub2_38.method5272(0.5F, 0.5F, 0.0F, 1.0F);
		} else if (this.anInt6890 == 2) {
			this.aClass200_Sub2_38.method5272(1.0F, 0.5F, 0.0F, 0.5F);
		} else if (this.anInt6890 == 3) {
			this.aClass200_Sub2_38.method5272(128.5F, 128.5F, 0.0F, 128.5F);
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IILclient!ta;II)V")
	@Override
	public void method5790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class97_Sub2 local6 = (Class97_Sub2) arg2;
		@Pc(9) Class31_Sub1_Sub1 local9 = local6.aClass31_Sub1_Sub1_1;
		this.aClass31_Sub1_Sub1_4.method4591(false);
		this.aClass200_Sub2_38.method5321();
		this.aClass200_Sub2_38.method5312(this.aClass31_Sub1_Sub1_4);
		this.aClass200_Sub2_38.method5297(1);
		this.aClass200_Sub2_38.method5319(1);
		this.aClass200_Sub2_38.method5312(local9);
		this.aClass200_Sub2_38.method5304(7681, 8448);
		this.aClass200_Sub2_38.method5343(768, 34168, 0);
		this.aClass200_Sub2_38.method5295(1);
		@Pc(62) int local62 = arg1 + this.anInt6883;
		@Pc(67) int local67 = arg0 + this.anInt6892;
		@Pc(74) int local74 = local67 + this.aClass31_Sub1_Sub1_4.anInt1876;
		@Pc(80) int local80 = this.aClass31_Sub1_Sub1_4.anInt1877 + local62;
		@Pc(87) float local87 = local9.aFloat39 / (float) local9.anInt1876;
		@Pc(94) float local94 = local9.aFloat38 / (float) local9.anInt1877;
		@Pc(101) float local101 = (float) (local67 - arg3) * local87;
		@Pc(109) float local109 = local87 * (float) (local74 - arg3);
		@Pc(120) float local120 = local9.aFloat38 - local94 * (float) (local62 - arg4);
		@Pc(131) float local131 = local9.aFloat38 - (float) (local80 - arg4) * local94;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass31_Sub1_Sub1_4.aFloat38);
		OpenGL.glMultiTexCoord2f(33985, local101, local120);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local131);
		OpenGL.glVertex2i(local67, this.aClass31_Sub1_Sub1_4.anInt1877 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass31_Sub1_Sub1_4.aFloat39, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local131);
		OpenGL.glVertex2i(local67 + this.aClass31_Sub1_Sub1_4.anInt1876, this.aClass31_Sub1_Sub1_4.anInt1877 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass31_Sub1_Sub1_4.aFloat39, this.aClass31_Sub1_Sub1_4.aFloat38);
		OpenGL.glMultiTexCoord2f(33985, local109, local120);
		OpenGL.glVertex2i(this.aClass31_Sub1_Sub1_4.anInt1876 + local67, local62);
		OpenGL.glEnd();
		this.aClass200_Sub2_38.method5343(768, 5890, 0);
		this.aClass200_Sub2_38.method5297(0);
		this.aClass200_Sub2_38.method5312(null);
		this.aClass200_Sub2_38.method5319(0);
	}

	@OriginalMember(owner = "client!ul", name = "Q", descriptor = "()I")
	@Override
	public int Q() {
		return this.anInt6883 + this.aClass31_Sub1_Sub1_4.anInt1877 + this.anInt6889;
	}

	@OriginalMember(owner = "client!ul", name = "la", descriptor = "(IIIIIII)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		@Pc(14) int local14 = arg1 + arg3;
		this.aClass31_Sub1_Sub1_4.method4591(false);
		this.aClass200_Sub2_38.method5321();
		this.aClass200_Sub2_38.method5312(this.aClass31_Sub1_Sub1_4);
		this.aClass200_Sub2_38.method5295(arg6);
		this.aClass200_Sub2_38.method5297(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass31_Sub1_Sub1_4.aBoolean133 && !this.aBoolean462) {
			@Pc(346) float local346 = this.aClass31_Sub1_Sub1_4.aFloat38 * (float) arg3 / (float) this.aClass31_Sub1_Sub1_4.anInt1877;
			@Pc(358) float local358 = this.aClass31_Sub1_Sub1_4.aFloat39 * (float) arg2 / (float) this.aClass31_Sub1_Sub1_4.anInt1876;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local346);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local14);
			OpenGL.glTexCoord2f(local358, 0.0F);
			OpenGL.glVertex2i(local9, local14);
			OpenGL.glTexCoord2f(local358, local346);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt6892, (float) this.anInt6883, 0.0F);
		@Pc(73) int local73 = this.RA();
		@Pc(76) int local76 = this.Q();
		@Pc(83) int local83 = arg1 + this.aClass31_Sub1_Sub1_4.anInt1877;
		OpenGL.glBegin(7);
		@Pc(87) int local87 = arg1;
		@Pc(95) int local95;
		while (local83 <= local14) {
			local95 = arg0 + this.aClass31_Sub1_Sub1_4.anInt1876;
			@Pc(97) int local97 = arg0;
			while (local9 >= local95) {
				OpenGL.glTexCoord2f(0.0F, this.aClass31_Sub1_Sub1_4.aFloat38);
				OpenGL.glVertex2i(local97, local87);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local97, local83);
				OpenGL.glTexCoord2f(this.aClass31_Sub1_Sub1_4.aFloat39, 0.0F);
				OpenGL.glVertex2i(local95, local83);
				OpenGL.glTexCoord2f(this.aClass31_Sub1_Sub1_4.aFloat39, this.aClass31_Sub1_Sub1_4.aFloat38);
				OpenGL.glVertex2i(local95, local87);
				local97 += local73;
				local95 += local73;
			}
			if (local9 > local97) {
				@Pc(164) float local164 = this.aClass31_Sub1_Sub1_4.aFloat39 * (float) (local9 - local97) / (float) this.aClass31_Sub1_Sub1_4.anInt1876;
				OpenGL.glTexCoord2f(0.0F, this.aClass31_Sub1_Sub1_4.aFloat38);
				OpenGL.glVertex2i(local97, local87);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local97, local83);
				OpenGL.glTexCoord2f(local164, 0.0F);
				OpenGL.glVertex2i(local9, local83);
				OpenGL.glTexCoord2f(local164, this.aClass31_Sub1_Sub1_4.aFloat38);
				OpenGL.glVertex2i(local9, local87);
			}
			local87 += local76;
			local83 += local76;
		}
		if (local14 > local87) {
			@Pc(229) float local229 = (float) (this.aClass31_Sub1_Sub1_4.anInt1877 + local87 - local14) * this.aClass31_Sub1_Sub1_4.aFloat38 / (float) this.aClass31_Sub1_Sub1_4.anInt1877;
			@Pc(235) int local235 = this.aClass31_Sub1_Sub1_4.anInt1876 + arg0;
			local95 = arg0;
			while (local235 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass31_Sub1_Sub1_4.aFloat38);
				OpenGL.glVertex2i(local95, local87);
				OpenGL.glTexCoord2f(0.0F, local229);
				OpenGL.glVertex2i(local95, local14);
				OpenGL.glTexCoord2f(this.aClass31_Sub1_Sub1_4.aFloat39, local229);
				OpenGL.glVertex2i(local235, local14);
				OpenGL.glTexCoord2f(this.aClass31_Sub1_Sub1_4.aFloat39, this.aClass31_Sub1_Sub1_4.aFloat38);
				OpenGL.glVertex2i(local235, local87);
				local95 += local73;
				local235 += local73;
			}
			if (local9 > local95) {
				@Pc(303) float local303 = (float) (local9 - local95) * this.aClass31_Sub1_Sub1_4.aFloat39 / (float) this.aClass31_Sub1_Sub1_4.anInt1876;
				OpenGL.glTexCoord2f(0.0F, this.aClass31_Sub1_Sub1_4.aFloat38);
				OpenGL.glVertex2i(local95, local87);
				OpenGL.glTexCoord2f(0.0F, local229);
				OpenGL.glVertex2i(local95, local14);
				OpenGL.glTexCoord2f(local303, local229);
				OpenGL.glVertex2i(local9, local14);
				OpenGL.glTexCoord2f(local303, this.aClass31_Sub1_Sub1_4.aFloat38);
				OpenGL.glVertex2i(local9, local87);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}
}
