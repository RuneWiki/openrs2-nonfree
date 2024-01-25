import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
	public static int anInt2137;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IBZ)I")
	public static int method1742(@OriginalArg(0) int arg0) {
		@Pc(19) Class1_Sub25 local19 = Static189.method2917(arg0, false);
		if (local19 == null) {
			return Static512.aClass357_1.method7738(arg0).anInt8678;
		}
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < local19.anIntArray328.length; local31++) {
			if (local19.anIntArray328[local31] == -1) {
				local29++;
			}
		}
		return local29 + Static512.aClass357_1.method7738(arg0).anInt8678 - local19.anIntArray328.length;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	public static void method1744() {
		if (Static243.anInterface10Array1 == null) {
			return;
		}
		@Pc(9) Interface10[] local9 = Static243.anInterface10Array1;
		for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
			@Pc(17) Interface10 local17 = local9[local11];
			local17.method6290();
		}
	}
}
