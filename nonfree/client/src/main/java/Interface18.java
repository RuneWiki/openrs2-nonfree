import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public interface Interface18 {

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)J")
	long method6226();

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(Lclient!oga;B)Z")
	boolean method6227(@OriginalArg(0) Interface18 arg0);
}
