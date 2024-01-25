import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public interface Interface1 {

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III[B)V")
	void method5393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2);

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)I")
	int method5394();

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)I")
	int method5395();

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)J")
	long method5396();
}
