import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static195 {

	@OriginalMember(owner = "client!iaa", name = "e", descriptor = "I")
	public static int anInt4428;

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_53 = new Class158(1, 3);

	@OriginalMember(owner = "client!iaa", name = "d", descriptor = "[I")
	public static int[] anIntArray409 = new int[1];

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ILclient!kea;Lclient!oa;)V")
	public static void method3708(@OriginalArg(1) Class161 arg0, @OriginalArg(2) Class5 arg1) {
		if (Static392.aBoolean492) {
			return;
		}
		arg1.D(0);
		Static483.aClass119_29 = arg1.method7425(Static551.method538(arg0, Static464.anInt8336));
		Static483.aClass119_29.method6678((Static480.anInt8652 - Static483.aClass119_29.AA()) / 2, (Static412.anInt7547 - Static483.aClass119_29.a()) / 2);
		Static435.aClass119_25 = arg1.method7425(Static551.method538(arg0, Static146.anInt2947));
		Static435.aClass119_25.method6678((Static480.anInt8652 - Static435.aClass119_25.AA()) / 2, 18);
		Static392.aBoolean492 = true;
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(I)V")
	public static void method3710() {
		Static228.aBoolean342 = false;
		Static33.method833(Static87.anInt1887, Static386.anInt7125, Static199.anInt4475, Static256.anInt5196);
	}
}
