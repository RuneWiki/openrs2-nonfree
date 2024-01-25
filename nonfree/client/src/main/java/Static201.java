import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static201 {

	@OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
	public static int anInt6747;

	@OriginalMember(owner = "client!hq", name = "v", descriptor = "[I")
	public static int[] anIntArray451;

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "Lclient!wo;")
	public static final Class361 aClass361_70 = new Class361();

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)I")
	public static int method5525() {
		return Static501.anIntArray575 == null ? 0 : Static501.anIntArray575.length * 2;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!wv;I)V")
	public static void method5537(@OriginalArg(0) Class365 arg0) {
		if (arg0.anInt9657 == Static466.anInt2594) {
			Static510.aBooleanArray29[arg0.anInt9600] = true;
		}
	}
}
