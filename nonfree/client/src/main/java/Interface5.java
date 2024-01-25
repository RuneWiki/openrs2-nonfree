import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public interface Interface5 {

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)J")
	long method6165();

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)I")
	int method6166();

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(II[BZ)V")
	void method6167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2);

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)I")
	int method6168();
}
