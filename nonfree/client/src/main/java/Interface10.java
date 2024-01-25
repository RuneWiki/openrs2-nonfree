import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public interface Interface10 {

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)J")
	long method4694();

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BLclient!ur;)Z")
	boolean method4695(@OriginalArg(1) Interface10 arg0);
}
