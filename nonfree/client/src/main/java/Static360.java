import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!la", name = "n", descriptor = "I")
	public static int anInt8364;

	@OriginalMember(owner = "client!la", name = "m", descriptor = "I")
	public static int anInt8373;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZ)I")
	public static int method7135(@OriginalArg(0) int arg0) {
		@Pc(15) Class3_Sub38 local15 = Static14.method503(false, arg0);
		if (local15 == null) {
			return Static614.aClass51_1.method1491(arg0).anInt1677;
		}
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < local15.anIntArray410.length; local28++) {
			if (local15.anIntArray410[local28] == -1) {
				local26++;
			}
		}
		return local26 + Static614.aClass51_1.method1491(arg0).anInt1677 - local15.anIntArray410.length;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!fca;II)Z")
	public static boolean method7136(@OriginalArg(0) Class108 arg0, @OriginalArg(2) int arg1) {
		Static491.aClass58_8.method9519(arg0.anIntArray194[arg1], arg0.anIntArray196[arg1], arg0.anIntArray195[arg1], Static464.anIntArray743);
		@Pc(22) int local22 = Static464.anIntArray743[2];
		if (local22 < 50) {
			return false;
		} else {
			arg0.aShortArray17[arg1] = (short) (Static464.anIntArray743[0] * Static456.anInt7115 / local22 + Static351.anInt5574);
			arg0.aShortArray18[arg1] = (short) (Static325.anInt5274 + Static464.anIntArray743[1] * Static446.anInt6828 / local22);
			arg0.aShortArray16[arg1] = (short) local22;
			return true;
		}
	}
}
