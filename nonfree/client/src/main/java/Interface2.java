import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public interface Interface2 {

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)J")
	long method7746();

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(ILclient!ada;)Z")
	boolean method7747(@OriginalArg(1) Interface2 arg0);
}
