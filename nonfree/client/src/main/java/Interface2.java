import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public interface Interface2 {

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/awt/Component;ZZ)V")
	void method1644(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)V")
	void method1645(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[I)V")
	void method1646(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BII)V")
	void method1647(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
	void method1648(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)I")
	int method1649(@OriginalArg(0) int arg0);
}
