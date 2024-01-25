import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public interface Interface4 {

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)J")
	long method1526();

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!ig;I)Z")
	boolean method1527(@OriginalArg(0) Interface4 arg0);
}
