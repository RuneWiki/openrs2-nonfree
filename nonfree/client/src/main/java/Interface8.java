import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public interface Interface8 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!mb;)Z")
	boolean method3511(@OriginalArg(1) Interface8 arg0);

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)J")
	long method3512();
}
