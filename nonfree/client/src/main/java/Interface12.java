import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public interface Interface12 {

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
	void method6925(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(II)V")
	void method6926(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "(II)V")
	void method6927(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(III)V")
	void method6928(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(I[I)V")
	void method6929(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "(II)I")
	int method6930(@OriginalArg(1) int arg0);
}
