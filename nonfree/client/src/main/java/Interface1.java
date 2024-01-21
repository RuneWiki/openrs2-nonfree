import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public interface Interface1 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)V")
	void method941(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)I")
	int method942(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I[I)V")
	void method943(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)V")
	void method944(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/awt/Component;BZI)V")
	void method945(@OriginalArg(0) Component arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(III)V")
	void method946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;
}
