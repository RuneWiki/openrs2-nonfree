import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
	public static int anInt7251;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_120 = new Class231("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "Z")
	public static boolean aBoolean483 = false;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Lclient!nj;")
	public static final Class181 aClass181_48 = new Class181();

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
	public static void method5822() {
		@Pc(7) int local7 = Static121.anInt2062;
		@Pc(9) int[] local9 = Static311.anIntArray474;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class11_Sub5_Sub2_Sub1 local19 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local9[local11]];
			if (local19 != null && local19.anInt7659 > 0) {
				local19.anInt7659--;
				if (local19.anInt7659 == 0) {
					local19.aString74 = null;
				}
			}
		}
		for (@Pc(42) int local42 = 0; local42 < Static458.anInt7721; local42++) {
			@Pc(49) long local49 = (long) Static164.anIntArray253[local42];
			@Pc(55) Class2_Sub34 local55 = (Class2_Sub34) Static400.aClass220_41.method5099(local49);
			if (local55 != null) {
				@Pc(60) Class11_Sub5_Sub2_Sub2 local60 = local55.aClass11_Sub5_Sub2_Sub2_2;
				if (local60.anInt7659 > 0) {
					local60.anInt7659--;
					if (local60.anInt7659 == 0) {
						local60.aString74 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BI)Z")
	public static boolean method5823(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 4 || arg0 == 5;
	}
}
