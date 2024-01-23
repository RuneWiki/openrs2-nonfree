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

public final class Static291 {

	@OriginalMember(owner = "client!un", name = "d", descriptor = "Z")
	public static boolean aBoolean396;

	@OriginalMember(owner = "client!un", name = "e", descriptor = "Z")
	public static boolean aBoolean397;

	@OriginalMember(owner = "client!un", name = "g", descriptor = "I")
	private static int anInt5502;

	@OriginalMember(owner = "client!un", name = "i", descriptor = "Z")
	public static boolean aBoolean399;

	@OriginalMember(owner = "client!un", name = "m", descriptor = "Ljava/lang/String;")
	private static String aString184;

	@OriginalMember(owner = "client!un", name = "n", descriptor = "Z")
	public static boolean aBoolean401;

	@OriginalMember(owner = "client!un", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString185;

	@OriginalMember(owner = "client!un", name = "p", descriptor = "Z")
	public static boolean aBoolean402;

	@OriginalMember(owner = "client!un", name = "q", descriptor = "Lgl!javax/media/opengl/GL;")
	public static GL aGL1;

	@OriginalMember(owner = "client!un", name = "t", descriptor = "I")
	public static int anInt5505;

	@OriginalMember(owner = "client!un", name = "u", descriptor = "Lgl!javax/media/opengl/GLDrawable;")
	private static GLDrawable aGLDrawable1;

	@OriginalMember(owner = "client!un", name = "v", descriptor = "I")
	public static int anInt5506;

	@OriginalMember(owner = "client!un", name = "x", descriptor = "Z")
	public static boolean aBoolean405;

	@OriginalMember(owner = "client!un", name = "A", descriptor = "I")
	private static int anInt5508;

	@OriginalMember(owner = "client!un", name = "B", descriptor = "Lgl!javax/media/opengl/GLContext;")
	private static GLContext aGLContext1;

	@OriginalMember(owner = "client!un", name = "C", descriptor = "Z")
	public static boolean aBoolean407;

	@OriginalMember(owner = "client!un", name = "D", descriptor = "I")
	private static int anInt5509;

	@OriginalMember(owner = "client!un", name = "E", descriptor = "F")
	private static float aFloat56;

	@OriginalMember(owner = "client!un", name = "F", descriptor = "I")
	private static int anInt5510;

	@OriginalMember(owner = "client!un", name = "G", descriptor = "I")
	public static int anInt5511;

	@OriginalMember(owner = "client!un", name = "H", descriptor = "Z")
	public static boolean aBoolean408;

	@OriginalMember(owner = "client!un", name = "J", descriptor = "I")
	public static int anInt5512;

	@OriginalMember(owner = "client!un", name = "L", descriptor = "I")
	private static int anInt5514;

	@OriginalMember(owner = "client!un", name = "M", descriptor = "Z")
	public static boolean aBoolean409;

	@OriginalMember(owner = "client!un", name = "O", descriptor = "Z")
	public static boolean aBoolean410;

	@OriginalMember(owner = "client!un", name = "P", descriptor = "Z")
	public static boolean aBoolean411;

	@OriginalMember(owner = "client!un", name = "R", descriptor = "F")
	private static float aFloat59;

	@OriginalMember(owner = "client!un", name = "S", descriptor = "I")
	private static int anInt5515;

	@OriginalMember(owner = "client!un", name = "T", descriptor = "I")
	public static int anInt5516;

	@OriginalMember(owner = "client!un", name = "U", descriptor = "I")
	private static int anInt5517;

	@OriginalMember(owner = "client!un", name = "V", descriptor = "Z")
	public static boolean aBoolean413;

	@OriginalMember(owner = "client!un", name = "W", descriptor = "I")
	public static int anInt5518;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "I")
	private static int anInt5500 = -1;

	@OriginalMember(owner = "client!un", name = "b", descriptor = "Z")
	private static boolean aBoolean395 = true;

	@OriginalMember(owner = "client!un", name = "c", descriptor = "[F")
	private static float[] aFloatArray30 = new float[16];

	@OriginalMember(owner = "client!un", name = "f", descriptor = "I")
	private static int anInt5501 = 0;

	@OriginalMember(owner = "client!un", name = "h", descriptor = "Z")
	private static boolean aBoolean398 = false;

	@OriginalMember(owner = "client!un", name = "j", descriptor = "F")
	private static float aFloat55 = 0.09765625F;

