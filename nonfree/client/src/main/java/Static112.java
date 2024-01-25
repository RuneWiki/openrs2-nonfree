import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!dga", name = "Lb", descriptor = "Z")
	public static boolean aBoolean215;

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(B)I")
	public static int method1626() {
		if (Static189.aBoolean301) {
			return 6;
		} else if (Static91.aClass2_Sub6_Sub20_2 == null) {
			return 0;
		} else {
			@Pc(24) int local24 = Static91.aClass2_Sub6_Sub20_2.anInt9603;
			if (Static672.method9169(local24)) {
				return 1;
			} else if (Static284.method3981(local24)) {
				return 2;
			} else if (Static575.method7994(local24)) {
				return 3;
			} else if (Static690.method9315(local24)) {
				return 4;
			} else if (Static17.method246(local24)) {
				return 7;
			} else if (local24 == 60) {
				return 8;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ILclient!bi;)V")
	public static void method1627(@OriginalArg(1) Class4_Sub2_Sub1_Sub2_Sub1 arg0) {
		@Pc(11) Class2_Sub38 local11 = (Class2_Sub38) Static307.aClass218_22.method5095((long) arg0.anInt2320, 0);
		if (local11 == null) {
			Static255.method3624(arg0.anIntArray182[0], arg0, 0, (Class4_Sub2_Sub1_Sub2_Sub2) null, (Class81) null, arg0.anIntArray183[0], arg0.aByte133);
		} else {
			local11.method5816();
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(II)I")
	public static int method1642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static651.aShortArrayArray6 == null ? 0 : Static651.aShortArrayArray6[arg0][arg1] & 0xFFFF;
	}
}
