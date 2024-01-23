import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
	public static int anInt2149 = 0;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
	public static int anInt2150 = 0;

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "Lclient!oa;")
	public static Class4_Sub3_Sub14_Sub2 aClass4_Sub3_Sub14_Sub2_1 = null;

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
	private static int anInt2151 = 0;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
	public static int anInt2152 = 0;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V")
	public static void method1684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static94.method1585();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = (float) arg2 + 0.3F;
		@Pc(18) float local18 = (float) Static94.anInt2083 - (float) arg1 - 0.3F;
		@Pc(26) float local26 = (float) Static94.anInt2083 - (float) arg3 - 0.3F;
		@Pc(28) GL local28 = Static94.aGL1;
		local28.glBegin(2);
		local28.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local28.glVertex2f(local5, local18);
		local28.glVertex2f(local10, local26);
		local28.glEnd();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIII)V")
	public static void method1685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static94.method1585();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static94.anInt2083 - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL local29 = Static94.aGL1;
		local29.glBegin(2);
		local29.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIIII)V")
	public static void method1686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static94.method1585();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = local5 + (float) arg2;
		@Pc(18) float local18 = (float) Static94.anInt2083 - (float) arg1 - 0.3F;
		@Pc(20) GL local20 = Static94.aGL1;
		local20.glBegin(1);
		local20.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, arg4 > 255 ? -1 : (byte) arg4);
		local20.glVertex2f(local5, local18);
		local20.glVertex2f(local10, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([I)V")
	public static void method1687(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt2150;
		arg0[1] = anInt2152;
		arg0[2] = anInt2151;
		arg0[3] = anInt2149;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIIIII)V")
	public static void method1688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) GL local1 = Static94.aGL1;
		local1.glLineWidth((float) arg5);
		method1684(arg0, arg1, arg2, arg3, arg4);
		local1.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIII)V")
	public static void method1689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static94.method1585();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(13) float local13 = (float) Static94.anInt2083 - (float) arg1 - 0.3F;
		@Pc(18) float local18 = local13 - (float) arg2;
		@Pc(20) GL local20 = Static94.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local13);
		local20.glVertex2f(local5, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIILclient!oa;)V")
	public static void method1690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class4_Sub3_Sub14_Sub2 arg6) {
		if (anInt2149 - anInt2152 != arg6.anInt5609) {
			throw new IllegalStateException();
		}
		Static94.method1585();
		Static94.method1600(arg6.anInt5615);
		Static94.method1597(1);
		Static94.method1607(0);
		@Pc(22) float local22 = (float) arg0 + 0.3F;
		@Pc(27) float local27 = (float) arg2 + 0.3F;
		@Pc(35) float local35 = (float) Static94.anInt2083 - (float) arg1 - 0.3F;
		@Pc(43) float local43 = (float) Static94.anInt2083 - (float) arg3 - 0.3F;
		@Pc(45) GL local45 = Static94.aGL1;
		local45.glTexEnvi(8960, 34176, 34168);
		local45.glBegin(2);
		local45.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local45.glTexCoord2f((local22 - (float) anInt2150) / (float) arg6.anInt5618, ((float) Static94.anInt2083 - local35 - (float) anInt2152) / (float) arg6.anInt5621);
		local45.glVertex2f(local22, local35);
		local45.glTexCoord2f((local27 - (float) anInt2150) / (float) arg6.anInt5618, ((float) Static94.anInt2083 - local43 - (float) anInt2152) / (float) arg6.anInt5621);
		local45.glVertex2f(local27, local43);
		local45.glEnd();
		local45.glTexEnvi(8960, 34176, 5890);
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(IIIII)V")
	public static void method1691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static94.method1585();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(12) float local12 = local5 + (float) (arg2 - 1);
		@Pc(20) float local20 = (float) Static94.anInt2083 - (float) arg1 - 0.3F;
		@Pc(27) float local27 = local20 - (float) (arg3 - 1);
		@Pc(29) GL local29 = Static94.aGL1;
		local29.glBegin(2);
		local29.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local29.glVertex2f(local5, local20);
		local29.glVertex2f(local5, local27);
		local29.glVertex2f(local12, local27);
		local29.glVertex2f(local12, local20);
		local29.glEnd();
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(IIIIII)V")
	public static void method1692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static94.method1585();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static94.anInt2083 - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL local20 = Static94.aGL1;
		local20.glBegin(6);
		local20.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, arg5 > 255 ? -1 : (byte) arg5);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIII)V")
	public static void method1693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt2150 < arg0) {
			anInt2150 = arg0;
		}
		if (anInt2152 < arg1) {
			anInt2152 = arg1;
		}
		if (anInt2151 > arg2) {
			anInt2151 = arg2;
		}
		if (anInt2149 > arg3) {
			anInt2149 = arg3;
		}
		@Pc(21) GL local21 = Static94.aGL1;
		local21.glEnable(3089);
		if (anInt2150 <= anInt2151 && anInt2152 <= anInt2149) {
			local21.glScissor(Static94.anInt2086 + anInt2150, Static94.anInt2078 + (Static94.anInt2083 - anInt2149), anInt2151 - anInt2150, anInt2149 - anInt2152);
		} else {
			local21.glScissor(0, 0, 0, 0);
		}
		method1703();
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(IIII)V")
	public static void method1694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > Static94.anInt2080) {
			arg2 = Static94.anInt2080;
		}
		if (arg3 > Static94.anInt2083) {
			arg3 = Static94.anInt2083;
		}
		anInt2150 = arg0;
		anInt2152 = arg1;
		anInt2151 = arg2;
		anInt2149 = arg3;
		@Pc(27) GL local27 = Static94.aGL1;
		local27.glEnable(3089);
		if (anInt2150 <= anInt2151 && anInt2152 <= anInt2149) {
			local27.glScissor(Static94.anInt2086 + anInt2150, Static94.anInt2078 + (Static94.anInt2083 - anInt2149), anInt2151 - anInt2150, anInt2149 - anInt2152);
		} else {
			local27.glScissor(0, 0, 0, 0);
		}
		method1703();
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "([I)V")
	public static void method1696(@OriginalArg(0) int[] arg0) {
		method1694(arg0[0], arg0[1], arg0[2], arg0[3]);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!oa;)V")
	public static void method1697(@OriginalArg(0) Class4_Sub3_Sub14_Sub2 arg0) {
		if (arg0.anInt5609 != anInt2149 - anInt2152) {
			throw new IllegalArgumentException();
		}
		aClass4_Sub3_Sub14_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([IIIII)V")
	public static void method1698(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static94.method1585();
		@Pc(2) GL local2 = Static94.aGL1;
		local2.glRasterPos2i(arg1, Static94.anInt2083 - arg2 - arg4);
		local2.glDisable(3042);
		local2.glDisable(3008);
		local2.glDrawPixels(arg3, arg4, 32993, Static94.aBoolean126 ? 33639 : 5121, IntBuffer.wrap(arg0));
		local2.glEnable(3008);
		local2.glEnable(3042);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "()V")
	public static void method1699() {
		anInt2150 = 0;
		anInt2152 = 0;
		anInt2151 = Static94.anInt2080;
		anInt2149 = Static94.anInt2083;
		@Pc(9) GL local9 = Static94.aGL1;
		local9.glDisable(3089);
		method1703();
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(IIII)V")
	public static void method1700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static94.method1585();
		@Pc(5) float local5 = (float) arg0 + 0.3F;
		@Pc(10) float local10 = local5 + (float) arg2;
		@Pc(18) float local18 = (float) Static94.anInt2083 - (float) arg1 - 0.3F;
		@Pc(20) GL local20 = Static94.aGL1;
		local20.glBegin(1);
		local20.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
		local20.glVertex2f(local5, local18);
		local20.glVertex2f(local10, local18);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "()V")
	public static void method1701() {
		Static94.aGL1.glClear(16640);
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(IIIII)V")
	public static void method1702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static94.method1585();
		@Pc(3) float local3 = (float) arg0;
		@Pc(8) float local8 = local3 + (float) arg2;
		@Pc(13) float local13 = (float) (Static94.anInt2083 - arg1);
		@Pc(18) float local18 = local13 - (float) arg3;
		@Pc(20) GL local20 = Static94.aGL1;
		local20.glBegin(6);
		local20.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
		local20.glVertex2f(local3, local13);
		local20.glVertex2f(local3, local18);
		local20.glVertex2f(local8, local18);
		local20.glVertex2f(local8, local13);
		local20.glEnd();
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "()V")
	public static void method1703() {
		aClass4_Sub3_Sub14_Sub2_1 = null;
	}
}
