import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public interface Interface17 {

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)I")
	int method8114();

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
	void method8115();

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)Z")
	boolean method8116();

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	Class23 method8117(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!oa;B)V")
	void method8118(@OriginalArg(0) Class9 arg0);

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)I")
	int method8119();

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!oa;I)V")
	void method8120(@OriginalArg(0) Class9 arg0);

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(B)I")
	int method8121();
}
