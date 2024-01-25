import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!j", name = "i", descriptor = "Lclient!bk;")
	public static Interface3 anInterface3_6;

	@OriginalMember(owner = "client!j", name = "h", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_160 = new Class159("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!j", name = "j", descriptor = "[I")
	public static final int[] anIntArray278 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(JB)V")
	public static void method2951(@OriginalArg(0) long arg0) {
		@Pc(10) int local10 = Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6701 + Static245.anInt5012;
		@Pc(15) int local15 = Static243.anInt5994 + Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6702;
		if (Static193.anInt4286 - local10 < -500 || Static193.anInt4286 - local10 > 500 || Static354.anInt6740 - local15 < -500 || Static354.anInt6740 - local15 > 500) {
			Static193.anInt4286 = local10;
			Static354.anInt6740 = local15;
		}
		@Pc(59) int local59;
		@Pc(67) int local67;
		if (Static193.anInt4286 != local10) {
			local59 = local10 - Static193.anInt4286;
			local67 = (int) (arg0 * (long) local59 / 320L);
			if (local59 > 0) {
				if (local67 == 0) {
					local67 = 1;
				} else if (local59 < local67) {
					local67 = local59;
				}
			} else if (local67 == 0) {
				local67 = -1;
			} else if (local59 > local67) {
				local67 = local59;
			}
			Static193.anInt4286 += local67;
		}
		if (local15 != Static354.anInt6740) {
			local59 = local15 - Static354.anInt6740;
			local67 = (int) (arg0 * (long) local59 / 320L);
			if (local59 > 0) {
				if (local67 == 0) {
					local67 = 1;
				} else if (local67 > local59) {
					local67 = local59;
				}
			} else if (local67 == 0) {
				local67 = -1;
			} else if (local67 < local59) {
				local67 = local59;
			}
			Static354.anInt6740 += local67;
		}
		if (!Static24.aBoolean37) {
			Static106.aFloat31 += (float) arg0 * Static172.aFloat67 / 6.0F;
			Static77.aFloat23 += (float) arg0 * Static168.aFloat98 / 6.0F;
		}
		Static212.method2560();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)Lclient!nb;")
	public static Class138 method2953(@OriginalArg(0) int arg0) {
		@Pc(15) Class138 local15 = (Class138) Static40.aClass198_39.method5210((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static134.aClass193_50.method5047(35, arg0);
		local15 = new Class138();
		if (local25 != null) {
			local15.method3877(new Class4_Sub11(local25));
		}
		local15.method3878();
		Static40.aClass198_39.method5201(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
	public static void method2954() {
		@Pc(10) Class198 local10 = Static269.aClass198_194;
		synchronized (Static269.aClass198_194) {
			Static269.aClass198_194.method5213();
		}
	}
}
