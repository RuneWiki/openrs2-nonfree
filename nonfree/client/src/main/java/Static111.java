import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
	private static int anInt2521 = 0;

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
	public static int anInt2522 = 0;

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
	public static int anInt2523 = 0;

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
	public static int anInt2524 = 0;

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "Lclient!of;")
	public static Class2_Sub8_Sub1_Sub2 aClass2_Sub8_Sub1_Sub2_1 = null;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIII)V")
	public static void method1878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) GL local1 = Static116.aGL1;
		local1.glLineWidth((float) arg5);
		method1886(arg0, arg1, arg2, arg3, arg4);
		local1.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "()V")
	public static void method1879() {
		aClass2_Sub8_Sub1_Sub2_1 = null;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)V")
	public static void method1880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt2522 < arg0) {
			anInt2522 = arg0;
		}
		if (anInt2524 < arg1) {
			anInt2524 = arg1;
		}
		if (anInt2521 > arg2) {
			anInt2521 = arg2;
		}
		if (anInt2523 > arg3) {
			anInt2523 = arg3;
		}
		@Pc(21) GL local21 = Static116.aGL1;
		local21.glEnable(3089);
		if (anInt2522 <= anInt2521 && anInt2524 <= anInt2523) {
			local21.glScissor(Static116.anInt2600 + anInt2522, Static116.anInt2598 + (Static116.anInt2590 - anInt2523), anInt2521 - anInt2522, anInt2523 - anInt2524);
		} else {
			local21.glScissor(0, 0, 0, 0);
		}
		method1879();
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(IIII)V")
	public static void method1881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static116.method1952();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = local5 + (float) arg2;
		@Pc(18) float local18 = (float) Static116.anInt2590 - (float) arg1 - 0.3F;
		@Pc(20) GL local20 = Static116.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local18);
		local20.glVertex2f(local10, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "([IIIII)V")
	public static void method1882(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static116.method1952();
		@Pc(2) GL local2 = Static116.aGL1;
		local2.glRasterPos2i(arg1, Static116.anInt2590 - arg2 - arg4);
		local2.glDisable(3042);
		local2.glDisable(3008);
		local2.glDrawPixels(arg3, arg4, 32993, Static116.aBoolean180 ? 33639 : 5121, IntBuffer.wrap(arg0));
		local2.glEnable(3008);
		local2.glEnable(3042);
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "()V")
	public static void method1883() {
		Static116.aGL1.glClear(16640);
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "()V")
	public static void method1884() {
		anInt2522 = 0;
		anInt2524 = 0;
		anInt2521 = Static116.anInt2607;
		anInt2523 = Static116.anInt2590;
		@Pc(9) GL local9 = Static116.aGL1;
		local9.glDisable(3089);
		method1879();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "([I)V")
	public static void method1885(@OriginalArg(0) int[] arg0) {
		method1895(arg0[0], arg0[1], arg0[2], arg0[3]);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIII)V")
	public static void method1886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static116.method1952();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = (float) arg2 + 0.3F;
		@Pc(18) float local18 = (float) Static116.anInt2590 - (float) arg1 - 0.3F;
		@Pc(26) float local26 = (float) Static116.anInt2590 - (float) arg3 - 0.3F;
		@Pc(28) GL local28 = Static116.aGL1;
		local28.glBegin(2);
		local28.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local28.glVertex2f(local5, local18);
		local28.glVertex2f(local10, local26);
		local28.glEnd();
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(IIIIII)V")
	public static void method1887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static116.method1952();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static116.anInt2590 - (float) arg1 - 0.3F;
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

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(IIIII)V")
	public static void method1888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static116.method1952();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static116.anInt2590 - arg1);
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

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "([I)V")
	public static void method1889(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt2522;
		arg0[1] = anInt2524;
		arg0[2] = anInt2521;
		arg0[3] = anInt2523;
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(IIIIII)V")
	public static void method1890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static116.method1952();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static116.anInt2590 - arg1);
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

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!of;)V")
	public static void method1891(@OriginalArg(0) Class2_Sub8_Sub1_Sub2 arg0) {
		if (arg0.anInt5517 != anInt2523 - anInt2524) {
			throw new IllegalArgumentException();
		}
		aClass2_Sub8_Sub1_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIILclient!of;)V")
	public static void method1892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub8_Sub1_Sub2 arg6) {
		if (anInt2523 - anInt2524 != arg6.anInt5517) {
			throw new IllegalStateException();
		}
		Static116.method1952();
		Static116.method1945(arg6.anInt5526);
		Static116.method1977(1);
		Static116.method1976(0);
		@Pc(22) float local22 = (float) arg0 + 0.3F;
		@Pc(27) float local27 = (float) arg2 + 0.3F;
		@Pc(35) float local35 = (float) Static116.anInt2590 - (float) arg1 - 0.3F;
		@Pc(43) float local43 = (float) Static116.anInt2590 - (float) arg3 - 0.3F;
		@Pc(45) GL local45 = Static116.aGL1;
		local45.glTexEnvi(8960, 34176, 34168);
		local45.glBegin(2);
		local45.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local45.glTexCoord2f((local22 - (float) anInt2522) / (float) arg6.anInt5529, ((float) Static116.anInt2590 - local35 - (float) anInt2524) / (float) arg6.anInt5530);
		local45.glVertex2f(local22, local35);
		local45.glTexCoord2f((local27 - (float) anInt2522) / (float) arg6.anInt5529, ((float) Static116.anInt2590 - local43 - (float) anInt2524) / (float) arg6.anInt5530);
		local45.glVertex2f(local27, local43);
		local45.glEnd();
		local45.glTexEnvi(8960, 34176, 5890);
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(IIIII)V")
	public static void method1893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static116.method1952();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = local5 + (float) arg2;
		@Pc(18) float local18 = (float) Static116.anInt2590 - (float) arg1 - 0.3F;
		@Pc(20) GL local20 = Static116.aGL1;
		local20.glBegin(1);
		local20.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, arg4 > 255 ? -1 : (byte) arg4);
		local20.glVertex2f(local5, local18);
		local20.glVertex2f(local10, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(IIII)V")
	public static void method1894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static116.method1952();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(13) float local13 = (float) Static116.anInt2590 - (float) arg1 - 0.3F;
		@Pc(18) float local18 = local13 - (float) arg2;
		@Pc(20) GL local20 = Static116.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local13);
		local20.glVertex2f(local5, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "(IIII)V")
	public static void method1895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > Static116.anInt2607) {
			arg2 = Static116.anInt2607;
		}
		if (arg3 > Static116.anInt2590) {
			arg3 = Static116.anInt2590;
		}
		anInt2522 = arg0;
		anInt2524 = arg1;
		anInt2521 = arg2;
		anInt2523 = arg3;
		@Pc(27) GL local27 = Static116.aGL1;
		local27.glEnable(3089);
		if (anInt2522 <= anInt2521 && anInt2524 <= anInt2523) {
			local27.glScissor(Static116.anInt2600 + anInt2522, Static116.anInt2598 + (Static116.anInt2590 - anInt2523), anInt2521 - anInt2522, anInt2523 - anInt2524);
		} else {
			local27.glScissor(0, 0, 0, 0);
		}
		method1879();
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "(IIIII)V")
	public static void method1897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static116.method1952();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static116.anInt2590 - (float) arg1 - 0.3F;
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
}
