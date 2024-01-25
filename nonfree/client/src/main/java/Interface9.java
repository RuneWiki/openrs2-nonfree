import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public interface Interface9 {

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!wa;B)Z")
	boolean method520(@OriginalArg(0) Interface9 arg0);

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)J")
	long method521();
}
