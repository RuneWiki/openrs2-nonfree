import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public interface Interface11 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZLclient!lo;)Z")
	boolean method2308(@OriginalArg(1) Interface11 arg0);

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)J")
	long method2309();
}
