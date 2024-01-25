import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public interface Interface13 {

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(III)V")
	void method5160(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(I[I)V")
	void method5161(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "(II)I")
	int method5162(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)V")
	void method5163(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(II)V")
	void method5164(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
	void method5165(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Component arg2) throws Exception;
}
