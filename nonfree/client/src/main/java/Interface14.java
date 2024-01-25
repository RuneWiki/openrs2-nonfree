import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public interface Interface14 {

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(II)V")
	void method6461(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(III)V")
	void method6462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(I[I)V")
	void method6463(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(IZ)V")
	void method6464(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(II)I")
	int method6465(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
	void method6466(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Component arg2) throws Exception;
}
