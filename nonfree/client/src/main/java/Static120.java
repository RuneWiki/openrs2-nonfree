import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
	public static int anInt2753 = 0;

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "Lclient!od;")
	public static Class60 aClass60_1074 = Static41.method597("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
	public static int anInt2754 = 127;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
	public static int anInt2757 = 0;

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "Lclient!od;")
	public static Class60 aClass60_1075 = Static41.method597(":");

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
	public static int anInt2759 = 0;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
	public static void method1903() {
		aClass60_1074 = null;
		aClass60_1075 = null;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "([BI)[B")
	public static byte[] method1904(@OriginalArg(0) byte[] arg0) {
		@Pc(15) Class4_Sub9 local15 = new Class4_Sub9(arg0);
		@Pc(19) int local19 = local15.method773();
		@Pc(23) int local23 = local15.method780();
		if (local23 < 0 || Static23.anInt809 != 0 && Static23.anInt809 < local23) {
			throw new RuntimeException();
		} else if (local19 == 0) {
			@Pc(89) byte[] local89 = new byte[local23];
			local15.method794(local23, local89);
			return local89;
		} else {
			@Pc(47) int local47 = local15.method780();
			if (local47 < 0 || Static23.anInt809 != 0 && local47 > Static23.anInt809) {
				throw new RuntimeException();
			}
			@Pc(65) byte[] local65 = new byte[local47];
			if (local19 == 1) {
				Static114.method1862(local65, local47, arg0, local23);
			} else {
				Static105.aClass21_1.method478(local65, local15);
			}
			return local65;
		}
	}
}
