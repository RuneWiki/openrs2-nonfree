import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "[I")
	public static int[] anIntArray47;

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "[Z")
	public static boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
	public static int anInt640;

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
	public static int anInt635 = 0;

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "Lclient!bj;")
	public static Class26 aClass26_4 = new Class26(64);

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "[I")
	public static int[] anIntArray49 = new int[2];

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!ms;I)Lclient!ms;")
	public static Class137 method509(@OriginalArg(0) Class137 arg0) {
		if (arg0.anInt4124 != -1) {
			return Static166.method2688(arg0.anInt4124);
		}
		@Pc(19) int local19 = arg0.anInt4044 >>> 16;
		@Pc(24) Class187 local24 = new Class187(Static197.aClass58_18);
		for (@Pc(35) Class11_Sub41 local35 = (Class11_Sub41) local24.method5111(); local35 != null; local35 = (Class11_Sub41) local24.method5109()) {
			if (local19 == local35.anInt6364) {
				return Static166.method2688((int) local35.aLong215);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)[Lclient!dp;")
	public static Class53[] method511() {
		if (Static270.aClass53Array1 == null) {
			@Pc(7) Class53[] local7 = Static42.method635(Static77.aClass118_7);
			@Pc(11) Class53[] local11 = new Class53[local7.length];
			@Pc(13) int local13 = 0;
			@Pc(62) int local62;
			@Pc(68) Class53 local68;
			label63: for (@Pc(15) int local15 = 0; local15 < local7.length; local15++) {
				@Pc(21) Class53 local21 = local7[local15];
				if ((local21.anInt1152 <= 0 || local21.anInt1152 >= 24) && local21.anInt1148 >= 800 && local21.anInt1146 >= 600 && (Static355.anInt6753 >= 96 || Static74.anInt1413 != 0 || local21.anInt1148 <= 1024 && local21.anInt1146 <= 768)) {
					for (local62 = 0; local62 < local13; local62++) {
						local68 = local11[local62];
						if (local68.anInt1148 == local21.anInt1148 && local68.anInt1146 == local21.anInt1146) {
							if (local21.anInt1152 > local68.anInt1152) {
								local11[local62] = local21;
							}
							continue label63;
						}
					}
					local11[local13] = local21;
					local13++;
				}
			}
			Static270.aClass53Array1 = new Class53[local13];
			Static363.method1667(local11, 0, Static270.aClass53Array1, 0, local13);
			@Pc(124) int[] local124 = new int[Static270.aClass53Array1.length];
			for (local62 = 0; local62 < Static270.aClass53Array1.length; local62++) {
				local68 = Static270.aClass53Array1[local62];
				local124[local62] = local68.anInt1148 * local68.anInt1146;
			}
			Static49.method708(local124, Static270.aClass53Array1);
		}
		return Static270.aClass53Array1;
	}
}
