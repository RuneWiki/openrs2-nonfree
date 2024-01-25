import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cka")
public interface Interface9 {

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(B)I")
	int method3091();

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(BZ)V")
	void method3092(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(ZJ)Z")
	boolean method3093(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Z)V")
	void method3094();

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(I)V")
	void method3095();

	@OriginalMember(owner = "client!cka", name = "b", descriptor = "(B)I")
	int method3096();
}
