import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public interface Interface13 {

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)J")
	long method9027();

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!jh;I)Z")
	boolean method9028(@OriginalArg(0) Interface13 arg0);
}
