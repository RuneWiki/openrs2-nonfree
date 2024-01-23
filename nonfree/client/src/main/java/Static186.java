import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "Lclient!vc;")
	public static Class4_Sub2_Sub1_Sub2 aClass4_Sub2_Sub1_Sub2_1 = null;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
	public static int anInt3728 = 0;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
	public static int anInt3729 = 0;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
	public static int anInt3730 = 0;

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
	private static int anInt3731 = 0;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([IIIII)V")
	public static void method2953(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static178.method2785();
		@Pc(2) GL local2 = Static178.aGL1;
		local2.glRasterPos2i(arg1, Static178.anInt3505 - arg2 - arg4);
		local2.glDisable(3042);
		local2.glDisable(3008);
		local2.glDrawPixels(arg3, arg4, 32993, Static178.aBoolean232 ? 33639 : 5121, IntBuffer.wrap(arg0));
		local2.glEnable(3008);
		local2.glEnable(3042);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIII)V")
	public static void method2954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static178.method2785();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static178.anInt3505 - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL local20 = Static178.aGL1;
		local20.glBegin(6);
		local20.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(IIIIII)V")
	public static void method2955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static178.method2785();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static178.anInt3505 - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL local29 = Static178.aGL1;
		local29.glBegin(2);
		local29.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([I)V")
	public static void method2956(@OriginalArg(0) int[] arg0) {
		method2963(arg0[0], arg0[1], arg0[2], arg0[3]);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "()V")
	public static void method2957() {
		anInt3728 = 0;
		anInt3729 = 0;
		anInt3731 = Static178.anInt3500;
		anInt3730 = Static178.anInt3505;
		@Pc(9) GL local9 = Static178.aGL1;
		local9.glDisable(3089);
		method2969();
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(IIIIII)V")
	public static void method2958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) GL local1 = Static178.aGL1;
		local1.glLineWidth((float) arg5);
		method2959(arg0, arg1, arg2, arg3, arg4);
		local1.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIII)V")
	public static void method2959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static178.method2785();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = (float) arg2 + 0.3F;
		@Pc(18) float local18 = (float) Static178.anInt3505 - (float) arg1 - 0.3F;
		@Pc(26) float local26 = (float) Static178.anInt3505 - (float) arg3 - 0.3F;
		@Pc(28) GL local28 = Static178.aGL1;
		local28.glBegin(2);
		local28.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local28.glVertex2f(local5, local18);
		local28.glVertex2f(local10, local26);
		local28.glEnd();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIII)V")
	public static void method2960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static178.method2785();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = local5 + (float) arg2;
		@Pc(18) float local18 = (float) Static178.anInt3505 - (float) arg1 - 0.3F;
		@Pc(20) GL local20 = Static178.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local18);
		local20.glVertex2f(local10, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "([I)V")
	public static void method2961(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt3728;
		arg0[1] = anInt3729;
		arg0[2] = anInt3731;
		arg0[3] = anInt3730;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(IIII)V")
	public static void method2962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static178.method2785();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(13) float local13 = (float) Static178.anInt3505 - (float) arg1 - 0.3F;
		@Pc(18) float local18 = local13 - (float) arg2;
		@Pc(20) GL local20 = Static178.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local13);
		local20.glVertex2f(local5, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(IIII)V")
	public static void method2963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > Static178.anInt3500) {
			arg2 = Static178.anInt3500;
		}
		if (arg3 > Static178.anInt3505) {
			arg3 = Static178.anInt3505;
		}
		anInt3728 = arg0;
		anInt3729 = arg1;
		anInt3731 = arg2;
		anInt3730 = arg3;
		@Pc(27) GL local27 = Static178.aGL1;
		local27.glEnable(3089);
		if (anInt3728 <= anInt3731 && anInt3729 <= anInt3730) {
			local27.glScissor(Static178.anInt3489 + anInt3728, Static178.anInt3499 + (Static178.anInt3505 - anInt3730), anInt3731 - anInt3728, anInt3730 - anInt3729);
		} else {
			local27.glScissor(0, 0, 0, 0);
		}
		method2969();
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(IIII)V")
	public static void method2964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt3728 < arg0) {
			anInt3728 = arg0;
		}
		if (anInt3729 < arg1) {
			anInt3729 = arg1;
		}
		if (anInt3731 > arg2) {
			anInt3731 = arg2;
		}
		if (anInt3730 > arg3) {
			anInt3730 = arg3;
		}
		@Pc(21) GL local21 = Static178.aGL1;
		local21.glEnable(3089);
		if (anInt3728 <= anInt3731 && anInt3729 <= anInt3730) {
			local21.glScissor(Static178.anInt3489 + anInt3728, Static178.anInt3499 + (Static178.anInt3505 - anInt3730), anInt3731 - anInt3728, anInt3730 - anInt3729);
		} else {
			local21.glScissor(0, 0, 0, 0);
		}
		method2969();
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "()V")
	public static void method2965() {
		aClass4_Sub2_Sub1_Sub2_1 = null;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!vc;)V")
	public static void method2966(@OriginalArg(0) Class4_Sub2_Sub1_Sub2 arg0) {
		if (arg0.anInt4308 != anInt3730 - anInt3729) {
			throw new IllegalArgumentException();
		}
		aClass4_Sub2_Sub1_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "()V")
	public static void method2967() {
		Static178.aGL1.glClear(16640);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(IIIII)V")
	public static void method2968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static178.method2785();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static178.anInt3505 - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL local20 = Static178.aGL1;
		local20.glBegin(6);
		local20.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "()V")
	public static void method2969() {
		aClass4_Sub2_Sub1_Sub2_1 = null;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(IIIII)V")
	public static void method2970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static178.method2785();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static178.anInt3505 - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL local29 = Static178.aGL1;
		local29.glBegin(2);
		local29.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}
}
