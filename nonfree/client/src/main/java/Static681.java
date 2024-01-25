import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static681 {

	@OriginalMember(owner = "client!vja", name = "s", descriptor = "I")
	public static int anInt10508;

	@OriginalMember(owner = "client!vja", name = "v", descriptor = "I")
	public static int anInt10509;

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(B[B)[B")
	public static byte[] method9203(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(12) byte[] local12 = new byte[arg0.length];
			Static728.method274(arg0, 0, local12, 0, arg0.length);
			return local12;
		}
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(Lclient!jb;I)V")
	public static void method9204(@OriginalArg(0) Class2_Sub6_Sub7 arg0) {
		@Pc(7) boolean local7 = false;
		arg0.method8698();
		for (@Pc(15) Class2_Sub6_Sub7 local15 = (Class2_Sub6_Sub7) Static416.aClass388_6.method9213(); local15 != null; local15 = (Class2_Sub6_Sub7) Static416.aClass388_6.method9212()) {
			if (Static436.method6340(local15.method4057(), arg0.method4057())) {
				local7 = true;
				Static69.method1064(local15, arg0);
				break;
			}
		}
		if (!local7) {
			Static416.aClass388_6.method9215(arg0);
		}
	}
}
