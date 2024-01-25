import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!is", name = "y", descriptor = "I")
	public static int anInt3188;

	@OriginalMember(owner = "client!is", name = "q", descriptor = "[B")
	public static final byte[] aByteArray33 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!is", name = "x", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_50 = new Class15("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

	@OriginalMember(owner = "client!is", name = "z", descriptor = "I")
	public static int anInt3189 = -1;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IB)V")
	public static void method2453() {
		Static403.anInt6562 = -1;
		Static107.anInt2011 = 2;
		Static417.anInt7023 = 0;
		Static186.anInt3434 = -1;
		Static252.aClass211_63 = null;
		Static350.anInt5812 = 1;
		Static66.aBoolean66 = false;
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(IIII)I")
	public static int method2461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static69.anInt3214 < 100) {
			return -2;
		}
		@Pc(12) int local12 = -2;
		@Pc(14) int local14 = Integer.MAX_VALUE;
		@Pc(19) int local19 = arg1 - Static292.anInt6142;
		@Pc(24) int local24 = arg2 - Static292.anInt6148;
		for (@Pc(29) Class4_Sub12 local29 = (Class4_Sub12) Static292.aClass244_35.method5263(); local29 != null; local29 = (Class4_Sub12) Static292.aClass244_35.method5271()) {
			if (local29.anInt1566 == arg0) {
				@Pc(42) int local42 = local29.anInt1572;
				@Pc(45) int local45 = local29.anInt1567;
				@Pc(55) int local55 = Static292.anInt6142 + local42 << 14 | local45 + Static292.anInt6148;
				@Pc(74) int local74 = (local24 - local45) * (local24 + -local45) + (local19 - local42) * (-local42 + local19);
				if (local12 < 0 || local74 < local14) {
					local12 = local55;
					local14 = local74;
				}
			}
		}
		return local12;
	}
}
