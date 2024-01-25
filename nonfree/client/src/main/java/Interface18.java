import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public interface Interface18 {

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(B)I")
	int method6265();

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)V")
	void method6266();

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!oa;I)V")
	void method6267(@OriginalArg(0) Class14 arg0);

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(I)I")
	int method6268();

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	Class20 method6269(@OriginalArg(0) Class14 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lclient!oa;B)V")
	void method6270(@OriginalArg(0) Class14 arg0);

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Z)Z")
	boolean method6271();

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(B)I")
	int method6272();
}
