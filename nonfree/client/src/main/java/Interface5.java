import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public interface Interface5 {

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)I")
	int method4794();

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)Z")
	boolean method4795();

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!uo;B)V")
	void method4796(@OriginalArg(0) Class32 arg0);

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)I")
	int method4797();

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!uo;II)Lclient!ge;")
	Class73 method4798(@OriginalArg(0) Class32 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)I")
	int method4799();

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(Lclient!uo;B)V")
	void method4800(@OriginalArg(0) Class32 arg0);

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V")
	void method4801();
}
