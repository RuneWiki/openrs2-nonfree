import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "Lclient!ir;")
	public static Class100 aClass100_39;

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "Lclient!ik;")
	public static Class95 aClass95_1;

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "Lclient!ir;")
	public static Class100 aClass100_40;

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
	public static int anInt2144;

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "Lclient!m;")
	public static final Class127 aClass127_7 = new Class127();

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public static void method1721() {
		for (@Pc(15) int local15 = 0; local15 < Static351.anInt6820; local15++) {
			@Pc(21) Class135 local21 = Static353.method5715(local15);
			if (local21 != null && local21.anInt4015 == 0) {
				Static288.anIntArray471[local15] = 0;
				Static38.anIntArray55[local15] = 0;
			}
		}
		Static98.aClass24_9 = new Class24(16);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!fb;B)V")
	public static void method1722(@OriginalArg(0) Class3_Sub4 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static157.anInt3025; local7++) {
			@Pc(13) int local13 = arg0.method3633();
			@Pc(17) int local17 = arg0.method3649();
			if (local17 == 65535) {
				local17 = -1;
			}
			if (Static187.aClass58_Sub1Array1[local13] != null) {
				Static187.aClass58_Sub1Array1[local13].anInt5525 = local17;
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method1723(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static220.anInt4548; local11++) {
			if (arg0.equalsIgnoreCase(Static12.aStringArray1[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static349.aClass5_Sub4_Sub4_Sub1_2.aString126);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!de;ILjava/awt/Canvas;Lclient!wh;I)Lclient!tj;")
	public static Class122 method1725(@OriginalArg(0) int arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Canvas arg3, @OriginalArg(4) Interface9 arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			if (!Static114.aBooleanArray9[local14]) {
				local7 = local14;
				Static114.aBooleanArray9[local14] = true;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("No free toolkit instances");
		} else if (arg2 == 0) {
			return Static67.method1073(arg4, arg3, local7);
		} else if (arg2 == 1) {
			return Static302.method5090(arg4, local7, arg0, arg1, arg3);
		} else {
			throw new IllegalArgumentException("Unsupported mode");
		}
	}
}
