import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public interface Interface18 {

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)J")
	long method1962();

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!rl;I)Z")
	boolean method1963(@OriginalArg(0) Interface18 arg0);
}
