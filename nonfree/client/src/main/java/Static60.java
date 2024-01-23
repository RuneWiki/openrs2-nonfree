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
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
	public static int anInt1329;

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "F")
	private static float aFloat12;

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "Z")
	public static boolean aBoolean99;

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString68;

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "Lgl!javax/media/opengl/GLDrawable;")
	private static GLDrawable aGLDrawable1;

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "Z")
	public static boolean aBoolean100;

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "Z")
	public static boolean aBoolean101;

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
	public static int anInt1332;

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "Z")
	public static boolean aBoolean102;

	@OriginalMember(owner = "client!ei", name = "m", descriptor = "Z")
	public static boolean aBoolean103;

	@OriginalMember(owner = "client!ei", name = "n", descriptor = "Ljava/lang/String;")
	private static String aString69;

	@OriginalMember(owner = "client!ei", name = "o", descriptor = "Lgl!javax/media/opengl/GL;")
	public static GL aGL1;

	@OriginalMember(owner = "client!ei", name = "p", descriptor = "Lgl!javax/media/opengl/GLContext;")
	private static GLContext aGLContext1;

	@OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
	private static int anInt1333;

	@OriginalMember(owner = "client!ei", name = "t", descriptor = "Z")
	public static boolean aBoolean105;

	@OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
	private static int anInt1335;

	@OriginalMember(owner = "client!ei", name = "x", descriptor = "Z")
	public static boolean aBoolean108;

	@OriginalMember(owner = "client!ei", name = "z", descriptor = "I")
	private static int anInt1336;

	@OriginalMember(owner = "client!ei", name = "B", descriptor = "I")
	private static int anInt1337;

	@OriginalMember(owner = "client!ei", name = "C", descriptor = "I")
	public static int anInt1338;

	@OriginalMember(owner = "client!ei", name = "D", descriptor = "Z")
	public static boolean aBoolean110;

	@OriginalMember(owner = "client!ei", name = "E", descriptor = "F")
	private static float aFloat14;

	@OriginalMember(owner = "client!ei", name = "G", descriptor = "Z")
	public static boolean aBoolean111;

	@OriginalMember(owner = "client!ei", name = "H", descriptor = "Z")
	public static boolean aBoolean112;

	@OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
	private static int anInt1341;

	@OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
	private static int anInt1342;

	@OriginalMember(owner = "client!ei", name = "M", descriptor = "Z")
	public static boolean aBoolean114;

	@OriginalMember(owner = "client!ei", name = "P", descriptor = "I")
	public static int anInt1343;

	@OriginalMember(owner = "client!ei", name = "R", descriptor = "I")
	public static int anInt1344;

	@OriginalMember(owner = "client!ei", name = "S", descriptor = "I")
	private static int anInt1345;

	@OriginalMember(owner = "client!ei", name = "U", descriptor = "I")
	public static int anInt1346;

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
	private static int anInt1330 = 0;

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
	private static int anInt1331 = -1;

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "F")
	private static float aFloat13 = 0.0F;

	@OriginalMember(owner = "client!ei", name = "r", descriptor = "Z")
	private static boolean aBoolean104 = false;

	@OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
	private static int anInt1334 = 0;

	@OriginalMember(owner = "client!ei", name = "v", descriptor = "Z")
	public static boolean aBoolean106 = false;

	@OriginalMember(owner = "client!ei", name = "w", descriptor = "Z")
	public static boolean aBoolean107 = true;

	@OriginalMember(owner = "client!ei", name = "y", descriptor = "Z")
	private static boolean aBoolean109 = true;

	@OriginalMember(owner = "client!ei", name = "A", descriptor = "[F")
	private static float[] aFloatArray7 = new float[16];

	@OriginalMember(owner = "client!ei", name = "F", descriptor = "I")
	private static int anInt1339 = -1;

	@OriginalMember(owner = "client!ei", name = "I", descriptor = "I")
	public static int anInt1340 = 0;

	@OriginalMember(owner = "client!ei", name = "J", descriptor = "Z")
	private static boolean aBoolean113 = true;

	@OriginalMember(owner = "client!ei", name = "N", descriptor = "Z")
	private static boolean aBoolean115 = true;

	@OriginalMember(owner = "client!ei", name = "O", descriptor = "F")
	private static float aFloat15 = 0.09765625F;

	@OriginalMember(owner = "client!ei", name = "Q", descriptor = "F")
	private static float aFloat16 = 0.0F;

	@OriginalMember(owner = "client!ei", name = "T", descriptor = "Z")
	private static boolean aBoolean116 = false;

	@OriginalMember(owner = "client!ei", name = "V", descriptor = "I")
	private static int anInt1347 = -1;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "()F")
	public static float method1135() {
		return aFloat13;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "()V")
	public static void method1136() {
		Static4.method119(0, 0);
		method1160();
		method1139(0);
		method1168(0);
		method1164(false);
		method1178(false);
		method1151(false);
		method1172();
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "()V")
	public static void method1137() {
		aGL1.glClear(256);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(FFF)V")
	public static void method1138(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		aGL1.glMatrixMode(5890);
		if (aBoolean116) {
			aGL1.glLoadIdentity();
		}
		aGL1.glTranslatef(arg0, arg1, arg2);
		aGL1.glMatrixMode(5888);
		aBoolean116 = true;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
	public static void method1139(@OriginalArg(0) int arg0) {
		if (arg0 == anInt1330) {
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
		anInt1330 = arg0;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
	public static void method1140(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16640);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public static void method1141(@OriginalArg(0) Canvas arg0) {
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

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(F)V")
	public static void method1142(@OriginalArg(0) float arg0) {
		method1144(3000.0F, arg0 * 1.5F);
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "()V")
	private static void method1143() {
		@Pc(2) int[] local2 = new int[1];
		aGL1.glGenTextures(1, local2, 0);
		anInt1346 = local2[0];
		aGL1.glBindTexture(3553, anInt1346);
		aGL1.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
		Static128.method2271();
		Static148.method2602();
		Static276.method4594();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(FF)V")
	public static void method1144(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (aBoolean104 || arg0 == aFloat16 && arg1 == aFloat13) {
			return;
		}
		aFloat16 = arg0;
		aFloat13 = arg1;
		if (arg1 == 0.0F) {
			aFloatArray7[10] = aFloat12;
			aFloatArray7[14] = aFloat14;
		} else {
			@Pc(25) float local25 = arg0 / (arg1 + arg0);
			@Pc(29) float local29 = local25 * local25;
			@Pc(42) float local42 = -aFloat14 * (1.0F - local25) * (1.0F - local25) / arg1;
			aFloatArray7[10] = aFloat12 + local42;
			aFloatArray7[14] = aFloat14 * local29;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadMatrixf(aFloatArray7, 0);
		aGL1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "()V")
	public static void method1145() {
		aGL1.glDepthMask(true);
	}

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "()V")
	private static void method1146() {
		aBoolean104 = false;
		aGL1.glDisable(3553);
		anInt1347 = -1;
		aGL1.glTexEnvi(8960, 8704, 34160);
		aGL1.glTexEnvi(8960, 34161, 8448);
		anInt1330 = 0;
		aGL1.glTexEnvi(8960, 34162, 8448);
		anInt1334 = 0;
		aGL1.glEnable(2896);
		aGL1.glEnable(2912);
		aGL1.glEnable(2929);
		aBoolean109 = true;
		aBoolean113 = true;
		aBoolean115 = true;
		Static49.method984();
		aGL1.glActiveTexture(33985);
		aGL1.glTexEnvi(8960, 8704, 34160);
		aGL1.glTexEnvi(8960, 34161, 8448);
		aGL1.glTexEnvi(8960, 34162, 8448);
		aGL1.glActiveTexture(33984);
		aGL1.setSwapInterval(0);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		aGL1.glShadeModel(7425);
		aGL1.glClearDepth(1.0D);
		aGL1.glDepthFunc(515);
		method1145();
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
		aBoolean107 = true;
		aGL1.glEnableClientState(32886);
		aGL1.glEnableClientState(32888);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		Static117.method2155();
		Static128.method2269();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/awt/Canvas;I)I")
	public static int method1148(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1) {
		return method1150(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "()F")
	public static float method1149() {
		return aFloat16;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/awt/Canvas;ILgl!javax/media/opengl/GLContext;)I")
	private static int method1150(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) GLContext arg2) {
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
				Static134.method2329(1000L);
			}
			aGL1 = aGLContext1.getGL();
			new GLU();
			aBoolean106 = true;
			anInt1329 = arg0.getSize().width;
			anInt1344 = arg0.getSize().height;
			var6 = method1166();
			if (var6 != 0) {
				method1162();
				return var6;
			}
			method1143();
			method1146();
			aGL1.glClear(16384);
			local29 = 0;
			while (true) {
				try {
					aGLDrawable1.swapBuffers();
					break;
				} catch (@Pc(86) Exception local86) {
					if (local29++ > 5) {
						method1162();
						return -3;
					}
					Static134.method2329(100L);
				}
			}
			aGL1.glClear(16384);
			return 0;
		} catch (@Pc(103) Throwable local103) {
			method1162();
			return -5;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V")
	public static void method1151(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean115) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2912);
		} else {
			aGL1.glDisable(2912);
		}
		aBoolean115 = arg0;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIII)V")
	private static void method1152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		anInt1333 = arg0;
		anInt1336 = arg1;
		anInt1337 = arg2;
		anInt1341 = arg3;
		method1156();
	}

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "()V")
	public static void method1153() {
		Static4.method119(0, 0);
		method1160();
		method1139(0);
		method1168(0);
		method1164(false);
		method1178(false);
		method1151(false);
		method1172();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIII)V")
	public static void method1154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) int local2 = -arg0;
		@Pc(6) int local6 = anInt1329 - arg0;
		@Pc(9) int local9 = -arg1;
		@Pc(13) int local13 = anInt1344 - arg1;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		@Pc(23) float local23 = (float) arg2 / 512.0F;
		@Pc(30) float local30 = local23 * (256.0F / (float) arg4);
		@Pc(37) float local37 = local23 * (256.0F / (float) arg5);
		aGL1.glOrtho((double) ((float) local2 * local30), (double) ((float) local6 * local30), (double) ((float) -local13 * local37), (double) ((float) -local9 * local37), (double) (50 - arg3), (double) (3584 - arg3));
		method1152(0, 0, anInt1329, anInt1344);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		aBoolean104 = false;
	}

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "()I")
	public static int method1155() {
		if (aBoolean99 && (anInt1339 <= 0 || anInt1331 != Static256.anInt5185)) {
			@Pc(9) int[] local9 = new int[1];
			aGL1.glGenFramebuffersEXT(1, local9, 0);
			anInt1331 = Static256.anInt5185;
			anInt1339 = local9[0];
		}
		return anInt1339;
	}

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "()V")
	private static void method1156() {
		aGL1.glViewport(anInt1333 + anInt1338, anInt1336 + anInt1343, anInt1337, anInt1341);
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V")
	public static void method1157(@OriginalArg(0) int arg0) {
		if (arg0 == anInt1347) {
			return;
		}
		if (arg0 == -1) {
			aGL1.glDisable(3553);
		} else {
			if (anInt1347 == -1) {
				aGL1.glEnable(3553);
			}
			aGL1.glBindTexture(3553, arg0);
		}
		anInt1347 = arg0;
	}

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "()V")
	public static void method1158() {
		aGL1.glDepthMask(false);
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(IIII)V")
	public static void method1159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		method1174(0, 0, anInt1329, anInt1344, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
	}

	@OriginalMember(owner = "client!ei", name = "m", descriptor = "()V")
	private static void method1160() {
		if (aBoolean104) {
			return;
		}
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho(0.0D, (double) anInt1329, 0.0D, (double) anInt1344, -1.0D, 1.0D);
		method1152(0, 0, anInt1329, anInt1344);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aBoolean104 = true;
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(IIII)V")
	public static void method1161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		aGL1.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		method1152(anInt1338, anInt1343, anInt1329, anInt1344);
		aBoolean104 = false;
	}

	@OriginalMember(owner = "client!ei", name = "n", descriptor = "()V")
	public static void method1162() {
		if (aGL1 != null) {
			try {
				Static276.method4592();
				Static273.method4564();
			} catch (@Pc(6) Throwable local6) {
			}
			aGL1 = null;
		}
		if (aGLContext1 != null) {
			Static256.method4121();
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
		Static128.method2275();
		aBoolean106 = false;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V")
	public static void method1163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt1338 = arg0;
		anInt1343 = arg1;
		method1156();
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(Z)V")
	public static void method1164(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean109) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2896);
		} else {
			aGL1.glDisable(2896);
		}
		aBoolean109 = arg0;
	}

	@OriginalMember(owner = "client!ei", name = "o", descriptor = "()V")
	public static void method1165() {
		try {
			aGLDrawable1.swapBuffers();
		} catch (@Pc(3) Exception local3) {
		}
	}

	@OriginalMember(owner = "client!ei", name = "p", descriptor = "()I")
	private static int method1166() {
		@Pc(1) int local1 = 0;
		aString69 = aGL1.glGetString(7936);
		aString68 = aGL1.glGetString(7937);
		@Pc(12) String local12 = aString69.toLowerCase();
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
				anInt1345 = local52 * 10 + local57;
			} catch (@Pc(65) NumberFormatException local65) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (anInt1345 < 12) {
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
		anInt1332 = local100[0];
		aGL1.glGetIntegerv(34929, local100, 0);
		anInt1335 = local100[0];
		aGL1.glGetIntegerv(34930, local100, 0);
		anInt1342 = local100[0];
		if (anInt1332 < 2 || anInt1335 < 2 || anInt1342 < 2) {
			local1 |= 0x10;
		}
		if (local1 != 0) {
			return local1;
		}
		aBoolean114 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		aBoolean110 = aGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		aBoolean100 = aGL1.isExtensionAvailable("GL_ARB_multisample");
		aBoolean112 = aGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		aBoolean103 = aGL1.isExtensionAvailable("GL_ARB_vertex_program");
		aBoolean99 = aGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		aGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		aBoolean111 = aGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		aBoolean101 = aGL1.isExtensionAvailable("GL_EXT_texture3D");
		aBoolean108 = aGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		aBoolean102 = aGL1.isExtensionAvailable("GL_ARB_texture_float");
		@Pc(195) String local195 = aString68.toLowerCase(Locale.ENGLISH);
		if (local195.indexOf("radeon") != -1) {
			@Pc(202) int local202 = 0;
			@Pc(204) boolean local204 = false;
			@Pc(212) String[] local212 = Static216.method3644(' ', local195.replace('/', ' '));
			for (@Pc(214) int local214 = 0; local214 < local212.length; local214++) {
				@Pc(222) String local222 = local212[local214];
				if (local222.length() >= 4) {
					if (local222.charAt(0) == 'x' && Static63.method1238(local222.substring(1, 3))) {
						local204 = true;
						break;
					}
					if (Static63.method1238(local222.substring(0, 4))) {
						local202 = Static285.method4727(local222.substring(0, 4));
						break;
					}
				}
			}
			if (local202 >= 7000 && local202 <= 7999) {
				aBoolean110 = false;
			}
			if (local202 >= 7000 && local202 <= 9250) {
				aBoolean101 = false;
			}
			if (local202 >= 9200 || local204) {
				aBoolean102 = false;
			}
			aBoolean105 = aBoolean110;
		}
		if (aBoolean110) {
			try {
				@Pc(288) int[] local288 = new int[1];
				aGL1.glGenBuffersARB(1, local288, 0);
			} catch (@Pc(295) Throwable local295) {
				return -4;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(Z)V")
	private static void method1167(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean107) {
			return;
		}
		if (arg0) {
			aGL1.glEnableClientState(32885);
		} else {
			aGL1.glDisableClientState(32885);
		}
		aBoolean107 = arg0;
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V")
	public static void method1168(@OriginalArg(0) int arg0) {
		if (arg0 == anInt1334) {
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
		anInt1334 = arg0;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(FFFFFF)V")
	private static void method1169(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(3) float local3 = arg4 * 2.0F;
		aFloatArray7[0] = local3 / (arg1 - arg0);
		aFloatArray7[1] = 0.0F;
		aFloatArray7[2] = 0.0F;
		aFloatArray7[3] = 0.0F;
		aFloatArray7[4] = 0.0F;
		aFloatArray7[5] = local3 / (arg3 - arg2);
		aFloatArray7[6] = 0.0F;
		aFloatArray7[7] = 0.0F;
		aFloatArray7[8] = (arg1 + arg0) / (arg1 - arg0);
		aFloatArray7[9] = (arg3 + arg2) / (arg3 - arg2);
		aFloatArray7[10] = aFloat12 = -(arg5 + arg4) / (arg5 - arg4);
		aFloatArray7[11] = -1.0F;
		aFloatArray7[12] = 0.0F;
		aFloatArray7[13] = 0.0F;
		aFloatArray7[14] = aFloat14 = -(local3 * arg5) / (arg5 - arg4);
		aFloatArray7[15] = 0.0F;
		aGL1.glLoadMatrixf(aFloatArray7, 0);
		aFloat16 = 0.0F;
		aFloat13 = 0.0F;
	}

	@OriginalMember(owner = "client!ei", name = "q", descriptor = "()V")
	public static void method1170() {
		if (Static56.aBoolean96) {
			method1164(true);
			method1167(true);
		} else {
			method1164(false);
			method1167(false);
		}
	}

	@OriginalMember(owner = "client!ei", name = "r", descriptor = "()V")
	public static void method1171() {
		@Pc(2) int[] local2 = new int[2];
		aGL1.glGetIntegerv(3073, local2, 0);
		aGL1.glGetIntegerv(3074, local2, 1);
		aGL1.glDrawBuffer(1026);
		aGL1.glReadBuffer(1024);
		method1157(-1);
		aGL1.glPushAttrib(8192);
		aGL1.glDisable(2912);
		aGL1.glDisable(3042);
		aGL1.glDisable(2929);
		aGL1.glDisable(3008);
		aGL1.glRasterPos2i(0, 0);
		aGL1.glCopyPixels(0, 0, anInt1329, anInt1344, 6144);
		aGL1.glPopAttrib();
		aGL1.glDrawBuffer(local2[0]);
		aGL1.glReadBuffer(local2[1]);
	}

	@OriginalMember(owner = "client!ei", name = "s", descriptor = "()V")
	public static void method1172() {
		if (aBoolean116) {
			aGL1.glMatrixMode(5890);
			aGL1.glLoadIdentity();
			aGL1.glMatrixMode(5888);
			aBoolean116 = false;
		}
	}

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)V")
	public static void method1173(@OriginalArg(0) int arg0) {
		aGL1.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
		aGL1.glClear(16384);
		aGL1.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIIFFII)V")
	public static void method1174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = (arg0 - arg4 << 8) / arg8;
		@Pc(17) int local17 = (arg0 + arg2 - arg4 << 8) / arg8;
		@Pc(25) int local25 = (arg1 - arg5 << 8) / arg9;
		@Pc(35) int local35 = (arg1 + arg3 - arg5 << 8) / arg9;
		aGL1.glMatrixMode(5889);
		aGL1.glLoadIdentity();
		method1169((float) local7 * aFloat15, (float) local17 * aFloat15, (float) -local35 * aFloat15, (float) -local25 * aFloat15, 50.0F, 3584.0F);
		method1152(arg0, anInt1344 - arg1 - arg3, arg2, arg3);
		aGL1.glMatrixMode(5888);
		aGL1.glLoadIdentity();
		aGL1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		if (arg6 != 0.0F) {
			aGL1.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
		}
		if (arg7 != 0.0F) {
			aGL1.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
		}
		aBoolean104 = false;
		Static107.anInt2320 = local7;
		Static176.anInt3789 = local17;
		Static260.anInt5417 = local25;
		Static212.anInt4456 = local35;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)V")
	public static void method1175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt1329 = arg0;
		anInt1344 = arg1;
		aBoolean104 = false;
	}

	@OriginalMember(owner = "client!ei", name = "t", descriptor = "()V")
	public static void method1176() {
		Static4.method119(0, 0);
		method1160();
		method1157(-1);
		method1164(false);
		method1178(false);
		method1151(false);
		method1172();
	}

	@OriginalMember(owner = "client!ei", name = "u", descriptor = "()V")
	public static void method1177() {
		Static4.method119(0, 0);
		method1160();
		method1139(1);
		method1168(1);
		method1164(false);
		method1178(false);
		method1151(false);
		method1172();
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(Z)V")
	public static void method1178(@OriginalArg(0) boolean arg0) {
		if (arg0 == aBoolean113) {
			return;
		}
		if (arg0) {
			aGL1.glEnable(2929);
		} else {
			aGL1.glDisable(2929);
		}
		aBoolean113 = arg0;
	}
}
