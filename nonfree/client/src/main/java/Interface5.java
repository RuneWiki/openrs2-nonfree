import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public interface Interface5 {

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)I")
	int method8489();

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BJ)Z")
	boolean method8490(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IZ)V")
	void method8491(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)I")
	int method8492();

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	void method8493();

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
	void method8494();
}
