import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static16 {

	@OriginalMember(owner = "client!ap", name = "Nb", descriptor = "Z")
	public static boolean aBoolean42 = false;

	@OriginalMember(owner = "client!ap", name = "Sc", descriptor = "Lclient!qo;")
	public static final Class267 aClass267_1 = new Class267();

	@OriginalMember(owner = "client!ap", name = "zd", descriptor = "I")
	public static int anInt779 = 0;

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(II)V")
	public static void method748(@OriginalArg(1) int arg0) {
		Static394.aLong167 = 1000000000L / (long) arg0;
	}
}
