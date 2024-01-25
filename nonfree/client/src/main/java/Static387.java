import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!pt", name = "h", descriptor = "I")
	public static int anInt7017;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BLclient!oh;Lclient!qa;)V")
	public static void method5695(@OriginalArg(1) Class220 arg0, @OriginalArg(2) Class62 arg1) {
		@Pc(31) boolean local31 = Static451.aClass67_2.method2011(arg0.anInt6664, arg0.anInt6638 | 0xFF000000, arg1, arg0.anInt6608, arg0.anInt6688, arg0.aBoolean460 ? Static35.aClass15_Sub2_Sub1_Sub1_1.aClass248_1 : null, arg0.anInt6641) == null;
		if (local31) {
			Static357.aClass99_55.method2513(new Class5_Sub48(arg0.anInt6641, arg0.anInt6664, arg0.anInt6608, arg0.anInt6638 | 0xFF000000, arg0.anInt6688, arg0.aBoolean460));
			Static377.method5650(arg0);
		}
	}
}
