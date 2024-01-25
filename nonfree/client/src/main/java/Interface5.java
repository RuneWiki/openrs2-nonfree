import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public interface Interface5 {

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)J")
	long method6356();

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BLclient!er;)Z")
	boolean method6357(@OriginalArg(1) Interface5 arg0);
}
