import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "[I")
	public static int[] anIntArray351;

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "Lclient!am;")
	public static Class11 aClass11_80;

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
	public static int anInt4118 = 0;

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString139 = "Loading config - ";

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "Lclient!fd;")
	public static Class72 aClass72_14 = null;

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "Ljava/lang/String;")
	public static final String aString140 = "cyan:";

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "Z")
	public static boolean aBoolean340 = false;

	@OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
	public static int anInt4123 = 0;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)V")
	public static void method3459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class100 local13 = Static197.aClass100ArrayArray1[arg0][arg1];
		if (local13 != null) {
			Static5.anInt138 = local13.anInt3109;
			Static122.anInt2759 = local13.anInt3100;
			Static355.anInt6889 = local13.anInt3104;
		}
		Static119.method2115();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!am;IIZ)Lclient!jp;")
	public static Class106 method3463(@OriginalArg(0) Class11 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) byte[] local9 = arg0.method288(0, arg1);
		return local9 == null ? null : new Class106(local9);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IJ)V")
	public static void method3464(@OriginalArg(1) long arg0) {
		@Pc(10) int local10 = Static150.anInt6596 + Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6465;
		@Pc(15) int local15 = Static302.anInt6100 + Static110.aClass2_Sub2_Sub1_Sub1_1.anInt6466;
		if (Static294.anInt3998 - local10 < -500 || Static294.anInt3998 - local10 > 500 || Static5.anInt133 - local15 < -500 || Static5.anInt133 - local15 > 500) {
			Static294.anInt3998 = local10;
			Static5.anInt133 = local15;
		}
		@Pc(63) int local63;
		@Pc(71) int local71;
		if (local10 != Static294.anInt3998) {
			local63 = local10 - Static294.anInt3998;
			local71 = (int) ((long) local63 * arg0 / 320L);
			if (local63 <= 0) {
				if (local71 == 0) {
					local71 = -1;
				} else if (local71 < local63) {
					local71 = local63;
				}
			} else if (local71 == 0) {
				local71 = 1;
			} else if (local71 > local63) {
				local71 = local63;
			}
			Static294.anInt3998 += local71;
		}
		if (local15 != Static5.anInt133) {
			local63 = local15 - Static5.anInt133;
			local71 = (int) ((long) local63 * arg0 / 320L);
			if (local63 <= 0) {
				if (local71 == 0) {
					local71 = -1;
				} else if (local71 < local63) {
					local71 = local63;
				}
			} else if (local71 == 0) {
				local71 = 1;
			} else if (local71 > local63) {
				local71 = local63;
			}
			Static5.anInt133 += local71;
		}
		if (!Static166.aBoolean307) {
			Static174.aFloat39 += Static203.aFloat41 * (float) arg0 / 6.0F;
			Static138.aFloat35 += (float) arg0 * Static229.aFloat44 / 6.0F;
		}
		Static251.method4339();
	}
}
