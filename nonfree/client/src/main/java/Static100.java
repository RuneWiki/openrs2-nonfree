import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!go", name = "l", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_133 = new Class34("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!go", name = "n", descriptor = "[I")
	public static final int[] anIntArray406 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!la;Z)I")
	public static int method3994(@OriginalArg(0) Class1_Sub23 arg0) {
		@Pc(7) String local7 = Static247.method4448(arg0);
		@Pc(9) int[] local9 = null;
		if (Static63.method4864(arg0.anInt3588)) {
			local9 = Static20.method561((int) arg0.aLong121).anIntArray273;
		} else if (Static90.method1960(arg0.anInt3588)) {
			@Pc(62) Class17_Sub1_Sub1_Sub2 local62 = Static140.aClass17_Sub1_Sub1_Sub2Array1[(int) arg0.aLong121];
			if (local62 != null) {
				local9 = local62.aClass213_1.anIntArray520;
			}
		} else if (Static324.method5276(arg0.anInt3588)) {
			if (arg0.anInt3588 == 1011) {
				local9 = Static119.method2548((int) arg0.aLong121).anIntArray390;
			} else {
				local9 = Static119.method2548((int) (arg0.aLong121 >>> 32 & 0x7FFFFFFFL)).anIntArray390;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static229.method757(local9);
		}
		return Static90.aClass63_3.method1755(Static197.aClass5Array16, local7);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BI)V")
	public static void method4001(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub4_Sub9 local8 = Static139.method4227(arg0, 7);
		local8.method1868();
	}
}
