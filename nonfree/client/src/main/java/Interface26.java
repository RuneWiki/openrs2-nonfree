import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public interface Interface26 {

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)J")
	long method8008();

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILclient!vm;)Z")
	boolean method8009(@OriginalArg(1) Interface26 arg0);
}
