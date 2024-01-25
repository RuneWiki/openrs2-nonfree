import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public interface Interface10 {

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)J")
	long method6110();

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!vl;)Z")
	boolean method6111(@OriginalArg(1) Interface10 arg0);
}
