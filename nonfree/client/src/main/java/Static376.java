import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!mja", name = "u", descriptor = "Lclient!vr;")
	public static Class3 aClass3_3;

	@OriginalMember(owner = "client!mja", name = "o", descriptor = "Z")
	public static boolean aBoolean539 = false;

	@OriginalMember(owner = "client!mja", name = "r", descriptor = "I")
	public static int anInt7119 = 0;

	@OriginalMember(owner = "client!mja", name = "f", descriptor = "(I)V")
	public static void method6371() {
		for (@Pc(12) int local12 = 0; local12 < Static96.aByteArrayArrayArray10.length; local12++) {
			for (@Pc(16) int local16 = 0; local16 < Static96.aByteArrayArrayArray10[0].length; local16++) {
				for (@Pc(20) int local20 = 0; local20 < Static96.aByteArrayArrayArray10[0][0].length; local20++) {
					Static96.aByteArrayArrayArray10[local12][local16][local20] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(IZI)V")
	public static void method6372(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class363 local14 = Static347.aClass363ArrayArray1[arg1][arg0];
		if (local14 != null) {
			Static481.anInt8661 = local14.anInt10773;
			Static558.anInt9716 = local14.anInt10780;
			Static109.anInt1989 = local14.anInt10779;
		}
		Static634.method9358();
	}
}
