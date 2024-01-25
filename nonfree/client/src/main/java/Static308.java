import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_69 = new Class242("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!pn", name = "n", descriptor = "Lclient!br;")
	public static final Class27 aClass27_7 = new Class27();

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
	public static void method4243() {
		if (Static75.aBoolean120) {
			return;
		}
		Static280.aBoolean347 = true;
		Static75.aBoolean120 = true;
		if (Static126.aClass67_Sub1_1.aBoolean402) {
			Static146.aFloat82 = (int) Static146.aFloat82 - 65 & 0xFFFFFF80;
		} else {
			Static8.aFloat8 += (-24.0F - Static8.aFloat8) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(JI)V")
	public static void method4244(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static207.anInt3914;
		@Pc(13) int local13 = Static110.anInt2331;
		@Pc(20) int local20;
		@Pc(28) int local28;
		if (Static156.anInt2980 != local7) {
			local20 = local7 - Static156.anInt2980;
			local28 = (int) ((long) local20 * arg0 / 320L);
			if (local20 <= 0) {
				if (local28 == 0) {
					local28 = -1;
				} else if (local28 < local20) {
					local28 = local20;
				}
			} else if (local28 == 0) {
				local28 = 1;
			} else if (local20 < local28) {
				local28 = local20;
			}
			Static156.anInt2980 += local28;
		}
		if (local13 != Static322.anInt5750) {
			local20 = local13 - Static322.anInt5750;
			local28 = (int) ((long) local20 * arg0 / 320L);
			if (local20 <= 0) {
				if (local28 == 0) {
					local28 = -1;
				} else if (local28 < local20) {
					local28 = local20;
				}
			} else if (local28 == 0) {
				local28 = 1;
			} else if (local28 > local20) {
				local28 = local20;
			}
			Static322.anInt5750 += local28;
		}
		if (!Static126.aClass67_Sub1_1.aBoolean402) {
			Static416.aFloat208 += Static311.aFloat155 * (float) arg0 / 40.0F * 8.0F;
			Static146.aFloat82 += (float) arg0 * Static8.aFloat8 / 40.0F * 8.0F;
		}
		Static449.method5768();
	}
}
