import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public interface Interface6 {

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IB)V")
	void method4166(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Ljava/awt/Component;IZB)V")
	void method4167(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)I")
	int method4168(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(BI)V")
	void method4169(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I[I)V")
	void method4170(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(III)V")
	void method4171(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;
}
