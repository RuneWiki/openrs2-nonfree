import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public interface Interface2 {

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(B)I")
	int method5040();

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I)J")
	long method5041();

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(I)I")
	int method5042();

	@OriginalMember(owner = "client!au", name = "c", descriptor = "(I)I")
	int method5043();

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Z)C")
	char method5044();
}
