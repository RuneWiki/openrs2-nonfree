import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public interface Interface1 {

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)I")
	int method7812();

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IZ)V")
	void method7813(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
	void method7814();

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
	void method7815();

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)I")
	int method7816();

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(JZ)Z")
	boolean method7817(@OriginalArg(0) long arg0);
}
