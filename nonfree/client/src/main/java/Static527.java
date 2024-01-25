import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!ufa", name = "d", descriptor = "Lclient!ff;")
	public static final Class101 aClass101_15 = new Class101(13, 0, 1, 0);

	@OriginalMember(owner = "client!ufa", name = "r", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_263 = new Class235(79, -1);

	@OriginalMember(owner = "client!ufa", name = "s", descriptor = "[I")
	public static final int[] anIntArray672 = new int[32];

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)Z")
	public static boolean method7249() {
		@Pc(7) boolean local7 = true;
		if (Static422.aClass102_10 == null) {
			if (Static463.aClass270_98.method5694(Static351.anInt5834)) {
				Static422.aClass102_10 = Static601.method2081(Static463.aClass270_98, Static351.anInt5834);
			} else {
				local7 = false;
			}
		}
		if (Static401.aClass102_8 == null) {
			if (Static463.aClass270_98.method5694(Static429.anInt7506)) {
				Static401.aClass102_8 = Static601.method2081(Static463.aClass270_98, Static429.anInt7506);
			} else {
				local7 = false;
			}
		}
		if (Static548.aClass102_14 == null) {
			if (Static463.aClass270_98.method5694(Static461.anInt7945)) {
				Static548.aClass102_14 = Static601.method2081(Static463.aClass270_98, Static461.anInt7945);
			} else {
				local7 = false;
			}
		}
		if (Static246.aClass334_7 == null) {
			if (Static412.aClass270_85.method5694(Static308.anInt5288)) {
				Static246.aClass334_7 = Static423.method5847(Static412.aClass270_85, Static308.anInt5288);
			} else {
				local7 = false;
			}
		}
		if (Static580.aClass102Array1 == null) {
			if (Static463.aClass270_98.method5694(Static308.anInt5288)) {
				Static580.aClass102Array1 = Static601.method2075(Static463.aClass270_98, Static308.anInt5288);
			} else {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BLclient!sn;)Z")
	public static boolean method7250(@OriginalArg(1) Class308 arg0) {
		return Static466.aClass308_7 == arg0 || arg0 == Static302.aClass308_4 || arg0 == Static354.aClass308_5 || arg0 == Static1.aClass308_1;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(II)V")
	public static void method7251(@OriginalArg(0) int arg0) {
		Static409.anIntArray543 = new int[arg0];
		Static401.anIntArray539 = new int[arg0];
		Static164.anIntArray688 = new int[arg0];
		Static441.anIntArray644 = new int[arg0];
		Static109.anIntArray265 = new int[arg0];
	}
}
