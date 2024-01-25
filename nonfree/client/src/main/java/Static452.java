import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!tba", name = "f", descriptor = "F")
	public static float aFloat152;

	@OriginalMember(owner = "client!tba", name = "c", descriptor = "Lclient!bt;")
	public static final Class37 aClass37_3 = new Class37("stellardawn", 1);

	@OriginalMember(owner = "client!tba", name = "d", descriptor = "Lclient!tda;")
	public static final Class273 aClass273_11 = new Class273(0, 2, 2, 1);

	@OriginalMember(owner = "client!tba", name = "e", descriptor = "I")
	public static int anInt7572 = -1;

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lclient!kca;I)V")
	public static void method6481(@OriginalArg(0) Class1_Sub12 arg0) {
		if (arg0.aClass1_Sub32_5 != null) {
			arg0.aClass1_Sub32_5.anInt6857 = 0;
		}
		arg0.aBoolean503 = false;
		for (@Pc(16) Class1_Sub12 local16 = arg0.method6515(); local16 != null; local16 = arg0.method6517()) {
			method6481(local16);
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(III)Z")
	public static boolean method6483(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static496.method7130(arg1, arg0) | (arg0 & 0x40000) != 0 || Static50.method7746(arg0, arg1);
	}
}
