import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public interface Interface11 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)V")
	void method5010(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZ)I")
	int method5011(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[I)V")
	void method5012(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(IZ)V")
	void method5013(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
	void method5014(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) throws Exception;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)V")
	void method5015(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;
}
