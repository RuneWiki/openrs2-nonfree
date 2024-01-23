import java.awt.Canvas;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Locale;
import javax.media.opengl.GL;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLCapabilitiesChooser;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLDrawable;
import javax.media.opengl.GLDrawableFactory;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "Z")
	public static boolean aBoolean314;

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
	private static int anInt4918;

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
	private static int anInt4919;

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
	public static int anInt4921;

	@OriginalMember(owner = "client!sg", name = "i", descriptor = "Lgl!javax/media/opengl/GLContext;")
	private static GLContext aGLContext1;

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "Z")
	public static boolean aBoolean317;

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString166;

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
	private static int anInt4922;

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "Z")
	public static boolean aBoolean318;

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "Lgl!javax/media/opengl/GL;")
	public static GL aGL1;

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString167;

	@OriginalMember(owner = "client!sg", name = "q", descriptor = "F")
	private static float aFloat138;

	@OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
	private static int anInt4923;

	@OriginalMember(owner = "client!sg", name = "s", descriptor = "Z")
	public static boolean aBoolean319;

	@OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
	public static int anInt4924;

	@OriginalMember(owner = "client!sg", name = "y", descriptor = "Z")
	public static boolean aBoolean322;

	@OriginalMember(owner = "client!sg", name = "z", descriptor = "Z")
	public static boolean aBoolean323;

	@OriginalMember(owner = "client!sg", name = "A", descriptor = "Z")
	public static boolean aBoolean324;

	@OriginalMember(owner = "client!sg", name = "B", descriptor = "I")
	public static int anInt4925;

	@OriginalMember(owner = "client!sg", name = "H", descriptor = "F")
	private static float aFloat141;

	@OriginalMember(owner = "client!sg", name = "I", descriptor = "I")
	public static int anInt4928;

	@OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
	private static int anInt4929;

	@OriginalMember(owner = "client!sg", name = "K", descriptor = "Z")
	public static boolean aBoolean327;

	@OriginalMember(owner = "client!sg", name = "M", descriptor = "Z")
	public static boolean aBoolean328;

	@OriginalMember(owner = "client!sg", name = "N", descriptor = "Lgl!javax/media/opengl/GLDrawable;")
	private static GLDrawable aGLDrawable1;

	@OriginalMember(owner = "client!sg", name = "O", descriptor = "Z")
	public static boolean aBoolean329;

	@OriginalMember(owner = "client!sg", name = "P", descriptor = "I")
	public static int anInt4931;

	@OriginalMember(owner = "client!sg", name = "R", descriptor = "I")
	private static int anInt4932;

	@OriginalMember(owner = "client!sg", name = "S", descriptor = "Z")
	public static boolean aBoolean331;

	@OriginalMember(owner = "client!sg", name = "T", descriptor = "I")
	public static int anInt4933;

	@OriginalMember(owner = "client!sg", name = "V", descriptor = "Z")
	public static boolean aBoolean332;

	@OriginalMember(owner = "client!sg", name = "W", descriptor = "I")
	private static int anInt4935;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
	private static int anInt4917 = -1;

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
	private static int anInt4920 = -1;

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "Z")
	private static boolean aBoolean315 = true;

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "Z")
	private static boolean aBoolean316 = true;

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "F")
	private static float aFloat137 = 0.09765625F;

	@OriginalMember(owner = "client!sg", name = "t", descriptor = "Z")
	private static boolean aBoolean320 = true;

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "[F")
	private static float[] aFloatArray24 = new float[16];

	@OriginalMember(owner = "client!sg", name = "v", descriptor = "Z")
	private static boolean aBoolean321 = false;

	@OriginalMember(owner = "client!sg", name = "x", descriptor = "F")
	private static float aFloat139 = 0.0F;

	@OriginalMember(owner = "client!sg", name = "C", descriptor = "F")
	private static float aFloat140 = 0.0F;

	@OriginalMember(owner = "client!sg", name = "D", descriptor = "I")
	private static int anInt4926 = -1;

	@OriginalMember(owner = "client!sg", name = "E", descriptor = "Z")
	public static boolean aBoolean325 = true;

	@OriginalMember(owner = "client!sg", name = "F", descriptor = "I")
	private static int anInt4927 = 0;

	@OriginalMember(owner = "client!sg", name = "G", descriptor = "Z")
	private static boolean aBoolean326 = false;

	@OriginalMember(owner = "client!sg", name = "L", descriptor = "I")
	public static int anInt4930 = 0;

	@OriginalMember(owner = "client!sg", name = "Q", descriptor = "Z")
	public static boolean aBoolean330 = false;

	@OriginalMember(owner = "client!sg", name = "U", descriptor = "I")
	private static int anInt4934 = 0;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public static void method3851(@OriginalArg(0) int arg0) {
		if (arg0 == anInt4927) {
			return;
		}
		if (arg0 == 0) {
			aGL1.glTexEnvi(8960, 34162, 8448);
		}
		if (arg0 == 1) {
			aGL1.glTexEnvi(8960, 34162, 7681);
		}
		if (arg0 == 2) {
			aGL1.glTexEnvi(8960, 34162, 260);
		}
		anInt4927 = arg0;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII)V")
	public static void method3852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		method3853(0, 0, anInt4924, anInt4925, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIFFII)V")
	public static void method3853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = (arg0 - arg4 << 8) / arg8;
		@Pc(17) int local17 = (arg0 + arg2 - arg4 << 8) / arg8;
		@Pc(25) int local25 = (arg1 - arg5 << 8) / arg9;
		@Pc(35) int local35 = (arg1 + arg3 - arg5 << 8) / arg9;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		method3871((float) local7 * aFloat137, (float) local17 * aFloat137, (float) -local35 * aFloat137, (float) -local25 * aFloat137, 50.0F, 3584.0F);
		method3858(arg0, anInt4925 - arg1 - arg3, arg2, arg3);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		if (arg6 != 0.0F) {
			aGL1.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
		}
		if (arg7 != 0.0F) {
			aGL1.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
		}
		aBoolean321 = false;
		Static190.anInt3867 = local7;
		Static60.anInt1354 = local17;
		Static244.anInt4816 = local25;
		Static157.anInt314 = local35;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V")
	public static void method3854(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean316) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2896);
		} else {
			aGL1.glDisable(2896);
		}
		aBoolean316 = arg0;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(IIII)V")
	public static void method3855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		method3858(anInt4933, anInt4921, anInt4924, anInt4925);
		aBoolean321 = false;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "()V")
	public static void method3856() {
		aGL1.glDepthMask(false);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V")
	public static void method3857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt4924 = arg0;
		anInt4925 = arg1;
		aBoolean321 = false;
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(IIII)V")
	private static void method3858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		anInt4929 = arg0;
		anInt4922 = arg1;
		anInt4932 = arg2;
		anInt4918 = arg3;
		method3866();
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)V")
	public static void method3859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt4933 = arg0;
		anInt4921 = arg1;
		method3866();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public static void method3860(@OriginalArg(0) Canvas arg0) {
		try {
			if (!arg0.isDisplayable()) {
				return;
			}
			@Pc(5) GLDrawableFactory local5 = GLDrawableFactory.getFactory();
			@Pc(11) GLDrawable local11 = local5.getGLDrawable(arg0, null, null);
			local11.setRealized(true);
			@Pc(18) GLContext local18 = local11.createContext(null);
			local18.makeCurrent();
			local18.release();
			local18.destroy();
			local11.setRealized(false);
		} catch (@Pc(30) Throwable local30) {
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(F)V")
	public static void method3861(@OriginalArg(0) float arg0) {
		method3877(3000.0F, arg0 * 1.5F);
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "()V")
	public static void method3862() {
		aGL1.glClear(256);
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "()V")
	private static void method3863() {
		@Pc(2) int[] local2 = new int[1];
		aGL1.glGenTextures(1, local2, 0);
		anInt4931 = local2[0];
		aGL1.glBindTexture(3553, anInt4931);
		aGL1.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
		Static142.method2288();
		Static69.method1190();
		Static281.method4363();
	}

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "()V")
	public static void method3864() {
		if (Static253.aBoolean335) {
			method3854(true);
			method3882(true);
		} else {
			method3854(false);
			method3882(false);
		}
	}

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "()V")
	public static void method3865() {
		@Pc(2) int[] local2 = new int[2];
		aGL1.glGetIntegerv(3073, local2, 0);
		aGL1.glGetIntegerv(3074, local2, 1);
		aGL1.glDrawBuffer(1026);
		aGL1.glReadBuffer(1024);
		method3892(-1);
		aGL1.glPushAttrib(8192);
		aGL1.glDisable(2912);
		aGL1.glDisable(3042);
		aGL1.glDisable(2929);
		aGL1.glDisable(3008);
		aGL1.glRasterPos2i(0, 0);
		aGL1.glCopyPixels(0, 0, anInt4924, anInt4925, 6144);
		aGL1.glPopAttrib();
		aGL1.glDrawBuffer(local2[0]);
		aGL1.glReadBuffer(local2[1]);
	}

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "()V")
	private static void method3866() {
		aGL1.glViewport(anInt4929 + anInt4933, anInt4922 + anInt4921, anInt4932, anInt4918);
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
	public static void method3867(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16384);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(Z)V")
	public static void method3868(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean315) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2929);
		} else {
			aGL1.glDisable(2929);
		}
		aBoolean315 = arg0;
	}

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "()I")
	public static int method3869() {
		if (aBoolean324 && (anInt4920 <= 0 || anInt4917 != Static239.anInt4726)) {
			@Pc(9) int[] local9 = new int[1];
			aGL1.glGenFramebuffersEXT(1, local9, 0);
			anInt4917 = Static239.anInt4726;
			anInt4920 = local9[0];
		}
		return anInt4920;
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V")
	public static void method3870(@OriginalArg(0) int arg0) {
		if (arg0 == anInt4934) {
			return;
		}
		if (arg0 == 0) {
			aGL1.glTexEnvi(8960, 34161, 8448);
		}
		if (arg0 == 1) {
			aGL1.glTexEnvi(8960, 34161, 7681);
		}
		if (arg0 == 2) {
			aGL1.glTexEnvi(8960, 34161, 260);
		}
		if (arg0 == 3) {
			aGL1.glTexEnvi(8960, 34161, 34023);
		}
		if (arg0 == 4) {
			aGL1.glTexEnvi(8960, 34161, 34164);
		}
		if (arg0 == 5) {
			aGL1.glTexEnvi(8960, 34161, 34165);
		}
		anInt4934 = arg0;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(FFFFFF)V")
	private static void method3871(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(3) float local3 = arg4 * 2.0F;
		aFloatArray24[0] = local3 / (arg1 - arg0);
		aFloatArray24[1] = 0.0F;
		aFloatArray24[2] = 0.0F;
		aFloatArray24[3] = 0.0F;
		aFloatArray24[4] = 0.0F;
		aFloatArray24[5] = local3 / (arg3 - arg2);
		aFloatArray24[6] = 0.0F;
		aFloatArray24[7] = 0.0F;
		aFloatArray24[8] = (arg1 + arg0) / (arg1 - arg0);
		aFloatArray24[9] = (arg3 + arg2) / (arg3 - arg2);
		aFloatArray24[10] = aFloat138 = -(arg5 + arg4) / (arg5 - arg4);
		aFloatArray24[11] = -1.0F;
		aFloatArray24[12] = 0.0F;
		aFloatArray24[13] = 0.0F;
		aFloatArray24[14] = aFloat141 = -(local3 * arg5) / (arg5 - arg4);
		aFloatArray24[15] = 0.0F;
		aGL1.glLoadMatrixf(aFloatArray24, 0);
		aFloat139 = 0.0F;
		aFloat140 = 0.0F;
	}

	@OriginalMember(owner = "client!sg", name = "i", descriptor = "()V")
	public static void method3873() {
		if (aBoolean326) {
			aGL1.glMatrixMode(5890);
			aGL1.glLoadIdentity();
			aGL1.glMatrixMode(5888);
			aBoolean326 = false;
		}
	}

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "()V")
	public static void method3874() {
		Static126.method2046(0, 0);
		method3890();
		method3892(-1);
		method3854(false);
		method3868(false);
		method3894(false);
		method3873();
	}

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "()V")
	public static void method3875() {
		if (aGL1 != null) {
			try {
				Static281.method4365();
				Static303.method4659();
			} catch (@Pc(6) Throwable local6) {
			}
			aGL1 = null;
		}
		if (aGLContext1 != null) {
			Static239.method3682();
			try {
				if (GLContext.getCurrent() == aGLContext1) {
					aGLContext1.release();
				}
			} catch (@Pc(18) Throwable local18) {
			}
			try {
				aGLContext1.destroy();
			} catch (@Pc(22) Throwable local22) {
			}
			aGLContext1 = null;
		}
		if (aGLDrawable1 != null) {
			try {
				aGLDrawable1.setRealized(false);
			} catch (@Pc(31) Throwable local31) {
			}
			aGLDrawable1 = null;
		}
		Static142.method2282();
		aBoolean330 = false;
	}

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)V")
	public static void method3876(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16640);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(FF)V")
	public static void method3877(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (aBoolean321 || arg0 == aFloat139 && arg1 == aFloat140) {
			return;
		}
		aFloat139 = arg0;
		aFloat140 = arg1;
		if (arg1 == 0.0F) {
			aFloatArray24[10] = aFloat138;
			aFloatArray24[14] = aFloat141;
		} else {
			@Pc(25) float local25 = arg0 / (arg1 + arg0);
			@Pc(29) float local29 = local25 * local25;
			@Pc(42) float local42 = -aFloat141 * (1.0F - local25) * (1.0F - local25) / arg1;
			aFloatArray24[10] = aFloat138 + local42;
			aFloatArray24[14] = aFloat141 * local29;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadMatrixf(aFloatArray24, 0);
		aGL1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "()V")
	public static void method3878() {
		aGL1.glDepthMask(true);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(FFF)V")
	public static void method3879(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		aGL1.glMatrixMode(5890);
		if (aBoolean326) {
			aGL1.glLoadIdentity();
		}
		aGL1.glTranslatef(arg0, arg1, arg2);
		aGL1.glMatrixMode(5888);
		aBoolean326 = true;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIII)V")
	public static void method3880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) int local2 = -arg0;
		@Pc(6) int local6 = anInt4924 - arg0;
		@Pc(9) int local9 = -arg1;
		@Pc(13) int local13 = anInt4925 - arg1;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		@Pc(23) float local23 = (float) arg2 / 512.0F;
		@Pc(30) float local30 = local23 * (256.0F / (float) arg4);
		@Pc(37) float local37 = local23 * (256.0F / (float) arg5);
		aGL1.glOrtho((double) ((float) local2 * local30), (double) ((float) local6 * local30), (double) ((float) -local13 * local37), (double) ((float) -local9 * local37), (double) (50 - arg3), (double) (3584 - arg3));
		method3858(0, 0, anInt4924, anInt4925);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		aBoolean321 = false;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/awt/Canvas;I)I")
	public static int method3881(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1) {
		return method3891(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(Z)V")
	private static void method3882(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean325) {
			return;
		}
		if (arg0) {
			aGL1.glEnableClientState(32885);
		} else {
			aGL1.glDisableClientState(32885);
		}
		aBoolean325 = arg0;
	}

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "()F")
	public static float method3883() {
		return aFloat139;
	}

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "()F")
	public static float method3884() {
		return aFloat140;
	}

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "()V")
	public static void method3885() {
		Static126.method2046(0, 0);
		method3890();
		method3870(0);
		method3851(0);
		method3854(false);
		method3868(false);
		method3894(false);
		method3873();
	}

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "()V")
	public static void method3886() {
		Static126.method2046(0, 0);
		method3890();
		method3870(0);
		method3851(0);
		method3854(false);
		method3868(false);
		method3894(false);
		method3873();
	}

	@OriginalMember(owner = "client!sg", name = "q", descriptor = "()V")
	public static void method3887() {
		try {
			aGLDrawable1.swapBuffers();
		} catch (@Pc(3) Exception local3) {
		}
	}

	@OriginalMember(owner = "client!sg", name = "r", descriptor = "()V")
	private static void method3888() {
		aBoolean321 = false;
		aGL1.glDisable(3553);
		anInt4926 = -1;
		aGL1.glTexEnvi(8960, 8704, 34160);
		aGL1.glTexEnvi(8960, 34161, 8448);
		anInt4934 = 0;
		aGL1.glTexEnvi(8960, 34162, 8448);
		anInt4927 = 0;
		aGL1.glEnable(2896);
		aGL1.glEnable(2912);
		aGL1.glEnable(2929);
		aBoolean316 = true;
		aBoolean315 = true;
		aBoolean320 = true;
		Static145.method4496();
		aGL1.glActiveTexture(33985);
		aGL1.glTexEnvi(8960, 8704, 34160);
		aGL1.glTexEnvi(8960, 34161, 8448);
		aGL1.glTexEnvi(8960, 34162, 8448);
		aGL1.glActiveTexture(33984);
		aGL1.setSwapInterval(0);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		aGL1.glShadeModel(7425);
		aGL1.glClearDepth(1.0F);
		aGL1.glDepthFunc(515);
		method3878();
		aGL1.glMatrixMode(5890);
		aGL1.glLoadIdentity();
		aGL1.glPolygonMode(1028, 6914);
		aGL1.glEnable(2884);
		aGL1.glCullFace(1029);
		aGL1.glEnable(3042);
		aGL1.glBlendFunc(770, 771);
		aGL1.glEnable(3008);
		aGL1.glAlphaFunc(516, 0.0F);
		aGL1.glEnableClientState(32884);
		aGL1.glEnableClientState(32885);
		aBoolean325 = true;
		aGL1.glEnableClientState(32886);
		aGL1.glEnableClientState(32888);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		Static290.method4523();
		Static142.method2277();
	}

	@OriginalMember(owner = "client!sg", name = "s", descriptor = "()I")
	private static int method3889() {
		@Pc(1) int local1 = 0;
		aString166 = aGL1.glGetString(7936);
		aString167 = aGL1.glGetString(7937);
		@Pc(12) String local12 = aString166.toLowerCase();
		if (local12.indexOf("microsoft") != -1) {
			local1 = 1;
		}
		if (local12.indexOf("brian paul") != -1 || local12.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(39) String local39 = aGL1.glGetString(7938);
		@Pc(43) String[] local43 = local39.split("[. ]");
		if (local43.length >= 2) {
			try {
				@Pc(52) int local52 = Integer.parseInt(local43[0]);
				@Pc(57) int local57 = Integer.parseInt(local43[1]);
				anInt4919 = local52 * 10 + local57;
			} catch (@Pc(65) NumberFormatException local65) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (anInt4919 < 12) {
			local1 |= 0x2;
		}
		if (!aGL1.isExtensionAvailable("GL_ARB_multitexture")) {
			local1 |= 0x8;
		}
		if (!aGL1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local1 |= 0x20;
		}
		@Pc(100) int[] local100 = new int[1];
		aGL1.glGetIntegerv(34018, local100, 0);
		anInt4928 = local100[0];
		aGL1.glGetIntegerv(34929, local100, 0);
		anInt4935 = local100[0];
		aGL1.glGetIntegerv(34930, local100, 0);
		anInt4923 = local100[0];
		if (anInt4928 < 2 || anInt4935 < 2 || anInt4923 < 2) {
			local1 |= 0x10;
		}
		if (local1 != 0) {
			return local1;
		}
		aBoolean314 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		aBoolean327 = aGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		aBoolean328 = aGL1.isExtensionAvailable("GL_ARB_multisample");
		aBoolean317 = aGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		aBoolean331 = aGL1.isExtensionAvailable("GL_ARB_vertex_program");
		aBoolean324 = aGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		aGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		aBoolean323 = aGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		aBoolean329 = aGL1.isExtensionAvailable("GL_EXT_texture3D");
		aBoolean322 = aGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		aBoolean319 = aGL1.isExtensionAvailable("GL_ARB_texture_float");
		aBoolean318 = true;
		@Pc(197) String local197 = aString167.toLowerCase(Locale.ENGLISH);
		if (local197.indexOf("radeon") != -1) {
			@Pc(204) int local204 = 0;
			@Pc(206) boolean local206 = false;
			@Pc(214) String[] local214 = Static307.method4708(local197.replace('/', ' '), ' ');
			for (@Pc(216) int local216 = 0; local216 < local214.length; local216++) {
				@Pc(224) String local224 = local214[local216];
				if (local224.length() >= 4) {
					if (local224.charAt(0) == 'x' && Static177.method2914(local224.substring(1, 3))) {
						local206 = true;
						break;
					}
					if (Static177.method2914(local224.substring(0, 4))) {
						local204 = Static113.method1907(local224.substring(0, 4));
						break;
					}
				}
			}
			if (local204 >= 7000 && local204 <= 7999) {
				aBoolean327 = false;
			}
			if (local204 >= 7000 && local204 <= 9250) {
				aBoolean329 = false;
			}
			if (local204 >= 9200 || local206) {
				aBoolean319 = false;
			}
			aBoolean332 = aBoolean327;
			aBoolean318 = false;
		}
		if (aBoolean327) {
			try {
				@Pc(292) int[] local292 = new int[1];
				aGL1.glGenBuffersARB(1, local292, 0);
			} catch (@Pc(299) Throwable local299) {
				return -4;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!sg", name = "t", descriptor = "()V")
	private static void method3890() {
		if (aBoolean321) {
			return;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho(0.0D, (double) anInt4924, 0.0D, (double) anInt4925, -1.0D, 1.0D);
		method3858(0, 0, anInt4924, anInt4925);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aBoolean321 = true;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/awt/Canvas;ILgl!javax/media/opengl/GLContext;)I")
	private static int method3891(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) GLContext arg2) {
		try {
			if (!arg0.isDisplayable()) {
				return -1;
			}
			@Pc(8) GLCapabilities local8 = new GLCapabilities();
			if (arg1 > 0) {
				local8.setSampleBuffers(true);
				local8.setNumSamples(arg1);
			}
			@Pc(18) GLDrawableFactory local18 = GLDrawableFactory.getFactory();
			aGLDrawable1 = local18.getGLDrawable(arg0, local8, null);
			aGLDrawable1.setRealized(true);
			@Pc(29) int local29 = 0;
			@Pc(36) int var6;
			while (true) {
				aGLContext1 = aGLDrawable1.createContext(arg2);
				try {
					var6 = aGLContext1.makeCurrent();
					if (var6 != 0) {
						break;
					}
				} catch (@Pc(41) Exception local41) {
				}
				if (local29++ > 5) {
					return -2;
				}
				Static193.method3169(1000L);
			}
			aGL1 = aGLContext1.getGL();
			aBoolean330 = true;
			anInt4924 = arg0.getSize().width;
			anInt4925 = arg0.getSize().height;
			var6 = method3889();
			if (var6 != 0) {
				method3875();
				return var6;
			}
			method3863();
			method3888();
			aGL1.glClear(16384);
			local29 = 0;
			while (true) {
				try {
					aGLDrawable1.swapBuffers();
					break;
				} catch (@Pc(82) Exception local82) {
					if (local29++ > 5) {
						method3875();
						return -3;
					}
					Static193.method3169(100L);
				}
			}
			aGL1.glClear(16384);
			return 0;
		} catch (@Pc(99) Throwable local99) {
			method3875();
			return -5;
		}
	}

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "(I)V")
	public static void method3892(@OriginalArg(0) int arg0) {
		if (arg0 == anInt4926) {
			return;
		}
		if (arg0 == -1) {
			aGL1.glDisable(3553);
		} else {
			if (anInt4926 == -1) {
				aGL1.glEnable(3553);
			}
			aGL1.glBindTexture(3553, arg0);
		}
		anInt4926 = arg0;
	}

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "()V")
	public static void method3893() {
		Static126.method2046(0, 0);
		method3890();
		method3870(1);
		method3851(1);
		method3854(false);
		method3868(false);
		method3894(false);
		method3873();
	}

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "(Z)V")
	public static void method3894(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean320) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2912);
		} else {
			aGL1.glDisable(2912);
		}
		aBoolean320 = arg0;
	}
}
