import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!jq", name = "O", descriptor = "I")
	public static int anInt5329;

	@OriginalMember(owner = "client!jq", name = "P", descriptor = "I")
	public static int anInt5330 = 0;

	@OriginalMember(owner = "client!jq", name = "X", descriptor = "Z")
	public static boolean aBoolean395 = true;

	@OriginalMember(owner = "client!jq", name = "Y", descriptor = "[I")
	public static int[] anIntArray1056 = new int[2];

	@OriginalMember(owner = "client!jq", name = "ab", descriptor = "Lclient!mo;")
	public static final Class160 aClass160_49 = new Class160(8);

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "(I)V")
	public static void method4640() {
		@Pc(10) Class160 local10 = Static28.aClass160_3;
		synchronized (Static28.aClass160_3) {
			Static28.aClass160_3.method3595();
		}
	}
}
