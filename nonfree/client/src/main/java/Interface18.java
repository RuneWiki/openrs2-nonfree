import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public interface Interface18 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)I")
	int method8469();

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!ha;I)V")
	void method8470(@OriginalArg(0) Class132 arg0);

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!ha;Z)V")
	void method8471(@OriginalArg(0) Class132 arg0);

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)I")
	int method8472();

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)I")
	int method8473();

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)Z")
	boolean method8474();

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(Z)V")
	void method8475();
}
