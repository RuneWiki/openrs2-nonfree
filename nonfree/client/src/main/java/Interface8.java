import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public interface Interface8 {

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)J")
	long method2205();

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!vh;B)Z")
	boolean method2206(@OriginalArg(0) Interface8 arg0);
}
