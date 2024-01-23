import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
	public static int anInt4105;

	@OriginalMember(owner = "client!pc", name = "Q", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!pc", name = "T", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!pc", name = "V", descriptor = "Lclient!ph;")
	public static Class138 aClass138_56;

	@OriginalMember(owner = "client!pc", name = "cb", descriptor = "[Lclient!cj;")
	public static Class31[] aClass31Array1;

	@OriginalMember(owner = "client!pc", name = "N", descriptor = "[I")
	public static int[] anIntArray335 = new int[14];

	@OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
	public static int anInt4106 = 50;

	@OriginalMember(owner = "client!pc", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString137 = "Loading wordpack - ";

	@OriginalMember(owner = "client!pc", name = "U", descriptor = "I")
	public static int anInt4109 = 0;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIBII)I")
	public static int method3304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = arg3 & 0xF;
		@Pc(30) int local30 = local15 < 4 ? arg0 : local15 == 12 || local15 == 14 ? arg1 : arg2;
		@Pc(37) int local37 = local15 < 8 ? arg1 : arg0;
		return ((local15 & 0x2) == 0 ? local30 : -local30) + ((local15 & 0x1) == 0 ? local37 : -local37);
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(B)V")
	public static void method3305() {
		Static197.aClass169_109.method4014();
		Static79.aClass169_54.method4014();
		Static292.aClass169_153.method4014();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZJ)V")
	public static void method3306(@OriginalArg(1) long arg0) {
		if (!Static51.aBoolean77) {
			Static2.aFloat1 += (float) arg0 * Static287.aFloat54 / 40.0F;
			Static15.aFloat2 += (float) arg0 * Static60.aFloat10 / 40.0F;
		}
		@Pc(36) int local36 = Static97.anInt1806;
		@Pc(49) int local49;
		@Pc(57) int local57;
		if (Static216.anInt4233 != local36) {
			local49 = local36 - Static216.anInt4233;
			local57 = (int) ((long) local49 * arg0 / 320L);
			if (local49 > 0) {
				if (local57 == 0) {
					local57 = 1;
				} else if (local49 < local57) {
					local57 = local49;
				}
			} else if (local57 == 0) {
				local57 = -1;
			} else if (local49 > local57) {
				local57 = local49;
			}
			Static216.anInt4233 += local57;
		}
		@Pc(108) int local108 = Static258.anInt5019;
		if (local108 != Static142.anInt2794) {
			local49 = local108 - Static142.anInt2794;
			local57 = (int) (arg0 * (long) local49 / 320L);
			if (local49 > 0) {
				if (local57 == 0) {
					local57 = 1;
				} else if (local57 > local49) {
					local57 = local49;
				}
			} else if (local57 == 0) {
				local57 = -1;
			} else if (local57 < local49) {
				local57 = local49;
			}
			Static142.anInt2794 += local57;
		}
		Static82.method1236();
	}
}
