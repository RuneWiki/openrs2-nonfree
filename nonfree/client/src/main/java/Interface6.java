import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public interface Interface6 {

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(Lclient!maa;I)Z")
	boolean method3903(@OriginalArg(0) Interface6 arg0);

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)J")
	long method3904();
}
