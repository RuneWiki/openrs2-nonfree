import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public interface Interface7 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)I")
	int method8439();

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)I")
	int method8440();

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
	void method8441();

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
	void method8442();

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ)V")
	void method8443(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(JB)Z")
	boolean method8444(@OriginalArg(0) long arg0);
}
