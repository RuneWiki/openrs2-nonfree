import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!pba", name = "c", descriptor = "Lclient!eba;")
	public static Class73 aClass73_5;

	@OriginalMember(owner = "client!pba", name = "h", descriptor = "S")
	public static short aShort83 = 32767;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIIII)V")
	public static void method6662(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10 = Static100.anInt10040;
		@Pc(12) int local12 = Static123.anInt2417;
		if (Static389.aBoolean497) {
			local10 += Static240.method4161();
			local12 += Static452.method6945();
		}
		@Pc(35) Class32 local35;
		if (Static630.anInt10329 == 1) {
			local35 = Static272.aClass32Array15[Static94.anInt1856 / 100];
			local35.method5071(local10 - 8, local12 - 8);
			Static347.method5621(local35.method5079() + local12 - 8, local35.method5080() + local10 + -8, local12 - 8, local10 + -8);
		}
		if (Static630.anInt10329 == 2) {
			local35 = Static272.aClass32Array15[Static94.anInt1856 / 100 + 4];
			local35.method5071(local10 - 8, local12 + -8);
			Static347.method5621(local35.method5079() + local12 - 8, local35.method5080() + -8 + local10, local12 - 8, local10 + -8);
		}
		Static230.method3435();
	}
}
