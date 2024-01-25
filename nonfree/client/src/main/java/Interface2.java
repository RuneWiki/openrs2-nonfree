import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public interface Interface2 {

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!dt;)Z")
	boolean method1869(@OriginalArg(1) Interface2 arg0);

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)J")
	long method1870();
}
