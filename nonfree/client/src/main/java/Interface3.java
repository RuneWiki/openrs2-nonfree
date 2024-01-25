import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public interface Interface3 {

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(I)I")
	int method8528();

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(B)I")
	int method8529();

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(III[B)V")
	void method8530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2);

	@OriginalMember(owner = "client!bia", name = "b", descriptor = "(B)J")
	long method8531();
}
