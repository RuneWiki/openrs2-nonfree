import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static648 {

	@OriginalMember(owner = "client!wba", name = "d", descriptor = "I")
	public static int anInt10220 = 0;

	@OriginalMember(owner = "client!wba", name = "h", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_106 = new Class187(15, 8);

	@OriginalMember(owner = "client!wba", name = "A", descriptor = "I")
	public static int anInt10235 = 0;

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(B)V")
	public static void method8531() {
		if (Static377.anIntArray369 != null && Static24.anIntArray30 != null) {
			return;
		}
		Static377.anIntArray369 = new int[256];
		Static24.anIntArray30 = new int[256];
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(26) double local26 = (double) local17 / 255.0D * 6.283185307179586D;
			Static377.anIntArray369[local17] = (int) (Math.sin(local26) * 4096.0D);
			Static24.anIntArray30[local17] = (int) (Math.cos(local26) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method8534(@OriginalArg(0) String arg0) {
		return Static386.method5661(arg0);
	}
}
