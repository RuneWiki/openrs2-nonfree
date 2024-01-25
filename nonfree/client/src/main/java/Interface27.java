import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public interface Interface27 {

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)J")
	long method8035();

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!wf;I)Z")
	boolean method8036(@OriginalArg(0) Interface27 arg0);
}
