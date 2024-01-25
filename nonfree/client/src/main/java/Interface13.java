import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public interface Interface13 {

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZ)V")
	void method6052(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZLjava/awt/Component;BI)V")
	void method6053(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)V")
	void method6054(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IBI)V")
	void method6055(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I[I)V")
	void method6056(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BI)I")
	int method6057(@OriginalArg(1) int arg0);
}
