import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public interface Interface24 {

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(ILclient!uha;)Z")
	boolean method3978(@OriginalArg(1) Interface24 arg0);

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(B)J")
	long method3979();
}
