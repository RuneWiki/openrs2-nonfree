import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public interface Interface12 {

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IZ)V")
	void method7295(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V")
	void method7296();

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)I")
	int method7297();

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "(I)I")
	int method7298();

	@OriginalMember(owner = "client!ffa", name = "d", descriptor = "(I)V")
	void method7299();

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IJ)Z")
	boolean method7300(@OriginalArg(1) long arg0);
}
