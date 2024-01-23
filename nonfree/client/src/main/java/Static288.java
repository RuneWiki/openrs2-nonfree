import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
	public static int anInt6089 = 0;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "Lclient!nk;")
	public static Class1_Sub2_Sub14_Sub2 aClass1_Sub2_Sub14_Sub2_1 = null;

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
	public static int anInt6090 = 0;

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
	public static int anInt6091 = 0;

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
	private static int anInt6092 = 0;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([I)V")
	public static void method4707(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt6091;
		arg0[1] = anInt6089;
		arg0[2] = anInt6092;
		arg0[3] = anInt6090;
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "([I)V")
	public static void method4708(@OriginalArg(0) int[] arg0) {
		method4714(arg0[0], arg0[1], arg0[2], arg0[3]);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIII)V")
	public static void method4709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static296.method4835();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static296.anInt6197 - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL local29 = Static296.aGL1;
		local29.glBegin(2);
		local29.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "()V")
	public static void method4710() {
		anInt6091 = 0;
		anInt6089 = 0;
		anInt6092 = Static296.anInt6200;
		anInt6090 = Static296.anInt6197;
		@Pc(9) GL local9 = Static296.aGL1;
		local9.glDisable(3089);
		method4724();
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIII)V")
	public static void method4711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static296.method4835();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = local5 + (float) arg2;
		@Pc(18) float local18 = (float) Static296.anInt6197 - (float) arg1 - 0.3F;
		@Pc(20) GL local20 = Static296.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local18);
		local20.glVertex2f(local10, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(IIII)V")
	public static void method4712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static296.method4835();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(13) float local13 = (float) Static296.anInt6197 - (float) arg1 - 0.3F;
		@Pc(18) float local18 = local13 - (float) arg2;
		@Pc(20) GL local20 = Static296.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local13);
		local20.glVertex2f(local5, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(IIIII)V")
	public static void method4713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static296.method4835();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static296.anInt6197 - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL local20 = Static296.aGL1;
		local20.glBegin(6);
		local20.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(IIII)V")
	public static void method4714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > Static296.anInt6200) {
			arg2 = Static296.anInt6200;
		}
		if (arg3 > Static296.anInt6197) {
			arg3 = Static296.anInt6197;
		}
		anInt6091 = arg0;
		anInt6089 = arg1;
		anInt6092 = arg2;
		anInt6090 = arg3;
		@Pc(27) GL local27 = Static296.aGL1;
		local27.glEnable(3089);
		if (anInt6091 <= anInt6092 && anInt6089 <= anInt6090) {
			local27.glScissor(Static296.anInt6212 + anInt6091, Static296.anInt6209 + (Static296.anInt6197 - anInt6090), anInt6092 - anInt6091, anInt6090 - anInt6089);
		} else {
			local27.glScissor(0, 0, 0, 0);
		}
		method4724();
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "()V")
	public static void method4715() {
		Static296.aGL1.glClear(16640);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIII)V")
	public static void method4716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static296.method4835();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static296.anInt6197 - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL local20 = Static296.aGL1;
		local20.glBegin(6);
		local20.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "(IIII)V")
	public static void method4717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt6091 < arg0) {
			anInt6091 = arg0;
		}
		if (anInt6089 < arg1) {
			anInt6089 = arg1;
		}
		if (anInt6092 > arg2) {
			anInt6092 = arg2;
		}
		if (anInt6090 > arg3) {
			anInt6090 = arg3;
		}
		@Pc(21) GL local21 = Static296.aGL1;
		local21.glEnable(3089);
		if (anInt6091 <= anInt6092 && anInt6089 <= anInt6090) {
			local21.glScissor(Static296.anInt6212 + anInt6091, Static296.anInt6209 + (Static296.anInt6197 - anInt6090), anInt6092 - anInt6091, anInt6090 - anInt6089);
		} else {
			local21.glScissor(0, 0, 0, 0);
		}
		method4724();
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(IIIII)V")
	public static void method4718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static296.method4835();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = (float) arg2 + 0.3F;
		@Pc(18) float local18 = (float) Static296.anInt6197 - (float) arg1 - 0.3F;
		@Pc(26) float local26 = (float) Static296.anInt6197 - (float) arg3 - 0.3F;
		@Pc(28) GL local28 = Static296.aGL1;
		local28.glBegin(2);
		local28.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local28.glVertex2f(local5, local18);
		local28.glVertex2f(local10, local26);
		local28.glEnd();
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([IIIII)V")
	public static void method4719(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static296.method4835();
		@Pc(2) GL local2 = Static296.aGL1;
		local2.glRasterPos2i(arg1, Static296.anInt6197 - arg2 - arg4);
		local2.glDisable(3042);
		local2.glDisable(3008);
		local2.glDrawPixels(arg3, arg4, 32993, Static296.aBoolean344 ? 33639 : 5121, IntBuffer.wrap(arg0));
		local2.glEnable(3008);
		local2.glEnable(3042);
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(IIIIII)V")
	public static void method4720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) GL local1 = Static296.aGL1;
		local1.glLineWidth((float) arg5);
		method4718(arg0, arg1, arg2, arg3, arg4);
		local1.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!nk;)V")
	public static void method4721(@OriginalArg(0) Class1_Sub2_Sub14_Sub2 arg0) {
		if (arg0.anInt3430 != anInt6090 - anInt6089) {
			throw new IllegalArgumentException();
		}
		aClass1_Sub2_Sub14_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(IIIIII)V")
	public static void method4723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static296.method4835();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static296.anInt6197 - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL local29 = Static296.aGL1;
		local29.glBegin(2);
		local29.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "()V")
	public static void method4724() {
		aClass1_Sub2_Sub14_Sub2_1 = null;
	}
}
