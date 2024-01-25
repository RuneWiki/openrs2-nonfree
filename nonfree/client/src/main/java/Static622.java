import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static622 {

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_260 = new Class160(2, -1);

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_247 = new Class251(29, 2);

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIII)V")
	public static void method8727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = Static404.anInt7010;
		@Pc(7) int local7 = Static216.anInt6484;
		if (Static656.aBoolean741) {
			local5 += Static532.method7876();
			local7 += Static276.method4674();
		}
		@Pc(30) Class45 local30;
		if (Static354.anInt6058 == 1) {
			local30 = Static30.aClass45Array4[Static440.anInt2581 / 100];
			local30.method7488(local5 - 8, local7 + -8);
			Static140.method2127(local5 + local30.method7508() - 8, local5 + -8, local30.method7504() + local7 - 8, local7 + -8);
		}
		if (Static354.anInt6058 == 2) {
			local30 = Static30.aClass45Array4[Static440.anInt2581 / 100 + 4];
			local30.method7488(local5 - 8, local7 + -8);
			Static140.method2127(local5 + local30.method7508() - 8, local5 - 8, local30.method7504() + local7 - 8, local7 - 8);
		}
		Static655.method9163();
	}
}
