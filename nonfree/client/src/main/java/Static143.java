import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_65 = new Class205(32, -1);

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
	public static int anInt2862 = 127;

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "[I")
	public static final int[] anIntArray583 = new int[1024];

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
	public static int anInt2866 = -1;

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
	public static int anInt2868 = 1;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IJ)V")
	public static void method2680(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static290.anInt5046;
		@Pc(27) int local27;
		if (Static28.anInt601 != local7) {
			@Pc(19) int local19 = local7 - Static28.anInt601;
			local27 = (int) ((long) local19 * arg0 / 320L);
			if (local19 <= 0) {
				if (local27 == 0) {
					local27 = -1;
				} else if (local19 > local27) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = 1;
			} else if (local27 > local19) {
				local27 = local19;
			}
			Static28.anInt601 += local27;
		}
		@Pc(66) int local66 = Static295.anInt5082;
		if (local66 != Static289.anInt5022) {
			local27 = local66 - Static289.anInt5022;
			@Pc(90) int local90 = (int) (arg0 * (long) local27 / 320L);
			if (local27 <= 0) {
				if (local90 == 0) {
					local90 = -1;
				} else if (local27 > local90) {
					local90 = local27;
				}
			} else if (local90 == 0) {
				local90 = 1;
			} else if (local27 < local90) {
				local90 = local27;
			}
			Static289.anInt5022 += local90;
		}
		if (!Static207.aBoolean371) {
			Static127.aFloat41 += (float) arg0 * Static345.aFloat82 / 40.0F * 8.0F;
			Static1.aFloat80 += Static283.aFloat70 * (float) arg0 / 40.0F * 8.0F;
		}
		Static43.method732();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)I")
	public static int method2681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static367.aByteArrayArray19 == null ? 0 : (Static367.aByteArrayArray19[arg0][arg1] & 0xFF) << 3;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!kk;B)V")
	public static void method2682(@OriginalArg(0) Class2_Sub16 arg0) {
		if (arg0.aByteArray112.length - arg0.anInt6145 < 1) {
			return;
		}
		@Pc(26) int local26 = arg0.method5350();
		if (local26 < 0 || local26 > 1 || arg0.aByteArray112.length - arg0.anInt6145 < 2) {
			return;
		}
		@Pc(51) int local51 = arg0.method5312();
		if (arg0.aByteArray112.length - arg0.anInt6145 != local51 * 6) {
			return;
		}
		while (true) {
			@Pc(71) int local71;
			@Pc(75) int local75;
			do {
				do {
					do {
						if (arg0.aByteArray112.length <= arg0.anInt6145) {
							return;
						}
						local71 = arg0.method5312();
						local75 = arg0.method5346();
					} while (Static330.anIntArray1157.length <= local71);
				} while (!Static88.aBooleanArray13[local71]);
			} while (Static355.aClass190_1.method4085(local71).aChar4 == '1' && (local75 < -1 || local75 > 1));
			Static330.anIntArray1157[local71] = local75;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLjava/awt/Canvas;)Lclient!md;")
	public static Class123 method2684(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(6) Class local6 = Class.forName("Class123_Sub1");
			@Pc(10) Class123 local10 = (Class123) local6.getDeclaredConstructor().newInstance();
			local10.method4318(arg0);
			return local10;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class123_Sub2 local26 = new Class123_Sub2();
			local26.method4318(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)B")
	public static byte method2685(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
