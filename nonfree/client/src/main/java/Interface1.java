import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public interface Interface1 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!bc;I)Z")
	boolean method5552(@OriginalArg(0) Interface1 arg0);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)J")
	long method5553();
}
