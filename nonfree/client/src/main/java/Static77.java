import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
	public static int anInt2106;

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "[I")
	public static final int[] anIntArray67 = new int[13];

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
	public static void method1824() {
		if (Static596.anInterface23Array1 == null) {
			return;
		}
		@Pc(5) Interface23[] local5 = Static596.anInterface23Array1;
		for (@Pc(7) int local7 = 0; local7 < local5.length; local7++) {
			@Pc(13) Interface23 local13 = local5[local7];
			local13.method8169();
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!ie;I)Lclient!cb;")
	public static Class46_Sub1 method1828(@OriginalArg(0) Class3_Sub26 arg0) {
		@Pc(12) Class46 local12 = Static211.method6660(arg0);
		@Pc(16) int local16 = arg0.method6776();
		return new Class46_Sub1(local12.anInt1466, local12.aClass154_7, local12.aClass201_5, local12.anInt1459, local12.anInt1460, local16);
	}
}
