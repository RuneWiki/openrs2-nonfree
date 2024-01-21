import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public interface Interface3 {

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I")
	int method2213(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZLjava/awt/Component;IB)V")
	void method2214(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) throws Exception;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[I)V")
	void method2215(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V")
	void method2216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)V")
	void method2217(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)V")
	void method2218(@OriginalArg(1) int arg0);
}
