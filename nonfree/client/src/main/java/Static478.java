import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!tw", name = "f", descriptor = "Lclient!fea;")
	public static final Class87 aClass87_6 = new Class87();

	@OriginalMember(owner = "client!tw", name = "i", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_152 = new Class133(75, -1);

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(Lclient!kr;I)I")
	public static int method7103(@OriginalArg(0) Class3_Sub27_Sub1 arg0) {
		@Pc(10) int local10 = arg0.method4536(2);
		@Pc(31) int local31;
		if (local10 == 0) {
			local31 = 0;
		} else if (local10 == 1) {
			local31 = arg0.method4536(5);
		} else if (local10 == 2) {
			local31 = arg0.method4536(8);
		} else {
			local31 = arg0.method4536(11);
		}
		return local31;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(Lclient!qf;B)V")
	public static void method7105(@OriginalArg(0) Class245 arg0) {
		if (arg0.anInt7223 == 5 && arg0.anInt7271 != -1) {
			Static347.method5528(arg0, Static121.aClass5_7);
		}
	}
}
