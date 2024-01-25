import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public interface Interface7 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)I")
	int method4895();

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!za;)V")
	void method4896(@OriginalArg(1) Class117 arg0);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)I")
	int method4897();

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)Z")
	boolean method4898();

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)I")
	int method4899();

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V")
	void method4900();

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	Class8 method4901(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!za;B)V")
	void method4902(@OriginalArg(0) Class117 arg0);
}
