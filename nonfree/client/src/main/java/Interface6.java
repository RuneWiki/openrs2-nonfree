import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public interface Interface6 {

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(III)V")
	void method5818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
	void method5819(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)I")
	int method5820(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I[I)V")
	void method5821(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZI)V")
	void method5822(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IB)V")
	void method5823(@OriginalArg(0) int arg0);
}
