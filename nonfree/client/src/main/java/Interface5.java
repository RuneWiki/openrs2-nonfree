import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public interface Interface5 {

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!dr;I)Z")
	boolean method3198(@OriginalArg(0) Interface5 arg0);

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)J")
	long method3199();
}
