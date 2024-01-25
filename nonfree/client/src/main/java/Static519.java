import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!tp", name = "s", descriptor = "Lclient!wr;")
	public static final Class363 aClass363_6 = new Class363();

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZII)Z")
	public static boolean method7214(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZLclient!pca;)V")
	public static void method7215(@OriginalArg(1) Class251 arg0) {
		@Pc(7) Class251 local7 = Static136.method2656(arg0);
		@Pc(13) int local13;
		@Pc(11) int local11;
		if (local7 == null) {
			local11 = Static492.anInt8445;
			local13 = Static34.anInt3201;
		} else {
			local11 = local7.anInt7215;
			local13 = local7.anInt7285;
		}
		Static97.method2031(arg0, false, local11, local13);
		Static586.method7969(local11, local13, arg0);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method7216(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static488.method6601("\n", "%0a", arg0));
	}
}
