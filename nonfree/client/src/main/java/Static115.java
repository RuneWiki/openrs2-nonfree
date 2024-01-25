import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!dr", name = "mb", descriptor = "I")
	public static int anInt2363;

	@OriginalMember(owner = "client!dr", name = "Gb", descriptor = "I")
	public static int anInt2379;

	@OriginalMember(owner = "client!dr", name = "Z", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_40 = new Class180(36, -1);

	@OriginalMember(owner = "client!dr", name = "pb", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_41 = new Class180(94, 6);

	@OriginalMember(owner = "client!dr", name = "Eb", descriptor = "I")
	public static int anInt2377 = 100;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZLclient!ha;)V")
	public static void method2166(@OriginalArg(1) Class13 arg0) {
		if (Static43.aBoolean74) {
			Static299.method4616(arg0);
		} else {
			Static631.method8807(arg0);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIII)V")
	public static void method2172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14 = Static363.anInt5849;
		@Pc(16) int local16 = Static333.anInt9197;
		if (Static82.aBoolean134) {
			local14 += Static31.method748();
			local16 += Static147.method2738();
		}
		@Pc(39) Class33 local39;
		if (Static240.anInt4425 == 1) {
			local39 = Static604.aClass33Array27[Static245.anInt4476 / 100];
			local39.method7654(local14 - 8, local16 + -8);
			Static642.method8919(local39.method7645() + local14 - 8, local39.method7658() + -8 + local16, local16 - 8, local14 + -8);
		}
		if (Static240.anInt4425 == 2) {
			local39 = Static604.aClass33Array27[Static245.anInt4476 / 100 + 4];
			local39.method7654(local14 - 8, local16 + -8);
			Static642.method8919(local39.method7645() + local14 - 8, local16 + -8 - -local39.method7658(), local16 - 8, local14 + -8);
		}
		Static138.method2538();
	}
}
