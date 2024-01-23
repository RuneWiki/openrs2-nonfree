import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
	public static int anInt1386;

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
	public static int anInt1387;

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "Lclient!lc;")
	public static Class79 aClass79_5 = new Class79(20);

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "[I")
	public static int[] anIntArray104 = new int[5];

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
	public static int anInt1385 = 127;

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "[Lclient!jb;")
	public static Class65[] aClass65Array1 = new Class65[4];

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString78 = "Cancel";

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method966(@OriginalArg(1) String arg0) {
		return Static80.method1629(arg0);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
	public static String method967(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = 0;
		@Pc(15) char[] local15 = new char[arg1];
		for (@Pc(17) int local17 = 0; local17 < arg1; local17++) {
			@Pc(27) int local27 = arg0[local17 + arg2] & 0xFF;
			if (local27 != 0) {
				if (local27 >= 128 && local27 < 160) {
					@Pc(43) char local43 = Static95.aCharArray1[local27 - 128];
					if (local43 == '\u0000') {
						local43 = '?';
					}
					local27 = local43;
				}
				local15[local8++] = (char) local27;
			}
		}
		return new String(local15, 0, local8);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method968(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)Lclient!wf;")
	public static Class62 method969() {
		try {
			return (Class62) Class.forName("Class62_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(18) Throwable local18) {
			return null;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(JI)V")
	public static void method970(@OriginalArg(0) long arg0) {
		if (!Static138.aBoolean180) {
			Static230.aFloat51 += (float) arg0 * Static161.aFloat34 / 40.0F;
			Static158.aFloat32 += (float) arg0 * Static201.aFloat40 / 40.0F;
		}
		@Pc(33) int local33 = Static83.aClass9_Sub1_Sub1_1.anInt427 + Static129.anInt3253;
		@Pc(38) int local38 = Static83.aClass9_Sub1_Sub1_1.anInt479 + Static193.anInt4297;
		if (Static57.anInt1583 - local33 < -500 || Static57.anInt1583 - local33 > 500 || Static81.anInt2193 - local38 < -500 || Static81.anInt2193 - local38 > 500) {
			Static81.anInt2193 = local38;
			Static57.anInt1583 = local33;
		}
		if (Static81.anInt2193 != local38) {
			Static81.anInt2193 = (int) ((long) Static81.anInt2193 + (long) (local38 - Static81.anInt2193) * arg0 / 320L);
		}
		if (local33 != Static57.anInt1583) {
			Static57.anInt1583 = (int) ((long) Static57.anInt1583 + (long) (local33 - Static57.anInt1583) * arg0 / 320L);
		}
		Static248.method4050();
	}
}
