import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
	public static int anInt2674 = 0;

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
	public static int anInt2675 = 0;

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
	private static int anInt2676 = 0;

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
	public static int anInt2677 = 0;

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "Lclient!bg;")
	public static Class1_Sub1_Sub3_Sub1 aClass1_Sub1_Sub3_Sub1_1 = null;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIII)V")
	public static void method2162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static291.method4319();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = local5 + (float) arg2;
		@Pc(18) float local18 = (float) Static291.anInt5512 - (float) arg1 - 0.3F;
		@Pc(20) GL local20 = Static291.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local18);
		local20.glVertex2f(local10, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(IIII)V")
	public static void method2163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt2675 < arg0) {
			anInt2675 = arg0;
		}
		if (anInt2677 < arg1) {
			anInt2677 = arg1;
		}
		if (anInt2676 > arg2) {
			anInt2676 = arg2;
		}
		if (anInt2674 > arg3) {
			anInt2674 = arg3;
		}
		@Pc(21) GL local21 = Static291.aGL1;
		local21.glEnable(3089);
		if (anInt2675 <= anInt2676 && anInt2677 <= anInt2674) {
			local21.glScissor(Static291.anInt5518 + anInt2675, Static291.anInt5511 + (Static291.anInt5512 - anInt2674), anInt2676 - anInt2675, anInt2674 - anInt2677);
		} else {
			local21.glScissor(0, 0, 0, 0);
		}
		method2171();
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIII)V")
	public static void method2164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static291.method4319();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static291.anInt5512 - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL local29 = Static291.aGL1;
		local29.glBegin(2);
		local29.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(IIIII)V")
	public static void method2165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static291.method4319();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = (float) arg2 + 0.3F;
		@Pc(18) float local18 = (float) Static291.anInt5512 - (float) arg1 - 0.3F;
		@Pc(26) float local26 = (float) Static291.anInt5512 - (float) arg3 - 0.3F;
		@Pc(28) GL local28 = Static291.aGL1;
		local28.glBegin(2);
		local28.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local28.glVertex2f(local5, local18);
		local28.glVertex2f(local10, local26);
		local28.glEnd();
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "()V")
	public static void method2166() {
		anInt2675 = 0;
		anInt2677 = 0;
		anInt2676 = Static291.anInt5505;
		anInt2674 = Static291.anInt5512;
		@Pc(9) GL local9 = Static291.aGL1;
		local9.glDisable(3089);
		method2171();
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "([I)V")
	public static void method2167(@OriginalArg(0) int[] arg0) {
		method2180(arg0[0], arg0[1], arg0[2], arg0[3]);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIII)V")
	public static void method2168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) GL local1 = Static291.aGL1;
		local1.glLineWidth((float) arg5);
		method2165(arg0, arg1, arg2, arg3, arg4);
		local1.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "([I)V")
	public static void method2169(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt2675;
		arg0[1] = anInt2677;
		arg0[2] = anInt2676;
		arg0[3] = anInt2674;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(IIIIII)V")
	public static void method2170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static291.method4319();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static291.anInt5512 - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL local29 = Static291.aGL1;
		local29.glBegin(2);
		local29.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "()V")
	public static void method2171() {
		aClass1_Sub1_Sub3_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(IIII)V")
	public static void method2172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static291.method4319();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(13) float local13 = (float) Static291.anInt5512 - (float) arg1 - 0.3F;
		@Pc(18) float local18 = local13 - (float) arg2;
		@Pc(20) GL local20 = Static291.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local13);
		local20.glVertex2f(local5, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIILclient!bg;)V")
	public static void method2173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub1_Sub3_Sub1 arg6) {
		if (anInt2674 - anInt2677 != arg6.anInt5887) {
			throw new IllegalStateException();
		}
		Static291.method4319();
		Static291.method4310(arg6.anInt5892);
		Static291.method4296(1);
		Static291.method4323(0);
		@Pc(22) float local22 = (float) arg0 + 0.3F;
		@Pc(27) float local27 = (float) arg2 + 0.3F;
		@Pc(35) float local35 = (float) Static291.anInt5512 - (float) arg1 - 0.3F;
		@Pc(43) float local43 = (float) Static291.anInt5512 - (float) arg3 - 0.3F;
		@Pc(45) GL local45 = Static291.aGL1;
		local45.glTexEnvi(8960, 34176, 34168);
		local45.glBegin(2);
		local45.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local45.glTexCoord2f((local22 - (float) anInt2675) / (float) arg6.anInt5890, ((float) Static291.anInt5512 - local35 - (float) anInt2677) / (float) arg6.anInt5891);
		local45.glVertex2f(local22, local35);
		local45.glTexCoord2f((local27 - (float) anInt2675) / (float) arg6.anInt5890, ((float) Static291.anInt5512 - local43 - (float) anInt2677) / (float) arg6.anInt5891);
		local45.glVertex2f(local27, local43);
		local45.glEnd();
		local45.glTexEnvi(8960, 34176, 5890);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "([IIIII)V")
	public static void method2174(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static291.method4319();
		@Pc(2) GL local2 = Static291.aGL1;
		local2.glRasterPos2i(arg1, Static291.anInt5512 - arg2 - arg4);
		local2.glDisable(3042);
		local2.glDisable(3008);
		local2.glDrawPixels(arg3, arg4, 32993, Static291.aBoolean413 ? 33639 : 5121, IntBuffer.wrap(arg0));
		local2.glEnable(3008);
		local2.glEnable(3042);
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(IIIII)V")
	public static void method2175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static291.method4319();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = local5 + (float) arg2;
		@Pc(18) float local18 = (float) Static291.anInt5512 - (float) arg1 - 0.3F;
		@Pc(20) GL local20 = Static291.aGL1;
		local20.glBegin(1);
		local20.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, arg4 > 255 ? -1 : (byte) arg4);
		local20.glVertex2f(local5, local18);
		local20.glVertex2f(local10, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "(IIIII)V")
	public static void method2176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static291.method4319();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static291.anInt5512 - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL local20 = Static291.aGL1;
		local20.glBegin(6);
		local20.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(IIIIII)V")
	public static void method2177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static291.method4319();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static291.anInt5512 - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL local20 = Static291.aGL1;
		local20.glBegin(6);
		local20.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "()V")
	public static void method2178() {
		Static291.aGL1.glClear(16640);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!bg;)V")
	public static void method2179(@OriginalArg(0) Class1_Sub1_Sub3_Sub1 arg0) {
		if (arg0.anInt5887 != anInt2674 - anInt2677) {
			throw new IllegalArgumentException();
		}
		aClass1_Sub1_Sub3_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "(IIII)V")
	public static void method2180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > Static291.anInt5505) {
			arg2 = Static291.anInt5505;
		}
		if (arg3 > Static291.anInt5512) {
			arg3 = Static291.anInt5512;
		}
		anInt2675 = arg0;
		anInt2677 = arg1;
		anInt2676 = arg2;
		anInt2674 = arg3;
		@Pc(27) GL local27 = Static291.aGL1;
		local27.glEnable(3089);
		if (anInt2675 <= anInt2676 && anInt2677 <= anInt2674) {
			local27.glScissor(Static291.anInt5518 + anInt2675, Static291.anInt5511 + (Static291.anInt5512 - anInt2674), anInt2676 - anInt2675, anInt2674 - anInt2677);
		} else {
			local27.glScissor(0, 0, 0, 0);
		}
		method2171();
	}
}
