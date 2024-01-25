import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public interface Interface3 {

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!fr;B)Z")
	boolean method919(@OriginalArg(0) Interface3 arg0);

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z)J")
	long method920();
}
