import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public interface Interface23 {

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lclient!wea;I)Z")
	boolean method4950(@OriginalArg(0) Interface23 arg0);

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(B)J")
	long method4951();
}
