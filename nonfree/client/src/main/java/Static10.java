import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
	public static int anInt537;

	@OriginalMember(owner = "client!ah", name = "n", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_9 = new Class254(60, -1);

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBLclient!iaa;)V")
	public static void method621(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub26 arg1) {
		if (Static367.aClass318_1 == null) {
			return;
		}
		try {
			Static367.aClass318_1.method7606(0L);
			Static367.aClass318_1.method7608(24, arg1.aByteArray65, arg0);
		} catch (@Pc(26) Exception local26) {
		}
	}
}
