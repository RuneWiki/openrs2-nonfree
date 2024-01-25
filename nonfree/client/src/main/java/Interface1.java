import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public interface Interface1 {

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILclient!cp;)Z")
	boolean method4480(@OriginalArg(1) Interface1 arg0);

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)J")
	long method4481();
}
