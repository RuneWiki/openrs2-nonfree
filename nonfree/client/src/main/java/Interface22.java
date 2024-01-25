import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public interface Interface22 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!rc;)Z")
	boolean method7392(@OriginalArg(1) Interface22 arg0);

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)J")
	long method7393();
}
