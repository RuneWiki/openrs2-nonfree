import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public interface Interface20 {

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!qq;I)Z")
	boolean method3801(@OriginalArg(0) Interface20 arg0);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)J")
	long method3802();
}
