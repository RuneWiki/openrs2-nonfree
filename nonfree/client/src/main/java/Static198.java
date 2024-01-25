import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!gw", name = "F", descriptor = "[[I")
	public static int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!gw", name = "z", descriptor = "[Lclient!gw;")
	public static final Class2_Sub6_Sub9[] aClass2_Sub6_Sub9Array2 = new Class2_Sub6_Sub9[14];

	@OriginalMember(owner = "client!gw", name = "G", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_40 = new Class94(27, 7);

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!ha;ILclient!vd;)I")
	public static int method3986(@OriginalArg(0) Class20 arg0, @OriginalArg(2) Class354 arg1) {
		if (arg1.anInt10463 != -1) {
			return arg1.anInt10463;
		}
		if (arg1.anInt10468 != -1) {
			@Pc(19) Class127 local19 = arg0.anInterface4_12.method8048(arg1.anInt10468);
			if (!local19.aBoolean338) {
				return local19.aShort52;
			}
		}
		return arg1.anInt10459;
	}

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "(B)V")
	public static void method3990() {
		for (@Pc(14) Class2_Sub6_Sub3 local14 = (Class2_Sub6_Sub3) Static216.aClass341_39.method8524(); local14 != null; local14 = (Class2_Sub6_Sub3) Static216.aClass341_39.method8519()) {
			if (Static543.method8145(local14.anInt2631)) {
				Static552.method8243(local14);
			}
		}
	}
}
