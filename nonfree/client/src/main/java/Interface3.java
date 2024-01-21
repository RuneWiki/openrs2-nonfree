import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public interface Interface3 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)V")
	void method2733(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI)I")
	int method2734(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/awt/Component;IZ)V")
	void method2735(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I[I)V")
	void method2736(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)V")
	void method2737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)V")
	void method2738(@OriginalArg(0) int arg0);
}
