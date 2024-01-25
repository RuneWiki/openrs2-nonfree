import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public interface Interface8 {

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)I")
	int method1038();

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)I")
	int method1039();

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)C")
	char method1040();

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)I")
	int method1041();

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(B)J")
	long method1042();
}
