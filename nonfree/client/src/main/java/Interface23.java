import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public interface Interface23 {

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILclient!sn;)Z")
	boolean method2730(@OriginalArg(1) Interface23 arg0);

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)J")
	long method2731();
}
