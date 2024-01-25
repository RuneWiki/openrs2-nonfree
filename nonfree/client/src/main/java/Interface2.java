import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public interface Interface2 {

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "([BIII)V")
	void method6366(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)I")
	int method6367();

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)J")
	long method6368();

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)I")
	int method6369();
}
