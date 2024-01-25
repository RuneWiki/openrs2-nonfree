import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
	public static int anInt7518;

	@OriginalMember(owner = "client!rv", name = "h", descriptor = "J")
	public static long aLong207;

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "Lclient!ui;")
	public static final Class295 aClass295_47 = new Class295();

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_114 = new Class45("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "[Lclient!sba;")
	public static final Class1_Sub2_Sub17[] aClass1_Sub2_Sub17Array4 = new Class1_Sub2_Sub17[14];

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZBIZI)I")
	public static int method6716(@OriginalArg(2) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class1_Sub8 local10 = Static271.method4828(arg0, false);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray118.length; local18++) {
			if (local10.anIntArray118[local18] >= 0 && local10.anIntArray118[local18] < Static181.aClass316_1.anInt9398) {
				@Pc(44) Class180 local44 = Static181.aClass316_1.method8107(local10.anIntArray118[local18]);
				@Pc(54) int local54 = local44.method4971(Static440.aClass266_1.method6930(arg2).anInt1685, arg2);
				if (arg1) {
					local16 += local54 * local10.anIntArray119[local18];
				} else {
					local16 += local54;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILclient!nf;)V")
	public static void method6717(@OriginalArg(1) Class199 arg0) {
		Static422.aClass199_1 = arg0;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Z)V")
	public static void method6718() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static237.anInt4563; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static373.anInt6694; local13++) {
				if (Static172.method3204(local13, local9, Static263.aClass64ArrayArrayArray3, local7, true)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
