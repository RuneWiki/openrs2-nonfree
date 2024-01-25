import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public interface Interface1 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)J")
	long method2745();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!c;)Z")
	boolean method2746(@OriginalArg(1) Interface1 arg0);
}
