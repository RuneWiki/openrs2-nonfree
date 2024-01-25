import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public interface Interface21 {

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lclient!nba;Z)Z")
	boolean method1339(@OriginalArg(0) Interface21 arg0);

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)J")
	long method1340();
}
