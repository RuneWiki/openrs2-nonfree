import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!gp", name = "i", descriptor = "I")
	public static int anInt3601;

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "I")
	public static int anInt3605;

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_38 = new Class144(75, 15);

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "D")
	public static double aDouble2 = -1.0D;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!oga;B)V")
	public static void method3262(@OriginalArg(0) Class3_Sub33 arg0) {
		if (arg0.aClass3_Sub34_6 != null) {
			arg0.aClass3_Sub34_6.anInt11124 = 0;
		}
		arg0.aBoolean681 = false;
		for (@Pc(20) Class3_Sub33 local20 = arg0.method8706(); local20 != null; local20 = arg0.method8708()) {
			method3262(local20);
		}
	}
}
