import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public interface Interface7 {

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(II)V")
	void method7398(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IB)I")
	int method7399(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(III)V")
	void method7400(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
	void method7401(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(I[I)V")
	void method7402(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "(II)V")
	void method7403(@OriginalArg(0) int arg0);
}
