import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class57_Sub2 extends Class57 {

	@OriginalMember(owner = "client!ut", name = "h", descriptor = "Lclient!ps;")
	private Class6_Sub1_Sub1 aClass6_Sub1_Sub1_3;

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
	private int anInt6747 = 0;

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "Z")
	private boolean aBoolean608 = false;

	@OriginalMember(owner = "client!ut", name = "f", descriptor = "I")
	private int anInt6749 = 0;

	@OriginalMember(owner = "client!ut", name = "i", descriptor = "I")
	private int anInt6751 = 0;

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "I")
	private int anInt6750 = 0;

	@OriginalMember(owner = "client!ut", name = "w", descriptor = "I")
	private int anInt6763 = 0;

	@OriginalMember(owner = "client!ut", name = "v", descriptor = "Lclient!fd;")
	private final Class19_Sub2 aClass19_Sub2_39;

	@OriginalMember(owner = "client!ut", name = "o", descriptor = "Lclient!ps;")
	private final Class6_Sub1_Sub1 aClass6_Sub1_Sub1_4;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!fd;IIII)V")
	public Class57_Sub2(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass19_Sub2_39 = arg0;
		this.aClass6_Sub1_Sub1_4 = Static331.method4516(arg2, arg4, arg1, arg3, arg0);
	}

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!fd;II[III)V")
	public Class57_Sub2(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass19_Sub2_39 = arg0;
		this.aClass6_Sub1_Sub1_4 = Static388.method5095(arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(FFFFFFLclient!ma;II)V")
	@Override
	protected void method5535(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class145 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class6_Sub1_Sub1 local7 = ((Class145_Sub1) arg6).aClass6_Sub1_Sub1_5;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(32) float local32;
		if (this.aBoolean608) {
			local14 = this.j();
			local18 = this.T();
			local25 = (arg2 - arg0) / local14;
			local32 = (arg3 - arg1) / local14;
			@Pc(39) float local39 = (arg4 - arg0) / local18;
			@Pc(46) float local46 = (arg5 - arg1) / local18;
			@Pc(52) float local52 = (float) this.anInt6750 * local39;
			@Pc(58) float local58 = local46 * (float) this.anInt6750;
			@Pc(64) float local64 = (float) this.anInt6763 * local25;
			@Pc(70) float local70 = (float) this.anInt6763 * local32;
			@Pc(77) float local77 = -local25 * (float) this.anInt6747;
			@Pc(84) float local84 = -local32 * (float) this.anInt6747;
			@Pc(91) float local91 = -local39 * (float) this.anInt6751;
			arg1 = local70 + arg1 + local58;
			arg4 = local64 + arg4 + local91;
			arg2 = local52 + arg2 + local77;
			arg3 = local84 + arg3 + local58;
			arg0 = local64 + arg0 + local52;
			@Pc(128) float local128 = -local46 * (float) this.anInt6751;
			arg5 = local128 + local70 + arg5;
		}
		local14 = arg2 + arg4 - arg0;
		local18 = arg3 + arg5 - arg1;
		this.aClass6_Sub1_Sub1_4.method4181(true);
		this.aClass19_Sub2_39.method1930();
		this.aClass19_Sub2_39.method1905(this.aClass6_Sub1_Sub1_4);
		this.aClass19_Sub2_39.method1900(1);
		this.aClass19_Sub2_39.method1936(1);
		this.aClass19_Sub2_39.method1905(local7);
		this.aClass19_Sub2_39.method1912(7681, 8448);
		this.aClass19_Sub2_39.method1945(0, 768, 34168);
		this.aClass19_Sub2_39.method1958(1);
		local25 = local7.aFloat172 / (float) local7.anInt5470;
		local32 = local7.aFloat171 / (float) local7.anInt5474;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass6_Sub1_Sub1_4.aFloat171);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg0 - (float) arg7), local7.aFloat171 - local32 * ((float) -arg8 + arg1));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg4) * local25, local7.aFloat171 - (arg5 - (float) arg8) * local32);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass6_Sub1_Sub1_4.aFloat172, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + local14) * local25, local7.aFloat171 - ((float) -arg8 + local18) * local32);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass6_Sub1_Sub1_4.aFloat172, this.aClass6_Sub1_Sub1_4.aFloat171);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg2 - (float) arg7), local7.aFloat171 - local32 * ((float) -arg8 + arg3));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass19_Sub2_39.method1945(0, 768, 5890);
		this.aClass19_Sub2_39.method1900(0);
		this.aClass19_Sub2_39.method1905(null);
		this.aClass19_Sub2_39.method1936(0);
	}

	@OriginalMember(owner = "client!ut", name = "la", descriptor = "()I")
	@Override
	public int la() {
		return this.aClass6_Sub1_Sub1_4.anInt5470;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)V")
	private void method5291() {
		this.aClass19_Sub2_39.method1936(1);
		this.aClass19_Sub2_39.method1905(null);
		this.aClass19_Sub2_39.method1912(8448, 8448);
		this.aClass19_Sub2_39.method1945(1, 768, 34168);
		this.aClass19_Sub2_39.method1954(5890, 0);
		this.aClass19_Sub2_39.method1936(0);
		this.aClass19_Sub2_39.method1945(1, 768, 34168);
	}

	@OriginalMember(owner = "client!ut", name = "T", descriptor = "()I")
	@Override
	public int T() {
		return this.anInt6751 + this.anInt6750 + this.aClass6_Sub1_Sub1_4.anInt5474;
	}

	@OriginalMember(owner = "client!ut", name = "BA", descriptor = "(III)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass6_Sub1_Sub1_3 = Static331.method4516(arg1, this.aClass6_Sub1_Sub1_4.anInt5474, arg0, this.aClass6_Sub1_Sub1_4.anInt5470, this.aClass19_Sub2_39);
		this.anInt6749 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!ut", name = "j", descriptor = "()I")
	@Override
	public int j() {
		return this.anInt6747 + this.aClass6_Sub1_Sub1_4.anInt5470 + this.anInt6763;
	}

	@OriginalMember(owner = "client!ut", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		return this.aClass6_Sub1_Sub1_4.anInt5474;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected void a(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean608) {
			local10 = this.j();
			local14 = this.T();
			@Pc(20) float local20 = (arg2 - arg0) / local10;
			@Pc(26) float local26 = (arg3 - arg1) / local10;
			@Pc(32) float local32 = (arg4 - arg0) / local14;
			@Pc(39) float local39 = (arg5 - arg1) / local14;
			@Pc(45) float local45 = local32 * (float) this.anInt6750;
			@Pc(51) float local51 = (float) this.anInt6750 * local39;
			@Pc(57) float local57 = local20 * (float) this.anInt6763;
			@Pc(63) float local63 = local26 * (float) this.anInt6763;
			@Pc(70) float local70 = -local20 * (float) this.anInt6747;
			@Pc(77) float local77 = -local26 * (float) this.anInt6747;
			@Pc(84) float local84 = (float) this.anInt6751 * -local32;
			arg0 = arg0 + local57 + local45;
			arg1 = local63 + arg1 + local51;
			@Pc(103) float local103 = -local39 * (float) this.anInt6751;
			arg2 = arg2 + local70 + local45;
			arg4 = local57 + arg4 + local84;
			arg3 = arg3 + local77 + local51;
			arg5 = local103 + local63 + arg5;
		}
		local10 = arg4 + arg2 - arg0;
		local14 = arg3 + arg5 - arg1;
		this.aClass6_Sub1_Sub1_4.method4181(true);
		this.aClass19_Sub2_39.method1930();
		this.aClass19_Sub2_39.method1905(this.aClass6_Sub1_Sub1_4);
		this.aClass19_Sub2_39.method1958(arg8);
		this.aClass19_Sub2_39.method1900(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass6_Sub1_Sub1_4.aFloat171);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass6_Sub1_Sub1_4.aFloat172, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass6_Sub1_Sub1_4.aFloat172, this.aClass6_Sub1_Sub1_4.aFloat171);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IILclient!ma;II)V")
	@Override
	public void method5542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class145_Sub1 local6 = (Class145_Sub1) arg2;
		@Pc(9) Class6_Sub1_Sub1 local9 = local6.aClass6_Sub1_Sub1_5;
		this.aClass6_Sub1_Sub1_4.method4181(false);
		this.aClass19_Sub2_39.method1930();
		this.aClass19_Sub2_39.method1905(this.aClass6_Sub1_Sub1_4);
		this.aClass19_Sub2_39.method1900(1);
		this.aClass19_Sub2_39.method1936(1);
		this.aClass19_Sub2_39.method1905(local9);
		this.aClass19_Sub2_39.method1912(7681, 8448);
		this.aClass19_Sub2_39.method1945(0, 768, 34168);
		this.aClass19_Sub2_39.method1958(1);
		@Pc(62) int local62 = arg1 + this.anInt6750;
		@Pc(67) int local67 = arg0 + this.anInt6763;
		@Pc(74) int local74 = local67 + this.aClass6_Sub1_Sub1_4.anInt5470;
		@Pc(81) int local81 = local62 + this.aClass6_Sub1_Sub1_4.anInt5474;
		@Pc(88) float local88 = local9.aFloat172 / (float) local9.anInt5470;
		@Pc(95) float local95 = local9.aFloat171 / (float) local9.anInt5474;
		@Pc(102) float local102 = local88 * (float) (local67 - arg3);
		@Pc(110) float local110 = local88 * (float) (local74 - arg3);
		@Pc(121) float local121 = local9.aFloat171 - local95 * (float) (local62 - arg4);
		@Pc(132) float local132 = local9.aFloat171 - local95 * (float) (local81 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass6_Sub1_Sub1_4.aFloat171);
		OpenGL.glMultiTexCoord2f(33985, local102, local121);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local102, local132);
		OpenGL.glVertex2i(local67, local62 + this.aClass6_Sub1_Sub1_4.anInt5474);
		OpenGL.glMultiTexCoord2f(33984, this.aClass6_Sub1_Sub1_4.aFloat172, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local110, local132);
		OpenGL.glVertex2i(local67 + this.aClass6_Sub1_Sub1_4.anInt5470, local62 + this.aClass6_Sub1_Sub1_4.anInt5474);
		OpenGL.glMultiTexCoord2f(33984, this.aClass6_Sub1_Sub1_4.aFloat172, this.aClass6_Sub1_Sub1_4.aFloat171);
		OpenGL.glMultiTexCoord2f(33985, local110, local121);
		OpenGL.glVertex2i(local67 + this.aClass6_Sub1_Sub1_4.anInt5470, local62);
		OpenGL.glEnd();
		this.aClass19_Sub2_39.method1945(0, 768, 5890);
		this.aClass19_Sub2_39.method1900(0);
		this.aClass19_Sub2_39.method1905(null);
		this.aClass19_Sub2_39.method1936(0);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(BI)V")
	private void method5295(@OriginalArg(1) int arg0) {
		this.aClass19_Sub2_39.method1936(1);
		this.aClass19_Sub2_39.method1905(this.aClass6_Sub1_Sub1_4);
		this.aClass19_Sub2_39.method1912(this.aClass19_Sub2_39.method1962(arg0), 7681);
		this.aClass19_Sub2_39.method1945(1, 768, 34167);
		this.aClass19_Sub2_39.method1954(34168, 0);
		this.aClass19_Sub2_39.method1936(0);
		this.aClass19_Sub2_39.method1905(this.aClass6_Sub1_Sub1_3);
		this.aClass19_Sub2_39.method1912(34479, 7681);
		this.aClass19_Sub2_39.method1945(1, 768, 34166);
		if (this.anInt6749 == 0) {
			this.aClass19_Sub2_39.method1913(0.5F, 0.0F, 0.5F, 1.0F);
		} else if (this.anInt6749 == 1) {
			this.aClass19_Sub2_39.method1913(1.0F, 0.0F, 0.5F, 0.5F);
		} else if (this.anInt6749 == 2) {
			this.aClass19_Sub2_39.method1913(0.5F, 0.0F, 1.0F, 0.5F);
			return;
		} else if (this.anInt6749 == 3) {
			this.aClass19_Sub2_39.method1913(128.5F, 0.0F, 128.5F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!ut", name = "r", descriptor = "(IIIII)V")
	@Override
	public void r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass6_Sub1_Sub1_4.method4181(false);
		this.aClass19_Sub2_39.method1930();
		this.aClass19_Sub2_39.method1958(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt6750;
		@Pc(42) int local42 = arg0 + this.anInt6763;
		if (this.aClass6_Sub1_Sub1_3 == null) {
			this.aClass19_Sub2_39.method1905(this.aClass6_Sub1_Sub1_4);
			this.aClass19_Sub2_39.method1900(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass6_Sub1_Sub1_4.aFloat171);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, this.aClass6_Sub1_Sub1_4.anInt5474 + local37);
			OpenGL.glTexCoord2f(this.aClass6_Sub1_Sub1_4.aFloat172, 0.0F);
			OpenGL.glVertex2i(this.aClass6_Sub1_Sub1_4.anInt5470 + local42, this.aClass6_Sub1_Sub1_4.anInt5474 + local37);
			OpenGL.glTexCoord2f(this.aClass6_Sub1_Sub1_4.aFloat172, this.aClass6_Sub1_Sub1_4.aFloat171);
			OpenGL.glVertex2i(this.aClass6_Sub1_Sub1_4.anInt5470 + local42, local37);
			OpenGL.glEnd();
			return;
		}
		this.method5295(arg2);
		this.aClass6_Sub1_Sub1_3.method4181(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass6_Sub1_Sub1_4.aFloat171);
		OpenGL.glTexCoord2f(0.0F, this.aClass6_Sub1_Sub1_4.aFloat171);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, this.aClass6_Sub1_Sub1_4.anInt5474 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass6_Sub1_Sub1_4.aFloat172, 0.0F);
		OpenGL.glTexCoord2f(this.aClass6_Sub1_Sub1_4.aFloat172, 0.0F);
		OpenGL.glVertex2i(this.aClass6_Sub1_Sub1_4.anInt5470 + local42, local37 - -this.aClass6_Sub1_Sub1_4.anInt5474);
		OpenGL.glMultiTexCoord2f(33985, this.aClass6_Sub1_Sub1_4.aFloat172, this.aClass6_Sub1_Sub1_4.aFloat171);
		OpenGL.glTexCoord2f(this.aClass6_Sub1_Sub1_4.aFloat172, this.aClass6_Sub1_Sub1_4.aFloat171);
		OpenGL.glVertex2i(local42 + this.aClass6_Sub1_Sub1_4.anInt5470, local37);
		OpenGL.glEnd();
		this.method5291();
	}

	@OriginalMember(owner = "client!ut", name = "JA", descriptor = "(IIIIIII)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int local10 = arg0 + arg2;
		this.aClass6_Sub1_Sub1_4.method4181(false);
		@Pc(19) int local19 = arg1 + arg3;
		this.aClass19_Sub2_39.method1930();
		this.aClass19_Sub2_39.method1905(this.aClass6_Sub1_Sub1_4);
		this.aClass19_Sub2_39.method1958(arg6);
		this.aClass19_Sub2_39.method1900(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass6_Sub1_Sub1_4.aBoolean491 && !this.aBoolean608) {
			@Pc(73) float local73 = (float) arg3 * this.aClass6_Sub1_Sub1_4.aFloat171 / (float) this.aClass6_Sub1_Sub1_4.anInt5474;
			@Pc(85) float local85 = (float) arg2 * this.aClass6_Sub1_Sub1_4.aFloat172 / (float) this.aClass6_Sub1_Sub1_4.anInt5470;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local73);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local19);
			OpenGL.glTexCoord2f(local85, 0.0F);
			OpenGL.glVertex2i(local10, local19);
			OpenGL.glTexCoord2f(local85, local73);
			OpenGL.glVertex2i(local10, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt6763, (float) this.anInt6750, 0.0F);
		@Pc(125) int local125 = this.j();
		@Pc(128) int local128 = this.T();
		@Pc(135) int local135 = arg1 + this.aClass6_Sub1_Sub1_4.anInt5474;
		OpenGL.glBegin(7);
		@Pc(139) int local139 = arg1;
		@Pc(147) int local147;
		while (local135 <= local19) {
			local147 = this.aClass6_Sub1_Sub1_4.anInt5470 + arg0;
			@Pc(149) int local149 = arg0;
			while (local10 >= local147) {
				OpenGL.glTexCoord2f(0.0F, this.aClass6_Sub1_Sub1_4.aFloat171);
				OpenGL.glVertex2i(local149, local139);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local149, local135);
				OpenGL.glTexCoord2f(this.aClass6_Sub1_Sub1_4.aFloat172, 0.0F);
				OpenGL.glVertex2i(local147, local135);
				OpenGL.glTexCoord2f(this.aClass6_Sub1_Sub1_4.aFloat172, this.aClass6_Sub1_Sub1_4.aFloat171);
				OpenGL.glVertex2i(local147, local139);
				local149 += local125;
				local147 += local125;
			}
			if (local149 < local10) {
				@Pc(220) float local220 = this.aClass6_Sub1_Sub1_4.aFloat172 * (float) (local10 - local149) / (float) this.aClass6_Sub1_Sub1_4.anInt5470;
				OpenGL.glTexCoord2f(0.0F, this.aClass6_Sub1_Sub1_4.aFloat171);
				OpenGL.glVertex2i(local149, local139);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local149, local135);
				OpenGL.glTexCoord2f(local220, 0.0F);
				OpenGL.glVertex2i(local10, local135);
				OpenGL.glTexCoord2f(local220, this.aClass6_Sub1_Sub1_4.aFloat171);
				OpenGL.glVertex2i(local10, local139);
			}
			local139 += local128;
			local135 += local128;
		}
		if (local19 > local139) {
			@Pc(281) float local281 = (float) (local139 + this.aClass6_Sub1_Sub1_4.anInt5474 - local19) * this.aClass6_Sub1_Sub1_4.aFloat171 / (float) this.aClass6_Sub1_Sub1_4.anInt5474;
			@Pc(288) int local288 = arg0 + this.aClass6_Sub1_Sub1_4.anInt5470;
			local147 = arg0;
			while (local288 <= local10) {
				OpenGL.glTexCoord2f(0.0F, this.aClass6_Sub1_Sub1_4.aFloat171);
				OpenGL.glVertex2i(local147, local139);
				OpenGL.glTexCoord2f(0.0F, local281);
				OpenGL.glVertex2i(local147, local19);
				OpenGL.glTexCoord2f(this.aClass6_Sub1_Sub1_4.aFloat172, local281);
				OpenGL.glVertex2i(local288, local19);
				OpenGL.glTexCoord2f(this.aClass6_Sub1_Sub1_4.aFloat172, this.aClass6_Sub1_Sub1_4.aFloat171);
				OpenGL.glVertex2i(local288, local139);
				local288 += local125;
				local147 += local125;
			}
			if (local10 > local147) {
				@Pc(357) float local357 = this.aClass6_Sub1_Sub1_4.aFloat172 * (float) (local10 - local147) / (float) this.aClass6_Sub1_Sub1_4.anInt5470;
				OpenGL.glTexCoord2f(0.0F, this.aClass6_Sub1_Sub1_4.aFloat171);
				OpenGL.glVertex2i(local147, local139);
				OpenGL.glTexCoord2f(0.0F, local281);
				OpenGL.glVertex2i(local147, local19);
				OpenGL.glTexCoord2f(local357, local281);
				OpenGL.glVertex2i(local10, local19);
				OpenGL.glTexCoord2f(local357, this.aClass6_Sub1_Sub1_4.aFloat171);
				OpenGL.glVertex2i(local10, local139);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ut", name = "t", descriptor = "(IIIIII)V")
	@Override
	public void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass6_Sub1_Sub1_4.method4193(arg4, arg5, arg0, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!ut", name = "MA", descriptor = "(IIII)V")
	@Override
	public void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6751 = arg3;
		this.anInt6763 = arg0;
		this.anInt6747 = arg2;
		this.anInt6750 = arg1;
		this.aBoolean608 = this.anInt6763 != 0 || this.anInt6750 != 0 || this.anInt6747 != 0 || this.anInt6751 != 0;
	}

	@OriginalMember(owner = "client!ut", name = "s", descriptor = "(IIIIIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass6_Sub1_Sub1_4.method4181(true);
		this.aClass19_Sub2_39.method1930();
		this.aClass19_Sub2_39.method1958(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean608) {
			@Pc(182) float local182 = (float) arg2 / (float) this.j();
			@Pc(189) float local189 = (float) arg3 / (float) this.T();
			@Pc(198) float local198 = local182 * (float) this.anInt6763 + (float) arg0;
			@Pc(207) float local207 = (float) arg1 + local189 * (float) this.anInt6750;
			@Pc(216) float local216 = (float) this.aClass6_Sub1_Sub1_4.anInt5470 * local182 + local198;
			@Pc(225) float local225 = local207 + (float) this.aClass6_Sub1_Sub1_4.anInt5474 * local189;
			if (this.aClass6_Sub1_Sub1_3 == null) {
				this.aClass19_Sub2_39.method1905(this.aClass6_Sub1_Sub1_4);
				this.aClass19_Sub2_39.method1900(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass6_Sub1_Sub1_4.aFloat171);
				OpenGL.glVertex2f(local198, local207);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local198, local225);
				OpenGL.glTexCoord2f(this.aClass6_Sub1_Sub1_4.aFloat172, 0.0F);
				OpenGL.glVertex2f(local216, local225);
				OpenGL.glTexCoord2f(this.aClass6_Sub1_Sub1_4.aFloat172, this.aClass6_Sub1_Sub1_4.aFloat171);
				OpenGL.glVertex2f(local216, local207);
				OpenGL.glEnd();
			} else {
				this.method5295(arg4);
				this.aClass6_Sub1_Sub1_3.method4181(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass6_Sub1_Sub1_4.aFloat171);
				OpenGL.glTexCoord2f(0.0F, this.aClass6_Sub1_Sub1_4.aFloat171);
				OpenGL.glVertex2f(local198, local207);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local198, local225);
				OpenGL.glMultiTexCoord2f(33985, this.aClass6_Sub1_Sub1_4.aFloat172, 0.0F);
				OpenGL.glTexCoord2f(this.aClass6_Sub1_Sub1_4.aFloat172, 0.0F);
				OpenGL.glVertex2f(local216, local225);
				OpenGL.glMultiTexCoord2f(33985, this.aClass6_Sub1_Sub1_4.aFloat172, this.aClass6_Sub1_Sub1_4.aFloat171);
				OpenGL.glTexCoord2f(this.aClass6_Sub1_Sub1_4.aFloat172, this.aClass6_Sub1_Sub1_4.aFloat171);
				OpenGL.glVertex2f(local216, local207);
				OpenGL.glEnd();
				this.method5291();
			}
		} else if (this.aClass6_Sub1_Sub1_3 == null) {
			this.aClass19_Sub2_39.method1905(this.aClass6_Sub1_Sub1_4);
			this.aClass19_Sub2_39.method1900(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass6_Sub1_Sub1_4.aFloat171);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass6_Sub1_Sub1_4.aFloat172, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass6_Sub1_Sub1_4.aFloat172, this.aClass6_Sub1_Sub1_4.aFloat171);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method5295(arg4);
			this.aClass6_Sub1_Sub1_3.method4181(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass6_Sub1_Sub1_4.aFloat171);
			OpenGL.glTexCoord2f(0.0F, this.aClass6_Sub1_Sub1_4.aFloat171);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass6_Sub1_Sub1_4.aFloat172, 0.0F);
			OpenGL.glTexCoord2f(this.aClass6_Sub1_Sub1_4.aFloat172, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass6_Sub1_Sub1_4.aFloat172, this.aClass6_Sub1_Sub1_4.aFloat171);
			OpenGL.glTexCoord2f(this.aClass6_Sub1_Sub1_4.aFloat172, this.aClass6_Sub1_Sub1_4.aFloat171);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method5291();
		}
	}
}
