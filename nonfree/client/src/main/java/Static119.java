import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
	public static int anInt2496 = 0;

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
	public static int anInt2497 = 0;

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
	public static int anInt2498 = 0;

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
	private static int anInt2499 = 0;

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "Lclient!af;")
	public static Class1_Sub2_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_1 = null;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIII)V")
	public static void method2122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static156.method2664();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static156.anInt3095 - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL local20 = Static156.aGL1;
		local20.glBegin(6);
		local20.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIII)V")
	public static void method2123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static156.method2664();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = (float) arg2 + 0.3F;
		@Pc(18) float local18 = (float) Static156.anInt3095 - (float) arg1 - 0.3F;
		@Pc(26) float local26 = (float) Static156.anInt3095 - (float) arg3 - 0.3F;
		@Pc(28) GL local28 = Static156.aGL1;
		local28.glBegin(2);
		local28.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local28.glVertex2f(local5, local18);
		local28.glVertex2f(local10, local26);
		local28.glEnd();
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIIII)V")
	public static void method2124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static156.method2664();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = local5 + (float) arg2;
		@Pc(18) float local18 = (float) Static156.anInt3095 - (float) arg1 - 0.3F;
		@Pc(20) GL local20 = Static156.aGL1;
		local20.glBegin(1);
		local20.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, arg4 > 255 ? -1 : (byte) arg4);
		local20.glVertex2f(local5, local18);
		local20.glVertex2f(local10, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([IIIII)V")
	public static void method2125(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static156.method2664();
		@Pc(2) GL local2 = Static156.aGL1;
		local2.glRasterPos2i(arg1, Static156.anInt3095 - arg2 - arg4);
		local2.glDisable(3042);
		local2.glDisable(3008);
		local2.glDrawPixels(arg3, arg4, 32993, Static156.aBoolean212 ? 33639 : 5121, IntBuffer.wrap(arg0));
		local2.glEnable(3008);
		local2.glEnable(3042);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "()V")
	public static void method2126() {
		anInt2496 = 0;
		anInt2497 = 0;
		anInt2499 = Static156.anInt3093;
		anInt2498 = Static156.anInt3095;
		@Pc(9) GL local9 = Static156.aGL1;
		local9.glDisable(3089);
		method2133();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)V")
	public static void method2127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static156.method2664();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = local5 + (float) arg2;
		@Pc(18) float local18 = (float) Static156.anInt3095 - (float) arg1 - 0.3F;
		@Pc(20) GL local20 = Static156.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local18);
		local20.glVertex2f(local10, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!af;)V")
	public static void method2128(@OriginalArg(0) Class1_Sub2_Sub1_Sub1 arg0) {
		if (arg0.anInt4454 != anInt2498 - anInt2497) {
			throw new IllegalArgumentException();
		}
		aClass1_Sub2_Sub1_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(IIIII)V")
	public static void method2129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static156.method2664();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static156.anInt3095 - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL local20 = Static156.aGL1;
		local20.glBegin(6);
		local20.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIII)V")
	public static void method2131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt2496 < arg0) {
			anInt2496 = arg0;
		}
		if (anInt2497 < arg1) {
			anInt2497 = arg1;
		}
		if (anInt2499 > arg2) {
			anInt2499 = arg2;
		}
		if (anInt2498 > arg3) {
			anInt2498 = arg3;
		}
		@Pc(21) GL local21 = Static156.aGL1;
		local21.glEnable(3089);
		if (anInt2496 <= anInt2499 && anInt2497 <= anInt2498) {
			local21.glScissor(Static156.anInt3080 + anInt2496, Static156.anInt3097 + (Static156.anInt3095 - anInt2498), anInt2499 - anInt2496, anInt2498 - anInt2497);
		} else {
			local21.glScissor(0, 0, 0, 0);
		}
		method2133();
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIIIII)V")
	public static void method2132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) GL local1 = Static156.aGL1;
		local1.glLineWidth((float) arg5);
		method2123(arg0, arg1, arg2, arg3, arg4);
		local1.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "()V")
	public static void method2133() {
		aClass1_Sub2_Sub1_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "()V")
	public static void method2134() {
		Static156.aGL1.glClear(16640);
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "(IIIII)V")
	public static void method2135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static156.method2664();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static156.anInt3095 - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL local29 = Static156.aGL1;
		local29.glBegin(2);
		local29.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(IIII)V")
	public static void method2136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static156.method2664();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(13) float local13 = (float) Static156.anInt3095 - (float) arg1 - 0.3F;
		@Pc(18) float local18 = local13 - (float) arg2;
		@Pc(20) GL local20 = Static156.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local13);
		local20.glVertex2f(local5, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(IIIIII)V")
	public static void method2137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static156.method2664();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static156.anInt3095 - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL local29 = Static156.aGL1;
		local29.glBegin(2);
		local29.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "(IIII)V")
	public static void method2138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > Static156.anInt3093) {
			arg2 = Static156.anInt3093;
		}
		if (arg3 > Static156.anInt3095) {
			arg3 = Static156.anInt3095;
		}
		anInt2496 = arg0;
		anInt2497 = arg1;
		anInt2499 = arg2;
		anInt2498 = arg3;
		@Pc(27) GL local27 = Static156.aGL1;
		local27.glEnable(3089);
		if (anInt2496 <= anInt2499 && anInt2497 <= anInt2498) {
			local27.glScissor(Static156.anInt3080 + anInt2496, Static156.anInt3097 + (Static156.anInt3095 - anInt2498), anInt2499 - anInt2496, anInt2498 - anInt2497);
		} else {
			local27.glScissor(0, 0, 0, 0);
		}
		method2133();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIILclient!af;)V")
	public static void method2139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub2_Sub1_Sub1 arg6) {
		if (anInt2498 - anInt2497 != arg6.anInt4454) {
			throw new IllegalStateException();
		}
		Static156.method2664();
		Static156.method2699(arg6.anInt2999);
		Static156.method2695(1);
		Static156.method2681(0);
		@Pc(22) float local22 = (float) arg0 + 0.3F;
		@Pc(27) float local27 = (float) arg2 + 0.3F;
		@Pc(35) float local35 = (float) Static156.anInt3095 - (float) arg1 - 0.3F;
		@Pc(43) float local43 = (float) Static156.anInt3095 - (float) arg3 - 0.3F;
		@Pc(45) GL local45 = Static156.aGL1;
		local45.glTexEnvi(8960, 34176, 34168);
		local45.glBegin(2);
		local45.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local45.glTexCoord2f((local22 - (float) anInt2496) / (float) arg6.anInt2993, ((float) Static156.anInt3095 - local35 - (float) anInt2497) / (float) arg6.anInt2995);
		local45.glVertex2f(local22, local35);
		local45.glTexCoord2f((local27 - (float) anInt2496) / (float) arg6.anInt2993, ((float) Static156.anInt3095 - local43 - (float) anInt2497) / (float) arg6.anInt2995);
		local45.glVertex2f(local27, local43);
		local45.glEnd();
		local45.glTexEnvi(8960, 34176, 5890);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([I)V")
	public static void method2140(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt2496;
		arg0[1] = anInt2497;
		arg0[2] = anInt2499;
		arg0[3] = anInt2498;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "([I)V")
	public static void method2141(@OriginalArg(0) int[] arg0) {
		method2138(arg0[0], arg0[1], arg0[2], arg0[3]);
	}
}
