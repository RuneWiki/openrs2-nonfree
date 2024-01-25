import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class178_Sub2 extends Class178 {

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "Lclient!vt;")
	private Class125_Sub1_Sub1 aClass125_Sub1_Sub1_3;

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
	private int anInt4528 = 0;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
	private int anInt4537 = 0;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Z")
	private boolean aBoolean292 = false;

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
	private int anInt4529 = 0;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
	private int anInt4546 = 0;

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
	private int anInt4547 = 0;

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "Lclient!aq;")
	private final Class22_Sub1 aClass22_Sub1_21;

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "Lclient!vt;")
	private final Class125_Sub1_Sub1 aClass125_Sub1_Sub1_4;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!aq;IIZ)V")
	public Class178_Sub2(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass22_Sub1_21 = arg0;
		this.aClass125_Sub1_Sub1_4 = Static555.method6568(arg1, arg0, arg3 ? 6408 : 6407, arg2);
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!aq;IIII)V")
	public Class178_Sub2(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass22_Sub1_21 = arg0;
		this.aClass125_Sub1_Sub1_4 = Static385.method5209(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!aq;II[III)V")
	public Class178_Sub2(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass22_Sub1_21 = arg0;
		this.aClass125_Sub1_Sub1_4 = Static66.method1492(arg0, arg2, arg1, arg4, arg5, arg3);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method7615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass125_Sub1_Sub1_4.method9217(true);
		this.aClass22_Sub1_21.method926();
		this.aClass22_Sub1_21.method964(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean292) {
			@Pc(52) float local52 = (float) arg2 / (float) this.method7627();
			@Pc(59) float local59 = (float) arg3 / (float) this.method7632();
			@Pc(68) float local68 = (float) arg0 + local52 * (float) this.anInt4537;
			@Pc(77) float local77 = (float) arg1 + (float) this.anInt4547 * local59;
			@Pc(86) float local86 = (float) this.aClass125_Sub1_Sub1_4.anInt10870 * local52 + local68;
			@Pc(95) float local95 = (float) this.aClass125_Sub1_Sub1_4.anInt10869 * local59 + local77;
			if (this.aClass125_Sub1_Sub1_3 == null) {
				this.aClass22_Sub1_21.method955(this.aClass125_Sub1_Sub1_4);
				this.aClass22_Sub1_21.method894(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass125_Sub1_Sub1_4.aFloat196);
				OpenGL.glVertex2f(local68, local77);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local68, local95);
				OpenGL.glTexCoord2f(this.aClass125_Sub1_Sub1_4.aFloat197, 0.0F);
				OpenGL.glVertex2f(local86, local95);
				OpenGL.glTexCoord2f(this.aClass125_Sub1_Sub1_4.aFloat197, this.aClass125_Sub1_Sub1_4.aFloat196);
				OpenGL.glVertex2f(local86, local77);
				OpenGL.glEnd();
			} else {
				this.method4176(arg4);
				this.aClass125_Sub1_Sub1_3.method9217(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass125_Sub1_Sub1_4.aFloat196);
				OpenGL.glTexCoord2f(0.0F, this.aClass125_Sub1_Sub1_4.aFloat196);
				OpenGL.glVertex2f(local68, local77);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local68, local95);
				OpenGL.glMultiTexCoord2f(33985, this.aClass125_Sub1_Sub1_4.aFloat197, 0.0F);
				OpenGL.glTexCoord2f(this.aClass125_Sub1_Sub1_4.aFloat197, 0.0F);
				OpenGL.glVertex2f(local86, local95);
				OpenGL.glMultiTexCoord2f(33985, this.aClass125_Sub1_Sub1_4.aFloat197, this.aClass125_Sub1_Sub1_4.aFloat196);
				OpenGL.glTexCoord2f(this.aClass125_Sub1_Sub1_4.aFloat197, this.aClass125_Sub1_Sub1_4.aFloat196);
				OpenGL.glVertex2f(local86, local77);
				OpenGL.glEnd();
				this.method4178();
			}
		} else if (this.aClass125_Sub1_Sub1_3 == null) {
			this.aClass22_Sub1_21.method955(this.aClass125_Sub1_Sub1_4);
			this.aClass22_Sub1_21.method894(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass125_Sub1_Sub1_4.aFloat196);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass125_Sub1_Sub1_4.aFloat197, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass125_Sub1_Sub1_4.aFloat197, this.aClass125_Sub1_Sub1_4.aFloat196);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method4176(arg4);
			this.aClass125_Sub1_Sub1_3.method9217(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass125_Sub1_Sub1_4.aFloat196);
			OpenGL.glTexCoord2f(0.0F, this.aClass125_Sub1_Sub1_4.aFloat196);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass125_Sub1_Sub1_4.aFloat197, 0.0F);
			OpenGL.glTexCoord2f(this.aClass125_Sub1_Sub1_4.aFloat197, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass125_Sub1_Sub1_4.aFloat197, this.aClass125_Sub1_Sub1_4.aFloat196);
			OpenGL.glTexCoord2f(this.aClass125_Sub1_Sub1_4.aFloat197, this.aClass125_Sub1_Sub1_4.aFloat196);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method4178();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method7629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg0 + arg2;
		@Pc(14) int local14 = arg1 + arg3;
		this.aClass125_Sub1_Sub1_4.method9217(false);
		this.aClass22_Sub1_21.method926();
		this.aClass22_Sub1_21.method955(this.aClass125_Sub1_Sub1_4);
		this.aClass22_Sub1_21.method964(arg6);
		this.aClass22_Sub1_21.method894(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass125_Sub1_Sub1_4.aBoolean738 && !this.aBoolean292) {
			@Pc(358) float local358 = (float) arg3 * this.aClass125_Sub1_Sub1_4.aFloat196 / (float) this.aClass125_Sub1_Sub1_4.anInt10869;
			@Pc(370) float local370 = (float) arg2 * this.aClass125_Sub1_Sub1_4.aFloat197 / (float) this.aClass125_Sub1_Sub1_4.anInt10870;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local358);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local14);
			OpenGL.glTexCoord2f(local370, 0.0F);
			OpenGL.glVertex2i(local9, local14);
			OpenGL.glTexCoord2f(local370, local358);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt4537, (float) this.anInt4547, 0.0F);
		@Pc(75) int local75 = this.method7627();
		@Pc(78) int local78 = this.method7632();
		@Pc(84) int local84 = this.aClass125_Sub1_Sub1_4.anInt10869 + arg1;
		OpenGL.glBegin(7);
		@Pc(88) int local88 = arg1;
		@Pc(98) int local98;
		while (local84 <= local14) {
			local98 = this.aClass125_Sub1_Sub1_4.anInt10870 + arg0;
			@Pc(100) int local100 = arg0;
			while (local9 >= local98) {
				OpenGL.glTexCoord2f(0.0F, this.aClass125_Sub1_Sub1_4.aFloat196);
				OpenGL.glVertex2i(local100, local88);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local100, local84);
				OpenGL.glTexCoord2f(this.aClass125_Sub1_Sub1_4.aFloat197, 0.0F);
				OpenGL.glVertex2i(local98, local84);
				OpenGL.glTexCoord2f(this.aClass125_Sub1_Sub1_4.aFloat197, this.aClass125_Sub1_Sub1_4.aFloat196);
				OpenGL.glVertex2i(local98, local88);
				local98 += local75;
				local100 += local75;
			}
			if (local100 < local9) {
				@Pc(171) float local171 = (float) (local9 - local100) * this.aClass125_Sub1_Sub1_4.aFloat197 / (float) this.aClass125_Sub1_Sub1_4.anInt10870;
				OpenGL.glTexCoord2f(0.0F, this.aClass125_Sub1_Sub1_4.aFloat196);
				OpenGL.glVertex2i(local100, local88);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local100, local84);
				OpenGL.glTexCoord2f(local171, 0.0F);
				OpenGL.glVertex2i(local9, local84);
				OpenGL.glTexCoord2f(local171, this.aClass125_Sub1_Sub1_4.aFloat196);
				OpenGL.glVertex2i(local9, local88);
			}
			local88 += local78;
			local84 += local78;
		}
		if (local14 > local88) {
			@Pc(236) float local236 = this.aClass125_Sub1_Sub1_4.aFloat196 * (float) (local88 + this.aClass125_Sub1_Sub1_4.anInt10869 - local14) / (float) this.aClass125_Sub1_Sub1_4.anInt10869;
			@Pc(242) int local242 = this.aClass125_Sub1_Sub1_4.anInt10870 + arg0;
			local98 = arg0;
			while (local9 >= local242) {
				OpenGL.glTexCoord2f(0.0F, this.aClass125_Sub1_Sub1_4.aFloat196);
				OpenGL.glVertex2i(local98, local88);
				OpenGL.glTexCoord2f(0.0F, local236);
				OpenGL.glVertex2i(local98, local14);
				OpenGL.glTexCoord2f(this.aClass125_Sub1_Sub1_4.aFloat197, local236);
				OpenGL.glVertex2i(local242, local14);
				OpenGL.glTexCoord2f(this.aClass125_Sub1_Sub1_4.aFloat197, this.aClass125_Sub1_Sub1_4.aFloat196);
				OpenGL.glVertex2i(local242, local88);
				local98 += local75;
				local242 += local75;
			}
			if (local98 < local9) {
				@Pc(315) float local315 = this.aClass125_Sub1_Sub1_4.aFloat197 * (float) (local9 - local98) / (float) this.aClass125_Sub1_Sub1_4.anInt10870;
				OpenGL.glTexCoord2f(0.0F, this.aClass125_Sub1_Sub1_4.aFloat196);
				OpenGL.glVertex2i(local98, local88);
				OpenGL.glTexCoord2f(0.0F, local236);
				OpenGL.glVertex2i(local98, local14);
				OpenGL.glTexCoord2f(local315, local236);
				OpenGL.glVertex2i(local9, local14);
				OpenGL.glTexCoord2f(local315, this.aClass125_Sub1_Sub1_4.aFloat196);
				OpenGL.glVertex2i(local9, local88);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "()I")
	@Override
	public int method7636() {
		return this.aClass125_Sub1_Sub1_4.anInt10870;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method7633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg2;
		@Pc(9) Class125_Sub1_Sub1 local9 = local6.aClass125_Sub1_Sub1_2;
		this.aClass125_Sub1_Sub1_4.method9217(false);
		this.aClass22_Sub1_21.method926();
		this.aClass22_Sub1_21.method955(this.aClass125_Sub1_Sub1_4);
		this.aClass22_Sub1_21.method894(1);
		this.aClass22_Sub1_21.method931(1);
		this.aClass22_Sub1_21.method955(local9);
		this.aClass22_Sub1_21.method900(8448, 7681);
		this.aClass22_Sub1_21.method935(768, 0, 34168);
		this.aClass22_Sub1_21.method964(1);
		@Pc(62) int local62 = arg1 + this.anInt4547;
		@Pc(67) int local67 = arg0 + this.anInt4537;
		@Pc(73) int local73 = local67 + this.aClass125_Sub1_Sub1_4.anInt10870;
		@Pc(80) int local80 = local62 + this.aClass125_Sub1_Sub1_4.anInt10869;
		@Pc(87) float local87 = local9.aFloat197 / (float) local9.anInt10870;
		@Pc(94) float local94 = local9.aFloat196 / (float) local9.anInt10869;
		@Pc(102) float local102 = local87 * (float) (local67 - arg3);
		@Pc(110) float local110 = (float) (local73 - arg3) * local87;
		@Pc(121) float local121 = local9.aFloat196 - (float) (local62 - arg4) * local94;
		@Pc(133) float local133 = local9.aFloat196 - (float) (local80 - arg4) * local94;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass125_Sub1_Sub1_4.aFloat196);
		OpenGL.glMultiTexCoord2f(33985, local102, local121);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local102, local133);
		OpenGL.glVertex2i(local67, local62 + this.aClass125_Sub1_Sub1_4.anInt10869);
		OpenGL.glMultiTexCoord2f(33984, this.aClass125_Sub1_Sub1_4.aFloat197, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local110, local133);
		OpenGL.glVertex2i(this.aClass125_Sub1_Sub1_4.anInt10870 + local67, local62 - -this.aClass125_Sub1_Sub1_4.anInt10869);
		OpenGL.glMultiTexCoord2f(33984, this.aClass125_Sub1_Sub1_4.aFloat197, this.aClass125_Sub1_Sub1_4.aFloat196);
		OpenGL.glMultiTexCoord2f(33985, local110, local121);
		OpenGL.glVertex2i(local67 + this.aClass125_Sub1_Sub1_4.anInt10870, local62);
		OpenGL.glEnd();
		this.aClass22_Sub1_21.method935(768, 0, 5890);
		this.aClass22_Sub1_21.method894(0);
		this.aClass22_Sub1_21.method955((Class125) null);
		this.aClass22_Sub1_21.method931(0);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!this.aClass22_Sub1_21.aBoolean58) {
			this.aClass125_Sub1_Sub1_4.method9218(arg2, arg0, arg4, arg3, arg5, arg1);
			return;
		}
		@Pc(17) int[] local17 = this.aClass22_Sub1_21.na(arg4, arg5, arg2, arg3);
		if (local17 == null) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < local17.length; local21++) {
			local17[local21] |= 0xFF000000;
		}
		this.method4177(arg0, arg1, arg2, arg3, local17, arg2);
		return;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method7623(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean292) {
			local10 = (float) this.method7627();
			local14 = (float) this.method7632();
			@Pc(20) float local20 = (arg2 - arg0) / local10;
			@Pc(26) float local26 = (arg3 - arg1) / local10;
			@Pc(33) float local33 = (arg4 - arg0) / local14;
			@Pc(39) float local39 = (arg5 - arg1) / local14;
			@Pc(45) float local45 = local33 * (float) this.anInt4547;
			@Pc(51) float local51 = (float) this.anInt4547 * local39;
			@Pc(57) float local57 = (float) this.anInt4537 * local20;
			@Pc(63) float local63 = local26 * (float) this.anInt4537;
			@Pc(70) float local70 = -local20 * (float) this.anInt4546;
			@Pc(77) float local77 = -local26 * (float) this.anInt4546;
			@Pc(84) float local84 = -local33 * (float) this.anInt4528;
			@Pc(91) float local91 = (float) this.anInt4528 * -local39;
			arg1 = local51 + local63 + arg1;
			arg0 = local57 + arg0 + local45;
			arg4 = local57 + arg4 + local84;
			arg2 = local45 + local70 + arg2;
			arg3 = local77 + arg3 + local51;
			arg5 = arg5 + local63 + local91;
		}
		local10 = arg2 + arg4 - arg0;
		local14 = arg5 + arg3 - arg1;
		this.aClass125_Sub1_Sub1_4.method9217(true);
		this.aClass22_Sub1_21.method926();
		this.aClass22_Sub1_21.method955(this.aClass125_Sub1_Sub1_4);
		this.aClass22_Sub1_21.method964(1);
		this.aClass22_Sub1_21.method894(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass125_Sub1_Sub1_4.aFloat196);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass125_Sub1_Sub1_4.aFloat197, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass125_Sub1_Sub1_4.aFloat197, this.aClass125_Sub1_Sub1_4.aFloat196);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([I)V")
	@Override
	public void method7625(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt4537;
		arg0[1] = this.anInt4547;
		arg0[2] = this.anInt4546;
		arg0[3] = this.anInt4528;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "()I")
	@Override
	public int method7632() {
		return this.aClass125_Sub1_Sub1_4.anInt10869 + this.anInt4547 + this.anInt4528;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method7616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass125_Sub1_Sub1_4.method9217(false);
		this.aClass22_Sub1_21.method926();
		this.aClass22_Sub1_21.method964(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt4537;
		@Pc(42) int local42 = arg1 + this.anInt4547;
		if (this.aClass125_Sub1_Sub1_3 == null) {
			this.aClass22_Sub1_21.method955(this.aClass125_Sub1_Sub1_4);
			this.aClass22_Sub1_21.method894(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass125_Sub1_Sub1_4.aFloat196);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, this.aClass125_Sub1_Sub1_4.anInt10869 + local42);
			OpenGL.glTexCoord2f(this.aClass125_Sub1_Sub1_4.aFloat197, 0.0F);
			OpenGL.glVertex2i(this.aClass125_Sub1_Sub1_4.anInt10870 + local37, local42 + this.aClass125_Sub1_Sub1_4.anInt10869);
			OpenGL.glTexCoord2f(this.aClass125_Sub1_Sub1_4.aFloat197, this.aClass125_Sub1_Sub1_4.aFloat196);
			OpenGL.glVertex2i(this.aClass125_Sub1_Sub1_4.anInt10870 + local37, local42);
			OpenGL.glEnd();
			return;
		}
		this.method4176(arg2);
		this.aClass125_Sub1_Sub1_3.method9217(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass125_Sub1_Sub1_4.aFloat196);
		OpenGL.glTexCoord2f(0.0F, this.aClass125_Sub1_Sub1_4.aFloat196);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, local42 + this.aClass125_Sub1_Sub1_4.anInt10869);
		OpenGL.glMultiTexCoord2f(33985, this.aClass125_Sub1_Sub1_4.aFloat197, 0.0F);
		OpenGL.glTexCoord2f(this.aClass125_Sub1_Sub1_4.aFloat197, 0.0F);
		OpenGL.glVertex2i(this.aClass125_Sub1_Sub1_4.anInt10870 + local37, local42 + this.aClass125_Sub1_Sub1_4.anInt10869);
		OpenGL.glMultiTexCoord2f(33985, this.aClass125_Sub1_Sub1_4.aFloat197, this.aClass125_Sub1_Sub1_4.aFloat196);
		OpenGL.glTexCoord2f(this.aClass125_Sub1_Sub1_4.aFloat197, this.aClass125_Sub1_Sub1_4.aFloat196);
		OpenGL.glVertex2i(local37 + this.aClass125_Sub1_Sub1_4.anInt10870, local42);
		OpenGL.glEnd();
		this.method4178();
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)V")
	private void method4176(@OriginalArg(1) int arg0) {
		this.aClass22_Sub1_21.method931(1);
		this.aClass22_Sub1_21.method955(this.aClass125_Sub1_Sub1_4);
		this.aClass22_Sub1_21.method900(7681, this.aClass22_Sub1_21.method936(arg0));
		this.aClass22_Sub1_21.method935(768, 1, 34167);
		this.aClass22_Sub1_21.method963(0, 34168);
		this.aClass22_Sub1_21.method931(0);
		this.aClass22_Sub1_21.method955(this.aClass125_Sub1_Sub1_3);
		this.aClass22_Sub1_21.method900(7681, 34479);
		this.aClass22_Sub1_21.method935(768, 1, 34166);
		if (this.anInt4529 == 0) {
			this.aClass22_Sub1_21.method895(0.5F, 0.0F, 0.5F, 1.0F);
		} else if (this.anInt4529 == 1) {
			this.aClass22_Sub1_21.method895(0.5F, 0.0F, 1.0F, 0.5F);
			return;
		} else if (this.anInt4529 == 2) {
			this.aClass22_Sub1_21.method895(1.0F, 0.0F, 0.5F, 0.5F);
			return;
		} else if (this.anInt4529 == 3) {
			this.aClass22_Sub1_21.method895(128.5F, 0.0F, 128.5F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII[III)V")
	private void method4177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.aClass125_Sub1_Sub1_4.method9223(arg4, arg5, arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method7614(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class125_Sub1_Sub1 local7 = ((Class1_Sub2) arg6).aClass125_Sub1_Sub1_2;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(30) float local30;
		if (this.aBoolean292) {
			local14 = (float) this.method7627();
			local18 = (float) this.method7632();
			local24 = (arg2 - arg0) / local14;
			local30 = (arg3 - arg1) / local14;
			@Pc(36) float local36 = (arg4 - arg0) / local18;
			@Pc(43) float local43 = (arg5 - arg1) / local18;
			@Pc(49) float local49 = (float) this.anInt4547 * local36;
			@Pc(55) float local55 = (float) this.anInt4547 * local43;
			@Pc(61) float local61 = local24 * (float) this.anInt4537;
			@Pc(67) float local67 = local30 * (float) this.anInt4537;
			@Pc(74) float local74 = (float) this.anInt4546 * -local24;
			@Pc(81) float local81 = (float) this.anInt4546 * -local30;
			@Pc(88) float local88 = -local36 * (float) this.anInt4528;
			arg2 = local49 + local74 + arg2;
			@Pc(101) float local101 = -local43 * (float) this.anInt4528;
			arg1 = local67 + arg1 + local55;
			arg3 = local81 + arg3 + local55;
			arg0 = arg0 + local61 + local49;
			arg4 = arg4 + local61 + local88;
			arg5 = local101 + local67 + arg5;
		}
		local14 = arg2 + arg4 - arg0;
		local18 = arg3 + arg5 - arg1;
		this.aClass125_Sub1_Sub1_4.method9217(true);
		this.aClass22_Sub1_21.method926();
		this.aClass22_Sub1_21.method955(this.aClass125_Sub1_Sub1_4);
		this.aClass22_Sub1_21.method894(1);
		this.aClass22_Sub1_21.method931(1);
		this.aClass22_Sub1_21.method955(local7);
		this.aClass22_Sub1_21.method900(8448, 7681);
		this.aClass22_Sub1_21.method935(768, 0, 34168);
		this.aClass22_Sub1_21.method964(1);
		local24 = local7.aFloat197 / (float) local7.anInt10870;
		local30 = local7.aFloat196 / (float) local7.anInt10869;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass125_Sub1_Sub1_4.aFloat196);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg0 - (float) arg7), local7.aFloat196 - local30 * (arg1 - (float) arg8));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg4), local7.aFloat196 - local30 * ((float) -arg8 + arg5));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass125_Sub1_Sub1_4.aFloat197, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + local14) * local24, local7.aFloat196 - local30 * ((float) -arg8 + local18));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass125_Sub1_Sub1_4.aFloat197, this.aClass125_Sub1_Sub1_4.aFloat196);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg2), local7.aFloat196 - (arg3 - (float) arg8) * local30);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass22_Sub1_21.method935(768, 0, 5890);
		this.aClass22_Sub1_21.method894(0);
		this.aClass22_Sub1_21.method955((Class125) null);
		this.aClass22_Sub1_21.method931(0);
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(IIII)V")
	@Override
	public void method7631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4547 = arg1;
		this.anInt4528 = arg3;
		this.anInt4546 = arg2;
		this.anInt4537 = arg0;
		this.aBoolean292 = this.anInt4537 != 0 || this.anInt4547 != 0 || this.anInt4546 != 0 || this.anInt4528 != 0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
	@Override
	public void method7620() {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass125_Sub1_Sub1_3 = Static385.method5209(this.aClass22_Sub1_21, 0, 0, this.aClass125_Sub1_Sub1_4.anInt10870, this.aClass125_Sub1_Sub1_4.anInt10869);
		this.anInt4529 = 3;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	private void method4178() {
		this.aClass22_Sub1_21.method931(1);
		this.aClass22_Sub1_21.method955((Class125) null);
		this.aClass22_Sub1_21.method900(8448, 8448);
		this.aClass22_Sub1_21.method935(768, 1, 34168);
		this.aClass22_Sub1_21.method963(0, 5890);
		this.aClass22_Sub1_21.method931(0);
		this.aClass22_Sub1_21.method935(768, 1, 34168);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "()I")
	@Override
	public int method7627() {
		return this.anInt4546 + this.anInt4537 + this.aClass125_Sub1_Sub1_4.anInt10870;
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "()I")
	@Override
	public int method7618() {
		return this.aClass125_Sub1_Sub1_4.anInt10869;
	}
}
