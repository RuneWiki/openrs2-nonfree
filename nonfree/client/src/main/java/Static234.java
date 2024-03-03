import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
	public static int anInt4689;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I[S)[S", line = 28)
	public static short[] method4372(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static390.method4607(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 44)
	public static void method4373() {
		Class226.anInt6377 = -1;
		Class2_Sub3_Sub31.anInt5832 = -1;
		Class103.anInt2700 = 0;
		Class130.anInt6538 = -1;
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)I", line = 89)
	public static int method4376() {
		return 16;
	}
}
