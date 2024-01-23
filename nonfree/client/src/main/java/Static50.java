import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
	private static int anInt1064 = 0;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "Lclient!oh;")
	public static Class1_Sub2_Sub2_Sub2 aClass1_Sub2_Sub2_Sub2_1 = null;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
	public static int anInt1065 = 0;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
	public static int anInt1066 = 0;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
	public static int anInt1067 = 0;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIII)V")
	public static void method857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static240.method3778();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = local5 + (float) arg2;
		@Pc(18) float local18 = (float) Static240.anInt4961 - (float) arg1 - 0.3F;
		@Pc(20) GL local20 = Static240.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local18);
		local20.glVertex2f(local10, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(IIII)V")
	public static void method858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt1067 < arg0) {
			anInt1067 = arg0;
		}
		if (anInt1065 < arg1) {
			anInt1065 = arg1;
		}
		if (anInt1064 > arg2) {
			anInt1064 = arg2;
		}
		if (anInt1066 > arg3) {
			anInt1066 = arg3;
		}
		@Pc(21) GL local21 = Static240.aGL1;
		local21.glEnable(3089);
		if (anInt1067 <= anInt1064 && anInt1065 <= anInt1066) {
			local21.glScissor(Static240.anInt4947 + anInt1067, Static240.anInt4959 + (Static240.anInt4961 - anInt1066), anInt1064 - anInt1067, anInt1066 - anInt1065);
		} else {
			local21.glScissor(0, 0, 0, 0);
		}
		method864();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIII)V")
	public static void method859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) GL local1 = Static240.aGL1;
		local1.glLineWidth((float) arg5);
		method870(arg0, arg1, arg2, arg3, arg4);
		local1.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(IIII)V")
	public static void method860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static240.method3778();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(13) float local13 = (float) Static240.anInt4961 - (float) arg1 - 0.3F;
		@Pc(18) float local18 = local13 - (float) arg2;
		@Pc(20) GL local20 = Static240.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local13);
		local20.glVertex2f(local5, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "()V")
	public static void method861() {
		Static240.aGL1.glClear(16640);
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(IIIIII)V")
	public static void method862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static240.method3778();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static240.anInt4961 - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL local29 = Static240.aGL1;
		local29.glBegin(2);
		local29.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "()V")
	public static void method864() {
		aClass1_Sub2_Sub2_Sub2_1 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!oh;)V")
	public static void method865(@OriginalArg(0) Class1_Sub2_Sub2_Sub2 arg0) {
		if (arg0.anInt5112 != anInt1066 - anInt1065) {
			throw new IllegalArgumentException();
		}
		aClass1_Sub2_Sub2_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIII)V")
	public static void method866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static240.method3778();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static240.anInt4961 - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL local20 = Static240.aGL1;
		local20.glBegin(6);
		local20.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(IIII)V")
	public static void method867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > Static240.anInt4949) {
			arg2 = Static240.anInt4949;
		}
		if (arg3 > Static240.anInt4961) {
			arg3 = Static240.anInt4961;
		}
		anInt1067 = arg0;
		anInt1065 = arg1;
		anInt1064 = arg2;
		anInt1066 = arg3;
		@Pc(27) GL local27 = Static240.aGL1;
		local27.glEnable(3089);
		if (anInt1067 <= anInt1064 && anInt1065 <= anInt1066) {
			local27.glScissor(Static240.anInt4947 + anInt1067, Static240.anInt4959 + (Static240.anInt4961 - anInt1066), anInt1064 - anInt1067, anInt1066 - anInt1065);
		} else {
			local27.glScissor(0, 0, 0, 0);
		}
		method864();
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(IIIII)V")
	public static void method868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static240.method3778();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static240.anInt4961 - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL local29 = Static240.aGL1;
		local29.glBegin(2);
		local29.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "()V")
	public static void method869() {
		anInt1067 = 0;
		anInt1065 = 0;
		anInt1064 = Static240.anInt4949;
		anInt1066 = Static240.anInt4961;
		@Pc(9) GL local9 = Static240.aGL1;
		local9.glDisable(3089);
		method864();
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(IIIII)V")
	public static void method870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static240.method3778();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = (float) arg2 + 0.3F;
		@Pc(18) float local18 = (float) Static240.anInt4961 - (float) arg1 - 0.3F;
		@Pc(26) float local26 = (float) Static240.anInt4961 - (float) arg3 - 0.3F;
		@Pc(28) GL local28 = Static240.aGL1;
		local28.glBegin(2);
		local28.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local28.glVertex2f(local5, local18);
		local28.glVertex2f(local10, local26);
		local28.glEnd();
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(IIIIII)V")
	public static void method871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static240.method3778();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static240.anInt4961 - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL local20 = Static240.aGL1;
		local20.glBegin(6);
		local20.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([I)V")
	public static void method872(@OriginalArg(0) int[] arg0) {
		method867(arg0[0], arg0[1], arg0[2], arg0[3]);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([IIIII)V")
	public static void method873(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static240.method3778();
		@Pc(2) GL local2 = Static240.aGL1;
		local2.glRasterPos2i(arg1, Static240.anInt4961 - arg2 - arg4);
		local2.glDisable(3042);
		local2.glDisable(3008);
		local2.glDrawPixels(arg3, arg4, 32993, Static240.aBoolean379 ? 33639 : 5121, IntBuffer.wrap(arg0));
		local2.glEnable(3008);
		local2.glEnable(3042);
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "([I)V")
	public static void method874(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt1067;
		arg0[1] = anInt1065;
		arg0[2] = anInt1064;
		arg0[3] = anInt1066;
	}
}
