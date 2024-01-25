import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public interface Interface18 {

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)J")
	long method3530();

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)I")
	int method3531();

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "([BIIB)V")
	void method3532(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)I")
	int method3533();
}
