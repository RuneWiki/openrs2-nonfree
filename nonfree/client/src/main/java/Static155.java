import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
	public static int anInt2874;

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
	public static int anInt2867 = 999999;

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
	public static int anInt2871 = 0;

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
	public static int anInt2872 = 0;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILclient!oq;)Z")
	public static boolean method2481(@OriginalArg(1) int arg0, @OriginalArg(2) Class272 arg1) {
		Static187.aClass17_2.method6237(arg1.anIntArray392[arg0], arg1.anIntArray390[arg0], arg1.anIntArray391[arg0], Static324.anIntArray307);
		@Pc(22) int local22 = Static324.anIntArray307[2];
		if (local22 < 50) {
			return false;
		} else {
			arg1.aShortArray92[arg0] = (short) (Static324.anIntArray307[0] * Static27.anInt683 / local22 + Static28.anInt695);
			arg1.aShortArray91[arg0] = (short) (Static324.anIntArray307[1] * Static333.anInt5522 / local22 + Static294.anInt10775);
			arg1.aShortArray93[arg0] = (short) local22;
			return true;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)Z")
	public static boolean method2482(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(III)Z")
	public static boolean method2483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V")
	public static void method2484() {
		Static270.aClass265ArrayArray2 = new Class265[Static192.aClass362_40.method8373()][];
		Static78.aClass265ArrayArray1 = new Class265[Static192.aClass362_40.method8373()][];
		Static375.aBooleanArray25 = new boolean[Static192.aClass362_40.method8373()];
	}
}
