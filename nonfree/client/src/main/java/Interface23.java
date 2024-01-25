import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public interface Interface23 {

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)J")
	long method9179();

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!pj;I)Z")
	boolean method9180(@OriginalArg(0) Interface23 arg0);
}
