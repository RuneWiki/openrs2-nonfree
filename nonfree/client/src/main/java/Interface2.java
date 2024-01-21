import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public interface Interface2 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)V")
	void method2203(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V")
	void method2204(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)I")
	int method2205(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)V")
	void method2206(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I[I)V")
	void method2207(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
	void method2208(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) throws Exception;
}
