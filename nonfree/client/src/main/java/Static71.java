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

public final class Static71 {

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
	private static int anInt1534;

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
	public static int anInt1535;

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "Z")
	public static boolean aBoolean152;

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "Z")
	public static boolean aBoolean153;

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
	public static int anInt1536;

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "Z")
	public static boolean aBoolean154;

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "Z")
	public static boolean aBoolean155;

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "F")
	private static float aFloat41;

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
	public static int anInt1537;

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
	private static int anInt1539;

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "F")
	private static float aFloat42;

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "Z")
	public static boolean aBoolean157;

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "Z")
	public static boolean aBoolean158;

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "Z")
	public static boolean aBoolean159;

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "Z")
	public static boolean aBoolean160;

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
	public static int anInt1540;

	@OriginalMember(owner = "client!fd", name = "w", descriptor = "Lgl!javax/media/opengl/GLContext;")
	private static GLContext aGLContext1;

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "I")
	public static int anInt1541;

	@OriginalMember(owner = "client!fd", name = "y", descriptor = "Ljava/lang/String;")
	private static String aString56;

	@OriginalMember(owner = "client!fd", name = "z", descriptor = "Z")
	public static boolean aBoolean162;

	@OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
	private static int anInt1543;

	@OriginalMember(owner = "client!fd", name = "D", descriptor = "Lgl!javax/media/opengl/GLDrawable;")
	private static GLDrawable aGLDrawable1;

	@OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
	private static int anInt1546;

	@OriginalMember(owner = "client!fd", name = "H", descriptor = "Lgl!javax/media/opengl/GL;")
	public static GL aGL1;

	@OriginalMember(owner = "client!fd", name = "I", descriptor = "Z")
	public static boolean aBoolean164;

	@OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
	public static int anInt1547;

	@OriginalMember(owner = "client!fd", name = "M", descriptor = "Z")
	public static boolean aBoolean166;

	@OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
	private static int anInt1549;

	@OriginalMember(owner = "client!fd", name = "O", descriptor = "Ljava/lang/String;")
	private static String aString57;

	@OriginalMember(owner = "client!fd", name = "P", descriptor = "I")
	private static int anInt1550;

	@OriginalMember(owner = "client!fd", name = "S", descriptor = "Z")
	public static boolean aBoolean168;

	@OriginalMember(owner = "client!fd", name = "T", descriptor = "I")
	private static int anInt1552;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "Z")
	private static boolean aBoolean151 = false;

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "F")
	private static float aFloat39 = 0.0F;

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "F")
	private static float aFloat40 = 0.0F;

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
	private static int anInt1538 = -1;

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "Z")
	private static boolean aBoolean156 = false;

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "Z")
	private static boolean aBoolean161 = true;

	@OriginalMember(owner = "client!fd", name = "A", descriptor = "Z")
	public static boolean aBoolean163 = true;

	@OriginalMember(owner = "client!fd", name = "B", descriptor = "I")
	private static int anInt1542 = -1;

	@OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
	private static int anInt1544 = -1;

	@OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
	public static int anInt1545 = 0;

	@OriginalMember(owner = "client!fd", name = "J", descriptor = "Z")
	public static boolean aBoolean165 = false;

	@OriginalMember(owner = "client!fd", name = "L", descriptor = "I")
	private static int anInt1548 = 0;

	@OriginalMember(owner = "client!fd", name = "Q", descriptor = "Z")
	private static boolean aBoolean167 = true;

	@OriginalMember(owner = "client!fd", name = "R", descriptor = "I")
	private static int anInt1551 = 0;

	@OriginalMember(owner = "client!fd", name = "U", descriptor = "[F")
	private static float[] aFloatArray15 = new float[16];

	@OriginalMember(owner = "client!fd", name = "V", descriptor = "F")
	private static float aFloat43 = 0.09765625F;

	@OriginalMember(owner = "client!fd", name = "W", descriptor = "Z")
	private static boolean aBoolean169 = true;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)V")
	public static void method1374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		method1402(anInt1536, anInt1547, anInt1540, anInt1537);
		aBoolean151 = false;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "()V")
	public static void method1375() {
		try {
			aGLDrawable1.swapBuffers();
		} catch (@Pc(3) Exception local3) {
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIII)V")
	public static void method1376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) int local2 = -arg0;
		@Pc(6) int local6 = anInt1540 - arg0;
		@Pc(9) int local9 = -arg1;
		@Pc(13) int local13 = anInt1537 - arg1;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		@Pc(23) float local23 = (float) arg2 / 512.0F;
		@Pc(30) float local30 = local23 * (256.0F / (float) arg4);
		@Pc(37) float local37 = local23 * (256.0F / (float) arg5);
		aGL1.glOrtho((double) ((float) local2 * local30), (double) ((float) local6 * local30), (double) ((float) -local13 * local37), (double) ((float) -local9 * local37), (double) (50 - arg3), (double) (3584 - arg3));
		method1402(0, 0, anInt1540, anInt1537);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		aBoolean151 = false;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Canvas;ILgl!javax/media/opengl/GLContext;)I")
	private static int method1377(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) GLContext arg2) {
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
				Static16.method242(1000L);
			}
			aGL1 = aGLContext1.getGL();
			aBoolean165 = true;
			anInt1540 = arg0.getSize().width;
			anInt1537 = arg0.getSize().height;
			var6 = method1415();
			if (var6 != 0) {
				method1389();
				return var6;
			}
			method1408();
			method1412();
			aGL1.glClear(16384);
			local29 = 0;
			while (true) {
				try {
					aGLDrawable1.swapBuffers();
					break;
				} catch (@Pc(82) Exception local82) {
					if (local29++ > 5) {
						method1389();
						return -3;
					}
					Static16.method242(100L);
				}
			}
			aGL1.glClear(16384);
			return 0;
		} catch (@Pc(99) Throwable local99) {
			method1389();
			return -5;
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "()V")
	private static void method1378() {
		aGL1.glViewport(anInt1534 + anInt1536, anInt1550 + anInt1547, anInt1546, anInt1549);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
	private static void method1379(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean163) {
			return;
		}
		if (arg0) {
			aGL1.glEnableClientState(32885);
		} else {
			aGL1.glDisableClientState(32885);
		}
		aBoolean163 = arg0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	public static void method1380(@OriginalArg(0) int arg0) {
		if (arg0 == anInt1551) {
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
		anInt1551 = arg0;
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "()V")
	public static void method1381() {
		if (aBoolean156) {
			aGL1.glMatrixMode(5890);
			aGL1.glLoadIdentity();
			aGL1.glMatrixMode(5888);
			aBoolean156 = false;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIFFII)V")
	public static void method1382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = (arg0 - arg4 << 8) / arg8;
		@Pc(17) int local17 = (arg0 + arg2 - arg4 << 8) / arg8;
		@Pc(25) int local25 = (arg1 - arg5 << 8) / arg9;
		@Pc(35) int local35 = (arg1 + arg3 - arg5 << 8) / arg9;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		method1405((float) local7 * aFloat43, (float) local17 * aFloat43, (float) -local35 * aFloat43, (float) -local25 * aFloat43, 50.0F, 3584.0F);
		method1402(arg0, anInt1537 - arg1 - arg3, arg2, arg3);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		if (arg6 != 0.0F) {
			aGL1.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
		}
		if (arg7 != 0.0F) {
			aGL1.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
		}
		aBoolean151 = false;
		Static163.anInt3267 = local7;
		Static264.anInt4880 = local17;
		Static196.anInt3909 = local25;
		Static143.anInt2793 = local35;
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "()V")
	private static void method1383() {
		if (aBoolean151) {
			return;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho(0.0D, (double) anInt1540, 0.0D, (double) anInt1537, -1.0D, 1.0D);
		method1402(0, 0, anInt1540, anInt1537);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aBoolean151 = true;
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "()V")
	public static void method1384() {
		aGL1.glDepthMask(false);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(F)V")
	public static void method1385(@OriginalArg(0) float arg0) {
		method1398(3000.0F, arg0 * 1.5F);
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "()V")
	public static void method1386() {
		@Pc(2) int[] local2 = new int[2];
		aGL1.glGetIntegerv(3073, local2, 0);
		aGL1.glGetIntegerv(3074, local2, 1);
		aGL1.glDrawBuffer(1026);
		aGL1.glReadBuffer(1024);
		method1400(-1);
		aGL1.glPushAttrib(8192);
		aGL1.glDisable(2912);
		aGL1.glDisable(3042);
		aGL1.glDisable(2929);
		aGL1.glDisable(3008);
		aGL1.glRasterPos2i(0, 0);
		aGL1.glCopyPixels(0, 0, anInt1540, anInt1537, 6144);
		aGL1.glPopAttrib();
		aGL1.glDrawBuffer(local2[0]);
		aGL1.glReadBuffer(local2[1]);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
	public static void method1388(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16384);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "()V")
	public static void method1389() {
		if (aGL1 != null) {
			try {
				Static152.method2650();
				Static221.method3566();
			} catch (@Pc(6) Throwable local6) {
			}
			aGL1 = null;
		}
		if (aGLContext1 != null) {
			Static162.method2794();
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
		Static151.method2636();
		aBoolean165 = false;
	}

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "()V")
	public static void method1390() {
		Static165.method4612(0, 0);
		method1383();
		method1392(0);
		method1380(0);
		method1411(false);
		method1413(false);
		method1414(false);
		method1381();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V")
	public static void method1391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt1536 = arg0;
		anInt1547 = arg1;
		method1378();
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V")
	public static void method1392(@OriginalArg(0) int arg0) {
		if (arg0 == anInt1548) {
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
		anInt1548 = arg0;
	}

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "()F")
	public static float method1393() {
		return aFloat40;
	}

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "()V")
	public static void method1394() {
		if (Static69.aBoolean146) {
			method1411(true);
			method1379(true);
		} else {
			method1411(false);
			method1379(false);
		}
	}

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "()V")
	public static void method1395() {
		aGL1.glDepthMask(true);
	}

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "()V")
	public static void method1396() {
		Static165.method4612(0, 0);
		method1383();
		method1392(1);
		method1380(1);
		method1411(false);
		method1413(false);
		method1414(false);
		method1381();
	}

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "()V")
	public static void method1397() {
		Static165.method4612(0, 0);
		method1383();
		method1392(0);
		method1380(0);
		method1411(false);
		method1413(false);
		method1414(false);
		method1381();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(FF)V")
	public static void method1398(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (aBoolean151 || arg0 == aFloat39 && arg1 == aFloat40) {
			return;
		}
		aFloat39 = arg0;
		aFloat40 = arg1;
		if (arg1 == 0.0F) {
			aFloatArray15[10] = aFloat41;
			aFloatArray15[14] = aFloat42;
		} else {
			@Pc(25) float local25 = arg0 / (arg1 + arg0);
			@Pc(29) float local29 = local25 * local25;
			@Pc(42) float local42 = -aFloat42 * (1.0F - local25) * (1.0F - local25) / arg1;
			aFloatArray15[10] = aFloat41 + local42;
			aFloatArray15[14] = aFloat42 * local29;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadMatrixf(aFloatArray15, 0);
		aGL1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "()I")
	public static int method1399() {
		if (aBoolean166 && (anInt1538 <= 0 || anInt1544 != Static162.anInt3245)) {
			@Pc(9) int[] local9 = new int[1];
			aGL1.glGenFramebuffersEXT(1, local9, 0);
			anInt1544 = Static162.anInt3245;
			anInt1538 = local9[0];
		}
		return anInt1538;
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V")
	public static void method1400(@OriginalArg(0) int arg0) {
		if (arg0 == anInt1542) {
			return;
		}
		if (arg0 == -1) {
			aGL1.glDisable(3553);
		} else {
			if (anInt1542 == -1) {
				aGL1.glEnable(3553);
			}
			aGL1.glBindTexture(3553, arg0);
		}
		anInt1542 = arg0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Canvas;I)I")
	public static int method1401(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1) {
		return method1377(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(IIII)V")
	private static void method1402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		anInt1534 = arg0;
		anInt1550 = arg1;
		anInt1546 = arg2;
		anInt1549 = arg3;
		method1378();
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)V")
	public static void method1403(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16640);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(IIII)V")
	public static void method1404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		method1382(0, 0, anInt1540, anInt1537, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFFFFF)V")
	private static void method1405(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(3) float local3 = arg4 * 2.0F;
		aFloatArray15[0] = local3 / (arg1 - arg0);
		aFloatArray15[1] = 0.0F;
		aFloatArray15[2] = 0.0F;
		aFloatArray15[3] = 0.0F;
		aFloatArray15[4] = 0.0F;
		aFloatArray15[5] = local3 / (arg3 - arg2);
		aFloatArray15[6] = 0.0F;
		aFloatArray15[7] = 0.0F;
		aFloatArray15[8] = (arg1 + arg0) / (arg1 - arg0);
		aFloatArray15[9] = (arg3 + arg2) / (arg3 - arg2);
		aFloatArray15[10] = aFloat41 = -(arg5 + arg4) / (arg5 - arg4);
		aFloatArray15[11] = -1.0F;
		aFloatArray15[12] = 0.0F;
		aFloatArray15[13] = 0.0F;
		aFloatArray15[14] = aFloat42 = -(local3 * arg5) / (arg5 - arg4);
		aFloatArray15[15] = 0.0F;
		aGL1.glLoadMatrixf(aFloatArray15, 0);
		aFloat39 = 0.0F;
		aFloat40 = 0.0F;
	}

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "()F")
	public static float method1406() {
		return aFloat39;
	}

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "()V")
	public static void method1407() {
		aGL1.glClear(256);
	}

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "()V")
	private static void method1408() {
		@Pc(2) int[] local2 = new int[1];
		aGL1.glGenTextures(1, local2, 0);
		anInt1535 = local2[0];
		aGL1.glBindTexture(3553, anInt1535);
		aGL1.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
		Static151.method2628();
		Static83.method1696();
		Static152.method2655();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFF)V")
	public static void method1409(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		aGL1.glMatrixMode(5890);
		if (aBoolean156) {
			aGL1.glLoadIdentity();
		}
		aGL1.glTranslatef(arg0, arg1, arg2);
		aGL1.glMatrixMode(5888);
		aBoolean156 = true;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)V")
	public static void method1410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt1540 = arg0;
		anInt1537 = arg1;
		aBoolean151 = false;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(Z)V")
	public static void method1411(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean161) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2896);
		} else {
			aGL1.glDisable(2896);
		}
		aBoolean161 = arg0;
	}

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "()V")
	private static void method1412() {
		aBoolean151 = false;
		aGL1.glDisable(3553);
		anInt1542 = -1;
		aGL1.glTexEnvi(8960, 8704, 34160);
		aGL1.glTexEnvi(8960, 34161, 8448);
		anInt1548 = 0;
		aGL1.glTexEnvi(8960, 34162, 8448);
		anInt1551 = 0;
		aGL1.glEnable(2896);
		aGL1.glEnable(2912);
		aGL1.glEnable(2929);
		aBoolean161 = true;
		aBoolean169 = true;
		aBoolean167 = true;
		Static34.method606();
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
		method1395();
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
		aBoolean163 = true;
		aGL1.glEnableClientState(32886);
		aGL1.glEnableClientState(32888);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		Static65.method1144();
		Static151.method2638();
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(Z)V")
	public static void method1413(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean169) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2929);
		} else {
			aGL1.glDisable(2929);
		}
		aBoolean169 = arg0;
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(Z)V")
	public static void method1414(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean167) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2912);
		} else {
			aGL1.glDisable(2912);
		}
		aBoolean167 = arg0;
	}

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "()I")
	private static int method1415() {
		@Pc(1) int local1 = 0;
		aString56 = aGL1.glGetString(7936);
		aString57 = aGL1.glGetString(7937);
		@Pc(12) String local12 = aString56.toLowerCase();
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
				anInt1552 = local52 * 10 + local57;
			} catch (@Pc(65) NumberFormatException local65) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (anInt1552 < 12) {
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
		anInt1541 = local100[0];
		aGL1.glGetIntegerv(34929, local100, 0);
		anInt1539 = local100[0];
		aGL1.glGetIntegerv(34930, local100, 0);
		anInt1543 = local100[0];
		if (anInt1541 < 2 || anInt1539 < 2 || anInt1543 < 2) {
			local1 |= 0x10;
		}
		if (local1 != 0) {
			return local1;
		}
		aBoolean168 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		aBoolean159 = aGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		aBoolean154 = aGL1.isExtensionAvailable("GL_ARB_multisample");
		aBoolean162 = aGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		aBoolean153 = aGL1.isExtensionAvailable("GL_ARB_vertex_program");
		aBoolean166 = aGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		aGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		aBoolean157 = aGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		aBoolean164 = aGL1.isExtensionAvailable("GL_EXT_texture3D");
		aBoolean152 = aGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		aBoolean160 = aGL1.isExtensionAvailable("GL_ARB_texture_float");
		aBoolean155 = true;
		@Pc(197) String local197 = aString57.toLowerCase(Locale.ENGLISH);
		if (local197.indexOf("radeon") != -1) {
			@Pc(204) int local204 = 0;
			@Pc(206) boolean local206 = false;
			@Pc(214) String[] local214 = Static107.method2019(' ', local197.replace('/', ' '));
			for (@Pc(216) int local216 = 0; local216 < local214.length; local216++) {
				@Pc(224) String local224 = local214[local216];
				if (local224.length() >= 4) {
					if (local224.charAt(0) == 'x' && Static53.method979(local224.substring(1, 3))) {
						local206 = true;
						break;
					}
					if (Static53.method979(local224.substring(0, 4))) {
						local204 = Static194.method3363(local224.substring(0, 4));
						break;
					}
				}
			}
			if (local204 >= 7000 && local204 <= 7999) {
				aBoolean159 = false;
			}
			if (local204 >= 7000 && local204 <= 9250) {
				aBoolean164 = false;
			}
			if (local204 >= 9200 || local206) {
				aBoolean160 = false;
			}
			aBoolean158 = aBoolean159;
			aBoolean155 = false;
		}
		if (aBoolean159) {
			try {
				@Pc(292) int[] local292 = new int[1];
				aGL1.glGenBuffersARB(1, local292, 0);
			} catch (@Pc(299) Throwable local299) {
				return -4;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "()V")
	public static void method1416() {
		Static165.method4612(0, 0);
		method1383();
		method1400(-1);
		method1411(false);
		method1413(false);
		method1414(false);
		method1381();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public static void method1417(@OriginalArg(0) Canvas arg0) {
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
}
