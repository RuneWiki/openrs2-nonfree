import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static551 {

	@OriginalMember(owner = "client!tk", name = "A", descriptor = "I")
	public static int anInt9406;

	@OriginalMember(owner = "client!tk", name = "z", descriptor = "Z")
	public static boolean aBoolean641 = false;

	@OriginalMember(owner = "client!tk", name = "E", descriptor = "[I")
	public static final int[] anIntArray576 = new int[2048];

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "(B)V")
	public static void method7994() {
		Static277.anInt5443 = 0;
		Static280.aClass224Array1 = new Class224[50];
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZZ)V")
	public static void method7995(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static554.anInt1822 != -1) {
				Static388.method6215(Static554.anInt1822);
			}
			for (@Pc(19) Class6_Sub29 local19 = (Class6_Sub29) Static507.aClass128_42.method3556(); local19 != null; local19 = (Class6_Sub29) Static507.aClass128_42.method3555()) {
				if (!local19.method9042()) {
					local19 = (Class6_Sub29) Static507.aClass128_42.method3556();
					if (local19 == null) {
						break;
					}
				}
				Static221.method3774(false, local19, true);
			}
			Static554.anInt1822 = -1;
			Static507.aClass128_42 = new Class128(8);
			Static302.method5142();
			Static554.anInt1822 = Static15.anInt5890;
			Static71.method1267(false);
			Static643.method8977();
			Static244.method4205(Static554.anInt1822);
		}
		Static376.aBoolean460 = true;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BZI)V")
	public static void method7996(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class6_Sub16 local10 = Static148.method2357(arg0, arg1);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray171.length; local15++) {
				local10.anIntArray171[local15] = -1;
				local10.anIntArray173[local15] = 0;
			}
		}
	}
}
