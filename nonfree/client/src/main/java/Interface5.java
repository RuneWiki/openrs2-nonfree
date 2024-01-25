import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public interface Interface5 {

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)J")
	long method1677();

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!eq;B)Z")
	boolean method1678(@OriginalArg(0) Interface5 arg0);
}
