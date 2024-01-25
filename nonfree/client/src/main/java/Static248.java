import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!hla", name = "p", descriptor = "I")
	public static int anInt4606;

	@OriginalMember(owner = "client!hla", name = "i", descriptor = "Lclient!wv;")
	public static final Class409 aClass409_9 = new Class409(7, 2);

	@OriginalMember(owner = "client!hla", name = "l", descriptor = "Lclient!gn;")
	public static final Class136 aClass136_23 = new Class136(16);

	@OriginalMember(owner = "client!hla", name = "r", descriptor = "I")
	public static int anInt4611 = 0;

	@OriginalMember(owner = "client!hla", name = "q", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_82 = new Class186(131, -2);

	@OriginalMember(owner = "client!hla", name = "a", descriptor = "(IB)V")
	public static void method3764(@OriginalArg(0) int arg0) {
		for (@Pc(13) Class3 local13 = Static356.aClass136_28.method3509(); local13 != null; local13 = Static356.aClass136_28.method3506()) {
			if ((long) arg0 == (local13.aLong382 >> 48 & 0xFFFFL)) {
				local13.method9446();
			}
		}
	}

	@OriginalMember(owner = "client!hla", name = "b", descriptor = "(I)V")
	public static void method3765() {
		Static335.aBoolean471 = true;
	}
}
