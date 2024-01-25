import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public interface Interface1 {

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/awt/Component;ZIB)V")
	void method385(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) throws Exception;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IB)I")
	int method386(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)V")
	void method387(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(II)V")
	void method388(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)V")
	void method389(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I[I)V")
	void method390(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);
}
