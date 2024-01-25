import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public interface Interface9 {

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!hh;)Z")
	boolean method4165(@OriginalArg(1) Interface9 arg0);

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)J")
	long method4166();
}
