import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface1 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)I")
	int method360(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V")
	void method361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/awt/Component;IZ)V")
	void method362(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(II)V")
	void method363(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I[I)V")
	void method364(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)V")
	void method365(@OriginalArg(1) int arg0);
}
