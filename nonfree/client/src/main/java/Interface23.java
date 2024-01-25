import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public interface Interface23 {

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)I")
	int method4813(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
	void method4814(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I[I)V")
	void method4815(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)V")
	void method4816(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)V")
	void method4817(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)V")
	void method4818(@OriginalArg(0) int arg0);
}
