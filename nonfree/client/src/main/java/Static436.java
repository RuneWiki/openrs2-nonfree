import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "F")
	public static float aFloat103;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
	public static int anInt7186;

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
	public static int anInt7188;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
	public static int anInt7190;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_163 = new Class265(83, 2);

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
	public static int anInt7184 = 0;

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
	public static int anInt7187 = 0;

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "[I")
	public static final int[] anIntArray606 = new int[8];

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)I")
	public static int method5679(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local12 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return local12 * arg0;
		} else {
			return local12;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[FI)[F")
	public static float[] method5681(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static457.method682(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
