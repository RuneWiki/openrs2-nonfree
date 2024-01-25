import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public interface Interface11 {

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)J")
	long method1707();

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!sv;I)Z")
	boolean method1708(@OriginalArg(0) Interface11 arg0);
}
