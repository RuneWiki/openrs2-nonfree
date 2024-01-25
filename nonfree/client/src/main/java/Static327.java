import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!qh", name = "pd", descriptor = "I")
	public static int anInt5539;

	@OriginalMember(owner = "client!qh", name = "sd", descriptor = "[I")
	public static int[] anIntArray488;

	@OriginalMember(owner = "client!qh", name = "td", descriptor = "Lclient!jl;")
	public static Class129 aClass129_2;

	@OriginalMember(owner = "client!qh", name = "ud", descriptor = "Lclient!ig;")
	public static Class12 aClass12_15;

	@OriginalMember(owner = "client!qh", name = "Fc", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_94 = new Class231("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!qh", name = "kd", descriptor = "[I")
	public static final int[] anIntArray487 = new int[25];

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "(I)V")
	public static void method4687() {
		Static171.anInt1652 = 0;
		Static40.anInt883 = 0;
		Static97.anInt1793 = 0;
		Static351.anInt5921 = 0;
	}

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "(B)V")
	public static void method4689() {
		for (@Pc(7) int local7 = 0; local7 < Static117.anInt2050; local7++) {
			@Pc(18) Class197 local18 = Static127.aClass197Array1[local7];
			if (local18.aByte62 == 2) {
				if (local18.aClass6_Sub5_Sub4_3 == null) {
					local18.anInt4983 = Integer.MIN_VALUE;
				} else {
					Static371.aClass6_Sub5_Sub2_2.method2168(local18.aClass6_Sub5_Sub4_3);
				}
			}
		}
	}
}
