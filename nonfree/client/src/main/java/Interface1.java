import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public interface Interface1 {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
	void method114(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) throws Exception;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)V")
	void method115(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I[I)V")
	void method116(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(III)V")
	void method117(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)I")
	int method118(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(II)V")
	void method119(@OriginalArg(1) int arg0);
}
