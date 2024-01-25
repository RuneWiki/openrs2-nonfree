import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public interface Interface9 {

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!ur;I)Z")
	boolean method5745(@OriginalArg(0) Interface9 arg0);

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)J")
	long method5746();
}
