import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
	private static int anInt2499 = 0;

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
	public static int anInt2500 = 0;

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
	public static int anInt2501 = 0;

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
	public static int anInt2502 = 0;

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "Lclient!ek;")
	public static Class8_Sub1_Sub7_Sub2 aClass8_Sub1_Sub7_Sub2_1 = null;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "()V")
	public static void method1988() {
		aClass8_Sub1_Sub7_Sub2_1 = null;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII)V")
	public static void method1990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static116.method1896();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(13) float local13 = (float) Static116.anInt2363 - (float) arg1 - 0.3F;
		@Pc(18) float local18 = local13 - (float) arg2;
		@Pc(20) GL local20 = Static116.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local13);
		local20.glVertex2f(local5, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "()V")
	public static void method1991() {
		Static116.aGL1.glClear(16640);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIII)V")
	public static void method1992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) GL local1 = Static116.aGL1;
		local1.glLineWidth((float) arg5);
		method1997(arg0, arg1, arg2, arg3, arg4);
		local1.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIII)V")
	public static void method1993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > Static116.anInt2364) {
			arg2 = Static116.anInt2364;
		}
		if (arg3 > Static116.anInt2363) {
			arg3 = Static116.anInt2363;
		}
		anInt2501 = arg0;
		anInt2500 = arg1;
		anInt2499 = arg2;
		anInt2502 = arg3;
		@Pc(27) GL local27 = Static116.aGL1;
		local27.glEnable(3089);
		if (anInt2501 <= anInt2499 && anInt2500 <= anInt2502) {
			local27.glScissor(Static116.anInt2371 + anInt2501, Static116.anInt2372 + (Static116.anInt2363 - anInt2502), anInt2499 - anInt2501, anInt2502 - anInt2500);
		} else {
			local27.glScissor(0, 0, 0, 0);
		}
		method1988();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIII)V")
	public static void method1994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static116.method1896();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static116.anInt2363 - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL local20 = Static116.aGL1;
		local20.glBegin(6);
		local20.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!ek;)V")
	public static void method1995(@OriginalArg(0) Class8_Sub1_Sub7_Sub2 arg0) {
		if (arg0.anInt3603 != anInt2502 - anInt2500) {
			throw new IllegalArgumentException();
		}
		aClass8_Sub1_Sub7_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(IIII)V")
	public static void method1996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static116.method1896();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = local5 + (float) arg2;
		@Pc(18) float local18 = (float) Static116.anInt2363 - (float) arg1 - 0.3F;
		@Pc(20) GL local20 = Static116.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local18);
		local20.glVertex2f(local10, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIIII)V")
	public static void method1997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static116.method1896();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = (float) arg2 + 0.3F;
		@Pc(18) float local18 = (float) Static116.anInt2363 - (float) arg1 - 0.3F;
		@Pc(26) float local26 = (float) Static116.anInt2363 - (float) arg3 - 0.3F;
		@Pc(28) GL local28 = Static116.aGL1;
		local28.glBegin(2);
		local28.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local28.glVertex2f(local5, local18);
		local28.glVertex2f(local10, local26);
		local28.glEnd();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "([IIIII)V")
	public static void method1998(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static116.method1896();
		@Pc(2) GL local2 = Static116.aGL1;
		local2.glRasterPos2i(arg1, Static116.anInt2363 - arg2 - arg4);
		local2.glDisable(3042);
		local2.glDisable(3008);
		local2.glDrawPixels(arg3, arg4, 32993, Static116.aBoolean189 ? 33639 : 5121, IntBuffer.wrap(arg0));
		local2.glEnable(3008);
		local2.glEnable(3042);
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "()V")
	public static void method1999() {
		anInt2501 = 0;
		anInt2500 = 0;
		anInt2499 = Static116.anInt2364;
		anInt2502 = Static116.anInt2363;
		@Pc(9) GL local9 = Static116.aGL1;
		local9.glDisable(3089);
		method1988();
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIIIII)V")
	public static void method2000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static116.method1896();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static116.anInt2363 - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL local20 = Static116.aGL1;
		local20.glBegin(6);
		local20.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(IIII)V")
	public static void method2001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt2501 < arg0) {
			anInt2501 = arg0;
		}
		if (anInt2500 < arg1) {
			anInt2500 = arg1;
		}
		if (anInt2499 > arg2) {
			anInt2499 = arg2;
		}
		if (anInt2502 > arg3) {
			anInt2502 = arg3;
		}
		@Pc(21) GL local21 = Static116.aGL1;
		local21.glEnable(3089);
		if (anInt2501 <= anInt2499 && anInt2500 <= anInt2502) {
			local21.glScissor(Static116.anInt2371 + anInt2501, Static116.anInt2372 + (Static116.anInt2363 - anInt2502), anInt2499 - anInt2501, anInt2502 - anInt2500);
		} else {
			local21.glScissor(0, 0, 0, 0);
		}
		method1988();
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(IIIIII)V")
	public static void method2002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static116.method1896();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static116.anInt2363 - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL local29 = Static116.aGL1;
		local29.glBegin(2);
		local29.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "([I)V")
	public static void method2003(@OriginalArg(0) int[] arg0) {
		method1993(arg0[0], arg0[1], arg0[2], arg0[3]);
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(IIIII)V")
	public static void method2004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static116.method1896();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static116.anInt2363 - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL local29 = Static116.aGL1;
		local29.glBegin(2);
		local29.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "([I)V")
	public static void method2005(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt2501;
		arg0[1] = anInt2500;
		arg0[2] = anInt2499;
		arg0[3] = anInt2502;
	}
}
