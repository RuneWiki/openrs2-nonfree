import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public interface Interface26 {

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)J")
	long method6252();

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!we;)Z")
	boolean method6253(@OriginalArg(1) Interface26 arg0);
}
