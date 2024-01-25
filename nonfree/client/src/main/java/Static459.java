import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static459 {

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
	public static int anInt7474;

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
	public static int anInt7473 = 0;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "[Lclient!rga;")
	public static final Class2_Sub49[] aClass2_Sub49Array1 = new Class2_Sub49[1024];

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V")
	public static void method6650() {
		Static685.anInt10550 = -1;
		Static371.anInt5924 = -1;
		Static238.anInt3745 = 0;
		Static392.anInt6487 = -1;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Z")
	public static boolean method6651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 7 || arg1 == 8 || arg1 == 9 || arg1 == 10;
	}
}