	@OriginalMember(owner = "client!un", name = "k", descriptor = "I")
	private static int anInt5503 = 0;

	@OriginalMember(owner = "client!un", name = "l", descriptor = "Z")
	private static boolean aBoolean400 = true;

	@OriginalMember(owner = "client!un", name = "r", descriptor = "I")
	private static int anInt5504 = -1;

	@OriginalMember(owner = "client!un", name = "s", descriptor = "Z")
	private static boolean aBoolean403 = false;

	@OriginalMember(owner = "client!un", name = "w", descriptor = "Z")
	public static boolean aBoolean404 = false;

	@OriginalMember(owner = "client!un", name = "y", descriptor = "I")
	private static int anInt5507 = -1;

	@OriginalMember(owner = "client!un", name = "z", descriptor = "Z")
	private static boolean aBoolean406 = true;

	@OriginalMember(owner = "client!un", name = "I", descriptor = "F")
	private static float aFloat57 = 0.0F;

	@OriginalMember(owner = "client!un", name = "K", descriptor = "I")
	public static int anInt5513 = 0;

	@OriginalMember(owner = "client!un", name = "N", descriptor = "F")
	private static float aFloat58 = 0.0F;

	@OriginalMember(owner = "client!un", name = "Q", descriptor = "Z")
	public static boolean aBoolean412 = true;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(FF)V")
	public static void method4291(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (aBoolean403 || arg0 == aFloat58 && arg1 == aFloat57) {
			return;
		}
		aFloat58 = arg0;
		aFloat57 = arg1;
		if (arg1 == 0.0F) {
			aFloatArray30[10] = aFloat59;
			aFloatArray30[14] = aFloat56;
		} else {
			@Pc(25) float local25 = arg0 / (arg1 + arg0);
			@Pc(29) float local29 = local25 * local25;
			@Pc(42) float local42 = -aFloat56 * (1.0F - local25) * (1.0F - local25) / arg1;
			aFloatArray30[10] = aFloat59 + local42;
			aFloatArray30[14] = aFloat56 * local29;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadMatrixf(aFloatArray30, 0);
		aGL1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)V")
	public static void method4292(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean395) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2929);
		} else {
			aGL1.glDisable(2929);
		}
		aBoolean395 = arg0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "()V")
	public static void method4293() {
		if (Static302.aBoolean419) {
			method4331(true);
			method4332(true);
		} else {
			method4331(false);
			method4332(false);
		}
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "()V")
	public static void method4294() {
		try {
			aGLDrawable1.swapBuffers();
		} catch (@Pc(3) Exception local3) {
		}
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "()V")
	private static void method4295() {
		aBoolean403 = false;
		aGL1.glDisable(3553);
		anInt5500 = -1;
		aGL1.glTexEnvi(8960, 8704, 34160);
		aGL1.glTexEnvi(8960, 34161, 8448);
		anInt5503 = 0;
		aGL1.glTexEnvi(8960, 34162, 8448);
		anInt5501 = 0;
		aGL1.glEnable(2896);
		aGL1.glEnable(2912);
		aGL1.glEnable(2929);
		aBoolean400 = true;
		aBoolean395 = true;
		aBoolean406 = true;
		Static112.method1807();
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
		method4333();
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
		aBoolean412 = true;
		aGL1.glEnableClientState(32886);
		aGL1.glEnableClientState(32888);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		Static96.method1393();
		Static294.method4360();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
	public static void method4296(@OriginalArg(0) int arg0) {
		if (arg0 == anInt5503) {
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
		anInt5503 = arg0;
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "()V")
	public static void method4297() {
		if (aBoolean398) {
			aGL1.glMatrixMode(5890);
			aGL1.glLoadIdentity();
			aGL1.glMatrixMode(5888);
			aBoolean398 = false;
		}
	}

	@OriginalMember(owner = "client!un", name = "e", descriptor = "()F")
	public static float method4298() {
		return aFloat57;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(F)V")
	public static void method4299(@OriginalArg(0) float arg0) {
		method4291(3000.0F, arg0 * 1.5F);
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V")
	public static void method4300(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16384);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!un", name = "f", descriptor = "()V")
	public static void method4301() {
		Static207.method3280(0, 0);
		method4328();
		method4296(0);
		method4323(0);
		method4331(false);
		method4292(false);
		method4321(false);
		method4297();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIII)V")
	private static void method4302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		anInt5509 = arg0;
		anInt5517 = arg1;
		anInt5514 = arg2;
		anInt5510 = arg3;
		method4305();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(FFF)V")
	public static void method4303(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		aGL1.glMatrixMode(5890);
		if (aBoolean398) {
			aGL1.glLoadIdentity();
		}
		aGL1.glTranslatef(arg0, arg1, arg2);
		aGL1.glMatrixMode(5888);
		aBoolean398 = true;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/awt/Canvas;I)I")
	public static int method4304(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1) {
		return method4334(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!un", name = "g", descriptor = "()V")
	private static void method4305() {
		aGL1.glViewport(anInt5509 + anInt5518, anInt5517 + anInt5511, anInt5514, anInt5510);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(FFFFFF)V")
	private static void method4306(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(3) float local3 = arg4 * 2.0F;
		aFloatArray30[0] = local3 / (arg1 - arg0);
		aFloatArray30[1] = 0.0F;
		aFloatArray30[2] = 0.0F;
		aFloatArray30[3] = 0.0F;
		aFloatArray30[4] = 0.0F;
		aFloatArray30[5] = local3 / (arg3 - arg2);
		aFloatArray30[6] = 0.0F;
		aFloatArray30[7] = 0.0F;
		aFloatArray30[8] = (arg1 + arg0) / (arg1 - arg0);
		aFloatArray30[9] = (arg3 + arg2) / (arg3 - arg2);
		aFloatArray30[10] = aFloat59 = -(arg5 + arg4) / (arg5 - arg4);
		aFloatArray30[11] = -1.0F;
		aFloatArray30[12] = 0.0F;
		aFloatArray30[13] = 0.0F;
		aFloatArray30[14] = aFloat56 = -(local3 * arg5) / (arg5 - arg4);
		aFloatArray30[15] = 0.0F;
		aGL1.glLoadMatrixf(aFloatArray30, 0);
		aFloat58 = 0.0F;
		aFloat57 = 0.0F;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIIIFFII)V")
	public static void method4307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = (arg0 - arg4 << 8) / arg8;
		@Pc(17) int local17 = (arg0 + arg2 - arg4 << 8) / arg8;
		@Pc(25) int local25 = (arg1 - arg5 << 8) / arg9;
		@Pc(35) int local35 = (arg1 + arg3 - arg5 << 8) / arg9;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		method4306((float) local7 * aFloat55, (float) local17 * aFloat55, (float) -local35 * aFloat55, (float) -local25 * aFloat55, 50.0F, 3584.0F);
		method4302(arg0, anInt5512 - arg1 - arg3, arg2, arg3);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		if (arg6 != 0.0F) {
			aGL1.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
		}
		if (arg7 != 0.0F) {
			aGL1.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
		}
		aBoolean403 = false;
		Static25.anInt487 = local7;
		Static187.anInt3768 = local17;
		Static56.anInt1120 = local25;
		Static38.anInt768 = local35;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(IIII)V")
	public static void method4308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		method4307(0, 0, anInt5505, anInt5512, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
	}

	@OriginalMember(owner = "client!un", name = "h", descriptor = "()V")
	public static void method4309() {
		if (aGL1 != null) {
			try {
				Static266.method3964();
				Static315.method4653();
			} catch (@Pc(6) Throwable local6) {
			}
			aGL1 = null;
		}
		if (aGLContext1 != null) {
			Static74.method1188();
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
		Static294.method4355();
		aBoolean404 = false;
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(I)V")
	public static void method4310(@OriginalArg(0) int arg0) {
		if (arg0 == anInt5500) {
			return;
		}
		if (arg0 == -1) {
			aGL1.glDisable(3553);
		} else {
			if (anInt5500 == -1) {
				aGL1.glEnable(3553);
			}
			aGL1.glBindTexture(3553, arg0);
		}
		anInt5500 = arg0;
	}

	@OriginalMember(owner = "client!un", name = "i", descriptor = "()V")
	public static void method4311() {
		Static207.method3280(0, 0);
		method4328();
		method4296(1);
		method4323(1);
		method4331(false);
		method4292(false);
		method4321(false);
		method4297();
	}

	@OriginalMember(owner = "client!un", name = "j", descriptor = "()V")
	public static void method4312() {
		@Pc(2) int[] local2 = new int[2];
		aGL1.glGetIntegerv(3073, local2, 0);
		aGL1.glGetIntegerv(3074, local2, 1);
		aGL1.glDrawBuffer(1026);
		aGL1.glReadBuffer(1024);
		method4310(-1);
		aGL1.glPushAttrib(8192);
		aGL1.glDisable(2912);
		aGL1.glDisable(3042);
		aGL1.glDisable(2929);
		aGL1.glDisable(3008);
		aGL1.glRasterPos2i(0, 0);
		aGL1.glCopyPixels(0, 0, anInt5505, anInt5512, 6144);
		aGL1.glPopAttrib();
		aGL1.glDrawBuffer(local2[0]);
		aGL1.glReadBuffer(local2[1]);
	}

	@OriginalMember(owner = "client!un", name = "k", descriptor = "()I")
	public static int method4313() {
		if (aBoolean397 && (anInt5504 <= 0 || anInt5507 != Static74.anInt1419)) {
			@Pc(9) int[] local9 = new int[1];
			aGL1.glGenFramebuffersEXT(1, local9, 0);
			anInt5507 = Static74.anInt1419;
			anInt5504 = local9[0];
		}
		return anInt5504;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)V")
	public static void method4314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt5505 = arg0;
		anInt5512 = arg1;
		aBoolean403 = false;
	}

	@OriginalMember(owner = "client!un", name = "l", descriptor = "()V")
	public static void method4315() {
		aGL1.glClear(256);
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "(I)V")
	public static void method4316(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16640);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIII)V")
	public static void method4317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) int local2 = -arg0;
		@Pc(6) int local6 = anInt5505 - arg0;
		@Pc(9) int local9 = -arg1;
		@Pc(13) int local13 = anInt5512 - arg1;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		@Pc(23) float local23 = (float) arg2 / 512.0F;
		@Pc(30) float local30 = local23 * (256.0F / (float) arg4);
		@Pc(37) float local37 = local23 * (256.0F / (float) arg5);
		aGL1.glOrtho((double) ((float) local2 * local30), (double) ((float) local6 * local30), (double) ((float) -local13 * local37), (double) ((float) -local9 * local37), (double) (50 - arg3), (double) (3584 - arg3));
		method4302(0, 0, anInt5505, anInt5512);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		aBoolean403 = false;
	}

	@OriginalMember(owner = "client!un", name = "m", descriptor = "()I")
	private static int method4318() {
		@Pc(1) int local1 = 0;
		aString185 = aGL1.glGetString(7936);
		aString184 = aGL1.glGetString(7937);
		@Pc(12) String local12 = aString185.toLowerCase();
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
				anInt5502 = local52 * 10 + local57;
			} catch (@Pc(65) NumberFormatException local65) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (anInt5502 < 12) {
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
		anInt5516 = local100[0];
		aGL1.glGetIntegerv(34929, local100, 0);
		anInt5515 = local100[0];
		aGL1.glGetIntegerv(34930, local100, 0);
		anInt5508 = local100[0];
		if (anInt5516 < 2 || anInt5515 < 2 || anInt5508 < 2) {
			local1 |= 0x10;
		}
		if (local1 != 0) {
			return local1;
		}
		aBoolean413 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		aBoolean405 = aGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		aBoolean409 = aGL1.isExtensionAvailable("GL_ARB_multisample");
		aBoolean408 = aGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		aBoolean407 = aGL1.isExtensionAvailable("GL_ARB_vertex_program");
		aBoolean397 = aGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		aGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		aBoolean401 = aGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		aBoolean396 = aGL1.isExtensionAvailable("GL_EXT_texture3D");
		aBoolean410 = aGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		aBoolean399 = aGL1.isExtensionAvailable("GL_ARB_texture_float");
		aBoolean402 = true;
		@Pc(197) String local197 = aString184.toLowerCase(Locale.ENGLISH);
		if (local197.indexOf("radeon") != -1) {
			@Pc(204) int local204 = 0;
			@Pc(206) boolean local206 = false;
			@Pc(214) String[] local214 = Static37.method679(local197.replace('/', ' '), ' ');
			for (@Pc(216) int local216 = 0; local216 < local214.length; local216++) {
				@Pc(224) String local224 = local214[local216];
				if (local224.length() >= 4) {
					if (local224.charAt(0) == 'x' && Static89.method1322(local224.substring(1, 3))) {
						local206 = true;
						break;
					}
					if (Static89.method1322(local224.substring(0, 4))) {
						local204 = Static199.method3218(local224.substring(0, 4));
						break;
					}
				}
			}
			if (local204 >= 7000 && local204 <= 7999) {
				aBoolean405 = false;
			}
			if (local204 >= 7000 && local204 <= 9250) {
				aBoolean396 = false;
			}
			if (local204 >= 9200 || local206) {
				aBoolean399 = false;
			}
			aBoolean411 = aBoolean405;
			aBoolean402 = false;
		}
		if (aBoolean405) {
			try {
				@Pc(292) int[] local292 = new int[1];
				aGL1.glGenBuffersARB(1, local292, 0);
			} catch (@Pc(299) Throwable local299) {
				return -4;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!un", name = "n", descriptor = "()V")
	public static void method4319() {
		Static207.method3280(0, 0);
		method4328();
		method4310(-1);
		method4331(false);
		method4292(false);
		method4321(false);
		method4297();
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(IIII)V")
	public static void method4320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		method4302(anInt5518, anInt5511, anInt5505, anInt5512);
		aBoolean403 = false;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(Z)V")
	public static void method4321(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean406) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2912);
		} else {
			aGL1.glDisable(2912);
		}
		aBoolean406 = arg0;
	}

	@OriginalMember(owner = "client!un", name = "o", descriptor = "()V")
	private static void method4322() {
		@Pc(2) int[] local2 = new int[1];
		aGL1.glGenTextures(1, local2, 0);
		anInt5506 = local2[0];
		aGL1.glBindTexture(3553, anInt5506);
		aGL1.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
		Static294.method4351();
		Static184.method2453();
		Static266.method3962();
	}

	@OriginalMember(owner = "client!un", name = "e", descriptor = "(I)V")
	public static void method4323(@OriginalArg(0) int arg0) {
		if (arg0 == anInt5501) {
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
		anInt5501 = arg0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public static void method4324(@OriginalArg(0) Canvas arg0) {
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

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(II)V")
	public static void method4325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt5518 = arg0;
		anInt5511 = arg1;
		method4305();
	}

	@OriginalMember(owner = "client!un", name = "q", descriptor = "()V")
	public static void method4327() {
		Static207.method3280(0, 0);
		method4328();
		method4296(0);
		method4323(0);
		method4331(false);
		method4292(false);
		method4321(false);
		method4297();
	}

	@OriginalMember(owner = "client!un", name = "r", descriptor = "()V")
	private static void method4328() {
		if (aBoolean403) {
			return;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho(0.0D, (double) anInt5505, 0.0D, (double) anInt5512, -1.0D, 1.0D);
		method4302(0, 0, anInt5505, anInt5512);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aBoolean403 = true;
	}

	@OriginalMember(owner = "client!un", name = "s", descriptor = "()F")
	public static float method4329() {
		return aFloat58;
	}

	@OriginalMember(owner = "client!un", name = "t", descriptor = "()V")
	public static void method4330() {
		aGL1.glDepthMask(false);
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(Z)V")
	public static void method4331(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean400) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2896);
		} else {
			aGL1.glDisable(2896);
		}
		aBoolean400 = arg0;
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "(Z)V")
	private static void method4332(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean412) {
			return;
		}
		if (arg0) {
			aGL1.glEnableClientState(32885);
		} else {
			aGL1.glDisableClientState(32885);
		}
		aBoolean412 = arg0;
	}

	@OriginalMember(owner = "client!un", name = "u", descriptor = "()V")
	public static void method4333() {
		aGL1.glDepthMask(true);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/awt/Canvas;ILgl!javax/media/opengl/GLContext;)I")
	private static int method4334(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) GLContext arg2) {
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
				Static202.method3246(1000L);
			}
			aGL1 = aGLContext1.getGL();
			aBoolean404 = true;
			anInt5505 = arg0.getSize().width;
			anInt5512 = arg0.getSize().height;
			var6 = method4318();
			if (var6 != 0) {
				method4309();
				return var6;
			}
			method4322();
			method4295();
			aGL1.glClear(16384);
			local29 = 0;
			while (true) {
				try {
					aGLDrawable1.swapBuffers();
					break;
				} catch (@Pc(82) Exception local82) {
					if (local29++ > 5) {
						method4309();
						return -3;
					}
					Static202.method3246(100L);
				}
			}
			aGL1.glClear(16384);
			return 0;
		} catch (@Pc(99) Throwable local99) {
			method4309();
			return -5;
		}
	}
}
