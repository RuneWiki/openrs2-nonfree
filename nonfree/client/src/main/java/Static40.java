import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!br", name = "z", descriptor = "Lclient!o;")
	public static Class85 aClass85_1;

	@OriginalMember(owner = "client!br", name = "A", descriptor = "I")
	public static int anInt597;

	@OriginalMember(owner = "client!br", name = "B", descriptor = "[Lclient!o;")
	public static Class85[] aClass85Array2;

	@OriginalMember(owner = "client!br", name = "D", descriptor = "Lclient!vl;")
	public static Class263 aClass263_9;

	@OriginalMember(owner = "client!br", name = "o", descriptor = "Lclient!fc;")
	public static final Class77 aClass77_8 = new Class77(10);

	@OriginalMember(owner = "client!br", name = "E", descriptor = "I")
	public static int anInt598 = 0;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)[Lclient!rv;")
	public static Class227[] method541() {
		return new Class227[] { Static387.aClass227_6, Static23.aClass227_1, Static440.aClass227_4 };
	}

	@OriginalMember(owner = "client!br", name = "f", descriptor = "(I)V")
	public static void method545() {
		if (Static254.aClass170_4 != Static293.aClass170_6) {
			try {
				Static466.method42("tbrefresh", Static324.aClient1);
			} catch (@Pc(18) Throwable local18) {
			}
		}
	}
}
