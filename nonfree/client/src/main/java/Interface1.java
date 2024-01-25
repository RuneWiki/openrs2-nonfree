import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public interface Interface1 {

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)I")
	int method3656();

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "([BZII)V")
	void method3657(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)J")
	long method3658();

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(B)I")
	int method3659();
}
