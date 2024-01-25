import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public interface Interface7 {

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)J")
	long method3358();

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILclient!uk;)Z")
	boolean method3359(@OriginalArg(1) Interface7 arg0);
}
