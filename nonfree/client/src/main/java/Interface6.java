import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public interface Interface6 {

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!hf;)Z")
	boolean method3655(@OriginalArg(1) Interface6 arg0);

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)J")
	long method3656();
}
