import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static575 {

	@OriginalMember(owner = "client!wca", name = "i", descriptor = "[J")
	public static long[] aLongArray17;

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "Lclient!gfa;")
	public static final Class116 aClass116_14 = new Class116(2, 4, 4, 0);

	@OriginalMember(owner = "client!wca", name = "d", descriptor = "I")
	public static int anInt10052 = 0;

	@OriginalMember(owner = "client!wca", name = "f", descriptor = "[Lclient!wt;")
	public static final Class365[] aClass365Array2 = new Class365[14];

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(BI)Z")
	public static boolean method8211(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)V")
	public static void method8212() {
		@Pc(9) int local9 = (int) ((double) Static428.anInt8046 * 34.46D);
		local9 <<= 0x2;
		if (Static440.aClass44_12.method5004()) {
			local9 += 512;
		}
		Static440.aClass44_12.GA(200, local9);
	}
}
