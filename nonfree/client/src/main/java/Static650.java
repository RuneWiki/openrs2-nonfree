import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static650 {

	@OriginalMember(owner = "client!wba", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray57 = new String[100];

	@OriginalMember(owner = "client!wba", name = "k", descriptor = "I")
	public static int anInt10484 = 0;

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(JJ)J")
	public static long method8720(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}
}
