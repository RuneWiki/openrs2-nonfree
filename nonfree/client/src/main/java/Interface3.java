import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public interface Interface3 {

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZI)V")
	void method2081(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)I")
	int method2082(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
	void method2083(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) throws Exception;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V")
	void method2084(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I[I)V")
	void method2085(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)V")
	void method2086(@OriginalArg(1) int arg0);
}
