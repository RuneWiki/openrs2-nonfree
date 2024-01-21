import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public interface Interface3 {

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZI)V")
	void method2424(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
	void method2425(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)V")
	void method2426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)I")
	int method2427(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)V")
	void method2428(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I[I)V")
	void method2429(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);
}
