import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!pga", name = "d", descriptor = "Z")
	public static boolean aBoolean575 = false;

	@OriginalMember(owner = "client!pga", name = "f", descriptor = "I")
	public static final int anInt7965 = 1407;

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)V")
	public static void method6604() {
		if (Static73.aClass296Array1 == null) {
			Static73.aClass296Array1 = Static490.method7181();
			Static88.aClass296_2 = Static73.aClass296Array1[0];
			Static452.aLong214 = Static342.method5463();
		}
		if (Static609.aClass42_3 == null) {
			Static382.method6149();
		}
		@Pc(28) Class296 local28 = Static88.aClass296_2;
		@Pc(31) int local31 = Static530.method7483();
		if (Static88.aClass296_2 == local28) {
			Static158.aString45 = Static88.aClass296_2.aClass84_63.method2710(Static372.anInt7083);
			if (Static88.aClass296_2.aBoolean615) {
				Static438.anInt8224 = (Static88.aClass296_2.anInt8691 - Static88.aClass296_2.anInt8689) * local31 / 100 + Static88.aClass296_2.anInt8689;
			}
			if (Static88.aClass296_2.aBoolean616) {
				Static158.aString45 = Static158.aString45 + Static438.anInt8224 + "%";
			}
		} else if (Static490.aClass296_23 == Static88.aClass296_2) {
			Static609.aClass42_3 = null;
			Static63.method1687(3);
		} else {
			Static158.aString45 = local28.aClass84_64.method2710(Static372.anInt7083);
			Static438.anInt8224 = local28.anInt8691;
			if (Static88.aClass296_2.aBoolean616) {
				Static158.aString45 = Static158.aString45 + local28.anInt8691 + "%";
			}
			if (Static88.aClass296_2.aBoolean615 || local28.aBoolean615) {
				Static452.aLong214 = Static342.method5463();
			}
		}
		if (Static609.aClass42_3 == null) {
			return;
		}
		Static609.aClass42_3.method1405(Static88.aClass296_2, Static438.anInt8224, Static452.aLong214, Static158.aString45);
		if (Static229.anInterface18Array1 == null) {
			return;
		}
		for (@Pc(130) int local130 = Static453.anInt8322 + 1; local130 < Static229.anInterface18Array1.length; local130++) {
			if (Static229.anInterface18Array1[local130].method8413() >= 100 && local130 - 1 == Static453.anInt8322 && Static435.anInt8191 >= 1 && Static609.aClass42_3.method1401()) {
				try {
					Static229.anInterface18Array1[local130].method8412();
				} catch (@Pc(160) Exception local160) {
					Static229.anInterface18Array1 = null;
					return;
				}
				Static609.aClass42_3.method1400(Static229.anInterface18Array1[local130]);
				Static453.anInt8322++;
				if (Static229.anInterface18Array1.length - 1 <= Static453.anInt8322 && Static229.anInterface18Array1.length > 1) {
					Static453.anInt8322 = Static607.aClass117_2.method3387() ? 0 : -1;
				}
			}
		}
		return;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ILclient!rp;IIFFFIIFFI[B)V")
	public static void method6605(@OriginalArg(1) Class58 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) float arg3, @OriginalArg(6) float arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float arg6, @OriginalArg(12) byte[] arg7) {
		for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
			Static487.method7168(arg0, arg5, arg6, arg7, arg1, arg3, local7, arg2, arg4);
			arg1 += 16384;
		}
	}

	@OriginalMember(owner = "client!pga", name = "c", descriptor = "(I)V")
	public static void method6607() {
		Static274.aClass16_12.xa(((float) Static155.aClass8_Sub25_6.aClass36_Sub25_1.method7512() * 0.1F + 0.7F) * 1.1523438F);
		Static274.aClass16_12.ZA(Static487.anInt8673, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		Static274.aClass16_12.L(Static618.anInt10388, -1, 0);
		Static274.aClass16_12.method6072(Static542.aClass40_4);
	}
}
