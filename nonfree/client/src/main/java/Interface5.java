import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public interface Interface5 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)J")
	long method4494();

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!pc;B)Z")
	boolean method4495(@OriginalArg(0) Interface5 arg0);
}
