import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public interface Interface9 {

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(Z)J")
	long method6048();

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lclient!nba;I)Z")
	boolean method6049(@OriginalArg(0) Interface9 arg0);
}
