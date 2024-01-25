import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_85 = new Class94(16, 7);

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "Z")
	public static boolean aBoolean604 = false;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BII)Z")
	public static boolean method7173(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)V")
	public static void method7176(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub6_Sub6 local8 = Static139.method3119(arg0, 17);
		local8.method3093();
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
	public static void method7177() {
		Static517.aClass49_3.method1917();
		Static151.aClass275_3.method7107();
		Static541.aClass245_2.method6502();
		Static27.aClass342_3.method8539();
		Static462.aClass355_2.method8741();
		Static635.aClass336_2.method8421();
		Static195.aClass193_1.method5574();
		Static459.aClass62_2.method2251();
		Static517.aClass284_1.method7407();
		Static581.aClass305_1.method7736();
		Static415.aClass340_1.method8513();
		Static361.aClass248_4.method6583();
		Static16.aClass237_3.method6469();
		Static229.aClass70_1.method2499();
		Static361.aClass278_1.method7124();
		Static227.aClass190_1.method5488();
		Static371.aClass137_1.method4255();
		Static2.aClass277_4.method7115();
		Static527.aClass260_31.method6822();
		Static384.aClass173_1.method5114();
		Static298.aClass307_2.method7795();
		Static339.method5852();
		Static271.method9046();
		Static16.method338();
		Static335.method5740();
		Static432.method6888();
		Static131.aClass169_22.method4997(5);
		Static217.aClass169_17.method4997(5);
		Static40.aClass169_7.method4997(5);
		Static232.aClass169_31.method4997(5);
		Static284.aClass169_33.method4997(5);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!in;I)Lclient!jf;")
	public static Class2_Sub27 method7178(@OriginalArg(1) Class157 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) byte[] local12 = arg0.method4569(arg1);
		return local12 == null ? null : new Class2_Sub27(local12);
	}
}
