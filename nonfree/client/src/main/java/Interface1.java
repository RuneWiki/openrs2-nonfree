import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public interface Interface1 {

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)J")
	long method7647();

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)C")
	char method7648();

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)I")
	int method7649();

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)I")
	int method7650();

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)I")
	int method7651();
}
