import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public interface Interface2 {

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)J")
	long method4016();

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(B)I")
	int method4017();

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "(B)I")
	int method4018();

	@OriginalMember(owner = "client!cba", name = "d", descriptor = "(B)I")
	int method4019();

	@OriginalMember(owner = "client!cba", name = "e", descriptor = "(B)C")
	char method4020();
}
