import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public interface Interface7 {

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)J")
	long method2317();

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!gj;I)Z")
	boolean method2318(@OriginalArg(0) Interface7 arg0);
}
