import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public interface Interface5 {

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!vm;II)Lclient!jn;")
	Class5 method4727(@OriginalArg(0) Class92 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(B)Z")
	boolean method4728();

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)I")
	int method4729();

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BLclient!vm;)V")
	void method4730(@OriginalArg(1) Class92 arg0);

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(B)V")
	void method4731();

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ZLclient!vm;)V")
	void method4732(@OriginalArg(1) Class92 arg0);

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(I)I")
	int method4733();

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(B)I")
	int method4734();
}
