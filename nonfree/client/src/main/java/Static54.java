import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!cm", name = "v", descriptor = "Lclient!fq;")
	public static Class84 aClass84_2;

	@OriginalMember(owner = "client!cm", name = "y", descriptor = "Lclient!o;")
	public static Class41 aClass41_2;

	@OriginalMember(owner = "client!cm", name = "z", descriptor = "Lclient!gl;")
	public static Class66 aClass66_1;

	@OriginalMember(owner = "client!cm", name = "s", descriptor = "Lclient!of;")
	public static final Class188 aClass188_11 = new Class188(50);

	@OriginalMember(owner = "client!cm", name = "u", descriptor = "I")
	public static int anInt992 = 0;

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V")
	public static void method895() {
		Static456.aClass188_59.method4154();
		aClass188_11.method4154();
		Static264.aClass188_39.method4154();
		Static164.aClass188_30.method4154();
		Static97.aClass188_17.method4154();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!hw;I)V")
	public static void method897(@OriginalArg(0) Class2_Sub17 arg0) {
		for (@Pc(15) int local15 = 0; local15 < Static220.anInt3718; local15++) {
			@Pc(21) int local21 = arg0.method6174();
			@Pc(25) int local25 = arg0.method6148();
			if (local25 == 65535) {
				local25 = -1;
			}
			if (Static148.aClass65_Sub1Array2[local21] != null) {
				Static148.aClass65_Sub1Array2[local21].anInt1480 = local25;
			}
		}
	}
}
