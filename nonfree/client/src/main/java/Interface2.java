import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public interface Interface2 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)I")
	int method3382(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)V")
	void method3383(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[I)V")
	void method3384(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)V")
	void method3385(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)V")
	void method3386(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
	void method3387(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception;
}
