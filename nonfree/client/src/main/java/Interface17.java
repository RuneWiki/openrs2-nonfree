import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public interface Interface17 {

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)J")
	long method3442();

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Lclient!qaa;I)Z")
	boolean method3443(@OriginalArg(0) Interface17 arg0);
}
