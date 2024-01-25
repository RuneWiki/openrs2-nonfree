import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public interface Interface1 {

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)J")
	long method5004();

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)I")
	int method5005();

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)I")
	int method5006();

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "(I)I")
	int method5007();

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Z)C")
	char method5008();
}
