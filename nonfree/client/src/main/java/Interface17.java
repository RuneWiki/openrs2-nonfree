import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public interface Interface17 {

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)J")
	long method5937();

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!qt;I)Z")
	boolean method5938(@OriginalArg(0) Interface17 arg0);
}
