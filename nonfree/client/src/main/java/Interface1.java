import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public interface Interface1 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)I")
	int method3110(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIB)V")
	void method3111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I[I)V")
	void method3112(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)V")
	void method3113(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
	void method3114(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI)V")
	void method3115(@OriginalArg(1) int arg0);
}
