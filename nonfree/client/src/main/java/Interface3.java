import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public interface Interface3 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)J")
	long method2032();

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!dd;I)Z")
	boolean method2033(@OriginalArg(0) Interface3 arg0);
}
