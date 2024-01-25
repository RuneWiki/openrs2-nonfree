import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!co", name = "r", descriptor = "[Lclient!so;")
	public static Class124_Sub1[] aClass124_Sub1Array1 = new Class124_Sub1[0];

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V")
	public static void method853() {
		@Pc(10) Class227 local10 = Static329.aClass227_30;
		synchronized (Static329.aClass227_30) {
			Static329.aClass227_30.method4858();
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!tq;ILclient!je;)V")
	public static void method859(@OriginalArg(0) Class164 arg0, @OriginalArg(2) Class117 arg1) {
		@Pc(31) boolean local31 = Static263.aClass102_2.method2173(arg0, arg1.anInt3103, arg1.anInt3107, arg1.anInt3063, arg1.anInt3080, arg1.anInt3084 | 0xFF000000, arg1.aBoolean267 ? Static321.aClass25_Sub1_Sub1_Sub1_2.aClass49_1 : null) == null;
		if (local31) {
			Static329.aClass17_38.method199(new Class1_Sub5(arg1.anInt3080, arg1.anInt3107, arg1.anInt3103, arg1.anInt3084 | 0xFF000000, arg1.anInt3063, arg1.aBoolean267));
		}
	}
}
