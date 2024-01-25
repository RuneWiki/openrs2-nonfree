import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public interface Interface6 {

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)I")
	int method4665();

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)I")
	int method4666();

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILclient!qa;)V")
	void method4667(@OriginalArg(1) Class109 arg0);

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(ILclient!qa;)V")
	void method4668(@OriginalArg(1) Class109 arg0);

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	Class37 method4669(@OriginalArg(1) int arg0, @OriginalArg(2) Class109 arg1);

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(B)I")
	int method4670();

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)Z")
	boolean method4671();

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "(I)V")
	void method4672();
}
