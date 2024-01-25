import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public interface Interface3 {

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLclient!dc;)Z")
	boolean method6872(@OriginalArg(1) Interface3 arg0);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)J")
	long method6873();
}
