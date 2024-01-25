import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public interface Interface5 {

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!mc;B)Z")
	boolean method5365(@OriginalArg(0) Interface5 arg0);

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)J")
	long method5366();
}
