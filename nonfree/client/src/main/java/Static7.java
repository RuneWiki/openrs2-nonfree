import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "K", descriptor = "Lclient!in;")
	public static Class93 aClass93_1 = new Class93();

	@OriginalMember(owner = "client!ag", name = "N", descriptor = "I")
	public static int anInt246 = 0;

	@OriginalMember(owner = "client!ag", name = "O", descriptor = "Z")
	public static boolean aBoolean6 = false;

	@OriginalMember(owner = "client!ag", name = "P", descriptor = "J")
	public static long aLong6 = 0L;

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "(I)V")
	public static void method233() {
		@Pc(1) Class66 local1 = Static342.aClass66_108;
		synchronized (Static342.aClass66_108) {
			Static342.aClass66_108.method1933();
		}
		local1 = Static237.aClass66_81;
		synchronized (Static237.aClass66_81) {
			Static237.aClass66_81.method1933();
		}
		@Pc(36) Class109 local36 = Static250.aClass109_1;
		synchronized (Static250.aClass109_1) {
			Static250.aClass109_1.method2989();
		}
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(II)I")
	public static int method234(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 1;
		@Pc(27) int local27 = local21 | local21 >>> 2;
		@Pc(33) int local33 = local27 | local27 >>> 4;
		@Pc(39) int local39 = local33 | local33 >>> 8;
		@Pc(45) int local45 = local39 | local39 >>> 16;
		return ~local45 & arg0;
	}
}
