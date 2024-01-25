import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public interface Interface4 {

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!cr;I)Z")
	boolean method6839(@OriginalArg(0) Interface4 arg0);

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)J")
	long method6840();
}
