import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public interface Interface3 {

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ZI)V")
	void method2487(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BI)I")
	int method2488(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I[I)V")
	void method2489(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(BI)V")
	void method2490(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(III)V")
	void method2491(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILjava/awt/Component;ZI)V")
	void method2492(@OriginalArg(1) Component arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) throws Exception;
}
