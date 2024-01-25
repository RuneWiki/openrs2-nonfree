import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V")
	public static void method6602(@OriginalArg(1) int arg0) {
		@Pc(8) Class6_Sub5_Sub19 local8 = Static348.method5721(arg0, 5);
		local8.method5174();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method6603(@OriginalArg(1) Class5 arg0) {
		if (Static631.aClass163_63.method4972() == 0) {
			return;
		}
		@Pc(57) Class6_Sub18 local57;
		if (Static87.aClass6_Sub33_6.aClass14_Sub8_1.method2640() == 0) {
			for (local57 = (Class6_Sub18) Static631.aClass163_63.method4966(); local57 != null; local57 = (Class6_Sub18) Static631.aClass163_63.method4965()) {
				Static356.aClass221_1.method5931(Static588.aClass34_14, local57.anInt3321, local57.anInt3316, local57.anInt3318, local57.aBoolean256 ? Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aClass320_1 : null, arg0, local57.anInt3312, false, local57.anInt3317, arg0, false);
				local57.method8792();
			}
			Static486.method8547();
			return;
		}
		if (Static292.aClass5_5 == null) {
			@Pc(27) Canvas local27 = new Canvas();
			local27.setSize(36, 32);
			Static292.aClass5_5 = Static635.method8714(0, local27, Static295.anInterface7_9, 0, Static382.aClass223_83);
			Static422.aClass34_8 = Static292.aClass5_5.method6167(Static198.method3584(Static432.anInt7908, Static74.aClass223_31), Static655.method7887(Static436.aClass223_98, Static432.anInt7908));
		}
		for (local57 = (Class6_Sub18) Static631.aClass163_63.method4966(); local57 != null; local57 = (Class6_Sub18) Static631.aClass163_63.method4965()) {
			Static356.aClass221_1.method5931(Static422.aClass34_8, local57.anInt3321, local57.anInt3316, local57.anInt3318, local57.aBoolean256 ? Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aClass320_1 : null, Static292.aClass5_5, local57.anInt3312, false, local57.anInt3317, arg0, false);
			local57.method8792();
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)I")
	public static int method6604(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
