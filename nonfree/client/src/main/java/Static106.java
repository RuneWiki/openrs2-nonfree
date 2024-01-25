import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!dka", name = "F", descriptor = "I")
	public static int anInt2115;

	@OriginalMember(owner = "client!dka", name = "B", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_37 = new Class322(19, -1);

	@OriginalMember(owner = "client!dka", name = "w", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_38 = new Class322(12, 2);

	@OriginalMember(owner = "client!dka", name = "c", descriptor = "(B)V")
	public static void method2035() {
		@Pc(7) int local7 = Static661.anInt10532;
		@Pc(9) int[] local9 = Static591.anIntArray611;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class60_Sub1_Sub1_Sub3_Sub1 local19 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local9[local11]];
			if (local19 != null) {
				Static216.method3957(local19, local19.method4424((byte) -28));
			}
		}
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(ILclient!eea;I)V")
	public static void method2036(@OriginalArg(1) Class6_Sub15_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static27.anInt372 = 0;
		Static66.aBoolean55 = false;
		Static263.method4528(arg0);
		Static657.method8767(arg0);
		if (Static66.aBoolean55) {
			System.out.println("---endgpp---");
		}
		if (arg0.anInt3174 != arg1) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt3174 + " psize:" + arg1);
		}
	}
}
