import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public interface Interface3 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)V")
	void method177(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)V")
	void method178(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZZLjava/awt/Component;I)V")
	void method179(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)V")
	void method180(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)I")
	int method181(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I[I)V")
	void method182(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);
}
