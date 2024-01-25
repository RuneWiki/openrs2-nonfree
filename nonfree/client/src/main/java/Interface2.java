import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public interface Interface2 {

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)J")
	long method1957();

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!cg;B)Z")
	boolean method1958(@OriginalArg(0) Interface2 arg0);
}
