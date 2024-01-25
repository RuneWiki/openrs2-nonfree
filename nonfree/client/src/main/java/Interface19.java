import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public interface Interface19 {

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)I")
	int method2896();

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
	void method2897();

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IJ)Z")
	boolean method2898(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)I")
	int method2899();

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)V")
	void method2900();

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZZ)V")
	void method2901(@OriginalArg(1) boolean arg0);
}
