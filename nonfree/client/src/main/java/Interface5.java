import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public interface Interface5 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBLjava/awt/Component;Z)V")
	void method3068(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I[I)V")
	void method3069(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IBI)V")
	void method3070(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)V")
	void method3071(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)I")
	int method3072(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(BI)V")
	void method3073(@OriginalArg(1) int arg0);
}
