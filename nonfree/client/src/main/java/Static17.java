import java.io.File;
import java.lang.reflect.Method;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
	public static int anInt8631;

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "[Lclient!rs;")
	public static Interface17[] anInterface17Array7;

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_85 = new Class341(29, 2);

	@OriginalMember(owner = "client!ai", name = "o", descriptor = "Z")
	public static boolean aBoolean633 = false;

	@OriginalMember(owner = "client!ai", name = "p", descriptor = "[I")
	public static int[] anIntArray439 = new int[2];

	@OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
	public static int anInt8637 = 0;

	@OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
	public static int anInt8640 = 0;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLclient!ha;Lclient!uf;II)V")
	public static void method7632(@OriginalArg(1) Class101 arg0, @OriginalArg(2) Class357 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = 63; local11 >= 0; local11--) {
			Static28.method489(false, true);
			@Pc(33) int local33 = (local11 & 0x3F) << 10 | 0x380 | 0x3F;
			@Pc(37) int local37 = Static101.anIntArray92[local33];
			Static508.method7933(true, false);
			arg0.aa(arg2, (arg1.anInt10465 * (63 - local11) >> 6) + arg3, arg1.anInt10395, (arg1.anInt10465 >> 6) + 1, local37, 0);
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)Lclient!eu;")
	public static Class98 method7638() {
		try {
			return new Class98_Sub3();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class98) Class.forName("Class98_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(14) Throwable local14) {
				return new Class98_Sub2();
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BLjava/io/File;Z)V")
	public static void method7639(@OriginalArg(1) File arg0) {
		if (Static70.anObject2 == null) {
			Static191.method3705();
		}
		try {
			@Pc(18) Class local18 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(39) Method local39 = local18.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local39.invoke(Static70.anObject2, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(59) Exception local59) {
			System.out.println("HeapDump error:");
			local59.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILjava/util/Random;)I")
	public static int method7641(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static100.method1457(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(37) int local37 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(45) int local45;
			do {
				local45 = arg1.nextInt();
			} while (local45 >= local37);
			return Static340.method5709(arg0, local45);
		}
	}
}
