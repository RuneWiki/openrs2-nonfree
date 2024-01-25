import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public interface Interface20 {

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I)J")
	long method8655();

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(BLclient!ofa;)Z")
	boolean method8656(@OriginalArg(1) Interface20 arg0);
}
