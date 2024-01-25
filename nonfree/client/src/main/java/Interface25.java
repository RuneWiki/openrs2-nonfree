import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public interface Interface25 {

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)J")
	long method2642();

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!wf;I)Z")
	boolean method2643(@OriginalArg(0) Interface25 arg0);
}
