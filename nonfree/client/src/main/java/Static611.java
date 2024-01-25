import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static611 {

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "Lclient!sk;")
	public static final Class317 aClass317_5 = new Class317("WIP", 2);

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method9089(@OriginalArg(1) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)Z")
	public static boolean method9090(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static124.method9247(arg1, arg0) | Static5.method116(arg1, arg0) | Static107.method7094(arg1, arg0)) & Static279.method6686(arg0, arg1);
	}
}
