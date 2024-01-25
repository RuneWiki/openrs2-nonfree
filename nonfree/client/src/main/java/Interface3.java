import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public interface Interface3 {

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Z)J")
	long method3667();

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lclient!bga;B)Z")
	boolean method3668(@OriginalArg(0) Interface3 arg0);
}
