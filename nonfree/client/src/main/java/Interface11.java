import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public interface Interface11 {

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)J")
	long method3898();

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILclient!vk;)Z")
	boolean method3899(@OriginalArg(1) Interface11 arg0);
}
