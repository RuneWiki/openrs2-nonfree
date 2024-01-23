import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public interface Interface2 {

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)I")
	int method2147(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
	void method2148(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)V")
	void method2149(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I[I)V")
	void method2150(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BI)V")
	void method2151(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V")
	void method2152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;
}
