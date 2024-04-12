import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
	public static int anInt310;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!fc;")
	public static Class2_Sub2_Sub2_Sub2 aClass2_Sub2_Sub2_Sub2_1;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 14)
	public static void method262() {
		Class2_Sub2_Sub1.aClass47_3.method1330();
		Class42.aClass47_15.method1330();
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V", line = 30)
	public static void method263() {
		RuntimeException_Sub1.aClass40_85 = null;
		RuntimeException_Sub1.aClass40_84 = null;
		RuntimeException_Sub1.anIntArrayArray7 = null;
		aClass2_Sub2_Sub2_Sub2_1 = null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!o;I)V", line = 57)
	public static void method264(@OriginalArg(0) Class40 arg0) {
		if (arg0 == null || arg0.method1169() == 0) {
			Class2_Sub2_Sub14.anInt2066 = 0;
			return;
		}
		@Pc(27) Class40 local27 = arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) Class40[] local32 = new Class40[100];
		while (true) {
			@Pc(37) int local37 = local27.method1182();
			if (local37 == -1) {
				local27 = local27.method1178();
				if (local27.method1169() > 0) {
					local32[local29++] = local27.method1196();
				}
				Class2_Sub2_Sub14.anInt2066 = 0;
				label46: for (local37 = 0; local37 < Static36.anInt971; local37++) {
					@Pc(98) Class2_Sub2_Sub8 local98 = Static97.method1669(local37);
					if (local98.anInt932 == -1 && local98.aClass40_290 != null) {
						@Pc(110) Class40 local110 = local98.aClass40_290.method1196();
						for (@Pc(112) int local112 = 0; local112 < local29; local112++) {
							if (local110.method1200(local32[local112]) == -1) {
								continue label46;
							}
						}
						Class14.aClass40Array7[Class2_Sub2_Sub14.anInt2066] = local110;
						Class23.anIntArray166[Class2_Sub2_Sub14.anInt2066] = local37;
						Class2_Sub2_Sub14.anInt2066++;
						if (Class14.aClass40Array7.length <= Class2_Sub2_Sub14.anInt2066) {
							return;
						}
					}
				}
				return;
			}
			@Pc(49) Class40 local49 = local27.method1180(local37, 0).method1178();
			if (local49.method1169() > 0) {
				local32[local29++] = local49.method1196();
			}
			local27 = local27.method1185(local37 + 1);
		}
	}
}
