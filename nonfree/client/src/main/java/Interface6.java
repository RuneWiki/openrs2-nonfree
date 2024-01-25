import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public interface Interface6 {

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)V")
	void method5716();

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZLclient!za;I)Lclient!e;")
	Class63 method5717(@OriginalArg(1) Class75 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)I")
	int method5718();

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!za;)V")
	void method5719(@OriginalArg(1) Class75 arg0);

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!za;I)V")
	void method5720(@OriginalArg(0) Class75 arg0);

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(B)I")
	int method5721();

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)Z")
	boolean method5722();

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(B)I")
	int method5723();
}
