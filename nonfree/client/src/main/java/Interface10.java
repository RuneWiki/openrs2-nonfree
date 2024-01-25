import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public interface Interface10 {

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!ts;I)Z")
	boolean method846(@OriginalArg(0) Interface10 arg0);

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)J")
	long method847();
}
