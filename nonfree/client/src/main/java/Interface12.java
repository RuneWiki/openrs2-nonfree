import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public interface Interface12 {

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)J")
	long method1040();

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILclient!ws;)Z")
	boolean method1041(@OriginalArg(1) Interface12 arg0);
}
