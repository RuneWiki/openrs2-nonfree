import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!he", name = "c", descriptor = "I")
	public static int anInt3601 = 0;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "Lclient!ht;")
	public static final Class148 aClass148_21 = new Class148(6, 2);

	@OriginalMember(owner = "client!he", name = "e", descriptor = "Z")
	public static boolean aBoolean296 = false;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I[Ljava/lang/String;)V")
	public static void method3177(@OriginalArg(1) String[] arg0) {
		if (arg0.length <= 1) {
			Static1.aString102 = Static1.aString102 + arg0[0];
			Static237.anInt4012 += arg0[0].length();
			return;
		}
		for (@Pc(34) int local34 = 0; local34 < arg0.length; local34++) {
			if (arg0[local34].startsWith("pause")) {
				@Pc(53) int local53 = 5;
				try {
					local53 = Integer.parseInt(arg0[local34].substring(6));
				} catch (@Pc(62) Exception local62) {
				}
				Static177.method2690("Pausing for " + local53 + " seconds...");
				Static318.aStringArray21 = arg0;
				Static227.anInt3951 = local34 + 1;
				Static88.aLong56 = (long) (local53 * 1000) + method3179();
				return;
			}
			Static1.aString102 = arg0[local34];
			Static204.method3173(false);
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)J")
	public static synchronized long method3179() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (local10 < Static12.aLong7) {
			Static316.aLong160 += Static12.aLong7 - local10;
		}
		Static12.aLong7 = local10;
		return Static316.aLong160 + local10;
	}
}
