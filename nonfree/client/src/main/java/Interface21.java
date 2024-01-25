import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public interface Interface21 {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!rf;B)Z")
	boolean method4250(@OriginalArg(0) Interface21 arg0);

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)J")
	long method4251();
}
