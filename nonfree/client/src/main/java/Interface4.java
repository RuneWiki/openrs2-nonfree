import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public interface Interface4 {

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)J")
	long method5954();

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILclient!mn;)Z")
	boolean method5955(@OriginalArg(1) Interface4 arg0);
}
