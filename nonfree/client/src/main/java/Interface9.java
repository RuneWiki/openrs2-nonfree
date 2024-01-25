import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public interface Interface9 {

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I[I)V")
	void method1579(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BIZLjava/awt/Component;)V")
	void method1580(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Component arg2) throws Exception;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ZI)V")
	void method1581(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)V")
	void method1582(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BI)I")
	int method1583(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(ZI)V")
	void method1584(@OriginalArg(1) int arg0);
}
