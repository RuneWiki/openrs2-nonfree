import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "Lclient!ml;")
	public static Class3_Sub4_Sub12_Sub1 aClass3_Sub4_Sub12_Sub1_1 = null;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
	public static int anInt4684 = 0;

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
	public static int anInt4685 = 0;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
	private static int anInt4686 = 0;

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
	public static int anInt4687 = 0;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([I)V")
	public static void method3963(@OriginalArg(0) int[] arg0) {
		method3975(arg0[0], arg0[1], arg0[2], arg0[3]);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIII)V")
	public static void method3965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static283.method4650();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = (float) arg2 + 0.3F;
		@Pc(18) float local18 = (float) Static283.anInt5688 - (float) arg1 - 0.3F;
		@Pc(26) float local26 = (float) Static283.anInt5688 - (float) arg3 - 0.3F;
		@Pc(28) GL local28 = Static283.aGL1;
		local28.glBegin(2);
		local28.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local28.glVertex2f(local5, local18);
		local28.glVertex2f(local10, local26);
		local28.glEnd();
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "([I)V")
	public static void method3966(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt4685;
		arg0[1] = anInt4687;
		arg0[2] = anInt4686;
		arg0[3] = anInt4684;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "()V")
	public static void method3967() {
		aClass3_Sub4_Sub12_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)V")
	public static void method3968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static283.method4650();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(13) float local13 = (float) Static283.anInt5688 - (float) arg1 - 0.3F;
		@Pc(18) float local18 = local13 - (float) arg2;
		@Pc(20) GL local20 = Static283.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local13);
		local20.glVertex2f(local5, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([IIIII)V")
	public static void method3969(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static283.method4650();
		@Pc(2) GL local2 = Static283.aGL1;
		local2.glRasterPos2i(arg1, Static283.anInt5688 - arg2 - arg4);
		local2.glDisable(3042);
		local2.glDisable(3008);
		local2.glDrawPixels(arg3, arg4, 32993, Static283.aBoolean403 ? 33639 : 5121, IntBuffer.wrap(arg0));
		local2.glEnable(3008);
		local2.glEnable(3042);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIII)V")
	public static void method3970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) GL local1 = Static283.aGL1;
		local1.glLineWidth((float) arg5);
		method3965(arg0, arg1, arg2, arg3, arg4);
		local1.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIILclient!ml;)V")
	public static void method3971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub4_Sub12_Sub1 arg6) {
		if (anInt4684 - anInt4687 != arg6.anInt5729) {
			throw new IllegalStateException();
		}
		Static283.method4650();
		Static283.method4636(arg6.anInt2550);
		Static283.method4664(1);
		Static283.method4656(0);
		@Pc(22) float local22 = (float) arg0 + 0.3F;
		@Pc(27) float local27 = (float) arg2 + 0.3F;
		@Pc(35) float local35 = (float) Static283.anInt5688 - (float) arg1 - 0.3F;
		@Pc(43) float local43 = (float) Static283.anInt5688 - (float) arg3 - 0.3F;
		@Pc(45) GL local45 = Static283.aGL1;
		local45.glTexEnvi(8960, 34176, 34168);
		local45.glBegin(2);
		local45.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local45.glTexCoord2f((local22 - (float) anInt4685) / (float) arg6.anInt2554, ((float) Static283.anInt5688 - local35 - (float) anInt4687) / (float) arg6.anInt2549);
		local45.glVertex2f(local22, local35);
		local45.glTexCoord2f((local27 - (float) anInt4685) / (float) arg6.anInt2554, ((float) Static283.anInt5688 - local43 - (float) anInt4687) / (float) arg6.anInt2549);
		local45.glVertex2f(local27, local43);
		local45.glEnd();
		local45.glTexEnvi(8960, 34176, 5890);
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(IIIIII)V")
	public static void method3972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static283.method4650();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static283.anInt5688 - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL local29 = Static283.aGL1;
		local29.glBegin(2);
		local29.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(IIIII)V")
	public static void method3973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static283.method4650();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static283.anInt5688 - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL local20 = Static283.aGL1;
		local20.glBegin(6);
		local20.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(IIIIII)V")
	public static void method3974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static283.method4650();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static283.anInt5688 - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL local20 = Static283.aGL1;
		local20.glBegin(6);
		local20.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(IIII)V")
	public static void method3975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > Static283.anInt5695) {
			arg2 = Static283.anInt5695;
		}
		if (arg3 > Static283.anInt5688) {
			arg3 = Static283.anInt5688;
		}
		anInt4685 = arg0;
		anInt4687 = arg1;
		anInt4686 = arg2;
		anInt4684 = arg3;
		@Pc(27) GL local27 = Static283.aGL1;
		local27.glEnable(3089);
		if (anInt4685 <= anInt4686 && anInt4687 <= anInt4684) {
			local27.glScissor(Static283.anInt5678 + anInt4685, Static283.anInt5679 + (Static283.anInt5688 - anInt4684), anInt4686 - anInt4685, anInt4684 - anInt4687);
		} else {
			local27.glScissor(0, 0, 0, 0);
		}
		method3967();
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "()V")
	public static void method3976() {
		anInt4685 = 0;
		anInt4687 = 0;
		anInt4686 = Static283.anInt5695;
		anInt4684 = Static283.anInt5688;
		@Pc(9) GL local9 = Static283.aGL1;
		local9.glDisable(3089);
		method3967();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!ml;)V")
	public static void method3977(@OriginalArg(0) Class3_Sub4_Sub12_Sub1 arg0) {
		if (arg0.anInt5729 != anInt4684 - anInt4687) {
			throw new IllegalArgumentException();
		}
		aClass3_Sub4_Sub12_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "()V")
	public static void method3978() {
		Static283.aGL1.glClear(16640);
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(IIIII)V")
	public static void method3979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static283.method4650();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static283.anInt5688 - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL local29 = Static283.aGL1;
		local29.glBegin(2);
		local29.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(IIII)V")
	public static void method3980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt4685 < arg0) {
			anInt4685 = arg0;
		}
		if (anInt4687 < arg1) {
			anInt4687 = arg1;
		}
		if (anInt4686 > arg2) {
			anInt4686 = arg2;
		}
		if (anInt4684 > arg3) {
			anInt4684 = arg3;
		}
		@Pc(21) GL local21 = Static283.aGL1;
		local21.glEnable(3089);
		if (anInt4685 <= anInt4686 && anInt4687 <= anInt4684) {
			local21.glScissor(Static283.anInt5678 + anInt4685, Static283.anInt5679 + (Static283.anInt5688 - anInt4684), anInt4686 - anInt4685, anInt4684 - anInt4687);
		} else {
			local21.glScissor(0, 0, 0, 0);
		}
		method3967();
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(IIII)V")
	public static void method3981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static283.method4650();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = local5 + (float) arg2;
		@Pc(18) float local18 = (float) Static283.anInt5688 - (float) arg1 - 0.3F;
		@Pc(20) GL local20 = Static283.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local18);
		local20.glVertex2f(local10, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(IIIII)V")
	public static void method3982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static283.method4650();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = local5 + (float) arg2;
		@Pc(18) float local18 = (float) Static283.anInt5688 - (float) arg1 - 0.3F;
		@Pc(20) GL local20 = Static283.aGL1;
		local20.glBegin(1);
		local20.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, arg4 > 255 ? -1 : (byte) arg4);
		local20.glVertex2f(local5, local18);
		local20.glVertex2f(local10, local18);
		local20.glEnd();
	}
}
