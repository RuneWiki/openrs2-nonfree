import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public interface Interface5 {

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BII)V")
	void method2471(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
	void method2472(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2) throws Exception;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)I")
	int method2473(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IB)V")
	void method2474(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(II)V")
	void method2475(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(I[I)V")
	void method2476(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);
}
