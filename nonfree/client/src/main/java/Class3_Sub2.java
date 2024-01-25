import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!dv", name = "z", descriptor = "Lclient!og;")
	private Class1_Sub3_Sub1 aClass1_Sub3_Sub1_3;

	@OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
	private int anInt1907 = 0;

	@OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
	private int anInt1913 = 0;

	@OriginalMember(owner = "client!dv", name = "x", descriptor = "I")
	private int anInt1922 = 0;

	@OriginalMember(owner = "client!dv", name = "w", descriptor = "Z")
	private boolean aBoolean130 = false;

	@OriginalMember(owner = "client!dv", name = "k", descriptor = "I")
	private int anInt1912 = 0;

	@OriginalMember(owner = "client!dv", name = "C", descriptor = "I")
	private int anInt1925 = 0;

	@OriginalMember(owner = "client!dv", name = "s", descriptor = "Lclient!bv;")
	private final Class30_Sub1 aClass30_Sub1_11;

	@OriginalMember(owner = "client!dv", name = "l", descriptor = "Lclient!og;")
	private final Class1_Sub3_Sub1 aClass1_Sub3_Sub1_2;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lclient!bv;IIII)V")
	public Class3_Sub2(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass30_Sub1_11 = arg0;
		this.aClass1_Sub3_Sub1_2 = Static444.method5714(arg1, arg4, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lclient!bv;II[III)V")
	public Class3_Sub2(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass30_Sub1_11 = arg0;
		this.aClass1_Sub3_Sub1_2 = Static270.method3653(arg1, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!dv", name = "M", descriptor = "(IIIIIII)V")
	@Override
	public void M(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass1_Sub3_Sub1_2.method4273(true);
		this.aClass30_Sub1_11.method962();
		this.aClass30_Sub1_11.method931(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean130) {
			@Pc(182) float local182 = (float) arg2 / (float) this.ja();
			@Pc(189) float local189 = (float) arg3 / (float) this.JA();
			@Pc(198) float local198 = local182 * (float) this.anInt1922 + (float) arg0;
			@Pc(207) float local207 = (float) arg1 + local189 * (float) this.anInt1913;
			@Pc(216) float local216 = local198 + local182 * (float) this.aClass1_Sub3_Sub1_2.anInt5182;
			@Pc(225) float local225 = (float) this.aClass1_Sub3_Sub1_2.anInt5180 * local189 + local207;
			if (this.aClass1_Sub3_Sub1_3 == null) {
				this.aClass30_Sub1_11.method916(this.aClass1_Sub3_Sub1_2);
				this.aClass30_Sub1_11.method923(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass1_Sub3_Sub1_2.aFloat143);
				OpenGL.glVertex2f(local198, local207);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local198, local225);
				OpenGL.glTexCoord2f(this.aClass1_Sub3_Sub1_2.aFloat144, 0.0F);
				OpenGL.glVertex2f(local216, local225);
				OpenGL.glTexCoord2f(this.aClass1_Sub3_Sub1_2.aFloat144, this.aClass1_Sub3_Sub1_2.aFloat143);
				OpenGL.glVertex2f(local216, local207);
				OpenGL.glEnd();
			} else {
				this.method1447(arg4);
				this.aClass1_Sub3_Sub1_3.method4273(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass1_Sub3_Sub1_2.aFloat143);
				OpenGL.glTexCoord2f(0.0F, this.aClass1_Sub3_Sub1_2.aFloat143);
				OpenGL.glVertex2f(local198, local207);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local198, local225);
				OpenGL.glMultiTexCoord2f(33985, this.aClass1_Sub3_Sub1_2.aFloat144, 0.0F);
				OpenGL.glTexCoord2f(this.aClass1_Sub3_Sub1_2.aFloat144, 0.0F);
				OpenGL.glVertex2f(local216, local225);
				OpenGL.glMultiTexCoord2f(33985, this.aClass1_Sub3_Sub1_2.aFloat144, this.aClass1_Sub3_Sub1_2.aFloat143);
				OpenGL.glTexCoord2f(this.aClass1_Sub3_Sub1_2.aFloat144, this.aClass1_Sub3_Sub1_2.aFloat143);
				OpenGL.glVertex2f(local216, local207);
				OpenGL.glEnd();
				this.method1446();
			}
		} else if (this.aClass1_Sub3_Sub1_3 == null) {
			this.aClass30_Sub1_11.method916(this.aClass1_Sub3_Sub1_2);
			this.aClass30_Sub1_11.method923(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass1_Sub3_Sub1_2.aFloat143);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass1_Sub3_Sub1_2.aFloat144, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass1_Sub3_Sub1_2.aFloat144, this.aClass1_Sub3_Sub1_2.aFloat143);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method1447(arg4);
			this.aClass1_Sub3_Sub1_3.method4273(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass1_Sub3_Sub1_2.aFloat143);
			OpenGL.glTexCoord2f(0.0F, this.aClass1_Sub3_Sub1_2.aFloat143);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass1_Sub3_Sub1_2.aFloat144, 0.0F);
			OpenGL.glTexCoord2f(this.aClass1_Sub3_Sub1_2.aFloat144, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass1_Sub3_Sub1_2.aFloat144, this.aClass1_Sub3_Sub1_2.aFloat143);
			OpenGL.glTexCoord2f(this.aClass1_Sub3_Sub1_2.aFloat144, this.aClass1_Sub3_Sub1_2.aFloat143);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method1446();
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IILclient!ea;II)V")
	@Override
	public void method5878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class57_Sub2 local6 = (Class57_Sub2) arg2;
		@Pc(9) Class1_Sub3_Sub1 local9 = local6.aClass1_Sub3_Sub1_5;
		this.aClass1_Sub3_Sub1_2.method4273(false);
		this.aClass30_Sub1_11.method962();
		this.aClass30_Sub1_11.method916(this.aClass1_Sub3_Sub1_2);
		this.aClass30_Sub1_11.method923(1);
		this.aClass30_Sub1_11.method948(1);
		this.aClass30_Sub1_11.method916(local9);
		this.aClass30_Sub1_11.method905(8448, 7681);
		this.aClass30_Sub1_11.method957(34168, 768, 0);
		this.aClass30_Sub1_11.method931(1);
		@Pc(62) int local62 = arg1 + this.anInt1913;
		@Pc(67) int local67 = arg0 + this.anInt1922;
		@Pc(74) int local74 = local67 + this.aClass1_Sub3_Sub1_2.anInt5182;
		@Pc(80) int local80 = this.aClass1_Sub3_Sub1_2.anInt5180 + local62;
		@Pc(87) float local87 = local9.aFloat144 / (float) local9.anInt5182;
		@Pc(94) float local94 = local9.aFloat143 / (float) local9.anInt5180;
		@Pc(102) float local102 = local87 * (float) (local67 - arg3);
		@Pc(110) float local110 = local87 * (float) (local74 - arg3);
		@Pc(122) float local122 = local9.aFloat143 - local94 * (float) (local62 - arg4);
		@Pc(132) float local132 = local9.aFloat143 - (float) (local80 - arg4) * local94;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass1_Sub3_Sub1_2.aFloat143);
		OpenGL.glMultiTexCoord2f(33985, local102, local122);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local102, local132);
		OpenGL.glVertex2i(local67, this.aClass1_Sub3_Sub1_2.anInt5180 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass1_Sub3_Sub1_2.aFloat144, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local110, local132);
		OpenGL.glVertex2i(local67 + this.aClass1_Sub3_Sub1_2.anInt5182, local62 - -this.aClass1_Sub3_Sub1_2.anInt5180);
		OpenGL.glMultiTexCoord2f(33984, this.aClass1_Sub3_Sub1_2.aFloat144, this.aClass1_Sub3_Sub1_2.aFloat143);
		OpenGL.glMultiTexCoord2f(33985, local110, local122);
		OpenGL.glVertex2i(local67 + this.aClass1_Sub3_Sub1_2.anInt5182, local62);
		OpenGL.glEnd();
		this.aClass30_Sub1_11.method957(5890, 768, 0);
		this.aClass30_Sub1_11.method923(0);
		this.aClass30_Sub1_11.method916(null);
		this.aClass30_Sub1_11.method948(0);
	}

	@OriginalMember(owner = "client!dv", name = "ja", descriptor = "()I")
	@Override
	public int ja() {
		return this.anInt1922 + this.aClass1_Sub3_Sub1_2.anInt5182 + this.anInt1907;
	}

	@OriginalMember(owner = "client!dv", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass1_Sub3_Sub1_3 = Static444.method5714(arg0, this.aClass1_Sub3_Sub1_2.anInt5180, this.aClass1_Sub3_Sub1_2.anInt5182, this.aClass30_Sub1_11, arg1);
		this.anInt1925 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!dv", name = "aa", descriptor = "(FFFFFFIII)V")
	@Override
	protected void aa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean130) {
			local6 = this.ja();
			local10 = this.JA();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(23) float local23 = (arg3 - arg1) / local6;
			@Pc(29) float local29 = (arg4 - arg0) / local10;
			@Pc(36) float local36 = (arg5 - arg1) / local10;
			@Pc(42) float local42 = (float) this.anInt1913 * local29;
			@Pc(48) float local48 = (float) this.anInt1913 * local36;
			@Pc(54) float local54 = (float) this.anInt1922 * local16;
			@Pc(60) float local60 = local23 * (float) this.anInt1922;
			@Pc(67) float local67 = -local16 * (float) this.anInt1907;
			@Pc(74) float local74 = -local23 * (float) this.anInt1907;
			@Pc(81) float local81 = -local29 * (float) this.anInt1912;
			arg3 = local48 + local74 + arg3;
			@Pc(94) float local94 = (float) this.anInt1912 * -local36;
			arg1 = local48 + arg1 + local60;
			arg4 = arg4 + local54 + local81;
			arg2 = arg2 + local67 + local42;
			arg0 = arg0 + local54 + local42;
			arg5 = arg5 + local60 + local94;
		}
		local6 = arg4 + arg2 - arg0;
		this.aClass1_Sub3_Sub1_2.method4273(true);
		local10 = arg5 + arg3 - arg1;
		this.aClass30_Sub1_11.method962();
		this.aClass30_Sub1_11.method916(this.aClass1_Sub3_Sub1_2);
		this.aClass30_Sub1_11.method931(arg8);
		this.aClass30_Sub1_11.method923(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass1_Sub3_Sub1_2.aFloat143);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass1_Sub3_Sub1_2.aFloat144, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass1_Sub3_Sub1_2.aFloat144, this.aClass1_Sub3_Sub1_2.aFloat143);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!dv", name = "JA", descriptor = "()I")
	@Override
	public int JA() {
		return this.anInt1912 + this.anInt1913 + this.aClass1_Sub3_Sub1_2.anInt5180;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(FFFFFFLclient!ea;II)V")
	@Override
	protected void method5886(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class57 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class1_Sub3_Sub1 local7 = ((Class57_Sub2) arg6).aClass1_Sub3_Sub1_5;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(31) float local31;
		if (this.aBoolean130) {
			local14 = this.ja();
			local18 = this.JA();
			local25 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(37) float local37 = (arg4 - arg0) / local18;
			@Pc(43) float local43 = (arg5 - arg1) / local18;
			@Pc(49) float local49 = local37 * (float) this.anInt1913;
			@Pc(55) float local55 = local43 * (float) this.anInt1913;
			@Pc(61) float local61 = (float) this.anInt1922 * local25;
			@Pc(67) float local67 = local31 * (float) this.anInt1922;
			@Pc(74) float local74 = -local25 * (float) this.anInt1907;
			@Pc(81) float local81 = (float) this.anInt1907 * -local31;
			@Pc(88) float local88 = (float) this.anInt1912 * -local37;
			arg3 = local55 + local81 + arg3;
			arg1 = local55 + local67 + arg1;
			arg4 = local88 + arg4 + local61;
			arg2 = arg2 + local74 + local49;
			arg0 = local61 + arg0 + local49;
			@Pc(125) float local125 = -local43 * (float) this.anInt1912;
			arg5 = arg5 + local67 + local125;
		}
		local14 = arg2 + arg4 - arg0;
		local18 = arg5 + arg3 - arg1;
		this.aClass1_Sub3_Sub1_2.method4273(true);
		this.aClass30_Sub1_11.method962();
		this.aClass30_Sub1_11.method916(this.aClass1_Sub3_Sub1_2);
		this.aClass30_Sub1_11.method923(1);
		this.aClass30_Sub1_11.method948(1);
		this.aClass30_Sub1_11.method916(local7);
		this.aClass30_Sub1_11.method905(8448, 7681);
		this.aClass30_Sub1_11.method957(34168, 768, 0);
		this.aClass30_Sub1_11.method931(1);
		local25 = local7.aFloat144 / (float) local7.anInt5182;
		local31 = local7.aFloat143 / (float) local7.anInt5180;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass1_Sub3_Sub1_2.aFloat143);
		OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * local25, local7.aFloat143 - local31 * (arg1 - (float) arg8));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * local25, local7.aFloat143 - ((float) -arg8 + arg5) * local31);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass1_Sub3_Sub1_2.aFloat144, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * (local14 - (float) arg7), local7.aFloat143 - ((float) -arg8 + local18) * local31);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass1_Sub3_Sub1_2.aFloat144, this.aClass1_Sub3_Sub1_2.aFloat143);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + arg2), local7.aFloat143 - local31 * ((float) -arg8 + arg3));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass30_Sub1_11.method957(5890, 768, 0);
		this.aClass30_Sub1_11.method923(0);
		this.aClass30_Sub1_11.method916(null);
		this.aClass30_Sub1_11.method948(0);
	}

	@OriginalMember(owner = "client!dv", name = "UA", descriptor = "()I")
	@Override
	public int UA() {
		return this.aClass1_Sub3_Sub1_2.anInt5182;
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(Z)V")
	private void method1446() {
		this.aClass30_Sub1_11.method948(1);
		this.aClass30_Sub1_11.method916(null);
		this.aClass30_Sub1_11.method905(8448, 8448);
		this.aClass30_Sub1_11.method957(34168, 768, 1);
		this.aClass30_Sub1_11.method954(0, 5890);
		this.aClass30_Sub1_11.method948(0);
		this.aClass30_Sub1_11.method957(34168, 768, 1);
	}

	@OriginalMember(owner = "client!dv", name = "D", descriptor = "(IIIIIII)V")
	@Override
	public void D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg0 + arg2;
		@Pc(13) int local13 = arg3 + arg1;
		this.aClass1_Sub3_Sub1_2.method4273(false);
		this.aClass30_Sub1_11.method962();
		this.aClass30_Sub1_11.method916(this.aClass1_Sub3_Sub1_2);
		this.aClass30_Sub1_11.method931(arg6);
		this.aClass30_Sub1_11.method923(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass1_Sub3_Sub1_2.aBoolean354 && !this.aBoolean130) {
			@Pc(358) float local358 = this.aClass1_Sub3_Sub1_2.aFloat143 * (float) arg3 / (float) this.aClass1_Sub3_Sub1_2.anInt5180;
			@Pc(370) float local370 = (float) arg2 * this.aClass1_Sub3_Sub1_2.aFloat144 / (float) this.aClass1_Sub3_Sub1_2.anInt5182;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local358);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local13);
			OpenGL.glTexCoord2f(local370, 0.0F);
			OpenGL.glVertex2i(local9, local13);
			OpenGL.glTexCoord2f(local370, local358);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt1922, (float) this.anInt1913, 0.0F);
		@Pc(72) int local72 = this.ja();
		@Pc(75) int local75 = this.JA();
		@Pc(82) int local82 = arg1 + this.aClass1_Sub3_Sub1_2.anInt5180;
		OpenGL.glBegin(7);
		@Pc(86) int local86 = arg1;
		@Pc(95) int local95;
		while (local82 <= local13) {
			local95 = arg0 + this.aClass1_Sub3_Sub1_2.anInt5182;
			@Pc(97) int local97 = arg0;
			while (local95 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass1_Sub3_Sub1_2.aFloat143);
				OpenGL.glVertex2i(local97, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local97, local82);
				OpenGL.glTexCoord2f(this.aClass1_Sub3_Sub1_2.aFloat144, 0.0F);
				OpenGL.glVertex2i(local95, local82);
				OpenGL.glTexCoord2f(this.aClass1_Sub3_Sub1_2.aFloat144, this.aClass1_Sub3_Sub1_2.aFloat143);
				OpenGL.glVertex2i(local95, local86);
				local97 += local72;
				local95 += local72;
			}
			if (local9 > local97) {
				@Pc(168) float local168 = (float) (local9 - local97) * this.aClass1_Sub3_Sub1_2.aFloat144 / (float) this.aClass1_Sub3_Sub1_2.anInt5182;
				OpenGL.glTexCoord2f(0.0F, this.aClass1_Sub3_Sub1_2.aFloat143);
				OpenGL.glVertex2i(local97, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local97, local82);
				OpenGL.glTexCoord2f(local168, 0.0F);
				OpenGL.glVertex2i(local9, local82);
				OpenGL.glTexCoord2f(local168, this.aClass1_Sub3_Sub1_2.aFloat143);
				OpenGL.glVertex2i(local9, local86);
			}
			local86 += local75;
			local82 += local75;
		}
		if (local13 > local86) {
			@Pc(237) float local237 = (float) (this.aClass1_Sub3_Sub1_2.anInt5180 + local86 - local13) * this.aClass1_Sub3_Sub1_2.aFloat143 / (float) this.aClass1_Sub3_Sub1_2.anInt5180;
			@Pc(243) int local243 = this.aClass1_Sub3_Sub1_2.anInt5182 + arg0;
			local95 = arg0;
			while (local243 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass1_Sub3_Sub1_2.aFloat143);
				OpenGL.glVertex2i(local95, local86);
				OpenGL.glTexCoord2f(0.0F, local237);
				OpenGL.glVertex2i(local95, local13);
				OpenGL.glTexCoord2f(this.aClass1_Sub3_Sub1_2.aFloat144, local237);
				OpenGL.glVertex2i(local243, local13);
				OpenGL.glTexCoord2f(this.aClass1_Sub3_Sub1_2.aFloat144, this.aClass1_Sub3_Sub1_2.aFloat143);
				OpenGL.glVertex2i(local243, local86);
				local95 += local72;
				local243 += local72;
			}
			if (local95 < local9) {
				@Pc(315) float local315 = this.aClass1_Sub3_Sub1_2.aFloat144 * (float) (local9 - local95) / (float) this.aClass1_Sub3_Sub1_2.anInt5182;
				OpenGL.glTexCoord2f(0.0F, this.aClass1_Sub3_Sub1_2.aFloat143);
				OpenGL.glVertex2i(local95, local86);
				OpenGL.glTexCoord2f(0.0F, local237);
				OpenGL.glVertex2i(local95, local13);
				OpenGL.glTexCoord2f(local315, local237);
				OpenGL.glVertex2i(local9, local13);
				OpenGL.glTexCoord2f(local315, this.aClass1_Sub3_Sub1_2.aFloat143);
				OpenGL.glVertex2i(local9, local86);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!dv", name = "W", descriptor = "(IIIIII)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass1_Sub3_Sub1_2.method3966(arg4, arg3, arg0, arg1, arg2, arg5);
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(II)V")
	private void method1447(@OriginalArg(1) int arg0) {
		this.aClass30_Sub1_11.method948(1);
		this.aClass30_Sub1_11.method916(this.aClass1_Sub3_Sub1_2);
		this.aClass30_Sub1_11.method905(7681, this.aClass30_Sub1_11.method898(arg0));
		this.aClass30_Sub1_11.method957(34167, 768, 1);
		this.aClass30_Sub1_11.method954(0, 34168);
		this.aClass30_Sub1_11.method948(0);
		this.aClass30_Sub1_11.method916(this.aClass1_Sub3_Sub1_3);
		this.aClass30_Sub1_11.method905(7681, 34479);
		this.aClass30_Sub1_11.method957(34166, 768, 1);
		if (this.anInt1925 == 0) {
			this.aClass30_Sub1_11.method964(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt1925 == 1) {
			this.aClass30_Sub1_11.method964(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt1925 == 2) {
			this.aClass30_Sub1_11.method964(1.0F, 0.5F, 0.5F, 0.0F);
			return;
		} else if (this.anInt1925 == 3) {
			this.aClass30_Sub1_11.method964(128.5F, 128.5F, 128.5F, 0.0F);
			return;
		}
	}

	@OriginalMember(owner = "client!dv", name = "ka", descriptor = "(IIII)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1913 = arg1;
		this.anInt1912 = arg3;
		this.anInt1922 = arg0;
		this.anInt1907 = arg2;
		this.aBoolean130 = this.anInt1922 != 0 || this.anInt1913 != 0 || this.anInt1907 != 0 || this.anInt1912 != 0;
	}

	@OriginalMember(owner = "client!dv", name = "qa", descriptor = "()I")
	@Override
	public int qa() {
		return this.aClass1_Sub3_Sub1_2.anInt5180;
	}

	@OriginalMember(owner = "client!dv", name = "YA", descriptor = "(IIIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass1_Sub3_Sub1_2.method4273(false);
		this.aClass30_Sub1_11.method962();
		this.aClass30_Sub1_11.method931(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt1922;
		@Pc(42) int local42 = arg1 + this.anInt1913;
		if (this.aClass1_Sub3_Sub1_3 == null) {
			this.aClass30_Sub1_11.method916(this.aClass1_Sub3_Sub1_2);
			this.aClass30_Sub1_11.method923(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass1_Sub3_Sub1_2.aFloat143);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, this.aClass1_Sub3_Sub1_2.anInt5180 + local42);
			OpenGL.glTexCoord2f(this.aClass1_Sub3_Sub1_2.aFloat144, 0.0F);
			OpenGL.glVertex2i(this.aClass1_Sub3_Sub1_2.anInt5182 + local37, local42 + this.aClass1_Sub3_Sub1_2.anInt5180);
			OpenGL.glTexCoord2f(this.aClass1_Sub3_Sub1_2.aFloat144, this.aClass1_Sub3_Sub1_2.aFloat143);
			OpenGL.glVertex2i(this.aClass1_Sub3_Sub1_2.anInt5182 + local37, local42);
			OpenGL.glEnd();
			return;
		}
		this.method1447(arg2);
		this.aClass1_Sub3_Sub1_3.method4273(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass1_Sub3_Sub1_2.aFloat143);
		OpenGL.glTexCoord2f(0.0F, this.aClass1_Sub3_Sub1_2.aFloat143);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, this.aClass1_Sub3_Sub1_2.anInt5180 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass1_Sub3_Sub1_2.aFloat144, 0.0F);
		OpenGL.glTexCoord2f(this.aClass1_Sub3_Sub1_2.aFloat144, 0.0F);
		OpenGL.glVertex2i(this.aClass1_Sub3_Sub1_2.anInt5182 + local37, local42 + this.aClass1_Sub3_Sub1_2.anInt5180);
		OpenGL.glMultiTexCoord2f(33985, this.aClass1_Sub3_Sub1_2.aFloat144, this.aClass1_Sub3_Sub1_2.aFloat143);
		OpenGL.glTexCoord2f(this.aClass1_Sub3_Sub1_2.aFloat144, this.aClass1_Sub3_Sub1_2.aFloat143);
		OpenGL.glVertex2i(local37 + this.aClass1_Sub3_Sub1_2.anInt5182, local42);
		OpenGL.glEnd();
		this.method1446();
	}
}
