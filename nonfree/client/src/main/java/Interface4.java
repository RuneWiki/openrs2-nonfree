import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public interface Interface4 {

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)I")
	int method2862(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)V")
	void method2863(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZZLjava/awt/Component;)V")
	void method2864(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Component arg2) throws Exception;

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(II)V")
	void method2865(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIB)V")
	void method2866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I[I)V")
	void method2867(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);
}
