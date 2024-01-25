import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public interface Interface24 {

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(B)J")
	long method6325();

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!st;I)Z")
	boolean method6326(@OriginalArg(0) Interface24 arg0);
}
