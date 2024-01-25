import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public interface Interface14 {

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)V")
	void method7948();

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)I")
	int method7949();

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(B)V")
	void method7950();

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(I)I")
	int method7951();

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IZ)V")
	void method7952(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZJ)Z")
	boolean method7953(@OriginalArg(1) long arg0);
}
