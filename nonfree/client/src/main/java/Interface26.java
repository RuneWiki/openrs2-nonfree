import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public interface Interface26 {

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)J")
	long method1656();

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!ut;I)Z")
	boolean method1657(@OriginalArg(0) Interface26 arg0);
}
