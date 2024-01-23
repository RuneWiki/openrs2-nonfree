import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "Lclient!ha;")
	public static Class1_Sub2_Sub11_Sub1 aClass1_Sub2_Sub11_Sub1_1 = null;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "I")
	public static int anInt1030 = 0;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "I")
	public static int anInt1031 = 0;

	@OriginalMember(owner = "client!db", name = "d", descriptor = "I")
	public static int anInt1032 = 0;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "I")
	private static int anInt1033 = 0;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V")
	public static void method832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static277.method4195();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static277.anInt5360 - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL local20 = Static277.aGL1;
		local20.glBegin(6);
		local20.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "()V")
	public static void method833() {
		aClass1_Sub2_Sub11_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "([I)V")
	public static void method834(@OriginalArg(0) int[] arg0) {
		method847(arg0[0], arg0[1], arg0[2], arg0[3]);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)V")
	public static void method836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt1032 < arg0) {
			anInt1032 = arg0;
		}
		if (anInt1031 < arg1) {
			anInt1031 = arg1;
		}
		if (anInt1033 > arg2) {
			anInt1033 = arg2;
		}
		if (anInt1030 > arg3) {
			anInt1030 = arg3;
		}
		@Pc(21) GL local21 = Static277.aGL1;
		local21.glEnable(3089);
		if (anInt1032 <= anInt1033 && anInt1031 <= anInt1030) {
			local21.glScissor(Static277.anInt5354 + anInt1032, Static277.anInt5357 + (Static277.anInt5360 - anInt1030), anInt1033 - anInt1032, anInt1030 - anInt1031);
		} else {
			local21.glScissor(0, 0, 0, 0);
		}
		method833();
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(IIII)V")
	public static void method837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static277.method4195();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(13) float local13 = (float) Static277.anInt5360 - (float) arg1 - 0.3F;
		@Pc(18) float local18 = local13 - (float) arg2;
		@Pc(20) GL local20 = Static277.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local13);
		local20.glVertex2f(local5, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "([IIIII)V")
	public static void method838(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static277.method4195();
		@Pc(2) GL local2 = Static277.aGL1;
		local2.glRasterPos2i(arg1, Static277.anInt5360 - arg2 - arg4);
		local2.glDisable(3042);
		local2.glDisable(3008);
		local2.glDrawPixels(arg3, arg4, 32993, Static277.aBoolean418 ? 33639 : 5121, IntBuffer.wrap(arg0));
		local2.glEnable(3008);
		local2.glEnable(3042);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIII)V")
	public static void method839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static277.method4195();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static277.anInt5360 - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL local20 = Static277.aGL1;
		local20.glBegin(6);
		local20.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(IIIIII)V")
	public static void method840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) GL local1 = Static277.aGL1;
		local1.glLineWidth((float) arg5);
		method846(arg0, arg1, arg2, arg3, arg4);
		local1.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "([I)V")
	public static void method841(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt1032;
		arg0[1] = anInt1031;
		arg0[2] = anInt1033;
		arg0[3] = anInt1030;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "()V")
	public static void method842() {
		anInt1032 = 0;
		anInt1031 = 0;
		anInt1033 = Static277.anInt5362;
		anInt1030 = Static277.anInt5360;
		@Pc(9) GL local9 = Static277.aGL1;
		local9.glDisable(3089);
		method833();
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "()V")
	public static void method843() {
		Static277.aGL1.glClear(16640);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(IIIII)V")
	public static void method844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static277.method4195();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static277.anInt5360 - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL local29 = Static277.aGL1;
		local29.glBegin(2);
		local29.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!ha;)V")
	public static void method845(@OriginalArg(0) Class1_Sub2_Sub11_Sub1 arg0) {
		if (arg0.anInt4869 != anInt1030 - anInt1031) {
			throw new IllegalArgumentException();
		}
		aClass1_Sub2_Sub11_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(IIIII)V")
	public static void method846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static277.method4195();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = (float) arg2 + 0.3F;
		@Pc(18) float local18 = (float) Static277.anInt5360 - (float) arg1 - 0.3F;
		@Pc(26) float local26 = (float) Static277.anInt5360 - (float) arg3 - 0.3F;
		@Pc(28) GL local28 = Static277.aGL1;
		local28.glBegin(2);
		local28.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local28.glVertex2f(local5, local18);
		local28.glVertex2f(local10, local26);
		local28.glEnd();
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(IIII)V")
	public static void method847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > Static277.anInt5362) {
			arg2 = Static277.anInt5362;
		}
		if (arg3 > Static277.anInt5360) {
			arg3 = Static277.anInt5360;
		}
		anInt1032 = arg0;
		anInt1031 = arg1;
		anInt1033 = arg2;
		anInt1030 = arg3;
		@Pc(27) GL local27 = Static277.aGL1;
		local27.glEnable(3089);
		if (anInt1032 <= anInt1033 && anInt1031 <= anInt1030) {
			local27.glScissor(Static277.anInt5354 + anInt1032, Static277.anInt5357 + (Static277.anInt5360 - anInt1030), anInt1033 - anInt1032, anInt1030 - anInt1031);
		} else {
			local27.glScissor(0, 0, 0, 0);
		}
		method833();
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(IIII)V")
	public static void method848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static277.method4195();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = local5 + (float) arg2;
		@Pc(18) float local18 = (float) Static277.anInt5360 - (float) arg1 - 0.3F;
		@Pc(20) GL local20 = Static277.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local18);
		local20.glVertex2f(local10, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(IIIIII)V")
	public static void method849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static277.method4195();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static277.anInt5360 - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL local29 = Static277.aGL1;
		local29.glBegin(2);
		local29.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}
}
