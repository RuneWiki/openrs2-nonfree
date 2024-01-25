import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public interface Interface17 {

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)V")
	void method3562(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IZ)V")
	void method3563(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BLjava/awt/Component;ZI)V")
	void method3564(@OriginalArg(1) Component arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I[I)V")
	void method3565(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IZI)V")
	void method3566(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BI)I")
	int method3567(@OriginalArg(1) int arg0);
}
