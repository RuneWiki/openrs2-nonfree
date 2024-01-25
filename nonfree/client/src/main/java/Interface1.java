import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public interface Interface1 {

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(B)I")
	int method6638();

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)I")
	int method6639();

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "(I)J")
	long method6640();

	@OriginalMember(owner = "client!aca", name = "c", descriptor = "(I)I")
	int method6641();

	@OriginalMember(owner = "client!aca", name = "d", descriptor = "(I)C")
	char method6642();
}
