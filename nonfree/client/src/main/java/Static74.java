import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
	public static int anInt1598 = 0;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method1384(@OriginalArg(2) String arg0) {
		Static369.method5571("", "", arg0, 0, 4, "");
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I[B)[B")
	public static byte[] method1385(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static649.method4863(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method1386(@OriginalArg(0) Class87 arg0) {
		Static41.aClass164Array1 = new Class164[Static340.anIntArray413.length];
		for (@Pc(13) int local13 = 0; local13 < Static340.anIntArray413.length; local13++) {
			@Pc(18) int local18 = Static340.anIntArray413[local13];
			@Pc(23) Class114 local23 = Static528.method7370(Static51.aClass97_7, local18);
			@Pc(31) Class64 local31 = arg0.method7965(local23, Static647.method3073(Static40.aClass97_5, local18));
			Static41.aClass164Array1[local13] = new Class164(local31, local23);
		}
	}
}
