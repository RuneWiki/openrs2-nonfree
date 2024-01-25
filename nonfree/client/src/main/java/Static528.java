import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!rha", name = "f", descriptor = "I")
	public static int anInt9076 = -1;

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "S")
	public static short aShort87 = 32767;

	@OriginalMember(owner = "client!rha", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray39 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!rha", name = "w", descriptor = "I")
	public static int anInt9083 = 0;

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
	public static Class method7834(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(Lclient!uda;B)V")
	public static void method7837(@OriginalArg(0) Class14_Sub2_Sub20 arg0) {
		if (arg0 == null) {
			return;
		}
		Static111.aClass32_7.method582(arg0);
		Static638.anInt10454++;
		@Pc(40) Class14_Sub2_Sub17 local40;
		if (arg0.aBoolean689 || "".equals(arg0.aString113)) {
			local40 = new Class14_Sub2_Sub17(arg0.aString113);
			Static164.anInt2537++;
		} else {
			@Pc(48) long local48 = arg0.aLong280;
			for (local40 = (Class14_Sub2_Sub17) Static468.aClass125_32.method2630(local48); local40 != null && !local40.aString104.equals(arg0.aString113); local40 = (Class14_Sub2_Sub17) Static468.aClass125_32.method2635()) {
			}
			if (local40 == null) {
				local40 = (Class14_Sub2_Sub17) Static103.aClass317_9.method7882(local48);
				if (local40 != null && !local40.aString104.equals(arg0.aString113)) {
					local40 = null;
				}
				if (local40 == null) {
					local40 = new Class14_Sub2_Sub17(arg0.aString113);
				}
				Static468.aClass125_32.method2626(local40, local48);
				Static164.anInt2537++;
			}
		}
		if (local40.method8021(arg0)) {
			Static118.method1850(local40);
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "([FIIIF[FIIIFIIIF)V")
	public static void method7839(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(13) float arg12) {
		@Pc(3) int local3 = arg8 - arg1;
		@Pc(14) int local14 = arg10 - arg3;
		@Pc(22) int local22 = arg11 - arg6;
		@Pc(43) float local43 = arg0[1] * (float) local22 + (float) local3 * arg0[0] + (float) local14 * arg0[2];
		@Pc(64) float local64 = (float) local14 * arg0[5] + (float) local22 * arg0[4] + (float) local3 * arg0[3];
		@Pc(85) float local85 = (float) local14 * arg0[8] + arg0[6] * (float) local3 + arg0[7] * (float) local22;
		@Pc(100) float local100;
		@Pc(106) float local106;
		if (arg7 == 0) {
			local106 = arg12 + 0.5F - local85;
			local100 = arg4 + local43 + 0.5F;
		} else if (arg7 == 1) {
			local100 = local43 + arg4 + 0.5F;
			local106 = arg12 + local85 + 0.5F;
		} else if (arg7 == 2) {
			local100 = arg4 + 0.5F - local43;
			local106 = arg9 + 0.5F - local64;
		} else if (arg7 == 3) {
			local100 = local43 + arg4 + 0.5F;
			local106 = arg9 + 0.5F - local64;
		} else if (arg7 == 4) {
			local106 = arg9 + 0.5F - local64;
			local100 = arg12 + local85 + 0.5F;
		} else {
			local106 = arg9 + 0.5F - local64;
			local100 = arg12 + 0.5F - local85;
		}
		@Pc(208) float local208;
		if (arg2 == 1) {
			local208 = local100;
			local100 = -local106;
			local106 = local208;
		} else if (arg2 == 2) {
			local106 = -local106;
			local100 = -local100;
		} else if (arg2 == 3) {
			local208 = local100;
			local100 = local106;
			local106 = -local208;
		}
		arg5[1] = local106;
		arg5[0] = local100;
	}
}
