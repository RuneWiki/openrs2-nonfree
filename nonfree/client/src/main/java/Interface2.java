import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public interface Interface2 {

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)V")
	void method372(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I[I)V")
	void method373(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)V")
	void method374(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/awt/Component;ZBI)V")
	void method375(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)V")
	void method376(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)I")
	int method377(@OriginalArg(1) int arg0);
}
