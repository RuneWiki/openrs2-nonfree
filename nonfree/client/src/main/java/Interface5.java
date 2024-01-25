import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public interface Interface5 {

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)J")
	long method430();

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(BLclient!fw;)Z")
	boolean method431(@OriginalArg(1) Interface5 arg0);
}
