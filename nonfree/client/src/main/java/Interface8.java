import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public interface Interface8 {

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)J")
	long method1150();

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!tp;I)Z")
	boolean method1151(@OriginalArg(0) Interface8 arg0);
}
