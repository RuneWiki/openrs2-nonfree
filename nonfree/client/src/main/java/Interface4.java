import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public interface Interface4 {

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZILjava/awt/Component;Z)V")
	void method1514(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) throws Exception;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)V")
	void method1515(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IBI)V")
	void method1516(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)V")
	void method1517(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[I)V")
	void method1518(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)I")
	int method1519(@OriginalArg(1) int arg0);
}
