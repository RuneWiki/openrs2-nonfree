import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public interface Interface1 {

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)I")
	int method753(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V")
	void method754(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)V")
	void method755(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
	void method756(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I[I)V")
	void method757(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)V")
	void method758(@OriginalArg(1) int arg0);
}
