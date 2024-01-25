import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public interface Interface12 {

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!rb;I)Z")
	boolean method5797(@OriginalArg(0) Interface12 arg0);

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)J")
	long method5798();
}
