import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public interface Interface27 {

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)J")
	long method6491();

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!wt;B)Z")
	boolean method6492(@OriginalArg(0) Interface27 arg0);
}
