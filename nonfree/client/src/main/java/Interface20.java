import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public interface Interface20 {

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)J")
	long method4662();

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZLclient!ws;)Z")
	boolean method4663(@OriginalArg(1) Interface20 arg0);
}
