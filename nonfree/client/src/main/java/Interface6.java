import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public interface Interface6 {

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)J")
	long method1490();

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!kr;B)Z")
	boolean method1491(@OriginalArg(0) Interface6 arg0);
}
