import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public interface Interface2 {

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I")
	int method1431(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[I)V")
	void method1432(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)V")
	void method1433(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZBLjava/awt/Component;I)V")
	void method1434(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)V")
	void method1435(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V")
	void method1436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;
}
