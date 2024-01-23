import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "I")
	public static int anInt3501 = 0;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Lclient!we;")
	public static Class1_Sub3_Sub13_Sub1 aClass1_Sub3_Sub13_Sub1_1 = null;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "I")
	public static int anInt3502 = 0;

	@OriginalMember(owner = "client!le", name = "d", descriptor = "I")
	private static int anInt3503 = 0;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "I")
	public static int anInt3504 = 0;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "([IIIII)V")
	public static void method2529(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static294.method4502();
		@Pc(2) GL local2 = Static294.aGL1;
		local2.glRasterPos2i(arg1, Static294.anInt5874 - arg2 - arg4);
		local2.glDisable(3042);
		local2.glDisable(3008);
		local2.glDrawPixels(arg3, arg4, 32993, Static294.aBoolean377 ? 33639 : 5121, IntBuffer.wrap(arg0));
		local2.glEnable(3008);
		local2.glEnable(3042);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIII)V")
	public static void method2530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) GL local1 = Static294.aGL1;
		local1.glLineWidth((float) arg5);
		method2533(arg0, arg1, arg2, arg3, arg4);
		local1.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIII)V")
	public static void method2531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static294.method4502();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = local5 + (float) arg2;
		@Pc(18) float local18 = (float) Static294.anInt5874 - (float) arg1 - 0.3F;
		@Pc(20) GL local20 = Static294.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local18);
		local20.glVertex2f(local10, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(IIII)V")
	public static void method2532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static294.method4502();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(13) float local13 = (float) Static294.anInt5874 - (float) arg1 - 0.3F;
		@Pc(18) float local18 = local13 - (float) arg2;
		@Pc(20) GL local20 = Static294.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local13);
		local20.glVertex2f(local5, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIII)V")
	public static void method2533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static294.method4502();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = (float) arg2 + 0.3F;
		@Pc(18) float local18 = (float) Static294.anInt5874 - (float) arg1 - 0.3F;
		@Pc(26) float local26 = (float) Static294.anInt5874 - (float) arg3 - 0.3F;
		@Pc(28) GL local28 = Static294.aGL1;
		local28.glBegin(2);
		local28.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local28.glVertex2f(local5, local18);
		local28.glVertex2f(local10, local26);
		local28.glEnd();
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(IIII)V")
	public static void method2534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt3504 < arg0) {
			anInt3504 = arg0;
		}
		if (anInt3501 < arg1) {
			anInt3501 = arg1;
		}
		if (anInt3503 > arg2) {
			anInt3503 = arg2;
		}
		if (anInt3502 > arg3) {
			anInt3502 = arg3;
		}
		@Pc(21) GL local21 = Static294.aGL1;
		local21.glEnable(3089);
		if (anInt3504 <= anInt3503 && anInt3501 <= anInt3502) {
			local21.glScissor(Static294.anInt5885 + anInt3504, Static294.anInt5868 + (Static294.anInt5874 - anInt3502), anInt3503 - anInt3504, anInt3502 - anInt3501);
		} else {
			local21.glScissor(0, 0, 0, 0);
		}
		method2542();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIILclient!we;)V")
	public static void method2535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub3_Sub13_Sub1 arg6) {
		if (anInt3502 - anInt3501 != arg6.anInt5573) {
			throw new IllegalStateException();
		}
		Static294.method4502();
		Static294.method4486(arg6.anInt3658);
		Static294.method4488(1);
		Static294.method4490(0);
		@Pc(22) float local22 = (float) arg0 + 0.3F;
		@Pc(27) float local27 = (float) arg2 + 0.3F;
		@Pc(35) float local35 = (float) Static294.anInt5874 - (float) arg1 - 0.3F;
		@Pc(43) float local43 = (float) Static294.anInt5874 - (float) arg3 - 0.3F;
		@Pc(45) GL local45 = Static294.aGL1;
		local45.glTexEnvi(8960, 34176, 34168);
		local45.glBegin(2);
		local45.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local45.glTexCoord2f((local22 - (float) anInt3504) / (float) arg6.anInt3655, ((float) Static294.anInt5874 - local35 - (float) anInt3501) / (float) arg6.anInt3652);
		local45.glVertex2f(local22, local35);
		local45.glTexCoord2f((local27 - (float) anInt3504) / (float) arg6.anInt3655, ((float) Static294.anInt5874 - local43 - (float) anInt3501) / (float) arg6.anInt3652);
		local45.glVertex2f(local27, local43);
		local45.glEnd();
		local45.glTexEnvi(8960, 34176, 5890);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "([I)V")
	public static void method2536(@OriginalArg(0) int[] arg0) {
		method2546(arg0[0], arg0[1], arg0[2], arg0[3]);
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(IIIII)V")
	public static void method2537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static294.method4502();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static294.anInt5874 - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL local20 = Static294.aGL1;
		local20.glBegin(6);
		local20.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "()V")
	public static void method2538() {
		anInt3504 = 0;
		anInt3501 = 0;
		anInt3503 = Static294.anInt5873;
		anInt3502 = Static294.anInt5874;
		@Pc(9) GL local9 = Static294.aGL1;
		local9.glDisable(3089);
		method2542();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!we;)V")
	public static void method2539(@OriginalArg(0) Class1_Sub3_Sub13_Sub1 arg0) {
		if (arg0.anInt5573 != anInt3502 - anInt3501) {
			throw new IllegalArgumentException();
		}
		aClass1_Sub3_Sub13_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(IIIII)V")
	public static void method2540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static294.method4502();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static294.anInt5874 - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL local29 = Static294.aGL1;
		local29.glBegin(2);
		local29.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "()V")
	public static void method2541() {
		Static294.aGL1.glClear(16640);
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "()V")
	public static void method2542() {
		aClass1_Sub3_Sub13_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "([I)V")
	public static void method2543(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt3504;
		arg0[1] = anInt3501;
		arg0[2] = anInt3503;
		arg0[3] = anInt3502;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(IIIIII)V")
	public static void method2544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static294.method4502();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static294.anInt5874 - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL local29 = Static294.aGL1;
		local29.glBegin(2);
		local29.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(IIII)V")
	public static void method2546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > Static294.anInt5873) {
			arg2 = Static294.anInt5873;
		}
		if (arg3 > Static294.anInt5874) {
			arg3 = Static294.anInt5874;
		}
		anInt3504 = arg0;
		anInt3501 = arg1;
		anInt3503 = arg2;
		anInt3502 = arg3;
		@Pc(27) GL local27 = Static294.aGL1;
		local27.glEnable(3089);
		if (anInt3504 <= anInt3503 && anInt3501 <= anInt3502) {
			local27.glScissor(Static294.anInt5885 + anInt3504, Static294.anInt5868 + (Static294.anInt5874 - anInt3502), anInt3503 - anInt3504, anInt3502 - anInt3501);
		} else {
			local27.glScissor(0, 0, 0, 0);
		}
		method2542();
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(IIIIII)V")
	public static void method2547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static294.method4502();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static294.anInt5874 - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL local20 = Static294.aGL1;
		local20.glBegin(6);
		local20.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(IIIII)V")
	public static void method2548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static294.method4502();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = local5 + (float) arg2;
		@Pc(18) float local18 = (float) Static294.anInt5874 - (float) arg1 - 0.3F;
		@Pc(20) GL local20 = Static294.aGL1;
		local20.glBegin(1);
		local20.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, arg4 > 255 ? -1 : (byte) arg4);
		local20.glVertex2f(local5, local18);
		local20.glVertex2f(local10, local18);
		local20.glEnd();
	}
}
