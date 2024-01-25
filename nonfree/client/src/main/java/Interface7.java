import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public interface Interface7 {

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(IB)V")
	void method6308(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(I[I)V")
	void method6309(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(BI)V")
	void method6310(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(IZ)I")
	int method6311(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
	void method6312(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) throws Exception;

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(ZII)V")
	void method6313(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;
}
