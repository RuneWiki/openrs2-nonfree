import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public interface Interface24 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BZ)V")
	void method7119(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZJ)Z")
	boolean method7120(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	void method7121();

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)I")
	int method7122();

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
	void method7123();

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)I")
	int method7124();
}
