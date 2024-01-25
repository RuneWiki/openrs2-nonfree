import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public interface Interface12 {

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!vs;I)Z")
	boolean method4954(@OriginalArg(0) Interface12 arg0);

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Z)J")
	long method4955();
}
