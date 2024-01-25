import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public interface Interface8 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)J")
	long method4452();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!t;)Z")
	boolean method4453(@OriginalArg(1) Interface8 arg0);
}
