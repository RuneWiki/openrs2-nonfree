import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public interface Interface11 {

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!sl;I)Z")
	boolean method731(@OriginalArg(0) Interface11 arg0);

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)J")
	long method732();
}
