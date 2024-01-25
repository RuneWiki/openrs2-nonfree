import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public interface Interface7 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!m;I)Z")
	boolean method4157(@OriginalArg(0) Interface7 arg0);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)J")
	long method4158();
}
