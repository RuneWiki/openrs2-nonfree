import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public interface Interface6 {

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I[I)V")
	void method4240(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)V")
	void method4241(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/awt/Component;ZIB)V")
	void method4242(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) throws Exception;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)I")
	int method4243(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)V")
	void method4244(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
	void method4245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;
}
