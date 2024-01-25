import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static575 {

	@OriginalMember(owner = "client!wca", name = "y", descriptor = "I")
	public static int anInt5384;

	@OriginalMember(owner = "client!wca", name = "x", descriptor = "[Lclient!nt;")
	public static final Class1_Sub3_Sub13[] aClass1_Sub3_Sub13Array4 = new Class1_Sub3_Sub13[14];

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(BLclient!vea;)I")
	public static int method4595(@OriginalArg(1) Class340 arg0) {
		if (Static554.aClass340_11 == arg0) {
			return 5120;
		} else if (arg0 == Static554.aClass340_12) {
			return 5122;
		} else if (Static554.aClass340_13 == arg0) {
			return 5124;
		} else if (Static554.aClass340_14 == arg0) {
			return 5121;
		} else if (arg0 == Static554.aClass340_15) {
			return 5123;
		} else if (Static554.aClass340_16 == arg0) {
			return 5125;
		} else if (arg0 == Static554.aClass340_17) {
			return 5131;
		} else if (arg0 == Static554.aClass340_18) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
