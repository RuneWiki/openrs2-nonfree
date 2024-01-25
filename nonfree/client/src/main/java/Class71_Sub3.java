import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class71_Sub3 extends Class71 {

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "Lclient!an;")
	private Class16_Sub1_Sub1 aClass16_Sub1_Sub1_5;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
	private int anInt6645 = 0;

	@OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
	private int anInt6662 = 0;

	@OriginalMember(owner = "client!oc", name = "B", descriptor = "I")
	private int anInt6664 = 0;

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "Z")
	private boolean aBoolean463 = false;

	@OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
	private int anInt6658 = 0;

	@OriginalMember(owner = "client!oc", name = "G", descriptor = "I")
	private int anInt6668 = 0;

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "Lclient!en;")
	private final Class90_Sub1 aClass90_Sub1_29;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "Lclient!an;")
	private final Class16_Sub1_Sub1 aClass16_Sub1_Sub1_4;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!en;IIII)V")
	public Class71_Sub3(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass90_Sub1_29 = arg0;
		this.aClass16_Sub1_Sub1_4 = Static193.method3264(arg0, arg3, arg1, arg4, arg2);
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!en;II[III)V")
	public Class71_Sub3(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass90_Sub1_29 = arg0;
		this.aClass16_Sub1_Sub1_4 = Static328.method5048(arg2, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!oc", name = "ba", descriptor = "(IIIIIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg0 + arg2;
		this.aClass16_Sub1_Sub1_4.method7843(false);
		@Pc(19) int local19 = arg1 + arg3;
		this.aClass90_Sub1_29.method2130();
		this.aClass90_Sub1_29.method2126(this.aClass16_Sub1_Sub1_4);
		this.aClass90_Sub1_29.method2090(arg6);
		this.aClass90_Sub1_29.method2123(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass16_Sub1_Sub1_4.aBoolean23 && !this.aBoolean463) {
			@Pc(359) float local359 = (float) arg3 * this.aClass16_Sub1_Sub1_4.aFloat16 / (float) this.aClass16_Sub1_Sub1_4.anInt355;
			@Pc(371) float local371 = this.aClass16_Sub1_Sub1_4.aFloat15 * (float) arg2 / (float) this.aClass16_Sub1_Sub1_4.anInt356;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local359);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local19);
			OpenGL.glTexCoord2f(local371, 0.0F);
			OpenGL.glVertex2i(local9, local19);
			OpenGL.glTexCoord2f(local371, local359);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt6658, (float) this.anInt6645, 0.0F);
		@Pc(73) int local73 = this.AA();
		@Pc(76) int local76 = this.a();
		@Pc(82) int local82 = arg1 + this.aClass16_Sub1_Sub1_4.anInt355;
		OpenGL.glBegin(7);
		@Pc(86) int local86 = arg1;
		@Pc(95) int local95;
		while (local82 <= local19) {
			local95 = arg0 + this.aClass16_Sub1_Sub1_4.anInt356;
			@Pc(97) int local97 = arg0;
			while (local95 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass16_Sub1_Sub1_4.aFloat16);
				OpenGL.glVertex2i(local97, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local97, local82);
				OpenGL.glTexCoord2f(this.aClass16_Sub1_Sub1_4.aFloat15, 0.0F);
				OpenGL.glVertex2i(local95, local82);
				OpenGL.glTexCoord2f(this.aClass16_Sub1_Sub1_4.aFloat15, this.aClass16_Sub1_Sub1_4.aFloat16);
				OpenGL.glVertex2i(local95, local86);
				local97 += local73;
				local95 += local73;
			}
			if (local97 < local9) {
				@Pc(168) float local168 = this.aClass16_Sub1_Sub1_4.aFloat15 * (float) (local9 - local97) / (float) this.aClass16_Sub1_Sub1_4.anInt356;
				OpenGL.glTexCoord2f(0.0F, this.aClass16_Sub1_Sub1_4.aFloat16);
				OpenGL.glVertex2i(local97, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local97, local82);
				OpenGL.glTexCoord2f(local168, 0.0F);
				OpenGL.glVertex2i(local9, local82);
				OpenGL.glTexCoord2f(local168, this.aClass16_Sub1_Sub1_4.aFloat16);
				OpenGL.glVertex2i(local9, local86);
			}
			local82 += local76;
			local86 += local76;
		}
		if (local19 > local86) {
			@Pc(237) float local237 = (float) (local86 + this.aClass16_Sub1_Sub1_4.anInt355 - local19) * this.aClass16_Sub1_Sub1_4.aFloat16 / (float) this.aClass16_Sub1_Sub1_4.anInt355;
			@Pc(243) int local243 = this.aClass16_Sub1_Sub1_4.anInt356 + arg0;
			local95 = arg0;
			while (local9 >= local243) {
				OpenGL.glTexCoord2f(0.0F, this.aClass16_Sub1_Sub1_4.aFloat16);
				OpenGL.glVertex2i(local95, local86);
				OpenGL.glTexCoord2f(0.0F, local237);
				OpenGL.glVertex2i(local95, local19);
				OpenGL.glTexCoord2f(this.aClass16_Sub1_Sub1_4.aFloat15, local237);
				OpenGL.glVertex2i(local243, local19);
				OpenGL.glTexCoord2f(this.aClass16_Sub1_Sub1_4.aFloat15, this.aClass16_Sub1_Sub1_4.aFloat16);
				OpenGL.glVertex2i(local243, local86);
				local243 += local73;
				local95 += local73;
			}
			if (local95 < local9) {
				@Pc(316) float local316 = this.aClass16_Sub1_Sub1_4.aFloat15 * (float) (local9 - local95) / (float) this.aClass16_Sub1_Sub1_4.anInt356;
				OpenGL.glTexCoord2f(0.0F, this.aClass16_Sub1_Sub1_4.aFloat16);
				OpenGL.glVertex2i(local95, local86);
				OpenGL.glTexCoord2f(0.0F, local237);
				OpenGL.glVertex2i(local95, local19);
				OpenGL.glTexCoord2f(local316, local237);
				OpenGL.glVertex2i(local9, local19);
				OpenGL.glTexCoord2f(local316, this.aClass16_Sub1_Sub1_4.aFloat16);
				OpenGL.glVertex2i(local9, local86);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!oc", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.aClass16_Sub1_Sub1_4.anInt356 + this.anInt6658 + this.anInt6664;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILclient!fa;II)V")
	@Override
	public void method7769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class17_Sub1 local6 = (Class17_Sub1) arg2;
		@Pc(9) Class16_Sub1_Sub1 local9 = local6.aClass16_Sub1_Sub1_1;
		this.aClass16_Sub1_Sub1_4.method7843(false);
		this.aClass90_Sub1_29.method2130();
		this.aClass90_Sub1_29.method2126(this.aClass16_Sub1_Sub1_4);
		this.aClass90_Sub1_29.method2123(1);
		this.aClass90_Sub1_29.method2069(1);
		this.aClass90_Sub1_29.method2126(local9);
		this.aClass90_Sub1_29.method2120(8448, 7681);
		this.aClass90_Sub1_29.method2119(0, 768, 34168);
		this.aClass90_Sub1_29.method2090(1);
		@Pc(62) int local62 = arg0 + this.anInt6658;
		@Pc(67) int local67 = arg1 + this.anInt6645;
		@Pc(74) int local74 = local62 + this.aClass16_Sub1_Sub1_4.anInt356;
		@Pc(80) int local80 = this.aClass16_Sub1_Sub1_4.anInt355 + local67;
		@Pc(87) float local87 = local9.aFloat15 / (float) local9.anInt356;
		@Pc(94) float local94 = local9.aFloat16 / (float) local9.anInt355;
		@Pc(102) float local102 = (float) (local62 - arg3) * local87;
		@Pc(110) float local110 = (float) (local74 - arg3) * local87;
		@Pc(121) float local121 = local9.aFloat16 - (float) (local67 - arg4) * local94;
		@Pc(132) float local132 = local9.aFloat16 - (float) (local80 - arg4) * local94;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass16_Sub1_Sub1_4.aFloat16);
		OpenGL.glMultiTexCoord2f(33985, local102, local121);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local102, local132);
		OpenGL.glVertex2i(local62, local67 + this.aClass16_Sub1_Sub1_4.anInt355);
		OpenGL.glMultiTexCoord2f(33984, this.aClass16_Sub1_Sub1_4.aFloat15, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local110, local132);
		OpenGL.glVertex2i(local62 + this.aClass16_Sub1_Sub1_4.anInt356, local67 - -this.aClass16_Sub1_Sub1_4.anInt355);
		OpenGL.glMultiTexCoord2f(33984, this.aClass16_Sub1_Sub1_4.aFloat15, this.aClass16_Sub1_Sub1_4.aFloat16);
		OpenGL.glMultiTexCoord2f(33985, local110, local121);
		OpenGL.glVertex2i(local62 + this.aClass16_Sub1_Sub1_4.anInt356, local67);
		OpenGL.glEnd();
		this.aClass90_Sub1_29.method2119(0, 768, 5890);
		this.aClass90_Sub1_29.method2123(0);
		this.aClass90_Sub1_29.method2126(null);
		this.aClass90_Sub1_29.method2069(0);
	}

	@OriginalMember(owner = "client!oc", name = "sa", descriptor = "(FFFFFFIII)V")
	@Override
	protected void sa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean463) {
			local6 = this.AA();
			local10 = this.a();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(28) float local28 = (arg4 - arg0) / local10;
			@Pc(34) float local34 = (arg5 - arg1) / local10;
			@Pc(40) float local40 = local28 * (float) this.anInt6645;
			@Pc(46) float local46 = local34 * (float) this.anInt6645;
			@Pc(52) float local52 = local16 * (float) this.anInt6658;
			@Pc(58) float local58 = local22 * (float) this.anInt6658;
			@Pc(65) float local65 = -local16 * (float) this.anInt6664;
			@Pc(72) float local72 = -local22 * (float) this.anInt6664;
			@Pc(79) float local79 = -local28 * (float) this.anInt6668;
			arg4 = local79 + local52 + arg4;
			arg1 = local58 + arg1 + local46;
			arg0 = local52 + arg0 + local40;
			@Pc(104) float local104 = -local34 * (float) this.anInt6668;
			arg3 = arg3 + local72 + local46;
			arg2 = arg2 + local65 + local40;
			arg5 = local104 + local58 + arg5;
		}
		local6 = arg4 + arg2 - arg0;
		this.aClass16_Sub1_Sub1_4.method7843(true);
		local10 = arg3 + arg5 - arg1;
		this.aClass90_Sub1_29.method2130();
		this.aClass90_Sub1_29.method2126(this.aClass16_Sub1_Sub1_4);
		this.aClass90_Sub1_29.method2090(arg8);
		this.aClass90_Sub1_29.method2123(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass16_Sub1_Sub1_4.aFloat16);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass16_Sub1_Sub1_4.aFloat15, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass16_Sub1_Sub1_4.aFloat15, this.aClass16_Sub1_Sub1_4.aFloat16);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!oc", name = "I", descriptor = "(IIIII)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass16_Sub1_Sub1_4.method7843(false);
		this.aClass90_Sub1_29.method2130();
		this.aClass90_Sub1_29.method2090(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt6658;
		@Pc(42) int local42 = arg1 + this.anInt6645;
		if (this.aClass16_Sub1_Sub1_5 == null) {
			this.aClass90_Sub1_29.method2126(this.aClass16_Sub1_Sub1_4);
			this.aClass90_Sub1_29.method2123(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass16_Sub1_Sub1_4.aFloat16);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, local42 + this.aClass16_Sub1_Sub1_4.anInt355);
			OpenGL.glTexCoord2f(this.aClass16_Sub1_Sub1_4.aFloat15, 0.0F);
			OpenGL.glVertex2i(this.aClass16_Sub1_Sub1_4.anInt356 + local37, this.aClass16_Sub1_Sub1_4.anInt355 + local42);
			OpenGL.glTexCoord2f(this.aClass16_Sub1_Sub1_4.aFloat15, this.aClass16_Sub1_Sub1_4.aFloat16);
			OpenGL.glVertex2i(this.aClass16_Sub1_Sub1_4.anInt356 + local37, local42);
			OpenGL.glEnd();
			return;
		}
		this.method5390(arg2);
		this.aClass16_Sub1_Sub1_5.method7843(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass16_Sub1_Sub1_4.aFloat16);
		OpenGL.glTexCoord2f(0.0F, this.aClass16_Sub1_Sub1_4.aFloat16);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, local42 + this.aClass16_Sub1_Sub1_4.anInt355);
		OpenGL.glMultiTexCoord2f(33985, this.aClass16_Sub1_Sub1_4.aFloat15, 0.0F);
		OpenGL.glTexCoord2f(this.aClass16_Sub1_Sub1_4.aFloat15, 0.0F);
		OpenGL.glVertex2i(local37 + this.aClass16_Sub1_Sub1_4.anInt356, local42 - -this.aClass16_Sub1_Sub1_4.anInt355);
		OpenGL.glMultiTexCoord2f(33985, this.aClass16_Sub1_Sub1_4.aFloat15, this.aClass16_Sub1_Sub1_4.aFloat16);
		OpenGL.glTexCoord2f(this.aClass16_Sub1_Sub1_4.aFloat15, this.aClass16_Sub1_Sub1_4.aFloat16);
		OpenGL.glVertex2i(local37 + this.aClass16_Sub1_Sub1_4.anInt356, local42);
		OpenGL.glEnd();
		this.method5388();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "()I")
	@Override
	public int a() {
		return this.anInt6645 + this.aClass16_Sub1_Sub1_4.anInt355 + this.anInt6668;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
	private void method5388() {
		this.aClass90_Sub1_29.method2069(1);
		this.aClass90_Sub1_29.method2126(null);
		this.aClass90_Sub1_29.method2120(8448, 8448);
		this.aClass90_Sub1_29.method2119(1, 768, 34168);
		this.aClass90_Sub1_29.method2133(0, 5890);
		this.aClass90_Sub1_29.method2069(0);
		this.aClass90_Sub1_29.method2119(1, 768, 34168);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(FFFFFFLclient!fa;II)V")
	@Override
	protected void method7771(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class17 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class16_Sub1_Sub1 local7 = ((Class17_Sub1) arg6).aClass16_Sub1_Sub1_1;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(31) float local31;
		if (this.aBoolean463) {
			local14 = this.AA();
			local18 = this.a();
			local24 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(38) float local38 = (arg4 - arg0) / local18;
			@Pc(45) float local45 = (arg5 - arg1) / local18;
			@Pc(51) float local51 = (float) this.anInt6645 * local38;
			@Pc(57) float local57 = local45 * (float) this.anInt6645;
			@Pc(63) float local63 = local24 * (float) this.anInt6658;
			@Pc(69) float local69 = (float) this.anInt6658 * local31;
			@Pc(76) float local76 = (float) this.anInt6664 * -local24;
			@Pc(83) float local83 = -local31 * (float) this.anInt6664;
			@Pc(90) float local90 = (float) this.anInt6668 * -local38;
			@Pc(97) float local97 = (float) this.anInt6668 * -local45;
			arg1 = local69 + arg1 + local57;
			arg0 = local63 + arg0 + local51;
			arg4 = local90 + arg4 + local63;
			arg2 = local51 + local76 + arg2;
			arg3 = local83 + arg3 + local57;
			arg5 = local97 + local69 + arg5;
		}
		local14 = arg4 + arg2 - arg0;
		local18 = arg5 + arg3 - arg1;
		this.aClass16_Sub1_Sub1_4.method7843(true);
		this.aClass90_Sub1_29.method2130();
		this.aClass90_Sub1_29.method2126(this.aClass16_Sub1_Sub1_4);
		this.aClass90_Sub1_29.method2123(1);
		this.aClass90_Sub1_29.method2069(1);
		this.aClass90_Sub1_29.method2126(local7);
		this.aClass90_Sub1_29.method2120(8448, 7681);
		this.aClass90_Sub1_29.method2119(0, 768, 34168);
		this.aClass90_Sub1_29.method2090(1);
		local24 = local7.aFloat15 / (float) local7.anInt356;
		local31 = local7.aFloat16 / (float) local7.anInt355;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass16_Sub1_Sub1_4.aFloat16);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg0), local7.aFloat16 - ((float) -arg8 + arg1) * local31);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg4), local7.aFloat16 - (arg5 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass16_Sub1_Sub1_4.aFloat15, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * (local14 - (float) arg7), local7.aFloat16 - local31 * (local18 - (float) arg8));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass16_Sub1_Sub1_4.aFloat15, this.aClass16_Sub1_Sub1_4.aFloat16);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg2), local7.aFloat16 - local31 * (arg3 - (float) arg8));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass90_Sub1_29.method2119(0, 768, 5890);
		this.aClass90_Sub1_29.method2123(0);
		this.aClass90_Sub1_29.method2126(null);
		this.aClass90_Sub1_29.method2069(0);
	}

	@OriginalMember(owner = "client!oc", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6658 = arg0;
		this.anInt6668 = arg3;
		this.anInt6645 = arg1;
		this.anInt6664 = arg2;
		this.aBoolean463 = this.anInt6658 != 0 || this.anInt6645 != 0 || this.anInt6664 != 0 || this.anInt6668 != 0;
	}

	@OriginalMember(owner = "client!oc", name = "GA", descriptor = "(IIIIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass16_Sub1_Sub1_4.method304(arg5, arg3, arg4, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "(III)V")
	@Override
	public void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass16_Sub1_Sub1_5 = Static193.method3264(this.aClass90_Sub1_29, this.aClass16_Sub1_Sub1_4.anInt356, arg0, this.aClass16_Sub1_Sub1_4.anInt355, arg1);
		this.anInt6662 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return this.aClass16_Sub1_Sub1_4.anInt355;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)V")
	private void method5390(@OriginalArg(0) int arg0) {
		this.aClass90_Sub1_29.method2069(1);
		this.aClass90_Sub1_29.method2126(this.aClass16_Sub1_Sub1_4);
		this.aClass90_Sub1_29.method2120(7681, this.aClass90_Sub1_29.method2084(arg0));
		this.aClass90_Sub1_29.method2119(1, 768, 34167);
		this.aClass90_Sub1_29.method2133(0, 34168);
		this.aClass90_Sub1_29.method2069(0);
		this.aClass90_Sub1_29.method2126(this.aClass16_Sub1_Sub1_5);
		this.aClass90_Sub1_29.method2120(7681, 34479);
		this.aClass90_Sub1_29.method2119(1, 768, 34166);
		if (this.anInt6662 == 0) {
			this.aClass90_Sub1_29.method2134(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt6662 == 1) {
			this.aClass90_Sub1_29.method2134(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt6662 == 2) {
			this.aClass90_Sub1_29.method2134(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt6662 == 3) {
			this.aClass90_Sub1_29.method2134(128.5F, 128.5F, 128.5F, 0.0F);
			return;
		}
	}

	@OriginalMember(owner = "client!oc", name = "QA", descriptor = "()I")
	@Override
	public int QA() {
		return this.aClass16_Sub1_Sub1_4.anInt356;
	}

	@OriginalMember(owner = "client!oc", name = "KA", descriptor = "(IIIIIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass16_Sub1_Sub1_4.method7843(true);
		this.aClass90_Sub1_29.method2130();
		this.aClass90_Sub1_29.method2090(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean463) {
			@Pc(42) float local42 = (float) arg2 / (float) this.AA();
			@Pc(49) float local49 = (float) arg3 / (float) this.a();
			@Pc(58) float local58 = (float) this.anInt6658 * local42 + (float) arg0;
			@Pc(67) float local67 = (float) this.anInt6645 * local49 + (float) arg1;
			@Pc(76) float local76 = local42 * (float) this.aClass16_Sub1_Sub1_4.anInt356 + local58;
			@Pc(85) float local85 = local49 * (float) this.aClass16_Sub1_Sub1_4.anInt355 + local67;
			if (this.aClass16_Sub1_Sub1_5 == null) {
				this.aClass90_Sub1_29.method2126(this.aClass16_Sub1_Sub1_4);
				this.aClass90_Sub1_29.method2123(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass16_Sub1_Sub1_4.aFloat16);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glTexCoord2f(this.aClass16_Sub1_Sub1_4.aFloat15, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glTexCoord2f(this.aClass16_Sub1_Sub1_4.aFloat15, this.aClass16_Sub1_Sub1_4.aFloat16);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
			} else {
				this.method5390(arg4);
				this.aClass16_Sub1_Sub1_5.method7843(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass16_Sub1_Sub1_4.aFloat16);
				OpenGL.glTexCoord2f(0.0F, this.aClass16_Sub1_Sub1_4.aFloat16);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass16_Sub1_Sub1_4.aFloat15, 0.0F);
				OpenGL.glTexCoord2f(this.aClass16_Sub1_Sub1_4.aFloat15, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass16_Sub1_Sub1_4.aFloat15, this.aClass16_Sub1_Sub1_4.aFloat16);
				OpenGL.glTexCoord2f(this.aClass16_Sub1_Sub1_4.aFloat15, this.aClass16_Sub1_Sub1_4.aFloat16);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
				this.method5388();
			}
		} else if (this.aClass16_Sub1_Sub1_5 == null) {
			this.aClass90_Sub1_29.method2126(this.aClass16_Sub1_Sub1_4);
			this.aClass90_Sub1_29.method2123(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass16_Sub1_Sub1_4.aFloat16);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass16_Sub1_Sub1_4.aFloat15, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass16_Sub1_Sub1_4.aFloat15, this.aClass16_Sub1_Sub1_4.aFloat16);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method5390(arg4);
			this.aClass16_Sub1_Sub1_5.method7843(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass16_Sub1_Sub1_4.aFloat16);
			OpenGL.glTexCoord2f(0.0F, this.aClass16_Sub1_Sub1_4.aFloat16);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass16_Sub1_Sub1_4.aFloat15, 0.0F);
			OpenGL.glTexCoord2f(this.aClass16_Sub1_Sub1_4.aFloat15, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass16_Sub1_Sub1_4.aFloat15, this.aClass16_Sub1_Sub1_4.aFloat16);
			OpenGL.glTexCoord2f(this.aClass16_Sub1_Sub1_4.aFloat15, this.aClass16_Sub1_Sub1_4.aFloat16);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method5388();
		}
	}
}
