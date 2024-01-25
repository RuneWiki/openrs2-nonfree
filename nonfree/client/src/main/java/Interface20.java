import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public interface Interface20 {

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)J")
	long method4044();

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILclient!pt;)Z")
	boolean method4045(@OriginalArg(1) Interface20 arg0);
}
