import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!am", name = "H", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_23 = new Class296(73, 7);

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!kr;ZLclient!om;Lclient!kr;Lclient!kr;)Z")
	public static boolean method492(@OriginalArg(0) Class171 arg0, @OriginalArg(2) Class1_Sub16_Sub3 arg1, @OriginalArg(3) Class171 arg2, @OriginalArg(4) Class171 arg3) {
		Static106.aClass1_Sub16_Sub3_1 = arg1;
		Static272.aClass171_83 = arg2;
		Static497.aClass171_147 = arg0;
		Static419.aClass171_131 = arg3;
		return true;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
	public static void method493() {
		Static396.aClass87_1 = new Class87(8);
		Static191.anInt3394 = 0;
		for (@Pc(15) Class72_Sub4 local15 = (Class72_Sub4) Static214.aClass299_2.method7030(); local15 != null; local15 = (Class72_Sub4) Static214.aClass299_2.method7031()) {
			local15.method4533();
		}
	}
}
