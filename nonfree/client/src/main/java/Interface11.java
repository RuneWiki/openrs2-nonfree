import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public interface Interface11 {

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)J")
	long method1546();

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!wt;I)Z")
	boolean method1547(@OriginalArg(0) Interface11 arg0);
}
