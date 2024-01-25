import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public interface Interface11 {

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!ue;)Z")
	boolean method773(@OriginalArg(1) Interface11 arg0);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)J")
	long method774();
}
