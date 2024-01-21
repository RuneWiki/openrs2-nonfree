import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public interface Interface3 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[I)V")
	void method768(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)V")
	void method769(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
	void method770(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
	void method771(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZBLjava/awt/Component;)V")
	void method772(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Component arg2) throws Exception;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)I")
	int method773(@OriginalArg(1) int arg0);
}
