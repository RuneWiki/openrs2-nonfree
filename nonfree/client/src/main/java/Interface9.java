import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public interface Interface9 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)J")
	long method2958();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLclient!qa;)Z")
	boolean method2959(@OriginalArg(1) Interface9 arg0);
}
