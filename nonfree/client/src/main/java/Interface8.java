import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public interface Interface8 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BII)V")
	void method3897(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZLjava/awt/Component;Z)V")
	void method3898(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)V")
	void method3899(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZ)I")
	int method3900(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)V")
	void method3901(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[I)V")
	void method3902(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);
}
