import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public interface Interface23 {

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)V")
	void method4170(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I[I)V")
	void method4171(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(II)V")
	void method4172(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
	void method4173(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) throws Exception;

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IBI)V")
	void method4174(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "(II)I")
	int method4175(@OriginalArg(1) int arg0);
}
