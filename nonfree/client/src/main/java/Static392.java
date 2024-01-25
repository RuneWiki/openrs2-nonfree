import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
	public static int anInt6525;

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "Lclient!rp;")
	public static final Class220 aClass220_52 = new Class220(4);

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
	public static int anInt6523 = 0;

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "I")
	public static int anInt6526 = 0;

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_103 = new Class25(19, 8);

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)V")
	public static void method5390() {
		@Pc(11) Class128[] local11 = Class3_Sub2_Sub1.aClass128Array1;
		synchronized (Class3_Sub2_Sub1.aClass128Array1) {
			for (@Pc(15) int local15 = 0; local15 < Class3_Sub2_Sub1.aClass128Array1.length; local15++) {
				Class3_Sub2_Sub1.aClass128Array1[local15] = new Class128();
				Static384.anIntArray555[local15] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIBI)V")
	public static void method5391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1010) {
			Static308.method4421(Static312.aClass193_5, arg2, arg1);
		} else if (arg0 == 1003) {
			Static308.method4421(Static339.aClass193_6, arg2, arg1);
		} else if (arg0 == 1002) {
			Static308.method4421(Static402.aClass193_8, arg2, arg1);
		} else if (arg0 == 1004) {
			Static308.method4421(Static4.aClass193_1, arg2, arg1);
		} else if (arg0 == 1001) {
			Static308.method4421(Static51.aClass193_2, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IB)V")
	public static void method5393() {
		Static434.aClass220_56.method4998(50);
		Static253.aClass220_38.method4998(50);
		Static260.aClass220_39.method4998(50);
		Static141.aClass220_17.method4998(50);
		Static93.aClass220_11.method4998(50);
	}
}
