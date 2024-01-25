import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public interface Interface3 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!gl;B)Z")
	boolean method3226(@OriginalArg(0) Interface3 arg0);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)J")
	long method3227();
}
