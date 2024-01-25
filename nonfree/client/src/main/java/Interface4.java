import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public interface Interface4 {

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)V")
	void method2487(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(II)I")
	int method2488(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I[I)V")
	void method2489(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
	void method2490(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Component arg2) throws Exception;

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "(II)V")
	void method2491(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)V")
	void method2492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;
}
