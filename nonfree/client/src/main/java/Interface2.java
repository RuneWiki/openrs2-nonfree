import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public interface Interface2 {

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)Z")
	boolean method7378();

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(I)I")
	int method7379();

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!ha;I)V")
	void method7380(@OriginalArg(0) Class5 arg0);

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(B)I")
	int method7381();

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(B)I")
	int method7382();

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!ha;Z)V")
	void method7383(@OriginalArg(0) Class5 arg0);

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(B)V")
	void method7384();
}
