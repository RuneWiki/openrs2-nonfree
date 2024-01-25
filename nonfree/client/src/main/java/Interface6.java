import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public interface Interface6 {

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IB)I")
	int method2807(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
	void method2808(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) throws Exception;

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(III)V")
	void method2809(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(II)V")
	void method2810(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(I[I)V")
	void method2811(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(II)V")
	void method2812(@OriginalArg(1) int arg0);
}
