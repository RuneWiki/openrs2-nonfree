import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public interface Interface20 {

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(B)J")
	long method7005();

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(ILclient!pha;)Z")
	boolean method7006(@OriginalArg(1) Interface20 arg0);
}
