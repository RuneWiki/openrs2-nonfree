import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
	public static int anInt5944;

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "I")
	public static int anInt5946;

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_184 = new Class214(23, -1);

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "[Lclient!ue;")
	public static final Class253[] aClass253Array1 = new Class253[4];

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IILclient!tf;B)V")
	public static void method4925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class240 arg2) {
		Static92.aClass240_8 = arg2;
		Static188.anInt3795 = arg0;
		Static289.anInt5362 = arg1;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!ci;I)I")
	public static int method4926(@OriginalArg(0) Class38 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method1037(Static47.anInt1072)) {
			local5++;
		}
		if (arg0.method1037(Static287.anInt5559)) {
			local5++;
		}
		if (arg0.method1037(Static295.anInt5430)) {
			local5++;
		}
		if (arg0.method1037(Static293.anInt5390)) {
			local5++;
		}
		if (arg0.method1037(Static104.anInt2195)) {
			local5++;
		}
		if (arg0.method1037(Static430.anInt7360)) {
			local5++;
		}
		if (arg0.method1037(Static193.anInt3858)) {
			local5++;
		}
		if (arg0.method1037(Static366.anInt6370)) {
			local5++;
		}
		if (arg0.method1037(Static139.anInt2874)) {
			local5++;
		}
		if (arg0.method1037(Static457.anInt7814)) {
			local5++;
		}
		if (arg0.method1037(Static92.anInt2058)) {
			local5++;
		}
		if (arg0.method1037(Static16.anInt320)) {
			local5++;
		}
		if (arg0.method1037(Static267.anInt5069)) {
			local5++;
		}
		if (arg0.method1037(Static321.anInt5395)) {
			local5++;
		}
		if (arg0.method1037(Static105.anInt2239)) {
			local5++;
		}
		if (arg0.method1037(Static141.anInt7998)) {
			local5++;
		}
		return local5;
	}
}
