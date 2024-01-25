import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!sf", name = "ud", descriptor = "I")
	public static int anInt6329;

	@OriginalMember(owner = "client!sf", name = "dd", descriptor = "Z")
	public static boolean aBoolean409 = false;

	@OriginalMember(owner = "client!sf", name = "kd", descriptor = "Lclient!mo;")
	public static final Class168 aClass168_32 = new Class168(0, 6);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZLclient!sc;)V")
	public static void method4934(@OriginalArg(1) Class10_Sub7 arg0) {
		if (arg0.aClass10_Sub25_5 != null) {
			arg0.aClass10_Sub25_5.anInt7554 = 0;
		}
		arg0.aBoolean394 = false;
		for (@Pc(22) Class10_Sub7 local22 = arg0.method4818(); local22 != null; local22 = arg0.method4816()) {
			method4934(local22);
		}
	}
}
