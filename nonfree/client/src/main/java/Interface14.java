import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public interface Interface14 {

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(I)Z")
	boolean method4957();

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(B)I")
	int method4958();

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "(B)I")
	int method4959();

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ILclient!r;)V")
	void method4960(@OriginalArg(1) Class31 arg0);

	@OriginalMember(owner = "client!ofa", name = "c", descriptor = "(B)I")
	int method4961();

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Lclient!r;I)V")
	void method4962(@OriginalArg(0) Class31 arg0);

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "(I)V")
	void method4963();
}
