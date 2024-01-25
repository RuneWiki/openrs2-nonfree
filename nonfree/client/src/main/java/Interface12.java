import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public interface Interface12 {

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(BI)I")
	int method30(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)I")
	int method31(@OriginalArg(1) int arg0);
}
