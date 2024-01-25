import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public interface Interface7 {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!kb;)Z")
	boolean method353(@OriginalArg(1) Interface7 arg0);

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)J")
	long method354();
}
