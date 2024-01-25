import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public interface Interface8 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!qa;I)V")
	void method4804(@OriginalArg(0) Class172 arg0);

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!qa;II)Lclient!c;")
	Class9 method4805(@OriginalArg(0) Class172 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!qa;)V")
	void method4806(@OriginalArg(1) Class172 arg0);

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)I")
	int method4807();

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)I")
	int method4808();

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)Z")
	boolean method4809();

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)I")
	int method4810();

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
	void method4811();
}
