import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public interface Interface2 {

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/awt/Component;ZIZ)V")
	void method1616(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V")
	void method1617(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)I")
	int method1618(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)V")
	void method1619(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[I)V")
	void method1620(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BII)V")
	void method1621(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;
}
