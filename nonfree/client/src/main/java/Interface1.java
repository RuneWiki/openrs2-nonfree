import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public interface Interface1 {

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)J")
	long method3303();

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!be;)Z")
	boolean method3304(@OriginalArg(1) Interface1 arg0);
}
