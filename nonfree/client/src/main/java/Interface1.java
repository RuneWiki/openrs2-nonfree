import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public interface Interface1 {

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)J")
	long method5001();

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLclient!ah;)Z")
	boolean method5002(@OriginalArg(1) Interface1 arg0);
}
