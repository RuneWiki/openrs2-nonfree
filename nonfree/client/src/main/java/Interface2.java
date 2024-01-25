import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public interface Interface2 {

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!bq;I)Z")
	boolean method3684(@OriginalArg(0) Interface2 arg0);

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)J")
	long method3685();
}
