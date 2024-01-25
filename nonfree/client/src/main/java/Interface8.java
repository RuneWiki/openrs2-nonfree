import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public interface Interface8 {

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(III)V")
	void method4107(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(I[I)V")
	void method4108(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IZ)V")
	void method4109(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(II)I")
	int method4110(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
	void method4111(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Component arg2) throws Exception;

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "(II)V")
	void method4112(@OriginalArg(0) int arg0);
}
