import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public interface Interface1 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)J")
	long method556();

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!aa;)Z")
	boolean method557(@OriginalArg(1) Interface1 arg0);
}
