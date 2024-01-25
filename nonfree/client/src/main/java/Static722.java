import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static722 {

	@OriginalMember(owner = "client!wr", name = "B", descriptor = "Lclient!br;")
	public static final Class37 aClass37_5 = new Class37();

	@OriginalMember(owner = "client!wr", name = "r", descriptor = "Z")
	public static boolean aBoolean815 = false;

	@OriginalMember(owner = "client!wr", name = "m", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_131 = new Class286(44, -1);

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
	public static int anInt11273 = 0;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method9415(@OriginalArg(0) Class67 arg0) {
		Static33.aClass288Array1 = new Class288[Static480.anIntArray459.length];
		for (@Pc(11) int local11 = 0; local11 < Static480.anIntArray459.length; local11++) {
			@Pc(17) int local17 = Static480.anIntArray459[local11];
			@Pc(22) Class330 local22 = Static101.method1316(local17, Static152.aClass221_39);
			@Pc(30) Class44 local30 = arg0.method7641(local22, Static728.method4755(Static264.aClass221_72, local17), true);
			Static33.aClass288Array1[local11] = new Class288(local30, local22);
		}
	}
}
