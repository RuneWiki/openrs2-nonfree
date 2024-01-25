import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!kha", name = "x", descriptor = "I")
	public static int anInt5215 = 0;

	@OriginalMember(owner = "client!kha", name = "y", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray38 = new String[200];

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method4401(@OriginalArg(0) Class132 arg0) {
		Static614.aClass290Array1 = new Class290[Static169.anIntArray157.length];
		for (@Pc(11) int local11 = 0; local11 < Static169.anIntArray157.length; local11++) {
			@Pc(17) int local17 = Static169.anIntArray157[local11];
			@Pc(22) Class151 local22 = Static581.method8055(Static320.aClass8_89, local17);
			@Pc(30) Class19 local30 = arg0.method7518(local22, Static681.method2329(Static360.aClass8_135, local17));
			Static614.aClass290Array1[local11] = new Class290(local30, local22);
		}
	}
}
