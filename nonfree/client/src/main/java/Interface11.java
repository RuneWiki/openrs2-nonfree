import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public interface Interface11 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!s;)Z")
	boolean method3375(@OriginalArg(1) Interface11 arg0);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)J")
	long method3376();
}
