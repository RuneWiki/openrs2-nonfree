import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public interface Interface23 {

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)J")
	long method3984();

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!tm;)Z")
	boolean method3985(@OriginalArg(1) Interface23 arg0);
}
