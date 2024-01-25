import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public interface Interface20 {

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
	void method5019(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BII)V")
	void method5020(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)I")
	int method5021(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(II)V")
	void method5022(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZ)V")
	void method5023(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[I)V")
	void method5024(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);
}
