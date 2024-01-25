import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public interface Interface19 {

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)J")
	long method4711();

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!on;Z)Z")
	boolean method4712(@OriginalArg(0) Interface19 arg0);
}
