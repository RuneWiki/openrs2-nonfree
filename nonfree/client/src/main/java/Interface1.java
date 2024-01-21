import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public interface Interface1 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZ)I")
	int method1500(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)V")
	void method1501(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBI)V")
	void method1502(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[I)V")
	void method1503(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
	void method1504(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Component arg2) throws Exception;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BI)V")
	void method1505(@OriginalArg(1) int arg0);
}
