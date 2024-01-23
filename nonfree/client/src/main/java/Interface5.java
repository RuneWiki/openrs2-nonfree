import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public interface Interface5 {

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V")
	void method4374(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(II)I")
	int method4375(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I[I)V")
	void method4376(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)V")
	void method4377(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/awt/Component;IZZ)V")
	void method4378(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(III)V")
	void method4379(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;
}
