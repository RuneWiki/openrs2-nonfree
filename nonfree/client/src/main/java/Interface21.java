import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public interface Interface21 {

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)Z")
	boolean method8621();

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)I")
	int method8622();

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V")
	void method8623();

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(I)I")
	int method8624();

	@OriginalMember(owner = "client!se", name = "e", descriptor = "(I)I")
	int method8625();

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!ha;I)V")
	void method8626(@OriginalArg(0) Class20 arg0);

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!ha;)V")
	void method8627(@OriginalArg(1) Class20 arg0);
}
